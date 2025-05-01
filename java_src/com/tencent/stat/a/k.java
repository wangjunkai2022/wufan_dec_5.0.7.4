package com.tencent.stat.a;

import android.content.Context;
import com.tencent.stat.DeviceInfo;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class k extends e {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.stat.common.a f62921a;

    /* renamed from: l  reason: collision with root package name */
    private JSONObject f62922l;

    public k(Context context, int i4, JSONObject jSONObject) {
        super(context, i4);
        this.f62922l = null;
        this.f62921a = new com.tencent.stat.common.a(context);
        this.f62922l = jSONObject;
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.SESSION_ENV;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        DeviceInfo deviceInfo = this.f62894e;
        if (deviceInfo != null) {
            jSONObject.put("ut", deviceInfo.getUserType());
        }
        JSONObject jSONObject2 = this.f62922l;
        if (jSONObject2 != null) {
            jSONObject.put(com.umeng.ccg.a.f64016i, jSONObject2);
        }
        this.f62921a.a(jSONObject);
        return true;
    }
}
