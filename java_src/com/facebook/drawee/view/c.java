package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.r;
import javax.annotation.Nullable;
/* compiled from: DraweeTransition.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class c extends Transition {

    /* renamed from: f  reason: collision with root package name */
    private static final String f11374f = "draweeTransition:bounds";

    /* renamed from: b  reason: collision with root package name */
    private final r.c f11375b;

    /* renamed from: c  reason: collision with root package name */
    private final r.c f11376c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final PointF f11377d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final PointF f11378e;

    /* compiled from: DraweeTransition.java */
    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r.b f11379b;

        a(r.b bVar) {
            this.f11379b = bVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11379b.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DraweeTransition.java */
    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GenericDraweeView f11381b;

        b(GenericDraweeView genericDraweeView) {
            this.f11381b = genericDraweeView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11381b.getHierarchy().x(c.this.f11376c);
            if (c.this.f11378e != null) {
                this.f11381b.getHierarchy().w(c.this.f11378e);
            }
        }
    }

    public c(r.c cVar, r.c cVar2, @Nullable PointF pointF, @Nullable PointF pointF2) {
        this.f11375b = cVar;
        this.f11376c = cVar2;
        this.f11377d = pointF;
        this.f11378e = pointF2;
    }

    private void c(TransitionValues transitionValues) {
        if (transitionValues.view instanceof GenericDraweeView) {
            transitionValues.values.put(f11374f, new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet d(r.c cVar, r.c cVar2) {
        return e(cVar, cVar2, null, null);
    }

    public static TransitionSet e(r.c cVar, r.c cVar2, @Nullable PointF pointF, @Nullable PointF pointF2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new c(cVar, cVar2, pointF, pointF2));
        return transitionSet;
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        c(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        c(transitionValues);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            Rect rect = (Rect) transitionValues.values.get(f11374f);
            Rect rect2 = (Rect) transitionValues2.values.get(f11374f);
            if (rect != null && rect2 != null) {
                r.c cVar = this.f11375b;
                r.c cVar2 = this.f11376c;
                if (cVar == cVar2 && this.f11377d == this.f11378e) {
                    return null;
                }
                GenericDraweeView genericDraweeView = (GenericDraweeView) transitionValues.view;
                r.b bVar = new r.b(cVar, cVar2, rect, rect2, this.f11377d, this.f11378e);
                genericDraweeView.getHierarchy().x(bVar);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(bVar));
                ofFloat.addListener(new b(genericDraweeView));
                return ofFloat;
            }
        }
        return null;
    }

    public c(r.c cVar, r.c cVar2) {
        this(cVar, cVar2, null, null);
    }
}
