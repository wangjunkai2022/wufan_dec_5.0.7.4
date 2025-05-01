package com.kwad.components.core.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.kwad.components.core.video.f;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.widget.KSRelativeLayout;
@SuppressLint({"ViewConstructor"})
@Deprecated
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.core.video.videoview.b implements View.OnClickListener {
    protected boolean Ud;
    private boolean Ue;
    protected boolean Uf;
    private int Ug;
    private int Uh;
    private KSRelativeLayout Ui;
    private RelativeLayout Uj;
    private boolean Uk;
    private boolean Ul;
    private LinearLayout Um;
    private LinearLayout Un;
    private ImageView Uo;
    private ViewGroup Up;
    private TextView Uq;
    private c Ur;
    private InterfaceC0476a Us;
    protected com.kwad.components.core.video.a.a Ut;
    private final com.kwad.sdk.core.download.a.a Uu;
    protected AdInfo mAdInfo;
    @NonNull
    protected AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected Context mContext;
    protected ImageView mS;
    protected TextView mT;
    private ProgressBar nm;
    private boolean np;
    private ImageView zT;
    private TextView zU;

    /* renamed from: com.kwad.components.core.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0476a {
        void a(int i4, ac.a aVar);
    }

    /* loaded from: classes5.dex */
    public interface b extends c {
        void onVideoPlayError(int i4, int i5);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void bl();

        void bm();

        void e(long j4);

        void onVideoPlayStart();
    }

    public a(Context context, @NonNull AdTemplate adTemplate, @NonNull com.kwad.sdk.core.video.videoview.c cVar) {
        super(context, cVar);
        this.Ue = true;
        this.Uf = false;
        this.Ul = false;
        this.Uu = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.video.a.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.aD(a.this.mAdInfo));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.ca(a.this.mAdTemplate));
            }

            @Override // com.kwad.sdk.core.download.a.a, com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadStarted() {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.dm(0));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                a aVar = a.this;
                aVar.aF(com.kwad.sdk.core.response.b.a.aD(aVar.mAdInfo));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.ab(a.this.mAdInfo));
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i4) {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.FQ());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i4) {
                a.this.Uq.setText(com.kwad.sdk.core.response.b.a.dm(i4));
            }
        };
        this.mContext = context;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        init();
    }

    private void aL(int i4) {
        try {
            InterfaceC0476a interfaceC0476a = this.Us;
            if (interfaceC0476a != null) {
                interfaceC0476a.a(i4, this.Ui.getTouchCoords());
            }
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    private void init() {
        com.kwad.sdk.n.l.inflate(this.mContext, R.layout.ksad_feed_video_palyer_controller, this);
        this.Ui = (KSRelativeLayout) findViewById(R.id.ksad_video_root_container);
        this.Uj = (RelativeLayout) findViewById(R.id.ksad_data_flow_container);
        this.mT = (TextView) findViewById(R.id.ksad_data_flow_play_tip);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_data_flow_play_btn);
        this.mS = imageView;
        imageView.setOnClickListener(this);
        this.Um = (LinearLayout) findViewById(R.id.ksad_video_network_unavailable);
        this.Un = (LinearLayout) findViewById(R.id.ksad_video_error_container);
        this.nm = (ProgressBar) findViewById(R.id.ksad_video_progress);
        this.Uo = (ImageView) findViewById(R.id.ksad_video_thumb_image);
        String url = com.kwad.sdk.core.response.b.a.bs(this.mAdInfo).getUrl();
        if (!TextUtils.isEmpty(url)) {
            this.Uo.setImageDrawable(null);
            KSImageLoader.loadImage(this.Uo, url, this.mAdTemplate);
            this.Uo.setVisibility(0);
        } else {
            this.Uo.setVisibility(8);
        }
        this.mT.setText(bm.ai(com.kwad.sdk.core.response.b.a.L(this.mAdInfo) * 1000));
        this.Ut = com.kwad.components.core.video.a.d.az(this.mAdTemplate);
        rL();
    }

    private void rM() {
        ViewGroup viewGroup = this.Up;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void rQ() {
        this.Uj.setVisibility(8);
    }

    private void setTopBottomVisible(boolean z4) {
        if (this.Ul) {
            return;
        }
        this.nm.setVisibility(z4 ? 0 : 8);
        this.Uk = z4;
    }

    public final void aF(String str) {
        ((TextView) findViewById(R.id.ksad_app_download)).setText(str);
    }

    public final void aO(boolean z4) {
        if (this.Ul) {
            return;
        }
        if (z4) {
            if (this.Uk) {
                this.nm.setVisibility(0);
                return;
            }
            return;
        }
        this.nm.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ey() {
        if (com.kwad.sdk.core.response.b.a.aE(this.mAdInfo)) {
            this.zT = (ImageView) findViewById(R.id.ksad_video_complete_app_icon);
            this.zU = (TextView) findViewById(R.id.ksad_app_name);
            this.Uq = (TextView) findViewById(R.id.ksad_app_download);
            KSImageLoader.loadAppIcon(this.zT, com.kwad.sdk.core.response.b.e.dX(this.mAdTemplate), this.mAdTemplate, 12);
            this.zU.setText(com.kwad.sdk.core.response.b.a.cd(this.mAdInfo));
            this.Uq.setText(com.kwad.sdk.core.response.b.a.aD(this.mAdInfo));
            this.Up = (LinearLayout) findViewById(R.id.ksad_video_complete_app_container);
            this.zT.setOnClickListener(this);
            this.zU.setOnClickListener(this);
            this.Uq.setOnClickListener(this);
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            this.mApkDownloadHelper = cVar;
            cVar.b(this.Uu);
        } else {
            TextView textView = (TextView) findViewById(R.id.ksad_h5_open);
            this.Uq = textView;
            textView.setText(com.kwad.sdk.core.response.b.a.aD(this.mAdInfo));
            this.Uq.setOnClickListener(this);
            this.Up = (LinearLayout) findViewById(R.id.ksad_video_complete_h5_container);
        }
        this.Up.setOnClickListener(this);
        this.Up.setVisibility(0);
    }

    public AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void n(int i4, int i5) {
        this.Uh = i5;
        this.Ug = i4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mS) {
            this.Ud = true;
            this.Ue = true;
            rR();
        } else if (view == this.zT) {
            aL(1);
        } else if (view == this.zU) {
            aL(2);
        } else if (view == this.Uq) {
            aL(3);
        } else {
            aL(4);
        }
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void onPlayStateChanged(int i4) {
        com.kwad.components.core.video.a.a aVar;
        com.kwad.sdk.core.e.c.d("AdVideoPlayerController", "onPlayStateChanged playState=" + i4);
        if (i4 == -1) {
            sb();
            setTopBottomVisible(false);
            this.Um.setVisibility(8);
            this.Un.setVisibility(0);
            c cVar = this.Ur;
            if (cVar instanceof f.a) {
                ((f.a) cVar).onVideoPlayError(this.Ug, this.Uh);
            }
            c cVar2 = this.Ur;
            if (cVar2 instanceof b) {
                ((b) cVar2).onVideoPlayError(this.Ug, this.Uh);
            }
            com.kwad.components.core.o.a.qI().c(this.mAdTemplate, this.Ug, this.Uh);
            com.kwad.components.core.video.a.a aVar2 = this.Ut;
            if (aVar2 != null) {
                aVar2.onMediaPlayError(this.Ug, this.Uh);
            }
        } else if (i4 == 9) {
            c cVar3 = this.Ur;
            if (cVar3 != null) {
                cVar3.bm();
            }
            sb();
            this.mAdTemplate.setmCurPlayTime(-1L);
            setTopBottomVisible(false);
            KSImageLoader.loadImage(this.Uo, com.kwad.sdk.core.response.b.a.W(this.mAdInfo), this.mAdTemplate);
            this.Uo.setVisibility(0);
            ey();
            com.kwad.components.core.video.a.a aVar3 = this.Ut;
            if (aVar3 != null) {
                aVar3.onMediaPlayCompleted();
            }
        } else if (i4 == 1) {
            rQ();
            this.Um.setVisibility(8);
            this.Un.setVisibility(8);
            this.nm.setVisibility(8);
            rM();
        } else if (i4 == 2) {
            c cVar4 = this.Ur;
            if (cVar4 != null) {
                cVar4.onVideoPlayStart();
            }
            com.kwad.components.core.video.a.a aVar4 = this.Ut;
            if (aVar4 != null) {
                aVar4.onMediaPlayStart();
            }
            setTopBottomVisible(true);
            sa();
        } else if (i4 == 4) {
            c cVar5 = this.Ur;
            if (cVar5 != null) {
                cVar5.bl();
            }
            this.Uo.setVisibility(8);
            com.kwad.components.core.video.a.a aVar5 = this.Ut;
            if (aVar5 != null) {
                aVar5.pc();
                this.Ut.onMediaPlaying();
            }
        } else if (i4 == 5) {
            com.kwad.components.core.video.a.a aVar6 = this.Ut;
            if (aVar6 != null) {
                aVar6.onMediaPlayPaused();
            }
        } else if (i4 != 6) {
            if (i4 == 7 && (aVar = this.Ut) != null) {
                aVar.onVideoPlayBufferingPaused();
            }
        } else {
            com.kwad.components.core.video.a.a aVar7 = this.Ut;
            if (aVar7 != null) {
                aVar7.onVideoPlayBufferingPlaying();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rL() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void rN() {
        this.Um.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void rO() {
        this.Um.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void rP() {
        this.Uj.setVisibility(0);
        this.Uo.setVisibility(0);
        this.mAdTemplate.mVideoPlayerStatus.setVideoPlayerBehavior(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rR() {
        if (this.aCR.isIdle()) {
            com.kwad.components.core.video.a.a aVar = this.Ut;
            if (aVar != null) {
                aVar.onStart();
            }
            if (!ah.isNetworkConnected(this.mContext)) {
                rN();
                return;
            }
            rO();
            if (this.Uf) {
                rS();
                this.aCR.start();
            } else if (this.Ue && ah.isWifiConnected(this.mContext)) {
                rS();
                this.aCR.start();
            } else if (this.Ue && (this.np || this.Ud)) {
                rS();
                this.aCR.start();
            } else {
                rP();
            }
        } else if (this.aCR.isPaused() || this.aCR.GT()) {
            rS();
            this.aCR.restart();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void rS() {
        this.aCR.setKsPlayLogParam(com.kwad.sdk.contentalliance.a.a.a.bF(this.mAdTemplate));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rT() {
        this.aCR.pause();
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void rU() {
        long currentPosition = this.aCR.getCurrentPosition();
        long duration = this.aCR.getDuration();
        this.nm.setSecondaryProgress(this.aCR.getBufferPercentage());
        this.mAdTemplate.setmCurPlayTime(currentPosition);
        this.nm.setProgress((int) ((((float) currentPosition) * 100.0f) / ((float) duration)));
        c cVar = this.Ur;
        if (cVar != null) {
            cVar.e(currentPosition);
        }
    }

    public final void rV() {
        this.Ul = true;
        this.nm.setVisibility(8);
    }

    public void release() {
        this.aCR.release();
        com.kwad.components.core.video.a.a aVar = this.Ut;
        if (aVar != null) {
            aVar.onRelease();
        }
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    @UiThread
    public final void reset() {
        sb();
        this.nm.setProgress(0);
        this.nm.setSecondaryProgress(0);
        rQ();
        this.Um.setVisibility(8);
        this.Un.setVisibility(8);
        this.nm.setVisibility(8);
        this.Uo.setVisibility(8);
        this.Uj.setVisibility(8);
        this.mAdTemplate.mVideoPlayerStatus.setVideoPlayerBehavior(1);
        rM();
    }

    public void setAdClickListener(InterfaceC0476a interfaceC0476a) {
        this.Us = interfaceC0476a;
    }

    public void setCanControlPlay(boolean z4) {
        this.Uf = z4;
    }

    public void setDataAutoStart(boolean z4) {
        this.Ue = z4;
    }

    public void setDataFlowAutoStart(boolean z4) {
        this.np = z4;
    }

    public void setVideoPlayCallback(c cVar) {
        this.Ur = cVar;
    }
}
