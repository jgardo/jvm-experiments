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

import java.lang.annotation.ElementType;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 10, time = 1)
@Fork(1)
public class ClassBenchmark {
    public static final Boolean BOOLEAN = true;
    public static final String STRING = "true";
    public static final Integer INTEGER = 4;
    public static final List LIST = Collections.EMPTY_LIST;
    public static final Enum ENUM = ElementType.ANNOTATION_TYPE;
    public static final Object[] OBJECTS = new Object[] {BOOLEAN, STRING, LIST, LIST, ENUM, LIST, INTEGER, LIST, BOOLEAN, BOOLEAN, BOOLEAN };

    @Setup
    public void setup() {
        iterator = 0;
    }
    private int iterator;
    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void ifElse(Blackhole bh) {
        int i = this.iterator;
        this.iterator++;
        this.iterator %= 11;
        Object iterator = OBJECTS[i];
        Objects.requireNonNull(iterator);
        if (iterator instanceof Boolean b) {
            bh.consume(b);
        } else if (iterator instanceof String s) {
            bh.consume(s);
        } else if (iterator instanceof Integer integer) {
            bh.consume(integer);
        } else if (iterator instanceof List l) {
            bh.consume(l);
        } else if (iterator instanceof Enum<?> e) {
            bh.consume(e);
        } else {
            throw new IllegalStateException("Unexpected value: " + iterator);
        }
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void patternMatching(Blackhole bh) {
        int i = this.iterator;
        this.iterator++;
        this.iterator %= 11;
        Object iterator = OBJECTS[i];

        switch (iterator) {
            case Boolean b -> {
                bh.consume(b);
            }
            case String s -> {
                bh.consume(s);
            }
            case Integer integer -> {
                bh.consume(integer);
            }
            case List l -> {
                bh.consume(l);
            }
            case Enum<?> e -> {
                bh.consume(e);
            }
            default -> throw new IllegalStateException("Unexpected value: " + iterator);
        }
    }
}
