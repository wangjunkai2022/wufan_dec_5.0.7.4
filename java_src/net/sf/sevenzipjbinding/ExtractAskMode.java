package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public enum ExtractAskMode {
    EXTRACT,
    TEST,
    SKIP,
    UNKNOWN_ASK_MODE;

    public static ExtractAskMode getExtractAskModeByIndex(int i4) {
        if (i4 >= 0 && i4 < values().length) {
            return values()[i4];
        }
        return UNKNOWN_ASK_MODE;
    }
}
