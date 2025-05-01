package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SlidingTabClassifyLayout extends HorizontalScrollView {

    /* renamed from: o  reason: collision with root package name */
    private static final int f47728o = 24;

    /* renamed from: p  reason: collision with root package name */
    private static final int f47729p = 16;

    /* renamed from: q  reason: collision with root package name */
    private static final int f47730q = 12;

    /* renamed from: b  reason: collision with root package name */
    private int f47731b;

    /* renamed from: c  reason: collision with root package name */
    private int f47732c;

    /* renamed from: d  reason: collision with root package name */
    private int f47733d;

    /* renamed from: e  reason: collision with root package name */
    private int f47734e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47735f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager f47736g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray<String> f47737h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47738i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f47739j;

    /* renamed from: k  reason: collision with root package name */
    private List<TextView> f47740k;

    /* renamed from: l  reason: collision with root package name */
    private List<TextView> f47741l;

    /* renamed from: m  reason: collision with root package name */
    LinearLayout.LayoutParams f47742m;

    /* renamed from: n  reason: collision with root package name */
    LinearLayout.LayoutParams f47743n;

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private int f47744b;

        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            this.f47744b = i4;
            if (SlidingTabClassifyLayout.this.f47738i != null) {
                SlidingTabClassifyLayout.this.f47738i.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            int childCount = SlidingTabClassifyLayout.this.f47739j.getChildCount();
            if (childCount == 0 || i4 < 0 || i4 >= childCount) {
                return;
            }
            SlidingTabClassifyLayout.this.f47739j.b(i4, f5);
            View childAt = SlidingTabClassifyLayout.this.f47739j.getChildAt(i4);
            SlidingTabClassifyLayout.this.i(i4, childAt != null ? (int) (childAt.getWidth() * f5) : 0);
            if (SlidingTabClassifyLayout.this.f47738i != null) {
                SlidingTabClassifyLayout.this.f47738i.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (this.f47744b == 0) {
                SlidingTabClassifyLayout.this.f47739j.b(i4, 0.0f);
                SlidingTabClassifyLayout.this.i(i4, 0);
            }
            int i5 = 0;
            while (i5 < SlidingTabClassifyLayout.this.f47739j.getChildCount()) {
                SlidingTabClassifyLayout.this.f47739j.getChildAt(i5).setSelected(i4 == i5);
                i5++;
            }
            if (SlidingTabClassifyLayout.this.f47738i != null) {
                SlidingTabClassifyLayout.this.f47738i.onPageSelected(i4);
            }
            for (int i6 = 0; i6 < SlidingTabClassifyLayout.this.f47740k.size(); i6++) {
                TextView textView = (TextView) SlidingTabClassifyLayout.this.f47741l.get(i6);
                TextView textView2 = (TextView) SlidingTabClassifyLayout.this.f47740k.get(i6);
                if (i6 == i4) {
                    textView2.setBackgroundColor(-1);
                    textView2.setTextColor(SlidingTabClassifyLayout.this.getResources().getColor(R.color.classify_title_color));
                    textView.setBackgroundColor(-1);
                } else {
                    textView2.setBackgroundColor(-1);
                    textView2.setTextColor(SlidingTabClassifyLayout.this.getResources().getColor(R.color.classify_plat_color));
                    textView.setBackgroundColor(-1);
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
            for (int i4 = 0; i4 < SlidingTabClassifyLayout.this.f47739j.getChildCount(); i4++) {
                if (view == SlidingTabClassifyLayout.this.f47739j.getChildAt(i4)) {
                    SlidingTabClassifyLayout.this.f47736g.setCurrentItem(i4);
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        int a(int i4);
    }

    public SlidingTabClassifyLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.widget.LinearLayout, com.join.mgps.customview.d0] */
    private void h() {
        View view;
        TextView textView;
        TextView textView2;
        PagerAdapter adapter = this.f47736g.getAdapter();
        c cVar = new c();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            if (this.f47732c != 0) {
                view = LayoutInflater.from(getContext()).inflate(this.f47732c, (ViewGroup) this.f47739j, false);
                textView = (TextView) view.findViewById(this.f47733d);
                textView2 = (TextView) view.findViewById(this.f47734e);
                this.f47740k.add(textView);
                this.f47741l.add(textView2);
            } else {
                view = null;
                textView = null;
                textView2 = null;
            }
            if (view == null) {
                view = g(getContext());
            }
            if (textView == null && TextView.class.isInstance(view)) {
                textView = view;
            }
            if (this.f47735f) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            textView.setText(adapter.getPageTitle(i4));
            textView.setTextColor(getResources().getColor(R.color.classify_plat_color));
            textView2.setBackgroundColor(-1);
            view.setOnClickListener(cVar);
            String str = this.f47737h.get(i4, null);
            if (str != null) {
                view.setContentDescription(str);
            }
            this.f47739j.addView(view);
            if (i4 == this.f47736g.getCurrentItem()) {
                view.setSelected(true);
                view.setBackgroundColor(-1);
                textView.setTextColor(getResources().getColor(R.color.classify_title_color));
                textView2.setBackgroundColor(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i4, int i5) {
        View childAt;
        int childCount = this.f47739j.getChildCount();
        if (childCount == 0 || i4 < 0 || i4 >= childCount || (childAt = this.f47739j.getChildAt(i4)) == null) {
            return;
        }
        int left = childAt.getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47731b;
        }
        scrollTo(left, 0);
    }

    protected LinearLayout g(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        textView.setBackgroundResource(typedValue.resourceId);
        int i4 = (int) (getResources().getDisplayMetrics().density * 16.0f);
        textView.setPadding(i4, i4, i4, i4);
        linearLayout.addView(textView, this.f47742m);
        linearLayout.addView(new TextView(context), this.f47743n);
        return linearLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f47736g;
        if (viewPager != null) {
            i(viewPager.getCurrentItem(), 0);
        }
    }

    public void setContentDescription(int i4, String str) {
        this.f47737h.put(i4, str);
    }

    public void setCustomTabColorizer(d dVar) {
        this.f47739j.d((SlidingTabLayout.d) dVar);
    }

    public void setCustomTabView(int i4, int i5, int i6) {
        this.f47732c = i4;
        this.f47733d = i5;
        this.f47734e = i6;
    }

    public void setDistributeEvenly(boolean z4) {
        this.f47735f = z4;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47738i = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f47739j.e(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47739j.removeAllViews();
        this.f47736g = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new b());
            h();
        }
    }

    public SlidingTabClassifyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabClassifyLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47737h = new SparseArray<>();
        this.f47740k = new ArrayList();
        this.f47741l = new ArrayList();
        this.f47742m = new LinearLayout.LayoutParams(-1, -2);
        this.f47743n = new LinearLayout.LayoutParams(-1, 10);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47731b = (int) (getResources().getDisplayMetrics().density * 24.0f);
        d0 d0Var = new d0(context);
        this.f47739j = d0Var;
        addView(d0Var, -1, -2);
    }
}
