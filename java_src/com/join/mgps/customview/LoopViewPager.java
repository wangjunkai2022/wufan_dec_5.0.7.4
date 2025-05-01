package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class LoopViewPager extends ViewPager {

    /* renamed from: l  reason: collision with root package name */
    public static final int f47357l = 5;

    /* renamed from: m  reason: collision with root package name */
    private static final boolean f47358m = false;

    /* renamed from: n  reason: collision with root package name */
    public static final int f47359n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f47360o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f47361p = 2;

    /* renamed from: b  reason: collision with root package name */
    ViewPager.OnPageChangeListener f47362b;

    /* renamed from: c  reason: collision with root package name */
    private LoopPagerAdapterWrapper f47363c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47364d;

    /* renamed from: e  reason: collision with root package name */
    private int f47365e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47366f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledExecutorService f47367g;

    /* renamed from: h  reason: collision with root package name */
    boolean f47368h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f47369i;

    /* renamed from: j  reason: collision with root package name */
    private float f47370j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f47371k;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LifeCycle {
    }

    /* loaded from: classes4.dex */
    class a implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private float f47372b = -1.0f;

        /* renamed from: c  reason: collision with root package name */
        private float f47373c = -1.0f;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (LoopViewPager.this.f47363c != null) {
                int currentItem = LoopViewPager.super.getCurrentItem();
                int h4 = LoopViewPager.this.f47363c.h(currentItem);
                if (i4 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.f47363c.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(h4, false);
                }
            }
            ViewPager.OnPageChangeListener onPageChangeListener = LoopViewPager.this.f47362b;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            if (LoopViewPager.this.f47363c != null) {
                int h4 = LoopViewPager.this.f47363c.h(i4);
                if (f5 == 0.0f && this.f47372b == 0.0f && (i4 == 0 || i4 == LoopViewPager.this.f47363c.getCount() - 1)) {
                    LoopViewPager.this.setCurrentItem(h4, false);
                }
                this.f47372b = f5;
                LoopViewPager loopViewPager = LoopViewPager.this;
                if (loopViewPager.f47362b != null) {
                    if (h4 != loopViewPager.f47363c.c() - 1) {
                        LoopViewPager.this.f47362b.onPageScrolled(h4, f5, i5);
                    } else if (f5 > 0.5d) {
                        LoopViewPager.this.f47362b.onPageScrolled(0, 0.0f, 0);
                    } else {
                        LoopViewPager.this.f47362b.onPageScrolled(h4, 0.0f, 0);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            int h4 = LoopViewPager.this.f47363c.h(i4);
            float f5 = h4;
            if (this.f47373c != f5) {
                this.f47373c = f5;
                ViewPager.OnPageChangeListener onPageChangeListener = LoopViewPager.this.f47362b;
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageSelected(h4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (LoopViewPager.this.getCurrentItem() == LoopViewPager.this.getAdapter().getCount() - 1) {
                    LoopViewPager.this.setCurrentItem(2, false);
                } else if (LoopViewPager.this.getCurrentItem() >= LoopViewPager.this.getAdapter().getCount() - 2) {
                    LoopViewPager.this.setCurrentItem(1, false);
                } else {
                    LoopViewPager loopViewPager = LoopViewPager.this;
                    loopViewPager.setCurrentItem(loopViewPager.getCurrentItem() + 1);
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = LoopViewPager.this.f47365e;
            if (i4 != 0) {
                if (i4 != 2) {
                    return;
                }
                LoopViewPager.this.g();
                return;
            }
            LoopViewPager loopViewPager = LoopViewPager.this;
            if (!loopViewPager.f47368h) {
                if (loopViewPager.f47366f || LoopViewPager.this.getAdapter() == null || LoopViewPager.this.getAdapter().getCount() <= 1) {
                    return;
                }
                LoopViewPager.this.post(new a());
                return;
            }
            loopViewPager.f47368h = false;
        }
    }

    public LoopViewPager(Context context) {
        super(context);
        this.f47364d = false;
        this.f47365e = 0;
        this.f47366f = false;
        this.f47368h = false;
        this.f47369i = new a();
        this.f47370j = 0.0f;
        this.f47371k = false;
        f();
    }

    private void f() {
        super.setOnPageChangeListener(this.f47369i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ScheduledExecutorService scheduledExecutorService = this.f47367g;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f47367g.shutdown();
        }
        this.f47367g = null;
    }

    public static int j(int i4, int i5) {
        int i6 = i4 - 1;
        return i6 < 0 ? i6 + i5 : i6 % i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47370j = 0.0f;
            this.f47371k = false;
        } else if (action == 1) {
            this.f47370j = 0.0f;
            this.f47371k = false;
        } else if (action == 2) {
            float f5 = this.f47370j;
            if (f5 != 0.0f) {
                this.f47370j = f5 - motionEvent.getX();
            }
            if (Math.abs(this.f47370j) > 5.0f) {
                this.f47371k = true;
            }
            getParent().requestDisallowInterceptTouchEvent(this.f47371k);
            this.f47370j = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        return this.f47363c;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f47363c;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.h(super.getCurrentItem());
        }
        return 0;
    }

    public void h() {
        i(3);
    }

    public void i(int i4) {
        g();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f47367g = newSingleThreadScheduledExecutor;
        long j4 = i4 * 1000;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new b(), j4, j4, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L14
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto L14
            r1 = 3
            if (r0 == r1) goto L10
            goto L18
        L10:
            r0 = 0
            r3.f47366f = r0
            goto L18
        L14:
            r3.f47366f = r1
            r3.f47368h = r1
        L18:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.LoopViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(pagerAdapter);
        this.f47363c = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.f(this.f47364d);
        super.setAdapter(this.f47363c);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z4) {
        this.f47364d = z4;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.f47363c;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.f(z4);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4, boolean z4) {
        try {
            super.setCurrentItem(this.f47363c.g(i4), z4);
        } catch (Exception unused) {
        }
    }

    public void setLifeCycle(int i4) {
        this.f47365e = i4;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47362b = onPageChangeListener;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) {
        if (getCurrentItem() != i4) {
            setCurrentItem(i4, true);
        }
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47364d = false;
        this.f47365e = 0;
        this.f47366f = false;
        this.f47368h = false;
        this.f47369i = new a();
        this.f47370j = 0.0f;
        this.f47371k = false;
        f();
    }
}
