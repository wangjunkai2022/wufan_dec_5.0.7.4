package fm.jiecao.jcvideoplayer_lib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.common.statfs.StatFsHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes6.dex */
public abstract class JCVideoPlayer extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static final int C1 = 3;
    public static final int D1 = 4;
    public static final int E1 = 5;
    public static final int F1 = 6;
    public static final int G1 = 7;
    public static int H1 = -1;
    protected static fm.jiecao.jcvideoplayer_lib.c I1 = null;
    public static final String J = "JieCaoVideoPlayer";
    protected static Timer J1 = null;
    public static boolean K = true;
    public static final String K1 = "URL_KEY_DEFAULT";
    public static boolean L = true;
    public static long L1 = 0;
    public static int M = 4;
    public static AudioManager.OnAudioFocusChangeListener M1 = new a();
    public static int N = 1;
    public static boolean O = true;
    public static boolean P = false;
    public static final int Q = 33797;
    public static final int R = 33798;
    public static final int S = 80;
    public static final int T = 300;
    public static long U = 0;
    public static final int V = 0;
    public static final int W = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f69008p0 = 2;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f69009p1 = 3;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f69010v1 = 0;
    protected boolean A;
    protected int B;
    protected int C;
    protected float D;
    protected int E;
    LinkedHashMap F;
    int G;
    public int H;
    public int I;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f69011b;

    /* renamed from: c  reason: collision with root package name */
    public int f69012c;

    /* renamed from: d  reason: collision with root package name */
    public int f69013d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69014e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f69015f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f69016g;

    /* renamed from: h  reason: collision with root package name */
    public int f69017h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f69018i;

    /* renamed from: j  reason: collision with root package name */
    public SeekBar f69019j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f69020k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f69021l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f69022m;

    /* renamed from: n  reason: collision with root package name */
    public ViewGroup f69023n;

    /* renamed from: o  reason: collision with root package name */
    public ViewGroup f69024o;

    /* renamed from: p  reason: collision with root package name */
    public ViewGroup f69025p;

    /* renamed from: q  reason: collision with root package name */
    protected int f69026q;

    /* renamed from: r  reason: collision with root package name */
    protected int f69027r;

    /* renamed from: s  reason: collision with root package name */
    protected AudioManager f69028s;

    /* renamed from: t  reason: collision with root package name */
    protected Handler f69029t;

    /* renamed from: u  reason: collision with root package name */
    protected c f69030u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f69031v;

    /* renamed from: w  reason: collision with root package name */
    protected float f69032w;

    /* renamed from: x  reason: collision with root package name */
    protected float f69033x;

    /* renamed from: y  reason: collision with root package name */
    protected boolean f69034y;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f69035z;

    /* loaded from: classes6.dex */
    static class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i4) {
            if (i4 != -2) {
                if (i4 != -1) {
                    return;
                }
                JCVideoPlayer.H();
                StringBuilder sb = new StringBuilder();
                sb.append("AUDIOFOCUS_LOSS [");
                sb.append(hashCode());
                sb.append("]");
                return;
            }
            try {
                if (fm.jiecao.jcvideoplayer_lib.b.b().f69076b != null && fm.jiecao.jcvideoplayer_lib.b.b().f69076b.isPlaying()) {
                    fm.jiecao.jcvideoplayer_lib.b.b().f69076b.pause();
                }
            } catch (IllegalStateException e5) {
                e5.printStackTrace();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AUDIOFOCUS_LOSS_TRANSIENT [");
            sb2.append(hashCode());
            sb2.append("]");
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            if (((f5 <= -15.0f || f5 >= -10.0f) && (f5 >= 15.0f || f5 <= 10.0f)) || Math.abs(f6) >= 1.5d || System.currentTimeMillis() - JCVideoPlayer.L1 <= 2000) {
                return;
            }
            if (f.b() != null) {
                f.b().b(f5);
            }
            JCVideoPlayer.L1 = System.currentTimeMillis();
        }
    }

    /* loaded from: classes6.dex */
    public class c extends TimerTask {

        /* loaded from: classes6.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int currentPositionWhenPlaying = JCVideoPlayer.this.getCurrentPositionWhenPlaying();
                int duration = JCVideoPlayer.this.getDuration();
                JCVideoPlayer.this.setProgressAndText((currentPositionWhenPlaying * 100) / (duration == 0 ? 1 : duration), currentPositionWhenPlaying, duration);
            }
        }

        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            JCVideoPlayer jCVideoPlayer = JCVideoPlayer.this;
            int i4 = jCVideoPlayer.f69012c;
            if (i4 == 3 || i4 == 5 || i4 == 4) {
                jCVideoPlayer.f69029t.post(new a());
            }
        }
    }

    public JCVideoPlayer(Context context) {
        super(context);
        this.f69011b = false;
        this.f69012c = -1;
        this.f69013d = -1;
        this.f69014e = false;
        this.f69016g = null;
        this.f69017h = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        m(context);
    }

    public static void H() {
        if (System.currentTimeMillis() - U > 300) {
            f.a();
            fm.jiecao.jcvideoplayer_lib.b.b().d();
        }
    }

    public static void M(Context context) {
        ActionBar supportActionBar;
        if (K && (supportActionBar = e.c(context).getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.show();
        }
        if (L) {
            e.c(context).getWindow().clearFlags(1024);
        }
    }

    public static void P(Context context, Class cls, String str, Object... objArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(K1, str);
        Q(context, cls, linkedHashMap, 0, objArr);
    }

    public static void Q(Context context, Class cls, LinkedHashMap linkedHashMap, int i4, Object... objArr) {
        l(context);
        e.c(context).setRequestedOrientation(M);
        ViewGroup viewGroup = (ViewGroup) e.j(context).findViewById(16908290);
        View findViewById = viewGroup.findViewById(Q);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        try {
            JCVideoPlayer jCVideoPlayer = (JCVideoPlayer) cls.getConstructor(Context.class).newInstance(context);
            jCVideoPlayer.setId(Q);
            viewGroup.addView(jCVideoPlayer, new FrameLayout.LayoutParams(-1, -1));
            jCVideoPlayer.setUp(linkedHashMap, i4, 2, objArr);
            U = System.currentTimeMillis();
            jCVideoPlayer.f69018i.performClick();
        } catch (InstantiationException e5) {
            e5.printStackTrace();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static boolean d() {
        if (System.currentTimeMillis() - U < 300) {
            return false;
        }
        if (f.d() != null) {
            U = System.currentTimeMillis();
            JCVideoPlayer d5 = f.d();
            d5.s(d5.f69013d == 2 ? 8 : 10);
            f.c().F();
            return true;
        } else if (f.c() == null || !(f.c().f69013d == 2 || f.c().f69013d == 3)) {
            return false;
        } else {
            U = System.currentTimeMillis();
            f.b().f69012c = 0;
            f.c().f();
            fm.jiecao.jcvideoplayer_lib.b.b().d();
            f.e(null);
            return true;
        }
    }

    public static void h(Context context, String str) {
        e.a(context, str);
    }

    public static void l(Context context) {
        ActionBar supportActionBar;
        if (K && (supportActionBar = e.c(context).getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.hide();
        }
        if (L) {
            e.c(context).getWindow().setFlags(1024, 1024);
        }
    }

    public static void setJcUserAction(fm.jiecao.jcvideoplayer_lib.c cVar) {
        I1 = cVar;
    }

    public void A() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStatePlaying  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 3;
        R();
    }

    public void B() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStatePreparing  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 1;
        J();
    }

    public void C(int i4, int i5) {
        this.f69012c = 2;
        this.G = i4;
        this.f69017h = i5;
        fm.jiecao.jcvideoplayer_lib.b.f69071l = e.d(this.F, i4);
        fm.jiecao.jcvideoplayer_lib.b.f69072m = this.f69014e;
        fm.jiecao.jcvideoplayer_lib.b.f69073n = this.f69015f;
        fm.jiecao.jcvideoplayer_lib.b.b().c();
    }

    public void D() {
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoRendingStart  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69011b = true;
        int i4 = this.f69012c;
        if (i4 == 1 || i4 == 2 || i4 == 4) {
            if (this.f69017h != 0) {
                fm.jiecao.jcvideoplayer_lib.b.b().f69076b.seekTo(this.f69017h);
                this.f69017h = 0;
            } else {
                int f5 = e.f(getContext(), e.d(this.F, this.G));
                if (f5 != 0) {
                    fm.jiecao.jcvideoplayer_lib.b.b().f69076b.seekTo(f5);
                }
            }
            R();
            A();
        }
    }

    public void E() {
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoSizeChanged  [");
        sb.append(hashCode());
        sb.append("] ");
        JCResizeTextureView jCResizeTextureView = fm.jiecao.jcvideoplayer_lib.b.f69069j;
        if (jCResizeTextureView != null) {
            jCResizeTextureView.setVideoSize(fm.jiecao.jcvideoplayer_lib.b.b().a());
        }
    }

    public void F() {
        StringBuilder sb = new StringBuilder();
        sb.append("playOnThisJcvd  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = f.d().f69012c;
        this.G = f.d().G;
        f();
        setState(this.f69012c);
        a();
    }

    public void G() {
        if (!e.d(this.F, this.G).equals(fm.jiecao.jcvideoplayer_lib.b.f69071l) || System.currentTimeMillis() - U <= 300) {
            return;
        }
        if (f.d() == null || f.d().f69013d != 2) {
            if (f.d() == null && f.c() != null && f.c().f69013d == 2) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("release [");
            sb.append(hashCode());
            sb.append("]");
            H();
        }
    }

    public void I() {
        fm.jiecao.jcvideoplayer_lib.b.f69070k = null;
        JCResizeTextureView jCResizeTextureView = fm.jiecao.jcvideoplayer_lib.b.f69069j;
        if (jCResizeTextureView == null || jCResizeTextureView.getParent() == null) {
            return;
        }
        ((ViewGroup) fm.jiecao.jcvideoplayer_lib.b.f69069j.getParent()).removeView(fm.jiecao.jcvideoplayer_lib.b.f69069j);
    }

    public void J() {
        this.f69019j.setProgress(0);
        this.f69019j.setSecondaryProgress(0);
        this.f69021l.setText(e.k(0));
        this.f69022m.setText(e.k(0));
    }

    public void K(int i4) {
    }

    public void L(float f5, String str, int i4, String str2, int i5) {
    }

    public void N(float f5, int i4) {
    }

    public void O(int i4) {
    }

    public void R() {
        e();
        J1 = new Timer();
        c cVar = new c();
        this.f69030u = cVar;
        J1.schedule(cVar, 0L, 300L);
    }

    public void S() {
        f.a();
        StringBuilder sb = new StringBuilder();
        sb.append("startVideo [");
        sb.append(hashCode());
        sb.append("] ");
        n();
        a();
        ((AudioManager) getContext().getSystemService("audio")).requestAudioFocus(M1, 3, 2);
        e.j(getContext()).getWindow().addFlags(128);
        fm.jiecao.jcvideoplayer_lib.b.f69071l = e.d(this.F, this.G);
        fm.jiecao.jcvideoplayer_lib.b.f69072m = this.f69014e;
        fm.jiecao.jcvideoplayer_lib.b.f69073n = this.f69015f;
        B();
        f.e(this);
    }

    public void T() {
        StringBuilder sb = new StringBuilder();
        sb.append("startWindowFullscreen  [");
        sb.append(hashCode());
        sb.append("] ");
        l(getContext());
        e.c(getContext()).setRequestedOrientation(M);
        ViewGroup viewGroup = (ViewGroup) e.j(getContext()).findViewById(16908290);
        View findViewById = viewGroup.findViewById(Q);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        this.f69023n.removeView(fm.jiecao.jcvideoplayer_lib.b.f69069j);
        try {
            JCVideoPlayer jCVideoPlayer = (JCVideoPlayer) getClass().getConstructor(Context.class).newInstance(getContext());
            jCVideoPlayer.setId(Q);
            viewGroup.addView(jCVideoPlayer, new FrameLayout.LayoutParams(-1, -1));
            jCVideoPlayer.setUp(this.F, this.G, 2, this.f69016g);
            jCVideoPlayer.setState(this.f69012c);
            jCVideoPlayer.a();
            f.f(jCVideoPlayer);
            x();
            U = System.currentTimeMillis();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void U() {
        StringBuilder sb = new StringBuilder();
        sb.append("startWindowTiny  [");
        sb.append(hashCode());
        sb.append("] ");
        s(9);
        int i4 = this.f69012c;
        if (i4 == 0 || i4 == 7) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) e.j(getContext()).findViewById(16908290);
        View findViewById = viewGroup.findViewById(R);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        this.f69023n.removeView(fm.jiecao.jcvideoplayer_lib.b.f69069j);
        try {
            JCVideoPlayer jCVideoPlayer = (JCVideoPlayer) getClass().getConstructor(Context.class).newInstance(getContext());
            jCVideoPlayer.setId(R);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) StatFsHelper.f10899h, (int) StatFsHelper.f10899h);
            layoutParams.gravity = 85;
            viewGroup.addView(jCVideoPlayer, layoutParams);
            jCVideoPlayer.setUp(this.F, this.G, 3, this.f69016g);
            jCVideoPlayer.setState(this.f69012c);
            jCVideoPlayer.a();
            f.f(jCVideoPlayer);
            x();
        } catch (InstantiationException e5) {
            e5.printStackTrace();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("addTextureView [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69023n.addView(fm.jiecao.jcvideoplayer_lib.b.f69069j, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void b(float f5) {
        int i4;
        if (!o() || this.f69012c != 3 || (i4 = this.f69013d) == 2 || i4 == 3) {
            return;
        }
        if (f5 > 0.0f) {
            e.c(getContext()).setRequestedOrientation(0);
        } else {
            e.c(getContext()).setRequestedOrientation(8);
        }
        s(7);
        T();
    }

    public void c() {
        if (System.currentTimeMillis() - L1 > 2000 && o() && this.f69012c == 3 && this.f69013d == 2) {
            L1 = System.currentTimeMillis();
            d();
        }
    }

    public void e() {
        Timer timer = J1;
        if (timer != null) {
            timer.cancel();
        }
        c cVar = this.f69030u;
        if (cVar != null) {
            cVar.cancel();
        }
    }

    public void f() {
        e.c(getContext()).setRequestedOrientation(N);
        M(getContext());
        JCVideoPlayer b5 = f.b();
        b5.f69023n.removeView(fm.jiecao.jcvideoplayer_lib.b.f69069j);
        ((ViewGroup) e.j(getContext()).findViewById(16908290)).removeView(b5);
        f.f(null);
    }

    public void g() {
        ViewGroup viewGroup = (ViewGroup) e.j(getContext()).findViewById(16908290);
        View findViewById = viewGroup.findViewById(Q);
        View findViewById2 = viewGroup.findViewById(R);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
        M(getContext());
    }

    public int getCurrentPositionWhenPlaying() {
        if (fm.jiecao.jcvideoplayer_lib.b.b().f69076b == null) {
            return 0;
        }
        int i4 = this.f69012c;
        if (i4 == 3 || i4 == 5 || i4 == 4) {
            try {
                return fm.jiecao.jcvideoplayer_lib.b.b().f69076b.getCurrentPosition();
            } catch (IllegalStateException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public int getDuration() {
        if (fm.jiecao.jcvideoplayer_lib.b.b().f69076b == null) {
            return 0;
        }
        try {
            return fm.jiecao.jcvideoplayer_lib.b.b().f69076b.getDuration();
        } catch (IllegalStateException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public abstract int getLayoutId();

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void m(Context context) {
        View.inflate(context, getLayoutId(), this);
        this.f69018i = (ImageView) findViewById(R.id.start);
        this.f69020k = (ImageView) findViewById(R.id.fullscreen);
        this.f69019j = (SeekBar) findViewById(R.id.bottom_seek_progress);
        this.f69021l = (TextView) findViewById(R.id.current);
        this.f69022m = (TextView) findViewById(R.id.total);
        this.f69025p = (ViewGroup) findViewById(R.id.layout_bottom);
        this.f69023n = (ViewGroup) findViewById(R.id.surface_container);
        this.f69024o = (ViewGroup) findViewById(R.id.layout_top);
        this.f69018i.setOnClickListener(this);
        this.f69020k.setOnClickListener(this);
        this.f69019j.setOnSeekBarChangeListener(this);
        this.f69025p.setOnClickListener(this);
        this.f69023n.setOnClickListener(this);
        this.f69023n.setOnTouchListener(this);
        this.f69026q = getContext().getResources().getDisplayMetrics().widthPixels;
        this.f69027r = getContext().getResources().getDisplayMetrics().heightPixels;
        this.f69028s = (AudioManager) getContext().getSystemService("audio");
        this.f69029t = new Handler();
        try {
            if (o()) {
                N = ((AppCompatActivity) context).getRequestedOrientation();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void n() {
        I();
        JCResizeTextureView jCResizeTextureView = new JCResizeTextureView(getContext());
        fm.jiecao.jcvideoplayer_lib.b.f69069j = jCResizeTextureView;
        jCResizeTextureView.setSurfaceTextureListener(fm.jiecao.jcvideoplayer_lib.b.b());
    }

    public boolean o() {
        return f.b() != null && f.b() == this;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.start) {
            StringBuilder sb = new StringBuilder();
            sb.append("onClick start [");
            sb.append(hashCode());
            sb.append("] ");
            if (TextUtils.isEmpty(e.d(this.F, this.G))) {
                Toast.makeText(getContext(), getResources().getString(R.string.no_url), 0).show();
                return;
            }
            int i4 = this.f69012c;
            if (i4 == 0 || i4 == 7) {
                if (!e.d(this.F, this.G).startsWith(com.facebook.common.util.f.f10925c) && !e.d(this.F, this.G).startsWith(net.lingala.zip4j.util.e.F0) && !e.h(getContext()) && !P) {
                    O(0);
                    return;
                }
                S();
                s(this.f69012c == 7 ? 1 : 0);
            } else if (i4 == 3) {
                s(3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pauseVideo [");
                sb2.append(hashCode());
                sb2.append("] ");
                fm.jiecao.jcvideoplayer_lib.b.b().f69076b.pause();
                y();
            } else if (i4 == 5) {
                s(4);
                fm.jiecao.jcvideoplayer_lib.b.b().f69076b.start();
                A();
            } else if (i4 == 6) {
                s(2);
                S();
            }
        } else if (id == R.id.fullscreen) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onClick fullscreen [");
            sb3.append(hashCode());
            sb3.append("] ");
            if (this.f69012c == 6) {
                return;
            }
            if (this.f69013d == 2) {
                d();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("toFullscreenActivity [");
            sb4.append(hashCode());
            sb4.append("] ");
            s(7);
            T();
        } else if (id == R.id.surface_container && this.f69012c == 7) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onClick surfaceContainer State=Error [");
            sb5.append(hashCode());
            sb5.append("] ");
            S();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6 = this.f69013d;
        if (i6 != 2 && i6 != 3) {
            if (this.H != 0 && this.I != 0) {
                int size = View.MeasureSpec.getSize(i4);
                int i7 = (int) ((size * this.I) / this.H);
                setMeasuredDimension(size, i7);
                getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                return;
            }
            super.onMeasure(i4, i5);
            return;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        StringBuilder sb = new StringBuilder();
        sb.append("bottomProgress onStartTrackingTouch [");
        sb.append(hashCode());
        sb.append("] ");
        e();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        StringBuilder sb = new StringBuilder();
        sb.append("bottomProgress onStopTrackingTouch [");
        sb.append(hashCode());
        sb.append("] ");
        s(5);
        R();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        int i4 = this.f69012c;
        if (i4 == 3 || i4 == 5) {
            int progress = (seekBar.getProgress() * getDuration()) / 100;
            fm.jiecao.jcvideoplayer_lib.b.b().f69076b.seekTo(progress);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("seekTo ");
            sb2.append(progress);
            sb2.append(" [");
            sb2.append(hashCode());
            sb2.append("] ");
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int streamMaxVolume;
        float x4 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (view.getId() == R.id.surface_container) {
            int action = motionEvent.getAction();
            if (action == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onTouch surfaceContainer actionDown [");
                sb.append(hashCode());
                sb.append("] ");
                this.f69031v = true;
                this.f69032w = x4;
                this.f69033x = y2;
                this.f69034y = false;
                this.f69035z = false;
                this.A = false;
            } else if (action == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onTouch surfaceContainer actionUp [");
                sb2.append(hashCode());
                sb2.append("] ");
                this.f69031v = false;
                j();
                k();
                i();
                if (this.f69035z) {
                    s(12);
                    fm.jiecao.jcvideoplayer_lib.b.b().f69076b.seekTo(this.E);
                    int duration = getDuration();
                    this.f69019j.setProgress((this.E * 100) / (duration != 0 ? duration : 1));
                }
                if (this.f69034y) {
                    s(11);
                }
                R();
            } else if (action == 2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onTouch surfaceContainer actionMove [");
                sb3.append(hashCode());
                sb3.append("] ");
                float f5 = x4 - this.f69032w;
                float f6 = y2 - this.f69033x;
                float abs = Math.abs(f5);
                float abs2 = Math.abs(f6);
                if (this.f69013d == 2 && !this.f69035z && !this.f69034y && !this.A && (abs > 80.0f || abs2 > 80.0f)) {
                    e();
                    if (abs >= 80.0f) {
                        if (this.f69012c != 7) {
                            this.f69035z = true;
                            this.B = getCurrentPositionWhenPlaying();
                        }
                    } else if (this.f69032w < this.f69026q * 0.5f) {
                        this.A = true;
                        float f7 = e.c(getContext()).getWindow().getAttributes().screenBrightness;
                        if (f7 < 0.0f) {
                            try {
                                this.D = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("current system brightness: ");
                                sb4.append(this.D);
                            } catch (Settings.SettingNotFoundException e5) {
                                e5.printStackTrace();
                            }
                        } else {
                            this.D = f7 * 255.0f;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("current activity brightness: ");
                            sb5.append(this.D);
                        }
                    } else {
                        this.f69034y = true;
                        this.C = this.f69028s.getStreamVolume(3);
                    }
                }
                if (this.f69035z) {
                    int duration2 = getDuration();
                    int i4 = (int) (this.B + ((duration2 * f5) / this.f69026q));
                    this.E = i4;
                    if (i4 > duration2) {
                        this.E = duration2;
                    }
                    L(f5, e.k(this.E), this.E, e.k(duration2), duration2);
                }
                if (this.f69034y) {
                    f6 = -f6;
                    this.f69028s.setStreamVolume(3, this.C + ((int) (((this.f69028s.getStreamMaxVolume(3) * f6) * 3.0f) / this.f69027r)), 0);
                    N(-f6, (int) (((this.C * 100) / streamMaxVolume) + (((f6 * 3.0f) * 100.0f) / this.f69027r)));
                }
                if (this.A) {
                    float f8 = -f6;
                    WindowManager.LayoutParams attributes = e.c(getContext()).getWindow().getAttributes();
                    float f9 = this.D;
                    float f10 = (int) (((f8 * 255.0f) * 3.0f) / this.f69027r);
                    if ((f9 + f10) / 255.0f >= 1.0f) {
                        attributes.screenBrightness = 1.0f;
                    } else if ((f9 + f10) / 255.0f <= 0.0f) {
                        attributes.screenBrightness = 0.01f;
                    } else {
                        attributes.screenBrightness = (f9 + f10) / 255.0f;
                    }
                    e.c(getContext()).getWindow().setAttributes(attributes);
                    K((int) (((this.D * 100.0f) / 255.0f) + (((f8 * 3.0f) * 100.0f) / this.f69027r)));
                }
            }
        }
        return false;
    }

    public void p() {
        Runtime.getRuntime().gc();
        StringBuilder sb = new StringBuilder();
        sb.append("onAutoCompletion  [");
        sb.append(hashCode());
        sb.append("] ");
        s(6);
        k();
        j();
        i();
        e();
        v();
        if (this.f69013d == 2) {
            d();
        }
        e.i(getContext(), e.d(this.F, this.G), 0);
    }

    public void q() {
        StringBuilder sb = new StringBuilder();
        sb.append("onCompletion  [");
        sb.append(hashCode());
        sb.append("] ");
        int i4 = this.f69012c;
        if (i4 == 3 || i4 == 5) {
            e.i(getContext(), e.d(this.F, this.G), getCurrentPositionWhenPlaying());
        }
        e();
        x();
        this.f69023n.removeView(fm.jiecao.jcvideoplayer_lib.b.f69069j);
        fm.jiecao.jcvideoplayer_lib.b.b().f69077c = 0;
        fm.jiecao.jcvideoplayer_lib.b.b().f69078d = 0;
        ((AudioManager) getContext().getSystemService("audio")).abandonAudioFocus(M1);
        e.j(getContext()).getWindow().clearFlags(128);
        g();
        e.c(getContext()).setRequestedOrientation(N);
        fm.jiecao.jcvideoplayer_lib.b.f69069j = null;
        fm.jiecao.jcvideoplayer_lib.b.f69070k = null;
        this.f69011b = false;
    }

    public void r(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("onError ");
        sb.append(i4);
        sb.append(" - ");
        sb.append(i5);
        sb.append(" [");
        sb.append(hashCode());
        sb.append("] ");
        if (i4 == 38 || i4 == -38 || i5 == -38) {
            return;
        }
        w();
        if (o()) {
            fm.jiecao.jcvideoplayer_lib.b.b().d();
        }
    }

    public void s(int i4) {
        LinkedHashMap linkedHashMap;
        if (I1 == null || !o() || (linkedHashMap = this.F) == null) {
            return;
        }
        I1.a(i4, e.d(linkedHashMap, this.G), this.f69013d, this.f69016g);
    }

    public void setBufferProgress(int i4) {
        if (i4 != 0) {
            this.f69019j.setSecondaryProgress(i4);
        }
    }

    public void setProgressAndText(int i4, int i5, int i6) {
        if (!this.f69031v && i4 != 0) {
            this.f69019j.setProgress(i4);
        }
        if (i5 != 0) {
            this.f69021l.setText(e.k(i5));
        }
        this.f69022m.setText(e.k(i6));
    }

    public void setState(int i4) {
        setState(i4, 0, 0);
    }

    public void setUp(String str, int i4, Object... objArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(K1, str);
        setUp(linkedHashMap, 0, i4, objArr);
    }

    public void t(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("onInfo what - ");
        sb.append(i4);
        sb.append(" extra - ");
        sb.append(i5);
        if (i4 == 701) {
            int i6 = this.f69012c;
            if (i6 == 4) {
                return;
            }
            H1 = i6;
            z();
        } else if (i4 != 702) {
            if (i4 == 3) {
                D();
            }
        } else {
            int i7 = H1;
            if (i7 != -1) {
                if (this.f69012c == 4) {
                    setState(i7);
                }
                H1 = -1;
            }
        }
    }

    public void u() {
    }

    public void v() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStateAutoComplete  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 6;
        e();
        this.f69019j.setProgress(100);
        this.f69021l.setText(this.f69022m.getText());
    }

    public void w() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStateError  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 7;
        e();
    }

    public void x() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStateNormal  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 0;
        e();
        if (o()) {
            fm.jiecao.jcvideoplayer_lib.b.b().d();
        }
    }

    public void y() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStatePause  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 5;
        R();
    }

    public void z() {
        StringBuilder sb = new StringBuilder();
        sb.append("onStatePlaybackBufferingStart  [");
        sb.append(hashCode());
        sb.append("] ");
        this.f69012c = 4;
        R();
    }

    public void setState(int i4, int i5, int i6) {
        switch (i4) {
            case 0:
                x();
                return;
            case 1:
                B();
                return;
            case 2:
                C(i5, i6);
                return;
            case 3:
                A();
                return;
            case 4:
                z();
                return;
            case 5:
                y();
                return;
            case 6:
                v();
                return;
            case 7:
                w();
                return;
            default:
                return;
        }
    }

    public void setUp(LinkedHashMap linkedHashMap, int i4, int i5, Object... objArr) {
        if (this.F == null || TextUtils.isEmpty(e.d(linkedHashMap, this.G)) || !TextUtils.equals(e.d(this.F, this.G), e.d(linkedHashMap, this.G))) {
            this.F = linkedHashMap;
            this.G = i4;
            this.f69013d = i5;
            this.f69016g = objArr;
            this.f69015f = null;
            this.f69011b = false;
            x();
        }
    }

    public JCVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69011b = false;
        this.f69012c = -1;
        this.f69013d = -1;
        this.f69014e = false;
        this.f69016g = null;
        this.f69017h = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        m(context);
    }
}
