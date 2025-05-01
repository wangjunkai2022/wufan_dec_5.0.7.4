package com.join.mgps.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
/* loaded from: classes4.dex */
public class RotateLoadingLayout extends LoadingLayout {

    /* renamed from: t  reason: collision with root package name */
    static final int f53976t = 1200;

    /* renamed from: o  reason: collision with root package name */
    private final Animation f53977o;

    /* renamed from: p  reason: collision with root package name */
    private final Matrix f53978p;

    /* renamed from: q  reason: collision with root package name */
    private float f53979q;

    /* renamed from: r  reason: collision with root package name */
    private float f53980r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f53981s;

    public RotateLoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation orientation, TypedArray typedArray) {
        super(context, mode, orientation, typedArray);
        this.f53981s = typedArray.getBoolean(15, true);
        this.f53964c.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        this.f53978p = matrix;
        this.f53964c.setImageMatrix(matrix);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.f53977o = rotateAnimation;
        rotateAnimation.setInterpolator(LoadingLayout.f53962n);
        rotateAnimation.setDuration(1200L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
    }

    private void n() {
        Matrix matrix = this.f53978p;
        if (matrix != null) {
            matrix.reset();
            this.f53964c.setImageMatrix(this.f53978p);
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    public void b(Drawable drawable) {
        if (drawable != null) {
            this.f53979q = Math.round(drawable.getIntrinsicWidth() / 2.0f);
            this.f53980r = Math.round(drawable.getIntrinsicHeight() / 2.0f);
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void d(float f5) {
        this.f53978p.setRotate(this.f53981s ? f5 * 90.0f : Math.max(0.0f, Math.min(180.0f, (f5 * 360.0f) - 180.0f)), this.f53979q, this.f53980r);
        this.f53964c.setImageMatrix(this.f53978p);
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void f() {
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected int getDefaultDrawableResId() {
        return R.drawable.default_ptr_rotate;
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void h() {
        this.f53964c.startAnimation(this.f53977o);
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void j() {
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void l() {
        this.f53964c.clearAnimation();
        n();
    }
}
