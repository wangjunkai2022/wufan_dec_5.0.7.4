package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
/* loaded from: classes4.dex */
public class IcsLinearLayout extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f47213g = {16843049, 16843561, 16843562};

    /* renamed from: h  reason: collision with root package name */
    private static final int f47214h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static final int f47215i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static final int f47216j = 2;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f47217b;

    /* renamed from: c  reason: collision with root package name */
    private int f47218c;

    /* renamed from: d  reason: collision with root package name */
    private int f47219d;

    /* renamed from: e  reason: collision with root package name */
    private int f47220e;

    /* renamed from: f  reason: collision with root package name */
    private int f47221f;

    public IcsLinearLayout(Context context, int i4) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f47213g, i4, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f47221f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f47220e = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    private void a(Canvas canvas) {
        int right;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8 && e(i4)) {
                d(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                right = (getWidth() - getPaddingRight()) - this.f47218c;
            } else {
                right = childAt2.getRight();
            }
            d(canvas, right);
        }
    }

    private void b(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8 && e(i4)) {
                c(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f47219d;
            } else {
                bottom = childAt2.getBottom();
            }
            c(canvas, bottom);
        }
    }

    private void c(Canvas canvas, int i4) {
        this.f47217b.setBounds(getPaddingLeft() + this.f47221f, i4, (getWidth() - getPaddingRight()) - this.f47221f, this.f47219d + i4);
        this.f47217b.draw(canvas);
    }

    private void d(Canvas canvas, int i4) {
        this.f47217b.setBounds(i4, getPaddingTop() + this.f47221f, this.f47218c + i4, (getHeight() - getPaddingBottom()) - this.f47221f);
        this.f47217b.draw(canvas);
    }

    private boolean e(int i4) {
        if (i4 == 0 || i4 == getChildCount() || (this.f47220e & 2) == 0) {
            return false;
        }
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (e(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f47219d;
            } else {
                layoutParams.leftMargin = this.f47218c;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && e(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f47219d;
            } else {
                layoutParams.rightMargin = this.f47218c;
            }
        }
        super.measureChildWithMargins(view, i4, i5, i6, i7);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f47217b != null) {
            if (getOrientation() == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f47217b) {
            return;
        }
        this.f47217b = drawable;
        if (drawable != null) {
            this.f47218c = drawable.getIntrinsicWidth();
            this.f47219d = drawable.getIntrinsicHeight();
        } else {
            this.f47218c = 0;
            this.f47219d = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }
}
