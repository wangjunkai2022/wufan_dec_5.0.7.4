package com.kwad.sdk.api.loader;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
/* loaded from: classes5.dex */
final class t {
    private static final char[] aom = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getFileMD5(File file) {
        Throwable th;
        DigestInputStream digestInputStream;
        Exception e5;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            digestInputStream = new DigestInputStream(new FileInputStream(file), messageDigest);
            try {
                try {
                    byte[] bArr = new byte[1024];
                    for (int read = digestInputStream.read(bArr); read != -1; read = digestInputStream.read(bArr)) {
                    }
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder(digest.length * 2);
                    for (byte b5 : digest) {
                        int i4 = b5 & 255;
                        if (i4 < 16) {
                            sb.append("0");
                        }
                        sb.append(Integer.toHexString(i4));
                    }
                    String sb2 = sb.toString();
                    b(digestInputStream);
                    return sb2;
                } catch (Exception e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    b(digestInputStream);
                    return "";
                }
            } catch (Throwable th2) {
                th = th2;
                b(digestInputStream);
                throw th;
            }
        } catch (Exception e7) {
            e5 = e7;
            digestInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            digestInputStream = null;
            b(digestInputStream);
            throw th;
        }
    }
}
