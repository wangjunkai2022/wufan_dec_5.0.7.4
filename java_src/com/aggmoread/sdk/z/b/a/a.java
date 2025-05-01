package com.aggmoread.sdk.z.b.a;

import android.text.TextUtils;
import com.aggmoread.sdk.z.a.e;
import com.qq.e.ads.nativ.NativeUnifiedADAppInfoImpl;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.b.a f2613b;

    /* renamed from: c  reason: collision with root package name */
    public int f2614c;

    /* renamed from: d  reason: collision with root package name */
    public String f2615d;

    /* renamed from: e  reason: collision with root package name */
    public C0083a f2616e;

    /* renamed from: com.aggmoread.sdk.z.b.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0083a {

        /* renamed from: a  reason: collision with root package name */
        public List<C0084a> f2617a;

        /* renamed from: com.aggmoread.sdk.z.b.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0084a {

            /* renamed from: a  reason: collision with root package name */
            public String f2618a;

            /* renamed from: b  reason: collision with root package name */
            public String f2619b;

            /* renamed from: c  reason: collision with root package name */
            public String f2620c;

            /* renamed from: d  reason: collision with root package name */
            public String f2621d;

            /* renamed from: e  reason: collision with root package name */
            public String f2622e;

            /* renamed from: f  reason: collision with root package name */
            public List<C0085a> f2623f;

            /* renamed from: g  reason: collision with root package name */
            public List<String> f2624g;

            /* renamed from: h  reason: collision with root package name */
            public int f2625h;

            /* renamed from: i  reason: collision with root package name */
            public String f2626i;

            /* renamed from: j  reason: collision with root package name */
            public List<String> f2627j;

            /* renamed from: k  reason: collision with root package name */
            public List<String> f2628k;

            /* renamed from: l  reason: collision with root package name */
            public List<String> f2629l;

            /* renamed from: m  reason: collision with root package name */
            public List<String> f2630m;

            /* renamed from: n  reason: collision with root package name */
            public List<String> f2631n;

            /* renamed from: o  reason: collision with root package name */
            public List<String> f2632o;

            /* renamed from: p  reason: collision with root package name */
            public String f2633p;

            /* renamed from: com.aggmoread.sdk.z.b.a.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static class C0085a {

                /* renamed from: a  reason: collision with root package name */
                public int f2634a;

                /* renamed from: b  reason: collision with root package name */
                public List<String> f2635b;
            }

            public String a() {
                return !TextUtils.isEmpty(this.f2621d) ? this.f2621d : !TextUtils.isEmpty(this.f2622e) ? this.f2622e : "";
            }

            public List<String> a(int i4) {
                if (this.f2623f != null) {
                    for (int i5 = 0; i5 < this.f2623f.size(); i5++) {
                        C0085a c0085a = this.f2623f.get(i5);
                        if (i4 == c0085a.f2634a) {
                            return c0085a.f2635b;
                        }
                    }
                    return null;
                }
                return null;
            }

            public String b() {
                List<String> list = this.f2624g;
                if (list == null || list.size() <= 0) {
                    return null;
                }
                return this.f2624g.get(0);
            }

            public boolean c() {
                return this.f2625h == 2;
            }
        }

        public C0084a a() {
            if (this.f2617a.size() > 0) {
                return this.f2617a.get(0);
            }
            return null;
        }
    }

    private static List<C0083a.C0084a.C0085a> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            C0083a.C0084a.C0085a c0085a = new C0083a.C0084a.C0085a();
            JSONObject jSONObject = (JSONObject) jSONArray.get(i4);
            if (a(jSONObject, "type")) {
                c0085a.f2634a = jSONObject.getInt("type");
            }
            if (a(jSONObject, "urls")) {
                c0085a.f2635b = b(jSONObject.getJSONArray("urls"));
            }
            arrayList.add(c0085a);
        }
        return arrayList;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) && jSONObject.has(str);
    }

    public static a b(JSONObject jSONObject) {
        a aVar = new a();
        if (a(jSONObject, "code")) {
            aVar.f2614c = jSONObject.getInt("code");
        }
        if (a(jSONObject, "msg")) {
            aVar.f2615d = jSONObject.getString("msg");
        }
        if (a(jSONObject, "ads")) {
            C0083a c0083a = new C0083a();
            JSONObject jSONObject2 = jSONObject.getJSONObject("ads");
            if (a(jSONObject2, "slotCode")) {
                jSONObject2.getString("slotCode");
            }
            if (a(jSONObject2, "meta") && jSONObject2.getJSONArray("meta").length() > 0) {
                JSONArray jSONArray = jSONObject2.getJSONArray("meta");
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    C0083a.C0084a c0084a = new C0083a.C0084a();
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i4);
                    if (a(jSONObject3, "title")) {
                        c0084a.f2618a = jSONObject3.getString("title");
                    }
                    if (a(jSONObject3, "desc")) {
                        c0084a.f2619b = jSONObject3.getString("desc");
                    }
                    if (a(jSONObject3, "icon")) {
                        c0084a.f2620c = jSONObject3.getString("icon");
                    }
                    if (a(jSONObject3, "click_url")) {
                        c0084a.f2621d = jSONObject3.getString("click_url");
                    }
                    if (a(jSONObject3, "deepLink")) {
                        c0084a.f2622e = jSONObject3.getString("deepLink");
                        if (a(jSONObject3, "arrDeepLinkTrackUrl")) {
                            c0084a.f2623f = a(jSONObject3.getJSONArray("arrDeepLinkTrackUrl"));
                        }
                    }
                    if (a(jSONObject3, "imgs")) {
                        c0084a.f2624g = b(jSONObject3.getJSONArray("imgs"));
                    }
                    if (a(jSONObject3, "creative_type")) {
                        jSONObject3.getInt("creative_type");
                    }
                    if (a(jSONObject3, "interaction_type")) {
                        c0084a.f2625h = jSONObject3.getInt("interaction_type");
                    }
                    if (a(jSONObject3, bm.f63454o)) {
                        c0084a.f2626i = jSONObject3.getString(bm.f63454o);
                    }
                    if (a(jSONObject3, NativeUnifiedADAppInfoImpl.Keys.PACKAGE_SIZE)) {
                        jSONObject3.getInt(NativeUnifiedADAppInfoImpl.Keys.PACKAGE_SIZE);
                    }
                    if (a(jSONObject3, "show_track_url")) {
                        c0084a.f2629l = b(jSONObject3.getJSONArray("show_track_url"));
                    }
                    if (a(jSONObject3, "click_track_url")) {
                        c0084a.f2630m = b(jSONObject3.getJSONArray("click_track_url"));
                    }
                    if (a(jSONObject3, "download_track_url")) {
                        c0084a.f2631n = b(jSONObject3.getJSONArray("download_track_url"));
                    }
                    if (a(jSONObject3, "install_track_url")) {
                        c0084a.f2632o = b(jSONObject3.getJSONArray("install_track_url"));
                    }
                    if (a(jSONObject3, "w")) {
                        jSONObject3.getInt("w");
                    }
                    if (a(jSONObject3, "tanUrl")) {
                        c0084a.f2633p = jSONObject3.getString("tanUrl");
                    }
                    if (a(jSONObject3, "ci")) {
                        jSONObject3.getString("ci");
                    }
                    arrayList.add(c0084a);
                }
                c0083a.f2617a = arrayList;
                aVar.f2616e = c0083a;
            }
        }
        return aVar;
    }

    private static List<String> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        return arrayList;
    }

    public void a(com.aggmoread.sdk.z.b.b.a aVar) {
        this.f2613b = aVar;
    }

    public com.aggmoread.sdk.z.b.b.a d() {
        return this.f2613b;
    }

    public boolean e() {
        List<C0083a.C0084a> list;
        C0083a c0083a = this.f2616e;
        return (c0083a == null || (list = c0083a.f2617a) == null || list.size() <= 0) ? false : true;
    }

    public boolean f() {
        return this.f2614c == 0;
    }
}
