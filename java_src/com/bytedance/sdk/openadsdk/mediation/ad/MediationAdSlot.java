package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class MediationAdSlot implements IMediationAdSlot {

    /* renamed from: b  reason: collision with root package name */
    private boolean f8815b;

    /* renamed from: i  reason: collision with root package name */
    private int f8816i;

    /* renamed from: j  reason: collision with root package name */
    private MediationSplashRequestInfo f8817j;
    private MediationNativeToBannerListener jh;

    /* renamed from: k  reason: collision with root package name */
    private String f8818k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8819m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8820n;

    /* renamed from: o  reason: collision with root package name */
    private float f8821o;

    /* renamed from: p  reason: collision with root package name */
    private String f8822p;

    /* renamed from: q  reason: collision with root package name */
    private String f8823q;
    private Map<String, Object> qv;

    /* renamed from: r  reason: collision with root package name */
    private float f8824r;

    /* renamed from: t  reason: collision with root package name */
    private float f8825t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f8826u;
    private boolean vv;
    private boolean wv;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: b  reason: collision with root package name */
        private boolean f8827b;

        /* renamed from: i  reason: collision with root package name */
        private float f8828i;

        /* renamed from: j  reason: collision with root package name */
        private MediationSplashRequestInfo f8829j;
        private MediationNativeToBannerListener jh;

        /* renamed from: k  reason: collision with root package name */
        private int f8830k;

        /* renamed from: m  reason: collision with root package name */
        private boolean f8831m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f8832n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f8833o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f8834p;

        /* renamed from: q  reason: collision with root package name */
        private String f8835q;
        private String qv;
        private boolean vv;

        /* renamed from: u  reason: collision with root package name */
        private Map<String, Object> f8838u = new HashMap();
        private String wv = "";

        /* renamed from: r  reason: collision with root package name */
        private float f8836r = 80.0f;

        /* renamed from: t  reason: collision with root package name */
        private float f8837t = 80.0f;

        public MediationAdSlot build() {
            MediationAdSlot mediationAdSlot = new MediationAdSlot();
            mediationAdSlot.vv = this.vv;
            mediationAdSlot.f8819m = this.f8831m;
            mediationAdSlot.f8820n = this.f8834p;
            mediationAdSlot.f8821o = this.f8828i;
            mediationAdSlot.f8826u = this.f8833o;
            mediationAdSlot.qv = this.f8838u;
            mediationAdSlot.wv = this.f8832n;
            mediationAdSlot.f8818k = this.qv;
            mediationAdSlot.f8822p = this.wv;
            mediationAdSlot.f8816i = this.f8830k;
            mediationAdSlot.f8815b = this.f8827b;
            mediationAdSlot.jh = this.jh;
            mediationAdSlot.f8824r = this.f8836r;
            mediationAdSlot.f8825t = this.f8837t;
            mediationAdSlot.f8823q = this.f8835q;
            mediationAdSlot.f8817j = this.f8829j;
            return mediationAdSlot;
        }

        public Builder setAllowShowCloseBtn(boolean z4) {
            this.f8827b = z4;
            return this;
        }

        public Builder setBidNotify(boolean z4) {
            this.f8832n = z4;
            return this;
        }

        public Builder setExtraObject(String str, Object obj) {
            Map<String, Object> map = this.f8838u;
            if (map != null) {
                map.put(str, obj);
            }
            return this;
        }

        public Builder setMediationNativeToBannerListener(MediationNativeToBannerListener mediationNativeToBannerListener) {
            this.jh = mediationNativeToBannerListener;
            return this;
        }

        public Builder setMediationSplashRequestInfo(MediationSplashRequestInfo mediationSplashRequestInfo) {
            this.f8829j = mediationSplashRequestInfo;
            return this;
        }

        public Builder setMuted(boolean z4) {
            this.f8834p = z4;
            return this;
        }

        public Builder setRewardAmount(int i4) {
            this.f8830k = i4;
            return this;
        }

        public Builder setRewardName(String str) {
            this.wv = str;
            return this;
        }

        public Builder setScenarioId(String str) {
            this.qv = str;
            return this;
        }

        public Builder setShakeViewSize(float f5, float f6) {
            this.f8836r = f5;
            this.f8837t = f6;
            return this;
        }

        public Builder setSplashPreLoad(boolean z4) {
            this.f8831m = z4;
            return this;
        }

        public Builder setSplashShakeButton(boolean z4) {
            this.vv = z4;
            return this;
        }

        public Builder setUseSurfaceView(boolean z4) {
            this.f8833o = z4;
            return this;
        }

        public Builder setVolume(float f5) {
            this.f8828i = f5;
            return this;
        }

        public Builder setWxAppId(String str) {
            this.f8835q = str;
            return this;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public Map<String, Object> getExtraObject() {
        return this.qv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public int getRewardAmount() {
        return this.f8816i;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getRewardName() {
        return this.f8822p;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getScenarioId() {
        return this.f8818k;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getShakeViewHeight() {
        return this.f8825t;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getShakeViewWidth() {
        return this.f8824r;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public float getVolume() {
        return this.f8821o;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public String getWxAppId() {
        return this.f8823q;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isAllowShowCloseBtn() {
        return this.f8815b;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isBidNotify() {
        return this.wv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isMuted() {
        return this.f8820n;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isSplashPreLoad() {
        return this.f8819m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isSplashShakeButton() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public boolean isUseSurfaceView() {
        return this.f8826u;
    }

    private MediationAdSlot() {
        this.f8822p = "";
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public MediationNativeToBannerListener getMediationNativeToBannerListener() {
        return this.jh;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
    public MediationSplashRequestInfo getMediationSplashRequestInfo() {
        return this.f8817j;
    }
}
