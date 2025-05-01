package com.ss.android.downloadlib.addownload.compliance;

import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import com.ss.android.downloadlib.n.jh;
import com.tencent.cos.common.COSHttpResponseKey;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private long f60416b;

    /* renamed from: i  reason: collision with root package name */
    private int f60417i;
    private String jh;

    /* renamed from: k  reason: collision with root package name */
    private String f60418k;

    /* renamed from: m  reason: collision with root package name */
    private vv f60419m;

    /* renamed from: n  reason: collision with root package name */
    private String f60420n;

    /* renamed from: o  reason: collision with root package name */
    private int f60421o = 15;

    /* renamed from: p  reason: collision with root package name */
    private int f60422p;

    /* renamed from: q  reason: collision with root package name */
    private String f60423q;
    private String qv;

    /* renamed from: r  reason: collision with root package name */
    private String f60424r;

    /* renamed from: t  reason: collision with root package name */
    private m f60425t;

    /* renamed from: u  reason: collision with root package name */
    private int f60426u;
    private boolean vv;
    private int wv;

    /* loaded from: classes5.dex */
    public static class m {

        /* renamed from: m  reason: collision with root package name */
        private String f60427m;
        private int vv;

        public void vv(int i4) {
            this.vv = i4;
        }

        public void vv(String str) {
            this.f60427m = str;
        }
    }

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: b  reason: collision with root package name */
        private String f60428b;

        /* renamed from: i  reason: collision with root package name */
        private long f60429i;
        private String jh;

        /* renamed from: k  reason: collision with root package name */
        private String f60430k;

        /* renamed from: m  reason: collision with root package name */
        private String f60431m;

        /* renamed from: n  reason: collision with root package name */
        private List<C0610vv> f60432n;

        /* renamed from: o  reason: collision with root package name */
        private String f60433o;

        /* renamed from: p  reason: collision with root package name */
        private long f60434p;
        private String qv;

        /* renamed from: u  reason: collision with root package name */
        private String f60435u;
        private String vv;
        private String wv;

        /* renamed from: com.ss.android.downloadlib.addownload.compliance.o$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0610vv {

            /* renamed from: m  reason: collision with root package name */
            private String f60436m;
            private String vv;

            public void m(String str) {
                this.f60436m = str;
            }

            public void vv(String str) {
                this.vv = str;
            }
        }

        public void i(String str) {
            this.f60435u = str;
        }

        public void m(String str) {
            this.f60431m = str;
        }

        public void n(String str) {
            this.f60430k = str;
        }

        public void o(String str) {
            this.qv = str;
        }

        public void p(String str) {
            this.f60433o = str;
        }

        public void qv(String str) {
            this.f60428b = str;
        }

        public void u(String str) {
            this.wv = str;
        }

        public void vv(String str) {
            this.vv = str;
        }

        public void wv(String str) {
            this.jh = str;
        }

        public void m(long j4) {
            this.f60429i = j4;
        }

        public void vv(long j4) {
            this.f60434p = j4;
        }

        public void vv(List<C0610vv> list) {
            this.f60432n = list;
        }
    }

    public static o n(String str) {
        o oVar = new o();
        try {
            JSONObject jSONObject = new JSONObject(str);
            vv vv2 = vv(jSONObject);
            m m4 = m(jSONObject);
            oVar.vv(vv2);
            oVar.vv(m4);
            oVar.vv(jSONObject.optInt("show_auth", 0) == 1);
            oVar.vv(jSONObject.optInt("download_permit"));
            oVar.m(jSONObject.optInt("appstore_permit"));
            oVar.p(jSONObject.optInt("market_online_status", 15));
            oVar.i(jSONObject.optInt("hijack_permit"));
            oVar.vv(jSONObject.optString(bm.f63454o));
            oVar.m(jSONObject.optString("hijack_url"));
            oVar.o(jSONObject.optInt("code"));
            oVar.p(jSONObject.optString("message"));
            oVar.vv(jSONObject.optLong("request_duration", 0L));
            oVar.i(jSONObject.optString("back_web_url"));
            oVar.o(jSONObject.optString("hw_app_id"));
            oVar.u(jSONObject.optString("deep_link"));
        } catch (Exception e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "ComplianceResult fromJson");
        }
        return oVar;
    }

    public void i(int i4) {
        this.f60426u = i4;
    }

    public void m(int i4) {
        this.f60417i = i4;
    }

    public void o(int i4) {
        this.wv = i4;
    }

    public void p(int i4) {
        this.f60421o = i4;
    }

    public String toString() {
        return vv(this);
    }

    public void u(String str) {
        this.f60424r = str;
    }

    public void vv(boolean z4) {
        this.vv = z4;
    }

    public void i(String str) {
        this.f60423q = str;
    }

    public void m(String str) {
        this.qv = str;
    }

    public void o(String str) {
        this.jh = str;
    }

    public void p(String str) {
        this.f60418k = str;
    }

    public void vv(vv vvVar) {
        this.f60419m = vvVar;
    }

    private static JSONArray p(vv vvVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List<vv.C0610vv> list = vvVar.f60432n;
        if (list != null && list.size() > 0) {
            for (vv.C0610vv c0610vv : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("permission_name", c0610vv.vv);
                jSONObject.putOpt("permission_desc", c0610vv.f60436m);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public String m() {
        return this.f60424r;
    }

    public void vv(int i4) {
        this.f60422p = i4;
    }

    private static JSONObject m(vv vvVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (vvVar != null) {
            jSONObject.putOpt("app_name", vvVar.vv);
            jSONObject.putOpt(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME, vvVar.f60431m);
            jSONObject.putOpt("update_time", Long.valueOf(vvVar.f60434p));
            jSONObject.putOpt("size", Long.valueOf(vvVar.f60429i));
            jSONObject.putOpt("developer_name", vvVar.f60433o);
            jSONObject.putOpt("policy_url", vvVar.wv);
            jSONObject.putOpt("icon_url", vvVar.f60430k);
            jSONObject.putOpt(COSHttpResponseKey.DOWNLOAD_URL, vvVar.f60428b);
            jSONObject.putOpt("permissions", p(vvVar));
            jSONObject.putOpt("permission_classify_url", vvVar.qv);
            jSONObject.putOpt("desc_url", vvVar.jh);
        }
        return jSONObject;
    }

    public void vv(String str) {
        this.f60420n = str;
    }

    public int vv() {
        return this.wv;
    }

    public void vv(long j4) {
        this.f60416b = j4;
    }

    public void vv(m mVar) {
        this.f60425t = mVar;
    }

    public static String vv(o oVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("show_auth", Integer.valueOf(oVar.vv ? 1 : 0));
            jSONObject.putOpt("download_permit", Integer.valueOf(oVar.f60422p));
            jSONObject.putOpt("appstore_permit", Integer.valueOf(oVar.f60417i));
            jSONObject.putOpt("market_online_status", Integer.valueOf(oVar.f60421o));
            jSONObject.putOpt("hijack_permit", Integer.valueOf(oVar.f60426u));
            jSONObject.putOpt(bm.f63454o, oVar.f60420n);
            jSONObject.putOpt("hijack_url", oVar.qv);
            jSONObject.putOpt("code", Integer.valueOf(oVar.wv));
            jSONObject.putOpt("message", oVar.f60418k);
            jSONObject.putOpt("request_duration", Long.valueOf(oVar.f60416b));
            jSONObject.putOpt("auth_info", m(oVar.f60419m));
            jSONObject.putOpt("status", m(oVar.f60425t));
            jSONObject.putOpt("back_web_url", oVar.f60423q);
            jSONObject.putOpt("hw_app_id", oVar.jh);
            jSONObject.putOpt("deep_link", oVar.f60424r);
        } catch (JSONException e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "ComplianceResult toJson");
        }
        return jSONObject.toString();
    }

    private static m m(JSONObject jSONObject) {
        m mVar = new m();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("status");
            if (optJSONObject != null) {
                mVar.vv(optJSONObject.optInt("status"));
                mVar.vv(optJSONObject.optString("message"));
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "ComplianceResult getStatus");
        }
        return mVar;
    }

    private static JSONObject m(m mVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (mVar != null) {
            jSONObject.putOpt("status", Integer.valueOf(mVar.vv));
            jSONObject.putOpt("message", mVar.f60427m);
        }
        return jSONObject;
    }

    private static vv vv(JSONObject jSONObject) {
        vv vvVar = new vv();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("auth_info");
            if (optJSONObject != null) {
                vvVar.vv(optJSONObject.optString("app_name"));
                vvVar.m(optJSONObject.optString(NativeUnifiedADAppInfoImpl.Keys.VERSION_NAME));
                vvVar.vv(jh.vv(optJSONObject, "update_time"));
                vvVar.m(jh.vv(optJSONObject, "size"));
                vvVar.p(optJSONObject.optString("developer_name"));
                vvVar.i(optJSONObject.optString(bm.f63454o));
                JSONArray optJSONArray = optJSONObject.optJSONArray("permissions");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    vv(optJSONArray, arrayList);
                    vvVar.vv(arrayList);
                }
                vvVar.o(optJSONObject.optString("permission_classify_url"));
                vvVar.u(optJSONObject.optString("policy_url"));
                vvVar.n(optJSONObject.optString("icon_url"));
                vvVar.qv(optJSONObject.optString(COSHttpResponseKey.DOWNLOAD_URL));
                vvVar.wv(optJSONObject.optString("desc_url"));
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "ComplianceResult getAuthInfo");
        }
        return vvVar;
    }

    private static void vv(JSONArray jSONArray, List<vv.C0610vv> list) {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
            if (optJSONObject != null) {
                vv.C0610vv c0610vv = new vv.C0610vv();
                c0610vv.vv(optJSONObject.optString("permission_name"));
                c0610vv.m(optJSONObject.optString("permission_desc"));
                list.add(c0610vv);
            }
        }
    }
}
