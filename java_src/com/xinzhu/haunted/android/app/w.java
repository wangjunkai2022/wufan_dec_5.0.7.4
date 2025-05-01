package com.xinzhu.haunted.android.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPendingIntent.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66164b = "w";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66165c = com.xinzhu.haunted.d.b("android.app.PendingIntent");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66166d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66167e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66168f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66169g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66170a;

    public w(Object obj) {
        this.f66170a = obj;
    }

    public static boolean a(Context context, int i4, Intent intent, int i5, Bundle bundle, UserHandle userHandle) {
        if (f66166d.get() == null) {
            if (f66167e) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66166d;
            Class<?> cls = f66165c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "getActivityAsUser", Context.class, cls2, Intent.class, cls2, Bundle.class, UserHandle.class));
            f66167e = true;
            return f66166d.get() != null;
        }
        return true;
    }

    public static PendingIntent c(Context context, int i4, Intent intent, int i5, Bundle bundle, UserHandle userHandle) {
        if (a(context, i4, intent, i5, bundle, userHandle)) {
            try {
                return (PendingIntent) f66166d.get().invoke(null, context, Integer.valueOf(i4), intent, Integer.valueOf(i5), bundle, userHandle);
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

    public boolean b() {
        if (f66168f.get() == null) {
            if (f66169g) {
                return false;
            }
            f66168f.compareAndSet(null, com.xinzhu.haunted.d.g(f66165c, "getIntentSender", new Object[0]));
            f66169g = true;
            return f66168f.get() != null;
        }
        return true;
    }

    public IntentSender d() {
        if (b()) {
            try {
                return (IntentSender) f66168f.get().invoke(this.f66170a, new Object[0]);
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

    private w() {
    }
}
