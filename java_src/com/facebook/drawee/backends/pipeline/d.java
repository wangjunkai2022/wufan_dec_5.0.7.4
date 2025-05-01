package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.h;
import com.facebook.common.internal.k;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.drawable.r;
import com.facebook.imagepipeline.cache.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: PipelineDraweeController.java */
/* loaded from: classes.dex */
public class d extends com.facebook.drawee.controller.a<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.imagepipeline.image.f> {
    private static final Class<?> I = d.class;
    private com.facebook.cache.common.c A;
    private k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> B;
    private boolean C;
    @Nullable
    private ImmutableList<t0.a> D;
    @Nullable
    private com.facebook.drawee.backends.pipeline.info.c E;
    @GuardedBy("this")
    @Nullable
    private Set<v0.c> F;
    @GuardedBy("this")
    @Nullable
    private l0.b G;
    private k0.a H;

    /* renamed from: w  reason: collision with root package name */
    private final Resources f10996w;

    /* renamed from: x  reason: collision with root package name */
    private final t0.a f10997x;
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private final ImmutableList<t0.a> f10998y;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private final p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f10999z;

    public d(Resources resources, com.facebook.drawee.components.a aVar, t0.a aVar2, Executor executor, @Nullable p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, @Nullable ImmutableList<t0.a> immutableList) {
        super(aVar, executor, null, null);
        this.f10996w = resources;
        this.f10997x = new b(resources, aVar2);
        this.f10998y = immutableList;
        this.f10999z = pVar;
    }

    private void b0(k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> kVar) {
        this.B = kVar;
        f0(null);
    }

    @Nullable
    private Drawable e0(@Nullable ImmutableList<t0.a> immutableList, com.facebook.imagepipeline.image.c cVar) {
        Drawable b5;
        if (immutableList == null) {
            return null;
        }
        Iterator<t0.a> it2 = immutableList.iterator();
        while (it2.hasNext()) {
            t0.a next = it2.next();
            if (next.a(cVar) && (b5 = next.b(cVar)) != null) {
                return b5;
            }
        }
        return null;
    }

    private void f0(@Nullable com.facebook.imagepipeline.image.c cVar) {
        q a5;
        if (this.C) {
            if (p() == null) {
                com.facebook.drawee.debug.a aVar = new com.facebook.drawee.debug.a();
                n0.a aVar2 = new n0.a(aVar);
                this.H = new k0.a();
                k(aVar2);
                K(aVar);
            }
            if (this.G == null) {
                R(this.H);
            }
            if (p() instanceof com.facebook.drawee.debug.a) {
                com.facebook.drawee.debug.a aVar3 = (com.facebook.drawee.debug.a) p();
                aVar3.g(s());
                o0.b e5 = e();
                r.c cVar2 = null;
                if (e5 != null && (a5 = r.a(e5.c())) != null) {
                    cVar2 = a5.A();
                }
                aVar3.n(cVar2);
                aVar3.m(this.H.b());
                if (cVar != null) {
                    aVar3.h(cVar.getWidth(), cVar.getHeight());
                    aVar3.l(cVar.b());
                    return;
                }
                aVar3.e();
            }
        }
    }

    @Override // com.facebook.drawee.controller.a
    protected void G(@Nullable Drawable drawable) {
        if (drawable instanceof i0.a) {
            ((i0.a) drawable).d();
        }
    }

    public synchronized void R(l0.b bVar) {
        l0.b bVar2 = this.G;
        if (bVar2 instanceof l0.a) {
            ((l0.a) bVar2).b(bVar);
        } else if (bVar2 != null) {
            this.G = new l0.a(bVar2, bVar);
        } else {
            this.G = bVar;
        }
    }

    public synchronized void S(v0.c cVar) {
        if (this.F == null) {
            this.F = new HashSet();
        }
        this.F.add(cVar);
    }

