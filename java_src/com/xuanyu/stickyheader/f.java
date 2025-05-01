package com.xuanyu.stickyheader;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: StickyHeaderHelper.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<RecyclerView, StickyHeaderOnScrollListener<?>> f68449a = new WeakHashMap<>();

    /* compiled from: StickyHeaderHelper.java */
    /* loaded from: classes6.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f68450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView f68451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f68452d;

        a(ViewGroup viewGroup, RecyclerView recyclerView, int i4) {
            this.f68450b = viewGroup;
            this.f68451c = recyclerView;
            this.f68452d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StickyHeaderOnScrollListener stickyHeaderOnScrollListener = new StickyHeaderOnScrollListener(this.f68451c, this.f68450b, this.f68450b.getTop());
            stickyHeaderOnScrollListener.s(this.f68452d);
            f.f68449a.put(this.f68451c, stickyHeaderOnScrollListener);
            this.f68451c.addOnScrollListener(stickyHeaderOnScrollListener);
        }
    }

    public static <T> void b(RecyclerView recyclerView, int i4, ViewGroup viewGroup) {
        if (f68449a.get(recyclerView) == null) {
            StickyHeaderOnScrollListener<?> stickyHeaderOnScrollListener = new StickyHeaderOnScrollListener<>(recyclerView, viewGroup, i4);
            f68449a.put(recyclerView, stickyHeaderOnScrollListener);
            recyclerView.addOnScrollListener(stickyHeaderOnScrollListener);
        }
    }

    public static <T> void c(RecyclerView recyclerView, ViewGroup viewGroup, int i4) {
        if (f68449a.get(recyclerView) == null) {
            viewGroup.post(new a(viewGroup, recyclerView, i4));
        }
    }

    public static <T> com.xuanyu.stickyheader.a<T> d(e<T> eVar, int i4) {
        T item = eVar.getItem(i4);
        if (item == null || !eVar.a(i4)) {
            return null;
        }
        i.c(item.getClass());
        Class a5 = i.a(item.getClass());
        if (a5 == null) {
            return null;
        }
        com.xuanyu.stickyheader.a<T> aVar = (com.xuanyu.stickyheader.a<T>) g.a(a5);
        if (aVar != null) {
            aVar.setRecyclerViewItemModel(item);
        }
        return aVar;
    }

    public static void e(boolean z4, RecyclerView recyclerView) {
        StickyHeaderOnScrollListener<?> stickyHeaderOnScrollListener = f68449a.get(recyclerView);
        if (stickyHeaderOnScrollListener == null) {
            return;
        }
        stickyHeaderOnScrollListener.x(z4);
    }
}
