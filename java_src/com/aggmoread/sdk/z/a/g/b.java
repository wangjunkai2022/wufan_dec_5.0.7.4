package com.aggmoread.sdk.z.a.g;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.qq.e.comm.constants.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.a.e {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.h.c f2055b;

    /* renamed from: c  reason: collision with root package name */
    public int f2056c;

    /* renamed from: d  reason: collision with root package name */
    public String f2057d;

    /* renamed from: e  reason: collision with root package name */
    public List<a> f2058e;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<C0056a> f2059a;

        /* renamed from: com.aggmoread.sdk.z.a.g.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0056a {

            /* renamed from: a  reason: collision with root package name */
            public String f2060a;

            /* renamed from: b  reason: collision with root package name */
            public String f2061b;

            /* renamed from: c  reason: collision with root package name */
            public String f2062c;

            /* renamed from: d  reason: collision with root package name */
            public String f2063d;

            /* renamed from: e  reason: collision with root package name */
            public List<C0057a> f2064e;

            /* renamed from: f  reason: collision with root package name */
            public String f2065f;

            /* renamed from: g  reason: collision with root package name */
            public int f2066g;

            /* renamed from: h  reason: collision with root package name */
            public int f2067h;

            /* renamed from: i  reason: collision with root package name */
            public String f2068i;

            /* renamed from: j  reason: collision with root package name */
            public List<String> f2069j;

            /* renamed from: k  reason: collision with root package name */
            public List<String> f2070k;

            /* renamed from: l  reason: collision with root package name */
            public List<String> f2071l;

            /* renamed from: m  reason: collision with root package name */
            public List<String> f2072m;

            /* renamed from: n  reason: collision with root package name */
            public List<String> f2073n;

            /* renamed from: o  reason: collision with root package name */
            public List<String> f2074o;

            /* renamed from: p  reason: collision with root package name */
            public List<String> f2075p;

            /* renamed from: q  reason: collision with root package name */
            public List<String> f2076q;

            /* renamed from: r  reason: collision with root package name */
            public List<String> f2077r;

            /* renamed from: s  reason: collision with root package name */
            public int f2078s = -1;

            /* renamed from: com.aggmoread.sdk.z.a.g.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static class C0057a {

                /* renamed from: a  reason: collision with root package name */
                public int f2079a;

                /* renamed from: b  reason: collision with root package name */
                public List<String> f2080b;

                public String toString() {
                    return "DeepLinkTrack{type=" + this.f2079a + ", urls=" + this.f2080b + '}';
                }
            }

            public String a() {
                return this.f2062c;
            }

            public List<String> a(int i4) {
                if (this.f2064e != null) {
                    for (int i5 = 0; i5 < this.f2064e.size(); i5++) {
                        C0057a c0057a = this.f2064e.get(i5);
                        if (i4 == c0057a.f2079a) {
                            return c0057a.f2080b;
                        }
                    }
                    return null;
                }
                return null;
            }

            public void a(long j4) {
            }

            public void a(String str) {
                this.f2062c = str;
            }

            public void a(List<C0057a> list) {
                this.f2064e = list;
            }

            public List<String> b() {
                return this.f2072m;
            }

            public void b(int i4) {
            }

            public void b(String str) {
                this.f2061b = str;
            }

            public void b(List<String> list) {
                this.f2071l = list;
            }

            public List<String> c() {
                return this.f2073n;
            }

            public void c(int i4) {
            }

            public void c(String str) {
                this.f2063d = str;
            }

            public void c(List<String> list) {
                this.f2072m = list;
            }

            public List<String> d() {
                return this.f2074o;
            }

            public void d(int i4) {
                this.f2067h = i4;
            }

            public void d(String str) {
                this.f2065f = str;
            }

            public void d(List<String> list) {
                this.f2073n = list;
            }

            public String e() {
                return this.f2061b;
            }

            public void e(int i4) {
                this.f2066g = i4;
            }

            public void e(String str) {
            }

            public void e(List<String> list) {
                this.f2074o = list;
            }

            public String f() {
                List<String> list = this.f2069j;
                return (list == null || list.size() <= 0) ? "" : this.f2069j.get(0);
            }

            public void f(int i4) {
                this.f2078s = i4;
            }

            public void f(String str) {
                this.f2060a = str;
            }

            public void f(List<String> list) {
                this.f2069j = list;
            }

            public List<String> g() {
                return this.f2069j;
            }

            public void g(int i4) {
            }

            public void g(String str) {
                this.f2068i = str;
            }

            public void g(List<String> list) {
                this.f2070k = list;
            }

            public int h() {
                return this.f2067h;
            }

            public void h(int i4) {
            }

            public void h(List<String> list) {
                this.f2075p = list;
            }

            public String i() {
                return !TextUtils.isEmpty(this.f2061b) ? this.f2061b : !TextUtils.isEmpty(this.f2065f) ? this.f2065f : "";
            }

            public void i(int i4) {
            }

            public void i(List<String> list) {
                this.f2077r = list;
            }

            public String j() {
                List<String> list = this.f2075p;
                if (list == null || list.size() <= 0) {
                    return null;
                }
                return this.f2075p.get(0);
            }

            public void j(List<String> list) {
                this.f2076q = list;
            }

            public List<String> k() {
                return this.f2070k;
            }

            public List<String> l() {
                List<String> list = this.f2075p;
                return list == null ? new ArrayList() : list;
            }

            public String m() {
                return this.f2060a;
            }

            public int n() {
                return this.f2078s;
            }

            public String o() {
                return this.f2068i;
            }

            public List<String> p() {
                return this.f2077r;
            }

            public List<String> q() {
                return this.f2076q;
            }

            public boolean r() {
                return this.f2066g == 2;
            }
        }

        /* renamed from: com.aggmoread.sdk.z.a.g.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0058b {

            /* renamed from: a  reason: collision with root package name */
            public int f2081a;

            /* renamed from: b  reason: collision with root package name */
            public List<String> f2082b;

            /* renamed from: c  reason: collision with root package name */
            public List<Object> f2083c;

            public void a(int i4) {
                this.f2081a = i4;
            }

            public void a(List<String> list) {
                this.f2082b = list;
            }

            public String toString() {
                return "Track{type=" + this.f2081a + ", urls=" + this.f2082b + ", videoPlayPercentage=" + this.f2083c + '}';
            }
        }

        public C0056a a() {
            List<C0056a> list = this.f2059a;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return this.f2059a.get(0);
        }

        public void a(String str) {
        }

        public void a(List<C0056a> list) {
            this.f2059a = list;
        }

        public void b(List<C0058b> list) {
        }
    }

    private static List<a.C0056a.C0057a> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            a.C0056a.C0057a c0057a = new a.C0056a.C0057a();
            JSONObject jSONObject = (JSONObject) jSONArray.get(i4);
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                c0057a.f2079a = jSONObject.getInt("type");
            }
            if (jSONObject.has("urls") && !jSONObject.isNull("urls")) {
                c0057a.f2080b = b(jSONObject.getJSONArray("urls"));
            }
            arrayList.add(c0057a);
        }
        return arrayList;
    }

    public static b b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        ArrayList arrayList = new ArrayList();
        if (!jSONObject.isNull(MediationConstant.KEY_ERROR_CODE) && jSONObject.has(MediationConstant.KEY_ERROR_CODE)) {
            String string = jSONObject.getString(MediationConstant.KEY_ERROR_CODE);
            if (!TextUtils.isEmpty(string)) {
                bVar.b(Integer.parseInt(string));
            }
        }
        if (!jSONObject.isNull("msg") && jSONObject.has("msg")) {
            String string2 = jSONObject.getString("msg");
            if (!TextUtils.isEmpty(string2)) {
                bVar.a(string2);
            }
        }
        if (jSONObject.has("ads") && !jSONObject.isNull("ads") && jSONObject.getJSONArray("ads").length() > 0) {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i4);
                a aVar = new a();
                if (!jSONObject.isNull("slotId") && jSONObject2.has("slotId")) {
                    aVar.a(jSONObject2.getString("slotId"));
                }
                if (jSONObject2.has("metaGroup") && !jSONObject2.isNull("metaGroup") && jSONObject2.getJSONArray("metaGroup").length() > 0) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("metaGroup");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i5);
                        a.C0056a c0056a = new a.C0056a();
                        if (jSONObject3.has("price") && !jSONObject3.isNull("price")) {
                            c0056a.f(jSONObject3.getInt("price"));
                        }
                        if (jSONObject3.has("descs") && !jSONObject3.isNull("descs")) {
                            c0056a.f(b(jSONObject3.getJSONArray("descs")));
                        }
                        if (jSONObject3.has("imageUrl") && !jSONObject3.isNull("imageUrl")) {
                            c0056a.h(b(jSONObject3.getJSONArray("imageUrl")));
                        }
                        if (jSONObject3.has("iconUrls") && !jSONObject3.isNull("iconUrls")) {
                            c0056a.g(b(jSONObject3.getJSONArray("iconUrls")));
                        }
                        if (jSONObject3.has(Constants.KEYS.EXPOSED_CLICK_URL_KEY) && !jSONObject3.isNull(Constants.KEYS.EXPOSED_CLICK_URL_KEY)) {
                            c0056a.b(jSONObject3.getString(Constants.KEYS.EXPOSED_CLICK_URL_KEY));
                        }
                        if (jSONObject3.has("interactionType") && !jSONObject3.isNull("interactionType")) {
                            c0056a.e(jSONObject3.getInt("interactionType"));
                        }
                        if (jSONObject3.has("downType") && !jSONObject3.isNull("downType")) {
                            c0056a.d(jSONObject3.getInt("downType"));
                        }
                        if (jSONObject3.has("packageName") && !jSONObject3.isNull("packageName")) {
                            c0056a.f(jSONObject3.getString("packageName"));
                        }
                        if (jSONObject3.has("appSize") && !jSONObject3.isNull("appSize")) {
                            c0056a.b(jSONObject3.getInt("appSize"));
                        }
                        if (jSONObject3.has("downloadLink") && !jSONObject3.isNull("downloadLink")) {
                            c0056a.d(jSONObject3.getString("downloadLink"));
                        }
                        if (jSONObject3.has("winNoticeUrls") && !jSONObject3.isNull("winNoticeUrls")) {
                            c0056a.j(b(jSONObject3.getJSONArray("winNoticeUrls")));
                        }
                        if (jSONObject3.has("winCNoticeUrls") && !jSONObject3.isNull("winCNoticeUrls")) {
                            c0056a.i(b(jSONObject3.getJSONArray("winCNoticeUrls")));
                        }
                        if (jSONObject3.has("arrDownloadTrackUrl") && !jSONObject3.isNull("arrDownloadTrackUrl")) {
                            c0056a.b(b(jSONObject3.getJSONArray("arrDownloadTrackUrl")));
                        }
                        if (jSONObject3.has("arrDownloadedTrakUrl") && !jSONObject3.isNull("arrDownloadedTrakUrl")) {
                            c0056a.c(b(jSONObject3.getJSONArray("arrDownloadedTrakUrl")));
                        }
                        if (jSONObject3.has("arrIntallTrackUrl") && !jSONObject3.isNull("arrIntallTrackUrl")) {
                            c0056a.d(b(jSONObject3.getJSONArray("arrIntallTrackUrl")));
                        }
                        if (jSONObject3.has("arrIntalledTrackUrl") && !jSONObject3.isNull("arrIntalledTrackUrl")) {
                            c0056a.e(b(jSONObject3.getJSONArray("arrIntalledTrackUrl")));
                        }
                        if (jSONObject3.has("adTitle") && !jSONObject3.isNull("adTitle")) {
                            c0056a.a(jSONObject3.getString("adTitle"));
                        }
                        if (jSONObject3.has("deepLink") && !jSONObject3.isNull("deepLink")) {
                            c0056a.c(jSONObject3.getString("deepLink"));
                            if (jSONObject3.has("arrDeepLinkTrackUrl") && !jSONObject3.isNull("arrDeepLinkTrackUrl")) {
                                c0056a.a(a(jSONObject3.getJSONArray("arrDeepLinkTrackUrl")));
                            }
                        }
                        if (jSONObject3.has("creativeType") && !jSONObject3.isNull("creativeType")) {
                            c0056a.c(jSONObject3.getInt("creativeType"));
                        }
                        if (jSONObject3.has("videoUrl") && !jSONObject3.isNull("videoUrl")) {
                            c0056a.g(jSONObject3.getString("videoUrl"));
                        }
                        if (jSONObject3.has("videoDuration") && !jSONObject3.isNull("videoDuration")) {
                            c0056a.g(jSONObject3.getInt("videoDuration"));
                        }
                        if (jSONObject3.has("videoSize") && !jSONObject3.isNull("videoSize")) {
                            c0056a.a(jSONObject3.getLong("videoSize"));
                        }
                        if (jSONObject3.has("videoWidth") && !jSONObject3.isNull("videoWidth")) {
                            c0056a.i(jSONObject3.getInt("videoWidth"));
                        }
                        if (jSONObject3.has("videoHeight") && !jSONObject3.isNull("videoHeight")) {
                            c0056a.h(jSONObject3.getInt("videoHeight"));
                        }
                        if (jSONObject3.has("end_card_html") && !jSONObject3.isNull("end_card_html")) {
                            c0056a.e(jSONObject3.getString("end_card_html"));
                        }
                        arrayList2.add(c0056a);
                    }
                    aVar.a(arrayList2);
                }
                if (jSONObject2.has("tracks") && !jSONObject.isNull("tracks")) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("tracks");
                    ArrayList arrayList3 = new ArrayList();
                    for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i6);
                        a.C0058b c0058b = new a.C0058b();
                        if (jSONObject4.has("type") && !jSONObject4.isNull("type")) {
                            c0058b.a(jSONObject4.getInt("type"));
                        }
                        if (jSONObject4.has("urls") && !jSONObject4.isNull("urls")) {
                            c0058b.a(b(jSONObject4.getJSONArray("urls")));
                        }
                    }
                    aVar.b(arrayList3);
                }
                arrayList.add(aVar);
            }
        }
        bVar.a(arrayList);
        return bVar;
    }

    private static List<String> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        return arrayList;
    }

    public void a(com.aggmoread.sdk.z.a.h.c cVar) {
        this.f2055b = cVar;
    }

    public void a(String str) {
        this.f2057d = str;
    }

    public void a(List<a> list) {
        this.f2058e = list;
    }

    public void b(int i4) {
        this.f2056c = i4;
    }

    public com.aggmoread.sdk.z.a.h.c d() {
        return this.f2055b;
    }

    public boolean e() {
        List<a> list = this.f2058e;
        return list != null && list.size() > 0;
    }

    public boolean f() {
        return this.f2056c == 0;
    }
}
