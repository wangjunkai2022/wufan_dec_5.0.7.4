package com.chad.library.adapter.base.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuickGridLayoutManager.kt */
/* loaded from: classes2.dex */
public final class QuickGridLayoutManager extends GridLayoutManager {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final a f9064a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView.Adapter<?> f9065b;

    /* compiled from: QuickGridLayoutManager.kt */
    /* loaded from: classes2.dex */
    private final class a extends GridLayoutManager.SpanSizeLookup {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private GridLayoutManager.SpanSizeLookup f9066a;

        public a() {
        }

        @Nullable
        public final GridLayoutManager.SpanSizeLookup a() {
            return this.f9066a;
        }

        public final int b(@Nullable RecyclerView.Adapter<?> adapter, int i4) {
            if (adapter instanceof x.a) {
                return QuickGridLayoutManager.this.getSpanCount();
            }
            if (adapter instanceof BaseQuickAdapter) {
                if (((BaseQuickAdapter) adapter).isFullSpanItem(adapter.getItemViewType(i4))) {
                    return QuickGridLayoutManager.this.getSpanCount();
                }
                GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f9066a;
                if (spanSizeLookup != null) {
                    return spanSizeLookup.getSpanSize(i4);
                }
                return 1;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup2 = this.f9066a;
            if (spanSizeLookup2 != null) {
                return spanSizeLookup2.getSpanSize(i4);
            }
            return 1;
        }

        public final void c(@Nullable GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f9066a = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            RecyclerView.Adapter<?> adapter = QuickGridLayoutManager.this.f9065b;
            if (adapter == null) {
                return 1;
            }
            if (adapter instanceof XQuickRecyclerView.WrapAdapter) {
                return b(((XQuickRecyclerView.WrapAdapter) adapter).getAdapter(), i4);
            }
            return b(adapter, i4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.f9064a = aVar;
        aVar.c(getSpanSizeLookup());
        super.setSpanSizeLookup(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.Adapter<?> adapter2) {
        this.f9065b = adapter2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    public void setSpanSizeLookup(@Nullable GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f9064a.c(spanSizeLookup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, int i4) {
        super(context, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.f9064a = aVar;
        aVar.c(getSpanSizeLookup());
        super.setSpanSizeLookup(aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, int i4, int i5, boolean z4) {
        super(context, i4, i5, z4);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.f9064a = aVar;
        aVar.c(getSpanSizeLookup());
        super.setSpanSizeLookup(aVar);
    }
}
