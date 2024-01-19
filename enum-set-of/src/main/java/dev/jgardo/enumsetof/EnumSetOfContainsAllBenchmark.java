package dev.jgardo.enumsetof;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.EnumSet;
import java.util.Set;


@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 10, time = 1)
@Fork(1)
public class EnumSetOfContainsAllBenchmark {

    @State(Scope.Thread)
    public static class EmptyState {
        public Set<V1> value = Set.of();
    }

    private static final EnumSet<V1> EMPTY_ENUM_SET_V1 = EnumSet.noneOf(V1.class);
    private static final Set<V1> EMPTY_SET_OF_V1 = Set.of();

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void emptyContainsEnumSetV001(EmptyState state, Blackhole bh) {
        bh.consume(EMPTY_ENUM_SET_V1.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void emptyContainsSetOfV001(EmptyState state, Blackhole bh) {
        bh.consume(EMPTY_SET_OF_V1.containsAll(state.value));
    }

    @State(Scope.Thread)
    public static class V1State {
        public Set<V1> value = Set.of(V1.values());
    }

    private static final EnumSet<V1> ENUM_SET_V1 = EnumSet.allOf(V1.class);
    private static final Set<V1> SET_OF_V1 = Set.of(V1.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV001(V1State state, Blackhole bh) {
        bh.consume(ENUM_SET_V1.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV001(V1State state, Blackhole bh) {
        bh.consume(SET_OF_V1.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V2State {
        public Set<V2> value = Set.of(V2.values());
    }

    private static final EnumSet<V2> ENUM_SET_V2 = EnumSet.allOf(V2.class);
    private static final Set<V2> SET_OF_V2 = Set.of(V2.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV002(V2State state, Blackhole bh) {
        bh.consume(ENUM_SET_V2.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV002(V2State state, Blackhole bh) {
        bh.consume(SET_OF_V2.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V3State {
        public Set<V3> value = Set.of(V3.values());
    }

    private static final EnumSet<V3> ENUM_SET_V3 = EnumSet.allOf(V3.class);
    private static final Set<V3> SET_OF_V3 = Set.of(V3.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV003(V3State state, Blackhole bh) {
        bh.consume(ENUM_SET_V3.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV003(V3State state, Blackhole bh) {
        bh.consume(SET_OF_V3.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V4State {
        public Set<V4> value = Set.of(V4.values());
    }
    private static final EnumSet<V4> ENUM_SET_V4 = EnumSet.allOf(V4.class);
    private static final Set<V4> SET_OF_V4 = Set.of(V4.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV004(V4State state, Blackhole bh) {
        bh.consume(ENUM_SET_V4.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV004(V4State state, Blackhole bh) {
        bh.consume(SET_OF_V4.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V8State {
        public Set<V8> value = Set.of(V8.values());
    }

    private static final EnumSet<V8> ENUM_SET_V8 = EnumSet.allOf(V8.class);
    private static final Set<V8> SET_OF_V8 = Set.of(V8.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV008(V8State state, Blackhole bh) {
        bh.consume(ENUM_SET_V8.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV008(V8State state, Blackhole bh) {
        bh.consume(SET_OF_V8.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V16State {
        public Set<V16> value = Set.of(V16.values());
    }

    private static final EnumSet<V16> ENUM_SET_V16 = EnumSet.allOf(V16.class);
    private static final Set<V16> SET_OF_V16 = Set.of(V16.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV016(V16State state, Blackhole bh) {
        bh.consume(ENUM_SET_V16.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV016(V16State state, Blackhole bh) {
        bh.consume(SET_OF_V16.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V32State {
        public Set<V32> value = Set.of(V32.values());
    }

    private static final EnumSet<V32> ENUM_SET_V32 = EnumSet.allOf(V32.class);
    private static final Set<V32> SET_OF_V32 = Set.of(V32.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV032(V32State state, Blackhole bh) {
        bh.consume(ENUM_SET_V32.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV032(V32State state, Blackhole bh) {
        bh.consume(SET_OF_V32.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V64State {
        public Set<V64> value = Set.of(V64.values());
    }

    private static final EnumSet<V64> ENUM_SET_V64 = EnumSet.allOf(V64.class);
    private static final Set<V64> SET_OF_V64 = Set.of(V64.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV064(V64State state, Blackhole bh) {
        bh.consume(ENUM_SET_V64.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV064(V64State state, Blackhole bh) {
        bh.consume(SET_OF_V64.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V65State {
        public Set<V65> value = Set.of(V65.values());
    }

    private static final EnumSet<V65> ENUM_SET_V65 = EnumSet.allOf(V65.class);
    private static final Set<V65> SET_OF_V65 = Set.of(V65.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV065(V65State state, Blackhole bh) {
        bh.consume(ENUM_SET_V65.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV065(V65State state, Blackhole bh) {
        bh.consume(SET_OF_V65.containsAll(state.value));
    }
    @State(Scope.Thread)
    public static class V128State {
        public Set<V128> value = Set.of(V128.values());
    }

    private static final EnumSet<V128> ENUM_SET_V128 = EnumSet.allOf(V128.class);
    private static final Set<V128> SET_OF_V128 = Set.of(V128.values());

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsEnumSetV128(V128State state, Blackhole bh) {
        bh.consume(ENUM_SET_V128.containsAll(state.value));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.PRINT)
    public void containsSetOfV128(V128State state, Blackhole bh) {
        bh.consume(SET_OF_V128.containsAll(state.value));
    }

    public enum V1 {
        V1,
    }

    public enum V2 {
        V1, V2,
    }

    public enum V3 {
        V1, V2, V3
    }

    public enum V4 {
        V1, V2, V3, V4,
    }

    public enum V8 {
        V1, V2, V3, V4, V5, V6, V7, V8,
    }

    public enum V16 {
        V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16,
    }

    public enum V32 {
        V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16,
        V17, V18, V19, V20, V21, V22, V23, V24, V25, V26, V27, V28, V29, V30, V31, V32,
    }

    public enum V64 {
        V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16,
        V17, V18, V19, V20, V21, V22, V23, V24, V25, V26, V27, V28, V29, V30, V31, V32,
        V33, V34, V35, V36, V37, V38, V39, V40, V41, V42, V43, V44, V45, V46, V47, V48,
        V49, V50, V51, V52, V53, V54, V55, V56, V57, V58, V59, V60, V61, V62, V63, V64
    }

    public enum V65 {
        V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16,
        V17, V18, V19, V20, V21, V22, V23, V24, V25, V26, V27, V28, V29, V30, V31, V32,
        V33, V34, V35, V36, V37, V38, V39, V40, V41, V42, V43, V44, V45, V46, V47, V48,
        V49, V50, V51, V52, V53, V54, V55, V56, V57, V58, V59, V60, V61, V62, V63, V64,
        V65
    }

    public enum V128 {
        V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16,
        V17, V18, V19, V20, V21, V22, V23, V24, V25, V26, V27, V28, V29, V30, V31, V32,
        V33, V34, V35, V36, V37, V38, V39, V40, V41, V42, V43, V44, V45, V46, V47, V48,
        V49, V50, V51, V52, V53, V54, V55, V56, V57, V58, V59, V60, V61, V62, V63, V64,
        V65, V66, V67, V68, V69, V70, V71, V72, V73, V74, V75, V76, V77, V78, V79, V80,
        V81, V82, V83, V84, V85, V86, V87, V88, V89, V90, V91, V92, V93, V94, V95, V96,
        V97, V98, V99, V100,V101,V102,V103,V104,V105,V106,V107,V108,V109,V110,V111,V112,
        V113,V114,V115,V116,V117,V118,V119,V120,V121,V122,V123,V124,V125,V126,V127,V128
    }
}
