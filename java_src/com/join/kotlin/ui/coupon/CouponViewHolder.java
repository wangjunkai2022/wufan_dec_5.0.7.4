package com.join.kotlin.ui.coupon;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CouponViewHolder.kt */
/* loaded from: classes3.dex */
public final class CouponViewHolder extends RecyclerView.ViewHolder {
    @NotNull
    private View item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponViewHolder(@NotNull View item) {
        super(item);
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    @NotNull
    public final View getItem() {
        return this.item;
    }

    public final void setItem(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.item = view;
    }
}
