package com.kwad.components.ad.interstitial.aggregate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.kwad.sdk.R;
/* loaded from: classes5.dex */
public class ViewPagerIndicator extends View {
    private int iU;
    private int ja;
    private int jb;
    private int jc;
    private float jd;
    private float je;
    private Paint jf;
    private float jg;
    private float jh;
    private float ji;
    private int jj;
    private Paint jk;
    private float jl;
    private boolean jm;
    private a jn;
    private ValueAnimator jo;
    private final Context mContext;

    /* loaded from: classes5.dex */
    public interface a {
        void cw();
    }

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    private void cA() {
        Paint paint = new Paint(1);
        this.jf = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.jf.setStrokeWidth(1.0f);
        this.jf.setColor(this.jb);
        Paint paint2 = new Paint(1);
        this.jk = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.jk.setStrokeWidth(1.0f);
        this.jk.setColor(this.ja);
    }

    private void cB() {
        if (this.jj <= 0) {
            setVisibility(8);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.ji, this.jh);
        this.jo = ofFloat;
        ofFloat.setDuration(this.jj * 1000);
        this.jo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewPagerIndicator.this.jl = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewPagerIndicator.this.invalidate();
            }
        });
        this.jo.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewPagerIndicator.a(ViewPagerIndicator.this, true);
                if (ViewPagerIndicator.this.jn != null) {
                    ViewPagerIndicator.this.jn.cw();
                }
            }
        });
        this.jo.start();
    }

    @RequiresApi(api = 19)
    public final void cC() {
        ValueAnimator valueAnimator = this.jo;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @RequiresApi(api = 19)
    public final void cD() {
        ValueAnimator valueAnimator = this.jo;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
        b(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) this.jg : 0;
        }
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                int i6 = this.jc;
                if (i6 > 1) {
                    size = (int) (this.jh + ((i6 - 1) * (this.je + this.ji)));
                } else {
                    size = (int) this.jh;
                }
            } else {
                size = 0;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setFirstAdShowTime(int i4) {
        this.jj = i4;
    }

    public void setPlayProgressListener(a aVar) {
        this.jn = aVar;
    }

    public void setViewPager(ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            return;
        }
        int count = adapter.getCount();
        this.jc = count;
        if (count <= 1) {
            return;
        }
        this.jm = false;
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i4, float f5, int i5) {
                ViewPagerIndicator.this.iU = i4;
                ViewPagerIndicator.this.jd = f5;
                ViewPagerIndicator.this.invalidate();
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i4) {
                ViewPagerIndicator.this.iU = i4;
                ViewPagerIndicator.this.jd = 0.0f;
                ViewPagerIndicator.this.invalidate();
            }
        });
        cB();
    }

    public ViewPagerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(Canvas canvas) {
        if (this.jm || this.iU != 0) {
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, this.jl, this.jg);
        float f5 = this.jg;
        canvas.drawRoundRect(rectF, f5 / 2.0f, f5 / 2.0f, this.jk);
    }

    public ViewPagerIndicator(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mContext = context;
        setWillNotDraw(false);
        a(context, attributeSet, i4);
        cA();
    }

    static /* synthetic */ boolean a(ViewPagerIndicator viewPagerIndicator, boolean z4) {
        viewPagerIndicator.jm = true;
        return true;
    }

    @SuppressLint({"CustomViewStyleable"})
    private void a(Context context, AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_ViewPagerIndicator, i4, 0);
        this.je = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_distance, com.kwad.sdk.c.a.a.a(this.mContext, 5.0f));
        this.jg = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_height, com.kwad.sdk.c.a.a.a(this.mContext, 6.0f));
        this.jh = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_selected_width, com.kwad.sdk.c.a.a.a(this.mContext, 50.0f));
        this.ji = obtainStyledAttributes.getDimension(R.styleable.ksad_ViewPagerIndicator_ksad_dot_unselected_width, com.kwad.sdk.c.a.a.a(this.mContext, 6.0f));
        this.jb = obtainStyledAttributes.getColor(R.styleable.ksad_ViewPagerIndicator_ksad_default_color, getResources().getColor(R.color.ksad_88_white));
        this.ja = obtainStyledAttributes.getColor(R.styleable.ksad_ViewPagerIndicator_ksad_height_color, getResources().getColor(R.color.ksad_white));
        obtainStyledAttributes.recycle();
    }

    private void a(Canvas canvas) {
        RectF rectF = new RectF();
        for (int i4 = 0; i4 < this.jc; i4++) {
            int i5 = this.iU;
            if (i4 < i5) {
                float f5 = this.je;
                float f6 = this.ji;
                float f7 = i4 * (f5 + f6);
                rectF.left = f7;
                rectF.right = f7 + f6;
                this.jf.setColor(this.jb);
            } else if (i4 == i5) {
                float f8 = this.je;
                float f9 = this.ji;
                float f10 = i4 * (f8 + f9);
                rectF.left = f10;
                rectF.right = f10 + f9 + ((this.jh - f9) * (1.0f - this.jd));
                if (this.jm) {
                    this.jf.setColor(this.ja);
                    this.jf.setAlpha((int) (((1.0f - this.jd) * 127.0f) + 127.0f));
                } else {
                    this.jf.setColor(this.jb);
                }
            } else if (i4 == i5 + 1) {
                float f11 = this.je;
                float f12 = this.ji;
                float f13 = this.jh;
                float f14 = this.jd;
                float f15 = ((i4 - 1) * (f11 + f12)) + f12 + ((f13 - f12) * (1.0f - f14)) + f11;
                rectF.left = f15;
                rectF.right = f15 + (f14 * (f13 - f12)) + f12;
                if (this.jm) {
                    this.jf.setColor(this.ja);
                    this.jf.setAlpha((int) (255.0f - ((1.0f - this.jd) * 127.0f)));
                } else {
                    this.jf.setColor(this.jb);
                }
            } else {
                float f16 = this.je;
                float f17 = this.ji;
                float f18 = ((i4 - 1) * (f16 + f17)) + f16 + this.jh;
                rectF.left = f18;
                rectF.right = f18 + f17;
                this.jf.setColor(this.jb);
            }
            rectF.top = 0.0f;
            float f19 = this.jg;
            rectF.bottom = 0.0f + f19;
            canvas.drawRoundRect(rectF, f19 / 2.0f, f19 / 2.0f, this.jf);
        }
    }
}
