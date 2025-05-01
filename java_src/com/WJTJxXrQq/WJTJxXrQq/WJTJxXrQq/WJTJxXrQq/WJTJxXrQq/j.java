package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.adapter.ks.KsNativeLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1660a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ KsNativeLoader f1663d;

        a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
            this.f1661b = context;
            this.f1662c = mediationAdSlotValueSet;
            this.f1663d = ksNativeLoader;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.e(this.f1661b.getApplicationContext(), this.f1662c, this.f1663d);
            m.d(getClass().getName(), this.f1661b.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements KsLoadManager.FeedAdListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KsNativeLoader f1665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1666c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1667d;

        b(KsNativeLoader ksNativeLoader, Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1665b = ksNativeLoader;
            this.f1666c = context;
            this.f1667d = mediationAdSlotValueSet;
        }

        @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
        public void onError(int i4, String str) {
            this.f1665b.notifyAdFailed(i4, str);
        }

        @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
        public void onFeedAdLoad(@Nullable List<KsFeedAd> list) {
            if (list == null || list.isEmpty()) {
                this.f1665b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "返回广告位列表空");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (KsFeedAd ksFeedAd : list) {
                if (ksFeedAd != null) {
                    Bridge gMBridge = this.f1665b.getGMBridge();
                    new e(this.f1666c, ksFeedAd, this.f1667d, gMBridge, this.f1665b, j.this.f1660a);
                    arrayList.add(gMBridge);
                }
            }
            this.f1665b.notifyAdSuccess(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements KsLoadManager.NativeAdListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KsNativeLoader f1669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1670c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1671d;

        c(KsNativeLoader ksNativeLoader, Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1669b = ksNativeLoader;
            this.f1670c = context;
            this.f1671d = mediationAdSlotValueSet;
        }

        @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
        public void onError(int i4, String str) {
            this.f1669b.notifyAdFailed(i4, str);
        }

        @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
        public void onNativeAdLoad(@Nullable List<KsNativeAd> list) {
            if (list == null || list.isEmpty()) {
                this.f1669b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "返回广告位列表空");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (KsNativeAd ksNativeAd : list) {
                Bridge gMBridge = this.f1669b.getGMBridge();
                new d(this.f1670c, ksNativeAd, this.f1671d, gMBridge, this.f1669b, j.this.f1660a);
                arrayList.add(gMBridge);
            }
            this.f1669b.notifyAdSuccess(arrayList);
        }
    }

    private void b(Context context, KsScene ksScene, MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager != null) {
            loadManager.loadConfigFeedAd(ksScene, new b(ksNativeLoader, context, mediationAdSlotValueSet));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
        try {
            long longValue = Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue();
            KsScene build = new KsScene.Builder(longValue).adNum(mediationAdSlotValueSet.getAdCount()).build();
            if (context != null) {
                int c5 = n.c(context);
                if (mediationAdSlotValueSet.getWidth() != 0) {
                    c5 = mediationAdSlotValueSet.getWidth();
                } else if (mediationAdSlotValueSet.getExpressWidth() != 0.0f) {
                    c5 = (int) n.a(context, mediationAdSlotValueSet.getExpressWidth());
                }
                build = new KsScene.Builder(longValue).width(c5).adNum(mediationAdSlotValueSet.getAdCount()).build();
            }
            if (mediationAdSlotValueSet.isExpress()) {
                b(context, build, mediationAdSlotValueSet, ksNativeLoader);
            } else {
                f(context, build, mediationAdSlotValueSet, ksNativeLoader);
            }
        } catch (Exception unused) {
            ksNativeLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }

    private void f(Context context, KsScene ksScene, MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager != null) {
            loadManager.loadNativeAd(ksScene, new c(ksNativeLoader, context, mediationAdSlotValueSet));
        }
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
        boolean g4 = n.g(ksNativeLoader, mediationAdSlotValueSet);
        this.f1660a = g4;
        if (g4) {
            m.c(new a(context, mediationAdSlotValueSet, ksNativeLoader));
        } else {
            e(context.getApplicationContext(), mediationAdSlotValueSet, ksNativeLoader);
        }
    }
}
