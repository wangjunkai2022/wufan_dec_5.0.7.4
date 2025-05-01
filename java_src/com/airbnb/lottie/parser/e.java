package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BlurEffectParser.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4141a = JsonReader.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4142b = JsonReader.a.a(m.a.f71495i, "v");

    e() {
    }

    @Nullable
    private static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.d();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z4 = false;
            while (jsonReader.k()) {
                int A = jsonReader.A(f4142b);
                if (A != 0) {
                    if (A != 1) {
                        jsonReader.B();
                        jsonReader.C();
                    } else if (z4) {
                        aVar = new com.airbnb.lottie.model.content.a(d.e(jsonReader, kVar));
                    } else {
                        jsonReader.C();
                    }
                } else if (jsonReader.r() == 0) {
                    z4 = true;
                }
            }
            jsonReader.h();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static com.airbnb.lottie.model.content.a b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (jsonReader.k()) {
            if (jsonReader.A(f4141a) != 0) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.b();
                while (jsonReader.k()) {
                    com.airbnb.lottie.model.content.a a5 = a(jsonReader, kVar);
                    if (a5 != null) {
                        aVar = a5;
                    }
                }
                jsonReader.g();
            }
        }
        return aVar;
    }
}
