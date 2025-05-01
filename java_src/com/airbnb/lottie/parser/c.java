package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4137a = JsonReader.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4138b = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55682a);

    private c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        return eVar == null || (eVar.c() && eVar.b().get(0).f4337b.equals(0.0f, 0.0f));
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof com.airbnb.lottie.model.animatable.i) && mVar.c() && mVar.b().get(0).f4337b.equals(0.0f, 0.0f));
    }

    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f4337b).floatValue() == 0.0f);
    }

    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        return gVar == null || (gVar.c() && ((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.b().get(0)).f4337b).a(1.0f, 1.0f));
    }

    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f4337b).floatValue() == 0.0f);
    }

    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f4337b).floatValue() == 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.model.animatable.l g(com.airbnb.lottie.parser.moshi.JsonReader r27, com.airbnb.lottie.k r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.c.g(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.k):com.airbnb.lottie.model.animatable.l");
    }
}
