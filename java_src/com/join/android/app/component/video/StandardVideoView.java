package com.join.android.app.component.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g1;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.customview.EqualizerView;
import com.join.mgps.customview.o;
import com.papa.gsyvideoplayer.utils.l;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYVideoControlView;
import moe.codeest.enviews.ENPlayView;
/* loaded from: classes3.dex */
public class StandardVideoView extends StandardGSYVideoPlayer {
    public static int D = 1;
    public static boolean E = true;
    Runnable A;
    String B;
    private boolean C;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f15277b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f15278c;

    /* renamed from: d  reason: collision with root package name */
    long f15279d;

    /* renamed from: e  reason: collision with root package name */
    View f15280e;

    /* renamed from: f  reason: collision with root package name */
    View f15281f;

    /* renamed from: g  reason: collision with root package name */
    TextView f15282g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f15283h;

    /* renamed from: i  reason: collision with root package name */
    k f15284i;

    /* renamed from: j  reason: collision with root package name */
    String f15285j;

    /* renamed from: k  reason: collision with root package name */
    long f15286k;

    /* renamed from: l  reason: collision with root package name */
    long f15287l;

    /* renamed from: m  reason: collision with root package name */
    String f15288m;

    /* renamed from: n  reason: collision with root package name */
    String f15289n;

    /* renamed from: o  reason: collision with root package name */
    int f15290o;

    /* renamed from: p  reason: collision with root package name */
    j f15291p;

    /* renamed from: q  reason: collision with root package name */
    boolean f15292q;

    /* renamed from: r  reason: collision with root package name */
    public ImageView f15293r;

    /* renamed from: s  reason: collision with root package name */
    protected ImageView f15294s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f15295t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f15296u;

    /* renamed from: v  reason: collision with root package name */
    private i f15297v;

    /* renamed from: w  reason: collision with root package name */
    private i f15298w;

    /* renamed from: x  reason: collision with root package name */
    Handler f15299x;

    /* renamed from: y  reason: collision with root package name */
    protected boolean f15300y;

    /* renamed from: z  reason: collision with root package name */
    o f15301z;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((GSYVideoControlView) StandardVideoView.this).mStartButton.performClick();
            StandardVideoView.this.f15281f.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f15303b;

