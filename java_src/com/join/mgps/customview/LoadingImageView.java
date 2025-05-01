package com.join.mgps.customview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes4.dex */
public class LoadingImageView extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f47338b;

    public LoadingImageView(Context context) {
        super(context);
        this.f47338b = (AnimationDrawable) getBackground();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimationDrawable animationDrawable = this.f47338b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimationDrawable animationDrawable = this.f47338b;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public LoadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47338b = (AnimationDrawable) getBackground();
    }

    public LoadingImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47338b = (AnimationDrawable) getBackground();
    }
}
