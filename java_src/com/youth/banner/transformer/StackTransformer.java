package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class StackTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        view.setTranslationX(f5 >= 0.0f ? (-view.getWidth()) * f5 : 0.0f);
    }
}
