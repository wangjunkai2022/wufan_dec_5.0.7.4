package com.papa.gsyvideoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.papa.gsyvideoplayer.cache.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* compiled from: GSYVideoBaseManager.java */
/* loaded from: classes5.dex */
public abstract class c implements IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnInfoListener, b.a, com.papa.gsyvideoplayer.video.base.a {

    /* renamed from: t  reason: collision with root package name */
    public static String f58199t = "GSYVideoBaseManager";

    /* renamed from: u  reason: collision with root package name */
    protected static final int f58200u = 0;

    /* renamed from: v  reason: collision with root package name */
    protected static final int f58201v = 1;

    /* renamed from: w  reason: collision with root package name */
    protected static final int f58202w = 2;

    /* renamed from: x  reason: collision with root package name */
    protected static final int f58203x = 3;

    /* renamed from: y  reason: collision with root package name */
    protected static final int f58204y = -192;

    /* renamed from: a  reason: collision with root package name */
    protected Context f58205a;

    /* renamed from: b  reason: collision with root package name */
    protected i f58206b;

    /* renamed from: c  reason: collision with root package name */
    protected Handler f58207c;

    /* renamed from: d  reason: collision with root package name */
    protected WeakReference<s2.a> f58208d;

    /* renamed from: e  reason: collision with root package name */
    protected WeakReference<s2.a> f58209e;

    /* renamed from: f  reason: collision with root package name */
    protected com.papa.gsyvideoplayer.player.b f58210f;

    /* renamed from: g  reason: collision with root package name */
    protected List<com.papa.gsyvideoplayer.model.c> f58211g;

    /* renamed from: i  reason: collision with root package name */
    protected com.papa.gsyvideoplayer.player.c f58213i;

    /* renamed from: j  reason: collision with root package name */
    protected com.papa.gsyvideoplayer.cache.b f58214j;

    /* renamed from: m  reason: collision with root package name */
    protected int f58217m;

    /* renamed from: o  reason: collision with root package name */
    protected int f58219o;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f58222r;

    /* renamed from: h  reason: collision with root package name */
    protected String f58212h = "";

    /* renamed from: k  reason: collision with root package name */
    protected int f58215k = 0;

    /* renamed from: l  reason: collision with root package name */
    protected int f58216l = 0;

    /* renamed from: n  reason: collision with root package name */
    protected int f58218n = -22;

    /* renamed from: p  reason: collision with root package name */
    protected int f58220p = 8000;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f58221q = true;

