package com.chad.library.adapter.base.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EmptyLayoutVH.kt */
/* loaded from: classes2.dex */
public final class EmptyLayoutVH extends RecyclerView.ViewHolder {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f9091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyLayoutVH(@NotNull FrameLayout emptyLayout) {
        super(emptyLayout);
        Intrinsics.checkNotNullParameter(emptyLayout, "emptyLayout");
        this.f9091a = emptyLayout;
    }

    public final void a(@Nullable View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        if (view.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
        this.f9091a.removeAllViews();
        this.f9091a.addView(view);
    }
}
