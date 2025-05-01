package com.kwad.sdk.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class ScaleAnimSeekBar extends View {
    private Rect aEA;
    private Drawable aEB;
    private boolean aEC;
    private boolean aED;
    private boolean aEE;
    private boolean aEF;
    private boolean aEG;
    private WeakReference<a> aEH;
    private boolean aEI;
    private boolean aEJ;
    private ValueAnimator aEK;
    private ValueAnimator aEL;
    private ValueAnimator aEM;
    private float aEN;
    private float aEO;
    private float aEP;
    private float aEQ;
    private int aER;
    private boolean aES;
    private Paint aEd;
    private int aEe;
    private int aEf;
    private int aEg;
    private int aEh;
    private int aEi;
    private int aEj;
    private int aEk;
    private int aEl;
    private boolean aEm;
    private int aEn;
    private int aEo;
    private int aEp;
    private int aEq;
    private int aEr;
    private int aEs;
    private int aEt;
    private GradientDrawable aEu;
    private GradientDrawable aEv;
    private GradientDrawable aEw;
    private Rect aEx;
    private Rect aEy;
    private Rect aEz;

    /* loaded from: classes5.dex */
    public interface a {
        void a(ScaleAnimSeekBar scaleAnimSeekBar);

        void a(ScaleAnimSeekBar scaleAnimSeekBar, boolean z4);

        void tV();
    }

    public ScaleAnimSeekBar(Context context) {
        this(context, null);
    }

    private void bp(boolean z4) {
        if (this.aEI) {
            if (z4) {
                bq(true);
                br(true);
                return;
            }
            bq(false);
            br(false);
        }
    }

    private void bq(boolean z4) {
        float f5 = this.aEN;
        float f6 = z4 ? this.aEO : 1.0f;
        ValueAnimator valueAnimator = this.aEK;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.aEK = valueAnimator2;
            valueAnimator2.setDuration(250L);
            this.aEK.setInterpolator(new LinearInterpolator());
            this.aEK.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ScaleAnimSeekBar.this.aEN = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    ScaleAnimSeekBar.this.requestLayout();
                }
            });
        } else {
            valueAnimator.cancel();
        }
        this.aEK.setFloatValues(f5, f6);
        this.aEK.start();
    }

    private void br(boolean z4) {
        float f5 = this.aEP;
        float f6 = z4 ? this.aEQ : 1.0f;
        ValueAnimator valueAnimator = this.aEL;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.aEL = valueAnimator2;
            valueAnimator2.setDuration(250L);
            this.aEL.setInterpolator(new LinearInterpolator());
            this.aEL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ScaleAnimSeekBar.this.aEP = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    ScaleAnimSeekBar.this.requestLayout();
                }
            });
        } else {
            valueAnimator.cancel();
        }
        this.aEL.setFloatValues(f5, f6);
        this.aEL.start();
    }

    private void bz(Context context) {
        this.aEI = true;
        this.aER = com.kwad.sdk.c.a.a.a(context, 10.0f);
        this.aEh = com.kwad.sdk.c.a.a.a(context, 3.0f);
        this.aEo = com.kwad.sdk.c.a.a.a(context, 20.0f);
        this.aEB = null;
        this.aEJ = false;
        this.aEl = com.kwad.sdk.c.a.a.a(context, 0.5f);
        this.aEk = com.kwad.sdk.c.a.a.a(context, 1.0f);
        this.aEe = 654311423;
        this.aEf = -1;
        this.aEg = 1090519039;
        this.aEi = 0;
        this.aEj = 100;
        this.aEm = false;
    }

    private boolean d(float f5, float f6) {
        int i4;
        int i5;
        Rect rect = this.aEA;
        int i6 = rect.left;
        int i7 = rect.right;
        if (i6 >= i7 || (i4 = rect.top) >= (i5 = rect.bottom)) {
            return false;
        }
        float f7 = this.aEN;
        int i8 = this.aEo;
        return f5 >= (((float) i6) * f7) - ((float) i8) && f5 <= (((float) i7) * f7) + ((float) i8) && f6 >= (((float) i4) * f7) - ((float) i8) && f6 <= (((float) i5) * f7) + ((float) i8);
    }

    private float dv(int i4) {
        int i5 = this.aEn;
        int i6 = this.aEi;
        return ((i5 * (i4 - i6)) / (this.aEj - i6)) - (i5 / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int dw(int i4) {
        int i5 = this.aEn;
        if (i4 > i5 / 2) {
            return this.aEj;
        }
        if (i4 < (-i5) / 2) {
            return this.aEi;
        }
        return Math.round(((i4 + (i5 / 2.0f)) * (this.aEj - this.aEi)) / i5) + this.aEi;
    }

    private boolean e(float f5, float f6) {
        int i4;
        int i5;
        Rect rect = this.aEx;
        int i6 = rect.left;
        int i7 = rect.right;
        if (i6 >= i7 || (i4 = rect.top) >= (i5 = rect.bottom)) {
            return false;
        }
        float f7 = this.aEP;
        int i8 = this.aEo;
        return f5 >= (((float) i6) * f7) - ((float) i8) && f5 <= (((float) i7) * f7) + ((float) i8) && f6 >= (((float) i4) * f7) - ((float) i8) && f6 <= (((float) i5) * f7) + ((float) i8);
    }

    private a getOnSeekBarChangedListener() {
        WeakReference<a> weakReference = this.aEH;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void i(boolean z4, int i4) {
        if (z4) {
            float j4 = j(dv(this.aEp));
            float j5 = j(dv(i4));
            ValueAnimator valueAnimator = this.aEM;
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.aEM = valueAnimator2;
                valueAnimator2.setDuration(300L);
                this.aEM.setInterpolator(new Interpolator() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.1
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f5) {
                        float f6 = f5 - 1.0f;
                        return (f6 * f6 * f6) + 1.0f;
                    }
                });
                this.aEM.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.sdk.core.view.ScaleAnimSeekBar.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ScaleAnimSeekBar scaleAnimSeekBar = ScaleAnimSeekBar.this;
                        scaleAnimSeekBar.aEp = scaleAnimSeekBar.dw((int) floatValue);
                        ScaleAnimSeekBar.this.i(floatValue);
                    }
                });
            } else {
                valueAnimator.cancel();
            }
            this.aEM.setFloatValues(j4, j5);
            this.aEM.start();
            return;
        }
        this.aEp = i4;
        i(j(dv(i4)));
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            bz(context);
        }
        Paint paint = new Paint();
        this.aEd = paint;
        paint.setStyle(Paint.Style.FILL);
        this.aEd.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.aEu = gradientDrawable;
        gradientDrawable.setShape(0);
        this.aEu.setColor(this.aEe);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.aEv = gradientDrawable2;
        gradientDrawable2.setShape(0);
        this.aEv.setColor(this.aEf);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.aEw = gradientDrawable3;
        gradientDrawable3.setShape(0);
        this.aEw.setColor(this.aEg);
        this.aEx = new Rect();
        this.aEy = new Rect();
        this.aEA = new Rect();
        this.aEz = new Rect();
        this.aEp = this.aEi;
    }

    private float j(float f5) {
        float f6 = this.aEn / 2;
        if (f5 > f6) {
            return f6;
        }
        float f7 = -f6;
        return f5 < f7 ? f7 : f5;
    }

    private void x(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        if (this.aEI) {
            this.aEn = (int) (i4 - ((this.aER * 2) * (this.aEO - this.aEN)));
        } else {
            this.aEn = i4 - (this.aER * 2);
        }
        Rect rect = this.aEx;
        int i6 = this.aEl;
        int i7 = -i6;
        rect.top = i7;
        rect.bottom = -i7;
        boolean z4 = this.aEm;
        rect.left = (z4 ? -i4 : -this.aEn) / 2;
        rect.right = z4 ? i4 / 2 : this.aEn / 2;
        Rect rect2 = this.aEy;
        int i8 = -i6;
        rect2.top = i8;
        rect2.bottom = -i8;
        rect2.left = (z4 ? -i4 : -this.aEn) / 2;
        int i9 = this.aEn;
        rect2.right = (-i9) / 2;
        Rect rect3 = this.aEz;
        rect3.top = -i6;
        rect3.bottom = -rect2.top;
        rect3.left = (z4 ? -i4 : -i9) / 2;
        rect3.right = (-i9) / 2;
        Rect rect4 = this.aEA;
        int i10 = this.aEh;
        rect4.top = -i10;
        rect4.bottom = i10;
        rect4.left = ((-i9) / 2) - i10;
        rect4.right = ((-i9) / 2) + i10;
        setThumbDrawable(this.aEB);
        setProgress(this.aEp);
        setSecondaryProgress(this.aEr);
    }

    public final void bo(boolean z4) {
        this.aES = z4;
        bp(z4);
    }

    public int getMaxProgress() {
        return this.aEj;
    }

    public int getProgress() {
        return this.aEp;
    }

    public int getProgressLength() {
        return this.aEn;
    }

    public int getProgressX() {
        return (int) (getX() + (this.aEh * this.aEO));
    }

    public int getSecondaryProgress() {
        return this.aEr;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.aEt / 2, this.aEs / 2);
        a(canvas, this.aEx, this.aEu);
        a(canvas, this.aEz, this.aEw);
        a(canvas, this.aEy, this.aEv);
        if (this.aES) {
            c(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode == 1073741824) {
            this.aEt = size;
        } else {
            this.aEt = getWidth();
        }
        if (mode2 == 1073741824) {
            this.aEs = size2;
        } else {
            this.aEs = getHeight();
        }
        x(this.aEt, this.aEs);
        setMeasuredDimension(this.aEt, this.aEs);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX() - (this.aEt / 2);
        float y2 = motionEvent.getY() - (this.aEs / 2);
        ViewParent parent = getParent();
        a onSeekBarChangedListener = getOnSeekBarChangedListener();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (this.aEC || this.aED)) {
                    a(dw((int) x4), false, true);
                }
            } else {
                this.aEG = false;
                if (this.aED || this.aEC) {
                    this.aED = false;
                    this.aEC = false;
                    a(dw((int) x4), this.aEJ, true);
                    if (onSeekBarChangedListener != null) {
                        onSeekBarChangedListener.a(this);
                    }
                }
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        } else if (!this.aEF) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (d(x4, y2)) {
                bp(true);
                this.aEC = true;
                this.aEG = true;
                if (onSeekBarChangedListener != null) {
                    onSeekBarChangedListener.tV();
                }
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (e(x4, y2)) {
                bp(true);
                this.aED = true;
                if (onSeekBarChangedListener != null) {
                    onSeekBarChangedListener.tV();
                }
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return true;
    }

    public void setMaxProgress(int i4) {
        this.aEj = i4;
    }

    public void setMinProgress(int i4) {
        this.aEi = i4;
        if (this.aEp < i4) {
            this.aEp = i4;
        }
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.aEH = new WeakReference<>(aVar);
    }

    public void setProgress(int i4) {
        a(i4, false, false);
    }

    public void setProgressBackgroundColor(@ColorInt int i4) {
        this.aEe = i4;
        this.aEu.setColor(i4);
    }

    public void setProgressColor(@ColorInt int i4) {
        this.aEf = i4;
        this.aEv.setColor(i4);
    }

    public void setSecondaryProgress(int i4) {
        int i5 = this.aEi;
        if (i4 <= i5 || i4 >= (i5 = this.aEj)) {
            i4 = i5;
        }
        this.aEr = i4;
        this.aEz.right = (int) j(dv(i4));
        invalidate();
    }

    public void setSecondaryProgressColor(@ColorInt int i4) {
        this.aEg = i4;
        this.aEw.setColor(i4);
    }

    public void setThumbDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.aEB = drawable;
    }

    public void setThumbEnable(boolean z4) {
        this.aEF = z4;
    }

    public void setThumbScale(float f5) {
        this.aEN = f5;
    }

    public void setThumbTouchOffset(int i4) {
        this.aEo = i4;
        invalidate();
    }

    public ScaleAnimSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.aEB;
        if (drawable != null) {
            drawable.setBounds(this.aEA);
            this.aEB.draw(canvas);
        } else {
            this.aEd.setColor(this.aEf);
            canvas.drawCircle(this.aEA.centerX(), this.aEA.centerY(), (this.aEA.width() * this.aEN) / 2.0f, this.aEd);
        }
        canvas.restore();
    }

    public ScaleAnimSeekBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.aEj = 100;
        this.aEm = false;
        this.aEB = null;
        this.aEC = false;
        this.aED = false;
        this.aEE = false;
        this.aEF = true;
        this.aEI = true;
        this.aEJ = false;
        this.aEN = 1.0f;
        this.aEO = 1.34f;
        this.aEP = 1.0f;
        this.aEQ = 2.0f;
        init(context, attributeSet);
    }

    private void a(Canvas canvas, Rect rect, GradientDrawable gradientDrawable) {
        canvas.save();
        Rect rect2 = new Rect();
        float f5 = this.aEP;
        rect2.top = (int) (rect.top * f5);
        rect2.bottom = (int) (rect.bottom * f5);
        rect2.left = rect.left;
        rect2.right = rect.right;
        gradientDrawable.setBounds(rect2);
        gradientDrawable.setCornerRadius(this.aEk * this.aEP);
        gradientDrawable.draw(canvas);
        canvas.restore();
    }

    private void a(int i4, boolean z4, boolean z5) {
        int i5 = this.aEi;
        if (i4 <= i5 || i4 >= (i5 = this.aEj)) {
            i4 = i5;
        }
        i(z4, i4);
        a onSeekBarChangedListener = getOnSeekBarChangedListener();
        if (onSeekBarChangedListener != null && this.aEq != this.aEp) {
            this.aEE = z5;
            onSeekBarChangedListener.a(this, z5);
            this.aEE = false;
        }
        this.aEq = this.aEp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(float f5) {
        Rect rect = this.aEA;
        int i4 = this.aEh;
        rect.left = (int) (f5 - i4);
        rect.right = (int) (i4 + f5);
        this.aEy.right = (int) f5;
        invalidate();
    }
}
