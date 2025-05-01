package com.xinzhu.haunted.android.content;

import android.content.SyncAdapterType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSyncAdapterType.java */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66649b = "q";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66650c = com.xinzhu.haunted.d.a(SyncAdapterType.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Constructor> f66651d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66652e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66653a;

    public q(Object obj) {
        this.f66653a = obj;
    }

    public static boolean a(String str, String str2, boolean z4, boolean z5, boolean z6, boolean z7, String str3, String str4) {
        if (f66651d.get() == null) {
            if (f66652e) {
                return false;
            }
            AtomicReference<Constructor> atomicReference = f66651d;
            Class<?> cls = f66650c;
            Class cls2 = Boolean.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.d(cls, "HtSyncAdapterType", String.class, String.class, cls2, cls2, cls2, cls2, String.class, String.class));
            f66652e = true;
            return f66651d.get() != null;
        }
        return true;
    }

    public static q b(String str, String str2, boolean z4, boolean z5, boolean z6, boolean z7, String str3, String str4) {
        if (a(str, str2, z4, z5, z6, z7, str3, str4)) {
            try {
                q qVar = new q();
                qVar.f66653a = f66651d.get().newInstance(str, str2, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), str3, str4);
                return qVar;
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

    private q() {
    }
}
