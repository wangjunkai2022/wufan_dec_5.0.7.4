package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.adapter.ks.KsDrawLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final KsDrawLoader f1619a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1620b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1621b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1622c;

        a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1621b = context;
            this.f1622c = mediationAdSlotValueSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.c(this.f1621b.getApplicationContext(), this.f1622c);
            m.d(getClass().getName(), this.f1621b.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private KsLoadManager.DrawAdListener f1624a;

        /* renamed from: b  reason: collision with root package name */
        private KsDrawLoader f1625b;

        /* loaded from: classes2.dex */
        class a implements KsLoadManager.DrawAdListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f1626b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MediationAdSlotValueSet f1627c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f1628d;

            a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet, boolean z4) {
                this.f1626b = context;
                this.f1627c = mediationAdSlotValueSet;
                this.f1628d = z4;
            }

            @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
            public void onDrawAdLoad(@Nullable List<KsDrawAd> list) {
                if (list != null && list.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (KsDrawAd ksDrawAd : list) {
                        if (ksDrawAd != null) {
                            Bridge gMBridge = b.this.f1625b.getGMBridge();
                            new com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.b(this.f1626b, b.this.f1625b, gMBridge, ksDrawAd, this.f1627c, this.f1628d);
                            arrayList.add(gMBridge);
                        }
                    }
                    if (arrayList.size() > 0) {
                        b.this.f1625b.notifyAdSuccess(arrayList);
                        return;
                    }
                } else if (b.this.f1625b == null) {
                    return;
                }
                b.this.f1625b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "请求成功，但无广告可用");
            }

            @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
            public void onError(int i4, String str) {
                if (b.this.f1625b != null) {
                    b.this.f1625b.notifyAdFailed(i4, str);
                }
            }
        }

        public b(Context context, KsDrawLoader ksDrawLoader, MediationAdSlotValueSet mediationAdSlotValueSet, boolean z4) {
            this.f1625b = ksDrawLoader;
            this.f1624a = new a(context, mediationAdSlotValueSet, z4);
        }

        public void b(KsScene ksScene) {
            KsLoadManager loadManager = KsAdSDK.getLoadManager();
            if (loadManager != null) {
                loadManager.loadDrawAd(ksScene, this.f1624a);
                return;
            }
            KsDrawLoader ksDrawLoader = this.f1625b;
            if (ksDrawLoader != null) {
                ksDrawLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "loadManager is null can not load ads");
            }
        }
    }

    public g(KsDrawLoader ksDrawLoader) {
        this.f1619a = ksDrawLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            KsScene.Builder builder = new KsScene.Builder(Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue());
            builder.height(mediationAdSlotValueSet.getHeight());
            builder.width(mediationAdSlotValueSet.getWidth());
            builder.adNum(mediationAdSlotValueSet.getAdCount());
            new b(context, this.f1619a, mediationAdSlotValueSet, this.f1620b).b(builder.build());
        } catch (Exception unused) {
            this.f1619a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位ID不合法");
        }
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean g4 = n.g(this.f1619a, mediationAdSlotValueSet);
        this.f1620b = g4;
        if (g4) {
            m.c(new a(context, mediationAdSlotValueSet));
        } else {
            c(context.getApplicationContext(), mediationAdSlotValueSet);
        }
    }
}
