package fm.jiecao.jcvideoplayer_lib;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import java.util.Map;
/* compiled from: JCMediaManager.java */
/* loaded from: classes6.dex */
public class b implements TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: h  reason: collision with root package name */
    public static String f69067h = "JieCaoVideoPlayer";

    /* renamed from: i  reason: collision with root package name */
    private static b f69068i = null;

    /* renamed from: j  reason: collision with root package name */
    public static JCResizeTextureView f69069j = null;

    /* renamed from: k  reason: collision with root package name */
    public static SurfaceTexture f69070k = null;

    /* renamed from: l  reason: collision with root package name */
    public static String f69071l = null;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f69072m = false;

    /* renamed from: n  reason: collision with root package name */
    public static Map<String, String> f69073n = null;

    /* renamed from: o  reason: collision with root package name */
    public static final int f69074o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f69075p = 2;

    /* renamed from: b  reason: collision with root package name */
    public MediaPlayer f69076b = new MediaPlayer();

    /* renamed from: c  reason: collision with root package name */
    public int f69077c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f69078d = 0;

    /* renamed from: e  reason: collision with root package name */
    HandlerThread f69079e;

    /* renamed from: f  reason: collision with root package name */
    g f69080f;

    /* renamed from: g  reason: collision with root package name */
    Handler f69081g;

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().p();
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* renamed from: fm.jiecao.jcvideoplayer_lib.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class RunnableC0768b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f69083b;

        RunnableC0768b(int i4) {
            this.f69083b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().setBufferProgress(this.f69083b);
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().u();
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f69086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f69087c;

        d(int i4, int i5) {
            this.f69086b = i4;
            this.f69087c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().r(this.f69086b, this.f69087c);
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f69089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f69090c;

        e(int i4, int i5) {
            this.f69089b = i4;
            this.f69090c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().t(this.f69089b, this.f69090c);
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fm.jiecao.jcvideoplayer_lib.f.b() != null) {
                fm.jiecao.jcvideoplayer_lib.f.b().E();
            }
        }
    }

    /* compiled from: JCMediaManager.java */
    /* loaded from: classes6.dex */
    public class g extends Handler {
        public g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 2) {
                    return;
                }
                b.this.f69076b.release();
                return;
            }
            try {
                b bVar = b.this;
                bVar.f69077c = 0;
                bVar.f69078d = 0;
                bVar.f69076b.release();
                b.this.f69076b = new MediaPlayer();
                b.this.f69076b.setAudioStreamType(3);
                b.this.f69076b.setLooping(b.f69072m);
                b bVar2 = b.this;
                bVar2.f69076b.setOnPreparedListener(bVar2);
                b bVar3 = b.this;
                bVar3.f69076b.setOnCompletionListener(bVar3);
                b bVar4 = b.this;
                bVar4.f69076b.setOnBufferingUpdateListener(bVar4);
                b.this.f69076b.setScreenOnWhilePlaying(true);
                b bVar5 = b.this;
                bVar5.f69076b.setOnSeekCompleteListener(bVar5);
                b bVar6 = b.this;
                bVar6.f69076b.setOnErrorListener(bVar6);
                b bVar7 = b.this;
                bVar7.f69076b.setOnInfoListener(bVar7);
                b bVar8 = b.this;
                bVar8.f69076b.setOnVideoSizeChangedListener(bVar8);
                b.this.f69076b.setVolume(0.0f, 0.0f);
                MediaPlayer.class.getDeclaredMethod("setDataSource", String.class, Map.class).invoke(b.this.f69076b, b.f69071l, b.f69073n);
                b.this.f69076b.prepareAsync();
                b.this.f69076b.setSurface(new Surface(b.f69070k));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public b() {
        HandlerThread handlerThread = new HandlerThread(f69067h);
        this.f69079e = handlerThread;
        handlerThread.start();
        this.f69080f = new g(this.f69079e.getLooper());
        this.f69081g = new Handler();
    }

    public static b b() {
        if (f69068i == null) {
            f69068i = new b();
        }
        return f69068i;
    }

    public Point a() {
        if (this.f69077c == 0 || this.f69078d == 0) {
            return null;
        }
        return new Point(this.f69077c, this.f69078d);
    }

    public void c() {
        d();
        Message message = new Message();
        message.what = 0;
        this.f69080f.sendMessage(message);
    }

    public void d() {
        Message message = new Message();
        message.what = 2;
        this.f69080f.sendMessage(message);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        this.f69081g.post(new RunnableC0768b(i4));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f69081g.post(new a());
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
        this.f69081g.post(new d(i4, i5));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i4, int i5) {
        this.f69081g.post(new e(i4, i5));
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f69076b.start();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        this.f69081g.post(new c());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureAvailable [");
        sb.append(fm.jiecao.jcvideoplayer_lib.f.b().hashCode());
        sb.append("] ");
        SurfaceTexture surfaceTexture2 = f69070k;
        if (surfaceTexture2 == null) {
            f69070k = surfaceTexture;
            c();
            return;
        }
        f69069j.setSurfaceTexture(surfaceTexture2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return f69070k == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureSizeChanged [");
        sb.append(fm.jiecao.jcvideoplayer_lib.f.b().hashCode());
        sb.append("] ");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
        this.f69077c = i4;
        this.f69078d = i5;
        this.f69081g.post(new f());
    }
}
