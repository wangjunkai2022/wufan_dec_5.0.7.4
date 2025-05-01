package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.g;
import com.facebook.imagepipeline.cache.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: AnimatedFrameCache.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.cache.common.c f11597a;

    /* renamed from: b  reason: collision with root package name */
    private final h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11598b;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<com.facebook.cache.common.c> f11600d = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final h.e<com.facebook.cache.common.c> f11599c = new a();

    /* compiled from: AnimatedFrameCache.java */
    /* loaded from: classes2.dex */
    class a implements h.e<com.facebook.cache.common.c> {
        a() {
        }

        @Override // com.facebook.imagepipeline.cache.h.e
        /* renamed from: b */
        public void a(com.facebook.cache.common.c cVar, boolean z4) {
            c.this.f(cVar, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedFrameCache.java */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class b implements com.facebook.cache.common.c {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.cache.common.c f11602a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11603b;

        public b(com.facebook.cache.common.c cVar, int i4) {
            this.f11602a = cVar;
            this.f11603b = i4;
        }

        @Override // com.facebook.cache.common.c
        public String a() {
            return null;
        }

        @Override // com.facebook.cache.common.c
        public boolean b(Uri uri) {
            return this.f11602a.b(uri);
        }

        @Override // com.facebook.cache.common.c
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f11603b == bVar.f11603b && this.f11602a.equals(bVar.f11602a);
            }
            return false;
        }

        @Override // com.facebook.cache.common.c
        public int hashCode() {
            return (this.f11602a.hashCode() * 1013) + this.f11603b;
        }

        @Override // com.facebook.cache.common.c
        public String toString() {
            return g.f(this).f("imageCacheKey", this.f11602a).d("frameIndex", this.f11603b).toString();
        }
    }

    public c(com.facebook.cache.common.c cVar, h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> hVar) {
        this.f11597a = cVar;
        this.f11598b = hVar;
    }

    private b e(int i4) {
        return new b(this.f11597a, i4);
    }

    @Nullable
    private synchronized com.facebook.cache.common.c g() {
        com.facebook.cache.common.c cVar;
        cVar = null;
        Iterator<com.facebook.cache.common.c> it2 = this.f11600d.iterator();
        if (it2.hasNext()) {
            cVar = it2.next();
            it2.remove();
        }
        return cVar;
    }

    @Nullable
    public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> a(int i4, com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        return this.f11598b.f(e(i4), aVar, this.f11599c);
    }

    public boolean b(int i4) {
        return this.f11598b.i(e(i4));
    }

    @Nullable
    public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> c(int i4) {
        return this.f11598b.get(e(i4));
    }

    @Nullable
    public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> d() {
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> D;
        do {
            com.facebook.cache.common.c g4 = g();
            if (g4 == null) {
                return null;
            }
            D = this.f11598b.D(g4);
        } while (D == null);
        return D;
    }

    public synchronized void f(com.facebook.cache.common.c cVar, boolean z4) {
        if (z4) {
            this.f11600d.add(cVar);
        } else {
            this.f11600d.remove(cVar);
        }
    }
}
