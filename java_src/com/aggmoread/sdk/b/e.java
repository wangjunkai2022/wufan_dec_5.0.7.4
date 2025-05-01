package com.aggmoread.sdk.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Handler;
import com.aggmoread.sdk.client.AMAdConfig;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMAdType;
import com.aggmoread.sdk.client.AMChannelIdInfo;
import com.aggmoread.sdk.client.AMCustomController;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.AMRewardAdConfig;
import com.aggmoread.sdk.client.AMVideoConfigs;
import com.aggmoread.sdk.client.IAMAdInteractionListener;
import com.aggmoread.sdk.client.IAMAdLoadListener;
import com.aggmoread.sdk.t;
import com.aggmoread.sdk.z.c.a.a.c.g;
import com.aggmoread.sdk.z.c.a.a.c.t.b;
import com.aggmoread.sdk.z.c.a.a.d.b.h;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.g f1946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.aggmoread.sdk.z.c.a.a.c.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMCustomController f1947a;

        a(e eVar, AMCustomController aMCustomController) {
            this.f1947a = aMCustomController;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean a() {
            try {
                return this.f1947a.canReadInstalledPackages();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy can storage err : " + e5.getMessage());
                return super.a();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean b() {
            try {
                return this.f1947a.canReadLocation();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy can loc err : " + e5.getMessage());
                return super.b();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean c() {
            try {
                return this.f1947a.canUseMacAddress();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy use mac err : " + e5.getMessage());
                return super.c();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean d() {
            try {
                return this.f1947a.canUseNetworkState();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy can net err : " + e5.getMessage());
                return super.d();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean e() {
            return super.e();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean f() {
            try {
                return this.f1947a.canUsePhoneState();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy use state err : " + e5.getMessage());
                return super.f();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public boolean g() {
            try {
                return this.f1947a.canUseStoragePermission();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy can storage err : " + e5.getMessage());
                return super.g();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String h() {
            try {
                return this.f1947a.getAndroidId();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy id err : " + e5.getMessage());
                return super.h();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String i() {
            try {
                return this.f1947a.getIMSI();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy imsi err : " + e5.getMessage());
                return super.i();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String j() {
            try {
                return this.f1947a.getImei();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy imei err : " + e5.getMessage());
                return super.j();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String[] k() {
            return super.k();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public List<PackageInfo> l() {
            try {
                return this.f1947a.getInstalledPackages();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy can storage err : " + e5.getMessage());
                return super.l();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public Location m() {
            try {
                return this.f1947a.getLocation();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy  loc err : " + e5.getMessage());
                return super.m();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String n() {
            try {
                return this.f1947a.getMacAddress();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy get mac err : " + e5.getMessage());
                return super.n();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String o() {
            try {
                String str = t.SDK_TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("getOaid ");
                sb.append(this.f1947a.getDevOaid());
                return this.f1947a.getDevOaid();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy oaid err : " + e5.getMessage());
                return super.o();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.j
        public String p() {
            try {
                return this.f1947a.getSerialNumberInner();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a("privacy serial err : " + e5.getMessage());
                return super.p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f1948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1949c;

        b(List list, Context context) {
            this.f1948b = list;
            this.f1949c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f1948b.size(); i4++) {
                AMChannelIdInfo aMChannelIdInfo = (AMChannelIdInfo) this.f1948b.get(i4);
                String str = aMChannelIdInfo.channelId;
                AMAdType aMAdType = aMChannelIdInfo.adType;
                AMAdLoadSlot aMAdLoadSlot = aMChannelIdInfo.amAdLoadSlot;
                if (aMAdLoadSlot == null) {
                    AMAdLoadSlot.Builder builder = new AMAdLoadSlot.Builder();
                    builder.setSlotId(str);
                    aMAdLoadSlot = builder.build();
                }
                g.a a5 = e.this.a(this.f1949c, aMAdType, aMAdLoadSlot);
                com.aggmoread.sdk.b.d dVar = new com.aggmoread.sdk.b.d(aMAdType);
                dVar.a((IAMAdLoadListener<?>) null);
                a5.a(dVar.a());
                a5.a(true);
                e.this.f1946a.a(a5.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements com.aggmoread.sdk.z.c.a.a.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMRewardAdConfig f1951a;

        c(e eVar, AMRewardAdConfig aMRewardAdConfig) {
            this.f1951a = aMRewardAdConfig;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.b
        public void onReward(Map<String, Object> map) {
            if (this.f1951a.getRewardAdListener() != null) {
                this.f1951a.getRewardAdListener().onReward(map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1952a;

        static {
            int[] iArr = new int[AMAdType.values().length];
            f1952a = iArr;
            try {
                iArr[AMAdType.EXPRESS_INFORMATION_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1952a[AMAdType.INFORMATION_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1952a[AMAdType.SPLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1952a[AMAdType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1952a[AMAdType.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1952a[AMAdType.FULLSCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1952a[AMAdType.BANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1952a[AMAdType.DRAW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public e(Context context) {
        this.f1946a = new com.aggmoread.sdk.z.c.a.a.d.b.g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aggmoread.sdk.z.c.a.a.c.g.a a(android.content.Context r4, com.aggmoread.sdk.client.AMAdType r5, com.aggmoread.sdk.client.AMAdLoadSlot r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto Ld
            com.aggmoread.sdk.z.c.a.a.d.b.g r0 = r3.f1946a
            android.app.Activity r4 = (android.app.Activity) r4
            com.aggmoread.sdk.z.c.a.a.c.g$a r4 = r0.a(r4)
            goto L13
        Ld:
            com.aggmoread.sdk.z.c.a.a.d.b.g r0 = r3.f1946a
            com.aggmoread.sdk.z.c.a.a.c.g$a r4 = r0.a(r4)
        L13:
            com.aggmoread.sdk.z.c.a.a.c.i r0 = r3.a(r5)
            r4.a(r0)
            com.aggmoread.sdk.client.AMAdSize r0 = r6.adSize
            if (r0 == 0) goto L2c
            com.aggmoread.sdk.z.c.a.a.c.h r0 = new com.aggmoread.sdk.z.c.a.a.c.h
            com.aggmoread.sdk.client.AMAdSize r1 = r6.adSize
            int r2 = r1.adWidth
            int r1 = r1.adHeight
            r0.<init>(r2, r1)
            r4.a(r0)
        L2c:
            com.aggmoread.sdk.client.AMAdType r0 = com.aggmoread.sdk.client.AMAdType.EXPRESS_INFORMATION_FLOW
            if (r5 != r0) goto L36
            java.lang.String r5 = "1"
        L32:
            r4.a(r5)
            goto L3d
        L36:
            com.aggmoread.sdk.client.AMAdType r0 = com.aggmoread.sdk.client.AMAdType.INFORMATION_FLOW
            if (r5 != r0) goto L3d
            java.lang.String r5 = "2"
            goto L32
        L3d:
            java.lang.String r5 = r6.bidToken
            r4.c(r5)
            java.lang.String r5 = r6.adSlotId
            r4.b(r5)
            int r5 = r6.adCount
            r4.b(r5)
            android.view.ViewGroup r5 = r6.adContainer
            r4.a(r5)
            com.aggmoread.sdk.client.AMVideoConfigs r5 = r6.videoConfigs
            if (r5 == 0) goto L5c
            com.aggmoread.sdk.z.c.a.a.c.t.b r5 = r3.a(r5)
            r4.a(r5)
        L5c:
            com.aggmoread.sdk.client.AMRewardAdConfig r5 = r6.rewardAdConfig
            if (r5 == 0) goto L67
            com.aggmoread.sdk.z.c.a.a.c.r.c r5 = r3.a(r5)
            r4.a(r5)
        L67:
            int r5 = r6.fetchTimeOut
            r0 = -1
            if (r5 == r0) goto L6f
            r4.a(r5)
        L6f:
            int r5 = r6.refreshTime
            if (r5 == r0) goto L76
            r4.d(r5)
        L76:
            int r5 = r6.limitTime
            if (r5 == r0) goto L7d
            r4.c(r5)
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.b.e.a(android.content.Context, com.aggmoread.sdk.client.AMAdType, com.aggmoread.sdk.client.AMAdLoadSlot):com.aggmoread.sdk.z.c.a.a.c.g$a");
    }

    private com.aggmoread.sdk.z.c.a.a.c.i a(AMAdType aMAdType) {
        switch (d.f1952a[aMAdType.ordinal()]) {
            case 1:
            case 2:
                return com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW;
            case 3:
                return com.aggmoread.sdk.z.c.a.a.c.i.SPLASH;
            case 4:
                return com.aggmoread.sdk.z.c.a.a.c.i.REWARD_VIDEO;
            case 5:
                return com.aggmoread.sdk.z.c.a.a.c.i.INTERSTITIAL;
            case 6:
                return com.aggmoread.sdk.z.c.a.a.c.i.FULL_SCREEN_VIDEO;
            case 7:
                return com.aggmoread.sdk.z.c.a.a.c.i.BANNER;
            case 8:
                return com.aggmoread.sdk.z.c.a.a.c.i.DRAW;
            default:
                return com.aggmoread.sdk.z.c.a.a.c.i.UNKNOWN;
        }
    }

    private com.aggmoread.sdk.z.c.a.a.c.r.c a(AMRewardAdConfig aMRewardAdConfig) {
        com.aggmoread.sdk.z.c.a.a.c.r.c cVar = new com.aggmoread.sdk.z.c.a.a.c.r.c();
        cVar.b(aMRewardAdConfig.getRewardName());
        cVar.a(aMRewardAdConfig.getRewardAmount());
        cVar.c(aMRewardAdConfig.getUserID());
        cVar.a(aMRewardAdConfig.getCustomData());
        cVar.a(new c(this, aMRewardAdConfig));
        return cVar;
    }

    private com.aggmoread.sdk.z.c.a.a.c.t.b a(AMVideoConfigs aMVideoConfigs) {
        b.C0097b c0097b = new b.C0097b();
        c0097b.b(aMVideoConfigs.isDetailPageMuted());
        c0097b.a(aMVideoConfigs.isAutoPlayMuted());
        c0097b.a(aMVideoConfigs.getAutoPlayPolicy());
        c0097b.d(aMVideoConfigs.isEnableUserControl());
        c0097b.e(aMVideoConfigs.isNeedCoverImage());
        c0097b.f(aMVideoConfigs.isNeedProgressBar());
        c0097b.c(aMVideoConfigs.isEnableDetailPage());
        return c0097b.a();
    }

    public void a(Context context, AMAdType aMAdType, AMAdLoadSlot aMAdLoadSlot, IAMAdLoadListener<?> iAMAdLoadListener) {
        if (aMAdLoadSlot == null) {
            if (iAMAdLoadListener != null) {
                iAMAdLoadListener.onAdLoadFail(new AMError(10000, "广告请求配置为空，广告请求失败!"));
                return;
            }
            return;
        }
        g.a a5 = a(context, aMAdType, aMAdLoadSlot);
        com.aggmoread.sdk.b.d dVar = new com.aggmoread.sdk.b.d(aMAdType);
        dVar.a(iAMAdLoadListener);
        a5.a(dVar.a());
        this.f1946a.a(a5.a());
    }

    public void a(Context context, AMAdType aMAdType, AMAdLoadSlot aMAdLoadSlot, IAMAdLoadListener<?> iAMAdLoadListener, IAMAdInteractionListener iAMAdInteractionListener) {
        if (aMAdLoadSlot == null) {
            if (iAMAdLoadListener != null) {
                iAMAdLoadListener.onAdLoadFail(new AMError(10000, "广告请求配置为空，广告请求失败!"));
                return;
            }
            return;
        }
        g.a a5 = a(context, aMAdType, aMAdLoadSlot);
        com.aggmoread.sdk.b.d dVar = new com.aggmoread.sdk.b.d(aMAdType);
        dVar.a(false);
        dVar.a(iAMAdLoadListener);
        dVar.a(iAMAdInteractionListener);
        a5.a(dVar.a());
        this.f1946a.a(a5.a());
    }

    public void a(Context context, List<AMChannelIdInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.n.b(new b(list, context));
    }

    public void a(Handler.Callback callback, AMAdConfig aMAdConfig) {
        if (this.f1946a != null) {
            h.b bVar = new h.b();
            if (aMAdConfig != null) {
                AMCustomController customController = aMAdConfig.getCustomController();
                if (customController != null) {
                    bVar.a(new a(this, customController));
                }
                this.f1946a.a(callback, bVar.a());
                int isAgreePrivacyRecommend = aMAdConfig.isAgreePrivacyRecommend();
                String str = t.SDK_TAG;
                com.aggmoread.sdk.z.a.d.b(str, "ap = " + isAgreePrivacyRecommend);
                if (isAgreePrivacyRecommend != -1) {
                    com.aggmoread.sdk.z.c.a.a.d.a.d.n.a(isAgreePrivacyRecommend == 1);
                }
                int isAgreeShake = aMAdConfig.isAgreeShake();
                String str2 = t.SDK_TAG;
                com.aggmoread.sdk.z.a.d.b(str2, "as = " + isAgreeShake);
                if (isAgreeShake != -1) {
                    if (isAgreeShake == 0 || isAgreeShake == 1) {
                        com.aggmoread.sdk.z.c.a.a.d.a.d.n.a(String.valueOf(isAgreeShake));
                    } else {
                        com.aggmoread.sdk.z.a.d.b(t.SDK_TAG, "shakable not valid,only 0 Or 1");
                    }
                }
            }
        }
    }

    public void a(AMAdConfig aMAdConfig) {
        a((Handler.Callback) null, aMAdConfig);
    }
}
