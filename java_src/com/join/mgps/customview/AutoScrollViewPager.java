package com.join.mgps.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes4.dex */
public class AutoScrollViewPager<T> extends FrameLayout implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private int f46387b;

    /* renamed from: c  reason: collision with root package name */
    private int f46388c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46389d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f46390e;

    /* renamed from: f  reason: collision with root package name */
    private final int f46391f;

    /* renamed from: g  reason: collision with root package name */
    private final int f46392g;

    /* renamed from: h  reason: collision with root package name */
    private int f46393h;

    /* renamed from: i  reason: collision with root package name */
    private int f46394i;

    /* renamed from: j  reason: collision with root package name */
    private AutoScrollViewPager<T>.c f46395j;

    /* renamed from: k  reason: collision with root package name */
    private AutoScrollViewPager<T>.b f46396k;

    /* renamed from: l  reason: collision with root package name */
    private float f46397l;

    /* renamed from: m  reason: collision with root package name */
    private float f46398m;

    /* renamed from: n  reason: collision with root package name */
    private long f46399n;

    /* renamed from: o  reason: collision with root package name */
    private List<T> f46400o;

    /* renamed from: p  reason: collision with root package name */
    private Handler f46401p;

    /* renamed from: q  reason: collision with root package name */
    private e f46402q;

    /* renamed from: r  reason: collision with root package name */
    private f f46403r;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AutoScrollViewPager.c(AutoScrollViewPager.this);
            AutoScrollViewPager.this.f46390e.setCurrentItem(AutoScrollViewPager.this.f46393h);
            AutoScrollViewPager.this.f46401p.sendEmptyMessageDelayed(1, AutoScrollViewPager.this.f46387b);
        }
    }

    /* loaded from: classes4.dex */
    private class b implements ViewPager.OnPageChangeListener {
        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            AutoScrollViewPager.this.f46393h = i4;
            AutoScrollViewPager.this.f46394i = i4 % AutoScrollViewPager.this.f46400o.size();
        }

        /* synthetic */ b(AutoScrollViewPager autoScrollViewPager, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    private class c extends PagerAdapter {
        private c() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return AutoScrollViewPager.this.f46400o.size() > 0 ? Integer.MAX_VALUE : 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            AutoScrollViewPager autoScrollViewPager = AutoScrollViewPager.this;
            View j4 = autoScrollViewPager.j(i4 % autoScrollViewPager.f46400o.size());
            j4.setClickable(false);
            viewGroup.addView(j4);
            return j4;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* synthetic */ c(AutoScrollViewPager autoScrollViewPager, a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    private class d implements ViewPager.PageTransformer {

        /* renamed from: c  reason: collision with root package name */
        private static final float f46407c = 0.85f;

        /* renamed from: d  reason: collision with root package name */
        public static final float f46408d = 0.5f;

        /* renamed from: a  reason: collision with root package name */
        private float f46409a = f46407c;

        public d() {
        }

        @TargetApi(11)
        public void a(View view, float f5) {
            int width = view.getWidth();
            view.setPivotY(view.getHeight() / 2);
            view.setPivotX(width / 2);
            if (f5 < -1.0f) {
                view.setScaleX(this.f46409a);
                view.setScaleY(this.f46409a);
                view.setPivotX(width);
            } else if (f5 > 1.0f) {
                view.setPivotX(0.0f);
                view.setScaleX(this.f46409a);
                view.setScaleY(this.f46409a);
            } else if (f5 < 0.0f) {
                float f6 = this.f46409a;
                float f7 = ((f5 + 1.0f) * (1.0f - f6)) + f6;
                view.setScaleX(f7);
                view.setScaleY(f7);
                view.setPivotX(width * (((-f5) * 0.5f) + 0.5f));
            } else {
                float f8 = 1.0f - f5;
                float f9 = this.f46409a;
                float f10 = ((1.0f - f9) * f8) + f9;
                view.setScaleX(f10);
                view.setScaleY(f10);
                view.setPivotX(width * f8 * 0.5f);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f5) {
            a(view, f5);
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        View a(int i4);
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(View view, int i4);
    }

    public AutoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46391f = 5000;
        this.f46392g = 1;
        this.f46400o = new ArrayList();
        this.f46401p = new a();
        this.f46387b = 5000;
        this.f46389d = true;
        k();
    }

    static /* synthetic */ int c(AutoScrollViewPager autoScrollViewPager) {
        int i4 = autoScrollViewPager.f46393h;
        autoScrollViewPager.f46393h = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View j(int i4) {
        e eVar = this.f46402q;
        Objects.requireNonNull(eVar, "view is not null");
        return eVar.a(i4);
    }

    private void k() {
        int i4;
        this.f46393h = -1;
        this.f46394i = -1;
        int i5 = this.f46387b;
        if (i5 > 0 && i5 < 5000) {
            this.f46387b = 5000;
        }
        int i6 = this.f46388c;
        if (i6 <= 0 || i6 <= (i4 = this.f46387b)) {
            return;
        }
        this.f46388c = i4;
    }

    public void l(int i4, int i5, List<T> list) {
        this.f46401p.removeCallbacksAndMessages(null);
        setClipChildren(false);
        setBackgroundColor(0);
        this.f46390e = new ViewPager(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.setMargins(i4, 0, i4, 0);
        removeAllViews();
        this.f46390e.setClipChildren(false);
        this.f46390e.setLayoutParams(layoutParams);
        this.f46390e.setPageMargin(i5);
        this.f46390e.setPageTransformer(true, new d());
        this.f46390e.setOnTouchListener(this);
        if (this.f46400o.size() > 0) {
            this.f46400o.clear();
        }
        this.f46400o.addAll(list);
        addView(this.f46390e);
    }

    public void m() {
        this.f46393h = this.f46400o.size() * 1000;
        this.f46394i = -1;
        AutoScrollViewPager<T>.b bVar = new b(this, null);
        this.f46396k = bVar;
        this.f46390e.setOnPageChangeListener(bVar);
        AutoScrollViewPager<T>.c cVar = new c(this, null);
        this.f46395j = cVar;
        this.f46390e.setAdapter(cVar);
        this.f46395j.notifyDataSetChanged();
        this.f46390e.setCurrentItem(this.f46393h);
        this.f46401p.removeCallbacksAndMessages(null);
        this.f46401p.sendEmptyMessageDelayed(1, this.f46387b);
    }

    public void n() {
        Handler handler = this.f46401p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        f fVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
            this.f46397l = motionEvent.getX();
            this.f46398m = motionEvent.getY();
            this.f46399n = System.currentTimeMillis();
            if (this.f46387b > 0 && this.f46389d) {
                this.f46401p.removeCallbacksAndMessages(null);
            }
        } else if (action == 1) {
            ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
            Math.abs(motionEvent.getX() - this.f46397l);
            Math.abs(motionEvent.getY() - this.f46398m);
            Math.abs(System.currentTimeMillis() - this.f46399n);
            if (Math.abs(motionEvent.getX() - this.f46397l) < 20.0f && Math.abs(motionEvent.getY() - this.f46398m) < 20.0f && System.currentTimeMillis() - this.f46399n < 200 && (fVar = this.f46403r) != null) {
                fVar.a(view, this.f46394i);
            }
            int i4 = this.f46387b;
            if (i4 > 0 && this.f46389d) {
                this.f46401p.sendEmptyMessageDelayed(1, i4);
            }
        } else if (action == 7) {
            ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLoopTime(int i4) {
        this.f46387b = i4;
    }

    public void setOnCreateItemViewListener(e eVar) {
        this.f46402q = eVar;
    }

    public void setOnItemClickListener(f fVar) {
        this.f46403r = fVar;
    }
}
