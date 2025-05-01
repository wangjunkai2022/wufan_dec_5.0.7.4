package com.papa.gsyvideoplayer.builder;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.papa.gsyvideoplayer.render.effect.q;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.io.File;
import java.util.Map;
import s2.d;
import s2.g;
import s2.h;
/* compiled from: GSYVideoOptionBuilder.java */
/* loaded from: classes5.dex */
public class a {
    protected String F;
    protected String H;
    protected File J;
    protected Map<String, String> K;
    protected h L;
    protected g M;
    protected View N;
    protected Drawable O;
    protected Drawable P;
    protected Drawable Q;
    protected Drawable R;
    protected Drawable S;
    protected d U;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f58193u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f58194v;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f58195w;

    /* renamed from: x  reason: collision with root package name */
    protected boolean f58196x;

    /* renamed from: a  reason: collision with root package name */
    protected int f58173a = -1;

    /* renamed from: b  reason: collision with root package name */
    protected int f58174b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected int f58175c = -22;

    /* renamed from: d  reason: collision with root package name */
    protected int f58176d = -11;

    /* renamed from: e  reason: collision with root package name */
    protected int f58177e = -11;

    /* renamed from: f  reason: collision with root package name */
    protected int f58178f = 2500;

    /* renamed from: g  reason: collision with root package name */
    protected long f58179g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected float f58180h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    protected float f58181i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f58182j = true;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f58183k = true;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f58184l = false;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f58185m = true;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f58186n = true;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f58187o = false;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f58188p = false;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f58189q = true;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f58190r = true;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f58191s = true;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f58192t = true;

    /* renamed from: y  reason: collision with root package name */
    protected boolean f58197y = false;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f58198z = true;
    protected boolean A = true;
    protected boolean B = false;
    protected boolean C = false;
    protected boolean D = false;
    protected String E = "";
    protected String G = null;
    private boolean I = false;
    protected GSYVideoGLView.c T = new q();

    public a A(String str) {
        this.H = str;
        return this;
    }

    public a B(int i4) {
        this.f58175c = i4;
        return this;
    }

    public a C(String str) {
        this.E = str;
        return this;
    }

    public a D(boolean z4) {
        this.A = z4;
        return this;
    }

    public a E(boolean z4) {
        this.f58186n = z4;
        return this;
    }

    public a F(boolean z4) {
        this.f58192t = z4;
        return this;
    }

    public a G(long j4) {
        this.f58179g = j4;
        return this;
    }

    public a H(float f5) {
        if (f5 < 0.0f) {
            return this;
        }
        this.f58180h = f5;
        return this;
    }

    @Deprecated
    public a I(boolean z4) {
        this.f58197y = z4;
        return this;
    }

    public a J(boolean z4) {
        this.D = z4;
        return this;
    }

    public a K(boolean z4) {
        this.f58183k = z4;
        return this;
    }

    public a L(boolean z4) {
        this.f58191s = z4;
        return this;
    }

    public a M(int i4) {
        this.f58173a = i4;
        return this;
    }

    public a N(boolean z4) {
        this.f58196x = z4;
        return this;
    }

    public a O(float f5) {
        this.f58181i = f5;
        return this;
    }

    public a P(boolean z4) {
        this.f58198z = z4;
        return this;
    }

    public a Q(View view) {
        this.N = view;
        return this;
    }

    public a R(boolean z4) {
        this.f58195w = z4;
        return this;
    }

    public a S(String str) {
        this.F = str;
        return this;
    }

    public a T(h hVar) {
        this.L = hVar;
        return this;
    }

    public a U(String str) {
        this.G = str;
        return this;
    }

    public void a(StandardGSYVideoPlayer standardGSYVideoPlayer) {
        int i4;
        Drawable drawable;
        Drawable drawable2 = this.P;
        if (drawable2 != null && (drawable = this.Q) != null) {
            standardGSYVideoPlayer.setBottomShowProgressBarDrawable(drawable2, drawable);
        }
        Drawable drawable3 = this.O;
        if (drawable3 != null) {
            standardGSYVideoPlayer.setBottomProgressBarDrawable(drawable3);
        }
        Drawable drawable4 = this.R;
        if (drawable4 != null) {
            standardGSYVideoPlayer.setDialogVolumeProgressBar(drawable4);
        }
        Drawable drawable5 = this.S;
        if (drawable5 != null) {
            standardGSYVideoPlayer.setDialogProgressBar(drawable5);
        }
        int i5 = this.f58176d;
        if (i5 > 0 && (i4 = this.f58177e) > 0) {
            standardGSYVideoPlayer.setDialogProgressColor(i5, i4);
        }
        b(standardGSYVideoPlayer);
    }

