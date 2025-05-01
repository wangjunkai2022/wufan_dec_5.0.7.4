package com.aggmoread.sdk.z.a.t;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
/* loaded from: classes2.dex */
public class g extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f2581a;

    /* renamed from: b  reason: collision with root package name */
    private int f2582b;

    /* renamed from: c  reason: collision with root package name */
    private int f2583c;

    /* renamed from: d  reason: collision with root package name */
    private int f2584d;

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f2581a = paint;
        paint.setDither(true);
        this.f2581a.setAntiAlias(true);
        this.f2581a.setStrokeWidth(10.0f);
        this.f2581a.setColor(SupportMenu.CATEGORY_MASK);
    }

    public void a(int i4) {
        this.f2581a.setColor(i4);
    }

    public void b(int i4) {
        this.f2584d = i4;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, (this.f2582b * this.f2584d) / 100, this.f2583c, this.f2581a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        this.f2582b = i4;
        this.f2583c = i5;
        super.onSizeChanged(i4, i5, i6, i7);
    }
}
