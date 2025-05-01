package com.beizi.fusion.g;

import android.app.Application;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
/* compiled from: BeiZiEnContext.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Application f6957a;

    static {
        Application application;
        Throwable th;
        try {
            try {
                application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
                if (application == null) {
                    try {
                        throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        try {
                            application = (Application) Class.forName(InstrumentationProxy.f64868d).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            e.printStackTrace();
                        }
                        f6957a = application;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                f6957a = application;
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            application = null;
        } catch (Throwable th3) {
            application = null;
            th = th3;
            f6957a = application;
            throw th;
        }
        f6957a = application;
    }

    public static Application a() {
        return f6957a;
    }
}
