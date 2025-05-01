package com.bytedance.pangle.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static String f8251b = "request_finish";

    /* renamed from: c  reason: collision with root package name */
    public static String f8252c = "download_start";

    /* renamed from: d  reason: collision with root package name */
    public static String f8253d = "download_finish";

    /* renamed from: e  reason: collision with root package name */
    public static String f8254e = "install_start";

    /* renamed from: f  reason: collision with root package name */
    public static String f8255f = "install_finish";

    /* renamed from: g  reason: collision with root package name */
    public static String f8256g = "7z_unzip_start";

    /* renamed from: h  reason: collision with root package name */
    public static String f8257h = "7z_unzip_finish";

    /* renamed from: i  reason: collision with root package name */
    public static String f8258i = "load_start";

    /* renamed from: j  reason: collision with root package name */
    public static String f8259j = "load_finish";

    /* renamed from: k  reason: collision with root package name */
    public static String f8260k = "rm_entry_finish";

    /* renamed from: l  reason: collision with root package name */
    private static volatile b f8261l;

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bytedance.pangle.c.a> f8262a = new ArrayList();

    /* loaded from: classes2.dex */
    public static class a {
        public static int A = 32007;
        public static int B = 32008;
        public static int C = 32999;
        public static int D = 40000;
        public static int E = 41000;
        public static int F = 42000;
        public static int G = 50000;
        public static int H = 50004;

        /* renamed from: a  reason: collision with root package name */
        public static int f8263a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static int f8264b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static int f8265c = -1;

        /* renamed from: d  reason: collision with root package name */
        public static int f8266d = -2;

        /* renamed from: e  reason: collision with root package name */
        public static int f8267e = 12000;

        /* renamed from: f  reason: collision with root package name */
        public static int f8268f = 12001;

        /* renamed from: g  reason: collision with root package name */
        public static int f8269g = 12002;

        /* renamed from: h  reason: collision with root package name */
        public static int f8270h = 12003;

        /* renamed from: i  reason: collision with root package name */
        public static int f8271i = 12004;

        /* renamed from: j  reason: collision with root package name */
        public static int f8272j = 20000;

        /* renamed from: k  reason: collision with root package name */
        public static int f8273k = 21000;

        /* renamed from: l  reason: collision with root package name */
        public static int f8274l = 21001;

        /* renamed from: m  reason: collision with root package name */
        public static int f8275m = 21002;

        /* renamed from: n  reason: collision with root package name */
        public static int f8276n = 22000;

        /* renamed from: o  reason: collision with root package name */
        public static int f8277o = 22001;

        /* renamed from: p  reason: collision with root package name */
        public static int f8278p = 22002;

        /* renamed from: q  reason: collision with root package name */
        public static int f8279q = 22999;

        /* renamed from: r  reason: collision with root package name */
        public static int f8280r = 30000;

        /* renamed from: s  reason: collision with root package name */
        public static int f8281s = 31000;

        /* renamed from: t  reason: collision with root package name */
        public static int f8282t = 32000;

        /* renamed from: u  reason: collision with root package name */
        public static int f8283u = 32001;

        /* renamed from: v  reason: collision with root package name */
        public static int f8284v = 32002;

        /* renamed from: w  reason: collision with root package name */
        public static int f8285w = 32003;

        /* renamed from: x  reason: collision with root package name */
        public static int f8286x = 32004;

        /* renamed from: y  reason: collision with root package name */
        public static int f8287y = 32005;

        /* renamed from: z  reason: collision with root package name */
        public static int f8288z = 32006;
    }

    private b() {
    }

    public static b a() {
        if (f8261l == null) {
            synchronized (b.class) {
                f8261l = new b();
            }
        }
        return f8261l;
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        synchronized (this.f8262a) {
            for (com.bytedance.pangle.c.a aVar : this.f8262a) {
                aVar.a(str, jSONObject, jSONObject2, jSONObject3);
            }
        }
    }
}
