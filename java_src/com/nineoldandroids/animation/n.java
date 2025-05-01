package com.nineoldandroids.animation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PropertyValuesHolder.java */
/* loaded from: classes5.dex */
public class n implements Cloneable {

    /* renamed from: l  reason: collision with root package name */
    private static final p f57741l = new h();

    /* renamed from: m  reason: collision with root package name */
    private static final p f57742m = new f();

    /* renamed from: n  reason: collision with root package name */
    private static Class[] f57743n;

    /* renamed from: o  reason: collision with root package name */
    private static Class[] f57744o;

    /* renamed from: p  reason: collision with root package name */
    private static Class[] f57745p;

    /* renamed from: q  reason: collision with root package name */
    private static final HashMap<Class, HashMap<String, Method>> f57746q;

    /* renamed from: r  reason: collision with root package name */
    private static final HashMap<Class, HashMap<String, Method>> f57747r;

    /* renamed from: b  reason: collision with root package name */
    String f57748b;

    /* renamed from: c  reason: collision with root package name */
    protected com.nineoldandroids.util.c f57749c;

    /* renamed from: d  reason: collision with root package name */
    Method f57750d;

    /* renamed from: e  reason: collision with root package name */
    private Method f57751e;

    /* renamed from: f  reason: collision with root package name */
    Class f57752f;

    /* renamed from: g  reason: collision with root package name */
    k f57753g;

    /* renamed from: h  reason: collision with root package name */
    final ReentrantReadWriteLock f57754h;

    /* renamed from: i  reason: collision with root package name */
    final Object[] f57755i;

    /* renamed from: j  reason: collision with root package name */
    private p f57756j;

