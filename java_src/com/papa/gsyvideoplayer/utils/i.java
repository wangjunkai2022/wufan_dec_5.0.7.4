package com.papa.gsyvideoplayer.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import java.util.Map;
/* compiled from: ListVideoUtil.java */
@Deprecated
/* loaded from: classes5.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private StandardGSYVideoPlayer f58489b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f58490c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f58491d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup.LayoutParams f58492e;

    /* renamed from: f  reason: collision with root package name */
    private o f58493f;

    /* renamed from: g  reason: collision with root package name */
    private s2.h f58494g;

    /* renamed from: h  reason: collision with root package name */
    private String f58495h;

    /* renamed from: i  reason: collision with root package name */
    private Context f58496i;

    /* renamed from: j  reason: collision with root package name */
    private File f58497j;

    /* renamed from: k  reason: collision with root package name */
    private String f58498k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f58499l;

    /* renamed from: o  reason: collision with root package name */
    private int f58502o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f58503p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f58504q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f58505r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f58506s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f58507t;

    /* renamed from: x  reason: collision with root package name */
    private int[] f58511x;

    /* renamed from: y  reason: collision with root package name */
    private int[] f58512y;

    /* renamed from: a  reason: collision with root package name */
    private String f58488a = "NULL";

    /* renamed from: m  reason: collision with root package name */
    private int f58500m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f58501n = 1;

    /* renamed from: u  reason: collision with root package name */
    private boolean f58508u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f58509v = true;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f58510w = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f58513z = true;
    private boolean A = true;
    private boolean B = true;
    private Handler C = new Handler();

    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.W();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            iVar.Z(iVar.f58489b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition(i.this.f58490c);
            i iVar = i.this;
            iVar.Y(iVar.f58489b);
            i.this.U(600);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f58503p = false;
            i.this.f58490c.removeAllViews();
            if (i.this.f58489b.getParent() != null) {
                ((ViewGroup) i.this.f58489b.getParent()).removeView(i.this.f58489b);
            }
            i.this.f58493f.I(false);
            i.this.f58489b.setIfCurrentIsFullscreen(false);
            i.this.f58490c.setBackgroundColor(0);
            i.this.f58491d.addView(i.this.f58489b, i.this.f58492e);
            i.this.f58489b.getFullscreenButton().setImageResource(i.this.f58489b.getEnlargeImageRes());
            i.this.f58489b.getBackButton().setVisibility(8);
            i.this.f58489b.setIfCurrentIsFullscreen(false);
            if (i.this.f58494g != null) {
                com.papa.gsyvideoplayer.utils.c.h("onQuitFullscreen");
                i.this.f58494g.onQuitFullscreen(i.this.f58495h, i.this.f58498k, i.this.f58489b);
            }
            if (i.this.f58508u) {
                com.papa.gsyvideoplayer.utils.b.p(i.this.f58496i, i.this.f58502o);
            }
            com.papa.gsyvideoplayer.utils.b.q(i.this.f58496i, i.this.f58506s, i.this.f58505r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GSYVideoPlayer f58518b;

        /* compiled from: ListVideoUtil.java */
        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b0();
            }
        }

        e(GSYVideoPlayer gSYVideoPlayer) {
            this.f58518b = gSYVideoPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition(i.this.f58490c);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f58518b.getLayoutParams();
            layoutParams.setMargins(i.this.f58511x[0], i.this.f58511x[1], 0, 0);
            layoutParams.width = i.this.f58512y[0];
            layoutParams.height = i.this.f58512y[1];
            layoutParams.gravity = 0;
            this.f58518b.setLayoutParams(layoutParams);
            i.this.C.postDelayed(new a(), 400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListVideoUtil.java */
    /* loaded from: classes5.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f58493f.r() != 1) {
                i.this.f58493f.E();
            }
        }
    }

    public i(Context context) {
        this.f58489b = new StandardGSYVideoPlayer(context);
        this.f58496i = context;
    }

    private boolean H(int i4, String str) {
        return Q(i4, str);
    }

    private boolean Q(int i4, String str) {
        return this.f58500m == i4 && this.f58488a.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i4) {
        if (J()) {
            this.C.postDelayed(new f(), i4);
        }
        this.f58489b.setIfCurrentIsFullscreen(true);
        if (this.f58494g != null) {
            com.papa.gsyvideoplayer.utils.c.h("onEnterFullscreen");
            this.f58494g.onEnterFullscreen(this.f58495h, this.f58498k, this.f58489b);
        }
    }

    private void V() {
        this.f58490c.setBackgroundColor(-16777216);
        this.f58490c.addView(this.f58489b);
        U(50);
    }

    private void X() {
        this.f58511x = new int[2];
        this.f58512y = new int[2];
        c0(this.f58496i, this.f58505r, this.f58506s);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(this.f58496i);
        frameLayout.setBackgroundColor(-16777216);
        int[] iArr = this.f58512y;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iArr[0], iArr[1]);
        int[] iArr2 = this.f58511x;
        layoutParams2.setMargins(iArr2[0], iArr2[1], 0, 0);
        frameLayout.addView(this.f58489b, layoutParams2);
        this.f58490c.addView(frameLayout, layoutParams);
        this.C.postDelayed(new c(), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gSYBaseVideoPlayer.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.gravity = 17;
        gSYBaseVideoPlayer.setLayoutParams(layoutParams);
        gSYBaseVideoPlayer.setIfCurrentIsFullscreen(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(GSYVideoPlayer gSYVideoPlayer) {
        if (this.B && (this.f58490c instanceof FrameLayout)) {
            this.C.postDelayed(new e(gSYVideoPlayer), this.f58493f.q());
            return;
        }
        b0();
    }

    private void a0() {
        this.f58502o = ((Activity) this.f58496i).getWindow().getDecorView().getSystemUiVisibility();
        com.papa.gsyvideoplayer.utils.b.l(this.f58496i, this.f58506s, this.f58505r);
        if (this.f58508u) {
            com.papa.gsyvideoplayer.utils.b.k(this.f58496i);
        }
        this.f58503p = true;
        ViewGroup viewGroup = (ViewGroup) this.f58489b.getParent();
        this.f58492e = this.f58489b.getLayoutParams();
        if (viewGroup != null) {
            this.f58491d = viewGroup;
            viewGroup.removeView(this.f58489b);
        }
        this.f58489b.setIfCurrentIsFullscreen(true);
        this.f58489b.getFullscreenButton().setImageResource(this.f58489b.getShrinkImageRes());
        this.f58489b.getBackButton().setVisibility(0);
        o oVar = new o((Activity) this.f58496i, this.f58489b);
        this.f58493f = oVar;
        oVar.I(G());
        this.f58489b.getBackButton().setOnClickListener(new b());
        if (this.B) {
            if (this.f58490c instanceof FrameLayout) {
                X();
                return;
            } else {
                V();
                return;
            }
        }
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.C.postDelayed(new d(), this.f58493f.q());
    }

    private void c0(Context context, boolean z4, boolean z5) {
        this.f58491d.getLocationOnScreen(this.f58511x);
        int i4 = com.papa.gsyvideoplayer.utils.b.i(context);
        int c5 = com.papa.gsyvideoplayer.utils.b.c((Activity) context);
        if (z4) {
            int[] iArr = this.f58511x;
            iArr[1] = iArr[1] - i4;
        }
        if (z5) {
            int[] iArr2 = this.f58511x;
            iArr2[1] = iArr2[1] - c5;
        }
        this.f58512y[0] = this.f58491d.getWidth();
        this.f58512y[1] = this.f58491d.getHeight();
    }

    public StandardGSYVideoPlayer A() {
        return this.f58489b;
    }

    public Map<String, String> B() {
        return this.f58499l;
    }

    public int C() {
        return this.f58500m;
    }

    public String D() {
        return this.f58488a;
    }

    public int E() {
        return this.f58501n;
    }

    public String F() {
        return this.f58498k;
    }

    public boolean G() {
        return this.A;
    }

    public boolean I() {
        return this.f58503p;
    }

    public boolean J() {
        return this.f58513z;
    }

    public boolean K() {
        return this.f58506s;
    }

    public boolean L() {
        return this.f58508u;
    }

    public boolean M() {
        return this.f58505r;
    }

    public boolean N() {
        return this.f58507t;
    }

    public boolean O() {
        return this.f58509v;
    }

    public boolean P() {
        return this.f58510w;
    }

    public boolean R() {
        return this.B;
    }

    public boolean S() {
        return this.f58504q;
    }

    public void T() {
        ViewGroup viewGroup = (ViewGroup) this.f58489b.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f58500m = -1;
        this.f58488a = "NULL";
        o oVar = this.f58493f;
        if (oVar != null) {
            oVar.D();
        }
    }

    public void W() {
        if (this.f58490c == null) {
            return;
        }
        if (!this.f58503p) {
            a0();
        } else {
            Z(this.f58489b);
        }
    }

    public void d0(boolean z4) {
        this.A = z4;
    }

    public void e0(File file) {
        this.f58497j = file;
    }

    public void f0(boolean z4) {
        this.f58513z = z4;
    }

    public void g0(ViewGroup viewGroup) {
        this.f58490c = viewGroup;
    }

    public void h0(boolean z4) {
        this.f58506s = z4;
    }

    public void i0(boolean z4) {
        this.f58508u = z4;
    }

    public void j0(boolean z4) {
        this.f58505r = z4;
    }

    public void k0(boolean z4) {
        this.f58507t = z4;
    }

    public void l0(Map<String, String> map) {
        this.f58499l = map;
    }

    public void m0(boolean z4) {
        this.f58509v = z4;
    }

    public void n0(boolean z4) {
        this.f58510w = z4;
    }

    public void o0(int i4, String str) {
        this.f58500m = i4;
        this.f58488a = str;
    }

    public void p0(boolean z4) {
        this.B = z4;
    }

    public void q0(int i4) {
        this.f58501n = i4;
    }

    public void r0(String str) {
        this.f58498k = str;
    }

    public void s0(s2.h hVar) {
        this.f58494g = hVar;
        this.f58489b.setVideoAllCallBack(hVar);
    }

    public void t0(Point point, boolean z4, boolean z5) {
        if (this.f58489b.getCurrentState() == 2) {
            this.f58489b.showSmallVideo(point, z4, z5);
            this.f58504q = true;
        }
    }

    public void u0() {
        this.f58504q = false;
        this.f58489b.hideSmallVideo();
    }

    public void v(int i4, View view, String str, ViewGroup viewGroup, View view2) {
        viewGroup.removeAllViews();
        if (H(i4, str)) {
            if (this.f58503p) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f58489b.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            viewGroup.addView(this.f58489b);
            view2.setVisibility(4);
            return;
        }
        view2.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public void v0(String str) {
        if (S()) {
            u0();
        }
        this.f58495h = str;
        this.f58489b.release();
        this.f58489b.setLooping(this.f58507t);
        this.f58489b.setSpeed(this.f58501n);
        this.f58489b.setNeedShowWifiTip(this.f58510w);
        this.f58489b.setNeedLockFull(this.f58509v);
        this.f58489b.setUp(str, true, this.f58497j, this.f58499l, this.f58498k);
        if (!TextUtils.isEmpty(this.f58498k)) {
            this.f58489b.getTitleTextView().setText(this.f58498k);
        }
        this.f58489b.getTitleTextView().setVisibility(8);
        this.f58489b.getBackButton().setVisibility(8);
        this.f58489b.getFullscreenButton().setOnClickListener(new a());
        this.f58489b.startPlayLogic();
    }

    public boolean w() {
        if (this.f58490c.getChildCount() > 0) {
            Z(this.f58489b);
            return true;
        }
        return false;
    }

    public File x() {
        return this.f58497j;
    }

    public int y() {
        return this.f58489b.getCurrentPositionWhenPlaying();
    }

    public int z() {
        return this.f58489b.getDuration();
    }
}
