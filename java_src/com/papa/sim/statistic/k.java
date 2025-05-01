package com.papa.sim.statistic;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.PackageUtil;
/* compiled from: MetaUtils.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    static String f58839a;

    /* renamed from: b  reason: collision with root package name */
    static String f58840b;

    public static String a(Context context) {
        String str = f58840b;
        if (str == null || str.equals("")) {
            try {
                String a5 = com.constant.a.a(context);
                if ("".equals(a5) || "0".equals(a5) || "-1".equals(a5)) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
                    String string = sharedPreferences.getString("QdAdIdData" + PackageUtil.getAppVersionName(context), "");
                    f58840b = string;
                    if (!TextUtils.isEmpty(string)) {
                        return f58840b;
                    }
                }
                return a5;
            } catch (Exception e5) {
                e5.printStackTrace();
                return "-1";
            }
        }
        return f58840b;
    }

    public static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return applicationInfo.metaData.getInt("MGSIM_APPKEY") + "";
        } catch (Exception unused) {
            return "3";
        }
    }

    public static String c(Context context) {
        String str = f58839a;
        if (str == null || str.equals("")) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                f58839a = applicationInfo.metaData.getInt("count_type") + "";
            } catch (Exception unused) {
            }
            return f58839a;
        }
        return f58839a;
    }
}
