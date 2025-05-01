package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class ZoomOutTranformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float abs = Math.abs(f5) + 1.0f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setAlpha((f5 < -1.0f || f5 > 1.0f) ? 0.0f : 1.0f - (abs - 1.0f));
        if (f5 == -1.0f) {
            view.setTranslationX(view.getWidth() * (-1));
        }
    }
}
