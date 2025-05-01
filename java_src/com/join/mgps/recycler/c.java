package com.join.mgps.recycler;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.mgps.Util.w0;
/* compiled from: RecyclerViewItemPositionGetter.java */
/* loaded from: classes4.dex */
public class c implements com.join.mgps.recycler.a {

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f54023c = true;

    /* renamed from: d  reason: collision with root package name */
    private static final String f54024d = "c";

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f54025a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f54026b;

    /* compiled from: RecyclerViewItemPositionGetter.java */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f54027b = true;

        public a() {
        }
    }

    public c(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView) {
        this.f54025a = linearLayoutManager;
        this.f54026b = recyclerView;
    }

    @Override // com.join.mgps.recycler.a
    public int a() {
        String str = f54024d;
        w0.f(str, "getFirstVisiblePosition, findFirstVisibleItemPosition " + this.f54025a.findFirstVisibleItemPosition());
        return this.f54025a.findFirstVisibleItemPosition();
    }

    @Override // com.join.mgps.recycler.a
    public int b() {
        return this.f54025a.findLastVisibleItemPosition();
    }

    @Override // com.join.mgps.recycler.a
    public View getChildAt(int i4) {
        String str = f54024d;
        w0.f(str, "getChildAt, mRecyclerView.getChildCount " + this.f54026b.getChildCount());
        w0.f(str, "getChildAt, mLayoutManager.getChildCount " + this.f54025a.getChildCount());
        View childAt = this.f54025a.getChildAt(i4);
        w0.f(str, "mRecyclerView getChildAt, position " + i4 + ", view " + childAt);
        w0.f(str, "mLayoutManager getChildAt, position " + i4 + ", view " + this.f54025a.getChildAt(i4));
        return childAt;
    }

    @Override // com.join.mgps.recycler.a
    public int getChildCount() {
        int childCount = this.f54026b.getChildCount();
        String str = f54024d;
        w0.f(str, "getChildCount, mRecyclerView " + childCount);
        w0.f(str, "getChildCount, mLayoutManager " + this.f54025a.getChildCount());
        return childCount;
    }

    @Override // com.join.mgps.recycler.a
    public int indexOfChild(View view) {
        int indexOfChild = this.f54026b.indexOfChild(view);
        String str = f54024d;
        w0.f(str, "indexOfChild, " + indexOfChild);
        return indexOfChild;
    }
}
