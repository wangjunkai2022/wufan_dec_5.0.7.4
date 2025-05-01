package com.facebook.imagepipeline.cache;
/* compiled from: NoOpImageCacheStatsTracker.java */
/* loaded from: classes2.dex */
public class t implements n {

    /* renamed from: a  reason: collision with root package name */
    private static t f11688a;

    private t() {
    }

    public static synchronized t n() {
        t tVar;
        synchronized (t.class) {
            if (f11688a == null) {
                f11688a = new t();
            }
            tVar = f11688a;
        }
        return tVar;
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void a(h<?, ?> hVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void b() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void c() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void d() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void e() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void f(com.facebook.cache.common.c cVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void g(com.facebook.cache.common.c cVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void h(com.facebook.cache.common.c cVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void i(com.facebook.cache.common.c cVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void j(h<?, ?> hVar) {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void k() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void l() {
    }

    @Override // com.facebook.imagepipeline.cache.n
    public void m() {
    }
}
