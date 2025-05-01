package com.join.mgps.fragment;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.PapaMainFragment;
import com.join.mgps.activity.PapaMainFragment_;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EFragment(R.layout.fragment_market_new)
/* loaded from: classes3.dex */
public class MarketFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SlidingTabLayout1 f52227b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPagerCompat f52228c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f52229d;
    @Pref

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f52230e;

    /* renamed from: f  reason: collision with root package name */
    private NavigationAdapter f52231f;

    /* renamed from: g  reason: collision with root package name */
    int f52232g = 0;

    /* renamed from: h  reason: collision with root package name */
    PapaMainFragment f52233h;

    /* renamed from: i  reason: collision with root package name */
    RankingFragment f52234i;

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
            if (i4 == 0) {
                MarketFragment.this.X();
            } else if (i4 == 1) {
                MarketFragment.this.f52233h.q1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        ArrayList arrayList = new ArrayList();
        this.f52233h = new PapaMainFragment_();
        this.f52234i = new RankingFragment_();
        arrayList.add(this.f52233h);
        arrayList.add(this.f52234i);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("首页");
        arrayList2.add("排行");
        NavigationAdapter navigationAdapter = new NavigationAdapter(getChildFragmentManager(), arrayList, arrayList2);
        this.f52231f = navigationAdapter;
        navigationAdapter.d(arrayList, arrayList2);
        this.f52231f.notifyDataSetChanged();
        this.f52228c.setAdapter(this.f52231f);
        this.f52228c.setOffscreenPageLimit(3);
        this.f52227b.setViewPager(this.f52228c);
        a0();
        this.f52227b.g();
        this.f52227b.setOnPageChangeListener(new a());
        b0(this.f52232g);
        if (g2.i(this.f52230e.defaultSearchKeyword().d())) {
            this.f52229d.setText(this.f52230e.defaultSearchKeyword().d());
        }
    }

    public void W() {
        PapaMainFragment papaMainFragment;
        ViewPagerCompat viewPagerCompat = this.f52228c;
        if (viewPagerCompat == null || viewPagerCompat.getCurrentItem() != 0 || (papaMainFragment = this.f52233h) == null) {
            return;
        }
        papaMainFragment.o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void X() {
        this.f52233h.o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
        com.papa.sim.statistic.p.l(getActivity()).u2(Where.index, AccountUtil_.getInstance_(getActivity()).getUid());
        IntentUtil.getInstance().goSearchHintActivity(getActivity(), "");
    }

    void a0() {
        if (this.f52227b.getChildCount() < 4) {
            this.f52227b.setShouldExpand(true);
        } else {
            this.f52227b.setShouldExpand(false);
        }
    }

    void b0(int i4) {
        ViewPagerCompat viewPagerCompat = this.f52228c;
        if (viewPagerCompat != null) {
            viewPagerCompat.setCurrentItem(i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            this.f52233h.q1();
        }
    }
}
