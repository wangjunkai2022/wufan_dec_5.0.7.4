package com.join.mgps.base.diff;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.join.mgps.base.BaseQuickAdapter;
/* loaded from: classes4.dex */
public final class BaseQuickAdapterListUpdateCallback implements ListUpdateCallback {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final BaseQuickAdapter f46241b;

    public BaseQuickAdapterListUpdateCallback(@NonNull BaseQuickAdapter baseQuickAdapter) {
        this.f46241b = baseQuickAdapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i4, int i5, @Nullable Object obj) {
        BaseQuickAdapter baseQuickAdapter = this.f46241b;
        baseQuickAdapter.notifyItemRangeChanged(i4 + baseQuickAdapter.getHeaderLayoutCount(), i5, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i4, int i5) {
        BaseQuickAdapter baseQuickAdapter = this.f46241b;
        baseQuickAdapter.notifyItemRangeInserted(i4 + baseQuickAdapter.getHeaderLayoutCount(), i5);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i4, int i5) {
        BaseQuickAdapter baseQuickAdapter = this.f46241b;
        baseQuickAdapter.notifyItemMoved(i4 + baseQuickAdapter.getHeaderLayoutCount(), i5 + this.f46241b.getHeaderLayoutCount());
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i4, int i5) {
        BaseQuickAdapter baseQuickAdapter = this.f46241b;
        baseQuickAdapter.notifyItemRangeRemoved(i4 + baseQuickAdapter.getHeaderLayoutCount(), i5);
    }
}
