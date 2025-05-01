package com.xinzhu.haunted.android.content;

import android.content.IntentFilter;
import android.os.PatternMatcher;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIntentFilter.java */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66324b = "n";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66325c = com.xinzhu.haunted.d.a(IntentFilter.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66326d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66327e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66328f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66329g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66330h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66331i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66332j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66333k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66334l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66335m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f66336n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66337o = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66338a;

    public n(Object obj) {
        this.f66338a = obj;
    }

    public boolean a() {
        if (f66326d.get() == null) {
            if (f66327e) {
                return false;
            }
            f66326d.compareAndSet(null, com.xinzhu.haunted.d.f(f66325c, "mActions"));
            f66327e = true;
            return f66326d.get() != null;
        }
        return true;
    }

    public boolean b(int i4) {
        if (f66334l.get() == null) {
            if (f66335m) {
                return false;
            }
            f66334l.compareAndSet(null, com.xinzhu.haunted.d.g(f66325c, "getDataSchemeSpecificPart", Integer.TYPE));
            f66335m = true;
            return f66334l.get() != null;
        }
        return true;
    }

    public boolean c(IntentFilter.AuthorityEntry authorityEntry) {
        if (f66330h.get() == null) {
            if (f66331i) {
                return false;
            }
            f66330h.compareAndSet(null, com.xinzhu.haunted.d.g(f66325c, "hasDataAuthority", IntentFilter.AuthorityEntry.class));
            f66331i = true;
            return f66330h.get() != null;
        }
        return true;
    }

    public boolean d(PatternMatcher patternMatcher) {
        if (f66332j.get() == null) {
            if (f66333k) {
                return false;
            }
            f66332j.compareAndSet(null, com.xinzhu.haunted.d.g(f66325c, "hasDataPath", PatternMatcher.class));
            f66333k = true;
            return f66332j.get() != null;
        }
        return true;
    }

    public boolean e(PatternMatcher patternMatcher) {
        if (f66336n.get() == null) {
            if (f66337o) {
                return false;
            }
            f66336n.compareAndSet(null, com.xinzhu.haunted.d.g(f66325c, "hasDataSchemeSpecificPart", PatternMatcher.class));
            f66337o = true;
            return f66336n.get() != null;
        }
        return true;
    }

    public boolean f(String str) {
        if (f66328f.get() == null) {
            if (f66329g) {
                return false;
            }
            f66328f.compareAndSet(null, com.xinzhu.haunted.d.g(f66325c, "hasExactDataType", String.class));
            f66329g = true;
            return f66328f.get() != null;
        }
        return true;
    }

    public PatternMatcher g(int i4) {
        if (b(i4)) {
            try {
                return (PatternMatcher) f66334l.get().invoke(this.f66338a, Integer.valueOf(i4));
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

    public Object h() {
        if (a()) {
            try {
                return f66326d.get().get(this.f66338a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean i(IntentFilter.AuthorityEntry authorityEntry) {
        if (c(authorityEntry)) {
            try {
                return ((Boolean) f66330h.get().invoke(this.f66338a, authorityEntry)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean j(PatternMatcher patternMatcher) {
        if (d(patternMatcher)) {
            try {
                return ((Boolean) f66332j.get().invoke(this.f66338a, patternMatcher)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean k(PatternMatcher patternMatcher) {
        if (e(patternMatcher)) {
            try {
                return ((Boolean) f66336n.get().invoke(this.f66338a, patternMatcher)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean l(String str) {
        if (f(str)) {
            try {
                return ((Boolean) f66328f.get().invoke(this.f66338a, str)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean m(Object obj) {
        if (a()) {
            try {
                f66326d.get().set(this.f66338a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private n() {
    }
}
