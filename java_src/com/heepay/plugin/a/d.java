package com.heepay.plugin.a;

import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
/* loaded from: classes3.dex */
public class d {
    public static byte a(char c5) {
        int i4;
        if (c5 < '0' || c5 > '9') {
            char c6 = 'a';
            if (c5 < 'a' || c5 > 'f') {
                c6 = 'A';
                if (c5 < 'A' || c5 > 'F') {
                    return (byte) 0;
                }
            }
            i4 = (c5 - c6) + 10;
        } else {
            i4 = c5 - '0';
        }
        return (byte) i4;
    }

    private static char a(byte b5) {
        byte b6 = (byte) (b5 & 15);
        return (char) (b6 < 10 ? b6 + 48 : (b6 + 65) - 10);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b5 : digest) {
                String hexString = Integer.toHexString(b5 & 255);
                int length = hexString.length();
                if (length == 0) {
                    hexString = "00";
                } else if (length == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String a(String str, String str2, String str3) {
        String substring = str2.substring(0, 8);
        String substring2 = str2.substring(8, 16);
        String substring3 = str2.substring(16, 24);
        boolean equalsIgnoreCase = "ToHex16".equalsIgnoreCase(str3);
        byte[] bytes = str.getBytes("UTF-8");
        int length = (bytes.length + 8) & (-8);
        if (length != bytes.length) {
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < bytes.length; i4++) {
                bArr[i4] = bytes[i4];
            }
            for (int length2 = bytes.length; length2 < length; length2++) {
                bArr[length2] = (byte) (length - bytes.length);
            }
            bytes = bArr;
        }
        byte[] bArr2 = new byte[bytes.length];
        byte[] bArr3 = new byte[8];
        int i5 = 0;
        while (true) {
            int i6 = i5 + 8;
            if (i6 > bytes.length) {
                break;
            }
            byte[] bArr4 = new byte[8];
            for (int i7 = 0; i7 < 8; i7++) {
                bArr4[i7] = bytes[i5 + i7];
            }
            if (i5 == 0) {
                bArr3 = substring.getBytes("UTF-8");
            } else {
                for (int i8 = 0; i8 < 8; i8++) {
                    bArr3[i8] = bArr2[(i5 + i8) - 8];
                }
            }
            byte[] b5 = b(a(b(bArr4, substring, "DES/ECB/NoPadding", bArr3), substring2, "DES/ECB/NoPadding", null), substring3, "DES/ECB/NoPadding", null);
            for (int i9 = 0; i9 < 8; i9++) {
                bArr2[i5 + i9] = b5[i9];
            }
            i5 = i6;
        }
        return equalsIgnoreCase ? a(bArr2) : c.a(bArr2);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            stringBuffer.append(a((byte) ((bArr[i4] & 240) >> 4)));
            stringBuffer.append(a((byte) (bArr[i4] & 15)));
        }
        return stringBuffer.toString();
    }

    public static byte[] a(PublicKey publicKey, String str) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        return cipher.doFinal(str.getBytes("UTF-8"));
    }

    public static byte[] a(byte[] bArr, String str, String str2, byte[] bArr2) {
        Cipher cipher = Cipher.getInstance(str2);
        SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("UTF-8")));
        if (!str2.contains("/CBC/") || bArr2 == null) {
            cipher.init(2, generateSecret);
        } else {
            cipher.init(2, generateSecret, new IvParameterSpec(bArr2));
        }
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKey generateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(bArr));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(1, generateSecret, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr3);
    }

    public static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) ((a(str.charAt(i5)) << 4) + a(str.charAt(i5 + 1)));
        }
        return bArr;
    }

    public static byte[] b(byte[] bArr, String str, String str2, byte[] bArr2) {
        Cipher cipher = Cipher.getInstance(str2);
        SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("UTF-8")));
        if (str2.contains("/CBC/")) {
            cipher.init(1, generateSecret, new IvParameterSpec(bArr2));
        } else {
            cipher.init(1, generateSecret);
        }
        return cipher.doFinal(bArr);
    }

    public static PublicKey c(String str) {
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b(str))).getPublicKey();
        } catch (Exception unused) {
            com.heepay.plugin.c.c.e("WebService", "数据分析出错");
            return null;
        }
    }
}
