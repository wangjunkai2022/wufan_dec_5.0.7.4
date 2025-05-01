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
public class c extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private NativeUnifiedADData f1734b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1735c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout.LayoutParams f1736d;

    /* renamed from: e  reason: collision with root package name */
    private VideoOption f1737e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1738f;

    /* renamed from: g  reason: collision with root package name */
    private NativeADMediaListener f1739g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Callable<String> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return c.this.p();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.resume();
            }
        }
    }

    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0034c implements Runnable {
        RunnableC0034c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.pauseVideo();
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.destroy();
            }
        }
    }

    /* loaded from: classes2.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.pauseAppDownload();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Callable<Integer> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            return Integer.valueOf(c.this.i());
        }
    }

    /* loaded from: classes2.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.resumeAppDownload();
            }
        }
    }

    /* loaded from: classes2.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f1734b.sendWinNotification((int) c.this.getCpm());
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1748b;

        i(int i4) {
            this.f1748b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f1734b.sendLossNotification(0, this.f1748b, null);
        }
    }

    /* loaded from: classes2.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1734b != null) {
                c.this.f1734b.negativeFeedback();
            }
        }
    }

    /* loaded from: classes2.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f1753d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f1754e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f1755f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Bridge f1756g;

        k(Activity activity, ViewGroup viewGroup, List list, List list2, List list3, Bridge bridge) {
            this.f1751b = activity;
            this.f1752c = viewGroup;
            this.f1753d = list;
            this.f1754e = list2;
            this.f1755f = list3;
            this.f1756g = bridge;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.c(this.f1751b, this.f1752c, this.f1753d, this.f1754e, this.f1755f, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(this.f1756g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l implements Callable<MediationConstant.AdIsReadyStatus> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MediationConstant.AdIsReadyStatus call() {
            return c.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class m implements NativeADEventListener {
        m() {
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADClicked() {
            c.this.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADError(AdError adError) {
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADExposed() {
            c.this.notifyOnShowAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADEventListener
        public void onADStatusChanged() {
        }
    }

    /* loaded from: classes.dex */
    class n implements NativeADMediaListener {
        n() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoClicked() {
            c.this.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoCompleted() {
            c.this.notifyOnVideoComplete();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoError(AdError adError) {
            if (adError != null) {
                c.this.notifyOnVideoError(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                c.this.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "error is null");
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
            c.this.notifyOnVideoPause();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoReady() {
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoResume() {
            c.this.notifyOnVideoResume();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        @JProtect
        public void onVideoStart() {
            c.this.notifyOnVideoStart();
        }

        @Override // com.qq.e.ads.nativ.NativeADMediaListener
        public void onVideoStop() {
        }
    }

    public c(MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge, NativeUnifiedADData nativeUnifiedADData, FrameLayout.LayoutParams layoutParams, VideoOption videoOption, boolean z4) {
        super(mediationAdLoaderImpl, bridge);
        this.f1735c = false;
        this.f1739g = new n();
        this.f1734b = nativeUnifiedADData;
        this.f1736d = layoutParams;
        this.f1737e = videoOption;
        this.f1738f = z4;
        f();
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
        if (isServerBidding() && (nativeUnifiedADData = this.f1734b) != null) {
            nativeUnifiedADData.setBidECPM(nativeUnifiedADData.getECPM());
        }
        if (this.f1734b == null || !(viewGroup instanceof FrameLayout)) {
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
        this.f1734b.bindAdToView(context, nativeAdContainer, this.f1736d, list, list4);
        VideoOption videoOption = this.f1737e;
        if (videoOption == null) {
            videoOption = new VideoOption.Builder().build();
        }
        if (frameLayout2 != null && getImageMode() == 5) {
            MediaView mediaView = new MediaView(context);
            frameLayout2.removeAllViews();
            frameLayout2.addView(mediaView, -1, -1);
            this.f1734b.bindMediaView(mediaView, videoOption, this.f1739g);
        }
        if (!TextUtils.isEmpty(this.f1734b.getCTAText())) {
            View findViewById = frameLayout.findViewById(mediationViewBinder.callToActionId);
            ArrayList arrayList = new ArrayList();
            arrayList.add(findViewById);
            this.f1734b.bindCTAViews(arrayList);
        }
        this.f1734b.setNativeAdEventListener(new m());
    }

    private void f() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        NativeUnifiedADAppMiitInfo appMiitInfo = this.f1734b.getAppMiitInfo();
        if (appMiitInfo != null) {
            create.add(8056, appMiitInfo.getAppName());
            create.add(8057, appMiitInfo.getAuthorName());
            create.add(8078, appMiitInfo.getPackageSizeBytes());
            create.add(8047, (int) appMiitInfo.getPackageSizeBytes());
            create.add(8079, appMiitInfo.getPermissionsUrl());
            create.add(com.join.mgps.socket.entity.b.f54685l, appMiitInfo.getPrivacyAgreement());
            create.add(8081, appMiitInfo.getVersionName());
            try {
                create.add(8551, appMiitInfo.getDescriptionUrl());
            } catch (Throwable unused) {
            }
        }
        create.add(8045, this.f1734b.getTitle());
        create.add(8046, this.f1734b.getDesc());
        create.add(8061, this.f1734b.getCTAText());
        create.add(8048, this.f1734b.getIconUrl());
        create.add(8050, this.f1734b.getImgUrl());
        create.add(8052, this.f1734b.getPictureWidth());
        create.add(8051, this.f1734b.getPictureHeight());
        create.add(8053, this.f1734b.getImgList());
        create.add(8082, this.f1734b.getAppScore());
        create.add(8049, this.f1734b.getTitle());
        create.add(8055, this.f1734b.isAppAd());
        if (isClientBidding()) {
            create.add(8016, Math.max(this.f1734b.getECPM(), 0.0d));
        } else if (isMultiBidding()) {
            create.add(8058, this.f1734b.getECPMLevel());
        }
        if (this.f1734b.getAdPatternType() == 2) {
            create.add(8060, 5);
        } else if (this.f1734b.getAdPatternType() == 4 || this.f1734b.getAdPatternType() == 1) {
            create.add(8060, 3);
        } else if (this.f1734b.getAdPatternType() == 3) {
            create.add(8060, 4);
        }
        if (this.f1734b.isAppAd()) {
            create.add(8059, 4);
        } else {
            create.add(8059, 3);
        }
        create.add(8033, false);
        notifyNativeValue(create.build());
    }

    private int g() {
        return this.f1738f ? k() : i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i() {
        NativeUnifiedADData nativeUnifiedADData = this.f1734b;
        if (nativeUnifiedADData != null) {
            int appStatus = nativeUnifiedADData.getAppStatus();
            if (appStatus == 0) {
                return 0;
            }
            if (appStatus == 1) {
                return 6;
            }
            if (appStatus == 2) {
                return 8;
            }
            if (appStatus == 4) {
                return 2;
            }
            if (appStatus == 8) {
                return 5;
            }
            if (appStatus == 16) {
                return 4;
            }
            if (appStatus == 32) {
                return 3;
            }
            if (appStatus == 64) {
                return 7;
            }
        }
        return 1;
    }

    private int k() {
        try {
            Integer num = (Integer) com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.a(new f()).get(500L, TimeUnit.MILLISECONDS);
            if (num != null) {
                return num.intValue();
            }
            return 1;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediationConstant.AdIsReadyStatus l() {
        NativeUnifiedADData nativeUnifiedADData = this.f1734b;
        return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    private MediationConstant.AdIsReadyStatus m() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.a(new l()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }

    private String n() {
        return this.f1738f ? o() : p();
    }

    private String o() {
        try {
            return (String) com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.a(new a()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        Object obj;
        try {
            NativeUnifiedADData nativeUnifiedADData = this.f1734b;
            if (nativeUnifiedADData == null || (obj = nativeUnifiedADData.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public MediationConstant.AdIsReadyStatus b() {
        return this.f1738f ? m() : l();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        Runnable jVar;
        if (i4 == 8148) {
            if (!this.f1738f) {
                NativeUnifiedADData nativeUnifiedADData = this.f1734b;
                if (nativeUnifiedADData != null) {
                    nativeUnifiedADData.resume();
                }
                return (T) MediationValueUtil.checkClassType(cls);
            }
            jVar = new b();
        } else if (i4 != 8149) {
            if (i4 == 8109) {
                this.f1735c = true;
                new Handler(Looper.getMainLooper()).post(new d());
            } else if (i4 == 8120) {
                return (T) Boolean.valueOf(this.f1735c);
            } else {
                if (i4 == 8191) {
                    if (this.f1738f) {
                        jVar = new e();
                    } else {
                        NativeUnifiedADData nativeUnifiedADData2 = this.f1734b;
                        if (nativeUnifiedADData2 != null) {
                            nativeUnifiedADData2.pauseAppDownload();
                        }
                    }
                } else if (i4 == 8192) {
                    if (this.f1738f) {
                        jVar = new g();
                    } else {
                        NativeUnifiedADData nativeUnifiedADData3 = this.f1734b;
                        if (nativeUnifiedADData3 != null) {
                            nativeUnifiedADData3.resumeAppDownload();
                        }
                    }
                } else if (i4 == 8193) {
                    return (T) Integer.valueOf(g());
                } else {
                    if (i4 == 8121) {
                        return (T) b();
                    }
                    try {
                        if (i4 == 8142) {
                            NativeUnifiedADData nativeUnifiedADData4 = this.f1734b;
                            if (nativeUnifiedADData4 != null) {
                                if (this.f1738f) {
                                    com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.c(new h());
                                } else {
                                    nativeUnifiedADData4.sendWinNotification((int) getCpm());
                                }
                            }
                        } else if (i4 == 8144) {
                            Map map = (Map) valueSet.objectValue(8006, Map.class);
                            if (map != null && this.f1734b != null) {
                                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                                if (obj instanceof MediationConstant.BiddingLossReason) {
                                    int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                                    if (this.f1738f) {
                                        com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.c(new i(a5));
                                    } else {
                                        this.f1734b.sendLossNotification(0, a5, null);
                                    }
                                }
                            }
                        } else if (i4 == 8194) {
                            if (this.f1738f) {
                                jVar = new j();
                            } else {
                                NativeUnifiedADData nativeUnifiedADData5 = this.f1734b;
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
                            if (this.f1738f) {
                                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.e(new k(activity, viewGroup, list, list2, list3, bridge));
                            } else {
                                c(activity, viewGroup, list, list2, list3, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(bridge));
                            }
                        } else if (i4 == 8147) {
                            return (T) n();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        } else if (!this.f1738f) {
            NativeUnifiedADData nativeUnifiedADData6 = this.f1734b;
            if (nativeUnifiedADData6 != null) {
                nativeUnifiedADData6.pauseVideo();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        } else {
            jVar = new RunnableC0034c();
        }
        com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.l.e(jVar);
        return (T) MediationValueUtil.checkClassType(cls);
    }
}
