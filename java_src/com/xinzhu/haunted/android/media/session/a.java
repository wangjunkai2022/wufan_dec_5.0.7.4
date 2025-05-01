package com.xinzhu.haunted.android.media.session;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtISessionManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66764a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66765b = d.b("android.media.session.ISessionManager");

    /* compiled from: HtISessionManager.java */
    /* renamed from: com.xinzhu.haunted.android.media.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0699a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66766a = d.b("android.media.session.ISessionManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66767b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66768c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66767b.get().invoke(null, iBinder);
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

        public static boolean b(IBinder iBinder) {
            if (f66767b.get() == null) {
                if (f66768c) {
                    return false;
                }
                f66767b.compareAndSet(null, d.g(f66766a, "asInterface", IBinder.class));
                f66768c = true;
                return f66767b.get() != null;
            }
            return true;
        }
    }
}
