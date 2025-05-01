package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
/* compiled from: ProducerContext.java */
/* loaded from: classes2.dex */
public interface k0 {
    ImageRequest a();

    Object b();

    void c(l0 l0Var);

    boolean d();

    boolean e();

    ImageRequest.RequestLevel f();

    String getId();

    m0 getListener();

    Priority getPriority();
}
