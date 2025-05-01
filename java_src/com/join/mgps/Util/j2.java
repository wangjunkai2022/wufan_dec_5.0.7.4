package com.join.mgps.Util;

import java.util.Random;
/* compiled from: TextUtils.java */
/* loaded from: classes3.dex */
public class j2 {
    public static int a(String str) {
        char[] charArray = str.toCharArray();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            if (((char) ((byte) charArray[i6])) != charArray[i6]) {
                i4++;
            } else {
                i5++;
            }
        }
        return (i4 * 2) + i5;
    }

    public static String b(int i4) {
        Random random = new Random(System.currentTimeMillis());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < i4; i5++) {
            stringBuffer.append(random.nextInt(10));
        }
        return stringBuffer.toString();
    }
}
