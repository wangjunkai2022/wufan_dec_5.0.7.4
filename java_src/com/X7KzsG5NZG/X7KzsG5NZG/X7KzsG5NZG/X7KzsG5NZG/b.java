package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.R;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class b extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private NativeUnifiedADData f1709b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1710c;

    /* renamed from: d  reason: collision with root package name */
    private VideoOption f1711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1712e;

    /* renamed from: f  reason: collision with root package name */
    private NativeADMediaListener f1713f;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.pauseVideo();
            }
        }
    }

    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0033b implements Runnable {
        RunnableC0033b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.destroy();
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.pauseAppDownload();
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.resumeAppDownload();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Callable<MediationConstant.AdIsReadyStatus> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MediationConstant.AdIsReadyStatus call() {
            return b.this.e();
        }
    }

    /* loaded from: classes2.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f1709b.sendWinNotification((int) b.this.getCpm());
        }
    }

    /* loaded from: classes2.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1720b;

        g(int i4) {
            this.f1720b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f1709b.sendLossNotification(0, this.f1720b, null);
        }
    }

    /* loaded from: classes2.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.negativeFeedback();
            }
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1724c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f1725d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f1726e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f1727f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Bridge f1728g;

        i(Activity activity, ViewGroup viewGroup, List list, List list2, List list3, Bridge bridge) {
            this.f1723b = activity;
            this.f1724c = viewGroup;
            this.f1725d = list;
            this.f1726e = list2;
            this.f1727f = list3;
            this.f1728g = bridge;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c(this.f1723b, this.f1724c, this.f1725d, this.f1726e, this.f1727f, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(this.f1728g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements NativeADEventListener {
        j() {
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADClicked() {
            b.this.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADError(AdError adError) {
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADExposed() {
            b.this.notifyOnShowAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADStatusChanged() {
        }
    }

    /* loaded from: classes.dex */
    class k implements NativeADMediaListener {
        k() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoClicked() {
            b.this.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoCompleted() {
            b.this.notifyOnVideoComplete();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoError(AdError adError) {
            if (adError != null) {
                b.this.notifyOnVideoError(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                b.this.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "error is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoInit() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoLoaded(int i4) {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoLoading() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoPause() {
            b.this.notifyOnVideoPause();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoReady() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoResume() {
            b.this.notifyOnVideoResume();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoStart() {
            b.this.notifyOnVideoStart();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoStop() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l implements Callable<String> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return b.this.k();
        }
    }

    /* loaded from: classes2.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f1709b != null) {
                b.this.f1709b.resume();
            }
        }
    }

    public b(NativeUnifiedADData nativeUnifiedADData, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge, VideoOption videoOption, boolean z4) {
        super(mediationAdLoaderImpl, bridge);
        this.f1710c = false;
        this.f1713f = new k();
        this.f1709b = nativeUnifiedADData;
        this.f1711d = videoOption;
        this.f1712e = z4;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
        NativeAdContainer nativeAdContainer;
        Object tag;
        NativeUnifiedADData nativeUnifiedADData;
        if (list3 != null) {
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.addAll(list3);
        }
        List<View> list4 = list2;
        if (isServerBidding() && (nativeUnifiedADData = this.f1709b) != null) {
            nativeUnifiedADData.setBidECPM(nativeUnifiedADData.getECPM());
        }
        if (this.f1709b == null || !(viewGroup instanceof FrameLayout)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        int i4 = 0;
        if (frameLayout.getChildAt(0) instanceof NativeAdContainer) {
            nativeAdContainer = (NativeAdContainer) frameLayout.getChildAt(0);
            while (i4 < nativeAdContainer.getChildCount()) {
                View childAt = nativeAdContainer.getChildAt(i4);
                if (childAt == null || ((tag = childAt.getTag(R.id.tt_mediation_gdt_developer_view_tag_key)) != null && (tag instanceof String) && ((String) tag).equals(MediationConstant.TT_GDT_NATIVE_VIEW_TAG))) {
                    i4++;
                } else {
                    nativeAdContainer.removeView(childAt);
                }
            }
        } else {
            nativeAdContainer = new NativeAdContainer(context);
            nativeAdContainer.setTag(R.id.tt_mediation_gdt_developer_view_root_tag_key, MediationConstant.TT_GDT_NATIVE_ROOT_VIEW_TAG);
            while (frameLayout.getChildCount() > 0) {
                View childAt2 = frameLayout.getChildAt(0);
                childAt2.setTag(R.id.tt_mediation_gdt_developer_view_tag_key, MediationConstant.TT_GDT_NATIVE_VIEW_TAG);
                frameLayout.removeViewInLayout(childAt2);
                nativeAdContainer.addView(childAt2, childAt2.getLayoutParams());
            }
            frameLayout.removeAllViews();
            frameLayout.addView(nativeAdContainer, -1, -1);
        }
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(mediationViewBinder.mediaViewId);
        this.f1709b.bindAdToView(context, nativeAdContainer, null, list, list4);
        VideoOption videoOption = this.f1711d;
        if (videoOption == null) {
            videoOption = new VideoOption.Builder().build();
        }
        if (frameLayout2 != null && getImageMode() == 5) {
            MediaView mediaView = new MediaView(context);
            frameLayout2.removeAllViews();
            frameLayout2.addView(mediaView, -1, -1);
            this.f1709b.bindMediaView(mediaView, videoOption, this.f1713f);
        }
        if (!TextUtils.isEmpty(this.f1709b.getCTAText())) {
            View findViewById = frameLayout.findViewById(mediationViewBinder.callToActionId);
            ArrayList arrayList = new ArrayList();
            arrayList.add(findViewById);
            this.f1709b.bindCTAViews(arrayList);
        }
        this.f1709b.setNativeAdEventListener(new j());
    }

    private void h() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        NativeUnifiedADAppMiitInfo appMiitInfo = this.f1709b.getAppMiitInfo();
        if (appMiitInfo != null) {
            create.add(8056, appMiitInfo.getAppName());
            create.add(8057, appMiitInfo.getAuthorName());
            create.add(8078, appMiitInfo.getPackageSizeBytes());
            create.add(8079, appMiitInfo.getPermissionsUrl());
            create.add(com.join.mgps.socket.entity.b.f54685l, appMiitInfo.getPrivacyAgreement());
            create.add(8081, appMiitInfo.getVersionName());
            try {
                create.add(8551, appMiitInfo.getDescriptionUrl());
            } catch (Throwable unused) {
            }
        }
        create.add(8045, this.f1709b.getTitle());
        create.add(8046, this.f1709b.getDesc());
        create.add(8061, this.f1709b.getCTAText());
        create.add(8048, this.f1709b.getIconUrl());
        create.add(8050, this.f1709b.getImgUrl());
        create.add(8052, this.f1709b.getPictureWidth());
        create.add(8051, this.f1709b.getPictureHeight());
        create.add(8053, this.f1709b.getImgList());
        create.add(8082, this.f1709b.getAppScore());
        create.add(8049, this.f1709b.getTitle());
        create.add(8055, this.f1709b.isAppAd());
        if (isClientBidding()) {
            create.add(8016, Math.max(this.f1709b.getECPM(), 0.0d));
        } else if (isMultiBidding()) {
            create.add(8058, this.f1709b.getECPMLevel());
        }
        if (this.f1709b.getAdPatternType() == 2) {
            create.add(8060, 5);
        } else if (this.f1709b.getAdPatternType() == 4 || this.f1709b.getAdPatternType() == 1) {
            create.add(8060, 3);
        } else if (this.f1709b.getAdPatternType() == 3) {
            create.add(8060, 4);
        }
        if (this.f1709b.isAppAd()) {
            create.add(8059, 4);
        } else {
            create.add(8059, 3);
        }
        create.add(8033, false);
        notifyNativeValue(create.build());
    }

    private String i() {
        return this.f1712e ? j() : k();
    }

    private String j() {
        try {
            return (String) com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.a(new l()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        Object obj;
        try {
            NativeUnifiedADData nativeUnifiedADData = this.f1709b;
            if (nativeUnifiedADData == null || (obj = nativeUnifiedADData.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public MediationConstant.AdIsReadyStatus a() {
        return this.f1712e ? g() : e();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        Runnable hVar;
        if (i4 == 8148) {
            if (!this.f1712e) {
                NativeUnifiedADData nativeUnifiedADData = this.f1709b;
                if (nativeUnifiedADData != null) {
                    nativeUnifiedADData.resume();
                }
                return (T) MediationValueUtil.checkClassType(cls);
            }
            hVar = new m();
        } else if (i4 != 8149) {
            if (i4 == 8109) {
                this.f1710c = true;
                new Handler(Looper.getMainLooper()).post(new RunnableC0033b());
            } else if (i4 == 8120) {
                return (T) Boolean.valueOf(this.f1710c);
            } else {
                if (i4 == 8191) {
                    if (this.f1712e) {
                        hVar = new c();
                    } else {
                        NativeUnifiedADData nativeUnifiedADData2 = this.f1709b;
                        if (nativeUnifiedADData2 != null) {
                            nativeUnifiedADData2.pauseAppDownload();
                        }
                    }
                } else if (i4 == 8192) {
                    if (this.f1712e) {
                        hVar = new d();
                    } else {
                        NativeUnifiedADData nativeUnifiedADData3 = this.f1709b;
                        if (nativeUnifiedADData3 != null) {
                            nativeUnifiedADData3.resumeAppDownload();
                        }
                    }
                } else if (i4 == 8121) {
                    return (T) a();
                } else {
                    try {
                        if (i4 == 8142) {
                            NativeUnifiedADData nativeUnifiedADData4 = this.f1709b;
                            if (nativeUnifiedADData4 != null) {
                                if (this.f1712e) {
                                    com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.c(new f());
                                } else {
                                    nativeUnifiedADData4.sendWinNotification((int) getCpm());
                                }
                            }
                        } else if (i4 == 8144) {
                            Map map = (Map) valueSet.objectValue(8006, Map.class);
                            if (map != null && this.f1709b != null) {
                                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                                if (obj instanceof MediationConstant.BiddingLossReason) {
                                    int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                                    if (this.f1712e) {
                                        com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.c(new g(a5));
                                    } else {
                                        this.f1709b.sendLossNotification(0, a5, null);
                                    }
                                }
                            }
                        } else if (i4 == 8194) {
                            if (this.f1712e) {
                                hVar = new h();
                            } else {
                                NativeUnifiedADData nativeUnifiedADData5 = this.f1709b;
                                if (nativeUnifiedADData5 != null) {
                                    nativeUnifiedADData5.negativeFeedback();
                                }
                            }
                        } else if (i4 == 8159) {
                            Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                            ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(8067, ViewGroup.class);
                            List<View> list = (List) valueSet.objectValue(8068, List.class);
                            List<View> list2 = (List) valueSet.objectValue(8069, List.class);
                            List<View> list3 = (List) valueSet.objectValue(8070, List.class);
                            Bridge bridge = (Bridge) valueSet.objectValue(8071, Bridge.class);
                            if (this.f1712e) {
                                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.e(new i(activity, viewGroup, list, list2, list3, bridge));
                            } else {
                                c(activity, viewGroup, list, list2, list3, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(bridge));
                            }
                        } else if (i4 == 8147) {
                            return (T) i();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        } else if (!this.f1712e) {
            NativeUnifiedADData nativeUnifiedADData6 = this.f1709b;
            if (nativeUnifiedADData6 != null) {
                nativeUnifiedADData6.pauseVideo();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        } else {
            hVar = new a();
        }
        com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.e(hVar);
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public MediationConstant.AdIsReadyStatus e() {
        NativeUnifiedADData nativeUnifiedADData = this.f1709b;
        return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    public MediationConstant.AdIsReadyStatus g() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }
}
