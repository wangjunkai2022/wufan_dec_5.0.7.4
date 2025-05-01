package com.join.mgps.recycler;

import androidx.recyclerview.widget.GridLayoutManager;
/* loaded from: classes4.dex */
public class HeaderSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    private HeaderAndFooterRecyclerViewAdapter f54014a;

    /* renamed from: b  reason: collision with root package name */
    private int f54015b;

    public HeaderSpanSizeLookup(HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter, int i4) {
        this.f54015b = 1;
        this.f54014a = headerAndFooterRecyclerViewAdapter;
        this.f54015b = i4;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanSize(int i4) {
        if (this.f54014a.isHeader(i4) || this.f54014a.isFooter(i4)) {
            return this.f54015b;
        }
        return 1;
    }
}
