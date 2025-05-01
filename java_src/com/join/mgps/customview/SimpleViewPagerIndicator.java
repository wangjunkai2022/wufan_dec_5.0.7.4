package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;
/* loaded from: classes4.dex */
public class SimpleViewPagerIndicator extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final int f47683l = -16777216;

    /* renamed from: m  reason: collision with root package name */
    private static final int f47684m = -756480;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f47685b;

    /* renamed from: c  reason: collision with root package name */
    private int f47686c;

    /* renamed from: d  reason: collision with root package name */
    private int f47687d;

    /* renamed from: e  reason: collision with root package name */
    private float f47688e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f47689f;

    /* renamed from: g  reason: collision with root package name */
    private int f47690g;

    /* renamed from: h  reason: collision with root package name */
    private ScrollView f47691h;

    /* renamed from: i  reason: collision with root package name */
    TextView f47692i;

    /* renamed from: j  reason: collision with root package name */
    TextView f47693j;

    /* renamed from: k  reason: collision with root package name */
    TextView f47694k;

    public SimpleViewPagerIndicator(Context context) {
        this(context, null);
    }

    private void a() {
        if (getChildCount() > 0) {
            removeAllViews();
        }
        int size = this.f47685b.size();
        setWeightSum(size);
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                this.f47692i.setGravity(17);
                this.f47692i.setTextColor(-16777216);
                this.f47692i.setText(this.f47685b.get(i4));
                this.f47692i.setTextSize(2, 14.0f);
                this.f47692i.setLayoutParams(layoutParams);
                addView(this.f47692i);
            } else if (i4 == 1) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                layoutParams2.weight = 1.0f;
                this.f47693j.setGravity(17);
                this.f47693j.setTextColor(-16777216);
                this.f47693j.setText(this.f47685b.get(i4));
                this.f47693j.setTextSize(2, 14.0f);
                this.f47693j.setLayoutParams(layoutParams2);
                addView(this.f47693j);
            } else if (i4 == 2) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
                layoutParams3.weight = 1.0f;
                this.f47694k.setGravity(17);
                this.f47694k.setTextColor(-16777216);
                this.f47694k.setText(this.f47685b.get(i4));
                this.f47694k.setTextSize(2, 14.0f);
                this.f47694k.setLayoutParams(layoutParams3);
                addView(this.f47694k);
            }
        }
    }

    public void b(int i4, float f5) {
        this.f47688e = (getWidth() / this.f47686c) * (i4 + f5);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        double d5;
        super.dispatchDraw(canvas);
        canvas.save();
        canvas.translate(this.f47688e, getHeight() - 2);
        if (this.f47690g == 0) {
            this.f47690g = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getWidth() / this.f47686c;
        }
        int i4 = this.f47690g;
        double d6 = i4;
        Double.isNaN(d6);
        float f5 = (int) (d6 * 0.15d);
        Double.isNaN(i4);
        canvas.drawLine(f5, 0.0f, i4 - ((int) (d5 * 0.15d)), 0.0f, this.f47689f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f47691h.getScrollY() + this.f47691h.getHeight() == this.f47691h.getChildAt(0).getHeight()) {
            this.f47691h.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TextView getTv() {
        return this.f47692i;
    }

    public TextView getTv1() {
        return this.f47693j;
    }

    public TextView getTv2() {
        return this.f47694k;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        int i8 = this.f47686c;
        if (i8 > 0) {
            this.f47690g = i4 / i8;
        }
    }

    public void setIndicatorColor(int i4) {
        this.f47687d = i4;
    }

    public void setParentScrollView(ScrollView scrollView) {
        this.f47691h = scrollView;
    }

    public void setTitles(List<String> list) {
        this.f47685b = list;
        this.f47686c = list.size();
        a();
    }

    public void setTv(TextView textView) {
        this.f47692i = textView;
    }

    public void setTv1(TextView textView) {
        this.f47693j = textView;
    }

    public void setTv2(TextView textView) {
        this.f47694k = textView;
    }

    public SimpleViewPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47687d = f47684m;
        this.f47689f = new Paint();
        this.f47692i = new TextView(getContext());
        this.f47693j = new TextView(getContext());
        this.f47694k = new TextView(getContext());
        this.f47689f.setColor(this.f47687d);
        this.f47689f.setStrokeWidth(9.0f);
    }
}
