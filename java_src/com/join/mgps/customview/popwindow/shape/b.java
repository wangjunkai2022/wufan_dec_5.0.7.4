package com.join.mgps.customview.popwindow.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
/* compiled from: ShapeRect.java */
/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: e  reason: collision with root package name */
    RectF f48622e;

    public b(y1.a aVar) {
        super(aVar);
        f();
    }

    private void f() {
        RectF rectF = new RectF();
        rectF.set(this.f48618a.b());
        float f5 = rectF.left;
        int i4 = this.f48619b;
        rectF.left = f5 - i4;
        rectF.top -= i4;
        rectF.right += i4;
        rectF.bottom += i4 + this.f48621d;
        this.f48622e = rectF;
    }

    @Override // com.join.mgps.customview.popwindow.shape.a
    public void a(Canvas canvas, Paint paint, int i4, int i5) {
        float f5 = i5;
        canvas.drawRoundRect(this.f48622e, f5, f5, paint);
    }

    @Override // com.join.mgps.customview.popwindow.shape.a
    public int b() {
        return (int) this.f48622e.height();
    }

    @Override // com.join.mgps.customview.popwindow.shape.a
    public Point c() {
        return this.f48618a.a();
    }

    @Override // com.join.mgps.customview.popwindow.shape.a
    public boolean d(double d5, double d6) {
        return this.f48622e.contains((float) d5, (float) d6);
    }

    @Override // com.join.mgps.customview.popwindow.shape.a
    public void e() {
        f();
    }

    public b(y1.a aVar, int i4, int i5, int i6) {
        super(aVar, i4, i5, i6);
        f();
    }
}
