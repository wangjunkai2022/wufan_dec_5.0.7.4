package com.join.android.app.component.xrecyclerview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
/* loaded from: classes3.dex */
public class QuickReturnFooterBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: e  reason: collision with root package name */
    private static final Interpolator f15415e = new FastOutSlowInInterpolator();

    /* renamed from: a  reason: collision with root package name */
    private int f15416a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15417b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15418c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15419d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15420b;

        a(View view) {
            this.f15420b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickReturnFooterBehavior.this.f15418c = false;
            if (QuickReturnFooterBehavior.this.f15417b) {
                return;
            }
            QuickReturnFooterBehavior.this.i(this.f15420b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickReturnFooterBehavior.this.f15418c = false;
            this.f15420b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15422b;

        b(View view) {
            this.f15422b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickReturnFooterBehavior.this.f15417b = false;
            if (QuickReturnFooterBehavior.this.f15418c) {
                return;
            }
            QuickReturnFooterBehavior.this.g(this.f15422b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickReturnFooterBehavior.this.f15417b = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f15422b.setVisibility(0);
        }
    }

    public QuickReturnFooterBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15419d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(View view) {
        this.f15418c = true;
        ViewPropertyAnimator duration = view.animate().translationY(view.getHeight()).setInterpolator(f15415e).setDuration(200L);
        duration.setListener(new a(view));
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(View view) {
        this.f15417b = true;
        ViewPropertyAnimator duration = view.animate().translationY(0.0f).setInterpolator(f15415e).setDuration(200L);
        duration.setListener(new b(view));
        duration.start();
    }

    public void h(View view, boolean z4) {
        boolean z5 = this.f15419d;
        if (z5 == z4) {
            if (z5) {
                if (view.getVisibility() == 0) {
                    return;
                }
            } else if (view.getVisibility() == 8) {
                return;
            }
        }
        this.f15419d = z4;
        view.animate().cancel();
        if (this.f15419d) {
            if (this.f15417b) {
                return;
            }
            i(view);
        } else if (this.f15418c) {
        } else {
            g(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        if (this.f15419d) {
            if ((i5 > 0 && this.f15416a < 0) || (i5 < 0 && this.f15416a > 0)) {
                view.animate().cancel();
                this.f15416a = 0;
            }
            int i6 = this.f15416a + i5;
            this.f15416a = i6;
            if (i6 > view.getHeight() && view.getVisibility() == 0 && !this.f15418c) {
                g(view);
            } else if (this.f15416a >= 0 || view.getVisibility() != 8 || this.f15417b) {
            } else {
                i(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        return this.f15419d && (i4 & 2) != 0;
    }
}
