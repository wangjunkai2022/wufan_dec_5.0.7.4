package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemGameCommentSpinnerLayoutBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentSpinnerAdapter.kt */
/* loaded from: classes3.dex */
public final class CommentSpinnerAdapter extends BaseQuickAdapter<String, DataBindingHolder<ItemGameCommentSpinnerLayoutBinding>> {
    private int selectedIndex;

    public CommentSpinnerAdapter() {
        super(null, 1, null);
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setSelectedIndex(int i4) {
        this.selectedIndex = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemGameCommentSpinnerLayoutBinding> holder, int i4, @Nullable String str) {
        TextView textView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemGameCommentSpinnerLayoutBinding a5 = holder.a();
        if (a5 != null) {
            a5.f(str);
        }
        ItemGameCommentSpinnerLayoutBinding a6 = holder.a();
        View view = a6 != null ? a6.f22178b : null;
        if (view != null) {
            view.setVisibility(i4 >= getItemCount() + (-1) ? 8 : 0);
        }
        ItemGameCommentSpinnerLayoutBinding a7 = holder.a();
        if (a7 == null || (textView = a7.f22179c) == null) {
            return;
        }
        textView.setTextColor(Color.parseColor(this.selectedIndex == i4 ? "#FF5142" : "#2C2C2C"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemGameCommentSpinnerLayoutBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_game_comment_spinner_layout, parent);
    }
}
