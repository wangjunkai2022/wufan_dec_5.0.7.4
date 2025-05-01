package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;
/* compiled from: ScalingUtils.java */
/* loaded from: classes.dex */
public class r {

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements c {
        @Override // com.facebook.drawee.drawable.r.c
        public Matrix a(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6) {
            b(matrix, rect, i4, i5, f5, f6, rect.width() / i4, rect.height() / i5);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11294a = k.f11310j;

        /* renamed from: b  reason: collision with root package name */
        public static final c f11295b = j.f11309j;

        /* renamed from: c  reason: collision with root package name */
        public static final c f11296c = h.f11307j;

        /* renamed from: d  reason: collision with root package name */
        public static final c f11297d = i.f11308j;

        /* renamed from: e  reason: collision with root package name */
        public static final c f11298e = d.f11303j;

        /* renamed from: f  reason: collision with root package name */
        public static final c f11299f = f.f11305j;

        /* renamed from: g  reason: collision with root package name */
        public static final c f11300g = e.f11304j;

        /* renamed from: h  reason: collision with root package name */
        public static final c f11301h = l.f11311j;

        /* renamed from: i  reason: collision with root package name */
        public static final c f11302i = g.f11306j;

        Matrix a(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class d extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11303j = new d();

        private d() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i4) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i5) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class e extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11304j = new e();

        private e() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float height;
            float f9;
            if (f8 > f7) {
                f9 = rect.left + ((rect.width() - (i4 * f8)) * 0.5f);
                height = rect.top;
                f7 = f8;
            } else {
                height = ((rect.height() - (i5 * f7)) * 0.5f) + rect.top;
                f9 = rect.left;
            }
            matrix.setScale(f7, f7);
            matrix.postTranslate((int) (f9 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class f extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11305j = new f();

        private f() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float min = Math.min(Math.min(f7, f8), 1.0f);
            float width = rect.left + ((rect.width() - (i4 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i5 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class g extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11306j = new g();

        private g() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float min = Math.min(f7, f8);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i5 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class h extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11307j = new h();

        private h() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float min = Math.min(f7, f8);
            float width = rect.left + ((rect.width() - (i4 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i5 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class i extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11308j = new i();

        private i() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float min = Math.min(f7, f8);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i4 * min)) + 0.5f), (int) (rect.top + (rect.height() - (i5 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class j extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11309j = new j();

        private j() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float min = Math.min(f7, f8);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class k extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11310j = new k();

        private k() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            matrix.setScale(f7, f8);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    private static class l extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final c f11311j = new l();

        private l() {
        }

        @Override // com.facebook.drawee.drawable.r.a
        public void b(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6, float f7, float f8) {
            float f9;
            float max;
            if (f8 > f7) {
                float f10 = i4 * f8;
                f9 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f5 * f10), 0.0f), rect.width() - f10);
                max = rect.top;
                f7 = f8;
            } else {
                f9 = rect.left;
                float f11 = i5 * f7;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f6 * f11), 0.0f), rect.height() - f11) + rect.top;
            }
            matrix.setScale(f7, f7);
            matrix.postTranslate((int) (f9 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes2.dex */
    public interface m {
        Object getState();
    }

    @Nullable
    public static q a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof q) {
            return (q) drawable;
        }
        if (drawable instanceof com.facebook.drawee.drawable.d) {
            return a(((com.facebook.drawee.drawable.d) drawable).p());
        }
        if (drawable instanceof com.facebook.drawee.drawable.a) {
            com.facebook.drawee.drawable.a aVar = (com.facebook.drawee.drawable.a) drawable;
            int d5 = aVar.d();
            for (int i4 = 0; i4 < d5; i4++) {
                q a5 = a(aVar.b(i4));
                if (a5 != null) {
                    return a5;
                }
            }
        }
        return null;
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class b implements c, m {

        /* renamed from: j  reason: collision with root package name */
        private final c f11284j;

        /* renamed from: k  reason: collision with root package name */
        private final c f11285k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        private final Rect f11286l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        private final Rect f11287m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        private final PointF f11288n;
        @Nullable

        /* renamed from: o  reason: collision with root package name */
        private final PointF f11289o;

        /* renamed from: p  reason: collision with root package name */
        private final float[] f11290p;

        /* renamed from: q  reason: collision with root package name */
        private final float[] f11291q;

        /* renamed from: r  reason: collision with root package name */
        private final float[] f11292r;

        /* renamed from: s  reason: collision with root package name */
        private float f11293s;

        public b(c cVar, c cVar2, @Nullable Rect rect, @Nullable Rect rect2, @Nullable PointF pointF, @Nullable PointF pointF2) {
            this.f11290p = new float[9];
            this.f11291q = new float[9];
            this.f11292r = new float[9];
            this.f11284j = cVar;
            this.f11285k = cVar2;
            this.f11286l = rect;
            this.f11287m = rect2;
            this.f11288n = pointF;
            this.f11289o = pointF2;
        }

        @Override // com.facebook.drawee.drawable.r.c
        public Matrix a(Matrix matrix, Rect rect, int i4, int i5, float f5, float f6) {
            Rect rect2 = this.f11286l;
            Rect rect3 = rect2 != null ? rect2 : rect;
            Rect rect4 = this.f11287m;
            Rect rect5 = rect4 != null ? rect4 : rect;
            c cVar = this.f11284j;
            PointF pointF = this.f11288n;
            cVar.a(matrix, rect3, i4, i5, pointF == null ? f5 : pointF.x, pointF == null ? f6 : pointF.y);
            matrix.getValues(this.f11290p);
            c cVar2 = this.f11285k;
            PointF pointF2 = this.f11289o;
            cVar2.a(matrix, rect5, i4, i5, pointF2 == null ? f5 : pointF2.x, pointF2 == null ? f6 : pointF2.y);
            matrix.getValues(this.f11291q);
            for (int i6 = 0; i6 < 9; i6++) {
                float[] fArr = this.f11292r;
                float f7 = this.f11290p[i6];
                float f8 = this.f11293s;
                fArr[i6] = (f7 * (1.0f - f8)) + (this.f11291q[i6] * f8);
            }
            matrix.setValues(this.f11292r);
            return matrix;
        }

        @Nullable
        public Rect b() {
            return this.f11286l;
        }

        @Nullable
        public Rect c() {
            return this.f11287m;
        }

        @Nullable
        public PointF d() {
            return this.f11288n;
        }

        @Nullable
        public PointF e() {
            return this.f11289o;
        }

        public c f() {
            return this.f11284j;
        }

        public c g() {
            return this.f11285k;
        }

        @Override // com.facebook.drawee.drawable.r.m
        public Object getState() {
            return Float.valueOf(this.f11293s);
        }

        public float h() {
            return this.f11293s;
        }

        public void i(float f5) {
            this.f11293s = f5;
        }

        public String toString() {
            return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", String.valueOf(this.f11284j), String.valueOf(this.f11288n), String.valueOf(this.f11285k), String.valueOf(this.f11289o));
        }

        public b(c cVar, c cVar2, @Nullable Rect rect, @Nullable Rect rect2) {
            this(cVar, cVar2, rect, rect2, null, null);
        }

        public b(c cVar, c cVar2) {
            this(cVar, cVar2, null, null);
        }
    }
}
