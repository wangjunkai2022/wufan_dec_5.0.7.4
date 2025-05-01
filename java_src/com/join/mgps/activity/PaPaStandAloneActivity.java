package com.join.mgps.activity;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.BaseFragmentActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.InterceptEventViewPager;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.fragment.PaPaBannerListFragment;
import com.join.mgps.fragment.PaPaStandAloneOverSeaFragment;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_papa_standalone)
/* loaded from: classes4.dex */
public class PaPaStandAloneActivity extends BaseFragmentActivity {

    /* renamed from: f  reason: collision with root package name */
    static String[] f36361f = {"推荐", "中文", "破解", "美国榜", "日本榜", "韩国榜"};
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36362b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    InterceptEventViewPager f36363c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TabPageIndicator f36364d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment[] f36365e = new Fragment[f36361f.length];

    /* loaded from: classes4.dex */
    private class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return PaPaStandAloneActivity.f36361f.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return PaPaStandAloneActivity.this.i0(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return PaPaStandAloneActivity.f36361f[i4];
        }
    }

    private int g0(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return i4 != 5 ? -1 : 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 13;
            }
            return 12;
        }
        return 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment i0(int i4) {
        Fragment fragment = this.f36365e[i4];
        if (fragment != null) {
            return fragment;
        }
        int g02 = g0(i4);
        if (i4 == 0 || i4 == 1 || i4 == 2) {
            PaPaBannerListFragment l02 = PaPaBannerListFragment.l0(g02);
            this.f36365e[i4] = l02;
            return l02;
        } else if (i4 == 3 || i4 == 4 || i4 == 5) {
            PaPaStandAloneOverSeaFragment X = PaPaStandAloneOverSeaFragment.X(g02);
            this.f36365e[i4] = X;
            return X;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36362b.setText("悟饭单机");
        a aVar = new a(getSupportFragmentManager());
        this.f36363c.setIsAsParentViewPager(true);
        this.f36363c.setAdapter(aVar);
        this.f36363c.setOffscreenPageLimit(6);
        this.f36363c.setCurrentItem(0);
        if ("2308".equals(MApplication.f1499z) || "750".equals(MApplication.f1499z) || "753".equals(MApplication.f1499z)) {
            f36361f = new String[]{"推荐", "中文", "经典", "美国榜", "日本榜", "韩国榜"};
        }
        this.f36364d.setViewPager(this.f36363c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    public InterceptEventViewPager h0() {
        return this.f36363c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
