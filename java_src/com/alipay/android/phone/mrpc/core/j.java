package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Object> f4580d = new ThreadLocal<>();

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f4581e = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private byte f4582a = 0;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f4583b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private h f4584c;

    public j(h hVar) {
        this.f4584c = hVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        com.alipay.mobile.framework.service.annotation.a aVar = (com.alipay.mobile.framework.service.annotation.a) method.getAnnotation(com.alipay.mobile.framework.service.annotation.a.class);
        boolean z4 = method.getAnnotation(com.alipay.mobile.framework.service.annotation.b.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f4580d;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f4581e;
        threadLocal2.set(null);
        if (aVar != null) {
            String a5 = aVar.a();
            int incrementAndGet = this.f4583b.incrementAndGet();
            try {
                if (this.f4582a == 0) {
                    com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(incrementAndGet, a5, objArr);
                    if (threadLocal2.get() != null) {
                        eVar.a(threadLocal2.get());
                    }
                    byte[] a6 = eVar.a();
                    threadLocal2.set(null);
                    Object a7 = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, (byte[]) new x(this.f4584c.f4575a, method, incrementAndGet, a5, a6, z4).a()).a();
                    if (genericReturnType != Void.TYPE) {
                        threadLocal.set(a7);
                    }
                }
                return threadLocal.get();
            } catch (c e5) {
                e5.c(a5);
                throw e5;
            }
        }
        throw new IllegalStateException("OperationType must be set.");
    }
}
