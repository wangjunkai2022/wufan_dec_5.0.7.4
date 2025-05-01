package com.switfpass.pay.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes5.dex */
public class w {
    private w() {
    }

    public static final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length << 1];
            int i4 = 0;
            for (byte b5 : digest) {
                int i5 = i4 + 1;
                cArr2[i4] = cArr[(b5 >>> 4) & 15];
                i4 = i5 + 1;
                cArr2[i5] = cArr[b5 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i4 = 0; i4 < digest.length; i4++) {
                int i5 = digest[i4];
                if (i5 < 0) {
                    i5 += 256;
                }
                if (i5 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i5));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return "";
        }
    }
}
