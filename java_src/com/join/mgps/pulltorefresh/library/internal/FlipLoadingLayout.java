package com.join.mgps.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public class FlipLoadingLayout extends LoadingLayout {

    /* renamed from: q  reason: collision with root package name */
    static final int f53950q = 150;

    /* renamed from: o  reason: collision with root package name */
    private final Animation f53951o;

    /* renamed from: p  reason: collision with root package name */
    private final Animation f53952p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53953a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f53953a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53953a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlipLoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation orientation, TypedArray typedArray) {
        super(context, mode, orientation, typedArray);
        float f5 = mode == PullToRefreshBase.Mode.PULL_FROM_START ? -180 : 180;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f5, 1, 0.5f, 1, 0.5f);
        this.f53951o = rotateAnimation;
        Interpolator interpolator = LoadingLayout.f53962n;
        rotateAnimation.setInterpolator(interpolator);
        rotateAnimation.setDuration(150L);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(f5, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f53952p = rotateAnimation2;
        rotateAnimation2.setInterpolator(interpolator);
        rotateAnimation2.setDuration(150L);
        rotateAnimation2.setFillAfter(true);
    }

    private float getDrawableRotationAngle() {
        int i4 = a.f53953a[this.f53969h.ordinal()];
        return i4 != 1 ? (i4 == 2 && this.f53970i == PullToRefreshBase.Orientation.HORIZONTAL) ? 270.0f : 0.0f : this.f53970i == PullToRefreshBase.Orientation.HORIZONTAL ? 90.0f : 180.0f;
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void b(Drawable drawable) {
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = this.f53964c.getLayoutParams();
            int max = Math.max(intrinsicHeight, intrinsicWidth);
            layoutParams.height = max;
            layoutParams.width = max;
            this.f53964c.requestLayout();
            this.f53964c.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.postTranslate((layoutParams.width - intrinsicWidth) / 2.0f, (layoutParams.height - intrinsicHeight) / 2.0f);
            matrix.postRotate(getDrawableRotationAngle(), layoutParams.width / 2.0f, layoutParams.height / 2.0f);
            this.f53964c.setImageMatrix(matrix);
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void d(float f5) {
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void f() {
        if (this.f53951o == this.f53964c.getAnimation()) {
            this.f53964c.startAnimation(this.f53952p);
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected int getDefaultDrawableResId() {
        return R.drawable.default_ptr_flip;
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void h() {
        this.f53964c.clearAnimation();
        this.f53964c.setVisibility(4);
        this.f53965d.setVisibility(0);
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void j() {
        this.f53964c.startAnimation(this.f53951o);
    }

    @Override // com.join.mgps.pulltorefresh.library.internal.LoadingLayout
    protected void l() {
        this.f53964c.clearAnimation();
        this.f53965d.setVisibility(8);
        this.f53964c.setVisibility(0);
    }
}
