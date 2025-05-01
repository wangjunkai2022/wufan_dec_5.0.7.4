package com.join.mgps.customview;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CustomCircleProgressBar extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f46778b;

    /* renamed from: c  reason: collision with root package name */
    private float f46779c;

    /* renamed from: d  reason: collision with root package name */
    private int f46780d;

    /* renamed from: e  reason: collision with root package name */
    private int f46781e;

    /* renamed from: f  reason: collision with root package name */
    private float f46782f;

    /* renamed from: g  reason: collision with root package name */
    private float f46783g;

    /* renamed from: h  reason: collision with root package name */
    private int f46784h;

    /* renamed from: i  reason: collision with root package name */
    private float f46785i;

    /* renamed from: j  reason: collision with root package name */
    private int f46786j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f46787k;

    /* renamed from: l  reason: collision with root package name */
    private String f46788l;

    /* renamed from: m  reason: collision with root package name */
    private Rect f46789m;

    /* renamed from: n  reason: collision with root package name */
    private ValueAnimator f46790n;

    /* loaded from: classes4.dex */
    enum DirectionEnum {
        LEFT(0, 180.0f),
        TOP(1, 270.0f),
        RIGHT(2, 0.0f),
        BOTTOM(3, 90.0f);
        
        private final float degree;
        private final int direction;

        DirectionEnum(int i4, float f5) {
            this.direction = i4;
            this.degree = f5;
        }

        public boolean equalsDescription(int i4) {
            return this.direction == i4;
        }

        public float getDegree() {
            return this.degree;
        }

        public int getDirection() {
            return this.direction;
        }

        public static float getDegree(int i4) {
            DirectionEnum direction = getDirection(i4);
            if (direction == null) {
                return 0.0f;
            }
            return direction.getDegree();
        }

        public static DirectionEnum getDirection(int i4) {
            DirectionEnum[] values;
            for (DirectionEnum directionEnum : values()) {
                if (directionEnum.equalsDescription(i4)) {
                    return directionEnum;
                }
            }
            return RIGHT;
        }
    }

    /* loaded from: classes4.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CustomCircleProgressBar.this.f46785i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CustomCircleProgressBar.this.postInvalidate();
        }
    }

    public CustomCircleProgressBar(Context context) {
        this(context, null);
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void c(float f5) {
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.0f, f5);
        this.f46790n = ofFloat;
        ofFloat.addUpdateListener(new a());
        this.f46790n.setStartDelay(500L);
        this.f46790n.setDuration(2000L);
        this.f46790n.setInterpolator(new LinearInterpolator());
        this.f46790n.start();
    }

    private String getProgressText() {
        return ((int) ((this.f46785i / this.f46784h) * 100.0f)) + "%";
    }

    public int getInsideColor() {
        return this.f46780d;
    }

    public synchronized int getMaxProgress() {
        return this.f46784h;
    }

    public int getOutsideColor() {
        return this.f46778b;
    }

    public float getOutsideRadius() {
        return this.f46779c;
    }

    public synchronized float getProgress() {
        return this.f46785i;
    }

    public int getProgressTextColor() {
        return this.f46781e;
    }

    public float getProgressTextSize() {
        return this.f46782f;
    }

    public float getProgressWidth() {
        return this.f46783g;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint.FontMetricsInt fontMetricsInt;
        super.onDraw(canvas);
        this.f46787k.setColor(this.f46780d);
        this.f46787k.setStyle(Paint.Style.STROKE);
        this.f46787k.setStrokeWidth(this.f46783g);
        this.f46787k.setAntiAlias(true);
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, this.f46779c, this.f46787k);
        this.f46787k.setColor(this.f46778b);
        float f5 = this.f46779c;
        canvas.drawArc(new RectF(width - f5, width - f5, width + f5, width + f5), DirectionEnum.getDegree(this.f46786j), (this.f46785i / this.f46784h) * 360.0f, false, this.f46787k);
        this.f46789m = new Rect();
        this.f46787k.setColor(this.f46781e);
        this.f46787k.setTextSize(this.f46782f);
        this.f46787k.setStrokeWidth(0.0f);
        String progressText = getProgressText();
        this.f46788l = progressText;
        this.f46787k.getTextBounds(progressText, 0, progressText.length(), this.f46789m);
        int i4 = this.f46787k.getFontMetricsInt().top;
        canvas.drawText(this.f46788l, (getMeasuredWidth() / 2) - (this.f46789m.width() / 2), (((getMeasuredHeight() - fontMetricsInt.bottom) + i4) / 2) - i4, this.f46787k);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            size = (int) ((this.f46779c * 2.0f) + this.f46783g);
        }
        int size2 = View.MeasureSpec.getSize(i5);
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            size2 = (int) ((this.f46779c * 2.0f) + this.f46783g);
        }
        setMeasuredDimension(size, size2);
    }

    public void setInsideColor(int i4) {
        this.f46780d = i4;
    }

    public synchronized void setMaxProgress(int i4) {
        if (i4 >= 0) {
            this.f46784h = i4;
        } else {
            throw new IllegalArgumentException("maxProgress should not be less than 0");
        }
    }

    public void setOutsideColor(int i4) {
        this.f46778b = i4;
    }

    public void setOutsideRadius(float f5) {
        this.f46779c = f5;
    }

    public synchronized void setProgress(int i4) {
        if (i4 >= 0) {
            int i5 = this.f46784h;
            if (i4 > i5) {
                i4 = i5;
            }
            this.f46785i = i4;
            postInvalidate();
        } else {
            throw new IllegalArgumentException("progress should not be less than 0");
        }
    }

    public void setProgressTextColor(int i4) {
        this.f46781e = i4;
    }

    public void setProgressTextSize(float f5) {
        this.f46782f = f5;
    }

    public void setProgressWidth(float f5) {
        this.f46783g = f5;
    }

    public CustomCircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomCircleProgressBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CustomCircleProgressBar, i4, 0);
        this.f46778b = obtainStyledAttributes.getColor(3, ContextCompat.getColor(getContext(), R.color.colorPrimary));
        this.f46779c = obtainStyledAttributes.getDimension(4, b(getContext(), 60.0f));
        this.f46780d = obtainStyledAttributes.getColor(1, ContextCompat.getColor(getContext(), R.color.inside_color));
        this.f46781e = obtainStyledAttributes.getColor(6, ContextCompat.getColor(getContext(), R.color.colorPrimary));
        this.f46782f = obtainStyledAttributes.getDimension(7, b(getContext(), 14.0f));
        this.f46783g = obtainStyledAttributes.getDimension(8, b(getContext(), 10.0f));
        this.f46785i = obtainStyledAttributes.getFloat(5, 50.0f);
        this.f46784h = obtainStyledAttributes.getInt(2, 100);
        this.f46786j = obtainStyledAttributes.getInt(0, 3);
        obtainStyledAttributes.recycle();
        this.f46787k = new Paint();
    }
}
