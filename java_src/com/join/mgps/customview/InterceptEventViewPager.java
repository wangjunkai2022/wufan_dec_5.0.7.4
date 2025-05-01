package com.join.mgps.customview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class InterceptEventViewPager extends ViewPager {

    /* renamed from: o  reason: collision with root package name */
    private static final String f47225o = "InterceptEventViewPager";

    /* renamed from: b  reason: collision with root package name */
    private int f47226b;

    /* renamed from: c  reason: collision with root package name */
    private int f47227c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47228d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47229e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47230f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47231g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47232h;

    /* renamed from: i  reason: collision with root package name */
    private int f47233i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47234j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f47235k;

    /* renamed from: l  reason: collision with root package name */
    private View.OnTouchListener f47236l;

    /* renamed from: m  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47237m;

    /* renamed from: n  reason: collision with root package name */
    private c f47238n;

    /* loaded from: classes4.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && (view instanceof ViewGroup) && !InterceptEventViewPager.this.o() && !InterceptEventViewPager.this.p()) {
                ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                if (InterceptEventViewPager.this.o() && InterceptEventViewPager.this.f47233i == 0) {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
                } else if (InterceptEventViewPager.this.p() && InterceptEventViewPager.this.f47233i == InterceptEventViewPager.this.f47226b - 1) {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
                } else {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (InterceptEventViewPager.this.f47238n != null) {
                InterceptEventViewPager.this.f47238n.onPageScrollStateChanged(i4);
            }
            InterceptEventViewPager.this.f47227c = i4;
            if (i4 == 1) {
                InterceptEventViewPager.this.f47228d = true;
                return;
            }
            InterceptEventViewPager.this.f47232h = false;
            InterceptEventViewPager.this.f47231g = false;
            InterceptEventViewPager.this.f47230f = false;
            InterceptEventViewPager.this.f47229e = false;
            InterceptEventViewPager.this.f47228d = false;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            if (InterceptEventViewPager.this.f47238n != null) {
                InterceptEventViewPager.this.f47238n.onPageScrolled(i4, f5, i5);
            }
            if (i4 == InterceptEventViewPager.this.f47233i) {
                InterceptEventViewPager.this.f47232h = true;
            } else {
                InterceptEventViewPager.this.f47231g = true;
            }
            if (InterceptEventViewPager.this.f47228d) {
                if (i4 == 0) {
                    if (i5 == 0 && InterceptEventViewPager.this.f47227c == 1) {
                        InterceptEventViewPager.this.f47230f = true;
                    }
                } else if (i4 == InterceptEventViewPager.this.f47226b - 1 && i5 == 0 && InterceptEventViewPager.this.f47227c == 1) {
                    InterceptEventViewPager.this.f47229e = true;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (InterceptEventViewPager.this.f47238n != null) {
                InterceptEventViewPager.this.f47238n.onPageSelected(i4);
            }
            InterceptEventViewPager.this.f47233i = i4;
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void onPageScrollStateChanged(int i4);

        void onPageScrolled(int i4, float f5, int i5);

        void onPageSelected(int i4);
    }

    public InterceptEventViewPager(Context context) {
        this(context, null);
    }

    private void m() {
        setOnPageChangeListener(this.f47237m);
        setOnTouchListener(this.f47236l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z4, int i4, int i5, int i6) {
        if (view != this) {
            try {
                if ((view instanceof ViewPager) && Build.VERSION.SDK_INT < 11 && this.f47235k) {
                    ViewPager viewPager = (ViewPager) view;
                    int currentItem = viewPager.getCurrentItem();
                    if (currentItem != viewPager.getAdapter().getCount() - 1 || i4 >= 0) {
                        return currentItem != 0 || i4 <= 0;
                    }
                    return false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return super.canScroll(view, z4, i4, i5, i6);
    }

    public boolean n() {
        return this.f47234j;
    }

    public boolean o() {
        return this.f47230f;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47234j) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f47234j) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean p() {
        return this.f47229e;
    }

    public boolean q() {
        return this.f47231g;
    }

    public boolean r() {
        return this.f47232h;
    }

    public boolean s() {
        return this.f47228d;
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        super.scrollTo(i4, i5);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            super.setAdapter(pagerAdapter);
            this.f47226b = pagerAdapter.getCount();
        }
    }

    public void setCanScrollView(boolean z4) {
        this.f47234j = z4;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) {
        super.setCurrentItem(i4, false);
    }

    public void setIsAsParentViewPager(boolean z4) {
        this.f47235k = z4;
    }

    public void setViewPagerCallback(c cVar) {
        this.f47238n = cVar;
    }

    public InterceptEventViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47228d = false;
        this.f47229e = false;
        this.f47230f = false;
        this.f47231g = false;
        this.f47232h = false;
        this.f47234j = true;
        this.f47235k = false;
        this.f47236l = new a();
        this.f47237m = new b();
        m();
    }
}
