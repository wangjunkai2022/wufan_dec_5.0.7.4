package com.join.mgps.customview;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
/* loaded from: classes4.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private PagerAdapter f47351a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<a> f47352b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f47353c;

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        ViewGroup f47354a;

        /* renamed from: b  reason: collision with root package name */
        int f47355b;

        /* renamed from: c  reason: collision with root package name */
        Object f47356c;

        public a(ViewGroup viewGroup, int i4, Object obj) {
            this.f47354a = viewGroup;
            this.f47355b = i4;
            this.f47356c = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f47351a = pagerAdapter;
    }

    private int d() {
        return 1;
    }

    private int e() {
        return (d() + c()) - 1;
    }

    public PagerAdapter b() {
        return this.f47351a;
    }

    public int c() {
        return this.f47351a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        int d5 = d();
        int e5 = e();
        PagerAdapter pagerAdapter = this.f47351a;
        int h4 = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i4 : h(i4);
        if (this.f47353c && (i4 == d5 || i4 == e5)) {
            this.f47352b.put(i4, new a(viewGroup, h4, obj));
        } else {
            this.f47351a.destroyItem(viewGroup, h4, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z4) {
        this.f47353c = z4;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f47351a.finishUpdate(viewGroup);
    }

    public int g(int i4) {
        return i4 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f47351a.getCount() + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i4) {
        int c5 = c();
        if (c5 == 0) {
            return 0;
        }
        int i5 = (i4 - 1) % c5;
        return i5 < 0 ? i5 + c5 : i5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        a aVar;
        PagerAdapter pagerAdapter = this.f47351a;
        int h4 = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i4 : h(i4);
        if (this.f47353c && (aVar = this.f47352b.get(i4)) != null) {
            this.f47352b.remove(i4);
            return aVar.f47356c;
        }
        return this.f47351a.instantiateItem(viewGroup, h4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f47351a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f47352b = new SparseArray<>();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f47351a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f47351a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i4, Object obj) {
        this.f47351a.setPrimaryItem(viewGroup, i4, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f47351a.startUpdate(viewGroup);
    }
}
