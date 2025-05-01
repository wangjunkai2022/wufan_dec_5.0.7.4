package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: EventBusBuilder.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: l  reason: collision with root package name */
    private static final ExecutorService f72331l = Executors.newCachedThreadPool();

    /* renamed from: e  reason: collision with root package name */
    boolean f72336e;

    /* renamed from: g  reason: collision with root package name */
    boolean f72338g;

    /* renamed from: h  reason: collision with root package name */
    boolean f72339h;

    /* renamed from: j  reason: collision with root package name */
    List<Class<?>> f72341j;

    /* renamed from: k  reason: collision with root package name */
    List<org.greenrobot.eventbus.meta.d> f72342k;

    /* renamed from: a  reason: collision with root package name */
    boolean f72332a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f72333b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f72334c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f72335d = true;

    /* renamed from: f  reason: collision with root package name */
    boolean f72337f = true;

    /* renamed from: i  reason: collision with root package name */
    ExecutorService f72340i = f72331l;

    public d a(org.greenrobot.eventbus.meta.d dVar) {
        if (this.f72342k == null) {
            this.f72342k = new ArrayList();
        }
        this.f72342k.add(dVar);
        return this;
    }

    public c b() {
        return new c(this);
    }

    public d c(boolean z4) {
        this.f72337f = z4;
        return this;
    }

    public d d(ExecutorService executorService) {
        this.f72340i = executorService;
        return this;
    }

    public d e(boolean z4) {
        this.f72338g = z4;
        return this;
    }

    public c f() {
        c cVar;
        synchronized (c.class) {
            if (c.f72304r == null) {
                c.f72304r = b();
                cVar = c.f72304r;
            } else {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return cVar;
    }

    public d g(boolean z4) {
        this.f72333b = z4;
        return this;
    }

    public d h(boolean z4) {
        this.f72332a = z4;
        return this;
    }

    public d i(boolean z4) {
        this.f72335d = z4;
        return this;
    }

    public d j(boolean z4) {
        this.f72334c = z4;
        return this;
    }

    public d k(Class<?> cls) {
        if (this.f72341j == null) {
            this.f72341j = new ArrayList();
        }
        this.f72341j.add(cls);
        return this;
    }

    public d l(boolean z4) {
        this.f72339h = z4;
        return this;
    }

    public d m(boolean z4) {
        this.f72336e = z4;
        return this;
    }
}
