package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailSimilarGameBinding;
import com.join.mgps.dto.CollectionBeanSub;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailSimilarGameAdapter.kt */
/* loaded from: classes3.dex */
public final class GameDetailSimilarGameAdapter extends BaseQuickAdapter<CollectionBeanSub, DataBindingHolder<ItemDiscountGameDetailSimilarGameBinding>> {
    public GameDetailSimilarGameAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemDiscountGameDetailSimilarGameBinding> holder, int i4, @Nullable CollectionBeanSub collectionBeanSub) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemDiscountGameDetailSimilarGameBinding a5 = holder.a();
        if (a5 == null) {
            return;
        }
        a5.f(collectionBeanSub);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemDiscountGameDetailSimilarGameBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_discount_game_detail_similar_game, parent);
    }
}
