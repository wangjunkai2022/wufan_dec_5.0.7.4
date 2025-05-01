package com.join.mgps.Util;
/* compiled from: NumberChangeToChinese.java */
/* loaded from: classes3.dex */
public class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f27888a = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    /* renamed from: b  reason: collision with root package name */
    public static char[] f27889b = {38646, 19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061};

    /* renamed from: c  reason: collision with root package name */
    public static String[] f27890c = {"", "万", "亿", "万亿"};

    /* renamed from: d  reason: collision with root package name */
    public static String[] f27891d = {"", "十", "百", "千"};

    public static String a(int i4) {
        String str;
        if (i4 == 0) {
            return "零";
        }
        String str2 = new String();
        String str3 = new String();
        new String();
        boolean z4 = false;
        int i5 = 0;
        while (i4 > 0) {
            int i6 = i4 % 10000;
            if (z4) {
                str2 = f27888a[0] + str2;
            }
            String b5 = b(i6, str3);
            if (i6 != 0) {
                str = b5 + f27890c[i5];
            } else {
                str = f27890c[0] + b5;
            }
            str2 = str + str2;
            z4 = i6 < 1000 && i6 > 0;
            i4 /= 10000;
            i5++;
            str3 = "";
        }
        return str2;
    }

    public static String b(int i4, String str) {
        new String();
        int i5 = 0;
        boolean z4 = true;
        while (i4 > 0) {
            int i6 = i4 % 10;
            if (i6 != 0) {
                str = (f27888a[i6] + f27891d[i5]) + str;
                z4 = false;
            } else if (!z4) {
                str = f27888a[0] + str;
                z4 = true;
            }
            i5++;
            i4 /= 10;
        }
        return str;
    }
}
