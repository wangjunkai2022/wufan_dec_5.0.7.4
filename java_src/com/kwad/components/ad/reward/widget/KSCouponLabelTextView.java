package com.kwad.components.ad.reward.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import com.kwad.components.core.widget.d;
import com.kwad.components.core.widget.e;
import com.kwad.sdk.R;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class KSCouponLabelTextView extends TextView implements d {
    private Path AA;
    private boolean AB;
    private final Rect An;
    private final RectF Ao;
    private final RectF Ar;
    private float At;
    private float Au;
    private float Av;
    private final RectF Aw;
    private final RectF Ax;
    private final Path Ay;
    private Path Az;
    private final Paint mPaint;
    @ColorInt
    private int strokeColor;

    public KSCouponLabelTextView(Context context) {
        super(context);
        this.mPaint = new Paint();
        this.An = new Rect();
        this.Ao = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new Path();
        this.Ar = new RectF();
        this.AB = true;
        a(context, null, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    private void a(Context context, AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KSCouponLabelTextView, i4, 0);
        int color = context.getResources().getColor(R.color.ksad_reward_main_color);
        this.At = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_labelRadius, 8.0f);
        this.Au = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_strokeSize, 2.0f);
        this.strokeColor = obtainStyledAttributes.getColor(R.styleable.ksad_KSCouponLabelTextView_ksad_strokeColor, color);
        this.Av = obtainStyledAttributes.getDimension(R.styleable.ksad_KSCouponLabelTextView_ksad_sideRadius, 16.0f);
        obtainStyledAttributes.recycle();
        ke();
    }

    private void b(Path path, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        path.moveTo(rectF.left, rectF.top + this.At);
        this.Ar.set(rectF);
        RectF rectF4 = this.Ar;
        float f5 = rectF4.top;
        float f6 = this.At;
        rectF4.bottom = f5 + (f6 * 2.0f);
        rectF4.right = rectF4.left + (f6 * 2.0f);
        path.arcTo(rectF4, 180.0f, 90.0f);
        path.lineTo(rectF.width() - this.At, rectF.top);
        this.Ar.set(rectF);
        RectF rectF5 = this.Ar;
        float f7 = rectF5.right;
        float f8 = this.At;
        rectF5.left = f7 - (f8 * 2.0f);
        rectF5.bottom = rectF5.top + (f8 * 2.0f);
        path.arcTo(rectF5, 270.0f, 90.0f);
        path.lineTo(rectF.right, rectF3.top);
        path.arcTo(rectF3, 270.0f, -180.0f);
        path.lineTo(rectF.right, rectF.bottom - this.At);
        this.Ar.set(rectF);
        RectF rectF6 = this.Ar;
        float f9 = rectF6.right;
        float f10 = this.At;
        rectF6.left = f9 - (f10 * 2.0f);
        rectF6.top = rectF6.bottom - (f10 * 2.0f);
        path.arcTo(rectF6, 0.0f, 90.0f);
        path.lineTo(rectF.left + this.At, rectF.bottom);
        this.Ar.set(rectF);
        RectF rectF7 = this.Ar;
        float f11 = rectF7.left;
        float f12 = this.At;
        rectF7.right = f11 + (f12 * 2.0f);
        rectF7.top = rectF7.bottom - (f12 * 2.0f);
        path.arcTo(rectF7, 90.0f, 90.0f);
        path.lineTo(rectF.left, rectF2.bottom);
        path.arcTo(rectF2, 90.0f, -180.0f);
        path.close();
    }

    private void ke() {
        this.mPaint.setColor(this.strokeColor);
        this.mPaint.setStrokeWidth(this.Au);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setAntiAlias(true);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.An.setEmpty();
        getDrawingRect(this.An);
        float f5 = this.Au / 2.0f;
        this.Ao.set(this.An);
        RectF rectF = this.Ao;
        rectF.left += f5;
        rectF.top += f5;
        rectF.right -= f5;
        rectF.bottom -= f5;
        a(rectF, this.Aw);
        b(this.Ao, this.Ax);
        if (Build.VERSION.SDK_INT >= 19) {
            Path path = this.Az;
            if (path == null) {
                this.Az = new Path();
            } else {
                path.reset();
            }
            Path path2 = this.AA;
            if (path2 == null) {
                this.AA = new Path();
            } else {
                path2.reset();
            }
            a(this.Ay, this.Az, this.AA, this.Ao, this.Aw, this.Ax);
            canvas.drawPath(this.Ay, this.mPaint);
            return;
        }
        b(this.Ay, this.Ao, this.Aw, this.Ax);
        canvas.drawPath(this.Ay, this.mPaint);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.AB) {
            if (((float) (getPaddingLeft() + getPaddingRight())) + getPaint().measureText(getText().toString()) <= ((float) getMeasuredWidth())) {
                return;
            }
            setVisibility(8);
        }
    }

    public KSCouponLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.An = new Rect();
        this.Ao = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new Path();
        this.Ar = new RectF();
        this.AB = true;
        a(context, attributeSet, 0);
    }

    @RequiresApi(api = 19)
    private void a(Path path, Path path2, Path path3, RectF rectF, RectF rectF2, RectF rectF3) {
        path.reset();
        float f5 = this.At;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        path2.addArc(rectF2, 90.0f, -180.0f);
        path3.addArc(rectF3, 90.0f, 180.0f);
        path.op(this.Az, Path.Op.DIFFERENCE);
        path.op(this.AA, Path.Op.DIFFERENCE);
    }

    private void a(RectF rectF, RectF rectF2) {
        rectF2.set(rectF);
        float f5 = rectF2.left;
        float f6 = this.Av;
        float f7 = f5 - f6;
        rectF2.left = f7;
        rectF2.right = f7 + (f6 * 2.0f);
        float height = rectF.height();
        float f8 = this.Av;
        float f9 = rectF2.top + ((height - (f8 * 2.0f)) / 2.0f);
        rectF2.top = f9;
        rectF2.bottom = f9 + (f8 * 2.0f);
    }

    public KSCouponLabelTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaint = new Paint();
        this.An = new Rect();
        this.Ao = new RectF();
        this.Aw = new RectF();
        this.Ax = new RectF();
        this.Ay = new Path();
        this.Ar = new RectF();
        this.AB = true;
        a(context, attributeSet, i4);
    }

    @Override // com.kwad.components.core.widget.d
    public final void a(e eVar) {
        int color = getResources().getColor(R.color.ksad_reward_main_color);
        this.strokeColor = color;
        setTextColor(color);
        ke();
        invalidate();
    }

    private void b(RectF rectF, RectF rectF2) {
        rectF2.set(rectF);
        float f5 = rectF2.right;
        float f6 = this.Av;
        float f7 = f5 + f6;
        rectF2.right = f7;
        rectF2.left = f7 - (f6 * 2.0f);
        float height = rectF.height();
        float f8 = this.Av;
        float f9 = rectF2.top + ((height - (f8 * 2.0f)) / 2.0f);
        rectF2.top = f9;
        rectF2.bottom = f9 + (f8 * 2.0f);
    }
}
