package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientFillParser.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4243a = JsonReader.a.a("nm", "g", "o", bm.aM, "s", com.kwad.sdk.m.e.TAG, "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4244b = JsonReader.a.a("p", com.kuaishou.weapon.p0.t.f55682a);

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.e a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4243a)) {
                case 0:
                    str = jsonReader.u();
                    break;
                case 1:
                    int i4 = -1;
                    jsonReader.d();
                    while (jsonReader.k()) {
                        int A = jsonReader.A(f4244b);
                        if (A == 0) {
                            i4 = jsonReader.r();
                        } else if (A != 1) {
                            jsonReader.B();
                            jsonReader.C();
                        } else {
                            cVar = d.g(jsonReader, kVar, i4);
                        }
                    }
                    jsonReader.h();
                    break;
                case 2:
                    dVar = d.h(jsonReader, kVar);
                    break;
                case 3:
                    gradientType = jsonReader.r() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVar = d.i(jsonReader, kVar);
                    break;
                case 5:
                    fVar2 = d.i(jsonReader, kVar);
                    break;
                case 6:
                    fillType = jsonReader.r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z4 = jsonReader.l();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.e(str, gradientType, fillType, cVar, dVar == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVar, fVar, fVar2, null, null, z4);
    }
}
