package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes4.dex */
public class HistogramView extends View implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private int f47159b;

    /* renamed from: c  reason: collision with root package name */
    private View f47160c;

    /* renamed from: d  reason: collision with root package name */
    private String f47161d;

    /* renamed from: e  reason: collision with root package name */
    private int f47162e;

    /* renamed from: f  reason: collision with root package name */
    private int f47163f;

    /* renamed from: g  reason: collision with root package name */
    private int f47164g;

    /* renamed from: h  reason: collision with root package name */
    private int f47165h;

    /* renamed from: i  reason: collision with root package name */
    private int f47166i;

    /* renamed from: j  reason: collision with root package name */
    private double f47167j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f47168k;

    /* renamed from: l  reason: collision with root package name */
    private Handler f47169l;

    /* renamed from: m  reason: collision with root package name */
    private int f47170m;

    /* renamed from: n  reason: collision with root package name */
    private int f47171n;

    /* renamed from: o  reason: collision with root package name */
    private Canvas f47172o;

    public HistogramView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47168k = true;
        this.f47169l = new Handler();
        this.f47170m = 20;
        this.f47171n = 1;
    }

    private void a(Paint paint, boolean z4) {
        paint.setColor(Color.parseColor(this.f47161d));
        if (z4) {
            this.f47169l.postDelayed(this, this.f47171n);
            if (this.f47166i == 0) {
                Canvas canvas = this.f47172o;
                int i4 = this.f47159b;
                canvas.drawRect(0.0f, (i4 / 4) - 1, this.f47165h, ((i4 * 3) / 4) + 1, paint);
                return;
            }
            return;
        }
        int i5 = this.f47164g;
        if (i5 == 0) {
            Canvas canvas2 = this.f47172o;
            int i6 = this.f47159b;
            canvas2.drawRect(0.0f, (i6 / 4) - 1, 10.0f, ((i6 * 3) / 4) + 1, paint);
            return;
        }
        Canvas canvas3 = this.f47172o;
        int i7 = this.f47159b;
        canvas3.drawRect(0.0f, (i7 / 4) - 1, i5, ((i7 * 3) / 4) + 1, paint);
    }

    public boolean b() {
        return this.f47168k;
    }

    public int getAnimRate() {
        return this.f47170m;
    }

    public int getOrientation() {
        return this.f47166i;
    }

    public double getProgress() {
        return this.f47167j;
    }

    public String getRateBackgroundColor() {
        return this.f47161d;
    }

    public int getRateBackgroundId() {
        return this.f47162e;
    }

    public int getRateHeight() {
        return this.f47163f;
    }

    public View getRateView() {
        return this.f47160c;
    }

    public int getRateWidth() {
        return this.f47164g;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f47172o = canvas;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        if (this.f47161d != null) {
            a(paint, this.f47168k);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f47159b = i5;
        if (this.f47166i == 0) {
            double d5 = i4;
            double d6 = this.f47167j;
            Double.isNaN(d5);
            this.f47164g = (int) (d5 * d6);
            this.f47163f = i5;
            return;
        }
        double d7 = i5;
        double d8 = this.f47167j;
        Double.isNaN(d7);
        this.f47163f = (int) (d7 * d8);
        this.f47164g = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4;
        int i5;
        int i6 = this.f47166i;
        if (i6 == 0 && (i5 = this.f47165h) <= this.f47164g) {
            this.f47165h = i5 + this.f47170m;
            invalidate();
        } else if (i6 == 1 && (i4 = this.f47165h) <= this.f47163f) {
            this.f47165h = i4 + this.f47170m;
            invalidate();
        } else {
            this.f47169l.removeCallbacks(this);
            this.f47165h = 0;
        }
    }

    public void setAnim(boolean z4) {
        this.f47168k = z4;
    }

    public void setAnimRate(int i4) {
        this.f47170m = i4;
    }

    public void setOrientation(int i4) {
        this.f47166i = i4;
    }

    public void setProgress(double d5) {
        this.f47167j = d5;
    }

    public void setRateBackgroundColor(String str) {
        this.f47161d = str;
        this.f47162e = -1;
    }

    public void setRateBackgroundId(int i4) {
        this.f47162e = i4;
        this.f47161d = null;
    }

    public void setRateHeight(int i4) {
        this.f47163f = i4;
    }

    public void setRateView(View view) {
        this.f47160c = view;
    }

    public void setRateWidth(int i4) {
        this.f47164g = i4;
    }

    public HistogramView(Context context) {
        super(context);
        this.f47168k = true;
        this.f47169l = new Handler();
        this.f47170m = 20;
        this.f47171n = 1;
    }
}
