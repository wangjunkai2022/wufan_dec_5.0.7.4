package com.facebook.fresco.animation.drawable.animator;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
/* compiled from: AnimatedDrawable2ValueAnimatorHelper.java */
@TargetApi(11)
/* loaded from: classes2.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedDrawable2ValueAnimatorHelper.java */
    /* renamed from: com.facebook.fresco.animation.drawable.animator.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0265a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.fresco.animation.drawable.a f11470b;

        C0265a(com.facebook.fresco.animation.drawable.a aVar) {
            this.f11470b = aVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        @TargetApi(11)
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11470b.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private a() {
    }

    public static ValueAnimator.AnimatorUpdateListener a(com.facebook.fresco.animation.drawable.a aVar) {
        return new C0265a(aVar);
    }

    public static ValueAnimator b(com.facebook.fresco.animation.drawable.a aVar) {
        int g4 = aVar.g();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, (int) aVar.h());
        valueAnimator.setDuration(aVar.h());
        if (g4 == 0) {
            g4 = -1;
        }
        valueAnimator.setRepeatCount(g4);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(a(aVar));
        return valueAnimator;
    }

    public static ValueAnimator c(com.facebook.fresco.animation.drawable.a aVar, int i4) {
        ValueAnimator b5 = b(aVar);
        if (b5 == null) {
            return null;
        }
        b5.setRepeatCount((int) Math.max(i4 / aVar.h(), 1L));
        return b5;
    }
}
