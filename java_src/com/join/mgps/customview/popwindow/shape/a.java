package com.join.mgps.customview.popwindow.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import com.join.mgps.customview.popwindow.view.PopWindowView;
/* compiled from: Shape.java */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected y1.a f48618a;

    /* renamed from: b  reason: collision with root package name */
    protected int f48619b;

    /* renamed from: c  reason: collision with root package name */
    protected int f48620c;

    /* renamed from: d  reason: collision with root package name */
    protected int f48621d;

    public a(y1.a aVar) {
        this(aVar, PopWindowView.f48624u, PopWindowView.f48625v, PopWindowView.f48626w);
    }

    public abstract void a(Canvas canvas, Paint paint, int i4, int i5);

    public abstract int b();

    public abstract Point c();

    public abstract boolean d(double d5, double d6);

    public abstract void e();

    public a(y1.a aVar, int i4, int i5, int i6) {
        this.f48618a = aVar;
        this.f48619b = i4;
        this.f48620c = i5;
        this.f48621d = i6;
    }
}
