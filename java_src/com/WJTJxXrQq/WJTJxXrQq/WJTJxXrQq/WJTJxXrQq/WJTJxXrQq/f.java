package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.ks.KsBannerLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private MediationAdSlotValueSet f1587a;

    /* renamed from: b  reason: collision with root package name */
    private Bridge f1588b;

    /* renamed from: c  reason: collision with root package name */
    private final KsBannerLoader f1589c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1590d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Context> f1591e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1593c;

        a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1592b = context;
            this.f1593c = mediationAdSlotValueSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f(this.f1592b.getApplicationContext(), this.f1593c);
            m.d(getClass().getName(), this.f1592b.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements KsLoadManager.FeedAdListener {
        b() {
        }

        @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
        public void onError(int i4, String str) {
            f.this.f1589c.notifyAdFailed(i4, str);
        }

        @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
        public void onFeedAdLoad(@Nullable List<KsFeedAd> list) {
            if (list == null || list.isEmpty()) {
                f.this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功，list为空");
                return;
            }
            for (KsFeedAd ksFeedAd : list) {
                if (ksFeedAd != null) {
                    f fVar = f.this;
                    new d(ksFeedAd, fVar.f1587a, f.this.f1588b).a();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements KsLoadManager.NativeAdListener {
        c() {
        }

        @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
        public void onError(int i4, String str) {
            f.this.f1589c.notifyAdFailed(i4, str);
        }

        @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
        public void onNativeAdLoad(@Nullable List<KsNativeAd> list) {
            if (list == null || list.isEmpty()) {
                f.this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功，list为空");
                return;
            }
            for (KsNativeAd ksNativeAd : list) {
                if (ksNativeAd != null) {
                    KsBannerLoader ksBannerLoader = f.this.f1589c;
                    f fVar = f.this;
                    ksBannerLoader.notifyAdSuccess(new e(ksNativeAd, fVar.f1587a, f.this.f1588b), f.this.f1588b);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        KsFeedAd f1597b;

        /* loaded from: classes2.dex */
        class a implements KsFeedAd.AdInteractionListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f1599a;

            a(f fVar) {
                this.f1599a = fVar;
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdClicked() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1009, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdShow() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1008, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDislikeClicked() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1014, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.h();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements KsFeedAd.AdRenderListener {
            c() {
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdRenderListener
            public void onAdRenderFailed(int i4, String str) {
                f.this.f1589c.notifyAdFailed(i4, str);
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdRenderListener
            public void onAdRenderSuccess(View view) {
                KsBannerLoader ksBannerLoader = f.this.f1589c;
                d dVar = d.this;
                ksBannerLoader.notifyAdSuccess(dVar, dVar.mGMAd);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.f$d$d  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class CallableC0026d implements Callable<View> {
            CallableC0026d() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public View call() {
                return d.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class e implements Callable<String> {
            e() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return d.this.k();
            }
        }

        public d(KsFeedAd ksFeedAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1597b = ksFeedAd;
            if (f.this.f1589c.isClientBidding()) {
                int ecpm = ksFeedAd.getECPM();
                setCpm(ecpm > 0 ? ecpm : 0.0d);
            }
            this.f1597b.setAdInteractionListener(new a(f.this));
            if (f.this.f1587a != null) {
                KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
                kSAdVideoPlayConfigImpl.setVideoSoundEnable(!f.this.f1587a.isMuted());
                ksFeedAd.setVideoPlayConfig(kSAdVideoPlayConfigImpl);
            }
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8033, true);
            create.add(8059, n.b(this.f1597b.getInteractionType()));
            bridge.call(8140, create.build(), Void.class);
        }

        private void g() {
            m.e(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            try {
                KsFeedAd ksFeedAd = this.f1597b;
                if (ksFeedAd != null) {
                    ksFeedAd.render(new c());
                } else {
                    f.this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "render fail, ksFeedAd is null");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                if (this.f1597b == null) {
                    f.this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "render fail, ksFeedAd is null");
                    return;
                }
                Context context = (Context) f.this.f1591e.get();
                if ((context != null ? this.f1597b.getFeedView(context) : null) != null) {
                    f.this.f1589c.notifyAdSuccess(this, this.mGMAd);
                } else {
                    f.this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "render fail, expressView is null");
                }
            }
        }

        private String i() {
            return f.this.f1590d ? j() : k();
        }

        private String j() {
            try {
                return (String) m.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String k() {
            Object obj;
            try {
                KsFeedAd ksFeedAd = this.f1597b;
                if (ksFeedAd == null || (obj = ksFeedAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public void a() {
            if (f.this.f1590d) {
                g();
            } else {
                h();
            }
        }

        @JProtect
        public View c() {
            return f.this.f1590d ? f() : e();
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 6081) {
                return (T) c();
            }
            if (i4 == 8121) {
                return (T) isReadyStatus();
            }
            if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8147) {
                return (T) i();
            } else {
                if (i4 == 8142) {
                    if (n.i(this.f1597b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsFeedAd ksFeedAd = this.f1597b;
                            if (ksFeedAd != null) {
                                ksFeedAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1597b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1597b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1597b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public View e() {
            Context context;
            if (this.f1597b == null || (context = (Context) f.this.f1591e.get()) == null) {
                return null;
            }
            return this.f1597b.getFeedView(context);
        }

        public View f() {
            try {
                return (View) m.a(new CallableC0026d()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return false;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        KsNativeAd f1605b;

        /* renamed from: c  reason: collision with root package name */
        KsNativeAd.AdInteractionListener f1606c;

        /* renamed from: d  reason: collision with root package name */
        KsNativeAd.VideoPlayListener f1607d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.a();
            }
        }

        /* loaded from: classes.dex */
        class b implements KsNativeAd.AdInteractionListener {
            b() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                return false;
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            @JProtect
            public void onAdClicked(View view, KsNativeAd ksNativeAd) {
                Bridge bridge = e.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1009, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            @JProtect
            public void onAdShow(KsNativeAd ksNativeAd) {
                Bridge bridge = e.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1008, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        }

        /* loaded from: classes.dex */
        class c implements KsNativeAd.VideoPlayListener {
            c() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            @JProtect
            public void onVideoPlayComplete() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            @JProtect
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
            @JProtect
            public void onVideoPlayStart() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class d implements Callable<String> {
            d() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return e.this.h();
            }
        }

        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.f$e$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0027e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f1613b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ViewGroup f1614c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f1615d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f1616e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bridge f1617f;

            RunnableC0027e(Activity activity, ViewGroup viewGroup, List list, List list2, Bridge bridge) {
                this.f1613b = activity;
                this.f1614c = viewGroup;
                this.f1615d = list;
                this.f1616e = list2;
                this.f1617f = bridge;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b(this.f1613b, this.f1614c, this.f1615d, this.f1616e, n.e(this.f1617f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x01f9, code lost:
            if (r8 != null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(com.kwad.sdk.api.KsNativeAd r9, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r10, com.bykv.vk.openvk.api.proto.Bridge r11) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.f.e.<init>(com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.f, com.kwad.sdk.api.KsNativeAd, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet, com.bykv.vk.openvk.api.proto.Bridge):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            KsNativeAd ksNativeAd = this.f1605b;
            if (ksNativeAd != null) {
                ksNativeAd.setVideoPlayListener(null);
                this.f1605b = null;
            }
        }

        private void e() {
            m.e(new a());
        }

        private String f() {
            return f.this.f1590d ? g() : h();
        }

        private String g() {
            try {
                return (String) m.a(new d()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h() {
            Object obj;
            try {
                KsNativeAd ksNativeAd = this.f1605b;
                if (ksNativeAd == null || (obj = ksNativeAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        @JProtect
        public void b(Context context, @NonNull ViewGroup viewGroup, List<View> list, List<View> list2, MediationViewBinder mediationViewBinder) {
            View findViewById;
            if (list != null && list2 != null) {
                list.addAll(list2);
            }
            KsNativeAd ksNativeAd = this.f1605b;
            if (ksNativeAd != null) {
                ksNativeAd.registerViewForInteraction(viewGroup, list, this.f1606c);
            }
            KsNativeAd ksNativeAd2 = this.f1605b;
            boolean z4 = false;
            if (ksNativeAd2 != null && ksNativeAd2.getAdSourceLogoUrl(1) != null && (findViewById = viewGroup.findViewById(mediationViewBinder.logoLayoutId)) != null) {
                findViewById.setVisibility(0);
                if (findViewById instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById;
                    viewGroup2.removeAllViews();
                    ImageView imageView = new ImageView(context);
                    new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.a(imageView).execute(this.f1605b.getAdSourceLogoUrl(1));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    viewGroup2.addView(imageView, -1, -1);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView2 = (ImageView) findViewById;
                    new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.a(imageView2).execute(this.f1605b.getAdSourceLogoUrl(1));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(mediationViewBinder.mediaViewId);
            if (this.f1605b == null || viewGroup3 == null) {
                return;
            }
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
            if (f.this.f1587a != null && !f.this.f1587a.isMuted()) {
                z4 = true;
            }
            kSAdVideoPlayConfigImpl.setVideoSoundEnable(z4);
            View videoView = this.f1605b.getVideoView(context, kSAdVideoPlayConfigImpl);
            if (videoView == null) {
                return;
            }
            f.this.f1589c.removeSelfFromParent(videoView);
            viewGroup3.removeAllViews();
            viewGroup3.addView(videoView, -1, -1);
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 8121) {
                return (T) isReadyStatus();
            }
            if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i4 == 8159) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(8067, ViewGroup.class);
                List<View> list = (List) valueSet.objectValue(8068, List.class);
                List<View> list2 = (List) valueSet.objectValue(8069, List.class);
                List list3 = (List) valueSet.objectValue(8070, List.class);
                Bridge bridge = (Bridge) valueSet.objectValue(8071, Bridge.class);
                if (f.this.f1590d) {
                    m.e(new RunnableC0027e(activity, viewGroup, list, list2, bridge));
                } else {
                    b(activity, viewGroup, list, list2, n.e(bridge));
                }
            } else if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8147) {
                return (T) f();
            } else {
                if (i4 == 8142) {
                    if (n.i(this.f1605b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsNativeAd ksNativeAd = this.f1605b;
                            if (ksNativeAd != null) {
                                ksNativeAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1605b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1605b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1605b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1605b == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (f.this.f1590d) {
                e();
            } else {
                a();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public f(KsBannerLoader ksBannerLoader) {
        this.f1589c = ksBannerLoader;
    }

    @JProtect
    private void d(KsScene ksScene) {
        KsAdSDK.getLoadManager().loadConfigFeedAd(ksScene, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        KsBannerLoader ksBannerLoader;
        String str;
        if (context == null || mediationAdSlotValueSet == null) {
            ksBannerLoader = this.f1589c;
            str = "context is null or adSlotValueSet is null";
        } else {
            this.f1587a = mediationAdSlotValueSet;
            this.f1588b = this.f1589c.getGMBridge();
            try {
                KsScene build = new KsScene.Builder(Long.valueOf(this.f1589c.getAdnId()).longValue()).adNum(1).build();
                if (mediationAdSlotValueSet.getAdSubType() == 4) {
                    int originType = mediationAdSlotValueSet.getOriginType();
                    if (originType == 1) {
                        float expressWidth = mediationAdSlotValueSet.getExpressWidth();
                        if (expressWidth > 0.0f) {
                            build.setWidth((int) n.a(context, expressWidth));
                        }
                        d(build);
                        return;
                    } else if (originType == 2) {
                        g(build);
                        return;
                    } else {
                        ksBannerLoader = this.f1589c;
                        str = "广告类型错误";
                    }
                } else {
                    ksBannerLoader = this.f1589c;
                    str = "ks不支持banner";
                }
            } catch (Exception unused) {
                this.f1589c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "广告位id错误");
                return;
            }
        }
        ksBannerLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, str);
    }

    @JProtect
    private void g(KsScene ksScene) {
        KsAdSDK.getLoadManager().loadNativeAd(ksScene, new c());
    }

    public void b(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        this.f1591e = new WeakReference<>(context);
        boolean g4 = n.g(this.f1589c, mediationAdSlotValueSet);
        this.f1590d = g4;
        if (g4) {
            m.c(new a(context, mediationAdSlotValueSet));
        } else {
            f(context.getApplicationContext(), mediationAdSlotValueSet);
        }
    }
}
