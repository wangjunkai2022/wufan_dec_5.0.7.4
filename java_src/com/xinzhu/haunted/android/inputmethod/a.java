package com.xinzhu.haunted.android.inputmethod;

import android.os.IInterface;
import android.view.inputmethod.InputMethodManager;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtInputMethodManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66725b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66726c = d.a(InputMethodManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66727d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66728e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66729a;

    public a(Object obj) {
        this.f66729a = obj;
    }

    public boolean a() {
        if (f66727d.get() == null) {
            if (f66728e) {
                return false;
            }
            f66727d.compareAndSet(null, d.f(f66726c, "mService"));
            f66728e = true;
            return f66727d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f66727d.get().get(this.f66729a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(IInterface iInterface) {
        if (a()) {
            try {
                f66727d.get().set(this.f66729a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private a() {
    }
}
