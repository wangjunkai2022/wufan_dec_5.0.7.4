package com.kwad.sdk.api.loader;

import com.kwad.sdk.api.loader.a;
import com.tencent.cos.common.COSHttpResponseKey;
import java.util.Objects;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class k {
    public static int anM;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {
        private int anN;
        private int anO;
        private String anP;
        private String anQ;
        private long anR;
        private int anS;
        private String anT;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a ah(long j4) {
            this.anR = j4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bX(int i4) {
            this.anN = i4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bY(int i4) {
            this.anO = i4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a bZ(int i4) {
            this.anS = i4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a cm(String str) {
            this.anP = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a cn(String str) {
            this.anQ = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a co(String str) {
            this.anT = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("load_status", Integer.valueOf(this.anN));
                jSONObject.putOpt("update_count", Integer.valueOf(this.anO));
                jSONObject.putOpt("dynamic_version", this.anP);
                jSONObject.putOpt(COSHttpResponseKey.DOWNLOAD_URL, this.anQ);
                jSONObject.putOpt("duration_ms", Long.valueOf(this.anR));
                jSONObject.putOpt("error_code", Integer.valueOf(this.anS));
                jSONObject.putOpt("error_msg", this.anT);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final String toString() {
            return "MonitorInfo{load_status=" + this.anN + ", update_count=" + this.anO + ", dynamic_version='" + this.anP + "', download_url='" + this.anQ + "', duration_ms=" + this.anR + ", error_code=" + this.anS + ", error_msg='" + this.anT + "'}";
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    public static void a(a.C0507a c0507a) {
        anM++;
        a(1, c0507a, 0L, 0, "");
    }

    public static void b(a.C0507a c0507a) {
        a(5, c0507a, 0L, 0, "");
    }

    public static void b(a.C0507a c0507a, long j4) {
        a(6, c0507a, j4, 0, "");
    }

    public static void a(a.C0507a c0507a, long j4) {
        a(2, c0507a, j4, 0, "");
    }

    public static void b(a.C0507a c0507a, int i4, String str) {
        a(7, c0507a, 0L, i4, str);
    }

    public static void a(a.C0507a c0507a, long j4, String str) {
        a(3, c0507a, j4, 0, str);
    }

    public static void a(a.C0507a c0507a, int i4, String str) {
        a(4, c0507a, 0L, i4, str);
    }

    private static void a(int i4, a.C0507a c0507a, long j4, int i5, String str) {
        if (c0507a == null) {
            return;
        }
        try {
            JSONObject json = new a((byte) 0).bX(i4).bY(anM).cm(c0507a.sdkVersion).cn(c0507a.amZ).ah(j4).bZ(i5).co(str).toJson();
            Objects.toString(json);
            com.kwad.sdk.api.c.f("reportDynamicUpdate", json);
        } catch (Throwable unused) {
        }
    }
}
