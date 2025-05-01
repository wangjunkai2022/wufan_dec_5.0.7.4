package com.dingmouren.layoutmanagergroup.viewpager;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class ViewPagerLayoutManager extends LinearLayoutManager {

    /* renamed from: f  reason: collision with root package name */
    private static final String f10209f = "ViewPagerLayoutManager";

    /* renamed from: a  reason: collision with root package name */
    private PagerSnapHelper f10210a;

    /* renamed from: b  reason: collision with root package name */
    private com.dingmouren.layoutmanagergroup.viewpager.a f10211b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f10212c;

    /* renamed from: d  reason: collision with root package name */
    private int f10213d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView.OnChildAttachStateChangeListener f10214e;

    /* loaded from: classes2.dex */
    class a implements RecyclerView.OnChildAttachStateChangeListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            if (ViewPagerLayoutManager.this.f10211b == null || ViewPagerLayoutManager.this.getChildCount() != 1) {
                return;
            }
            ViewPagerLayoutManager.this.f10211b.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            if (ViewPagerLayoutManager.this.f10213d >= 0) {
                if (ViewPagerLayoutManager.this.f10211b != null) {
                    ViewPagerLayoutManager.this.f10211b.a(true, ViewPagerLayoutManager.this.getPosition(view));
                }
            } else if (ViewPagerLayoutManager.this.f10211b != null) {
                ViewPagerLayoutManager.this.f10211b.a(false, ViewPagerLayoutManager.this.getPosition(view));
            }
        }
    }

    public ViewPagerLayoutManager(Context context, int i4) {
        super(context, i4, false);
        this.f10214e = new a();
        c();
    }

    private void c() {
        this.f10210a = new PagerSnapHelper();
    }

    public void d(com.dingmouren.layoutmanagergroup.viewpager.a aVar) {
        this.f10211b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f10210a.attachToRecyclerView(recyclerView);
        this.f10212c = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(this.f10214e);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i4) {
        if (i4 == 0) {
            int position = getPosition(this.f10210a.findSnapView(this));
            if (this.f10211b == null || getChildCount() != 1) {
                return;
            }
            this.f10211b.c(position, position == getItemCount() - 1);
        } else if (i4 == 1) {
            getPosition(this.f10210a.findSnapView(this));
        } else if (i4 != 2) {
        } else {
            getPosition(this.f10210a.findSnapView(this));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.f10213d = i4;
        return super.scrollHorizontallyBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.f10213d = i4;
        return super.scrollVerticallyBy(i4, recycler, state);
    }

    public ViewPagerLayoutManager(Context context, int i4, boolean z4) {
        super(context, i4, z4);
        this.f10214e = new a();
        c();
    }
}
