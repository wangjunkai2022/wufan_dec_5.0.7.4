package com.kuaishou.weapon.p0;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f55580a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", t.f55693l, "c", t.f55701t, com.kwad.sdk.m.e.TAG, com.xinzhu.overmind.utils.helpers.f.f68332a};

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(byte r3) {
        /*
            if (r3 >= 0) goto L4
            int r3 = r3 + 256
        L4:
            int r0 = r3 / 16
            int r3 = r3 % 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = com.kuaishou.weapon.p0.f.f55580a
            r0 = r2[r0]
            r1.append(r0)
            r3 = r2[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.f.a(byte):java.lang.String");
    }

    public static String b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0) {
                try {
                } catch (Throwable unused) {
                    return null;
                }
            }
            return a(MessageDigest.getInstance("MD5").digest(bArr));
        }
        return null;
    }

    public static String c(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            int i5 = i4 * 2;
            cArr2[i5] = cArr[(b5 >>> 4) & 15];
            cArr2[i5 + 1] = cArr[b5 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0) {
                try {
                } catch (Throwable unused) {
                    return null;
                }
            }
            return MessageDigest.getInstance("MD5").digest(bArr);
        }
        return null;
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b5 : bArr) {
            stringBuffer.append(a(b5));
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String str3 = new String(str);
            try {
                return a(MessageDigest.getInstance("MD5").digest(str3.getBytes()));
            } catch (Throwable unused) {
                str2 = str3;
                return str2;
            }
        } catch (Throwable unused2) {
        }
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        if (file != null && file.exists()) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String c5 = c(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Throwable unused2) {
                }
                return c5;
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                return null;
            }
        }
        return null;
    }
}
