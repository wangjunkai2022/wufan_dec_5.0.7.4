package com.join.mgps.customview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
/* compiled from: VerticalImageSpan.java */
/* loaded from: classes4.dex */
public class j0 extends ImageSpan {

    /* renamed from: b  reason: collision with root package name */
    private float f48542b;

    public j0(Drawable drawable) {
        super(drawable);
        this.f48542b = 1.0f;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i6, int i7, int i8, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        int i9 = ((i8 - i6) - drawable.getBounds().bottom) / 2;
        float f6 = this.f48542b;
        canvas.translate(f5, f6 > 1.0f ? (int) ((i6 + i9) - (i9 * (f6 - 1.0f))) : i6 + i9);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i6 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i7 = (bounds.bottom - bounds.top) / 2;
            int i8 = i6 / 4;
            int i9 = i7 - i8;
            int i10 = -(i7 + i8);
            fontMetricsInt.ascent = i10;
            fontMetricsInt.top = i10;
            fontMetricsInt.bottom = i9;
            fontMetricsInt.descent = i9;
        }
        return bounds.right;
    }

    public j0(Drawable drawable, float f5) {
        super(drawable);
        this.f48542b = 1.0f;
        this.f48542b = f5;
    }
}
