package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: RepeaterParser.java */
/* loaded from: classes2.dex */
class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4143a = JsonReader.a.a("nm", "c", "o", "tr", "hd");

    private e0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.h a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4143a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                bVar = d.f(jsonReader, kVar, false);
            } else if (A == 2) {
                bVar2 = d.f(jsonReader, kVar, false);
            } else if (A == 3) {
                lVar = c.g(jsonReader, kVar);
            } else if (A != 4) {
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        return new com.airbnb.lottie.model.content.h(str, bVar, bVar2, lVar, z4);
    }
}
