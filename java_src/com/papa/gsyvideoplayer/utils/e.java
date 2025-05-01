package com.papa.gsyvideoplayer.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import java.util.Map;
import java.util.Objects;
/* compiled from: GSYVideoHelper.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f58407a;

    /* renamed from: b  reason: collision with root package name */
    private StandardGSYVideoPlayer f58408b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f58409c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f58410d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f58411e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup.LayoutParams f58412f;

    /* renamed from: g  reason: collision with root package name */
    private o f58413g;

    /* renamed from: h  reason: collision with root package name */
    private n f58414h;

    /* renamed from: i  reason: collision with root package name */
    private g f58415i;

    /* renamed from: j  reason: collision with root package name */
    private Context f58416j;

    /* renamed from: k  reason: collision with root package name */
    private int f58417k;

    /* renamed from: l  reason: collision with root package name */
    private int f58418l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58419m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f58420n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f58421o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f58422p;

    /* renamed from: q  reason: collision with root package name */
    private Handler f58423q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            eVar.J(eVar.f58408b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f58409c != null) {
                TransitionManager.beginDelayedTransition(e.this.f58409c);
            } else {
                TransitionManager.beginDelayedTransition(e.this.f58410d);
            }
            e eVar = e.this;
            eVar.I(eVar.f58408b);
            e.this.F(600);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f58419m = false;
            e.this.E();
            if (e.this.f58409c != null) {
                e.this.f58409c.removeAllViews();
            }
            if (e.this.f58408b.getParent() != null) {
                ((ViewGroup) e.this.f58408b.getParent()).removeView(e.this.f58408b);
            }
            e.this.f58413g.I(false);
            e.this.f58408b.setIfCurrentIsFullscreen(false);
            if (e.this.f58409c != null) {
                e.this.f58409c.setBackgroundColor(0);
            }
            e.this.f58411e.addView(e.this.f58408b, e.this.f58412f);
            e.this.f58408b.getFullscreenButton().setImageResource(e.this.f58408b.getEnlargeImageRes());
            e.this.f58408b.getBackButton().setVisibility(8);
            e.this.f58408b.setIfCurrentIsFullscreen(false);
            e.this.f58408b.restartTimerTask();
            if (e.this.f58415i.q0() != null) {
                com.papa.gsyvideoplayer.utils.c.h("onQuitFullscreen");
                e.this.f58415i.q0().onQuitFullscreen(e.this.f58415i.p0(), e.this.f58415i.r0(), e.this.f58408b);
            }
            if (e.this.f58415i.v0()) {
                com.papa.gsyvideoplayer.utils.b.p(e.this.f58416j, e.this.f58418l);
            }
            com.papa.gsyvideoplayer.utils.b.q(e.this.f58416j, e.this.f58415i.u0(), e.this.f58415i.w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GSYVideoPlayer f58427b;

        /* compiled from: GSYVideoHelper.java */
        /* loaded from: classes5.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.L();
            }
        }

        d(GSYVideoPlayer gSYVideoPlayer) {
            this.f58427b = gSYVideoPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition(e.this.f58409c);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f58427b.getLayoutParams();
            layoutParams.setMargins(e.this.f58421o[0], e.this.f58421o[1], 0, 0);
            layoutParams.width = e.this.f58422p[0];
            layoutParams.height = e.this.f58422p[1];
            layoutParams.gravity = 0;
            this.f58427b.setLayoutParams(layoutParams);
            e.this.f58423q.postDelayed(new a(), 400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoHelper.java */
    /* renamed from: com.papa.gsyvideoplayer.utils.e$e  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class RunnableC0589e implements Runnable {
        RunnableC0589e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f58413g.r() != 1) {
                if (e.this.f58409c != null) {
                    e.this.f58409c.setBackgroundColor(-16777216);
                }
                e.this.f58413g.E();
            }
        }
    }

    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.u();
        }
    }

    /* compiled from: GSYVideoHelper.java */
    /* loaded from: classes5.dex */
    public static class g extends com.papa.gsyvideoplayer.builder.a {
        protected boolean V;
        protected boolean W;

        public boolean A0() {
            return this.f58188p;
        }

        public boolean B0() {
            return this.f58194v;
        }

        public boolean C0() {
            return this.f58185m;
        }

        public boolean D0() {
            return this.f58186n;
        }

        public boolean E0() {
            return this.f58192t;
        }

        public boolean F0() {
            return this.f58197y;
        }

        public boolean G0() {
            return this.f58183k;
        }

        public boolean H0() {
            return this.f58191s;
        }

        public boolean I0() {
            return this.f58196x;
        }

        public boolean J0() {
            return this.f58195w;
        }

        public g K0(boolean z4) {
            this.V = z4;
            return this;
        }

        public g L0(boolean z4) {
            this.W = z4;
            return this;
        }

        public Drawable V() {
            return this.O;
        }

        public Drawable W() {
            return this.P;
        }

        public Drawable X() {
            return this.Q;
        }

        public File Y() {
            return this.J;
        }

        public Drawable Z() {
            return this.S;
        }

        public int a0() {
            return this.f58176d;
        }

        public int b0() {
            return this.f58177e;
        }

        public int c0() {
            return this.f58178f;
        }

        public GSYVideoGLView.c d0() {
            return this.T;
        }

        public int e0() {
            return this.f58174b;
        }

        public s2.d f0() {
            return this.U;
        }

        public s2.g g0() {
            return this.M;
        }

        public Map<String, String> h0() {
            return this.K;
        }

        public int i0() {
            return this.f58175c;
        }

        public String j0() {
            return this.E;
        }

        public long k0() {
            return this.f58179g;
        }

        public float l0() {
            return this.f58180h;
        }

        public int m0() {
            return this.f58173a;
        }

        public float n0() {
            return this.f58181i;
        }

        public View o0() {
            return this.N;
        }

        public String p0() {
            return this.F;
        }

        public s2.h q0() {
            return this.L;
        }

        public String r0() {
            return this.G;
        }

        public Drawable s0() {
            return this.R;
        }

        public boolean t0() {
            return this.f58193u;
        }

        public boolean u0() {
            return this.V;
        }

        public boolean v0() {
            return this.f58182j;
        }

        public boolean w0() {
            return this.W;
        }

        public boolean x0() {
            return this.f58189q;
        }

        public boolean y0() {
            return this.f58190r;
        }

        public boolean z0() {
            return this.f58187o;
        }
    }

    public e(Context context) {
        this(context, new StandardGSYVideoPlayer(context));
    }

    private boolean B(int i4, String str) {
        return this.f58417k == i4 && this.f58407a.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        ViewGroup viewGroup = this.f58410d;
        if (viewGroup == null || viewGroup.indexOfChild(this.f58408b) == -1) {
            return false;
        }
        this.f58410d.removeView(this.f58408b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i4) {
        if (this.f58415i.z0()) {
            if (i4 > 0) {
                this.f58423q.postDelayed(new RunnableC0589e(), i4);
            } else if (this.f58413g.r() != 1) {
                ViewGroup viewGroup = this.f58409c;
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(-16777216);
                }
                this.f58413g.E();
            }
        }
        this.f58408b.setIfCurrentIsFullscreen(true);
        this.f58408b.restartTimerTask();
        if (this.f58415i.q0() != null) {
            com.papa.gsyvideoplayer.utils.c.h("onEnterFullscreen");
            this.f58415i.q0().onEnterFullscreen(this.f58415i.p0(), this.f58415i.r0(), this.f58408b);
        }
    }

    private void G() {
        ViewGroup viewGroup;
        if (this.f58415i.G0() && (viewGroup = this.f58409c) != null) {
            viewGroup.setBackgroundColor(-16777216);
        }
        F(0);
        ViewGroup viewGroup2 = this.f58409c;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f58408b);
        } else {
            this.f58410d.addView(this.f58408b);
        }
    }

    private void H() {
        this.f58421o = new int[2];
        this.f58422p = new int[2];
        M(this.f58416j, this.f58415i.u0(), this.f58415i.w0());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(this.f58416j);
        frameLayout.setBackgroundColor(-16777216);
        int[] iArr = this.f58422p;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iArr[0], iArr[1]);
        int[] iArr2 = this.f58421o;
        layoutParams2.setMargins(iArr2[0], iArr2[1], 0, 0);
        frameLayout.addView(this.f58408b, layoutParams2);
        ViewGroup viewGroup = this.f58409c;
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, layoutParams);
        } else {
            this.f58410d.addView(frameLayout, layoutParams);
        }
        this.f58423q.postDelayed(new b(), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gSYBaseVideoPlayer.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.gravity = 17;
        gSYBaseVideoPlayer.setLayoutParams(layoutParams);
        gSYBaseVideoPlayer.setIfCurrentIsFullscreen(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(GSYVideoPlayer gSYVideoPlayer) {
        if (this.f58415i.G0() && (this.f58409c instanceof FrameLayout)) {
            this.f58423q.postDelayed(new d(gSYVideoPlayer), this.f58413g.q());
            return;
        }
        L();
    }

    private void K() {
        this.f58418l = ((Activity) this.f58416j).getWindow().getDecorView().getSystemUiVisibility();
        com.papa.gsyvideoplayer.utils.b.l(this.f58416j, this.f58415i.u0(), this.f58415i.w0());
        if (this.f58415i.v0()) {
            com.papa.gsyvideoplayer.utils.b.k(this.f58416j);
        }
        this.f58419m = true;
        ViewGroup viewGroup = (ViewGroup) this.f58408b.getParent();
        this.f58412f = this.f58408b.getLayoutParams();
        if (viewGroup != null) {
            this.f58411e = viewGroup;
            viewGroup.removeView(this.f58408b);
        }
        this.f58408b.setIfCurrentIsFullscreen(true);
        this.f58408b.getFullscreenButton().setImageResource(this.f58408b.getShrinkImageRes());
        this.f58408b.getBackButton().setVisibility(0);
        o oVar = new o((Activity) this.f58416j, this.f58408b, this.f58414h);
        this.f58413g = oVar;
        oVar.I(this.f58415i.D0());
        this.f58408b.getBackButton().setOnClickListener(new a());
        if (this.f58415i.G0()) {
            if (this.f58409c instanceof FrameLayout) {
                H();
                return;
            } else {
                G();
                return;
            }
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        int q4 = this.f58413g.q();
        if (!this.f58415i.G0()) {
            q4 = 0;
        }
        this.f58423q.postDelayed(new c(), q4);
    }

    private void M(Context context, boolean z4, boolean z5) {
        this.f58411e.getLocationOnScreen(this.f58421o);
        int i4 = com.papa.gsyvideoplayer.utils.b.i(context);
        int c5 = com.papa.gsyvideoplayer.utils.b.c((Activity) context);
        if (z4) {
            int[] iArr = this.f58421o;
            iArr[1] = iArr[1] - i4;
        }
        if (z5) {
            int[] iArr2 = this.f58421o;
            iArr2[1] = iArr2[1] - c5;
        }
        this.f58422p[0] = this.f58411e.getWidth();
        this.f58422p[1] = this.f58411e.getHeight();
    }

    private boolean z(int i4, String str) {
        return B(i4, str);
    }

    public boolean A() {
        return this.f58419m;
    }

    public boolean C() {
        return this.f58420n;
    }

    public void D() {
        E();
        ViewGroup viewGroup = (ViewGroup) this.f58408b.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f58417k = -1;
        this.f58407a = "NULL";
        o oVar = this.f58413g;
        if (oVar != null) {
            oVar.D();
        }
    }

    public void N(ViewGroup viewGroup) {
        this.f58409c = viewGroup;
    }

    public void O(g gVar) {
        this.f58415i = gVar;
    }

    public void P(n nVar) {
        this.f58414h = nVar;
    }

    public void Q(int i4, String str) {
        this.f58417k = i4;
        this.f58407a = str;
    }

    public void R(Point point, boolean z4, boolean z5) {
        if (this.f58408b.getCurrentState() == 2) {
            this.f58408b.showSmallVideo(point, z4, z5);
            this.f58420n = true;
        }
    }

    public void S() {
        this.f58420n = false;
        this.f58408b.hideSmallVideo();
    }

    public void T() {
        if (C()) {
            S();
        }
        this.f58408b.release();
        g gVar = this.f58415i;
        Objects.requireNonNull(gVar, "mVideoOptionBuilder can't be null");
        gVar.a(this.f58408b);
        if (this.f58408b.getTitleTextView() != null) {
            this.f58408b.getTitleTextView().setVisibility(8);
        }
        if (this.f58408b.getBackButton() != null) {
            this.f58408b.getBackButton().setVisibility(8);
        }
        if (this.f58408b.getFullscreenButton() != null) {
            this.f58408b.getFullscreenButton().setOnClickListener(new f());
        }
        this.f58408b.startPlayLogic();
    }

    public void s(int i4, View view, String str, ViewGroup viewGroup, View view2) {
        viewGroup.removeAllViews();
        if (z(i4, str)) {
            if (this.f58419m) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f58408b.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            viewGroup.addView(this.f58408b);
            view2.setVisibility(4);
            return;
        }
        view2.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public boolean t() {
        ViewGroup viewGroup = this.f58409c;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            J(this.f58408b);
            return true;
        }
        ViewGroup viewGroup2 = this.f58410d;
        if (viewGroup2 == null || viewGroup2.indexOfChild(this.f58408b) == -1) {
            return false;
        }
        J(this.f58408b);
        return true;
    }

    public void u() {
        if (!this.f58419m) {
            K();
        } else {
            J(this.f58408b);
        }
    }

    public com.papa.gsyvideoplayer.builder.a v() {
        return this.f58415i;
    }

    public StandardGSYVideoPlayer w() {
        return this.f58408b;
    }

    public int x() {
        return this.f58417k;
    }

    public String y() {
        return this.f58407a;
    }

    public e(Context context, StandardGSYVideoPlayer standardGSYVideoPlayer) {
        this.f58407a = "NULL";
        this.f58417k = -1;
        this.f58423q = new Handler();
        this.f58408b = standardGSYVideoPlayer;
        this.f58416j = context;
        this.f58410d = (ViewGroup) com.papa.gsyvideoplayer.utils.b.o(context).findViewById(16908290);
    }
}
