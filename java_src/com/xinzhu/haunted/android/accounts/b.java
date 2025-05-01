package com.xinzhu.haunted.android.accounts;

import android.accounts.AccountAuthenticatorResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAccountAuthenticatorResponse.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65694b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65695c = com.xinzhu.haunted.d.a(AccountAuthenticatorResponse.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Constructor> f65696d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65697e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65698a;

    public b(Object obj) {
        this.f65698a = obj;
    }

    public static boolean a(Object obj) {
        if (f65696d.get() == null) {
            if (f65697e) {
                return false;
            }
            f65696d.compareAndSet(null, com.xinzhu.haunted.d.d(f65695c, "HtAccountAuthenticatorResponse", "android.accounts.IAccountAuthenticatorResponse"));
            f65697e = true;
            return f65696d.get() != null;
        }
        return true;
    }

    public static b b(Object obj) {
        if (a(obj)) {
            try {
                b bVar = new b();
                bVar.f65698a = f65696d.get().newInstance(obj);
                return bVar;
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

    private b() {
    }
}
