package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
/* loaded from: classes4.dex */
public class NoScrollListView extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47486b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47487c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            if (i4 == 0) {
                View childAt = NoScrollListView.this.getChildAt(0);
                if (childAt == null || childAt.getTop() != 0) {
                    NoScrollListView.this.f47487c = false;
                } else {
                    NoScrollListView.this.f47487c = true;
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    public NoScrollListView(Context context) {
        super(context);
        this.f47486b = false;
    }

    private void b() {
        setOnScrollListener(new a());
    }

    public boolean c() {
        return this.f47486b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < adapter.getCount(); i5++) {
            View view = adapter.getView(i5, null, listView);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            StringBuilder sb = new StringBuilder();
            sb.append("height   ");
            sb.append(view.getMeasuredHeight());
            sb.append("  ");
            i4 += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i4 + (listView.getDividerHeight() * (adapter.getCount() - 1)) + (adapter.getCount() * 10);
        listView.setLayoutParams(layoutParams);
    }

    public void setmPullRequesting(boolean z4) {
        this.f47486b = z4;
    }

    public NoScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47486b = false;
        b();
    }

    public NoScrollListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47486b = false;
        b();
    }
}
