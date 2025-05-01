package org.greenrobot.eventbus.util;

import android.app.Activity;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: AsyncExecutor.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f72413a;

    /* renamed from: b  reason: collision with root package name */
    private final Constructor<?> f72414b;

    /* renamed from: c  reason: collision with root package name */
    private final org.greenrobot.eventbus.c f72415c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f72416d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncExecutor.java */
    /* renamed from: org.greenrobot.eventbus.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class RunnableC0797a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f72417b;

        RunnableC0797a(c cVar) {
            this.f72417b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f72417b.run();
            } catch (Exception e5) {
                try {
                    Object newInstance = a.this.f72414b.newInstance(e5);
                    if (newInstance instanceof e) {
                        ((e) newInstance).b(a.this.f72416d);
                    }
                    a.this.f72415c.o(newInstance);
                } catch (Exception e6) {
                    String str = org.greenrobot.eventbus.c.f72303q;
                    throw new RuntimeException("Could not create failure event", e6);
                }
            }
        }
    }

    /* compiled from: AsyncExecutor.java */
    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Executor f72419a;

        /* renamed from: b  reason: collision with root package name */
        private Class<?> f72420b;

        /* renamed from: c  reason: collision with root package name */
        private org.greenrobot.eventbus.c f72421c;

        /* synthetic */ b(RunnableC0797a runnableC0797a) {
            this();
        }

        public a a() {
            return c(null);
        }

        public a b(Activity activity) {
            return c(activity.getClass());
        }

        public a c(Object obj) {
            if (this.f72421c == null) {
                this.f72421c = org.greenrobot.eventbus.c.f();
            }
            if (this.f72419a == null) {
                this.f72419a = Executors.newCachedThreadPool();
            }
            if (this.f72420b == null) {
                this.f72420b = f.class;
            }
            return new a(this.f72419a, this.f72421c, this.f72420b, obj, null);
        }

        public b d(org.greenrobot.eventbus.c cVar) {
            this.f72421c = cVar;
            return this;
        }

        public b e(Class<?> cls) {
            this.f72420b = cls;
            return this;
        }

        public b f(Executor executor) {
            this.f72419a = executor;
            return this;
        }

        private b() {
        }
    }

    /* compiled from: AsyncExecutor.java */
    /* loaded from: classes7.dex */
    public interface c {
        void run() throws Exception;
    }

    /* synthetic */ a(Executor executor, org.greenrobot.eventbus.c cVar, Class cls, Object obj, RunnableC0797a runnableC0797a) {
        this(executor, cVar, cls, obj);
    }

    public static b d() {
        return new b(null);
    }

    public static a e() {
        return new b(null).a();
    }

    public void f(c cVar) {
        this.f72413a.execute(new RunnableC0797a(cVar));
    }

    private a(Executor executor, org.greenrobot.eventbus.c cVar, Class<?> cls, Object obj) {
        this.f72413a = executor;
        this.f72415c = cVar;
        this.f72416d = obj;
        try {
            this.f72414b = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e5);
        }
    }
}
