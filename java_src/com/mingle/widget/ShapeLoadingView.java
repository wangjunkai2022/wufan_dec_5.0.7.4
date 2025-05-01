package com.mingle.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.mingle.shapeloading.R;
import com.nineoldandroids.animation.e;
/* loaded from: classes5.dex */
public class ShapeLoadingView extends View {

    /* renamed from: n  reason: collision with root package name */
    private static final float f55984n = 1.7320508f;

    /* renamed from: o  reason: collision with root package name */
    private static final float f55985o = 0.25555554f;

    /* renamed from: b  reason: collision with root package name */
    private Shape f55986b;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f55987c;

    /* renamed from: d  reason: collision with root package name */
    private e f55988d;

    /* renamed from: e  reason: collision with root package name */
    private int f55989e;

    /* renamed from: f  reason: collision with root package name */
    private int f55990f;

    /* renamed from: g  reason: collision with root package name */
    private int f55991g;

    /* renamed from: h  reason: collision with root package name */
    private float f55992h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f55993i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f55994j;

    /* renamed from: k  reason: collision with root package name */
    private float f55995k;

    /* renamed from: l  reason: collision with root package name */
    private float f55996l;

    /* renamed from: m  reason: collision with root package name */
    private float f55997m;

    /* loaded from: classes5.dex */
    public enum Shape {
        SHAPE_TRIANGLE,
        SHAPE_RECT,
        SHAPE_CIRCLE
    }

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55998a;

