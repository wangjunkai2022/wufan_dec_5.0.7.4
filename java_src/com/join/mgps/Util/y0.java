package com.join.mgps.Util;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.dto.Constant;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: MD5Utils.java */
/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28150a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", com.kuaishou.weapon.p0.t.f55693l, "c", com.kuaishou.weapon.p0.t.f55701t, com.kwad.sdk.m.e.TAG, com.xinzhu.overmind.utils.helpers.f.f68332a};

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b5 : bArr) {
            stringBuffer.append(b(b5));
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(byte r3) {
        /*
            if (r3 >= 0) goto L4
            int r3 = r3 + 256
        L4:
            int r0 = r3 / 16
            int r3 = r3 % 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = com.join.mgps.Util.y0.f28150a
            r0 = r2[r0]
            r1.append(r0)
            r3 = r2[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.y0.b(byte):java.lang.String");
    }

    public static String c(Map<String, String> map, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str2 : map.keySet()) {
                if (!str2.equals("sig") && !str2.equals(Constant.MD5)) {
                    arrayList.add(str2 + SimpleComparison.EQUAL_TO_OPERATION + map.get(str2));
                }
            }
            Collections.sort(arrayList);
            return a(MessageDigest.getInstance("MD5").digest((str + "" + arrayList.toString().replace("[", "").replace("]", "").replace(", ", m.a.f71490d)).getBytes()));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String d(String str) {
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
