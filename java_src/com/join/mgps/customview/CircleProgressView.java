package com.join.mgps.customview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CircleProgressView extends View {

    /* renamed from: i  reason: collision with root package name */
    public static final String f46534i = "progress";

    /* renamed from: b  reason: collision with root package name */
    private float f46535b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f46536c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f46537d;

    /* renamed from: e  reason: collision with root package name */
    private int f46538e;

    /* renamed from: f  reason: collision with root package name */
    private int f46539f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f46540g;

    /* renamed from: h  reason: collision with root package name */
    private float f46541h;

    /* loaded from: classes4.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = 1.0f - f5;
            return 1.0f - ((f6 * f6) * f6);
        }
    }

    /* loaded from: classes4.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleProgressView.this.f46535b = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f) / 100.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(CircleProgressView.this.f46535b);
            sb.append("");
            CircleProgressView.this.invalidate();
        }
    }

    public CircleProgressView(Context context) {
        super(context);
        this.f46538e = 40;
        this.f46539f = 5;
    }

    public void c(float f5) {
        this.f46535b = f5;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, f5);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        String str;
        this.f46537d.setShader(null);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f46537d.setAntiAlias(true);
        this.f46537d.setStrokeWidth(1.0f);
        this.f46537d.setStyle(Paint.Style.FILL);
        this.f46537d.setStrokeCap(Paint.Cap.BUTT);
        this.f46537d.setColor(Color.parseColor("#000000"));
        new DisplayMetrics();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        double d5 = f5;
        Double.isNaN(d5);
        float f6 = (float) (d5 * 3.5d);
        double d6 = f5;
        Double.isNaN(d6);
        float f7 = (float) (d6 * 2.5d);
        float f8 = measuredWidth;
        float f9 = f8 - f7;
        float f10 = measuredHeight;
        float f11 = f10 - f7;
        this.f46537d.setShader(new LinearGradient(f7, f7, f9, f11, new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#efefef")}, (float[]) null, Shader.TileMode.CLAMP));
        this.f46536c.set(f7, f7, f9, f11);
        canvas.drawArc(this.f46536c, 0.0f, 360.0f, false, this.f46537d);
        this.f46537d.setShader(null);
        this.f46537d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f46537d.setColor(Color.parseColor("#cccccc"));
        this.f46537d.setMaskFilter(new BlurMaskFilter(f7, BlurMaskFilter.Blur.OUTER));
        this.f46536c.set(f7, f7, f9, f11);
        canvas.drawArc(this.f46536c, 0.0f, 360.0f, false, this.f46537d);
        this.f46537d.setColor(Color.parseColor("#DDDDDD"));
        float f12 = f7 + f6;
        float f13 = f12 + (this.f46539f / 2);
        this.f46537d.setStyle(Paint.Style.STROKE);
        this.f46537d.setStrokeWidth(this.f46539f);
        this.f46537d.setMaskFilter(null);
        float f14 = f8 - f13;
        float f15 = f10 - f13;
        this.f46536c.set(f13, f13, f14, f15);
        canvas.drawArc(this.f46536c, 0.0f, 360.0f, false, this.f46537d);
        this.f46537d.setColor(Color.parseColor("#000000"));
        this.f46537d.setStyle(Paint.Style.STROKE);
        this.f46537d.setStrokeWidth(1.0f);
        this.f46537d.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.INNER));
        this.f46536c.set(f12, f12, f8 - f12, f10 - f12);
        canvas.drawArc(this.f46536c, 0.0f, 360.0f, false, this.f46537d);
        float f16 = f6 + 5.0f + this.f46539f;
        this.f46537d.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.INNER));
        this.f46536c.set(f16, f16, f8 - f16, f10 - f16);
        canvas.drawArc(this.f46536c, 0.0f, 360.0f, false, this.f46537d);
        this.f46537d.setMaskFilter(null);
        this.f46537d.setColor(Color.parseColor("#f47500"));
        float f17 = measuredWidth / 2;
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wufan_name), f17 - (((displayMetrics.density * 35.0f) / 2.0f) / 2.0f), (measuredHeight * 70) / 110, this.f46537d);
        this.f46537d.setStrokeWidth(this.f46539f);
        this.f46537d.setStyle(Paint.Style.STROKE);
        this.f46536c.set(f13, f13, f14, f15);
        int[] iArr = this.f46540g;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        SweepGradient sweepGradient = new SweepGradient(f17, f17, iArr2, (float[]) null);
        int i5 = (int) ((1.0f - (this.f46535b / this.f46541h)) * 90.0f);
        float f18 = measuredHeight / 2;
        canvas.rotate((-90) - i5, f18, f18);
        this.f46537d.setStyle(Paint.Style.STROKE);
        this.f46537d.setShader(sweepGradient);
        canvas.drawArc(this.f46536c, 0.0f, this.f46535b, false, this.f46537d);
        canvas.rotate(i5 + 90, f18, f18);
        this.f46537d.setTextSize((((measuredHeight * 31) * 12) / 110) / 10);
        this.f46537d.setShader(new SweepGradient(f17, f17, Color.parseColor("#f47500"), Color.parseColor("#f47500")));
        this.f46537d.setStyle(Paint.Style.FILL);
        this.f46537d.setTypeface(Typeface.create(Typeface.SANS_SERIF, 3));
        canvas.drawText((((int) Math.rint((this.f46535b * 100.0f) / 360.0f)) / 10.0f) + "", i4 - (((int) this.f46537d.measureText(str, 0, str.length())) / 2), (measuredHeight * 60) / 110, this.f46537d);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f46538e <= 40) {
            this.f46538e = 40;
        }
        int i6 = this.f46538e;
        setMeasuredDimension(i6, i6);
    }

    public void setColors(int[] iArr) {
        this.f46540g = iArr;
    }

    public void setFirstProgressfloat(float f5) {
        this.f46541h = (360.0f * f5) / 100.0f;
        c(f5);
    }

    public void setProgress(float f5) {
        this.f46535b = (f5 * 360.0f) / 100.0f;
        invalidate();
    }

    public void setValue(float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f5);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new a());
        ofFloat.addUpdateListener(new b());
        ofFloat.start();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46538e = 40;
        this.f46539f = 5;
        try {
            setLayerType(1, null);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleProgressView);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 40);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(0, 40);
            this.f46538e = dimensionPixelOffset;
            this.f46539f = dimensionPixelOffset2;
            obtainStyledAttributes.recycle();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f46537d = new Paint();
        this.f46536c = new RectF();
        this.f46535b = 50.0f;
    }
}
