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
import com.join.mgps.customview.TabPageIndicator;
/* loaded from: classes4.dex */
public class TabPageBoxIndicator extends HorizontalScrollView implements PageIndicator {

    /* renamed from: n  reason: collision with root package name */
    private static final CharSequence f47995n = "";

    /* renamed from: b  reason: collision with root package name */
    private Runnable f47996b;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnClickListener f47997c;

    /* renamed from: d  reason: collision with root package name */
    private final IcsLinearLayout f47998d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f47999e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f48000f;

    /* renamed from: g  reason: collision with root package name */
    private int f48001g;

    /* renamed from: h  reason: collision with root package name */
    private int f48002h;

    /* renamed from: i  reason: collision with root package name */
    private TabPageIndicator.d f48003i;

    /* renamed from: j  reason: collision with root package name */
    private int f48004j;

    /* renamed from: k  reason: collision with root package name */
    private int f48005k;

    /* renamed from: l  reason: collision with root package name */
    private int f48006l;

    /* renamed from: m  reason: collision with root package name */
    private int f48007m;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = TabPageBoxIndicator.this.f47999e.getCurrentItem();
            int b5 = ((e) view).b();
            TabPageBoxIndicator.this.f47999e.setCurrentItem(b5);
            if (currentItem != b5 || TabPageBoxIndicator.this.f48003i == null) {
                return;
            }
            TabPageBoxIndicator.this.f48003i.a(b5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f48009b;

        b(View view) {
            this.f48009b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            TabPageBoxIndicator.this.smoothScrollTo(this.f48009b.getLeft() - ((TabPageBoxIndicator.this.getWidth() - this.f48009b.getWidth()) / 2), 0);
            TabPageBoxIndicator.this.f47996b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48011b;

        c(int i4) {
            this.f48011b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TabPageBoxIndicator.this.setCurrentItem(this.f48011b);
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
        private int f48013b;

        public e(Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }

        public int b() {
            return this.f48013b;
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (TabPageBoxIndicator.this.f48001g <= 0 || getMeasuredWidth() <= TabPageBoxIndicator.this.f48001g) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageBoxIndicator.this.f48001g, 1073741824), i5);
        }
    }

    public TabPageBoxIndicator(Context context) {
        this(context, null);
    }

    private void e(int i4, CharSequence charSequence, int i5) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(0, -1, 1.0f);
        layoutParams.setMargins(com.join.mgps.Util.c0.a(getContext(), 13.0f), com.join.mgps.Util.c0.a(getContext(), 10.0f), com.join.mgps.Util.c0.a(getContext(), 13.0f), com.join.mgps.Util.c0.a(getContext(), 9.0f));
        e eVar = new e(getContext());
        eVar.f48013b = i4;
        eVar.setFocusable(true);
        eVar.setOnClickListener(this.f47997c);
        eVar.setText(charSequence);
        eVar.setTextSize(16.0f);
        eVar.setPadding(com.join.mgps.Util.c0.a(getContext(), 18.0f), com.join.mgps.Util.c0.a(getContext(), 2.0f), com.join.mgps.Util.c0.a(getContext(), 18.0f), com.join.mgps.Util.c0.a(getContext(), 2.0f));
        eVar.setTextColor(this.f48004j);
        eVar.setGravity(17);
        eVar.setBackgroundResource(R.drawable.bg_border_8a8a8a_6);
        if (i5 != 0) {
            eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, i5);
        }
        eVar.setOnClickListener(new c(i4));
        this.f47998d.addView(eVar, layoutParams);
    }

    private void f(int i4) {
        View childAt = this.f47998d.getChildAt(i4);
        Runnable runnable = this.f47996b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        b bVar = new b(childAt);
        this.f47996b = bVar;
        post(bVar);
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void notifyDataSetChanged() {
        this.f47998d.removeAllViews();
        PagerAdapter adapter = this.f47999e.getAdapter();
        v1 v1Var = adapter instanceof v1 ? (v1) adapter : null;
        int count = adapter.getCount();
        for (int i4 = 0; i4 < count; i4++) {
            CharSequence pageTitle = adapter.getPageTitle(i4);
            if (pageTitle == null) {
                pageTitle = f47995n;
            }
            int i5 = R.drawable.line_main_color;
            if (v1Var != null) {
                i5 = v1Var.a(i4);
            }
            e(i4, pageTitle, i5);
        }
        if (this.f48002h > count) {
            this.f48002h = count - 1;
        }
        setCurrentItem(this.f48002h);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f47996b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f47996b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        boolean z4 = mode == 1073741824;
        setFillViewport(z4);
        int childCount = this.f47998d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f48001g = -1;
        } else if (childCount > 2) {
            this.f48001g = (int) (View.MeasureSpec.getSize(i4) * 0.4f);
        } else {
            this.f48001g = View.MeasureSpec.getSize(i4) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i4, i5);
        int measuredWidth2 = getMeasuredWidth();
        if (!z4 || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.f48002h);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48000f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i4);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48000f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i4, f5, i5);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        setCurrentItem(i4);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f48000f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i4);
        }
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setCurrentItem(int i4) {
        ViewPager viewPager = this.f47999e;
        if (viewPager == null) {
            return;
        }
        this.f48002h = i4;
        viewPager.setCurrentItem(i4);
        int childCount = this.f47998d.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.f47998d.getChildAt(i5);
            boolean z4 = i5 == i4;
            e eVar = (e) childAt;
            if (i5 == i4) {
                eVar.setBackgroundResource(R.drawable.bg_border_f47500_6);
                eVar.setTextColor(this.f48005k);
                eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, this.f48006l);
            } else {
                eVar.setBackgroundResource(R.drawable.bg_border_8a8a8a_6);
                eVar.setTextColor(this.f48004j);
                eVar.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, this.f48007m);
            }
            childAt.setSelected(z4);
            if (z4) {
                f(i4);
            }
            i5++;
        }
    }

    public void setNormalBottomDrawableBound(int i4) {
        this.f48007m = i4;
    }

    public void setNormalTextColor(int i4) {
        this.f48004j = i4;
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f48000f = onPageChangeListener;
    }

    public void setOnTabReselectedListener(TabPageIndicator.d dVar) {
        this.f48003i = dVar;
    }

    public void setSelectedBottomDrawableBounds(int i4) {
        this.f48006l = i4;
    }

    public void setSelectedTextColor(int i4) {
        this.f48005k = i4;
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f47999e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.f47999e = viewPager;
            viewPager.setOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public TabPageBoxIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47997c = new a();
        this.f48004j = -7697782;
        this.f48005k = -1;
        this.f48006l = R.drawable.line_main_color;
        this.f48007m = R.drawable.line_white;
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiTabPageIndicatorStyle);
        this.f47998d = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager, int i4) {
        setViewPager(viewPager);
        setCurrentItem(i4);
    }
}
