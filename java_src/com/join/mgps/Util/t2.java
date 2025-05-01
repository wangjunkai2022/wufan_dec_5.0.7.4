package com.join.mgps.Util;

import android.animation.Animator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import androidx.annotation.IdRes;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
/* compiled from: ViewUtils.java */
/* loaded from: classes3.dex */
public class t2 {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        private static final Interpolator f28073e = new FastOutSlowInInterpolator();

        /* renamed from: a  reason: collision with root package name */
        private boolean f28074a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f28075b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f28076c = true;

        /* renamed from: d  reason: collision with root package name */
        private View f28077d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewUtils.java */
        /* renamed from: com.join.mgps.Util.t2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0327a implements Animator.AnimatorListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f28078b;

            C0327a(View view) {
                this.f28078b = view;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                a.this.f28075b = false;
                if (a.this.f28074a) {
                    return;
                }
                a.this.m(this.f28078b);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.f28075b = false;
                this.f28078b.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewUtils.java */
        /* loaded from: classes3.dex */
        public class b implements Animator.AnimatorListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f28080b;

            b(View view) {
                this.f28080b = view;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                a.this.f28074a = false;
                if (a.this.f28075b) {
                    return;
                }
                a.this.j(this.f28080b);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.f28074a = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.f28080b.setVisibility(0);
            }
        }

        public a(View view) {
            this.f28077d = view;
            k(view, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view) {
            int i4 = i();
            this.f28075b = true;
            ViewPropertyAnimator duration = view.animate().translationY(i4).setInterpolator(f28073e).setDuration(200L);
            duration.setListener(new C0327a(view));
            duration.start();
        }

        private void k(View view, boolean z4) {
            if (view == null) {
                return;
            }
            boolean z5 = this.f28076c;
            if (z5 == z4) {
                if (z5) {
                    if (view.getVisibility() == 0) {
                        return;
                    }
                } else if (view.getVisibility() == 8) {
                    return;
                }
            }
            this.f28076c = z4;
            view.animate().cancel();
            if (this.f28076c) {
                if (this.f28074a) {
                    return;
                }
                m(view);
            } else if (this.f28075b) {
            } else {
                j(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(View view) {
            this.f28074a = true;
            ViewPropertyAnimator duration = view.animate().translationY(0.0f).setInterpolator(f28073e).setDuration(200L);
            duration.setListener(new b(view));
            duration.start();
        }

        public void g() {
            View view = this.f28077d;
            if (view != null) {
                view.animate().cancel();
            }
        }

        public int h() {
            View view = this.f28077d;
            if (view == null) {
                return 0;
            }
            return view.getHeight();
        }

        public int i() {
            int height = this.f28077d.getHeight();
            if (this.f28077d.getParent() == null || !(this.f28077d.getParent() instanceof View)) {
                return height;
            }
            View view = (View) this.f28077d.getParent();
            return view.getBottom() != this.f28077d.getBottom() ? view.getBottom() - this.f28077d.getTop() : height;
        }

        public void l(boolean z4) {
            k(this.f28077d, z4);
        }
    }

    private t2() {
    }

    public static <V extends View> V a(Activity activity, @IdRes int i4) {
        return (V) activity.findViewById(i4);
    }

    public static <V extends View> V b(View view, @IdRes int i4) {
        return (V) view.findViewById(i4);
    }

    public static void c(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (Build.VERSION.SDK_INT >= 16) {
            return;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }
}
