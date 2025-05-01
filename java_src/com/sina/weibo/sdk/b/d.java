package com.sina.weibo.sdk.b;

import java.security.MessageDigest;
/* loaded from: classes5.dex */
public final class d {
    private static final char[] aj = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                byte b5 = digest[i5];
                int i6 = i4 + 1;
                char[] cArr2 = aj;
                cArr[i4] = cArr2[(b5 >>> 4) & 15];
                i4 = i6 + 1;
                cArr[i6] = cArr2[b5 & 15];
            }
            return new String(cArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String f(String str) {
        try {
            return a(str.getBytes());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
