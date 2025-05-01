package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeGroupParser.java */
/* loaded from: classes2.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4159a = JsonReader.a.a("nm", "hd", "it");

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.l a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4159a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                z4 = jsonReader.l();
            } else if (A != 2) {
                jsonReader.C();
            } else {
                jsonReader.b();
                while (jsonReader.k()) {
                    com.airbnb.lottie.model.content.c a5 = h.a(jsonReader, kVar);
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
                jsonReader.g();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, arrayList, z4);
    }
}
