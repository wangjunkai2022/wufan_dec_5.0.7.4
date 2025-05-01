package net.sf.sevenzipjbinding;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum kBlockSize uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class NCoderPropID {
    private static final /* synthetic */ NCoderPropID[] $VALUES;
    public static final NCoderPropID kAlgorithm;
    public static final NCoderPropID kBlockSize;
    public static final NCoderPropID kDefaultProp;
    public static final NCoderPropID kDictionarySize;
    public static final NCoderPropID kEndMarker;
    public static final NCoderPropID kLitContextBits;
    public static final NCoderPropID kLitPosBits;
    public static final NCoderPropID kMatchFinder;
    public static final NCoderPropID kMatchFinderCycles;
    public static final NCoderPropID kNumFastBytes;
    public static final NCoderPropID kNumPasses;
    public static final NCoderPropID kNumThreads;
    public static final NCoderPropID kOrder;
    public static final NCoderPropID kPosStateBits;
    public static final NCoderPropID kUsedMemorySize;
    private final Class<?> clazz;
    private final String option;

    static {
        Class cls = Integer.TYPE;
        NCoderPropID nCoderPropID = new NCoderPropID("kBlockSize", 0, cls, "C");
        kBlockSize = nCoderPropID;
        NCoderPropID nCoderPropID2 = new NCoderPropID("kDictionarySize", 1, cls, "D");
        kDictionarySize = nCoderPropID2;
        NCoderPropID nCoderPropID3 = new NCoderPropID("kUsedMemorySize", 2, cls, "MEM");
        kUsedMemorySize = nCoderPropID3;
        NCoderPropID nCoderPropID4 = new NCoderPropID("kOrder", 3, cls, "O");
        kOrder = nCoderPropID4;
        NCoderPropID nCoderPropID5 = new NCoderPropID("kPosStateBits", 4, cls, "PB");
        kPosStateBits = nCoderPropID5;
        NCoderPropID nCoderPropID6 = new NCoderPropID("kLitContextBits", 5, cls, "LC");
        kLitContextBits = nCoderPropID6;
        NCoderPropID nCoderPropID7 = new NCoderPropID("kLitPosBits", 6, cls, "LP");
        kLitPosBits = nCoderPropID7;
        NCoderPropID nCoderPropID8 = new NCoderPropID("kEndMarker", 7, Boolean.TYPE, "eos");
        kEndMarker = nCoderPropID8;
        NCoderPropID nCoderPropID9 = new NCoderPropID("kNumPasses", 8, cls, "Pass");
        kNumPasses = nCoderPropID9;
        NCoderPropID nCoderPropID10 = new NCoderPropID("kNumFastBytes", 9, cls, "fb");
        kNumFastBytes = nCoderPropID10;
        NCoderPropID nCoderPropID11 = new NCoderPropID("kMatchFinderCycles", 10, cls, "mc");
        kMatchFinderCycles = nCoderPropID11;
        NCoderPropID nCoderPropID12 = new NCoderPropID("kAlgorithm", 11, cls, "a");
        kAlgorithm = nCoderPropID12;
        NCoderPropID nCoderPropID13 = new NCoderPropID("kMatchFinder", 12, String.class, "mf");
        kMatchFinder = nCoderPropID13;
        NCoderPropID nCoderPropID14 = new NCoderPropID("kNumThreads", 13, cls, "mt");
        kNumThreads = nCoderPropID14;
        NCoderPropID nCoderPropID15 = new NCoderPropID("kDefaultProp", 14, cls, "");
        kDefaultProp = nCoderPropID15;
        $VALUES = new NCoderPropID[]{nCoderPropID, nCoderPropID2, nCoderPropID3, nCoderPropID4, nCoderPropID5, nCoderPropID6, nCoderPropID7, nCoderPropID8, nCoderPropID9, nCoderPropID10, nCoderPropID11, nCoderPropID12, nCoderPropID13, nCoderPropID14, nCoderPropID15};
    }

    private NCoderPropID(String str, int i4, Class cls, String str2) {
        this.clazz = cls;
        this.option = str2;
    }

    public static NCoderPropID valueOf(String str) {
        return (NCoderPropID) Enum.valueOf(NCoderPropID.class, str);
    }

    public static NCoderPropID[] values() {
        return (NCoderPropID[]) $VALUES.clone();
    }
}
