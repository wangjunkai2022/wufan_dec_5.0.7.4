package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: BaseProducerContext.java */
/* loaded from: classes.dex */
public class d implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final ImageRequest f12168a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12169b;

    /* renamed from: c  reason: collision with root package name */
    private final m0 f12170c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12171d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageRequest.RequestLevel f12172e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private boolean f12173f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    private Priority f12174g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    private boolean f12175h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    private boolean f12176i = false;
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    private final List<l0> f12177j = new ArrayList();

    public d(ImageRequest imageRequest, String str, m0 m0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z4, boolean z5, Priority priority) {
        this.f12168a = imageRequest;
        this.f12169b = str;
        this.f12170c = m0Var;
        this.f12171d = obj;
        this.f12172e = requestLevel;
        this.f12173f = z4;
        this.f12174g = priority;
        this.f12175h = z5;
    }

    public static void g(@Nullable List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.b();
        }
    }

    public static void h(@Nullable List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.a();
        }
    }

    public static void i(@Nullable List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.d();
        }
    }

    public static void j(@Nullable List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public ImageRequest a() {
        return this.f12168a;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public Object b() {
        return this.f12171d;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public void c(l0 l0Var) {
        boolean z4;
        synchronized (this) {
            this.f12177j.add(l0Var);
            z4 = this.f12176i;
        }
        if (z4) {
            l0Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public synchronized boolean d() {
        return this.f12175h;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public synchronized boolean e() {
        return this.f12173f;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public ImageRequest.RequestLevel f() {
        return this.f12172e;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public String getId() {
        return this.f12169b;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public m0 getListener() {
        return this.f12170c;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public synchronized Priority getPriority() {
        return this.f12174g;
    }

    public void k() {
        g(l());
    }

    @Nullable
    public synchronized List<l0> l() {
        if (this.f12176i) {
            return null;
        }
        this.f12176i = true;
        return new ArrayList(this.f12177j);
    }

    public synchronized boolean m() {
        return this.f12176i;
    }

    @Nullable
    public synchronized List<l0> n(boolean z4) {
        if (z4 == this.f12175h) {
            return null;
        }
        this.f12175h = z4;
        return new ArrayList(this.f12177j);
    }

    @Nullable
    public synchronized List<l0> o(boolean z4) {
        if (z4 == this.f12173f) {
            return null;
        }
        this.f12173f = z4;
        return new ArrayList(this.f12177j);
    }

    @Nullable
    public synchronized List<l0> p(Priority priority) {
        if (priority == this.f12174g) {
            return null;
        }
        this.f12174g = priority;
        return new ArrayList(this.f12177j);
    }
}
