package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* loaded from: classes4.dex */
public class DarkFrameLayout extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final int f46837e = 159;

    /* renamed from: b  reason: collision with root package name */
    private int f46838b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f46839c;

    /* renamed from: d  reason: collision with root package name */
    private SlideBottomPanel f46840d;

    public DarkFrameLayout(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        this.f46839c.setColor(Color.argb(this.f46838b, 0, 0, 0));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getHeight(), this.f46839c);
    }

    public void b(int i4) {
        this.f46838b = i4;
        invalidate();
    }

    public void c(boolean z4) {
        this.f46838b = z4 ? 143 : 0;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a(canvas);
    }

    public int getCurrentAlpha() {
        return this.f46838b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f46840d.w();
    }

    public void setSlideBottomPanel(SlideBottomPanel slideBottomPanel) {
        this.f46840d = slideBottomPanel;
    }

    public DarkFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DarkFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46838b = 0;
        this.f46839c = new Paint();
    }
}
