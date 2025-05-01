package com.beizi.fusion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.beizi.fusion.R;
/* loaded from: classes2.dex */
public class CircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f7157a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f7158b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f7159c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f7160d;

    /* renamed from: e  reason: collision with root package name */
    private int f7161e;

    /* renamed from: f  reason: collision with root package name */
    private int f7162f;

    /* renamed from: g  reason: collision with root package name */
    private int f7163g;

    /* renamed from: h  reason: collision with root package name */
    private int f7164h;

    /* renamed from: i  reason: collision with root package name */
    private float f7165i;

    /* renamed from: j  reason: collision with root package name */
    private float f7166j;

    /* renamed from: k  reason: collision with root package name */
    private float f7167k;

    /* renamed from: l  reason: collision with root package name */
    private int f7168l;

    /* renamed from: m  reason: collision with root package name */
    private int f7169m;

    /* renamed from: n  reason: collision with root package name */
    private float f7170n;

    /* renamed from: o  reason: collision with root package name */
    private float f7171o;

    /* renamed from: p  reason: collision with root package name */
    private int f7172p;

    /* renamed from: q  reason: collision with root package name */
    private int f7173q;

    /* renamed from: r  reason: collision with root package name */
    private float f7174r;

    public CircleProgressView(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircleProgressViewStyle, 0, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 18.0f, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, 4.0f, displayMetrics);
        this.f7174r = TypedValue.applyDimension(1, 50.0f, displayMetrics);
        this.f7165i = obtainStyledAttributes.getDimension(R.styleable.CircleProgressViewStyle_adScopeRadius, applyDimension);
        this.f7167k = obtainStyledAttributes.getDimension(R.styleable.CircleProgressViewStyle_adScopeStrokeWidth, applyDimension2);
        this.f7161e = obtainStyledAttributes.getColor(R.styleable.CircleProgressViewStyle_adScopeCircleColor, 0);
        this.f7162f = obtainStyledAttributes.getColor(R.styleable.CircleProgressViewStyle_adScopeRingColor, -41216);
        this.f7163g = obtainStyledAttributes.getColor(R.styleable.CircleProgressViewStyle_adScopeTextColor, -1);
        this.f7164h = obtainStyledAttributes.getColor(R.styleable.CircleProgressViewStyle_adScopeRingBgColor, 1589427388);
        this.f7166j = this.f7165i + (this.f7167k / 2.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f7168l = getWidth() / 2;
        int height = getHeight() / 2;
        this.f7169m = height;
        canvas.drawCircle(this.f7168l, height, this.f7165i, this.f7157a);
        RectF rectF = new RectF();
        int i4 = this.f7168l;
        float f5 = this.f7166j;
        rectF.left = i4 - f5;
        int i5 = this.f7169m;
        rectF.top = i5 - f5;
        rectF.right = (f5 * 2.0f) + (i4 - f5);
        rectF.bottom = (f5 * 2.0f) + (i5 - f5);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f7159c);
        if (this.f7173q > 0) {
            RectF rectF2 = new RectF();
            int i6 = this.f7168l;
            float f6 = this.f7166j;
            rectF2.left = i6 - f6;
            int i7 = this.f7169m;
            rectF2.top = i7 - f6;
            rectF2.right = (f6 * 2.0f) + (i6 - f6);
            rectF2.bottom = (f6 * 2.0f) + (i7 - f6);
            canvas.drawArc(rectF2, -90.0f, (this.f7173q / this.f7172p) * 360.0f, false, this.f7158b);
            float measureText = this.f7160d.measureText("跳过", 0, 2);
            this.f7170n = measureText;
            canvas.drawText("跳过", this.f7168l - (measureText / 2.0f), this.f7169m + (this.f7171o / 4.0f), this.f7160d);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824) {
            size = (int) (getPaddingLeft() + this.f7174r + getPaddingRight());
        }
        if (mode2 != 1073741824) {
            size2 = (int) (getPaddingTop() + this.f7174r + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public void setProgress(int i4) {
        this.f7173q = i4;
        postInvalidate();
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7172p = 100;
        a(context, attributeSet);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f7157a = paint;
        paint.setAntiAlias(true);
        this.f7157a.setColor(this.f7161e);
        this.f7157a.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f7159c = paint2;
        paint2.setAntiAlias(true);
        this.f7159c.setColor(this.f7164h);
        this.f7159c.setStyle(Paint.Style.STROKE);
        this.f7159c.setStrokeWidth(this.f7167k);
        Paint paint3 = new Paint();
        this.f7158b = paint3;
        paint3.setAntiAlias(true);
        this.f7158b.setColor(this.f7162f);
        this.f7158b.setStyle(Paint.Style.STROKE);
        this.f7158b.setStrokeWidth(this.f7167k);
        this.f7158b.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.f7160d = paint4;
        paint4.setAntiAlias(true);
        this.f7160d.setStyle(Paint.Style.FILL);
        this.f7160d.setColor(this.f7163g);
        this.f7160d.setTextSize((this.f7165i * 3.0f) / 5.0f);
        this.f7160d.setShadowLayer(2.0f, 1.0f, 1.0f, Color.parseColor("#000000"));
        Paint.FontMetrics fontMetrics = this.f7160d.getFontMetrics();
        this.f7171o = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
    }
}
