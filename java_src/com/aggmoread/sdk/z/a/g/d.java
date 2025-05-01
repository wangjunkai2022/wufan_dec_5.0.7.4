package com.aggmoread.sdk.z.a.g;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f2093a;

    /* renamed from: b  reason: collision with root package name */
    private String f2094b;

    /* renamed from: c  reason: collision with root package name */
    private String f2095c;

    /* renamed from: d  reason: collision with root package name */
    private String f2096d;

    /* renamed from: e  reason: collision with root package name */
    private String f2097e;

    /* renamed from: f  reason: collision with root package name */
    private String f2098f;

    /* renamed from: g  reason: collision with root package name */
    private int f2099g;

    /* renamed from: h  reason: collision with root package name */
    private String f2100h;

    /* renamed from: i  reason: collision with root package name */
    private int f2101i;

    /* renamed from: j  reason: collision with root package name */
    private String f2102j;

    /* renamed from: k  reason: collision with root package name */
    private int f2103k;

    /* renamed from: l  reason: collision with root package name */
    private String f2104l;

    /* renamed from: m  reason: collision with root package name */
    private String f2105m;

    /* renamed from: n  reason: collision with root package name */
    private String f2106n;

    /* renamed from: o  reason: collision with root package name */
    private a f2107o = com.aggmoread.sdk.z.a.h.a.d().b();

    private boolean a(String str) {
        return str == null || str.isEmpty();
    }

    private boolean a(String str, String str2) {
        return str == null || str.isEmpty() || str.equals("unknown");
    }

    public static String b(Context context) {
        int i4 = context.getResources().getConfiguration().orientation;
        return i4 == 2 ? "L" : i4 == 1 ? "P" : "U";
    }

    public JSONObject a(Context context) {
        this.f2093a = this.f2107o.h();
        this.f2098f = this.f2107o.i();
        this.f2094b = this.f2107o.k();
        this.f2095c = this.f2107o.a();
        this.f2105m = this.f2107o.s();
        this.f2100h = this.f2107o.p();
        this.f2101i = this.f2107o.z() ? 2 : 1;
        this.f2102j = this.f2107o.v();
        this.f2099g = 1;
        this.f2103k = b(context).equals("L") ? 2 : b(context).equals("P") ? 1 : 0;
        this.f2104l = this.f2107o.d();
        this.f2096d = this.f2107o.m();
        this.f2097e = this.f2107o.x();
        this.f2106n = this.f2107o.o();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a(this.f2093a) ? this.f2095c : this.f2093a;
            jSONObject.put("imei", str);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("imeiMd5", com.aggmoread.sdk.z.a.j.g.a(str.toLowerCase()));
            }
            jSONObject.put("mac", this.f2094b);
            jSONObject.put("androidId", this.f2095c);
            if (!TextUtils.isEmpty(this.f2095c)) {
                jSONObject.put("androidIdMd5", com.aggmoread.sdk.z.a.j.g.a(this.f2095c.toLowerCase()));
            }
            jSONObject.put("oaid", a(this.f2106n) ? com.aggmoread.sdk.z.a.h.c.f2141o : this.f2106n);
            jSONObject.put("model", this.f2096d);
            jSONObject.put("vendor", this.f2097e);
            jSONObject.put("screenWidth", this.f2107o.y());
            jSONObject.put("screenHeight", this.f2107o.g());
            jSONObject.put("osType", this.f2099g);
            jSONObject.put("osVersion", this.f2100h);
            jSONObject.put("deviceType", this.f2101i);
            jSONObject.put(aw.f63373d, this.f2102j);
            jSONObject.put("ppi", this.f2107o.r());
            jSONObject.put("screenOrientation", this.f2103k);
            jSONObject.put("serialNo", a(this.f2105m, "unknown") ? this.f2095c : this.f2105m);
            jSONObject.put("brand", this.f2104l);
            jSONObject.put("imsi", this.f2098f);
            jSONObject.put("updateMark", this.f2107o.w());
            jSONObject.put("bootMark", this.f2107o.c());
            jSONObject.put("systemBootTimeMilliSec", this.f2107o.t());
            jSONObject.put("deviceNameMd5", com.aggmoread.sdk.z.a.j.g.a(this.f2096d));
            jSONObject.put("physicalMemoryKBytes", this.f2107o.l());
            jSONObject.put("hardDiskSizeKBytes", this.f2107o.f());
            jSONObject.put("systemUpdateTimeNanoSec", this.f2107o.u());
            jSONObject.put("boardModel", this.f2107o.b());
            jSONObject.put("apiLevel", this.f2107o.q());
            jSONObject.put("density", this.f2107o.e());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "JuHeApiDevice{imei='" + this.f2093a + "', mac='" + this.f2094b + "', androidId='" + this.f2095c + "', model='" + this.f2096d + "', vendor='" + this.f2097e + "', osType=" + this.f2099g + ", osVersion='" + this.f2100h + "', deviceType=" + this.f2101i + ", ua='" + this.f2102j + "', screenOrientation=" + this.f2103k + ", brand='" + this.f2104l + "', serialNo='" + this.f2105m + "'}";
    }
}
