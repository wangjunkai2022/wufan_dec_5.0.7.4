package com.papa.sim.statistic;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: MD5Util.java */
/* loaded from: classes5.dex */
public class j {
    public static String a(String str) {
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
