package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: StagingArea.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f11689b = u.class;
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private Map<com.facebook.cache.common.c, com.facebook.imagepipeline.image.e> f11690a = new HashMap();

    private u() {
    }

    public static u d() {
        return new u();
    }

    private synchronized void e() {
        com.facebook.common.logging.a.V(f11689b, "Count = %d", Integer.valueOf(this.f11690a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f11690a.values());
            this.f11690a.clear();
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            com.facebook.imagepipeline.image.e eVar = (com.facebook.imagepipeline.image.e) arrayList.get(i4);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    public synchronized boolean b(com.facebook.cache.common.c cVar) {
        com.facebook.common.internal.h.i(cVar);
        if (this.f11690a.containsKey(cVar)) {
            com.facebook.imagepipeline.image.e eVar = this.f11690a.get(cVar);
            synchronized (eVar) {
                if (com.facebook.imagepipeline.image.e.J(eVar)) {
                    return true;
                }
                this.f11690a.remove(cVar);
                com.facebook.common.logging.a.m0(f11689b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), cVar.a(), Integer.valueOf(System.identityHashCode(cVar)));
                return false;
            }
        }
        return false;
    }

    @Nullable
    public synchronized com.facebook.imagepipeline.image.e c(com.facebook.cache.common.c cVar) {
        com.facebook.common.internal.h.i(cVar);
        com.facebook.imagepipeline.image.e eVar = this.f11690a.get(cVar);
        if (eVar != null) {
            synchronized (eVar) {
                if (!com.facebook.imagepipeline.image.e.J(eVar)) {
                    this.f11690a.remove(cVar);
                    com.facebook.common.logging.a.m0(f11689b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), cVar.a(), Integer.valueOf(System.identityHashCode(cVar)));
                    return null;
                }
                eVar = com.facebook.imagepipeline.image.e.b(eVar);
            }
        }
        return eVar;
    }

    public synchronized void f(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
        com.facebook.common.internal.h.i(cVar);
        com.facebook.common.internal.h.d(com.facebook.imagepipeline.image.e.J(eVar));
        com.facebook.imagepipeline.image.e.d(this.f11690a.put(cVar, com.facebook.imagepipeline.image.e.b(eVar)));
        e();
    }

    public boolean g(com.facebook.cache.common.c cVar) {
        com.facebook.imagepipeline.image.e remove;
        com.facebook.common.internal.h.i(cVar);
        synchronized (this) {
            remove = this.f11690a.remove(cVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.E();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean h(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
        com.facebook.common.internal.h.i(cVar);
        com.facebook.common.internal.h.i(eVar);
        com.facebook.common.internal.h.d(com.facebook.imagepipeline.image.e.J(eVar));
        com.facebook.imagepipeline.image.e eVar2 = this.f11690a.get(cVar);
        if (eVar2 == null) {
            return false;
        }
        com.facebook.common.references.a<PooledByteBuffer> h4 = eVar2.h();
        com.facebook.common.references.a<PooledByteBuffer> h5 = eVar.h();
        if (h4 != null && h5 != null && h4.k() == h5.k()) {
            this.f11690a.remove(cVar);
            com.facebook.common.references.a.h(h5);
            com.facebook.common.references.a.h(h4);
            com.facebook.imagepipeline.image.e.d(eVar2);
            e();
            return true;
        }
        com.facebook.common.references.a.h(h5);
        com.facebook.common.references.a.h(h4);
        com.facebook.imagepipeline.image.e.d(eVar2);
        return false;
    }
}
