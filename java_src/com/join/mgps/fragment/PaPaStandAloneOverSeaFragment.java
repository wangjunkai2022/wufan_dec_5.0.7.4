package com.join.mgps.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.InterceptEventViewPager;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_papa_standalone_oversea)
/* loaded from: classes3.dex */
public class PaPaStandAloneOverSeaFragment extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public static final int f52560h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f52561i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f52562j = 3;

    /* renamed from: b  reason: collision with root package name */
    int f52563b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f52564c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f52565d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    InterceptEventViewPager f52566e;

    /* renamed from: f  reason: collision with root package name */
    PaPaBannerListFragment f52567f;

    /* renamed from: g  reason: collision with root package name */
    PaPaBannerListFragment f52568g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaStandAloneOverSeaFragment.this.f52566e.setCurrentItem(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaStandAloneOverSeaFragment.this.f52566e.setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements InterceptEventViewPager.c {
        c() {
        }

        @Override // com.join.mgps.customview.InterceptEventViewPager.c
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // com.join.mgps.customview.InterceptEventViewPager.c
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // com.join.mgps.customview.InterceptEventViewPager.c
        public void onPageSelected(int i4) {
            if (i4 == 0) {
                PaPaStandAloneOverSeaFragment.this.f52564c.setTextColor(Color.parseColor("#F47500"));
                PaPaStandAloneOverSeaFragment.this.f52565d.setTextColor(Color.parseColor("#4A4A4A"));
            } else if (i4 != 1) {
            } else {
                PaPaStandAloneOverSeaFragment.this.f52565d.setTextColor(Color.parseColor("#F47500"));
                PaPaStandAloneOverSeaFragment.this.f52564c.setTextColor(Color.parseColor("#4A4A4A"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends FragmentPagerAdapter {
        public d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return PaPaStandAloneOverSeaFragment.this.Z(i4);
        }
    }

    public static PaPaStandAloneOverSeaFragment X(int i4) {
        PaPaStandAloneOverSeaFragment_ paPaStandAloneOverSeaFragment_ = new PaPaStandAloneOverSeaFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        paPaStandAloneOverSeaFragment_.setArguments(bundle);
        return paPaStandAloneOverSeaFragment_;
    }

    int V() {
        int i4 = this.f52563b;
        if (i4 == 1) {
            return 14;
        }
        return i4 == 2 ? 16 : 18;
    }

    int W() {
        int i4 = this.f52563b;
        if (i4 == 1) {
            return 15;
        }
        return i4 == 2 ? 17 : 19;
    }

    Fragment Z(int i4) {
        if (i4 == 0) {
            if (this.f52567f == null) {
                this.f52567f = PaPaBannerListFragment.l0(V());
            }
            return this.f52567f;
        } else if (i4 != 1) {
            return null;
        } else {
            if (this.f52568g == null) {
                this.f52568g = PaPaBannerListFragment.l0(W());
            }
            return this.f52568g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52564c.setOnClickListener(new a());
        this.f52565d.setOnClickListener(new b());
        d dVar = new d(getChildFragmentManager());
        this.f52566e.setViewPagerCallback(new c());
        this.f52566e.setIsAsParentViewPager(true);
        this.f52566e.setAdapter(dVar);
        this.f52566e.setOffscreenPageLimit(2);
        this.f52566e.setCurrentItem(0);
        this.f52564c.setTextColor(Color.parseColor("#F47500"));
        this.f52565d.setTextColor(Color.parseColor("#4A4A4A"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f52563b = getArguments().getInt("type");
    }
}
