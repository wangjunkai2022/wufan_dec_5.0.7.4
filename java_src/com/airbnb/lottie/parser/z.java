package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: PathKeyframeParser.java */
/* loaded from: classes2.dex */
class z {
    private z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.animation.keyframe.i a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.animation.keyframe.i(kVar, t.c(jsonReader, kVar, com.airbnb.lottie.utils.h.e(), a0.f4133a, jsonReader.y() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
