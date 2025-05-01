package com.kwad.components.ad.reward.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.kwad.sdk.R;
/* loaded from: classes5.dex */
public class JinniuCouponLayout extends LinearLayout {
    private float Am;
    private Rect An;
    private RectF Ao;
    private RectF Ap;
    private RectF Aq;
    private RectF Ar;
    private Path As;
    @ColorInt
    private int endColor;
    private Paint mPaint;
    private float mRadius;
    @ColorInt
    private int startColor;

    public JinniuCouponLayout(Context context) {
        super(context);
        this.mPaint = new Paint();
        this.Am = 4.0f;
        this.mRadius = 10.0f;
        this.An = new Rect();
        this.Ao = new RectF();
        this.Ap = new RectF();
        this.Aq = new RectF();
        this.Ar = new RectF();
        this.As = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, null, 0);
    }

    private void a(Context context, @Nullable AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_JinniuCouponLayout, i4, 0);
        this.mRadius = obtainStyledAttributes.getDimension(R.styleable.ksad_JinniuCouponLayout_ksad_outerRadius, 4.0f);
        this.Am = obtainStyledAttributes.getDimension(R.styleable.ksad_JinniuCouponLayout_ksad_verticalRadius, 10.0f);
        obtainStyledAttributes.recycle();
        this.mPaint.setAntiAlias(true);
    }

    private void setGradientPaint(RectF rectF) {
        this.mPaint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.startColor, this.endColor, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.An.setEmpty();
        getDrawingRect(this.An);
        this.Ao.set(this.An);
        if (getChildCount() > 1) {
            View childAt = getChildAt(0);
            RectF rectF = this.Ap;
            if (rectF == null) {
                this.Ap = new RectF();
            } else {
                rectF.setEmpty();
            }
            RectF rectF2 = this.Aq;
            if (rectF2 == null) {
                this.Aq = new RectF();
            } else {
                rectF2.setEmpty();
            }
            Rect rect = this.An;
            float measuredWidth = rect.left + childAt.getMeasuredWidth();
            RectF rectF3 = this.Ap;
            int i4 = rect.top;
            float f5 = this.Am;
            rectF3.set(measuredWidth, i4 - f5, (2.0f * f5) + measuredWidth, i4 + f5);
            RectF rectF4 = this.Aq;
            RectF rectF5 = this.Ap;
            float f6 = rectF5.left;
            int i5 = this.An.bottom;
            float f7 = this.Am;
            rectF4.set(f6, i5 - f7, rectF5.right, i5 + f7);
            a(this.As, this.Ao, this.Ap, this.Aq);
            setGradientPaint(this.Ao);
            canvas.drawPath(this.As, this.mPaint);
        }
        super.dispatchDraw(canvas);
    }

    private void a(Path path, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        RectF rectF4 = this.Ao;
        path.moveTo(rectF4.left, rectF4.top + this.mRadius);
        this.Ar.set(rectF);
        RectF rectF5 = this.Ar;
        float f5 = rectF5.top;
        float f6 = this.mRadius;
        rectF5.bottom = f5 + (f6 * 2.0f);
        rectF5.right = rectF5.left + (f6 * 2.0f);
        path.arcTo(rectF5, 180.0f, 90.0f);
        path.lineTo(rectF2.left, rectF2.top);
        path.arcTo(rectF2, -180.0f, -180.0f);
        path.lineTo(rectF.width() - this.mRadius, rectF.top);
        this.Ar.set(rectF);
        RectF rectF6 = this.Ar;
        float f7 = rectF6.right;
        float f8 = this.mRadius;
        rectF6.left = f7 - (f8 * 2.0f);
        rectF6.bottom = rectF6.top + (f8 * 2.0f);
        path.arcTo(rectF6, 270.0f, 90.0f);
        this.Ar.set(rectF);
        RectF rectF7 = this.Ar;
        float f9 = rectF7.right;
        float f10 = this.mRadius;
        rectF7.left = f9 - (f10 * 2.0f);
        rectF7.top = rectF7.bottom - (f10 * 2.0f);
        path.arcTo(rectF7, 0.0f, 90.0f);
        path.lineTo(rectF3.right, rectF3.bottom);
        path.arcTo(rectF3, 0.0f, -180.0f);
        path.lineTo(rectF.left + this.mRadius, rectF.bottom);
        this.Ar.set(rectF);
        RectF rectF8 = this.Ar;
        float f11 = rectF8.left;
        float f12 = this.mRadius;
        rectF8.right = f11 + (f12 * 2.0f);
        rectF8.top = rectF8.bottom - (f12 * 2.0f);
        path.arcTo(rectF8, 90.0f, 90.0f);
    }

    public JinniuCouponLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.Am = 4.0f;
        this.mRadius = 10.0f;
        this.An = new Rect();
        this.Ao = new RectF();
        this.Ap = new RectF();
        this.Aq = new RectF();
        this.Ar = new RectF();
        this.As = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, 0);
    }

    public JinniuCouponLayout(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaint = new Paint();
        this.Am = 4.0f;
        this.mRadius = 10.0f;
        this.An = new Rect();
        this.Ao = new RectF();
        this.Ap = new RectF();
        this.Aq = new RectF();
        this.Ar = new RectF();
        this.As = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, i4);
    }

    @RequiresApi(api = 21)
    public JinniuCouponLayout(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.mPaint = new Paint();
        this.Am = 4.0f;
        this.mRadius = 10.0f;
        this.An = new Rect();
        this.Ao = new RectF();
        this.Ap = new RectF();
        this.Aq = new RectF();
        this.Ar = new RectF();
        this.As = new Path();
        this.startColor = Color.parseColor("#FFFE3666");
        this.endColor = Color.parseColor("#FFFD7200");
        a(context, attributeSet, i4);
    }
}
