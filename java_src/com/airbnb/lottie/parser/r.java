package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: IntegerParser.java */
/* loaded from: classes2.dex */
public class r implements n0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f4248a = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public Integer a(JsonReader jsonReader, float f5) throws IOException {
        return Integer.valueOf(Math.round(s.g(jsonReader) * f5));
    }
}
