package com.join.mgps.Util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: AESUtilV2.java */
/* loaded from: classes.dex */
public class a {
    public static String a(String str, String str2) throws Exception {
        byte[] i4 = i(str);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("625202f9149e061d".getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(i4), "UTF-8");
        } catch (Exception unused) {
            throw new Exception("解密失败");
        }
    }

    public static String b(String str) throws Exception {
        return c(str, "625202f9149e061d");
    }

    public static String c(String str, String str2) throws Exception {
        try {
            byte[] i4 = i(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(i4), "UTF-8");
        } catch (Exception unused) {
            throw new Exception("解密失败");
        }
    }

    public static String d(String str, String str2) throws Exception {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("625202f9149e061d".getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return h(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            throw new Exception("加密失败");
        }
    }

    public static String e(String str) throws Exception {
        return f(str, "625202f9149e061d");
    }

    public static String f(String str, String str2) throws Exception {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return h(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            throw new Exception("加密失败");
        }
    }

    public static void g(String[] strArr) throws Exception {
    }

    public static String h(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b5 : bArr) {
            String hexString = Integer.toHexString(b5 & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static byte[] i(String str) {
        if (str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i4 = 0; i4 < str.length() / 2; i4++) {
            int i5 = i4 * 2;
            int i6 = i5 + 1;
            bArr[i4] = (byte) ((Integer.parseInt(str.substring(i5, i6), 16) * 16) + Integer.parseInt(str.substring(i6, i5 + 2), 16));
        }
        return bArr;
    }
}
