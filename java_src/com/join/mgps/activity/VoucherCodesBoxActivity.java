package com.join.mgps.activity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.fragment.CodesBoxFragment_;
import com.join.mgps.fragment.VoucherFragment_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_voucher_codesbox)
/* loaded from: classes4.dex */
public class VoucherCodesBoxActivity extends FragmentActivity {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f38396j = {"游戏礼包", "代金券"};
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f38397b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    int f38398c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f38399d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ViewPager f38400e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TabPageIndicator f38401f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f38402g;

    /* renamed from: h  reason: collision with root package name */
    private FragmentPagerAdapter f38403h;

    /* renamed from: i  reason: collision with root package name */
    private Fragment[] f38404i = new Fragment[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnPageChangeListener {
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
            if (i4 == 1) {
                VoucherCodesBoxActivity.this.f38402g.setVisibility(0);
            } else {
                VoucherCodesBoxActivity.this.f38402g.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends FragmentPagerAdapter {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return VoucherCodesBoxActivity.f38396j.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return VoucherCodesBoxActivity.this.g0(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return VoucherCodesBoxActivity.f38396j[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment g0(int i4) {
        Fragment fragment = this.f38404i[i4];
        if (fragment != null) {
            return fragment;
        }
        if (i4 == 0) {
            fragment = new CodesBoxFragment_();
            Bundle bundle = new Bundle();
            bundle.putInt("uid", this.f38397b);
            fragment.setArguments(bundle);
        } else if (i4 == 1) {
            fragment = new VoucherFragment_();
        }
        this.f38404i[i4] = fragment;
        return fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f38399d.setText("游戏礼包/代金券");
        this.f38402g.setText("使用说明");
        this.f38402g.setVisibility(8);
        b bVar = new b(getSupportFragmentManager());
        this.f38403h = bVar;
        this.f38400e.setAdapter(bVar);
        this.f38400e.setOffscreenPageLimit(2);
        this.f38401f.setViewPager(this.f38400e, 0);
        this.f38401f.setOnPageChangeListener(new a());
        this.f38400e.setCurrentItem(this.f38398c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        VoucherFragment_ voucherFragment_;
        Fragment[] fragmentArr = this.f38404i;
        if (fragmentArr[1] == null || (voucherFragment_ = (VoucherFragment_) fragmentArr[1]) == null || voucherFragment_.h0() == null) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(voucherFragment_.h0().getLink().getLink_type_val());
        intentDateBean.setObject(voucherFragment_.h0().getTitle());
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }
}
