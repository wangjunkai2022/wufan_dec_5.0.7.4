package com.join.mgps.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.activity.MGMainClassifyFragment;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout2;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_classify_rank)
/* loaded from: classes3.dex */
public class ClassifyRankFragment extends BaseFragment {

    /* renamed from: b  reason: collision with root package name */
    private NavigationAdapter f50083b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager f50084c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    SlidingTabLayout2 f50085d;

    /* renamed from: g  reason: collision with root package name */
    private int f50088g;

    /* renamed from: h  reason: collision with root package name */
    private Context f50089h;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Fragment> f50086e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    List<String> f50087f = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    int f50090i = 0;

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
            ClassifyRankFragment classifyRankFragment = ClassifyRankFragment.this;
            classifyRankFragment.f50090i = i4;
            classifyRankFragment.W(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void V() {
        com.papa.sim.statistic.p.l(this.f50089h).u2(Where.battle, AccountUtil_.getInstance_(getActivity()).getUid());
        SearchHintActivity_.G1(this.f50089h).start();
    }

    void W(int i4) {
        if (getActivity() != null && (getActivity() instanceof MGMainActivity_)) {
            ((MGMainActivity_) getActivity()).setClassifyPrimaryIndex(i4);
        }
    }

    public void X(int i4) {
        NavigationAdapter navigationAdapter;
        ViewPager viewPager;
        if (i4 < 0 || (navigationAdapter = this.f50083b) == null || i4 >= navigationAdapter.getCount() || (viewPager = this.f50084c) == null || viewPager.getCurrentItem() == i4) {
            return;
        }
        this.f50084c.setCurrentItem(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Context context = getContext();
        this.f50089h = context;
        this.f50088g = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
        this.f50086e.add(new ClassifyFragment_());
        this.f50086e.add(new RankFragmentNew_());
        this.f50086e.add(new GameTopicFragment_());
        this.f50087f.add("分类");
        this.f50087f.add("排行");
        this.f50087f.add("专题");
        NavigationAdapter navigationAdapter = new NavigationAdapter(getChildFragmentManager(), this.f50086e, this.f50087f);
        this.f50083b = navigationAdapter;
        this.f50084c.setAdapter(navigationAdapter);
        this.f50084c.setOffscreenPageLimit(2);
        this.f50085d.setCustomTabView(R.layout.tab_indicator, 16908308);
        this.f50085d.setSelectedIndicatorColors(-882134);
        this.f50085d.setDistributeEvenly(true);
        this.f50085d.setMarginWidth(com.join.mgps.Util.c0.a(getContext(), 5.0f));
        this.f50085d.setViewPager(this.f50084c);
        this.f50085d.setOnPageChangeListener(new a());
        initData();
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i4 = arguments.getInt(MGMainClassifyFragment.I);
                if (i4 == 6) {
                    this.f50090i = 2;
                }
                if (i4 == 0) {
                    int i5 = arguments.getInt("classfyShowType");
                    if (i5 == 1) {
                        this.f50090i = 1;
                    } else if (i5 == 2) {
                        this.f50090i = 0;
                    } else if (i5 == 3) {
                        this.f50090i = 2;
                    }
                } else if (i4 == 1) {
                    this.f50090i = 0;
                } else if (i4 == 6) {
                    this.f50090i = 2;
                } else {
                    this.f50090i = 1;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        X(this.f50090i);
        W(this.f50090i);
    }

    void initData() {
        if (getActivity() != null && (getActivity() instanceof MGMainActivity_)) {
            this.f50090i = ((MGMainActivity_) getActivity()).getClassifyPrimaryIndex();
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }
}
