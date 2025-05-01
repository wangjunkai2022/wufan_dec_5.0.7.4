package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
/* compiled from: PolystarShapeParser.java */
/* loaded from: classes2.dex */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4139a = JsonReader.a.a("nm", "sy", "pt", "p", "r", "or", bm.f63463x, "ir", bm.ae, "hd", com.kuaishou.weapon.p0.t.f55701t);

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PolystarShape a(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i4) throws IOException {
        boolean z4 = i4 == 3;
        String str = null;
        PolystarShape.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        boolean z5 = false;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4139a)) {
                case 0:
                    str = jsonReader.u();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.r());
                    break;
                case 2:
                    bVar = d.f(jsonReader, kVar, false);
                    break;
                case 3:
                    mVar = a.b(jsonReader, kVar);
                    break;
                case 4:
                    bVar2 = d.f(jsonReader, kVar, false);
                    break;
                case 5:
                    bVar4 = d.e(jsonReader, kVar);
                    break;
                case 6:
                    bVar6 = d.f(jsonReader, kVar, false);
                    break;
                case 7:
                    bVar3 = d.e(jsonReader, kVar);
                    break;
                case 8:
                    bVar5 = d.f(jsonReader, kVar, false);
                    break;
                case 9:
                    z5 = jsonReader.l();
                    break;
                case 10:
                    if (jsonReader.r() != 3) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z5, z4);
    }
}
