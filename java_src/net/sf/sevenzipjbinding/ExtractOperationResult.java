package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public enum ExtractOperationResult {
    OK,
    UNSUPPORTEDMETHOD,
    DATAERROR,
    CRCERROR,
    UNAVAILABLE,
    UNEXPECTED_END,
    DATA_AFTER_END,
    IS_NOT_ARC,
    HEADERS_ERROR,
    WRONG_PASSWORD,
    UNKNOWN_OPERATION_RESULT;

    public static ExtractOperationResult getOperationResult(int i4) {
        if (i4 >= 0 && i4 < values().length) {
            return values()[i4];
        }
        return UNKNOWN_OPERATION_RESULT;
    }
}
