package com.papa.gsyvideoplayer.video.base;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.common.util.f;
import com.papa.gsyvideoplayer.R;
import java.io.File;
import java.util.Map;
import s2.g;
/* loaded from: classes5.dex */
public abstract class GSYVideoControlView extends GSYVideoView implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    Runnable dismissControlTask;
    protected GestureDetector gestureDetector;
    protected boolean isShowDragProgressTextOnSeekBar;
    protected ImageView mBackButton;
    protected ViewGroup mBottomContainer;
    protected ProgressBar mBottomProgressBar;
    protected boolean mBrightness;
    protected float mBrightnessData;
    protected boolean mChangePosition;
    protected boolean mChangeVolume;
    protected TextView mCurrentTimeTextView;
    protected int mDismissControlTime;
    protected int mDownPosition;
    protected float mDownX;
    protected float mDownY;
    protected int mEnlargeImageRes;
    protected boolean mFirstTouch;
    protected ImageView mFullscreenButton;
    protected s2.d mGSYVideoProgressListener;
    protected int mGestureDownVolume;
    protected boolean mHadSeekTouch;
    protected boolean mHideKey;
    protected boolean mIsTouchWiget;
    protected boolean mIsTouchWigetFull;
    protected View mLoadingProgressBar;
    protected g mLockClickListener;
    protected boolean mLockCurScreen;
    protected ImageView mLockScreen;
    protected float mMoveY;
    protected boolean mNeedLockFull;
    protected boolean mNeedShowWifiTip;
    protected boolean mPostDismiss;
    protected boolean mPostProgress;
    protected SeekBar mProgressBar;
    protected int mSeekEndOffset;
    protected float mSeekRatio;
    protected int mSeekTimePosition;
    protected boolean mSetUpLazy;
    protected boolean mShowVKey;
    protected int mShrinkImageRes;
    protected View mStartButton;
    protected int mThreshold;
    protected View mThumbImageView;
    protected RelativeLayout mThumbImageViewLayout;
    protected boolean mThumbPlay;
    protected TextView mTitleTextView;
    protected ViewGroup mTopContainer;
    protected TextView mTotalTimeTextView;
    protected boolean mTouchingProgressBar;
    Runnable progressTask;

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
            int i4 = gSYVideoControlView.mCurrentState;
            if (i4 == 6 || i4 == 7) {
                return;
            }
            gSYVideoControlView.lockTouchLogic();
            GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
            g gVar = gSYVideoControlView2.mLockClickListener;
            if (gVar != null) {
                gVar.a(view, gSYVideoControlView2.mLockCurScreen);
            }
        }
    }

    /* loaded from: classes5.dex */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GSYVideoControlView.this.touchDoubleUp();
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            GSYVideoControlView.this.touchLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
            if (!gSYVideoControlView.mChangePosition && !gSYVideoControlView.mChangeVolume && !gSYVideoControlView.mBrightness) {
                gSYVideoControlView.onClickUiToggle();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58646b;

        c(int i4) {
            this.f58646b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
            int i4 = gSYVideoControlView.mCurrentState;
            if (i4 == 0 || i4 == 1) {
                return;
            }
            int i5 = this.f58646b;
            if (i5 != 0) {
                gSYVideoControlView.setTextAndProgress(i5);
                GSYVideoControlView.this.mBufferPoint = this.f58646b;
                com.papa.gsyvideoplayer.utils.c.h("Net speed: " + GSYVideoControlView.this.getNetSpeedText() + " percent " + this.f58646b);
            }
            GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
            SeekBar seekBar = gSYVideoControlView2.mProgressBar;
            if (seekBar != null && gSYVideoControlView2.mLooping && gSYVideoControlView2.mHadPlay && this.f58646b == 0 && seekBar.getProgress() >= GSYVideoControlView.this.mProgressBar.getMax() - 1) {
                GSYVideoControlView.this.loopSetProgressAndTime();
            }
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
            int i4 = gSYVideoControlView.mCurrentState;
            if (i4 == 2 || i4 == 5) {
                gSYVideoControlView.setTextAndProgress(0);
            }
            GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
            if (gSYVideoControlView2.mPostProgress) {
                gSYVideoControlView2.postDelayed(this, 1000L);
            }
        }
    }

    /* loaded from: classes5.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
            int i4 = gSYVideoControlView.mCurrentState;
            if (i4 == 0 || i4 == 7 || i4 == 6) {
                return;
            }
            if (gSYVideoControlView.getActivityContext() != null) {
                GSYVideoControlView.this.hideAllWidget();
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                gSYVideoControlView2.setViewShowState(gSYVideoControlView2.mLockScreen, 8);
                GSYVideoControlView gSYVideoControlView3 = GSYVideoControlView.this;
                if (gSYVideoControlView3.mHideKey && gSYVideoControlView3.mIfCurrentIsFullscreen && gSYVideoControlView3.mShowVKey) {
                    com.papa.gsyvideoplayer.utils.b.k(gSYVideoControlView3.mContext);
                }
            }
            GSYVideoControlView gSYVideoControlView4 = GSYVideoControlView.this;
            if (gSYVideoControlView4.mPostDismiss) {
                gSYVideoControlView4.postDelayed(this, gSYVideoControlView4.mDismissControlTime);
            }
        }
    }

    public GSYVideoControlView(@NonNull Context context) {
        super(context);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new b());
        this.progressTask = new d();
        this.dismissControlTask = new e();
    }

    protected void cancelDismissControlViewTimer() {
        this.mPostDismiss = false;
        removeCallbacks(this.dismissControlTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancelProgressTimer() {
        this.mPostProgress = false;
        removeCallbacks(this.progressTask);
    }

    protected abstract void changeUiToCompleteShow();

    protected abstract void changeUiToError();

    protected abstract void changeUiToNormal();

    protected abstract void changeUiToPauseShow();

    protected abstract void changeUiToPlayingBufferingShow();

    protected abstract void changeUiToPlayingShow();

    protected abstract void changeUiToPreparingShow();

    public void clearThumbImageView() {
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void clickStartIcon() {
        if (TextUtils.isEmpty(this.mUrl)) {
            com.papa.gsyvideoplayer.utils.c.e("********" + getResources().getString(R.string.no_url));
            return;
        }
        int i4 = this.mCurrentState;
        if (i4 == 0 || i4 == 7) {
            if (isShowNetConfirm()) {
                showWifiDialog();
            } else {
                startButtonLogic();
            }
        } else if (i4 == 2) {
            try {
                onVideoPause();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            setStateAndUi(5);
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            if (this.mIfCurrentIsFullscreen) {
                com.papa.gsyvideoplayer.utils.c.h("onClickStopFullscreen");
                this.mVideoAllCallBack.onClickStopFullscreen(this.mOriginUrl, this.mTitle, this);
                return;
            }
            com.papa.gsyvideoplayer.utils.c.h("onClickStop");
            this.mVideoAllCallBack.onClickStop(this.mOriginUrl, this.mTitle, this);
        } else if (i4 != 5) {
            if (i4 == 6) {
                startButtonLogic();
            }
        } else {
            if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
                if (this.mIfCurrentIsFullscreen) {
                    com.papa.gsyvideoplayer.utils.c.h("onClickResumeFullscreen");
                    this.mVideoAllCallBack.onClickResumeFullscreen(this.mOriginUrl, this.mTitle, this);
                } else {
                    com.papa.gsyvideoplayer.utils.c.h("onClickResume");
                    this.mVideoAllCallBack.onClickResume(this.mOriginUrl, this.mTitle, this);
                }
            }
            if (!this.mHadPlay && !this.mStartAfterPrepared) {
                startAfterPrepared();
            }
            try {
                getGSYVideoManager().start();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            setStateAndUi(2);
        }
    }

    protected abstract void dismissBrightnessDialog();

    protected abstract void dismissProgressDialog();

    protected abstract void dismissVolumeDialog();

    public ImageView getBackButton() {
        return this.mBackButton;
    }

    public int getDismissControlTime() {
        return this.mDismissControlTime;
    }

    public int getEnlargeImageRes() {
        int i4 = this.mEnlargeImageRes;
        return i4 == -1 ? R.drawable.video_enlarge : i4;
    }

    public ImageView getFullscreenButton() {
        return this.mFullscreenButton;
    }

    public float getSeekRatio() {
        return this.mSeekRatio;
    }

    public int getShrinkImageRes() {
        int i4 = this.mShrinkImageRes;
        return i4 == -1 ? R.drawable.video_shrink : i4;
    }

    public View getStartButton() {
        return this.mStartButton;
    }

    public View getThumbImageView() {
        return this.mThumbImageView;
    }

    public RelativeLayout getThumbImageViewLayout() {
        return this.mThumbImageViewLayout;
    }

    public TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    protected abstract void hideAllWidget();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        RelativeLayout relativeLayout;
        super.init(context);
        this.mStartButton = findViewById(R.id.start);
        this.mTitleTextView = (TextView) findViewById(R.id.title);
        this.mBackButton = (ImageView) findViewById(R.id.back);
        this.mFullscreenButton = (ImageView) findViewById(R.id.fullscreen);
        this.mProgressBar = (SeekBar) findViewById(R.id.progress);
        this.mCurrentTimeTextView = (TextView) findViewById(R.id.current);
        this.mTotalTimeTextView = (TextView) findViewById(R.id.total);
        this.mBottomContainer = (ViewGroup) findViewById(R.id.layout_bottom);
        this.mTopContainer = (ViewGroup) findViewById(R.id.layout_top);
        this.mBottomProgressBar = (ProgressBar) findViewById(R.id.bottom_progressbar);
        this.mThumbImageViewLayout = (RelativeLayout) findViewById(R.id.thumb);
        this.mLockScreen = (ImageView) findViewById(R.id.lock_screen);
        this.mLoadingProgressBar = findViewById(R.id.loading);
        if (isInEditMode()) {
            return;
        }
        View view = this.mStartButton;
        if (view != null) {
            view.setOnClickListener(this);
        }
        ImageView imageView = this.mFullscreenButton;
        if (imageView != null) {
            imageView.setOnClickListener(this);
            this.mFullscreenButton.setOnTouchListener(this);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
        }
        ViewGroup viewGroup = this.mBottomContainer;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
        }
        ViewGroup viewGroup2 = this.mTextureViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(this);
            this.mTextureViewContainer.setOnTouchListener(this);
        }
        SeekBar seekBar2 = this.mProgressBar;
        if (seekBar2 != null) {
            seekBar2.setOnTouchListener(this);
        }
        RelativeLayout relativeLayout2 = this.mThumbImageViewLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
            this.mThumbImageViewLayout.setOnClickListener(this);
        }
        if (this.mThumbImageView != null && !this.mIfCurrentIsFullscreen && (relativeLayout = this.mThumbImageViewLayout) != null) {
            relativeLayout.removeAllViews();
            resolveThumbImage(this.mThumbImageView);
        }
        ImageView imageView2 = this.mBackButton;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.mLockScreen;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            this.mLockScreen.setOnClickListener(new a());
        }
        if (getActivityContext() != null) {
            this.mSeekEndOffset = com.papa.gsyvideoplayer.utils.b.b(getActivityContext(), 50.0f);
        }
    }

    public void initUIState() {
        setStateAndUi(0);
    }

    public boolean isHideKey() {
        return this.mHideKey;
    }

    public boolean isNeedLockFull() {
        return this.mNeedLockFull;
    }

    public boolean isNeedShowWifiTip() {
        return this.mNeedShowWifiTip;
    }

    public boolean isShowDragProgressTextOnSeekBar() {
        return this.isShowDragProgressTextOnSeekBar;
    }

    protected boolean isShowNetConfirm() {
        return (this.mOriginUrl.startsWith(f.f10925c) || this.mOriginUrl.startsWith(f.f10930h) || com.papa.gsyvideoplayer.utils.b.m(getContext()) || !this.mNeedShowWifiTip || getGSYVideoManager().e(this.mContext.getApplicationContext(), this.mCachePath, this.mOriginUrl)) ? false : true;
    }

    public boolean isTouchWiget() {
        return this.mIsTouchWiget;
    }

    public boolean isTouchWigetFull() {
        return this.mIsTouchWigetFull;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lockTouchLogic() {
        if (this.mLockCurScreen) {
            this.mLockScreen.setImageResource(R.drawable.unlock);
            this.mLockCurScreen = false;
            return;
        }
        this.mLockScreen.setImageResource(R.drawable.lock);
        this.mLockCurScreen = true;
        hideAllWidget();
    }

    protected void loopSetProgressAndTime() {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null) {
            return;
        }
        seekBar.setProgress(0);
        this.mProgressBar.setSecondaryProgress(0);
        this.mCurrentTimeTextView.setText(com.papa.gsyvideoplayer.utils.b.r(0));
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onAutoCompletion() {
        super.onAutoCompletion();
        if (this.mLockCurScreen) {
            lockTouchLogic();
            this.mLockScreen.setVisibility(8);
        }
    }

    protected void onBrightnessSlide(float f5) {
        float f6 = ((Activity) this.mContext).getWindow().getAttributes().screenBrightness;
        this.mBrightnessData = f6;
        if (f6 <= 0.0f) {
            this.mBrightnessData = 0.5f;
        } else if (f6 < 0.01f) {
            this.mBrightnessData = 0.01f;
        }
        WindowManager.LayoutParams attributes = ((Activity) this.mContext).getWindow().getAttributes();
        float f7 = this.mBrightnessData + f5;
        attributes.screenBrightness = f7;
        if (f7 > 1.0f) {
            attributes.screenBrightness = 1.0f;
        } else if (f7 < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        showBrightnessDialog(attributes.screenBrightness);
        ((Activity) this.mContext).getWindow().setAttributes(attributes);
    }

    @Override // s2.a
    public void onBufferingUpdate(int i4) {
        post(new c(i4));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (this.mHideKey && this.mIfCurrentIsFullscreen) {
            com.papa.gsyvideoplayer.utils.b.k(this.mContext);
        }
        if (id == R.id.start) {
            clickStartIcon();
            return;
        }
        int i4 = R.id.surface_container;
        if (id == i4 && this.mCurrentState == 7) {
            if (this.mVideoAllCallBack != null) {
                com.papa.gsyvideoplayer.utils.c.h("onClickStartError");
                this.mVideoAllCallBack.onClickStartError(this.mOriginUrl, this.mTitle, this);
            }
            prepareVideo();
        } else if (id != R.id.thumb) {
            if (id == i4) {
                if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
                    if (this.mIfCurrentIsFullscreen) {
                        com.papa.gsyvideoplayer.utils.c.h("onClickBlankFullscreen");
                        this.mVideoAllCallBack.onClickBlankFullscreen(this.mOriginUrl, this.mTitle, this);
                    } else {
                        com.papa.gsyvideoplayer.utils.c.h("onClickBlank");
                        this.mVideoAllCallBack.onClickBlank(this.mOriginUrl, this.mTitle, this);
                    }
                }
                startDismissControlViewTimer();
            }
        } else if (this.mThumbPlay) {
            if (TextUtils.isEmpty(this.mUrl)) {
                com.papa.gsyvideoplayer.utils.c.e("********" + getResources().getString(R.string.no_url));
                return;
            }
            int i5 = this.mCurrentState;
            if (i5 != 0) {
                if (i5 == 6) {
                    onClickUiToggle();
                }
            } else if (isShowNetConfirm()) {
                showWifiDialog();
            } else {
                startPlayLogic();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onClickUiToggle();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ dismiss onDetachedFromWindow");
        cancelProgressTimer();
        cancelDismissControlViewTimer();
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onError(int i4, int i5) {
        super.onError(i4, i5);
        if (this.mLockCurScreen) {
            lockTouchLogic();
            this.mLockScreen.setVisibility(8);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        setTextAndProgress(0, true);
        super.onPrepared();
        if (this.mCurrentState != 1) {
            return;
        }
        startProgressTimer();
        com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ surface_container onPrepared");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
        showDragProgressTextOnSeekBar(z4, i4);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.mHadSeekTouch = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            if (isIfCurrentIsFullscreen()) {
                com.papa.gsyvideoplayer.utils.c.h("onClickSeekbarFullscreen");
                this.mVideoAllCallBack.onClickSeekbarFullscreen(this.mOriginUrl, this.mTitle, this);
            } else {
                com.papa.gsyvideoplayer.utils.c.h("onClickSeekbar");
                this.mVideoAllCallBack.onClickSeekbar(this.mOriginUrl, this.mTitle, this);
            }
        }
        if (getGSYVideoManager() != null && this.mHadPlay) {
            try {
                getGSYVideoManager().seekTo((seekBar.getProgress() * getDuration()) / 100);
            } catch (Exception e5) {
                com.papa.gsyvideoplayer.utils.c.j(e5.toString());
            }
        }
        this.mHadSeekTouch = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r8 != 2) goto L35;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            int r8 = r8.getId()
            float r0 = r9.getX()
            float r1 = r9.getY()
            boolean r2 = r7.mIfCurrentIsFullscreen
            r3 = 1
            if (r2 == 0) goto L20
            boolean r2 = r7.mLockCurScreen
            if (r2 == 0) goto L20
            boolean r2 = r7.mNeedLockFull
            if (r2 == 0) goto L20
            r7.onClickUiToggle()
            r7.startDismissControlViewTimer()
            return r3
        L20:
            int r2 = com.papa.gsyvideoplayer.R.id.fullscreen
            r4 = 0
            if (r8 != r2) goto L26
            return r4
        L26:
            int r2 = com.papa.gsyvideoplayer.R.id.surface_container
            r5 = 2
            if (r8 != r2) goto L99
            int r8 = r9.getAction()
            if (r8 == 0) goto L90
            if (r8 == r3) goto L66
            if (r8 == r5) goto L36
            goto L93
        L36:
            float r8 = r7.mDownX
            float r0 = r0 - r8
            float r8 = r7.mDownY
            float r8 = r1 - r8
            float r2 = java.lang.Math.abs(r0)
            float r3 = java.lang.Math.abs(r8)
            boolean r5 = r7.mIfCurrentIsFullscreen
            if (r5 == 0) goto L4d
            boolean r6 = r7.mIsTouchWigetFull
            if (r6 != 0) goto L53
        L4d:
            boolean r6 = r7.mIsTouchWiget
            if (r6 == 0) goto L62
            if (r5 != 0) goto L62
        L53:
            boolean r5 = r7.mChangePosition
            if (r5 != 0) goto L62
            boolean r5 = r7.mChangeVolume
            if (r5 != 0) goto L62
            boolean r5 = r7.mBrightness
            if (r5 != 0) goto L62
            r7.touchSurfaceMoveFullLogic(r2, r3)
        L62:
            r7.touchSurfaceMove(r0, r8, r1)
            goto L93
        L66:
            r7.startDismissControlViewTimer()
            r7.touchSurfaceUp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r0 = r7.hashCode()
            r8.append(r0)
            java.lang.String r0 = "------------------------------ surface_container ACTION_UP"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.papa.gsyvideoplayer.utils.c.h(r8)
            r7.startProgressTimer()
            boolean r8 = r7.mHideKey
            if (r8 == 0) goto L93
            boolean r8 = r7.mShowVKey
            if (r8 == 0) goto L93
            return r3
        L90:
            r7.touchSurfaceDown(r0, r1)
        L93:
            android.view.GestureDetector r8 = r7.gestureDetector
            r8.onTouchEvent(r9)
            goto Led
        L99:
            int r0 = com.papa.gsyvideoplayer.R.id.progress
            if (r8 != r0) goto Led
            int r8 = r9.getAction()
            if (r8 == 0) goto Ld9
            if (r8 == r3) goto La8
            if (r8 == r5) goto Ldc
            goto Led
        La8:
            r7.startDismissControlViewTimer()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r7.hashCode()
            r8.append(r9)
            java.lang.String r9 = "------------------------------ progress ACTION_UP"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.papa.gsyvideoplayer.utils.c.h(r8)
            r7.startProgressTimer()
            android.view.ViewParent r8 = r7.getParent()
        Lca:
            if (r8 == 0) goto Ld4
            r8.requestDisallowInterceptTouchEvent(r4)
            android.view.ViewParent r8 = r8.getParent()
            goto Lca
        Ld4:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.mBrightnessData = r8
            goto Led
        Ld9:
            r7.cancelDismissControlViewTimer()
        Ldc:
            r7.cancelProgressTimer()
            android.view.ViewParent r8 = r7.getParent()
        Le3:
            if (r8 == 0) goto Led
            r8.requestDisallowInterceptTouchEvent(r3)
            android.view.ViewParent r8 = r8.getParent()
            goto Le3
        Led:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa.gsyvideoplayer.video.base.GSYVideoControlView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void prepareVideo() {
        if (this.mSetUpLazy) {
            super.setUp(this.mOriginUrl, this.mCache, this.mCachePath, this.mMapHeadData, this.mTitle);
        }
        super.prepareVideo();
    }

    protected void resetProgressAndTime() {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null) {
            return;
        }
        seekBar.setProgress(0);
        this.mProgressBar.setSecondaryProgress(0);
        this.mCurrentTimeTextView.setText(com.papa.gsyvideoplayer.utils.b.r(0));
        this.mTotalTimeTextView.setText(com.papa.gsyvideoplayer.utils.b.r(0));
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.mBottomProgressBar.setSecondaryProgress(0);
        }
    }

    protected void resolveThumbImage(View view) {
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.mThumbImageViewLayout.addView(view, layoutParams);
        }
    }

    protected void resolveUIState(int i4) {
        if (i4 == 0) {
            changeUiToNormal();
            cancelDismissControlViewTimer();
        } else if (i4 == 1) {
            changeUiToPreparingShow();
            startDismissControlViewTimer();
        } else if (i4 == 2) {
            changeUiToPlayingShow();
            startDismissControlViewTimer();
        } else if (i4 == 3) {
            changeUiToPlayingBufferingShow();
        } else if (i4 == 5) {
            changeUiToPauseShow();
            cancelDismissControlViewTimer();
        } else if (i4 == 6) {
            changeUiToCompleteShow();
            cancelDismissControlViewTimer();
        } else if (i4 != 7) {
        } else {
            changeUiToError();
        }
    }

    public void setDismissControlTime(int i4) {
        this.mDismissControlTime = i4;
    }

    public void setEnlargeImageRes(int i4) {
        this.mEnlargeImageRes = i4;
    }

    public void setGSYVideoProgressListener(s2.d dVar) {
        this.mGSYVideoProgressListener = dVar;
    }

    public void setHideKey(boolean z4) {
        this.mHideKey = z4;
    }

    public void setIsTouchWiget(boolean z4) {
        this.mIsTouchWiget = z4;
    }

    public void setIsTouchWigetFull(boolean z4) {
        this.mIsTouchWigetFull = z4;
    }

    public void setLockClickListener(g gVar) {
        this.mLockClickListener = gVar;
    }

    public void setNeedLockFull(boolean z4) {
        this.mNeedLockFull = z4;
    }

    public void setNeedShowWifiTip(boolean z4) {
        this.mNeedShowWifiTip = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setProgressAndTime(int i4, int i5, int i6, int i7, boolean z4) {
        s2.d dVar = this.mGSYVideoProgressListener;
        if (dVar != null && this.mCurrentState == 2) {
            dVar.a(i4, i5, i6, i7);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null || this.mHadSeekTouch) {
            return;
        }
        if (!this.mTouchingProgressBar && (i4 != 0 || z4)) {
            seekBar.setProgress(i4);
        }
        if (getGSYVideoManager().b() > 0) {
            i5 = getGSYVideoManager().b();
        }
        if (i5 > 94) {
            i5 = 100;
        }
        setSecondaryProgress(i5);
        this.mTotalTimeTextView.setText(com.papa.gsyvideoplayer.utils.b.r(i7));
        if (i6 > 0) {
            this.mCurrentTimeTextView.setText(com.papa.gsyvideoplayer.utils.b.r(i6));
        }
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            if (i4 != 0 || z4) {
                progressBar.setProgress(i4);
            }
            setSecondaryProgress(i5);
        }
    }

    protected void setSecondaryProgress(int i4) {
        if (this.mProgressBar != null && i4 != 0 && !getGSYVideoManager().y()) {
            this.mProgressBar.setSecondaryProgress(i4);
        }
        if (this.mBottomProgressBar == null || i4 == 0 || getGSYVideoManager().y()) {
            return;
        }
        this.mBottomProgressBar.setSecondaryProgress(i4);
    }

    public void setSeekRatio(float f5) {
        if (f5 < 0.0f) {
            return;
        }
        this.mSeekRatio = f5;
    }

    public void setShowDragProgressTextOnSeekBar(boolean z4) {
        this.isShowDragProgressTextOnSeekBar = z4;
    }

    public void setShrinkImageRes(int i4) {
        this.mShrinkImageRes = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView
    public void setSmallVideoTextureView(View.OnTouchListener onTouchListener) {
        super.setSmallVideoTextureView(onTouchListener);
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void setStateAndUi(int i4) {
        TextView textView;
        this.mCurrentState = i4;
        if ((i4 == 0 && isCurrentMediaListener()) || i4 == 6 || i4 == 7) {
            this.mHadPrepared = false;
        }
        int i5 = this.mCurrentState;
        if (i5 == 0) {
            if (isCurrentMediaListener()) {
                com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ dismiss CURRENT_STATE_NORMAL");
                cancelProgressTimer();
                getGSYVideoManager().x();
                releasePauseCover();
                this.mBufferPoint = 0;
                this.mSaveChangeViewTIme = 0L;
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
                }
            }
            releaseNetWorkState();
        } else if (i5 == 1) {
            resetProgressAndTime();
        } else if (i5 != 2) {
            if (i5 == 5) {
                com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ CURRENT_STATE_PAUSE");
                startProgressTimer();
            } else if (i5 != 6) {
                if (i5 == 7 && isCurrentMediaListener()) {
                    getGSYVideoManager().x();
                }
            } else {
                com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ dismiss CURRENT_STATE_AUTO_COMPLETE");
                cancelProgressTimer();
                SeekBar seekBar = this.mProgressBar;
                if (seekBar != null) {
                    seekBar.setProgress(100);
                }
                TextView textView2 = this.mCurrentTimeTextView;
                if (textView2 != null && (textView = this.mTotalTimeTextView) != null) {
                    textView2.setText(textView.getText());
                }
                ProgressBar progressBar = this.mBottomProgressBar;
                if (progressBar != null) {
                    progressBar.setProgress(100);
                }
            }
        } else if (isCurrentMediaListener()) {
            com.papa.gsyvideoplayer.utils.c.h(hashCode() + "------------------------------ CURRENT_STATE_PLAYING");
            startProgressTimer();
        }
        resolveUIState(i4);
    }

    protected void setTextAndProgress(int i4) {
        setTextAndProgress(i4, false);
    }

    public void setThumbImageView(View view) {
        if (this.mThumbImageViewLayout != null) {
            this.mThumbImageView = view;
            resolveThumbImage(view);
        }
    }

    public void setThumbPlay(boolean z4) {
        this.mThumbPlay = z4;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z4, String str2) {
        return setUp(str, z4, null, str2);
    }

    public boolean setUpLazy(String str, boolean z4, File file, Map<String, String> map, String str2) {
        this.mOriginUrl = str;
        this.mCache = z4;
        this.mCachePath = file;
        this.mSetUpLazy = true;
        this.mTitle = str2;
        this.mMapHeadData = map;
        if (!isCurrentMediaListener() || System.currentTimeMillis() - this.mSaveChangeViewTIme >= 2000) {
            this.mUrl = "waiting";
            this.mCurrentState = 0;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setViewShowState(View view, int i4) {
        if (view != null) {
            view.setVisibility(i4);
        }
    }

    protected abstract void showBrightnessDialog(float f5);

    protected void showDragProgressTextOnSeekBar(boolean z4, int i4) {
        if (z4 && this.isShowDragProgressTextOnSeekBar) {
            int duration = getDuration();
            TextView textView = this.mCurrentTimeTextView;
            if (textView != null) {
                textView.setText(com.papa.gsyvideoplayer.utils.b.r((i4 * duration) / 100));
            }
        }
    }

    protected abstract void showProgressDialog(float f5, String str, int i4, String str2, int i5);

    protected abstract void showVolumeDialog(float f5, int i4);

    protected abstract void showWifiDialog();

    /* JADX INFO: Access modifiers changed from: protected */
    public void startDismissControlViewTimer() {
        cancelDismissControlViewTimer();
        this.mPostDismiss = true;
        postDelayed(this.dismissControlTask, this.mDismissControlTime);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startProgressTimer() {
        cancelProgressTimer();
        this.mPostProgress = true;
        postDelayed(this.progressTask, 300L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void touchDoubleUp() {
        if (this.mHadPlay) {
            clickStartIcon();
        }
    }

    protected void touchLongPress(MotionEvent motionEvent) {
    }

    protected void touchSurfaceDown(float f5, float f6) {
        this.mTouchingProgressBar = true;
        this.mDownX = f5;
        this.mDownY = f6;
        this.mMoveY = 0.0f;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void touchSurfaceMove(float f5, float f6, float f7) {
        int i4;
        int i5;
        int streamMaxVolume;
        if (getActivityContext() != null) {
            i4 = com.papa.gsyvideoplayer.utils.b.f((Activity) getActivityContext()) ? this.mScreenHeight : this.mScreenWidth;
            i5 = com.papa.gsyvideoplayer.utils.b.f((Activity) getActivityContext()) ? this.mScreenWidth : this.mScreenHeight;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.mChangePosition) {
            int duration = getDuration();
            int i6 = (int) (this.mDownPosition + (((duration * f5) / i4) / this.mSeekRatio));
            this.mSeekTimePosition = i6;
            if (i6 > duration) {
                this.mSeekTimePosition = duration;
            }
            showProgressDialog(f5, com.papa.gsyvideoplayer.utils.b.r(this.mSeekTimePosition), this.mSeekTimePosition, com.papa.gsyvideoplayer.utils.b.r(duration), duration);
        } else if (this.mChangeVolume) {
            float f8 = -f6;
            float f9 = i5;
            this.mAudioManager.setStreamVolume(3, this.mGestureDownVolume + ((int) (((this.mAudioManager.getStreamMaxVolume(3) * f8) * 3.0f) / f9)), 0);
            showVolumeDialog(-f8, (int) (((this.mGestureDownVolume * 100) / streamMaxVolume) + (((3.0f * f8) * 100.0f) / f9)));
        } else if (!this.mBrightness || Math.abs(f6) <= this.mThreshold) {
        } else {
            onBrightnessSlide((-f6) / i5);
            this.mDownY = f7;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void touchSurfaceMoveFullLogic(float f5, float f6) {
        int i4;
        if (getActivityContext() != null) {
            i4 = com.papa.gsyvideoplayer.utils.b.f((Activity) getActivityContext()) ? this.mScreenHeight : this.mScreenWidth;
        } else {
            i4 = 0;
        }
        int i5 = this.mThreshold;
        if (f5 > i5 || f6 > i5) {
            cancelProgressTimer();
            if (f5 >= this.mThreshold) {
                if (Math.abs(com.papa.gsyvideoplayer.utils.b.h(getContext()) - this.mDownX) > this.mSeekEndOffset) {
                    this.mChangePosition = true;
                    this.mDownPosition = getCurrentPositionWhenPlaying();
                    return;
                }
                this.mShowVKey = true;
                return;
            }
            boolean z4 = Math.abs(((float) com.papa.gsyvideoplayer.utils.b.g(getContext())) - this.mDownY) > ((float) this.mSeekEndOffset);
            if (this.mFirstTouch) {
                this.mBrightness = this.mDownX < ((float) i4) * 0.5f && z4;
                this.mFirstTouch = false;
            }
            if (!this.mBrightness) {
                this.mChangeVolume = z4;
                this.mGestureDownVolume = this.mAudioManager.getStreamVolume(3);
            }
            this.mShowVKey = !z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void touchSurfaceUp() {
        int i4;
        if (this.mChangePosition) {
            int duration = getDuration();
            int i5 = this.mSeekTimePosition * 100;
            if (duration == 0) {
                duration = 1;
            }
            int i6 = i5 / duration;
            ProgressBar progressBar = this.mBottomProgressBar;
            if (progressBar != null) {
                progressBar.setProgress(i6);
            }
        }
        this.mTouchingProgressBar = false;
        dismissProgressDialog();
        dismissVolumeDialog();
        dismissBrightnessDialog();
        if (this.mChangePosition && getGSYVideoManager() != null && ((i4 = this.mCurrentState) == 2 || i4 == 5)) {
            try {
                getGSYVideoManager().seekTo(this.mSeekTimePosition);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            int duration2 = getDuration();
            int i7 = this.mSeekTimePosition * 100;
            if (duration2 == 0) {
                duration2 = 1;
            }
            int i8 = i7 / duration2;
            SeekBar seekBar = this.mProgressBar;
            if (seekBar != null) {
                seekBar.setProgress(i8);
            }
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            com.papa.gsyvideoplayer.utils.c.h("onTouchScreenSeekPosition");
            this.mVideoAllCallBack.onTouchScreenSeekPosition(this.mOriginUrl, this.mTitle, this);
        } else if (this.mBrightness) {
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            com.papa.gsyvideoplayer.utils.c.h("onTouchScreenSeekLight");
            this.mVideoAllCallBack.onTouchScreenSeekLight(this.mOriginUrl, this.mTitle, this);
        } else if (this.mChangeVolume && this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            com.papa.gsyvideoplayer.utils.c.h("onTouchScreenSeekVolume");
            this.mVideoAllCallBack.onTouchScreenSeekVolume(this.mOriginUrl, this.mTitle, this);
        }
    }

    protected void setTextAndProgress(int i4, boolean z4) {
        int currentPositionWhenPlaying = getCurrentPositionWhenPlaying();
        int duration = getDuration();
        setProgressAndTime((currentPositionWhenPlaying * 100) / (duration == 0 ? 1 : duration), i4, currentPositionWhenPlaying, duration, z4);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z4, File file, String str2) {
        TextView textView;
        if (super.setUp(str, z4, file, str2)) {
            if (str2 != null && (textView = this.mTitleTextView) != null) {
                textView.setText(str2);
            }
            if (this.mIfCurrentIsFullscreen) {
                ImageView imageView = this.mFullscreenButton;
                if (imageView != null) {
                    imageView.setImageResource(getShrinkImageRes());
                    return true;
                }
                return true;
            }
            ImageView imageView2 = this.mFullscreenButton;
            if (imageView2 != null) {
                imageView2.setImageResource(getEnlargeImageRes());
                return true;
            }
            return true;
        }
        return false;
    }

    public GSYVideoControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new b());
        this.progressTask = new d();
        this.dismissControlTask = new e();
    }

    public GSYVideoControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new b());
        this.progressTask = new d();
        this.dismissControlTask = new e();
    }

    public GSYVideoControlView(Context context, Boolean bool) {
        super(context, bool);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new b());
        this.progressTask = new d();
        this.dismissControlTask = new e();
    }
}
