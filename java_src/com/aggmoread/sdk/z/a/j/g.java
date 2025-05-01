package com.aggmoread.sdk.z.a.j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
/* loaded from: classes2.dex */
public class g {
    public static String a(String str) {
        byte[] b5;
        if (str == null || (b5 = b(str)) == null) {
            return null;
        }
        return b(b5);
    }

    public static byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable th) {
            com.aggmoread.sdk.z.a.d.a("data", th);
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return a(bArr, 0, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i4, i5);
            byte[] a5 = a(byteArrayInputStream);
            byteArrayInputStream.close();
            return a5;
        } catch (Throwable th) {
            com.aggmoread.sdk.z.a.d.a("data", th);
            th.printStackTrace();
            return null;
        }
    }

    private static String b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i4])));
        }
        return stringBuffer.toString();
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a(str.getBytes("utf-8"));
        } catch (Throwable th) {
            com.aggmoread.sdk.z.a.d.a("data", th);
            th.printStackTrace();
            return null;
        }
    }
}
