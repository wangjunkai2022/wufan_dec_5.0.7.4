package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdLoadType;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.join.mgps.Util.w0;
import java.util.Map;
/* compiled from: GroMFullSVideo.java */
/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: m  reason: collision with root package name */
    private TTAdNative f39707m;

    /* renamed from: n  reason: collision with root package name */
    private TTFullScreenVideoAd f39708n;

    /* renamed from: o  reason: collision with root package name */
    private AdSlot f39709o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39710p;

    /* renamed from: q  reason: collision with root package name */
    private b f39711q;

    /* renamed from: r  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f39712r;

    /* compiled from: GroMFullSVideo.java */
    /* loaded from: classes4.dex */
    class a implements TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdClose() {
            d.i(j.this.f39677a, 3);
            j.this.onADClose();
            j jVar = j.this;
            jVar.c(jVar.f39682f);
            j jVar2 = j.this;
            jVar2.a(jVar2.f39682f, jVar2.f39683g, jVar2.f39684h);
            j jVar3 = j.this;
            jVar3.d(jVar3.f39682f, jVar3.f39683g, jVar3.f39684h, jVar3.f39687k);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdShow() {
            j.this.f39710p = false;
            d.i(j.this.f39677a, 1);
            j.this.onADShow();
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
            d.i(j.this.f39677a, 2);
            w0.c(j.this.f39680d, "rewardVideoAd bar click");
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoComplete() {
            d.i(j.this.f39677a, 4);
            j.this.onVideoComplete();
        }
    }

    public j(Context context, String str, String str2) {
        super("GroMore", context, str, str2);
        this.f39710p = false;
    }

    private void x(boolean z4) {
        this.f39709o = new AdSlot.Builder().setCodeId(this.f39679c).setAdCount(1).setImageAcceptedSize(1080, 1920).setAdLoadType(z4 ? TTAdLoadType.LOAD : TTAdLoadType.PRELOAD).setUserID("user123").setMediaExtra("media_extra").build();
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        if (this.f39711q == null) {
            this.f39711q = new b();
        }
        com.join.mgps.ad.adapter.e.d(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.i
            @Override // s1.a
            public final void a() {
                j.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("RewardVideoAd:");
            sb.append(this.f39708n != null);
            sb.append("hasLoaded:");
            sb.append(this.f39710p);
        }
        return this.f39708n != null && this.f39710p;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        try {
            this.f39710p = false;
            if (d.f39676l) {
                StringBuilder sb = new StringBuilder();
                sb.append("load:");
                sb.append(z4);
            }
            x(z4);
            if (this.f39711q == null) {
                this.f39711q = new b();
            }
            this.f39711q.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39707m == null && TTAdSdk.getAdManager() != null) {
                this.f39707m = TTAdSdk.getAdManager().createAdNative(this.f39677a);
            }
            TTAdNative tTAdNative = this.f39707m;
            if (tTAdNative != null) {
                tTAdNative.loadFullScreenVideoAd(this.f39709o, this.f39711q);
                return;
            }
            Map<String, Object> map = this.f39687k;
            if (map != null) {
                d.j(this.f39677a, 5, map);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f39686j = false;
            Map<String, Object> map2 = this.f39687k;
            if (map2 != null) {
                d.j(this.f39677a, 5, map2);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        if (this.f39712r == null) {
            this.f39712r = new a();
        }
        this.f39708n.setFullScreenVideoAdInteractionListener(this.f39712r);
        this.f39708n.showFullScreenVideoAd(activity);
        this.f39708n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GroMFullSVideo.java */
    /* loaded from: classes4.dex */
    public class b implements TTAdNative.FullScreenVideoAdListener, TTAdSdk.InitCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f39714a = false;

        b() {
        }

        public void a(boolean z4) {
            this.f39714a = z4;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            j jVar = j.this;
            Map<String, Object> map = jVar.f39687k;
            if (map != null) {
                d.j(jVar.f39677a, 5, map);
            } else {
                d.i(jVar.f39677a, 5);
            }
            j.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onError(int i4, String str) {
            j.this.f39710p = false;
            j jVar = j.this;
            jVar.f39686j = false;
            Map<String, Object> map = jVar.f39687k;
            if (map != null) {
                d.j(jVar.f39677a, 5, map);
            } else {
                d.i(jVar.f39677a, 5);
            }
            j.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            w0.c(j.this.f39680d, "rewardVideoAd loaded");
            j.this.f39710p = true;
            j jVar = j.this;
            jVar.f39686j = false;
            jVar.f39708n = tTFullScreenVideoAd;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached() {
            w0.c(j.this.f39680d, "rewardVideoAd video cached");
            j.this.f39710p = true;
            j jVar = j.this;
            jVar.f39686j = false;
            jVar.onVideoCached();
            j.this.b(this.f39714a);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            j.this.onInitSuccess();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached(TTFullScreenVideoAd tTFullScreenVideoAd) {
            j.this.f39710p = true;
            j jVar = j.this;
            jVar.f39686j = false;
            jVar.f39708n = tTFullScreenVideoAd;
            j.this.onVideoCached();
        }
    }
}
