package com.join.kotlin.ui.notice;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.NoticeItemItemBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.dto.BTActivityBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NoticeListAdapter.kt */
/* loaded from: classes3.dex */
public final class NoticeListAdapter extends BaseDataBindingAdapter<BTActivityBean, NoticeItemItemBinding> {
    @NotNull
    private ClickProxy clickProxy;
    @NotNull
    private Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeListAdapter(@NotNull Context context, @NotNull ClickProxy clickProxy) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clickProxy, "clickProxy");
        this.context = context;
        this.clickProxy = clickProxy;
    }

    @NotNull
    public final ClickProxy getClickProxy() {
        return this.clickProxy;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.notice_item_item;
    }

    public final void setClickProxy(@NotNull ClickProxy clickProxy) {
        Intrinsics.checkNotNullParameter(clickProxy, "<set-?>");
        this.clickProxy = clickProxy;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull NoticeItemItemBinding binding, @NotNull BTActivityBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        binding.g(item);
        binding.h(this.clickProxy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull NoticeItemItemBinding binding, @NotNull BTActivityBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        binding.g(item);
        binding.h(this.clickProxy);
    }
}
