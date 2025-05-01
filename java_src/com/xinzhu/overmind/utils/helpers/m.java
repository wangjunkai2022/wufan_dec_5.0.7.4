package com.xinzhu.overmind.utils.helpers;

import android.text.TextUtils;
import com.xinzhu.overmind.utils.t;
/* compiled from: SystemPropertiesHelper.java */
/* loaded from: classes.dex */
public class m {
    public static String a(String str) {
        try {
            return (String) t.n("android.os.SystemProperties").k("get", String.class).call(str);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2) {
        try {
            return (String) t.n("android.os.SystemProperties").k("get", String.class, String.class).call(str, str2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return str2;
        }
    }

    public static int c(String str, int i4) {
        try {
            return ((Integer) t.n("android.os.SystemProperties").k("getInt", String.class, Integer.TYPE).call(str, Integer.valueOf(i4))).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return i4;
        }
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(a(str));
    }
}
