package com.chad.library.adapter.base;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseDifferAdapter.kt */
/* loaded from: classes2.dex */
public abstract class BaseDifferAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseQuickAdapter<T, VH> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final AsyncListDiffer<T> f8997a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final AsyncListDiffer.ListListener<T> f8998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDifferAdapter(@NotNull AsyncDifferConfig<T> config, @NotNull List<? extends T> items) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(items, "items");
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.f8997a = asyncListDiffer;
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener() { // from class: com.chad.library.adapter.base.a
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public final void onCurrentListChanged(List list, List list2) {
                BaseDifferAdapter.f(BaseDifferAdapter.this, list, list2);
            }
        };
        this.f8998b = listListener;
        asyncListDiffer.addListListener(listListener);
        asyncListDiffer.submitList(items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BaseDifferAdapter this$0, List previousList, List currentList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        boolean displayEmptyView = this$0.displayEmptyView(previousList);
        boolean displayEmptyView2 = this$0.displayEmptyView(currentList);
        if (displayEmptyView && !displayEmptyView2) {
            this$0.notifyItemRemoved(0);
            this$0.getRecyclerView().scrollToPosition(0);
        } else if (displayEmptyView2 && !displayEmptyView) {
            this$0.notifyItemInserted(0);
        } else if (displayEmptyView && displayEmptyView2) {
            this$0.notifyItemChanged(0, 0);
        }
        this$0.onCurrentListChanged(previousList, currentList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(T t4) {
        List<? extends T> mutableList;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
        mutableList.add(t4);
        submitList(mutableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(@NotNull Collection<? extends T> collection) {
        List<? extends T> mutableList;
        Intrinsics.checkNotNullParameter(collection, "collection");
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
        mutableList.addAll(collection);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public final List<T> getItems() {
        List<T> currentList = this.f8997a.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "mDiffer.currentList");
        return currentList;
    }

    public void onCurrentListChanged(@NotNull List<? extends T> previousList, @NotNull List<? extends T> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(T t4) {
        List<? extends T> mutableList;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
        mutableList.remove(t4);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int i4) {
        List<? extends T> mutableList;
        if (i4 < getItems().size()) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
            mutableList.remove(i4);
            submitList(mutableList);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void set(int i4, T t4) {
        List<? extends T> mutableList;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
        mutableList.set(i4, t4);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void setItems(@NotNull List<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8997a.submitList(value);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void submitList(@Nullable List<? extends T> list) {
        this.f8997a.submitList(list, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void swap(int i4, int i5) {
        List<? extends T> mutableList;
        int size = getItems().size();
        boolean z4 = true;
        if (!(i4 >= 0 && i4 < size)) {
            if (!((i5 < 0 || i5 >= size) ? false : false)) {
                return;
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
        Collections.swap(mutableList, i4, i5);
        submitList(mutableList);
    }

    public final void submitList(@Nullable List<? extends T> list, @Nullable Runnable runnable) {
        this.f8997a.submitList(list, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(int i4, T t4) {
        List<? extends T> mutableList;
        if (i4 <= getItems().size() && i4 >= 0) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
            mutableList.add(i4, t4);
            submitList(mutableList);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(int i4, @NotNull Collection<? extends T> collection) {
        List<? extends T> mutableList;
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (i4 <= getItems().size() && i4 >= 0) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
            mutableList.addAll(i4, collection);
            submitList(mutableList);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseDifferAdapter(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseDifferAdapter.<init>(androidx.recyclerview.widget.DiffUtil$ItemCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseDifferAdapter(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r2, @org.jetbrains.annotations.NotNull java.util.List<? extends T> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.recyclerview.widget.AsyncDifferConfig$Builder r0 = new androidx.recyclerview.widget.AsyncDifferConfig$Builder
            r0.<init>(r2)
            androidx.recyclerview.widget.AsyncDifferConfig r2 = r0.build()
            java.lang.String r0 = "Builder(diffCallback).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseDifferAdapter.<init>(androidx.recyclerview.widget.DiffUtil$ItemCallback, java.util.List):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseDifferAdapter(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.AsyncDifferConfig<T> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseDifferAdapter.<init>(androidx.recyclerview.widget.AsyncDifferConfig):void");
    }
}
