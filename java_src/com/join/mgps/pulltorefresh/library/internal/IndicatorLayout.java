package com.join.mgps.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public class IndicatorLayout extends FrameLayout implements Animation.AnimationListener {

    /* renamed from: g  reason: collision with root package name */
    static final int f53954g = 150;

    /* renamed from: b  reason: collision with root package name */
    private Animation f53955b;

    /* renamed from: c  reason: collision with root package name */
    private Animation f53956c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f53957d;

    /* renamed from: e  reason: collision with root package name */
    private final Animation f53958e;

    /* renamed from: f  reason: collision with root package name */
    private final Animation f53959f;

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53960a;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f53960a = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53960a[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IndicatorLayout(Context context, PullToRefreshBase.Mode mode) {
        super(context);
        int i4;
        int i5;
        this.f53957d = new ImageView(context);
        Drawable drawable = getResources().getDrawable(R.drawable.indicator_arrow);
        this.f53957d.setImageDrawable(drawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.indicator_internal_padding);
        this.f53957d.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.f53957d);
        if (a.f53960a[mode.ordinal()] != 1) {
            i4 = R.anim.slide_in_from_top;
            i5 = R.anim.slide_out_to_top;
            setBackgroundResource(R.drawable.indicator_bg_top);
        } else {
            i4 = R.anim.slide_in_from_bottom;
            setBackgroundResource(R.drawable.indicator_bg_bottom);
            this.f53957d.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f, drawable.getIntrinsicWidth() / 2.0f, drawable.getIntrinsicHeight() / 2.0f);
            this.f53957d.setImageMatrix(matrix);
            i5 = R.anim.slide_out_to_bottom;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i4);
        this.f53955b = loadAnimation;
        loadAnimation.setAnimationListener(this);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i5);
        this.f53956c = loadAnimation2;
        loadAnimation2.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f53958e = rotateAnimation;
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(150L);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f53959f = rotateAnimation2;
        rotateAnimation2.setInterpolator(linearInterpolator);
        rotateAnimation2.setDuration(150L);
        rotateAnimation2.setFillAfter(true);
    }

    public void a() {
        startAnimation(this.f53956c);
    }

    public final boolean b() {
        Animation animation = getAnimation();
        return animation != null ? this.f53955b == animation : getVisibility() == 0;
    }

    public void c() {
        this.f53957d.startAnimation(this.f53959f);
    }

    public void d() {
        this.f53957d.startAnimation(this.f53958e);
    }

    public void e() {
        this.f53957d.clearAnimation();
        startAnimation(this.f53955b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f53956c) {
            this.f53957d.clearAnimation();
            setVisibility(8);
        } else if (animation == this.f53955b) {
            setVisibility(0);
        }
        clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        setVisibility(0);
    }
}
