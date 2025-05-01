package com.xinzhu.haunted.android.media;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAudioService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66752a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66753b = com.xinzhu.haunted.d.b("android.media.IAudioService");

    /* compiled from: HtIAudioService.java */
    /* renamed from: com.xinzhu.haunted.android.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0698a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66754a = com.xinzhu.haunted.d.b("android.media.IAudioService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66755b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66756c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66755b.get().invoke(null, iBinder);
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
            if (f66755b.get() == null) {
                if (f66756c) {
                    return false;
                }
                f66755b.compareAndSet(null, com.xinzhu.haunted.d.g(f66754a, "asInterface", IBinder.class));
                f66756c = true;
                return f66755b.get() != null;
            }
            return true;
        }
    }
}
