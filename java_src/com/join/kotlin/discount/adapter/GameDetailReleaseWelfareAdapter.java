package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemGameDetailReleaseWelfareListBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailReleaseWelfareAdapter.kt */
/* loaded from: classes3.dex */
public final class GameDetailReleaseWelfareAdapter extends BaseQuickAdapter<String, DataBindingHolder<ItemGameDetailReleaseWelfareListBinding>> {
    public GameDetailReleaseWelfareAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemGameDetailReleaseWelfareListBinding> holder, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemGameDetailReleaseWelfareListBinding a5 = holder.a();
        TextView textView = a5 != null ? a5.f22275b : null;
        if (textView == null) {
            return;
        }
        textView.setText(Html.fromHtml(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemGameDetailReleaseWelfareListBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_game_detail_release_welfare_list, parent);
    }
}
