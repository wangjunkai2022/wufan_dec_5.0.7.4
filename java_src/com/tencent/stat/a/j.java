package com.tencent.stat.a;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class j extends e {

    /* renamed from: a  reason: collision with root package name */
    Long f62918a;

    /* renamed from: l  reason: collision with root package name */
    String f62919l;

    /* renamed from: m  reason: collision with root package name */
    String f62920m;

    public j(Context context, String str, String str2, int i4, Long l4) {
        super(context, i4);
        this.f62918a = null;
        this.f62920m = str;
        this.f62919l = str2;
        this.f62918a = l4;
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.PAGE_VIEW;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        com.tencent.stat.common.k.a(jSONObject, "pi", this.f62919l);
        com.tencent.stat.common.k.a(jSONObject, "rf", this.f62920m);
        Long l4 = this.f62918a;
        if (l4 != null) {
            jSONObject.put(com.umeng.analytics.pro.f.ac, l4);
            return true;
        }
        return true;
    }
}
