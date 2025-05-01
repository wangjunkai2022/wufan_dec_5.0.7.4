package com.beizi.fusion.work.h;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.beizi.fusion.R;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.i;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.HashMap;
import java.util.List;
/* compiled from: KsUnifiedCustomWorker.java */
/* loaded from: classes2.dex */
public class e extends a {
    private ViewGroup W;
    private ImageView X;
    private TextView Y;
    private KsNativeAd Z;

    public e(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        super(context, j4, buyerBean, forwardBean, eVar, i4);
    }

    @Override // com.beizi.fusion.work.h.a
    public int aG() {
        return R.layout.ks_layout_unified_view;
    }

    @Override // com.beizi.fusion.work.h.a
    public void aH() {
        super.aH();
        this.W = (ViewGroup) ((a) this).f7635o.findViewById(R.id.ll_ad_source_container);
        this.X = (ImageView) ((a) this).f7635o.findViewById(R.id.ad_source_logo_iv);
        this.Y = (TextView) ((a) this).f7635o.findViewById(R.id.ad_source_logo_tv);
    }

    @Override // com.beizi.fusion.work.h.a
    public void aI() {
        if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.h.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        n.a(this.N, this.f7376h);
        this.f7370b.u(KsAdSDK.getSDKVersion());
        au();
        v();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(((a) this).H);
        long j4 = ((a) this).H;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
    }

    @Override // com.beizi.fusion.work.h.a
    public void aJ() {
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).width((int) this.I).adNum(1).build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadNativeAd(build, new KsLoadManager.NativeAdListener() { // from class: com.beizi.fusion.work.h.e.2
            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsUnifiedCustomAd Callback --> onError: code = ");
                sb.append(i4);
                sb.append(" ，message= ");
                sb.append(str);
                e.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onNativeAdLoad(@Nullable List<KsNativeAd> list) {
                ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                e.this.y();
                if (list == null || list.size() == 0) {
                    e.this.c(-991);
                    return;
                }
                e.this.Z = list.get(0);
                if (e.this.Z == null) {
                    e.this.c(-991);
                    return;
                }
                e eVar = e.this;
                eVar.a(eVar.Z.getECPM());
                e.this.b();
                e.this.aX();
                e.this.aM();
            }
        });
    }

    @Override // com.beizi.fusion.work.h.a
    public void aO() {
        aY();
    }

    @Override // com.beizi.fusion.work.h.a
    public void aQ() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(11, -1);
        layoutParams.rightMargin = (((a) this).f7639s.getLayoutParams().width - ((a) this).f7640t.getLayoutParams().width) / 2;
        layoutParams.bottomMargin = ((a) this).f7639s.getLayoutParams().height - ((a) this).f7640t.getLayoutParams().height;
        this.W.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(this.Z.getAdSourceLogoUrl(0))) {
            i.a(this.N).a(this.Z.getAdSourceLogoUrl(1), new i.a() { // from class: com.beizi.fusion.work.h.e.6
                @Override // com.beizi.fusion.g.i.a
                public void a() {
                }

                @Override // com.beizi.fusion.g.i.a
                public void a(Bitmap bitmap) {
                    e.this.X.setImageBitmap(bitmap);
                }
            });
        }
        if (TextUtils.isEmpty(this.Z.getAdSource())) {
            return;
        }
        this.Y.setText(this.Z.getAdSource());
    }

    @Override // com.beizi.fusion.work.h.a
    public void aR() {
        KsImage ksImage;
        if (this.Z.getMaterialType() != 2 && this.Z.getMaterialType() != 3) {
            if (this.Z.getMaterialType() == 1) {
                View videoView = this.Z.getVideoView(this.N, new KsAdVideoPlayConfig.Builder().build());
                ((a) this).f7640t.removeAllViews();
                ((a) this).f7640t.addView(videoView);
            }
        } else if (this.Z.getImageList() == null || this.Z.getImageList().isEmpty() || (ksImage = this.Z.getImageList().get(0)) == null || !ksImage.isValid()) {
        } else {
            i.a(this.N).a(ksImage.getImageUrl(), new i.a() { // from class: com.beizi.fusion.work.h.e.5
                @Override // com.beizi.fusion.g.i.a
                public void a() {
                }

                @Override // com.beizi.fusion.g.i.a
                public void a(Bitmap bitmap) {
                    ((a) e.this).f7645y.setImageBitmap(bitmap);
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.h.a
    public String aS() {
        KsNativeAd ksNativeAd = this.Z;
        return ksNativeAd != null ? ksNativeAd.getInteractionType() == 1 ? !TextUtils.isEmpty(this.Z.getAppName()) ? this.Z.getAppName() : "" : !TextUtils.isEmpty(this.Z.getProductName()) ? this.Z.getProductName() : "" : "";
    }

    @Override // com.beizi.fusion.work.h.a
    public String aT() {
        return this.Z.getAdDescription();
    }

    @Override // com.beizi.fusion.work.h.a
    public String aU() {
        return this.Z.getAppIconUrl();
    }

    @Override // com.beizi.fusion.work.h.a
    public String aV() {
        return this.Z.getActionDescription();
    }

    @Override // com.beizi.fusion.work.h.a
    public void aX() {
        if (this.Z == null) {
            c(-991);
        } else {
            aN();
        }
    }

    @Override // com.beizi.fusion.work.h.a, com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    @Override // com.beizi.fusion.work.h.a, com.beizi.fusion.work.a
    public void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.Z.setVideoPlayListener(new KsNativeAd.VideoPlayListener() { // from class: com.beizi.fusion.work.h.e.3
            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayComplete() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayError(int i4, int i5) {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayPause() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayReady() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayResume() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayStart() {
            }
        });
        if (this.Z.getInteractionType() == 1) {
            this.Z.setDownloadListener(new KsAppDownloadListener() { // from class: com.beizi.fusion.work.h.e.4
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadFailed() {
                    String actionDescription = e.this.Z.getActionDescription();
                    if (TextUtils.isEmpty(actionDescription)) {
                        return;
                    }
                    ((a) e.this).F.setText(actionDescription);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadFinished() {
                    ((a) e.this).F.setText("立即安装");
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadStarted() {
                    ((a) e.this).F.setText("开始下载");
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onIdle() {
                    String actionDescription = e.this.Z.getActionDescription();
                    if (TextUtils.isEmpty(actionDescription)) {
                        return;
                    }
                    ((a) e.this).F.setText(actionDescription);
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onInstalled() {
                    ((a) e.this).F.setText("立即打开");
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onProgressUpdate(int i4) {
                    ((a) e.this).F.setText(String.format("%s/100", Integer.valueOf(i4)));
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.h.a
    public void b(boolean z4) {
        aY();
    }

    @Override // com.beizi.fusion.work.h.a
    public void a(List<View> list) {
        int i4 = this.Z.getInteractionType() == 1 ? 2 : 1;
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (View view : list) {
                hashMap.put(view, Integer.valueOf(i4));
            }
        }
        this.Z.registerViewForInteraction((Activity) this.N, ((a) this).f7639s, hashMap, new KsNativeAd.AdInteractionListener() { // from class: com.beizi.fusion.work.h.e.7
            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                return false;
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onAdClicked(View view2, KsNativeAd ksNativeAd) {
                e.this.aK();
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onAdShow(KsNativeAd ksNativeAd) {
                e.this.aL();
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        });
    }
}
