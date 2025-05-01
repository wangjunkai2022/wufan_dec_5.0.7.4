package com.papa91.pay.core;

import com.join.mgps.Util.g2;
import com.join.mgps.Util.k;
/* loaded from: classes5.dex */
public class PapaCore {
    static {
        System.loadLibrary("papa");
    }

    public static String encode(String str) {
        return g2.i(str) ? k.b(encrypt(k.b(str.getBytes()).getBytes())) : "";
    }

    public static native byte[] encrypt(byte[] bArr);

    public static native byte[] nativeDecrypt(byte[] bArr);

    public static native byte[] nativeEncrypt(byte[] bArr);
}
