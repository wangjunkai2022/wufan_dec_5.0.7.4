package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f55592a = "re_po_rt";

    /* renamed from: e  reason: collision with root package name */
    private static h f55593e;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f55594b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f55595c;

    /* renamed from: d  reason: collision with root package name */
    private Context f55596d;

    public h(Context context, String str) {
        try {
            this.f55596d = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 4);
            this.f55594b = sharedPreferences;
            this.f55595c = sharedPreferences.edit();
        } catch (Throwable unused) {
        }
    }

    public static synchronized h a(Context context, String str) {
        h hVar;
        synchronized (h.class) {
            if (f55593e == null) {
                synchronized (h.class) {
                    if (f55593e == null) {
                        f55593e = new h(context, str);
                    }
                }
            }
            hVar = f55593e;
        }
        return hVar;
    }

    public Context b() {
        return this.f55596d;
    }

    public void c(String str, String str2) {
        try {
            this.f55595c.putString(str, str2);
            this.f55595c.apply();
        } catch (Exception unused) {
        }
    }

    public void d(String str, int i4) {
        this.f55595c.putInt(str, i4);
        this.f55595c.apply();
    }

    public boolean e(String str) {
        return this.f55594b.getBoolean(str, false);
    }

    public int b(String str) {
        try {
            return this.f55594b.getInt(str, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int b(String str, int i4) {
        try {
            return this.f55594b.getInt(str, i4);
        } catch (Exception unused) {
            return i4;
        }
    }

    public void c(String str, String str2, boolean z4) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (z4) {
                str2 = c.b(str2.getBytes(), 2);
            }
            this.f55595c.putString(str, str2);
            this.f55595c.apply();
        } catch (Throwable unused) {
        }
    }

    public long d(String str) {
        return this.f55594b.getLong(str, 0L);
    }

    public String b(String str, String str2) {
        return this.f55594b.getString(str, str2);
    }

    public h(Context context) {
        try {
            this.f55596d = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("re_po_rt", 4);
            this.f55594b = sharedPreferences;
            this.f55595c = sharedPreferences.edit();
        } catch (Throwable unused) {
        }
    }

    public String b(String str, String str2, boolean z4) {
        String b5 = b(str, "");
        return !TextUtils.isEmpty(b5) ? z4 ? c.b(b5, 2) : b5 : str2;
    }

    public static h a() {
        return f55593e;
    }

    public int c(String str, int i4) {
        try {
            return this.f55594b.getInt(str, i4);
        } catch (Exception unused) {
            return i4;
        }
    }

    public void a(Context context) {
        this.f55596d = context;
    }

    public void b(String str, long j4) {
        this.f55595c.putLong(str, j4);
        this.f55595c.apply();
    }

    public int c(String str) {
        try {
            return this.f55594b.getInt(str, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f55595c.putString(str, str2);
            this.f55595c.apply();
        } catch (Throwable unused) {
        }
    }

    public void c() {
        try {
            this.f55595c.apply();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2, boolean z4) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f55595c.putString(str, str2);
            if (z4) {
                this.f55595c.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        return this.f55594b.getString(str, "");
    }

    public void a(String str, int i4) {
        try {
            this.f55595c.putInt(str, i4);
            this.f55595c.apply();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, int i4, boolean z4) {
        try {
            this.f55595c.putInt(str, i4);
            if (z4) {
                this.f55595c.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public long a(String str, long j4) {
        return this.f55594b.getLong(str, j4);
    }

    public void a(String str, Boolean bool) {
        this.f55595c.putBoolean(str, bool.booleanValue());
        this.f55595c.apply();
    }
}
