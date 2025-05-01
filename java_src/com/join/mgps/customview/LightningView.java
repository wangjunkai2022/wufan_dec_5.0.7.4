package com.join.mgps.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.Nullable;
/* loaded from: classes4.dex */
public class LightningView extends View {

    /* renamed from: b  reason: collision with root package name */
    private Shader f47282b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f47283c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f47284d;

    /* renamed from: e  reason: collision with root package name */
    private int f47285e;

    /* renamed from: f  reason: collision with root package name */
    private int f47286f;

    /* renamed from: g  reason: collision with root package name */
    private float f47287g;

    /* renamed from: h  reason: collision with root package name */
    private float f47288h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47289i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f47290j;

    /* renamed from: k  reason: collision with root package name */
    private ValueAnimator f47291k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f47292l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LightningView lightningView = LightningView.this;
            lightningView.f47287g = ((lightningView.f47285e * 4) * floatValue) - (LightningView.this.f47285e * 2);
            LightningView lightningView2 = LightningView.this;
            lightningView2.f47288h = lightningView2.f47286f * floatValue;
            if (LightningView.this.f47283c != null) {
                LightningView.this.f47283c.setTranslate(LightningView.this.f47287g, LightningView.this.f47288h);
            }
            if (LightningView.this.f47282b != null) {
                LightningView.this.f47282b.setLocalMatrix(LightningView.this.f47283c);
            }
            LightningView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LightningView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LightningView.this.f47289i = true;
            if (LightningView.this.f47291k != null) {
                LightningView.this.f47291k.start();
            }
        }
    }

    public LightningView(Context context) {
        super(context);
        this.f47285e = 0;
        this.f47286f = 0;
        this.f47287g = 0.0f;
        this.f47288h = 0.0f;
        this.f47289i = false;
        this.f47292l = true;
        k();
    }

    private void k() {
        this.f47290j = new Rect();
        this.f47284d = new Paint();
        l();
    }

    private void l() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47291k = ofFloat;
        ofFloat.setDuration(2000L);
        this.f47291k.setInterpolator(new AccelerateInterpolator());
        this.f47291k.addUpdateListener(new a());
        if (this.f47292l) {
            this.f47291k.setRepeatCount(-1);
            getViewTreeObserver().addOnGlobalLayoutListener(new b());
        }
    }

    public void m() {
        ValueAnimator valueAnimator;
        if (this.f47289i || (valueAnimator = this.f47291k) == null) {
            return;
        }
        this.f47289i = true;
        valueAnimator.start();
    }

    public void n() {
        ValueAnimator valueAnimator;
        if (!this.f47289i || (valueAnimator = this.f47291k) == null) {
            return;
        }
        this.f47289i = false;
        valueAnimator.cancel();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f47289i || this.f47283c == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getHeight() / 2, this.f47284d);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f47290j.set(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (this.f47285e == 0) {
            this.f47285e = getWidth();
            this.f47286f = getHeight();
            if (this.f47285e > 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f47285e, this.f47286f / 3, new int[]{16777215, 1090519039, 16777215, 1090519039, 16777215, 16777215}, new float[]{0.0f, 0.45f, 0.46f, 0.75f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                this.f47282b = linearGradient;
                this.f47284d.setShader(linearGradient);
                this.f47284d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.f47283c = matrix;
                matrix.setTranslate(this.f47285e * (-2), this.f47286f);
                this.f47282b.setLocalMatrix(this.f47283c);
                this.f47290j.set(0, 0, i4, i5);
            }
        }
    }

    public void setAutoRun(boolean z4) {
        this.f47292l = z4;
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47285e = 0;
        this.f47286f = 0;
        this.f47287g = 0.0f;
        this.f47288h = 0.0f;
        this.f47289i = false;
        this.f47292l = true;
        k();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47285e = 0;
        this.f47286f = 0;
        this.f47287g = 0.0f;
        this.f47288h = 0.0f;
        this.f47289i = false;
        this.f47292l = true;
        k();
    }
}
