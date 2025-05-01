package com.tencent.stat.common;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.tencent.stat.StatConfig;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
/* loaded from: classes6.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    String f62936a;

    /* renamed from: b  reason: collision with root package name */
    String f62937b;

    /* renamed from: c  reason: collision with root package name */
    DisplayMetrics f62938c;

    /* renamed from: d  reason: collision with root package name */
    int f62939d;

    /* renamed from: e  reason: collision with root package name */
    String f62940e;

    /* renamed from: f  reason: collision with root package name */
    String f62941f;

    /* renamed from: g  reason: collision with root package name */
    String f62942g;

    /* renamed from: h  reason: collision with root package name */
    String f62943h;

    /* renamed from: i  reason: collision with root package name */
    String f62944i;

    /* renamed from: j  reason: collision with root package name */
    String f62945j;

    /* renamed from: k  reason: collision with root package name */
    String f62946k;

    /* renamed from: l  reason: collision with root package name */
    int f62947l;

    /* renamed from: m  reason: collision with root package name */
    String f62948m;

    /* renamed from: n  reason: collision with root package name */
    Context f62949n;

    /* renamed from: o  reason: collision with root package name */
    private String f62950o;

    /* renamed from: p  reason: collision with root package name */
    private String f62951p;

    /* renamed from: q  reason: collision with root package name */
    private String f62952q;

    /* renamed from: r  reason: collision with root package name */
    private String f62953r;

    private c(Context context) {
        this.f62937b = StatConstants.VERSION;
        this.f62939d = Build.VERSION.SDK_INT;
        this.f62940e = Build.MODEL;
        this.f62941f = Build.MANUFACTURER;
        this.f62942g = Locale.getDefault().getLanguage();
        this.f62947l = 0;
        this.f62948m = null;
        this.f62949n = null;
        this.f62950o = null;
        this.f62951p = null;
        this.f62952q = null;
        this.f62953r = null;
        this.f62949n = context;
        this.f62938c = k.d(context);
        this.f62936a = k.n(context);
        this.f62943h = StatConfig.getInstallChannel(context);
        this.f62944i = k.m(context);
        this.f62945j = TimeZone.getDefault().getID();
        this.f62947l = k.s(context);
        this.f62946k = k.t(context);
        this.f62948m = context.getPackageName();
        if (this.f62939d >= 14) {
            this.f62950o = k.A(context);
        }
        this.f62951p = k.z(context).toString();
        this.f62952q = k.x(context);
        this.f62953r = k.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        jSONObject.put("sr", this.f62938c.widthPixels + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD + this.f62938c.heightPixels);
        k.a(jSONObject, m.a.f71498l, this.f62936a);
        k.a(jSONObject, "ch", this.f62943h);
        k.a(jSONObject, "mf", this.f62941f);
        k.a(jSONObject, m.a.f71496j, this.f62937b);
        k.a(jSONObject, "ov", Integer.toString(this.f62939d));
        jSONObject.put(bm.f63463x, 1);
        k.a(jSONObject, "op", this.f62944i);
        k.a(jSONObject, "lg", this.f62942g);
        k.a(jSONObject, "md", this.f62940e);
        k.a(jSONObject, "tz", this.f62945j);
        int i4 = this.f62947l;
        if (i4 != 0) {
            jSONObject.put("jb", i4);
        }
        k.a(jSONObject, "sd", this.f62946k);
        k.a(jSONObject, "apn", this.f62948m);
        if (k.h(this.f62949n)) {
            JSONObject jSONObject2 = new JSONObject();
            k.a(jSONObject2, "bs", k.C(this.f62949n));
            k.a(jSONObject2, "ss", k.D(this.f62949n));
            if (jSONObject2.length() > 0) {
                k.a(jSONObject, "wf", jSONObject2.toString());
            }
        }
        k.a(jSONObject, "sen", this.f62950o);
        k.a(jSONObject, bm.f63462w, this.f62951p);
        k.a(jSONObject, "ram", this.f62952q);
        k.a(jSONObject, "rom", this.f62953r);
    }
}
