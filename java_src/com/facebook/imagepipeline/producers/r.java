package com.facebook.imagepipeline.producers;

import android.net.Uri;
import javax.annotation.Nullable;
/* compiled from: FetchState.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Consumer<com.facebook.imagepipeline.image.e> f12360a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f12361b;

    /* renamed from: c  reason: collision with root package name */
    private long f12362c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f12363d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.common.a f12364e;

    public r(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        this.f12360a = consumer;
        this.f12361b = k0Var;
    }

    public Consumer<com.facebook.imagepipeline.image.e> a() {
        return this.f12360a;
    }

    public String b() {
        return this.f12361b.getId();
    }

    public long c() {
        return this.f12362c;
    }

    public m0 d() {
        return this.f12361b.getListener();
    }

    public int e() {
        return this.f12363d;
    }

    @Nullable
    public com.facebook.imagepipeline.common.a f() {
        return this.f12364e;
    }

    public Uri g() {
        return this.f12361b.a().t();
    }

    public k0 getContext() {
        return this.f12361b;
    }

    public void h(long j4) {
        this.f12362c = j4;
    }

    public void i(int i4) {
        this.f12363d = i4;
    }

    public void j(com.facebook.imagepipeline.common.a aVar) {
        this.f12364e = aVar;
    }
}
