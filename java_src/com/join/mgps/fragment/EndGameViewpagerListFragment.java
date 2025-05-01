package com.join.mgps.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.CommonGameInfoBean;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_viewpager_list)
/* loaded from: classes3.dex */
public class EndGameViewpagerListFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ViewPager f51214b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SlidingTabLayout f51215c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f51216d;
    @FragmentArg

    /* renamed from: e  reason: collision with root package name */
    String f51217e;
    @FragmentArg

    /* renamed from: f  reason: collision with root package name */
    String f51218f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f51219g = {"推荐", "热门挑战", "难度挑战"};

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
            EndGameViewpagerListFragment.this.a0(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(getContext(), commonGameInfoBean.getIntentDataBean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i4) {
        int tabCount = this.f51215c.getTabCount();
        int i5 = 0;
        while (i5 < tabCount) {
            TextView j4 = this.f51215c.j(i5);
            j4.setTextSize(0, getResources().getDimensionPixelSize(i5 == i4 ? R.dimen.wdp32 : R.dimen.wdp28));
            j4.setTypeface(null, i5 == i4 ? 1 : 0);
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void X() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FragmentPagerAdapter.a(this.f51219g[0], EndGameListFragment_.A0().c(this.f51217e).e(1).d("").b(this.f51218f).build()));
        arrayList.add(new FragmentPagerAdapter.a(this.f51219g[1], EndGameListFragment_.A0().c(this.f51217e).e(3).d("").b(this.f51218f).build()));
        arrayList.add(new FragmentPagerAdapter.a(this.f51219g[2], EndGameListFragment_.A0().c(this.f51217e).e(2).d("").b(this.f51218f).build()));
        this.f51214b.setOffscreenPageLimit(3);
        this.f51214b.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), arrayList));
        this.f51215c.setViewPager(this.f51214b, this.f51219g);
        this.f51214b.addOnPageChangeListener(new a());
        a0(0);
        b0();
    }

    public void b0() {
        final CommonGameInfoBean v02;
        try {
            if (getActivity() != null && (getActivity() instanceof EndGameActivity_) && (v02 = ((EndGameActivity_) getActivity()).v0()) != null) {
                MyImageLoader.h(this.f51216d, v02.getBig_pic());
                this.f51216d.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EndGameViewpagerListFragment.this.Z(v02, view);
                    }
                });
                this.f51216d.setVisibility(0);
                return;
            }
            this.f51216d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
