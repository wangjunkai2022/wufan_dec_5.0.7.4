package com.join.mgps.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RequiresApi;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CircleDownloadProgressBar extends View {

    /* renamed from: n  reason: collision with root package name */
    private static int f46478n = 100;

    /* renamed from: b  reason: collision with root package name */
    private int f46479b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46480c;

    /* renamed from: d  reason: collision with root package name */
    private int f46481d;

    /* renamed from: e  reason: collision with root package name */
    private int f46482e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f46483f;

    /* renamed from: g  reason: collision with root package name */
    private Context f46484g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f46485h;

    /* renamed from: i  reason: collision with root package name */
    private int f46486i;

    /* renamed from: j  reason: collision with root package name */
    private int f46487j;

    /* renamed from: k  reason: collision with root package name */
    private int f46488k;

    /* renamed from: l  reason: collision with root package name */
    private int f46489l;

    /* renamed from: m  reason: collision with root package name */
    private int f46490m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleDownloadProgressBar.this.f46481d = (((Integer) valueAnimator.getAnimatedValue()).intValue() * 360) / CircleDownloadProgressBar.f46478n;
            CircleDownloadProgressBar.this.invalidate();
        }
    }

    public CircleDownloadProgressBar(Context context) {
        this(context, null);
    }

    public void c(AttributeSet attributeSet) {
        this.f46485h = new Paint();
        this.f46483f = new Paint();
        TypedArray obtainStyledAttributes = this.f46484g.obtainStyledAttributes(attributeSet, R.styleable.CircleDownloadProgressBar);
        this.f46482e = obtainStyledAttributes.getColor(2, getResources().getColor(R.color.colorPrimaryDark));
        this.f46489l = obtainStyledAttributes.getColor(4, getResources().getColor(R.color.colorAccent));
        this.f46487j = obtainStyledAttributes.getDimensionPixelOffset(3, 20);
        boolean z4 = obtainStyledAttributes.getBoolean(1, false);
        this.f46480c = z4;
        if (z4) {
            this.f46490m = obtainStyledAttributes.getColor(5, this.f46484g.getResources().getColor(R.color.colorPrimary));
            this.f46479b = obtainStyledAttributes.getColor(0, this.f46484g.getResources().getColor(R.color.colorAccent));
        }
        obtainStyledAttributes.recycle();
    }

    public int getProgress() {
        return this.f46486i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int min = Math.min(getHeight(), getWidth()) / 2;
        int i4 = min - (this.f46487j / 2);
        this.f46483f.setAntiAlias(true);
        this.f46483f.setStrokeCap(Paint.Cap.ROUND);
        this.f46483f.setStrokeWidth(this.f46487j - 1);
        this.f46483f.setStyle(Paint.Style.STROKE);
        this.f46485h.setAntiAlias(true);
        this.f46485h.setColor(this.f46482e);
        this.f46485h.setStrokeWidth(this.f46487j);
        this.f46485h.setStyle(Paint.Style.STROKE);
        this.f46485h.setStrokeCap(Paint.Cap.ROUND);
        float f5 = min - i4;
        int i5 = min + i4;
        float f6 = i5;
        RectF rectF = new RectF(f5, f5, f6, f6);
        if (this.f46480c) {
            float f7 = i5 / 2;
            LinearGradient linearGradient = new LinearGradient(f7, 0.0f, f7, getHeight(), new int[]{this.f46479b, this.f46490m}, (float[]) null, Shader.TileMode.MIRROR);
            Matrix matrix = new Matrix();
            matrix.setRotate(-183.0f, f7, f7);
            linearGradient.setLocalMatrix(matrix);
            this.f46483f.setShader(linearGradient);
        } else {
            this.f46483f.setColor(this.f46489l);
        }
        float f8 = min;
        canvas.drawCircle(f8, f8, i4, this.f46483f);
        canvas.drawArc(rectF, this.f46488k, -this.f46481d, false, this.f46485h);
    }

    public void setProgress(int i4, boolean z4) {
        if (z4) {
            setProgress(i4);
            return;
        }
        int i5 = f46478n;
        if (i4 > i5) {
            this.f46486i = i5;
            this.f46481d = 360;
        } else {
            this.f46486i = i4;
            this.f46481d = (i4 * 360) / i5;
        }
        invalidate();
    }

    public void setStartAngle(int i4) {
        this.f46488k = i4;
    }

    public CircleDownloadProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleDownloadProgressBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46486i = 100;
        this.f46488k = -90;
        this.f46484g = context;
        c(attributeSet);
    }

    @RequiresApi(api = 21)
    public CircleDownloadProgressBar(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f46486i = 100;
        this.f46488k = -90;
        this.f46484g = context;
        c(attributeSet);
    }

    public void setProgress(int i4) {
        int i5 = this.f46486i;
        int i6 = f46478n;
        if (i4 > i6) {
            this.f46486i = i6;
        } else {
            this.f46486i = i6 - i4;
        }
        int abs = (Math.abs(i4 - i5) * 1000) / f46478n;
        new ValueAnimator();
        ValueAnimator ofInt = ValueAnimator.ofInt(i5, this.f46486i);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(abs);
        ofInt.addUpdateListener(new a());
        ofInt.start();
    }
}
