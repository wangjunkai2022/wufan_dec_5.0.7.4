package com.join.mgps.ad;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.join.mgps.ad.c;
import com.qq.e.comm.managers.setting.GlobalSetting;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TTInfoStreamVideo.java */
/* loaded from: classes4.dex */
public class v extends c<TTNativeExpressAd> implements TTAdSdk.InitCallback, TTAdNative.NativeExpressAdListener {

    /* renamed from: g  reason: collision with root package name */
    private TTAdNative f39735g;

    /* renamed from: h  reason: collision with root package name */
    private List<TTNativeExpressAd> f39736h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39737i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f39738j;

    /* renamed from: k  reason: collision with root package name */
    private AdSlot f39739k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TTInfoStreamVideo.java */
    /* loaded from: classes4.dex */
    public class a implements TTNativeExpressAd.AdInteractionListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onAdClicked(View view, int i4) {
            c.a<T> aVar = v.this.f39675e;
            if (aVar != 0) {
                aVar.onAdClick();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.AdInteractionListener
        public void onAdDismiss() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onAdShow(View view, int i4) {
            c.a<T> aVar = v.this.f39675e;
            if (aVar != 0) {
                aVar.onAdShow();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onRenderFail(View view, String str, int i4) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
        public void onRenderSuccess(View view, float f5, float f6) {
        }
    }

    public v(Context context, String str, String str2) {
        super(GlobalSetting.TT_SDK_WRAPPER, context, str, str2);
        this.f39736h = new ArrayList();
        this.f39737i = false;
        this.f39738j = false;
    }

    private void f(int i4, int i5, int i6) {
        this.f39739k = new AdSlot.Builder().setCodeId(this.f39673c).setAdCount(i4).setExpressViewAcceptedSize(i5, i6).build();
    }

    @Override // com.join.mgps.ad.c
    public void a() {
        com.join.mgps.ad.adapter.e.d(this.f39671a, this.f39672b, new s1.a() { // from class: com.join.mgps.ad.u
            @Override // s1.a
            public final void a() {
                v.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.c
    public void b(int i4, int i5, int i6) {
        try {
            this.f39737i = false;
            f(i4, i5, i6);
            if (this.f39738j) {
                return;
            }
            this.f39738j = true;
            if (this.f39735g == null && TTAdSdk.getAdManager() != null) {
                this.f39735g = TTAdSdk.getAdManager().createAdNative(this.f39671a);
            }
            TTAdNative tTAdNative = this.f39735g;
            if (tTAdNative != null) {
                tTAdNative.loadNativeExpressAd(this.f39739k, this);
            } else {
                onError(-1, "广告加载错误");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f39738j = false;
            onError(-1, "广告加载错误");
        }
    }

    @Override // com.join.mgps.ad.c
    public void c() {
        List<TTNativeExpressAd> list = this.f39736h;
        if (list != null) {
            for (TTNativeExpressAd tTNativeExpressAd : list) {
                tTNativeExpressAd.destroy();
            }
        }
        this.f39736h = null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
    public void fail(int i4, String str) {
        onError(i4, str);
    }

    @Override // com.join.mgps.ad.o, com.join.mgps.ad.m, com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADLoaded(List<TTNativeExpressAd> list) {
        super.onADLoaded(list);
        this.f39737i = true;
        this.f39738j = false;
        if (this.f39736h == null || list == null) {
            return;
        }
        for (TTNativeExpressAd tTNativeExpressAd : list) {
            tTNativeExpressAd.setExpressInteractionListener((TTNativeExpressAd.AdInteractionListener) new a());
        }
        this.f39736h.addAll(list);
        c.a<T> aVar = this.f39675e;
        if (aVar != 0) {
            aVar.onADLoaded(list);
        }
    }

    @Override // com.join.mgps.ad.o, com.join.mgps.ad.m
    public void onError(int i4, String str) {
        super.onError(i4, str);
        this.f39737i = false;
        this.f39738j = false;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
    public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
        onADLoaded(list);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
    public void success() {
        onInitSuccess();
    }
}
