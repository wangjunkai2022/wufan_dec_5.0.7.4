package com.xinzhu.haunted.android.accounts;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAccountManager.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65710b = "d";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65711c = com.xinzhu.haunted.d.b("android.accounts.IAccountManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65712d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65713e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65714a;

    /* compiled from: HtIAccountManager.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65715a = com.xinzhu.haunted.d.b("android.accounts.IAccountManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f65716b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f65717c = false;

        public static IInterface a() {
            if (b()) {
                try {
                    return (IInterface) f65716b.get().invoke(null, new Object[0]);
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

        public static boolean b() {
            if (f65716b.get() == null) {
                if (f65717c) {
                    return false;
                }
                f65716b.compareAndSet(null, com.xinzhu.haunted.d.g(f65715a, "asInterface", new Object[0]));
                f65717c = true;
                return f65716b.get() != null;
            }
            return true;
        }
    }

    public d(Object obj) {
        this.f65714a = obj;
    }

    public boolean a() {
        if (f65712d.get() == null) {
            if (f65713e) {
                return false;
            }
            f65712d.compareAndSet(null, com.xinzhu.haunted.d.f(f65711c, "_stub"));
            f65713e = true;
            return f65712d.get() != null;
        }
        return true;
    }

    public Object b() {
        if (a()) {
            try {
                return f65712d.get().get(this.f65714a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(Object obj) {
        if (a()) {
            try {
                f65712d.get().set(this.f65714a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private d() {
    }
}
