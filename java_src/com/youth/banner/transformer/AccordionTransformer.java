package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class AccordionTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        view.setPivotX(f5 < 0.0f ? 0.0f : view.getWidth());
        view.setScaleX(f5 < 0.0f ? f5 + 1.0f : 1.0f - f5);
    }
}
