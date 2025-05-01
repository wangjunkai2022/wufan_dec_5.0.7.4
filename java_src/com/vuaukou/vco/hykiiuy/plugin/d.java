package com.vuaukou.vco.hykiiuy.plugin;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes8.dex */
public final class d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private Object f64876a;

    /* renamed from: b  reason: collision with root package name */
    private String f64877b;

    public d(Object obj, String str) {
        this.f64876a = obj;
        this.f64877b = str;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (a.auu.a.c("KQAANQAQDi8CESwPFQo=").equals(method.getName())) {
            if ((objArr[1] instanceof Integer ? ((Integer) objArr[1]).intValue() : objArr[1] instanceof Long ? ((Long) objArr[1]).intValue() : 0) == 64) {
                Signature signature = new Signature(this.f64877b);
                PackageInfo packageInfo = (PackageInfo) method.invoke(this.f64876a, objArr);
                packageInfo.signatures[0] = signature;
                return packageInfo;
            }
        }
        return method.invoke(this.f64876a, objArr);
    }
}
