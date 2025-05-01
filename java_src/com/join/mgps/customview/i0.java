package com.join.mgps.customview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
/* compiled from: TagImageSpan.java */
/* loaded from: classes4.dex */
public class i0 extends ImageSpan {

    /* renamed from: b  reason: collision with root package name */
    private int f48516b;

    public i0(Drawable drawable) {
        super(drawable);
        this.f48516b = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i6, int i7, int i8, Paint paint) {
        float textSize = paint.getTextSize();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int ceil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        int round = Math.round(paint.measureText(charSequence, i4, i5));
        getDrawable().setBounds(0, 0, round, ceil);
        Drawable drawable = getDrawable();
        getDrawable().setBounds(0, 0, round, ceil);
        canvas.save();
        int i9 = ((i8 - i6) - drawable.getBounds().bottom) / 2;
        canvas.translate(f5, (int) ((i6 + i9) - (i9 * 0.20000005f)));
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        paint.setColor(this.f48516b);
        paint.setTextSize(textSize * 0.8f);
        Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        String charSequence2 = charSequence.subSequence(i4, i5).toString();
        canvas.drawText(charSequence2, f5 + ((round - paint.measureText(charSequence2)) / 2.0f), i7 - ((ceil - ((int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent))) / 4), paint);
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
        return Math.round(paint.measureText(charSequence, i4, i5));
    }

    public i0(Drawable drawable, int i4) {
        super(drawable);
        this.f48516b = -1;
        this.f48516b = i4;
    }
}
