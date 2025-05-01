package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.a.d.q.b;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends b<com.aggmoread.sdk.z.c.a.a.c.m.a> {

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0118a implements com.aggmoread.sdk.z.c.a.a.c.m.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.g f3010a;

        C0118a(a aVar, b.g gVar) {
            this.f3010a = gVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            b.g gVar = this.f3010a;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.m.a> list) {
            b.g gVar = this.f3010a;
            if (gVar != null) {
                gVar.onAdLoaded(list);
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, b.g<com.aggmoread.sdk.z.c.a.a.c.m.a> gVar) {
        return new C0118a(this, gVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b
    protected void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<com.aggmoread.sdk.z.c.a.a.c.m.a> list) {
        if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.m.b) {
            ((com.aggmoread.sdk.z.c.a.a.c.m.b) fVar).onAdLoaded(list);
        }
    }
}
