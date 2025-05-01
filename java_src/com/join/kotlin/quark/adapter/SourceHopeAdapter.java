package com.join.kotlin.quark.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemQuarkSourceHopeBinding;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceHopeItemClickProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeAdapter.kt */
/* loaded from: classes3.dex */
public final class SourceHopeAdapter extends BaseQuickAdapter<SourceListItemBean, DataBindingHolder<ItemQuarkSourceHopeBinding>> {
    @Nullable
    private SourceHopeItemClickProxy sourceHopeItemClickProxy;

    public SourceHopeAdapter() {
        super(null, 1, null);
    }

    @Nullable
    public final SourceHopeItemClickProxy getSourceHopeItemClickProxy() {
        return this.sourceHopeItemClickProxy;
    }

    public final void setSourceHopeItemClickProxy(@Nullable SourceHopeItemClickProxy sourceHopeItemClickProxy) {
        this.sourceHopeItemClickProxy = sourceHopeItemClickProxy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemQuarkSourceHopeBinding> holder, int i4, @Nullable SourceListItemBean sourceListItemBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemQuarkSourceHopeBinding a5 = holder.a();
        if (a5 != null) {
            a5.h(sourceListItemBean);
        }
        ItemQuarkSourceHopeBinding a6 = holder.a();
        if (a6 == null) {
            return;
        }
        a6.g(this.sourceHopeItemClickProxy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemQuarkSourceHopeBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_quark_source_hope, parent);
    }
}
