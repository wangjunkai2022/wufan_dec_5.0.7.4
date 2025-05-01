package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class ForegroundToBackgroundTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float height = view.getHeight();
        float width = view.getWidth();
        float c5 = ABaseTransformer.c(f5 <= 0.0f ? Math.abs(1.0f + f5) : 1.0f, 0.5f);
        view.setScaleX(c5);
        view.setScaleY(c5);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        view.setTranslationX(f5 > 0.0f ? width * f5 : (-width) * f5 * 0.25f);
    }
}
