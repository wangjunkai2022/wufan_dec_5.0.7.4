package com.join.android.app.component.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes3.dex */
public class OutlineTextView extends TextView {

    /* renamed from: b  reason: collision with root package name */
    private TextPaint f15267b;

    /* renamed from: c  reason: collision with root package name */
    private TextPaint f15268c;

    /* renamed from: d  reason: collision with root package name */
    private String f15269d;

    /* renamed from: e  reason: collision with root package name */
    private int f15270e;

    /* renamed from: f  reason: collision with root package name */
    private float f15271f;

    /* renamed from: g  reason: collision with root package name */
    private int f15272g;

    /* renamed from: h  reason: collision with root package name */
    private int f15273h;

    /* renamed from: i  reason: collision with root package name */
    private float f15274i;

    /* renamed from: j  reason: collision with root package name */
    private float f15275j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15276k;

    public OutlineTextView(Context context) {
        super(context);
        this.f15269d = "";
        this.f15270e = 0;
        this.f15274i = 1.0f;
        this.f15275j = 0.0f;
        this.f15276k = true;
        a();
    }

    private void a() {
        TextPaint textPaint = new TextPaint();
        this.f15267b = textPaint;
        textPaint.setAntiAlias(true);
        this.f15267b.setTextSize(getTextSize());
        this.f15267b.setColor(this.f15273h);
        this.f15267b.setStyle(Paint.Style.FILL);
        this.f15267b.setTypeface(getTypeface());
        TextPaint textPaint2 = new TextPaint();
        this.f15268c = textPaint2;
        textPaint2.setAntiAlias(true);
        this.f15268c.setTextSize(getTextSize());
        this.f15268c.setColor(this.f15272g);
        this.f15268c.setStyle(Paint.Style.STROKE);
        this.f15268c.setTypeface(getTypeface());
        this.f15268c.setStrokeWidth(this.f15271f);
    }

    private int b(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int ascent = (int) this.f15268c.ascent();
        this.f15270e = ascent;
        if (mode == 1073741824) {
            return size;
        }
        int descent = ((int) ((-ascent) + this.f15268c.descent())) + getPaddingTop() + getPaddingBottom();
        return mode == Integer.MIN_VALUE ? Math.min(descent, size) : descent;
    }

    private int c(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        int measureText = ((int) this.f15268c.measureText(this.f15269d)) + getPaddingLeft() + getPaddingRight();
        return mode == Integer.MIN_VALUE ? Math.min(measureText, size) : measureText;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        new StaticLayout(getText(), this.f15268c, getWidth(), Layout.Alignment.ALIGN_CENTER, this.f15274i, this.f15275j, this.f15276k).draw(canvas);
        new StaticLayout(getText(), this.f15267b, getWidth(), Layout.Alignment.ALIGN_CENTER, this.f15274i, this.f15275j, this.f15276k).draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        StaticLayout staticLayout = new StaticLayout(getText(), this.f15268c, c(i4), Layout.Alignment.ALIGN_CENTER, this.f15274i, this.f15275j, this.f15276k);
        int i6 = (int) ((this.f15271f * 2.0f) + 1.0f);
        setMeasuredDimension(c(i4) + i6, (b(i5) * staticLayout.getLineCount()) + i6);
    }

    @Override // android.widget.TextView
    public void setShadowLayer(float f5, float f6, float f7, int i4) {
        super.setShadowLayer(f5, f6, f7, i4);
        this.f15271f = f5;
        this.f15272g = i4;
        requestLayout();
        invalidate();
        a();
    }

    public void setText(String str) {
        super.setText((CharSequence) str);
        this.f15269d = str.toString();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i4) {
        super.setTextColor(i4);
        this.f15273h = i4;
        invalidate();
        a();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f5) {
        super.setTextSize(f5);
        requestLayout();
        invalidate();
        a();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i4) {
        super.setTypeface(typeface, i4);
        requestLayout();
        invalidate();
        a();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        requestLayout();
        invalidate();
        a();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15269d = "";
        this.f15270e = 0;
        this.f15274i = 1.0f;
        this.f15275j = 0.0f;
        this.f15276k = true;
        a();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15269d = "";
        this.f15270e = 0;
        this.f15274i = 1.0f;
        this.f15275j = 0.0f;
        this.f15276k = true;
        a();
    }
}
