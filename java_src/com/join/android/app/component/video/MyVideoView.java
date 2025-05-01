package com.join.android.app.component.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.join.android.app.component.video.MediaController;
import java.io.IOException;
/* loaded from: classes3.dex */
public class MyVideoView extends SurfaceView implements MediaController.e {
    private MediaPlayer.OnBufferingUpdateListener A;
    SurfaceHolder.Callback B;

    /* renamed from: b  reason: collision with root package name */
    private String f15236b;

    /* renamed from: c  reason: collision with root package name */
    private Context f15237c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f15238d;

    /* renamed from: e  reason: collision with root package name */
    private int f15239e;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceHolder f15240f;

    /* renamed from: g  reason: collision with root package name */
    public MediaPlayer f15241g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15242h;

    /* renamed from: i  reason: collision with root package name */
    private int f15243i;

    /* renamed from: j  reason: collision with root package name */
    private int f15244j;

    /* renamed from: k  reason: collision with root package name */
    private int f15245k;

    /* renamed from: l  reason: collision with root package name */
    private int f15246l;

    /* renamed from: m  reason: collision with root package name */
    private MediaController f15247m;

    /* renamed from: n  reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f15248n;

    /* renamed from: o  reason: collision with root package name */
    private MediaPlayer.OnPreparedListener f15249o;

    /* renamed from: p  reason: collision with root package name */
    private MediaPlayer.OnBufferingUpdateListener f15250p;

    /* renamed from: q  reason: collision with root package name */
    private int f15251q;

    /* renamed from: r  reason: collision with root package name */
    private MediaPlayer.OnErrorListener f15252r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15253s;

    /* renamed from: t  reason: collision with root package name */
    private int f15254t;

    /* renamed from: u  reason: collision with root package name */
    private g f15255u;

    /* renamed from: v  reason: collision with root package name */
    private h f15256v;

    /* renamed from: w  reason: collision with root package name */
    MediaPlayer.OnVideoSizeChangedListener f15257w;

    /* renamed from: x  reason: collision with root package name */
    MediaPlayer.OnPreparedListener f15258x;

    /* renamed from: y  reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f15259y;

    /* renamed from: z  reason: collision with root package name */
    private MediaPlayer.OnErrorListener f15260z;

