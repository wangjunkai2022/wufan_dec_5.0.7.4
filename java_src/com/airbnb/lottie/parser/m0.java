package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes2.dex */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4173a = JsonReader.a.a("s", com.kwad.sdk.m.e.TAG, "o", "nm", "m", "hd");

    private m0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeTrimPath a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4173a);
            if (A == 0) {
                bVar = d.f(jsonReader, kVar, false);
            } else if (A == 1) {
                bVar2 = d.f(jsonReader, kVar, false);
            } else if (A == 2) {
                bVar3 = d.f(jsonReader, kVar, false);
            } else if (A == 3) {
                str = jsonReader.u();
            } else if (A == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.r());
            } else if (A != 5) {
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z4);
    }
}
