package com.join.mgps.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.BannerBean;
import java.util.List;
/* loaded from: classes4.dex */
public class ViewPagerWithADs extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final int f48043l = 5;

    /* renamed from: b  reason: collision with root package name */
    private Context f48044b;

    /* renamed from: c  reason: collision with root package name */
    private MyViewPager f48045c;

    /* renamed from: d  reason: collision with root package name */
    private int f48046d;

    /* renamed from: e  reason: collision with root package name */
    private List<BannerBean> f48047e;

    /* renamed from: f  reason: collision with root package name */
    private int f48048f;

    /* renamed from: g  reason: collision with root package name */
    private int f48049g;

    /* renamed from: h  reason: collision with root package name */
    private int f48050h;

    /* renamed from: i  reason: collision with root package name */
    private PagerAdapter f48051i;

    /* renamed from: j  reason: collision with root package name */
    private float f48052j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f48053k;

    public ViewPagerWithADs(@NonNull Context context) {
        super(context);
        this.f48045c = null;
        this.f48046d = 50;
        this.f48047e = null;
        this.f48048f = 40;
        this.f48049g = 2000;
        this.f48050h = 0;
        this.f48052j = 0.0f;
        this.f48053k = false;
        this.f48044b = context;
    }

    private int c(Context context, int i4) {
        return (int) ((i4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void d() {
        setClipChildren(false);
        setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        int i4 = this.f48046d;
        layoutParams.setMargins(i4, 0, i4, 0);
        removeAllViews();
        MyViewPager myViewPager = new MyViewPager(this.f48044b);
        this.f48045c = myViewPager;
        myViewPager.setClipChildren(false);
        this.f48045c.setLayoutParams(layoutParams);
        this.f48045c.i(this.f48044b, this.f48047e, this.f48048f, this.f48049g);
        addView(this.f48045c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48052j = 0.0f;
            this.f48053k = false;
        } else if (action == 1) {
            this.f48052j = 0.0f;
            this.f48053k = false;
        } else if (action == 2) {
            float f5 = this.f48052j;
            if (f5 != 0.0f) {
                this.f48052j = f5 - motionEvent.getX();
            }
            if (Math.abs(this.f48052j) > 5.0f) {
                this.f48053k = true;
            }
            getParent().requestDisallowInterceptTouchEvent(this.f48053k);
            this.f48052j = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e(View view, int i4) {
        this.f48045c.h(view, i4);
    }

    public void setAll(Context context, PagerAdapter pagerAdapter, List<BannerBean> list, int i4, int i5, int i6) {
        this.f48044b = context;
        this.f48051i = pagerAdapter;
        this.f48046d = i5;
        this.f48047e = list;
        this.f48048f = i4;
        this.f48049g = i6;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class MyViewPager extends ViewPager {

        /* renamed from: b  reason: collision with root package name */
        private Context f48054b;

        /* renamed from: c  reason: collision with root package name */
        private List<BannerBean> f48055c;

        /* renamed from: d  reason: collision with root package name */
        private int f48056d;

        /* renamed from: e  reason: collision with root package name */
        private int f48057e;

        /* renamed from: f  reason: collision with root package name */
        private int f48058f;

        /* renamed from: g  reason: collision with root package name */
        private PagerAdapter f48059g;

        /* renamed from: h  reason: collision with root package name */
        private e f48060h;

        /* renamed from: i  reason: collision with root package name */
        private Handler f48061i;

        /* loaded from: classes4.dex */
        public class MyScaleInTransformer implements ViewPager.PageTransformer {

            /* renamed from: c  reason: collision with root package name */
            private static final float f48063c = 0.85f;

            /* renamed from: d  reason: collision with root package name */
            public static final float f48064d = 0.5f;

            /* renamed from: a  reason: collision with root package name */
            private float f48065a = f48063c;

            public MyScaleInTransformer() {
            }

            @TargetApi(11)
            public void a(View view, float f5) {
                int width = view.getWidth();
                view.setPivotY(view.getHeight() / 2);
                view.setPivotX(width / 2);
                if (f5 < -1.0f) {
                    view.setScaleX(this.f48065a);
                    view.setScaleY(this.f48065a);
                    view.setPivotX(width);
                } else if (f5 > 1.0f) {
                    view.setPivotX(0.0f);
                    view.setScaleX(this.f48065a);
                    view.setScaleY(this.f48065a);
                } else if (f5 < 0.0f) {
                    float f6 = this.f48065a;
                    float f7 = ((f5 + 1.0f) * (1.0f - f6)) + f6;
                    view.setScaleX(f7);
                    view.setScaleY(f7);
                    view.setPivotX(width * (((-f5) * 0.5f) + 0.5f));
                } else {
                    float f8 = 1.0f - f5;
                    float f9 = this.f48065a;
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
        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MyViewPager myViewPager = MyViewPager.this;
                myViewPager.setCurrentItem(myViewPager.f48056d);
                MyViewPager.this.j();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnTouchListener {

            /* renamed from: b  reason: collision with root package name */
            private long f48068b;

            /* renamed from: c  reason: collision with root package name */
            private int f48069c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f48070d;

            b(int i4) {
                this.f48070d = i4;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MyViewPager.this.f48061i.removeCallbacksAndMessages(null);
                    this.f48069c = (int) motionEvent.getX();
                    this.f48068b = System.currentTimeMillis();
                } else if (action == 1) {
                    if (System.currentTimeMillis() - this.f48068b < 500 && Math.abs(this.f48069c - motionEvent.getX()) < 30.0f) {
                        if (ViewPagerWithADs.this.f48050h == 1) {
                            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(MyViewPager.this.f48054b);
                            l4.u0(((this.f48070d % MyViewPager.this.f48055c.size()) + 1) + "", AccountUtil_.getInstance_(MyViewPager.this.f48054b).getUid());
                        }
                        IntentUtil.getInstance().intentActivity(MyViewPager.this.f48054b, ((BannerBean) MyViewPager.this.f48055c.get(this.f48070d % MyViewPager.this.f48055c.size())).getIntentDataBean());
                    }
                    MyViewPager.this.j();
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c extends PagerAdapter {
            c() {
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
                viewGroup.removeView((View) obj);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return Integer.MAX_VALUE;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup viewGroup, int i4) {
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(MyViewPager.this.f48054b);
                simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
                MyImageLoader.f(simpleDraweeView, R.drawable.banner_normal_icon, ((BannerBean) MyViewPager.this.f48055c.get(i4 % MyViewPager.this.f48055c.size())).getPic_remote(), MyImageLoader.E(MyViewPager.this.f48054b, 20.0f));
                MyViewPager.this.h(simpleDraweeView, i4);
                viewGroup.addView(simpleDraweeView);
                return simpleDraweeView;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class d implements ViewPager.OnPageChangeListener {
            d() {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f5, int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                MyViewPager.this.f48056d = i4;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MyViewPager.c(MyViewPager.this, 1);
                MyViewPager.this.f48061i.obtainMessage().sendToTarget();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class f implements View.OnTouchListener {
            f() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MyViewPager.this.f48061i.removeCallbacksAndMessages(null);
                    return false;
                } else if (action == 1) {
                    MyViewPager.this.j();
                    return false;
                } else if (action != 3) {
                    return false;
                } else {
                    MyViewPager.this.j();
                    return false;
                }
            }
        }

        public MyViewPager(Context context) {
            super(context);
            this.f48056d = 100;
            this.f48057e = 15;
            this.f48058f = 4000;
            this.f48060h = new e();
            this.f48061i = new a();
            this.f48054b = context;
        }

        static /* synthetic */ int c(MyViewPager myViewPager, int i4) {
            int i5 = myViewPager.f48056d + i4;
            myViewPager.f48056d = i5;
            return i5;
        }

        private void g() {
            this.f48056d = 10000;
            setPageMargin(this.f48057e);
            setOffscreenPageLimit(3);
            j();
            setPageTransformer(true, new MyScaleInTransformer());
            setOnPageChangeListener(new d());
            setOnTouchListener(new f());
        }

        public void h(View view, int i4) {
            view.setOnTouchListener(new b(i4));
        }

        public void i(Context context, List<BannerBean> list, int i4, int i5) {
            this.f48054b = context;
            this.f48057e = i4;
            this.f48055c = list;
            this.f48058f = i5;
            g();
        }

        public void j() {
            if (this.f48059g == null) {
                if (ViewPagerWithADs.this.f48051i != null) {
                    this.f48059g = ViewPagerWithADs.this.f48051i;
                } else {
                    this.f48059g = new c();
                }
                setAdapter(this.f48059g);
                setCurrentItem(this.f48056d);
            }
            this.f48061i.removeCallbacksAndMessages(null);
            this.f48061i.postDelayed(this.f48060h, this.f48058f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.viewpager.widget.ViewPager, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        public MyViewPager(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f48056d = 100;
            this.f48057e = 15;
            this.f48058f = 4000;
            this.f48060h = new e();
            this.f48061i = new a();
            this.f48054b = context;
        }
    }

    public void setAll(Context context, List<BannerBean> list, int i4, int i5, int i6, int i7) {
        this.f48050h = i7;
        setAll(context, (PagerAdapter) null, list, i4, i5, i6);
    }

    public ViewPagerWithADs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f48045c = null;
        this.f48046d = 50;
        this.f48047e = null;
        this.f48048f = 40;
        this.f48049g = 2000;
        this.f48050h = 0;
        this.f48052j = 0.0f;
        this.f48053k = false;
        this.f48044b = context;
    }
}
