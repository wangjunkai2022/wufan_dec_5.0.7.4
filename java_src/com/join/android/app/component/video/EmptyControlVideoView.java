package com.join.android.app.component.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g1;
import com.join.mgps.customview.o;
import com.papa.gsyvideoplayer.utils.l;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
/* loaded from: classes3.dex */
public class EmptyControlVideoView extends StandardGSYVideoPlayer {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f15188e = true;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f15189b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15190c;

    /* renamed from: d  reason: collision with root package name */
    o f15191d;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EmptyControlVideoView.this.startPlayLogic();
            EmptyControlVideoView.this.f15191d.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EmptyControlVideoView.this.f15191d.dismiss();
        }
    }

    public EmptyControlVideoView(Context context) {
        super(context);
        this.f15190c = false;
        this.mShowFullAnimation = false;
        this.mFullAnimEnd = false;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R.layout.video_layout_empty_control_wufun;
    }

    @Override // com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        initCustomView();
    }

    void initCustomView() {
        ImageView imageView = (ImageView) findViewById(R.id.mute);
        this.f15189b = imageView;
        imageView.setOnClickListener(this);
        setMuteView(f15188e);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.mute) {
            setMute(!f15188e);
        }
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.papa.gsyvideoplayer.video.base.GSYVideoControlView, com.papa.gsyvideoplayer.video.base.GSYVideoView, s2.a
    public void onPrepared() {
        super.onPrepared();
        if (this.f15190c) {
            setMute(true);
            this.f15190c = false;
            return;
        }
        setMute(f15188e);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView, t2.c
    public void onSurfaceAvailable(Surface surface) {
        RelativeLayout relativeLayout;
        super.onSurfaceAvailable(surface);
        if (com.papa.gsyvideoplayer.utils.f.e() == 0 || (relativeLayout = this.mThumbImageViewLayout) == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        this.mThumbImageViewLayout.setVisibility(4);
    }

    @Override // com.papa.gsyvideoplayer.video.base.GSYTextureRenderView, t2.c
    public void onSurfaceUpdated(Surface surface) {
        super.onSurfaceUpdated(surface);
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        this.mThumbImageViewLayout.setVisibility(4);
    }

    public void setMute(boolean z4) {
        setMuteOnly(z4);
        setMuteView(z4);
        f15188e = z4;
    }

    public void setMuteOnly(boolean z4) {
        try {
            com.papa.gsyvideoplayer.d.e0().W(z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setMuteView(boolean z4) {
        if (z4) {
            this.f15189b.setImageResource(R.drawable.mute_off);
        } else {
            this.f15189b.setImageResource(R.drawable.mute_on);
        }
    }

    public void setMuteWhenPlay(boolean z4) {
        this.f15190c = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void setViewShowState(View view, int i4) {
        if (view != this.mThumbImageViewLayout || i4 == 0) {
            super.setViewShowState(view, i4);
        }
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
        if (this.f15191d == null) {
            o oVar2 = new o(getContext(), R.style.MyDialog);
            this.f15191d = oVar2;
            oVar2.setContentView(R.layout.bind_dialog);
        }
        Button button = (Button) this.f15191d.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f15191d.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.f15191d.findViewById(R.id.tip_title);
        View findViewById = this.f15191d.findViewById(R.id.divider);
        TextView textView2 = (TextView) this.f15191d.findViewById(R.id.dialog_content);
        TextView textView3 = (TextView) this.f15191d.findViewById(R.id.dialog_desci);
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
            button2.setOnClickListener(new a());
            button.setOnClickListener(new b());
            oVar = this.f15191d;
            if (oVar != null || oVar.isShowing()) {
            }
            this.f15191d.show();
            return;
        }
        str = "继续观看";
        string = "您已切换到数据网络，是否继续观看视频？";
        textView.setText("网络提示");
        textView2.setText(string);
        textView3.setVisibility(8);
        button2.setText(str);
        button.setText("取消");
        button2.setOnClickListener(new a());
        button.setOnClickListener(new b());
        oVar = this.f15191d;
        if (oVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchDoubleUp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMoveFullLogic(float f5, float f6) {
        super.touchSurfaceMoveFullLogic(f5, f6);
        this.mChangePosition = false;
        this.mChangeVolume = false;
        this.mBrightness = false;
    }

    public EmptyControlVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15190c = false;
        this.mShowFullAnimation = false;
        this.mFullAnimEnd = false;
    }
}
