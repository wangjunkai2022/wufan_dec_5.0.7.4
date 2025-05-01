package com.beizi.fusion.d.a;

import com.beizi.fusion.model.JsonNode;
import com.bytedance.sdk.openadsdk.live.TTLiveConstants;
import com.kuaishou.weapon.p0.t;
import com.tencent.stat.DeviceInfo;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.List;
/* compiled from: BidS2SRequestModel.java */
/* loaded from: classes2.dex */
public class b {
    @JsonNode(key = "request")

    /* renamed from: a  reason: collision with root package name */
    private i f6614a;

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class a {
        @JsonNode(key = TTLiveConstants.BUNDLE_KEY)

        /* renamed from: a  reason: collision with root package name */
        private String f6615a;
        @JsonNode(key = DeviceInfo.TAG_VERSION)

        /* renamed from: b  reason: collision with root package name */
        private String f6616b;
        @JsonNode(key = "ext")

        /* renamed from: c  reason: collision with root package name */
        private C0188b f6617c;

        public void a(String str) {
            this.f6615a = str;
        }

        public void b(String str) {
            this.f6616b = str;
        }

        public void a(C0188b c0188b) {
            this.f6617c = c0188b;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* renamed from: com.beizi.fusion.d.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0188b {
        @JsonNode(key = "appId")

        /* renamed from: a  reason: collision with root package name */
        private String f6618a;

        public void a(String str) {
            this.f6618a = str;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class c {
        @JsonNode(key = "app")

        /* renamed from: a  reason: collision with root package name */
        private a f6619a;
        @JsonNode(key = com.alipay.sdk.packet.d.f4907p)

        /* renamed from: b  reason: collision with root package name */
        private d f6620b;

        public void a(a aVar) {
            this.f6619a = aVar;
        }

        public void a(d dVar) {
            this.f6620b = dVar;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class d {
        @JsonNode(key = "type")

        /* renamed from: a  reason: collision with root package name */
        private int f6621a;
        @JsonNode(key = aw.f63373d)

        /* renamed from: b  reason: collision with root package name */
        private String f6622b;
        @JsonNode(key = "lmt")

        /* renamed from: c  reason: collision with root package name */
        private int f6623c;
        @JsonNode(key = "make")

        /* renamed from: d  reason: collision with root package name */
        private String f6624d;
        @JsonNode(key = "model")

        /* renamed from: e  reason: collision with root package name */
        private String f6625e;
        @JsonNode(key = bm.f63463x)

        /* renamed from: f  reason: collision with root package name */
        private int f6626f;
        @JsonNode(key = "osv")

        /* renamed from: g  reason: collision with root package name */
        private String f6627g;
        @JsonNode(key = bm.aK)

        /* renamed from: h  reason: collision with root package name */
        private float f6628h;
        @JsonNode(key = "w")

        /* renamed from: i  reason: collision with root package name */
        private float f6629i;
        @JsonNode(key = "ppi")

        /* renamed from: j  reason: collision with root package name */
        private String f6630j;
        @JsonNode(key = "pxratio")

        /* renamed from: k  reason: collision with root package name */
        private String f6631k;
        @JsonNode(key = "lang")

        /* renamed from: l  reason: collision with root package name */
        private String f6632l;
        @JsonNode(key = bm.P)

        /* renamed from: m  reason: collision with root package name */
        private String f6633m;
        @JsonNode(key = "contype")

        /* renamed from: n  reason: collision with root package name */
        private String f6634n;
        @JsonNode(key = "ext")

        /* renamed from: o  reason: collision with root package name */
        private e f6635o;

        public void a(int i4) {
            this.f6621a = i4;
        }

        public void b(int i4) {
            this.f6623c = i4;
        }

        public void c(String str) {
            this.f6625e = str;
        }

        public void d(String str) {
            this.f6627g = str;
        }

        public void e(String str) {
            this.f6630j = str;
        }

        public void f(String str) {
            this.f6631k = str;
        }

        public void g(String str) {
            this.f6632l = str;
        }

        public void h(String str) {
            this.f6633m = str;
        }

        public void i(String str) {
            this.f6634n = str;
        }

        public void a(String str) {
            this.f6622b = str;
        }

        public void b(String str) {
            this.f6624d = str;
        }

        public void c(int i4) {
            this.f6626f = i4;
        }

        public void a(float f5) {
            this.f6628h = f5;
        }

        public void b(float f5) {
            this.f6629i = f5;
        }

        public void a(e eVar) {
            this.f6635o = eVar;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class e {
        @JsonNode(key = "sdkuid")

        /* renamed from: a  reason: collision with root package name */
        private String f6636a;
        @JsonNode(key = "oaid")

        /* renamed from: b  reason: collision with root package name */
        private String f6637b;

        public void a(String str) {
            this.f6636a = str;
        }

        public void b(String str) {
            this.f6637b = str;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class f {
        @JsonNode(key = "id")

        /* renamed from: a  reason: collision with root package name */
        private String f6638a;
        @JsonNode(key = "qty")

        /* renamed from: b  reason: collision with root package name */
        private int f6639b;
        @JsonNode(key = RtspHeaders.Values.SEQ)

        /* renamed from: c  reason: collision with root package name */
        private int f6640c;
        @JsonNode(key = "dlvy")

        /* renamed from: d  reason: collision with root package name */
        private int f6641d;
        @JsonNode(key = "spec")

        /* renamed from: e  reason: collision with root package name */
        private g f6642e;
        @JsonNode(key = "priv")

        /* renamed from: f  reason: collision with root package name */
        private int f6643f;

        public void a(String str) {
            this.f6638a = str;
        }

        public void b(int i4) {
            this.f6640c = i4;
        }

        public void c(int i4) {
            this.f6641d = i4;
        }

        public void d(int i4) {
            this.f6643f = i4;
        }

        public void a(int i4) {
            this.f6639b = i4;
        }

        public void a(g gVar) {
            this.f6642e = gVar;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class g {
        @JsonNode(key = "placement")

        /* renamed from: a  reason: collision with root package name */
        private h f6644a;

        public void a(h hVar) {
            this.f6644a = hVar;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class h {
        @JsonNode(key = "tagid")

        /* renamed from: a  reason: collision with root package name */
        private String f6645a;
        @JsonNode(key = com.umeng.ccg.a.f64025r)

        /* renamed from: b  reason: collision with root package name */
        private String f6646b;
        @JsonNode(key = "sdkver")

        /* renamed from: c  reason: collision with root package name */
        private String f6647c;
        @JsonNode(key = "reward")

        /* renamed from: d  reason: collision with root package name */
        private int f6648d;

        public void a(String str) {
            this.f6645a = str;
        }

        public void b(String str) {
            this.f6646b = str;
        }

        public void c(String str) {
            this.f6647c = str;
        }

        public void a(int i4) {
            this.f6648d = i4;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class i {
        @JsonNode(key = "id")

        /* renamed from: a  reason: collision with root package name */
        private String f6649a;
        @JsonNode(key = "test")

        /* renamed from: b  reason: collision with root package name */
        private int f6650b;
        @JsonNode(key = "tmax")

        /* renamed from: c  reason: collision with root package name */
        private int f6651c;
        @JsonNode(key = t.f55702u)

        /* renamed from: d  reason: collision with root package name */
        private int f6652d;
        @JsonNode(key = "cur")

        /* renamed from: e  reason: collision with root package name */
        private List<String> f6653e;
        @JsonNode(key = "seat")

        /* renamed from: f  reason: collision with root package name */
        private List<String> f6654f;
        @JsonNode(key = "wseat")

        /* renamed from: g  reason: collision with root package name */
        private int f6655g;
        @JsonNode(key = "item")

        /* renamed from: h  reason: collision with root package name */
        private List<f> f6656h;
        @JsonNode(key = "context")

        /* renamed from: i  reason: collision with root package name */
        private c f6657i;
        @JsonNode(key = "ext")

        /* renamed from: j  reason: collision with root package name */
        private j f6658j;

        public void a(String str) {
            this.f6649a = str;
        }

        public void b(int i4) {
            this.f6651c = i4;
        }

        public void c(int i4) {
            this.f6652d = i4;
        }

        public void d(int i4) {
            this.f6655g = i4;
        }

        public void a(int i4) {
            this.f6650b = i4;
        }

        public void b(List<String> list) {
            this.f6654f = list;
        }

        public void c(List<f> list) {
            this.f6656h = list;
        }

        public void a(List<String> list) {
            this.f6653e = list;
        }

        public void a(c cVar) {
            this.f6657i = cVar;
        }

        public void a(j jVar) {
            this.f6658j = jVar;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class j {
        @JsonNode(key = "seat")

        /* renamed from: a  reason: collision with root package name */
        private List<k> f6659a;

        public void a(List<k> list) {
            this.f6659a = list;
        }
    }

    /* compiled from: BidS2SRequestModel.java */
    /* loaded from: classes2.dex */
    public static class k {
        @JsonNode(key = "seatid")

        /* renamed from: a  reason: collision with root package name */
        private String f6660a;
        @JsonNode(key = "seatname")

        /* renamed from: b  reason: collision with root package name */
        private String f6661b;
        @JsonNode(key = "seatappid")

        /* renamed from: c  reason: collision with root package name */
        private String f6662c;
        @JsonNode(key = "seattagid")

        /* renamed from: d  reason: collision with root package name */
        private String f6663d;
        @JsonNode(key = "token")

        /* renamed from: e  reason: collision with root package name */
        private String f6664e;
        @JsonNode(key = "sdkInfo")

        /* renamed from: f  reason: collision with root package name */
        private String f6665f;

        public void a(String str) {
            this.f6660a = str;
        }

        public void b(String str) {
            this.f6661b = str;
        }

        public void c(String str) {
            this.f6662c = str;
        }

        public void d(String str) {
            this.f6663d = str;
        }

        public void e(String str) {
            this.f6664e = str;
        }

        public void f(String str) {
            this.f6665f = str;
        }
    }

    public void a(i iVar) {
        this.f6614a = iVar;
    }
}
