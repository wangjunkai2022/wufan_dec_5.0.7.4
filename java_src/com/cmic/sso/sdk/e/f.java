package com.cmic.sso.sdk.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PackageUtils.java */
/* loaded from: classes2.dex */
public class f {
    public static String a(Context context) {
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String str2 = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(d(context), 0));
            if (str2 != null) {
                return str2;
            }
            try {
                PackageInfo c5 = c(context);
                if (c5 == null) {
                    return null;
                }
                return context.getResources().getString(c5.applicationInfo.labelRes);
            } catch (Exception e5) {
                e = e5;
                str = str2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static String b(Context context) {
        try {
            PackageInfo c5 = c(context);
            if (c5 != null) {
                return d(context) + m.a.f71490d + c5.versionName;
            }
            return "";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static PackageInfo c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String d(Context context) {
        PackageInfo c5 = c(context);
        return c5 == null ? "" : c5.packageName;
    }
}
