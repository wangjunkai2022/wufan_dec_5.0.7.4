package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class CarouselViewPager2 extends ViewPager {

    /* renamed from: f  reason: collision with root package name */
    public static final int f46457f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f46458g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f46459h = 2;

    /* renamed from: b  reason: collision with root package name */
    private int f46460b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46461c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledExecutorService f46462d;

    /* renamed from: e  reason: collision with root package name */
    boolean f46463e;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LifeCycle {
    }

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: com.join.mgps.customview.CarouselViewPager2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0351a implements Runnable {
            RunnableC0351a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CarouselViewPager2.this.getCurrentItem() == CarouselViewPager2.this.getAdapter().getCount() - 1) {
                    CarouselViewPager2.this.setCurrentItem(2, false);
                } else if (CarouselViewPager2.this.getCurrentItem() >= CarouselViewPager2.this.getAdapter().getCount() - 2) {
                    CarouselViewPager2.this.setCurrentItem(1, false);
                } else {
                    CarouselViewPager2 carouselViewPager2 = CarouselViewPager2.this;
                    carouselViewPager2.setCurrentItem(carouselViewPager2.getCurrentItem() + 1);
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = CarouselViewPager2.this.f46460b;
            if (i4 != 0) {
                if (i4 != 2) {
                    return;
                }
                CarouselViewPager2.this.d();
                return;
            }
            CarouselViewPager2 carouselViewPager2 = CarouselViewPager2.this;
            if (!carouselViewPager2.f46463e) {
                if (carouselViewPager2.f46461c || CarouselViewPager2.this.getAdapter() == null || CarouselViewPager2.this.getAdapter().getCount() <= 1) {
                    return;
                }
                CarouselViewPager2.this.post(new RunnableC0351a());
                return;
            }
            carouselViewPager2.f46463e = false;
        }
    }

    public CarouselViewPager2(Context context) {
        super(context);
        this.f46460b = 0;
        this.f46461c = false;
        this.f46463e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ScheduledExecutorService scheduledExecutorService = this.f46462d;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f46462d.shutdown();
        }
        this.f46462d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f46462d = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new a(), 4000L, 4000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
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
            r3.f46461c = r0
            goto L18
        L14:
            r3.f46461c = r1
            r3.f46463e = r1
        L18:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.CarouselViewPager2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLifeCycle(int i4) {
        this.f46460b = i4;
    }

    public CarouselViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46460b = 0;
        this.f46461c = false;
        this.f46463e = false;
    }
}
