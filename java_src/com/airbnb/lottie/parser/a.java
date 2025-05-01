package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4132a = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55682a, "x", "y");

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.y() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.k()) {
                arrayList.add(z.a(jsonReader, kVar));
            }
            jsonReader.g();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(jsonReader, com.airbnb.lottie.utils.h.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.d();
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z4 = false;
        while (jsonReader.y() != JsonReader.Token.END_OBJECT) {
            int A = jsonReader.A(f4132a);
            if (A == 0) {
                eVar = a(jsonReader, kVar);
            } else if (A != 1) {
                if (A != 2) {
                    jsonReader.B();
                    jsonReader.C();
                } else if (jsonReader.y() == JsonReader.Token.STRING) {
                    jsonReader.C();
                    z4 = true;
                } else {
                    bVar2 = d.e(jsonReader, kVar);
                }
            } else if (jsonReader.y() == JsonReader.Token.STRING) {
                jsonReader.C();
                z4 = true;
            } else {
                bVar = d.e(jsonReader, kVar);
            }
        }
        jsonReader.h();
        if (z4) {
            kVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new com.airbnb.lottie.model.animatable.i(bVar, bVar2);
    }
}
