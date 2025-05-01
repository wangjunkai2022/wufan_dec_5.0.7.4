package com.dingmouren.layoutmanagergroup.skidright;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import c0.a;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class SkidRightLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: b  reason: collision with root package name */
    private int f10184b;

    /* renamed from: c  reason: collision with root package name */
    private int f10185c;

    /* renamed from: e  reason: collision with root package name */
    private final float f10187e;

    /* renamed from: f  reason: collision with root package name */
    private final float f10188f;

    /* renamed from: g  reason: collision with root package name */
    private int f10189g;

    /* renamed from: a  reason: collision with root package name */
    private boolean f10183a = false;

    /* renamed from: d  reason: collision with root package name */
    private int f10186d = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10191i = false;

    /* renamed from: h  reason: collision with root package name */
    private final SkidRightSnapHelper f10190h = new SkidRightSnapHelper();

    public SkidRightLayoutManager(float f5, float f6) {
        this.f10187e = f5;
        this.f10188f = f6;
    }

    private void e(View view, a aVar) {
        addView(view);
        j(view);
        int c5 = (int) ((this.f10184b * (1.0f - aVar.c())) / 2.0f);
        int paddingTop = getPaddingTop();
        layoutDecoratedWithMargins(view, aVar.d() - c5, paddingTop, (aVar.d() + this.f10184b) - c5, paddingTop + this.f10185c);
        ViewCompat.setScaleX(view, aVar.c());
        ViewCompat.setScaleY(view, aVar.c());
    }

    private int i(int i4) {
        if (this.f10191i) {
            return Math.max(Math.min(0, i4), (-(this.f10189g - 1)) * this.f10184b);
        }
        return Math.min(Math.max(this.f10184b, i4), this.f10189g * this.f10184b);
    }

    private void j(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec((this.f10184b - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((this.f10185c - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
    }

    private float k() {
        float f5;
        float f6;
        int i4;
        if (this.f10191i) {
            int i5 = this.f10186d;
            int i6 = this.f10189g;
            f5 = (i5 + (i6 * i4)) * 1.0f;
            f6 = this.f10184b;
        } else {
            f5 = this.f10186d * 1.0f;
            f6 = this.f10184b;
        }
        return f5 / f6;
    }

    public int a(int i4) {
        if (this.f10191i) {
            return (this.f10184b * i4) + this.f10186d;
        }
        return (this.f10184b * (c(i4) + 1)) - this.f10186d;
    }

    public int b(int i4) {
        return (this.f10189g - 1) - i4;
    }

    public int c(int i4) {
        return (this.f10189g - 1) - i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    public void d(RecyclerView.Recycler recycler) {
        int i4;
        int i5;
        int i6;
        int i7;
        int floor = (int) Math.floor(k());
        int g4 = g();
        boolean z4 = this.f10191i;
        if (z4) {
            int i8 = this.f10184b;
            i4 = (((this.f10189g - 1) * i8) + this.f10186d) % i8;
        } else {
            i4 = this.f10186d % this.f10184b;
        }
        int i9 = this.f10184b;
        float f5 = (i4 * 1.0f) / i9;
        int i10 = z4 ? 0 : g4 - i9;
        if (!z4) {
            i9 = g() - this.f10184b;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = floor - 1;
        int i12 = 1;
        while (true) {
            if (i11 < 0) {
                i5 = floor;
                i6 = i4;
                break;
            }
            double d5 = i9 / 2;
            int i13 = i9;
            int i14 = i10;
            double pow = Math.pow(this.f10188f, i12);
            Double.isNaN(d5);
            double d6 = d5 * pow;
            double d7 = i14;
            double d8 = this.f10191i ? -f5 : f5;
            Double.isNaN(d8);
            Double.isNaN(d7);
            int i15 = (int) (d7 - (d8 * d6));
            i5 = floor;
            i6 = i4;
            int i16 = i11;
            double d9 = i12 - 1;
            double pow2 = Math.pow(this.f10188f, d9);
            double d10 = 1.0f - ((1.0f - this.f10188f) * f5);
            Double.isNaN(d10);
            a aVar = new a(i15, (float) (pow2 * d10), f5, (i15 * 1.0f) / g4);
            arrayList.add(0, aVar);
            boolean z5 = this.f10191i;
            if (!z5) {
                d6 = -d6;
            }
            Double.isNaN(d7);
            i10 = (int) (d7 + d6);
            if (!z5 ? i10 > 0 : i10 <= g()) {
                double d11 = i10;
                Double.isNaN(d11);
                aVar.i((int) (d11 - d6));
                aVar.g(0.0f);
                aVar.f(aVar.d() / g4);
                aVar.h((float) Math.pow(this.f10188f, d9));
                break;
            }
            i11 = i16 - 1;
            i12++;
            floor = i5;
            i9 = i13;
            i4 = i6;
        }
        if (i5 < this.f10189g) {
            int i17 = this.f10191i ? i6 - this.f10184b : g4 - i6;
            arrayList.add(new a(i17, 1.0f, f5, (i17 * 1.0f) / g4).e());
            i7 = i5;
        } else {
            i7 = i5 - 1;
        }
        int size = arrayList.size();
        int i18 = i7 - (size - 1);
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int c5 = c(getPosition(childAt));
            if (c5 > i7 || c5 < i18) {
                removeAndRecycleView(childAt, recycler);
            }
        }
        detachAndScrapAttachedViews(recycler);
        for (int i19 = 0; i19 < size; i19++) {
            e(recycler.getViewForPosition(b(i18 + i19)), (a) arrayList.get(i19));
        }
    }

    public int f(int i4, float f5) {
        if (!this.f10183a || this.f10186d % this.f10184b == 0) {
            return -1;
        }
        float k4 = k();
        return b(((int) (i4 > 0 ? k4 + f5 : k4 + (1.0f - f5))) - 1);
    }

    public int g() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int h() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f10190h.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0 || state.isPreLayout()) {
            return;
        }
        removeAndRecycleAllViews(recycler);
        if (!this.f10183a) {
            int h4 = h();
            this.f10185c = h4;
            this.f10184b = (int) (h4 / this.f10187e);
            this.f10183a = true;
        }
        this.f10189g = getItemCount();
        this.f10186d = i(this.f10186d);
        d(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f10191i) {
            i4 = -i4;
        }
        int i5 = this.f10186d + i4;
        this.f10186d = i(i5);
        d(recycler);
        return (this.f10186d - i5) + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        if (i4 <= 0 || i4 >= this.f10189g) {
            return;
        }
        this.f10186d = this.f10184b * (c(i4) + 1);
        requestLayout();
    }
}
