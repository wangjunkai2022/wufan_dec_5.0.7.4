package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class StrokeTextView extends TextView implements View.OnTouchListener, com.facebook.rebound.m {

    /* renamed from: b  reason: collision with root package name */
    private TextView f47984b;

    /* renamed from: c  reason: collision with root package name */
    private int f47985c;

    /* renamed from: d  reason: collision with root package name */
    private int f47986d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.rebound.i f47987e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.rebound.o f47988f;

    /* renamed from: g  reason: collision with root package name */
    Context f47989g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f47990h;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StrokeTextView.this.performClick();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StrokeTextView.this.performClick();
        }
    }

    public StrokeTextView(Context context) {
        super(context);
        this.f47984b = null;
        this.f47985c = 20;
        this.f47986d = 3;
        this.f47990h = new Handler();
        this.f47984b = new TextView(context);
        e(null);
        this.f47989g = context;
    }

    @Override // com.facebook.rebound.m
    public void a(com.facebook.rebound.i iVar) {
        float f5 = 1.0f - (((float) iVar.f()) * 0.3f);
        setScaleX(f5);
        setScaleY(f5);
    }

    @Override // com.facebook.rebound.m
    public void b(com.facebook.rebound.i iVar) {
    }

    @Override // com.facebook.rebound.m
    public void c(com.facebook.rebound.i iVar) {
    }

    @Override // com.facebook.rebound.m
    public void d(com.facebook.rebound.i iVar) {
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.StrokeTextView);
            int color = obtainStyledAttributes.getColor(1, 0);
            TextPaint paint = this.f47984b.getPaint();
            paint.setStrokeWidth(4.0f);
            paint.setStyle(Paint.Style.STROKE);
            this.f47984b.setTextColor(color);
            this.f47984b.setGravity(getGravity());
            obtainStyledAttributes.recycle();
        }
        com.facebook.rebound.o m4 = com.facebook.rebound.o.m();
        this.f47988f = m4;
        com.facebook.rebound.i d5 = m4.d();
        this.f47987e = d5;
        d5.a(this);
        setOnTouchListener(this);
        this.f47987e.x(0.0d);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f47984b.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f47984b.layout(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        CharSequence text = this.f47984b.getText();
        if (text == null || !text.equals(getText())) {
            this.f47984b.setText(getText());
            postInvalidate();
        }
        super.onMeasure(i4, i5);
        this.f47984b.measure(i4, i5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47987e.x(1.0d);
            return true;
        } else if (action == 1) {
            this.f47987e.x(0.0d);
            this.f47990h.postDelayed(new a(), 200L);
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.f47987e.x(0.0d);
            this.f47990h.postDelayed(new b(), 200L);
            return true;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f47984b.setLayoutParams(layoutParams);
    }

    public void setStrokeColor(int i4) {
        this.f47984b.setTextColor(i4);
    }

    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47984b = null;
        this.f47985c = 20;
        this.f47986d = 3;
        this.f47990h = new Handler();
        this.f47984b = new TextView(context, attributeSet);
        e(attributeSet);
        this.f47989g = context;
    }

    public StrokeTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47984b = null;
        this.f47985c = 20;
        this.f47986d = 3;
        this.f47990h = new Handler();
        this.f47984b = new TextView(context, attributeSet, i4);
        e(attributeSet);
        this.f47989g = context;
    }
}
