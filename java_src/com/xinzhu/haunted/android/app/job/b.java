package com.xinzhu.haunted.android.app.job;

import android.app.job.JobInfo;
import android.content.ComponentName;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtJobInfo.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65962b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65963c = com.xinzhu.haunted.d.a(JobInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65964d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65965e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f65966f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65967g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65968a;

    public b(Object obj) {
        this.f65968a = obj;
    }

    public static boolean a() {
        if (f65964d.get() == null) {
            if (f65965e) {
                return false;
            }
            f65964d.compareAndSet(null, com.xinzhu.haunted.d.f(f65963c, "FLAG_EXEMPT_FROM_APP_STANDBY"));
            f65965e = true;
            return f65964d.get() != null;
        }
        return true;
    }

    public static int c() {
        if (a()) {
            try {
                return ((Integer) f65964d.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean e(int i4) {
        if (a()) {
            try {
                f65964d.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean b() {
        if (f65966f.get() == null) {
            if (f65967g) {
                return false;
            }
            f65966f.compareAndSet(null, com.xinzhu.haunted.d.f(f65963c, NotificationCompat.CATEGORY_SERVICE));
            f65967g = true;
            return f65966f.get() != null;
        }
        return true;
    }

    public ComponentName d() {
        if (b()) {
            try {
                return (ComponentName) f65966f.get().get(this.f65968a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean f(ComponentName componentName) {
        if (b()) {
            try {
                f65966f.get().set(this.f65968a, componentName);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* compiled from: HtJobInfo.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65969b = com.xinzhu.haunted.d.b("android.app.job.JobInfo$Builder");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Method> f65970c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65971d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Method> f65972e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f65973f = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65974a;

        public a(Object obj) {
            this.f65974a = obj;
        }

        public boolean a(int i4) {
            if (f65972e.get() == null) {
                if (f65973f) {
                    return false;
                }
                f65972e.compareAndSet(null, com.xinzhu.haunted.d.g(f65969b, "setFlags", Integer.TYPE));
                f65973f = true;
                return f65972e.get() != null;
            }
            return true;
        }

        public boolean b(int i4) {
            if (f65970c.get() == null) {
                if (f65971d) {
                    return false;
                }
                f65970c.compareAndSet(null, com.xinzhu.haunted.d.g(f65969b, "setPriority", Integer.TYPE));
                f65971d = true;
                return f65970c.get() != null;
            }
            return true;
        }

        public JobInfo.Builder c(int i4) {
            if (a(i4)) {
                try {
                    return (JobInfo.Builder) f65972e.get().invoke(this.f65974a, Integer.valueOf(i4));
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public JobInfo.Builder d(int i4) {
            if (b(i4)) {
                try {
                    return (JobInfo.Builder) f65970c.get().invoke(this.f65974a, Integer.valueOf(i4));
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private b() {
    }
}
