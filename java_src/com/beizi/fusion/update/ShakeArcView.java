package com.beizi.fusion.update;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.g.af;
/* loaded from: classes2.dex */
public class ShakeArcView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f7117a;

    /* renamed from: b  reason: collision with root package name */
    private int f7118b;

    /* renamed from: c  reason: collision with root package name */
    private int f7119c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f7120d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f7121e;

    /* renamed from: f  reason: collision with root package name */
    private double f7122f;

    /* renamed from: g  reason: collision with root package name */
    private double f7123g;

    /* renamed from: h  reason: collision with root package name */
    private int f7124h;

    /* renamed from: i  reason: collision with root package name */
    private int f7125i;

    public ShakeArcView(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.f7120d = paint;
        paint.setAntiAlias(true);
        this.f7120d.setDither(true);
        this.f7120d.setStrokeWidth(this.f7119c);
        this.f7120d.setColor(this.f7117a);
        this.f7120d.setStyle(Paint.Style.STROKE);
        this.f7120d.setStrokeCap(Paint.Cap.ROUND);
    }

    private void b() {
        Paint paint = new Paint();
        this.f7121e = paint;
        paint.setAntiAlias(true);
        this.f7121e.setDither(true);
        this.f7121e.setStrokeWidth(this.f7119c);
        this.f7121e.setColor(this.f7118b);
        this.f7121e.setStyle(Paint.Style.STROKE);
        this.f7121e.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            int i4 = this.f7119c;
            RectF rectF = new RectF(i4 / 2, i4 / 2, getWidth() - (this.f7119c / 2), getHeight() - (this.f7119c / 2));
            canvas.drawArc(rectF, 215.0f, 110.0f, false, this.f7120d);
            double d5 = this.f7123g;
            if (d5 >= 0.0d) {
                double d6 = this.f7122f;
                if (d6 > 0.0d) {
                    if (d5 >= d6) {
                        this.f7123g = d6;
                    }
                    double d7 = (float) this.f7123g;
                    Double.isNaN(d7);
                    float f5 = (float) (d7 / d6);
                    af.c("sweepAngle", "sweepAngle:" + f5 + ",mMaxProgress:" + this.f7122f + ",mCurrentProgress:" + this.f7123g);
                    int i5 = this.f7124h;
                    if (i5 == 1) {
                        canvas.drawArc(rectF, 215.0f, f5 * 110.0f, false, this.f7121e);
                    } else if (i5 == 2) {
                        canvas.drawArc(rectF, 325.0f, (-f5) * 110.0f, false, this.f7121e);
                    } else {
                        canvas.drawArc(rectF, 270.0f, (-f5) * 55.0f, false, this.f7121e);
                        canvas.drawArc(rectF, 270.0f, f5 * 55.0f, false, this.f7121e);
                    }
                }
            }
            int parseColor = Color.parseColor("#CACCCA");
            if (this.f7123g == this.f7122f) {
                parseColor = Color.parseColor("#FFFFFF");
            }
            int width = getWidth();
            int height = getHeight();
            int min = (Math.min(width, height) / 2) + (this.f7119c * this.f7125i);
            int i6 = width / 2;
            int i7 = height / 2;
            float cos = (float) Math.cos(Math.toRadians(45.0d));
            int i8 = this.f7124h;
            if (i8 == 1) {
                double d8 = i6;
                Double.isNaN(d8);
                double d9 = d8 * 1.5d;
                double d10 = cos * min;
                Double.isNaN(d10);
                float f6 = (float) ((0.4d * d10) + d9);
                double d11 = i7 / 2;
                Double.isNaN(d10);
                double d12 = d10 * 0.2d;
                Double.isNaN(d11);
                float f7 = (float) (d11 - d12);
                float f8 = i7 / 2;
                a(canvas, true, f6, f7, (float) (d9 + d12), f8, f6, f8, parseColor);
            } else if (i8 == 2) {
                double d13 = i6 / 2;
                double d14 = cos * min;
                Double.isNaN(d14);
                Double.isNaN(d13);
                float f9 = (float) (d13 - (0.4d * d14));
                double d15 = i7 / 2;
                Double.isNaN(d14);
                double d16 = d14 * 0.2d;
                Double.isNaN(d15);
                float f10 = (float) (d15 - d16);
                double d17 = i6 / 2;
                Double.isNaN(d17);
                float f11 = i7 / 2;
                a(canvas, true, f9, f10, (float) (d17 - d16), f11, f9, f11, parseColor);
            } else {
                double d18 = i6 / 2;
                double d19 = cos * min;
                Double.isNaN(d19);
                double d20 = d19 * 0.4d;
                Double.isNaN(d18);
                float f12 = (float) (d18 - d20);
                double d21 = i7 / 2;
                Double.isNaN(d19);
                double d22 = d19 * 0.2d;
                Double.isNaN(d21);
                float f13 = (float) (d21 - d22);
                double d23 = i6 / 2;
                Double.isNaN(d23);
                float f14 = i7 / 2;
                a(canvas, true, f12, f13, (float) (d23 - d22), f14, f12, f14, parseColor);
                double d24 = i6;
                Double.isNaN(d24);
                double d25 = d24 * 1.5d;
                float f15 = (float) (d25 + d20);
                double d26 = i7 / 2;
                Double.isNaN(d26);
                float f16 = i7 / 2;
                a(canvas, true, f15, (float) (d26 - d22), (float) (d25 + d22), f16, f15, f16, parseColor);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4) + (this.f7119c * 2);
        int size2 = View.MeasureSpec.getSize(i5) + (this.f7119c * 2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    public ShakeArcView setArrowDirection(int i4) {
        this.f7124h = i4;
        return this;
    }

    public ShakeArcView setCurrentProgress(double d5) {
        this.f7123g = d5 * 100.0d;
        invalidate();
        return this;
    }

    public void setLineRadius(int i4) {
        this.f7125i = i4;
    }

    public void setLineWidth(int i4) {
        try {
            this.f7119c = i4;
            Paint paint = this.f7120d;
            if (paint != null) {
                paint.setStrokeWidth(i4);
            }
            Paint paint2 = this.f7121e;
            if (paint2 != null) {
                paint2.setStrokeWidth(this.f7119c);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public ShakeArcView setMaxProgress(double d5) {
        this.f7122f = d5 * 100.0d;
        return this;
    }

    public ShakeArcView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShakeArcView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7117a = Color.parseColor("#CACCCA");
        this.f7118b = Color.parseColor("#FFFFFF");
        this.f7119c = 6;
        this.f7122f = -1.0d;
        this.f7123g = -1.0d;
        this.f7124h = 0;
        this.f7125i = 2;
        a();
        b();
    }

    private void a(Canvas canvas, boolean z4, float f5, float f6, float f7, float f8, float f9, float f10, int i4) {
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(i4);
            if (z4) {
                paint.setStyle(Paint.Style.FILL);
            } else {
                paint.setStyle(Paint.Style.STROKE);
            }
            Path path = new Path();
            path.moveTo(f5, f6);
            path.lineTo(f7, f8);
            path.lineTo(f9, f10);
            path.lineTo(f5, f6);
            path.close();
            canvas.drawPath(path, paint);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
