package com.xinzhu.overmind.utils;
/* compiled from: HexEncoding.java */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f68381a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f68382b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private l() {
    }

    public static byte[] a(String str) throws IllegalArgumentException {
        return c(str.toCharArray());
    }

    public static byte[] b(String str, boolean z4) throws IllegalArgumentException {
        return d(str.toCharArray(), z4);
    }

    public static byte[] c(char[] cArr) throws IllegalArgumentException {
        return d(cArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[LOOP:0: B:10:0x001d->B:11:0x001f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] d(char[] r6, boolean r7) throws java.lang.IllegalArgumentException {
        /*
            int r0 = r6.length
            int r1 = r0 + 1
            int r1 = r1 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L18
            int r7 = r0 % 2
            if (r7 == 0) goto L1c
            int r7 = l(r6, r2)
            byte r7 = (byte) r7
            r1[r2] = r7
            r2 = 1
            goto L1d
        L18:
            int r7 = r0 % 2
            if (r7 != 0) goto L36
        L1c:
            r3 = 0
        L1d:
            if (r2 >= r0) goto L35
            int r7 = r3 + 1
            int r4 = l(r6, r2)
            int r4 = r4 << 4
            int r5 = r2 + 1
            int r5 = l(r6, r5)
            r4 = r4 | r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 2
            r3 = r7
            goto L1d
        L35:
            return r1
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Invalid input length: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            goto L4e
        L4d:
            throw r6
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.utils.l.d(char[], boolean):byte[]");
    }

    public static char[] e(byte[] bArr) {
        return g(bArr, 0, bArr.length, true);
    }

    public static char[] f(byte[] bArr, int i4, int i5) {
        return g(bArr, i4, i5, true);
    }

    private static char[] g(byte[] bArr, int i4, int i5, boolean z4) {
        char[] cArr = z4 ? f68382b : f68381a;
        char[] cArr2 = new char[i5 * 2];
        for (int i6 = 0; i6 < i5; i6++) {
            byte b5 = bArr[i4 + i6];
            int i7 = i6 * 2;
            cArr2[i7] = cArr[(b5 >> 4) & 15];
            cArr2[i7 + 1] = cArr[b5 & 15];
        }
        return cArr2;
    }

    public static char[] h(byte[] bArr, boolean z4) {
        return g(bArr, 0, bArr.length, z4);
    }

    public static String i(byte b5, boolean z4) {
        char[] cArr = z4 ? f68382b : f68381a;
        return new String(new char[]{cArr[(b5 >> 4) & 15], cArr[b5 & 15]}, 0, 2);
    }

    public static String j(byte[] bArr) {
        return k(bArr, true);
    }

    public static String k(byte[] bArr, boolean z4) {
        return new String(h(bArr, z4));
    }

    private static int l(char[] cArr, int i4) throws IllegalArgumentException {
        char c5 = cArr[i4];
        if ('0' > c5 || c5 > '9') {
            char c6 = 'a';
            if ('a' > c5 || c5 > 'f') {
                c6 = 'A';
                if ('A' > c5 || c5 > 'F') {
                    throw new IllegalArgumentException("Illegal char: " + cArr[i4] + " at offset " + i4);
                }
            }
            return (c5 - c6) + 10;
        }
        return c5 - '0';
    }
}
