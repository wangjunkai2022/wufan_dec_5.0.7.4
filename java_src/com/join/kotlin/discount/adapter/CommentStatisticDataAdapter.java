package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemCommentStatisticDataLayoutBinding;
import com.join.kotlin.discount.model.bean.CommentDataProgressBean;
import com.join.mgps.customview.MStarBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentStatisticDataAdapter.kt */
/* loaded from: classes3.dex */
public final class CommentStatisticDataAdapter extends BaseQuickAdapter<CommentDataProgressBean, DataBindingHolder<ItemCommentStatisticDataLayoutBinding>> {
    public CommentStatisticDataAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemCommentStatisticDataLayoutBinding> holder, int i4, @Nullable CommentDataProgressBean commentDataProgressBean) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        MStarBar mStarBar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemCommentStatisticDataLayoutBinding a5 = holder.a();
        if (a5 != null) {
            a5.f(commentDataProgressBean);
        }
        ItemCommentStatisticDataLayoutBinding a6 = holder.a();
        boolean z4 = false;
        if (a6 != null && (mStarBar = a6.f21756c) != null) {
            mStarBar.setStarMark(commentDataProgressBean != null ? commentDataProgressBean.getStarCount() : 0);
        }
        ItemCommentStatisticDataLayoutBinding a7 = holder.a();
        if (a7 == null || (linearLayout = a7.f21755b) == null || (layoutParams = linearLayout.getLayoutParams()) == null) {
            return;
        }
        if (commentDataProgressBean != null && commentDataProgressBean.getType() == 1) {
            layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.wdp66);
        } else {
            if (commentDataProgressBean != null && commentDataProgressBean.getType() == 2) {
                z4 = true;
            }
            if (z4) {
                layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.wdp49);
            }
        }
        ItemCommentStatisticDataLayoutBinding a8 = holder.a();
        LinearLayout linearLayout2 = a8 != null ? a8.f21755b : null;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemCommentStatisticDataLayoutBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_comment_statistic_data_layout, parent);
    }
}
