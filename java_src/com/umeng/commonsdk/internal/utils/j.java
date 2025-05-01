package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
/* compiled from: UMInternalUtils.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64311a = aw.b().b(aw.f63387r);

    /* renamed from: b  reason: collision with root package name */
    private static final String f64312b = "um_common_strength";

    /* renamed from: c  reason: collision with root package name */
    private static final String f64313c = "um_common_battery";

    public static String a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f64311a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f64313c, null);
    }

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f64311a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f64313c, str).commit();
    }
}
