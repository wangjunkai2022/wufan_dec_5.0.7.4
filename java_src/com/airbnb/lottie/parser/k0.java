package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.IOException;
/* compiled from: ShapePathParser.java */
/* loaded from: classes2.dex */
class k0 {

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f4167a = JsonReader.a.a("nm", "ind", MediationConstant.ADN_KS, "hd");

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.m a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        int i4 = 0;
        String str = null;
        com.airbnb.lottie.model.animatable.h hVar = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4167a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                i4 = jsonReader.r();
            } else if (A == 2) {
                hVar = d.k(jsonReader, kVar);
            } else if (A != 3) {
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        return new com.airbnb.lottie.model.content.m(str, i4, hVar, z4);
    }
}
