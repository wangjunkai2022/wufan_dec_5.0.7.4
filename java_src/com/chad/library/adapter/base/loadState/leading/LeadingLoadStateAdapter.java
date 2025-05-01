package com.chad.library.adapter.base.loadState.leading;

import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.chad.library.adapter.base.loadState.LoadStateAdapter;
import com.chad.library.adapter.base.loadState.b;
import com.chad.library.adapter.base.loadState.leading.LeadingLoadStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LeadingLoadStateAdapter.kt */
/* loaded from: classes2.dex */
public abstract class LeadingLoadStateAdapter<VH extends RecyclerView.ViewHolder> extends LoadStateAdapter<VH> {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private a f9078c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9079d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f9080e;

    /* compiled from: LeadingLoadStateAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: LeadingLoadStateAdapter.kt */
        /* renamed from: com.chad.library.adapter.base.loadState.leading.LeadingLoadStateAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0233a {
            public static boolean a(@NotNull a aVar) {
                return true;
            }
        }

        boolean a();

        void b();
    }

    private final void m() {
        RecyclerView recyclerView;
        if (this.f9079d) {
            a aVar = this.f9078c;
            boolean z4 = false;
            if (aVar != null && !aVar.a()) {
                z4 = true;
            }
            if (z4 || !(b() instanceof b.d) || b().a() || (recyclerView = getRecyclerView()) == null) {
                return;
            }
            if (recyclerView.isComputingLayout()) {
                recyclerView.post(new Runnable() { // from class: y.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        LeadingLoadStateAdapter.n(LeadingLoadStateAdapter.this);
                    }
                });
            } else {
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LeadingLoadStateAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k();
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    public boolean a(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return loadState instanceof b.C0232b;
    }

    public final void h(int i4) {
        if (i4 >= 0 && i4 <= this.f9080e) {
            m();
        }
    }

    @Nullable
    public final a i() {
        return this.f9078c;
    }

    public final int j() {
        return this.f9080e;
    }

    public final void k() {
        f(b.C0232b.f9072b);
        a aVar = this.f9078c;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean l() {
        return this.f9079d;
    }

    public final void o(boolean z4) {
        this.f9079d = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewAttachedToWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m();
    }

    @NotNull
    public final LeadingLoadStateAdapter<VH> p(@Nullable a aVar) {
        this.f9078c = aVar;
        return this;
    }

    public final void q(int i4) {
        this.f9080e = i4;
    }

    @NotNull
    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            LeadingLoadStateAdapter ->\n            [isLoadEnable: " + this.f9079d + "],\n            [preloadSize: " + this.f9080e + "],\n            [loadState: " + b() + "]\n        ");
        return trimIndent;
    }
}
