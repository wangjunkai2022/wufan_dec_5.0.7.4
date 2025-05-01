package com.youth.banner.transformer;

import android.view.View;
/* loaded from: classes6.dex */
public class CubeInTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    public boolean b() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void f(View view, float f5) {
        view.setPivotX(f5 > 0.0f ? 0.0f : view.getWidth());
        view.setPivotY(0.0f);
        view.setRotationY(f5 * (-90.0f));
    }
}
