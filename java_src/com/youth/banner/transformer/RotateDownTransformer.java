package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class RotateDownTransformer extends ABaseTransformer {

    /* renamed from: a  reason: collision with root package name */
    private static final float f68565a = -15.0f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected boolean b() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight());
        view.setRotation(f5 * f68565a * (-1.25f));
    }
}
