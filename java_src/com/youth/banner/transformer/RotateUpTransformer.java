package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class RotateUpTransformer extends ABaseTransformer {

    /* renamed from: a  reason: collision with root package name */
    private static final float f68566a = -15.0f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected boolean b() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        float f6 = f5 * f68566a;
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(f6);
    }
}
