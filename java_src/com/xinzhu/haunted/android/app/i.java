package com.xinzhu.haunted.android.app;

import android.util.Printer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApplicationErrorReport.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65938a = "i";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65939b = com.xinzhu.haunted.d.b("android.app.ApplicationErrorReport");

    /* compiled from: HtApplicationErrorReport.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65940b = com.xinzhu.haunted.d.b("android.app.ApplicationErrorReport$CrashInfo");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Method> f65941c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65942d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65943a;

        public a(Object obj) {
            this.f65943a = obj;
        }

        public boolean a(Printer printer, String str) {
            if (f65941c.get() == null) {
                if (f65942d) {
                    return false;
                }
                f65941c.compareAndSet(null, com.xinzhu.haunted.d.g(f65940b, "dump", Printer.class, String.class));
                f65942d = true;
                return f65941c.get() != null;
            }
            return true;
        }

        public void b(Printer printer, String str) {
            if (a(printer, str)) {
                try {
                    f65941c.get().invoke(this.f65943a, printer, str);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                }
            }
        }

        private a() {
        }
    }
}
