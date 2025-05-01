package com.xpleemoon.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.viewpager.widget.PagerAdapter;
import com.xpleemoon.view.CarouselViewPager;
/* loaded from: classes6.dex */
public abstract class CarouselPagerAdapter<V extends CarouselViewPager> extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    private static final int f68419b = 10;

    /* renamed from: a  reason: collision with root package name */
    private V f68420a;

    public CarouselPagerAdapter(V v2) {
        this.f68420a = v2;
    }

    @IntRange(from = 0)
    public abstract int b();

    public abstract Object c(ViewGroup viewGroup, int i4);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        if (getCount() <= 1) {
            return;
        }
        int currentItem = this.f68420a.getCurrentItem();
        if (currentItem == 0) {
            this.f68420a.setCurrentItem(b(), false);
        } else if (currentItem == getCount() - 1) {
            this.f68420a.setCurrentItem(b() - 1, false);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        long b5 = b();
        if (b5 > 1) {
            b5 = b() * 10;
            if (b5 > 2147483647L) {
                b5 = 2147483647L;
            }
        }
        return (int) b5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i4) {
        return c(viewGroup, i4 % b());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
