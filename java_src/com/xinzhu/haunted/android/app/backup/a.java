package com.xinzhu.haunted.android.app.backup;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIBackupManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65765a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65766b = d.b("android.app.backup.IBackupManager");

    /* compiled from: HtIBackupManager.java */
    /* renamed from: com.xinzhu.haunted.android.app.backup.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0690a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65767a = d.b("android.app.backup.IBackupManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f65768b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f65769c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f65768b.get().invoke(null, iBinder);
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
            if (f65768b.get() == null) {
                if (f65769c) {
                    return false;
                }
                f65768b.compareAndSet(null, d.g(f65767a, "asInterface", IBinder.class));
                f65769c = true;
                return f65768b.get() != null;
            }
            return true;
        }
    }
}
