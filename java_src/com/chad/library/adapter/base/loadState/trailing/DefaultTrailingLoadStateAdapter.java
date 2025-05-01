package com.chad.library.adapter.base.loadState.trailing;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.loadState.b;
import com.chad.library.adapter.base.loadState.trailing.DefaultTrailingLoadStateAdapter;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DefaultTrailingLoadStateAdapter.kt */
/* loaded from: classes2.dex */
public final class DefaultTrailingLoadStateAdapter extends TrailingLoadStateAdapter<TrailingLoadStateVH> {
    public DefaultTrailingLoadStateAdapter() {
        this(false, 1, null);
    }

    public DefaultTrailingLoadStateAdapter(boolean z4) {
        super(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DefaultTrailingLoadStateAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DefaultTrailingLoadStateAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q();
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    /* renamed from: B */
    public void d(@NotNull TrailingLoadStateVH holder, @NotNull b loadState) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (loadState instanceof b.d) {
            if (loadState.a()) {
                holder.a().setVisibility(8);
                holder.d().setVisibility(8);
                holder.c().setVisibility(8);
                holder.b().setVisibility(0);
                return;
            }
            holder.a().setVisibility(0);
            holder.d().setVisibility(8);
            holder.c().setVisibility(8);
            holder.b().setVisibility(8);
        } else if (loadState instanceof b.C0232b) {
            holder.a().setVisibility(8);
            holder.d().setVisibility(0);
            holder.c().setVisibility(8);
            holder.b().setVisibility(8);
        } else if (loadState instanceof b.a) {
            holder.a().setVisibility(8);
            holder.d().setVisibility(8);
            holder.c().setVisibility(0);
            holder.b().setVisibility(8);
        } else if (loadState instanceof b.c) {
            holder.a().setVisibility(8);
            holder.d().setVisibility(8);
            holder.c().setVisibility(8);
            holder.b().setVisibility(8);
        }
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    @NotNull
    /* renamed from: C */
    public TrailingLoadStateVH e(@NotNull ViewGroup parent, @NotNull b loadState) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        TrailingLoadStateVH trailingLoadStateVH = new TrailingLoadStateVH(parent, null, 2, null);
        trailingLoadStateVH.c().setOnClickListener(new View.OnClickListener() { // from class: z.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultTrailingLoadStateAdapter.D(DefaultTrailingLoadStateAdapter.this, view);
            }
        });
        trailingLoadStateVH.a().setOnClickListener(new View.OnClickListener() { // from class: z.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultTrailingLoadStateAdapter.E(DefaultTrailingLoadStateAdapter.this, view);
            }
        });
        return trailingLoadStateVH;
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    public int c(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return R.layout.brvah_trailing_load_more;
    }

    /* compiled from: DefaultTrailingLoadStateAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class TrailingLoadStateVH extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final View f9081a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final View f9082b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        private final View f9083c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final View f9084d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ TrailingLoadStateVH(android.view.ViewGroup r1, android.view.View r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r3 = r3 & 2
                if (r3 == 0) goto L19
                android.content.Context r2 = r1.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r3 = 2131493093(0x7f0c00e5, float:1.8609656E38)
                r4 = 0
                android.view.View r2 = r2.inflate(r3, r1, r4)
                java.lang.String r3 = "from(parent.context).inf…load_more, parent, false)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            L19:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.loadState.trailing.DefaultTrailingLoadStateAdapter.TrailingLoadStateVH.<init>(android.view.ViewGroup, android.view.View, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @NotNull
        public final View a() {
            return this.f9081a;
        }

        @NotNull
        public final View b() {
            return this.f9084d;
        }

        @NotNull
        public final View c() {
            return this.f9083c;
        }

        @NotNull
        public final View d() {
            return this.f9082b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrailingLoadStateVH(@NotNull ViewGroup parent, @NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = this.itemView.findViewById(R.id.load_more_load_complete_view);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.…_more_load_complete_view)");
            this.f9081a = findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.load_more_loading_view);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.load_more_loading_view)");
            this.f9082b = findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.load_more_load_fail_view);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.…load_more_load_fail_view)");
            this.f9083c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.load_more_load_end_view);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.….load_more_load_end_view)");
            this.f9084d = findViewById4;
        }
    }

    public /* synthetic */ DefaultTrailingLoadStateAdapter(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z4);
    }
}
