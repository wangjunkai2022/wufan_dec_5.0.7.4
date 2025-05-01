package com.join.mgps.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;
/* loaded from: classes4.dex */
public class LodingViewPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private List<View> f43373a;

    public LodingViewPagerAdapter() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<View> list = this.f43373a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f43373a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        viewGroup.addView(this.f43373a.get(i4));
        return this.f43373a.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public LodingViewPagerAdapter(List<View> list) {
        this.f43373a = list;
    }
}
