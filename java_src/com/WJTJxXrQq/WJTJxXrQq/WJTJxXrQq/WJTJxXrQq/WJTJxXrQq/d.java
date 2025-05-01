package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.ks.KsNativeLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsApkDownloadListener;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class d extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private KsNativeAd f1557b;

    /* renamed from: c  reason: collision with root package name */
    private MediationAdSlotValueSet f1558c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1559d;

    /* renamed from: e  reason: collision with root package name */
    KsNativeAd.AdInteractionListener f1560e;

    /* renamed from: f  reason: collision with root package name */
    KsNativeAd.VideoPlayListener f1561f;

    /* renamed from: g  reason: collision with root package name */
    KsApkDownloadListener f1562g;

    /* loaded from: classes.dex */
    class a implements KsNativeAd.AdInteractionListener {
        a() {
        }

        @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
        public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
            return false;
        }

        @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
        @JProtect
        public void onAdClicked(View view, KsNativeAd ksNativeAd) {
            d.this.notifyOnClickAd();
        }

        @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
        @JProtect
        public void onAdShow(KsNativeAd ksNativeAd) {
            d.this.notifyOnShowAd();
        }

        @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
        public void onDownloadTipsDialogDismiss() {
        }

        @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
        public void onDownloadTipsDialogShow() {
        }
    }

    /* loaded from: classes.dex */
    class b implements KsNativeAd.VideoPlayListener {
        b() {
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        @JProtect
        public void onVideoPlayComplete() {
            d.this.notifyOnVideoComplete();
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        @JProtect
        public void onVideoPlayError(int i4, int i5) {
            d dVar = d.this;
            dVar.notifyOnVideoError(i4, "Android MediaPlay Error Code :" + i5);
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
        @JProtect
        public void onVideoPlayStart() {
            d.this.notifyOnVideoStart();
        }
    }

    /* loaded from: classes2.dex */
    class c implements KsApkDownloadListener {
        c() {
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadFailed() {
            d.this.notifyOnDownloadFailed(-1L, -1L, null, null);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadFinished() {
            d.this.notifyOnDownloadFinished(-1L, null, null);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onDownloadStarted() {
            d.this.notifyOnDownloadStarted();
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onIdle() {
            d.this.notifyOnIdel();
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onInstalled() {
            d.this.notifyOnInstalled(null, null);
        }

        @Override // com.kwad.sdk.api.KsApkDownloadListener
        public void onPaused(int i4) {
            d.this.notifyOnDownloadPause(-1L, -1L, null, null);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public void onProgressUpdate(int i4) {
            d.this.notifyOnProgressUpdate(-1L, -1L, i4, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0024d implements Callable<Integer> {
        CallableC0024d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            return Integer.valueOf(d.this.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Callable<Integer> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            return Integer.valueOf(d.this.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Callable<String> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return d.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements IMediationCustomizeVideo {
        g() {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public String getVideoUrl() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoAutoStart() {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoBreak(long j4) {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoContinue(long j4) {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoError(long j4, int i4, int i5) {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoFinish() {
            if (d.this.f1557b != null) {
                d.this.f1557b.reportAdVideoPlayEnd();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoPause(long j4) {
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoStart() {
            if (d.this.f1557b != null) {
                d.this.f1557b.reportAdVideoPlayStart();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
        public void reportVideoStartError(int i4, int i5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Callable<String> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return d.this.r();
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f1573d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f1574e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bridge f1575f;

        i(Activity activity, ViewGroup viewGroup, List list, List list2, Bridge bridge) {
            this.f1571b = activity;
            this.f1572c = viewGroup;
            this.f1573d = list;
            this.f1574e = list2;
            this.f1575f = bridge;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.c(this.f1571b, this.f1572c, this.f1573d, this.f1574e, n.e(this.f1575f));
        }
    }

    public d(Context context, KsNativeAd ksNativeAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, KsNativeLoader ksNativeLoader, boolean z4) {
        super(ksNativeLoader, bridge);
        this.f1560e = new a();
        this.f1561f = new b();
        this.f1562g = new c();
        this.f1557b = ksNativeAd;
        this.f1558c = mediationAdSlotValueSet;
        this.f1559d = z4;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, ViewGroup viewGroup, List<View> list, List<View> list2, MediationViewBinder mediationViewBinder) {
        KsNativeAd ksNativeAd;
        View findViewById;
        if (list != null && list2 != null) {
            list.addAll(list2);
        }
        if (viewGroup instanceof FrameLayout) {
            KsNativeAd ksNativeAd2 = this.f1557b;
            if (ksNativeAd2 != null) {
                ksNativeAd2.registerViewForInteraction(viewGroup, list, this.f1560e);
            }
            KsNativeAd ksNativeAd3 = this.f1557b;
            if (ksNativeAd3 != null && ksNativeAd3.getAdSourceLogoUrl(1) != null && (findViewById = viewGroup.findViewById(mediationViewBinder.logoLayoutId)) != null) {
                findViewById.setVisibility(0);
                if (findViewById instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById;
                    viewGroup2.removeAllViews();
                    ImageView imageView = new ImageView(context);
                    new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.a(imageView).execute(this.f1557b.getAdSourceLogoUrl(1));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    viewGroup2.addView(imageView, -1, -1);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView2 = (ImageView) findViewById;
                    new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.a(imageView2).execute(this.f1557b.getAdSourceLogoUrl(1));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
            }
            if (!isUseCustomVideo() || (ksNativeAd = this.f1557b) == null || TextUtils.isEmpty(ksNativeAd.getVideoUrl())) {
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(mediationViewBinder.mediaViewId);
                if (this.f1557b == null || frameLayout == null) {
                    return;
                }
                KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
                kSAdVideoPlayConfigImpl.setVideoSoundEnable(!this.f1558c.isMuted());
                View videoView = this.f1557b.getVideoView(context, kSAdVideoPlayConfigImpl);
                if (videoView == null) {
                    return;
                }
                removeSelfFromParent(videoView);
                frameLayout.removeAllViews();
                frameLayout.addView(videoView, -1, -1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e0, code lost:
        if (r1 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.d.o():void");
    }

    private String p() {
        return this.f1559d ? q() : r();
    }

    private String q() {
        try {
            return (String) m.a(new h()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String r() {
        Object obj;
        try {
            KsNativeAd ksNativeAd = this.f1557b;
            if (ksNativeAd == null || (obj = ksNativeAd.getMediaExtraInfo().get("llsid")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public int a() {
        KsNativeAd ksNativeAd = this.f1557b;
        if (ksNativeAd != null) {
            return ksNativeAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        KsNativeAd ksNativeAd;
        if (i4 == 8159) {
            Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
            ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(8067, ViewGroup.class);
            List<View> list = (List) valueSet.objectValue(8068, List.class);
            List<View> list2 = (List) valueSet.objectValue(8069, List.class);
            Bridge bridge = (Bridge) valueSet.objectValue(8071, Bridge.class);
            if (this.f1559d) {
                m.e(new i(activity, viewGroup, list, list2, bridge));
            } else {
                c(activity, viewGroup, list, list2, n.e(bridge));
            }
        } else if (i4 == 8161) {
            return (T) Integer.valueOf(g());
        } else {
            if (i4 == 8162) {
                return (T) Integer.valueOf(j());
            }
            if (i4 == 8163) {
                return (T) String.valueOf(m());
            }
            if (i4 == 8164) {
                return (T) n();
            }
            if (i4 == 8320) {
                if (isUseCustomVideo() && (ksNativeAd = this.f1557b) != null) {
                    return (T) new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.c(ksNativeAd);
                }
            } else if (i4 == 8109) {
                KsNativeAd ksNativeAd2 = this.f1557b;
                if (ksNativeAd2 != null) {
                    ksNativeAd2.setVideoPlayListener(null);
                    this.f1557b = null;
                }
            } else if (i4 == 8120) {
                return (T) Boolean.valueOf(this.f1557b == null);
            } else if (i4 == 8147) {
                return (T) p();
            } else {
                if (i4 == 8142) {
                    if (n.i(this.f1557b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsNativeAd ksNativeAd3 = this.f1557b;
                            if (ksNativeAd3 != null) {
                                ksNativeAd3.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1557b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1557b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1557b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public int e() {
        try {
            Integer num = (Integer) m.a(new CallableC0024d()).get(500L, TimeUnit.MILLISECONDS);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public int g() {
        return this.f1559d ? e() : a();
    }

    public int h() {
        KsNativeAd ksNativeAd = this.f1557b;
        if (ksNativeAd != null) {
            return ksNativeAd.getVideoHeight();
        }
        return 0;
    }

    public int i() {
        try {
            Integer num = (Integer) m.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public int j() {
        return this.f1559d ? i() : h();
    }

    public String k() {
        KsNativeAd ksNativeAd;
        return (!isUseCustomVideo() || (ksNativeAd = this.f1557b) == null) ? "" : ksNativeAd.getVideoUrl();
    }

    public String l() {
        try {
            return (String) m.a(new f()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public String m() {
        return this.f1559d ? l() : k();
    }

    public IMediationCustomizeVideo n() {
        if (isUseCustomVideo()) {
            return new g();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
