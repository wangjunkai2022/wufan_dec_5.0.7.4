package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: RectangleShapeParser.java */
/* loaded from: classes2.dex */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4140a = JsonReader.a.a("nm", "p", "s", "r", "hd");

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.g a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4140a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                mVar = a.b(jsonReader, kVar);
            } else if (A == 2) {
                fVar = d.i(jsonReader, kVar);
            } else if (A == 3) {
                bVar = d.e(jsonReader, kVar);
            } else if (A != 4) {
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        return new com.airbnb.lottie.model.content.g(str, mVar, fVar, bVar, z4);
    }
}
