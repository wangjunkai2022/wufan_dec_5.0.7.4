package com.join.android.app.component.optimizetext;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes3.dex */
public class StaticLayoutView extends View {

    /* renamed from: b  reason: collision with root package name */
    private Layout f15141b;

    /* renamed from: c  reason: collision with root package name */
    private int f15142c;

    /* renamed from: d  reason: collision with root package name */
    private int f15143d;

    public StaticLayoutView(Context context) {
        super(context);
        this.f15141b = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Layout layout = this.f15141b;
        if (layout != null) {
            layout.draw(canvas, null, null, 0);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        Layout layout = this.f15141b;
        if (layout != null) {
            setMeasuredDimension(layout.getWidth(), this.f15141b.getHeight());
        } else {
            super.onMeasure(i4, i5);
        }
    }

    public void setLayout(Layout layout) {
        if (layout == null) {
            return;
        }
        this.f15141b = layout;
        if (layout.getWidth() == this.f15142c && this.f15141b.getHeight() == this.f15143d) {
            return;
        }
        this.f15142c = this.f15141b.getWidth();
        this.f15143d = this.f15141b.getHeight();
        requestLayout();
    }

    public StaticLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15141b = null;
    }

    public StaticLayoutView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15141b = null;
    }
}
