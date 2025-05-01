package com.xinzhu.haunted.android.os;

import android.os.FileUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtFileUtils.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66825a = "d";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66826b = com.xinzhu.haunted.d.a(FileUtils.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66827c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66828d = false;

    public static boolean a(File file, int i4, long j4) {
        if (f66827c.get() == null) {
            if (f66828d) {
                return false;
            }
            f66827c.compareAndSet(null, com.xinzhu.haunted.d.g(f66826b, "deleteOlderFiles", File.class, Integer.TYPE, Long.TYPE));
            f66828d = true;
            return f66827c.get() != null;
        }
        return true;
    }

    public static boolean b(File file, int i4, long j4) {
        if (a(file, i4, j4)) {
            try {
                return ((Boolean) f66827c.get().invoke(null, file, Integer.valueOf(i4), Long.valueOf(j4))).booleanValue();
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
}
