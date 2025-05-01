package com.cmic.sso.sdk.c.b;

import com.join.mgps.dto.Constant;
import com.qq.e.comm.pi.ACTD;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LogReportParameter.java */
/* loaded from: classes2.dex */
public class f extends g {

    /* renamed from: a  reason: collision with root package name */
    private b f9255a;

    /* renamed from: b  reason: collision with root package name */
    private a f9256b;

    /* compiled from: LogReportParameter.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f9257a;

        public JSONObject a() {
            return this.f9257a;
        }

        public void a(JSONObject jSONObject) {
            this.f9257a = jSONObject;
        }
    }

    /* compiled from: LogReportParameter.java */
    /* loaded from: classes2.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private String f9258a;

        /* renamed from: b  reason: collision with root package name */
        private String f9259b;

        /* renamed from: c  reason: collision with root package name */
        private String f9260c;

        /* renamed from: d  reason: collision with root package name */
        private String f9261d;

        /* renamed from: e  reason: collision with root package name */
        private String f9262e;

        @Override // com.cmic.sso.sdk.c.b.g
        public JSONObject b() {
            return null;
        }

        public void b(String str) {
            this.f9262e = str;
        }

        public String c() {
            return this.f9262e;
        }

        public String d() {
            return this.f9258a;
        }

        public String e() {
            return this.f9259b;
        }

        public String f() {
            return this.f9260c;
        }

        @Override // com.cmic.sso.sdk.c.b.g
        public String a() {
            return this.f9261d;
        }

        public void c(String str) {
            this.f9261d = str;
        }

        public void d(String str) {
            this.f9258a = str;
        }

        public void e(String str) {
            this.f9259b = str;
        }

        public void f(String str) {
            this.f9260c = str;
        }

        @Override // com.cmic.sso.sdk.c.b.g
        protected String a(String str) {
            return this.f9262e + this.f9261d + this.f9260c + this.f9259b + "@Fdiwmxy7CBDDQNUI";
        }
    }

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return null;
    }

    public void a(b bVar) {
        this.f9255a = bVar;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put(Constant.MD5, this.f9255a.d());
            jSONObject2.put("msgid", this.f9255a.e());
            jSONObject2.put("systemtime", this.f9255a.f());
            jSONObject2.put(ACTD.APPID_KEY, this.f9255a.a());
            jSONObject2.put("version", this.f9255a.c());
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", this.f9256b.a());
            jSONObject.put("body", jSONObject3);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public void a(a aVar) {
        this.f9256b = aVar;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return this.f9255a.f9261d;
    }
}
