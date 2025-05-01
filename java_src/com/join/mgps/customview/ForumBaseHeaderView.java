package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: classes4.dex */
public class ForumBaseHeaderView extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    protected View.OnClickListener f47003b;

    /* renamed from: c  reason: collision with root package name */
    a f47004c;

    /* loaded from: classes4.dex */
    public interface a {
        void h(int i4);
    }

    public ForumBaseHeaderView(@NonNull Context context) {
        super(context);
        this.f47003b = null;
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context) {
        setOrientation(1);
    }

    public a getmOnMeasureHeight() {
        return this.f47004c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f47003b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
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
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i10 = layoutParams2.leftMargin;
                    i7 = layoutParams2.topMargin;
                    i6 = layoutParams2.bottomMargin;
                } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                    int i11 = layoutParams3.leftMargin;
                    i7 = layoutParams3.topMargin;
                    i6 = layoutParams3.bottomMargin;
                } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
                    int i12 = layoutParams4.leftMargin;
                    i7 = layoutParams4.topMargin;
                    i6 = layoutParams4.bottomMargin;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                childAt.getMeasuredWidth();
                i8 += childAt.getMeasuredHeight() + i7 + i6;
            }
        }
        if (this.f47004c != null) {
            this.f47004c.h((getLayoutParams() instanceof RelativeLayout.LayoutParams ? ((RelativeLayout.LayoutParams) getLayoutParams()).bottomMargin : 0) + i8);
        }
        if (mode != 1073741824) {
            size = 0;
        }
        if (mode2 != 1073741824) {
            size2 = i8;
        }
        setMeasuredDimension(size, size2);
    }

    public void setHeaderClickListener(View.OnClickListener onClickListener) {
        this.f47003b = onClickListener;
    }

    public void setmOnMeasureHeight(a aVar) {
        this.f47004c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        if (getOrientation() == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (getOrientation() == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return super.generateDefaultLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (getOrientation() == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (getOrientation() == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return super.generateLayoutParams(layoutParams);
    }

    public ForumBaseHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47003b = null;
        a(context);
    }

    public ForumBaseHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        this.f47003b = null;
        a(context);
    }
}
