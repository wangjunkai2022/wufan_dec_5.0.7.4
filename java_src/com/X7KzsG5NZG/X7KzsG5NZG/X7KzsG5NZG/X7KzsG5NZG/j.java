package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.GdtRewardLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.util.AdError;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j extends MediationBaseAdBridge {

    /* renamed from: b  reason: collision with root package name */
    private RewardVideoAD f1885b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1886c;

    /* renamed from: d  reason: collision with root package name */
    private final MediationAdSlotValueSet f1887d;

    /* renamed from: e  reason: collision with root package name */
    private final Bridge f1888e;

    /* renamed from: f  reason: collision with root package name */
    private final GdtRewardLoader f1889f;

    /* renamed from: g  reason: collision with root package name */
    RewardVideoADListener f1890g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1891b;

        a(Context context) {
            this.f1891b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.o(this.f1891b.getApplicationContext());
            l.d(getClass().getName(), this.f1891b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Callable<MediationConstant.AdIsReadyStatus> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MediationConstant.AdIsReadyStatus call() {
            return j.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1894b;

        c(Activity activity) {
            this.f1894b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.n(this.f1894b);
        }
    }

    /* loaded from: classes.dex */
    class d implements RewardVideoADListener {
        d() {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onADClick() {
            if (j.this.f1888e != null) {
                j.this.f1888e.call(8115, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onADClose() {
            if (j.this.f1888e != null) {
                j.this.f1888e.call(8116, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADExpose() {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onADLoad() {
            if (j.this.f1885b == null) {
                j.this.f1889f.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但广告为空");
                return;
            }
            if (j.this.f1889f.isClientBidding()) {
                j jVar = j.this;
                jVar.setCpm(jVar.f1885b.getECPM() != -1 ? j.this.f1885b.getECPM() : 0.0d);
            } else if (j.this.f1889f.isMultiBidding()) {
                j jVar2 = j.this;
                jVar2.setLevelTag(jVar2.f1885b.getECPMLevel());
            } else {
                j.this.f1889f.isServerBidding();
            }
            GdtRewardLoader gdtRewardLoader = j.this.f1889f;
            j jVar3 = j.this;
            gdtRewardLoader.notifyAdSuccess(jVar3, jVar3.f1888e);
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onADShow() {
            if (j.this.f1888e != null) {
                j.this.f1888e.call(8230, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onError(AdError adError) {
            if (adError != null) {
                j.this.f1889f.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                j.this.f1889f.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onReward(Map<String, Object> map) {
            if (j.this.f1888e != null) {
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                create.add(8017, true);
                create.add(8018, j.this.f1887d.getRewardAmount());
                create.add(8019, j.this.f1887d.getRewardName());
                create.add(8020, map);
                j.this.f1888e.call(8231, create.build(), Void.class);
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onVideoCached() {
            j.this.f1889f.notifyAdCache(j.this.f1888e, -1, "");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        @JProtect
        public void onVideoComplete() {
            if (j.this.f1888e != null) {
                j.this.f1888e.call(8118, null, Void.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f1885b.sendWinNotification((int) j.this.getCpm());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1898b;

        f(int i4) {
            this.f1898b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f1885b.sendLossNotification(0, this.f1898b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements Callable<String> {
        g() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return j.this.u();
        }
    }

    public j(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, GdtRewardLoader gdtRewardLoader) {
        super(mediationAdSlotValueSet, bridge);
        this.f1890g = new d();
        this.f1887d = mediationAdSlotValueSet;
        this.f1888e = bridge;
        this.f1889f = gdtRewardLoader;
        this.f1886c = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(gdtRewardLoader, mediationAdSlotValueSet);
    }

    private MediationConstant.AdIsReadyStatus a() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new b()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediationConstant.AdIsReadyStatus h() {
        RewardVideoAD rewardVideoAD = this.f1885b;
        return (rewardVideoAD == null || !rewardVideoAD.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    private void j(Activity activity) {
        l.e(new c(activity));
    }

    private void k(Context context) {
        l.c(new a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Activity activity) {
        if (this.f1885b != null) {
            if (this.f1889f.isServerBidding()) {
                RewardVideoAD rewardVideoAD = this.f1885b;
                rewardVideoAD.setBidECPM(rewardVideoAD.getECPM());
            }
            this.f1885b.showAD(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JProtect
    public void o(Context context) {
        boolean z4 = !this.f1887d.isMuted();
        this.f1885b = !TextUtils.isEmpty(this.f1889f.getAdm()) ? new RewardVideoAD(context, this.f1889f.getAdnId(), this.f1890g, z4, this.f1889f.getAdm()) : new RewardVideoAD(context, this.f1889f.getAdnId(), this.f1890g, z4);
        ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
        String userId = this.f1887d.getUserId();
        if (userId != null) {
            builder.setUserId(userId);
        }
        Map<String, Object> extraObject = this.f1887d.getExtraObject();
        String str = null;
        if (extraObject != null && extraObject.get(MediationConstant.ADN_GDT) != null) {
            str = String.valueOf(extraObject.get(MediationConstant.ADN_GDT));
            builder.setCustomData(str);
        }
        if (userId != null || !TextUtils.isEmpty(str)) {
            this.f1885b.setServerSideVerificationOptions(builder.build());
        }
        this.f1885b.loadAD();
    }

    private boolean p() {
        return true;
    }

    private String r() {
        return this.f1886c ? t() : u();
    }

    private String t() {
        try {
            return (String) l.a(new g()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String u() {
        Object obj;
        try {
            RewardVideoAD rewardVideoAD = this.f1885b;
            if (rewardVideoAD == null || (obj = rewardVideoAD.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @JProtect
    public void c(Activity activity) {
        if (this.f1886c) {
            j(activity);
        } else {
            n(activity);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        boolean p4;
        if (i4 == 8113) {
            Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
            if (activity != null) {
                c(activity);
            }
        } else if (i4 != 8109) {
            if (i4 == 8120) {
                p4 = hasDestroyed();
            } else if (i4 == 8121) {
                return (T) isReadyStatus();
            } else {
                if (i4 == 8211) {
                    p4 = p();
                } else if (i4 == 8142) {
                    MediationApiLog.i("GdtReward", "GdtSplashLoader bidWinNotify");
                    Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                    if (map != null) {
                        g(map);
                    }
                } else if (i4 == 8144) {
                    MediationApiLog.i("GdtReward", "GdtSplashLoader bidLoseNotify");
                    Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                    if (map2 != null) {
                        l(map2);
                    }
                } else if (i4 == 8147) {
                    return (T) r();
                }
            }
            return (T) Boolean.valueOf(p4);
        } else {
            onDestroy();
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public void d(Context context) {
        boolean z4 = this.f1886c;
        Context applicationContext = context.getApplicationContext();
        if (z4) {
            k(applicationContext);
        } else {
            o(applicationContext);
        }
    }

    public void g(Map<String, Object> map) {
        RewardVideoAD rewardVideoAD;
        if (this.f1889f.isClientBidding() && (rewardVideoAD = this.f1885b) != null) {
            try {
                if (this.f1886c) {
                    l.c(new e());
                } else {
                    rewardVideoAD.sendWinNotification((int) getCpm());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public boolean hasDestroyed() {
        return this.f1885b == null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public MediationConstant.AdIsReadyStatus isReadyStatus() {
        return this.f1886c ? a() : h();
    }

    public void l(Map<String, Object> map) {
        if (!this.f1889f.isClientBidding() || this.f1885b == null || map == null) {
            return;
        }
        try {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            if (obj instanceof MediationConstant.BiddingLossReason) {
                int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                if (this.f1886c) {
                    l.c(new f(a5));
                } else {
                    this.f1885b.sendLossNotification(0, a5, null);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public void onDestroy() {
        if (this.f1885b != null) {
            this.f1885b = null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
