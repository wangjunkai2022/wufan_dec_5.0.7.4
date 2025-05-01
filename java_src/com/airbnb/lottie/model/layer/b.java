package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: BaseLayer.java */
/* loaded from: classes2.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, com.airbnb.lottie.model.e {
    private static final int D = 2;
    private static final int E = 16;
    private static final int F = 1;
    private static final int G = 19;
    @Nullable
    private Paint A;
    float B;
    @Nullable
    BlurMaskFilter C;

    /* renamed from: a  reason: collision with root package name */
    private final Path f4078a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f4079b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f4080c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f4081d = new com.airbnb.lottie.animation.a(1);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f4082e = new com.airbnb.lottie.animation.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f  reason: collision with root package name */
    private final Paint f4083f = new com.airbnb.lottie.animation.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g  reason: collision with root package name */
    private final Paint f4084g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f4085h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f4086i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f4087j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f4088k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f4089l;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f4090m;

    /* renamed from: n  reason: collision with root package name */
    private final String f4091n;

    /* renamed from: o  reason: collision with root package name */
    final Matrix f4092o;

    /* renamed from: p  reason: collision with root package name */
    final LottieDrawable f4093p;

    /* renamed from: q  reason: collision with root package name */
    final Layer f4094q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.h f4095r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.d f4096s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private b f4097t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private b f4098u;

    /* renamed from: v  reason: collision with root package name */
    private List<b> f4099v;

    /* renamed from: w  reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f4100w;

    /* renamed from: x  reason: collision with root package name */
    final p f4101x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4102y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f4103z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseLayer.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4104a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f4105b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f4105b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4105b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4105b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4105b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f4104a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4104a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4104a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4104a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4104a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4104a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4104a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LottieDrawable lottieDrawable, Layer layer) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f4084g = aVar;
        this.f4085h = new com.airbnb.lottie.animation.a(PorterDuff.Mode.CLEAR);
        this.f4086i = new RectF();
        this.f4087j = new RectF();
        this.f4088k = new RectF();
        this.f4089l = new RectF();
        this.f4090m = new RectF();
        this.f4092o = new Matrix();
        this.f4100w = new ArrayList();
        this.f4102y = true;
        this.B = 0.0f;
        this.f4093p = lottieDrawable;
        this.f4094q = layer;
        this.f4091n = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p b5 = layer.w().b();
        this.f4101x = b5;
        b5.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(layer.g());
            this.f4095r = hVar;
            for (com.airbnb.lottie.animation.keyframe.a<j, Path> aVar2 : hVar.a()) {
                aVar2.a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 : this.f4095r.c()) {
                i(aVar3);
                aVar3.a(this);
            }
        }
        N();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.f4088k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f4095r.b().size();
            for (int i4 = 0; i4 < size; i4++) {
                Mask mask = this.f4095r.b().get(i4);
                Path h4 = this.f4095r.a().get(i4).h();
                if (h4 != null) {
                    this.f4078a.set(h4);
                    this.f4078a.transform(matrix);
                    int i5 = a.f4105b[mask.a().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        return;
                    }
                    if ((i5 == 3 || i5 == 4) && mask.d()) {
                        return;
                    }
                    this.f4078a.computeBounds(this.f4090m, false);
                    if (i4 == 0) {
                        this.f4088k.set(this.f4090m);
                    } else {
                        RectF rectF2 = this.f4088k;
                        rectF2.set(Math.min(rectF2.left, this.f4090m.left), Math.min(this.f4088k.top, this.f4090m.top), Math.max(this.f4088k.right, this.f4090m.right), Math.max(this.f4088k.bottom, this.f4090m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f4088k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (A() && this.f4094q.h() != Layer.MatteType.INVERT) {
            this.f4089l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f4097t.f(this.f4089l, matrix, true);
            if (rectF.intersect(this.f4089l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.f4093p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        M(this.f4096s.p() == 1.0f);
    }

    private void F(float f5) {
        this.f4093p.N().o().e(this.f4094q.i(), f5);
    }

    private void M(boolean z4) {
        if (z4 != this.f4102y) {
            this.f4102y = z4;
            D();
        }
    }

    private void N() {
        if (!this.f4094q.e().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f4094q.e());
            this.f4096s = dVar;
            dVar.l();
            this.f4096s.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
                @Override // com.airbnb.lottie.animation.keyframe.a.b
                public final void a() {
                    b.this.E();
                }
            });
            M(this.f4096s.h().floatValue() == 1.0f);
            i(this.f4096s);
            return;
        }
        M(true);
    }

    private void j(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        this.f4081d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f4078a, this.f4081d);
    }

    private void k(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.h.n(canvas, this.f4086i, this.f4082e);
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        this.f4081d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f4078a, this.f4081d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.h.n(canvas, this.f4086i, this.f4081d);
        canvas.drawRect(this.f4086i, this.f4081d);
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        this.f4081d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f4078a, this.f4083f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.h.n(canvas, this.f4086i, this.f4082e);
        canvas.drawRect(this.f4086i, this.f4081d);
        this.f4083f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        canvas.drawPath(this.f4078a, this.f4083f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.h.n(canvas, this.f4086i, this.f4083f);
        canvas.drawRect(this.f4086i, this.f4081d);
        this.f4083f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        canvas.drawPath(this.f4078a, this.f4083f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.e.a("Layer#saveLayer");
        com.airbnb.lottie.utils.h.o(canvas, this.f4086i, this.f4082e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.e.b("Layer#saveLayer");
        for (int i4 = 0; i4 < this.f4095r.b().size(); i4++) {
            Mask mask = this.f4095r.b().get(i4);
            com.airbnb.lottie.animation.keyframe.a<j, Path> aVar = this.f4095r.a().get(i4);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f4095r.c().get(i4);
            int i5 = a.f4105b[mask.a().ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (i4 == 0) {
                        this.f4081d.setColor(-16777216);
                        this.f4081d.setAlpha(255);
                        canvas.drawRect(this.f4086i, this.f4081d);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f4081d.setAlpha(255);
                canvas.drawRect(this.f4086i, this.f4081d);
            }
        }
        com.airbnb.lottie.e.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.e.b("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<j, Path> aVar) {
        this.f4078a.set(aVar.h());
        this.f4078a.transform(matrix);
        canvas.drawPath(this.f4078a, this.f4083f);
    }

    private boolean q() {
        if (this.f4095r.a().isEmpty()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f4095r.b().size(); i4++) {
            if (this.f4095r.b().get(i4).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f4099v != null) {
            return;
        }
        if (this.f4098u == null) {
            this.f4099v = Collections.emptyList();
            return;
        }
        this.f4099v = new ArrayList();
        for (b bVar = this.f4098u; bVar != null; bVar = bVar.f4098u) {
            this.f4099v.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.e.a("Layer#clearLayer");
        RectF rectF = this.f4086i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4085h);
        com.airbnb.lottie.e.b("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static b u(c cVar, Layer layer, LottieDrawable lottieDrawable, k kVar) {
        switch (a.f4104a[layer.f().ordinal()]) {
            case 1:
                return new f(lottieDrawable, layer, cVar);
            case 2:
                return new c(lottieDrawable, layer, kVar.p(layer.m()), kVar);
            case 3:
                return new g(lottieDrawable, layer);
            case 4:
                return new d(lottieDrawable, layer);
            case 5:
                return new e(lottieDrawable, layer);
            case 6:
                return new h(lottieDrawable, layer);
            default:
                com.airbnb.lottie.utils.d.e("Unknown layer type " + layer.f());
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f4097t != null;
    }

    public void G(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f4100w.remove(aVar);
    }

    void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(@Nullable b bVar) {
        this.f4097t = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(boolean z4) {
        if (z4 && this.A == null) {
            this.A = new com.airbnb.lottie.animation.a();
        }
        this.f4103z = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@Nullable b bVar) {
        this.f4098u = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        this.f4101x.j(f5);
        if (this.f4095r != null) {
            for (int i4 = 0; i4 < this.f4095r.a().size(); i4++) {
                this.f4095r.a().get(i4).m(f5);
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f4096s;
        if (dVar != null) {
            dVar.m(f5);
        }
        b bVar = this.f4097t;
        if (bVar != null) {
            bVar.L(f5);
        }
        for (int i5 = 0; i5 < this.f4100w.size(); i5++) {
            this.f4100w.get(i5).m(f5);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        D();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.e
    @CallSuper
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        this.f4101x.c(t4, jVar);
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        b bVar = this.f4097t;
        if (bVar != null) {
            com.airbnb.lottie.model.d a5 = dVar2.a(bVar.getName());
            if (dVar.c(this.f4097t.getName(), i4)) {
                list.add(a5.j(this.f4097t));
            }
            if (dVar.i(getName(), i4)) {
                this.f4097t.H(dVar, dVar.e(this.f4097t.getName(), i4) + i4, list, a5);
            }
        }
        if (dVar.h(getName(), i4)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i4)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i4)) {
                H(dVar, i4 + dVar.e(getName(), i4), list, dVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    @CallSuper
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f4086i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f4092o.set(matrix);
        if (z4) {
            List<b> list = this.f4099v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4092o.preConcat(this.f4099v.get(size).f4101x.f());
                }
            } else {
                b bVar = this.f4098u;
                if (bVar != null) {
                    this.f4092o.preConcat(bVar.f4101x.f());
                }
            }
        }
        this.f4092o.preConcat(this.f4101x.f());
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f4094q.i();
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        Paint paint;
        com.airbnb.lottie.e.a(this.f4091n);
        if (this.f4102y && !this.f4094q.x()) {
            r();
            com.airbnb.lottie.e.a("Layer#parentMatrix");
            this.f4079b.reset();
            this.f4079b.set(matrix);
            for (int size = this.f4099v.size() - 1; size >= 0; size--) {
                this.f4079b.preConcat(this.f4099v.get(size).f4101x.f());
            }
            com.airbnb.lottie.e.b("Layer#parentMatrix");
            int intValue = (int) ((((i4 / 255.0f) * (this.f4101x.h() == null ? 100 : this.f4101x.h().h().intValue())) / 100.0f) * 255.0f);
            if (!A() && !z()) {
                this.f4079b.preConcat(this.f4101x.f());
                com.airbnb.lottie.e.a("Layer#drawLayer");
                t(canvas, this.f4079b, intValue);
                com.airbnb.lottie.e.b("Layer#drawLayer");
                F(com.airbnb.lottie.e.b(this.f4091n));
                return;
            }
            com.airbnb.lottie.e.a("Layer#computeBounds");
            f(this.f4086i, this.f4079b, false);
            C(this.f4086i, matrix);
            this.f4079b.preConcat(this.f4101x.f());
            B(this.f4086i, this.f4079b);
            this.f4087j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f4080c);
            if (!this.f4080c.isIdentity()) {
                Matrix matrix2 = this.f4080c;
                matrix2.invert(matrix2);
                this.f4080c.mapRect(this.f4087j);
            }
            if (!this.f4086i.intersect(this.f4087j)) {
                this.f4086i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.e.b("Layer#computeBounds");
            if (this.f4086i.width() >= 1.0f && this.f4086i.height() >= 1.0f) {
                com.airbnb.lottie.e.a("Layer#saveLayer");
                this.f4081d.setAlpha(255);
                com.airbnb.lottie.utils.h.n(canvas, this.f4086i, this.f4081d);
                com.airbnb.lottie.e.b("Layer#saveLayer");
                s(canvas);
                com.airbnb.lottie.e.a("Layer#drawLayer");
                t(canvas, this.f4079b, intValue);
                com.airbnb.lottie.e.b("Layer#drawLayer");
                if (z()) {
                    o(canvas, this.f4079b);
                }
                if (A()) {
                    com.airbnb.lottie.e.a("Layer#drawMatte");
                    com.airbnb.lottie.e.a("Layer#saveLayer");
                    com.airbnb.lottie.utils.h.o(canvas, this.f4086i, this.f4084g, 19);
                    com.airbnb.lottie.e.b("Layer#saveLayer");
                    s(canvas);
                    this.f4097t.h(canvas, matrix, intValue);
                    com.airbnb.lottie.e.a("Layer#restoreLayer");
                    canvas.restore();
                    com.airbnb.lottie.e.b("Layer#restoreLayer");
                    com.airbnb.lottie.e.b("Layer#drawMatte");
                }
                com.airbnb.lottie.e.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.e.b("Layer#restoreLayer");
            }
            if (this.f4103z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f4086i, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(this.f4086i, this.A);
            }
            F(com.airbnb.lottie.e.b(this.f4091n));
            return;
        }
        com.airbnb.lottie.e.b(this.f4091n);
    }

    public void i(@Nullable com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f4100w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i4);

    @Nullable
    public com.airbnb.lottie.model.content.a v() {
        return this.f4094q.a();
    }

    public BlurMaskFilter w(float f5) {
        if (this.B == f5) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f5 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f5;
        return blurMaskFilter;
    }

    @Nullable
    public com.airbnb.lottie.parser.j x() {
        return this.f4094q.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Layer y() {
        return this.f4094q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f4095r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }
}
