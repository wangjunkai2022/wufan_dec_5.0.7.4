package com.papa.gsyvideoplayer.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.papa.gsyvideoplayer.R;
import com.papa.gsyvideoplayer.utils.b;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
/* loaded from: classes5.dex */
public class GSYADVideoPlayer extends StandardGSYVideoPlayer {

    /* renamed from: b  reason: collision with root package name */
    protected View f58605b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f58606c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f58607d;

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GSYADVideoPlayer.this.getGSYVideoManager().w() != null) {
                GSYADVideoPlayer.this.getGSYVideoManager().w().onAutoCompletion();
            }
        }
    }

    public GSYADVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
    }

    protected void a() {
        View view = this.f58605b;
        if (view != null) {
            view.setVisibility(this.f58607d ? 0 : 8);
        }
        TextView textView = this.f58606c;
        if (textView != null) {
            textView.setVisibility(this.f58607d ? 0 : 8);
        }
        if (this.mBottomContainer != null) {
            this.mBottomContainer.setBackgroundColor(this.f58607d ? 0 : getContext().getResources().getColor(R.color.bottom_container_bg));
        }
        TextView textView2 = this.mCurrentTimeTextView;
        if (textView2 != null) {
            textView2.setVisibility(this.f58607d ? 4 : 0);
        }
        TextView textView3 = this.mTotalTimeTextView;
        if (textView3 != null) {
            textView3.setVisibility(this.f58607d ? 4 : 0);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setVisibility(this.f58607d ? 4 : 0);
            this.mProgressBar.setEnabled(!this.f58607d);
        }
    }

    public void b() {
        ViewGroup viewGroup = (ViewGroup) b.o(getContext()).findViewById(16908290);
        View findViewById = viewGroup.findViewById(getFullId());
        if (findViewById != null && findViewById.getParent() != null) {
            viewGroup.removeView((ViewGroup) findViewById.getParent());
        }
        this.mIfCurrentIsFullscreen = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public boolean backFromFull(Context context) {
        return com.papa.gsyvideoplayer.b.c0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        GSYADVideoPlayer gSYADVideoPlayer = (GSYADVideoPlayer) gSYBaseVideoPlayer2;
        gSYADVideoPlayer.f58607d = ((GSYADVideoPlayer) gSYBaseVideoPlayer).f58607d;
        gSYADVideoPlayer.a();
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getFullId() {
        return com.papa.gsyvideoplayer.b.A;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public com.papa.gsyvideoplayer.video.base.a getGSYVideoManager() {
        com.papa.gsyvideoplayer.b.d0().Q(getContext().getApplicationContext());
        return com.papa.gsyvideoplayer.b.d0();
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R.layout.video_layout_ad;
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected int getSmallId() {
        return com.papa.gsyvideoplayer.b.f58172z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void hideAllWidget() {
        if (this.f58607d) {
            return;
        }
        super.hideAllWidget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        this.f58605b = findViewById(R.id.jump_ad);
        this.f58606c = (TextView) findViewById(R.id.ad_time);
        View view = this.f58605b;
        if (view != null) {
            view.setOnClickListener(new a());
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.start) {
            if (this.mCurrentState == 7) {
                clickStartIcon();
                return;
            }
            return;
        }
        super.onClick(view);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        super.onPrepared();
        this.f58607d = true;
        a();
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void release() {
        super.release();
        TextView textView = this.f58606c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        com.papa.gsyvideoplayer.b.i0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void setProgressAndTime(int i4, int i5, int i6, int i7, boolean z4) {
        super.setProgressAndTime(i4, i5, i6, i7, z4);
        TextView textView = this.f58606c;
        if (textView == null || i6 <= 0) {
            return;
        }
        textView.setText("" + ((i7 / 1000) - (i6 / 1000)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchDoubleUp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMove(float f5, float f6, float f7) {
        if (this.mChangePosition) {
            return;
        }
        super.touchSurfaceMove(f5, f6, f7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMoveFullLogic(float f5, float f6) {
        int i4 = this.mThreshold;
        if (f5 > i4 || f6 > i4) {
            int h4 = b.h(getContext());
            if (f5 >= this.mThreshold && Math.abs(h4 - this.mDownX) > this.mSeekEndOffset) {
                this.mChangePosition = true;
                this.mDownPosition = getCurrentPositionWhenPlaying();
                return;
            }
            super.touchSurfaceMoveFullLogic(f5, f6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceUp() {
        if (this.mChangePosition) {
            return;
        }
        super.touchSurfaceUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void updateStartImage() {
        View view = this.mStartButton;
        if (view == null || !(view instanceof ImageView)) {
            return;
        }
        ImageView imageView = (ImageView) view;
        int i4 = this.mCurrentState;
        if (i4 == 2) {
            imageView.setImageResource(R.drawable.empty_drawable);
        } else if (i4 == 7) {
            imageView.setImageResource(R.drawable.video_click_error_selector);
        } else {
            imageView.setImageResource(R.drawable.empty_drawable);
        }
    }

    public GSYADVideoPlayer(Context context) {
        super(context);
    }

    public GSYADVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
