package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final int f55637a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static q f55638b = null;

    /* renamed from: g  reason: collision with root package name */
    private static final String f55639g = "1";

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f55640c = false;

    /* renamed from: d  reason: collision with root package name */
    private dp f55641d;

    /* renamed from: e  reason: collision with root package name */
    private Context f55642e;

    /* renamed from: f  reason: collision with root package name */
    private t f55643f;

    private q(Context context) {
        this.f55642e = context;
        this.f55641d = dp.a(context);
        this.f55643f = t.a(context);
    }

    private static void d() {
        try {
            dp a5 = dp.a();
            if (a5 != null) {
                a5.b("W_S_V", "1");
            }
        } catch (Exception unused) {
        }
    }

    public void c() {
        for (s sVar : this.f55643f.a()) {
            r a5 = r.a();
            if ((a5 != null ? a5.d(sVar.f55659c) : null) == null) {
                a(sVar.f55657a, sVar.f55660d, (PackageInfo) null);
            }
        }
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            try {
                if (f55638b == null) {
                    f55638b = new q(context);
                }
                qVar = f55638b;
            } catch (Exception unused) {
                return null;
            }
        }
        return qVar;
    }

    public synchronized void b() {
        try {
            if (this.f55640c) {
                return;
            }
            this.f55640c = true;
            for (s sVar : this.f55643f.a()) {
                String str = null;
                try {
                    str = this.f55642e.getFilesDir().getCanonicalPath();
                } catch (Throwable unused) {
                }
                if (str != null) {
                    sVar.f55669m = str + bi.f55317j + sVar.f55657a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(sVar.f55669m);
                    sb.append("/lib");
                    dn.c(sb.toString());
                    dn.c(sVar.f55669m);
                }
            }
            this.f55643f.b();
            if (!this.f55641d.b(dp.f55565d)) {
                this.f55641d.a(dp.f55565d, Boolean.TRUE, true);
            } else {
                this.f55643f.c();
            }
            n.a().a(new u(this.f55642e, 1, false));
        } catch (Throwable unused2) {
        }
    }

    public void a() {
        d();
        if (WeaponHI.isLoad) {
            b();
        } else {
            WeaponHI.iD();
        }
    }

    public synchronized boolean a(int i4, String str, PackageInfo packageInfo) {
        return a(i4, str, null, false, packageInfo);
    }

    private synchronized boolean a(int i4, String str, String str2, boolean z4, PackageInfo packageInfo) {
        if (z4) {
            if (this.f55643f.c(i4) != 1) {
                return false;
            }
        }
        s a5 = this.f55643f.a(i4);
        if (a5 == null) {
            this.f55643f.b(i4, -1);
            return false;
        } else if (!dn.a(new File(a5.f55661e))) {
            this.f55643f.b(i4, -1);
            return false;
        } else {
            if (packageInfo != null) {
                a5.f55674r = packageInfo;
            }
            r a6 = r.a(this.f55642e.getApplicationContext(), true);
            if (!a6.a(a5, false)) {
                this.f55643f.b(i4, -1);
                a6.a(a5.f55661e);
                return false;
            }
            s c5 = a6.c(a5.f55661e);
            c5.f55658b = 1;
            c5.f55672p = 1;
            this.f55643f.a(c5);
            return true;
        }
    }

    public void b(String str) {
        r a5;
        try {
            if (TextUtils.isEmpty(str) || (a5 = r.a()) == null) {
                return;
            }
            a5.b(str);
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2) {
        this.f55643f.a(str);
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
    }

    public void a(final String str) {
        try {
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.q.1
                @Override // java.lang.Runnable
                public void run() {
                    final r a5;
                    try {
                        if (TextUtils.isEmpty(str) || (a5 = r.a(q.this.f55642e.getApplicationContext(), true)) == null) {
                            return;
                        }
                        final s d5 = a5.d(str);
                        if (d5 == null) {
                            s b5 = q.this.f55643f.b(str);
                            if (b5 != null) {
                                q.this.a(str, b5.f55661e);
                                return;
                            }
                            return;
                        }
                        new Timer().schedule(new TimerTask() { // from class: com.kuaishou.weapon.p0.q.1.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                a5.b(str);
                                q.this.f55643f.a(str);
                                File file = new File(d5.f55661e);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }, TTAdConstant.AD_MAX_EVENT_TIME);
                        a5.b(str);
                        q.this.f55643f.a(str);
                        File file = new File(d5.f55661e);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public boolean a(s sVar, String str, String str2) {
        r a5;
        if (sVar == null) {
            return false;
        }
        File file = new File(sVar.f55661e);
        if (dn.a(file)) {
            try {
                if (!this.f55643f.b(sVar.f55657a)) {
                    this.f55643f.a(sVar);
                }
                a5 = r.a(this.f55642e.getApplicationContext(), true);
                this.f55643f.a(sVar.f55657a, 1);
                b(sVar.f55659c);
            } catch (Throwable unused) {
            }
            if (!a5.a(sVar, true)) {
                file.delete();
                a(sVar.f55657a, sVar.f55660d, null, true, null);
                this.f55643f.a(sVar.f55657a, 0);
                return false;
            }
            sVar = a5.c(sVar.f55661e);
            if (sVar == null) {
                this.f55643f.a(sVar.f55657a, 0);
                return false;
            }
            try {
                s a6 = this.f55643f.a(sVar.f55657a);
                File file2 = null;
                if (a6 != null && !a6.f55660d.equals(sVar.f55660d)) {
                    file2 = new File(a6.f55661e);
                }
                sVar.f55658b = 1;
                sVar.f55672p = 1;
                if (this.f55643f.a(sVar) > 0 && file2 != null && file2.exists()) {
                    file2.delete();
                }
                this.f55643f.a(sVar.f55657a, 0);
                return true;
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }
}
