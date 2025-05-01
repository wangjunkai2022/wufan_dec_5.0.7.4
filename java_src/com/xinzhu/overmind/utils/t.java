package com.xinzhu.overmind.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: Reflector.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: f  reason: collision with root package name */
    public static final String f68406f = "Reflector";

    /* renamed from: a  reason: collision with root package name */
    protected Class<?> f68407a;

    /* renamed from: b  reason: collision with root package name */
    protected Object f68408b;

    /* renamed from: c  reason: collision with root package name */
    protected Constructor f68409c;

    /* renamed from: d  reason: collision with root package name */
    protected Field f68410d;

    /* renamed from: e  reason: collision with root package name */
    protected Method f68411e;

    /* compiled from: Reflector.java */
    /* loaded from: classes6.dex */
    public static class a extends t {

        /* renamed from: g  reason: collision with root package name */
        protected Throwable f68412g;

        protected a() {
        }

        private static a A(Class<?> cls, Throwable th) {
            a aVar = new a();
            aVar.f68407a = cls;
            aVar.f68412g = th;
            return aVar;
        }

        public static a B(String str) {
            return D(str, true, a.class.getClassLoader());
        }

        public static a C(String str, boolean z4) {
            return D(str, z4, a.class.getClassLoader());
        }

        public static a D(String str, boolean z4, ClassLoader classLoader) {
            Class cls;
            Class cls2 = null;
            try {
                try {
                    return A(Class.forName(str, z4, classLoader), null);
                } catch (Throwable th) {
                    th = th;
                    cls2 = cls;
                    return A(cls2, th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public static a J(Object obj) {
            if (obj == null) {
                return z(null);
            }
            return z(obj.getClass()).a(obj);
        }

        public static a z(Class<?> cls) {
            return A(cls, cls == null ? new Exception("Type was null!") : null);
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: E */
        public a q(Object obj) {
            if (G()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.q(obj);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: F */
        public a r(Object obj, Object obj2) {
            if (G()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.r(obj, obj2);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }

        protected boolean G() {
            return H() || this.f68412g != null;
        }

        protected boolean H() {
            return this.f68407a == null;
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: I */
        public a s() {
            super.s();
            return this;
        }

        @Override // com.xinzhu.overmind.utils.t
        public <R> R b(Object obj, Object... objArr) {
            if (G()) {
                return null;
            }
            try {
                this.f68412g = null;
                return (R) super.b(obj, objArr);
            } catch (Throwable th) {
                this.f68412g = th;
                return null;
            }
        }

        @Override // com.xinzhu.overmind.utils.t
        public <R> R call(Object... objArr) {
            if (G()) {
                return null;
            }
            try {
                this.f68412g = null;
                return (R) super.call(objArr);
            } catch (Throwable th) {
                this.f68412g = th;
                return null;
            }
        }

        @Override // com.xinzhu.overmind.utils.t
        public <R> R i() {
            if (G()) {
                return null;
            }
            try {
                this.f68412g = null;
                return (R) super.i();
            } catch (Throwable th) {
                this.f68412g = th;
                return null;
            }
        }

        @Override // com.xinzhu.overmind.utils.t
        public <R> R j(Object obj) {
            if (G()) {
                return null;
            }
            try {
                this.f68412g = null;
                return (R) super.j(obj);
            } catch (Throwable th) {
                this.f68412g = th;
                return null;
            }
        }

        @Override // com.xinzhu.overmind.utils.t
        public <R> R l(Object... objArr) {
            if (G()) {
                return null;
            }
            try {
                this.f68412g = null;
                return (R) super.l(objArr);
            } catch (Throwable th) {
                this.f68412g = th;
                return null;
            }
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: u */
        public a a(Object obj) {
            if (H()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.a(obj);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: v */
        public a e(Class<?>... clsArr) {
            if (H()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.e(clsArr);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: w */
        public a f(String str) {
            if (H()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.f(str);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }

        public Throwable x() {
            return this.f68412g;
        }

        @Override // com.xinzhu.overmind.utils.t
        /* renamed from: y */
        public a k(String str, Class<?>... clsArr) {
            if (H()) {
                return this;
            }
            try {
                this.f68412g = null;
                super.k(str, clsArr);
            } catch (Throwable th) {
                this.f68412g = th;
            }
            return this;
        }
    }

    protected t() {
    }

    public static t m(Class<?> cls) {
        t tVar = new t();
        tVar.f68407a = cls;
        return tVar;
    }

    public static t n(String str) throws Exception {
        return p(str, true, t.class.getClassLoader());
    }

    public static t o(String str, boolean z4) throws Exception {
        return p(str, z4, t.class.getClassLoader());
    }

    public static t p(String str, boolean z4, ClassLoader classLoader) throws Exception {
        try {
            return m(Class.forName(str, z4, classLoader));
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public static t t(Object obj) throws Exception {
        return m(obj.getClass()).a(obj);
    }

    public t a(Object obj) throws Exception {
        this.f68408b = d(obj);
        return this;
    }

    public <R> R b(Object obj, Object... objArr) throws Exception {
        c(obj, this.f68411e, "Method");
        try {
            return (R) this.f68411e.invoke(obj, objArr);
        } catch (InvocationTargetException e5) {
            throw new Exception("Oops!", e5.getTargetException());
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    protected void c(Object obj, Member member, String str) throws Exception {
        if (member != null) {
            if (obj == null && !Modifier.isStatic(member.getModifiers())) {
                throw new Exception("Need a caller!");
            }
            d(obj);
            return;
        }
        throw new Exception(str + " was null!");
    }

    public <R> R call(Object... objArr) throws Exception {
        return (R) b(this.f68408b, objArr);
    }

    protected Object d(Object obj) throws Exception {
        if (obj == null || this.f68407a.isInstance(obj)) {
            return obj;
        }
        throw new Exception("Caller [" + obj + "] is not a instance of type [" + this.f68407a + "]!");
    }

    public t e(Class<?>... clsArr) throws Exception {
        try {
            Constructor<?> declaredConstructor = this.f68407a.getDeclaredConstructor(clsArr);
            this.f68409c = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.f68410d = null;
            this.f68411e = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public t f(String str) throws Exception {
        try {
            Field g4 = g(str);
            this.f68410d = g4;
            g4.setAccessible(true);
            this.f68409c = null;
            this.f68411e = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    protected Field g(String str) throws NoSuchFieldException {
        try {
            return this.f68407a.getField(str);
        } catch (NoSuchFieldException e5) {
            for (Class<?> cls = this.f68407a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e5;
        }
    }

    protected Method h(String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return this.f68407a.getMethod(str, clsArr);
        } catch (NoSuchMethodException e5) {
            for (Class<?> cls = this.f68407a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e5;
        }
    }

    public <R> R i() throws Exception {
        return (R) j(this.f68408b);
    }

    public <R> R j(Object obj) throws Exception {
        c(obj, this.f68410d, "Field");
        try {
            return (R) this.f68410d.get(obj);
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public t k(String str, Class<?>... clsArr) throws Exception {
        try {
            Method h4 = h(str, clsArr);
            this.f68411e = h4;
            h4.setAccessible(true);
            this.f68409c = null;
            this.f68410d = null;
            return this;
        } catch (NoSuchMethodException e5) {
            throw new Exception("Oops!", e5);
        }
    }

    public <R> R l(Object... objArr) throws Exception {
        Constructor constructor = this.f68409c;
        if (constructor != null) {
            try {
                return (R) constructor.newInstance(objArr);
            } catch (InvocationTargetException e5) {
                throw new Exception("Oops!", e5.getTargetException());
            } catch (Throwable th) {
                throw new Exception("Oops!", th);
            }
        }
        throw new Exception("Constructor was null!");
    }

    public t q(Object obj) throws Exception {
        return r(this.f68408b, obj);
    }

    public t r(Object obj, Object obj2) throws Exception {
        c(obj, this.f68410d, "Field");
        try {
            this.f68410d.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public t s() {
        this.f68408b = null;
        return this;
    }
}
