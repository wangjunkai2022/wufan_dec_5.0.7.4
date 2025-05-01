package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class i extends b<com.aggmoread.sdk.z.c.a.a.c.q.b> {

    /* loaded from: classes2.dex */
    class a implements com.aggmoread.sdk.z.c.a.a.c.q.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3056a;

        a(i iVar, b.g gVar) {
            this.f3056a = gVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3056a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.c
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.q.b> list) {
            b.g gVar = this.f3056a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.c
        public void onAdVideoCached() {
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.q.b> gVar) {
        return new a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.q.b> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.q.c) {
            ((com.aggmoread.sdk.z.c.a.a.c.q.c) fVar).onAdLoaded(list);
        }
    }
}
