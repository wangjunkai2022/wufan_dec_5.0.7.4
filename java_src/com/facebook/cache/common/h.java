package com.facebook.cache.common;
/* compiled from: NoOpCacheEventListener.java */
/* loaded from: classes2.dex */
public class h implements CacheEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static h f10706a;

    private h() {
    }

    public static synchronized h i() {
        h hVar;
        synchronized (h.class) {
            if (f10706a == null) {
                f10706a = new h();
            }
            hVar = f10706a;
        }
        return hVar;
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void a(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void b(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void c(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void d(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void e(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void f() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void g(b bVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void h(b bVar) {
    }
}
