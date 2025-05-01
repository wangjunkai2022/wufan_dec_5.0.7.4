package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class g extends b<com.aggmoread.sdk.z.c.a.a.c.o.c> {

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.o.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3054a;

        a(g gVar, b.g gVar2) {
            this.f3054a = gVar2;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3054a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.d
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.o.c> list) {
            b.g gVar = this.f3054a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.o.c> gVar) {
        return new a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.o.c> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.o.d) {
            ((com.aggmoread.sdk.z.c.a.a.c.o.d) fVar).onAdLoaded(list);
        }
    }
}
