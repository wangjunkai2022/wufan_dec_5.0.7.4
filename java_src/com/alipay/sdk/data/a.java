package com.alipay.sdk.data;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.util.i;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f4852c = 3500;

    /* renamed from: d  reason: collision with root package name */
    public static final String f4853d = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";

    /* renamed from: e  reason: collision with root package name */
    public static final int f4854e = 1000;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4855f = 20000;

    /* renamed from: g  reason: collision with root package name */
    public static final String f4856g = "alipay_cashier_dynamic_config";

    /* renamed from: h  reason: collision with root package name */
    public static final String f4857h = "timeout";

    /* renamed from: i  reason: collision with root package name */
    public static final String f4858i = "st_sdk_config";

    /* renamed from: j  reason: collision with root package name */
    public static final String f4859j = "tbreturl";

    /* renamed from: k  reason: collision with root package name */
    private static a f4860k;

    /* renamed from: a  reason: collision with root package name */
    private int f4861a = f4852c;

    /* renamed from: b  reason: collision with root package name */
    public String f4862b = f4853d;

    private static /* synthetic */ void c(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeout", aVar.a());
            jSONObject.put(f4859j, aVar.f4862b);
            i.c(m.b.b().f71504a, f4856g, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static a f() {
        if (f4860k == null) {
            a aVar = new a();
            f4860k = aVar;
            aVar.e(i.b(m.b.b().f71504a, f4856g));
        }
        return f4860k;
    }

    private String g() {
        return this.f4862b;
    }

    private void h() {
        e(i.b(m.b.b().f71504a, f4856g));
    }

    private void i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeout", a());
            jSONObject.put(f4859j, this.f4862b);
            i.c(m.b.b().f71504a, f4856g, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public final int a() {
        int i4 = this.f4861a;
        return (i4 < 1000 || i4 > 20000) ? f4852c : this.f4861a;
    }

    public final void b(Context context) {
        new Thread(new b(this, context)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(f4858i);
            this.f4861a = optJSONObject.optInt("timeout", f4852c);
            this.f4862b = optJSONObject.optString(f4859j, f4853d).trim();
        } catch (Throwable unused) {
        }
    }
}
