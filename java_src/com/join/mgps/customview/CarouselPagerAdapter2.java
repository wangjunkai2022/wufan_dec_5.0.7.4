package com.join.mgps.customview;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.viewpager.widget.PagerAdapter;
import com.join.mgps.customview.CarouselViewPager2;
/* loaded from: classes4.dex */
public abstract class CarouselPagerAdapter2<V extends CarouselViewPager2> extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    private static final int f46455b = 10;

    /* renamed from: a  reason: collision with root package name */
    private V f46456a;

    public CarouselPagerAdapter2(V v2) {
        this.f46456a = v2;
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
        int currentItem = this.f46456a.getCurrentItem();
        if (currentItem == 0) {
            this.f46456a.setCurrentItem(b(), false);
        } else if (currentItem == getCount() - 1) {
            this.f46456a.setCurrentItem(b() - 1, false);
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
