package com.chad.library.adapter.base.loadState.leading;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.loadState.b;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DefaultLeadingLoadStateAdapter.kt */
/* loaded from: classes2.dex */
public final class DefaultLeadingLoadStateAdapter extends LeadingLoadStateAdapter<LeadingLoadStateVH> {
    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    public int c(@NotNull b loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return R.layout.brvah_leading_load_more;
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    /* renamed from: r */
    public void d(@NotNull LeadingLoadStateVH holder, @NotNull b loadState) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (loadState instanceof b.C0232b) {
            holder.a().setVisibility(0);
        } else {
            holder.a().setVisibility(8);
        }
    }

    @Override // com.chad.library.adapter.base.loadState.LoadStateAdapter
    @NotNull
    /* renamed from: s */
    public LeadingLoadStateVH e(@NotNull ViewGroup parent, @NotNull b loadState) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return new LeadingLoadStateVH(parent, null, 2, null);
    }

    /* compiled from: DefaultLeadingLoadStateAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class LeadingLoadStateVH extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final View f9077a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ LeadingLoadStateVH(android.view.ViewGroup r1, android.view.View r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r3 = r3 & 2
                if (r3 == 0) goto L19
                android.content.Context r2 = r1.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r3 = 2131493090(0x7f0c00e2, float:1.860965E38)
                r4 = 0
                android.view.View r2 = r2.inflate(r3, r1, r4)
                java.lang.String r3 = "from(parent.context)\n   …load_more, parent, false)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            L19:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.loadState.leading.DefaultLeadingLoadStateAdapter.LeadingLoadStateVH.<init>(android.view.ViewGroup, android.view.View, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @NotNull
        public final View a() {
            return this.f9077a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeadingLoadStateVH(@NotNull ViewGroup parent, @NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = this.itemView.findViewById(R.id.loading_progress);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.loading_progress)");
            this.f9077a = findViewById;
        }
    }
}
