package com.sdk.r;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* loaded from: classes5.dex */
public class e extends com.sdk.i.a {
    public static final String TAG = "com.sdk.r.e";
    public static boolean isDebug = com.sdk.f.g.f60051b;

    public static String a(String str) {
        if (com.sdk.o.b.a(str).booleanValue()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                String hexString = Integer.toHexString(b5 & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e5) {
            com.sdk.i.a.logError(TAG, "encrypt", e5.getMessage(), isDebug);
            return null;
        }
    }
}
