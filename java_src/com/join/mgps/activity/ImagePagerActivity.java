package com.join.mgps.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.component.photoviewer.HackyViewPager;
import com.join.android.app.component.photoviewer.ImageDetailFragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
/* loaded from: classes4.dex */
public class ImagePagerActivity extends FragmentActivity {

    /* renamed from: e  reason: collision with root package name */
    private static final String f34058e = "STATE_POSITION";

    /* renamed from: f  reason: collision with root package name */
    public static final String f34059f = "image_index";

    /* renamed from: g  reason: collision with root package name */
    public static final String f34060g = "image_urls";

    /* renamed from: b  reason: collision with root package name */
    private HackyViewPager f34061b;

    /* renamed from: c  reason: collision with root package name */
    private int f34062c;

    /* renamed from: d  reason: collision with root package name */
    private CirclePageIndicator f34063d;

    /* loaded from: classes4.dex */
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
            ImagePagerActivity.this.f34063d.setCurrentItem(i4);
        }
    }

    /* loaded from: classes4.dex */
    private class b extends FragmentStatePagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public String[] f34065a;

        public b(FragmentManager fragmentManager, String[] strArr) {
            super(fragmentManager);
            this.f34065a = strArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            String[] strArr = this.f34065a;
            if (strArr == null) {
                return 0;
            }
            return strArr.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i4) {
            return ImageDetailFragment.b0(this.f34065a[i4]);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.image_viewpager);
        this.f34062c = getIntent().getIntExtra("image_index", 0);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("image_urls");
        this.f34061b = (HackyViewPager) findViewById(R.id.pager);
        this.f34061b.setAdapter(new b(getSupportFragmentManager(), stringArrayExtra));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        this.f34063d = circlePageIndicator;
        circlePageIndicator.setViewPager(this.f34061b);
        this.f34061b.setOnPageChangeListener(new a());
        if (bundle != null) {
            this.f34062c = bundle.getInt(f34058e);
        }
        this.f34061b.setCurrentItem(this.f34062c);
        this.f34063d.setCurrentItem(this.f34062c);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(f34058e, this.f34061b.getCurrentItem());
    }
}
