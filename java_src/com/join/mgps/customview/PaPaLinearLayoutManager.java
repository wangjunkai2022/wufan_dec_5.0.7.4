package com.join.mgps.customview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes4.dex */
public class PaPaLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: b  reason: collision with root package name */
    private static final String f47526b = "PaPaLinearLayoutManager";

    /* renamed from: a  reason: collision with root package name */
    private int[] f47527a;

    public PaPaLinearLayoutManager(Context context) {
        super(context);
        this.f47527a = new int[2];
    }

    private void a(RecyclerView.Recycler recycler, int i4, int i5, int i6, int[] iArr) {
        try {
            View viewForPosition = recycler.getViewForPosition(i4);
            if (viewForPosition != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
                viewForPosition.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                iArr[0] = viewForPosition.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                iArr[1] = viewForPosition.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                recycler.recycleView(viewForPosition);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < getItemCount(); i8++) {
            a(recycler, i8, View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2), this.f47527a);
            if (getOrientation() == 0) {
                int[] iArr = this.f47527a;
                i7 += iArr[0];
                if (i8 == 0) {
                    i6 = iArr[1];
                }
            } else {
                int[] iArr2 = this.f47527a;
                i6 += iArr2[1];
                if (i8 == 0) {
                    i7 = iArr2[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i7;
        }
        if (mode2 != 1073741824) {
            size2 = i6;
        }
        setMeasuredDimension(size, size2);
    }

    public PaPaLinearLayoutManager(Context context, int i4, boolean z4) {
        super(context, i4, z4);
        this.f47527a = new int[2];
    }
}
