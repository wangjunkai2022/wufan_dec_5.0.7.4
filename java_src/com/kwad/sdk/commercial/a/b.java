package com.kwad.sdk.commercial.a;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.net.URL;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.commercial.c.a {
    public String apj;
    public String apk;
    public String apl;
    public long apm;
    public long apn;
    public int apo;

    /* renamed from: app  reason: collision with root package name */
    public int f55897app;
    public String downloadId;
    public long downloadTime;
    public int status;
    public String url;

    public static b Bs() {
        return new b();
    }

    public final b aj(long j4) {
        this.downloadTime = j4;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: bc */
    public final b setAdTemplate(AdTemplate adTemplate) {
        super.setAdTemplate(adTemplate);
        AdInfo dS = e.dS(adTemplate);
        this.url = e.dV(adTemplate);
        try {
            this.apj = new URL(this.url).getHost();
        } catch (Throwable unused) {
        }
        this.downloadId = dS.downloadId;
        AdInfo.AdBaseInfo adBaseInfo = dS.adBaseInfo;
        this.apk = adBaseInfo.appPackageName;
        this.apl = adBaseInfo.appName;
        this.apm = dS.totalBytes;
        this.apn = dS.soFarBytes;
        return this;
    }

    public final b cc(int i4) {
        this.status = i4;
        return this;
    }

    public final b cd(int i4) {
        this.apo = i4;
        return this;
    }

    public final b ce(int i4) {
        this.f55897app = i4;
        return this;
    }
}
