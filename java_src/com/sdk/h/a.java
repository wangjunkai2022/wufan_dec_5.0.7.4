package com.sdk.h;
/* loaded from: classes5.dex */
public class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f60069a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f60070b = new byte[256];

    /* renamed from: c  reason: collision with root package name */
    public byte[] f60071c = new byte[4];

    static {
        int i4 = 0;
        for (int i5 = 0; i5 < 255; i5++) {
            f60070b[i5] = -1;
        }
        while (true) {
            char[] cArr = f60069a;
            if (i4 >= cArr.length) {
                return;
            }
            f60070b[cArr[i4]] = (byte) i4;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    @Override // com.sdk.h.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.PushbackInputStream r10, java.io.OutputStream r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sdk.h.a.a(java.io.PushbackInputStream, java.io.OutputStream, int):void");
    }
}