    /* renamed from: s  reason: collision with root package name */
    private Runnable f58223s = new h();

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E();
            if (c.this.w() != null) {
                c.this.w().onPrepared();
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E();
            if (c.this.w() != null) {
                c.this.w().onAutoCompletion();
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* renamed from: com.papa.gsyvideoplayer.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0587c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58226b;

        RunnableC0587c(int i4) {
            this.f58226b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.w() != null) {
                int i4 = this.f58226b;
                c cVar = c.this;
                if (i4 > cVar.f58219o) {
                    cVar.w().onBufferingUpdate(this.f58226b);
                } else {
                    cVar.w().onBufferingUpdate(c.this.f58219o);
                }
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E();
            if (c.this.w() != null) {
                c.this.w().onSeekComplete();
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58230c;

        e(int i4, int i5) {
            this.f58229b = i4;
            this.f58230c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E();
            if (c.this.w() != null) {
                c.this.w().onError(this.f58229b, this.f58230c);
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58233c;

        f(int i4, int i5) {
            this.f58232b = i4;
            this.f58233c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            if (cVar.f58222r) {
                int i4 = this.f58232b;
                if (i4 == 701) {
                    cVar.b0();
                } else if (i4 == 702) {
                    cVar.E();
                }
            }
            if (c.this.w() != null) {
                c.this.w().onInfo(this.f58232b, this.f58233c);
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.w() != null) {
                c.this.w().onVideoSizeChanged();
            }
        }
    }

    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f58208d != null) {
                com.papa.gsyvideoplayer.utils.c.e("time out for error listener");
                c.this.w().onError(c.f58204y, c.f58204y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GSYVideoBaseManager.java */
    /* loaded from: classes5.dex */
    public class i extends Handler {
        i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 0) {
                c.this.R(message);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                c.this.U(message);
            } else {
                com.papa.gsyvideoplayer.player.c cVar = c.this.f58213i;
                if (cVar != null) {
                    cVar.release();
                }
                com.papa.gsyvideoplayer.cache.b bVar = c.this.f58214j;
                if (bVar != null) {
                    bVar.release();
                }
                c cVar2 = c.this;
                cVar2.f58219o = 0;
                cVar2.W(cVar2.f58221q);
                c.this.E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Message message) {
        try {
            this.f58215k = 0;
            this.f58216l = 0;
            com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
            if (cVar != null) {
                cVar.release();
            }
            this.f58213i = M();
            com.papa.gsyvideoplayer.cache.b I = I();
            this.f58214j = I;
            if (I != null) {
                I.i(this);
            }
            com.papa.gsyvideoplayer.player.c cVar2 = this.f58213i;
            if (cVar2 instanceof com.papa.gsyvideoplayer.player.a) {
                ((com.papa.gsyvideoplayer.player.a) cVar2).g(this.f58210f);
            }
            this.f58213i.i(this.f58205a, message, this.f58211g, this.f58214j);
            W(this.f58221q);
            IMediaPlayer mediaPlayer = this.f58213i.getMediaPlayer();
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setScreenOnWhilePlaying(true);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.prepareAsync();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(Message message) {
        com.papa.gsyvideoplayer.player.c cVar;
        if (message.obj == null || (cVar = this.f58213i) == null) {
            return;
        }
        cVar.l();
    }

    private void a0(Message message) {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.k(message);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void A(s2.a aVar) {
        if (aVar == null) {
            this.f58209e = null;
        } else {
            this.f58209e = new WeakReference<>(aVar);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void B(int i4) {
        this.f58217m = i4;
    }

    protected void E() {
        com.papa.gsyvideoplayer.utils.c.e("cancelTimeOutBuffer");
        if (this.f58222r) {
            this.f58207c.removeCallbacks(this.f58223s);
        }
    }

    public void F(Context context) {
        G(context, null, null);
    }

    public void G(Context context, @Nullable File file, @Nullable String str) {
        com.papa.gsyvideoplayer.cache.b bVar = this.f58214j;
        if (bVar != null) {
            bVar.a(context, file, str);
        } else if (I() != null) {
            I().a(context, file, str);
        }
    }

    public void H(Context context) {
        this.f58205a = context.getApplicationContext();
    }

    protected com.papa.gsyvideoplayer.cache.b I() {
        return com.papa.gsyvideoplayer.cache.a.a();
    }

    public com.papa.gsyvideoplayer.cache.b J() {
        return this.f58214j;
    }

    public com.papa.gsyvideoplayer.player.c K() {
        return this.f58213i;
    }

    public List<com.papa.gsyvideoplayer.model.c> L() {
        return this.f58211g;
    }

    protected com.papa.gsyvideoplayer.player.c M() {
        return com.papa.gsyvideoplayer.player.e.a();
    }

    public com.papa.gsyvideoplayer.player.b N() {
        return this.f58210f;
    }

    public int O() {
        return this.f58220p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P() {
        this.f58206b = new i(Looper.getMainLooper());
        this.f58207c = new Handler();
    }

    public void Q(Context context) {
        this.f58205a = context.getApplicationContext();
    }

    public boolean S() {
        return this.f58221q;
    }

    public boolean T() {
        return this.f58222r;
    }

    protected void V(Message message) {
        this.f58206b.sendMessage(message);
    }

    public void W(boolean z4) {
        this.f58221q = z4;
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.j(z4);
        }
    }

    public void X(List<com.papa.gsyvideoplayer.model.c> list) {
        this.f58211g = list;
    }

    public void Y(com.papa.gsyvideoplayer.player.b bVar) {
        this.f58210f = bVar;
    }

    public void Z(int i4, boolean z4) {
        this.f58220p = i4;
        this.f58222r = z4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void a(Context context, File file, String str) {
        G(context, file, str);
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int b() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.b();
        }
        return 0;
    }

    protected void b0() {
        com.papa.gsyvideoplayer.utils.c.e("startTimeOutBuffer");
        this.f58207c.postDelayed(this.f58223s, this.f58220p);
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void c(float f5, boolean z4) {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.c(f5, z4);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public boolean d() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.d();
        }
        return false;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public boolean e(Context context, File file, String str) {
        if (I() != null) {
            return I().e(context, file, str);
        }
        return false;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void f(float f5, boolean z4) {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.f(f5, z4);
        }
    }

    @Override // com.papa.gsyvideoplayer.cache.b.a
    public void g(File file, String str, int i4) {
        this.f58219o = i4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public long getCurrentPosition() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getCurrentVideoHeight() {
        return this.f58216l;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getCurrentVideoWidth() {
        return this.f58215k;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public long getDuration() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getDuration();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getVideoHeight() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getVideoSarDen() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getVideoSarNum() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getVideoSarNum();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int getVideoWidth() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.getVideoWidth();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public long h() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.h();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void i(Surface surface) {
        Message message = new Message();
        message.what = 1;
        message.obj = surface;
        a0(message);
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public boolean isPlaying() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            return cVar.isPlaying();
        }
        return false;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void j(String str) {
        this.f58212h = str;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int k() {
        return this.f58217m;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void l(String str, Map<String, String> map, boolean z4, float f5, boolean z5, File file, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = new com.papa.gsyvideoplayer.model.a(str, map, z4, f5, z5, file, str2);
        V(message);
        if (this.f58222r) {
            b0();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void m(int i4) {
        this.f58215k = i4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int n() {
        return this.f58218n;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public String o() {
        return this.f58212h;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i4) {
        this.f58207c.post(new RunnableC0587c(i4));
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.f58207c.post(new b());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i4, int i5) {
        this.f58207c.post(new e(i4, i5));
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i4, int i5) {
        this.f58207c.post(new f(i4, i5));
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f58207c.post(new a());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        this.f58207c.post(new d());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i4, int i5, int i6, int i7) {
        this.f58215k = iMediaPlayer.getVideoWidth();
        this.f58216l = iMediaPlayer.getVideoHeight();
        this.f58207c.post(new g());
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public s2.a p() {
        WeakReference<s2.a> weakReference = this.f58209e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void pause() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.pause();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void q(Surface surface) {
        Message message = new Message();
        message.what = 3;
        message.obj = surface;
        V(message);
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public int r() {
        return 10001;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void s(int i4) {
        this.f58216l = i4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void seekTo(long j4) {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.seekTo(j4);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void start() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.start();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void stop() {
        com.papa.gsyvideoplayer.player.c cVar = this.f58213i;
        if (cVar != null) {
            cVar.stop();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public com.papa.gsyvideoplayer.player.c t() {
        return this.f58213i;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void u(String str, Map<String, String> map, boolean z4, float f5, boolean z5, File file) {
        l(str, map, z4, f5, z5, file, null);
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void v(int i4) {
        this.f58218n = i4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public s2.a w() {
        WeakReference<s2.a> weakReference = this.f58208d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void x() {
        Message message = new Message();
        message.what = 2;
        V(message);
        this.f58212h = "";
        this.f58218n = -22;
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public boolean y() {
        com.papa.gsyvideoplayer.cache.b bVar = this.f58214j;
        return bVar != null && bVar.f();
    }

    @Override // com.papa.gsyvideoplayer.video.base.a
    public void z(s2.a aVar) {
        if (aVar == null) {
            this.f58208d = null;
        } else {
            this.f58208d = new WeakReference<>(aVar);
        }
    }
}
