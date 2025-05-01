package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* compiled from: KeyframeParser.java */
/* loaded from: classes2.dex */
class t {

    /* renamed from: a  reason: collision with root package name */
    private static final float f4251a = 100.0f;

    /* renamed from: c  reason: collision with root package name */
    private static SparseArrayCompat<WeakReference<Interpolator>> f4253c;

    /* renamed from: b  reason: collision with root package name */
    private static final Interpolator f4252b = new LinearInterpolator();

    /* renamed from: d  reason: collision with root package name */
    static JsonReader.a f4254d = JsonReader.a.a(bm.aM, "s", com.kwad.sdk.m.e.TAG, "o", "i", bm.aK, TypedValues.TransitionType.S_TO, "ti");

    /* renamed from: e  reason: collision with root package name */
    static JsonReader.a f4255e = JsonReader.a.a("x", "y");

    t() {
    }

    @Nullable
    private static WeakReference<Interpolator> a(int i4) {
        WeakReference<Interpolator> weakReference;
        synchronized (t.class) {
            weakReference = g().get(i4);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.airbnb.lottie.utils.g.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.g.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.g.c(pointF2.x, -1.0f, 1.0f);
        float c5 = com.airbnb.lottie.utils.g.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c5;
        int i4 = com.airbnb.lottie.utils.h.i(pointF.x, pointF.y, pointF2.x, c5);
        WeakReference<Interpolator> a5 = a(i4);
        Interpolator interpolator = a5 != null ? a5.get() : null;
        if (a5 == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e5) {
                if ("The Path cannot loop back on itself.".equals(e5.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i4, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> com.airbnb.lottie.value.a<T> c(JsonReader jsonReader, com.airbnb.lottie.k kVar, float f5, n0<T> n0Var, boolean z4, boolean z5) throws IOException {
        if (z4 && z5) {
            return e(kVar, jsonReader, f5, n0Var);
        }
        if (z4) {
            return d(kVar, jsonReader, f5, n0Var);
        }
        return f(jsonReader, f5, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.k kVar, JsonReader jsonReader, float f5, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t4;
        jsonReader.d();
        PointF pointF = null;
        PointF pointF2 = null;
        T t5 = null;
        T t6 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z4 = false;
        float f6 = 0.0f;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4254d)) {
                case 0:
                    f6 = (float) jsonReader.p();
                    break;
                case 1:
                    t6 = n0Var.a(jsonReader, f5);
                    break;
                case 2:
                    t5 = n0Var.a(jsonReader, f5);
                    break;
                case 3:
                    pointF = s.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = s.e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.r() != 1) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 6:
                    pointF3 = s.e(jsonReader, f5);
                    break;
                case 7:
                    pointF4 = s.e(jsonReader, f5);
                    break;
                default:
                    jsonReader.C();
                    break;
            }
        }
        jsonReader.h();
        if (z4) {
            interpolator2 = f4252b;
            t4 = t6;
        } else {
            if (pointF != null && pointF2 != null) {
                interpolator = b(pointF, pointF2);
            } else {
                interpolator = f4252b;
            }
            interpolator2 = interpolator;
            t4 = t5;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(kVar, t6, t4, interpolator2, f6, null);
        aVar.f4350o = pointF3;
        aVar.f4351p = pointF4;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.k kVar, JsonReader jsonReader, float f5, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b5;
        Interpolator b6;
        T t4;
        PointF pointF;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF2;
        float f6;
        PointF pointF3;
        jsonReader.d();
        PointF pointF4 = null;
        boolean z4 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t5 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f7 = 0.0f;
        PointF pointF11 = null;
        T t6 = null;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4254d)) {
                case 0:
                    pointF2 = pointF4;
                    f7 = (float) jsonReader.p();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t5 = n0Var.a(jsonReader, f5);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t6 = n0Var.a(jsonReader, f5);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f6 = f7;
                    PointF pointF12 = pointF11;
                    if (jsonReader.y() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.d();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.k()) {
                            int A = jsonReader.A(f4255e);
                            if (A == 0) {
                                JsonReader.Token y2 = jsonReader.y();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (y2 == token) {
                                    f10 = (float) jsonReader.p();
                                    f8 = f10;
                                } else {
                                    jsonReader.b();
                                    f8 = (float) jsonReader.p();
                                    f10 = jsonReader.y() == token ? (float) jsonReader.p() : f8;
                                    jsonReader.g();
                                }
                            } else if (A != 1) {
                                jsonReader.C();
                            } else {
                                JsonReader.Token y4 = jsonReader.y();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (y4 == token2) {
                                    f11 = (float) jsonReader.p();
                                    f9 = f11;
                                } else {
                                    jsonReader.b();
                                    f9 = (float) jsonReader.p();
                                    f11 = jsonReader.y() == token2 ? (float) jsonReader.p() : f9;
                                    jsonReader.g();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f8, f9);
                        PointF pointF14 = new PointF(f10, f11);
                        jsonReader.h();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f7 = f6;
                        break;
                    } else {
                        pointF5 = s.e(jsonReader, f5);
                        f7 = f6;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (jsonReader.y() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.d();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        while (jsonReader.k()) {
                            PointF pointF15 = pointF11;
                            int A2 = jsonReader.A(f4255e);
                            if (A2 != 0) {
                                pointF3 = pointF4;
                                if (A2 != 1) {
                                    jsonReader.C();
                                } else {
                                    JsonReader.Token y5 = jsonReader.y();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (y5 == token3) {
                                        f15 = (float) jsonReader.p();
                                        f7 = f7;
                                        f13 = f15;
                                    } else {
                                        float f16 = f7;
                                        jsonReader.b();
                                        float p4 = (float) jsonReader.p();
                                        float p5 = jsonReader.y() == token3 ? (float) jsonReader.p() : p4;
                                        jsonReader.g();
                                        f7 = f16;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f15 = p5;
                                        f13 = p4;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f17 = f7;
                                JsonReader.Token y6 = jsonReader.y();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (y6 == token4) {
                                    f14 = (float) jsonReader.p();
                                    f7 = f17;
                                    f12 = f14;
                                } else {
                                    jsonReader.b();
                                    f12 = (float) jsonReader.p();
                                    f14 = jsonReader.y() == token4 ? (float) jsonReader.p() : f12;
                                    jsonReader.g();
                                    f7 = f17;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f6 = f7;
                        PointF pointF16 = new PointF(f12, f13);
                        PointF pointF17 = new PointF(f14, f15);
                        jsonReader.h();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f7 = f6;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(jsonReader, f5);
                        break;
                    }
                case 5:
                    if (jsonReader.r() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                        continue;
                    }
                case 6:
                    pointF11 = s.e(jsonReader, f5);
                    continue;
                case 7:
                    pointF4 = s.e(jsonReader, f5);
                    continue;
                default:
                    pointF2 = pointF4;
                    jsonReader.C();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f18 = f7;
        PointF pointF19 = pointF11;
        jsonReader.h();
        if (z4) {
            interpolator = f4252b;
            t4 = t5;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b5 = b(pointF7, pointF9);
                b6 = b(pointF8, pointF10);
                t4 = t6;
                interpolator = null;
                if (b5 == null && b6 != null) {
                    pointF = pointF19;
                    aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, b5, b6, f18, null);
                } else {
                    pointF = pointF19;
                    aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, interpolator, f18, null);
                }
                aVar.f4350o = pointF;
                aVar.f4351p = pointF18;
                return aVar;
            } else {
                interpolator = f4252b;
            }
            t4 = t6;
        }
        b5 = null;
        b6 = null;
        if (b5 == null) {
        }
        pointF = pointF19;
        aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, interpolator, f18, null);
        aVar.f4350o = pointF;
        aVar.f4351p = pointF18;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(JsonReader jsonReader, float f5, n0<T> n0Var) throws IOException {
        return new com.airbnb.lottie.value.a<>(n0Var.a(jsonReader, f5));
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (f4253c == null) {
            f4253c = new SparseArrayCompat<>();
        }
        return f4253c;
    }

    private static void h(int i4, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f4253c.put(i4, weakReference);
        }
    }
}
