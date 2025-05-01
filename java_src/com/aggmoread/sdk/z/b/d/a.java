package com.aggmoread.sdk.z.b.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.aggmoread.sdk.z.a.h.a;
import com.aggmoread.sdk.z.a.m.j;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import com.aggmoread.sdk.z.a.r.a;
import com.aggmoread.sdk.z.a.r.h;
import com.aggmoread.sdk.z.a.t.b;
import com.aggmoread.sdk.z.b.a.a;
import com.aggmoread.sdk.z.b.e.a;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.util.List;
/* loaded from: classes2.dex */
public class a implements com.aggmoread.sdk.z.a.a {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.a.a f2679a;

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.d f2680b;

    /* renamed from: c  reason: collision with root package name */
    private a.C0083a.C0084a f2681c;

    /* renamed from: d  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2682d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f2683e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2684f;

    /* renamed from: g  reason: collision with root package name */
    private View f2685g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f2686h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f2687i;

    /* renamed from: j  reason: collision with root package name */
    private View f2688j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f2689k;

    /* renamed from: l  reason: collision with root package name */
    private View f2690l;

    /* renamed from: n  reason: collision with root package name */
    private String f2692n;

    /* renamed from: o  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.e.a f2693o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2694p;

    /* renamed from: r  reason: collision with root package name */
    private byte[] f2696r;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2691m = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2695q = false;

    /* renamed from: s  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.h f2697s = null;

    /* renamed from: t  reason: collision with root package name */
    private a.b f2698t = new i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.b.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0090a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.r.d f2699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.b.a.a f2700b;

