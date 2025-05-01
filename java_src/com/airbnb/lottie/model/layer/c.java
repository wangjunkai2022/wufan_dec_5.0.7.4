package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.s0;
import com.airbnb.lottie.value.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CompositionLayer.java */
/* loaded from: classes2.dex */
public class c extends b {
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> H;
    private final List<b> I;
    private final RectF J;
    private final RectF K;
    private final Paint L;
    @Nullable
    private Boolean M;
    @Nullable
    private Boolean N;
    private boolean O;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4106a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f4106a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4106a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, k kVar) {
        super(lottieDrawable, layer);
        int i4;
        b bVar;
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.O = true;
        com.airbnb.lottie.model.animatable.b u4 = layer.u();
        if (u4 != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = u4.a();
            this.H = a5;
            i(a5);
            this.H.a(this);
        } else {
            this.H = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(kVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            b u5 = b.u(this, layer2, lottieDrawable, kVar);
            if (u5 != null) {
                longSparseArray.put(u5.y().d(), u5);
                if (bVar2 != null) {
                    bVar2.I(u5);
                    bVar2 = null;
                } else {
                    this.I.add(0, u5);
                    int i5 = a.f4106a[layer2.h().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        bVar2 = u5;
                    }
                }
            }
            size--;
        }
        for (i4 = 0; i4 < longSparseArray.size(); i4++) {
            b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i4));
            if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.y().j())) != null) {
                bVar3.K(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i5 = 0; i5 < this.I.size(); i5++) {
            this.I.get(i5).e(dVar, i4, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(boolean z4) {
        super.J(z4);
        for (b bVar : this.I) {
            bVar.J(z4);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void L(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        super.L(f5);
        if (this.H != null) {
            f5 = ((this.H.h().floatValue() * this.f4094q.b().i()) - this.f4094q.b().r()) / (this.f4093p.N().e() + 0.01f);
        }
        if (this.H == null) {
            f5 -= this.f4094q.r();
        }
        if (this.f4094q.v() != 0.0f && !"__container".equals(this.f4094q.i())) {
            f5 /= this.f4094q.v();
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).L(f5);
        }
    }

    public boolean O() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                b bVar = this.I.get(size);
                if (bVar instanceof f) {
                    if (bVar.z()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).O()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean P() {
        if (this.M == null) {
            if (A()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).A()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void Q(boolean z4) {
        this.O = z4;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.H;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar);
            this.H = qVar;
            qVar.a(this);
            i(this.H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).f(this.J, this.f4092o, true);
            rectF.union(this.J);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
        com.airbnb.lottie.e.a("CompositionLayer#draw");
        this.K.set(0.0f, 0.0f, this.f4094q.l(), this.f4094q.k());
        matrix.mapRect(this.K);
        boolean z4 = this.f4093p.k0() && this.I.size() > 1 && i4 != 255;
        if (z4) {
            this.L.setAlpha(i4);
            com.airbnb.lottie.utils.h.n(canvas, this.K, this.L);
        } else {
            canvas.save();
        }
        if (z4) {
            i4 = 255;
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            if (((!this.O && "__container".equals(this.f4094q.i())) || this.K.isEmpty()) ? true : canvas.clipRect(this.K)) {
                this.I.get(size).h(canvas, matrix, i4);
            }
        }
        canvas.restore();
        com.airbnb.lottie.e.b("CompositionLayer#draw");
    }
}
