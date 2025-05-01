package com.ss.android.download.api.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.downloadlib.addownload.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    private final int f60317b;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f60318i;

    /* renamed from: j  reason: collision with root package name */
    private final JSONObject f60319j;
    private final Object jh;

    /* renamed from: k  reason: collision with root package name */
    private final List<String> f60320k;

    /* renamed from: m  reason: collision with root package name */
    private final String f60321m;

    /* renamed from: n  reason: collision with root package name */
    private final long f60322n;

    /* renamed from: o  reason: collision with root package name */
    private final long f60323o;

    /* renamed from: p  reason: collision with root package name */
    private final String f60324p;

    /* renamed from: q  reason: collision with root package name */
    private final String f60325q;
    private final JSONObject qv;

    /* renamed from: r  reason: collision with root package name */
    private final String f60326r;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f60327t;

    /* renamed from: u  reason: collision with root package name */
    private final String f60328u;
    private String vv;
    private final JSONObject wv;

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: b  reason: collision with root package name */
        private List<String> f60329b;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f60330d;

        /* renamed from: j  reason: collision with root package name */
        private String f60332j;
        private int jh;

        /* renamed from: k  reason: collision with root package name */
        private Map<String, Object> f60333k;

        /* renamed from: m  reason: collision with root package name */
        private String f60334m;

        /* renamed from: n  reason: collision with root package name */
        private long f60335n;

        /* renamed from: o  reason: collision with root package name */
        private long f60336o;

        /* renamed from: p  reason: collision with root package name */
        private String f60337p;
        private JSONObject qv;

        /* renamed from: r  reason: collision with root package name */
        private Object f60339r;

        /* renamed from: t  reason: collision with root package name */
        private String f60340t;

        /* renamed from: u  reason: collision with root package name */
        private String f60341u;
        private String vv;
        private JSONObject wv;

        /* renamed from: i  reason: collision with root package name */
        private boolean f60331i = false;

        /* renamed from: q  reason: collision with root package name */
        private boolean f60338q = false;

        public vv i(String str) {
            this.f60340t = str;
            return this;
        }

        public vv m(String str) {
            this.f60337p = str;
            return this;
        }

        public vv p(String str) {
            this.f60341u = str;
            return this;
        }

        public vv vv(boolean z4) {
            this.f60338q = z4;
            return this;
        }

        public vv m(long j4) {
            this.f60335n = j4;
            return this;
        }

        public vv vv(String str) {
            this.f60334m = str;
            return this;
        }

        public vv m(boolean z4) {
            this.f60331i = z4;
            return this;
        }

        public vv vv(long j4) {
            this.f60336o = j4;
            return this;
        }

        public vv m(JSONObject jSONObject) {
            this.wv = jSONObject;
            return this;
        }

        public vv vv(JSONObject jSONObject) {
            this.qv = jSONObject;
            return this;
        }

        public vv vv(List<String> list) {
            this.f60329b = list;
            return this;
        }

        public vv vv(int i4) {
            this.jh = i4;
            return this;
        }

        public vv vv(Object obj) {
            this.f60339r = obj;
            return this;
        }

        public p vv() {
            if (TextUtils.isEmpty(this.vv)) {
                this.vv = "umeng";
            }
            JSONObject jSONObject = new JSONObject();
            if (this.qv == null) {
                this.qv = new JSONObject();
            }
            try {
                Map<String, Object> map = this.f60333k;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f60333k.entrySet()) {
                        if (!this.qv.has(entry.getKey())) {
                            this.qv.putOpt(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (this.f60338q) {
                    this.f60332j = this.f60337p;
                    JSONObject jSONObject2 = new JSONObject();
                    this.f60330d = jSONObject2;
                    if (this.f60331i) {
                        jSONObject2.put("ad_extra_data", this.qv.toString());
                    } else {
                        Iterator<String> keys = this.qv.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.f60330d.put(next, this.qv.get(next));
                        }
                    }
                    this.f60330d.put("category", this.vv);
                    this.f60330d.put("tag", this.f60334m);
                    this.f60330d.put("value", this.f60336o);
                    this.f60330d.put("ext_value", this.f60335n);
                    if (!TextUtils.isEmpty(this.f60340t)) {
                        this.f60330d.put(TTDownloadField.TT_REFER, this.f60340t);
                    }
                    JSONObject jSONObject3 = this.wv;
                    if (jSONObject3 != null) {
                        this.f60330d = com.ss.android.download.api.p.m.vv(jSONObject3, this.f60330d);
                    }
                    if (this.f60331i) {
                        if (!this.f60330d.has("log_extra") && !TextUtils.isEmpty(this.f60341u)) {
                            this.f60330d.put("log_extra", this.f60341u);
                        }
                        this.f60330d.put("is_ad_event", "1");
                    }
                }
                if (this.f60331i) {
                    jSONObject.put("ad_extra_data", this.qv.toString());
                    if (!jSONObject.has("log_extra") && !TextUtils.isEmpty(this.f60341u)) {
                        jSONObject.put("log_extra", this.f60341u);
                    }
                    jSONObject.put("is_ad_event", "1");
                } else {
                    jSONObject.put("extra", this.qv);
                }
                if (!TextUtils.isEmpty(this.f60340t)) {
                    jSONObject.putOpt(TTDownloadField.TT_REFER, this.f60340t);
                }
                JSONObject jSONObject4 = this.wv;
                if (jSONObject4 != null) {
                    jSONObject = com.ss.android.download.api.p.m.vv(jSONObject4, jSONObject);
                }
                this.qv = jSONObject;
            } catch (Exception e5) {
                b.x().vv(e5, "DownloadEventModel build");
            }
            return new p(this);
        }
    }

    p(vv vvVar) {
        this.vv = vvVar.vv;
        this.f60321m = vvVar.f60334m;
        this.f60324p = vvVar.f60337p;
        this.f60318i = vvVar.f60331i;
        this.f60323o = vvVar.f60336o;
        this.f60328u = vvVar.f60341u;
        this.f60322n = vvVar.f60335n;
        this.qv = vvVar.qv;
        this.wv = vvVar.wv;
        this.f60320k = vvVar.f60329b;
        this.f60317b = vvVar.jh;
        this.jh = vvVar.f60339r;
        this.f60327t = vvVar.f60338q;
        this.f60325q = vvVar.f60332j;
        this.f60319j = vvVar.f60330d;
        this.f60326r = vvVar.f60340t;
    }

    public int b() {
        return this.f60317b;
    }

    public boolean i() {
        return this.f60318i;
    }

    public Object jh() {
        return this.jh;
    }

    public List<String> k() {
        return this.f60320k;
    }

    public String m() {
        return this.f60321m;
    }

    public long n() {
        return this.f60322n;
    }

    public long o() {
        return this.f60323o;
    }

    public String p() {
        return this.f60324p;
    }

    public JSONObject q() {
        return this.f60319j;
    }

    public JSONObject qv() {
        return this.qv;
    }

    public boolean r() {
        return this.f60327t;
    }

    public String t() {
        return this.f60325q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("category: ");
        sb.append(this.vv);
        sb.append("\ttag: ");
        sb.append(this.f60321m);
        sb.append("\tlabel: ");
        sb.append(this.f60324p);
        sb.append("\nisAd: ");
        sb.append(this.f60318i);
        sb.append("\tadId: ");
        sb.append(this.f60323o);
        sb.append("\tlogExtra: ");
        sb.append(this.f60328u);
        sb.append("\textValue: ");
        sb.append(this.f60322n);
        sb.append("\nextJson: ");
        sb.append(this.qv);
        sb.append("\nparamsJson: ");
        sb.append(this.wv);
        sb.append("\nclickTrackUrl: ");
        List<String> list = this.f60320k;
        sb.append(list != null ? list.toString() : "");
        sb.append("\teventSource: ");
        sb.append(this.f60317b);
        sb.append("\textraObject: ");
        Object obj = this.jh;
        sb.append(obj != null ? obj.toString() : "");
        sb.append("\nisV3: ");
        sb.append(this.f60327t);
        sb.append("\tV3EventName: ");
        sb.append(this.f60325q);
        sb.append("\tV3EventParams: ");
        JSONObject jSONObject = this.f60319j;
        sb.append(jSONObject != null ? jSONObject.toString() : "");
        return sb.toString();
    }

    public String u() {
        return this.f60328u;
    }

    public String vv() {
        return this.vv;
    }

    public JSONObject wv() {
        return this.wv;
    }
}
