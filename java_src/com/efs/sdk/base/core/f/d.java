package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    private AtomicInteger f10403c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f10404d = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public AtomicInteger f10402b = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    private AtomicInteger f10405e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    private AtomicInteger f10406f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        f fVar;
        if ((this.f10403c.get() == 0 && this.f10404d.get() == 0 && this.f10402b.get() == 0 && this.f10406f.get() == 0 && this.f10405e.get() == 0) || this.f10394a == null || !ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            return;
        }
        ControllerCenter controllerCenter = this.f10394a;
        int i4 = this.f10403c.get();
        int i5 = this.f10404d.get();
        int i6 = this.f10402b.get();
        int i7 = this.f10406f.get();
        int i8 = this.f10405e.get();
        fVar = f.a.f10411a;
        b bVar = new b("efs_core", "lf_st", fVar.f10407a.f10401c);
        bVar.put("create_cnt", Integer.valueOf(i4));
        bVar.put("cache_cnt", Integer.valueOf(i5));
        bVar.put("req_cnt", Integer.valueOf(i6));
        bVar.put("err_cnt", Integer.valueOf(i7));
        bVar.put("expire_cnt", Integer.valueOf(i8));
        this.f10403c.addAndGet(i4 * (-1));
        this.f10404d.addAndGet(i5 * (-1));
        this.f10402b.addAndGet(i6 * (-1));
        this.f10406f.addAndGet(i7 * (-1));
        this.f10405e.addAndGet(i8 * (-1));
        controllerCenter.send(bVar);
    }

    public final void b() {
        this.f10403c.incrementAndGet();
    }

    public final void c() {
        this.f10404d.incrementAndGet();
    }

    public final void d() {
        this.f10405e.incrementAndGet();
    }

    public final void e() {
        this.f10406f.incrementAndGet();
    }
}
