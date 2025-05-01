package com.aggmoread.sdk.z.a.s;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.aggmoread.sdk.z.a.s.a;
import com.aggmoread.sdk.z.a.s.e;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class d extends SurfaceView implements a.g, e.c {
    private boolean A;
    private int B;
    private int C;
    private i D;
    private com.aggmoread.sdk.z.a.s.e E;
    private j F;
    private float G;
    MediaPlayer.OnVideoSizeChangedListener H;
    MediaPlayer.OnPreparedListener I;
    private MediaPlayer.OnCompletionListener J;
    private MediaPlayer.OnInfoListener K;
    private MediaPlayer.OnErrorListener L;
    private MediaPlayer.OnBufferingUpdateListener M;
    SurfaceHolder.Callback N;

    /* renamed from: a  reason: collision with root package name */
    private String f2512a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f2513b;

    /* renamed from: c  reason: collision with root package name */
    private int f2514c;

    /* renamed from: d  reason: collision with root package name */
    private int f2515d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceHolder f2516e;

    /* renamed from: f  reason: collision with root package name */
    private MediaPlayer f2517f;

    /* renamed from: g  reason: collision with root package name */
    private int f2518g;

    /* renamed from: h  reason: collision with root package name */
    private int f2519h;

    /* renamed from: i  reason: collision with root package name */
    private int f2520i;

    /* renamed from: j  reason: collision with root package name */
    private int f2521j;

    /* renamed from: k  reason: collision with root package name */
    private int f2522k;

    /* renamed from: l  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.s.a f2523l;

    /* renamed from: m  reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f2524m;

    /* renamed from: n  reason: collision with root package name */
    private MediaPlayer.OnPreparedListener f2525n;

    /* renamed from: o  reason: collision with root package name */
    private int f2526o;

    /* renamed from: p  reason: collision with root package name */
    private MediaPlayer.OnErrorListener f2527p;

    /* renamed from: q  reason: collision with root package name */
    private MediaPlayer.OnInfoListener f2528q;

    /* renamed from: r  reason: collision with root package name */
    private int f2529r;

    /* renamed from: s  reason: collision with root package name */
    private int f2530s;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f2531t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2532u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2533v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2534w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f2535x;

    /* renamed from: y  reason: collision with root package name */
    private Context f2536y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f2537z;

    /* loaded from: classes2.dex */
    class a implements MediaPlayer.OnVideoSizeChangedListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
            d.this.f2519h = mediaPlayer.getVideoWidth();
            d.this.f2520i = mediaPlayer.getVideoHeight();
            String unused = d.this.f2512a;
            String.format("onVideoSizeChanged width=%d,height=%d", Integer.valueOf(d.this.f2519h), Integer.valueOf(d.this.f2520i));
            if (d.this.f2519h == 0 || d.this.f2520i == 0) {
                return;
            }
            d.this.i();
            d.this.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            String unused = d.this.f2512a;
            d.this.f2514c = 2;
            d dVar = d.this;
            dVar.f2532u = dVar.f2533v = dVar.f2534w = true;
            d.this.f2535x = true;
            if (d.this.f2523l != null) {
                d.this.f2523l.g();
            }
            if (d.this.f2531t.compareAndSet(true, false) && d.this.f2525n != null) {
                d.this.f2525n.onPrepared(d.this.f2517f);
            }
            if (d.this.f2523l != null) {
                d.this.f2523l.setEnabled(true);
            }
            d.this.f2519h = mediaPlayer.getVideoWidth();
            d.this.f2520i = mediaPlayer.getVideoHeight();
            int i4 = d.this.f2529r;
            if (i4 != 0) {
                d.this.a(i4);
            }
            if (d.this.f2519h == 0 || d.this.f2520i == 0) {
                if (d.this.f2515d == 3) {
                    d.this.d();
                    return;
                }
                return;
            }
            d.this.i();
            if (d.this.l()) {
                if (d.this.f2515d == 3) {
                    d.this.d();
                    if (d.this.f2523l != null) {
                        d.this.f2523l.l();
                    }
                } else if (d.this.a()) {
                } else {
                    if ((i4 != 0 || d.this.f() > 0) && d.this.f2523l != null) {
                        d.this.f2523l.a(0);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            d.this.f2514c = 5;
            d.this.f2515d = 5;
            if (d.this.f2523l != null) {
                boolean isPlaying = d.this.f2517f.isPlaying();
                int i4 = d.this.f2514c;
                d.this.f2523l.m();
                String unused = d.this.f2512a;
                String.format("a=%s,b=%d", Boolean.valueOf(isPlaying), Integer.valueOf(i4));
            }
            if (d.this.f2524m != null) {
                d.this.f2524m.onCompletion(d.this.f2517f);
            }
        }
    }

    /* renamed from: com.aggmoread.sdk.z.a.s.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0080d implements MediaPlayer.OnInfoListener {
        C0080d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[RETURN] */
        @Override // android.media.MediaPlayer.OnInfoListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onInfo(android.media.MediaPlayer r5, int r6, int r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                r2 = 701(0x2bd, float:9.82E-43)
                if (r6 == r2) goto L3a
                r2 = 702(0x2be, float:9.84E-43)
                if (r6 == r2) goto Lc
                r2 = 0
                goto L68
            Lc:
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d.m(r2)
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d$j r2 = com.aggmoread.sdk.z.a.s.d.j(r2)
                if (r2 == 0) goto L28
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d$j r2 = com.aggmoread.sdk.z.a.s.d.j(r2)
                com.aggmoread.sdk.z.a.s.d r3 = com.aggmoread.sdk.z.a.s.d.this
                android.media.MediaPlayer r3 = com.aggmoread.sdk.z.a.s.d.e(r3)
                r2.b(r3)
            L28:
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.a r2 = com.aggmoread.sdk.z.a.s.d.u(r2)
                if (r2 == 0) goto L67
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.a r2 = com.aggmoread.sdk.z.a.s.d.u(r2)
                r2.g()
                goto L67
            L3a:
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d.m(r2)
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d$j r2 = com.aggmoread.sdk.z.a.s.d.j(r2)
                if (r2 == 0) goto L56
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.d$j r2 = com.aggmoread.sdk.z.a.s.d.j(r2)
                com.aggmoread.sdk.z.a.s.d r3 = com.aggmoread.sdk.z.a.s.d.this
                android.media.MediaPlayer r3 = com.aggmoread.sdk.z.a.s.d.e(r3)
                r2.c(r3)
            L56:
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.a r2 = com.aggmoread.sdk.z.a.s.d.u(r2)
                if (r2 == 0) goto L67
                com.aggmoread.sdk.z.a.s.d r2 = com.aggmoread.sdk.z.a.s.d.this
                com.aggmoread.sdk.z.a.s.a r2 = com.aggmoread.sdk.z.a.s.d.u(r2)
                r2.o()
            L67:
                r2 = 1
            L68:
                com.aggmoread.sdk.z.a.s.d r3 = com.aggmoread.sdk.z.a.s.d.this
                android.media.MediaPlayer$OnInfoListener r3 = com.aggmoread.sdk.z.a.s.d.k(r3)
                if (r3 == 0) goto L81
                com.aggmoread.sdk.z.a.s.d r3 = com.aggmoread.sdk.z.a.s.d.this
                android.media.MediaPlayer$OnInfoListener r3 = com.aggmoread.sdk.z.a.s.d.k(r3)
                boolean r5 = r3.onInfo(r5, r6, r7)
                if (r5 != 0) goto L80
                if (r2 == 0) goto L7f
                goto L80
            L7f:
                r0 = 0
            L80:
                return r0
            L81:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.a.s.d.C0080d.onInfo(android.media.MediaPlayer, int, int):boolean");
        }
    }

    /* loaded from: classes2.dex */
    class e implements MediaPlayer.OnErrorListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            String unused = d.this.f2512a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(i4);
            sb.append(",");
            sb.append(i5);
            d.this.f2514c = -1;
            d.this.f2515d = -1;
            if (d.this.f2523l != null) {
                d.this.f2523l.n();
            }
            if (d.this.f2527p != null) {
                d.this.f2527p.onError(d.this.f2517f, i4, i5);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class f implements MediaPlayer.OnBufferingUpdateListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
            if (d.this.F != null && i4 == 100) {
                d.this.F.g(mediaPlayer);
            }
            d.this.f2526o = i4;
        }
    }

    /* loaded from: classes2.dex */
    class g implements SurfaceHolder.Callback {
        g() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            String str = d.this.f2512a;
            com.aggmoread.sdk.z.a.d.c(str, "surfaceChanged w " + i5 + ", h " + i6 + ", mVideoWidth " + d.this.f2519h + ", mVideoHeight " + d.this.f2520i);
            d.this.f2521j = i5;
            d.this.f2522k = i6;
            boolean z4 = d.this.f2515d == 3;
            boolean l4 = d.this.l();
            if (d.this.f2517f != null && z4 && l4) {
                if (d.this.f2529r != 0) {
                    d dVar = d.this;
                    dVar.a(dVar.f2529r);
                }
                d.this.d();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            String str = d.this.f2512a;
            com.aggmoread.sdk.z.a.d.c(str, "surfaceCreated mSeekWhenDestroyed " + d.this.f2530s);
            d.this.f2516e = surfaceHolder;
            if (d.this.f2514c != 4 || d.this.f2517f == null) {
                d.this.o();
            } else {
                d.this.f2517f.setDisplay(d.this.f2516e);
            }
            d.this.k();
            if (d.this.f2530s > 0) {
                d dVar = d.this;
                dVar.a(dVar.f2530s);
                d.this.f2530s = 0;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            com.aggmoread.sdk.z.a.d.c(d.this.f2512a, "surfaceDestroyed");
            d.this.f2516e = null;
            if (d.this.F != null && d.this.f2514c != 4) {
                d.this.F.f(d.this.f2517f);
            }
            d dVar = d.this;
            dVar.f2530s = dVar.f();
            if (d.this.f2523l != null) {
                d.this.f2523l.e();
            }
            if (d.this.f2514c != 4) {
                d.this.b(true);
            }
            d.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2545a;

        static {
            int[] iArr = new int[i.values().length];
            f2545a = iArr;
            try {
                iArr[i.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2545a[i.TYPE_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2545a[i.TYPE_CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2545a[i.TYPE9_16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2545a[i.TYPE3_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2545a[i.TYPE5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2545a[i.TYPE_CLIP_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum i {
        TYPE,
        TYPE_SCALE,
        TYPE_CENTER_INSIDE,
        TYPE9_16,
        TYPE3_4,
        TYPE5,
        TYPE_CLIP_VIDEO
    }

    /* loaded from: classes2.dex */
    public interface j {
        void a(MediaPlayer mediaPlayer);

        void a(boolean z4);

        void b(MediaPlayer mediaPlayer);

        void c(MediaPlayer mediaPlayer);

        void d(MediaPlayer mediaPlayer);

        void e(MediaPlayer mediaPlayer);

        void f(MediaPlayer mediaPlayer);

        void g(MediaPlayer mediaPlayer);
    }

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2512a = "ApiVideoViewTAG";
        this.f2514c = 0;
        this.f2515d = 0;
        this.f2516e = null;
        this.f2517f = null;
        this.f2531t = new AtomicBoolean();
        this.f2537z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.G = 1.0f;
        this.H = new a();
        this.I = new b();
        this.J = new c();
        this.K = new C0080d();
        this.L = new e();
        this.M = new f();
        this.N = new g();
        this.f2536y = context;
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r1 > r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f2519h
            int r0 = android.view.SurfaceView.getDefaultSize(r0, r6)
            int r1 = r5.f2520i
            int r1 = android.view.SurfaceView.getDefaultSize(r1, r7)
            int r2 = r5.f2519h
            if (r2 <= 0) goto L78
            int r2 = r5.f2520i
            if (r2 <= 0) goto L78
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3d
            if (r1 != r2) goto L3d
            int r0 = r5.f2519h
            int r1 = r0 * r7
            int r2 = r5.f2520i
            int r3 = r6 * r2
            if (r1 >= r3) goto L38
            int r0 = r1 / r2
        L36:
            r1 = r7
            goto L78
        L38:
            if (r1 <= r3) goto L5d
            int r1 = r3 / r0
            goto L4e
        L3d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L50
            int r0 = r5.f2520i
            int r0 = r0 * r6
            int r2 = r5.f2519h
            int r0 = r0 / r2
            if (r1 != r3) goto L4d
            if (r0 <= r7) goto L4d
            goto L5d
        L4d:
            r1 = r0
        L4e:
            r0 = r6
            goto L78
        L50:
            if (r1 != r2) goto L61
            int r1 = r5.f2519h
            int r1 = r1 * r7
            int r2 = r5.f2520i
            int r1 = r1 / r2
            if (r0 != r3) goto L5f
            if (r1 <= r6) goto L5f
        L5d:
            r0 = r6
            goto L36
        L5f:
            r0 = r1
            goto L36
        L61:
            int r2 = r5.f2519h
            int r4 = r5.f2520i
            if (r1 != r3) goto L6d
            if (r4 <= r7) goto L6d
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6f
        L6d:
            r1 = r2
            r7 = r4
        L6f:
            if (r0 != r3) goto L5f
            if (r1 <= r6) goto L5f
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L4e
        L78:
            r5.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.a.s.d.a(int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r7 < r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r7 < r8) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r7, int r8, com.aggmoread.sdk.z.a.s.d.i r9) {
        /*
            r6 = this;
            int r0 = r6.f2519h
            int r1 = r6.f2520i
            int r2 = android.view.SurfaceView.getDefaultSize(r0, r7)
            int r3 = android.view.SurfaceView.getDefaultSize(r1, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onMeasureFitXY before width "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", height = "
            r4.append(r5)
            r4.append(r3)
            if (r0 <= 0) goto L78
            if (r1 <= 0) goto L78
            int[] r4 = com.aggmoread.sdk.z.a.s.d.h.f2545a
            int r9 = r9.ordinal()
            r9 = r4[r9]
            switch(r9) {
                case 1: goto L6a;
                case 2: goto L5b;
                case 3: goto L7a;
                case 4: goto L4d;
                case 5: goto L3f;
                case 6: goto L3b;
                case 7: goto L31;
                default: goto L30;
            }
        L30:
            goto L78
        L31:
            int r7 = r0 * r3
            int r8 = r1 * r2
            if (r7 <= r8) goto L38
            goto L67
        L38:
            if (r7 >= r8) goto L78
            goto L61
        L3b:
            int r0 = r0 * r3
            int r0 = r0 / r1
            goto L79
        L3f:
            int r7 = r2 * 3
            int r8 = r3 * 4
            if (r7 >= r8) goto L48
            int r1 = r7 / 4
            goto L63
        L48:
            if (r7 <= r8) goto L78
            int r0 = r8 / 3
            goto L79
        L4d:
            int r7 = r2 * 9
            int r8 = r3 * 16
            if (r7 >= r8) goto L56
            int r1 = r7 / 16
            goto L63
        L56:
            if (r7 <= r8) goto L78
            int r0 = r8 / 9
            goto L79
        L5b:
            int r7 = r0 * r3
            int r8 = r1 * r2
            if (r7 <= r8) goto L65
        L61:
            int r1 = r8 / r0
        L63:
            r0 = r2
            goto L7a
        L65:
            if (r7 >= r8) goto L78
        L67:
            int r0 = r7 / r1
            goto L79
        L6a:
            int r8 = r8 * r0
            int r7 = r7 * r1
            if (r8 <= r7) goto L78
            int r7 = r0 * r3
            int r1 = r1 * r2
            if (r7 <= r1) goto L78
            int r1 = r1 / r0
            goto L63
        L78:
            r0 = r2
        L79:
            r1 = r3
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onMeasureFitXY final  width "
            r7.append(r8)
            r7.append(r0)
            r7.append(r5)
            r7.append(r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.a.s.d.a(int, int, com.aggmoread.sdk.z.a.s.d$i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z4) {
        MediaPlayer mediaPlayer = this.f2517f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f2517f.reset();
            this.f2517f.release();
            this.f2517f = null;
            this.f2514c = 0;
            if (z4) {
                this.f2515d = 0;
            }
        }
    }

    private void h() {
        com.aggmoread.sdk.z.a.s.a aVar;
        if (this.f2517f == null || (aVar = this.f2523l) == null) {
            return;
        }
        aVar.a(this);
        this.f2523l.setEnabled(n());
        this.f2523l.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.f2537z || this.D == null) {
            int i4 = this.f2519h;
            int i5 = this.f2520i;
            StringBuilder sb = new StringBuilder();
            sb.append("videoWidth = ");
            sb.append(i4);
            sb.append(", videoHeight = ");
            sb.append(i5);
            getHolder().setFixedSize(i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.aggmoread.sdk.z.a.s.e eVar = this.E;
        if (eVar != null) {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.A && this.E == null) {
            com.aggmoread.sdk.z.a.s.e eVar = new com.aggmoread.sdk.z.a.s.e(this.f2536y);
            this.E = eVar;
            eVar.a(this);
            this.E.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return this.f2519h > 0 && this.f2520i > 0 && this.f2521j > 0 && this.f2522k > 0;
    }

    private void m() {
        this.f2519h = 0;
        this.f2520i = 0;
        getHolder().addCallback(this.N);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f2514c = 0;
        this.f2515d = 0;
    }

    private boolean n() {
        int i4;
        return (this.f2517f == null || (i4 = this.f2514c) == -1 || i4 == 0 || i4 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        j jVar;
        if (this.f2513b == null || this.f2516e == null) {
            return;
        }
        ((AudioManager) this.f2536y.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        b(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f2517f = mediaPlayer;
            int i4 = this.f2518g;
            if (i4 != 0) {
                mediaPlayer.setAudioSessionId(i4);
            } else {
                this.f2518g = mediaPlayer.getAudioSessionId();
            }
            this.f2517f.setOnPreparedListener(this.I);
            this.f2517f.setOnVideoSizeChangedListener(this.H);
            this.f2517f.setOnCompletionListener(this.J);
            this.f2517f.setOnErrorListener(this.L);
            this.f2517f.setOnInfoListener(this.K);
            this.f2517f.setOnBufferingUpdateListener(this.M);
            this.f2526o = 0;
            MediaPlayer mediaPlayer2 = this.f2517f;
            float f5 = this.G;
            mediaPlayer2.setVolume(f5, f5);
            this.f2517f.setDataSource(this.f2536y, this.f2513b);
            this.f2517f.setDisplay(this.f2516e);
            this.f2517f.setAudioStreamType(3);
            this.f2517f.setScreenOnWhilePlaying(true);
            this.f2517f.prepareAsync();
            if (this.f2531t.get() && (jVar = this.F) != null) {
                jVar.d(this.f2517f);
            }
            this.f2514c = 1;
            h();
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.f2513b);
            this.f2514c = -1;
            this.f2515d = -1;
            this.L.onError(this.f2517f, 1, 0);
        }
    }

    private void q() {
        com.aggmoread.sdk.z.a.s.a aVar = this.f2523l;
        if (aVar == null || aVar.c() == a.i.f2490d) {
            if (this.f2523l.i()) {
                this.f2523l.e();
            } else {
                this.f2523l.l();
            }
        }
    }

    public void a(int i4) {
        if (n()) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2517f.seekTo(i4, 3);
            } else {
                this.f2517f.seekTo(i4);
            }
            i4 = 0;
        }
        this.f2529r = i4;
    }

    @Override // com.aggmoread.sdk.z.a.s.e.c
    public void a(int i4, e.b bVar) {
        if (this.A) {
            if (bVar == e.b.f2563b) {
                a(false, 1);
            } else if (bVar == e.b.f2564c) {
                a(false, 7);
            } else if (bVar == e.b.f2565d) {
                a(true, 0);
            } else if (bVar == e.b.f2566e) {
                a(true, 8);
            }
        }
    }

    public void a(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f2524m = onCompletionListener;
    }

    public void a(MediaPlayer.OnErrorListener onErrorListener) {
        this.f2527p = onErrorListener;
    }

    public void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f2525n = onPreparedListener;
    }

    public void a(Uri uri) {
        a(uri, (Map<String, String>) null);
    }

    public void a(Uri uri, Map<String, String> map) {
        com.aggmoread.sdk.z.a.d.c(this.f2512a, "setVideoURI ");
        this.f2513b = uri;
        this.f2529r = 0;
        this.f2530s = 0;
        this.f2531t.set(true);
        o();
        requestLayout();
        invalidate();
    }

    public void a(com.aggmoread.sdk.z.a.s.a aVar) {
        com.aggmoread.sdk.z.a.s.a aVar2 = this.f2523l;
        if (aVar2 != null) {
            aVar2.e();
        }
        this.f2523l = aVar;
        h();
    }

    public void a(j jVar) {
        this.F = jVar;
    }

    public void a(String str) {
        a(Uri.parse(str));
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public void a(boolean z4) {
        a(z4, !z4 ? 1 : 0);
    }

    public void a(boolean z4, int i4) {
        Activity activity = (Activity) this.f2536y;
        if (z4) {
            if (this.B == 0 && this.C == 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                this.B = layoutParams.width;
                this.C = layoutParams.height;
            }
            activity.getWindow().addFlags(1024);
        } else {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = this.B;
            layoutParams2.height = this.C;
            setLayoutParams(layoutParams2);
            activity.getWindow().clearFlags(1024);
        }
        activity.setRequestedOrientation(i4);
        this.f2523l.a(z4);
        j jVar = this.F;
        if (jVar != null) {
            jVar.a(z4);
        }
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public boolean a() {
        return n() && this.f2517f.isPlaying();
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public void b() {
        com.aggmoread.sdk.z.a.d.c(this.f2512a, "pause");
        if (n() && this.f2517f.isPlaying()) {
            this.f2517f.pause();
            this.f2514c = 4;
            j jVar = this.F;
            if (jVar != null) {
                jVar.f(this.f2517f);
            }
        }
        this.f2515d = 4;
    }

    public void c(boolean z4) {
        this.A = z4;
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public boolean c() {
        return this.f2532u;
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public void d() {
        com.aggmoread.sdk.z.a.s.a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("start ");
        sb.append(this.f2514c);
        if (!this.f2535x && (aVar = this.f2523l) != null) {
            aVar.o();
        }
        if (n()) {
            com.aggmoread.sdk.z.a.s.a aVar2 = this.f2523l;
            if (aVar2 != null && aVar2.c() == a.i.f2489c) {
                this.f2523l.l();
            }
            this.f2517f.start();
            j jVar = this.F;
            if (jVar != null) {
                if (this.f2514c == 4) {
                    jVar.e(this.f2517f);
                } else {
                    jVar.a(this.f2517f);
                }
            }
            this.f2514c = 3;
        }
        this.f2515d = 3;
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public int e() {
        if (n()) {
            return this.f2517f.getDuration();
        }
        return -1;
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public int f() {
        if (n()) {
            return this.f2517f.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.aggmoread.sdk.z.a.s.a.g
    public int g() {
        if (this.f2517f != null) {
            return this.f2526o;
        }
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(d.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(d.class.getName());
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        boolean z4 = (i4 == 4 || i4 == 24 || i4 == 25 || i4 == 164 || i4 == 82 || i4 == 5 || i4 == 6) ? false : true;
        if (n() && z4 && this.f2523l != null) {
            if (i4 == 79 || i4 == 85) {
                if (this.f2517f.isPlaying()) {
                    b();
                    this.f2523l.l();
                } else {
                    d();
                    this.f2523l.e();
                }
                return true;
            } else if (i4 == 126) {
                if (!this.f2517f.isPlaying()) {
                    d();
                    this.f2523l.e();
                }
                return true;
            } else if (i4 == 86 || i4 == 127) {
                if (this.f2517f.isPlaying()) {
                    b();
                    this.f2523l.l();
                }
                return true;
            } else {
                q();
            }
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f2537z) {
            a(i4, i5, i.TYPE_CLIP_VIDEO);
        } else {
            a(i4, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.f2523l == null) {
            return false;
        }
        q();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.f2523l == null) {
            return false;
        }
        q();
        return false;
    }

    public void p() {
        MediaPlayer mediaPlayer = this.f2517f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f2517f.release();
            this.f2517f = null;
            this.f2514c = 0;
            this.f2515d = 0;
        }
    }
}
