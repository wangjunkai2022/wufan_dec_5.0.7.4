package com.sdk.d;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadFactory f60020a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<Runnable> f60021b;

    /* renamed from: c  reason: collision with root package name */
    public final ThreadPoolExecutor f60022c;

    public g() {
        i iVar = new i();
        this.f60021b = iVar;
        this.f60022c = new ThreadPoolExecutor(5, 256, 1L, TimeUnit.SECONDS, iVar, f60020a);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f60022c.execute(runnable);
    }
}
