package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class ZoomInTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float f6 = 0.0f;
        float abs = f5 < 0.0f ? f5 + 1.0f : Math.abs(1.0f - f5);
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        if (f5 >= -1.0f && f5 <= 1.0f) {
            f6 = 1.0f - (abs - 1.0f);
        }
        view.setAlpha(f6);
    }
}
