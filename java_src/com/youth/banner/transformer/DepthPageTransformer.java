package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class DepthPageTransformer extends ABaseTransformer {

    /* renamed from: a  reason: collision with root package name */
    private static final float f68564a = 0.75f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected boolean b() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        if (f5 <= 0.0f) {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f5 <= 1.0f) {
            float abs = ((1.0f - Math.abs(f5)) * 0.25f) + 0.75f;
            view.setAlpha(1.0f - f5);
            view.setPivotY(view.getHeight() * 0.5f);
            view.setTranslationX(view.getWidth() * (-f5));
            view.setScaleX(abs);
            view.setScaleY(abs);
        }
    }
}
