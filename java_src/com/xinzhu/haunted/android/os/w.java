package com.xinzhu.haunted.android.os;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtUserHandle.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67010b = "w";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67011c = com.xinzhu.haunted.d.a(UserHandle.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f67012d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67013e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Constructor> f67014f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67015g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67016a;

    public w(Object obj) {
        this.f67016a = obj;
    }

    public static boolean a(int i4) {
        if (f67014f.get() == null) {
            if (f67015g) {
                return false;
            }
            f67014f.compareAndSet(null, com.xinzhu.haunted.d.d(f67011c, "HtUserHandle", Integer.TYPE));
            f67015g = true;
            return f67014f.get() != null;
        }
        return true;
    }

    public static w c(int i4) {
        if (a(i4)) {
            try {
                w wVar = new w();
                wVar.f67016a = f67014f.get().newInstance(Integer.valueOf(i4));
                return wVar;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InstantiationException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean b() {
        if (f67012d.get() == null) {
            if (f67013e) {
                return false;
            }
            f67012d.compareAndSet(null, com.xinzhu.haunted.d.g(f67011c, "getIdentifier", new Object[0]));
            f67013e = true;
            return f67012d.get() != null;
        }
        return true;
    }

    public int getIdentifier() {
        if (b()) {
            try {
                return ((Integer) f67012d.get().invoke(this.f67016a, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    private w() {
    }
}
