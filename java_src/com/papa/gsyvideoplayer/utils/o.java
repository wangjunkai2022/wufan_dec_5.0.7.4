package com.papa.gsyvideoplayer.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.OrientationEventListener;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
/* compiled from: OrientationUtils.java */
/* loaded from: classes5.dex */
public class o {

    /* renamed from: n  reason: collision with root package name */
    private static final int f58585n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f58586o = 1;

    /* renamed from: p  reason: collision with root package name */
    private static final int f58587p = 2;

    /* renamed from: a  reason: collision with root package name */
    private Activity f58588a;

    /* renamed from: b  reason: collision with root package name */
    private GSYBaseVideoPlayer f58589b;

    /* renamed from: c  reason: collision with root package name */
    private OrientationEventListener f58590c;

    /* renamed from: d  reason: collision with root package name */
    private n f58591d;

    /* renamed from: e  reason: collision with root package name */
    private int f58592e;

    /* renamed from: f  reason: collision with root package name */
    private int f58593f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58594g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58595h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58596i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f58597j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58598k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f58599l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58600m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationUtils.java */
    /* loaded from: classes5.dex */
    public class a extends OrientationEventListener {
        a(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        @SuppressLint({"SourceLockedOrientationActivity"})
        public void onOrientationChanged(int i4) {
            if ((Settings.System.getInt(o.this.f58588a.getContentResolver(), "accelerometer_rotation", 0) == 1) || !o.this.f58598k || (o.this.f58600m && o.this.r() != 0)) {
                if ((o.this.f58589b == null || !o.this.f58589b.isVerticalFullByVideoSize()) && !o.this.f58599l) {
                    if ((i4 < 0 || i4 > o.this.f58591d.d()) && i4 < o.this.f58591d.c()) {
                        if (i4 < o.this.f58591d.b() || i4 > o.this.f58591d.a()) {
                            if (i4 <= o.this.f58591d.f() || i4 >= o.this.f58591d.e()) {
                                return;
                            }
                            if (o.this.f58594g) {
                                if (o.this.f58593f == 2 || o.this.f58596i) {
                                    o.this.f58595h = true;
                                    o.this.f58594g = false;
                                    o.this.f58593f = 2;
                                }
                            } else if (o.this.f58593f != 2) {
                                o.this.f58592e = 0;
                                o.this.N(8);
                                if (o.this.f58589b.getFullscreenButton() != null) {
                                    o.this.f58589b.getFullscreenButton().setImageResource(o.this.f58589b.getShrinkImageRes());
                                }
                                o.this.f58593f = 2;
                                o.this.f58594g = false;
                            }
                        } else if (o.this.f58594g) {
                            if (o.this.f58593f == 1 || o.this.f58596i) {
                                o.this.f58595h = true;
                                o.this.f58594g = false;
                                o.this.f58593f = 1;
                            }
                        } else if (o.this.f58593f != 1) {
                            o.this.f58592e = 0;
                            o.this.N(0);
                            if (o.this.f58589b.getFullscreenButton() != null) {
                                o.this.f58589b.getFullscreenButton().setImageResource(o.this.f58589b.getShrinkImageRes());
                            }
                            o.this.f58593f = 1;
                            o.this.f58594g = false;
                        }
                    } else if (o.this.f58594g) {
                        if (o.this.f58593f <= 0 || o.this.f58595h) {
                            o.this.f58596i = true;
                            o.this.f58594g = false;
                            o.this.f58593f = 0;
                        }
                    } else if (o.this.f58593f > 0) {
                        if (!o.this.f58600m) {
                            o.this.f58592e = 1;
                            o.this.N(1);
                            if (o.this.f58589b.getFullscreenButton() != null) {
                                if (o.this.f58589b.isIfCurrentIsFullscreen()) {
                                    o.this.f58589b.getFullscreenButton().setImageResource(o.this.f58589b.getShrinkImageRes());
                                } else {
                                    o.this.f58589b.getFullscreenButton().setImageResource(o.this.f58589b.getEnlargeImageRes());
                                }
                            }
                            o.this.f58593f = 0;
                        }
                        o.this.f58594g = false;
                    }
                }
            }
        }
    }

    public o(Activity activity, GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        this(activity, gSYBaseVideoPlayer, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i4) {
        try {
            this.f58588a.setRequestedOrientation(i4);
        } catch (IllegalStateException e5) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 != 26 && i5 != 27) {
                e5.printStackTrace();
            } else {
                c.f("OrientationUtils", e5);
            }
        }
    }

