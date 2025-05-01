package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes4.dex */
public class DrawableDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f46938a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f46939b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46940c;

    public DrawableDividerItemDecoration(Context context, AttributeSet attributeSet) {
        this.f46939b = false;
        this.f46940c = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843284});
        this.f46938a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private int a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        }
        throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
    }

    private boolean b(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getReverseLayout();
        }
        throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f46938a != null && recyclerView.getChildPosition(view) >= 1) {
            if (a(recyclerView) == 1) {
                rect.top = this.f46938a.getIntrinsicHeight();
            } else {
                rect.left = this.f46938a.getIntrinsicWidth();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingTop;
        int i4;
        int height;
        int i5;
        if (this.f46938a == null) {
            super.onDrawOver(canvas, recyclerView, state);
            return;
        }
        int a5 = a(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        if (a5 == 1) {
            int intrinsicHeight = this.f46938a.getIntrinsicHeight();
            int paddingLeft = recyclerView.getPaddingLeft();
            i5 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            i4 = intrinsicHeight;
            i6 = paddingLeft;
            height = 0;
            paddingTop = 0;
        } else {
            int intrinsicWidth = this.f46938a.getIntrinsicWidth();
            paddingTop = recyclerView.getPaddingTop();
            i4 = intrinsicWidth;
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            i5 = 0;
        }
        for (int i7 = !this.f46939b ? 1 : 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (a5 == 1) {
                if (b(recyclerView)) {
                    height = childAt.getBottom() - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    paddingTop = height - i4;
                } else {
                    int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    paddingTop = top;
                    height = top + i4;
                }
            } else if (b(recyclerView)) {
                int right = childAt.getRight() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                i5 = right;
                i6 = right - i4;
            } else {
                i6 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                i5 = i6 + i4;
            }
            this.f46938a.setBounds(i6, paddingTop, i5, height);
            this.f46938a.draw(canvas);
        }
        if (!this.f46940c || childCount <= 0) {
            return;
        }
        View childAt2 = recyclerView.getChildAt(childCount - 1);
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
        if (a5 == 1) {
            paddingTop = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            height = paddingTop + i4;
        } else {
            i6 = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            i5 = i6 + i4;
        }
        this.f46938a.setBounds(i6, paddingTop, i5, height);
        this.f46938a.draw(canvas);
    }

    public DrawableDividerItemDecoration(Context context, AttributeSet attributeSet, boolean z4, boolean z5) {
        this(context, attributeSet);
        this.f46939b = z4;
        this.f46940c = z5;
    }

    public DrawableDividerItemDecoration(Drawable drawable) {
        this.f46939b = false;
        this.f46940c = false;
        this.f46938a = drawable;
    }

    public DrawableDividerItemDecoration(Drawable drawable, boolean z4, boolean z5) {
        this(drawable);
        this.f46939b = z4;
        this.f46940c = z5;
    }
}
