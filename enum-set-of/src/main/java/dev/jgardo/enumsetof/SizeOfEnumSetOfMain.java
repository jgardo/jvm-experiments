package dev.jgardo.enumsetof;

import org.openjdk.jol.info.ClassLayout;

import java.util.EnumSet;
import java.util.Set;

public class SizeOfEnumSetOfMain {
    private static final EnumSet<V1> EMPTY_ENUM_SET_V1 = EnumSet.noneOf(V1.class);
    private static final Set<V1> EMPTY_SET_OF_V1 = Set.of();
    private static final EnumSet<V1> ENUM_SET_V1 = EnumSet.allOf(V1.class);
    private static final Set<V1> SET_OF_V1 = Set.of(V1.values());
    private static final EnumSet<V2> ENUM_SET_V2 = EnumSet.allOf(V2.class);
    private static final Set<V2> SET_OF_V2 = Set.of(V2.values());
    private static final EnumSet<V3> ENUM_SET_V3 = EnumSet.allOf(V3.class);
    private static final Set<V3> SET_OF_V3 = Set.of(V3.values());
    private static final EnumSet<V4> ENUM_SET_V4 = EnumSet.allOf(V4.class);
    private static final Set<V4> SET_OF_V4 = Set.of(V4.values());
    private static final EnumSet<V8> ENUM_SET_V8 = EnumSet.allOf(V8.class);
    private static final Set<V8> SET_OF_V8 = Set.of(V8.values());
    private static final EnumSet<V16> ENUM_SET_V16 = EnumSet.allOf(V16.class);
    private static final Set<V16> SET_OF_V16 = Set.of(V16.values());
    private static final EnumSet<V32> ENUM_SET_V32 = EnumSet.allOf(V32.class);
    private static final Set<V32> SET_OF_V32 = Set.of(V32.values());
    private static final EnumSet<V64> ENUM_SET_V64 = EnumSet.allOf(V64.class);
    private static final Set<V64> SET_OF_V64 = Set.of(V64.values());
    private static final EnumSet<V65> ENUM_SET_V65 = EnumSet.allOf(V65.class);
    private static final Set<V65> SET_OF_V65 = Set.of(V65.values());
    private static final EnumSet<V128> ENUM_SET_V128 = EnumSet.allOf(V128.class);
    private static final Set<V128> SET_OF_V128 = Set.of(V128.values());

    public static void main(String[] args) {
        System.out.println("EMPTY_ENUM_SET_V1 " + (ClassLayout.parseInstance(EMPTY_ENUM_SET_V1).instanceSize()));
        System.out.println("ENUM_SET_V1 " + (ClassLayout.parseInstance(ENUM_SET_V1).instanceSize()));
        System.out.println("ENUM_SET_V2 " + (ClassLayout.parseInstance(ENUM_SET_V2).instanceSize()));
        System.out.println("ENUM_SET_V3 " + (ClassLayout.parseInstance(ENUM_SET_V3).instanceSize()));
        System.out.println("ENUM_SET_V4 " + (ClassLayout.parseInstance(ENUM_SET_V4).instanceSize()));
        System.out.println("ENUM_SET_V8 " + (ClassLayout.parseInstance(ENUM_SET_V8).instanceSize()));
        System.out.println("ENUM_SET_V16 " + (ClassLayout.parseInstance(ENUM_SET_V16).instanceSize()));
        System.out.println("ENUM_SET_V32 " + (ClassLayout.parseInstance(ENUM_SET_V32).instanceSize()));
        System.out.println("ENUM_SET_V64 " + (ClassLayout.parseInstance(ENUM_SET_V64).instanceSize()));
        System.out.println("ENUM_SET_V65 " + (ClassLayout.parseInstance(ENUM_SET_V65).instanceSize() + ClassLayout.parseInstance(new Long[2]).instanceSize()));
        System.out.println("ENUM_SET_V128 " + (ClassLayout.parseInstance(ENUM_SET_V128).instanceSize() + ClassLayout.parseInstance(new Long[2]).instanceSize()));

        System.out.println("EMPTY_SET_OF_V1 " + (ClassLayout.parseInstance(EMPTY_SET_OF_V1).instanceSize() + ClassLayout.parseInstance(new Object[0]).instanceSize()));
        System.out.println("SET_OF_V1 " + (ClassLayout.parseInstance(SET_OF_V1).instanceSize()));
        System.out.println("SET_OF_V2 " + (ClassLayout.parseInstance(SET_OF_V2).instanceSize()));
        System.out.println("SET_OF_V3 " + (ClassLayout.parseInstance(SET_OF_V3).instanceSize() + ClassLayout.parseInstance(new Object[6]).instanceSize()));
        System.out.println("SET_OF_V4 " + (ClassLayout.parseInstance(SET_OF_V4).instanceSize() + ClassLayout.parseInstance(new Object[8]).instanceSize()));
        System.out.println("SET_OF_V8 " + (ClassLayout.parseInstance(SET_OF_V8).instanceSize() + ClassLayout.parseInstance(new Object[16]).instanceSize()));
        System.out.println("SET_OF_V16 " + (ClassLayout.parseInstance(SET_OF_V16).instanceSize() + ClassLayout.parseInstance(new Object[32]).instanceSize()));
        System.out.println("SET_OF_V32 " + (ClassLayout.parseInstance(SET_OF_V32).instanceSize() + ClassLayout.parseInstance(new Object[64]).instanceSize()));
        System.out.println("SET_OF_V64 " + (ClassLayout.parseInstance(SET_OF_V64).instanceSize() + ClassLayout.parseInstance(new Object[128]).instanceSize()));
        System.out.println("SET_OF_V65 " + (ClassLayout.parseInstance(SET_OF_V65).instanceSize() + ClassLayout.parseInstance(new Object[130]).instanceSize()));
        System.out.println("SET_OF_V128 " + (ClassLayout.parseInstance(SET_OF_V128).instanceSize() + ClassLayout.parseInstance(new Object[256]).instanceSize()));
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
