package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: SlideInBottomAnimation.kt */
/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final long f9011a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final DecelerateInterpolator f9012b;

    @JvmOverloads
    public d() {
        this(0L, 1, null);
    }

    @JvmOverloads
    public d(long j4) {
        this.f9011a = j4;
        this.f9012b = new DecelerateInterpolator(1.3f);
    }

    @Override // com.chad.library.adapter.base.animation.b
    @NotNull
    public Animator a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f);
        animator.setDuration(this.f9011a);
        animator.setInterpolator(this.f9012b);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return animator;
    }

    public /* synthetic */ d(long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 400L : j4);
    }
}
