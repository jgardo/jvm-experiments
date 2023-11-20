package dev.jgardo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Objects;

@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 10, time = 1)
@Fork(1)
public class PatternMatchingBenchmark {

    @Setup
    public void setup() {
        iterator = true;
    }
    private Object iterator;
    @Benchmark
//    @CompilerControl(CompilerControl.Mode.EXCLUDE)
    public void ifElse(Blackhole bh) {
        Objects.requireNonNull(iterator);
        if (iterator instanceof Boolean b) {
            if  (b) {
                bh.consume(3);
                iterator = false;
            } else {
                bh.consume(5);
                iterator = true;
            }
        }
    }

    @Benchmark
//    @CompilerControl(CompilerControl.Mode.EXCLUDE)
    public void patternMatching(Blackhole bh) {
        switch (iterator) {
            case Boolean b when b -> {
                bh.consume(3);
                iterator = false;
            }
            case Boolean b -> {
                bh.consume(5);
                iterator = true;
            }
            default -> throw new IllegalStateException("Unexpected value: " + iterator);
        }
    }
}
