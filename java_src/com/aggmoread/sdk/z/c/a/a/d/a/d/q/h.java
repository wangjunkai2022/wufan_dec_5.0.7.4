package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class h extends b<com.aggmoread.sdk.z.c.a.a.c.p.b> {

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.p.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3055a;

        a(h hVar, b.g gVar) {
            this.f3055a = gVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3055a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.c
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.p.b> list) {
            b.g gVar = this.f3055a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.c
        public void onAdVideoCached() {
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.p.b> gVar) {
        return new a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.p.b> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.p.c) {
            ((com.aggmoread.sdk.z.c.a.a.c.p.c) fVar).onAdLoaded(list);
        }
    }
}
