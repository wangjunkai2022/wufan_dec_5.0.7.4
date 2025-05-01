package com.papa91.arc.util;

import com.kwad.sdk.collector.AppStatusRules;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class MD5Util {
    public static String byteToMD5(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b5 : digest) {
                int i4 = b5 & 255;
                if (i4 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i4));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getDirMD5(File file, boolean z4) {
        File[] listFiles;
        if (file.isDirectory()) {
            HashMap hashMap = new HashMap();
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory() && z4) {
                    hashMap.putAll(getDirMD5(file2, z4));
                } else {
                    String fileMD5 = getFileMD5(file2);
                    if (fileMD5 != null) {
                        hashMap.put(file2.getPath(), fileMD5);
                    }
                }
            }
            return hashMap;
        }
        return null;
    }

    public static String getFileMD5(File file) {
        if (file.isFile()) {
            byte[] bArr = new byte[AppStatusRules.UploadConfig.DEFAULT_FILE_MAX_SIZE];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int read = fileInputStream.read(bArr, 0, AppStatusRules.UploadConfig.DEFAULT_FILE_MAX_SIZE);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream.close();
                String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                while (bigInteger.length() < 32) {
                    bigInteger = "0" + bigInteger;
                }
                if (bigInteger.length() == 31) {
                    return "0" + bigInteger;
                }
                return bigInteger;
            } catch (Exception e5) {
                e5.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static String stringToMD5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b5 : digest) {
                int i4 = b5 & 255;
                if (i4 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i4));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
