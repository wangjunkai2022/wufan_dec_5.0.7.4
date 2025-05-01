package com.join.mgps.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.join.mgps.ptr.PtrFrameLayout;
import com.join.mgps.ptr.PtrUIHeader;
/* loaded from: classes4.dex */
public class RentalsSunHeaderView extends PtrUIHeader {

    /* renamed from: b  reason: collision with root package name */
    private b f53745b;

    /* renamed from: c  reason: collision with root package name */
    private PtrFrameLayout f53746c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.ptr.indicator.b f53747d;

    public RentalsSunHeaderView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        f();
    }

    private void f() {
        this.f53745b = new b(getContext(), this);
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        float N = this.f53747d.N();
        this.f53745b.stop();
        this.f53745b.g(this.f53747d.d());
        this.f53745b.i(N);
        invalidate();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        float N = this.f53747d.N();
        this.f53745b.g(this.f53747d.d());
        this.f53745b.i(N);
        invalidate();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        this.f53745b.h();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        this.f53745b.start();
        float N = this.f53747d.N();
        this.f53745b.g(this.f53747d.d());
        this.f53745b.i(N);
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f53745b) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f53745b.draw(canvas);
        this.f53747d.N();
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f53745b.setBounds(paddingLeft, paddingTop, (i6 + paddingLeft) - i4, (i7 + paddingTop) - i5);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(((this.f53745b.e() * 5) / 4) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }

    public void setUp(PtrFrameLayout ptrFrameLayout) {
        this.f53746c = ptrFrameLayout;
        com.join.mgps.ptr.indicator.b bVar = new com.join.mgps.ptr.indicator.b();
        this.f53747d = bVar;
        this.f53746c.setPtrIndicator(bVar);
    }

    public RentalsSunHeaderView(Context context) {
        super(context);
        f();
    }

    public RentalsSunHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }
}
