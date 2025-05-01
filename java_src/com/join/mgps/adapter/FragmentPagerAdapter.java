package com.join.mgps.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;
/* loaded from: classes4.dex */
public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    FragmentManager f41975a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f41976b;

    /* loaded from: classes4.dex */
    public interface b {
        Fragment a();
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f41975a = fragmentManager;
    }

    public void b() {
        FragmentManager fragmentManager = this.f41975a;
        if (fragmentManager == null) {
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        for (int i4 = 0; i4 < getCount(); i4++) {
            beginTransaction.detach(getItem(i4));
        }
        if (c() != null) {
            c().clear();
            notifyDataSetChanged();
        }
    }

    public List<a> c() {
        return this.f41976b;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        super.destroyItem(viewGroup, i4, obj);
    }

    public void e(List<a> list) {
        this.f41976b = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<a> list = this.f41976b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i4) {
        return this.f41976b.get(i4).f41979c;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public long getItemId(int i4) {
        return super.getItemId(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        return this.f41976b.get(i4).f41977a;
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f41977a;

        /* renamed from: b  reason: collision with root package name */
        b f41978b;

        /* renamed from: c  reason: collision with root package name */
        public Fragment f41979c;

        public a(String str, b bVar) {
            this.f41977a = str;
            this.f41978b = bVar;
        }

        public a(String str, Fragment fragment) {
            this.f41977a = str;
            this.f41979c = fragment;
        }
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager, List<a> list) {
        super(fragmentManager);
        this.f41975a = fragmentManager;
        this.f41976b = list;
    }
}
