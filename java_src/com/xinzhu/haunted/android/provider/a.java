package com.xinzhu.haunted.android.provider;

import android.os.IInterface;
import android.provider.Settings;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSettings.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67035a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67036b = com.xinzhu.haunted.d.a(Settings.class);

    /* compiled from: HtSettings.java */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67041a = com.xinzhu.haunted.d.b("android.provider.Settings$Global");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67042b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67043c = false;

        public static boolean a() {
            if (f67042b.get() == null) {
                if (f67043c) {
                    return false;
                }
                f67042b.compareAndSet(null, com.xinzhu.haunted.d.f(f67041a, "sNameValueCache"));
                f67043c = true;
                return f67042b.get() != null;
            }
            return true;
        }

        public static Object b() {
            if (a()) {
                try {
                    return f67042b.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static boolean c(Object obj) {
            if (a()) {
                try {
                    f67042b.get().set(null, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtSettings.java */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67050a = com.xinzhu.haunted.d.b("android.provider.Settings$Secure");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67051b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67052c = false;

        public static boolean a() {
            if (f67051b.get() == null) {
                if (f67052c) {
                    return false;
                }
                f67051b.compareAndSet(null, com.xinzhu.haunted.d.f(f67050a, "sNameValueCache"));
                f67052c = true;
                return f67051b.get() != null;
            }
            return true;
        }

        public static Object b() {
            if (a()) {
                try {
                    return f67051b.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static boolean c(Object obj) {
            if (a()) {
                try {
                    f67051b.get().set(null, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtSettings.java */
    /* loaded from: classes6.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67053a = com.xinzhu.haunted.d.b("android.provider.Settings$System");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67054b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67055c = false;

        public static boolean a() {
            if (f67054b.get() == null) {
                if (f67055c) {
                    return false;
                }
                f67054b.compareAndSet(null, com.xinzhu.haunted.d.f(f67053a, "sNameValueCache"));
                f67055c = true;
                return f67054b.get() != null;
            }
            return true;
        }

        public static Object b() {
            if (a()) {
                try {
                    return f67054b.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static boolean c(Object obj) {
            if (a()) {
                try {
                    f67054b.get().set(null, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtSettings.java */
    /* renamed from: com.xinzhu.haunted.android.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0704a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f67037b = com.xinzhu.haunted.d.b("android.provider.Settings$ContentProviderHolder");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f67038c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f67039d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f67040a;

        public C0704a(Object obj) {
            this.f67040a = obj;
        }

        public boolean a() {
            if (f67038c.get() == null) {
                if (f67039d) {
                    return false;
                }
                f67038c.compareAndSet(null, com.xinzhu.haunted.d.f(f67037b, "mContentProvider"));
                f67039d = true;
                return f67038c.get() != null;
            }
            return true;
        }

        public IInterface b() {
            if (a()) {
                try {
                    return (IInterface) f67038c.get().get(this.f67040a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean c(IInterface iInterface) {
            if (a()) {
                try {
                    f67038c.get().set(this.f67040a, iInterface);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private C0704a() {
        }
    }

    /* compiled from: HtSettings.java */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f67044b = com.xinzhu.haunted.d.b("android.provider.Settings$NameValueCache");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f67045c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f67046d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f67047e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f67048f = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f67049a;

        public c(Object obj) {
            this.f67049a = obj;
        }

        public boolean a() {
            if (f67045c.get() == null) {
                if (f67046d) {
                    return false;
                }
                f67045c.compareAndSet(null, com.xinzhu.haunted.d.f(f67044b, "mContentProvider"));
                f67046d = true;
                return f67045c.get() != null;
            }
            return true;
        }

        public boolean b() {
            if (f67047e.get() == null) {
                if (f67048f) {
                    return false;
                }
                f67047e.compareAndSet(null, com.xinzhu.haunted.d.f(f67044b, "mProviderHolder"));
                f67048f = true;
                return f67047e.get() != null;
            }
            return true;
        }

        public Object c() {
            if (a()) {
                try {
                    return f67045c.get().get(this.f67049a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public Object d() {
            if (b()) {
                try {
                    return f67047e.get().get(this.f67049a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean e(Object obj) {
            if (a()) {
                try {
                    f67045c.get().set(this.f67049a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean f(Object obj) {
            if (b()) {
                try {
                    f67047e.get().set(this.f67049a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private c() {
        }
    }
}
