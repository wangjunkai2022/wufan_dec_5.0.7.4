package com.join.mgps.fragment;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.Gson;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.GameMainV4DataBean;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_viewpager)
/* loaded from: classes3.dex */
public class EndGameViewpagerFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SlidingTabLayout f51202b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager f51203c;
    @FragmentArg

    /* renamed from: d  reason: collision with root package name */
    String f51204d;
    @FragmentArg

    /* renamed from: e  reason: collision with root package name */
    GameMainV4DataBean.EndGameConfigBean f51205e;

    /* renamed from: f  reason: collision with root package name */
    private String[] f51206f = {"难度", "热度"};

    /* renamed from: g  reason: collision with root package name */
    private String f51207g;

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
            EndGameViewpagerFragment.this.X(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i4) {
        int tabCount = this.f51202b.getTabCount();
        int i5 = 0;
        while (i5 < tabCount) {
            TextView j4 = this.f51202b.j(i5);
            j4.setTextSize(0, getResources().getDimensionPixelSize(i5 == i4 ? R.dimen.wdp32 : R.dimen.wdp28));
            j4.setTypeface(Typeface.create(i5 == i4 ? "sans-serif-medium" : "sans-serif", 0));
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void W() {
        GameMainV4DataBean.EndGameConfigBean endGameConfigBean = this.f51205e;
        if (endGameConfigBean != null && endGameConfigBean.getEndgame_challenge_level() != null) {
            this.f51207g = new Gson().toJson(this.f51205e.getEndgame_challenge_level());
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            String[] strArr = this.f51206f;
            if (i4 < strArr.length) {
                arrayList.add(new FragmentPagerAdapter.a(strArr[i4], EndGameListFragment_.A0().c(this.f51204d).e(i4 + 2).d(this.f51207g).build()));
                i4++;
            } else {
                this.f51203c.setOffscreenPageLimit(3);
                this.f51203c.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), arrayList));
                this.f51202b.setViewPager(this.f51203c, this.f51206f);
                this.f51203c.addOnPageChangeListener(new a());
                X(0);
                return;
            }
        }
    }
}
