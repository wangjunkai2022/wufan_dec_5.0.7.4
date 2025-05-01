package com.chad.library.adapter.base.loadState.trailing;

import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.loadState.LoadStateAdapter;
import com.chad.library.adapter.base.loadState.b;
import com.chad.library.adapter.base.loadState.trailing.TrailingLoadStateAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TrailingLoadStateAdapter.kt */
/* loaded from: classes2.dex */
public abstract class TrailingLoadStateAdapter<VH extends RecyclerView.ViewHolder> extends LoadStateAdapter<VH> {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9085c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private a f9086d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9087e;

    /* renamed from: f  reason: collision with root package name */
    private int f9088f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9089g;

    /* compiled from: TrailingLoadStateAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: TrailingLoadStateAdapter.kt */
        /* renamed from: com.chad.library.adapter.base.loadState.trailing.TrailingLoadStateAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0234a {
            public static boolean a(@NotNull a aVar) {
                return true;
            }
        }

        boolean a();

        void b();

        void c();
    }

    public TrailingLoadStateAdapter() {
        this(false, 1, null);
    }

    public /* synthetic */ TrailingLoadStateAdapter(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z4);
    }

    private final int getTheBiggestNumber(int[] iArr) {
        int i4 = -1;
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                for (int i5 : iArr) {
                    if (i5 > i4) {
                        i4 = i5;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TrailingLoadStateAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.s()) {
            this$0.f9089g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(RecyclerView.LayoutManager manager, TrailingLoadStateAdapter this$0, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(manager, "$manager");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) manager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
        int theBiggestNumber = this$0.getTheBiggestNumber(iArr) + 1;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z4 = false;
        if (adapter != null && theBiggestNumber == adapter.getItemCount()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        this$0.f9089g = true;
    }

    private final boolean s() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return true;
        }
        RecyclerView recyclerView2 = getRecyclerView();
        RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        return (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == adapter.getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    private final void u() {
        RecyclerView recyclerView;
        if (this.f9087e) {
            a aVar = this.f9086d;
            boolean z4 = false;
            if (aVar != null && !aVar.a()) {
                z4 = true;
            }
            if (z4 || !this.f9089g || !(b() instanceof b.d) || b().a() || (recyclerView = getRecyclerView()) == null) {
                return;
            }
            if (recyclerView.isComputingLayout()) {
                recyclerView.post(new Runnable() { // from class: z.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrailingLoadStateAdapter.v(TrailingLoadStateAdapter.this);
                    }
                });
            } else {
                q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TrailingLoadStateAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q();
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    public boolean a(@NotNull b loadState) {
        boolean z4;
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return super.a(loadState) || (((z4 = loadState instanceof b.d)) && !loadState.a()) || (this.f9085c && z4 && loadState.a());
    }

    public final void j() {
        final RecyclerView.LayoutManager layoutManager;
        this.f9089g = false;
        final RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerView.post(new Runnable() { // from class: z.e
                @Override // java.lang.Runnable
                public final void run() {
                    TrailingLoadStateAdapter.k(TrailingLoadStateAdapter.this);
                }
            });
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerView.post(new Runnable() { // from class: z.c
                @Override // java.lang.Runnable
                public final void run() {
                    TrailingLoadStateAdapter.l(RecyclerView.LayoutManager.this, this, recyclerView);
                }
            });
        }
    }

    public final void m(int i4, int i5) {
        if (i5 <= i4 - 1 && (i4 - i5) - 1 <= this.f9088f) {
            u();
        }
    }

    @Nullable
    public final a n() {
        return this.f9086d;
    }

    public final int o() {
        return this.f9088f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewAttachedToWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        u();
    }

    public final void p() {
        f(b.C0232b.f9072b);
        a aVar = this.f9086d;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void q() {
        f(b.C0232b.f9072b);
        a aVar = this.f9086d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean r() {
        return this.f9087e;
    }

    public final boolean t() {
        return this.f9085c;
    }

    @NotNull
    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: " + this.f9085c + "],\n            [isAutoLoadMore: " + this.f9087e + "],\n            [preloadSize: " + this.f9088f + "],\n            [loadState: " + b() + "]\n        ");
        return trimIndent;
    }

    public final void w(boolean z4) {
        this.f9087e = z4;
    }

    @NotNull
    public final TrailingLoadStateAdapter<VH> x(@Nullable a aVar) {
        this.f9086d = aVar;
        return this;
    }

    public final void y(int i4) {
        this.f9088f = i4;
    }

    public TrailingLoadStateAdapter(boolean z4) {
        this.f9085c = z4;
        this.f9087e = true;
        this.f9089g = true;
    }
}