        /* renamed from: com.aggmoread.sdk.z.b.d.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0091a implements Runnable {
            RunnableC0091a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0090a c0090a = C0090a.this;
                com.aggmoread.sdk.z.a.r.d dVar = c0090a.f2699a;
                if (dVar instanceof com.aggmoread.sdk.z.a.r.e) {
                    ((com.aggmoread.sdk.z.a.r.e) dVar).a(a.this);
                }
            }
        }

        C0090a(com.aggmoread.sdk.z.a.r.d dVar, com.aggmoread.sdk.z.b.a.a aVar) {
            this.f2699a = dVar;
            this.f2700b = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            if (eVar != null) {
                com.aggmoread.sdk.z.a.r.b.a(this.f2699a, com.aggmoread.sdk.z.a.g.e.f2110e);
                return;
            }
            a.this.f2696r = bArr;
            if (a.this.f2696r == null) {
                com.aggmoread.sdk.z.a.r.b.a(this.f2699a, com.aggmoread.sdk.z.a.g.e.f2110e);
                return;
            }
            m.a().post(new RunnableC0091a());
            if (this.f2700b.d().l()) {
                a.this.f2691m = true;
                return;
            }
            a aVar = a.this;
            aVar.a(aVar.f2687i, a.this.f2688j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2704c;

        /* renamed from: com.aggmoread.sdk.z.b.d.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0092a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f2706b;

            RunnableC0092a(Bitmap bitmap) {
                this.f2706b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!a.this.f2679a.d().l() && (a.this.f2680b instanceof com.aggmoread.sdk.z.a.r.e)) {
                    ((com.aggmoread.sdk.z.a.r.e) a.this.f2680b).a(a.this);
                }
                a aVar = a.this;
                Bitmap bitmap = this.f2706b;
                ImageView imageView = aVar.f2686h;
                b bVar = b.this;
                aVar.a(bitmap, imageView, bVar.f2703b, bVar.f2704c);
            }
        }

        b(ViewGroup viewGroup, View view) {
            this.f2703b = viewGroup;
            this.f2704c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = this.f2703b;
            if (viewGroup == null) {
                com.aggmoread.sdk.z.a.r.b.a(a.this.f2680b, com.aggmoread.sdk.z.a.g.e.f2109d);
                return;
            }
            int width = viewGroup.getWidth();
            int height = this.f2703b.getHeight();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "adcontainer w = " + width + " , h = " + height);
            m.a().post(new RunnableC0092a(com.aggmoread.sdk.z.a.n.a.a().a(width, height, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE, a.this.f2696r)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements a.InterfaceC0072a {

        /* renamed from: com.aggmoread.sdk.z.b.d.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0093a implements Handler.Callback {
            C0093a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                a.this.f();
                return false;
            }
        }

        c() {
        }

        @Override // com.aggmoread.sdk.z.a.r.a.InterfaceC0072a
        public void a(View view, com.aggmoread.sdk.z.a.g.c cVar) {
            List<String> a5;
            com.aggmoread.sdk.z.a.g.c a6;
            String str;
            a.this.c();
            a.this.e();
            if (a.this.f2681c.f2622e != null && !TextUtils.isEmpty(a.this.f2681c.f2622e)) {
                Intent intent = new Intent();
                try {
                    intent.setData(Uri.parse(a.this.f2681c.f2622e));
                    a.this.f2679a.d().d().startActivity(intent);
                    com.aggmoread.sdk.z.a.q.a.a("onStartAppSuccess", a.this.f2681c.a(3), a.this.f2682d.a());
                    new Handler(new C0093a()).sendEmptyMessageDelayed(0, 1000L);
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    if (e5 instanceof ActivityNotFoundException) {
                        a5 = a.this.f2681c.a(0);
                        a6 = a.this.f2682d.a();
                        str = "onAppNotExist";
                    } else {
                        a5 = a.this.f2681c.a(2);
                        a6 = a.this.f2682d.a();
                        str = "onStartAppFailed";
                    }
                    com.aggmoread.sdk.z.a.q.a.a(str, a5, a6);
                    com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", str);
                }
            }
            if (!a.this.f2681c.c()) {
                a.this.k();
            } else if (TextUtils.isEmpty(a.this.f2681c.f2633p)) {
                a.this.d();
            } else {
                if (a.this.f2693o == null) {
                    com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "DL s");
                    a aVar = a.this;
                    aVar.f2693o = new com.aggmoread.sdk.z.b.e.a(aVar.f2698t);
                    a.this.f2693o.a(a.this.f2683e, a.this.f2681c.f2633p);
                }
                a.this.f2693o.a(a.this.f2683e, a.this.f2688j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements b.a {
        d() {
        }

        @Override // com.aggmoread.sdk.z.a.t.b.a
        public void onShow() {
            a.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Handler.Callback {
        e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            a.this.f();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends com.aggmoread.sdk.z.a.j.c {
        f() {
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a() {
            super.a();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "apkIsDownLoading  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4) {
            super.a(j4);
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onApkInstalled  ");
            com.aggmoread.sdk.z.a.q.a.a("onApkInstalled", a.this.f2681c.f2632o, a.this.f2682d.a());
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4, int i4, String str) {
            super.a(j4, i4, str);
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onApkInstalledError  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b() {
            super.b();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onStartDownload  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartDownload", a.this.f2681c.f2627j, a.this.f2682d.a());
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4) {
            super.b(j4);
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onDownloadSuccess  ");
            com.aggmoread.sdk.z.a.q.a.a("onDownloadCompleted", a.this.f2681c.f2631n, a.this.f2682d.a());
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4, int i4, String str) {
            super.b(j4, i4, str);
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onDownloadFail  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void c(long j4) {
            super.c(j4);
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onStartApkInstaller  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartApkInstaller", a.this.f2681c.f2628k, a.this.f2682d.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Rect bounds = a.this.f2686h.getDrawable().getBounds();
            int width = bounds.width();
            int height = bounds.height();
            if (width <= 1 || height <= 1) {
                a.this.f2680b.a(com.aggmoread.sdk.z.a.g.e.f2111f);
                return;
            }
            a.this.c();
            if (a.this.f2680b instanceof com.aggmoread.sdk.z.a.r.e) {
                ((com.aggmoread.sdk.z.a.r.e) a.this.f2680b).d();
            }
            a.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements h.a {
        h() {
        }

        @Override // com.aggmoread.sdk.z.a.r.h.a
        public void a() {
            a.this.f();
        }

        @Override // com.aggmoread.sdk.z.a.r.h.a
        public void a(long j4) {
            if (a.this.f2680b instanceof com.aggmoread.sdk.z.a.r.e) {
                ((com.aggmoread.sdk.z.a.r.e) a.this.f2680b).onAdTick(j4);
            }
        }
    }

    /* loaded from: classes2.dex */
    class i implements a.b {

