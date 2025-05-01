package com.aggmoread.sdk.z.a.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private TextView f2271a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f2272b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f2273c;

    /* renamed from: d  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f2274d;

    /* renamed from: e  reason: collision with root package name */
    private Context f2275e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f2276f;

    /* renamed from: g  reason: collision with root package name */
    private View f2277g;

    /* renamed from: h  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.g f2278h;

    /* renamed from: i  reason: collision with root package name */
    private k f2279i;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f2280j = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    private boolean f2281k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends FrameLayout {
        a(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onWindowVisibilityChanged(int i4) {
            if (i4 == 0 && !c.this.f2280j.get() && com.aggmoread.sdk.z.a.m.b.a(this)) {
                c.this.a(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements ViewTreeObserver.OnScrollChangedListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            c cVar = c.this;
            cVar.a(cVar.f2277g);
        }
    }

    /* renamed from: com.aggmoread.sdk.z.a.k.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC0063c implements View.OnClickListener {
        View$OnClickListenerC0063c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.e();
        }
    }

    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.f();
        }
    }

    /* loaded from: classes2.dex */
    class e implements a.g {

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f2287b;

            a(Bitmap bitmap) {
                this.f2287b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f2276f.setImageBitmap(this.f2287b);
                c.this.d();
            }
        }

        e() {
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            String str;
            c cVar = c.this;
            if (eVar != null) {
                str = "广告渲染失败：code = " + eVar.a() + ", msg = " + eVar.b();
            } else if (bArr != null) {
                m.a().post(new a(com.aggmoread.sdk.z.a.n.a.a().a(cVar.f2276f.getWidth(), c.this.f2276f.getHeight(), Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE, bArr)));
                return;
            } else {
                str = "广告素材为空!";
            }
            cVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2289b;

        f(String str) {
            this.f2289b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f2279i != null) {
                c.this.f2279i.a(this.f2289b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f2279i != null) {
                c.this.f2279i.onRenderSuccess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f2279i != null) {
                c.this.f2279i.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f2279i == null || !c.this.f2280j.get()) {
                return;
            }
            c.this.f2279i.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f2279i != null) {
                c.this.f2279i.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface k {
        void a();

        void a(String str);

        void b();

        void c();

        void onRenderSuccess();
    }

    public c(Context context) {
        this.f2275e = context;
    }

    private View a(Context context) {
        a aVar = new a(context);
        aVar.setBackgroundColor(-1);
        int a5 = com.aggmoread.sdk.z.a.m.b.a(context, 10.0d);
        aVar.setPadding(a5, a5, a5, a5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, com.aggmoread.sdk.z.a.m.b.a(context, 90.0d)));
        this.f2276f = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        layoutParams.rightMargin = a5;
        this.f2276f.setLayoutParams(layoutParams);
        this.f2276f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        linearLayout.addView(this.f2276f);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        layoutParams2.leftMargin = a5;
        relativeLayout.setLayoutParams(layoutParams2);
        this.f2272b = new TextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        layoutParams3.rightMargin = com.aggmoread.sdk.z.a.m.b.a(context, 15.0d);
        this.f2272b.setLayoutParams(layoutParams3);
        this.f2272b.setMaxLines(2);
        this.f2272b.setTextSize(15.0f);
        this.f2272b.setEllipsize(TextUtils.TruncateAt.END);
        this.f2272b.setTextColor(-16777216);
        this.f2272b.setText("广告详细信息广告详细信息广告详细信息广告详细信息广告详细信息");
        relativeLayout.addView(this.f2272b);
        this.f2271a = new TextView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        layoutParams4.rightMargin = com.aggmoread.sdk.z.a.m.b.a(context, 30.0d);
        this.f2271a.setLayoutParams(layoutParams4);
        this.f2271a.setMaxLines(1);
        this.f2271a.setTextSize(13.0f);
        this.f2271a.setEllipsize(TextUtils.TruncateAt.END);
        this.f2271a.setTextColor(Color.parseColor("#8a8a8a"));
        this.f2271a.setText("广告标题信息广告标题信息");
        relativeLayout.addView(this.f2271a);
        linearLayout.addView(relativeLayout);
        aVar.addView(linearLayout);
        this.f2273c = new ImageView(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(context, 16.0d), com.aggmoread.sdk.z.a.m.b.a(context, 16.0d));
        layoutParams5.gravity = 85;
        this.f2273c.setLayoutParams(layoutParams5);
        com.aggmoread.sdk.z.a.m.j.a(this.f2273c, "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAAXNSR0IArs4c6QAAAe9JREFUOE+lk79rVEEQx2du94GdhYlgdxCbiNjGJipJIYIIASuxiNhoYSnHO3Yfw5vlHsHKykpiYZeQgAiSIuKPJoJYKGIViFUK9Q+Q9+ZG97g9ngeK6LYz82H3O59F+M+D0/NE1BWR2wAwDwCXxvVnAPDJGPOAiA7aM78AvPerAPAQEa/Wdf2qqqpvsTnP82NZlp1T1U0AuMnMjxJkAvDeL6rqcgiB/vQq5xwh4i4zv459IwARzYjIITNnzrklAPgcQthvg/I8P2WMOR5CeOG9r40xJ4jo6wjgvb+nqi9DCE/7/f5pY8wHVT2ZIM65OQDYQsRrzPzROXcZEc8z890E2Gma5npVVV8isA2x1n4XkS0RuTUYDN6NM5m11j5m5osJ0DCzbV+5BXlrrb1DRHvtuvd+NJMAdXx/u6HX6x3NsmwHERfaz0k9MYc4kwBPmqa5kdZGREdEZBMR7zdNczidSVyrtXadma8kwBoi7pVluU1EHRHZUNX1GOp0JjHYoihWVPUsM/fSGrvD4XC/LEvjnLsAADMhhCjN5MRMrLXzZVluFEUhnU5nLlrZFmlVVbt/KdJBsnFa5UUAeK6qKyLyJq01z/NZY8wCIm4DwFKycGJi+6pjK3s/xTkDAMvj2i4AvDfGrEX7fvuZ/uVn/wBrwwgg6o7CmAAAAABJRU5ErkJggg==");
        aVar.addView(this.f2273c);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.f2280j.get() || !com.aggmoread.sdk.z.a.m.b.a(view)) {
            return;
        }
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f2274d);
        this.f2280j.set(true);
        m.a().post(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        m.a().post(new f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f2281k = true;
        m.a().post(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        m.a().post(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        m.a().post(new j());
    }

    public View a() {
        if (this.f2277g == null) {
            this.f2277g = a(this.f2275e);
        }
        return this.f2277g;
    }

    public void a(com.aggmoread.sdk.z.a.g.g gVar) {
        this.f2278h = gVar;
    }

    public void a(k kVar) {
        this.f2279i = kVar;
    }

    public int b() {
        return -1;
    }

    public String c() {
        return "";
    }

    public void g() {
        View view = this.f2277g;
        if (view == null || this.f2274d == null) {
            return;
        }
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f2274d);
        this.f2274d = null;
    }

    public void h() {
        String str;
        if (this.f2281k) {
            return;
        }
        if (this.f2278h == null) {
            a("广告素材为空!");
            return;
        }
        if (this.f2277g == null) {
            this.f2277g = a(this.f2275e);
        }
        this.f2274d = new b();
        this.f2277g.getViewTreeObserver().addOnScrollChangedListener(this.f2274d);
        if (TextUtils.isEmpty(this.f2278h.f2124e)) {
            str = "";
        } else {
            this.f2272b.setText(this.f2278h.f2124e);
            str = this.f2278h.f2124e;
        }
        if (!TextUtils.isEmpty(this.f2278h.f2123d)) {
            str = this.f2278h.f2123d;
        }
        this.f2271a.setText(str);
        this.f2277g.setOnClickListener(new View$OnClickListenerC0063c());
        this.f2273c.setOnClickListener(new d());
        com.aggmoread.sdk.z.a.p.a.a(this.f2278h.f2120a, null, new e());
    }
}
