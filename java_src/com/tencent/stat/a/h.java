package com.tencent.stat.a;

import android.content.Context;
import com.tencent.stat.StatAppMonitor;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class h extends e {

    /* renamed from: l  reason: collision with root package name */
    private static String f62912l;

    /* renamed from: m  reason: collision with root package name */
    private static String f62913m;

    /* renamed from: a  reason: collision with root package name */
    private StatAppMonitor f62914a;

    public h(Context context, int i4, StatAppMonitor statAppMonitor) {
        super(context, i4);
        this.f62914a = null;
        this.f62914a = statAppMonitor.m27clone();
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.MONITOR_STAT;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        StatAppMonitor statAppMonitor = this.f62914a;
        if (statAppMonitor == null) {
            return false;
        }
        jSONObject.put("na", statAppMonitor.getInterfaceName());
        jSONObject.put("rq", this.f62914a.getReqSize());
        jSONObject.put("rp", this.f62914a.getRespSize());
        jSONObject.put("rt", this.f62914a.getResultType());
        jSONObject.put("tm", this.f62914a.getMillisecondsConsume());
        jSONObject.put("rc", this.f62914a.getReturnCode());
        jSONObject.put("sp", this.f62914a.getSampling());
        if (f62913m == null) {
            f62913m = com.tencent.stat.common.k.r(this.f62900k);
        }
        com.tencent.stat.common.k.a(jSONObject, m.a.f71498l, f62913m);
        if (f62912l == null) {
            f62912l = com.tencent.stat.common.k.m(this.f62900k);
        }
        com.tencent.stat.common.k.a(jSONObject, "op", f62912l);
        jSONObject.put("cn", com.tencent.stat.common.k.p(this.f62900k));
        return true;
    }
}
