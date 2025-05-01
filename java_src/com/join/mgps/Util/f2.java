package com.join.mgps.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: StringMinUtil.java */
/* loaded from: classes3.dex */
public class f2 {
    public static int a(String str) {
        Matcher matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str);
        int i4 = 0;
        while (matcher.find()) {
            for (int i5 = 0; i5 <= matcher.groupCount(); i5++) {
                i4++;
            }
        }
        return i4;
    }

    public static int b(String str) {
        if (g2.h(str)) {
            return 0;
        }
        return str.length() + a(str);
    }

    public static boolean c(String str, int i4, int i5) {
        int b5 = b(str);
        return b5 >= i4 && b5 <= i5;
    }

    public static boolean d(String str, int i4) {
        return b(str) >= i4;
    }
}
