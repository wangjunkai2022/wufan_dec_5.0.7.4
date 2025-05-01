package com.xinzhu.haunted.android.content.pm;

import android.content.pm.PackageInstaller;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPackageInstaller.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66483a = "h";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66484b = com.xinzhu.haunted.d.a(PackageInstaller.class);

    /* compiled from: HtPackageInstaller.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f66485b = com.xinzhu.haunted.d.b("android.content.pm.PackageInstaller$SessionParams");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f66486c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f66487d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f66488a;

        public a(Object obj) {
            this.f66488a = obj;
        }

        public boolean a() {
            if (f66486c.get() == null) {
                if (f66487d) {
                    return false;
                }
                f66486c.compareAndSet(null, com.xinzhu.haunted.d.f(f66485b, "installerPackageName"));
                f66487d = true;
                return f66486c.get() != null;
            }
            return true;
        }

        public String b() {
            if (a()) {
                try {
                    return (String) f66486c.get().get(this.f66488a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean c(String str) {
            if (a()) {
                try {
                    f66486c.get().set(this.f66488a, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }
}
