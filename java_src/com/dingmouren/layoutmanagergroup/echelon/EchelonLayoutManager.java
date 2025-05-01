package com.dingmouren.layoutmanagergroup.echelon;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c0.a;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class EchelonLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: g  reason: collision with root package name */
    private static final String f10166g = "EchelonLayoutManager";

    /* renamed from: a  reason: collision with root package name */
    private Context f10167a;

    /* renamed from: b  reason: collision with root package name */
    private int f10168b;

    /* renamed from: c  reason: collision with root package name */
    private int f10169c;

    /* renamed from: d  reason: collision with root package name */
    private int f10170d;

    /* renamed from: e  reason: collision with root package name */
    private int f10171e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private float f10172f = 0.9f;

    public EchelonLayoutManager(Context context) {
        this.f10167a = context;
        int c5 = (int) (c() * 0.87f);
        this.f10168b = c5;
        this.f10169c = (int) (c5 * 1.46f);
    }

    private void e(RecyclerView.Recycler recycler) {
        int i4;
        float f5;
        EchelonLayoutManager echelonLayoutManager;
        int i5;
        EchelonLayoutManager echelonLayoutManager2 = this;
        if (getItemCount() == 0) {
            return;
        }
        int floor = (int) Math.floor(echelonLayoutManager2.f10171e / echelonLayoutManager2.f10169c);
        int d5 = d();
        int i6 = echelonLayoutManager2.f10169c;
        int i7 = d5 - i6;
        int i8 = echelonLayoutManager2.f10171e % i6;
        float f6 = i8 * 1.0f;
        float f7 = f6 / i6;
        ArrayList arrayList = new ArrayList();
        int i9 = floor - 1;
        int i10 = i9;
        int i11 = 1;
        while (true) {
            if (i10 < 0) {
                i4 = i8;
                f5 = f6;
                echelonLayoutManager = echelonLayoutManager2;
                i5 = i9;
                break;
            }
            double d6 = (d() - echelonLayoutManager2.f10169c) / 2;
            int i12 = i10;
            double pow = Math.pow(0.8d, i11);
            Double.isNaN(d6);
            double d7 = d6 * pow;
            double d8 = i7;
            double d9 = f7;
            Double.isNaN(d9);
            Double.isNaN(d8);
            int i13 = (int) (d8 - (d9 * d7));
            echelonLayoutManager = this;
            i5 = i9;
            i4 = i8;
            f5 = f6;
            double d10 = i11 - 1;
            double pow2 = Math.pow(echelonLayoutManager.f10172f, d10);
            double d11 = 1.0f - ((1.0f - echelonLayoutManager.f10172f) * f7);
            Double.isNaN(d11);
            a aVar = new a(i13, (float) (pow2 * d11), f7, (i13 * 1.0f) / d());
            arrayList.add(0, aVar);
            Double.isNaN(d8);
            int i14 = (int) (d8 - d7);
            if (i14 <= 0) {
                double d12 = i14;
                Double.isNaN(d12);
                aVar.i((int) (d12 + d7));
                aVar.g(0.0f);
                aVar.f(aVar.d() / d());
                aVar.h((float) Math.pow(echelonLayoutManager.f10172f, d10));
                break;
            }
            i11++;
            echelonLayoutManager2 = echelonLayoutManager;
            i9 = i5;
            f6 = f5;
            i10 = i12 - 1;
            i7 = i14;
            i8 = i4;
        }
        if (floor < echelonLayoutManager.f10170d) {
            int d13 = d() - i4;
            arrayList.add(new a(d13, 1.0f, f5 / echelonLayoutManager.f10169c, (d13 * 1.0f) / d()).e());
        } else {
            floor = i5;
        }
        int size = arrayList.size();
        int i15 = floor - (size - 1);
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = echelonLayoutManager.getChildAt(childCount);
            int position = echelonLayoutManager.getPosition(childAt);
            if (position > floor || position < i15) {
                echelonLayoutManager.removeAndRecycleView(childAt, recycler);
            }
        }
        detachAndScrapAttachedViews(recycler);
        for (int i16 = 0; i16 < size; i16++) {
            View viewForPosition = recycler.getViewForPosition(i15 + i16);
            a aVar2 = (a) arrayList.get(i16);
            echelonLayoutManager.addView(viewForPosition);
            echelonLayoutManager.f(viewForPosition);
            int c5 = (c() - echelonLayoutManager.f10168b) / 2;
            layoutDecoratedWithMargins(viewForPosition, c5, aVar2.d(), c5 + echelonLayoutManager.f10168b, aVar2.d() + echelonLayoutManager.f10169c);
            viewForPosition.setPivotX(viewForPosition.getWidth() / 2);
            viewForPosition.setPivotY(0.0f);
            viewForPosition.setScaleX(aVar2.c());
            viewForPosition.setScaleY(aVar2.c());
        }
    }

    private void f(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f10168b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f10169c, 1073741824));
    }

    public int c() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    public int d() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0 || state.isPreLayout()) {
            return;
        }
        removeAndRecycleAllViews(recycler);
        int c5 = (int) (c() * 0.87f);
        this.f10168b = c5;
        this.f10169c = (int) (c5 * 1.46f);
        this.f10170d = getItemCount();
        this.f10171e = Math.min(Math.max(this.f10169c, this.f10171e), this.f10170d * this.f10169c);
        e(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i5 = this.f10171e;
        int i6 = i5 + i4;
        this.f10171e = Math.min(Math.max(this.f10169c, i5 + i4), this.f10170d * this.f10169c);
        e(recycler);
        return (this.f10171e - i6) + i4;
    }
}
