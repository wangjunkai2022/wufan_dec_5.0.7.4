package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;
/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class o extends g<DocumentData> {

    /* compiled from: TextKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    class a extends com.airbnb.lottie.value.j<DocumentData> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.b f3809d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f3810e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DocumentData f3811f;

        a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.j jVar, DocumentData documentData) {
            this.f3809d = bVar;
            this.f3810e = jVar;
            this.f3811f = documentData;
        }

        @Override // com.airbnb.lottie.value.j
        /* renamed from: e */
        public DocumentData a(com.airbnb.lottie.value.b<DocumentData> bVar) {
            this.f3809d.h(bVar.f(), bVar.a(), bVar.g().f3905a, bVar.b().f3905a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f3810e.a(this.f3809d);
            DocumentData b5 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f3811f.a(str, b5.f3906b, b5.f3907c, b5.f3908d, b5.f3909e, b5.f3910f, b5.f3911g, b5.f3912h, b5.f3913i, b5.f3914j, b5.f3915k);
            return this.f3811f;
        }
    }

    public o(List<com.airbnb.lottie.value.a<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public DocumentData i(com.airbnb.lottie.value.a<DocumentData> aVar, float f5) {
        DocumentData documentData;
        com.airbnb.lottie.value.j<A> jVar = this.f3768e;
        if (jVar == 0) {
            if (f5 == 1.0f && (documentData = aVar.f4338c) != null) {
                return documentData;
            }
            return aVar.f4337b;
        }
        float f6 = aVar.f4342g;
        Float f7 = aVar.f4343h;
        float floatValue = f7 == null ? Float.MAX_VALUE : f7.floatValue();
        DocumentData documentData2 = aVar.f4337b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = aVar.f4338c;
        return (DocumentData) jVar.b(f6, floatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f5, d(), f());
    }

    public void q(com.airbnb.lottie.value.j<String> jVar) {
        super.n(new a(new com.airbnb.lottie.value.b(), jVar, new DocumentData()));
    }
}
