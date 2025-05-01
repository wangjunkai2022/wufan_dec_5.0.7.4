package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class CSJConfig implements AdConfig {

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f8672b;

    /* renamed from: d  reason: collision with root package name */
    private IMediationConfig f8673d;

    /* renamed from: i  reason: collision with root package name */
    private String f8674i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8675j;
    private TTCustomController jh;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8676k;

    /* renamed from: m  reason: collision with root package name */
    private String f8677m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8678n;

    /* renamed from: o  reason: collision with root package name */
    private String f8679o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8680p;

    /* renamed from: q  reason: collision with root package name */
    private int f8681q;
    private boolean qv;

    /* renamed from: r  reason: collision with root package name */
    private int f8682r;

    /* renamed from: t  reason: collision with root package name */
    private int f8683t;

    /* renamed from: u  reason: collision with root package name */
    private int f8684u;
    private String vv;
    private int[] wv;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class vv {

        /* renamed from: b  reason: collision with root package name */
        private TTCustomController f8685b;

        /* renamed from: i  reason: collision with root package name */
        private String f8687i;

        /* renamed from: j  reason: collision with root package name */
        private IMediationConfig f8688j;
        private int jh;

        /* renamed from: m  reason: collision with root package name */
        private String f8690m;

        /* renamed from: o  reason: collision with root package name */
        private String f8692o;

        /* renamed from: q  reason: collision with root package name */
        private boolean f8694q;
        private String vv;
        private int[] wv;

        /* renamed from: p  reason: collision with root package name */
        private boolean f8693p = false;

        /* renamed from: u  reason: collision with root package name */
        private int f8697u = 0;

        /* renamed from: n  reason: collision with root package name */
        private boolean f8691n = true;
        private boolean qv = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f8689k = false;

        /* renamed from: r  reason: collision with root package name */
        private int f8695r = 2;

        /* renamed from: t  reason: collision with root package name */
        private int f8696t = 0;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f8686d = null;

        public vv i(String str) {
            this.f8692o = str;
            return this;
        }

        public vv m(String str) {
            this.f8690m = str;
            return this;
        }

        public vv o(boolean z4) {
            this.f8694q = z4;
            return this;
        }

        public vv p(String str) {
            this.f8687i = str;
            return this;
        }

        public vv vv(String str) {
            this.vv = str;
            return this;
        }

        public vv i(boolean z4) {
            this.f8689k = z4;
            return this;
        }

        public vv m(boolean z4) {
            this.f8691n = z4;
            return this;
        }

        public vv p(boolean z4) {
            this.qv = z4;
            return this;
        }

        public vv vv(boolean z4) {
            this.f8693p = z4;
            return this;
        }

        public vv i(int i4) {
            this.f8696t = i4;
            return this;
        }

        public vv m(int i4) {
            this.jh = i4;
            return this;
        }

        public vv p(int i4) {
            this.f8695r = i4;
            return this;
        }

        public vv vv(int i4) {
            this.f8697u = i4;
            return this;
        }

        public vv vv(int... iArr) {
            this.wv = iArr;
            return this;
        }

        public vv vv(TTCustomController tTCustomController) {
            this.f8685b = tTCustomController;
            return this;
        }

        public vv vv(IMediationConfig iMediationConfig) {
            this.f8688j = iMediationConfig;
            return this;
        }

        public vv vv(String str, Object obj) {
            if (this.f8686d == null) {
                this.f8686d = new HashMap();
            }
            this.f8686d.put(str, obj);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CSJConfig(vv vvVar) {
        this.f8680p = false;
        this.f8684u = 0;
        this.f8678n = true;
        this.qv = false;
        this.f8676k = false;
        this.vv = vvVar.vv;
        this.f8677m = vvVar.f8690m;
        this.f8680p = vvVar.f8693p;
        this.f8674i = vvVar.f8687i;
        this.f8679o = vvVar.f8692o;
        this.f8684u = vvVar.f8697u;
        this.f8678n = vvVar.f8691n;
        this.qv = vvVar.qv;
        this.wv = vvVar.wv;
        this.f8676k = vvVar.f8689k;
        this.jh = vvVar.f8685b;
        this.f8682r = vvVar.jh;
        this.f8681q = vvVar.f8696t;
        this.f8683t = vvVar.f8695r;
        this.f8675j = vvVar.f8694q;
        this.f8673d = vvVar.f8688j;
        this.f8672b = vvVar.f8686d;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getAgeGroup() {
        return this.f8681q;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppId() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppName() {
        return this.f8677m;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public TTCustomController getCustomController() {
        return this.jh;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getData() {
        return this.f8679o;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int[] getDirectDownloadNetworkType() {
        return this.wv;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public Object getExtra(String str) {
        Map<String, Object> map = this.f8672b;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public Map<String, Object> getInitExtra() {
        return this.f8672b;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getKeywords() {
        return this.f8674i;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public IMediationConfig getMediationConfig() {
        return this.f8673d;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getPluginUpdateConfig() {
        return this.f8683t;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getThemeStatus() {
        return this.f8682r;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getTitleBarTheme() {
        return this.f8684u;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isAllowShowNotify() {
        return this.f8678n;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isDebug() {
        return this.qv;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isPaid() {
        return this.f8680p;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isSupportMultiProcess() {
        return this.f8676k;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isUseMediation() {
        return this.f8675j;
    }

    public void setAgeGroup(int i4) {
        this.f8681q = i4;
    }

    public void setAllowShowNotify(boolean z4) {
        this.f8678n = z4;
    }

    public void setAppId(String str) {
        this.vv = str;
    }

    public void setAppName(String str) {
        this.f8677m = str;
    }

    public void setCustomController(TTCustomController tTCustomController) {
        this.jh = tTCustomController;
    }

    public void setData(String str) {
        this.f8679o = str;
    }

    public void setDebug(boolean z4) {
        this.qv = z4;
    }

    public void setDirectDownloadNetworkType(int... iArr) {
        this.wv = iArr;
    }

    public void setKeywords(String str) {
        this.f8674i = str;
    }

    public void setPaid(boolean z4) {
        this.f8680p = z4;
    }

    public void setSupportMultiProcess(boolean z4) {
        this.f8676k = z4;
    }

    public void setThemeStatus(int i4) {
        this.f8682r = i4;
    }

    public void setTitleBarTheme(int i4) {
        this.f8684u = i4;
    }
}
