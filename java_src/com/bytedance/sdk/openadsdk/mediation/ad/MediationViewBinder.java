package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class MediationViewBinder implements IMediationViewBinder {
    public final int callToActionId;
    public final int decriptionTextId;
    public final Map<String, Integer> extras;
    public final int groupImage1Id;
    public final int groupImage2Id;
    public final int groupImage3Id;
    public final int iconImageId;
    public final int layoutId;
    public final int logoLayoutId;
    public final int mainImageId;
    public final int mediaViewId;
    public final int shakeViewContainerId;
    public final int sourceId;
    public final int titleId;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: b  reason: collision with root package name */
        protected int f8848b;

        /* renamed from: i  reason: collision with root package name */
        protected int f8849i;
        protected int jh;

        /* renamed from: k  reason: collision with root package name */
        protected int f8850k;

        /* renamed from: m  reason: collision with root package name */
        protected int f8851m;

        /* renamed from: n  reason: collision with root package name */
        protected int f8852n;

        /* renamed from: o  reason: collision with root package name */
        protected int f8853o;

        /* renamed from: p  reason: collision with root package name */
        protected int f8854p;
        protected int qv;

        /* renamed from: r  reason: collision with root package name */
        protected int f8855r;

        /* renamed from: t  reason: collision with root package name */
        protected Map<String, Integer> f8856t;

        /* renamed from: u  reason: collision with root package name */
        protected int f8857u;
        protected int vv;
        protected int wv;

        public Builder(int i4) {
            this.f8856t = Collections.emptyMap();
            this.vv = i4;
            this.f8856t = new HashMap();
        }

        public Builder addExtra(String str, int i4) {
            this.f8856t.put(str, Integer.valueOf(i4));
            return this;
        }

        public Builder addExtras(Map<String, Integer> map) {
            this.f8856t = new HashMap(map);
            return this;
        }

        public MediationViewBinder build() {
            return new MediationViewBinder(this);
        }

        public Builder callToActionId(int i4) {
            this.f8849i = i4;
            return this;
        }

        public Builder descriptionTextId(int i4) {
            this.f8854p = i4;
            return this;
        }

        public Builder groupImage1Id(int i4) {
            this.f8850k = i4;
            return this;
        }

        public Builder groupImage2Id(int i4) {
            this.f8848b = i4;
            return this;
        }

        public Builder groupImage3Id(int i4) {
            this.jh = i4;
            return this;
        }

        public Builder iconImageId(int i4) {
            this.f8853o = i4;
            return this;
        }

        public Builder logoLayoutId(int i4) {
            this.wv = i4;
            return this;
        }

        public Builder mainImageId(int i4) {
            this.f8857u = i4;
            return this;
        }

        public Builder mediaViewIdId(int i4) {
            this.f8852n = i4;
            return this;
        }

        public Builder shakeViewContainerId(int i4) {
            this.f8855r = i4;
            return this;
        }

        public Builder sourceId(int i4) {
            this.qv = i4;
            return this;
        }

        public Builder titleId(int i4) {
            this.f8851m = i4;
            return this;
        }
    }

    protected MediationViewBinder(Builder builder) {
        this.layoutId = builder.vv;
        this.titleId = builder.f8851m;
        this.decriptionTextId = builder.f8854p;
        this.callToActionId = builder.f8849i;
        this.iconImageId = builder.f8853o;
        this.mainImageId = builder.f8857u;
        this.mediaViewId = builder.f8852n;
        this.sourceId = builder.qv;
        this.extras = builder.f8856t;
        this.groupImage1Id = builder.f8850k;
        this.groupImage2Id = builder.f8848b;
        this.groupImage3Id = builder.jh;
        this.logoLayoutId = builder.wv;
        this.shakeViewContainerId = builder.f8855r;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getCallToActionId() {
        return this.callToActionId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getDecriptionTextId() {
        return this.decriptionTextId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public Map<String, Integer> getExtras() {
        return this.extras;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage1Id() {
        return this.groupImage1Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage2Id() {
        return this.groupImage2Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getGroupImage3Id() {
        return this.groupImage3Id;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getIconImageId() {
        return this.iconImageId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getLogoLayoutId() {
        return this.logoLayoutId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getMainImageId() {
        return this.mainImageId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getMediaViewId() {
        return this.mediaViewId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getShakeViewContainerId() {
        return this.shakeViewContainerId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getSourceId() {
        return this.sourceId;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder
    public int getTitleId() {
        return this.titleId;
    }
}