        /* renamed from: com.aggmoread.sdk.z.b.d.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0094a implements Runnable {
            RunnableC0094a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f();
            }
        }

        i() {
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void a() {
            a.this.d();
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void b() {
            if (a.this.f2693o != null) {
                a.this.f2693o.a();
                a.this.f2693o = null;
            }
            m.a().postDelayed(new RunnableC0094a(), 1000L);
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void onRenderSuccess() {
            a.this.f2694p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, ImageView imageView, ViewGroup viewGroup, View view) {
        View view2;
        View view3;
        com.aggmoread.sdk.z.a.r.d dVar;
        com.aggmoread.sdk.z.a.g.e eVar;
        Context context;
        if (bitmap == null) {
            dVar = this.f2680b;
            eVar = com.aggmoread.sdk.z.a.g.e.f2110e;
        } else {
            if (this.f2683e == null && (context = viewGroup.getContext()) != null && (context instanceof Activity)) {
                this.f2683e = (Activity) context;
            }
            if (!TextUtils.isEmpty(this.f2681c.f2633p)) {
                com.aggmoread.sdk.z.b.e.a aVar = new com.aggmoread.sdk.z.b.e.a(this.f2698t);
                this.f2693o = aVar;
                aVar.a(this.f2683e, this.f2681c.f2633p);
            }
            if (!com.aggmoread.sdk.z.a.m.a.a(this.f2683e)) {
                if (!com.aggmoread.sdk.z.a.m.b.a(viewGroup)) {
                    com.aggmoread.sdk.z.b.c.a.a(this.f2680b, com.aggmoread.sdk.z.a.g.e.f2108c);
                    return;
                }
                com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "isDownload = " + this.f2681c.c() + " , interaction_type = " + this.f2681c.f2625h + " , downloadUrl = " + this.f2681c.a());
                if (!TextUtils.isEmpty(this.f2681c.f2633p) && (view3 = this.f2690l) != null) {
                    view3.setVisibility(0);
                    view2 = this.f2690l;
                    imageView.setClickable(false);
                    if (this.f2695q) {
                        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "CKT");
                    }
                    this.f2682d = com.aggmoread.sdk.z.a.r.a.a(view2, new c());
                    imageView.setImageBitmap(bitmap);
                    if (this.f2689k != null && this.f2679a.d().k()) {
                        this.f2689k.setVisibility(0);
                    }
                    a(view);
                    return;
                }
                view2 = imageView;
                this.f2682d = com.aggmoread.sdk.z.a.r.a.a(view2, new c());
                imageView.setImageBitmap(bitmap);
                if (this.f2689k != null) {
                    this.f2689k.setVisibility(0);
                }
                a(view);
                return;
            }
            dVar = this.f2680b;
            eVar = com.aggmoread.sdk.z.a.g.e.f2108c;
        }
        com.aggmoread.sdk.z.b.c.a.a(dVar, eVar);
    }

    private void a(View view) {
        h();
        g();
        com.aggmoread.sdk.z.b.b.a d5 = this.f2679a.d();
        if (d5.f() == null) {
            this.f2685g.setVisibility(0);
        } else {
            this.f2685g = d5.f();
        }
        this.f2685g.setOnClickListener(new g());
        com.aggmoread.sdk.z.a.r.h hVar = new com.aggmoread.sdk.z.a.r.h(this.f2685g, new h(), 5200L, 500L);
        this.f2697s = hVar;
        hVar.start();
    }

    private void a(ViewGroup viewGroup) {
        if (this.f2684f != null) {
            FrameLayout frameLayout = new FrameLayout(this.f2684f);
            frameLayout.setBackgroundColor(Color.parseColor("#99ffdd"));
            if (viewGroup != null) {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
            ImageView imageView = new ImageView(this.f2684f);
            imageView.setBackgroundColor(Color.parseColor("#Afd1df"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(this.f2684f);
            TextView textView = new TextView(this.f2684f);
            j.a(textView, this.f2684f, 140, 140, 140, 140, 6);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setText("跳过");
            textView.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 84.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 34.0d));
            marginLayoutParams.topMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 16.0d);
            marginLayoutParams.rightMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 6.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 5;
            frameLayout2.addView(textView, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = GravityCompat.END;
            frameLayout.addView(frameLayout2, layoutParams2);
            ImageView imageView2 = new ImageView(this.f2684f);
            com.aggmoread.sdk.z.a.h.a d5 = com.aggmoread.sdk.z.a.h.a.d();
            a.EnumC0059a enumC0059a = a.EnumC0059a.f2138c;
            com.aggmoread.sdk.z.a.g.h b5 = d5.b(enumC0059a);
            if (b5.f2126a != 0) {
                imageView2.setImageResource(com.aggmoread.sdk.z.a.h.a.d().b(enumC0059a).f2126a);
            } else {
                Bitmap bitmap = b5.f2127b;
                if (bitmap != null) {
                    imageView2.setImageBitmap(bitmap);
                }
            }
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 85;
            frameLayout.addView(imageView2, layoutParams3);
            FrameLayout frameLayout3 = new FrameLayout(this.f2684f);
            RelativeLayout relativeLayout = new RelativeLayout(this.f2684f);
            int a5 = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 11.0d);
            relativeLayout.setPadding(a5, a5, a5, a5);
            j.a(relativeLayout, this.f2684f, 136, 20, 20, 20, 90);
            frameLayout3.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout = new LinearLayout(this.f2684f);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(0);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(13);
            relativeLayout.addView(linearLayout, layoutParams4);
            TextView textView2 = new TextView(this.f2684f);
            textView2.setText("点击跳转详情页或第三方应用");
            textView2.setTextSize(17.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
            ImageView imageView3 = new ImageView(this.f2684f);
            j.a(imageView3, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAA1ElEQVRYR9XXwQ3CMAyF4ecJ6ChsACMwAkwGTMAIsJlRpBx6In7xsyJybZX/kw+ualh8bHEf/wFw9yuAk5nd1BMbTsDdLwBePfxQIyKAI4APgEMFYghoUXcvQ4QAlYgwoApBASoQNECNmAIoEdMAFSIFUCDSgCxCAsgg1IA3gK2v7KeZtY/YzyMB9FVNx5ssDcjE04BsPAVQxKcBqvgUQBmnAeo4BaiIhwFV8RCgMh4FtHV6Z9braP3un4c2Yf8xOUd2OxMPTYC9kH0/NAH2Uub95YAvfduAIVC/ymAAAAAASUVORK5CYII=");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 20.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 20.0d));
            marginLayoutParams2.leftMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 5.0d);
            linearLayout.addView(imageView3, new LinearLayout.LayoutParams(marginLayoutParams2));
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams3.leftMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 30.0d);
            marginLayoutParams3.rightMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 30.0d);
            marginLayoutParams3.bottomMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2684f, 25.0d);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(marginLayoutParams3);
            layoutParams5.gravity = 80;
            frameLayout.addView(frameLayout3, layoutParams5);
            this.f2688j = frameLayout;
            this.f2686h = imageView;
            this.f2689k = imageView2;
            imageView2.setVisibility(8);
            this.f2685g = textView;
            this.f2690l = frameLayout3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, View view) {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "showAD enter");
        m.a(new b(viewGroup, view));
    }

    private void a(String str) {
        try {
            a.C0083a.C0084a c0084a = this.f2681c;
            new com.aggmoread.sdk.z.a.j.b(this.f2684f.getApplicationContext(), this.f2679a.d().h(), new f()).a(str, c0084a.f2626i, c0084a.f2618a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(String str) {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "DL");
        a(str);
        new Handler(new e()).sendEmptyMessageDelayed(0, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.aggmoread.sdk.z.a.r.h hVar = this.f2697s;
        if (hVar != null) {
            hVar.cancel();
            this.f2697s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Intent a5;
        Context a6 = com.aggmoread.sdk.z.a.h.a.d().a();
        String str = this.f2681c.f2626i;
        if (!com.aggmoread.sdk.z.a.m.d.c(a6, str) || (a5 = com.aggmoread.sdk.z.a.m.d.a(a6, str)) == null) {
            b(this.f2681c.a());
            return;
        }
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "intent = " + a5);
        a5.addFlags(268435456);
        a6.startActivity(a5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "onAdClick = " + this.f2682d.a());
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2681c.f2630m, this.f2682d.a());
        this.f2680b.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f2680b.a();
    }

    private void g() {
        com.aggmoread.sdk.z.a.q.a.a("onAdExposure", this.f2681c.f2629l);
        this.f2680b.e();
    }

    private void h() {
        this.f2680b.onAdShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str = this.f2681c.f2621d;
        if (TextUtils.isEmpty(str)) {
            com.aggmoread.sdk.z.b.c.a.a(this.f2680b, com.aggmoread.sdk.z.a.g.e.f2112g);
            return;
        }
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "startWebActivity = " + str);
        String a5 = com.aggmoread.sdk.z.a.q.a.a(str, this.f2682d.a());
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "startWebActivity final = " + a5);
        com.aggmoread.sdk.z.a.t.b.a(this.f2683e, this.f2681c.f2618a, a5, new d());
    }

    @Override // com.aggmoread.sdk.z.a.a
    public String a() {
        a.C0083a.C0084a c0084a = this.f2681c;
        if (c0084a != null) {
            return TextUtils.isEmpty(c0084a.f2618a) ? this.f2681c.f2619b : this.f2681c.f2618a;
        }
        return null;
    }

    public void a(com.aggmoread.sdk.z.b.a.a aVar, com.aggmoread.sdk.z.a.r.d dVar) {
        com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "handle   enter");
        this.f2679a = aVar;
        this.f2680b = dVar;
        this.f2683e = aVar.d().d();
        this.f2684f = aVar.d().i();
        a.C0083a.C0084a a5 = aVar.f2616e.a();
        if (a5 != null) {
            this.f2681c = a5;
            this.f2692n = a5.b();
            a5.a();
            com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "imageUrl = " + this.f2692n);
            com.aggmoread.sdk.z.a.j.g.a(this.f2692n);
            if (!TextUtils.isEmpty(this.f2692n)) {
                ViewGroup e5 = aVar.d().e();
                this.f2687i = e5;
                a(e5);
                this.f2689k.setVisibility(8);
                this.f2690l.setVisibility(8);
                com.aggmoread.sdk.z.a.p.a.a(this.f2692n, null, new C0090a(dVar, aVar));
                return;
            }
        }
        com.aggmoread.sdk.z.b.c.a.a(dVar, new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "广告数据异常"));
    }

    @Override // com.aggmoread.sdk.z.a.a
    public boolean a(Activity activity, ViewGroup viewGroup) {
        if (this.f2679a.d().l()) {
            if (viewGroup != null) {
                View view = this.f2687i;
                if (view == null) {
                    view = this.f2688j;
                }
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                com.aggmoread.sdk.z.a.d.c("ApiSplashHandler_dsp", "show add adContainer tmpView = " + view);
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                this.f2687i = viewGroup;
                this.f2683e = activity;
            }
            return i();
        }
        return false;
    }

    @Override // com.aggmoread.sdk.z.a.a
    public int b() {
        return -1;
    }

    public boolean i() {
        if (this.f2679a.d().l() && this.f2691m) {
            j();
            return true;
        }
        return false;
    }

    public void j() {
        a(this.f2687i, this.f2688j);
    }
}
