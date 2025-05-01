package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: SettableProducerContext.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class q0 extends d {
    public q0(k0 k0Var) {
        this(k0Var.a(), k0Var.getId(), k0Var.getListener(), k0Var.b(), k0Var.f(), k0Var.e(), k0Var.d(), k0Var.getPriority());
    }

    public void q(boolean z4) {
        d.h(n(z4));
    }

    public void r(boolean z4) {
        d.i(o(z4));
    }

    public void s(Priority priority) {
        d.j(p(priority));
    }

    public q0(ImageRequest imageRequest, k0 k0Var) {
        this(imageRequest, k0Var.getId(), k0Var.getListener(), k0Var.b(), k0Var.f(), k0Var.e(), k0Var.d(), k0Var.getPriority());
    }

    public q0(ImageRequest imageRequest, String str, m0 m0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z4, boolean z5, Priority priority) {
        super(imageRequest, str, m0Var, obj, requestLevel, z4, z5, priority);
    }
}
