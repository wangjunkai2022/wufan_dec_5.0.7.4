package com.kwad.sdk.collector.a;

import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.core.network.d;
import com.kwad.sdk.h;
import com.kwad.sdk.utils.t;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a extends d {
    private C0509a aoI;

    /* renamed from: com.kwad.sdk.collector.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0509a {
        private List<String> aoJ;

        public C0509a(List<String> list) {
            this.aoJ = list;
        }

        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, "packageName", this.aoJ);
            return jSONObject;
        }
    }

    public a(List<String> list) {
        C0509a c0509a = new C0509a(list);
        this.aoI = c0509a;
        putBody("targetAppInfo", c0509a.toJson());
        putBody("sdkVersion", BuildConfig.VERSION_NAME);
        putBody("sdkVersionCode", BuildConfig.VERSION_CODE);
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final String getUrl() {
        return h.yJ();
    }
}