    private void v(Activity activity) {
        if (this.f58593f == 0) {
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == 0) {
                this.f58593f = 0;
                this.f58592e = 1;
            } else if (rotation == 3) {
                this.f58593f = 2;
                this.f58592e = 8;
            } else {
                this.f58593f = 1;
                this.f58592e = 0;
            }
        }
    }

    public boolean A() {
        return this.f58600m;
    }

    public boolean B() {
        return this.f58599l;
    }

    public boolean C() {
        return this.f58598k;
    }

    public void D() {
        OrientationEventListener orientationEventListener = this.f58590c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public void E() {
        GSYBaseVideoPlayer gSYBaseVideoPlayer;
        if (this.f58593f == 0 && (gSYBaseVideoPlayer = this.f58589b) != null && gSYBaseVideoPlayer.isVerticalFullByVideoSize()) {
            return;
        }
        this.f58594g = true;
        if (this.f58593f == 0) {
            if (this.f58588a.getRequestedOrientation() == 8) {
                this.f58592e = 8;
            } else {
                this.f58592e = 0;
            }
            N(this.f58592e);
            if (this.f58589b.getFullscreenButton() != null) {
                this.f58589b.getFullscreenButton().setImageResource(this.f58589b.getShrinkImageRes());
            }
            this.f58593f = 1;
            this.f58595h = false;
            return;
        }
        this.f58592e = 1;
        N(1);
        if (this.f58589b.getFullscreenButton() != null) {
            if (this.f58589b.isIfCurrentIsFullscreen()) {
                this.f58589b.getFullscreenButton().setImageResource(this.f58589b.getShrinkImageRes());
            } else {
                this.f58589b.getFullscreenButton().setImageResource(this.f58589b.getEnlargeImageRes());
            }
        }
        this.f58593f = 0;
        this.f58596i = false;
    }

    public void F(boolean z4) {
        this.f58594g = z4;
    }

    public void G(boolean z4) {
        this.f58595h = z4;
    }

    public void H(boolean z4) {
        this.f58596i = z4;
    }

    public void I(boolean z4) {
        this.f58597j = z4;
        if (z4) {
            this.f58590c.enable();
        } else {
            this.f58590c.disable();
        }
    }

    public void J(int i4) {
        this.f58593f = i4;
    }

    public void K(boolean z4) {
        this.f58599l = z4;
    }

    public void L(boolean z4) {
        this.f58600m = z4;
    }

    public void M(n nVar) {
        this.f58591d = nVar;
    }

    public void O(boolean z4) {
        this.f58598k = z4;
    }

    public void P(int i4) {
        this.f58592e = i4;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public int q() {
        if (this.f58593f > 0) {
            this.f58594g = true;
            N(1);
            GSYBaseVideoPlayer gSYBaseVideoPlayer = this.f58589b;
            if (gSYBaseVideoPlayer != null && gSYBaseVideoPlayer.getFullscreenButton() != null) {
                this.f58589b.getFullscreenButton().setImageResource(this.f58589b.getEnlargeImageRes());
            }
            this.f58593f = 0;
            this.f58596i = false;
            return 500;
        }
        return 0;
    }

    public int r() {
        return this.f58593f;
    }

    public n s() {
        return this.f58591d;
    }

    public int t() {
        return this.f58592e;
    }

    protected void u() {
        a aVar = new a(this.f58588a.getApplicationContext());
        this.f58590c = aVar;
        aVar.enable();
    }

    public boolean w() {
        return this.f58594g;
    }

    public boolean x() {
        return this.f58595h;
    }

    public boolean y() {
        return this.f58596i;
    }

    public boolean z() {
        return this.f58597j;
    }

    public o(Activity activity, GSYBaseVideoPlayer gSYBaseVideoPlayer, n nVar) {
        this.f58592e = 1;
        this.f58593f = 0;
        this.f58594g = false;
        this.f58595h = false;
        this.f58597j = true;
        this.f58598k = true;
        this.f58599l = false;
        this.f58600m = false;
        this.f58588a = activity;
        this.f58589b = gSYBaseVideoPlayer;
        if (nVar == null) {
            this.f58591d = new n();
        } else {
            this.f58591d = nVar;
        }
        v(activity);
        u();
    }
}
