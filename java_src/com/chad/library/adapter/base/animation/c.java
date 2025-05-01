package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ScaleInAnimation.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final a f9006d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final float f9007e = 0.5f;

    /* renamed from: a  reason: collision with root package name */
    private final long f9008a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9009b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final DecelerateInterpolator f9010c;

    /* compiled from: ScaleInAnimation.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public c() {
        this(0L, 0.0f, 3, null);
    }

    @JvmOverloads
    public c(long j4) {
        this(j4, 0.0f, 2, null);
    }

    @JvmOverloads
    public c(long j4, float f5) {
        this.f9008a = j4;
        this.f9009b = f5;
        this.f9010c = new DecelerateInterpolator();
    }

    @Override // com.chad.library.adapter.base.animation.b
    @NotNull
    public Animator a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f9009b, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f9009b, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.f9008a);
        animatorSet.setInterpolator(this.f9010c);
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public /* synthetic */ c(long j4, float f5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 300L : j4, (i4 & 2) != 0 ? 0.5f : f5);
    }
}
