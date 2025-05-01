package com.mob.commons.b;

import android.content.Context;
import com.mob.commons.b.h;
import com.mob.tools.MobLog;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public class q extends h {
    public q(Context context) {
        super(context);
    }

    private String a(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    @Override // com.mob.commons.b.h
    protected h.b b() {
        Class<?> cls;
        Object obj;
        Method method = null;
        try {
            cls = Class.forName(com.mob.commons.a.l.a("034d7elegemNefZedekelejedemejedemejegHkh1emffedhmekeleeejed)g2ekffeg0kh"));
            try {
                obj = cls.newInstance();
            } catch (Throwable th) {
                th = th;
                MobLog.getInstance().d(th);
                obj = null;
                if (cls != null) {
                    try {
                        method = cls.getMethod(com.mob.commons.a.l.a("007Gfk gj1higeffgm"), Context.class);
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
                h.b bVar = new h.b();
                bVar.f56222a = a(this.f56214a, obj, method);
                return bVar;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = null;
        }
        if (cls != null && obj != null) {
            method = cls.getMethod(com.mob.commons.a.l.a("007Gfk gj1higeffgm"), Context.class);
        }
        h.b bVar2 = new h.b();
        bVar2.f56222a = a(this.f56214a, obj, method);
        return bVar2;
    }
}
