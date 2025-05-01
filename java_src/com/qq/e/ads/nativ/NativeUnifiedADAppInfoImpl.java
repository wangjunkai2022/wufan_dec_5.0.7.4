package com.qq.e.ads.nativ;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public class NativeUnifiedADAppInfoImpl implements NativeUnifiedADAppMiitInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f59762a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59763b;

    /* renamed from: c  reason: collision with root package name */
    private final long f59764c;

    /* renamed from: d  reason: collision with root package name */
    private final String f59765d;

    /* renamed from: e  reason: collision with root package name */
    private final String f59766e;

    /* renamed from: f  reason: collision with root package name */
    private final String f59767f;

    /* renamed from: g  reason: collision with root package name */
    private final String f59768g;

    /* renamed from: h  reason: collision with root package name */
    private final String f59769h;

    /* renamed from: i  reason: collision with root package name */
    private final String f59770i;

    /* loaded from: classes5.dex */
    private interface Keys {
        public static final String APP_NAME = "app_name";
        public static final String AUTHOR_NAME = "author_name";
        public static final String DESCRIPTION_URL = "description_url";
        public static final String ICP_NUMBER = "icp_number";
        public static final String PACKAGE_SIZE = "package_size";
        public static final String PERMISSION_URL = "permission_url";
        public static final String PRIVACY_AGREEMENT = "privacy_agreement";
        public static final String SUITABLE_AGE = "suitable_age";
        public static final String VERSION_NAME = "version_name";
    }

    public NativeUnifiedADAppInfoImpl(JSONObject jSONObject) {
        this.f59762a = jSONObject.optString("app_name");
        this.f59763b = jSONObject.optString(Keys.AUTHOR_NAME);
        this.f59764c = jSONObject.optLong(Keys.PACKAGE_SIZE);
        this.f59765d = jSONObject.optString(Keys.PERMISSION_URL);
        this.f59766e = jSONObject.optString(Keys.PRIVACY_AGREEMENT);
        this.f59767f = jSONObject.optString(Keys.VERSION_NAME);
        this.f59768g = jSONObject.optString(Keys.DESCRIPTION_URL);
        this.f59769h = jSONObject.optString(Keys.ICP_NUMBER);
        this.f59770i = jSONObject.optString(Keys.SUITABLE_AGE);
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getAppName() {
        return this.f59762a;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getAuthorName() {
        return this.f59763b;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getDescriptionUrl() {
        return this.f59768g;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getIcpNumber() {
        return this.f59769h;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public long getPackageSizeBytes() {
        return this.f59764c;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getPermissionsUrl() {
        return this.f59765d;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getPrivacyAgreement() {
        return this.f59766e;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getSuitableAge() {
        return this.f59770i;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getVersionName() {
        return this.f59767f;
    }
}
