package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public final class i implements InvocationHandler {

    /* renamed from: b  reason: collision with root package name */
    protected u f4577b;

    /* renamed from: c  reason: collision with root package name */
    protected Class<?> f4578c;

    /* renamed from: d  reason: collision with root package name */
    protected j f4579d;

    public i(u uVar, Class<?> cls, j jVar) {
        this.f4577b = uVar;
        this.f4578c = cls;
        this.f4579d = jVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f4579d.a(method, objArr);
    }
}
