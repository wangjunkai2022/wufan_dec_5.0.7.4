package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.animation.content.k;
import com.airbnb.lottie.model.content.j;
import java.util.List;
/* compiled from: MiscUtils.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final PointF f4317a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d5, double d6, double d7) {
        return Math.max(d6, Math.min(d7, d5));
    }

    public static float c(float f5, float f6, float f7) {
        return Math.max(f6, Math.min(f7, f5));
    }

    public static int d(int i4, int i5, int i6) {
        return Math.max(i5, Math.min(i6, i4));
    }

    public static boolean e(float f5, float f6, float f7) {
        return f5 >= f6 && f5 <= f7;
    }

    private static int f(int i4, int i5) {
        int i6 = i4 / i5;
        return (((i4 ^ i5) >= 0) || i4 % i5 == 0) ? i6 : i6 - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(float f5, float f6) {
        return h((int) f5, (int) f6);
    }

    private static int h(int i4, int i5) {
        return i4 - (i5 * f(i4, i5));
    }

    public static void i(j jVar, Path path) {
        path.reset();
        PointF b5 = jVar.b();
        path.moveTo(b5.x, b5.y);
        f4317a.set(b5.x, b5.y);
        for (int i4 = 0; i4 < jVar.a().size(); i4++) {
            com.airbnb.lottie.model.a aVar = jVar.a().get(i4);
            PointF a5 = aVar.a();
            PointF b6 = aVar.b();
            PointF c5 = aVar.c();
            PointF pointF = f4317a;
            if (a5.equals(pointF) && b6.equals(c5)) {
                path.lineTo(c5.x, c5.y);
            } else {
                path.cubicTo(a5.x, a5.y, b6.x, b6.y, c5.x, c5.y);
            }
            pointF.set(c5.x, c5.y);
        }
        if (jVar.d()) {
            path.close();
        }
    }

    public static double j(double d5, double d6, @FloatRange(from = 0.0d, to = 1.0d) double d7) {
        return d5 + (d7 * (d6 - d5));
    }

    public static float k(float f5, float f6, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        return f5 + (f7 * (f6 - f5));
    }

    public static int l(int i4, int i5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (int) (i4 + (f5 * (i5 - i4)));
    }

    public static void m(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2, k kVar) {
        if (dVar.c(kVar.getName(), i4)) {
            list.add(dVar2.a(kVar.getName()).j(kVar));
        }
    }
}
