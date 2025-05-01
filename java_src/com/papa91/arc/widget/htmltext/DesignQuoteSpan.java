package com.papa91.arc.widget.htmltext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineBackgroundSpan;
import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public class DesignQuoteSpan implements LeadingMarginSpan, LineBackgroundSpan {
    private int backgroundColor;
    private float gap;
    private int stripColor;
    private float stripeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DesignQuoteSpan(int i4, int i5, float f5, float f6) {
        this.backgroundColor = i4;
        this.stripColor = i5;
        this.stripeWidth = f5;
        this.gap = f6;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NonNull Canvas canvas, @NonNull Paint paint, int i4, int i5, int i6, int i7, int i8, @NonNull CharSequence charSequence, int i9, int i10, int i11) {
        int color = paint.getColor();
        paint.setColor(this.backgroundColor);
        canvas.drawRect(i4, i6, i5, i8, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z4, Layout layout) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.stripColor);
        float f5 = i4;
        canvas.drawRect(f5, i6, (i5 * this.stripeWidth) + f5, i8, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        return (int) (this.stripeWidth + this.gap);
    }
}
