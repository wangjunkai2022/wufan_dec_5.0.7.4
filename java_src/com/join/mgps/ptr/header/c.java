package com.join.mgps.ptr.header;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.Random;
/* compiled from: StoreHouseBarItem.java */
/* loaded from: classes4.dex */
public class c extends Animation {

    /* renamed from: b  reason: collision with root package name */
    public PointF f53863b;

    /* renamed from: c  reason: collision with root package name */
    public float f53864c;

    /* renamed from: d  reason: collision with root package name */
    public int f53865d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f53866e;

    /* renamed from: f  reason: collision with root package name */
    private float f53867f;

    /* renamed from: g  reason: collision with root package name */
    private float f53868g;

    /* renamed from: h  reason: collision with root package name */
    private PointF f53869h;

    /* renamed from: i  reason: collision with root package name */
    private PointF f53870i;

    public c(int i4, PointF pointF, PointF pointF2, int i5, int i6) {
        Paint paint = new Paint();
        this.f53866e = paint;
        this.f53867f = 1.0f;
        this.f53868g = 0.4f;
        this.f53865d = i4;
        this.f53863b = new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
        float f5 = pointF.x;
        PointF pointF3 = this.f53863b;
        this.f53869h = new PointF(f5 - pointF3.x, pointF.y - pointF3.y);
        float f6 = pointF2.x;
        PointF pointF4 = this.f53863b;
        this.f53870i = new PointF(f6 - pointF4.x, pointF2.y - pointF4.y);
        d(i5);
        e(i6);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    public void a(Canvas canvas) {
        PointF pointF = this.f53869h;
        float f5 = pointF.x;
        float f6 = pointF.y;
        PointF pointF2 = this.f53870i;
        canvas.drawLine(f5, f6, pointF2.x, pointF2.y, this.f53866e);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f5, Transformation transformation) {
        float f6 = this.f53867f;
        c(f6 + ((this.f53868g - f6) * f5));
    }

    public void b(int i4) {
        this.f53864c = (-new Random().nextInt(i4)) + i4;
    }

    public void c(float f5) {
        this.f53866e.setAlpha((int) (f5 * 255.0f));
    }

    public void d(int i4) {
        this.f53866e.setColor(i4);
    }

    public void e(int i4) {
        this.f53866e.setStrokeWidth(i4);
    }

    public void f(float f5, float f6) {
        this.f53867f = f5;
        this.f53868g = f6;
        super.start();
    }
}
