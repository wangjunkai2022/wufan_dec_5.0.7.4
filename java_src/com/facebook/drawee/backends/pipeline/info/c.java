package com.facebook.drawee.backends.pipeline.info;

import android.graphics.Rect;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ImagePerfMonitor.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.drawee.backends.pipeline.d f11040a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.time.c f11041b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11042c = new d();
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private a f11043d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private l0.b f11044e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private m0.c f11045f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private m0.a f11046g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private v0.b f11047h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private List<l0.d> f11048i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11049j;

    public c(com.facebook.common.time.c cVar, com.facebook.drawee.backends.pipeline.d dVar) {
        this.f11041b = cVar;
        this.f11040a = dVar;
    }

    private void i() {
        if (this.f11046g == null) {
            this.f11046g = new m0.a(this.f11041b, this.f11042c, this);
        }
        if (this.f11045f == null) {
            this.f11045f = new m0.c(this.f11041b, this.f11042c);
        }
        if (this.f11044e == null) {
            this.f11044e = new m0.b(this.f11042c, this);
        }
        a aVar = this.f11043d;
        if (aVar == null) {
            this.f11043d = new a(this.f11040a.s(), this.f11044e);
        } else {
            aVar.l(this.f11040a.s());
        }
        if (this.f11047h == null) {
            this.f11047h = new v0.b(this.f11045f, this.f11043d);
        }
    }

    public void a(@Nullable l0.d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f11048i == null) {
            this.f11048i = new LinkedList();
        }
        this.f11048i.add(dVar);
    }

    public void b() {
        o0.b e5 = this.f11040a.e();
        if (e5 == null || e5.c() == null) {
            return;
        }
        Rect bounds = e5.c().getBounds();
        this.f11042c.s(bounds.width());
        this.f11042c.r(bounds.height());
    }

    public void c() {
        List<l0.d> list = this.f11048i;
        if (list != null) {
            list.clear();
        }
    }

    public void d(d dVar, int i4) {
        List<l0.d> list;
        if (!this.f11049j || (list = this.f11048i) == null || list.isEmpty()) {
            return;
        }
        b x4 = dVar.x();
        for (l0.d dVar2 : this.f11048i) {
            dVar2.b(x4, i4);
        }
    }

    public void e(d dVar, int i4) {
        List<l0.d> list;
        dVar.l(i4);
        if (!this.f11049j || (list = this.f11048i) == null || list.isEmpty()) {
            return;
        }
        if (i4 == 3) {
            b();
        }
        b x4 = dVar.x();
        for (l0.d dVar2 : this.f11048i) {
            dVar2.a(x4, i4);
        }
    }

    public void f(l0.d dVar) {
        List<l0.d> list = this.f11048i;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void g() {
        c();
        h(false);
        this.f11042c.b();
    }

    public void h(boolean z4) {
        this.f11049j = z4;
        if (z4) {
            i();
            l0.b bVar = this.f11044e;
            if (bVar != null) {
                this.f11040a.R(bVar);
            }
            m0.a aVar = this.f11046g;
            if (aVar != null) {
                this.f11040a.k(aVar);
            }
            v0.b bVar2 = this.f11047h;
            if (bVar2 != null) {
                this.f11040a.S(bVar2);
                return;
            }
            return;
        }
        l0.b bVar3 = this.f11044e;
        if (bVar3 != null) {
            this.f11040a.i0(bVar3);
        }
        m0.a aVar2 = this.f11046g;
        if (aVar2 != null) {
            this.f11040a.J(aVar2);
        }
        v0.b bVar4 = this.f11047h;
        if (bVar4 != null) {
            this.f11040a.j0(bVar4);
        }
    }
}
