package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: OOMSoftReferenceBucket.java */
@NotThreadSafe
/* loaded from: classes2.dex */
class a0<V> extends f<V> {

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<com.facebook.common.references.b<V>> f11962g;

    public a0(int i4, int i5, int i6) {
        super(i4, i5, i6, false);
        this.f11962g = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.f
    void a(V v2) {
        com.facebook.common.references.b<V> poll = this.f11962g.poll();
        if (poll == null) {
            poll = new com.facebook.common.references.b<>();
        }
        poll.c(v2);
        this.f12019c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.f
    public V h() {
        com.facebook.common.references.b<V> bVar = (com.facebook.common.references.b) this.f12019c.poll();
        V b5 = bVar.b();
        bVar.a();
        this.f11962g.add(bVar);
        return b5;
    }
}
