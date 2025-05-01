package org.greenrobot.eventbus;

import com.join.mgps.Util.h0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes7.dex */
class k {

    /* renamed from: d  reason: collision with root package name */
    private static final int f72365d = 64;

    /* renamed from: e  reason: collision with root package name */
    private static final int f72366e = 4096;

    /* renamed from: f  reason: collision with root package name */
    private static final int f72367f = 5192;

    /* renamed from: h  reason: collision with root package name */
    private static final int f72369h = 4;

    /* renamed from: a  reason: collision with root package name */
    private List<org.greenrobot.eventbus.meta.d> f72371a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72372b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72373c;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Class<?>, List<j>> f72368g = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    private static final a[] f72370i = new a[4];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriberMethodFinder.java */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<j> f72374a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f72375b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f72376c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f72377d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f72378e;

        /* renamed from: f  reason: collision with root package name */
        Class<?> f72379f;

        /* renamed from: g  reason: collision with root package name */
        boolean f72380g;

        /* renamed from: h  reason: collision with root package name */
        org.greenrobot.eventbus.meta.c f72381h;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f72377d.setLength(0);
            this.f72377d.append(method.getName());
            StringBuilder sb = this.f72377d;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String sb2 = this.f72377d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f72376c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f72376c.put(sb2, put);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object put = this.f72375b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f72375b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f72379f = cls;
            this.f72378e = cls;
            this.f72380g = false;
            this.f72381h = null;
        }

        void d() {
            if (this.f72380g) {
                this.f72379f = null;
                return;
            }
            Class<? super Object> superclass = this.f72379f.getSuperclass();
            this.f72379f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f72379f = null;
            }
        }

        void e() {
            this.f72374a.clear();
            this.f72375b.clear();
            this.f72376c.clear();
            this.f72377d.setLength(0);
            this.f72378e = null;
            this.f72379f = null;
            this.f72380g = false;
            this.f72381h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(List<org.greenrobot.eventbus.meta.d> list, boolean z4, boolean z5) {
        this.f72371a = list;
        this.f72372b = z4;
        this.f72373c = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        f72368g.clear();
    }

    private List<j> c(Class<?> cls) {
        j[] a5;
        a h4 = h();
        h4.c(cls);
        while (h4.f72379f != null) {
            org.greenrobot.eventbus.meta.c g4 = g(h4);
            h4.f72381h = g4;
            if (g4 != null) {
                for (j jVar : g4.a()) {
                    if (h4.a(jVar.f72359a, jVar.f72361c)) {
                        h4.f72374a.add(jVar);
                    }
                }
            } else {
                e(h4);
            }
            h4.d();
        }
        return f(h4);
    }

    private List<j> d(Class<?> cls) {
        a h4 = h();
        h4.c(cls);
        while (h4.f72379f != null) {
            e(h4);
            h4.d();
        }
        return f(h4);
    }

    private void e(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f72379f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f72379f.getMethods();
            aVar.f72380g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & f72367f) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    if (subscribe != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f72374a.add(new j(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                        }
                    }
                } else if (this.f72372b && method.isAnnotationPresent(Subscribe.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + h0.f27805a + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f72372b && method.isAnnotationPresent(Subscribe.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + h0.f27805a + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List<j> f(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f72374a);
        aVar.e();
        synchronized (f72370i) {
            int i4 = 0;
            while (true) {
                if (i4 >= 4) {
                    break;
                }
                a[] aVarArr = f72370i;
                if (aVarArr[i4] == null) {
                    aVarArr[i4] = aVar;
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.meta.c g(a aVar) {
        org.greenrobot.eventbus.meta.c cVar = aVar.f72381h;
        if (cVar != null && cVar.c() != null) {
            org.greenrobot.eventbus.meta.c c5 = aVar.f72381h.c();
            if (aVar.f72379f == c5.b()) {
                return c5;
            }
        }
        List<org.greenrobot.eventbus.meta.d> list = this.f72371a;
        if (list != null) {
            for (org.greenrobot.eventbus.meta.d dVar : list) {
                org.greenrobot.eventbus.meta.c a5 = dVar.a(aVar.f72379f);
                if (a5 != null) {
                    return a5;
                }
            }
            return null;
        }
        return null;
    }

    private a h() {
        synchronized (f72370i) {
            for (int i4 = 0; i4 < 4; i4++) {
                a[] aVarArr = f72370i;
                a aVar = aVarArr[i4];
                if (aVar != null) {
                    aVarArr[i4] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<j> b(Class<?> cls) {
        List<j> c5;
        Map<Class<?>, List<j>> map = f72368g;
        List<j> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f72373c) {
            c5 = d(cls);
        } else {
            c5 = c(cls);
        }
        if (!c5.isEmpty()) {
            map.put(cls, c5);
            return c5;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
