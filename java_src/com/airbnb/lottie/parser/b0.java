package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: PointFParser.java */
/* loaded from: classes2.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f4136a = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public PointF a(JsonReader jsonReader, float f5) throws IOException {
        JsonReader.Token y2 = jsonReader.y();
        if (y2 == JsonReader.Token.BEGIN_ARRAY) {
            return s.e(jsonReader, f5);
        }
        if (y2 == JsonReader.Token.BEGIN_OBJECT) {
            return s.e(jsonReader, f5);
        }
        if (y2 == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.p()) * f5, ((float) jsonReader.p()) * f5);
            while (jsonReader.k()) {
                jsonReader.C();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + y2);
    }
}
