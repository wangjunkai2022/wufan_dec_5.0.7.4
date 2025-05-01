package com.join.kotlin.ui.endgame.adapter;

import android.content.Context;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemEndGameSlotListBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.dto.ArchiveListBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EndGameSlotListAdapter.kt */
/* loaded from: classes3.dex */
public final class EndGameSlotListAdapter extends BaseDataBindingAdapter<ArchiveListBean, ViewDataBinding> implements ISlotAdapterListener {
    @NotNull
    private MutableLiveData<ArchiveListBean> checkedItem;
    @NotNull
    private Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndGameSlotListAdapter(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.checkedItem = new MutableLiveData<>();
    }

    @NotNull
    public final MutableLiveData<ArchiveListBean> getCheckedItem() {
        return this.checkedItem;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.item_end_game_slot_list;
    }

    @Override // com.join.kotlin.ui.endgame.adapter.ISlotAdapterListener
    public void onItemCheckedChanged(@NotNull ArchiveListBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ArchiveListBean value = this.checkedItem.getValue();
        if (value != null) {
            value.setIsCheck(0);
        }
        item.setIsCheck(!Intrinsics.areEqual(this.checkedItem.getValue(), item) ? 1 : 0);
        MutableLiveData<ArchiveListBean> mutableLiveData = this.checkedItem;
        if (item.getIsCheck() != 1) {
            item = null;
        }
        mutableLiveData.setValue(item);
        notifyDataSetChanged();
    }

    public final void setCheckedItem(@NotNull MutableLiveData<ArchiveListBean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.checkedItem = mutableLiveData;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull ViewDataBinding binding, @NotNull ArchiveListBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof ItemEndGameSlotListBinding) {
            ItemEndGameSlotListBinding itemEndGameSlotListBinding = (ItemEndGameSlotListBinding) binding;
            itemEndGameSlotListBinding.g(item);
            itemEndGameSlotListBinding.h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull ViewDataBinding binding, @NotNull ArchiveListBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof ItemEndGameSlotListBinding) {
            ItemEndGameSlotListBinding itemEndGameSlotListBinding = (ItemEndGameSlotListBinding) binding;
            itemEndGameSlotListBinding.g(item);
            itemEndGameSlotListBinding.h(this);
        }
    }
}
