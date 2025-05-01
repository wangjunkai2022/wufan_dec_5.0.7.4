package com.alipay.security.mobile.module.commonutils.crypto;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4997a = "HmacSHA1";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4998b = "HMAC-SHA-1";

    /* renamed from: c  reason: collision with root package name */
    public static final String f4999c = "RAW";

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5000d = e.d("7B726A5DDD72CBF8D1700FB6EB278AFD7559C40A3761E5A71614D0AC9461ED8EE9F6AAEB443CD648");

    private c() {
    }

    private static String a(String str) {
        Mac mac;
        if (com.alipay.security.mobile.module.commonutils.a.b(str)) {
            return null;
        }
        try {
            try {
                mac = Mac.getInstance(f4997a);
            } catch (NoSuchAlgorithmException | Exception unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException unused2) {
            mac = Mac.getInstance(f4998b);
        }
        mac.init(new SecretKeySpec(f5000d, f4999c));
        byte[] doFinal = mac.doFinal(str.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 16; i4++) {
            sb.append(String.format("%02x", Byte.valueOf(doFinal[i4])));
        }
        return sb.toString();
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        Mac mac;
        try {
            mac = Mac.getInstance(f4997a);
        } catch (NoSuchAlgorithmException unused) {
            mac = Mac.getInstance(f4998b);
        }
        mac.init(new SecretKeySpec(bArr2, f4999c));
        return mac.doFinal(bArr);
    }
}
