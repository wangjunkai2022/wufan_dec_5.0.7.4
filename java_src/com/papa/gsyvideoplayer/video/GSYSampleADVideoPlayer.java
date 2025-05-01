package com.papa.gsyvideoplayer.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.papa.gsyvideoplayer.R;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class GSYSampleADVideoPlayer extends ListGSYVideoPlayer {

    /* renamed from: d  reason: collision with root package name */
    protected View f58609d;

    /* renamed from: e  reason: collision with root package name */
    protected ViewGroup f58610e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f58611f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f58612g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f58613h;

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GSYSampleADVideoPlayer.this.a();
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends com.papa.gsyvideoplayer.model.b {

        /* renamed from: e  reason: collision with root package name */
        public static int f58615e = 0;

        /* renamed from: f  reason: collision with root package name */
        public static int f58616f = 1;

        /* renamed from: c  reason: collision with root package name */
        private int f58617c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f58618d;

        public b(String str, String str2, int i4) {
            this(str, str2, i4, false);
        }

        public boolean e() {
            return this.f58618d;
        }

        public void f(boolean z4) {
            this.f58618d = z4;
        }

        public void g(int i4) {
            this.f58617c = i4;
        }

        public int getType() {
            return this.f58617c;
        }

        public b(String str, String str2, int i4, boolean z4) {
            super(str, str2);
            this.f58617c = f58615e;
            this.f58617c = i4;
            this.f58618d = z4;
        }
    }

    public GSYSampleADVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
        this.f58612g = false;
        this.f58613h = false;
    }

    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean b(List<com.papa.gsyvideoplayer.model.b> list, boolean z4, int i4) {
        return c(list, z4, i4, null);
    }

    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean c(List<com.papa.gsyvideoplayer.model.b> list, boolean z4, int i4, File file) {
        return d(list, z4, i4, file, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer, com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        GSYSampleADVideoPlayer gSYSampleADVideoPlayer = (GSYSampleADVideoPlayer) gSYBaseVideoPlayer;
        GSYSampleADVideoPlayer gSYSampleADVideoPlayer2 = (GSYSampleADVideoPlayer) gSYBaseVideoPlayer2;
        gSYSampleADVideoPlayer2.f58612g = gSYSampleADVideoPlayer.f58612g;
        gSYSampleADVideoPlayer2.f58613h = gSYSampleADVideoPlayer.f58613h;
        gSYSampleADVideoPlayer2.f();
    }

    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean d(List<com.papa.gsyvideoplayer.model.b> list, boolean z4, int i4, File file, Map<String, String> map) {
        return e(list, z4, i4, file, map, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean e(List<com.papa.gsyvideoplayer.model.b> list, boolean z4, int i4, File file, Map<String, String> map, boolean z5) {
        com.papa.gsyvideoplayer.model.b bVar = list.get(i4);
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            if (bVar2.e() && i4 < list.size() - 1) {
                return e(list, z4, i4 + 1, file, map, z5);
            }
            this.f58612g = bVar2.getType() == b.f58616f;
        }
        f();
        return super.e(list, z4, i4, file, map, z5);
    }

    protected void f() {
        View view = this.f58609d;
        int i4 = 8;
        boolean z4 = false;
        if (view != null) {
            view.setVisibility((this.f58613h && this.f58612g) ? 0 : 8);
        }
        TextView textView = this.f58611f;
        if (textView != null) {
            textView.setVisibility((this.f58613h && this.f58612g) ? 0 : 8);
        }
        ViewGroup viewGroup = this.f58610e;
        if (viewGroup != null) {
            viewGroup.setVisibility((this.f58613h && this.f58612g) ? 0 : 0);
        }
        if (this.mBottomContainer != null) {
            this.mBottomContainer.setBackgroundColor((this.f58613h && this.f58612g) ? 0 : getContext().getResources().getColor(R.color.bottom_container_bg));
        }
        TextView textView2 = this.mCurrentTimeTextView;
        int i5 = 4;
        if (textView2 != null) {
            textView2.setVisibility((this.f58613h && this.f58612g) ? 4 : 0);
        }
        TextView textView3 = this.mTotalTimeTextView;
        if (textView3 != null) {
            textView3.setVisibility((this.f58613h && this.f58612g) ? 4 : 0);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setVisibility((this.f58613h && this.f58612g) ? 0 : 0);
            this.mProgressBar.setEnabled((this.f58613h && this.f58612g) ? true : true);
        }
    }

    public boolean g(ArrayList<b> arrayList, boolean z4, int i4) {
        return b((ArrayList) arrayList.clone(), z4, i4);
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R.layout.video_layout_sample_ad;
    }

    public boolean h(ArrayList<b> arrayList, boolean z4, int i4, File file) {
        return c((ArrayList) arrayList.clone(), z4, i4, file);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void hideAllWidget() {
        if (this.f58613h && this.f58612g) {
            return;
        }
        super.hideAllWidget();
    }

    public boolean i(ArrayList<b> arrayList, boolean z4, int i4, File file, Map<String, String> map) {
        return d((ArrayList) arrayList.clone(), z4, i4, file, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        this.f58609d = findViewById(R.id.jump_ad);
        this.f58611f = (TextView) findViewById(R.id.ad_time);
        this.f58610e = (ViewGroup) findViewById(R.id.widget_container);
        View view = this.f58609d;
        if (view != null) {
            view.setOnClickListener(new a());
        }
    }

    @Override // com.papa.gsyvideoplayer.video.ListGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        super.onPrepared();
        this.f58613h = true;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void setProgressAndTime(int i4, int i5, int i6, int i7, boolean z4) {
        super.setProgressAndTime(i4, i5, i6, i7, z4);
        TextView textView = this.f58611f;
        if (textView == null || i6 <= 0) {
            return;
        }
        textView.setText("" + ((i7 / 1000) - (i6 / 1000)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchDoubleUp() {
        if (this.f58612g) {
            return;
        }
        super.touchDoubleUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMove(float f5, float f6, float f7) {
        if (this.mChangePosition && this.f58612g) {
            return;
        }
        super.touchSurfaceMove(f5, f6, f7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMoveFullLogic(float f5, float f6) {
        int i4 = this.mThreshold;
        if (f5 > i4 || f6 > i4) {
            int h4 = com.papa.gsyvideoplayer.utils.b.h(getContext());
            if (this.f58612g && f5 >= this.mThreshold && Math.abs(h4 - this.mDownX) > this.mSeekEndOffset) {
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
        if (this.mChangePosition && this.f58612g) {
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
            imageView.setImageResource(R.drawable.video_click_pause_selector);
        } else if (i4 == 7) {
            imageView.setImageResource(R.drawable.video_click_play_selector);
        } else {
            imageView.setImageResource(R.drawable.video_click_play_selector);
        }
    }

    public GSYSampleADVideoPlayer(Context context) {
        super(context);
        this.f58612g = false;
        this.f58613h = false;
    }

    public GSYSampleADVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58612g = false;
        this.f58613h = false;
    }
}
