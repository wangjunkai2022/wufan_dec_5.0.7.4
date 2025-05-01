package com.join.kotlin.base.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseMultiItemAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.kotlin.base.ext.ViewBindUtilKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OnMultiItemAdapterListenerImpl.kt */
/* loaded from: classes3.dex */
public abstract class OnMultiItemAdapterListenerImpl<T, V extends ViewDataBinding> implements BaseMultiItemAdapter.b<T, DataBindingHolder<V>> {
    private final int layoutId;

    public OnMultiItemAdapterListenerImpl(int i4) {
        this.layoutId = i4;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public boolean isFullSpanItem(int i4) {
        return BaseMultiItemAdapter.b.a.a(this, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public /* bridge */ /* synthetic */ void onBind(RecyclerView.ViewHolder viewHolder, int i4, Object obj, List list) {
        onBind((DataBindingHolder) ((DataBindingHolder) viewHolder), i4, (int) obj, (List<? extends Object>) list);
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
        return BaseMultiItemAdapter.b.a.c(this, viewHolder);
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        BaseMultiItemAdapter.b.a.d(this, viewHolder);
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        BaseMultiItemAdapter.b.a.e(this, viewHolder);
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        BaseMultiItemAdapter.b.a.f(this, viewHolder);
    }

    public void onBind(@NotNull DataBindingHolder<V> dataBindingHolder, int i4, @Nullable T t4, @NotNull List<? extends Object> list) {
        BaseMultiItemAdapter.b.a.b(this, dataBindingHolder, i4, t4, list);
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
    @NotNull
    public DataBindingHolder<V> onCreate(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewBindUtilKt.generateDataBindingHolder(context, this.layoutId, parent);
    }
}
