package com.mob.tools.a;

import android.content.Context;
import android.os.Build;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.CSCenter;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f56641a;

    /* renamed from: b  reason: collision with root package name */
    private a f56642b;

    private d(Context context) {
        try {
            boolean a5 = a();
            boolean b5 = b();
            boolean c5 = c();
            boolean isDREnable = CSCenter.getInstance().isDREnable();
            int i4 = com.mob.tools.b.c.a(context).d().ak().targetSdkVersion;
            int i5 = Build.VERSION.SDK_INT;
            b("3xu: " + b5 + ", 3xd: " + a5 + ", dre: " + isDREnable + ", obf: " + c5 + ", tar: " + i4 + ", api: " + i5);
            if (i4 >= 30 && i5 >= 30) {
                if (b5 && !c5) {
                    c cVar = new c();
                    if (cVar.a(context)) {
                        b("3xu");
                        this.f56642b = cVar;
                    }
                }
                if (this.f56642b == null && isDREnable && a5) {
                    b bVar = new b();
                    if (bVar.a(context)) {
                        b("3xd");
                        this.f56642b = bVar;
                        return;
                    }
                    return;
                }
                return;
            }
            b("2x");
            this.f56642b = new e();
        } catch (Throwable unused) {
        }
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f56641a == null && context != null) {
                f56641a = new d(context);
            }
            dVar = f56641a;
        }
        return dVar;
    }

    private boolean c() {
        return d();
    }

    private boolean d() {
        boolean z4 = true;
        try {
            if (C0811r.b("014bIcjceckcecjeeckgbcjeedkekhb").equals(MobSDK.class.getName())) {
                if (C0811r.b("024bBcjceckcecjeeck*bJcjcececj.d4ehckdcdkdcLedheDci").equals(CSCenter.class.getName())) {
                    z4 = false;
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        b("ck-cn: " + z4);
        return z4;
    }

    public boolean b(Context context) {
        return b.b(context);
    }

    public static void b(String str) {
        NLog mobLog = MobLog.getInstance();
        mobLog.d("[HH] " + str, new Object[0]);
    }

    private boolean b() {
        return ((Integer) com.mob.commons.b.a(C0811r.b("0024cfeh"), 1)).intValue() == 1;
    }

    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr, T t4) throws Throwable {
        a aVar = this.f56642b;
        return aVar != null ? (T) aVar.a(cls, obj, str, clsArr, objArr) : t4;
    }

    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr, T t4) throws Throwable {
        a aVar = this.f56642b;
        return aVar != null ? (T) aVar.a(str, obj, str2, clsArr, objArr) : t4;
    }

    public <T> T a(String str) throws Throwable {
        a aVar = this.f56642b;
        if (aVar != null) {
            return (T) aVar.a(str);
        }
        return null;
    }

    public <T> T a(String str, String str2, Object obj, T t4) throws Throwable {
        a aVar = this.f56642b;
        return aVar != null ? (T) aVar.a(str, str2, obj) : t4;
    }

    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        a aVar = this.f56642b;
        if (aVar != null) {
            return (T) aVar.a(str, clsArr, objArr);
        }
        return null;
    }

    public static void a(Throwable th) {
        MobLog.getInstance().d(th, "[HH] ", new Object[0]);
    }

    private boolean a() {
        return ((Integer) com.mob.commons.b.a(C0811r.b("0024cbde"), 0)).intValue() == 1;
    }
}
