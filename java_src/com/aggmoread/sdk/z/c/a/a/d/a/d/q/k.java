package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class k extends b<com.aggmoread.sdk.z.c.a.a.c.r.a> {

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.r.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3058a;

        a(k kVar, b.g gVar) {
            this.f3058a = gVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3058a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.r.a> list) {
            b.g gVar = this.f3058a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.b
        public void onAdVideoCached() {
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.r.a> gVar) {
        return new a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.r.a> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.r.b) {
            ((com.aggmoread.sdk.z.c.a.a.c.r.b) fVar).onAdLoaded(list);
        }
    }
}
