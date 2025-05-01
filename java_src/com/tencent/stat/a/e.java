package com.tencent.stat.a;

import android.content.Context;
import com.tencent.stat.DeviceInfo;
import com.tencent.stat.StatConfig;
import com.tencent.stat.n;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f62890a;

    /* renamed from: b  reason: collision with root package name */
    protected String f62891b;

    /* renamed from: d  reason: collision with root package name */
    protected int f62893d;

    /* renamed from: e  reason: collision with root package name */
    protected DeviceInfo f62894e;

    /* renamed from: f  reason: collision with root package name */
    protected int f62895f;

    /* renamed from: g  reason: collision with root package name */
    protected String f62896g;

    /* renamed from: h  reason: collision with root package name */
    protected String f62897h;

    /* renamed from: i  reason: collision with root package name */
    protected String f62898i;

    /* renamed from: k  reason: collision with root package name */
    protected Context f62900k;

    /* renamed from: j  reason: collision with root package name */
    protected String f62899j = null;

    /* renamed from: c  reason: collision with root package name */
    protected long f62892c = System.currentTimeMillis() / 1000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, int i4) {
        this.f62891b = null;
        this.f62894e = null;
        this.f62896g = null;
        this.f62897h = null;
        this.f62898i = null;
        this.f62900k = context;
        this.f62893d = i4;
        this.f62891b = StatConfig.getAppKey(context);
        this.f62896g = StatConfig.getCustomUserId(context);
        this.f62894e = n.a(context).b(context);
        this.f62895f = com.tencent.stat.common.k.w(context).intValue();
        this.f62898i = com.tencent.stat.common.k.n(context);
        this.f62897h = StatConfig.getInstallChannel(context);
    }

    public abstract f a();

    public abstract boolean a(JSONObject jSONObject);

    public long b() {
        return this.f62892c;
    }

    public boolean b(JSONObject jSONObject) {
        try {
            com.tencent.stat.common.k.a(jSONObject, "ky", this.f62891b);
            jSONObject.put("et", a().a());
            DeviceInfo deviceInfo = this.f62894e;
            if (deviceInfo != null) {
                jSONObject.put(DeviceInfo.TAG_IMEI, deviceInfo.getImei());
                com.tencent.stat.common.k.a(jSONObject, "mc", this.f62894e.getMac());
                jSONObject.put("ut", this.f62894e.getUserType());
            }
            com.tencent.stat.common.k.a(jSONObject, "cui", this.f62896g);
            if (a() != f.SESSION_ENV) {
                com.tencent.stat.common.k.a(jSONObject, m.a.f71498l, this.f62898i);
                com.tencent.stat.common.k.a(jSONObject, "ch", this.f62897h);
            }
            com.tencent.stat.common.k.a(jSONObject, DeviceInfo.TAG_MID, StatConfig.getMid(this.f62900k));
            jSONObject.put("idx", this.f62895f);
            jSONObject.put("si", this.f62893d);
            jSONObject.put("ts", this.f62892c);
            if (this.f62894e.getUserType() == 0 && com.tencent.stat.common.k.E(this.f62900k) == 1) {
                jSONObject.put("ia", 1);
            }
            return a(jSONObject);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Context c() {
        return this.f62900k;
    }

    public String d() {
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
