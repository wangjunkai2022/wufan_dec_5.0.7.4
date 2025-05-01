package com.aggmoread.sdk.z.a.r;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.m.j;
import com.aggmoread.sdk.z.a.m.l;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import com.aggmoread.sdk.z.a.r.a;
import com.aggmoread.sdk.z.a.r.h;
import com.aggmoread.sdk.z.a.t.b;
import com.xinzhu.overmind.server.user.MindUserHandle;
/* loaded from: classes2.dex */
public class f implements com.aggmoread.sdk.z.a.a {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.b f2416a;

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.d f2417b;

    /* renamed from: c  reason: collision with root package name */
    private b.a.C0056a f2418c;

    /* renamed from: d  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2419d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f2420e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2421f;

    /* renamed from: g  reason: collision with root package name */
    private View f2422g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f2423h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f2424i;

    /* renamed from: j  reason: collision with root package name */
    private View f2425j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f2426k;

    /* renamed from: m  reason: collision with root package name */
    private String f2428m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f2429n;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2427l = false;

    /* renamed from: o  reason: collision with root package name */
    private h f2430o = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.r.d f2431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2432b;

        /* renamed from: com.aggmoread.sdk.z.a.r.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0076a implements Runnable {
            RunnableC0076a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                com.aggmoread.sdk.z.a.r.d dVar = aVar.f2431a;
                if (dVar instanceof com.aggmoread.sdk.z.a.r.e) {
                    ((com.aggmoread.sdk.z.a.r.e) dVar).a(f.this);
                }
            }
        }

        a(com.aggmoread.sdk.z.a.r.d dVar, com.aggmoread.sdk.z.a.g.b bVar) {
            this.f2431a = dVar;
            this.f2432b = bVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            if (eVar != null) {
                com.aggmoread.sdk.z.a.r.b.a(this.f2431a, com.aggmoread.sdk.z.a.g.e.f2110e);
                return;
            }
            f.this.f2429n = bArr;
            if (f.this.f2429n == null) {
                com.aggmoread.sdk.z.a.r.b.a(this.f2431a, com.aggmoread.sdk.z.a.g.e.f2110e);
                return;
            }
            m.a().post(new RunnableC0076a());
            if (this.f2432b.d().n()) {
                f.this.f2427l = true;
                return;
            }
            f fVar = f.this;
            fVar.a(fVar.f2424i, f.this.f2423h, f.this.f2425j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageView f2436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f2437d;

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f2439b;

            a(Bitmap bitmap) {
                this.f2439b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!f.this.f2416a.d().n() && (f.this.f2417b instanceof com.aggmoread.sdk.z.a.r.e)) {
                    ((com.aggmoread.sdk.z.a.r.e) f.this.f2417b).a(f.this);
                }
                b bVar = b.this;
                f.this.a(this.f2439b, bVar.f2436c, bVar.f2435b, bVar.f2437d);
            }
        }

        b(ViewGroup viewGroup, ImageView imageView, View view) {
            this.f2435b = viewGroup;
            this.f2436c = imageView;
            this.f2437d = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = this.f2435b;
            if (viewGroup == null) {
                com.aggmoread.sdk.z.a.r.b.a(f.this.f2417b, com.aggmoread.sdk.z.a.g.e.f2109d);
                return;
            }
            int width = viewGroup.getWidth();
            int height = this.f2435b.getHeight();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "adcontainer w = " + width + " , h = " + height);
            m.a().post(new a(com.aggmoread.sdk.z.a.n.a.a().a(width, height, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE, f.this.f2429n)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements a.InterfaceC0072a {

        /* loaded from: classes2.dex */
        class a implements b.a {
            a() {
            }

            @Override // com.aggmoread.sdk.z.a.t.b.a
            public void onShow() {
                f.this.e();
            }
        }

        /* loaded from: classes2.dex */
        class b implements l.c {

            /* loaded from: classes2.dex */
            class a implements Handler.Callback {
                a() {
                }

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    f.this.e();
                    return false;
                }
            }

