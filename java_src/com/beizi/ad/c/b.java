package com.beizi.ad.c;

import com.beizi.ad.c.e;
import com.beizi.ad.lance.a.k;
import com.beizi.ad.lance.a.l;
import com.join.mgps.activity.QuarkDownGameActivity_;
import com.qq.e.comm.constants.Constants;
import com.umeng.analytics.pro.bm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AdResponseOuterClass.java */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private e.f f5385a;

        /* renamed from: b  reason: collision with root package name */
        private String f5386b;

        /* renamed from: c  reason: collision with root package name */
        private List<e> f5387c;

        public e.f a() {
            return this.f5385a;
        }

        public String b() {
            return this.f5386b;
        }

        public List<e> c() {
            return this.f5387c;
        }

        public int d() {
            List<e> list = this.f5387c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void a(e.f fVar) {
            this.f5385a = fVar;
        }

        public void a(String str) {
            this.f5386b = str;
        }

        public void a(List<e> list) {
            this.f5387c = list;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* renamed from: com.beizi.ad.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0171b {

        /* renamed from: a  reason: collision with root package name */
        private String f5388a;

        /* renamed from: b  reason: collision with root package name */
        private String f5389b;

        /* renamed from: c  reason: collision with root package name */
        private int f5390c;

        /* renamed from: d  reason: collision with root package name */
        private String f5391d;

        /* renamed from: e  reason: collision with root package name */
        private String f5392e;

        /* renamed from: f  reason: collision with root package name */
        private String f5393f;

        /* renamed from: g  reason: collision with root package name */
        private String f5394g;

        /* renamed from: h  reason: collision with root package name */
        private String f5395h;

        /* renamed from: i  reason: collision with root package name */
        private String f5396i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f5397j;

        /* renamed from: k  reason: collision with root package name */
        private int f5398k;

        /* renamed from: l  reason: collision with root package name */
        private h f5399l;

        /* renamed from: m  reason: collision with root package name */
        private C0172b f5400m;

        /* renamed from: n  reason: collision with root package name */
        private c f5401n;

        /* renamed from: o  reason: collision with root package name */
        private List<h> f5402o;

        /* renamed from: p  reason: collision with root package name */
        private String f5403p;

        /* renamed from: q  reason: collision with root package name */
        private String f5404q;

        /* renamed from: r  reason: collision with root package name */
        private String f5405r;

        /* renamed from: s  reason: collision with root package name */
        private String f5406s;

        /* renamed from: t  reason: collision with root package name */
        private String f5407t;

        /* renamed from: u  reason: collision with root package name */
        private String f5408u;

        /* renamed from: v  reason: collision with root package name */
        private String f5409v;

        /* renamed from: w  reason: collision with root package name */
        private a f5410w;

        /* compiled from: AdResponseOuterClass.java */
        /* renamed from: com.beizi.ad.c.b$b$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f5411a;

            public int a() {
                return this.f5411a;
            }

            public void a(int i4) {
                this.f5411a = i4;
            }
        }

        /* compiled from: AdResponseOuterClass.java */
        /* renamed from: com.beizi.ad.c.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0172b implements Serializable {

            /* renamed from: a  reason: collision with root package name */
            private List<String> f5412a;

            /* renamed from: b  reason: collision with root package name */
            private List<String> f5413b;

            /* renamed from: c  reason: collision with root package name */
            private List<String> f5414c;

            /* renamed from: d  reason: collision with root package name */
            private List<String> f5415d;

            /* renamed from: e  reason: collision with root package name */
            private List<String> f5416e;

            /* renamed from: f  reason: collision with root package name */
            private List<String> f5417f;

            /* renamed from: g  reason: collision with root package name */
            private List<String> f5418g;

            /* renamed from: h  reason: collision with root package name */
            private List<String> f5419h;

            /* renamed from: i  reason: collision with root package name */
            private List<String> f5420i;

            /* renamed from: j  reason: collision with root package name */
            private List<String> f5421j;

            /* renamed from: k  reason: collision with root package name */
            private List<String> f5422k;

            /* renamed from: l  reason: collision with root package name */
            private List<String> f5423l;

            /* renamed from: m  reason: collision with root package name */
            private List<String> f5424m;

            /* renamed from: n  reason: collision with root package name */
            private List<String> f5425n;

            /* renamed from: o  reason: collision with root package name */
            private List<String> f5426o;

            public List<String> a() {
                return this.f5412a;
            }

            public List<String> b() {
                return this.f5413b;
            }

            public List<String> c() {
                return this.f5414c;
            }

            public List<String> d() {
                return this.f5415d;
            }

            public List<String> e() {
                return this.f5416e;
            }

            public void f(List<String> list) {
                this.f5417f = list;
            }

            public void g(List<String> list) {
                this.f5418g = list;
            }

            public void h(List<String> list) {
                this.f5419h = list;
            }

            public void i(List<String> list) {
                this.f5420i = list;
            }

            public void j(List<String> list) {
                this.f5421j = list;
            }

            public void k(List<String> list) {
                this.f5422k = list;
            }

            public void l(List<String> list) {
                this.f5423l = list;
            }

            public void m(List<String> list) {
                this.f5424m = list;
            }

            public void n(List<String> list) {
                this.f5425n = list;
            }

            public void o(List<String> list) {
                this.f5426o = list;
            }

            public void a(List<String> list) {
                this.f5412a = list;
            }

            public void b(List<String> list) {
                this.f5413b = list;
            }

            public void c(List<String> list) {
                this.f5414c = list;
            }

            public void d(List<String> list) {
                this.f5415d = list;
            }

            public void e(List<String> list) {
                this.f5416e = list;
            }

            public List<String> f() {
                return this.f5423l;
            }

            public List<String> g() {
                return this.f5424m;
            }

            public List<String> h() {
                return this.f5425n;
            }

            public List<String> i() {
                return this.f5426o;
            }
        }

        /* compiled from: AdResponseOuterClass.java */
        /* renamed from: com.beizi.ad.c.b$b$c */
        /* loaded from: classes2.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            private List<String> f5427a;

            /* renamed from: b  reason: collision with root package name */
            private List<String> f5428b;

            /* renamed from: c  reason: collision with root package name */
            private List<String> f5429c;

            /* renamed from: d  reason: collision with root package name */
            private List<String> f5430d;

            /* renamed from: e  reason: collision with root package name */
            private List<String> f5431e;

            /* renamed from: f  reason: collision with root package name */
            private List<a> f5432f;

            /* compiled from: AdResponseOuterClass.java */
            /* renamed from: com.beizi.ad.c.b$b$c$a */
            /* loaded from: classes2.dex */
            public static class a {

                /* renamed from: a  reason: collision with root package name */
                private int f5433a;

                /* renamed from: b  reason: collision with root package name */
                private List<String> f5434b;

                public void a(int i4) {
                    this.f5433a = i4;
                }

                public void a(List<String> list) {
                    this.f5434b = list;
                }
            }

            public void a(List<String> list) {
                this.f5427a = list;
            }

            public void b(List<String> list) {
                this.f5428b = list;
            }

            public void c(List<String> list) {
                this.f5429c = list;
            }

            public void d(List<String> list) {
                this.f5430d = list;
            }

            public void e(List<String> list) {
                this.f5431e = list;
            }

            public void f(List<a> list) {
                this.f5432f = list;
            }
        }

        public String a() {
            return this.f5388a;
        }

        public String b() {
            return this.f5389b;
        }

        public int c() {
            return this.f5390c;
        }

        public String d() {
            return this.f5391d;
        }

        public String e() {
            return this.f5392e;
        }

        public String f() {
            return this.f5394g;
        }

        public String g() {
            return this.f5395h;
        }

        public String h() {
            return this.f5396i;
        }

        public h i() {
            return this.f5399l;
        }

        public C0172b j() {
            return this.f5400m;
        }

        public c k() {
            return this.f5401n;
        }

        public List<h> l() {
            return this.f5402o;
        }

        public String m() {
            return this.f5403p;
        }

        public String n() {
            return this.f5404q;
        }

        public String o() {
            return this.f5405r;
        }

        public String p() {
            return this.f5406s;
        }

        public String q() {
            return this.f5407t;
        }

        public String r() {
            return this.f5408u;
        }

        public String s() {
            return this.f5409v;
        }

        public a t() {
            return this.f5410w;
        }

        public void a(String str) {
            this.f5388a = str;
        }

        public void b(String str) {
            this.f5389b = str;
        }

        public void c(String str) {
            this.f5391d = str;
        }

        public void d(String str) {
            this.f5392e = str;
        }

        public void e(String str) {
            this.f5393f = str;
        }

        public void f(String str) {
            this.f5394g = str;
        }

        public void g(String str) {
            this.f5395h = str;
        }

        public void h(String str) {
            this.f5403p = str;
        }

        public void i(String str) {
            this.f5404q = str;
        }

        public void j(String str) {
            this.f5405r = str;
        }

        public void k(String str) {
            this.f5406s = str;
        }

        public void l(String str) {
            this.f5407t = str;
        }

        public void m(String str) {
            this.f5408u = str;
        }

        public void n(String str) {
            this.f5409v = str;
        }

        public void a(int i4) {
            this.f5390c = i4;
        }

        public void b(int i4) {
            this.f5398k = i4;
        }

        public void a(boolean z4) {
            this.f5397j = z4;
        }

        public void a(C0172b c0172b) {
            this.f5400m = c0172b;
        }

        public void a(c cVar) {
            this.f5401n = cVar;
        }

        public void a(List<h> list) {
            this.f5402o = list;
        }

        public void a(a aVar) {
            this.f5410w = aVar;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f5435a;

        /* renamed from: b  reason: collision with root package name */
        private String f5436b;

        /* renamed from: c  reason: collision with root package name */
        private String f5437c;

        /* renamed from: d  reason: collision with root package name */
        private String f5438d;

        public String a() {
            return this.f5435a;
        }

        public String b() {
            return this.f5436b;
        }

        public String c() {
            return this.f5437c;
        }

        public String d() {
            return this.f5438d;
        }

        public void a(String str) {
            this.f5435a = str;
        }

        public void b(String str) {
            this.f5436b = str;
        }

        public void c(String str) {
            this.f5437c = str;
        }

        public void d(String str) {
            this.f5438d = str;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private String f5439a;

        /* renamed from: b  reason: collision with root package name */
        private C0171b f5440b;

        /* renamed from: c  reason: collision with root package name */
        private c f5441c;

        /* renamed from: d  reason: collision with root package name */
        private List<a> f5442d;

        /* renamed from: e  reason: collision with root package name */
        private List<f> f5443e;

        /* renamed from: f  reason: collision with root package name */
        private String f5444f;

        /* renamed from: g  reason: collision with root package name */
        private String f5445g;

        public String a() {
            return this.f5439a;
        }

        public String b() {
            return this.f5445g;
        }

        public C0171b c() {
            return this.f5440b;
        }

        public int d() {
            List<a> list = this.f5442d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public c e() {
            return this.f5441c;
        }

        public List<a> f() {
            return this.f5442d;
        }

        public List<f> g() {
            return this.f5443e;
        }

        public int h() {
            List<f> list = this.f5443e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String i() {
            return this.f5444f;
        }

        public void a(String str) {
            this.f5439a = str;
        }

        public void b(String str) {
            this.f5445g = str;
        }

        public void c(String str) {
            this.f5444f = str;
        }

        public void a(C0171b c0171b) {
            this.f5440b = c0171b;
        }

        public void a(c cVar) {
            this.f5441c = cVar;
        }

        public void a(List<a> list) {
            this.f5442d = list;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private String f5446a;

        /* renamed from: b  reason: collision with root package name */
        private String f5447b;

        public String a() {
            return this.f5446a;
        }

        public String b() {
            return this.f5447b;
        }

        public void a(String str) {
            this.f5446a = str;
        }

        public void b(String str) {
            this.f5447b = str;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private String f5448a;

        /* renamed from: b  reason: collision with root package name */
        private String f5449b;

        /* renamed from: c  reason: collision with root package name */
        private String f5450c;

        public String a() {
            return this.f5448a;
        }

        public String b() {
            return this.f5449b;
        }

        public String c() {
            return this.f5450c;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private String f5451a;

        /* renamed from: b  reason: collision with root package name */
        private String f5452b;

        public String a() {
            return this.f5451a;
        }

        public String b() {
            return this.f5452b;
        }

        public void a(String str) {
            this.f5451a = str;
        }

        public void b(String str) {
            this.f5452b = str;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private String f5453a;

        /* renamed from: b  reason: collision with root package name */
        private String f5454b;

        /* renamed from: c  reason: collision with root package name */
        private String f5455c;

        /* renamed from: d  reason: collision with root package name */
        private String f5456d;

        /* renamed from: e  reason: collision with root package name */
        private String f5457e;

        /* renamed from: f  reason: collision with root package name */
        private String f5458f;

        /* renamed from: g  reason: collision with root package name */
        private String f5459g;

        public String a() {
            return this.f5453a;
        }

        public String b() {
            return this.f5454b;
        }

        public String c() {
            return this.f5455c;
        }

        public String d() {
            return this.f5456d;
        }

        public String e() {
            return this.f5457e;
        }

        public void f(String str) {
            this.f5458f = str;
        }

        public void g(String str) {
            this.f5459g = str;
        }

        public void a(String str) {
            this.f5453a = str;
        }

        public void b(String str) {
            this.f5454b = str;
        }

        public void c(String str) {
            this.f5455c = str;
        }

        public void d(String str) {
            this.f5456d = str;
        }

        public void e(String str) {
            this.f5457e = str;
        }

        public String f() {
            return this.f5459g;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private int f5460a;

        /* renamed from: b  reason: collision with root package name */
        private String f5461b;

        /* renamed from: c  reason: collision with root package name */
        private String f5462c;

        /* renamed from: d  reason: collision with root package name */
        private long f5463d;

        /* renamed from: e  reason: collision with root package name */
        private List<j> f5464e;

        public int a() {
            List<j> list = this.f5464e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int b() {
            return this.f5460a;
        }

        public String c() {
            return this.f5461b;
        }

        public String d() {
            return this.f5462c;
        }

        public List<j> e() {
            return this.f5464e;
        }

        private static i c(String str) throws JSONException {
            String str2;
            i iVar;
            JSONArray jSONArray;
            String str3;
            i iVar2;
            int i4;
            JSONArray jSONArray2;
            i iVar3;
            int i5;
            JSONArray jSONArray3;
            int i6;
            JSONArray jSONArray4;
            int i7;
            String b5 = com.beizi.ad.lance.a.a.b(k.a(), str);
            String str4 = "ServerResponse";
            l.d("ServerResponse", "decryptStr = " + b5);
            JSONObject jSONObject = new JSONObject(b5);
            i iVar4 = new i();
            try {
                iVar4.a(jSONObject.optString("errcode"));
                iVar4.b(jSONObject.optString("errmsg"));
                iVar4.a(jSONObject.optInt("status"));
                iVar4.a(jSONObject.optLong("ts"));
                JSONArray optJSONArray = jSONObject.optJSONArray("spaceInfo");
                ArrayList arrayList = new ArrayList();
                if (b(optJSONArray)) {
                    int i8 = 0;
                    while (i8 < optJSONArray.length()) {
                        j jVar = new j();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                        if (optJSONObject != null) {
                            jVar.a(optJSONObject.optString("spaceID"));
                            jVar.b(optJSONObject.optString("spaceParam"));
                            jVar.a(e.a.a(optJSONObject.optInt("adpType")));
                            jVar.a(optJSONObject.optInt("refreshInterval"));
                            jVar.a(e.h.a(optJSONObject.optInt("screenDirection")));
                            jVar.c(optJSONObject.optString("width"));
                            jVar.d(optJSONObject.optString("height"));
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("adpPosition");
                            g gVar = new g();
                            gVar.a(optJSONObject2.optString("x"));
                            gVar.b(optJSONObject2.optString("y"));
                            jVar.a(gVar);
                            jVar.a(optJSONObject.optBoolean("autoClose"));
                            jVar.b(optJSONObject.optInt("maxTime"));
                            jVar.b(optJSONObject.optBoolean("manualClosable"));
                            jVar.c(optJSONObject.optInt("minTime"));
                            jVar.c(optJSONObject.optBoolean("wifiPreload"));
                            jVar.d(optJSONObject.optBoolean("mute"));
                            jVar.e(optJSONObject.optBoolean("fullScreen"));
                            jVar.f(optJSONObject.optBoolean("autoPlay"));
                            jVar.d(optJSONObject.optInt("orgID"));
                            jVar.e(optJSONObject.optInt("contentType"));
                            jVar.e(optJSONObject.optString("appID"));
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("adResponse");
                            ArrayList arrayList2 = new ArrayList();
                            if (b(optJSONArray2)) {
                                int i9 = 0;
                                while (i9 < optJSONArray2.length()) {
                                    JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i9);
                                    if (optJSONObject3 != null) {
                                        d dVar = new d();
                                        dVar.a(optJSONObject3.optString(QuarkDownGameActivity_.f36977u));
                                        dVar.b(optJSONObject3.optString("adid"));
                                        JSONArray optJSONArray3 = optJSONObject3.optJSONArray("contentInfo");
                                        ArrayList arrayList3 = new ArrayList();
                                        if (b(optJSONArray3)) {
                                            jSONArray2 = optJSONArray;
                                            int i10 = 0;
                                            while (i10 < optJSONArray3.length()) {
                                                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i10);
                                                JSONArray jSONArray5 = optJSONArray2;
                                                a aVar = new a();
                                                JSONArray jSONArray6 = optJSONArray3;
                                                aVar.a(optJSONObject4.optString("template"));
                                                aVar.a(e.f.a(optJSONObject4.optInt("renderType")));
                                                JSONArray optJSONArray4 = optJSONObject4.optJSONArray("adcontentSlot");
                                                if (b(optJSONArray4)) {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    str2 = str4;
                                                    iVar3 = iVar4;
                                                    int i11 = 0;
                                                    while (i11 < optJSONArray4.length()) {
                                                        try {
                                                            JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i11);
                                                            if (optJSONObject5 != null) {
                                                                jSONArray4 = optJSONArray4;
                                                                e eVar = new e();
                                                                i7 = i8;
                                                                eVar.a(optJSONObject5.optString("md5"));
                                                                eVar.b(optJSONObject5.optString("content"));
                                                                arrayList4.add(eVar);
                                                            } else {
                                                                jSONArray4 = optJSONArray4;
                                                                i7 = i8;
                                                            }
                                                            i11++;
                                                            optJSONArray4 = jSONArray4;
                                                            i8 = i7;
                                                        } catch (JSONException e5) {
                                                            e = e5;
                                                            iVar = iVar3;
                                                            l.c(str2, "JSONException e = " + e.getMessage());
                                                            return iVar;
                                                        }
                                                    }
                                                    i6 = i8;
                                                    aVar.a(arrayList4);
                                                } else {
                                                    str2 = str4;
                                                    iVar3 = iVar4;
                                                    i6 = i8;
                                                }
                                                arrayList3.add(aVar);
                                                i10++;
                                                optJSONArray2 = jSONArray5;
                                                optJSONArray3 = jSONArray6;
                                                str4 = str2;
                                                iVar4 = iVar3;
                                                i8 = i6;
                                            }
                                            str2 = str4;
                                            iVar3 = iVar4;
                                            i5 = i8;
                                            jSONArray3 = optJSONArray2;
                                            dVar.a(arrayList3);
                                        } else {
                                            jSONArray2 = optJSONArray;
                                            str2 = str4;
                                            iVar3 = iVar4;
                                            i5 = i8;
                                            jSONArray3 = optJSONArray2;
                                        }
                                        JSONObject optJSONObject6 = optJSONObject3.optJSONObject("adLogo");
                                        if (optJSONObject6 != null) {
                                            c cVar = new c();
                                            cVar.b(optJSONObject6.optString("adLabel"));
                                            cVar.a(optJSONObject6.optString("adLabelUrl"));
                                            cVar.d(optJSONObject6.optString("sourceLabel"));
                                            cVar.c(optJSONObject6.optString("sourceUrl"));
                                            dVar.a(cVar);
                                        }
                                        dVar.c(optJSONObject3.optString("price"));
                                        C0171b c0171b = new C0171b();
                                        JSONObject optJSONObject7 = optJSONObject3.optJSONObject("interactInfo");
                                        if (optJSONObject7 != null) {
                                            JSONArray optJSONArray5 = optJSONObject7.optJSONArray("thirdpartInfo");
                                            if (b(optJSONArray5)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i12 = 0; i12 < optJSONArray5.length(); i12++) {
                                                    JSONObject optJSONObject8 = optJSONArray5.optJSONObject(i12);
                                                    if (optJSONObject8 != null) {
                                                        h hVar = new h();
                                                        hVar.b(optJSONObject8.optString(Constants.KEYS.EXPOSED_CLICK_URL_KEY));
                                                        hVar.a(optJSONObject8.optString("viewUrl"));
                                                        hVar.c(optJSONObject8.optString("convertUrl"));
                                                        hVar.g(optJSONObject8.optString("onFinish"));
                                                        hVar.e(optJSONObject8.optString("onPause"));
                                                        hVar.f(optJSONObject8.optString("onRecover"));
                                                        hVar.d(optJSONObject8.optString("onStart"));
                                                        arrayList5.add(hVar);
                                                    }
                                                }
                                                c0171b.a(arrayList5);
                                            }
                                            c0171b.c(optJSONObject7.optString("apkName"));
                                            c0171b.f(optJSONObject7.optString("appDesc"));
                                            c0171b.h(optJSONObject7.optString("appVersion"));
                                            c0171b.i(optJSONObject7.optString("appDeveloper"));
                                            c0171b.j(optJSONObject7.optString("appPermissionsDesc"));
                                            c0171b.k(optJSONObject7.optString("appPermissionsUrl"));
                                            c0171b.l(optJSONObject7.optString("appPrivacyUrl"));
                                            c0171b.m(optJSONObject7.optString("appIconURL"));
                                            c0171b.n(optJSONObject7.optString("appintro"));
                                            c0171b.g(optJSONObject7.optString("appDownloadURL"));
                                            c0171b.e(optJSONObject7.optString("appStoreID"));
                                            c0171b.a(optJSONObject7.optString("landingPageUrl"));
                                            c0171b.b(optJSONObject7.optString("deeplinkUrl"));
                                            c0171b.a(optJSONObject7.optInt("interactType"));
                                            c0171b.d(optJSONObject7.optString("packageName"));
                                            c0171b.a(optJSONObject7.optBoolean("useBuiltInBrow"));
                                            c0171b.b(optJSONObject7.optInt("openExternal"));
                                            JSONObject optJSONObject9 = optJSONObject7.optJSONObject("followTrackExt");
                                            C0171b.C0172b c0172b = new C0171b.C0172b();
                                            if (optJSONObject9 != null) {
                                                c0172b.a(a(optJSONObject9.optJSONArray("open")));
                                                c0172b.b(a(optJSONObject9.optJSONArray("beginDownload")));
                                                c0172b.c(a(optJSONObject9.optJSONArray("download")));
                                                c0172b.d(a(optJSONObject9.optJSONArray("beginInstall")));
                                                c0172b.e(a(optJSONObject9.optJSONArray("install")));
                                                c0172b.f(a(optJSONObject9.optJSONArray("active")));
                                                c0172b.g(a(optJSONObject9.optJSONArray("close")));
                                                c0172b.h(a(optJSONObject9.optJSONArray("showSlide")));
                                                c0172b.j(a(optJSONObject9.optJSONArray("pageClose")));
                                                c0172b.i(a(optJSONObject9.optJSONArray("pageLoad")));
                                                c0172b.k(a(optJSONObject9.optJSONArray("pageAction")));
                                                c0172b.l(a(optJSONObject9.optJSONArray("deepLinkSuccess")));
                                                c0172b.m(a(optJSONObject9.optJSONArray("deepLinkFail")));
                                                c0172b.n(a(optJSONObject9.optJSONArray("dpAppInstalled")));
                                                c0172b.o(a(optJSONObject9.optJSONArray("dpAppNotInstalled")));
                                                c0171b.a(c0172b);
                                            }
                                            JSONObject optJSONObject10 = optJSONObject7.optJSONObject("videoTrackExt");
                                            C0171b.c cVar2 = new C0171b.c();
                                            if (optJSONObject10 != null) {
                                                cVar2.a(a(optJSONObject10.optJSONArray("start")));
                                                cVar2.b(a(optJSONObject10.optJSONArray("pause")));
                                                cVar2.c(a(optJSONObject10.optJSONArray("continue")));
                                                cVar2.d(a(optJSONObject10.optJSONArray("exit")));
                                                cVar2.e(a(optJSONObject10.optJSONArray("complete")));
                                                JSONArray optJSONArray6 = optJSONObject10.optJSONArray("showTrack");
                                                ArrayList arrayList6 = new ArrayList();
                                                if (b(optJSONArray6)) {
                                                    for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                                        JSONObject optJSONObject11 = optJSONArray6.optJSONObject(i13);
                                                        if (optJSONObject11 != null) {
                                                            C0171b.c.a aVar2 = new C0171b.c.a();
                                                            aVar2.a(optJSONObject11.optInt(bm.aM));
                                                            aVar2.a(a(optJSONObject11.optJSONArray("url")));
                                                            arrayList6.add(aVar2);
                                                        }
                                                    }
                                                    cVar2.f(arrayList6);
                                                }
                                                c0171b.a(cVar2);
                                            }
                                            try {
                                                if (optJSONObject7.has("ext")) {
                                                    JSONObject jSONObject2 = optJSONObject7.getJSONObject("ext");
                                                    C0171b.a aVar3 = new C0171b.a();
                                                    if (jSONObject2 != null) {
                                                        if (jSONObject2.has("isCanJump")) {
                                                            aVar3.a(jSONObject2.optInt("isCanJump"));
                                                        }
                                                        c0171b.a(aVar3);
                                                    }
                                                }
                                            } catch (JSONException e6) {
                                                e6.printStackTrace();
                                            }
                                            dVar.a(c0171b);
                                        }
                                        arrayList2.add(dVar);
                                    } else {
                                        jSONArray2 = optJSONArray;
                                        str2 = str4;
                                        iVar3 = iVar4;
                                        i5 = i8;
                                        jSONArray3 = optJSONArray2;
                                    }
                                    i9++;
                                    optJSONArray = jSONArray2;
                                    optJSONArray2 = jSONArray3;
                                    str4 = str2;
                                    iVar4 = iVar3;
                                    i8 = i5;
                                }
                                jSONArray = optJSONArray;
                                str3 = str4;
                                iVar2 = iVar4;
                                i4 = i8;
                                jVar.a(arrayList2);
                            } else {
                                jSONArray = optJSONArray;
                                str3 = str4;
                                iVar2 = iVar4;
                                i4 = i8;
                            }
                            arrayList.add(jVar);
                        } else {
                            jSONArray = optJSONArray;
                            str3 = str4;
                            iVar2 = iVar4;
                            i4 = i8;
                        }
                        i8 = i4 + 1;
                        optJSONArray = jSONArray;
                        str4 = str3;
                        iVar4 = iVar2;
                    }
                    str2 = str4;
                    iVar = iVar4;
                    try {
                        iVar.a(arrayList);
                        return iVar;
                    } catch (JSONException e7) {
                        e = e7;
                        l.c(str2, "JSONException e = " + e.getMessage());
                        return iVar;
                    }
                }
                return iVar4;
            } catch (JSONException e8) {
                e = e8;
                str2 = str4;
                iVar = iVar4;
            }
        }

        public void a(int i4) {
            this.f5460a = i4;
        }

        public void b(String str) {
            this.f5462c = str;
        }

        private static String b(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toString("UTF-8");
                }
            }
        }

        public void a(String str) {
            this.f5461b = str;
        }

        public void a(long j4) {
            this.f5463d = j4;
        }

        public void a(List<j> list) {
            this.f5464e = list;
        }

        public static i a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            try {
                return c(b(inputStream));
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            } catch (JSONException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        private static boolean b(JSONArray jSONArray) {
            return jSONArray != null && jSONArray.length() > 0;
        }

        public static i a(byte[] bArr) throws JSONException {
            if (bArr == null) {
                return null;
            }
            try {
                return c(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        private static ArrayList<String> a(JSONArray jSONArray) throws JSONException {
            ArrayList<String> arrayList = new ArrayList<>();
            if (b(jSONArray)) {
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
            }
            return arrayList;
        }
    }

    /* compiled from: AdResponseOuterClass.java */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private String f5465a;

        /* renamed from: b  reason: collision with root package name */
        private String f5466b;

        /* renamed from: c  reason: collision with root package name */
        private e.a f5467c;

        /* renamed from: d  reason: collision with root package name */
        private int f5468d;

        /* renamed from: e  reason: collision with root package name */
        private e.h f5469e;

        /* renamed from: f  reason: collision with root package name */
        private String f5470f;

        /* renamed from: g  reason: collision with root package name */
        private String f5471g;

        /* renamed from: h  reason: collision with root package name */
        private g f5472h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f5473i;

        /* renamed from: j  reason: collision with root package name */
        private int f5474j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f5475k;

        /* renamed from: l  reason: collision with root package name */
        private int f5476l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5477m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f5478n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f5479o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f5480p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f5481q;

        /* renamed from: r  reason: collision with root package name */
        private int f5482r;

        /* renamed from: s  reason: collision with root package name */
        private int f5483s;

        /* renamed from: t  reason: collision with root package name */
        private String f5484t;

        /* renamed from: u  reason: collision with root package name */
        private List<d> f5485u;

        public String a() {
            return this.f5465a;
        }

        public String b() {
            return this.f5466b;
        }

        public e.a c() {
            return this.f5467c;
        }

        public int d() {
            return this.f5468d;
        }

        public e.h e() {
            return this.f5469e;
        }

        public String f() {
            return this.f5470f;
        }

        public String g() {
            return this.f5471g;
        }

        public g h() {
            return this.f5472h;
        }

        public boolean i() {
            return this.f5473i;
        }

        public int j() {
            return this.f5474j;
        }

        public boolean k() {
            return this.f5475k;
        }

        public int l() {
            return this.f5476l;
        }

        public boolean m() {
            return this.f5477m;
        }

        public boolean n() {
            return this.f5478n;
        }

        public boolean o() {
            return this.f5479o;
        }

        public boolean p() {
            return this.f5480p;
        }

        public boolean q() {
            return this.f5481q;
        }

        public List<d> r() {
            return this.f5485u;
        }

        public int s() {
            List<d> list = this.f5485u;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void a(String str) {
            this.f5465a = str;
        }

        public void b(String str) {
            this.f5466b = str;
        }

        public void c(String str) {
            this.f5470f = str;
        }

        public void d(String str) {
            this.f5471g = str;
        }

        public void e(boolean z4) {
            this.f5479o = z4;
        }

        public void f(boolean z4) {
            this.f5480p = z4;
        }

        public void a(e.a aVar) {
            this.f5467c = aVar;
        }

        public void b(int i4) {
            this.f5474j = i4;
        }

        public void c(int i4) {
            this.f5476l = i4;
        }

        public void d(boolean z4) {
            this.f5478n = z4;
        }

        public void e(int i4) {
            this.f5483s = i4;
        }

        public void a(int i4) {
            this.f5468d = i4;
        }

        public void b(boolean z4) {
            this.f5475k = z4;
        }

        public void c(boolean z4) {
            this.f5477m = z4;
        }

        public void d(int i4) {
            this.f5482r = i4;
        }

        public void e(String str) {
            this.f5484t = str;
        }

        public void a(e.h hVar) {
            this.f5469e = hVar;
        }

        public void a(g gVar) {
            this.f5472h = gVar;
        }

        public void a(boolean z4) {
            this.f5473i = z4;
        }

        public void a(List<d> list) {
            this.f5485u = list;
        }
    }
}
