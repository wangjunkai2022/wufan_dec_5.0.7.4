package com.aggmoread.sdk.b;

import com.aggmoread.sdk.client.AMAdType;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.IAMAdInteractionListener;
import com.aggmoread.sdk.client.IAMAdLoadListener;
import com.aggmoread.sdk.client.banner.AMBannerAdListener;
import com.aggmoread.sdk.client.draw.AMDrawAdListener;
import com.aggmoread.sdk.client.feedlist.AMExpressAdListener;
import com.aggmoread.sdk.client.feedlist.AMNativeAdListener;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAd;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAdListener;
import com.aggmoread.sdk.client.interstitial.AMInterstitialAd;
import com.aggmoread.sdk.client.interstitial.AMInterstitialAdInteractionListener;
import com.aggmoread.sdk.client.interstitial.AMInterstitialAdListener;
import com.aggmoread.sdk.client.reward.AMRewardAd;
import com.aggmoread.sdk.client.reward.AMRewardAdListener;
import com.aggmoread.sdk.client.reward.AMRewardInteractionListener;
import com.aggmoread.sdk.client.splash.AMSplashAd;
import com.aggmoread.sdk.client.splash.AMSplashAdListener;
import com.aggmoread.sdk.client.splash.AMSplashInteractionListener;
import com.aggmoread.sdk.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private IAMAdLoadListener<?> f1931a;

    /* renamed from: b  reason: collision with root package name */
    private IAMAdInteractionListener f1932b;

    /* renamed from: c  reason: collision with root package name */
    private AMAdType f1933c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1934d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1935e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements com.aggmoread.sdk.z.c.a.a.c.m.b {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.m.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.m.a> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMBannerAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.m.a aVar : list) {
                    arrayList.add(new com.aggmoread.sdk.b.f(aVar, d.this));
                }
                ((AMBannerAdListener) d.this.f1931a).onAdLoaded(arrayList);
                if (d.this.f1935e || list.size() <= 0) {
                    return;
                }
                list.get(0).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements com.aggmoread.sdk.z.c.a.a.c.p.c {
        b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.c
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.p.b> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMFullScreenAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.p.b bVar : list) {
                    arrayList.add(new com.aggmoread.sdk.b.i(bVar, d.this));
                }
                ((AMFullScreenAdListener) d.this.f1931a).onAdLoaded(arrayList);
                if (d.this.f1935e || arrayList.isEmpty() || !(d.this.f1932b instanceof AMFullScreenAdInteractionListener)) {
                    return;
                }
                ((AMFullScreenAd) arrayList.get(0)).show((AMFullScreenAdInteractionListener) d.this.f1932b);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.p.c
        public void onAdVideoCached() {
            if (d.this.f1931a instanceof AMFullScreenAdListener) {
                ((AMFullScreenAdListener) d.this.f1931a).onAdVideoCached();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements com.aggmoread.sdk.z.c.a.a.c.s.b {
        c() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            String str = t.SDK_TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdError , ");
            sb.append(dVar.a());
            sb.append(", msg ");
            sb.append(dVar.b());
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.s.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.s.a> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMSplashAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.s.a aVar : list) {
                    arrayList.add(new n(d.this, aVar));
                }
                ((AMSplashAdListener) d.this.f1931a).onAdLoaded(arrayList);
                if (d.this.f1935e || arrayList.isEmpty() || !(d.this.f1932b instanceof AMSplashInteractionListener)) {
                    return;
                }
                ((AMSplashAd) arrayList.get(0)).show((AMSplashInteractionListener) d.this.f1932b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.b.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0053d implements com.aggmoread.sdk.z.c.a.a.c.o.f {
        C0053d() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.f
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.o.e> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMNativeAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.o.e eVar : list) {
                    arrayList.add(new k(eVar, d.this));
                }
                ((AMNativeAdListener) d.this.f1931a).onAdLoaded(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements com.aggmoread.sdk.z.c.a.a.c.o.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f1940a;

        e(HashMap hashMap) {
            this.f1940a = hashMap;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.d
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.o.c> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMExpressAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.o.c cVar : list) {
                    com.aggmoread.sdk.b.h hVar = new com.aggmoread.sdk.b.h(cVar, d.this);
                    arrayList.add(hVar);
                    this.f1940a.put(cVar, hVar);
                }
                ((AMExpressAdListener) d.this.f1931a).onAdLoaded(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements com.aggmoread.sdk.z.c.a.a.c.r.b {
        f() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.b
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.r.a> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMRewardAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.r.a aVar : list) {
                    arrayList.add(new m(aVar, d.this));
                }
                ((AMRewardAdListener) d.this.f1931a).onAdLoaded(arrayList);
                if (d.this.f1935e || arrayList.isEmpty() || !(d.this.f1932b instanceof AMRewardInteractionListener)) {
                    return;
                }
                ((AMRewardAd) arrayList.get(0)).show((AMRewardInteractionListener) d.this.f1932b);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.r.b
        public void onAdVideoCached() {
            if (d.this.f1931a instanceof AMRewardAdListener) {
                ((AMRewardAdListener) d.this.f1931a).onAdVideoCached();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements com.aggmoread.sdk.z.c.a.a.c.q.c {
        g() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.c
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.q.b> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMInterstitialAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.q.b bVar : list) {
                    arrayList.add(new j(bVar, d.this));
                }
                ((AMInterstitialAdListener) d.this.f1931a).onAdLoaded(arrayList);
                if (d.this.f1935e || arrayList.isEmpty() || !(d.this.f1932b instanceof AMInterstitialAdInteractionListener)) {
                    return;
                }
                ((AMInterstitialAd) arrayList.get(0)).show((AMInterstitialAdInteractionListener) d.this.f1932b);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.q.c
        public void onAdVideoCached() {
            if (d.this.f1931a instanceof AMInterstitialAdListener) {
                ((AMInterstitialAdListener) d.this.f1931a).onAdVideoCached();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements com.aggmoread.sdk.z.c.a.a.c.n.c {
        h() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            d.this.a(dVar);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.n.c
        public void onAdLoaded(List<com.aggmoread.sdk.z.c.a.a.c.n.a> list) {
            String str = t.SDK_TAG;
            d.this.f1934d = true;
            if (d.this.f1931a instanceof AMDrawAdListener) {
                ArrayList arrayList = new ArrayList();
                for (com.aggmoread.sdk.z.c.a.a.c.n.a aVar : list) {
                    arrayList.add(new com.aggmoread.sdk.b.g(aVar, d.this));
                }
                ((AMDrawAdListener) d.this.f1931a).onAdLoaded(arrayList);
            }
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class i {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1945a;

        static {
            int[] iArr = new int[AMAdType.values().length];
            f1945a = iArr;
            try {
                iArr[AMAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1945a[AMAdType.INFORMATION_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1945a[AMAdType.EXPRESS_INFORMATION_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1945a[AMAdType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1945a[AMAdType.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1945a[AMAdType.FULLSCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1945a[AMAdType.BANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1945a[AMAdType.DRAW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public d(AMAdType aMAdType) {
        this.f1933c = aMAdType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
        if (this.f1934d) {
            IAMAdInteractionListener iAMAdInteractionListener = this.f1932b;
            if (iAMAdInteractionListener != null) {
                iAMAdInteractionListener.onAdError(new AMError(dVar.a(), dVar.b()));
                return;
            }
            return;
        }
        IAMAdLoadListener<?> iAMAdLoadListener = this.f1931a;
        if (iAMAdLoadListener != null) {
            iAMAdLoadListener.onAdLoadFail(new AMError(dVar.a(), dVar.b()));
        }
    }

    private com.aggmoread.sdk.z.c.a.a.c.s.b b() {
        return new c();
    }

    private com.aggmoread.sdk.z.c.a.a.c.o.f c() {
        return new C0053d();
    }

    private com.aggmoread.sdk.z.c.a.a.c.f d() {
        return new a();
    }

    private com.aggmoread.sdk.z.c.a.a.c.n.c e() {
        return new h();
    }

    private com.aggmoread.sdk.z.c.a.a.c.o.d f() {
        return new e(new HashMap());
    }

    private com.aggmoread.sdk.z.c.a.a.c.f g() {
        return new b();
    }

    private com.aggmoread.sdk.z.c.a.a.c.q.c h() {
        return new g();
    }

    private com.aggmoread.sdk.z.c.a.a.c.f i() {
        return new f();
    }

    public com.aggmoread.sdk.z.c.a.a.c.f a() {
        switch (i.f1945a[this.f1933c.ordinal()]) {
            case 1:
                return b();
            case 2:
                return c();
            case 3:
                return f();
            case 4:
                return i();
            case 5:
                return h();
            case 6:
                return g();
            case 7:
                return d();
            case 8:
                return e();
            default:
                return null;
        }
    }

    public void a(IAMAdInteractionListener iAMAdInteractionListener) {
        this.f1932b = iAMAdInteractionListener;
    }

    public void a(IAMAdLoadListener<?> iAMAdLoadListener) {
        this.f1931a = iAMAdLoadListener;
    }

    public void a(boolean z4) {
        this.f1935e = z4;
    }
}
