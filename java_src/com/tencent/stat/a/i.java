package com.tencent.stat.a;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class i extends e {

    /* renamed from: a  reason: collision with root package name */
    private static String f62915a;

    /* renamed from: l  reason: collision with root package name */
    private String f62916l;

    /* renamed from: m  reason: collision with root package name */
    private String f62917m;

    public i(Context context, int i4) {
        super(context, i4);
        this.f62916l = null;
        this.f62917m = null;
        this.f62916l = com.tencent.stat.common.k.p(context);
        if (f62915a == null) {
            f62915a = com.tencent.stat.common.k.m(context);
        }
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.NETWORK_MONITOR;
    }

    public void a(String str) {
        this.f62917m = str;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        com.tencent.stat.common.k.a(jSONObject, "op", f62915a);
        com.tencent.stat.common.k.a(jSONObject, "cn", this.f62916l);
        jSONObject.put("sp", this.f62917m);
        return true;
    }
}
