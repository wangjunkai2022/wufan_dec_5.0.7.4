package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes5.dex */
public class dp {

    /* renamed from: a  reason: collision with root package name */
    public static final String f55562a = "plc001_t_re";

    /* renamed from: b  reason: collision with root package name */
    public static final String f55563b = "wlpauct2";

    /* renamed from: c  reason: collision with root package name */
    public static final String f55564c = "plc001_pd_ptip_pi";

    /* renamed from: d  reason: collision with root package name */
    public static final String f55565d = "wiipaot";

    /* renamed from: e  reason: collision with root package name */
    public static final int f55566e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final String f55567f = "a1_p_s_p_s";

    /* renamed from: g  reason: collision with root package name */
    public static final String f55568g = "a1_p_s_p_s_c_b";

    /* renamed from: j  reason: collision with root package name */
    private static dp f55569j;

    /* renamed from: h  reason: collision with root package name */
    private SharedPreferences f55570h;

    /* renamed from: i  reason: collision with root package name */
    private SharedPreferences.Editor f55571i;

    private dp(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(bi.f55325r, 4);
            this.f55570h = sharedPreferences;
            this.f55571i = sharedPreferences.edit();
        } catch (Throwable unused) {
        }
    }

    public static synchronized dp a(Context context) {
        dp dpVar;
        synchronized (dp.class) {
            try {
                if (f55569j == null) {
                    f55569j = new dp(context);
                }
                dpVar = f55569j;
            } catch (Exception unused) {
                return null;
            }
        }
        return dpVar;
    }

    public boolean b(String str) {
        return this.f55570h.getBoolean(str, false);
    }

    public void b(String str, String str2) {
        try {
            this.f55571i.putString(str, str2);
            this.f55571i.apply();
        } catch (Exception unused) {
        }
    }

    public static dp a() {
        return f55569j;
    }

    public long a(String str) {
        return this.f55570h.getLong(str, 0L);
    }

    public void a(String str, long j4, boolean z4) {
        try {
            this.f55571i.putLong(str, j4);
            if (z4) {
                this.f55571i.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public int a(String str, int i4) {
        try {
            return this.f55570h.getInt(str, i4);
        } catch (Throwable unused) {
            return i4;
        }
    }

    public void a(String str, int i4, boolean z4) {
        try {
            this.f55571i.putInt(str, i4);
            if (z4) {
                this.f55571i.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Boolean bool, boolean z4) {
        try {
            SharedPreferences.Editor editor = this.f55571i;
            if (editor != null) {
                editor.putBoolean(str, bool.booleanValue());
                if (z4) {
                    this.f55571i.apply();
                }
            }
        } catch (Exception unused) {
        }
    }

    public String a(String str, String str2) {
        return this.f55570h.getString(str, str2);
    }
}
