package com.join.kotlin.ui.coupon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBinding;
import com.join.mgps.dto.BTGameCouponBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CouponAdapter.kt */
/* loaded from: classes3.dex */
public final class CouponAdapter extends RecyclerView.Adapter<CouponViewHolder> {
    @NotNull
    private ClickProxy clickProxy;
    @NotNull
    private Context context;
    public List<? extends BTGameCouponBean> listDatas;

    public CouponAdapter(@NotNull Context context, @NotNull ClickProxy clickProxy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clickProxy, "clickProxy");
        this.context = context;
        this.clickProxy = clickProxy;
    }

    @NotNull
    public final ClickProxy getClickProxy() {
        return this.clickProxy;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getListDatas().size();
    }

    @NotNull
    public final List<BTGameCouponBean> getListDatas() {
        List list = this.listDatas;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listDatas");
        return null;
    }

    public final void setClickProxy(@NotNull ClickProxy clickProxy) {
        Intrinsics.checkNotNullParameter(clickProxy, "<set-?>");
        this.clickProxy = clickProxy;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setListDatas(@NotNull List<? extends BTGameCouponBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listDatas = list;
    }

    public final void submitList(@NotNull List<? extends BTGameCouponBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        setListDatas(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CouponViewHolder p02, int i4) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        CouponListItemLayoutBinding couponListItemLayoutBinding = (CouponListItemLayoutBinding) DataBindingUtil.getBinding(p02.getItem());
        if (couponListItemLayoutBinding != null) {
            couponListItemLayoutBinding.h(getListDatas().get(i4));
        }
        if (couponListItemLayoutBinding != null) {
            couponListItemLayoutBinding.executePendingBindings();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CouponViewHolder onCreateViewHolder(@NotNull ViewGroup p02, int i4) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        CouponListItemLayoutBinding couponListItemLayoutBinding = (CouponListItemLayoutBinding) DataBindingUtil.inflate(LayoutInflater.from(this.context), R.layout.coupon_list_item_layout, p02, false);
        couponListItemLayoutBinding.i(this.clickProxy);
        View root = couponListItemLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "databinfding.root");
        return new CouponViewHolder(root);
    }
}
