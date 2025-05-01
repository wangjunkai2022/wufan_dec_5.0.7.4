package com.tencent.stat.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* loaded from: classes6.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f62986a;

    public static int a(Context context, String str, int i4) {
        return a(context).getInt(k.b(context, "" + str), i4);
    }

    public static long a(Context context, String str, long j4) {
        return a(context).getLong(k.b(context, "" + str), j4);
    }

    static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (p.class) {
            if (f62986a == null) {
                f62986a = PreferenceManager.getDefaultSharedPreferences(context);
            }
            sharedPreferences = f62986a;
        }
        return sharedPreferences;
    }

    public static String a(Context context, String str, String str2) {
        return a(context).getString(k.b(context, "" + str), str2);
    }

    public static void b(Context context, String str, int i4) {
        String b5 = k.b(context, "" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putInt(b5, i4);
        edit.commit();
    }

    public static void b(Context context, String str, long j4) {
        String b5 = k.b(context, "" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(b5, j4);
        edit.commit();
    }

    public static void b(Context context, String str, String str2) {
        String b5 = k.b(context, "" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(b5, str2);
        edit.commit();
    }
}