            /* renamed from: com.aggmoread.sdk.z.a.r.f$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0077b implements Handler.Callback {
                C0077b() {
                }

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    f.this.e();
                    return false;
                }
            }

            b() {
            }

            @Override // com.aggmoread.sdk.z.a.m.l.c
            public void a() {
                f.this.e();
            }

            @Override // com.aggmoread.sdk.z.a.m.l.c
            public void b() {
                new Handler(new a()).sendEmptyMessageDelayed(0, 1000L);
            }

            @Override // com.aggmoread.sdk.z.a.m.l.c
            public void c() {
                new Handler(new C0077b()).sendEmptyMessageDelayed(0, 1000L);
            }

            @Override // com.aggmoread.sdk.z.a.m.l.c
            public void d() {
            }

            @Override // com.aggmoread.sdk.z.a.m.l.c
            public void e() {
            }
        }

        c() {
        }

        @Override // com.aggmoread.sdk.z.a.r.a.InterfaceC0072a
        public void a(View view, com.aggmoread.sdk.z.a.g.c cVar) {
            f.this.c();
            f.this.d();
            l.a(f.this.f2416a, f.this.f2418c, f.this.f2419d.a(), f.this.f2417b, new a(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Rect bounds = f.this.f2424i.getDrawable().getBounds();
            int width = bounds.width();
            int height = bounds.height();
            if (width <= 1 || height <= 1) {
                f.this.f2417b.a(com.aggmoread.sdk.z.a.g.e.f2111f);
                return;
            }
            f.this.c();
            if (f.this.f2417b instanceof com.aggmoread.sdk.z.a.r.e) {
                ((com.aggmoread.sdk.z.a.r.e) f.this.f2417b).d();
            }
            f.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements h.a {
        e() {
        }

        @Override // com.aggmoread.sdk.z.a.r.h.a
        public void a() {
            f.this.e();
        }

        @Override // com.aggmoread.sdk.z.a.r.h.a
        public void a(long j4) {
            if (f.this.f2417b instanceof com.aggmoread.sdk.z.a.r.e) {
                ((com.aggmoread.sdk.z.a.r.e) f.this.f2417b).onAdTick(j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, ImageView imageView, ViewGroup viewGroup, View view) {
        com.aggmoread.sdk.z.a.r.d dVar;
        com.aggmoread.sdk.z.a.g.e eVar;
        Context context;
        if (bitmap == null) {
            dVar = this.f2417b;
            eVar = com.aggmoread.sdk.z.a.g.e.f2110e;
        } else {
            if (this.f2420e == null && (context = viewGroup.getContext()) != null && (context instanceof Activity)) {
                this.f2420e = (Activity) context;
            }
            if (!com.aggmoread.sdk.z.a.m.a.a(this.f2420e)) {
                if (!com.aggmoread.sdk.z.a.m.b.a(viewGroup)) {
                    com.aggmoread.sdk.z.a.r.b.a(this.f2417b, com.aggmoread.sdk.z.a.g.e.f2108c);
                    return;
                }
                com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "isDownload = " + this.f2418c.r() + " , downType = " + this.f2418c.h() + " , downloadUrl = " + this.f2418c.i());
                this.f2419d = com.aggmoread.sdk.z.a.r.a.a(imageView, new c());
                imageView.setImageBitmap(bitmap);
                if (this.f2426k != null && this.f2416a.d().m()) {
                    this.f2426k.setVisibility(0);
                }
                a(view);
                return;
            }
            dVar = this.f2417b;
            eVar = com.aggmoread.sdk.z.a.g.e.f2108c;
        }
        com.aggmoread.sdk.z.a.r.b.a(dVar, eVar);
    }

    private void a(View view) {
        g();
        f();
        com.aggmoread.sdk.z.a.h.c d5 = this.f2416a.d();
        if (d5.g() == null) {
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "getAdSkipView = null");
            this.f2422g.setVisibility(0);
        } else {
            this.f2422g = d5.g();
        }
        this.f2422g.setOnClickListener(new d());
        h hVar = new h(this.f2422g, new e(), 5200L, 500L);
        this.f2430o = hVar;
        hVar.start();
    }

    private void a(ViewGroup viewGroup) {
        if (this.f2421f != null) {
            FrameLayout frameLayout = new FrameLayout(this.f2421f);
            frameLayout.setBackgroundColor(Color.parseColor("#99ffdd"));
            if (viewGroup != null) {
                viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            }
            ImageView imageView = new ImageView(this.f2421f);
            imageView.setBackgroundColor(Color.parseColor("#Afd1df"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(this.f2421f);
            TextView textView = new TextView(this.f2421f);
            j.a(textView, this.f2421f, 140, 140, 140, 140, 6);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setText("跳过");
            textView.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2421f, 84.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2421f, 34.0d));
            marginLayoutParams.topMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2421f, 16.0d);
            marginLayoutParams.rightMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2421f, 6.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 5;
            frameLayout2.addView(textView, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = GravityCompat.END;
            frameLayout.addView(frameLayout2, layoutParams2);
            ImageView imageView2 = new ImageView(this.f2421f);
            com.aggmoread.sdk.z.a.g.h e5 = com.aggmoread.sdk.z.a.h.a.d().e();
            if (e5.f2126a != 0) {
                imageView2.setImageResource(com.aggmoread.sdk.z.a.h.a.d().e().f2126a);
            } else {
                Bitmap bitmap = e5.f2127b;
                if (bitmap != null) {
                    imageView2.setImageBitmap(bitmap);
                }
            }
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 85;
            frameLayout.addView(imageView2, layoutParams3);
            this.f2425j = frameLayout;
            this.f2424i = imageView;
            this.f2426k = imageView2;
            imageView2.setVisibility(8);
            this.f2422g = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, ViewGroup viewGroup, View view) {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "showAD enter");
        m.a(new b(viewGroup, imageView, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        h hVar = this.f2430o;
        if (hVar != null) {
            hVar.cancel();
            this.f2430o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "onAdClick = " + this.f2419d.a());
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2418c.p(), this.f2419d.a());
        this.f2417b.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f2417b.a();
    }

    private void f() {
        com.aggmoread.sdk.z.a.q.a.a("onAdExposure", this.f2418c.q());
        this.f2417b.e();
    }

    private void g() {
        this.f2417b.onAdShow();
    }

    @Override // com.aggmoread.sdk.z.a.a
    public String a() {
        b.a.C0056a c0056a = this.f2418c;
        if (c0056a != null) {
            return c0056a.a();
        }
        return null;
    }

    public void a(com.aggmoread.sdk.z.a.g.b bVar, com.aggmoread.sdk.z.a.r.d dVar) {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "handle enter");
        this.f2416a = bVar;
        this.f2417b = dVar;
        this.f2420e = bVar.d().e();
        this.f2421f = bVar.d().j();
        b.a.C0056a a5 = bVar.f2058e.get(0).a();
        if (a5 != null) {
            this.f2418c = a5;
            this.f2428m = a5.j();
            a5.i();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "imageUrl = " + this.f2428m);
            com.aggmoread.sdk.z.a.j.g.a(this.f2428m);
            if (!TextUtils.isEmpty(this.f2428m)) {
                ViewGroup f5 = bVar.d().f();
                this.f2423h = f5;
                a(f5);
                com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "imageView = " + this.f2424i);
                com.aggmoread.sdk.z.a.p.a.a(this.f2428m, null, new a(dVar, bVar));
                return;
            }
        }
        com.aggmoread.sdk.z.a.r.b.a(dVar, new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "广告数据异常"));
    }

    @Override // com.aggmoread.sdk.z.a.a
    public boolean a(Activity activity, ViewGroup viewGroup) {
        if (this.f2416a.d().n()) {
            if (viewGroup != null) {
                View view = this.f2423h;
                if (view == null) {
                    view = this.f2425j;
                }
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_api", "show add adContainer tmpView = " + view);
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                this.f2423h = viewGroup;
                this.f2420e = activity;
            }
            return h();
        }
        return false;
    }

    @Override // com.aggmoread.sdk.z.a.a
    public int b() {
        b.a.C0056a c0056a = this.f2418c;
        if (c0056a != null) {
            return c0056a.n();
        }
        return -1;
    }

    public boolean h() {
        if (this.f2416a.d().n() && this.f2427l) {
            i();
            return true;
        }
        return false;
    }

    public void i() {
        a(this.f2424i, this.f2423h, this.f2425j);
    }
}
