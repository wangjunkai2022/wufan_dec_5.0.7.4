package com.facebook.imagepipeline.memory;
/* compiled from: PoolStatsTracker.java */
/* loaded from: classes2.dex */
public interface f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12022a = "buckets_used_";

    /* renamed from: b  reason: collision with root package name */
    public static final String f12023b = "used_count";

    /* renamed from: c  reason: collision with root package name */
    public static final String f12024c = "used_bytes";

    /* renamed from: d  reason: collision with root package name */
    public static final String f12025d = "free_count";

    /* renamed from: e  reason: collision with root package name */
    public static final String f12026e = "free_bytes";

    /* renamed from: f  reason: collision with root package name */
    public static final String f12027f = "soft_cap";

    /* renamed from: g  reason: collision with root package name */
    public static final String f12028g = "hard_cap";

    void a();

    void b(int i4);

    void c(int i4);

    void d(int i4);

    void e(int i4);

    void f(BasePool basePool);

    void g();
}
