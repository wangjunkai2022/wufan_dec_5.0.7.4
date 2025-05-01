package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;
/* compiled from: ShapeFillParser.java */
/* loaded from: classes2.dex */
class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4153a = JsonReader.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.k a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        int i4 = 1;
        boolean z4 = false;
        boolean z5 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4153a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                aVar = d.c(jsonReader, kVar);
            } else if (A == 2) {
                dVar = d.h(jsonReader, kVar);
            } else if (A == 3) {
                z4 = jsonReader.l();
            } else if (A == 4) {
                i4 = jsonReader.r();
            } else if (A != 5) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z5 = jsonReader.l();
            }
        }
        return new com.airbnb.lottie.model.content.k(str, z4, i4 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVar, z5);
    }
}
