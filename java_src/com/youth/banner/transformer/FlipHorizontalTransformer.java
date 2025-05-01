package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class FlipHorizontalTransformer extends ABaseTransformer {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.youth.banner.transformer.ABaseTransformer
    public void d(View view, float f5) {
        super.d(view, f5);
        if (f5 > -0.5f && f5 < 0.5f) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float f6 = f5 * 180.0f;
        view.setAlpha((f6 > 90.0f || f6 < -90.0f) ? 0.0f : 1.0f);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f6);
    }
}
