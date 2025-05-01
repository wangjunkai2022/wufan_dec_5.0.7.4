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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.k0;
import com.join.mgps.customview.SlidingTabLayout;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SlidingTabDetailLayout extends HorizontalScrollView {

    /* renamed from: o  reason: collision with root package name */
    private static final int f47747o = 24;

    /* renamed from: p  reason: collision with root package name */
    private static final int f47748p = 16;

    /* renamed from: q  reason: collision with root package name */
    private static final int f47749q = 12;

    /* renamed from: b  reason: collision with root package name */
    private int f47750b;

    /* renamed from: c  reason: collision with root package name */
    private int f47751c;

    /* renamed from: d  reason: collision with root package name */
    private int f47752d;

    /* renamed from: e  reason: collision with root package name */
    private int f47753e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47754f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager f47755g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray<String> f47756h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47757i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f47758j;

    /* renamed from: k  reason: collision with root package name */
    private List<TextView> f47759k;

    /* renamed from: l  reason: collision with root package name */
    private List<TextView> f47760l;

    /* renamed from: m  reason: collision with root package name */
    LinearLayout.LayoutParams f47761m;

    /* renamed from: n  reason: collision with root package name */
    LinearLayout.LayoutParams f47762n;

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private int f47763b;

        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            this.f47763b = i4;
            if (SlidingTabDetailLayout.this.f47757i != null) {
                SlidingTabDetailLayout.this.f47757i.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            View childAt;
            View childAt2;
            int childCount = SlidingTabDetailLayout.this.f47758j.getChildCount();
            if (childCount == 0 || i4 < 0 || i4 >= childCount) {
                return;
            }
            SlidingTabDetailLayout.this.f47758j.b(i4, f5);
            SlidingTabDetailLayout.this.i(i4, SlidingTabDetailLayout.this.f47758j.getChildAt(i4) != null ? (int) (childAt.getWidth() * f5) : 0);
            if (SlidingTabDetailLayout.this.f47757i != null) {
                SlidingTabDetailLayout.this.f47757i.onPageScrolled(i4, f5, i5);
            }
            if (i4 != 1 || (childAt2 = SlidingTabDetailLayout.this.f47755g.getChildAt(i4 + 1)) == null) {
                return;
            }
            TextView textView = (TextView) childAt2.findViewById(R.id.textGoto);
            ImageView imageView = (ImageView) childAt2.findViewById(R.id.imageGoto);
            double d5 = f5;
            if (d5 >= 0.3d) {
                textView.setText("释\n放\n进\n入\n专\n区\n讨\n论");
                imageView.setRotation(180.0f);
                if (d5 == 0.45d) {
                    ForumBean forumBean = new ForumBean();
                    forumBean.setFid(2);
                    SlidingTabDetailLayout.this.f47755g.setCurrentItem(1);
                    k0.I1(SlidingTabDetailLayout.this.getContext());
                    com.join.mgps.Util.j0.r0(SlidingTabDetailLayout.this.getContext(), forumBean);
                    return;
                }
                return;
            }
            imageView.setRotation(f5 * 60.0f);
            textView.setText("滑\n动\n进\n入\n专\n区\n讨\n论");
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (i4 == 2) {
                ForumBean forumBean = new ForumBean();
                forumBean.setFid(2);
                SlidingTabDetailLayout.this.f47755g.setCurrentItem(1);
                k0.I1(SlidingTabDetailLayout.this.getContext());
                com.join.mgps.Util.j0.r0(SlidingTabDetailLayout.this.getContext(), forumBean);
            }
            if (this.f47763b == 0) {
                SlidingTabDetailLayout.this.f47758j.b(i4, 0.0f);
                SlidingTabDetailLayout.this.i(i4, 0);
            }
            int i5 = 0;
            while (i5 < SlidingTabDetailLayout.this.f47758j.getChildCount()) {
                SlidingTabDetailLayout.this.f47758j.getChildAt(i5).setSelected(i4 == i5);
                i5++;
            }
            if (SlidingTabDetailLayout.this.f47757i != null) {
                SlidingTabDetailLayout.this.f47757i.onPageSelected(i4);
            }
            for (int i6 = 0; i6 < SlidingTabDetailLayout.this.f47759k.size(); i6++) {
                TextView textView = (TextView) SlidingTabDetailLayout.this.f47760l.get(i6);
                TextView textView2 = (TextView) SlidingTabDetailLayout.this.f47759k.get(i6);
                if (i4 != 2) {
                    if (i6 == i4) {
                        textView2.setBackgroundColor(0);
                        textView2.setTextColor(SlidingTabDetailLayout.this.getResources().getColor(R.color.classify_title_color));
                        textView.setBackgroundColor(SlidingTabDetailLayout.this.getResources().getColor(R.color.classify_title_color));
                    } else {
                        textView2.setBackgroundColor(0);
                        textView2.setTextColor(SlidingTabDetailLayout.this.getResources().getColor(R.color.slide_title_color));
                        textView.setBackgroundColor(0);
                    }
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
            for (int i4 = 0; i4 < SlidingTabDetailLayout.this.f47758j.getChildCount(); i4++) {
                if (view == SlidingTabDetailLayout.this.f47758j.getChildAt(i4)) {
                    SlidingTabDetailLayout.this.f47755g.setCurrentItem(i4);
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        int a(int i4);
    }

    public SlidingTabDetailLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.widget.LinearLayout, com.join.mgps.customview.d0] */
    private void h() {
        View view;
        TextView textView;
        TextView textView2;
        PagerAdapter adapter = this.f47755g.getAdapter();
        c cVar = new c();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            if (this.f47751c != 0) {
                view = LayoutInflater.from(getContext()).inflate(this.f47751c, (ViewGroup) this.f47758j, false);
                textView = (TextView) view.findViewById(this.f47752d);
                textView2 = (TextView) view.findViewById(this.f47753e);
                this.f47759k.add(textView);
                this.f47760l.add(textView2);
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
            if (this.f47754f) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            textView.setText(adapter.getPageTitle(i4));
            textView.setTextColor(getResources().getColor(R.color.slide_title_color));
            textView2.setBackgroundColor(0);
            view.setOnClickListener(cVar);
            String str = this.f47756h.get(i4, null);
            if (str != null) {
                view.setContentDescription(str);
            }
            this.f47758j.addView(view);
            if (i4 == this.f47755g.getCurrentItem()) {
                view.setSelected(true);
                view.setBackgroundColor(0);
                textView.setTextColor(getResources().getColor(R.color.classify_title_color));
                textView2.setBackgroundColor(getResources().getColor(R.color.classify_title_color));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i4, int i5) {
        View childAt;
        int childCount = this.f47758j.getChildCount();
        if (childCount == 0 || i4 < 0 || i4 >= childCount || (childAt = this.f47758j.getChildAt(i4)) == null) {
            return;
        }
        int left = childAt.getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47750b;
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
        linearLayout.addView(textView, this.f47761m);
        linearLayout.addView(new TextView(context), this.f47762n);
        return linearLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f47755g;
        if (viewPager != null) {
            i(viewPager.getCurrentItem(), 0);
        }
    }

    public void setContentDescription(int i4, String str) {
        this.f47756h.put(i4, str);
    }

    public void setCustomTabColorizer(d dVar) {
        this.f47758j.d((SlidingTabLayout.d) dVar);
    }

    public void setCustomTabView(int i4, int i5, int i6) {
        this.f47751c = i4;
        this.f47752d = i5;
        this.f47753e = i6;
    }

    public void setDistributeEvenly(boolean z4) {
        this.f47754f = z4;
    }

    public void setOnPageChangeListener() {
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47757i = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f47758j.e(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47758j.removeAllViews();
        this.f47755g = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new b());
            h();
        }
    }

    public SlidingTabDetailLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabDetailLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47756h = new SparseArray<>();
        this.f47759k = new ArrayList();
        this.f47760l = new ArrayList();
        this.f47761m = new LinearLayout.LayoutParams(-1, -2);
        this.f47762n = new LinearLayout.LayoutParams(-1, 10);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f47750b = (int) (getResources().getDisplayMetrics().density * 24.0f);
        d0 d0Var = new d0(context);
        this.f47758j = d0Var;
        addView(d0Var, -1, -2);
    }
}
