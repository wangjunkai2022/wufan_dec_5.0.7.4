package com.youth.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.youth.banner.loader.ImageLoaderInterface;
import com.youth.banner.view.BannerViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class Banner extends FrameLayout implements ViewPager.OnPageChangeListener {
    private int A;
    private List<String> B;
    private List C;
    private List<View> D;
    private List<ImageView> E;
    private Context F;
    private BannerViewPager G;
    private TextView H;
    private TextView I;
    private TextView J;
    private LinearLayout K;
    private LinearLayout L;
    private LinearLayout M;
    private ImageView N;
    private ImageLoaderInterface O;
    private b P;
    private ViewPager.OnPageChangeListener Q;
    private com.youth.banner.b R;
    private m3.a S;
    private m3.b T;
    private DisplayMetrics U;
    private e V;
    private final Runnable W;

    /* renamed from: b  reason: collision with root package name */
    public String f68482b;

    /* renamed from: c  reason: collision with root package name */
    private int f68483c;

    /* renamed from: d  reason: collision with root package name */
    private int f68484d;

    /* renamed from: e  reason: collision with root package name */
    private int f68485e;

    /* renamed from: f  reason: collision with root package name */
    private int f68486f;

    /* renamed from: g  reason: collision with root package name */
    private int f68487g;

    /* renamed from: h  reason: collision with root package name */
    private int f68488h;

    /* renamed from: i  reason: collision with root package name */
    private int f68489i;

    /* renamed from: j  reason: collision with root package name */
    private int f68490j;

    /* renamed from: k  reason: collision with root package name */
    private int f68491k;

    /* renamed from: l  reason: collision with root package name */
    private int f68492l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f68493m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f68494n;

    /* renamed from: o  reason: collision with root package name */
    private int f68495o;

    /* renamed from: p  reason: collision with root package name */
    private int f68496p;

    /* renamed from: q  reason: collision with root package name */
    private int f68497q;

    /* renamed from: r  reason: collision with root package name */
    private int f68498r;

    /* renamed from: s  reason: collision with root package name */
    private int f68499s;

    /* renamed from: t  reason: collision with root package name */
    private int f68500t;

    /* renamed from: u  reason: collision with root package name */
    private int f68501u;

    /* renamed from: v  reason: collision with root package name */
    private int f68502v;

    /* renamed from: w  reason: collision with root package name */
    private int f68503w;

    /* renamed from: x  reason: collision with root package name */
    private int f68504x;

    /* renamed from: y  reason: collision with root package name */
    private int f68505y;

    /* renamed from: z  reason: collision with root package name */
    private int f68506z;

    /* loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Banner.this.f68503w <= 1 || !Banner.this.f68493m) {
                return;
            }
            Banner banner = Banner.this;
            banner.f68504x = (banner.f68504x % (Banner.this.f68503w + 1)) + 1;
            if (Banner.this.f68504x == 1) {
                Banner.this.G.setCurrentItem(Banner.this.f68504x, false);
                Banner.this.V.d(Banner.this.W);
                return;
            }
            Banner.this.G.setCurrentItem(Banner.this.f68504x);
            Banner.this.V.h(Banner.this.W, Banner.this.f68491k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b extends PagerAdapter {

        /* loaded from: classes6.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f68509b;

            a(int i4) {
                this.f68509b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str = Banner.this.f68482b;
                Banner.this.S.OnBannerClick(this.f68509b);
            }
        }

        /* renamed from: com.youth.banner.Banner$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class View$OnClickListenerC0763b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f68511b;

            View$OnClickListenerC0763b(int i4) {
                this.f68511b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Banner.this.T.OnBannerClick(Banner.this.L(this.f68511b));
            }
        }

        b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return Banner.this.D.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView((View) Banner.this.D.get(i4));
            View view = (View) Banner.this.D.get(i4);
            if (Banner.this.S != null) {
                view.setOnClickListener(new a(i4));
            }
            if (Banner.this.T != null) {
                view.setOnClickListener(new View$OnClickListenerC0763b(i4));
            }
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public Banner(Context context) {
        this(context, null);
    }

    private void G() {
        if (this.B.size() == this.C.size()) {
            int i4 = this.f68499s;
            if (i4 != -1) {
                this.M.setBackgroundColor(i4);
            }
            if (this.f68498r != -1) {
                this.M.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f68498r));
            }
            int i5 = this.f68500t;
            if (i5 != -1) {
                this.H.setTextColor(i5);
            }
            int i6 = this.f68501u;
            if (i6 != -1) {
                this.H.setTextSize(0, i6);
            }
            List<String> list = this.B;
            if (list == null || list.size() <= 0) {
                return;
            }
            this.H.setText(this.B.get(0));
            this.H.setVisibility(0);
            this.M.setVisibility(0);
            return;
        }
        throw new RuntimeException("[Banner] --> The number of titles and images is different");
    }

    private void l() {
        LinearLayout.LayoutParams layoutParams;
        this.E.clear();
        this.K.removeAllViews();
        this.L.removeAllViews();
        for (int i4 = 0; i4 < this.f68503w; i4++) {
            ImageView imageView = new ImageView(this.F);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (i4 == 0) {
                layoutParams = new LinearLayout.LayoutParams(this.f68486f, this.f68487g);
                imageView.setImageResource(this.f68495o);
            } else {
                layoutParams = new LinearLayout.LayoutParams(this.f68484d, this.f68485e);
                imageView.setImageResource(this.f68496p);
            }
            int i5 = this.f68483c;
            layoutParams.leftMargin = i5;
            layoutParams.rightMargin = i5;
            this.E.add(imageView);
            int i6 = this.f68490j;
            if (i6 == 1 || i6 == 4) {
                this.K.addView(imageView, layoutParams);
            } else if (i6 == 5) {
                this.L.addView(imageView, layoutParams);
            }
        }
    }

    private void m(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Banner);
        this.f68484d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_width, this.f68488h);
        this.f68485e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_height, this.f68488h);
        this.f68486f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_selected_width, this.f68488h);
        this.f68487g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_selected_height, this.f68488h);
        this.f68483c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_margin, 5);
        this.f68495o = obtainStyledAttributes.getResourceId(R.styleable.Banner_indicator_drawable_selected, R.drawable.gray_radius);
        this.f68496p = obtainStyledAttributes.getResourceId(R.styleable.Banner_indicator_drawable_unselected, R.drawable.white_radius);
        this.A = obtainStyledAttributes.getInt(R.styleable.Banner_image_scale_type, this.A);
        this.f68491k = obtainStyledAttributes.getInt(R.styleable.Banner_delay_time, 2000);
        this.f68492l = obtainStyledAttributes.getInt(R.styleable.Banner_scroll_time, 800);
        this.f68493m = obtainStyledAttributes.getBoolean(R.styleable.Banner_is_auto_play, true);
        this.f68499s = obtainStyledAttributes.getColor(R.styleable.Banner_title_background, -1);
        this.f68498r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_title_height, -1);
        this.f68500t = obtainStyledAttributes.getColor(R.styleable.Banner_title_textcolor, -1);
        this.f68501u = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_title_textsize, -1);
        this.f68497q = obtainStyledAttributes.getResourceId(R.styleable.Banner_banner_layout, this.f68497q);
        this.f68489i = obtainStyledAttributes.getResourceId(R.styleable.Banner_banner_default_image, R.drawable.no_banner);
        obtainStyledAttributes.recycle();
    }

    private void n() {
        this.D.clear();
        int i4 = this.f68490j;
        if (i4 == 1 || i4 == 4 || i4 == 5) {
            l();
        } else if (i4 == 3) {
            TextView textView = this.I;
            textView.setText("1/" + this.f68503w);
        } else if (i4 == 2) {
            TextView textView2 = this.J;
            textView2.setText("1/" + this.f68503w);
        }
    }

    private void o(Context context, AttributeSet attributeSet) {
        this.D.clear();
        m(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(this.f68497q, (ViewGroup) this, true);
        this.N = (ImageView) inflate.findViewById(R.id.bannerDefaultImage);
        this.G = (BannerViewPager) inflate.findViewById(R.id.bannerViewPager);
        this.M = (LinearLayout) inflate.findViewById(R.id.titleView);
        this.K = (LinearLayout) inflate.findViewById(R.id.circleIndicator);
        this.L = (LinearLayout) inflate.findViewById(R.id.indicatorInside);
        this.H = (TextView) inflate.findViewById(R.id.bannerTitle);
        this.J = (TextView) inflate.findViewById(R.id.numIndicator);
        this.I = (TextView) inflate.findViewById(R.id.numIndicatorInside);
        this.N.setImageResource(this.f68489i);
        p();
    }

    private void p() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            com.youth.banner.b bVar = new com.youth.banner.b(this.G.getContext());
            this.R = bVar;
            bVar.a(this.f68492l);
            declaredField.set(this.G, this.R);
        } catch (Exception e5) {
            e5.getMessage();
        }
    }

    private void setImageList(List<?> list) {
        Object obj;
        if (list != null && list.size() > 0) {
            this.N.setVisibility(8);
            n();
            int i4 = 0;
            while (true) {
                int i5 = this.f68503w;
                if (i4 > i5 + 1) {
                    return;
                }
                if (i4 == 0) {
                    obj = list.get(i5 - 1);
                } else if (i4 == i5 + 1) {
                    obj = list.get(0);
                } else {
                    obj = list.get(i4 - 1);
                }
                ImageLoaderInterface imageLoaderInterface = this.O;
                View createImageView = imageLoaderInterface != null ? imageLoaderInterface.createImageView(this.F, obj) : null;
                if (createImageView == null) {
                    createImageView = new ImageView(this.F);
                }
                setScaleType(createImageView);
                this.D.add(createImageView);
                ImageLoaderInterface imageLoaderInterface2 = this.O;
                if (imageLoaderInterface2 != null) {
                    imageLoaderInterface2.displayImage(this.F, obj, createImageView);
                }
                i4++;
            }
        } else {
            this.N.setVisibility(0);
        }
    }

    private void setScaleType(View view) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            switch (this.A) {
                case 0:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return;
                case 7:
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    return;
                default:
                    return;
            }
        }
    }

    private void u() {
        int i4 = this.f68503w > 1 ? 0 : 8;
        int i5 = this.f68490j;
        if (i5 == 1) {
            this.K.setVisibility(i4);
        } else if (i5 == 2) {
            this.J.setVisibility(i4);
        } else if (i5 == 3) {
            this.I.setVisibility(i4);
            G();
        } else if (i5 == 4) {
            this.K.setVisibility(i4);
            G();
        } else if (i5 != 5) {
        } else {
            this.L.setVisibility(i4);
            G();
        }
    }

    private void w() {
        int i4 = this.f68502v;
        if (i4 != 0) {
            this.f68504x = i4;
        } else {
            this.f68504x = 1;
        }
        b bVar = this.P;
        if (bVar == null) {
            this.P = new b();
            this.G.addOnPageChangeListener(this);
            this.G.setAdapter(this.P);
        } else {
            bVar.notifyDataSetChanged();
        }
        this.G.setFocusable(true);
        this.G.setCurrentItem(this.f68504x);
        int i5 = this.f68505y;
        if (i5 != -1) {
            this.K.setGravity(i5);
        }
        if (this.f68494n && this.f68503w > 1) {
            this.G.setScrollable(true);
        } else {
            this.G.setScrollable(false);
        }
        if (this.f68493m) {
            J();
        }
    }

    public Banner A(int i4) {
        if (i4 == 5) {
            this.f68505y = 19;
        } else if (i4 == 6) {
            this.f68505y = 17;
        } else if (i4 == 7) {
            this.f68505y = 21;
        }
        return this;
    }

    public Banner B(int i4) {
        BannerViewPager bannerViewPager = this.G;
        if (bannerViewPager != null) {
            bannerViewPager.setOffscreenPageLimit(i4);
        }
        return this;
    }

    @Deprecated
    public Banner C(m3.a aVar) {
        this.S = aVar;
        return this;
    }

    public Banner D(m3.b bVar) {
        this.T = bVar;
        return this;
    }

    public Banner E(boolean z4, ViewPager.PageTransformer pageTransformer) {
        this.G.setPageTransformer(z4, pageTransformer);
        return this;
    }

    public Banner F(int i4) {
        this.f68502v = i4;
        return this;
    }

    public Banner H(boolean z4) {
        this.f68494n = z4;
        return this;
    }

    public Banner I() {
        u();
        setImageList(this.C);
        w();
        return this;
    }

    public void J() {
        this.V.i(this.W);
        this.V.h(this.W, this.f68491k);
    }

    public void K() {
        this.V.i(this.W);
    }

    public int L(int i4) {
        int i5 = this.f68503w;
        int i6 = i5 != 0 ? (i4 - 1) % i5 : 0;
        return i6 < 0 ? i6 + i5 : i6;
    }

    public void M(int i4) {
        this.K.setVisibility(8);
        this.J.setVisibility(8);
        this.I.setVisibility(8);
        this.L.setVisibility(8);
        this.H.setVisibility(8);
        this.M.setVisibility(8);
        this.f68490j = i4;
        I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f68493m) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                J();
            } else if (action == 0) {
                K();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.Q;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i4);
        }
        if (i4 == 0) {
            int i5 = this.f68504x;
            if (i5 == 0) {
                this.G.setCurrentItem(this.f68503w, false);
            } else if (i5 == this.f68503w + 1) {
                this.G.setCurrentItem(1, false);
            }
        } else if (i4 != 1) {
        } else {
            int i6 = this.f68504x;
            int i7 = this.f68503w;
            if (i6 == i7 + 1) {
                this.G.setCurrentItem(1, false);
            } else if (i6 == 0) {
                this.G.setCurrentItem(i7, false);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.Q;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(L(i4), f5, i5);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        this.f68504x = i4;
        ViewPager.OnPageChangeListener onPageChangeListener = this.Q;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(L(i4));
        }
        int i5 = this.f68490j;
        if (i5 == 1 || i5 == 4 || i5 == 5) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f68486f, this.f68487g);
            int i6 = this.f68483c;
            layoutParams.leftMargin = i6;
            layoutParams.rightMargin = i6;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f68484d, this.f68485e);
            int i7 = this.f68483c;
            layoutParams2.leftMargin = i7;
            layoutParams2.rightMargin = i7;
            List<ImageView> list = this.E;
            int i8 = this.f68503w;
            list.get(((this.f68506z - 1) + i8) % i8).setImageResource(this.f68496p);
            List<ImageView> list2 = this.E;
            int i9 = this.f68503w;
            list2.get(((this.f68506z - 1) + i9) % i9).setLayoutParams(layoutParams2);
            List<ImageView> list3 = this.E;
            int i10 = i4 - 1;
            int i11 = this.f68503w;
            list3.get((i10 + i11) % i11).setImageResource(this.f68495o);
            List<ImageView> list4 = this.E;
            int i12 = this.f68503w;
            list4.get((i10 + i12) % i12).setLayoutParams(layoutParams);
            this.f68506z = i4;
        }
        if (i4 == 0) {
            i4 = this.f68503w;
        }
        if (i4 > this.f68503w) {
            i4 = 1;
        }
        int i13 = this.f68490j;
        if (i13 == 2) {
            this.J.setText(i4 + net.lingala.zip4j.util.e.F0 + this.f68503w);
        } else if (i13 != 3) {
            if (i13 == 4) {
                this.H.setText(this.B.get(i4 - 1));
            } else if (i13 != 5) {
            } else {
                this.H.setText(this.B.get(i4 - 1));
            }
        } else {
            this.I.setText(i4 + net.lingala.zip4j.util.e.F0 + this.f68503w);
            this.H.setText(this.B.get(i4 - 1));
        }
    }

    public Banner q(boolean z4) {
        this.f68493m = z4;
        return this;
    }

    public void r() {
        this.V.k(null);
    }

    public Banner s(Class<? extends ViewPager.PageTransformer> cls) {
        try {
            E(true, cls.newInstance());
        } catch (Exception unused) {
        }
        return this;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.Q = onPageChangeListener;
    }

    public Banner t(int i4) {
        this.f68490j = i4;
        return this;
    }

    public void update(List<?> list, List<String> list2) {
        this.B.clear();
        this.B.addAll(list2);
        update(list);
    }

    public Banner v(List<String> list) {
        this.B = list;
        return this;
    }

    public Banner x(int i4) {
        this.f68491k = i4;
        return this;
    }

    public Banner y(ImageLoaderInterface imageLoaderInterface) {
        this.O = imageLoaderInterface;
        return this;
    }

    public Banner z(List<?> list) {
        this.C.addAll(list);
        this.f68503w = list.size();
        return this;
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Banner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f68482b = MediationConstant.RIT_TYPE_BANNER;
        this.f68483c = 5;
        this.f68490j = 1;
        this.f68491k = 2000;
        this.f68492l = 800;
        this.f68493m = true;
        this.f68494n = true;
        this.f68495o = R.drawable.gray_radius;
        this.f68496p = R.drawable.white_radius;
        this.f68497q = R.layout.banner;
        this.f68503w = 0;
        this.f68505y = -1;
        this.f68506z = 1;
        this.A = 1;
        this.V = new e();
        this.W = new a();
        this.F = context;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.U = displayMetrics;
        this.f68488h = displayMetrics.widthPixels / 80;
        o(context, attributeSet);
    }

    public void update(List<?> list) {
        this.C.clear();
        this.D.clear();
        this.E.clear();
        this.C.addAll(list);
        this.f68503w = this.C.size();
        I();
    }
}
