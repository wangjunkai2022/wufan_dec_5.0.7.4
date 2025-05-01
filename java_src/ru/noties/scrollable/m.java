package ru.noties.scrollable;

import android.animation.ValueAnimator;
/* compiled from: OverScrollListenerBase.java */
/* loaded from: classes7.dex */
public abstract class m implements l {

    /* renamed from: a  reason: collision with root package name */
    private int f73318a;

    /* renamed from: b  reason: collision with root package name */
    private float f73319b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f73320c;

    /* compiled from: OverScrollListenerBase.java */
    /* loaded from: classes7.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScrollableLayout f73321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f73322c;

        a(ScrollableLayout scrollableLayout, float f5) {
            this.f73321b = scrollableLayout;
            this.f73322c = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            m.this.f73318a -= (int) (m.this.f73318a * animatedFraction);
            m mVar = m.this;
            ScrollableLayout scrollableLayout = this.f73321b;
            float f5 = this.f73322c;
            mVar.j(scrollableLayout, f5 - (animatedFraction * f5));
        }
    }

    @Override // ru.noties.scrollable.l
    public boolean a(ScrollableLayout scrollableLayout, int i4) {
        return this.f73318a > 0;
    }

    @Override // ru.noties.scrollable.l
    public void b(ScrollableLayout scrollableLayout) {
        f();
        float i4 = i(scrollableLayout);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f73320c = ofFloat;
        g(ofFloat);
        this.f73320c.addUpdateListener(new a(scrollableLayout, i4));
        this.f73320c.start();
    }

    @Override // ru.noties.scrollable.l
    public void c(ScrollableLayout scrollableLayout, int i4) {
        f();
        int h4 = h(scrollableLayout);
        int i5 = this.f73318a + (-i4);
        this.f73318a = i5;
        if (i5 > h4) {
            this.f73318a = h4;
        }
        float i6 = i(scrollableLayout);
        if (Float.compare(this.f73319b, i6) != 0) {
            j(scrollableLayout, i6);
            this.f73319b = i6;
        }
    }

    @Override // ru.noties.scrollable.l
    public void clear() {
        this.f73318a = 0;
    }

    public void f() {
        ValueAnimator valueAnimator = this.f73320c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f73320c.cancel();
    }

    protected void g(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(250L);
    }

    protected int h(ScrollableLayout scrollableLayout) {
        return scrollableLayout.getMaxScrollY();
    }

    protected float i(ScrollableLayout scrollableLayout) {
        int i4 = this.f73318a;
        if (i4 < 0) {
            return 0.0f;
        }
        return i4 / h(scrollableLayout);
    }

    protected abstract void j(ScrollableLayout scrollableLayout, float f5);
}
