package a.auu;
/* loaded from: classes8.dex */
public class a {
    private static final int[] ooo00000 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] ooo0o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int[] oo00;
    public int oo000;
    public byte[] oo0000;
    private int oo00000;
    private int oo000000;

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] ooo0ooo0o0o000o = new a().ooo0ooo0o0o000o(str, 0);
            int length = ooo0ooo0o0o000o.length;
            byte[] bArr = {78, 101, 116, 101, 97, 115, 101};
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                if (i5 >= 7) {
                    i5 = 0;
                }
                ooo0ooo0o0o000o[i4] = (byte) (ooo0ooo0o0o000o[i4] ^ bArr[i5]);
                i4++;
                i5++;
            }
            return new String(ooo0ooo0o0o000o, "utf-8");
        } catch (Exception e5) {
            return null;
        }
    }

    public void ooo0oo00000oo000o(int i4, byte[] bArr) {
        this.oo0000 = bArr;
        this.oo00 = (i4 & 8) == 0 ? ooo00000 : ooo0o;
        this.oo00000 = 0;
        this.oo000000 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r11.oo00000 = r7;
        r11.oo000000 = r8;
        r11.oo000 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
        switch(r7) {
            case 0: goto L24;
            case 1: goto L25;
            case 2: goto L27;
            case 3: goto L28;
            case 4: goto L29;
            default: goto L21;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
        r11.oo00000 = r7;
        r11.oo000 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011d, code lost:
        r11.oo00000 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + 1;
        r4[r3] = (byte) (r8 >> 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
        r2 = r3 + 1;
        r4[r3] = (byte) (r8 >> 10);
        r4[r2] = (byte) (r8 >> 2);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
        r11.oo00000 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r15 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ooo0ooo0o0o0(byte[] r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.auu.a.ooo0ooo0o0o0(byte[], int, int, boolean):boolean");
    }

    public byte[] ooo0ooo0o0o000o(String str, int i4) {
        return ooo0ooo0o0o000o(str.getBytes(), i4);
    }

    public byte[] ooo0ooo0o0o000o(byte[] bArr, int i4) {
        return ooo0ooo0o0o000o(bArr, 0, bArr.length, i4);
    }

    public byte[] ooo0ooo0o0o000o(byte[] bArr, int i4, int i5, int i6) {
        ooo0oo00000oo000o(i6, new byte[(i5 * 3) / 4]);
        if (ooo0ooo0o0o0(bArr, i4, i5, true)) {
            if (this.oo000 == this.oo0000.length) {
                return this.oo0000;
            }
            byte[] bArr2 = new byte[this.oo000];
            System.arraycopy(this.oo0000, 0, bArr2, 0, this.oo000);
            return bArr2;
        }
        throw new IllegalArgumentException("aes error");
    }
}
