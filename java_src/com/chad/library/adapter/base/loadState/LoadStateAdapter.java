package com.chad.library.adapter.base.loadState;

import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.chad.library.adapter.base.loadState.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LoadStateAdapter.kt */
/* loaded from: classes2.dex */
public abstract class LoadStateAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements x.a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private b f9068a = b.c.f9073b;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f9069b;

    public boolean a(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return (loadState instanceof b.C0232b) || (loadState instanceof b.a);
    }

    @NotNull
    public final b b() {
        return this.f9068a;
    }

    public int c(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return 0;
    }

    public abstract void d(@NotNull VH vh, @NotNull b bVar);

    @NotNull
    public abstract VH e(@NotNull ViewGroup viewGroup, @NotNull b bVar);

    public final void f(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (Intrinsics.areEqual(this.f9068a, loadState)) {
            return;
        }
        boolean a5 = a(this.f9068a);
        boolean a6 = a(loadState);
        if (a5 && !a6) {
            notifyItemRemoved(0);
        } else if (a6 && !a5) {
            notifyItemInserted(0);
        } else if (a5 && a6) {
            notifyItemChanged(0);
        }
        this.f9068a = loadState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return a(this.f9068a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i4) {
        return c(this.f9068a);
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.f9069b;
    }

    public final boolean isLoading() {
        return Intrinsics.areEqual(this.f9068a, b.C0232b.f9072b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f9069b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull VH holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        d(holder, this.f9068a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final VH onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return e(parent, this.f9068a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f9069b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull VH holder, int i4, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, i4, payloads);
    }
}
