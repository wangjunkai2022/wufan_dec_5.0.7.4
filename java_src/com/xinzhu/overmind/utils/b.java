package com.xinzhu.overmind.utils;

import android.content.res.Resources;
/* compiled from: AccessInternalR.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static String f68301a = "b";

    public static int a(String str) {
        int i4;
        if (str.startsWith("R.")) {
            i4 = 2;
        } else if (!str.startsWith("com.android.internal.R.")) {
            throw new RuntimeException("AccessInternalR invalid");
        } else {
            i4 = 23;
        }
        String substring = str.substring(i4);
        int lastIndexOf = substring.lastIndexOf(46);
        String substring2 = substring.substring(0, lastIndexOf);
        String substring3 = substring.substring(lastIndexOf + 1);
        String str2 = f68301a;
        n.e(str2, "AccessInternalR " + substring2 + " " + substring3);
        return Resources.getSystem().getIdentifier(substring3, substring2, q.a.f73126a);
    }

    public static int[] b(String str) {
        int i4;
        if (str.startsWith("R.")) {
            i4 = 2;
        } else if (!str.startsWith("com.android.internal.R.")) {
            throw new RuntimeException("AccessInternalR invalid");
        } else {
            i4 = 23;
        }
        String substring = str.substring(i4);
        int lastIndexOf = substring.lastIndexOf(46);
        String substring2 = substring.substring(0, lastIndexOf);
        String substring3 = substring.substring(lastIndexOf + 1);
        String str2 = f68301a;
        n.e(str2, "AccessInternalR " + substring2 + " " + substring3);
        Resources system = Resources.getSystem();
        return system.getIntArray(system.getIdentifier(substring3, substring2, q.a.f73126a));
    }
}
