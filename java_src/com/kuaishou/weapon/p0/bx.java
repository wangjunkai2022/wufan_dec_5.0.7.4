package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
/* loaded from: classes5.dex */
public class bx {

    /* renamed from: a  reason: collision with root package name */
    private static String f55364a = c.b("Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n", 2);

    /* renamed from: b  reason: collision with root package name */
    private static String f55365b = c.b(f55365b, 2);

    /* renamed from: b  reason: collision with root package name */
    private static String f55365b = c.b(f55365b, 2);

    public static String a(Context context) {
        String str = TextUtils.isEmpty(d(context)) ? "0" : "1";
        String c5 = c(context);
        if (TextUtils.isEmpty(c5)) {
            return "0" + str;
        }
        String str2 = "1" + str;
        b(context, c5);
        return str2;
    }

    public static String b(Context context) {
        String c5 = c(context);
        String d5 = d(context);
        if (TextUtils.isEmpty(c5) || !TextUtils.equals(c5, d5)) {
            if (!TextUtils.isEmpty(c5)) {
                b(context, c5);
                return c5;
            } else if (TextUtils.isEmpty(d5)) {
                return "";
            } else {
                a(context, d5);
                return d5;
            }
        }
        return c5;
    }

    public static String c(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), f55364a);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        try {
            return df.a(context).e();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context.getApplicationContext())) {
                Settings.System.putString(context.getContentResolver(), f55364a, str);
            }
        } catch (Exception unused) {
        }
    }

    public static void b(Context context, String str) {
        df.a(context).d(str);
    }
}
