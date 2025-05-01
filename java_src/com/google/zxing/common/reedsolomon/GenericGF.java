package com.google.zxing.common.reedsolomon;

import com.bytedance.sdk.openadsdk.TTAdConstant;
/* loaded from: classes3.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    private static final int INITIALIZATION_THRESHOLD = 0;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;
    private int[] expTable;
    private boolean initialized = false;
    private int[] logTable;
    private GenericGFPoly one;
    private final int primitive;
    private final int size;
    private GenericGFPoly zero;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(TTAdConstant.INIT_FAILED_CREATE_INITIALIZER_FAILED, 4096);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024);

    static {
        GenericGF genericGF = new GenericGF(67, 64);
        AZTEC_DATA_6 = genericGF;
        AZTEC_PARAM = new GenericGF(19, 16);
        QR_CODE_FIELD_256 = new GenericGF(285, 256);
        GenericGF genericGF2 = new GenericGF(301, 256);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i4, int i5) {
        this.primitive = i4;
        this.size = i5;
        if (i5 <= 0) {
            initialize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int addOrSubtract(int i4, int i5) {
        return i4 ^ i5;
    }

    private void checkInit() {
        if (this.initialized) {
            return;
        }
        initialize();
    }

    private void initialize() {
        int i4 = this.size;
        this.expTable = new int[i4];
        this.logTable = new int[i4];
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = this.size;
            if (i5 >= i7) {
                break;
            }
            this.expTable[i5] = i6;
            i6 <<= 1;
            if (i6 >= i7) {
                i6 = (i6 ^ this.primitive) & (i7 - 1);
            }
            i5++;
        }
        for (int i8 = 0; i8 < this.size - 1; i8++) {
            this.logTable[this.expTable[i8]] = i8;
        }
        this.zero = new GenericGFPoly(this, new int[]{0});
        this.one = new GenericGFPoly(this, new int[]{1});
        this.initialized = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericGFPoly buildMonomial(int i4, int i5) {
        checkInit();
        if (i4 >= 0) {
            if (i5 == 0) {
                return this.zero;
            }
            int[] iArr = new int[i4 + 1];
            iArr[0] = i5;
            return new GenericGFPoly(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int exp(int i4) {
        checkInit();
        return this.expTable[i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericGFPoly getOne() {
        checkInit();
        return this.one;
    }

    public int getSize() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericGFPoly getZero() {
        checkInit();
        return this.zero;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int inverse(int i4) {
        checkInit();
        if (i4 != 0) {
            return this.expTable[(this.size - this.logTable[i4]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int log(int i4) {
        checkInit();
        if (i4 != 0) {
            return this.logTable[i4];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int multiply(int i4, int i5) {
        int i6;
        checkInit();
        if (i4 == 0 || i5 == 0) {
            return 0;
        }
        if (i4 < 0 || i5 < 0 || i4 >= (i6 = this.size) || i5 >= i6) {
            i4++;
        }
        int[] iArr = this.logTable;
        int i7 = iArr[i4] + iArr[i5];
        int[] iArr2 = this.expTable;
        int i8 = this.size;
        return iArr2[(i7 % i8) + (i7 / i8)];
    }
}
