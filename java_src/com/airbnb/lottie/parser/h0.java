package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ShapeDataParser.java */
/* loaded from: classes2.dex */
public class h0 implements n0<com.airbnb.lottie.model.content.j> {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f4149a = new h0();

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4150b = JsonReader.a.a("c", "v", "i", "o");

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public com.airbnb.lottie.model.content.j a(JsonReader jsonReader, float f5) throws IOException {
        if (jsonReader.y() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4150b);
            if (A == 0) {
                z4 = jsonReader.l();
            } else if (A == 1) {
                list = s.f(jsonReader, f5);
            } else if (A == 2) {
                list2 = s.f(jsonReader, f5);
            } else if (A != 3) {
                jsonReader.B();
                jsonReader.C();
            } else {
                list3 = s.f(jsonReader, f5);
            }
        }
        jsonReader.h();
        if (jsonReader.y() == JsonReader.Token.END_ARRAY) {
            jsonReader.g();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new com.airbnb.lottie.model.content.j(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 1; i4 < size; i4++) {
                PointF pointF2 = list.get(i4);
                int i5 = i4 - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.g.a(list.get(i5), list3.get(i5)), com.airbnb.lottie.utils.g.a(pointF2, list2.get(i4)), pointF2));
            }
            if (z4) {
                PointF pointF3 = list.get(0);
                int i6 = size - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.g.a(list.get(i6), list3.get(i6)), com.airbnb.lottie.utils.g.a(pointF3, list2.get(0)), pointF3));
            }
            return new com.airbnb.lottie.model.content.j(pointF, z4, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
