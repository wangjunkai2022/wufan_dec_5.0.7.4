package com.join.mgps.customview;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class NavigationAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f47457a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Fragment> f47458b;

    public NavigationAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, List<String> list) {
        super(fragmentManager);
        this.f47457a = new ArrayList(0);
        this.f47458b = new ArrayList<>(0);
        d(arrayList, list);
    }

    public Fragment b(int i4) {
        return this.f47458b.get(i4);
    }

    public ArrayList<Fragment> c() {
        return this.f47458b;
    }

    public void d(List<Fragment> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f47458b.clear();
        this.f47458b.addAll(list);
        if (list2 == null) {
            return;
        }
        this.f47457a.clear();
        this.f47457a.addAll(list2);
    }

    public void e(List<String> list) {
        if (list == null) {
            return;
        }
        this.f47457a.clear();
        this.f47457a.addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f47457a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i4) {
        return this.f47458b.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        return this.f47457a.get(i4);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }
}
