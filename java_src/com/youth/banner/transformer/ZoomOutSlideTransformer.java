package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class ZoomOutSlideTransformer extends ABaseTransformer {

    /* renamed from: a  reason: collision with root package name */
    private static final float f68570a = 0.85f;

    /* renamed from: b  reason: collision with root package name */
    private static final float f68571b = 0.5f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        if (f5 >= -1.0f || f5 <= 1.0f) {
            float height = view.getHeight();
            float width = view.getWidth();
            float max = Math.max((float) f68570a, 1.0f - Math.abs(f5));
            float f6 = 1.0f - max;
            float f7 = (height * f6) / 2.0f;
            float f8 = (f6 * width) / 2.0f;
            view.setPivotY(height * 0.5f);
            view.setPivotX(width * 0.5f);
            if (f5 < 0.0f) {
                view.setTranslationX(f8 - (f7 / 2.0f));
            } else {
                view.setTranslationX((-f8) + (f7 / 2.0f));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - f68570a) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }
}
