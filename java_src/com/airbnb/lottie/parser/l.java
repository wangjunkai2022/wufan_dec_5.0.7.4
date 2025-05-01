package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: FloatParser.java */
/* loaded from: classes2.dex */
public class l implements n0<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4168a = new l();

    private l() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public Float a(JsonReader jsonReader, float f5) throws IOException {
        return Float.valueOf(s.g(jsonReader) * f5);
    }
}
