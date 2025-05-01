package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class l extends b<com.aggmoread.sdk.z.c.a.a.c.s.a> {

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.s.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3059a;

        a(l lVar, b.g gVar) {
            this.f3059a = gVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3059a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.s.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.s.a> list) {
            b.g gVar = this.f3059a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.s.a> gVar) {
        return new a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.s.a> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.s.b) {
            ((com.aggmoread.sdk.z.c.a.a.c.s.b) fVar).onAdLoaded(list);
        }
    }
}
