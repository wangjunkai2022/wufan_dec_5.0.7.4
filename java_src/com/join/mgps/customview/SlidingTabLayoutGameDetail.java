package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout;
import com.join.mgps.dto.GameDetailOneTouchSkill;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SlidingTabLayoutGameDetail extends HorizontalScrollView {

    /* renamed from: o  reason: collision with root package name */
    private static final int f47899o = 24;

    /* renamed from: p  reason: collision with root package name */
    private static final int f47900p = 16;

    /* renamed from: q  reason: collision with root package name */
    private static final int f47901q = 12;

    /* renamed from: b  reason: collision with root package name */
    private int f47902b;

    /* renamed from: c  reason: collision with root package name */
    private int f47903c;

    /* renamed from: d  reason: collision with root package name */
    private int f47904d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47905e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager f47906f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<String> f47907g;

    /* renamed from: h  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47908h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f47909i;

    /* renamed from: j  reason: collision with root package name */
    private int f47910j;

    /* renamed from: k  reason: collision with root package name */
    private List<View> f47911k;

    /* renamed from: l  reason: collision with root package name */
    private List<SimpleDraweeView> f47912l;

    /* renamed from: m  reason: collision with root package name */
    private List<View> f47913m;

    /* renamed from: n  reason: collision with root package name */
    private List<GameDetailOneTouchSkill> f47914n;

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private int f47915b;

        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            this.f47915b = i4;
            if (SlidingTabLayoutGameDetail.this.f47908h != null) {
                SlidingTabLayoutGameDetail.this.f47908h.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            int childCount = SlidingTabLayoutGameDetail.this.f47909i.getChildCount();
            if (childCount == 0 || i4 < 0 || i4 >= childCount) {
                return;
            }
            SlidingTabLayoutGameDetail.this.f47909i.b(i4, f5);
            View childAt = SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4);
            SlidingTabLayoutGameDetail.this.k(i4, childAt != null ? (int) (childAt.getWidth() * f5) : 0);
            if (SlidingTabLayoutGameDetail.this.f47908h != null) {
                SlidingTabLayoutGameDetail.this.f47908h.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (this.f47915b == 0) {
                SlidingTabLayoutGameDetail.this.f47909i.b(i4, 0.0f);
                SlidingTabLayoutGameDetail.this.k(i4, 0);
            }
            int i5 = 0;
            while (i5 < SlidingTabLayoutGameDetail.this.f47909i.getChildCount()) {
                SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i5).setSelected(i4 == i5);
                i5++;
            }
            if (SlidingTabLayoutGameDetail.this.f47908h != null) {
                SlidingTabLayoutGameDetail.this.f47908h.onPageSelected(i4);
            }
            for (int i6 = 0; i6 < SlidingTabLayoutGameDetail.this.f47911k.size(); i6++) {
                View view = (View) SlidingTabLayoutGameDetail.this.f47911k.get(i6);
                View view2 = (View) SlidingTabLayoutGameDetail.this.f47913m.get(i6);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) SlidingTabLayoutGameDetail.this.f47912l.get(i6);
                if (i6 == i4) {
                    view2.setVisibility(0);
                    RoundingParams o4 = simpleDraweeView.getHierarchy().o();
                    if (o4 == null) {
                        o4 = RoundingParams.a();
                    }
                    o4.o(Color.parseColor("#FFB38534"));
                    o4.p(SlidingTabLayoutGameDetail.this.getResources().getDimensionPixelOffset(R.dimen.wdp2));
                    simpleDraweeView.getHierarchy().V(o4);
                } else {
                    view2.setVisibility(4);
                    RoundingParams o5 = simpleDraweeView.getHierarchy().o();
                    if (o5 == null) {
                        o5 = RoundingParams.a();
                    }
                    o5.o(Color.parseColor("#ffffff"));
                    o5.p(0.0f);
                    simpleDraweeView.getHierarchy().V(o5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i4 = 0; i4 < SlidingTabLayoutGameDetail.this.f47909i.getChildCount(); i4++) {
                if (view == SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4)) {
                    SlidingTabLayoutGameDetail.this.f47906f.setCurrentItem(i4);
                    SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4).findViewById(R.id.indicator).setVisibility(0);
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4).findViewById(R.id.image);
                    RoundingParams o4 = simpleDraweeView.getHierarchy().o();
                    o4.o(Color.parseColor("#FFB38534"));
                    o4.p(SlidingTabLayoutGameDetail.this.getResources().getDimensionPixelOffset(R.dimen.wdp2));
                    simpleDraweeView.getHierarchy().V(o4);
                } else {
                    SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4).findViewById(R.id.indicator).setVisibility(4);
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) SlidingTabLayoutGameDetail.this.f47909i.getChildAt(i4).findViewById(R.id.image);
                    RoundingParams o5 = simpleDraweeView2.getHierarchy().o();
                    o5.p(0.0f);
                    simpleDraweeView2.getHierarchy().V(o5);
                }
            }
        }
    }

    public SlidingTabLayoutGameDetail(Context context) {
        this(context, null);
    }

    private void j() {
        PagerAdapter adapter = this.f47906f.getAdapter();
        c cVar = new c();
        this.f47911k.clear();
        this.f47913m.clear();
        this.f47912l.clear();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            View h4 = h(getContext());
            View findViewById = h4.findViewById(R.id.indicator);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) h4.findViewById(R.id.image);
            this.f47911k.add(h4);
            this.f47912l.add(simpleDraweeView);
            this.f47913m.add(findViewById);
            if (this.f47905e) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h4.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                int i5 = this.f47910j;
                layoutParams.setMargins(i5, 0, i5, 0);
            }
            MyImageLoader.h(simpleDraweeView, this.f47914n.get(i4).getPic());
            h4.setOnClickListener(cVar);
            String str = this.f47907g.get(i4, null);
            if (str != null) {
                h4.setContentDescription(str);
            }
            this.f47909i.addView(h4);
            simpleDraweeView.getHierarchy().o();
            simpleDraweeView.invalidate();
            if (i4 == this.f47906f.getCurrentItem()) {
                h4.setSelected(true);
                findViewById.setVisibility(0);
                RoundingParams o4 = simpleDraweeView.getHierarchy().o();
                o4.o(Color.parseColor("#FFB38534"));
                o4.p(getResources().getDimensionPixelOffset(R.dimen.wdp2));
                simpleDraweeView.getHierarchy().V(o4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i4, int i5) {
        View childAt;
        int childCount = this.f47909i.getChildCount();
        if (childCount == 0 || i4 < 0 || i4 >= childCount || (childAt = this.f47909i.getChildAt(i4)) == null) {
            return;
        }
        int left = childAt.getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47902b;
        }
        scrollTo(left, 0);
    }

    public List<GameDetailOneTouchSkill> getData() {
        return this.f47914n;
    }

    public int getMarginWidth() {
        return this.f47910j;
    }

    protected View h(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        ImageView i4 = i(context);
        i4.setId(R.id.image);
        linearLayout.addView(i4);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i4.getLayoutParams();
        layoutParams.gravity = 17;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp10);
        layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp122);
        layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp122);
        layoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_trigon);
        imageView.setId(R.id.indicator);
        linearLayout.addView(imageView);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.wdp22);
        layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.wdp19);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setVisibility(4);
        return linearLayout;
    }

    public ImageView i(Context context) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
        simpleDraweeView.getHierarchy().B(R.drawable.main_normal_icon);
        simpleDraweeView.getHierarchy().V(RoundingParams.a());
        return simpleDraweeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f47906f;
        if (viewPager != null) {
            k(viewPager.getCurrentItem(), 0);
        }
    }

    public void setContentDescription(int i4, String str) {
        this.f47907g.put(i4, str);
    }

    public void setCustomTabColorizer(SlidingTabLayout.d dVar) {
        this.f47909i.d(dVar);
    }

    public void setCustomTabView(int i4, int i5) {
        this.f47903c = i4;
        this.f47904d = i5;
    }

    public void setData(List<GameDetailOneTouchSkill> list) {
        this.f47914n.clear();
        if (list != null) {
            this.f47914n.addAll(list);
        }
    }

    public void setDistributeEvenly(boolean z4) {
        this.f47905e = z4;
    }

    public void setMarginWidth(int i4) {
        this.f47910j = i4;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47908h = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f47909i.e(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47909i.removeAllViews();
        this.f47906f = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new b());
            j();
        }
    }

    public SlidingTabLayoutGameDetail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutGameDetail(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47907g = new SparseArray<>();
        this.f47911k = new ArrayList();
        this.f47912l = new ArrayList();
        this.f47913m = new ArrayList();
        this.f47914n = new ArrayList();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47902b = (int) (getResources().getDisplayMetrics().density * 24.0f);
        d0 d0Var = new d0(context);
        this.f47909i = d0Var;
        d0Var.e(0);
        addView(d0Var, -1, -2);
    }
}
