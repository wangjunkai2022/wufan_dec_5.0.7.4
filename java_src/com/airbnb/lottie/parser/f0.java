package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: RoundedCornersParser.java */
/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4145a = JsonReader.a.a("nm", "r", "hd");

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static com.airbnb.lottie.model.content.i a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4145a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                bVar = d.f(jsonReader, kVar, true);
            } else if (A != 2) {
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        if (z4) {
            return null;
        }
        return new com.airbnb.lottie.model.content.i(str, bVar);
    }
}
