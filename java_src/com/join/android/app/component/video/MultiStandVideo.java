package com.join.android.app.component.video;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.v0;
import com.papa.gsyvideoplayer.utils.o;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYVideoView;
import moe.codeest.enviews.ENPlayView;
import w1.q;
/* loaded from: classes3.dex */
public class MultiStandVideo extends StandardGSYVideoPlayer {

    /* renamed from: h  reason: collision with root package name */
    private static final String f15223h = "MultiStandVideo";

    /* renamed from: i  reason: collision with root package name */
    public static boolean f15224i = true;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f15225b;

    /* renamed from: c  reason: collision with root package name */
    public SimpleDraweeView f15226c;

    /* renamed from: d  reason: collision with root package name */
    String f15227d;

    /* renamed from: e  reason: collision with root package name */
    private String f15228e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f15229f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15230g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15231b;

        a(View view) {
            this.f15231b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                if (((GSYVideoView) MultiStandVideo.this).mCurrentState != 0 && ((GSYVideoView) MultiStandVideo.this).mCurrentState != 7 && ((GSYVideoView) MultiStandVideo.this).mCurrentState != 5 && ((GSYVideoView) MultiStandVideo.this).mCurrentState != 6) {
                    this.f15231b.setVisibility(4);
                    this.f15231b.setAlpha(1.0f);
                }
                MultiStandVideo.this.i();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15233b;

        b(View view) {
            this.f15233b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                this.f15233b.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiStandVideo.this.backToNormal();
        }
    }

    public MultiStandVideo(Context context, Boolean bool) {
        super(context, bool);
    }

