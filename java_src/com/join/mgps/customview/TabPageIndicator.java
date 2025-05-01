package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.v1;
/* loaded from: classes4.dex */
public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {

    /* renamed from: n  reason: collision with root package name */
    private static final CharSequence f48015n = "";

    /* renamed from: b  reason: collision with root package name */
    private Runnable f48016b;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnClickListener f48017c;

    /* renamed from: d  reason: collision with root package name */
    private final IcsLinearLayout f48018d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f48019e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f48020f;

    /* renamed from: g  reason: collision with root package name */
    private int f48021g;

    /* renamed from: h  reason: collision with root package name */
    private int f48022h;

    /* renamed from: i  reason: collision with root package name */
    private d f48023i;

    /* renamed from: j  reason: collision with root package name */
    private int f48024j;

    /* renamed from: k  reason: collision with root package name */
    private int f48025k;

    /* renamed from: l  reason: collision with root package name */
    private int f48026l;

    /* renamed from: m  reason: collision with root package name */
    private int f48027m;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = TabPageIndicator.this.f48019e.getCurrentItem();
            int b5 = ((e) view).b();
            TabPageIndicator.this.f48019e.setCurrentItem(b5);
            if (currentItem != b5 || TabPageIndicator.this.f48023i == null) {
                return;
            }
            TabPageIndicator.this.f48023i.a(b5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f48029b;

        b(View view) {
            this.f48029b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            TabPageIndicator.this.smoothScrollTo(this.f48029b.getLeft() - ((TabPageIndicator.this.getWidth() - this.f48029b.getWidth()) / 2), 0);
            TabPageIndicator.this.f48016b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48031b;

        c(int i4) {
            this.f48031b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TabPageIndicator.this.setCurrentItem(this.f48031b);
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class e extends TextView {

        /* renamed from: b  reason: collision with root package name */
        private int f48033b;

        public e(Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }

        public int b() {
            return this.f48033b;
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (TabPageIndicator.this.f48021g <= 0 || getMeasuredWidth() <= TabPageIndicator.this.f48021g) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.f48021g, 1073741824), i5);
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    private void e(int i4, CharSequence charSequence, int i5) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(0, -1, 1.0f);
        layoutParams.setMargins(40, 0, 40, 0);
        e eVar = new e(getContext());
        eVar.f48033b = i4;
        eVar.setFocusable(true);
        eVar.setOnClickListener(this.f48017c);
        eVar.setText(charSequence);
        eVar.setTextSize(16.0f);
        eVar.setTextColor(this.f48024j);
        eVar.setGravity(17);
        if (i5 != 0) {
            eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, i5);
        }
        eVar.setOnClickListener(new c(i4));
        this.f48018d.addView(eVar, layoutParams);
    }

    private void f(int i4) {
        View childAt = this.f48018d.getChildAt(i4);
        Runnable runnable = this.f48016b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        b bVar = new b(childAt);
        this.f48016b = bVar;
        post(bVar);
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void notifyDataSetChanged() {
        this.f48018d.removeAllViews();
        PagerAdapter adapter = this.f48019e.getAdapter();
        v1 v1Var = adapter instanceof v1 ? (v1) adapter : null;
        int count = adapter.getCount();
        for (int i4 = 0; i4 < count; i4++) {
            CharSequence pageTitle = adapter.getPageTitle(i4);
            if (pageTitle == null) {
                pageTitle = f48015n;
            }
            int i5 = R.drawable.line_main_color;
            if (v1Var != null) {
                i5 = v1Var.a(i4);
            }
            e(i4, pageTitle, i5);
        }
        if (this.f48022h > count) {
            this.f48022h = count - 1;
        }
        setCurrentItem(this.f48022h);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f48016b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f48016b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        boolean z4 = mode == 1073741824;
        setFillViewport(z4);
        int childCount = this.f48018d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f48021g = -1;
        } else if (childCount > 2) {
            this.f48021g = (int) (View.MeasureSpec.getSize(i4) * 0.4f);
        } else {
            this.f48021g = View.MeasureSpec.getSize(i4) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i4, i5);
        int measuredWidth2 = getMeasuredWidth();
        if (!z4 || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.f48022h);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48020f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i4);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48020f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i4, f5, i5);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        setCurrentItem(i4);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48020f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i4);
        }
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setCurrentItem(int i4) {
        ViewPager viewPager = this.f48019e;
        if (viewPager == null) {
            return;
        }
        this.f48022h = i4;
        viewPager.setCurrentItem(i4);
        int childCount = this.f48018d.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.f48018d.getChildAt(i5);
            boolean z4 = i5 == i4;
            e eVar = (e) childAt;
            if (i5 == i4) {
                eVar.setTextColor(this.f48025k);
                eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, this.f48026l);
            } else {
                eVar.setTextColor(this.f48024j);
                eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, this.f48027m);
            }
            childAt.setSelected(z4);
            if (z4) {
                f(i4);
            }
            i5++;
        }
    }

    public void setNormalBottomDrawableBound(int i4) {
        this.f48027m = i4;
    }

    public void setNormalTextColor(int i4) {
        this.f48024j = i4;
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f48020f = onPageChangeListener;
    }

    public void setOnTabReselectedListener(d dVar) {
        this.f48023i = dVar;
    }

    public void setSelectedBottomDrawableBounds(int i4) {
        this.f48026l = i4;
    }

    public void setSelectedTextColor(int i4) {
        this.f48025k = i4;
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f48019e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.f48019e = viewPager;
            viewPager.setOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48017c = new a();
        this.f48024j = -9868951;
        this.f48025k = -688602;
        this.f48026l = R.drawable.line_main_color;
        this.f48027m = R.drawable.line_white;
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiTabPageIndicatorStyle);
        this.f48018d = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager, int i4) {
        setViewPager(viewPager);
        setCurrentItem(i4);
    }
}
