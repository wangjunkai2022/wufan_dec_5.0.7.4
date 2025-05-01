package com.mob.tools.b;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f56650a = new c();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f56651b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f56652c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a f56653d;

    /* renamed from: e  reason: collision with root package name */
    private volatile a f56654e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f56655f = new AtomicBoolean(false);

    public static c a(Context context) {
        if (f56650a.f56651b == null && context != null) {
            f56650a.f56651b = context.getApplicationContext();
        }
        return f56650a;
    }

    public void b() {
        if (this.f56655f.compareAndSet(false, true)) {
            d();
            c();
            e.a(this.f56651b);
        }
    }

    public a c() {
        if (this.f56652c == null) {
            this.f56652c = new i(this.f56651b);
        }
        return this.f56652c;
    }

    public a d() {
        if (this.f56653d == null) {
            this.f56653d = new g(this.f56651b);
        }
        return this.f56653d;
    }

    public a e() {
        if (this.f56654e == null) {
            return c();
        }
        return this.f56654e;
    }

    public CountDownLatch a() {
        b();
        return d.a(this.f56651b).a();
    }

    public boolean a(a aVar) {
        this.f56654e = aVar;
        return true;
    }
}
