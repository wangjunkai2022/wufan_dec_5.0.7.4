package com.join.mgps.fragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.join.mgps.adapter.FragmentPagerAdapter;
/* compiled from: CurrentFragmentImpl.java */
/* loaded from: classes3.dex */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ViewPager f53250a;

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f53251b;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentPagerAdapter f53252c;

    public f(ViewPager viewPager, FragmentManager fragmentManager) {
        this.f53250a = viewPager;
        this.f53251b = fragmentManager;
        if (viewPager != null) {
            this.f53252c = (FragmentPagerAdapter) viewPager.getAdapter();
        } else {
            this.f53252c = new FragmentPagerAdapter(fragmentManager);
        }
    }

    private static String b(int i4, long j4) {
        return "android:switcher:" + i4 + ":" + j4;
    }

    @Override // com.join.mgps.fragment.e
    @Nullable
    public FragmentPagerFragment a() {
        int currentItem = this.f53250a.getCurrentItem();
        if (currentItem < 0 || currentItem >= this.f53252c.getCount()) {
            return null;
        }
        Fragment findFragmentByTag = this.f53251b.findFragmentByTag(b(this.f53250a.getId(), this.f53252c.getItemId(currentItem)));
        if (findFragmentByTag != null) {
            return (FragmentPagerFragment) findFragmentByTag;
        }
        return null;
    }
}
