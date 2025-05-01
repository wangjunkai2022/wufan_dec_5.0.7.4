package com.chad.library.adapter.base;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseSingleItemAdapter.kt */
/* loaded from: classes2.dex */
public abstract class BaseSingleItemAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseQuickAdapter<T, VH> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private T f8999a;

    public BaseSingleItemAdapter() {
        this(null, 1, null);
    }

    public /* synthetic */ BaseSingleItemAdapter(Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : obj);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(T t4) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        throw new RuntimeException("Please use setItem()");
    }

    @Nullable
    public final T e() {
        return this.f8999a;
    }

    protected abstract void f(@NotNull VH vh, @Nullable T t4);

    public void g(@NotNull VH holder, @Nullable T t4, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        f(holder, t4);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected final int getItemCount(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return 1;
    }

    public final void h(@Nullable T t4) {
        this.f8999a = t4;
        notifyItemChanged(0);
    }

    public final void i(@Nullable T t4, @Nullable Object obj) {
        this.f8999a = t4;
        notifyItemChanged(0, obj);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected final void onBindViewHolder(@NotNull VH holder, int i4, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        f(holder, this.f8999a);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(T t4) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int i4) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void set(int i4, T t4) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void submitList(@Nullable List<? extends T> list) {
        throw new RuntimeException("Please use setItem()");
    }

    public BaseSingleItemAdapter(@Nullable T t4) {
        super(null, 1, null);
        this.f8999a = t4;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(int i4, T t4) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(int i4, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected final void onBindViewHolder(@NotNull VH holder, int i4, @Nullable T t4, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        g(holder, t4, payloads);
    }
}
