package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"DrawAllocation"})
/* loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: g  reason: collision with root package name */
    private static final String f46997g = "FlowLayout";

    /* renamed from: b  reason: collision with root package name */
    private int f46998b;

    /* renamed from: c  reason: collision with root package name */
    private int f46999c;

    /* renamed from: d  reason: collision with root package name */
    private List<List<View>> f47000d;

    /* renamed from: e  reason: collision with root package name */
    private List<Integer> f47001e;

    /* renamed from: f  reason: collision with root package name */
    private int f47002f;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46998b = 0;
        this.f46999c = 0;
        this.f47000d = new ArrayList();
        this.f47001e = new ArrayList();
        this.f47002f = 100;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getHorizontalDivider() {
        return this.f46998b;
    }

    public int getVerticalDivider() {
        return this.f46999c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f47000d.clear();
        this.f47001e.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = childCount + (-1) == i9 ? 0 : this.f46999c;
            int i13 = this.f46998b;
            if (marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin + i10 > (width - getPaddingLeft()) - getPaddingRight()) {
                i8++;
                if (i8 > this.f47002f) {
                    break;
                }
                this.f47001e.add(Integer.valueOf(i11));
                this.f47000d.add(arrayList);
                arrayList = new ArrayList();
                i10 = 0;
            }
            i10 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i13;
            i11 = Math.max(i11, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12);
            arrayList.add(childAt);
            i9++;
        }
        this.f47001e.add(Integer.valueOf(i11));
        this.f47000d.add(arrayList);
        int paddingTop = getPaddingTop() + 0;
        int paddingLeft = getPaddingLeft() + 0;
        int size = this.f47000d.size();
        for (int i14 = 0; i14 < size; i14++) {
            List<View> list = this.f47000d.get(i14);
            int intValue = this.f47001e.get(i14).intValue();
            for (int i15 = 0; i15 < list.size(); i15++) {
                View view = list.get(i15);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i16 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i17 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i16, i17, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + i17);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.rightMargin + marginLayoutParams2.leftMargin + this.f46998b;
                }
            }
            paddingLeft = getPaddingLeft();
            paddingTop += intValue;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure");
        sb.append(size);
        sb.append(",");
        sb.append(size2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = 0;
        int paddingTop = getPaddingTop() + getPaddingBottom() + 0;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            measureChild(childAt, i4, i5);
            int i10 = size2;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i11 = i8;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i12 = this.f46999c;
            int i13 = paddingLeft;
            if (i7 + measuredWidth > size - (paddingLeft + paddingRight)) {
                int max = Math.max(i7, measuredWidth);
                paddingTop += i9;
                i7 = measuredWidth + this.f46998b;
                i9 = measuredHeight + i12;
                i8 = max;
            } else {
                i7 += measuredWidth + this.f46998b;
                i9 = Math.max(i9, measuredHeight);
                i8 = i11;
            }
            if (i6 == childCount - 1) {
                paddingTop += i9;
                i8 = Math.max(i8, i7);
            }
            i6++;
            size2 = i10;
            paddingLeft = i13;
        }
        int i14 = size2;
        int i15 = i8;
        if (mode != 1073741824) {
            size = i15;
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i14 : paddingTop);
    }

    public void setHorizontalDivider(int i4) {
        this.f46998b = i4;
    }

    public void setNumberRows(int i4) {
        this.f47002f = i4;
    }

    public void setVerticalDivider(int i4) {
        this.f46999c = i4;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
