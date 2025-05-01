package com.join.kotlin.quark.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemQuarkSearchResultBinding;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.mgps.customview.FlowLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SearchResultAdapter.kt */
@SourceDebugExtension({"SMAP\nSearchResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultAdapter.kt\ncom/join/kotlin/quark/adapter/SearchResultAdapter\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt$notNull$1\n*L\n1#1,76:1\n28#2,5:77\n34#2:83\n28#2,5:84\n34#2:90\n28#3:82\n28#3:89\n*S KotlinDebug\n*F\n+ 1 SearchResultAdapter.kt\ncom/join/kotlin/quark/adapter/SearchResultAdapter\n*L\n36#1:77,5\n36#1:83\n55#1:84,5\n55#1:90\n36#1:82\n55#1:89\n*E\n"})
/* loaded from: classes3.dex */
public final class SearchResultAdapter extends BaseQuickAdapter<SourceListItemBean, DataBindingHolder<ItemQuarkSearchResultBinding>> {
    public SearchResultAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemQuarkSearchResultBinding> holder, int i4, @Nullable SourceListItemBean sourceListItemBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemQuarkSearchResultBinding a5 = holder.a();
        if (a5 != null) {
            a5.f(sourceListItemBean);
        }
        ItemQuarkSearchResultBinding a6 = holder.a();
        FlowLayout flowLayout = a6 != null ? a6.f22559b : null;
        if (flowLayout != null) {
            flowLayout.removeAllViews();
            flowLayout.setHorizontalDivider((int) flowLayout.getResources().getDimension(R.dimen.wdp14));
            flowLayout.setVerticalDivider((int) flowLayout.getResources().getDimension(R.dimen.wdp14));
            String tag = sourceListItemBean != null ? sourceListItemBean.getTag() : null;
            if (tag != null) {
                View inflate = View.inflate(holder.itemView.getContext(), R.layout.layout_source_tag_view, null);
                Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(tag);
                textView.setBackgroundResource(R.drawable.shape_ffeded_r_4);
                textView.setTextColor(Color.parseColor("#FF4D4D"));
                flowLayout.addView(textView, new ViewGroup.MarginLayoutParams(-2, -2));
            }
            String tips = sourceListItemBean != null ? sourceListItemBean.getTips() : null;
            if (tips != null) {
                View inflate2 = View.inflate(holder.itemView.getContext(), R.layout.layout_source_tag_view, null);
                Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) inflate2;
                textView2.setText(tips);
                textView2.setBackgroundResource(R.drawable.shape_fff4ed_r_4);
                textView2.setTextColor(Color.parseColor("#FF934B"));
                flowLayout.addView(textView2, new ViewGroup.MarginLayoutParams(-2, -2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemQuarkSearchResultBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_quark_search_result, parent);
    }
}
