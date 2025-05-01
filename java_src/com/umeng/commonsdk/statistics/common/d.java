package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
/* compiled from: StoreHelper.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f64394a;

    /* renamed from: b  reason: collision with root package name */
    private static Context f64395b;

    /* renamed from: c  reason: collision with root package name */
    private static String f64396c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f64397d = aw.b().b(aw.f63382m);

    public d(Context context) {
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            f64395b = context.getApplicationContext();
            f64396c = context.getPackageName();
            if (f64394a == null) {
                f64394a = new d(context);
            }
            dVar = f64394a;
        }
        return dVar;
    }

    private SharedPreferences f() {
        Context context = f64395b;
        return context.getSharedPreferences(f64397d + f64396c, 0);
    }

    public String b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f64395b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public boolean c() {
        return UMFrUtils.envelopeFileNumber(f64395b) > 0;
    }

    public String[] d() {
        try {
            SharedPreferences f5 = f();
            String string = f5.getString("au_p", null);
            String string2 = f5.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void e() {
        f().edit().remove("au_p").remove("au_u").commit();
    }

    public void a(int i4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f64395b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i4).commit();
        }
    }

    public int a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f64395b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f64395b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = f().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }
}
