package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.parser.j;
import java.util.Collections;
import java.util.List;
/* compiled from: ShapeLayer.java */
/* loaded from: classes2.dex */
public class f extends b {
    private final com.airbnb.lottie.animation.content.d H;
    private final c I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(LottieDrawable lottieDrawable, Layer layer, c cVar) {
        super(lottieDrawable, layer);
        this.I = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(lottieDrawable, this, new l("__container", layer.n(), false));
        this.H = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.H.e(dVar, i4, list, dVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        this.H.f(rectF, this.f4092o, z4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(@NonNull Canvas canvas, Matrix matrix, int i4) {
        this.H.h(canvas, matrix, i4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public com.airbnb.lottie.model.content.a v() {
        com.airbnb.lottie.model.content.a v2 = super.v();
        return v2 != null ? v2 : this.I.v();
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public j x() {
        j x4 = super.x();
        return x4 != null ? x4 : this.I.x();
    }
}
