package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseMultiItemAdapter.kt */
/* loaded from: classes2.dex */
public abstract class BaseMultiItemAdapter<T> extends BaseQuickAdapter<T, RecyclerView.ViewHolder> {
    @Nullable
    private a<T> onItemViewTypeListener;
    @NotNull
    private final SparseArray<b<T, RecyclerView.ViewHolder>> typeViewHolders;

    /* compiled from: BaseMultiItemAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a<T> {
        int onItemViewType(int i4, @NotNull List<? extends T> list);
    }

    /* compiled from: BaseMultiItemAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b<T, V extends RecyclerView.ViewHolder> {

        /* compiled from: BaseMultiItemAdapter.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static <T, V extends RecyclerView.ViewHolder> boolean a(@NotNull b<T, V> bVar, int i4) {
                return false;
            }

            public static <T, V extends RecyclerView.ViewHolder> void b(@NotNull b<T, V> bVar, @NotNull V holder, int i4, @Nullable T t4, @NotNull List<? extends Object> payloads) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(payloads, "payloads");
                bVar.onBind(holder, i4, t4);
            }

            public static <T, V extends RecyclerView.ViewHolder> boolean c(@NotNull b<T, V> bVar, @NotNull RecyclerView.ViewHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                return false;
            }

            public static <T, V extends RecyclerView.ViewHolder> void d(@NotNull b<T, V> bVar, @NotNull RecyclerView.ViewHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }

            public static <T, V extends RecyclerView.ViewHolder> void e(@NotNull b<T, V> bVar, @NotNull RecyclerView.ViewHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }

            public static <T, V extends RecyclerView.ViewHolder> void f(@NotNull b<T, V> bVar, @NotNull RecyclerView.ViewHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }
        }

        boolean isFullSpanItem(int i4);

        void onBind(@NotNull V v2, int i4, @Nullable T t4);

        void onBind(@NotNull V v2, int i4, @Nullable T t4, @NotNull List<? extends Object> list);

        @NotNull
        V onCreate(@NotNull Context context, @NotNull ViewGroup viewGroup, int i4);

        boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder);

        void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder);

        void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder);

        void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder);
    }

    public BaseMultiItemAdapter() {
        this(null, 1, null);
    }

    public /* synthetic */ BaseMultiItemAdapter(List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ArrayList() : list);
    }

    public final /* synthetic */ <V extends RecyclerView.ViewHolder> BaseMultiItemAdapter<T> addItemType(int i4, b<T, V> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.reifiedOperationMarker(4, "V");
        return addItemType(i4, RecyclerView.ViewHolder.class, listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemViewType(int i4, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        a<T> aVar = this.onItemViewTypeListener;
        return aVar != null ? aVar.onItemViewType(i4, list) : super.getItemViewType(i4, list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFullSpanItem(int i4) {
        if (!super.isFullSpanItem(i4)) {
            b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(i4);
            if (!(bVar != null && bVar.isFullSpanItem(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(i4, getItems()));
        if (bVar != null) {
            bVar.onBind(holder, i4, t4);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    protected RecyclerView.ViewHolder onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(i4);
        if (bVar != null) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            return bVar.onCreate(context2, parent, i4);
        }
        throw new IllegalArgumentException("ViewType: " + i4 + " not found onViewHolderListener，please use addItemType() first!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(holder.getBindingAdapterPosition(), getItems()));
        return bVar != null ? bVar.onFailedToRecycleView(holder) : super.onFailedToRecycleView(holder);
    }

    @NotNull
    public final BaseMultiItemAdapter<T> onItemViewType(@Nullable a<T> aVar) {
        this.onItemViewTypeListener = aVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(holder.getBindingAdapterPosition(), getItems()));
        if (bVar != null) {
            bVar.onViewAttachedToWindow(holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(holder.getBindingAdapterPosition(), getItems()));
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(holder.getBindingAdapterPosition(), getItems()));
        if (bVar != null) {
            bVar.onViewRecycled(holder);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMultiItemAdapter(@NotNull List<? extends T> items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        this.typeViewHolders = new SparseArray<>(1);
    }

    @NotNull
    public final <V extends RecyclerView.ViewHolder> BaseMultiItemAdapter<T> addItemType(int i4, @NotNull Class<V> holderClazz, @NotNull b<T, V> listener) {
        Intrinsics.checkNotNullParameter(holderClazz, "holderClazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.typeViewHolders.put(i4, listener);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @Nullable T t4, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i4, (int) t4);
            return;
        }
        b<T, RecyclerView.ViewHolder> bVar = this.typeViewHolders.get(getItemViewType(i4, getItems()));
        if (bVar != null) {
            bVar.onBind(holder, i4, t4);
        }
    }
}
