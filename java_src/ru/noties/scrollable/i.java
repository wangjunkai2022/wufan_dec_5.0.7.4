package ru.noties.scrollable;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
/* compiled from: InterpolatorCloseUpAnimatorConfigurator.java */
/* loaded from: classes7.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Interpolator f73317a;

    public i(Interpolator interpolator) {
        this.f73317a = interpolator;
    }

    @Override // ru.noties.scrollable.d
    public void a(ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(this.f73317a);
    }
}
