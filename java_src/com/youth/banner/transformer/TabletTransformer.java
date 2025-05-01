package com.youth.banner.transformer;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes6.dex */
public class TabletTransformer extends ABaseTransformer {

    /* renamed from: a  reason: collision with root package name */
    private static final Matrix f68567a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private static final Camera f68568b = new Camera();

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f68569c = new float[2];

    protected static final float g(float f5, int i4, int i5) {
        Matrix matrix = f68567a;
        matrix.reset();
        Camera camera = f68568b;
        camera.save();
        camera.rotateY(Math.abs(f5));
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate((-i4) * 0.5f, (-i5) * 0.5f);
        float f6 = i4;
        float f7 = i5;
        matrix.postTranslate(f6 * 0.5f, 0.5f * f7);
        float[] fArr = f68569c;
        fArr[0] = f6;
        fArr[1] = f7;
        matrix.mapPoints(fArr);
        return (f6 - fArr[0]) * (f5 > 0.0f ? 1.0f : -1.0f);
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float abs = (f5 < 0.0f ? 30.0f : -30.0f) * Math.abs(f5);
        view.setTranslationX(g(abs, view.getWidth(), view.getHeight()));
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(0.0f);
        view.setRotationY(abs);
    }
}
