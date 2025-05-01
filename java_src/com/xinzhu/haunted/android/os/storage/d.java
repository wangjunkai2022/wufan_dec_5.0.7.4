package com.xinzhu.haunted.android.os.storage;

import java.io.File;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtStorageVolume.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66966b = "d";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66967c = com.xinzhu.haunted.d.b("android.os.storage.StorageVolume");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66968d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66969e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66970f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66971g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66972a;

    public d(Object obj) {
        this.f66972a = obj;
    }

    public boolean a() {
        if (f66970f.get() == null) {
            if (f66971g) {
                return false;
            }
            f66970f.compareAndSet(null, com.xinzhu.haunted.d.f(f66967c, "mInternalPath"));
            f66971g = true;
            return f66970f.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66968d.get() == null) {
            if (f66969e) {
                return false;
            }
            f66968d.compareAndSet(null, com.xinzhu.haunted.d.f(f66967c, "mPath"));
            f66969e = true;
            return f66968d.get() != null;
        }
        return true;
    }

    public File c() {
        if (a()) {
            try {
                return (File) f66970f.get().get(this.f66972a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public File d() {
        if (b()) {
            try {
                return (File) f66968d.get().get(this.f66972a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(File file) {
        if (a()) {
            try {
                f66970f.get().set(this.f66972a, file);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean f(File file) {
        if (b()) {
            try {
                f66968d.get().set(this.f66972a, file);
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
