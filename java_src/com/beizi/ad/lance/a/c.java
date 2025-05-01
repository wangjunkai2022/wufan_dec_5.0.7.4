package com.beizi.ad.lance.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: BeiZiExecutor.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f6440a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f6441b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6442c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6443d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6444e;

    private c() {
        if (f6440a.get()) {
            return;
        }
        a();
    }

    public static void a() {
        AtomicBoolean atomicBoolean = f6440a;
        if (atomicBoolean.get()) {
            return;
        }
        f6442c = e.a();
        f6443d = e.b();
        f6444e = e.c();
        atomicBoolean.set(true);
    }

    public static c b() {
        if (f6441b == null) {
            synchronized (c.class) {
                if (f6441b == null) {
                    f6441b = new c();
                }
            }
        }
        return f6441b;
    }

    public ExecutorService c() {
        if (f6442c == null) {
            f6442c = e.a();
        }
        return f6442c;
    }

    public ExecutorService d() {
        if (f6444e == null) {
            f6444e = e.c();
        }
        return f6444e;
    }
}
