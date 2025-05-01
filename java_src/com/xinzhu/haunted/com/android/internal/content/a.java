package com.xinzhu.haunted.com.android.internal.content;

import android.content.Intent;
import com.xinzhu.haunted.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtReferrerIntent.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67288b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67289c = d.b("com.android.internal.content.ReferrerIntent");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Constructor> f67290d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67291e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67292a;

    public a(Object obj) {
        this.f67292a = obj;
    }

    public static boolean a(Intent intent, String str) {
        if (f67290d.get() == null) {
            if (f67291e) {
                return false;
            }
            f67290d.compareAndSet(null, d.d(f67289c, "HtReferrerIntent", Intent.class, String.class));
            f67291e = true;
            return f67290d.get() != null;
        }
        return true;
    }

    public static a b(Intent intent, String str) {
        if (a(intent, str)) {
            try {
                a aVar = new a();
                aVar.f67292a = f67290d.get().newInstance(intent, str);
                return aVar;
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

    private a() {
    }
}
