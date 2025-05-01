package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.k;
import com.facebook.imagepipeline.cache.p;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: PipelineDraweeControllerFactory.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Resources f11010a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.drawee.components.a f11011b;

    /* renamed from: c  reason: collision with root package name */
    private t0.a f11012c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f11013d;

    /* renamed from: e  reason: collision with root package name */
    private p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11014e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ImmutableList<t0.a> f11015f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private k<Boolean> f11016g;

    public void a(Resources resources, com.facebook.drawee.components.a aVar, t0.a aVar2, Executor executor, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, @Nullable ImmutableList<t0.a> immutableList, @Nullable k<Boolean> kVar) {
        this.f11010a = resources;
        this.f11011b = aVar;
        this.f11012c = aVar2;
        this.f11013d = executor;
        this.f11014e = pVar;
        this.f11015f = immutableList;
        this.f11016g = kVar;
    }

    protected d b(Resources resources, com.facebook.drawee.components.a aVar, t0.a aVar2, Executor executor, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, @Nullable ImmutableList<t0.a> immutableList) {
        return new d(resources, aVar, aVar2, executor, pVar, immutableList);
    }

    public d c() {
        d b5 = b(this.f11010a, this.f11011b, this.f11012c, this.f11013d, this.f11014e, this.f11015f);
        k<Boolean> kVar = this.f11016g;
        if (kVar != null) {
            b5.l0(kVar.get().booleanValue());
        }
        return b5;
    }
}
