package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontCharacterParser.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4171a = JsonReader.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4172b = JsonReader.a.a("shapes");

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.c a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        String str = null;
        String str2 = null;
        double d5 = 0.0d;
        double d6 = 0.0d;
        char c5 = 0;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4171a);
            if (A == 0) {
                c5 = jsonReader.u().charAt(0);
            } else if (A == 1) {
                d5 = jsonReader.p();
            } else if (A == 2) {
                d6 = jsonReader.p();
            } else if (A == 3) {
                str = jsonReader.u();
            } else if (A == 4) {
                str2 = jsonReader.u();
            } else if (A != 5) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.d();
                while (jsonReader.k()) {
                    if (jsonReader.A(f4172b) != 0) {
                        jsonReader.B();
                        jsonReader.C();
                    } else {
                        jsonReader.b();
                        while (jsonReader.k()) {
                            arrayList.add((com.airbnb.lottie.model.content.l) h.a(jsonReader, kVar));
                        }
                        jsonReader.g();
                    }
                }
                jsonReader.h();
            }
        }
        jsonReader.h();
        return new com.airbnb.lottie.model.c(arrayList, c5, d5, d6, str, str2);
    }
}
