package com.join.mgps.customview;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class NavigationAdapterV2 extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f47459a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Fragment> f47460b;

    /* renamed from: c  reason: collision with root package name */
    private FragmentManager f47461c;

    public NavigationAdapterV2(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, List<String> list) {
        super(fragmentManager);
        this.f47459a = new ArrayList(0);
        this.f47460b = new ArrayList<>(0);
        this.f47461c = fragmentManager;
        d(arrayList, list);
    }

    public Fragment b(int i4) {
        return this.f47460b.get(i4);
    }

    public ArrayList<Fragment> c() {
        return this.f47460b;
    }

    public void d(List<Fragment> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f47460b.clear();
        this.f47460b.addAll(list);
        if (list2 == null) {
            return;
        }
        this.f47459a.clear();
        this.f47459a.addAll(list2);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i4, @NonNull Object obj) {
        viewGroup.removeView(this.f47460b.get(i4).getView());
    }

    public void e(List<String> list) {
        if (list == null) {
            return;
        }
        this.f47459a.clear();
        this.f47459a.addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f47459a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i4) {
        return this.f47460b.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        return this.f47459a.get(i4);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i4) {
        Fragment fragment = this.f47460b.get(i4);
        if (!fragment.isAdded()) {
            FragmentTransaction beginTransaction = this.f47461c.beginTransaction();
            beginTransaction.add(fragment, fragment.getClass().getSimpleName());
            beginTransaction.commitAllowingStateLoss();
            this.f47461c.executePendingTransactions();
        }
        if (fragment.getView().getParent() == null) {
            viewGroup.addView(fragment.getView());
        }
        return fragment.getView();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }
}
