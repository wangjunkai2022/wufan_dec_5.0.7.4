package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonUtils.java */
/* loaded from: classes2.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4249a = JsonReader.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonUtils.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4250a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f4250a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4250a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4250a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(JsonReader jsonReader, float f5) throws IOException {
        jsonReader.b();
        float p4 = (float) jsonReader.p();
        float p5 = (float) jsonReader.p();
        while (jsonReader.y() != JsonReader.Token.END_ARRAY) {
            jsonReader.C();
        }
        jsonReader.g();
        return new PointF(p4 * f5, p5 * f5);
    }

    private static PointF b(JsonReader jsonReader, float f5) throws IOException {
        float p4 = (float) jsonReader.p();
        float p5 = (float) jsonReader.p();
        while (jsonReader.k()) {
            jsonReader.C();
        }
        return new PointF(p4 * f5, p5 * f5);
    }

    private static PointF c(JsonReader jsonReader, float f5) throws IOException {
        jsonReader.d();
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4249a);
            if (A == 0) {
                f6 = g(jsonReader);
            } else if (A != 1) {
                jsonReader.B();
                jsonReader.C();
            } else {
                f7 = g(jsonReader);
            }
        }
        jsonReader.h();
        return new PointF(f6 * f5, f7 * f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        int p4 = (int) (jsonReader.p() * 255.0d);
        int p5 = (int) (jsonReader.p() * 255.0d);
        int p6 = (int) (jsonReader.p() * 255.0d);
        while (jsonReader.k()) {
            jsonReader.C();
        }
        jsonReader.g();
        return Color.argb(255, p4, p5, p6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(JsonReader jsonReader, float f5) throws IOException {
        int i4 = a.f4250a[jsonReader.y().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return c(jsonReader, f5);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.y());
            }
            return a(jsonReader, f5);
        }
        return b(jsonReader, f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(JsonReader jsonReader, float f5) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.y() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(e(jsonReader, f5));
            jsonReader.g();
        }
        jsonReader.g();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token y2 = jsonReader.y();
        int i4 = a.f4250a[y2.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                jsonReader.b();
                float p4 = (float) jsonReader.p();
                while (jsonReader.k()) {
                    jsonReader.C();
                }
                jsonReader.g();
                return p4;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + y2);
        }
        return (float) jsonReader.p();
    }
}