    public void b(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        gSYBaseVideoPlayer.setPlayTag(this.E);
        gSYBaseVideoPlayer.setPlayPosition(this.f58175c);
        gSYBaseVideoPlayer.setThumbPlay(this.f58195w);
        View view = this.N;
        if (view != null) {
            gSYBaseVideoPlayer.setThumbImageView(view);
        }
        gSYBaseVideoPlayer.setNeedLockFull(this.f58194v);
        g gVar = this.M;
        if (gVar != null) {
            gSYBaseVideoPlayer.setLockClickListener(gVar);
        }
        gSYBaseVideoPlayer.setDismissControlTime(this.f58178f);
        long j4 = this.f58179g;
        if (j4 > 0) {
            gSYBaseVideoPlayer.setSeekOnStart(j4);
        }
        gSYBaseVideoPlayer.setShowFullAnimation(this.f58183k);
        gSYBaseVideoPlayer.setLooping(this.f58188p);
        h hVar = this.L;
        if (hVar != null) {
            gSYBaseVideoPlayer.setVideoAllCallBack(hVar);
        }
        d dVar = this.U;
        if (dVar != null) {
            gSYBaseVideoPlayer.setGSYVideoProgressListener(dVar);
        }
        gSYBaseVideoPlayer.setOverrideExtension(this.H);
        gSYBaseVideoPlayer.setAutoFullWithSize(this.f58184l);
        gSYBaseVideoPlayer.setRotateViewAuto(this.f58186n);
        gSYBaseVideoPlayer.setOnlyRotateLand(this.I);
        gSYBaseVideoPlayer.setLockLand(this.f58187o);
        gSYBaseVideoPlayer.setSpeed(this.f58181i, this.f58196x);
        gSYBaseVideoPlayer.setHideKey(this.f58182j);
        gSYBaseVideoPlayer.setIsTouchWiget(this.f58189q);
        gSYBaseVideoPlayer.setIsTouchWigetFull(this.f58190r);
        gSYBaseVideoPlayer.setNeedShowWifiTip(this.f58185m);
        gSYBaseVideoPlayer.setEffectFilter(this.T);
        gSYBaseVideoPlayer.setStartAfterPrepared(this.f58198z);
        gSYBaseVideoPlayer.setReleaseWhenLossAudio(this.A);
        gSYBaseVideoPlayer.setFullHideActionBar(this.B);
        gSYBaseVideoPlayer.setShowDragProgressTextOnSeekBar(this.D);
        gSYBaseVideoPlayer.setFullHideStatusBar(this.C);
        int i4 = this.f58174b;
        if (i4 > 0) {
            gSYBaseVideoPlayer.setEnlargeImageRes(i4);
        }
        int i5 = this.f58173a;
        if (i5 > 0) {
            gSYBaseVideoPlayer.setShrinkImageRes(i5);
        }
        gSYBaseVideoPlayer.setShowPauseCover(this.f58191s);
        gSYBaseVideoPlayer.setSeekRatio(this.f58180h);
        gSYBaseVideoPlayer.setRotateWithSystem(this.f58192t);
        if (this.f58197y) {
            gSYBaseVideoPlayer.setUpLazy(this.F, this.f58193u, this.J, this.K, this.G);
        } else {
            gSYBaseVideoPlayer.setUp(this.F, this.f58193u, this.J, this.K, this.G);
        }
    }

    public a c(boolean z4) {
        this.f58184l = z4;
        return this;
    }

    public a d(Drawable drawable) {
        this.O = drawable;
        return this;
    }

    public a e(Drawable drawable, Drawable drawable2) {
        this.P = drawable;
        this.Q = drawable2;
        return this;
    }

    public a f(File file) {
        this.J = file;
        return this;
    }

    public a g(boolean z4) {
        this.f58193u = z4;
        return this;
    }

    public a h(Drawable drawable) {
        this.S = drawable;
        return this;
    }

    public a i(int i4, int i5) {
        this.f58176d = i4;
        this.f58177e = i5;
        return this;
    }

    public a j(Drawable drawable) {
        this.R = drawable;
        return this;
    }

    public a k(int i4) {
        this.f58178f = i4;
        return this;
    }

    public a l(GSYVideoGLView.c cVar) {
        this.T = cVar;
        return this;
    }

    public a m(int i4) {
        this.f58174b = i4;
        return this;
    }

    public a n(boolean z4) {
        this.B = z4;
        return this;
    }

    public a o(boolean z4) {
        this.C = z4;
        return this;
    }

    public a p(d dVar) {
        this.U = dVar;
        return this;
    }

    public a q(boolean z4) {
        this.f58182j = z4;
        return this;
    }

    public a r(boolean z4) {
        this.f58189q = z4;
        return this;
    }

    public a s(boolean z4) {
        this.f58190r = z4;
        return this;
    }

    public a t(g gVar) {
        this.M = gVar;
        return this;
    }

    public a u(boolean z4) {
        this.f58187o = z4;
        return this;
    }

    public a v(boolean z4) {
        this.f58188p = z4;
        return this;
    }

    public a w(Map<String, String> map) {
        this.K = map;
        return this;
    }

    public a x(boolean z4) {
        this.f58194v = z4;
        return this;
    }

    public a y(boolean z4) {
        this.f58185m = z4;
        return this;
    }

    public a z(boolean z4) {
        this.I = z4;
        return this;
    }
}
