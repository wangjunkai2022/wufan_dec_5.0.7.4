package com.xinzhu.haunted.android.os;

import android.os.WorkSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtWorkSource.java */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67023b = "y";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67024c = com.xinzhu.haunted.d.a(WorkSource.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Constructor> f67025d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67026e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67027a;

    public y(Object obj) {
        this.f67027a = obj;
    }

    public static boolean a(WorkSource workSource) {
        if (f67025d.get() == null) {
            if (f67026e) {
                return false;
            }
            f67025d.compareAndSet(null, com.xinzhu.haunted.d.d(f67024c, "HtWorkSource", WorkSource.class));
            f67026e = true;
            return f67025d.get() != null;
        }
        return true;
    }

    public static y b(WorkSource workSource) {
        if (a(workSource)) {
            try {
                y yVar = new y();
                yVar.f67027a = f67025d.get().newInstance(workSource);
                return yVar;
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

    private y() {
    }
}
