package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientStrokeParser.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4245a = JsonReader.a.a("nm", "g", "o", bm.aM, "s", com.kwad.sdk.m.e.TAG, "w", "lc", "lj", "ml", "hd", com.kuaishou.weapon.p0.t.f55701t);

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4246b = JsonReader.a.a("p", com.kuaishou.weapon.p0.t.f55682a);

    /* renamed from: c  reason: collision with root package name */
    private static final JsonReader.a f4247c = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55689h, "v");

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.f a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.c cVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVar2 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f5 = 0.0f;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4245a)) {
                case 0:
                    str = jsonReader.u();
                    break;
                case 1:
                    int i4 = -1;
                    jsonReader.d();
                    while (jsonReader.k()) {
                        int A = jsonReader.A(f4246b);
                        if (A != 0) {
                            cVar = cVar2;
                            if (A != 1) {
                                jsonReader.B();
                                jsonReader.C();
                            } else {
                                cVar2 = d.g(jsonReader, kVar, i4);
                            }
                        } else {
                            cVar = cVar2;
                            i4 = jsonReader.r();
                        }
                        cVar2 = cVar;
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
                    bVar = d.e(jsonReader, kVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.r() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.r() - 1];
                    break;
                case 9:
                    f5 = (float) jsonReader.p();
                    break;
                case 10:
                    z4 = jsonReader.l();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.k()) {
                        jsonReader.d();
                        String str2 = null;
                        com.airbnb.lottie.model.animatable.b bVar3 = null;
                        while (jsonReader.k()) {
                            int A2 = jsonReader.A(f4247c);
                            if (A2 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar4 = bVar2;
                                if (A2 != 1) {
                                    jsonReader.B();
                                    jsonReader.C();
                                } else {
                                    bVar3 = d.e(jsonReader, kVar);
                                }
                                bVar2 = bVar4;
                            } else {
                                str2 = jsonReader.u();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar5 = bVar2;
                        jsonReader.h();
                        if (str2.equals("o")) {
                            bVar2 = bVar3;
                        } else {
                            if (str2.equals(com.kuaishou.weapon.p0.t.f55701t) || str2.equals("g")) {
                                kVar.y(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar5;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar6 = bVar2;
                    jsonReader.g();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    bVar2 = bVar6;
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(str, gradientType, cVar2, dVar, fVar, fVar2, bVar, lineCapType, lineJoinType, f5, arrayList, bVar2, z4);
    }
}
