package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdSlot implements SlotType {

    /* renamed from: b  reason: collision with root package name */
    private String f8636b;

    /* renamed from: d  reason: collision with root package name */
    private int f8637d;
    private String ff;

    /* renamed from: g  reason: collision with root package name */
    private String f8638g;

    /* renamed from: i  reason: collision with root package name */
    private float f8639i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f8640j;
    private int jh;

    /* renamed from: k  reason: collision with root package name */
    private String f8641k;

    /* renamed from: l  reason: collision with root package name */
    private TTAdLoadType f8642l;
    private String la;

    /* renamed from: m  reason: collision with root package name */
    private int f8643m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8644n;
    private IMediationAdSlot ns;

    /* renamed from: o  reason: collision with root package name */
    private float f8645o;

    /* renamed from: p  reason: collision with root package name */
    private int f8646p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f8647q;
    private boolean qv;

    /* renamed from: r  reason: collision with root package name */
    private int f8648r;

    /* renamed from: t  reason: collision with root package name */
    private int f8649t;

    /* renamed from: u  reason: collision with root package name */
    private int f8650u;

    /* renamed from: v  reason: collision with root package name */
    private String f8651v;
    private int vu;
    private String vv;
    private boolean wv;

    /* renamed from: x  reason: collision with root package name */
    private String f8652x;

    /* renamed from: y  reason: collision with root package name */
    private String f8653y;
    private String ya;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: b  reason: collision with root package name */
        private int f8654b;

        /* renamed from: d  reason: collision with root package name */
        private int f8655d;
        private String ff;

        /* renamed from: g  reason: collision with root package name */
        private String f8656g;

        /* renamed from: j  reason: collision with root package name */
        private int[] f8658j;
        private int jh;

        /* renamed from: l  reason: collision with root package name */
        private String f8660l;
        private String la;
        private IMediationAdSlot ns;
        private String qv;

        /* renamed from: r  reason: collision with root package name */
        private float f8666r;

        /* renamed from: t  reason: collision with root package name */
        private float f8667t;

        /* renamed from: v  reason: collision with root package name */
        private String f8669v;
        private int vu;
        private String vv;

        /* renamed from: x  reason: collision with root package name */
        private String f8670x;
        private String ya;

        /* renamed from: m  reason: collision with root package name */
        private int f8661m = 640;

        /* renamed from: p  reason: collision with root package name */
        private int f8664p = 320;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8657i = true;

        /* renamed from: o  reason: collision with root package name */
        private boolean f8663o = false;

        /* renamed from: u  reason: collision with root package name */
        private boolean f8668u = false;

        /* renamed from: n  reason: collision with root package name */
        private int f8662n = 1;
        private String wv = "defaultUser";

        /* renamed from: k  reason: collision with root package name */
        private int f8659k = 2;

        /* renamed from: q  reason: collision with root package name */
        private boolean f8665q = true;

        /* renamed from: y  reason: collision with root package name */
        private TTAdLoadType f8671y = TTAdLoadType.UNKNOWN;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.vv = this.vv;
            adSlot.f8650u = this.f8662n;
            adSlot.f8644n = this.f8657i;
            adSlot.qv = this.f8663o;
            adSlot.wv = this.f8668u;
            adSlot.f8643m = this.f8661m;
            adSlot.f8646p = this.f8664p;
            adSlot.f8639i = this.f8666r;
            adSlot.f8645o = this.f8667t;
            adSlot.f8641k = this.qv;
            adSlot.f8636b = this.wv;
            adSlot.jh = this.f8659k;
            adSlot.f8649t = this.f8654b;
            adSlot.f8647q = this.f8665q;
            adSlot.f8640j = this.f8658j;
            adSlot.f8637d = this.f8655d;
            adSlot.f8638g = this.f8656g;
            adSlot.f8652x = this.f8669v;
            adSlot.f8653y = this.ya;
            adSlot.f8651v = this.f8660l;
            adSlot.f8648r = this.jh;
            adSlot.la = this.la;
            adSlot.ya = this.f8670x;
            adSlot.f8642l = this.f8671y;
            adSlot.ff = this.ff;
            adSlot.vu = this.vu;
            adSlot.ns = this.ns;
            return adSlot;
        }

        public Builder setAdCount(int i4) {
            if (i4 <= 0) {
                i4 = 1;
            }
            if (i4 > 20) {
                i4 = 20;
            }
            this.f8662n = i4;
            return this;
        }

        public Builder setAdId(String str) {
            this.f8669v = str;
            return this;
        }

        public Builder setAdLoadType(TTAdLoadType tTAdLoadType) {
            this.f8671y = tTAdLoadType;
            return this;
        }

        public Builder setAdType(int i4) {
            this.jh = i4;
            return this;
        }

        public Builder setAdloadSeq(int i4) {
            this.f8655d = i4;
            return this;
        }

        public Builder setCodeId(String str) {
            this.vv = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.ya = str;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f5, float f6) {
            this.f8666r = f5;
            this.f8667t = f6;
            return this;
        }

        public Builder setExt(String str) {
            this.f8660l = str;
            return this;
        }

        public Builder setExternalABVid(int... iArr) {
            this.f8658j = iArr;
            return this;
        }

        public Builder setImageAcceptedSize(int i4, int i5) {
            this.f8661m = i4;
            this.f8664p = i5;
            return this;
        }

        public Builder setIsAutoPlay(boolean z4) {
            this.f8665q = z4;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.qv = str;
            return this;
        }

        public Builder setMediationAdSlot(IMediationAdSlot iMediationAdSlot) {
            this.ns = iMediationAdSlot;
            return this;
        }

        @Deprecated
        public Builder setNativeAdType(int i4) {
            this.f8654b = i4;
            return this;
        }

        public Builder setOrientation(int i4) {
            this.f8659k = i4;
            return this;
        }

        public Builder setPrimeRit(String str) {
            this.f8656g = str;
            return this;
        }

        public Builder setRewardAmount(int i4) {
            this.vu = i4;
            return this;
        }

        public Builder setRewardName(String str) {
            this.ff = str;
            return this;
        }

        public Builder setSupportDeepLink(boolean z4) {
            this.f8657i = z4;
            return this;
        }

        public Builder setUserData(String str) {
            this.f8670x = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.wv = str;
            return this;
        }

        public Builder supportIconStyle() {
            this.f8668u = true;
            return this;
        }

        public Builder supportRenderControl() {
            this.f8663o = true;
            return this;
        }

        public Builder withBid(String str) {
            if (str == null) {
                return this;
            }
            this.la = str;
            return this;
        }
    }

    public int getAdCount() {
        return this.f8650u;
    }

    public String getAdId() {
        return this.f8652x;
    }

    public TTAdLoadType getAdLoadType() {
        return this.f8642l;
    }

    public int getAdType() {
        return this.f8648r;
    }

    public int getAdloadSeq() {
        return this.f8637d;
    }

    public String getBidAdm() {
        return this.la;
    }

    public String getCodeId() {
        return this.vv;
    }

    public String getCreativeId() {
        return this.f8653y;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f8645o;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f8639i;
    }

    public String getExt() {
        return this.f8651v;
    }

    public int[] getExternalABVid() {
        return this.f8640j;
    }

    public int getImgAcceptedHeight() {
        return this.f8646p;
    }

    public int getImgAcceptedWidth() {
        return this.f8643m;
    }

    public String getMediaExtra() {
        return this.f8641k;
    }

    public IMediationAdSlot getMediationAdSlot() {
        return this.ns;
    }

    @Deprecated
    public int getNativeAdType() {
        return this.f8649t;
    }

    public int getOrientation() {
        return this.jh;
    }

    public String getPrimeRit() {
        String str = this.f8638g;
        return str == null ? "" : str;
    }

    public int getRewardAmount() {
        return this.vu;
    }

    public String getRewardName() {
        return this.ff;
    }

    public String getUserData() {
        return this.ya;
    }

    public String getUserID() {
        return this.f8636b;
    }

    public boolean isAutoPlay() {
        return this.f8647q;
    }

    public boolean isSupportDeepLink() {
        return this.f8644n;
    }

    public boolean isSupportIconStyle() {
        return this.wv;
    }

    public boolean isSupportRenderConrol() {
        return this.qv;
    }

    public void setAdCount(int i4) {
        this.f8650u = i4;
    }

    public void setAdLoadType(TTAdLoadType tTAdLoadType) {
        this.f8642l = tTAdLoadType;
    }

    public void setExternalABVid(int... iArr) {
        this.f8640j = iArr;
    }

    public void setGroupLoadMore(int i4) {
        this.f8641k = vv(this.f8641k, i4);
    }

    public void setNativeAdType(int i4) {
        this.f8649t = i4;
    }

    public void setUserData(String str) {
        this.ya = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.vv);
            jSONObject.put("mIsAutoPlay", this.f8647q);
            jSONObject.put("mImgAcceptedWidth", this.f8643m);
            jSONObject.put("mImgAcceptedHeight", this.f8646p);
            jSONObject.put("mExpressViewAcceptedWidth", this.f8639i);
            jSONObject.put("mExpressViewAcceptedHeight", this.f8645o);
            jSONObject.put("mAdCount", this.f8650u);
            jSONObject.put("mSupportDeepLink", this.f8644n);
            jSONObject.put("mSupportRenderControl", this.qv);
            jSONObject.put("mSupportIconStyle", this.wv);
            jSONObject.put("mMediaExtra", this.f8641k);
            jSONObject.put("mUserID", this.f8636b);
            jSONObject.put("mOrientation", this.jh);
            jSONObject.put("mNativeAdType", this.f8649t);
            jSONObject.put("mAdloadSeq", this.f8637d);
            jSONObject.put("mPrimeRit", this.f8638g);
            jSONObject.put("mAdId", this.f8652x);
            jSONObject.put("mCreativeId", this.f8653y);
            jSONObject.put("mExt", this.f8651v);
            jSONObject.put("mBidAdm", this.la);
            jSONObject.put("mUserData", this.ya);
            jSONObject.put("mAdLoadType", this.f8642l);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.vv + "', mImgAcceptedWidth=" + this.f8643m + ", mImgAcceptedHeight=" + this.f8646p + ", mExpressViewAcceptedWidth=" + this.f8639i + ", mExpressViewAcceptedHeight=" + this.f8645o + ", mAdCount=" + this.f8650u + ", mSupportDeepLink=" + this.f8644n + ", mSupportRenderControl=" + this.qv + ", mSupportIconStyle=" + this.wv + ", mMediaExtra='" + this.f8641k + "', mUserID='" + this.f8636b + "', mOrientation=" + this.jh + ", mNativeAdType=" + this.f8649t + ", mIsAutoPlay=" + this.f8647q + ", mPrimeRit" + this.f8638g + ", mAdloadSeq" + this.f8637d + ", mAdId" + this.f8652x + ", mCreativeId" + this.f8653y + ", mExt" + this.f8651v + ", mUserData" + this.ya + ", mAdLoadType" + this.f8642l + '}';
    }

    private AdSlot() {
        this.jh = 2;
        this.f8647q = true;
    }

    private String vv(String str, int i4) {
        JSONObject jSONObject;
        if (i4 <= 0) {
            return str;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            jSONObject.put("_tt_group_load_more", i4);
            return jSONObject.toString();
        } catch (JSONException e5) {
            e5.printStackTrace();
            return str;
        }
    }
}