        b(Context context) {
            this.f15303b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StandardVideoView.this.startWindowFullscreen(this.f15303b, false, true);
        }
    }

    /* loaded from: classes3.dex */
    class c implements s2.d {
        c() {
        }

        @Override // s2.d
        public void a(int i4, int i5, int i6, int i7) {
            StandardVideoView standardVideoView = StandardVideoView.this;
            standardVideoView.f15279d = i6;
            if (i4 == 100 || i6 == i7) {
                standardVideoView.f15279d = 0L;
            }
            k kVar = standardVideoView.f15284i;
            if (kVar != null) {
                kVar.a(i4, i5, i6, i7);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardVideoView.this.backToNormal();
        }
    }

    /* loaded from: classes3.dex */
    class e extends Handler {
        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (StandardVideoView.this.f15283h.getVisibility() == 0) {
                StandardVideoView.this.f15283h.setVisibility(4);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StandardVideoView.this.startPlayLogic();
            StandardVideoView.this.f15301z.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StandardVideoView.this.f15301z.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StandardVideoView.this.startProgressTimer();
        }
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a(int i4);
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(StandardVideoView standardVideoView);
    }

    /* loaded from: classes3.dex */
    public interface k {
        void a(int i4, int i5, int i6, int i7);
    }

    public StandardVideoView(Context context) {
        super(context);
        this.f15279d = 0L;
        this.f15285j = "";
        this.f15286k = 100000000L;
        this.f15287l = 0L;
        this.f15288m = "";
        this.f15289n = "";
        this.f15292q = true;
        this.f15295t = false;
        this.f15296u = false;
        this.f15299x = new e();
        this.A = new h();
        this.B = "StandardVideoView";
        this.C = true;
    }

    private void e() {
        i iVar = this.f15297v;
        if (iVar != null) {
            iVar.a(4);
        } else {
            this.f15277b.setVisibility(4);
        }
    }

    private void j() {
        this.f15299x.sendEmptyMessageDelayed(1, 800L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public boolean backFromFull(Context context) {
        return com.join.android.app.component.video.a.c0(context, this.mPlayTag);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToCompleteShow() {
        super.changeUiToCompleteShow();
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i iVar = this.f15298w;
        if (iVar != null) {
            iVar.a(4);
        }
        this.f15280e.setVisibility(4);
        if (this.f15291p != null && !this.mIfCurrentIsFullscreen) {
            if (g2.i(this.f15289n)) {
                MyImageLoader.h(this.f15277b, this.f15289n);
            }
        } else {
            this.f15281f.setVisibility(0);
        }
        i iVar2 = this.f15297v;
        if (iVar2 != null) {
            iVar2.a(0);
        } else {
            this.f15277b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToError() {
        super.changeUiToError();
        if (this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 0);
        }
        i iVar = this.f15297v;
        if (iVar != null) {
            iVar.a(0);
        } else {
            this.f15277b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToNormal() {
        super.changeUiToNormal();
        this.f15300y = false;
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i iVar = this.f15298w;
        if (iVar != null) {
            iVar.a(4);
        }
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        this.f15281f.setVisibility(4);
        this.f15280e.setVisibility(4);
        i iVar2 = this.f15297v;
        if (iVar2 != null) {
            iVar2.a(0);
        } else {
            this.f15277b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void changeUiToPauseClear() {
        super.changeUiToPauseClear();
        setViewShowState(this.mBottomProgressBar, 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPauseShow() {
        super.changeUiToPauseShow();
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i iVar = this.f15298w;
        if (iVar != null) {
            iVar.a(4);
        }
        if (this.f15291p != null) {
            setViewShowState(this.mStartButton, 4);
        }
        setViewShowState(this.mThumbImageViewLayout, 4);
        i iVar2 = this.f15297v;
        if (iVar2 != null) {
            iVar2.a(0);
        } else {
            this.f15277b.setVisibility(this.C ? 0 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void changeUiToPlayingBufferingClear() {
        super.changeUiToPlayingBufferingClear();
        if (this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mBottomProgressBar, 0);
        } else {
            setViewShowState(this.mBottomProgressBar, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPlayingBufferingShow() {
        super.changeUiToPlayingBufferingShow();
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i iVar = this.f15298w;
        if (iVar != null) {
            iVar.a(4);
        }
        if (this.f15291p == null) {
            setViewShowState(this.mLoadingProgressBar, 0);
            i iVar2 = this.f15298w;
            if (iVar2 != null) {
                iVar2.a(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void changeUiToPlayingClear() {
        super.changeUiToPlayingClear();
        if (this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mBottomProgressBar, 0);
        } else {
            setViewShowState(this.mBottomProgressBar, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPlayingShow() {
        super.changeUiToPlayingShow();
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
            setMute(E);
        }
        if (this.mIfCurrentIsFullscreen) {
            if (!this.f15300y) {
                setViewShowState(this.mBottomContainer, 4);
                setViewShowState(this.mStartButton, 4);
            }
            this.f15280e.setVisibility(4);
        } else {
            if (this.f15291p == null) {
                this.f15280e.setVisibility(0);
            } else {
                this.f15280e.setVisibility(4);
            }
            setViewShowState(this.mStartButton, 4);
            setViewShowState(this.mBottomProgressBar, 4);
            setViewShowState(this.mBottomContainer, 4);
            setViewShowState(this.mLoadingProgressBar, 4);
            i iVar = this.f15298w;
            if (iVar != null) {
                iVar.a(4);
            }
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPreparingShow() {
        super.changeUiToPreparingShow();
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i iVar = this.f15298w;
        if (iVar != null) {
            iVar.a(4);
        }
        if (this.f15291p == null) {
            setViewShowState(this.mLoadingProgressBar, 0);
            i iVar2 = this.f15298w;
            if (iVar2 != null) {
                iVar2.a(0);
            }
        }
        this.f15281f.setVisibility(4);
        i iVar3 = this.f15297v;
        if (iVar3 != null) {
            iVar3.a(0);
        } else {
            this.f15277b.setVisibility(0);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected void clearFullscreenLayout() {
        int i4;
        if (this.mFullAnimEnd) {
            setMute(E);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mStartButton.getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp60);
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp60);
            this.mStartButton.setLayoutParams(layoutParams);
            this.mIfCurrentIsFullscreen = false;
            com.papa.gsyvideoplayer.utils.o oVar = this.mOrientationUtils;
            if (oVar != null) {
                i4 = oVar.q();
                this.mOrientationUtils.I(false);
                com.papa.gsyvideoplayer.utils.o oVar2 = this.mOrientationUtils;
                if (oVar2 != null) {
                    oVar2.D();
                    this.mOrientationUtils = null;
                }
            } else {
                i4 = 0;
            }
            if (!this.mShowFullAnimation) {
                i4 = 0;
            }
            View findViewById = ((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(getContext()).findViewById(16908290)).findViewById(getFullId());
            if (findViewById != null) {
                ((StandardVideoView) findViewById).mIfCurrentIsFullscreen = false;
            }
            if (i4 == 0) {
                backToNormal();
            } else {
                postDelayed(new d(), i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        ((StandardVideoView) gSYBaseVideoPlayer2).mShowFullAnimation = ((StandardVideoView) gSYBaseVideoPlayer).mShowFullAnimation;
    }

    public boolean d() {
        if (this.f15291p != null && !this.f15292q) {
            int z4 = com.join.mgps.pref.h.n(getContext()).z();
            if (z4 != 0) {
                return z4 == 1 && l.i(getContext());
            }
            return true;
        }
        int e5 = com.join.mgps.pref.h.n(getContext()).e();
        return e5 != 1 ? e5 != 2 : l.i(getContext());
    }

    public void f(StandardVideoView standardVideoView) {
        try {
            cloneParams(standardVideoView, this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void g(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                ImageView imageView = this.f15283h;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getFullId() {
        return R.id.custom_full_id;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public com.papa.gsyvideoplayer.video.base.a getGSYVideoManager() {
        if (g2.h(this.mPlayTag)) {
            this.mPlayTag = "getGSYVideoManager";
        }
        com.join.android.app.component.video.a.e0(this.mPlayTag).Q(getContext().getApplicationContext());
        return com.join.android.app.component.video.a.e0(this.mPlayTag);
    }

    public String getKey() {
        if (this.mPlayPosition == -22) {
            com.papa.gsyvideoplayer.utils.c.e(getClass().getSimpleName() + " used getKey() ******* PlayPosition never set. ********");
        }
        if (TextUtils.isEmpty(this.mPlayTag)) {
            com.papa.gsyvideoplayer.utils.c.e(getClass().getSimpleName() + " used getKey() ******* PlayTag never set. ********");
        }
        return this.B + this.mPlayPosition + this.mPlayTag;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R.layout.video_layout_standard_wufun;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getSmallId() {
        return R.id.custom_small_id;
    }

    public long getTimeHas() {
        return this.f15286k;
    }

    public void h(int i4) {
        com.papa.gsyvideoplayer.utils.f.l(i4);
        com.papa.gsyvideoplayer.utils.f.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void hideAllWidget() {
        super.hideAllWidget();
        if (this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mBottomProgressBar, 0);
        } else {
            setViewShowState(this.mBottomProgressBar, 4);
        }
    }

    public StandardVideoView i() {
        StandardVideoView standardVideoView = new StandardVideoView(getContext());
        cloneParams(this, standardVideoView);
        return standardVideoView;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        int i4;
        super.init(context);
        ImageView imageView = (ImageView) findViewById(R.id.back);
        this.f15278c = imageView;
        imageView.setVisibility(4);
        this.f15277b = (SimpleDraweeView) findViewById(R.id.thumbImageView);
        this.f15282g = (TextView) findViewById(R.id.progressTextShow);
        this.f15280e = findViewById(R.id.layout_bottom2);
        this.f15281f = findViewById(R.id.playFinishCover);
        this.f15283h = (ImageView) findViewById(R.id.coverDetailBack);
        MyImageLoader.m((SimpleDraweeView) findViewById(R.id.loading), Uri.parse("res:///2131234668"));
        this.f15281f.setOnClickListener(new a());
        ((EqualizerView) findViewById(R.id.equalizer_view)).a();
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null && ((i4 = this.mCurrentState) == -1 || i4 == 0 || i4 == 7)) {
            relativeLayout.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.netWorkType);
        String c5 = l.c(context);
        if ("NETWORK_WIFI".equals(c5)) {
            textView.setText("Wi-Fi");
        } else if (g2.i(c5)) {
            textView.setText(c5.replace("NETWORK_", ""));
        }
        setThumbPlay(false);
        setShowPauseCover(true);
        setNeedShowWifiTip(false);
        com.papa.gsyvideoplayer.utils.c.b();
        getFullscreenButton().setOnClickListener(new b(context));
        initCustomView();
        setGSYVideoProgressListener(new c());
        com.papa.gsyvideoplayer.utils.f.l(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    public void initCover() {
        try {
            super.initCover();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void initCustomView() {
        this.f15293r = (ImageView) findViewById(R.id.mute);
        this.f15294s = (ImageView) findViewById(R.id.autoPlay);
        this.f15293r.setOnClickListener(this);
        this.f15294s.setOnClickListener(this);
        setMuteView(E);
        this.f15294s.setSelected(com.join.mgps.pref.h.n(getContext()).a());
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id == R.id.mute) {
            setMute(!E);
        } else if (id == R.id.autoPlay) {
            boolean z4 = !this.f15294s.isSelected();
            this.f15294s.setSelected(z4);
            com.join.mgps.pref.h.n(getContext()).P(z4);
            l2.a(getContext()).b(z4 ? "已开启WiFi下自动播放" : "已关闭WiFi下自动播放");
        } else if (id == R.id.thumb || id == R.id.bannerView) {
            if (TextUtils.isEmpty(this.mUrl)) {
                com.papa.gsyvideoplayer.utils.c.e("********" + getResources().getString(R.string.no_url));
                return;
            }
            if (!this.mIfCurrentIsFullscreen) {
                j jVar = this.f15291p;
                if (jVar != null) {
                    jVar.a(this);
                } else if (this.mCurrentState != 0) {
                    v0.d("startWindowFullscreen", "currentTime= " + this.f15287l + " mCurrentState= " + this.mCurrentState);
                    if (this.mCurrentState != 2 || this.f15287l >= 500) {
                        startWindowFullscreen(getContext(), true, true);
                    }
                }
            }
            if (this.mCurrentState == 0) {
                startPlayLogic();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void onClickUiToggle() {
        if (this.mIfCurrentIsFullscreen && this.mLockCurScreen && this.mNeedLockFull) {
            setViewShowState(this.mLockScreen, 0);
            return;
        }
        this.f15300y = true;
        super.onClickUiToggle();
        j jVar = this.f15291p;
        if (jVar != null) {
            jVar.a(this);
        } else if (this.mIfCurrentIsFullscreen || this.mCurrentState == 0) {
        } else {
            v0.d("startWindowFullscreen", "currentTime= " + this.f15287l + " mCurrentState= " + this.mCurrentState);
            if (this.mCurrentState != 2 || this.f15287l >= 500) {
                startWindowFullscreen(getContext(), true, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        if (this.f15296u) {
            setMute(true);
            this.f15296u = false;
        } else {
            setMute(E);
        }
        super.onPrepared();
        if (this.mIfCurrentIsFullscreen) {
            com.join.android.app.component.video.a.f0().get(this.mPlayTag).W(false);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f15300y = true;
        super.onStartTrackingTouch(seekBar);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView, t2.c
    public void onSurfaceAvailable(Surface surface) {
        super.onSurfaceAvailable(surface);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView, t2.c
    public void onSurfaceUpdated(Surface surface) {
        super.onSurfaceUpdated(surface);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onVideoResume() {
        super.onVideoResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        com.join.android.app.component.video.a.n0(this.mPlayTag);
    }

    public void setAutoPlayConfig(boolean z4) {
        this.f15292q = z4;
    }

    public void setChangeCoverShowListener(i iVar) {
        this.f15297v = iVar;
        this.f15277b.setVisibility(4);
    }

    public void setChangeCoverShowLoadingListener(i iVar) {
        this.f15298w = iVar;
        this.mLoadingProgressBar.setVisibility(4);
    }

    public void setCover(String str) {
        this.f15289n = str;
    }

    public void setMute(boolean z4) {
        setMuteOnly(z4);
        E = z4;
        StandardVideoViewJC.D2 = z4;
    }

    public void setMuteOnly(boolean z4) {
        try {
            v0.d("setMuteOnly ", z4 + "");
            com.join.android.app.component.video.a.f0().get(this.mPlayTag).W(z4);
            setMuteView(z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setMuteView(boolean z4) {
        if (z4) {
            this.f15293r.setImageResource(R.drawable.mute_off);
        } else {
            this.f15293r.setImageResource(R.drawable.mute_on);
        }
    }

    public void setMuteWhenPlay(boolean z4) {
        this.f15296u = z4;
    }

    public void setNoneNetFinishActivity(boolean z4) {
        this.f15295t = z4;
    }

    public void setOnVideoProgressListener(k kVar) {
        this.f15284i = kVar;
    }

    public void setOnclickVideoListener(j jVar) {
        this.f15291p = jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void setProgressAndTime(int i4, int i5, int i6, int i7, boolean z4) {
        super.setProgressAndTime(i4, i5, i6, i7, z4);
        this.f15287l = i6;
        if (i6 > 0) {
            int i8 = i7 - i6;
            this.f15286k = i8;
            String r4 = com.papa.gsyvideoplayer.utils.b.r(i8);
            this.f15285j = r4;
            this.f15282g.setText(r4);
        }
    }

    public void setShowCoverWhenPause(boolean z4) {
        this.C = z4;
    }

    public void setSurfaceToPlay() {
        addTextureView();
        getGSYVideoManager().z(this);
        checkoutState();
        startProgressTimer();
    }

    public void setSwitchCache(boolean z4) {
        this.mCache = z4;
    }

    public void setSwitchTitle(String str) {
        this.mTitle = str;
    }

    public void setSwitchUrl(String str) {
        this.mUrl = str;
        this.mOriginUrl = str;
    }

    public void setThumbVisibleM() {
        ImageView imageView = this.f15283h;
        if (imageView != null) {
            imageView.setVisibility(0);
            j();
        }
    }

    public void setUp(String str, int i4, Object... objArr) {
        int i5;
        this.f15288m = str;
        if (Build.VERSION.SDK_INT >= 21) {
            super.setUp(str, true, null, "");
        } else {
            super.setUp(str, false, null, "");
        }
        setAutoFullWithSize(true);
        setReleaseWhenLossAudio(true);
        setShowFullAnimation(false);
        setNeedShowWifiTip(false);
        if (objArr.length > 1) {
            this.f15289n = objArr[1].toString();
        }
        this.f15294s.setSelected(com.join.mgps.pref.h.n(getContext()).a());
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null && ((i5 = this.mCurrentState) == -1 || i5 == 0 || i5 == 7)) {
            relativeLayout.setVisibility(0);
        }
        if (g2.i(this.f15289n)) {
            MyImageLoader.h(this.f15277b, this.f15289n);
        }
    }

    public void setUpLazy(String str, int i4, Object... objArr) {
        this.f15288m = str;
        super.setUpLazy(str, false, null, null, "");
        setAutoFullWithSize(true);
        setReleaseWhenLossAudio(true);
        setShowFullAnimation(false);
        if (objArr.length > 1) {
            this.f15289n = objArr[1].toString();
        }
        this.f15294s.setSelected(com.join.mgps.pref.h.n(getContext()).a());
    }

    public void setVideoType(int i4) {
        this.f15290o = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void setViewShowState(View view, int i4) {
        super.setViewShowState(view, i4);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer showSmallVideo(Point point, boolean z4, boolean z5) {
        StandardVideoView standardVideoView = (StandardVideoView) super.showSmallVideo(point, z4, z5);
        standardVideoView.mStartButton.setVisibility(8);
        standardVideoView.mStartButton = null;
        return standardVideoView;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showWifiDialog() {
        String string;
        String str;
        o oVar;
        if (!l.g(this.mContext)) {
            startPlayLogic();
            return;
        }
        if (this.f15301z == null) {
            o oVar2 = new o(getContext(), R.style.MyDialog);
            this.f15301z = oVar2;
            oVar2.setContentView(R.layout.bind_dialog);
        }
        Button button = (Button) this.f15301z.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f15301z.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.f15301z.findViewById(R.id.tip_title);
        View findViewById = this.f15301z.findViewById(R.id.divider);
        TextView textView2 = (TextView) this.f15301z.findViewById(R.id.dialog_content);
        TextView textView3 = (TextView) this.f15301z.findViewById(R.id.dialog_desci);
        int b5 = g1.b(getContext());
        if (b5 == 0) {
            findViewById.setVisibility(0);
            button.setVisibility(0);
        } else if (b5 != 1) {
            findViewById.setVisibility(8);
            button.setVisibility(8);
            string = getResources().getString(R.string.network_conn_failed);
            str = "关闭";
            textView.setText("网络提示");
            textView2.setText(string);
            textView3.setVisibility(8);
            button2.setText(str);
            button.setText("取消");
            button2.setOnClickListener(new f());
            button.setOnClickListener(new g());
            oVar = this.f15301z;
            if (oVar != null || oVar.isShowing()) {
            }
            this.f15301z.show();
            return;
        }
        str = "继续观看";
        string = "您已切换到数据网络，是否继续观看视频？";
        textView.setText("网络提示");
        textView2.setText(string);
        textView3.setVisibility(8);
        button2.setText(str);
        button.setText("取消");
        button2.setOnClickListener(new f());
        button.setOnClickListener(new g());
        oVar = this.f15301z;
        if (oVar != null) {
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void startAfterPrepared() {
        super.startAfterPrepared();
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void startPlayLogic() {
        super.startPlayLogic();
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean z4, boolean z5) {
        GSYBaseVideoPlayer startWindowFullscreen = super.startWindowFullscreen(context, z4, z5);
        StandardVideoView standardVideoView = (StandardVideoView) startWindowFullscreen;
        if (g2.i(this.f15289n)) {
            MyImageLoader.h(standardVideoView.f15277b, this.f15289n);
        }
        standardVideoView.C = this.C;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mStartButton.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp60);
        layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp60);
        this.mStartButton.setLayoutParams(layoutParams);
        if (this.mCurrentState != 2) {
            startWindowFullscreen.startPlayLogic();
        }
        com.join.android.app.component.video.a.f0().get(this.mPlayTag).W(false);
        return startWindowFullscreen;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchDoubleUp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMoveFullLogic(float f5, float f6) {
        super.touchSurfaceMoveFullLogic(f5, f6);
        this.mChangePosition = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void updateStartImage() {
        View view = this.mStartButton;
        if (view instanceof ENPlayView) {
            ENPlayView eNPlayView = (ENPlayView) view;
            eNPlayView.setDuration(500);
            int i4 = this.mCurrentState;
            if (i4 == 2) {
                eNPlayView.d();
            } else if (i4 == 7) {
                eNPlayView.c();
            } else {
                eNPlayView.c();
            }
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            int i5 = this.mCurrentState;
            if (i5 == 2) {
                imageView.setImageResource(R.drawable.video_pause_normal_video);
            } else if (i5 == 7) {
                imageView.setImageResource(R.drawable.video_click_error_selector);
            } else {
                imageView.setImageResource(R.drawable.video_play_normal_video);
            }
        }
    }

    public StandardVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15279d = 0L;
        this.f15285j = "";
        this.f15286k = 100000000L;
        this.f15287l = 0L;
        this.f15288m = "";
        this.f15289n = "";
        this.f15292q = true;
        this.f15295t = false;
        this.f15296u = false;
        this.f15299x = new e();
        this.A = new h();
        this.B = "StandardVideoView";
        this.C = true;
    }
}
