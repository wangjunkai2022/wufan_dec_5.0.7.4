package com.aggmoread.sdk.b;

import android.content.Context;
import com.aggmoread.sdk.client.AMAdConfig;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMAdType;
import com.aggmoread.sdk.client.IAMAdInteractionListener;
import com.aggmoread.sdk.client.IAMAdLoadListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Object f1925a;

    /* renamed from: com.aggmoread.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0051a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public e f1926a;

        C0051a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals(l.f1978a)) {
                this.f1926a.a((AMAdConfig) objArr[1]);
                return null;
            } else if (method.getName().equals(l.f1979b)) {
                this.f1926a.a((Context) objArr[0], (AMAdType) objArr[1], (AMAdLoadSlot) objArr[2], (IAMAdLoadListener) objArr[3]);
                return null;
            } else if (method.getName().equals(l.f1980c)) {
                this.f1926a.a((Context) objArr[0], (AMAdType) objArr[1], (AMAdLoadSlot) objArr[2], (IAMAdLoadListener) objArr[3], (IAMAdInteractionListener) objArr[4]);
                return null;
            } else {
                if (method.getName().equals(l.f1981d)) {
                    this.f1926a.a((Context) objArr[0], (List) objArr[1]);
                }
                return null;
            }
        }
    }

    public static Object a() {
        return f1925a;
    }

    public static Object a(Class[] clsArr, Context context) {
        Object obj = f1925a;
        if (obj != null) {
            return obj;
        }
        C0051a c0051a = new C0051a();
        c0051a.f1926a = new e(context);
        Object newProxyInstance = Proxy.newProxyInstance(C0051a.class.getClassLoader(), clsArr, c0051a);
        f1925a = newProxyInstance;
        return newProxyInstance;
    }
}
