package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.s0;
import com.airbnb.lottie.value.j;
/* compiled from: ImageLayer.java */
/* loaded from: classes2.dex */
public class d extends b {
    private final Paint H;
    private final Rect I;
    private final Rect J;
    @Nullable
    private final o0 K;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> L;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.H = new com.airbnb.lottie.animation.a(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = lottieDrawable.T(layer.m());
    }

    @Nullable
    private Bitmap O() {
        Bitmap h4;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.M;
        if (aVar == null || (h4 = aVar.h()) == null) {
            Bitmap L = this.f4093p.L(this.f4094q.m());
            if (L != null) {
                return L;
            }
            o0 o0Var = this.K;
            if (o0Var != null) {
                return o0Var.a();
            }
            return null;
        }
        return h4;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.K) {
            if (jVar == null) {
                this.L = null;
            } else {
                this.L = new q(jVar);
            }
        } else if (t4 == s0.N) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        if (this.K != null) {
            float e5 = com.airbnb.lottie.utils.h.e();
            rectF.set(0.0f, 0.0f, this.K.f() * e5, this.K.d() * e5);
            this.f4092o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@NonNull Canvas canvas, Matrix matrix, int i4) {
        Bitmap O = O();
        if (O == null || O.isRecycled() || this.K == null) {
            return;
        }
        float e5 = com.airbnb.lottie.utils.h.e();
        this.H.setAlpha(i4);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.L;
        if (aVar != null) {
            this.H.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.I.set(0, 0, O.getWidth(), O.getHeight());
        if (this.f4093p.U()) {
            this.J.set(0, 0, (int) (this.K.f() * e5), (int) (this.K.d() * e5));
        } else {
            this.J.set(0, 0, (int) (O.getWidth() * e5), (int) (O.getHeight() * e5));
        }
        canvas.drawBitmap(O, this.I, this.J, this.H);
        canvas.restore();
    }
}
