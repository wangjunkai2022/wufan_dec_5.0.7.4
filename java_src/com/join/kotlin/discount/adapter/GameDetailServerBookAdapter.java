package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailServerListBinding;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailServerBookAdapter.kt */
/* loaded from: classes3.dex */
public final class GameDetailServerBookAdapter extends BaseQuickAdapter<GameServerInfoBean, DataBindingHolder<ItemDiscountGameDetailServerListBinding>> {
    @Nullable
    private GameDetailServerBookDialogClickProxy click;

    public GameDetailServerBookAdapter() {
        super(null, 1, null);
    }

    @Nullable
    public final GameDetailServerBookDialogClickProxy getClick() {
        return this.click;
    }

    public final void setClick(@Nullable GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy) {
        this.click = gameDetailServerBookDialogClickProxy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemDiscountGameDetailServerListBinding> holder, int i4, @Nullable GameServerInfoBean gameServerInfoBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemDiscountGameDetailServerListBinding a5 = holder.a();
        if (a5 != null) {
            a5.h(gameServerInfoBean);
        }
        ItemDiscountGameDetailServerListBinding a6 = holder.a();
        if (a6 != null) {
            a6.g(this.click);
        }
        ItemDiscountGameDetailServerListBinding a7 = holder.a();
        View view = a7 != null ? a7.f21957b : null;
        if (view == null) {
            return;
        }
        boolean z4 = true;
        view.setSelected(((gameServerInfoBean != null && gameServerInfoBean.getSubscribe()) && Intrinsics.areEqual(gameServerInfoBean.getExpire(), Boolean.FALSE)) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemDiscountGameDetailServerListBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_discount_game_detail_server_list, parent);
    }
}
