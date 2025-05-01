package com.alipay.sdk.authjs;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f4785g = "CallInfo";

    /* renamed from: h  reason: collision with root package name */
    public static final String f4786h = "call";

    /* renamed from: i  reason: collision with root package name */
    public static final String f4787i = "callback";

    /* renamed from: j  reason: collision with root package name */
    public static final String f4788j = "bundleName";

    /* renamed from: k  reason: collision with root package name */
    public static final String f4789k = "clientId";

    /* renamed from: l  reason: collision with root package name */
    public static final String f4790l = "param";

    /* renamed from: m  reason: collision with root package name */
    public static final String f4791m = "func";

    /* renamed from: n  reason: collision with root package name */
    public static final String f4792n = "msgType";

    /* renamed from: a  reason: collision with root package name */
    public String f4793a;

    /* renamed from: b  reason: collision with root package name */
    public String f4794b;

    /* renamed from: c  reason: collision with root package name */
    public String f4795c;

    /* renamed from: d  reason: collision with root package name */
    public String f4796d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f4797e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4798f = false;

    /* renamed from: com.alipay.sdk.authjs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0158a {
        NONE_ERROR,
        FUNCTION_NOT_FOUND,
        INVALID_PARAMETER,
        RUNTIME_ERROR,
        NONE_PERMISS
    }

    public a(String str) {
        this.f4796d = str;
    }

    private static String a(EnumC0158a enumC0158a) {
        int i4 = b.f4805a[enumC0158a.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "none" : "runtime error" : "invalid parameter" : "function not found";
    }

    private void b(String str) {
        this.f4793a = str;
    }

    private void c(JSONObject jSONObject) {
        this.f4797e = jSONObject;
    }

    private void d(boolean z4) {
        this.f4798f = z4;
    }

    private boolean e() {
        return this.f4798f;
    }

    private String f() {
        return this.f4793a;
    }

    private void g(String str) {
        this.f4794b = str;
    }

    private String h() {
        return this.f4794b;
    }

    private void i(String str) {
        this.f4795c = str;
    }

    private String j() {
        return this.f4795c;
    }

    private void k(String str) {
        this.f4796d = str;
    }

    private String l() {
        return this.f4796d;
    }

    private JSONObject m() {
        return this.f4797e;
    }

    private String n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f4789k, this.f4793a);
        jSONObject.put(f4791m, this.f4795c);
        jSONObject.put(f4790l, this.f4797e);
        jSONObject.put(f4792n, this.f4796d);
        return jSONObject.toString();
    }
}
