package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: CircleShapeParser.java */
/* loaded from: classes2.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4144a = JsonReader.a.a("nm", "p", "s", "hd", com.kuaishou.weapon.p0.t.f55701t);

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.b a(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i4) throws IOException {
        boolean z4 = i4 == 3;
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        boolean z5 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4144a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                mVar = a.b(jsonReader, kVar);
            } else if (A == 2) {
                fVar = d.i(jsonReader, kVar);
            } else if (A == 3) {
                z5 = jsonReader.l();
            } else if (A != 4) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z4 = jsonReader.r() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(str, mVar, fVar, z4, z5);
    }
}
