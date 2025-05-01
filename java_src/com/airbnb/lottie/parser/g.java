package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: ColorParser.java */
/* loaded from: classes2.dex */
public class g implements n0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4146a = new g();

    private g() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public Integer a(JsonReader jsonReader, float f5) throws IOException {
        boolean z4 = jsonReader.y() == JsonReader.Token.BEGIN_ARRAY;
        if (z4) {
            jsonReader.b();
        }
        double p4 = jsonReader.p();
        double p5 = jsonReader.p();
        double p6 = jsonReader.p();
        double p7 = jsonReader.y() == JsonReader.Token.NUMBER ? jsonReader.p() : 1.0d;
        if (z4) {
            jsonReader.g();
        }
        if (p4 <= 1.0d && p5 <= 1.0d && p6 <= 1.0d) {
            p4 *= 255.0d;
            p5 *= 255.0d;
            p6 *= 255.0d;
            if (p7 <= 1.0d) {
                p7 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) p7, (int) p4, (int) p5, (int) p6));
    }
}