    /* renamed from: k  reason: collision with root package name */
    private Object f57757k;

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f57743n = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f57744o = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f57745p = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f57746q = new HashMap<>();
        f57747r = new HashMap<>();
    }

    private Method B(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f57754h.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.f57748b) : null;
            if (method == null) {
                method = e(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f57748b, method);
            }
            return method;
        } finally {
            this.f57754h.writeLock().unlock();
        }
    }

    private void D(Object obj, j jVar) {
        com.nineoldandroids.util.c cVar = this.f57749c;
        if (cVar != null) {
            jVar.n(cVar.a(obj));
        }
        try {
            if (this.f57751e == null) {
                y(obj.getClass());
            }
            jVar.n(this.f57751e.invoke(obj, new Object[0]));
        } catch (IllegalAccessException e5) {
            e5.toString();
        } catch (InvocationTargetException e6) {
            e6.toString();
        }
    }

    static String d(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char upperCase = Character.toUpperCase(str2.charAt(0));
        String substring = str2.substring(1);
        return str + upperCase + substring;
    }

    private Method e(Class cls, String str, Class cls2) {
        Class<?>[] clsArr;
        String d5 = d(str, this.f57748b);
        Method method = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(d5, null);
            } catch (NoSuchMethodException e5) {
                try {
                    method = cls.getDeclaredMethod(d5, null);
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't find no-arg method for property ");
                    sb.append(this.f57748b);
                    sb.append(": ");
                    sb.append(e5);
                }
            }
        } else {
            Class<?>[] clsArr2 = new Class[1];
            if (this.f57752f.equals(Float.class)) {
                clsArr = f57743n;
            } else if (this.f57752f.equals(Integer.class)) {
                clsArr = f57744o;
            } else {
                clsArr = this.f57752f.equals(Double.class) ? f57745p : new Class[]{this.f57752f};
            }
            for (Class<?> cls3 : clsArr) {
                clsArr2[0] = cls3;
                try {
                    try {
                        Method method2 = cls.getMethod(d5, clsArr2);
                        this.f57752f = cls3;
                        return method2;
                    } catch (NoSuchMethodException unused2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    method = cls.getDeclaredMethod(d5, clsArr2);
                    method.setAccessible(true);
                    this.f57752f = cls3;
                    return method;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Couldn't find setter/getter for property ");
            sb2.append(this.f57748b);
            sb2.append(" with value type ");
            sb2.append(this.f57752f);
        }
        return method;
    }

    public static n h(com.nineoldandroids.util.c<?, Float> cVar, float... fArr) {
        return new b(cVar, fArr);
    }

    public static n i(String str, float... fArr) {
        return new b(str, fArr);
    }

    public static n j(com.nineoldandroids.util.c<?, Integer> cVar, int... iArr) {
        return new c(cVar, iArr);
    }

    public static n k(String str, int... iArr) {
        return new c(str, iArr);
    }

    public static n l(com.nineoldandroids.util.c cVar, j... jVarArr) {
        k e5 = k.e(jVarArr);
        if (e5 instanceof i) {
            return new c(cVar, (i) e5);
        }
        if (e5 instanceof g) {
            return new b(cVar, (g) e5);
        }
        n nVar = new n(cVar);
        nVar.f57753g = e5;
        nVar.f57752f = jVarArr[0].getType();
        return nVar;
    }

    public static n m(String str, j... jVarArr) {
        k e5 = k.e(jVarArr);
        if (e5 instanceof i) {
            return new c(str, (i) e5);
        }
        if (e5 instanceof g) {
            return new b(str, (g) e5);
        }
        n nVar = new n(str);
        nVar.f57753g = e5;
        nVar.f57752f = jVarArr[0].getType();
        return nVar;
    }

    public static <V> n n(com.nineoldandroids.util.c cVar, p<V> pVar, V... vArr) {
        n nVar = new n(cVar);
        nVar.u(vArr);
        nVar.q(pVar);
        return nVar;
    }

    public static n o(String str, p pVar, Object... objArr) {
        n nVar = new n(str);
        nVar.u(objArr);
        nVar.q(pVar);
        return nVar;
    }

    private void y(Class cls) {
        this.f57751e = B(cls, f57747r, "get", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Object obj) {
        com.nineoldandroids.util.c cVar = this.f57749c;
        if (cVar != null) {
            try {
                cVar.a(obj);
                Iterator<j> it2 = this.f57753g.f57725e.iterator();
                while (it2.hasNext()) {
                    j next = it2.next();
                    if (!next.e()) {
                        next.n(this.f57749c.a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("No such property (");
                sb.append(this.f57749c.b());
                sb.append(") on target object ");
                sb.append(obj);
                sb.append(". Trying reflection instead");
                this.f57749c = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f57750d == null) {
            z(cls);
        }
        Iterator<j> it3 = this.f57753g.f57725e.iterator();
        while (it3.hasNext()) {
            j next2 = it3.next();
            if (!next2.e()) {
                if (this.f57751e == null) {
                    y(cls);
                }
                try {
                    next2.n(this.f57751e.invoke(obj, new Object[0]));
                } catch (IllegalAccessException e5) {
                    e5.toString();
                } catch (InvocationTargetException e6) {
                    e6.toString();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(Object obj) {
        D(obj, this.f57753g.f57725e.get(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f5) {
        this.f57757k = this.f57753g.b(f5);
    }

    @Override // 
    /* renamed from: b */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f57748b = this.f57748b;
            nVar.f57749c = this.f57749c;
            nVar.f57753g = this.f57753g.clone();
            nVar.f57756j = this.f57756j;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object c() {
        return this.f57757k;
    }

    public String f() {
        return this.f57748b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f57756j == null) {
            Class cls = this.f57752f;
            this.f57756j = cls == Integer.class ? f57741l : cls == Float.class ? f57742m : null;
        }
        p pVar = this.f57756j;
        if (pVar != null) {
            this.f57753g.g(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Object obj) {
        com.nineoldandroids.util.c cVar = this.f57749c;
        if (cVar != null) {
            cVar.e(obj, c());
        }
        if (this.f57750d != null) {
            try {
                this.f57755i[0] = c();
                this.f57750d.invoke(obj, this.f57755i);
            } catch (IllegalAccessException e5) {
                e5.toString();
            } catch (InvocationTargetException e6) {
                e6.toString();
            }
        }
    }

    public void q(p pVar) {
        this.f57756j = pVar;
        this.f57753g.g(pVar);
    }

    public void r(float... fArr) {
        this.f57752f = Float.TYPE;
        this.f57753g = k.c(fArr);
    }

    public void s(int... iArr) {
        this.f57752f = Integer.TYPE;
        this.f57753g = k.d(iArr);
    }

    public void t(j... jVarArr) {
        int length = jVarArr.length;
        j[] jVarArr2 = new j[Math.max(length, 2)];
        this.f57752f = jVarArr[0].getType();
        for (int i4 = 0; i4 < length; i4++) {
            jVarArr2[i4] = jVarArr[i4];
        }
        this.f57753g = new k(jVarArr2);
    }

    public String toString() {
        return this.f57748b + ": " + this.f57753g.toString();
    }

    public void u(Object... objArr) {
        this.f57752f = objArr[0].getClass();
        this.f57753g = k.f(objArr);
    }

    public void v(com.nineoldandroids.util.c cVar) {
        this.f57749c = cVar;
    }

    public void w(String str) {
        this.f57748b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(Object obj) {
        ArrayList<j> arrayList = this.f57753g.f57725e;
        D(obj, arrayList.get(arrayList.size() - 1));
    }

    void z(Class cls) {
        this.f57750d = B(cls, f57746q, "set", this.f57752f);
    }

    private n(String str) {
        this.f57750d = null;
        this.f57751e = null;
        this.f57753g = null;
        this.f57754h = new ReentrantReadWriteLock();
        this.f57755i = new Object[1];
        this.f57748b = str;
    }

    /* compiled from: PropertyValuesHolder.java */
    /* loaded from: classes5.dex */
    static class b extends n {

        /* renamed from: s  reason: collision with root package name */
        private com.nineoldandroids.util.a f57758s;

        /* renamed from: t  reason: collision with root package name */
        g f57759t;

        /* renamed from: u  reason: collision with root package name */
        float f57760u;

        public b(String str, g gVar) {
            super(str);
            this.f57752f = Float.TYPE;
            this.f57753g = gVar;
            this.f57759t = gVar;
        }

        @Override // com.nineoldandroids.animation.n
        /* renamed from: E */
        public b clone() {
            b bVar = (b) super.clone();
            bVar.f57759t = (g) bVar.f57753g;
            return bVar;
        }

        @Override // com.nineoldandroids.animation.n
        void a(float f5) {
            this.f57760u = this.f57759t.i(f5);
        }

        @Override // com.nineoldandroids.animation.n
        Object c() {
            return Float.valueOf(this.f57760u);
        }

        @Override // com.nineoldandroids.animation.n
        void p(Object obj) {
            com.nineoldandroids.util.a aVar = this.f57758s;
            if (aVar != null) {
                aVar.g(obj, this.f57760u);
                return;
            }
            com.nineoldandroids.util.c cVar = this.f57749c;
            if (cVar != null) {
                cVar.e(obj, Float.valueOf(this.f57760u));
            } else if (this.f57750d != null) {
                try {
                    this.f57755i[0] = Float.valueOf(this.f57760u);
                    this.f57750d.invoke(obj, this.f57755i);
                } catch (IllegalAccessException e5) {
                    e5.toString();
                } catch (InvocationTargetException e6) {
                    e6.toString();
                }
            }
        }

        @Override // com.nineoldandroids.animation.n
        public void r(float... fArr) {
            super.r(fArr);
            this.f57759t = (g) this.f57753g;
        }

        @Override // com.nineoldandroids.animation.n
        void z(Class cls) {
            if (this.f57749c != null) {
                return;
            }
            super.z(cls);
        }

        public b(com.nineoldandroids.util.c cVar, g gVar) {
            super(cVar);
            this.f57752f = Float.TYPE;
            this.f57753g = gVar;
            this.f57759t = gVar;
            if (cVar instanceof com.nineoldandroids.util.a) {
                this.f57758s = (com.nineoldandroids.util.a) this.f57749c;
            }
        }

        public b(String str, float... fArr) {
            super(str);
            r(fArr);
        }

        public b(com.nineoldandroids.util.c cVar, float... fArr) {
            super(cVar);
            r(fArr);
            if (cVar instanceof com.nineoldandroids.util.a) {
                this.f57758s = (com.nineoldandroids.util.a) this.f57749c;
            }
        }
    }

    /* compiled from: PropertyValuesHolder.java */
    /* loaded from: classes5.dex */
    static class c extends n {

        /* renamed from: s  reason: collision with root package name */
        private com.nineoldandroids.util.b f57761s;

        /* renamed from: t  reason: collision with root package name */
        i f57762t;

        /* renamed from: u  reason: collision with root package name */
        int f57763u;

        public c(String str, i iVar) {
            super(str);
            this.f57752f = Integer.TYPE;
            this.f57753g = iVar;
            this.f57762t = iVar;
        }

        @Override // com.nineoldandroids.animation.n
        /* renamed from: E */
        public c clone() {
            c cVar = (c) super.clone();
            cVar.f57762t = (i) cVar.f57753g;
            return cVar;
        }

        @Override // com.nineoldandroids.animation.n
        void a(float f5) {
            this.f57763u = this.f57762t.i(f5);
        }

        @Override // com.nineoldandroids.animation.n
        Object c() {
            return Integer.valueOf(this.f57763u);
        }

        @Override // com.nineoldandroids.animation.n
        void p(Object obj) {
            com.nineoldandroids.util.b bVar = this.f57761s;
            if (bVar != null) {
                bVar.g(obj, this.f57763u);
                return;
            }
            com.nineoldandroids.util.c cVar = this.f57749c;
            if (cVar != null) {
                cVar.e(obj, Integer.valueOf(this.f57763u));
            } else if (this.f57750d != null) {
                try {
                    this.f57755i[0] = Integer.valueOf(this.f57763u);
                    this.f57750d.invoke(obj, this.f57755i);
                } catch (IllegalAccessException e5) {
                    e5.toString();
                } catch (InvocationTargetException e6) {
                    e6.toString();
                }
            }
        }

        @Override // com.nineoldandroids.animation.n
        public void s(int... iArr) {
            super.s(iArr);
            this.f57762t = (i) this.f57753g;
        }

        @Override // com.nineoldandroids.animation.n
        void z(Class cls) {
            if (this.f57749c != null) {
                return;
            }
            super.z(cls);
        }

        public c(com.nineoldandroids.util.c cVar, i iVar) {
            super(cVar);
            this.f57752f = Integer.TYPE;
            this.f57753g = iVar;
            this.f57762t = iVar;
            if (cVar instanceof com.nineoldandroids.util.b) {
                this.f57761s = (com.nineoldandroids.util.b) this.f57749c;
            }
        }

        public c(String str, int... iArr) {
            super(str);
            s(iArr);
        }

        public c(com.nineoldandroids.util.c cVar, int... iArr) {
            super(cVar);
            s(iArr);
            if (cVar instanceof com.nineoldandroids.util.b) {
                this.f57761s = (com.nineoldandroids.util.b) this.f57749c;
            }
        }
    }

    private n(com.nineoldandroids.util.c cVar) {
        this.f57750d = null;
        this.f57751e = null;
        this.f57753g = null;
        this.f57754h = new ReentrantReadWriteLock();
        this.f57755i = new Object[1];
        this.f57749c = cVar;
        if (cVar != null) {
            this.f57748b = cVar.b();
        }
    }
}
