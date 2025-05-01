package com.facebook.imagepipeline.cache;
/* compiled from: InstrumentedMemoryCache.java */
/* loaded from: classes2.dex */
public class o<K, V> implements p<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final p<K, V> f11679a;

    /* renamed from: b  reason: collision with root package name */
    private final r f11680b;

    public o(p<K, V> pVar, r rVar) {
        this.f11679a = pVar;
        this.f11680b = rVar;
    }

    @Override // com.facebook.imagepipeline.cache.p
    public com.facebook.common.references.a<V> a(K k4, com.facebook.common.references.a<V> aVar) {
        this.f11680b.b();
        return this.f11679a.a(k4, aVar);
    }

    @Override // com.facebook.imagepipeline.cache.p
    public int b(com.facebook.common.internal.i<K> iVar) {
        return this.f11679a.b(iVar);
    }

    @Override // com.facebook.imagepipeline.cache.p
    public boolean c(com.facebook.common.internal.i<K> iVar) {
        return this.f11679a.c(iVar);
    }

    @Override // com.facebook.imagepipeline.cache.p
    public com.facebook.common.references.a<V> get(K k4) {
        com.facebook.common.references.a<V> aVar = this.f11679a.get(k4);
        if (aVar == null) {
            this.f11680b.c();
        } else {
            this.f11680b.a(k4);
        }
        return aVar;
    }
}
