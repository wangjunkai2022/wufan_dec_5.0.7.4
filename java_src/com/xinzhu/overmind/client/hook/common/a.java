package com.xinzhu.overmind.client.hook.common;

import com.xinzhu.overmind.utils.helpers.g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: CallingPackageStub.java */
/* loaded from: classes6.dex */
public class a implements InvocationHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67571c = "CallingPackageStub";

    /* renamed from: b  reason: collision with root package name */
    private Object f67572b;

    public a(Object obj) {
        this.f67572b = obj;
    }

    public static Object a(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), g.a(obj.getClass()), new a(obj));
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.d(objArr);
        return method.invoke(this.f67572b, objArr);
    }
}
