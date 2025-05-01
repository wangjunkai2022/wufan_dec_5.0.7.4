package com.kuaishou.weapon.p0;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class cm {

    /* renamed from: a  reason: collision with root package name */
    private String f55437a;

    /* renamed from: b  reason: collision with root package name */
    private String f55438b;

    /* renamed from: c  reason: collision with root package name */
    private String f55439c;

    /* renamed from: d  reason: collision with root package name */
    private String f55440d;

    /* renamed from: e  reason: collision with root package name */
    private String f55441e;

    /* renamed from: f  reason: collision with root package name */
    private String f55442f;

    /* renamed from: g  reason: collision with root package name */
    private String f55443g;

    /* renamed from: h  reason: collision with root package name */
    private String f55444h;

    /* renamed from: i  reason: collision with root package name */
    private String f55445i;

    /* renamed from: j  reason: collision with root package name */
    private String f55446j;

    /* renamed from: k  reason: collision with root package name */
    private String f55447k;

    /* renamed from: l  reason: collision with root package name */
    private String f55448l;

    public cm(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        this.f55445i = sb.toString();
        this.f55439c = str;
        this.f55443g = str2;
    }

    public static String m() {
        try {
            return !TextUtils.isEmpty(WeaponHI.skProductName) ? WeaponHI.skProductName : "UNKNOWN_PRODUCT";
        } catch (Exception unused) {
            return "UNKNOWN_PRODUCT";
        }
    }

    private JSONObject n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("1", this.f55437a);
            jSONObject.put("2", this.f55438b);
            jSONObject.put("3", this.f55439c);
            jSONObject.put("4", this.f55440d);
            jSONObject.put("5", this.f55441e);
            jSONObject.put("6", this.f55442f);
            jSONObject.put("7", this.f55443g);
            jSONObject.put("8", this.f55444h);
            jSONObject.put("9", this.f55445i);
            jSONObject.put("11", this.f55446j);
            jSONObject.put("12", this.f55448l);
            jSONObject.put("13", "com.kuaishou.weapon");
            jSONObject.put("14", WeaponHI.sKSSdkver);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String a() {
        return this.f55437a;
    }

    public String b() {
        return this.f55438b;
    }

    public String c() {
        return this.f55439c;
    }

    public String d() {
        return this.f55440d;
    }

    public String e() {
        return this.f55441e;
    }

    public String f() {
        return this.f55442f;
    }

    public String g() {
        return this.f55443g;
    }

    public String h() {
        return this.f55444h;
    }

    public String i() {
        return this.f55445i;
    }

    public String j() {
        return this.f55446j;
    }

    public String k() {
        return this.f55447k;
    }

    public String l() {
        return this.f55448l;
    }

    public void a(String str) {
        this.f55437a = str;
    }

    public void b(String str) {
        this.f55438b = str;
    }

    public void c(String str) {
        this.f55439c = str;
    }

    public void d(String str) {
        this.f55440d = str;
    }

    public void e(String str) {
        this.f55441e = str;
    }

    public void f(String str) {
        this.f55442f = str;
    }

    public void g(String str) {
        this.f55443g = str;
    }

    public void h(String str) {
        this.f55444h = str;
    }

    public void i(String str) {
        this.f55445i = str;
    }

    public void j(String str) {
        this.f55446j = str;
    }

    public void k(String str) {
        this.f55447k = str;
    }

    public void l(String str) {
        this.f55448l = str;
    }

    public static String b(Context context) {
        try {
            String str = WeaponHI.sKDeviceId;
            if (!TextUtils.isEmpty(str)) {
                bi.f55329v = 1;
                return str;
            }
        } catch (Exception unused) {
        }
        try {
            h a5 = h.a(context, "re_po_rt");
            boolean e5 = a5.e("a1_p_s_p_s");
            boolean e6 = a5.e("a1_p_s_p_s_c_b");
            if (e5 || e6) {
                String str2 = "ANDROID_" + Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (!TextUtils.isEmpty(str2)) {
                    bi.f55329v = 3;
                    return str2;
                }
            }
        } catch (Exception unused2) {
        }
        bi.f55329v = 4;
        return "";
    }

    public JSONObject a(Context context) {
        try {
            a(b(context));
            b(m());
            d(bh.q(context));
            e(bh.r(context));
            f(bh.s(context));
            h("5.3.6");
            j(bt.a(context));
            l(WeaponHI.sKSAppkey);
            return n();
        } catch (Throwable unused) {
            return null;
        }
    }
}
