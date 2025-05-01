package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.s0;
import java.util.List;
/* compiled from: PolystarContent.java */
/* loaded from: classes2.dex */
public class o implements n, a.b, k {

    /* renamed from: p  reason: collision with root package name */
    private static final float f3700p = 0.47829f;

    /* renamed from: q  reason: collision with root package name */
    private static final float f3701q = 0.25f;

    /* renamed from: b  reason: collision with root package name */
    private final String f3703b;

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f3704c;

    /* renamed from: d  reason: collision with root package name */
    private final PolystarShape.Type f3705d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3706e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3707f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3708g;

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f3709h;

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3710i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3711j;

    /* renamed from: k  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3712k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3713l;

    /* renamed from: m  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3714m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3716o;

    /* renamed from: a  reason: collision with root package name */
    private final Path f3702a = new Path();

    /* renamed from: n  reason: collision with root package name */
    private final b f3715n = new b();

    /* compiled from: PolystarContent.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3717a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f3717a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3717a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, PolystarShape polystarShape) {
        this.f3704c = lottieDrawable;
        this.f3703b = polystarShape.d();
        PolystarShape.Type type = polystarShape.getType();
        this.f3705d = type;
        this.f3706e = polystarShape.j();
        this.f3707f = polystarShape.k();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = polystarShape.g().a();
        this.f3708g = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = polystarShape.h().a();
        this.f3709h = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = polystarShape.i().a();
        this.f3710i = a7;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = polystarShape.e().a();
        this.f3712k = a8;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = polystarShape.f().a();
        this.f3714m = a9;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f3711j = polystarShape.b().a();
            this.f3713l = polystarShape.c().a();
        } else {
            this.f3711j = null;
            this.f3713l = null;
        }
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        bVar.i(a8);
        bVar.i(a9);
        if (type == type2) {
            bVar.i(this.f3711j);
            bVar.i(this.f3713l);
        }
        a5.a(this);
        a6.a(this);
        a7.a(this);
        a8.a(this);
        a9.a(this);
        if (type == type2) {
            this.f3711j.a(this);
            this.f3713l.a(this);
        }
    }

    private void g() {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        double d5;
        double d6;
        double d7;
        int i4;
        int floor = (int) Math.floor(this.f3708g.h().floatValue());
        double radians = Math.toRadians((this.f3710i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d8 = floor;
        Double.isNaN(d8);
        float floatValue = this.f3714m.h().floatValue() / 100.0f;
        float floatValue2 = this.f3712k.h().floatValue();
        double d9 = floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d9);
        float f5 = (float) (cos * d9);
        double sin = Math.sin(radians);
        Double.isNaN(d9);
        float f6 = (float) (sin * d9);
        this.f3702a.moveTo(f5, f6);
        double d10 = (float) (6.283185307179586d / d8);
        Double.isNaN(d10);
        double d11 = radians + d10;
        double ceil = Math.ceil(d8);
        int i5 = 0;
        while (i5 < ceil) {
            double cos2 = Math.cos(d11);
            Double.isNaN(d9);
            float f7 = (float) (cos2 * d9);
            double sin2 = Math.sin(d11);
            Double.isNaN(d9);
            double d12 = ceil;
            float f8 = (float) (d9 * sin2);
            if (floatValue != 0.0f) {
                d6 = d9;
                i4 = i5;
                d5 = d11;
                double atan2 = (float) (Math.atan2(f6, f5) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d7 = d10;
                double atan22 = (float) (Math.atan2(f8, f7) - 1.5707963267948966d);
                float f9 = floatValue2 * floatValue * f3701q;
                this.f3702a.cubicTo(f5 - (cos3 * f9), f6 - (((float) Math.sin(atan2)) * f9), f7 + (((float) Math.cos(atan22)) * f9), f8 + (f9 * ((float) Math.sin(atan22))), f7, f8);
            } else {
                d5 = d11;
                d6 = d9;
                d7 = d10;
                i4 = i5;
                this.f3702a.lineTo(f7, f8);
            }
            Double.isNaN(d7);
            d11 = d5 + d7;
            i5 = i4 + 1;
            f6 = f8;
            f5 = f7;
            ceil = d12;
            d9 = d6;
            d10 = d7;
        }
        PointF h4 = this.f3709h.h();
        this.f3702a.offset(h4.x, h4.y);
        this.f3702a.close();
    }

    private void i() {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        double d5;
        float f5;
        float f6;
        float f7;
        float f8;
        double d6;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        double d7;
        float f15;
        float f16;
        float floatValue = this.f3708g.h().floatValue();
        double radians = Math.toRadians((this.f3710i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d8 = floatValue;
        Double.isNaN(d8);
        float f17 = (float) (6.283185307179586d / d8);
        if (this.f3707f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue - ((int) floatValue);
        if (f19 != 0.0f) {
            double d9 = (1.0f - f19) * f18;
            Double.isNaN(d9);
            radians += d9;
        }
        float floatValue2 = this.f3712k.h().floatValue();
        float floatValue3 = this.f3711j.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f3713l;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f3714m;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f19 != 0.0f) {
            float f20 = ((floatValue2 - floatValue3) * f19) + floatValue3;
            double d10 = f20;
            double cos = Math.cos(radians);
            Double.isNaN(d10);
            d5 = d8;
            float f21 = (float) (d10 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d10);
            float f22 = (float) (d10 * sin);
            this.f3702a.moveTo(f21, f22);
            double d11 = (f17 * f19) / 2.0f;
            Double.isNaN(d11);
            d6 = radians + d11;
            f7 = f21;
            f9 = f20;
            f5 = floatValue2;
            f8 = f22;
            f6 = f18;
        } else {
            d5 = d8;
            f5 = floatValue2;
            double d12 = f5;
            double cos2 = Math.cos(radians);
            Double.isNaN(d12);
            f6 = f18;
            f7 = (float) (d12 * cos2);
            double sin2 = Math.sin(radians);
            Double.isNaN(d12);
            f8 = (float) (d12 * sin2);
            this.f3702a.moveTo(f7, f8);
            double d13 = f6;
            Double.isNaN(d13);
            d6 = radians + d13;
            f9 = 0.0f;
        }
        double ceil = Math.ceil(d5) * 2.0d;
        int i4 = 0;
        float f23 = floatValue5;
        boolean z4 = false;
        while (true) {
            double d14 = i4;
            if (d14 < ceil) {
                float f24 = z4 ? f5 : floatValue3;
                float f25 = (f9 == 0.0f || d14 != ceil - 2.0d) ? f6 : (f17 * f19) / 2.0f;
                if (f9 == 0.0f || d14 != ceil - 1.0d) {
                    f10 = f17;
                    f11 = f24;
                    f12 = f5;
                } else {
                    f10 = f17;
                    f12 = f5;
                    f11 = f9;
                }
                double d15 = f11;
                double cos3 = Math.cos(d6);
                Double.isNaN(d15);
                float f26 = (float) (d15 * cos3);
                double sin3 = Math.sin(d6);
                Double.isNaN(d15);
                float f27 = (float) (d15 * sin3);
                if (floatValue4 == 0.0f && f23 == 0.0f) {
                    this.f3702a.lineTo(f26, f27);
                    d7 = d6;
                    f13 = floatValue3;
                    f14 = floatValue4;
                    f15 = f6;
                    f16 = f25;
                } else {
                    f13 = floatValue3;
                    f14 = floatValue4;
                    double atan2 = (float) (Math.atan2(f8, f7) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    d7 = d6;
                    f15 = f6;
                    f16 = f25;
                    double atan22 = (float) (Math.atan2(f27, f26) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f28 = z4 ? f14 : f23;
                    float f29 = z4 ? f23 : f14;
                    float f30 = z4 ? f13 : f12;
                    float f31 = z4 ? f12 : f13;
                    float f32 = f30 * f28 * f3700p;
                    float f33 = cos4 * f32;
                    float f34 = f32 * sin4;
                    float f35 = f31 * f29 * f3700p;
                    float f36 = cos5 * f35;
                    float f37 = f35 * sin5;
                    if (f19 != 0.0f) {
                        if (i4 == 0) {
                            f33 *= f19;
                            f34 *= f19;
                        } else if (d14 == ceil - 1.0d) {
                            f36 *= f19;
                            f37 *= f19;
                        }
                    }
                    this.f3702a.cubicTo(f7 - f33, f8 - f34, f26 + f36, f27 + f37, f26, f27);
                }
                double d16 = f16;
                Double.isNaN(d16);
                z4 = !z4;
                i4++;
                f8 = f27;
                d6 = d7 + d16;
                f6 = f15;
                f7 = f26;
                f5 = f12;
                f17 = f10;
                floatValue3 = f13;
                floatValue4 = f14;
            } else {
                PointF h4 = this.f3709h.h();
                this.f3702a.offset(h4.x, h4.y);
                this.f3702a.close();
                return;
            }
        }
    }

    private void j() {
        this.f3716o = false;
        this.f3704c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        j();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f3715n.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t4 == s0.f4291w) {
            this.f3708g.n(jVar);
        } else if (t4 == s0.f4292x) {
            this.f3710i.n(jVar);
        } else if (t4 == s0.f4282n) {
            this.f3709h.n(jVar);
        } else if (t4 == s0.f4293y && (aVar2 = this.f3711j) != null) {
            aVar2.n(jVar);
        } else if (t4 == s0.f4294z) {
            this.f3712k.n(jVar);
        } else if (t4 == s0.A && (aVar = this.f3713l) != null) {
            aVar.n(jVar);
        } else if (t4 == s0.B) {
            this.f3714m.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.g.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3703b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f3716o) {
            return this.f3702a;
        }
        this.f3702a.reset();
        if (this.f3706e) {
            this.f3716o = true;
            return this.f3702a;
        }
        int i4 = a.f3717a[this.f3705d.ordinal()];
        if (i4 == 1) {
            i();
        } else if (i4 == 2) {
            g();
        }
        this.f3702a.close();
        this.f3715n.b(this.f3702a);
        this.f3716o = true;
        return this.f3702a;
    }
}
