package com.netease.nis.basesdk;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* loaded from: classes5.dex */
public class EncryptUtil {
    public static String RSAEncrypt(String str, String str2) {
        try {
            PublicKey a5 = a(str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, a5);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 2));
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
            return null;
        }
    }

    private static PublicKey a(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
    }

    public static String getRandomString(int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            double random = Math.random();
            double d5 = 61;
            Double.isNaN(d5);
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) Math.round(random * d5)));
        }
        return sb.toString();
    }
}
