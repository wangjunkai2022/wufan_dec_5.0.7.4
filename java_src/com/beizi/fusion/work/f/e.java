package com.beizi.fusion.work.f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.fusion.R;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: KsNativeUnifiedWorker.java */
/* loaded from: classes2.dex */
public class e extends a {

    /* renamed from: v  reason: collision with root package name */
    private KsNativeAd f7570v;

    public e(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        super(context, j4, buyerBean, forwardBean, eVar, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        this.f7570v.setVideoPlayListener(new KsNativeAd.VideoPlayListener() { // from class: com.beizi.fusion.work.f.e.3
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
        if (this.f7570v.getInteractionType() == 1) {
            this.f7570v.setDownloadListener(new KsAppDownloadListener() { // from class: com.beizi.fusion.work.f.e.4
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadFailed() {
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadFinished() {
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onDownloadStarted() {
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onIdle() {
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onInstalled() {
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public void onProgressUpdate(int i4) {
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.f.a
    public void aG() {
        if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.f.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        n.a(((a) this).f7530n, this.f7376h);
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
        sb.append(((a) this).f7531o);
        long j4 = ((a) this).f7531o;
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

    @Override // com.beizi.fusion.work.f.a
    public void aH() {
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).width((int) ((a) this).f7532p).adNum(1).build();
        ((a) this).f7535s = new FrameLayout(((a) this).f7530n);
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadNativeAd(build, new KsLoadManager.NativeAdListener() { // from class: com.beizi.fusion.work.f.e.2
            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsNativeUnifiedAd Callback --> onError: code = ");
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
                e.this.f7570v = list.get(0);
                if (e.this.f7570v == null) {
                    e.this.c(-991);
                    return;
                }
                e eVar = e.this;
                eVar.a(eVar.f7570v.getECPM());
                e.this.aU();
                e.this.aT();
            }
        });
    }

    @Override // com.beizi.fusion.work.f.a
    public String aI() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd != null) {
            if (ksNativeAd.getInteractionType() == 1) {
                if (TextUtils.isEmpty(this.f7570v.getAppName())) {
                    return null;
                }
                return this.f7570v.getAppName();
            } else if (TextUtils.isEmpty(this.f7570v.getProductName())) {
                return null;
            } else {
                return this.f7570v.getProductName();
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aJ() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd == null || TextUtils.isEmpty(ksNativeAd.getAdDescription())) {
            return null;
        }
        return this.f7570v.getAdDescription();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aK() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd == null || TextUtils.isEmpty(ksNativeAd.getAppIconUrl())) {
            return null;
        }
        return this.f7570v.getAppIconUrl();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aL() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd != null) {
            if ((ksNativeAd.getImageList() != null) & (this.f7570v.getImageList().size() > 0)) {
                List<KsImage> imageList = this.f7570v.getImageList();
                String imageUrl = imageList.get(0).getImageUrl();
                if (!TextUtils.isEmpty(imageUrl) && imageList.get(0).isValid()) {
                    return imageUrl;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public List<String> aM() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd != null) {
            if ((ksNativeAd.getImageList() != null) & (this.f7570v.getImageList().size() > 0)) {
                ArrayList arrayList = new ArrayList();
                List<KsImage> imageList = this.f7570v.getImageList();
                for (int i4 = 0; i4 < imageList.size(); i4++) {
                    String imageUrl = imageList.get(i4).getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl) && imageList.get(i4).isValid()) {
                        arrayList.add(imageUrl);
                    }
                }
                if (arrayList.size() > 0) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public int aN() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd != null) {
            int materialType = ksNativeAd.getMaterialType();
            if (materialType == 1) {
                return 2;
            }
            if (materialType == 2 || materialType == 3) {
                return 1;
            }
        }
        return 0;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aO() {
        KsNativeAd ksNativeAd = this.f7570v;
        if (ksNativeAd == null || TextUtils.isEmpty(ksNativeAd.getActionDescription())) {
            return null;
        }
        return this.f7570v.getActionDescription();
    }

    @Override // com.beizi.fusion.work.f.a
    public boolean aP() {
        KsNativeAd ksNativeAd = this.f7570v;
        return ksNativeAd != null && ksNativeAd.getMaterialType() == 1;
    }

    @Override // com.beizi.fusion.work.f.a
    public ViewGroup aQ() {
        return ((a) this).f7535s;
    }

    @Override // com.beizi.fusion.work.f.a
    public View aR() {
        if (aP()) {
            return this.f7570v.getVideoView(((a) this).f7530n, new KsAdVideoPlayConfig.Builder().build());
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public void aS() {
        FrameLayout frameLayout = new FrameLayout(((a) this).f7530n);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setBackgroundDrawable(ContextCompat.getDrawable(((a) this).f7530n, R.drawable.button_count_down_background));
        ImageView imageView = new ImageView(((a) this).f7530n);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(26, 26, 19);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(this.f7570v.getAdSourceLogoUrl(0))) {
            ImageManager.with(((a) this).f7530n).load(this.f7570v.getAdSourceLogoUrl(0)).into(imageView);
        } else {
            imageView.setImageResource(R.drawable.ks_ad_logo_normal_mark);
        }
        frameLayout.addView(imageView);
        if (!TextUtils.isEmpty(this.f7570v.getAdSource())) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(((a) this).f7530n);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 19);
            layoutParams2.setMargins(32, 0, 0, 0);
            appCompatTextView.setLayoutParams(layoutParams2);
            appCompatTextView.setTextColor(ContextCompat.getColorStateList(((a) this).f7530n, R.color.button_text_selector));
            appCompatTextView.setTextSize(2, 12.0f);
            appCompatTextView.setGravity(17);
            appCompatTextView.setText(this.f7570v.getAdSource());
            frameLayout.addView(appCompatTextView);
        }
        ((a) this).f7535s.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 85));
    }

    @Override // com.beizi.fusion.work.f.a, com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        if (this.f7570v == null) {
            return null;
        }
        return this.f7570v.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
    }

    @Override // com.beizi.fusion.work.f.a
    public void a(List<View> list) {
        aS();
        int i4 = this.f7570v.getInteractionType() == 1 ? 2 : 1;
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (View view : list) {
                hashMap.put(view, Integer.valueOf(i4));
            }
        }
        this.f7570v.registerViewForInteraction((Activity) ((a) this).f7530n, ((a) this).f7535s, hashMap, new KsNativeAd.AdInteractionListener() { // from class: com.beizi.fusion.work.f.e.5
            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                return false;
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onAdClicked(View view2, KsNativeAd ksNativeAd) {
                e.this.b();
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onAdShow(KsNativeAd ksNativeAd) {
                e.this.ab();
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
