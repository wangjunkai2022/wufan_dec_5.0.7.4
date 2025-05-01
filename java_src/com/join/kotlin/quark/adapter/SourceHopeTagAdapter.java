package com.join.kotlin.quark.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemSourceHopeTagBinding;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeTagAdapter.kt */
/* loaded from: classes3.dex */
public final class SourceHopeTagAdapter extends BaseQuickAdapter<SourceTabItemBean, DataBindingHolder<ItemSourceHopeTagBinding>> {
    public SourceHopeTagAdapter() {
        super(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemSourceHopeTagBinding> holder, int i4, @Nullable SourceTabItemBean sourceTabItemBean) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemSourceHopeTagBinding a5 = holder.a();
        if (a5 == null) {
            return;
        }
        a5.f(sourceTabItemBean);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemSourceHopeTagBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_source_hope_tag, parent);
    }
}
