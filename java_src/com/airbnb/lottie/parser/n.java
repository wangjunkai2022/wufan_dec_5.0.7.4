package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: FontParser.java */
/* loaded from: classes2.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4241a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.b a(JsonReader jsonReader) throws IOException {
        jsonReader.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f5 = 0.0f;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4241a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                str2 = jsonReader.u();
            } else if (A == 2) {
                str3 = jsonReader.u();
            } else if (A != 3) {
                jsonReader.B();
                jsonReader.C();
            } else {
                f5 = (float) jsonReader.p();
            }
        }
        jsonReader.h();
        return new com.airbnb.lottie.model.b(str, str2, str3, f5);
    }
}
