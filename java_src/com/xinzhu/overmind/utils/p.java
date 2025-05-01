package com.xinzhu.overmind.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: Md5Utils.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f68404a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b5 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = f68404a;
            cArr[i4] = cArr2[(b5 >>> 4) & 15];
            i4 = i5 + 1;
            cArr[i5] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public static String b(File file) {
        try {
            if (file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                String c5 = c(fileInputStream);
                fileInputStream.close();
                return c5;
            }
            return null;
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static String c(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    inputStream.close();
                    return a(messageDigest.digest());
                }
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("utf-8"));
            return a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
