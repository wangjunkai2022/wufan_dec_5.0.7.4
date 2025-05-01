package com.youth.banner.transformer;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes6.dex */
public abstract class ABaseTransformer implements ViewPager.PageTransformer {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final float c(float f5, float f6) {
        return f5 < f6 ? f6 : f5;
    }

    protected boolean a() {
        return true;
    }

    protected boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(View view, float f5) {
    }

    protected void e(View view, float f5) {
        float width = view.getWidth();
        float f6 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(b() ? 0.0f : (-width) * f5);
        if (a()) {
            if (f5 > -1.0f && f5 < 1.0f) {
                f6 = 1.0f;
            }
            view.setAlpha(f6);
            return;
        }
        view.setAlpha(1.0f);
    }

    protected abstract void f(View view, float f5);

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f5) {
        e(view, f5);
        f(view, f5);
        d(view, f5);
    }
}
