package com.papa.gsyvideoplayer.video.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.papa.gsyvideoplayer.R;
import com.papa.gsyvideoplayer.utils.k;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import s2.h;
/* loaded from: classes5.dex */
public abstract class GSYVideoView extends GSYTextureRenderView implements s2.a {
    public static final int CHANGE_DELAY_TIME = 2000;
    public static final int CURRENT_STATE_AUTO_COMPLETE = 6;
    public static final int CURRENT_STATE_ERROR = 7;
    public static final int CURRENT_STATE_NORMAL = 0;
    public static final int CURRENT_STATE_PAUSE = 5;
    public static final int CURRENT_STATE_PLAYING = 2;
    public static final int CURRENT_STATE_PLAYING_BUFFERING_START = 3;
    public static final int CURRENT_STATE_PREPAREING = 1;
    protected AudioManager mAudioManager;
    protected int mBackUpPlayingBufferState;
    protected int mBufferPoint;
    protected boolean mCache;
    protected File mCachePath;
    protected Context mContext;
    protected long mCurrentPosition;
    protected int mCurrentState;
    protected boolean mHadPlay;
    protected boolean mHadPrepared;
    protected boolean mIfCurrentIsFullscreen;
    protected boolean mLooping;
    protected Map<String, String> mMapHeadData;
    protected boolean mNetChanged;
    protected k mNetInfoModule;
    protected String mNetSate;
    protected String mOriginUrl;
    protected String mOverrideExtension;
    protected boolean mPauseBeforePrepared;
    protected int mPlayPosition;
    protected String mPlayTag;
    protected boolean mReleaseWhenLossAudio;
    protected long mSaveChangeViewTIme;
    protected int mScreenHeight;
    protected int mScreenWidth;
    protected long mSeekOnStart;
    protected boolean mShowPauseCover;
    protected boolean mSoundTouch;
    protected float mSpeed;
    protected boolean mStartAfterPrepared;
    protected String mTitle;
    protected String mUrl;
    protected h mVideoAllCallBack;
    protected AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    /* loaded from: classes5.dex */
    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i4) {
            if (i4 == -3) {
                GSYVideoView.this.onLossTransientCanDuck();
            } else if (i4 == -2) {
                GSYVideoView.this.onLossTransientAudio();
            } else if (i4 == -1) {
                GSYVideoView.this.onLossAudio();
            } else if (i4 != 1) {
            } else {
                GSYVideoView.this.onGankAudio();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GSYVideoView gSYVideoView = GSYVideoView.this;
            if (gSYVideoView.mReleaseWhenLossAudio) {
                gSYVideoView.releaseVideos();
            } else {
                gSYVideoView.onVideoPause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f58652b;

        c(long j4) {
            this.f58652b = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GSYVideoView.this.setSeekOnStart(this.f58652b);
            GSYVideoView.this.startPlayLogic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d implements k.c {
        d() {
        }

        @Override // com.papa.gsyvideoplayer.utils.k.c
        public void a(String str) {
            if (!GSYVideoView.this.mNetSate.equals(str)) {
                com.papa.gsyvideoplayer.utils.c.e("******* change network state ******* " + str);
                GSYVideoView.this.mNetChanged = true;
            }
            GSYVideoView.this.mNetSate = str;
        }
    }

    public GSYVideoView(@NonNull Context context) {
        super(context);
        this.mCurrentState = -1;
        this.mPlayPosition = -22;
        this.mBackUpPlayingBufferState = -1;
        this.mSeekOnStart = -1L;
        this.mSaveChangeViewTIme = 0L;
        this.mSpeed = 1.0f;
        this.mCache = false;
        this.mIfCurrentIsFullscreen = false;
        this.mLooping = false;
        this.mHadPlay = false;
        this.mNetChanged = false;
        this.mSoundTouch = false;
        this.mShowPauseCover = false;
        this.mPauseBeforePrepared = false;
        this.mStartAfterPrepared = true;
        this.mHadPrepared = false;
        this.mReleaseWhenLossAudio = true;
        this.mPlayTag = "";
        this.mNetSate = "NORMAL";
        this.mMapHeadData = new HashMap();
        this.onAudioFocusChangeListener = new a();
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean backFromFull(Context context);

    public void clearCurrentCache() {
        if (getGSYVideoManager().y() && this.mCache) {
            com.papa.gsyvideoplayer.utils.c.e("Play Error " + this.mUrl);
            this.mUrl = this.mOriginUrl;
            getGSYVideoManager().a(this.mContext, this.mCachePath, this.mOriginUrl);
        } else if (this.mUrl.contains("127.0.0.1")) {
            getGSYVideoManager().a(getContext(), this.mCachePath, this.mOriginUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createNetWorkState() {
        if (this.mNetInfoModule == null) {
            k kVar = new k(this.mContext.getApplicationContext(), new d());
            this.mNetInfoModule = kVar;
            this.mNetSate = kVar.b();
        }
    }

    protected void deleteCacheFileWhenError() {
        clearCurrentCache();
        com.papa.gsyvideoplayer.utils.c.e("Link Or mCache Error, Please Try Again " + this.mOriginUrl);
        if (this.mCache) {
            com.papa.gsyvideoplayer.utils.c.e("mCache Link " + this.mUrl);
        }
        this.mUrl = this.mOriginUrl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getActivityContext() {
        return com.papa.gsyvideoplayer.utils.b.d(getContext());
    }

    public int getBuffterPoint() {
        return this.mBufferPoint;
    }

    public int getCurrentPositionWhenPlaying() {
        int i4 = this.mCurrentState;
        int i5 = 0;
        if (i4 == 2 || i4 == 5) {
            try {
                i5 = (int) getGSYVideoManager().getCurrentPosition();
            } catch (Exception e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        if (i5 == 0) {
            long j4 = this.mCurrentPosition;
            if (j4 > 0) {
                return (int) j4;
            }
        }
        return i5;
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoHeight() {
        if (getGSYVideoManager() != null) {
            return getGSYVideoManager().getVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoWidth() {
        if (getGSYVideoManager() != null) {
            return getGSYVideoManager().getVideoWidth();
        }
        return 0;
    }

    public int getDuration() {
        try {
            return (int) getGSYVideoManager().getDuration();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public abstract com.papa.gsyvideoplayer.video.base.a getGSYVideoManager();

    public abstract int getLayoutId();

    public Map<String, String> getMapHeadData() {
        return this.mMapHeadData;
    }

    public long getNetSpeed() {
        return getGSYVideoManager().h();
    }

    public String getNetSpeedText() {
        return com.papa.gsyvideoplayer.utils.b.j(getNetSpeed());
    }

    public String getOverrideExtension() {
        return this.mOverrideExtension;
    }

    public int getPlayPosition() {
        return this.mPlayPosition;
    }

    public String getPlayTag() {
        return this.mPlayTag;
    }

    public long getSeekOnStart() {
        return this.mSeekOnStart;
    }

    public float getSpeed() {
        return this.mSpeed;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarDen() {
        if (getGSYVideoManager() != null) {
            return getGSYVideoManager().getVideoSarDen();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarNum() {
        if (getGSYVideoManager() != null) {
            return getGSYVideoManager().getVideoSarNum();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(Context context) {
        if (getActivityContext() != null) {
            this.mContext = getActivityContext();
        } else {
            this.mContext = context;
        }
        initInflate(this.mContext);
        this.mTextureViewContainer = (ViewGroup) findViewById(R.id.surface_container);
        if (isInEditMode()) {
            return;
        }
        this.mScreenWidth = this.mContext.getResources().getDisplayMetrics().widthPixels;
        this.mScreenHeight = this.mContext.getResources().getDisplayMetrics().heightPixels;
        this.mAudioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio");
    }

    protected void initInflate(Context context) {
        try {
            View.inflate(context, getLayoutId(), this);
        } catch (InflateException e5) {
            if (!e5.toString().contains("GSYImageCover")) {
                e5.printStackTrace();
                return;
            }
            com.papa.gsyvideoplayer.utils.c.e("********************\n*****   注意   *************************\n*该版本需要清除布局文件中的GSYImageCover\n****  Attention  ***\n*Please remove GSYImageCover from Layout in this Version\n********************\n");
            e5.printStackTrace();
            throw new InflateException("该版本需要清除布局文件中的GSYImageCover，please remove GSYImageCover from your layout");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isCurrentMediaListener() {
        return getGSYVideoManager().w() != null && getGSYVideoManager().w() == this;
    }

    public boolean isIfCurrentIsFullscreen() {
        return this.mIfCurrentIsFullscreen;
    }

    public boolean isInPlayingState() {
        int i4 = this.mCurrentState;
        return (i4 < 0 || i4 == 0 || i4 == 6 || i4 == 7) ? false : true;
    }

    public boolean isLooping() {
        return this.mLooping;
    }

    public boolean isReleaseWhenLossAudio() {
        return this.mReleaseWhenLossAudio;
    }

    public boolean isShowPauseCover() {
        return this.mShowPauseCover;
    }

    public boolean isStartAfterPrepared() {
        return this.mStartAfterPrepared;
    }

    protected void listenerNetWorkState() {
        k kVar = this.mNetInfoModule;
        if (kVar != null) {
            kVar.g();
        }
    }

    protected void netWorkErrorLogic() {
        long currentPositionWhenPlaying = getCurrentPositionWhenPlaying();
        com.papa.gsyvideoplayer.utils.c.e("******* Net State Changed. renew player to connect *******" + currentPositionWhenPlaying);
        getGSYVideoManager().x();
        postDelayed(new c(currentPositionWhenPlaying), 500L);
    }

    public void onAutoCompletion() {
        setStateAndUi(6);
        this.mSaveChangeViewTIme = 0L;
        this.mCurrentPosition = 0L;
        if (this.mTextureViewContainer.getChildCount() > 0) {
            this.mTextureViewContainer.removeAllViews();
        }
        if (!this.mIfCurrentIsFullscreen) {
            getGSYVideoManager().A(null);
        }
        this.mAudioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
        Context context = this.mContext;
        if (context instanceof Activity) {
            try {
                ((Activity) context).getWindow().clearFlags(128);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        releaseNetWorkState();
        if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
            return;
        }
        com.papa.gsyvideoplayer.utils.c.h("onAutoComplete");
        this.mVideoAllCallBack.onAutoComplete(this.mOriginUrl, this.mTitle, this);
    }

    public void onCompletion() {
        setStateAndUi(0);
        this.mSaveChangeViewTIme = 0L;
        this.mCurrentPosition = 0L;
        if (this.mTextureViewContainer.getChildCount() > 0) {
            this.mTextureViewContainer.removeAllViews();
        }
        if (!this.mIfCurrentIsFullscreen) {
            getGSYVideoManager().z(null);
            getGSYVideoManager().A(null);
        }
        getGSYVideoManager().s(0);
        getGSYVideoManager().m(0);
        this.mAudioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
        Context context = this.mContext;
        if (context instanceof Activity) {
            try {
                ((Activity) context).getWindow().clearFlags(128);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        releaseNetWorkState();
    }

    public void onError(int i4, int i5) {
        if (this.mNetChanged) {
            this.mNetChanged = false;
            netWorkErrorLogic();
            h hVar = this.mVideoAllCallBack;
            if (hVar != null) {
                hVar.onPlayError(this.mOriginUrl, this.mTitle, this);
            }
        } else if (i4 == 38 || i4 == -38) {
        } else {
            setStateAndUi(7);
            deleteCacheFileWhenError();
            h hVar2 = this.mVideoAllCallBack;
            if (hVar2 != null) {
                hVar2.onPlayError(this.mOriginUrl, this.mTitle, this);
            }
        }
    }

    protected void onGankAudio() {
    }

    public void onInfo(int i4, int i5) {
        int i6;
        if (i4 == 701) {
            int i7 = this.mCurrentState;
            this.mBackUpPlayingBufferState = i7;
            if (!this.mHadPlay || i7 == 1 || i7 <= 0) {
                return;
            }
            setStateAndUi(3);
        } else if (i4 == 702) {
            int i8 = this.mBackUpPlayingBufferState;
            if (i8 != -1) {
                if (i8 == 3) {
                    this.mBackUpPlayingBufferState = 2;
                }
                if (this.mHadPlay && (i6 = this.mCurrentState) != 1 && i6 > 0) {
                    setStateAndUi(this.mBackUpPlayingBufferState);
                }
                this.mBackUpPlayingBufferState = -1;
            }
        } else if (i4 == getGSYVideoManager().r()) {
            this.mRotate = i5;
            com.papa.gsyvideoplayer.utils.c.h("Video Rotate Info " + i5);
            com.papa.gsyvideoplayer.render.a aVar = this.mTextureView;
            if (aVar != null) {
                aVar.w(this.mRotate);
            }
        }
    }

    protected void onLossAudio() {
        new Handler(Looper.getMainLooper()).post(new b());
    }

    protected void onLossTransientAudio() {
        try {
            onVideoPause();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    protected void onLossTransientCanDuck() {
    }

    public void onPrepared() {
        if (this.mCurrentState != 1) {
            return;
        }
        this.mHadPrepared = true;
        if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            com.papa.gsyvideoplayer.utils.c.h("onPrepared");
            this.mVideoAllCallBack.onPrepared(this.mOriginUrl, this.mTitle, this);
        }
        if (!this.mStartAfterPrepared) {
            setStateAndUi(5);
            onVideoPause();
            return;
        }
        startAfterPrepared();
    }

    @Override // s2.a
    public void onSeekComplete() {
        com.papa.gsyvideoplayer.utils.c.h("onSeekComplete");
    }

    @Override // s2.a
    public void onVideoPause() {
        if (this.mCurrentState == 1) {
            this.mPauseBeforePrepared = true;
        }
        try {
            if (getGSYVideoManager() == null || !getGSYVideoManager().isPlaying()) {
                return;
            }
            setStateAndUi(5);
            this.mCurrentPosition = getGSYVideoManager().getCurrentPosition();
            if (getGSYVideoManager() != null) {
                getGSYVideoManager().pause();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void onVideoReset() {
        setStateAndUi(0);
    }

    public void onVideoResume() {
        onVideoResume(true);
    }

    @Override // s2.a
    public void onVideoSizeChanged() {
        com.papa.gsyvideoplayer.render.a aVar;
        int currentVideoWidth = getGSYVideoManager().getCurrentVideoWidth();
        int currentVideoHeight = getGSYVideoManager().getCurrentVideoHeight();
        if (currentVideoWidth == 0 || currentVideoHeight == 0 || (aVar = this.mTextureView) == null) {
            return;
        }
        aVar.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void prepareVideo() {
        startPrepare();
    }

    public void release() {
        this.mSaveChangeViewTIme = 0L;
        if (!isCurrentMediaListener() || System.currentTimeMillis() - this.mSaveChangeViewTIme <= 2000) {
            return;
        }
        releaseVideos();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void releaseNetWorkState() {
        k kVar = this.mNetInfoModule;
        if (kVar != null) {
            kVar.f();
            this.mNetInfoModule = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    public void releasePauseCover() {
        Bitmap bitmap;
        try {
            if (this.mCurrentState == 5 || (bitmap = this.mFullPauseBitmap) == null || bitmap.isRecycled() || !this.mShowPauseCover) {
                return;
            }
            this.mFullPauseBitmap.recycle();
            this.mFullPauseBitmap = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void releaseSurface(Surface surface) {
        getGSYVideoManager().q(surface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void releaseVideos();

    public void seekTo(long j4) {
        try {
            if (getGSYVideoManager() == null || j4 <= 0) {
                return;
            }
            getGSYVideoManager().seekTo(j4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void setDisplay(Surface surface) {
        getGSYVideoManager().i(surface);
    }

    public void setIfCurrentIsFullscreen(boolean z4) {
        this.mIfCurrentIsFullscreen = z4;
    }

    public void setLooping(boolean z4) {
        this.mLooping = z4;
    }

    public void setMapHeadData(Map<String, String> map) {
        if (map != null) {
            this.mMapHeadData = map;
        }
    }

    public void setOverrideExtension(String str) {
        this.mOverrideExtension = str;
    }

    public void setPlayPosition(int i4) {
        this.mPlayPosition = i4;
    }

    public void setPlayTag(String str) {
        this.mPlayTag = str;
    }

    public void setReleaseWhenLossAudio(boolean z4) {
        this.mReleaseWhenLossAudio = z4;
    }

    public void setSeekOnStart(long j4) {
        this.mSeekOnStart = j4;
    }

    public void setShowPauseCover(boolean z4) {
        this.mShowPauseCover = z4;
    }

    public void setSpeed(float f5) {
        setSpeed(f5, false);
    }

    public void setSpeedPlaying(float f5, boolean z4) {
        setSpeed(f5, z4);
        getGSYVideoManager().f(f5, z4);
    }

    public void setStartAfterPrepared(boolean z4) {
        this.mStartAfterPrepared = z4;
    }

    protected abstract void setStateAndUi(int i4);

    public boolean setUp(String str, boolean z4, String str2) {
        return setUp(str, z4, null, str2);
    }

    public void setVideoAllCallBack(h hVar) {
        this.mVideoAllCallBack = hVar;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void showPauseCover() {
        Bitmap bitmap;
        Surface surface;
        if (this.mCurrentState == 5 && (bitmap = this.mFullPauseBitmap) != null && !bitmap.isRecycled() && this.mShowPauseCover && (surface = this.mSurface) != null && surface.isValid() && getGSYVideoManager().d()) {
            try {
                RectF rectF = new RectF(0.0f, 0.0f, this.mTextureView.h(), this.mTextureView.c());
                Canvas lockCanvas = this.mSurface.lockCanvas(new Rect(0, 0, this.mTextureView.h(), this.mTextureView.c()));
                if (lockCanvas != null) {
                    lockCanvas.drawBitmap(this.mFullPauseBitmap, (Rect) null, rectF, (Paint) null);
                    this.mSurface.unlockCanvasAndPost(lockCanvas);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void startAfterPrepared() {
        if (!this.mHadPrepared) {
            prepareVideo();
        }
        try {
            if (getGSYVideoManager() != null) {
                getGSYVideoManager().start();
            }
            setStateAndUi(2);
            if (getGSYVideoManager() != null && this.mSeekOnStart > 0) {
                getGSYVideoManager().seekTo(this.mSeekOnStart);
                this.mSeekOnStart = 0L;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        addTextureView();
        createNetWorkState();
        listenerNetWorkState();
        this.mHadPlay = true;
        com.papa.gsyvideoplayer.render.a aVar = this.mTextureView;
        if (aVar != null) {
            aVar.m();
        }
        if (this.mPauseBeforePrepared) {
            onVideoPause();
            this.mPauseBeforePrepared = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startButtonLogic() {
        int i4;
        h hVar = this.mVideoAllCallBack;
        if (hVar != null && ((i4 = this.mCurrentState) == 0 || i4 == 6)) {
            com.papa.gsyvideoplayer.utils.c.h("onClickStartIcon");
            this.mVideoAllCallBack.onClickStartIcon(this.mOriginUrl, this.mTitle, this);
        } else if (hVar != null) {
            com.papa.gsyvideoplayer.utils.c.h("onClickStartError");
            this.mVideoAllCallBack.onClickStartError(this.mOriginUrl, this.mTitle, this);
        }
        prepareVideo();
    }

    public abstract void startPlayLogic();

    protected void startPrepare() {
        if (getGSYVideoManager().w() != null) {
            getGSYVideoManager().w().onCompletion();
        }
        if (this.mVideoAllCallBack != null) {
            com.papa.gsyvideoplayer.utils.c.h("onStartPrepared");
            this.mVideoAllCallBack.onStartPrepared(this.mOriginUrl, this.mTitle, this);
        }
        getGSYVideoManager().z(this);
        getGSYVideoManager().j(this.mPlayTag);
        getGSYVideoManager().v(this.mPlayPosition);
        this.mAudioManager.requestAudioFocus(this.onAudioFocusChangeListener, 3, 2);
        try {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().addFlags(128);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.mBackUpPlayingBufferState = -1;
        com.papa.gsyvideoplayer.video.base.a gSYVideoManager = getGSYVideoManager();
        String str = this.mUrl;
        Map<String, String> map = this.mMapHeadData;
        if (map == null) {
            map = new HashMap<>();
        }
        gSYVideoManager.l(str, map, this.mLooping, this.mSpeed, this.mCache, this.mCachePath, this.mOverrideExtension);
        setStateAndUi(1);
    }

    protected void unListenerNetWorkState() {
        k kVar = this.mNetInfoModule;
        if (kVar != null) {
            kVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updatePauseCover() {
        Bitmap bitmap = this.mFullPauseBitmap;
        if ((bitmap == null || bitmap.isRecycled()) && this.mShowPauseCover) {
            try {
                initCover();
            } catch (Exception e5) {
                e5.printStackTrace();
                this.mFullPauseBitmap = null;
            }
        }
    }

    @Override // s2.a
    public void onVideoResume(boolean z4) {
        this.mPauseBeforePrepared = false;
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoResume: ");
        sb.append(this.mCurrentState);
        int i4 = this.mCurrentState;
        if (i4 == 5 || i4 == 7 || i4 == 0) {
            try {
                if (this.mCurrentPosition < 0 || getGSYVideoManager() == null) {
                    return;
                }
                if (z4) {
                    getGSYVideoManager().seekTo(this.mCurrentPosition);
                }
                getGSYVideoManager().start();
                setStateAndUi(2);
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null && !this.mReleaseWhenLossAudio) {
                    audioManager.requestAudioFocus(this.onAudioFocusChangeListener, 3, 2);
                }
                this.mCurrentPosition = 0L;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void setSpeed(float f5, boolean z4) {
        this.mSpeed = f5;
        this.mSoundTouch = z4;
        if (getGSYVideoManager() != null) {
            getGSYVideoManager().c(f5, z4);
        }
    }

    public boolean setUp(String str, boolean z4, File file, Map<String, String> map, String str2) {
        if (setUp(str, z4, file, str2)) {
            Map<String, String> map2 = this.mMapHeadData;
            if (map2 != null) {
                map2.clear();
            } else {
                this.mMapHeadData = new HashMap();
            }
            if (map != null) {
                this.mMapHeadData.putAll(map);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean setUp(String str, boolean z4, File file, String str2) {
        return setUp(str, z4, file, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setUp(String str, boolean z4, File file, String str2, boolean z5) {
        this.mCache = z4;
        this.mCachePath = file;
        this.mOriginUrl = str;
        if (!isCurrentMediaListener() || System.currentTimeMillis() - this.mSaveChangeViewTIme >= 2000) {
            this.mCurrentState = 0;
            this.mUrl = str;
            this.mTitle = str2;
            if (z5) {
                setStateAndUi(0);
                return true;
            }
            return true;
        }
        return false;
    }

    public GSYVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurrentState = -1;
        this.mPlayPosition = -22;
        this.mBackUpPlayingBufferState = -1;
        this.mSeekOnStart = -1L;
        this.mSaveChangeViewTIme = 0L;
        this.mSpeed = 1.0f;
        this.mCache = false;
        this.mIfCurrentIsFullscreen = false;
        this.mLooping = false;
        this.mHadPlay = false;
        this.mNetChanged = false;
        this.mSoundTouch = false;
        this.mShowPauseCover = false;
        this.mPauseBeforePrepared = false;
        this.mStartAfterPrepared = true;
        this.mHadPrepared = false;
        this.mReleaseWhenLossAudio = true;
        this.mPlayTag = "";
        this.mNetSate = "NORMAL";
        this.mMapHeadData = new HashMap();
        this.onAudioFocusChangeListener = new a();
        init(context);
    }

    public GSYVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        this.mCurrentState = -1;
        this.mPlayPosition = -22;
        this.mBackUpPlayingBufferState = -1;
        this.mSeekOnStart = -1L;
        this.mSaveChangeViewTIme = 0L;
        this.mSpeed = 1.0f;
        this.mCache = false;
        this.mIfCurrentIsFullscreen = false;
        this.mLooping = false;
        this.mHadPlay = false;
        this.mNetChanged = false;
        this.mSoundTouch = false;
        this.mShowPauseCover = false;
        this.mPauseBeforePrepared = false;
        this.mStartAfterPrepared = true;
        this.mHadPrepared = false;
        this.mReleaseWhenLossAudio = true;
        this.mPlayTag = "";
        this.mNetSate = "NORMAL";
        this.mMapHeadData = new HashMap();
        this.onAudioFocusChangeListener = new a();
        init(context);
    }

    public GSYVideoView(Context context, Boolean bool) {
        super(context);
        this.mCurrentState = -1;
        this.mPlayPosition = -22;
        this.mBackUpPlayingBufferState = -1;
        this.mSeekOnStart = -1L;
        this.mSaveChangeViewTIme = 0L;
        this.mSpeed = 1.0f;
        this.mCache = false;
        this.mIfCurrentIsFullscreen = false;
        this.mLooping = false;
        this.mHadPlay = false;
        this.mNetChanged = false;
        this.mSoundTouch = false;
        this.mShowPauseCover = false;
        this.mPauseBeforePrepared = false;
        this.mStartAfterPrepared = true;
        this.mHadPrepared = false;
        this.mReleaseWhenLossAudio = true;
        this.mPlayTag = "";
        this.mNetSate = "NORMAL";
        this.mMapHeadData = new HashMap();
        this.onAudioFocusChangeListener = new a();
        this.mIfCurrentIsFullscreen = bool.booleanValue();
        init(context);
    }
}
