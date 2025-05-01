package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.s0;
import com.airbnb.lottie.value.j;
/* compiled from: SolidLayer.java */
/* loaded from: classes2.dex */
public class g extends b {
    private final RectF H;
    private final Paint I;
    private final float[] J;
    private final Path K;
    private final Layer L;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.H = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.I = aVar;
        this.J = new float[8];
        this.K = new Path();
        this.L = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.K) {
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
        this.H.set(0.0f, 0.0f, this.L.q(), this.L.p());
        this.f4092o.mapRect(this.H);
        rectF.set(this.H);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(Canvas canvas, Matrix matrix, int i4) {
        int alpha = Color.alpha(this.L.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i4 / 255.0f) * (((alpha / 255.0f) * (this.f4101x.h() == null ? 100 : this.f4101x.h().h().intValue())) / 100.0f) * 255.0f);
        this.I.setAlpha(intValue);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.M;
        if (aVar != null) {
            this.I.setColorFilter(aVar.h());
        }
        if (intValue > 0) {
            float[] fArr = this.J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.L.q();
            float[] fArr2 = this.J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.L.q();
            this.J[5] = this.L.p();
            float[] fArr3 = this.J;
            fArr3[6] = 0.0f;
            fArr3[7] = this.L.p();
            matrix.mapPoints(this.J);
            this.K.reset();
            Path path = this.K;
            float[] fArr4 = this.J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.K;
            float[] fArr5 = this.J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.K;
            float[] fArr6 = this.J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.K;
            float[] fArr7 = this.J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.K;
            float[] fArr8 = this.J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.K.close();
            canvas.drawPath(this.K, this.I);
        }
    }
}