        static {
            int[] iArr = new int[Shape.values().length];
            f55998a = iArr;
            try {
                iArr[Shape.SHAPE_TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55998a[Shape.SHAPE_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55998a[Shape.SHAPE_RECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ShapeLoadingView(Context context) {
        super(context);
        this.f55986b = Shape.SHAPE_CIRCLE;
        this.f55987c = new DecelerateInterpolator();
        this.f55988d = new e();
        this.f55992h = 0.5522848f;
        this.f55993i = false;
        this.f55995k = 0.0f;
        this.f55996l = 0.0f;
        b();
    }

    private void b() {
        Paint paint = new Paint();
        this.f55994j = paint;
        Resources resources = getResources();
        int i4 = R.color.triangle;
        paint.setColor(resources.getColor(i4));
        this.f55994j.setAntiAlias(true);
        this.f55994j.setStyle(Paint.Style.FILL_AND_STROKE);
        setBackgroundColor(getResources().getColor(R.color.view_bg));
        this.f55989e = getResources().getColor(i4);
        this.f55990f = getResources().getColor(R.color.circle);
        this.f55991g = getResources().getColor(i4);
    }

    private float c(float f5) {
        return getWidth() * f5;
    }

    private float d(float f5) {
        return getHeight() * f5;
    }

    public void a() {
        this.f55993i = true;
        invalidate();
    }

    public Shape getShape() {
        return this.f55986b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getVisibility() == 8) {
            return;
        }
        int i4 = a.f55998a[this.f55986b.ordinal()];
        if (i4 == 1) {
            if (this.f55993i) {
                double d5 = this.f55997m;
                Double.isNaN(d5);
                float f5 = (float) (d5 + 0.1611113d);
                this.f55997m = f5;
                this.f55994j.setColor(((Integer) this.f55988d.evaluate(f5, Integer.valueOf(this.f55989e), Integer.valueOf(this.f55990f))).intValue());
                Path path = new Path();
                path.moveTo(c(0.5f), d(0.0f));
                if (this.f55997m >= 1.0f) {
                    this.f55986b = Shape.SHAPE_CIRCLE;
                    this.f55993i = false;
                    this.f55997m = 1.0f;
                }
                float c5 = this.f55995k - (c(this.f55997m * f55985o) * f55984n);
                float d6 = this.f55996l - d(this.f55997m * f55985o);
                path.quadTo(c(1.0f) - c5, d6, c(0.9330127f), d(0.75f));
                path.quadTo(c(0.5f), d((this.f55997m * 2.0f * f55985o) + 0.75f), c(0.066987306f), d(0.75f));
                path.quadTo(c5, d6, c(0.5f), d(0.0f));
                path.close();
                canvas.drawPath(path, this.f55994j);
                invalidate();
                return;
            }
            Path path2 = new Path();
            this.f55994j.setColor(getResources().getColor(R.color.triangle));
            path2.moveTo(c(0.5f), d(0.0f));
            path2.lineTo(c(1.0f), d(0.8660254f));
            path2.lineTo(c(0.0f), d(0.8660254f));
            this.f55995k = c(0.28349364f);
            this.f55996l = d(0.375f);
            this.f55997m = 0.0f;
            path2.close();
            canvas.drawPath(path2, this.f55994j);
        } else if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            if (this.f55993i) {
                double d7 = this.f55997m;
                Double.isNaN(d7);
                float f6 = (float) (d7 + 0.15d);
                this.f55997m = f6;
                if (f6 >= 1.0f) {
                    this.f55986b = Shape.SHAPE_TRIANGLE;
                    this.f55993i = false;
                    this.f55997m = 1.0f;
                }
                this.f55994j.setColor(((Integer) this.f55988d.evaluate(this.f55997m, Integer.valueOf(this.f55991g), Integer.valueOf(this.f55989e))).intValue());
                Path path3 = new Path();
                path3.moveTo(c(this.f55997m * 0.5f), 0.0f);
                path3.lineTo(d(1.0f - (this.f55997m * 0.5f)), 0.0f);
                float f7 = this.f55995k * this.f55997m;
                float d8 = (d(1.0f) - this.f55996l) * this.f55997m;
                path3.lineTo(c(1.0f) - f7, d(1.0f) - d8);
                path3.lineTo(c(0.0f) + f7, d(1.0f) - d8);
                path3.close();
                canvas.drawPath(path3, this.f55994j);
                invalidate();
                return;
            }
            this.f55994j.setColor(getResources().getColor(R.color.rect));
            this.f55995k = c(0.066987306f);
            this.f55996l = d(0.75f);
            Path path4 = new Path();
            path4.moveTo(c(0.0f), d(0.0f));
            path4.lineTo(c(1.0f), d(0.0f));
            path4.lineTo(c(1.0f), d(1.0f));
            path4.lineTo(c(0.0f), d(1.0f));
            path4.close();
            this.f55997m = 0.0f;
            canvas.drawPath(path4, this.f55994j);
        } else if (this.f55993i) {
            float f8 = this.f55992h;
            float f9 = this.f55997m;
            float f10 = f8 + f9;
            double d9 = f9;
            Double.isNaN(d9);
            float f11 = (float) (d9 + 0.12d);
            this.f55997m = f11;
            if (f10 + f11 >= 1.9f) {
                this.f55986b = Shape.SHAPE_RECT;
                this.f55993i = false;
            }
            this.f55994j.setColor(((Integer) this.f55988d.evaluate(f11, Integer.valueOf(this.f55990f), Integer.valueOf(this.f55991g))).intValue());
            Path path5 = new Path();
            path5.moveTo(c(0.5f), d(0.0f));
            float f12 = f10 / 2.0f;
            float f13 = f12 + 0.5f;
            float f14 = 0.5f - f12;
            path5.cubicTo(c(f13), d(0.0f), c(1.0f), d(f14), c(1.0f), d(0.5f));
            path5.cubicTo(c(1.0f), c(f13), c(f13), d(1.0f), c(0.5f), d(1.0f));
            path5.cubicTo(c(f14), c(1.0f), c(0.0f), d(f13), c(0.0f), d(0.5f));
            path5.cubicTo(c(0.0f), c(f14), c(f14), d(0.0f), c(0.5f), d(0.0f));
            path5.close();
            canvas.drawPath(path5, this.f55994j);
            invalidate();
        } else {
            this.f55994j.setColor(getResources().getColor(R.color.circle));
            Path path6 = new Path();
            float f15 = this.f55992h;
            path6.moveTo(c(0.5f), d(0.0f));
            float f16 = f15 / 2.0f;
            float f17 = f16 + 0.5f;
            path6.cubicTo(c(f17), 0.0f, c(1.0f), d(f16), c(1.0f), d(0.5f));
            path6.cubicTo(c(1.0f), c(f17), c(f17), d(1.0f), c(0.5f), d(1.0f));
            float f18 = 0.5f - f16;
            path6.cubicTo(c(f18), c(1.0f), c(0.0f), d(f17), c(0.0f), d(0.5f));
            path6.cubicTo(c(0.0f), c(f18), c(f18), d(0.0f), c(0.5f), d(0.0f));
            this.f55997m = 0.0f;
            path6.close();
            canvas.drawPath(path6, this.f55994j);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (i4 == 0) {
            invalidate();
        }
    }

    public ShapeLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55986b = Shape.SHAPE_CIRCLE;
        this.f55987c = new DecelerateInterpolator();
        this.f55988d = new e();
        this.f55992h = 0.5522848f;
        this.f55993i = false;
        this.f55995k = 0.0f;
        this.f55996l = 0.0f;
        b();
    }

    public ShapeLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f55986b = Shape.SHAPE_CIRCLE;
        this.f55987c = new DecelerateInterpolator();
        this.f55988d = new e();
        this.f55992h = 0.5522848f;
        this.f55993i = false;
        this.f55995k = 0.0f;
        this.f55996l = 0.0f;
    }

    @TargetApi(21)
    public ShapeLoadingView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f55986b = Shape.SHAPE_CIRCLE;
        this.f55987c = new DecelerateInterpolator();
        this.f55988d = new e();
        this.f55992h = 0.5522848f;
        this.f55993i = false;
        this.f55995k = 0.0f;
        this.f55996l = 0.0f;
        b();
    }
}
