package com.dingmouren.layoutmanagergroup.picker;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class PickerLayoutManager extends LinearLayoutManager {

    /* renamed from: j  reason: collision with root package name */
    private static final String f10173j = "PickerLayoutManager";

    /* renamed from: a  reason: collision with root package name */
    private float f10174a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10175b;

    /* renamed from: c  reason: collision with root package name */
    private LinearSnapHelper f10176c;

    /* renamed from: d  reason: collision with root package name */
    private a f10177d;

    /* renamed from: e  reason: collision with root package name */
    private int f10178e;

    /* renamed from: f  reason: collision with root package name */
    private int f10179f;

    /* renamed from: g  reason: collision with root package name */
    private int f10180g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f10181h;

    /* renamed from: i  reason: collision with root package name */
    private int f10182i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(View view, int i4);
    }

    public PickerLayoutManager(Context context, int i4, boolean z4) {
        super(context, i4, z4);
        this.f10174a = 0.5f;
        this.f10175b = true;
        this.f10180g = -1;
        this.f10176c = new LinearSnapHelper();
        this.f10182i = i4;
    }

    private void c() {
        float width = getWidth() / 2.0f;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            float min = ((((1.0f - this.f10174a) * (-1.0f)) * Math.min(width, Math.abs(width - ((getDecoratedLeft(childAt) + getDecoratedRight(childAt)) / 2.0f)))) / width) + 1.0f;
            childAt.setScaleX(min);
            childAt.setScaleY(min);
            if (this.f10175b) {
                childAt.setAlpha(min);
            }
        }
    }

    private void d() {
        float height = getHeight() / 2.0f;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            float min = ((((1.0f - this.f10174a) * (-1.0f)) * Math.min(height, Math.abs(height - ((getDecoratedTop(childAt) + getDecoratedBottom(childAt)) / 2.0f)))) / height) + 1.0f;
            childAt.setScaleX(min);
            childAt.setScaleY(min);
            if (this.f10175b) {
                childAt.setAlpha(min);
            }
        }
    }

    public void e(a aVar) {
        this.f10177d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f10176c.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        if (getItemCount() < 0 || state.isPreLayout()) {
            return;
        }
        int i4 = this.f10182i;
        if (i4 == 0) {
            c();
        } else if (i4 == 1) {
            d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i4, int i5) {
        if (getItemCount() != 0 && this.f10180g != 0) {
            View viewForPosition = recycler.getViewForPosition(0);
            measureChildWithMargins(viewForPosition, i4, i5);
            this.f10178e = viewForPosition.getMeasuredWidth();
            int measuredHeight = viewForPosition.getMeasuredHeight();
            this.f10179f = measuredHeight;
            int i6 = this.f10182i;
            if (i6 == 0) {
                int i7 = ((this.f10180g - 1) / 2) * this.f10178e;
                this.f10181h.setClipToPadding(false);
                this.f10181h.setPadding(i7, 0, i7, 0);
                setMeasuredDimension(this.f10178e * this.f10180g, this.f10179f);
                return;
            } else if (i6 == 1) {
                int i8 = ((this.f10180g - 1) / 2) * measuredHeight;
                this.f10181h.setClipToPadding(false);
                this.f10181h.setPadding(0, i8, 0, i8);
                setMeasuredDimension(this.f10178e, this.f10179f * this.f10180g);
                return;
            } else {
                return;
            }
        }
        super.onMeasure(recycler, state, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i4) {
        LinearSnapHelper linearSnapHelper;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.f10177d == null || (linearSnapHelper = this.f10176c) == null) {
            return;
        }
        View findSnapView = linearSnapHelper.findSnapView(this);
        this.f10177d.a(findSnapView, getPosition(findSnapView));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        c();
        return super.scrollHorizontallyBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        d();
        return super.scrollVerticallyBy(i4, recycler, state);
    }

    public PickerLayoutManager(Context context, RecyclerView recyclerView, int i4, boolean z4, int i5, float f5, boolean z5) {
        super(context, i4, z4);
        this.f10174a = 0.5f;
        this.f10175b = true;
        this.f10180g = -1;
        this.f10176c = new LinearSnapHelper();
        this.f10180g = i5;
        this.f10182i = i4;
        this.f10181h = recyclerView;
        this.f10175b = z5;
        this.f10174a = f5;
        if (i5 != 0) {
            setAutoMeasureEnabled(false);
        }
    }
}
