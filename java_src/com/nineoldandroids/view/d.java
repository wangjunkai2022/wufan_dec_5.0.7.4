package com.nineoldandroids.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.a;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorICS.java */
/* loaded from: classes5.dex */
class d extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final long f57846c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<ViewPropertyAnimator> f57847b;

    /* compiled from: ViewPropertyAnimatorICS.java */
    /* loaded from: classes5.dex */
    class a implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0575a f57848b;

        a(a.InterfaceC0575a interfaceC0575a) {
            this.f57848b = interfaceC0575a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f57848b.a(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f57848b.d(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f57848b.b(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f57848b.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(View view) {
        this.f57847b = new WeakReference<>(view.animate());
    }

    @Override // com.nineoldandroids.view.b
    public b A(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b B(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b C(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b a(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b b(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void d() {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getDuration();
        }
        return -1L;
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getStartDelay();
        }
        return -1L;
    }

    @Override // com.nineoldandroids.view.b
    public b g(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b h(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b i(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b j(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b k(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b l(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b m(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b n(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b o(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b p(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b q(long j4) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j4);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b r(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b s(a.InterfaceC0575a interfaceC0575a) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            if (interfaceC0575a == null) {
                viewPropertyAnimator.setListener(null);
            } else {
                viewPropertyAnimator.setListener(new a(interfaceC0575a));
            }
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b t(long j4) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j4);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void u() {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    @Override // com.nineoldandroids.view.b
    public b v(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b w(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b x(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b y(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f5);
        }
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public b z(float f5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f57847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f5);
        }
        return this;
    }
}
