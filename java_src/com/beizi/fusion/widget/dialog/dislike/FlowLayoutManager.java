package com.beizi.fusion.widget.dialog.dislike;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FlowLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7312e = "FlowLayoutManager";

    /* renamed from: b  reason: collision with root package name */
    protected int f7314b;

    /* renamed from: c  reason: collision with root package name */
    protected int f7315c;

    /* renamed from: f  reason: collision with root package name */
    private int f7317f;

    /* renamed from: g  reason: collision with root package name */
    private int f7318g;

    /* renamed from: h  reason: collision with root package name */
    private int f7319h;

    /* renamed from: i  reason: collision with root package name */
    private int f7320i;

    /* renamed from: a  reason: collision with root package name */
    final FlowLayoutManager f7313a = this;

    /* renamed from: j  reason: collision with root package name */
    private int f7321j = 0;

    /* renamed from: d  reason: collision with root package name */
    protected int f7316d = 0;

    /* renamed from: k  reason: collision with root package name */
    private b f7322k = new b();

    /* renamed from: l  reason: collision with root package name */
    private List<b> f7323l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private SparseArray<Rect> f7324m = new SparseArray<>();

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        int f7325a;

        /* renamed from: b  reason: collision with root package name */
        View f7326b;

        /* renamed from: c  reason: collision with root package name */
        Rect f7327c;

        public a(int i4, View view, Rect rect) {
            this.f7325a = i4;
            this.f7326b = view;
            this.f7327c = rect;
        }

        public void a(Rect rect) {
            this.f7327c = rect;
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        float f7329a;

        /* renamed from: b  reason: collision with root package name */
        float f7330b;

        /* renamed from: c  reason: collision with root package name */
        List<a> f7331c = new ArrayList();

        public b() {
        }

        public void a(float f5) {
            this.f7329a = f5;
        }

        public void b(float f5) {
            this.f7330b = f5;
        }

        public void a(a aVar) {
            this.f7331c.add(aVar);
        }
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout() || getItemCount() == 0) {
            return;
        }
        new Rect(getPaddingLeft(), getPaddingTop() + this.f7321j, getWidth() - getPaddingRight(), this.f7321j + (getHeight() - getPaddingBottom()));
        for (int i4 = 0; i4 < this.f7323l.size(); i4++) {
            b bVar = this.f7323l.get(i4);
            float f5 = bVar.f7329a;
            List<a> list = bVar.f7331c;
            for (int i5 = 0; i5 < list.size(); i5++) {
                View view = list.get(i5).f7326b;
                measureChildWithMargins(view, 0, 0);
                addView(view);
                Rect rect = list.get(i5).f7327c;
                int i6 = rect.left;
                int i7 = rect.top;
                int i8 = this.f7321j;
                layoutDecoratedWithMargins(view, i6, i7 - i8, rect.right, rect.bottom - i8);
            }
        }
    }

    private int b() {
        return (this.f7313a.getHeight() - this.f7313a.getPaddingBottom()) - this.f7313a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.f7316d = 0;
        int i4 = this.f7318g;
        this.f7322k = new b();
        this.f7323l.clear();
        this.f7324m.clear();
        removeAllViews();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            this.f7321j = 0;
        } else if (getChildCount() != 0 || !state.isPreLayout()) {
            detachAndScrapAttachedViews(recycler);
            if (getChildCount() == 0) {
                this.f7314b = getWidth();
                this.f7315c = getHeight();
                this.f7317f = getPaddingLeft();
                this.f7319h = getPaddingRight();
                this.f7318g = getPaddingTop();
                this.f7320i = (this.f7314b - this.f7317f) - this.f7319h;
            }
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < getItemCount(); i7++) {
                View viewForPosition = recycler.getViewForPosition(i7);
                if (8 != viewForPosition.getVisibility()) {
                    measureChildWithMargins(viewForPosition, 0, 0);
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
                    int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
                    int i8 = i5 + decoratedMeasuredWidth;
                    if (i8 <= this.f7320i) {
                        int i9 = this.f7317f + i5;
                        Rect rect = this.f7324m.get(i7);
                        if (rect == null) {
                            rect = new Rect();
                        }
                        rect.set(i9, i4, decoratedMeasuredWidth + i9, i4 + decoratedMeasuredHeight);
                        this.f7324m.put(i7, rect);
                        i6 = Math.max(i6, decoratedMeasuredHeight);
                        this.f7322k.a(new a(decoratedMeasuredHeight, viewForPosition, rect));
                        this.f7322k.a(i4);
                        this.f7322k.b(i6);
                        i5 = i8;
                    } else {
                        a();
                        i4 += i6;
                        this.f7316d += i6;
                        int i10 = this.f7317f;
                        Rect rect2 = this.f7324m.get(i7);
                        if (rect2 == null) {
                            rect2 = new Rect();
                        }
                        rect2.set(i10, i4, i10 + decoratedMeasuredWidth, i4 + decoratedMeasuredHeight);
                        this.f7324m.put(i7, rect2);
                        this.f7322k.a(new a(decoratedMeasuredHeight, viewForPosition, rect2));
                        this.f7322k.a(i4);
                        this.f7322k.b(decoratedMeasuredHeight);
                        i5 = decoratedMeasuredWidth;
                        i6 = decoratedMeasuredHeight;
                    }
                    if (i7 == getItemCount() - 1) {
                        a();
                        this.f7316d += i6;
                    }
                }
            }
            this.f7316d = Math.max(this.f7316d, b());
            a(recycler, state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i5 = this.f7321j;
        if (i5 + i4 < 0) {
            i4 = -i5;
        } else if (i5 + i4 > this.f7316d - b()) {
            i4 = (this.f7316d - b()) - this.f7321j;
        }
        this.f7321j += i4;
        offsetChildrenVertical(-i4);
        a(recycler, state);
        return i4;
    }

    private void a() {
        List<a> list = this.f7322k.f7331c;
        for (int i4 = 0; i4 < list.size(); i4++) {
            a aVar = list.get(i4);
            View view = aVar.f7326b;
            int position = getPosition(view);
            b bVar = this.f7322k;
            if (this.f7324m.get(position).top < bVar.f7329a + ((bVar.f7330b - list.get(i4).f7325a) / 2.0f)) {
                Rect rect = this.f7324m.get(position);
                if (rect == null) {
                    rect = new Rect();
                }
                int i5 = this.f7324m.get(position).left;
                b bVar2 = this.f7322k;
                int i6 = (int) (bVar2.f7329a + ((bVar2.f7330b - list.get(i4).f7325a) / 2.0f));
                int i7 = this.f7324m.get(position).right;
                b bVar3 = this.f7322k;
                rect.set(i5, i6, i7, (int) (bVar3.f7329a + ((bVar3.f7330b - list.get(i4).f7325a) / 2.0f) + getDecoratedMeasuredHeight(view)));
                this.f7324m.put(position, rect);
                aVar.a(rect);
                list.set(i4, aVar);
            }
        }
        b bVar4 = this.f7322k;
        bVar4.f7331c = list;
        this.f7323l.add(bVar4);
        this.f7322k = new b();
    }
}
