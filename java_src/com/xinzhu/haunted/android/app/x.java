package com.xinzhu.haunted.android.app;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.IBinder;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtService.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66171b = "x";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66172c = com.xinzhu.haunted.d.a(Service.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66173d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66174e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66175a;

    public x(Object obj) {
        this.f66175a = obj;
    }

    public void a(Context context, Object obj, String str, IBinder iBinder, Application application, Object obj2) {
        if (b(context, obj, str, iBinder, application, obj2)) {
            try {
                f66173d.get().invoke(this.f66175a, context, obj, str, iBinder, application, obj2);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean b(Context context, Object obj, String str, IBinder iBinder, Application application, Object obj2) {
        if (f66173d.get() == null) {
            if (f66174e) {
                return false;
            }
            f66173d.compareAndSet(null, com.xinzhu.haunted.d.g(f66172c, "attach", Context.class, InstrumentationProxy.f64868d, String.class, IBinder.class, Application.class, Object.class));
            f66174e = true;
            return f66173d.get() != null;
        }
        return true;
    }

    private x() {
    }
}
