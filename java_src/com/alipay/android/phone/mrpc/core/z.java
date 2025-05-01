package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class z implements m {

    /* renamed from: h  reason: collision with root package name */
    private static z f4617h;

    /* renamed from: i  reason: collision with root package name */
    private static final ThreadFactory f4618i = new b0();

    /* renamed from: a  reason: collision with root package name */
    Context f4619a;

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f4620b;

    /* renamed from: c  reason: collision with root package name */
    private p f4621c = p.b(q.a.f73126a);

    /* renamed from: d  reason: collision with root package name */
    private long f4622d;

    /* renamed from: e  reason: collision with root package name */
    private long f4623e;

    /* renamed from: f  reason: collision with root package name */
    private long f4624f;

    /* renamed from: g  reason: collision with root package name */
    private int f4625g;

    private z(Context context) {
        this.f4619a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f4618i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f4620b = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f4619a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final z c(Context context) {
        z zVar = f4617h;
        return zVar != null ? zVar : e(context);
    }

    private static final synchronized z e(Context context) {
        synchronized (z.class) {
            z zVar = f4617h;
            if (zVar != null) {
                return zVar;
            }
            z zVar2 = new z(context);
            f4617h = zVar2;
            return zVar2;
        }
    }

    @Override // com.alipay.android.phone.mrpc.core.m
    public final Future<e> a(d dVar) {
        if (g0.a(this.f4619a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f4620b.getActiveCount());
            objArr[1] = Long.valueOf(this.f4620b.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f4620b.getTaskCount());
            long j4 = this.f4624f;
            objArr[3] = Long.valueOf(j4 == 0 ? 0L : ((this.f4622d * 1000) / j4) >> 10);
            int i4 = this.f4625g;
            objArr[4] = Long.valueOf(i4 != 0 ? this.f4623e / i4 : 0L);
            objArr[5] = Long.valueOf(this.f4622d);
            objArr[6] = Long.valueOf(this.f4623e);
            objArr[7] = Long.valueOf(this.f4624f);
            objArr[8] = Integer.valueOf(this.f4625g);
            String.format(str, objArr);
        }
        e0 e0Var = new e0(this, (c0) dVar);
        a0 a0Var = new a0(this, e0Var, e0Var);
        this.f4620b.execute(a0Var);
        return a0Var;
    }

    public final p b() {
        return this.f4621c;
    }

    public final void d(long j4) {
        this.f4622d += j4;
    }

    public final void f(long j4) {
        this.f4623e += j4;
        this.f4625g++;
    }

    public final void g(long j4) {
        this.f4624f += j4;
    }
}
