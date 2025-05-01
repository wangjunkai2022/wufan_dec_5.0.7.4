package com.switfpass.pay.utils;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* loaded from: classes5.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61888a = "SHA1WithRSA";

    public static boolean a(String str, String str2, String str3) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(c.c(str3)));
            Signature signature = Signature.getInstance(f61888a);
            signature.initVerify(generatePublic);
            signature.update(str.getBytes("utf-8"));
            new StringBuilder("content :   ").append(str);
            new StringBuilder("sign:   ").append(str2);
            boolean verify = signature.verify(c.c(str2));
            new StringBuilder("bverify = ").append(verify);
            return verify;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static String b(String str, String str2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(c.c(str2)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, generatePublic);
            return new String(c.d(cipher.doFinal(str.getBytes("UTF-8"))));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                byte b5 = digest[i5];
                int i6 = i4 + 1;
                cArr2[i4] = cArr[(b5 >>> 4) & 15];
                i4 = i6 + 1;
                cArr2[i6] = cArr[b5 & 15];
            }
            return new String(cArr2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String d(String str, String str2) {
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(c.c(str2)));
            Signature signature = Signature.getInstance(f61888a);
            signature.initSign(generatePrivate);
            signature.update(str.getBytes("UTF-8"));
            return c.d(signature.sign());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
