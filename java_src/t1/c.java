package t1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: ScaleInAnimation.java */
/* loaded from: classes4.dex */
public class c implements b {

    /* renamed from: b  reason: collision with root package name */
    private static final float f73358b = 0.5f;

    /* renamed from: a  reason: collision with root package name */
    private final float f73359a;

    public c() {
        this(0.5f);
    }

    @Override // t1.b
    public Animator[] a(View view) {
        return new ObjectAnimator[]{ObjectAnimator.ofFloat(view, "scaleX", this.f73359a, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", this.f73359a, 1.0f)};
    }

    public c(float f5) {
        this.f73359a = f5;
    }
}
