package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailInfoListBinding;
import com.join.kotlin.discount.model.bean.GameDetailInfoItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailInfoAdapter.kt */
/* loaded from: classes3.dex */
public final class GameDetailInfoAdapter extends BaseQuickAdapter<GameDetailInfoItemBean, DataBindingHolder<ItemDiscountGameDetailInfoListBinding>> {
    public GameDetailInfoAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemDiscountGameDetailInfoListBinding> holder, int i4, @Nullable GameDetailInfoItemBean gameDetailInfoItemBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemDiscountGameDetailInfoListBinding a5 = holder.a();
        if (a5 == null) {
            return;
        }
        a5.f(gameDetailInfoItemBean);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemDiscountGameDetailInfoListBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_discount_game_detail_info_list, parent);
    }
}
