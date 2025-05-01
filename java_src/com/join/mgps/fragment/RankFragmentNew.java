package com.join.mgps.fragment;

import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.ClassifyListFragment;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_rank_new)
/* loaded from: classes3.dex */
public class RankFragmentNew extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SlidingTabLayout1 f52620b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f52621c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ViewPagerCompat f52622d;

    /* renamed from: e  reason: collision with root package name */
    private NavigationAdapter f52623e;

    /* renamed from: f  reason: collision with root package name */
    int f52624f = 1;

    /* renamed from: g  reason: collision with root package name */
    boolean f52625g = false;

    /* loaded from: classes3.dex */
    class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            RankFragmentNew.this.f52624f = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        if (this.f52625g) {
            this.f52621c.setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ClassifyListFragment.k0(1001, "1"));
        arrayList.add(ClassifyListFragment.k0(1001, "2"));
        arrayList.add(ClassifyListFragment.k0(1001, "3"));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("  单机榜  ");
        arrayList2.add("模拟器榜");
        arrayList2.add("  网游榜  ");
        NavigationAdapter navigationAdapter = new NavigationAdapter(getChildFragmentManager(), arrayList, arrayList2);
        this.f52623e = navigationAdapter;
        navigationAdapter.d(arrayList, arrayList2);
        this.f52623e.notifyDataSetChanged();
        this.f52622d.setAdapter(this.f52623e);
        this.f52622d.setOffscreenPageLimit(3);
        this.f52620b.setViewPager(this.f52622d);
        W();
        this.f52620b.g();
        this.f52620b.setOnPageChangeListener(new a());
        a0(this.f52624f);
    }

    void W() {
        if (this.f52620b.getChildCount() < 4) {
            this.f52620b.setShouldExpand(true);
        } else {
            this.f52620b.setShouldExpand(false);
        }
    }

    public void X(int i4) {
        this.f52624f = i4;
    }

    public void Z(boolean z4) {
        this.f52625g = z4;
    }

    void a0(int i4) {
        ViewPagerCompat viewPagerCompat = this.f52622d;
        if (viewPagerCompat != null) {
            viewPagerCompat.setCurrentItem(i4);
        }
    }
}
