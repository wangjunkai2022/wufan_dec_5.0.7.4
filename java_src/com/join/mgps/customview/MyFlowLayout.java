package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class MyFlowLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private List<List<View>> f47400b;

    /* renamed from: c  reason: collision with root package name */
    private List<Integer> f47401c;

    public MyFlowLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f47400b.clear();
        this.f47401c.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (measuredWidth + i9 > width - (getPaddingLeft() + getPaddingRight())) {
                this.f47401c.add(Integer.valueOf(i8));
                this.f47400b.add(arrayList);
                arrayList = new ArrayList();
                i8 = measuredHeight;
                i9 = 0;
            }
            i9 += measuredWidth;
            i8 = Math.max(i8, measuredHeight);
            arrayList.add(childAt);
        }
        this.f47401c.add(Integer.valueOf(i8));
        this.f47400b.add(arrayList);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f47400b.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<View> list = this.f47400b.get(i11);
            int intValue = this.f47401c.get(i11).intValue();
            for (int i12 = 0; i12 < list.size(); i12++) {
                View view = list.get(i12);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i13 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i14 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i13, i14, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + i14);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingLeft = getPaddingLeft();
            paddingTop += intValue;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            measureChild(childAt, i4, i5);
            if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i6 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i6 = 0;
                i7 = 0;
            }
            int i13 = i10 + i7;
            if (i13 > size - (getPaddingLeft() + getPaddingRight())) {
                i8 = Math.max(i8, i10);
                i9 += i11;
                i11 = i6;
                i10 = i7;
            } else {
                i11 = Math.max(i11, i6);
                i10 = i13;
            }
            if (i12 == childCount - 1) {
                i9 += i11;
                i8 = Math.max(i8, i10);
            }
        }
        int paddingLeft = i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i9 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public MyFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyFlowLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47400b = new ArrayList();
        this.f47401c = new ArrayList();
    }
}
