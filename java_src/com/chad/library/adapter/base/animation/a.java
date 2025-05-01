package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: AlphaInAnimation.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final C0231a f9001d = new C0231a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final float f9002e = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    private final long f9003a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9004b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final LinearInterpolator f9005c;

    /* compiled from: AlphaInAnimation.kt */
    /* renamed from: com.chad.library.adapter.base.animation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0231a {
        private C0231a() {
        }

        public /* synthetic */ C0231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public a() {
        this(0L, 0.0f, 3, null);
    }

    @JvmOverloads
    public a(long j4) {
        this(j4, 0.0f, 2, null);
    }

    @JvmOverloads
    public a(long j4, float f5) {
        this.f9003a = j4;
        this.f9004b = f5;
        this.f9005c = new LinearInterpolator();
    }

    @Override // com.chad.library.adapter.base.animation.b
    @NotNull
    public Animator a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", this.f9004b, 1.0f);
        animator.setDuration(this.f9003a);
        animator.setInterpolator(this.f9005c);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return animator;
    }

    public /* synthetic */ a(long j4, float f5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 300L : j4, (i4 & 2) != 0 ? 0.0f : f5);
    }
}
