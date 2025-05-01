package com.cmic.sso.sdk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class LoadingImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation f9405a;

    /* renamed from: b  reason: collision with root package name */
    private LinearInterpolator f9406b;

    public LoadingImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9405a = null;
        this.f9406b = null;
        a();
    }

    protected void a() {
        this.f9405a = AnimationUtils.loadAnimation(getContext(), b.c(getContext(), "umcsdk_anim_loading"));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f9406b = linearInterpolator;
        this.f9405a.setInterpolator(linearInterpolator);
    }

    public LoadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9405a = null;
        this.f9406b = null;
        a();
    }

    public LoadingImageView(Context context) {
        super(context);
        this.f9405a = null;
        this.f9406b = null;
        a();
    }
}
