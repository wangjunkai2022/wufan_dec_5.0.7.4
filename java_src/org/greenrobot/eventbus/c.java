package org.greenrobot.eventbus;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: EventBus.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: q  reason: collision with root package name */
    public static String f72303q = "EventBus";

    /* renamed from: r  reason: collision with root package name */
    static volatile c f72304r;

    /* renamed from: s  reason: collision with root package name */
    private static final org.greenrobot.eventbus.d f72305s = new org.greenrobot.eventbus.d();

    /* renamed from: t  reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f72306t = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<l>> f72307a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f72308b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, Object> f72309c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<d> f72310d;

    /* renamed from: e  reason: collision with root package name */
    private final e f72311e;

    /* renamed from: f  reason: collision with root package name */
    private final org.greenrobot.eventbus.b f72312f;

    /* renamed from: g  reason: collision with root package name */
    private final org.greenrobot.eventbus.a f72313g;

    /* renamed from: h  reason: collision with root package name */
    private final k f72314h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f72315i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f72316j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f72317k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f72318l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f72319m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f72320n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f72321o;

    /* renamed from: p  reason: collision with root package name */
    private final int f72322p;

    /* compiled from: EventBus.java */
    /* loaded from: classes7.dex */
    class a extends ThreadLocal<d> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public d initialValue() {
            return new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventBus.java */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72324a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f72324a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72324a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72324a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72324a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: EventBus.java */
    /* renamed from: org.greenrobot.eventbus.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    interface InterfaceC0796c {
        void a(List<i> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventBus.java */
    /* loaded from: classes7.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f72325a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        boolean f72326b;

        /* renamed from: c  reason: collision with root package name */
        boolean f72327c;

        /* renamed from: d  reason: collision with root package name */
        l f72328d;

        /* renamed from: e  reason: collision with root package name */
        Object f72329e;

        /* renamed from: f  reason: collision with root package name */
        boolean f72330f;

        d() {
        }
    }

    public c() {
        this(f72305s);
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static org.greenrobot.eventbus.d b() {
        return new org.greenrobot.eventbus.d();
    }

    private void d(l lVar, Object obj) {
        if (obj != null) {
            s(lVar, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    public static void e() {
        k.a();
        f72306t.clear();
    }

    public static c f() {
        if (f72304r == null) {
            synchronized (c.class) {
                if (f72304r == null) {
                    f72304r = new c();
                }
            }
        }
        return f72304r;
    }

    private void i(l lVar, Object obj, Throwable th) {
        if (obj instanceof i) {
            if (this.f72317k) {
                StringBuilder sb = new StringBuilder();
                sb.append("SubscriberExceptionEvent subscriber ");
                sb.append(lVar.f72382a.getClass());
                sb.append(" threw an exception");
                i iVar = (i) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Initial event ");
                sb2.append(iVar.f72357c);
                sb2.append(" caused exception in ");
                sb2.append(iVar.f72358d);
            }
        } else if (!this.f72316j) {
            if (this.f72317k) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(lVar.f72382a.getClass());
            }
            if (this.f72319m) {
                o(new i(this, th, obj, lVar.f72382a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    private static List<Class<?>> n(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f72306t;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                f72306t.put(cls, list);
            }
        }
        return list;
    }

    private void p(Object obj, d dVar) throws Error {
        boolean q4;
        Class<?> cls = obj.getClass();
        if (this.f72321o) {
            List<Class<?>> n4 = n(cls);
            int size = n4.size();
            q4 = false;
            for (int i4 = 0; i4 < size; i4++) {
                q4 |= q(obj, dVar, n4.get(i4));
            }
        } else {
            q4 = q(obj, dVar, cls);
        }
        if (q4) {
            return;
        }
        if (this.f72318l) {
            StringBuilder sb = new StringBuilder();
            sb.append("No subscribers registered for event ");
            sb.append(cls);
        }
        if (!this.f72320n || cls == f.class || cls == i.class) {
            return;
        }
        o(new f(this, obj));
    }

    private boolean q(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f72307a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<l> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            l next = it2.next();
            dVar.f72329e = obj;
            dVar.f72328d = next;
            try {
                s(next, obj, dVar.f72327c);
                if (dVar.f72330f) {
                    return true;
                }
            } finally {
                dVar.f72329e = null;
                dVar.f72328d = null;
                dVar.f72330f = false;
            }
        }
        return true;
    }

    private void s(l lVar, Object obj, boolean z4) {
        int i4 = b.f72324a[lVar.f72383b.f72360b.ordinal()];
        if (i4 == 1) {
            l(lVar, obj);
        } else if (i4 == 2) {
            if (z4) {
                l(lVar, obj);
            } else {
                this.f72311e.a(lVar, obj);
            }
        } else if (i4 == 3) {
            if (z4) {
                this.f72312f.a(lVar, obj);
            } else {
                l(lVar, obj);
            }
        } else if (i4 == 4) {
            this.f72313g.a(lVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + lVar.f72383b.f72360b);
        }
    }

    private void x(Object obj, j jVar) {
        Class<?> cls = jVar.f72361c;
        l lVar = new l(obj, jVar);
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f72307a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f72307a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(lVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i4 = 0; i4 <= size; i4++) {
            if (i4 == size || jVar.f72362d > copyOnWriteArrayList.get(i4).f72383b.f72362d) {
                copyOnWriteArrayList.add(i4, lVar);
                break;
            }
        }
        List<Class<?>> list = this.f72308b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f72308b.put(obj, list);
        }
        list.add(cls);
        if (jVar.f72363e) {
            if (this.f72321o) {
                for (Map.Entry<Class<?>, Object> entry : this.f72309c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        d(lVar, entry.getValue());
                    }
                }
                return;
            }
            d(lVar, this.f72309c.get(cls));
        }
    }

    private void z(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f72307a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                l lVar = copyOnWriteArrayList.get(i4);
                if (lVar.f72382a == obj) {
                    lVar.f72384c = false;
                    copyOnWriteArrayList.remove(i4);
                    i4--;
                    size--;
                }
                i4++;
            }
        }
    }

    public void c(Object obj) {
        d dVar = this.f72310d.get();
        if (!dVar.f72326b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj != null) {
            if (dVar.f72329e == obj) {
                if (dVar.f72328d.f72383b.f72360b == ThreadMode.POSTING) {
                    dVar.f72330f = true;
                    return;
                }
                throw new EventBusException(" event handlers may only abort the incoming event");
            }
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        throw new EventBusException("Event may not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorService g() {
        return this.f72315i;
    }

    public <T> T h(Class<T> cls) {
        T cast;
        synchronized (this.f72309c) {
            cast = cls.cast(this.f72309c.get(cls));
        }
        return cast;
    }

    public boolean j(Class<?> cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        List<Class<?>> n4 = n(cls);
        if (n4 != null) {
            int size = n4.size();
            for (int i4 = 0; i4 < size; i4++) {
                Class<?> cls2 = n4.get(i4);
                synchronized (this) {
                    copyOnWriteArrayList = this.f72307a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(g gVar) {
        Object obj = gVar.f72350a;
        l lVar = gVar.f72351b;
        g.b(gVar);
        if (lVar.f72384c) {
            l(lVar, obj);
        }
    }

    void l(l lVar, Object obj) {
        try {
            lVar.f72383b.f72359a.invoke(lVar.f72382a, obj);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Unexpected exception", e5);
        } catch (InvocationTargetException e6) {
            i(lVar, obj, e6.getCause());
        }
    }

    public synchronized boolean m(Object obj) {
        return this.f72308b.containsKey(obj);
    }

    public void o(Object obj) {
        d dVar = this.f72310d.get();
        List<Object> list = dVar.f72325a;
        list.add(obj);
        if (dVar.f72326b) {
            return;
        }
        dVar.f72327c = Looper.getMainLooper() == Looper.myLooper();
        dVar.f72326b = true;
        if (!dVar.f72330f) {
            while (!list.isEmpty()) {
                try {
                    p(list.remove(0), dVar);
                } finally {
                    dVar.f72326b = false;
                    dVar.f72327c = false;
                }
            }
            return;
        }
        throw new EventBusException("Internal error. Abort state was not reset");
    }

    public void r(Object obj) {
        synchronized (this.f72309c) {
            this.f72309c.put(obj.getClass(), obj);
        }
        o(obj);
    }

    public void t(Object obj) {
        List<j> b5 = this.f72314h.b(obj.getClass());
        synchronized (this) {
            for (j jVar : b5) {
                x(obj, jVar);
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f72322p + ", eventInheritance=" + this.f72321o + "]";
    }

    public void u() {
        synchronized (this.f72309c) {
            this.f72309c.clear();
        }
    }

    public <T> T v(Class<T> cls) {
        T cast;
        synchronized (this.f72309c) {
            cast = cls.cast(this.f72309c.remove(cls));
        }
        return cast;
    }

    public boolean w(Object obj) {
        synchronized (this.f72309c) {
            Class<?> cls = obj.getClass();
            if (obj.equals(this.f72309c.get(cls))) {
                this.f72309c.remove(cls);
                return true;
            }
            return false;
        }
    }

    public synchronized void y(Object obj) {
        List<Class<?>> list = this.f72308b.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                z(obj, cls);
            }
            this.f72308b.remove(obj);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Subscriber to unregister was not registered before: ");
            sb.append(obj.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(org.greenrobot.eventbus.d dVar) {
        this.f72310d = new a();
        this.f72307a = new HashMap();
        this.f72308b = new HashMap();
        this.f72309c = new ConcurrentHashMap();
        this.f72311e = new e(this, Looper.getMainLooper(), 10);
        this.f72312f = new org.greenrobot.eventbus.b(this);
        this.f72313g = new org.greenrobot.eventbus.a(this);
        List<org.greenrobot.eventbus.meta.d> list = dVar.f72342k;
        this.f72322p = list != null ? list.size() : 0;
        this.f72314h = new k(dVar.f72342k, dVar.f72339h, dVar.f72338g);
        this.f72317k = dVar.f72332a;
        this.f72318l = dVar.f72333b;
        this.f72319m = dVar.f72334c;
        this.f72320n = dVar.f72335d;
        this.f72316j = dVar.f72336e;
        this.f72321o = dVar.f72337f;
        this.f72315i = dVar.f72340i;
    }
}
