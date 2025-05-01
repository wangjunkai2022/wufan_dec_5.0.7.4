package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class StrokeTextViewNoAnim extends TextView {

    /* renamed from: b  reason: collision with root package name */
    private TextView f47993b;

    /* renamed from: c  reason: collision with root package name */
    Context f47994c;

    public StrokeTextViewNoAnim(Context context) {
        super(context);
        this.f47993b = null;
        this.f47993b = new TextView(context);
        a(null);
        this.f47994c = context;
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.StrokeTextView);
            int color = obtainStyledAttributes.getColor(1, 0);
            TextPaint paint = this.f47993b.getPaint();
            paint.setStrokeWidth(4.0f);
            paint.setStyle(Paint.Style.STROKE);
            this.f47993b.setTextColor(color);
            this.f47993b.setGravity(getGravity());
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f47993b.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f47993b.layout(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        CharSequence text = this.f47993b.getText();
        if (text == null || !text.equals(getText())) {
            this.f47993b.setText(getText());
            postInvalidate();
        }
        super.onMeasure(i4, i5);
        this.f47993b.measure(i4, i5);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f47993b.setLayoutParams(layoutParams);
    }

    public void setStrokeColor(int i4) {
        this.f47993b.setTextColor(i4);
    }

    public StrokeTextViewNoAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47993b = null;
        this.f47993b = new TextView(context, attributeSet);
        a(attributeSet);
        this.f47994c = context;
    }

    public StrokeTextViewNoAnim(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47993b = null;
        this.f47993b = new TextView(context, attributeSet, i4);
        a(attributeSet);
        this.f47994c = context;
    }
}
