package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.s0;
import java.util.Collections;
/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f3813a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f3814b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f3815c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f3816d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f3817e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private a<PointF, PointF> f3818f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private a<?, PointF> f3819g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f3820h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private a<Float, Float> f3821i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private a<Integer, Integer> f3822j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private d f3823k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private d f3824l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private a<?, Float> f3825m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private a<?, Float> f3826n;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        this.f3818f = lVar.c() == null ? null : lVar.c().a();
        this.f3819g = lVar.f() == null ? null : lVar.f().a();
        this.f3820h = lVar.h() == null ? null : lVar.h().a();
        this.f3821i = lVar.g() == null ? null : lVar.g().a();
        d dVar = lVar.i() == null ? null : (d) lVar.i().a();
        this.f3823k = dVar;
        if (dVar != null) {
            this.f3814b = new Matrix();
            this.f3815c = new Matrix();
            this.f3816d = new Matrix();
            this.f3817e = new float[9];
        } else {
            this.f3814b = null;
            this.f3815c = null;
            this.f3816d = null;
            this.f3817e = null;
        }
        this.f3824l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.f3822j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f3825m = lVar.k().a();
        } else {
            this.f3825m = null;
        }
        if (lVar.d() != null) {
            this.f3826n = lVar.d().a();
        } else {
            this.f3826n = null;
        }
    }

    private void d() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f3817e[i4] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.f3822j);
        bVar.i(this.f3825m);
        bVar.i(this.f3826n);
        bVar.i(this.f3818f);
        bVar.i(this.f3819g);
        bVar.i(this.f3820h);
        bVar.i(this.f3821i);
        bVar.i(this.f3823k);
        bVar.i(this.f3824l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f3822j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f3825m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f3826n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f3818f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f3819g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f3820h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f3821i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f3823k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f3824l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f4274f) {
            a<PointF, PointF> aVar = this.f3818f;
            if (aVar == null) {
                this.f3818f = new q(jVar, new PointF());
                return true;
            }
            aVar.n(jVar);
            return true;
        } else if (t4 == s0.f4275g) {
            a<?, PointF> aVar2 = this.f3819g;
            if (aVar2 == null) {
                this.f3819g = new q(jVar, new PointF());
                return true;
            }
            aVar2.n(jVar);
            return true;
        } else {
            if (t4 == s0.f4276h) {
                a<?, PointF> aVar3 = this.f3819g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).r(jVar);
                    return true;
                }
            }
            if (t4 == s0.f4277i) {
                a<?, PointF> aVar4 = this.f3819g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).s(jVar);
                    return true;
                }
            }
            if (t4 == s0.f4283o) {
                a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f3820h;
                if (aVar5 == null) {
                    this.f3820h = new q(jVar, new com.airbnb.lottie.value.k());
                    return true;
                }
                aVar5.n(jVar);
                return true;
            } else if (t4 == s0.f4284p) {
                a<Float, Float> aVar6 = this.f3821i;
                if (aVar6 == null) {
                    this.f3821i = new q(jVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.n(jVar);
                return true;
            } else if (t4 == s0.f4271c) {
                a<Integer, Integer> aVar7 = this.f3822j;
                if (aVar7 == null) {
                    this.f3822j = new q(jVar, 100);
                    return true;
                }
                aVar7.n(jVar);
                return true;
            } else if (t4 == s0.C) {
                a<?, Float> aVar8 = this.f3825m;
                if (aVar8 == null) {
                    this.f3825m = new q(jVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.n(jVar);
                return true;
            } else if (t4 == s0.D) {
                a<?, Float> aVar9 = this.f3826n;
                if (aVar9 == null) {
                    this.f3826n = new q(jVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.n(jVar);
                return true;
            } else if (t4 == s0.f4285q) {
                if (this.f3823k == null) {
                    this.f3823k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
                }
                this.f3823k.n(jVar);
                return true;
            } else if (t4 == s0.f4286r) {
                if (this.f3824l == null) {
                    this.f3824l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
                }
                this.f3824l.n(jVar);
                return true;
            } else {
                return false;
            }
        }
    }

    @Nullable
    public a<?, Float> e() {
        return this.f3826n;
    }

    public Matrix f() {
        float p4;
        PointF h4;
        this.f3813a.reset();
        a<?, PointF> aVar = this.f3819g;
        if (aVar != null && (h4 = aVar.h()) != null) {
            float f5 = h4.x;
            if (f5 != 0.0f || h4.y != 0.0f) {
                this.f3813a.preTranslate(f5, h4.y);
            }
        }
        a<Float, Float> aVar2 = this.f3821i;
        if (aVar2 != null) {
            if (aVar2 instanceof q) {
                p4 = aVar2.h().floatValue();
            } else {
                p4 = ((d) aVar2).p();
            }
            if (p4 != 0.0f) {
                this.f3813a.preRotate(p4);
            }
        }
        d dVar = this.f3823k;
        if (dVar != null) {
            d dVar2 = this.f3824l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.p()) + 90.0f));
            d dVar3 = this.f3824l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(dVar.p()));
            d();
            float[] fArr = this.f3817e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f6 = -sin;
            fArr[3] = f6;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f3814b.setValues(fArr);
            d();
            float[] fArr2 = this.f3817e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f3815c.setValues(fArr2);
            d();
            float[] fArr3 = this.f3817e;
            fArr3[0] = cos;
            fArr3[1] = f6;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f3816d.setValues(fArr3);
            this.f3815c.preConcat(this.f3814b);
            this.f3816d.preConcat(this.f3815c);
            this.f3813a.preConcat(this.f3816d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f3820h;
        if (aVar3 != null) {
            com.airbnb.lottie.value.k h5 = aVar3.h();
            if (h5.b() != 1.0f || h5.c() != 1.0f) {
                this.f3813a.preScale(h5.b(), h5.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f3818f;
        if (aVar4 != null) {
            PointF h6 = aVar4.h();
            float f7 = h6.x;
            if (f7 != 0.0f || h6.y != 0.0f) {
                this.f3813a.preTranslate(-f7, -h6.y);
            }
        }
        return this.f3813a;
    }

    public Matrix g(float f5) {
        a<?, PointF> aVar = this.f3819g;
        PointF h4 = aVar == null ? null : aVar.h();
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f3820h;
        com.airbnb.lottie.value.k h5 = aVar2 == null ? null : aVar2.h();
        this.f3813a.reset();
        if (h4 != null) {
            this.f3813a.preTranslate(h4.x * f5, h4.y * f5);
        }
        if (h5 != null) {
            double d5 = f5;
            this.f3813a.preScale((float) Math.pow(h5.b(), d5), (float) Math.pow(h5.c(), d5));
        }
        a<Float, Float> aVar3 = this.f3821i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f3818f;
            PointF h6 = aVar4 != null ? aVar4.h() : null;
            this.f3813a.preRotate(floatValue * f5, h6 == null ? 0.0f : h6.x, h6 != null ? h6.y : 0.0f);
        }
        return this.f3813a;
    }

    @Nullable
    public a<?, Integer> h() {
        return this.f3822j;
    }

    @Nullable
    public a<?, Float> i() {
        return this.f3825m;
    }

    public void j(float f5) {
        a<Integer, Integer> aVar = this.f3822j;
        if (aVar != null) {
            aVar.m(f5);
        }
        a<?, Float> aVar2 = this.f3825m;
        if (aVar2 != null) {
            aVar2.m(f5);
        }
        a<?, Float> aVar3 = this.f3826n;
        if (aVar3 != null) {
            aVar3.m(f5);
        }
        a<PointF, PointF> aVar4 = this.f3818f;
        if (aVar4 != null) {
            aVar4.m(f5);
        }
        a<?, PointF> aVar5 = this.f3819g;
        if (aVar5 != null) {
            aVar5.m(f5);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f3820h;
        if (aVar6 != null) {
            aVar6.m(f5);
        }
        a<Float, Float> aVar7 = this.f3821i;
        if (aVar7 != null) {
            aVar7.m(f5);
        }
        d dVar = this.f3823k;
        if (dVar != null) {
            dVar.m(f5);
        }
        d dVar2 = this.f3824l;
        if (dVar2 != null) {
            dVar2.m(f5);
        }
    }
}
