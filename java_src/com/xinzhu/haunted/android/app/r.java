package com.xinzhu.haunted.android.app;

import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIServiceConnection.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66064b = "r";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66065c = com.xinzhu.haunted.d.b("android.app.IServiceConnection");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66066d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66067e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66068a;

    public r(Object obj) {
        this.f66068a = obj;
    }

    public boolean a(ComponentName componentName, IBinder iBinder, boolean z4) {
        if (f66066d.get() == null) {
            if (f66067e) {
                return false;
            }
            f66066d.compareAndSet(null, com.xinzhu.haunted.d.g(f66065c, "connected", ComponentName.class, IBinder.class, Boolean.TYPE));
            f66067e = true;
            return f66066d.get() != null;
        }
        return true;
    }

    public void b(ComponentName componentName, IBinder iBinder, boolean z4) {
        if (a(componentName, iBinder, z4)) {
            try {
                f66066d.get().invoke(this.f66068a, componentName, iBinder, Boolean.valueOf(z4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private r() {
    }
}
