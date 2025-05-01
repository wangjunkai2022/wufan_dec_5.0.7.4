package com.join.kotlin.domain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseDataBindingAdapter.kt */
/* loaded from: classes3.dex */
public abstract class BaseDataBindingAdapter<M, B extends ViewDataBinding> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @Nullable
    private List<? extends M> listDatas;
    @NotNull
    private Context mContext;
    @Nullable
    private OnItemClickListener<M> mOnItemClickListener;
    @Nullable
    private OnItemLongClickListener<M> mOnItemLongClickListener;

    /* compiled from: BaseDataBindingAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class BaseBindingViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseBindingViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    /* compiled from: BaseDataBindingAdapter.kt */
    /* loaded from: classes3.dex */
    public interface OnItemClickListener<M> {
        void onItemClick(int i4, M m4, int i5);
    }

    /* compiled from: BaseDataBindingAdapter.kt */
    /* loaded from: classes3.dex */
    public interface OnItemLongClickListener<M> {
        void onItemLongClick(int i4, M m4, int i5);
    }

    public BaseDataBindingAdapter(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(BaseDataBindingAdapter this$0, RecyclerView.ViewHolder holder, int i4, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        OnItemClickListener<M> onItemClickListener = this$0.mOnItemClickListener;
        if (onItemClickListener == null || onItemClickListener == null) {
            return;
        }
        int id = holder.itemView.getId();
        List<? extends M> list = this$0.listDatas;
        Intrinsics.checkNotNull(list);
        onItemClickListener.onItemClick(id, list.get(i4), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(BaseDataBindingAdapter this$0, RecyclerView.ViewHolder holder, int i4, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        OnItemLongClickListener<M> onItemLongClickListener = this$0.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            if (onItemLongClickListener != null) {
                int id = holder.itemView.getId();
                List<? extends M> list = this$0.listDatas;
                Intrinsics.checkNotNull(list);
                onItemLongClickListener.onItemLongClick(id, list.get(i4), i4);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<? extends M> list = this.listDatas;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            return list.size();
        }
        return 0;
    }

    @LayoutRes
    protected abstract int getLayoutResId(int i4);

    @Nullable
    public final List<M> getListDatas() {
        return (List<? extends M>) this.listDatas;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    protected final OnItemClickListener<M> getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    protected final OnItemLongClickListener<M> getMOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    protected abstract void onBindItem(@NotNull B b5, M m4, @Nullable RecyclerView.ViewHolder viewHolder);

    protected abstract void onBindItemPayloads(@NotNull B b5, M m4, @Nullable RecyclerView.ViewHolder viewHolder);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i4, payloads);
            return;
        }
        ViewDataBinding binding = DataBindingUtil.getBinding(holder.itemView);
        Intrinsics.checkNotNull(binding);
        List<? extends M> list = this.listDatas;
        M m4 = list != null ? list.get(i4) : null;
        Intrinsics.checkNotNull(m4);
        onBindItemPayloads(binding, m4, holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this.mContext), getLayoutResId(i4), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return new BaseBindingViewHolder(root);
    }

    public final void setListDatas(@Nullable List<? extends M> list) {
        this.listDatas = list;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    protected final void setMOnItemClickListener(@Nullable OnItemClickListener<M> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    protected final void setMOnItemLongClickListener(@Nullable OnItemLongClickListener<M> onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public void setOnItemClickListener(@NotNull OnItemClickListener<M> onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(@NotNull OnItemLongClickListener<M> onItemLongClickListener) {
        Intrinsics.checkNotNullParameter(onItemLongClickListener, "onItemLongClickListener");
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public void submitList(@NotNull List<? extends M> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.listDatas = list;
    }

    public void setOnItemClickListener(@NotNull final Function3<? super Integer, ? super M, ? super Integer, Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        this.mOnItemClickListener = new OnItemClickListener<M>() { // from class: com.join.kotlin.domain.adapter.BaseDataBindingAdapter$setOnItemClickListener$1
            @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter.OnItemClickListener
            public void onItemClick(int i4, M m4, int i5) {
                func.invoke(Integer.valueOf(i4), m4, Integer.valueOf(i5));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder holder, final int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewDataBinding binding = DataBindingUtil.getBinding(holder.itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.domain.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseDataBindingAdapter.onBindViewHolder$lambda$0(BaseDataBindingAdapter.this, holder, i4, view);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.join.kotlin.domain.adapter.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean onBindViewHolder$lambda$1;
                onBindViewHolder$lambda$1 = BaseDataBindingAdapter.onBindViewHolder$lambda$1(BaseDataBindingAdapter.this, holder, i4, view);
                return onBindViewHolder$lambda$1;
            }
        });
        Intrinsics.checkNotNull(binding);
        List<? extends M> list = this.listDatas;
        M m4 = list != null ? list.get(i4) : null;
        Intrinsics.checkNotNull(m4);
        onBindItem(binding, m4, holder);
        binding.executePendingBindings();
    }
}