    /* loaded from: classes3.dex */
    class a implements MediaPlayer.OnVideoSizeChangedListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
            MyVideoView.this.f15243i = mediaPlayer.getVideoWidth();
            MyVideoView.this.f15244j = mediaPlayer.getVideoHeight();
            if (MyVideoView.this.f15255u != null) {
                MyVideoView.this.f15255u.a();
            }
            if (MyVideoView.this.f15243i != 0) {
                int unused = MyVideoView.this.f15244j;
            }
            MyVideoView.this.getHolder().setFixedSize(MyVideoView.this.f15243i, MyVideoView.this.f15244j);
        }
    }

    /* loaded from: classes3.dex */
    class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            MyVideoView.this.f15242h = true;
            if (MyVideoView.this.f15249o != null) {
                MyVideoView.this.f15249o.onPrepared(MyVideoView.this.f15241g);
            }
            if (MyVideoView.this.f15247m != null) {
                MyVideoView.this.f15247m.setEnabled(true);
            }
            MyVideoView.this.f15243i = mediaPlayer.getVideoWidth();
            MyVideoView.this.f15244j = mediaPlayer.getVideoHeight();
            if (MyVideoView.this.f15243i == 0 || MyVideoView.this.f15244j == 0) {
                if (MyVideoView.this.f15254t != 0) {
                    MyVideoView myVideoView = MyVideoView.this;
                    myVideoView.f15241g.seekTo(myVideoView.f15254t);
                    MyVideoView.this.f15254t = 0;
                }
                if (MyVideoView.this.f15253s) {
                    MyVideoView.this.f15241g.start();
                    MyVideoView.this.f15253s = false;
                    return;
                }
                return;
            }
            MyVideoView.this.getHolder().setFixedSize(MyVideoView.this.f15243i, MyVideoView.this.f15244j);
            if (MyVideoView.this.f15245k == MyVideoView.this.f15243i && MyVideoView.this.f15246l == MyVideoView.this.f15244j) {
                if (MyVideoView.this.f15254t != 0) {
                    MyVideoView myVideoView2 = MyVideoView.this;
                    myVideoView2.f15241g.seekTo(myVideoView2.f15254t);
                    MyVideoView.this.f15254t = 0;
                }
                if (MyVideoView.this.f15253s) {
                    MyVideoView.this.f15241g.start();
                    MyVideoView.this.f15253s = false;
                    if (MyVideoView.this.f15247m != null) {
                        MyVideoView.this.f15247m.show();
                    }
                } else if (MyVideoView.this.isPlaying()) {
                } else {
                    if ((MyVideoView.this.f15254t != 0 || MyVideoView.this.getCurrentPosition() > 0) && MyVideoView.this.f15247m != null) {
                        MyVideoView.this.f15247m.show(0);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (MyVideoView.this.f15247m != null) {
                MyVideoView.this.f15247m.hide();
            }
            if (MyVideoView.this.f15248n != null) {
                MyVideoView.this.f15248n.onCompletion(MyVideoView.this.f15241g);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements MediaPlayer.OnErrorListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            String unused = MyVideoView.this.f15236b;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(i4);
            sb.append(",");
            sb.append(i5);
            if (MyVideoView.this.f15247m != null) {
                MyVideoView.this.f15247m.hide();
            }
            if ((MyVideoView.this.f15252r == null || !MyVideoView.this.f15252r.onError(MyVideoView.this.f15241g, i4, i5)) && MyVideoView.this.getWindowToken() != null) {
                MyVideoView.this.f15237c.getResources();
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class e implements MediaPlayer.OnBufferingUpdateListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
            MyVideoView.this.f15251q = i4;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i4);
            if (MyVideoView.this.f15250p != null) {
                MyVideoView.this.f15250p.onBufferingUpdate(mediaPlayer, i4);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f implements SurfaceHolder.Callback {
        f() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            MyVideoView.this.f15245k = i5;
            MyVideoView.this.f15246l = i6;
            MyVideoView myVideoView = MyVideoView.this;
            if (myVideoView.f15241g != null && myVideoView.f15242h && MyVideoView.this.f15243i == i5 && MyVideoView.this.f15244j == i6) {
                if (MyVideoView.this.f15254t != 0) {
                    MyVideoView myVideoView2 = MyVideoView.this;
                    myVideoView2.f15241g.seekTo(myVideoView2.f15254t);
                    MyVideoView.this.f15254t = 0;
                }
                if (MyVideoView.this.f15241g.isPlaying()) {
                    MyVideoView.this.f15241g.start();
                } else {
                    MyVideoView.this.f15241g.pause();
                }
                if (MyVideoView.this.f15247m != null) {
                    MyVideoView.this.f15247m.show();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            MyVideoView.this.f15240f = surfaceHolder;
            MyVideoView.this.F();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MyVideoView.this.f15240f = null;
            if (MyVideoView.this.f15247m != null) {
                MyVideoView.this.f15247m.hide();
            }
            MediaPlayer mediaPlayer = MyVideoView.this.f15241g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                MyVideoView.this.f15241g.release();
                MyVideoView.this.f15241g = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface h {
        boolean a(boolean z4);
    }

    public MyVideoView(Context context) {
        super(context);
        this.f15236b = getClass().getSimpleName();
        this.f15240f = null;
        this.f15241g = null;
        this.f15257w = new a();
        this.f15258x = new b();
        this.f15259y = new c();
        this.f15260z = new d();
        this.A = new e();
        this.B = new f();
        this.f15237c = context;
        C();
    }

    private void A() {
        MediaController mediaController;
        if (this.f15241g == null || (mediaController = this.f15247m) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.f15247m.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.f15247m.setEnabled(this.f15242h);
    }

    private void C() {
        this.f15243i = 0;
        this.f15244j = 0;
        getHolder().setFormat(-2);
        getHolder().addCallback(this.B);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        Uri uri;
        if (this.f15238d == null || this.f15240f == null) {
            return;
        }
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra("command", "pause");
        this.f15237c.sendBroadcast(intent);
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f15241g.release();
            this.f15241g = null;
        }
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f15241g = mediaPlayer2;
            mediaPlayer2.setOnPreparedListener(this.f15258x);
            this.f15241g.setOnVideoSizeChangedListener(this.f15257w);
            this.f15242h = false;
            this.f15239e = -1;
            this.f15241g.setOnCompletionListener(this.f15259y);
            this.f15241g.setOnErrorListener(this.f15260z);
            this.f15241g.setOnBufferingUpdateListener(this.A);
            this.f15251q = 0;
            Context context = this.f15237c;
            if (context != null && (uri = this.f15238d) != null) {
                this.f15241g.setDataSource(context, uri);
            }
            this.f15241g.setDisplay(this.f15240f);
            this.f15241g.setAudioStreamType(3);
            this.f15241g.setScreenOnWhilePlaying(true);
            this.f15241g.prepareAsync();
            A();
            requestFocus();
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.f15238d);
        } catch (IllegalArgumentException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to open content: ");
            sb2.append(this.f15238d);
        }
    }

    private void J() {
        if (this.f15247m.isShowing()) {
            this.f15247m.hide();
        } else {
            this.f15247m.show();
        }
    }

    public void B() {
        Activity activity = (Activity) this.f15237c;
        if (getResources().getConfiguration().orientation == 1) {
            h hVar = this.f15256v;
            if (hVar == null || !hVar.a(true)) {
                MediaController mediaController = this.f15247m;
                if (mediaController != null) {
                    mediaController.setFullScreen(true);
                }
                activity.setRequestedOrientation(0);
                activity.getWindow().setFlags(1024, 1024);
                return;
            }
            return;
        }
        h hVar2 = this.f15256v;
        if (hVar2 == null || !hVar2.a(false)) {
            MediaController mediaController2 = this.f15247m;
            if (mediaController2 != null) {
                mediaController2.setFullScreen(false);
            }
            activity.setRequestedOrientation(1);
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags &= -1025;
            activity.getWindow().setAttributes(attributes);
            activity.getWindow().clearFlags(512);
        }
    }

    public boolean D() {
        MediaController mediaController = this.f15247m;
        if (mediaController != null) {
            return mediaController.u();
        }
        return getResources().getConfiguration().orientation == 2;
    }

    public boolean E() {
        return this.f15242h;
    }

    public void G() {
        try {
            MediaPlayer mediaPlayer = this.f15241g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f15241g.reset();
            }
        } catch (IllegalStateException e5) {
            e5.printStackTrace();
        }
    }

    public int H(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i4 : size;
        }
        return Math.min(i4, size);
    }

    public void I() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f15241g.release();
            this.f15241g = null;
            this.f15242h = false;
            this.f15238d = null;
        }
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public void a(boolean z4) {
        B();
        MediaController mediaController = this.f15247m;
        if (mediaController != null) {
            mediaController.setFullScreen(D());
        }
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public boolean canPause() {
        return false;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public boolean canSeekBackward() {
        return false;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public boolean canSeekForward() {
        return false;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public int getAudioSessionId() {
        return 0;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public int getBufferPercentage() {
        if (this.f15241g != null) {
            return this.f15251q;
        }
        return 0;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer == null || !this.f15242h) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public int getDuration() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null && this.f15242h) {
            int i4 = this.f15239e;
            if (i4 > 0) {
                return i4;
            }
            int duration = mediaPlayer.getDuration();
            this.f15239e = duration;
            return duration;
        }
        this.f15239e = -1;
        return -1;
    }

    public MediaController getMediaController() {
        return this.f15247m;
    }

    public MediaPlayer getMediaPlayer() {
        return this.f15241g;
    }

    public int getVideoHeight() {
        return this.f15244j;
    }

    public int getVideoWidth() {
        return this.f15243i;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer == null || !this.f15242h) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        MediaPlayer mediaPlayer;
        if (this.f15242h && i4 != 4 && i4 != 24 && i4 != 25 && i4 != 82 && i4 != 5 && i4 != 6 && (mediaPlayer = this.f15241g) != null && this.f15247m != null) {
            if (i4 != 79 && i4 != 85) {
                if (i4 == 86 && mediaPlayer.isPlaying()) {
                    pause();
                    this.f15247m.show();
                } else {
                    J();
                }
            } else if (mediaPlayer.isPlaying()) {
                pause();
                this.f15247m.show();
                return true;
            } else {
                start();
                this.f15247m.hide();
                return true;
            }
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(SurfaceView.getDefaultSize(this.f15243i, i4), SurfaceView.getDefaultSize(this.f15244j, i5));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15242h || this.f15241g == null || this.f15247m == null) {
            return false;
        }
        J();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f15242h || this.f15241g == null || this.f15247m == null) {
            return false;
        }
        J();
        return false;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public void pause() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null && this.f15242h && mediaPlayer.isPlaying()) {
            this.f15241g.pause();
        }
        this.f15253s = false;
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public void seekTo(int i4) {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null && this.f15242h) {
            mediaPlayer.seekTo(i4);
        } else {
            this.f15254t = i4;
        }
    }

    public void setFullScreen(boolean z4) {
        if (z4 == D()) {
            return;
        }
        a(z4);
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.f15247m;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.f15247m = mediaController;
        A();
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.f15241g = mediaPlayer;
    }

    public void setMySizeChangeLinstener(g gVar) {
        this.f15255u = gVar;
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.f15250p = onBufferingUpdateListener;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f15248n = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f15252r = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f15249o = onPreparedListener;
    }

    public void setScreenChangedListener(h hVar) {
        this.f15256v = hVar;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoScale(int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i5;
        layoutParams.width = i4;
        setLayoutParams(layoutParams);
    }

    public void setVideoURI(Uri uri) {
        this.f15238d = uri;
        this.f15253s = false;
        this.f15254t = 0;
        F();
        requestLayout();
        invalidate();
    }

    @Override // com.join.android.app.component.video.MediaController.e
    public void start() {
        MediaPlayer mediaPlayer = this.f15241g;
        if (mediaPlayer != null && this.f15242h) {
            mediaPlayer.start();
            this.f15253s = false;
        } else {
            this.f15253s = true;
        }
        requestFocus();
    }

    public MyVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f15237c = context;
        C();
    }

    public MyVideoView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15236b = getClass().getSimpleName();
        this.f15240f = null;
        this.f15241g = null;
        this.f15257w = new a();
        this.f15258x = new b();
        this.f15259y = new c();
        this.f15260z = new d();
        this.A = new e();
        this.B = new f();
        this.f15237c = context;
        C();
    }
}
