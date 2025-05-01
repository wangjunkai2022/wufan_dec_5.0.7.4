package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Calendar;
import java.util.Date;
/* compiled from: SLModeUtil.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f64589b = "lastReqTime";

    /* renamed from: c  reason: collision with root package name */
    private static final int f64590c = 48;

    /* renamed from: d  reason: collision with root package name */
    private static final int f64591d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static final int f64592e = 720;

    /* renamed from: f  reason: collision with root package name */
    private static final String f64593f = "iss";

    /* renamed from: g  reason: collision with root package name */
    private static final String f64594g = "sinr";

    /* renamed from: h  reason: collision with root package name */
    private static final String f64595h = "clean";

    /* renamed from: i  reason: collision with root package name */
    private static boolean f64596i;

    /* renamed from: j  reason: collision with root package name */
    private static int f64597j;

    /* renamed from: a  reason: collision with root package name */
    private static final String f64588a = aw.b().b(aw.f63395z);

    /* renamed from: k  reason: collision with root package name */
    private static Object f64598k = new Object();

    static {
        f64596i = false;
        f64597j = f64592e;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(appContext, f64593f, "");
            if (TextUtils.isEmpty(imprintProperty) || !"1".equals(imprintProperty)) {
                return;
            }
            synchronized (f64598k) {
                f64596i = true;
            }
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(appContext, f64594g, "");
            if (!TextUtils.isEmpty(imprintProperty)) {
                try {
                    f64597j = a(Integer.parseInt(imprintProperty2));
                    return;
                } catch (Throwable unused) {
                    f64597j = 48;
                    return;
                }
            }
            f64597j = 48;
        }
    }

    private static int a(int i4) {
        if (i4 > f64592e) {
            return f64592e;
        }
        if (i4 < 1) {
            return 1;
        }
        return i4;
    }

    public static boolean a() {
        boolean z4;
        synchronized (f64598k) {
            z4 = f64596i;
        }
        return z4;
    }

    public static long b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64588a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(f64589b, 0L);
        }
        return 0L;
    }

    public static void c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64588a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f64595h, true).commit();
        }
    }

    public static void d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64588a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f64595h, false).commit();
        }
    }

    public static boolean e(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64588a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(f64595h, false);
        }
        return false;
    }

    public static int a(Context context) {
        int i4;
        synchronized (f64598k) {
            i4 = f64597j;
        }
        return i4;
    }

    public static boolean a(long j4, long j5, int i4) {
        Date date = new Date(j5);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j4));
        calendar.add(10, i4);
        return date.after(calendar.getTime());
    }

    public static void a(Context context, long j4) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64588a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(f64589b, j4).commit();
        }
    }
}
