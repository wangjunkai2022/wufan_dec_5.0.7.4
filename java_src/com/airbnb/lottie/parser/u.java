package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KeyframesParser.java */
/* loaded from: classes2.dex */
class u {

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f4256a = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55682a);

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.k kVar, float f5, n0<T> n0Var, boolean z4) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.y() == JsonReader.Token.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.d();
        while (jsonReader.k()) {
            if (jsonReader.A(f4256a) != 0) {
                jsonReader.C();
            } else if (jsonReader.y() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.y() == JsonReader.Token.NUMBER) {
                    arrayList.add(t.c(jsonReader, kVar, f5, n0Var, false, z4));
                } else {
                    while (jsonReader.k()) {
                        arrayList.add(t.c(jsonReader, kVar, f5, n0Var, true, z4));
                    }
                }
                jsonReader.g();
            } else {
                arrayList.add(t.c(jsonReader, kVar, f5, n0Var, false, z4));
            }
        }
        jsonReader.h();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i4;
        T t4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            i4 = size - 1;
            if (i5 >= i4) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i5);
            i5++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i5);
            aVar.f4343h = Float.valueOf(aVar2.f4342g);
            if (aVar.f4338c == null && (t4 = aVar2.f4337b) != null) {
                aVar.f4338c = t4;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).i();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i4);
        if ((aVar3.f4337b == null || aVar3.f4338c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
