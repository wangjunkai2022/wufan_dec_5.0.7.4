package com.bytedance.pangle.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.MethodUtils;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Class f8289a;

    /* renamed from: b  reason: collision with root package name */
    private static Object f8290b;

    public static final Object a() {
        if (f8290b == null) {
            try {
                synchronized (a.class) {
                    if (f8290b == null) {
                        if (f8289a == null) {
                            f8289a = Class.forName(InstrumentationProxy.f64868d);
                        }
                        f8290b = MethodUtils.invokeStaticMethod(f8289a, InstrumentationProxy.f64869e, new Object[0]);
                    }
                    if (f8290b == null && Looper.myLooper() != Looper.getMainLooper()) {
                        final Object obj = new Object();
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.pangle.d.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    try {
                                        Object unused = a.f8290b = MethodUtils.invokeStaticMethod(a.f8289a, InstrumentationProxy.f64869e, new Object[0]);
                                        synchronized (obj) {
                                            obj.notify();
                                        }
                                    } catch (Exception e5) {
                                        ZeusLogger.errReport(ZeusLogger.TAG, "ActivityThreadHelper main looper invoke currentActivityThread failed.", e5);
                                        synchronized (obj) {
                                            obj.notify();
                                        }
                                    }
                                } catch (Throwable th) {
                                    synchronized (obj) {
                                        obj.notify();
                                        throw th;
                                    }
                                }
                            }
                        });
                        if (f8290b == null) {
                            synchronized (obj) {
                                try {
                                    obj.wait(5000L);
                                } catch (InterruptedException e5) {
                                    ZeusLogger.errReport(ZeusLogger.TAG, "ActivityThreadHelper currentActivityThread interruptedException failed.", e5);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e6) {
                ZeusLogger.errReport(ZeusLogger.TAG, "ActivityThreadHelper currentActivityThread failed.", e6);
            }
        }
        return f8290b;
    }
}
