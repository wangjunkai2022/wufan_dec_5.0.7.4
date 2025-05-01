package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: SlideInLeftAnimation.kt */
/* loaded from: classes2.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final long f9013a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final DecelerateInterpolator f9014b;

    @JvmOverloads
    public e() {
        this(0L, 1, null);
    }

    @JvmOverloads
    public e(long j4) {
        this.f9013a = j4;
        this.f9014b = new DecelerateInterpolator(1.8f);
    }

    @Override // com.chad.library.adapter.base.animation.b
    @NotNull
    public Animator a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", -view.getRootView().getWidth(), 0.0f);
        animator.setDuration(this.f9013a);
        animator.setInterpolator(this.f9014b);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return animator;
    }

    public /* synthetic */ e(long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 400L : j4);
    }
}
