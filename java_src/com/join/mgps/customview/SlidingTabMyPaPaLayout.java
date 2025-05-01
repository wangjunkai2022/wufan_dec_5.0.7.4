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
public class SlidingTabMyPaPaLayout extends HorizontalScrollView {

    /* renamed from: l  reason: collision with root package name */
    private static final int f47965l = 24;

    /* renamed from: m  reason: collision with root package name */
    private static final int f47966m = 16;

    /* renamed from: n  reason: collision with root package name */
    private static final int f47967n = 12;

    /* renamed from: b  reason: collision with root package name */
    private int f47968b;

    /* renamed from: c  reason: collision with root package name */
    private int f47969c;

    /* renamed from: d  reason: collision with root package name */
    private int f47970d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47971e;

    /* renamed from: f  reason: collision with root package name */
    private int f47972f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager f47973g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray<String> f47974h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47975i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f47976j;

    /* renamed from: k  reason: collision with root package name */
    private List<TextView> f47977k;

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private int f47978b;

        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            this.f47978b = i4;
            if (SlidingTabMyPaPaLayout.this.f47975i != null) {
                SlidingTabMyPaPaLayout.this.f47975i.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            int childCount = SlidingTabMyPaPaLayout.this.f47976j.getChildCount();
            if (childCount == 0 || i4 < 0 || i4 >= childCount) {
                return;
            }
            SlidingTabMyPaPaLayout.this.f47976j.b(i4, f5);
            View childAt = SlidingTabMyPaPaLayout.this.f47976j.getChildAt(i4);
            SlidingTabMyPaPaLayout.this.h(i4, childAt != null ? (int) (childAt.getWidth() * f5) : 0);
            if (SlidingTabMyPaPaLayout.this.f47975i != null) {
                SlidingTabMyPaPaLayout.this.f47975i.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (this.f47978b == 0) {
                SlidingTabMyPaPaLayout.this.f47976j.b(i4, 0.0f);
                SlidingTabMyPaPaLayout.this.h(i4, 0);
            }
            int i5 = 0;
            while (i5 < SlidingTabMyPaPaLayout.this.f47976j.getChildCount()) {
                SlidingTabMyPaPaLayout.this.f47976j.getChildAt(i5).setSelected(i4 == i5);
                i5++;
            }
            if (SlidingTabMyPaPaLayout.this.f47975i != null) {
                SlidingTabMyPaPaLayout.this.f47975i.onPageSelected(i4);
            }
            for (int i6 = 0; i6 < SlidingTabMyPaPaLayout.this.f47977k.size(); i6++) {
                TextView textView = (TextView) SlidingTabMyPaPaLayout.this.f47977k.get(i6);
                if (i6 == i4) {
                    textView.setTextColor(SlidingTabMyPaPaLayout.this.getResources().getColor(R.color.main_yello_color));
                } else {
                    textView.setTextColor(SlidingTabMyPaPaLayout.this.getResources().getColor(R.color.grid_text));
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
            for (int i4 = 0; i4 < SlidingTabMyPaPaLayout.this.f47976j.getChildCount(); i4++) {
                if (view == SlidingTabMyPaPaLayout.this.f47976j.getChildAt(i4)) {
                    SlidingTabMyPaPaLayout.this.f47973g.setCurrentItem(i4);
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d extends SlidingTabLayout.d {
        @Override // com.join.mgps.customview.SlidingTabLayout.d
        int a(int i4);
    }

    public SlidingTabMyPaPaLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.widget.LinearLayout, com.join.mgps.customview.d0] */
    private void g() {
        View view;
        TextView textView;
        PagerAdapter adapter = this.f47973g.getAdapter();
        c cVar = new c();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            if (this.f47969c != 0) {
                view = LayoutInflater.from(getContext()).inflate(this.f47969c, (ViewGroup) this.f47976j, false);
                textView = (TextView) view.findViewById(this.f47970d);
                this.f47977k.add(textView);
            } else {
                view = null;
                textView = null;
            }
            if (view == null) {
                view = f(getContext());
            }
            if (textView == null && TextView.class.isInstance(view)) {
                textView = view;
            }
            if (this.f47971e) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                int i5 = this.f47972f;
                layoutParams.setMargins(i5, 0, i5, 0);
            }
            textView.setText(adapter.getPageTitle(i4));
            view.setOnClickListener(cVar);
            String str = this.f47974h.get(i4, null);
            if (str != null) {
                view.setContentDescription(str);
            }
            this.f47976j.addView(view);
            if (i4 == this.f47973g.getCurrentItem()) {
                view.setSelected(true);
                textView.setTextColor(getResources().getColor(R.color.classify_title_color));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i4, int i5) {
        View childAt;
        int childCount = this.f47976j.getChildCount();
        if (childCount == 0 || i4 < 0 || i4 >= childCount || (childAt = this.f47976j.getChildAt(i4)) == null) {
            return;
        }
        int left = childAt.getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47968b;
        }
        scrollTo(left, 0);
    }

    protected TextView f(Context context) {
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
        return textView;
    }

    public int getMarginWidth() {
        return this.f47972f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f47973g;
        if (viewPager != null) {
            h(viewPager.getCurrentItem(), 0);
        }
    }

    public void setContentDescription(int i4, String str) {
        this.f47974h.put(i4, str);
    }

    public void setCustomTabColorizer(d dVar) {
        this.f47976j.d(dVar);
    }

    public void setCustomTabView(int i4, int i5) {
        this.f47969c = i4;
        this.f47970d = i5;
    }

    public void setDistributeEvenly(boolean z4) {
        this.f47971e = z4;
    }

    public void setMarginWidth(int i4) {
        this.f47972f = i4;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47975i = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f47976j.e(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47976j.removeAllViews();
        this.f47973g = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new b());
            g();
        }
    }

    public SlidingTabMyPaPaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabMyPaPaLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47974h = new SparseArray<>();
        this.f47977k = new ArrayList();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47968b = (int) (getResources().getDisplayMetrics().density * 24.0f);
        d0 d0Var = new d0(context);
        this.f47976j = d0Var;
        addView(d0Var, -1, -2);
    }
}
