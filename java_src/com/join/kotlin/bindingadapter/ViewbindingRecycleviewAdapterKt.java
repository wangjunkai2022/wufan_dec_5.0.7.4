package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewbindingRecycleviewAdapter.kt */
/* loaded from: classes3.dex */
public final class ViewbindingRecycleviewAdapterKt {
    @BindingAdapter(requireAll = false, value = {"submitList"})
    public static final void recycleviewdataBinding(@NotNull RecyclerView recyclerView, @Nullable List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getAdapter() == null || list == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.join.kotlin.domain.adapter.BaseDataBindingAdapter<kotlin.Any, androidx.databinding.ViewDataBinding>");
        ((BaseDataBindingAdapter) adapter).submitList(list);
    }

    @BindingAdapter(requireAll = false, value = {"xsubmitList", "xadapter", "showStatus", "listener"})
    public static final void xrecycleviewadapterBinding(@NotNull XRecyclerView recyclerView, @NotNull List<? extends Object> xsubmitList, @NotNull BaseDataBindingAdapter<Object, ViewDataBinding> xadapter, @Nullable Integer num, @Nullable XRecyclerView.f fVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(xsubmitList, "xsubmitList");
        Intrinsics.checkNotNullParameter(xadapter, "xadapter");
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(xadapter);
        }
        xadapter.submitList(xsubmitList);
        if (fVar != null) {
            recyclerView.setLoadingMoreEnabled(true);
            recyclerView.setLoadingListener(fVar);
        }
        if (num != null && num.intValue() == 1) {
            recyclerView.reset();
        } else if (num != null && num.intValue() == 3) {
            recyclerView.refreshComplete();
        } else if (num != null && num.intValue() == 4) {
            recyclerView.setNoMore();
        } else if (num != null && num.intValue() == 2) {
            recyclerView.loadMoreComplete();
        } else {
            recyclerView.reset();
        }
    }
}
