package com.alipay.security.mobile.module.commonutils.crypto;

import java.security.MessageDigest;
/* loaded from: classes2.dex */
public final class d {
    public static String a(String str) {
        try {
            if (com.alipay.security.mobile.module.commonutils.a.b(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < digest.length; i4++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i4])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < digest.length; i4++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i4])));
            }
            return sb.toString();
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    private static byte[] c(String str) {
        try {
            if (com.alipay.security.mobile.module.commonutils.a.b(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String d(String str) {
        try {
            if (com.alipay.security.mobile.module.commonutils.a.b(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < 16; i4++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i4])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
