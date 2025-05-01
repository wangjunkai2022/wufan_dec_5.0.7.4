package com.join.mgps.adapter;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.join.mgps.dto.GameDiscoverBean;
import com.join.mgps.fragment.CardFragment;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class CardPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private List<GameDiscoverBean> f39765a;

    /* renamed from: b  reason: collision with root package name */
    private List<Fragment> f39766b;

    public CardPagerAdapter(FragmentManager fragmentManager, List<GameDiscoverBean> list) {
        super(fragmentManager);
        this.f39766b = new ArrayList();
        for (GameDiscoverBean gameDiscoverBean : list) {
            gameDiscoverBean.set_from(105);
            CardFragment X = CardFragment.X(gameDiscoverBean);
            X.b0(gameDiscoverBean);
            this.f39766b.add(X);
        }
        this.f39765a = list;
    }

    public void b(List<GameDiscoverBean> list) {
        ArrayList arrayList = new ArrayList();
        for (GameDiscoverBean gameDiscoverBean : list) {
            arrayList.add(CardFragment.X(gameDiscoverBean));
        }
        if (this.f39766b == null) {
            this.f39766b = new ArrayList();
        }
        this.f39766b.addAll(arrayList);
        this.f39765a.addAll(list);
    }

    public List<GameDiscoverBean> c() {
        return this.f39765a;
    }

    public List<Fragment> d() {
        return this.f39766b;
    }

    public void e(List<GameDiscoverBean> list) {
        ArrayList arrayList = new ArrayList();
        for (GameDiscoverBean gameDiscoverBean : list) {
            arrayList.add(CardFragment.X(gameDiscoverBean));
        }
        this.f39766b = arrayList;
        this.f39765a = list;
    }

    public void f(List<Fragment> list) {
        this.f39766b = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39766b.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i4) {
        return this.f39766b.get(i4);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }
}
