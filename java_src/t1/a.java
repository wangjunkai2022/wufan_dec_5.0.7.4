package t1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: AlphaInAnimation.java */
/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private static final float f73356b = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    private final float f73357a;

    public a() {
        this(0.0f);
    }

    @Override // t1.b
    public Animator[] a(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.f73357a, 1.0f)};
    }

    public a(float f5) {
        this.f73357a = f5;
    }
}
