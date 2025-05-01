package com.kuaishou.weapon.p0;

import android.os.Build;
import com.kuaishou.weapon.p0.jni.Engine;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public class ct {

    /* renamed from: a  reason: collision with root package name */
    private static int f55467a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f55468b;

    public ct() {
        b();
    }

    private int a(Method method) {
        try {
            int i4 = f55467a;
            if (i4 <= 1 || method == null) {
                return 0;
            }
            return Engine.mmo(method, i4, method.getModifiers());
        } catch (Exception unused) {
            return 0;
        }
    }

    private void b() {
        if (!Engine.loadSuccess || f55468b) {
            return;
        }
        boolean b5 = cr.b();
        int i4 = Build.VERSION.SDK_INT;
        if (b5 && i4 < 29 && i4 > 22) {
            f55467a = Engine.off();
        }
        f55468b = true;
    }

    private boolean c() {
        return f55468b && f55467a > 1;
    }

    public int a(Class cls, String str, Object... objArr) {
        try {
            if (c()) {
                return a(dh.a(cls, str, objArr));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int a(int i4, Class cls, String str, Object... objArr) {
        Method a5;
        try {
            if (!c() || (a5 = dh.a(cls, str, objArr)) == null) {
                return 0;
            }
            return Engine.mqc(a5, i4);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int a() {
        if (c()) {
            long a5 = cq.f55456b.a();
            long a6 = cq.f55455a.a();
            if (f55467a == a5) {
                return (int) a6;
            }
            return -1;
        }
        return -1;
    }
}
