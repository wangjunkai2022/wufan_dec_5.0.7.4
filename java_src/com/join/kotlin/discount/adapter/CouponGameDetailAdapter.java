package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemCouponGameDetailBinding;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.proxy.CouponListClickProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CouponGameDetailAdapter.kt */
/* loaded from: classes3.dex */
public final class CouponGameDetailAdapter extends BaseQuickAdapter<CouponItemBean, DataBindingHolder<ItemCouponGameDetailBinding>> {
    @Nullable
    private CouponListClickProxy listClickProxy;

    public CouponGameDetailAdapter() {
        super(null, 1, null);
    }

    @Nullable
    public final CouponListClickProxy getListClickProxy() {
        return this.listClickProxy;
    }

    public final void setListClickProxy(@Nullable CouponListClickProxy couponListClickProxy) {
        this.listClickProxy = couponListClickProxy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemCouponGameDetailBinding> holder, int i4, @Nullable CouponItemBean couponItemBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemCouponGameDetailBinding a5 = holder.a();
        if (a5 != null) {
            a5.h(couponItemBean);
        }
        ItemCouponGameDetailBinding a6 = holder.a();
        if (a6 == null) {
            return;
        }
        a6.g(this.listClickProxy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemCouponGameDetailBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_coupon_game_detail, parent);
    }
}