    private void f(View view) {
        if (view == null) {
            return;
        }
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
            view.setAlpha(1.0f);
            view.setVisibility(4);
            animation.cancel();
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(600L);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setAnimationListener(new a(view));
            view.startAnimation(alphaAnimation);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void h() {
        if (this.mHadPlay) {
            if (!isVerticalVideo() && !this.f15230g) {
                com.papa.gsyvideoplayer.utils.f.l(0);
            } else {
                com.papa.gsyvideoplayer.utils.f.l(4);
            }
            changeTextureViewShowType();
            com.papa.gsyvideoplayer.render.a aVar = this.mTextureView;
            if (aVar != null) {
                aVar.o();
            }
        }
    }

    private void j(View view) {
        if (view == null) {
            return;
        }
        try {
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
                view.clearAnimation();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(600L);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setAnimationListener(new b(view));
            view.startAnimation(alphaAnimation);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public boolean backFromFull(Context context) {
        return getGSYVideoManager() != null && getGSYVideoManager().c0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToCompleteShow() {
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToError() {
        if (this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToNormal() {
        this.f15229f = false;
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        i();
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
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mStartButton, 4);
        i();
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
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
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
        f(this.mThumbImageViewLayout);
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setMute(f15224i);
        if (this.mIfCurrentIsFullscreen) {
            if (this.f15229f) {
                return;
            }
            setViewShowState(this.mBottomContainer, 4);
            setViewShowState(this.mStartButton, 4);
            return;
        }
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void changeUiToPrepareingClear() {
        super.changeUiToPrepareingClear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPreparingShow() {
        if (!this.mIfCurrentIsFullscreen) {
            setViewShowState(this.mTopContainer, 4);
        }
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected void clearFullscreenLayout() {
        int i4;
        if (this.mFullAnimEnd) {
            setMute(false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mStartButton.getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp60);
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp60);
            this.mStartButton.setLayoutParams(layoutParams);
            this.mIfCurrentIsFullscreen = false;
            o oVar = this.mOrientationUtils;
            if (oVar != null) {
                i4 = oVar.q();
                this.mOrientationUtils.I(false);
                o oVar2 = this.mOrientationUtils;
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
                ((MultiStandVideo) findViewById).mIfCurrentIsFullscreen = false;
            }
            if (i4 == 0) {
                backToNormal();
            } else {
                postDelayed(new c(), i4);
            }
        }
    }

    public void g(String str) {
        this.f15227d = str;
        SimpleDraweeView simpleDraweeView = this.f15225b;
        if (simpleDraweeView != null) {
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            i();
        }
        SimpleDraweeView simpleDraweeView2 = this.f15226c;
        if (simpleDraweeView2 != null) {
            MyImageLoader.L(simpleDraweeView2, this.f15227d, 6, 15);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getFullId() {
        return R.id.custom_full_id;
    }

    public String getKey() {
        if (this.mPlayPosition == -22) {
            com.papa.gsyvideoplayer.utils.c.e(getClass().getSimpleName() + " used getKey() ******* PlayPosition never set. ********");
        }
        if (TextUtils.isEmpty(this.mPlayTag)) {
            com.papa.gsyvideoplayer.utils.c.e(getClass().getSimpleName() + " used getKey() ******* PlayTag never set. ********");
        }
        return f15223h + this.mPlayPosition + this.mPlayTag;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R.layout.video_layout_multi_wufun;
    }

    public String getName() {
        return this.f15228e;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getSmallId() {
        return R.id.custom_small_id;
    }

    public String getUrl() {
        return this.mUrl;
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

    public void i() {
        setViewShowState(this.mThumbImageViewLayout, 0);
        this.mThumbImageViewLayout.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        int i4;
        super.init(context);
        this.f15225b = (SimpleDraweeView) findViewById(R.id.thumbImageView);
        this.mThumbImageViewLayout = (RelativeLayout) findViewById(R.id.thumb);
        this.f15226c = (SimpleDraweeView) findViewById(R.id.sdv_image_bluer);
        SimpleDraweeView simpleDraweeView = this.f15225b;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(this);
        }
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null && ((i4 = this.mCurrentState) == -1 || i4 == 0 || i4 == 7)) {
            Animation animation = relativeLayout.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            this.mThumbImageViewLayout.setVisibility(0);
            this.mThumbImageViewLayout.setAlpha(1.0f);
        }
        setThumbPlay(false);
        setShowPauseCover(true);
        setNeedShowWifiTip(false);
        setBottomProgressBarDrawable(null);
        this.onAudioFocusChangeListener = null;
        com.papa.gsyvideoplayer.utils.f.l(0);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.thumbImageView) {
            s2.h hVar = this.mVideoAllCallBack;
            if (hVar instanceof q) {
                ((q) hVar).onClickCover();
            }
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onInfo(int i4, int i5) {
        super.onInfo(i4, i5);
        if (i4 == getGSYVideoManager().r()) {
            h();
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        com.join.android.app.component.video.b gSYVideoManager;
        super.onPrepared();
        if (!this.mIfCurrentIsFullscreen || (gSYVideoManager = getGSYVideoManager()) == null) {
            return;
        }
        gSYVideoManager.W(false);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f15229f = true;
        super.onStartTrackingTouch(seekBar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        com.join.android.app.component.video.b gSYVideoManager = getGSYVideoManager();
        if (gSYVideoManager != null) {
            if (gSYVideoManager.w() != null) {
                gSYVideoManager.w().onCompletion();
            }
            gSYVideoManager.x();
        }
    }

    public void setEndGame() {
        this.f15230g = true;
        com.papa.gsyvideoplayer.utils.f.l(4);
    }

    public void setMute(boolean z4) {
        setMuteOnly(z4);
    }

    public void setMuteOnly(boolean z4) {
        try {
            v0.d("setMuteOnly ", z4 + "");
            com.join.android.app.component.video.b gSYVideoManager = getGSYVideoManager();
            if (getGSYVideoManager() != null) {
                gSYVideoManager.W(z4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setName(String str) {
        this.f15228e = str;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer showSmallVideo(Point point, boolean z4, boolean z5) {
        MultiStandVideo multiStandVideo = (MultiStandVideo) super.showSmallVideo(point, z4, z5);
        multiStandVideo.mStartButton.setVisibility(8);
        multiStandVideo.mStartButton = null;
        return multiStandVideo;
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
        MultiStandVideo multiStandVideo = (MultiStandVideo) startWindowFullscreen;
        multiStandVideo.g(this.f15227d);
        if (this.mCurrentState != 2) {
            startWindowFullscreen.startPlayLogic();
        }
        com.join.android.app.component.video.b gSYVideoManager = getGSYVideoManager();
        if (gSYVideoManager != null) {
            gSYVideoManager.W(false);
        }
        return multiStandVideo;
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

    public MultiStandVideo(Context context) {
        super(context);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public com.join.android.app.component.video.b getGSYVideoManager() {
        com.join.android.app.component.video.b d02 = com.join.android.app.component.video.b.d0(getKey(), this.mPlayTag, this.mPlayPosition);
        d02.Q(getContext().getApplicationContext());
        return d02;
    }

    public MultiStandVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
