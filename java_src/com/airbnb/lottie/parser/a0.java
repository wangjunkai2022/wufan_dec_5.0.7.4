package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: PathParser.java */
/* loaded from: classes2.dex */
public class a0 implements n0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f4133a = new a0();

    private a0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public PointF a(JsonReader jsonReader, float f5) throws IOException {
        return s.e(jsonReader, f5);
    }
}
