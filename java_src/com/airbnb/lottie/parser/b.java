package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4134a = JsonReader.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4135b = JsonReader.a.a("fc", "sc", "sw", bm.aM);

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.d();
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        while (jsonReader.k()) {
            if (jsonReader.A(f4134a) != 0) {
                jsonReader.B();
                jsonReader.C();
            } else {
                kVar2 = b(jsonReader, kVar);
            }
        }
        jsonReader.h();
        return kVar2 == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVar2;
    }

    private static com.airbnb.lottie.model.animatable.k b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.d();
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4135b);
            if (A == 0) {
                aVar = d.c(jsonReader, kVar);
            } else if (A == 1) {
                aVar2 = d.c(jsonReader, kVar);
            } else if (A == 2) {
                bVar = d.e(jsonReader, kVar);
            } else if (A != 3) {
                jsonReader.B();
                jsonReader.C();
            } else {
                bVar2 = d.e(jsonReader, kVar);
            }
        }
        jsonReader.h();
        return new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
    }
}
