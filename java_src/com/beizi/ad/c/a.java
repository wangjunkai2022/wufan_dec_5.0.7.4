package com.beizi.ad.c;

import com.beizi.ad.c.d;
import com.beizi.ad.c.e;
import com.qq.e.comm.pi.ACTD;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AdRequest.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: AdRequest.java */
    /* renamed from: com.beizi.ad.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0168a {

        /* renamed from: a  reason: collision with root package name */
        private String f5351a;

        /* renamed from: b  reason: collision with root package name */
        private String f5352b;

        /* renamed from: c  reason: collision with root package name */
        private String f5353c;

        /* renamed from: d  reason: collision with root package name */
        private long f5354d;

        /* renamed from: e  reason: collision with root package name */
        private String f5355e;

        /* compiled from: AdRequest.java */
        /* renamed from: com.beizi.ad.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0169a {

            /* renamed from: a  reason: collision with root package name */
            private String f5356a;

            /* renamed from: b  reason: collision with root package name */
            private String f5357b;

            /* renamed from: c  reason: collision with root package name */
            private String f5358c;

            /* renamed from: d  reason: collision with root package name */
            private long f5359d;

            /* renamed from: e  reason: collision with root package name */
            private String f5360e;

            public C0169a a(String str) {
                this.f5356a = str;
                return this;
            }

            public C0169a b(String str) {
                this.f5357b = str;
                return this;
            }

            public C0169a c(String str) {
                this.f5358c = str;
                return this;
            }

            public C0168a a() {
                C0168a c0168a = new C0168a();
                c0168a.f5354d = this.f5359d;
                c0168a.f5353c = this.f5358c;
                c0168a.f5355e = this.f5360e;
                c0168a.f5352b = this.f5357b;
                c0168a.f5351a = this.f5356a;
                return c0168a;
            }
        }

        private C0168a() {
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("spaceID", this.f5351a);
                jSONObject.put("spaceParam", this.f5352b);
                jSONObject.put("requestUUID", this.f5353c);
                jSONObject.put("channelReserveTs", this.f5354d);
                jSONObject.put("sdkExtInfo", this.f5355e);
                return jSONObject;
            } catch (JSONException e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: AdRequest.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f5361a;

        /* renamed from: b  reason: collision with root package name */
        private e.i f5362b;

        /* renamed from: c  reason: collision with root package name */
        private e.g f5363c;

        /* renamed from: d  reason: collision with root package name */
        private long f5364d;

        /* renamed from: e  reason: collision with root package name */
        private String f5365e;

        /* renamed from: f  reason: collision with root package name */
        private String f5366f;

        /* renamed from: g  reason: collision with root package name */
        private String f5367g;

        /* renamed from: h  reason: collision with root package name */
        private long f5368h;

        /* renamed from: i  reason: collision with root package name */
        private long f5369i;

        /* renamed from: j  reason: collision with root package name */
        private d.a f5370j;

        /* renamed from: k  reason: collision with root package name */
        private d.c f5371k;

        /* renamed from: l  reason: collision with root package name */
        private ArrayList<C0168a> f5372l;

        /* compiled from: AdRequest.java */
        /* renamed from: com.beizi.ad.c.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0170a {

            /* renamed from: a  reason: collision with root package name */
            private String f5373a;

            /* renamed from: b  reason: collision with root package name */
            private e.i f5374b;

            /* renamed from: c  reason: collision with root package name */
            private e.g f5375c;

            /* renamed from: d  reason: collision with root package name */
            private long f5376d;

            /* renamed from: e  reason: collision with root package name */
            private String f5377e;

            /* renamed from: f  reason: collision with root package name */
            private String f5378f;

            /* renamed from: g  reason: collision with root package name */
            private String f5379g;

            /* renamed from: h  reason: collision with root package name */
            private long f5380h;

            /* renamed from: i  reason: collision with root package name */
            private long f5381i;

            /* renamed from: j  reason: collision with root package name */
            private d.a f5382j;

            /* renamed from: k  reason: collision with root package name */
            private d.c f5383k;

            /* renamed from: l  reason: collision with root package name */
            private ArrayList<C0168a> f5384l = new ArrayList<>();

            public C0170a a(String str) {
                this.f5373a = str;
                return this;
            }

            public C0170a b(String str) {
                this.f5377e = str;
                return this;
            }

            public C0170a c(String str) {
                this.f5378f = str;
                return this;
            }

            public C0170a d(String str) {
                this.f5379g = str;
                return this;
            }

            public C0170a a(e.i iVar) {
                this.f5374b = iVar;
                return this;
            }

            public C0170a b(long j4) {
                this.f5380h = j4;
                return this;
            }

            public C0170a c(long j4) {
                this.f5381i = j4;
                return this;
            }

            public C0170a a(e.g gVar) {
                this.f5375c = gVar;
                return this;
            }

            public C0170a a(long j4) {
                this.f5376d = j4;
                return this;
            }

            public C0170a a(d.a aVar) {
                this.f5382j = aVar;
                return this;
            }

            public C0170a a(d.c cVar) {
                this.f5383k = cVar;
                return this;
            }

            public b a() {
                b bVar = new b();
                bVar.f5365e = this.f5377e;
                bVar.f5370j = this.f5382j;
                bVar.f5363c = this.f5375c;
                bVar.f5368h = this.f5380h;
                bVar.f5362b = this.f5374b;
                bVar.f5364d = this.f5376d;
                bVar.f5367g = this.f5379g;
                bVar.f5369i = this.f5381i;
                bVar.f5371k = this.f5383k;
                bVar.f5372l = this.f5384l;
                bVar.f5366f = this.f5378f;
                bVar.f5361a = this.f5373a;
                return bVar;
            }

            public void a(C0168a c0168a) {
                this.f5384l.add(c0168a);
            }
        }

        public String toString() {
            return a();
        }

        private b() {
        }

        private String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", this.f5361a);
                jSONObject.put("srcType", this.f5362b);
                jSONObject.put("reqType", this.f5363c);
                jSONObject.put("timeStamp", this.f5364d);
                jSONObject.put(ACTD.APPID_KEY, this.f5365e);
                jSONObject.put("appVersion", this.f5366f);
                jSONObject.put("apkName", this.f5367g);
                jSONObject.put("appInstallTime", this.f5368h);
                jSONObject.put("appUpdateTime", this.f5369i);
                d.a aVar = this.f5370j;
                if (aVar != null) {
                    jSONObject.put("devInfo", aVar.a());
                }
                d.c cVar = this.f5371k;
                if (cVar != null) {
                    jSONObject.put("envInfo", cVar.a());
                }
                ArrayList<C0168a> arrayList = this.f5372l;
                if (arrayList != null && arrayList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i4 = 0; i4 < this.f5372l.size(); i4++) {
                        jSONArray.put(this.f5372l.get(i4).a());
                    }
                    jSONObject.put("adReqInfo", jSONArray);
                }
                return jSONObject.toString();
            } catch (JSONException e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }
}
