package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: ScaleXYParser.java */
/* loaded from: classes2.dex */
public class g0 implements n0<com.airbnb.lottie.value.k> {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f4147a = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public com.airbnb.lottie.value.k a(JsonReader jsonReader, float f5) throws IOException {
        boolean z4 = jsonReader.y() == JsonReader.Token.BEGIN_ARRAY;
        if (z4) {
            jsonReader.b();
        }
        float p4 = (float) jsonReader.p();
        float p5 = (float) jsonReader.p();
        while (jsonReader.k()) {
            jsonReader.C();
        }
        if (z4) {
            jsonReader.g();
        }
        return new com.airbnb.lottie.value.k((p4 / 100.0f) * f5, (p5 / 100.0f) * f5);
    }
}
