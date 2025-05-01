package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4169a = JsonReader.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", com.kuaishou.weapon.p0.t.f55701t);

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4170b = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55689h, "v");

    private l0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ShapeStroke a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        char c5;
        ArrayList arrayList = new ArrayList();
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f5 = 0.0f;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4169a)) {
                case 0:
                    str = jsonReader.u();
                    break;
                case 1:
                    aVar = d.c(jsonReader, kVar);
                    break;
                case 2:
                    bVar2 = d.e(jsonReader, kVar);
                    break;
                case 3:
                    dVar = d.h(jsonReader, kVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.r() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.r() - 1];
                    break;
                case 6:
                    f5 = (float) jsonReader.p();
                    break;
                case 7:
                    z4 = jsonReader.l();
                    break;
                case 8:
                    jsonReader.b();
                    while (jsonReader.k()) {
                        jsonReader.d();
                        String str2 = null;
                        com.airbnb.lottie.model.animatable.b bVar3 = null;
                        while (jsonReader.k()) {
                            int A = jsonReader.A(f4170b);
                            if (A == 0) {
                                str2 = jsonReader.u();
                            } else if (A != 1) {
                                jsonReader.B();
                                jsonReader.C();
                            } else {
                                bVar3 = d.e(jsonReader, kVar);
                            }
                        }
                        jsonReader.h();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(com.kuaishou.weapon.p0.t.f55701t)) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                            case 1:
                                kVar.y(true);
                                arrayList.add(bVar3);
                                break;
                            case 2:
                                bVar = bVar3;
                                break;
                        }
                    }
                    jsonReader.g();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.C();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new ShapeStroke(str, bVar, arrayList, aVar, dVar, bVar2, lineCapType, lineJoinType, f5, z4);
    }
}
