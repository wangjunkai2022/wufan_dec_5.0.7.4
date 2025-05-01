package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes4.dex */
public class DividerGridItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f46841a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f46842b;

    public DividerGridItemDecoration(Context context) {
        int[] iArr = {16843284};
        this.f46841a = iArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        this.f46842b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private int a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return -1;
    }

    private boolean b(RecyclerView recyclerView, int i4, int i5, int i6) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (i4 + 1) % i5 == 0;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? (i4 + 1) % i5 == 0 : i4 >= i6 - (i6 % i5);
        } else {
            return false;
        }
    }

    private boolean c(RecyclerView recyclerView, int i4, int i5, int i6) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return i4 >= i6 - (i6 % i5);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? i4 >= i6 - (i6 % i5) : (i4 + 1) % i5 == 0;
        } else {
            return false;
        }
    }

    public void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            this.f46842b.setBounds(childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, bottom, childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.f46842b.getIntrinsicWidth(), this.f46842b.getIntrinsicHeight() + bottom);
            this.f46842b.draw(canvas);
        }
    }

    public void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            this.f46842b.setBounds(right, top, this.f46842b.getIntrinsicWidth() + right, bottom);
            this.f46842b.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, int i4, RecyclerView recyclerView) {
        int a5 = a(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (c(recyclerView, i4, a5, itemCount)) {
            rect.set(0, 0, this.f46842b.getIntrinsicWidth(), 0);
        } else if (b(recyclerView, i4, a5, itemCount)) {
            rect.set(0, 0, 0, this.f46842b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f46842b.getIntrinsicWidth(), this.f46842b.getIntrinsicHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        drawHorizontal(canvas, recyclerView);
        drawVertical(canvas, recyclerView);
    }
}
