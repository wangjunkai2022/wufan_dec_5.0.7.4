package com.beizi.fusion.g;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: BeiZiExecutor.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f6958a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f6959b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6960c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6961d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6962e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f6963f;

    private h() {
        if (f6958a.get()) {
            return;
        }
        a();
    }

    public static void a() {
        AtomicBoolean atomicBoolean = f6958a;
        if (atomicBoolean.get()) {
            return;
        }
        f6960c = l.a();
        f6961d = l.b();
        f6962e = l.c();
        f6963f = l.d();
        atomicBoolean.set(true);
    }

    public static h b() {
        if (f6959b == null) {
            synchronized (h.class) {
                if (f6959b == null) {
                    f6959b = new h();
                }
            }
        }
        return f6959b;
    }

    public ExecutorService c() {
        if (f6960c == null) {
            f6960c = l.a();
        }
        return f6960c;
    }

    public ExecutorService d() {
        if (f6961d == null) {
            f6961d = l.b();
        }
        return f6961d;
    }

    public ExecutorService e() {
        if (f6962e == null) {
            f6962e = l.c();
        }
        return f6962e;
    }

    public ExecutorService f() {
        if (f6963f == null) {
            f6963f = l.d();
        }
        return f6963f;
    }
}
