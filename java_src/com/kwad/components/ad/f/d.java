package com.kwad.components.ad.f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.ad.f.b;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.widget.a;
import com.kwad.components.core.widget.c;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.core.AbstractKsNativeAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.NativeAdExtraDataImpl;
import com.kwad.sdk.n.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bn;
import com.kwad.sdk.utils.bo;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class d extends AbstractKsNativeAd implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, com.kwad.components.core.internal.api.a {
    private Vibrator eh;
    private AdInfo mAdInfo;
    @NonNull
    private AdTemplate mAdTemplate;
    @Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private bn mTimerHelper;
    private b.c mj;
    private boolean mn;
    @Nullable
    private KsNativeAd.AdInteractionListener mo;
    private f mp;
    private e mq;
    @Nullable
    private KsNativeAd.VideoPlayListener mr;
    private boolean ms = false;
    private com.kwad.components.core.internal.api.c bZ = new com.kwad.components.core.internal.api.c();
    private int mt = 0;
    private int mu = 0;
    private KsNativeAd.VideoPlayListener mv = new KsNativeAd.VideoPlayListener() { // from class: com.kwad.components.ad.f.d.8
        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayComplete() {
            if (d.this.mr != null) {
                d.this.mr.onVideoPlayComplete();
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayError(int i4, int i5) {
            if (d.this.mr != null) {
                d.this.mr.onVideoPlayError(i4, i5);
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayPause() {
            if (d.this.mr != null) {
                try {
                    d.this.mr.onVideoPlayPause();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayReady() {
            if (d.this.mr != null) {
                try {
                    d.this.mr.onVideoPlayReady();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayResume() {
            if (d.this.mr != null) {
                try {
                    d.this.mr.onVideoPlayResume();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayStart() {
            if (d.this.mr != null) {
                d.this.mr.onVideoPlayStart();
            }
        }
    };
    private a mw = new a() { // from class: com.kwad.components.ad.f.d.9
        @Override // com.kwad.components.ad.f.d.a
        public final void es() {
            if (d.this.mo != null) {
                d.this.mo.onAdShow(d.this);
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
            if (d.this.mo != null) {
                try {
                    return d.this.mo.handleDownloadDialog(onClickListener);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void l(View view) {
            if (d.this.mo != null) {
                d.this.mo.onAdClicked(new FrameLayout(l.dD(view.getContext())), d.this);
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void onDownloadTipsDialogDismiss() {
            if (d.this.mo != null) {
                try {
                    d.this.mo.onDownloadTipsDialogDismiss();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void onDownloadTipsDialogShow() {
            if (d.this.mo != null) {
                try {
                    d.this.mo.onDownloadTipsDialogShow();
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        void es();

        boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener);

        void l(View view);

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public d(@NonNull AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        this.mAdInfo = dS;
        if (com.kwad.sdk.core.response.b.a.aE(dS)) {
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            this.mApkDownloadHelper = cVar;
            cVar.setOnShowListener(this);
            this.mApkDownloadHelper.setOnDismissListener(this);
            this.mApkDownloadHelper.a(new c.a() { // from class: com.kwad.components.ad.f.d.1
                @Override // com.kwad.components.core.e.d.c.a
                public final boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                    return d.this.mw.handleDownloadDialog(onClickListener);
                }
            });
        }
        KSImageLoader.preloadImage(com.kwad.sdk.core.response.b.a.O(this.mAdInfo), this.mAdTemplate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Vibrator C(Context context) {
        if (this.eh == null) {
            this.eh = (Vibrator) context.getSystemService("vibrator");
        }
        return this.eh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    /* renamed from: eo */
    public com.kwad.components.core.internal.api.d getVideoCoverImage() {
        AdInfo.AdMaterialInfo.MaterialFeature aU = com.kwad.sdk.core.response.b.a.aU(this.mAdInfo);
        if (TextUtils.isEmpty(aU.coverUrl)) {
            return null;
        }
        return new com.kwad.components.core.internal.api.d(aU.width, aU.height, aU.coverUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ep() {
        try {
            NativeAdExtraDataImpl nativeAdExtraDataImpl = this.mAdTemplate.mAdScene.nativeAdExtraData;
            this.mt = nativeAdExtraDataImpl.showLiveStatus;
            this.mu = nativeAdExtraDataImpl.showLiveStyle;
        } catch (Throwable unused) {
        }
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean ag() {
        return true;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getActionDescription() {
        return com.kwad.sdk.core.response.b.a.aD(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAdDescription() {
        return com.kwad.sdk.core.response.b.a.at(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAdSource() {
        return com.kwad.sdk.core.response.b.a.aC(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAdSourceLogoUrl(int i4) {
        AdInfo adInfo = this.mAdInfo;
        if (adInfo == null) {
            return null;
        }
        if (i4 != 1) {
            return adInfo.adBaseInfo.adMarkIcon;
        }
        return adInfo.adBaseInfo.adGrayMarkIcon;
    }

    @Override // com.kwad.components.core.internal.api.a
    @NonNull
    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAppDownloadCountDes() {
        return com.kwad.sdk.core.response.b.a.ay(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAppIconUrl() {
        return com.kwad.sdk.core.response.b.a.cg(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppName() {
        return com.kwad.sdk.core.response.b.a.au(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAppPackageName() {
        return com.kwad.sdk.core.response.b.a.ax(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final long getAppPackageSize() {
        return com.kwad.sdk.core.response.b.a.bH(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAppPrivacyUrl() {
        return com.kwad.sdk.core.response.b.a.bF(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final float getAppScore() {
        return com.kwad.sdk.core.response.b.a.az(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getAppVersion() {
        return com.kwad.sdk.core.response.b.a.bG(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getCorporationName() {
        return com.kwad.sdk.core.response.b.a.bA(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getECPM() {
        return com.kwad.sdk.core.response.b.a.aQ(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final List<KsImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate);
        int bd = com.kwad.sdk.core.response.b.a.bd(this.mAdInfo);
        if (bd == 2 || bd == 3) {
            for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : dS.adMaterialInfo.materialFeatureList) {
                if (materialFeature.featureType == 2 && !TextUtils.isEmpty(materialFeature.materialUrl)) {
                    arrayList.add(new com.kwad.components.core.internal.api.d(materialFeature.width, materialFeature.height, materialFeature.materialUrl));
                }
            }
        }
        return arrayList;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aP(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getIntroductionInfo() {
        return com.kwad.sdk.core.response.b.a.bD(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getIntroductionInfoUrl() {
        return com.kwad.sdk.core.response.b.a.bE(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.bd(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.CH()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getPermissionInfo() {
        return com.kwad.sdk.core.response.b.a.bB(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    @Nullable
    public final String getPermissionInfoUrl() {
        return com.kwad.sdk.core.response.b.a.bC(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getProductName() {
        return com.kwad.sdk.core.response.b.a.aw(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final Bitmap getSdkLogo() {
        return BitmapFactory.decodeResource(ServiceProvider.getContext().getResources(), R.drawable.ksad_sdk_logo);
    }

    public final bn getTimerHelper() {
        if (this.mTimerHelper == null) {
            this.mTimerHelper = new bn();
        }
        return this.mTimerHelper;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoDuration() {
        return com.kwad.sdk.core.response.b.a.L(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoHeight() {
        return com.kwad.sdk.core.response.b.a.cM(this.mAdInfo) ? LogType.UNEXP_ANR : com.kwad.sdk.core.response.b.a.aU(this.mAdInfo).videoHeight;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getVideoUrl() {
        return com.kwad.sdk.core.response.b.a.K(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final View getVideoView2(Context context, boolean z4) {
        if (context == null || !com.kwad.sdk.l.zJ().yY()) {
            return null;
        }
        return getVideoView2(context, new KsAdVideoPlayConfig.Builder().videoSoundEnable(z4).build());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoWidth() {
        if (com.kwad.sdk.core.response.b.a.cM(this.mAdInfo)) {
            return 720;
        }
        return com.kwad.sdk.core.response.b.a.aU(this.mAdInfo).videoWidth;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.mw.onDownloadTipsDialogDismiss();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        a aVar = this.mw;
        if (aVar != null) {
            aVar.onDownloadTipsDialogShow();
        }
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, KsNativeAd.AdInteractionListener adInteractionListener) {
        registerViewForInteraction((Activity) null, viewGroup, list, adInteractionListener);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdExposureFailed(int i4, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.adlog.c.a(this.mAdTemplate, i4, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayEnd() {
        com.kwad.sdk.core.adlog.c.bN(getAdTemplate());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayStart() {
        com.kwad.sdk.core.adlog.c.bM(getAdTemplate());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(int i4) {
        setBidEcpm(i4, -1L);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setDownloadListener(KsAppDownloadListener ksAppDownloadListener) {
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar == null || ksAppDownloadListener == null) {
            return;
        }
        cVar.b(ksAppDownloadListener);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setVideoPlayListener(KsNativeAd.VideoPlayListener videoPlayListener) {
        this.mr = videoPlayListener;
    }

    static /* synthetic */ boolean b(d dVar, ac.a aVar) {
        return c(aVar);
    }

    private static boolean c(ac.a aVar) {
        return (Math.abs(aVar.MD() - aVar.MF()) < 20) && (Math.abs(aVar.ME() - aVar.MG()) < 20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final View view) {
        if (com.kwad.sdk.core.response.b.a.ah(this.mAdInfo)) {
            this.mj = new b.c() { // from class: com.kwad.components.ad.f.d.7
                @Override // com.kwad.components.ad.f.b.c
                public final void f(final double d5) {
                    if (d.this.mAdInfo.status == 3 || d.this.mAdInfo.status == 2) {
                        return;
                    }
                    com.kwad.components.core.e.d.a.a(new a.C0457a(l.wrapContextIfNeed(view.getContext())).ar(d.this.mAdTemplate).b(d.this.mApkDownloadHelper).av(false).a(new a.b() { // from class: com.kwad.components.ad.f.d.7.1
                        @Override // com.kwad.components.core.e.d.a.b
                        public final void onAdClicked() {
                            com.kwad.sdk.core.adlog.c.a(d.this.mAdTemplate, new com.kwad.sdk.core.adlog.c.b().cK(157).l(d5), (JSONObject) null);
                            d.this.mw.l(view);
                        }
                    }));
                    bo.a(view.getContext(), d.this.C(view.getContext()));
                }
            };
            b.em().a(com.kwad.sdk.core.response.b.a.ai(this.mAdInfo), view, this.mj);
        }
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(Activity activity, @NonNull ViewGroup viewGroup, @NonNull List<View> list, KsNativeAd.AdInteractionListener adInteractionListener) {
        this.mo = adInteractionListener;
        a(viewGroup);
        a(activity, viewGroup, list);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(long j4, long j5) {
        AdTemplate adTemplate = this.mAdTemplate;
        adTemplate.mBidEcpm = j4;
        com.kwad.sdk.core.adlog.c.l(adTemplate, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ac.a aVar) {
        return ((Math.abs(aVar.MD() - aVar.MF()) > 20) || (Math.abs(aVar.ME() - aVar.MG()) > 20)) && com.kwad.sdk.core.response.b.d.dH(this.mAdTemplate);
    }

    private static void c(ViewGroup viewGroup) {
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof com.kwad.components.core.widget.a) {
                viewGroup.removeView(childAt);
            }
        }
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(Activity activity, @NonNull ViewGroup viewGroup, @NonNull Map<View, Integer> map, KsNativeAd.AdInteractionListener adInteractionListener) {
        this.mo = adInteractionListener;
        a(viewGroup);
        a(activity, viewGroup, map);
    }

    private static com.kwad.components.core.widget.c b(ViewGroup viewGroup) {
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof com.kwad.components.core.widget.c) {
                return (com.kwad.components.core.widget.c) childAt;
            }
        }
        return null;
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    @Nullable
    public final View getVideoView2(Context context, @Nullable KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl;
        if (context == null || !com.kwad.sdk.l.zJ().yY()) {
            return null;
        }
        try {
            Context wrapContextIfNeed = l.wrapContextIfNeed(context);
            if (ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) {
                kSAdVideoPlayConfigImpl = (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig;
            } else {
                kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
            }
            if (com.kwad.sdk.core.response.b.a.cM(this.mAdInfo)) {
                return a(wrapContextIfNeed, kSAdVideoPlayConfigImpl);
            }
            return b(wrapContextIfNeed, kSAdVideoPlayConfigImpl);
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("getVideoView fail--context:" + context.getClass().getName() + "--classloader:" + context.getClassLoader().getClass().getName());
            if (com.kwad.sdk.l.zJ().yV()) {
                if (Build.VERSION.SDK_INT >= 19) {
                    runtimeException.addSuppressed(th);
                }
                com.kwad.components.core.d.a.reportSdkCaughtException(runtimeException);
                return null;
            }
            throw th;
        }
    }

    private void a(@Nullable Activity activity, @NonNull ViewGroup viewGroup, @NonNull List<View> list) {
        for (View view : list) {
            a(activity, viewGroup, 0, view, false);
        }
    }

    private void a(@Nullable Activity activity, @NonNull ViewGroup viewGroup, @NonNull Map<View, Integer> map) {
        for (View view : map.keySet()) {
            if (map.get(view) != null) {
                a(activity, viewGroup, map.get(view).intValue(), view, true);
            }
        }
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b bVar) {
        this.bZ.b(bVar);
    }

    private View b(Context context, @NonNull KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl) {
        if (TextUtils.isEmpty(getVideoUrl())) {
            com.kwad.sdk.core.e.c.w("KsNativeAdControl", "videoUrl is empty");
            return null;
        }
        if (this.mp == null) {
            f fVar = new f(context);
            this.mp = fVar;
            fVar.setInnerAdInteractionListener(this.mw);
            this.mp.setVideoPlayListener(this.mv);
            this.mp.a(this.mAdTemplate, this.mApkDownloadHelper, kSAdVideoPlayConfigImpl);
        }
        return this.mp;
    }

    private void a(final Activity activity, @NonNull final ViewGroup viewGroup, final int i4, final View view, final boolean z4) {
        final ac.a aVar = new ac.a();
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.ad.f.d.2
            private int[] my = new int[2];

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    aVar.z(viewGroup.getWidth(), viewGroup.getHeight());
                    viewGroup.getLocationOnScreen(this.my);
                    aVar.f(Math.abs(motionEvent.getRawX() - this.my[0]), Math.abs(motionEvent.getRawY() - this.my[1]));
                } else if (action == 1) {
                    aVar.g(Math.abs(motionEvent.getRawX() - this.my[0]), Math.abs(motionEvent.getRawY() - this.my[1]));
                    if (d.this.b(aVar)) {
                        view.setPressed(false);
                        d.this.a(activity, view2, aVar, i4, z4, 153);
                    } else if (com.kwad.sdk.core.config.d.Cf()) {
                        if (d.b(d.this, aVar)) {
                            d.this.a(activity, view2, aVar, i4, z4, 0);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.f.d.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.this.a(activity, view2, aVar, i4, z4, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@androidx.annotation.Nullable android.app.Activity r4, final android.view.View r5, final com.kwad.sdk.utils.ac.a r6, int r7, boolean r8, final int r9) {
        /*
            r3 = this;
            if (r4 != 0) goto L6
            android.content.Context r4 = r5.getContext()
        L6:
            android.content.Context r4 = com.kwad.sdk.n.l.wrapContextIfNeed(r4)
            r0 = 0
            com.kwad.components.ad.f.e r2 = r3.mq
            if (r2 == 0) goto L19
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r2 = r2.eV
            if (r2 == 0) goto L19
            long r0 = r2.getPlayDuration()
            goto L25
        L19:
            com.kwad.components.ad.f.f r2 = r3.mp
            if (r2 == 0) goto L25
            com.kwad.components.ad.f.c.a r2 = r2.mO
            if (r2 == 0) goto L25
            long r0 = r2.getPlayDuration()
        L25:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            r2.<init>(r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.components.core.e.d.a$a r4 = r2.ar(r4)
            com.kwad.components.core.e.d.c r2 = r3.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r4 = r4.b(r2)
            com.kwad.components.core.e.d.a$a r4 = r4.aq(r7)
            r7 = 1
            com.kwad.components.core.e.d.a$a r4 = r4.ao(r7)
            com.kwad.components.core.e.d.a$a r4 = r4.v(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.av(r8)
            com.kwad.components.ad.f.d$4 r7 = new com.kwad.components.ad.f.d$4
            r7.<init>()
            com.kwad.components.core.e.d.a$a r4 = r4.a(r7)
            com.kwad.components.core.e.d.a.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.f.d.a(android.app.Activity, android.view.View, com.kwad.sdk.utils.ac$a, int, boolean, int):void");
    }

    private void a(final ViewGroup viewGroup) {
        if (!this.mn) {
            this.mn = true;
            com.kwad.sdk.commercial.d.c.bz(this.mAdTemplate);
        }
        if (!com.kwad.sdk.core.config.d.CX() && com.kwad.sdk.core.config.d.CW() >= 0.0f) {
            c(viewGroup);
            com.kwad.components.core.widget.a aVar = new com.kwad.components.core.widget.a(viewGroup.getContext(), viewGroup);
            viewGroup.addView(aVar);
            aVar.setViewCallback(new a.InterfaceC0487a() { // from class: com.kwad.components.ad.f.d.5
                @Override // com.kwad.components.core.widget.a.InterfaceC0487a
                public final void ac() {
                    com.kwad.components.ad.i.b.eJ().a(d.this);
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0487a
                public final void ad() {
                    try {
                        long Oc = d.this.getTimerHelper().Oc();
                        if (d.this.mAdTemplate.mPvReported && d.this.ms) {
                            com.kwad.sdk.core.adlog.c.a(d.this.mAdTemplate, Oc, (JSONObject) null);
                            d.this.ms = false;
                        }
                        if (com.kwad.sdk.core.response.b.a.cN(d.this.mAdInfo)) {
                            com.kwad.sdk.core.adlog.c.m(d.this.mAdTemplate, ((int) Oc) / 1000);
                        }
                        d.this.bZ.i(d.this);
                        b.em().a(d.this.mj);
                        com.kwad.components.ad.i.b.eJ().b(d.this);
                    } catch (Throwable th) {
                        ServiceProvider.reportSdkCaughtException(th);
                    }
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0487a
                public final void eq() {
                    try {
                        if (d.this.mAdTemplate.mPvReported && d.this.ms) {
                            com.kwad.sdk.core.adlog.c.a(d.this.mAdTemplate, d.this.getTimerHelper().Oc(), (JSONObject) null);
                            d.this.ms = false;
                            b.em().a(d.this.mj);
                        }
                    } catch (Throwable th) {
                        ServiceProvider.reportSdkCaughtException(th);
                    }
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0487a
                public final void k(View view) {
                    if (!d.this.mAdTemplate.mPvReported) {
                        d.this.mw.es();
                        d.this.ep();
                        com.kwad.sdk.core.adlog.c.b bVar = new com.kwad.sdk.core.adlog.c.b();
                        bVar.v(viewGroup.getHeight(), viewGroup.getWidth());
                        if (com.kwad.sdk.core.response.b.a.cM(d.this.mAdInfo)) {
                            a.C0514a c0514a = new a.C0514a();
                            c0514a.showLiveStyle = d.this.mu;
                            c0514a.showLiveStatus = d.this.mt;
                            bVar.b(c0514a);
                        }
                        com.kwad.components.core.s.b.rC().a(d.this.mAdTemplate, null, bVar);
                    }
                    if (!d.this.ms) {
                        d.this.j(view);
                        d.this.getTimerHelper().startTiming();
                        d.this.bZ.h(d.this);
                    }
                    d.this.ms = true;
                }
            });
            aVar.tM();
            return;
        }
        com.kwad.components.core.widget.c b5 = b(viewGroup);
        if (b5 == null) {
            b5 = new com.kwad.components.core.widget.c(viewGroup.getContext(), viewGroup);
            viewGroup.addView(b5);
        }
        b5.setViewCallback(new c.a() { // from class: com.kwad.components.ad.f.d.6
            @Override // com.kwad.components.core.widget.c.a
            public final void er() {
                if (!d.this.mAdTemplate.mPvReported) {
                    d.this.mw.es();
                }
                d.this.ep();
                com.kwad.sdk.core.adlog.c.b bVar = new com.kwad.sdk.core.adlog.c.b();
                bVar.v(viewGroup.getHeight(), viewGroup.getWidth());
                if (com.kwad.sdk.core.response.b.a.cM(d.this.mAdInfo)) {
                    a.C0514a c0514a = new a.C0514a();
                    c0514a.showLiveStyle = d.this.mu;
                    c0514a.showLiveStatus = d.this.mt;
                    bVar.b(c0514a);
                }
                com.kwad.components.core.s.b.rC().a(d.this.mAdTemplate, null, bVar);
                com.kwad.sdk.commercial.d.c.bA(d.this.mAdTemplate);
            }
        });
        b5.setNeedCheckingShow(true);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b bVar) {
        this.bZ.a(bVar);
    }

    private View a(Context context, @NonNull KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl) {
        com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
        if (aVar == null || !aVar.pj()) {
            return null;
        }
        if (this.mq == null) {
            e eVar = new e(context);
            this.mq = eVar;
            eVar.setInnerAdInteractionListener(this.mw);
            this.mq.setVideoPlayListener(this.mv);
            this.mq.a(context, this.mAdTemplate, this.mApkDownloadHelper, kSAdVideoPlayConfigImpl);
        }
        return this.mq;
    }
}
