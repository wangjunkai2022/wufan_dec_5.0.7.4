package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailDialogInfoListBinding;
import com.join.kotlin.discount.model.bean.GameDetailDialogInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailInfoBottomDialogAdapter.kt */
/* loaded from: classes3.dex */
public final class GameDetailInfoBottomDialogAdapter extends BaseQuickAdapter<GameDetailDialogInfoBean, DataBindingHolder<ItemDiscountGameDetailDialogInfoListBinding>> {
    public GameDetailInfoBottomDialogAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemDiscountGameDetailDialogInfoListBinding> holder, int i4, @Nullable GameDetailDialogInfoBean gameDetailDialogInfoBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemDiscountGameDetailDialogInfoListBinding a5 = holder.a();
        if (a5 == null) {
            return;
        }
        a5.f(gameDetailDialogInfoBean);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemDiscountGameDetailDialogInfoListBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_discount_game_detail_dialog_info_list, parent);
    }
}
