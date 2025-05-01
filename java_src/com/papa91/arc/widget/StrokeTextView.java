package com.papa91.arc.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes5.dex */
public class StrokeTextView extends AppCompatTextView {
    private TextPaint strokePaint;

    public StrokeTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.strokePaint == null) {
            this.strokePaint = new TextPaint();
        }
        TextPaint paint = getPaint();
        this.strokePaint.setTextSize(paint.getTextSize());
        this.strokePaint.setTypeface(paint.getTypeface());
        this.strokePaint.setFlags(paint.getFlags());
        this.strokePaint.setAlpha(paint.getAlpha());
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setColor(-16777216);
        this.strokePaint.setStrokeWidth(getTextSize() / 6.0f);
        String charSequence = getText().toString();
        canvas.drawText(charSequence, (getWidth() - this.strokePaint.measureText(charSequence)) / 2.0f, getBaseline(), this.strokePaint);
        super.onDraw(canvas);
    }

    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
