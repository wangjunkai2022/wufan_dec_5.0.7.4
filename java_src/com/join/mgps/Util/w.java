package com.join.mgps.Util;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: Crypto3DES.java */
/* loaded from: classes3.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28134a = "cf9b337069cb5dec34d1b3f266306bd8";

    /* renamed from: b  reason: collision with root package name */
    private static final String f28135b = "01234567";

    /* renamed from: c  reason: collision with root package name */
    private static final String f28136c = "utf-8";

    /* compiled from: Crypto3DES.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final char[] f28137a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

        private static int a(char c5) {
            int i4;
            if (c5 < 'A' || c5 > 'Z') {
                if (c5 >= 'a' && c5 <= 'z') {
                    i4 = c5 - 'a';
                } else if (c5 < '0' || c5 > '9') {
                    if (c5 != '+') {
                        if (c5 != '/') {
                            if (c5 == '=') {
                                return 0;
                            }
                            throw new RuntimeException("unexpected code: " + c5);
                        }
                        return 63;
                    }
                    return 62;
                } else {
                    i4 = (c5 - '0') + 26;
                }
                return i4 + 26;
            }
            return c5 - 'A';
        }

        private static void b(String str, OutputStream outputStream) throws IOException {
            int length = str.length();
            int i4 = 0;
            while (true) {
                if (i4 < length && str.charAt(i4) <= ' ') {
                    i4++;
                } else if (i4 == length) {
                    return;
                } else {
                    int i5 = i4 + 2;
                    int i6 = i4 + 3;
                    int a5 = (a(str.charAt(i4)) << 18) + (a(str.charAt(i4 + 1)) << 12) + (a(str.charAt(i5)) << 6) + a(str.charAt(i6));
                    outputStream.write((a5 >> 16) & 255);
                    if (str.charAt(i5) == '=') {
                        return;
                    }
                    outputStream.write((a5 >> 8) & 255);
                    if (str.charAt(i6) == '=') {
                        return;
                    }
                    outputStream.write(a5 & 255);
                    i4 += 4;
                }
            }
        }

        public static byte[] c(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                b(str, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e5) {
                    PrintStream printStream = System.err;
                    printStream.println("Error while decoding BASE64: " + e5.toString());
                }
                return byteArray;
            } catch (IOException unused) {
                throw new RuntimeException();
            }
        }

        public static String d(byte[] bArr) {
            int length = bArr.length;
            StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
            int i4 = length - 3;
            int i5 = 0;
            loop0: while (true) {
                int i6 = 0;
                while (i5 <= i4) {
                    int i7 = ((bArr[i5] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5 + 2] & 255);
                    char[] cArr = f28137a;
                    stringBuffer.append(cArr[(i7 >> 18) & 63]);
                    stringBuffer.append(cArr[(i7 >> 12) & 63]);
                    stringBuffer.append(cArr[(i7 >> 6) & 63]);
                    stringBuffer.append(cArr[i7 & 63]);
                    i5 += 3;
                    int i8 = i6 + 1;
                    if (i6 >= 14) {
                        break;
                    }
                    i6 = i8;
                }
                stringBuffer.append(" ");
            }
            int i9 = 0 + length;
            if (i5 == i9 - 2) {
                int i10 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
                char[] cArr2 = f28137a;
                stringBuffer.append(cArr2[(i10 >> 18) & 63]);
                stringBuffer.append(cArr2[(i10 >> 12) & 63]);
                stringBuffer.append(cArr2[(i10 >> 6) & 63]);
                stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
            } else if (i5 == i9 - 1) {
                int i11 = (bArr[i5] & 255) << 16;
                char[] cArr3 = f28137a;
                stringBuffer.append(cArr3[(i11 >> 18) & 63]);
                stringBuffer.append(cArr3[(i11 >> 12) & 63]);
                stringBuffer.append("==");
            }
            return stringBuffer.toString();
        }
    }

    public static String a(String str) throws Exception {
        SecretKey generateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(f28134a.getBytes()));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(2, generateSecret, new IvParameterSpec(f28135b.getBytes()));
        return new String(cipher.doFinal(a.c(str)), f28136c);
    }

    public static String b(String str) throws Exception {
        SecretKey generateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(f28134a.getBytes()));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(1, generateSecret, new IvParameterSpec(f28135b.getBytes()));
        return a.d(cipher.doFinal(str.getBytes(f28136c)));
    }

    public static String c(String str) {
        try {
            byte[] bytes = str.getBytes(net.lingala.zip4j.util.e.A0);
            int length = bytes.length + (8 - (bytes.length % 8));
            byte[] bArr = new byte[length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            for (int length2 = bytes.length; length2 < length; length2++) {
                bArr[length2] = 0;
            }
            return new String(bArr, net.lingala.zip4j.util.e.A0);
        } catch (UnsupportedEncodingException unused) {
            System.out.println("Crypter.padding UnsupportedEncodingException");
            return null;
        }
    }
}
