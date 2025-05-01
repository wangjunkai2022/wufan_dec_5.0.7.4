package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class ScaleInOutTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        view.setPivotX(f5 < 0.0f ? 0.0f : view.getWidth());
        view.setPivotY(view.getHeight() / 2.0f);
        float f6 = f5 < 0.0f ? f5 + 1.0f : 1.0f - f5;
        view.setScaleX(f6);
        view.setScaleY(f6);
    }
}
