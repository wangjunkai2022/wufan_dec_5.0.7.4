package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: DefaultExecutorSupplier.java */
/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: e  reason: collision with root package name */
    private static final int f11730e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final int f11731f = 1;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11733b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11734c;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11732a = Executors.newFixedThreadPool(2, new j(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d  reason: collision with root package name */
    private final Executor f11735d = Executors.newFixedThreadPool(1, new j(10, "FrescoLightWeightBackgroundExecutor", true));

    public a(int i4) {
        this.f11733b = Executors.newFixedThreadPool(i4, new j(10, "FrescoDecodeExecutor", true));
        this.f11734c = Executors.newFixedThreadPool(i4, new j(10, "FrescoBackgroundExecutor", true));
    }

    @Override // com.facebook.imagepipeline.core.e
    public Executor a() {
        return this.f11735d;
    }

    @Override // com.facebook.imagepipeline.core.e
    public Executor b() {
        return this.f11732a;
    }

    @Override // com.facebook.imagepipeline.core.e
    public Executor c() {
        return this.f11733b;
    }

    @Override // com.facebook.imagepipeline.core.e
    public Executor d() {
        return this.f11734c;
    }

    @Override // com.facebook.imagepipeline.core.e
    public Executor e() {
        return this.f11732a;
    }
}
