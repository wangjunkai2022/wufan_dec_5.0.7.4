package com.kwad.sdk.api.loader;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class a {

    /* renamed from: com.kwad.sdk.api.loader.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0507a {
        int amY;
        String amZ;
        transient File ana;
        long interval;
        String md5;
        String sdkVersion;

        C0507a() {
        }

        public final boolean AI() {
            return this.amY == 1;
        }

        public final boolean AJ() {
            return this.amY == -1;
        }

        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.amY = jSONObject.optInt("dynamicType");
            this.amZ = jSONObject.optString("dynamicUrl");
            this.md5 = jSONObject.optString("md5");
            this.interval = jSONObject.optLong("interval");
            this.sdkVersion = jSONObject.optString("sdkVersion");
        }

        public final String toString() {
            return "Data{dynamicType=" + this.amY + ", dynamicUrl='" + this.amZ + "', md5='" + this.md5 + "', interval=" + this.interval + ", sdkVersion='" + this.sdkVersion + "', downloadFile=" + this.ana + '}';
        }
    }

    /* loaded from: classes5.dex */
    static class b {
        long anb;
        C0507a anc;
        String errorMsg;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean AK() {
            return this.anb == 1 && this.anc != null;
        }

        public final void parseJson(JSONObject jSONObject) {
            this.anb = jSONObject.optLong("result");
            this.errorMsg = jSONObject.optString(MediationConstant.KEY_ERROR_MSG);
            C0507a c0507a = new C0507a();
            this.anc = c0507a;
            c0507a.parseJson(jSONObject.optJSONObject("data"));
        }

        public final String toString() {
            return "UpdateData{result=" + this.anb + ", errorMsg='" + this.errorMsg + "', data=" + this.anc + '}';
        }
    }
}