    protected void T() {
        synchronized (this) {
            this.G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    /* renamed from: U */
    public Drawable l(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("PipelineDraweeController#createDrawable");
            }
            h.o(com.facebook.common.references.a.t(aVar));
            com.facebook.imagepipeline.image.c k4 = aVar.k();
            f0(k4);
            Drawable e02 = e0(this.D, k4);
            if (e02 != null) {
                return e02;
            }
            Drawable e03 = e0(this.f10998y, k4);
            if (e03 != null) {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return e03;
            }
            Drawable b5 = this.f10997x.b(k4);
            if (b5 != null) {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return b5;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + k4);
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    protected com.facebook.cache.common.c V() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    @Nullable
    /* renamed from: W */
    public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> m() {
        com.facebook.cache.common.c cVar;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar = this.f10999z;
            if (pVar != null && (cVar = this.A) != null) {
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = pVar.get(cVar);
                if (aVar != null && !aVar.k().a().a()) {
                    aVar.close();
                    return null;
                }
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return aVar;
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return null;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    protected k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> X() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    /* renamed from: Y */
    public int u(@Nullable com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        if (aVar != null) {
            return aVar.p();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    /* renamed from: Z */
    public com.facebook.imagepipeline.image.f v(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        h.o(com.facebook.common.references.a.t(aVar));
        return aVar.k();
    }

    @Override // com.facebook.drawee.controller.a, o0.a
    public void a(@Nullable o0.b bVar) {
        super.a(bVar);
        f0(null);
    }

    @Nullable
    public synchronized v0.c a0() {
        com.facebook.drawee.backends.pipeline.info.a aVar = this.G != null ? new com.facebook.drawee.backends.pipeline.info.a(s(), this.G) : null;
        Set<v0.c> set = this.F;
        if (set != null) {
            v0.b bVar = new v0.b(set);
            if (aVar != null) {
                bVar.l(aVar);
            }
            return bVar;
        }
        return aVar;
    }

    @Override // o0.a
    public boolean b(@Nullable o0.a aVar) {
        com.facebook.cache.common.c cVar = this.A;
        if (cVar == null || !(aVar instanceof d)) {
            return false;
        }
        return com.facebook.common.internal.g.a(cVar, ((d) aVar).V());
    }

    public void c0(k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> kVar, String str, com.facebook.cache.common.c cVar, Object obj, @Nullable ImmutableList<t0.a> immutableList, @Nullable l0.b bVar) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PipelineDraweeController#initialize");
        }
        super.y(str, obj);
        b0(kVar);
        this.A = cVar;
        k0(immutableList);
        T();
        f0(null);
        R(bVar);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void d0(@Nullable l0.d dVar) {
        com.facebook.drawee.backends.pipeline.info.c cVar = this.E;
        if (cVar != null) {
            cVar.g();
        }
        if (dVar != null) {
            if (this.E == null) {
                this.E = new com.facebook.drawee.backends.pipeline.info.c(AwakeTimeSinceBootClock.get(), this);
            }
            this.E.a(dVar);
            this.E.h(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    /* renamed from: g0 */
    public void D(String str, com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        super.D(str, aVar);
        synchronized (this) {
            l0.b bVar = this.G;
            if (bVar != null) {
                bVar.a(str, 5, true);
            }
        }
    }

    protected Resources getResources() {
        return this.f10996w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.a
    /* renamed from: h0 */
    public void I(@Nullable com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        com.facebook.common.references.a.h(aVar);
    }

    public synchronized void i0(l0.b bVar) {
        l0.b bVar2 = this.G;
        if (bVar2 instanceof l0.a) {
            ((l0.a) bVar2).c(bVar);
        } else if (bVar2 != null) {
            this.G = new l0.a(bVar2, bVar);
        } else {
            this.G = bVar;
        }
    }

    public synchronized void j0(v0.c cVar) {
        Set<v0.c> set = this.F;
        if (set == null) {
            return;
        }
        set.remove(cVar);
    }

    public void k0(@Nullable ImmutableList<t0.a> immutableList) {
        this.D = immutableList;
    }

    public void l0(boolean z4) {
        this.C = z4;
    }

    @Override // com.facebook.drawee.controller.a
    protected com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> q() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PipelineDraweeController#getDataSource");
        }
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.V(I, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar = this.B.get();
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return cVar;
    }

    @Override // com.facebook.drawee.controller.a
    public String toString() {
        return com.facebook.common.internal.g.f(this).f("super", super.toString()).f("dataSourceSupplier", this.B).toString();
    }
}
