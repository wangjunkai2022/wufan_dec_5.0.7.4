package com.umeng.powersdk;

import android.app.Activity;
import android.os.BatteryManager;
import android.os.Build;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    int f64703a;

    /* renamed from: b  reason: collision with root package name */
    int f64704b;

    /* renamed from: c  reason: collision with root package name */
    int f64705c;

    /* renamed from: d  reason: collision with root package name */
    WeakReference<Activity> f64706d;

    /* renamed from: e  reason: collision with root package name */
    boolean f64707e;

    /* renamed from: f  reason: collision with root package name */
    int f64708f;

    /* renamed from: g  reason: collision with root package name */
    boolean f64709g;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f64719a = new c((byte) 0);
    }

    private c() {
        this.f64703a = 1;
        this.f64704b = 0;
        this.f64705c = 0;
        this.f64707e = true;
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    final JSONObject a() {
        BatteryManager batteryManager;
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 21 && (batteryManager = (BatteryManager) PowerManager.getApplicationContext().getSystemService("batterymanager")) != null) {
                float longProperty = (float) batteryManager.getLongProperty(2);
                if (longProperty >= 10000.0f || longProperty <= -10000.0f) {
                    longProperty /= 1000.0f;
                }
                jSONObject.put("ci", Math.abs(longProperty));
            }
        } catch (Throwable unused) {
        }
        try {
            com.umeng.powersdk.a a5 = b.a(PowerManager.getApplicationContext()).a();
            jSONObject.put("le", a5.f64695a);
            jSONObject.put("vo", a5.f64696b);
            jSONObject.put("te", a5.f64697c);
            jSONObject.put("st", a5.f64698d);
            jSONObject.put("ch", a5.f64699e);
            jSONObject.put("ts", a5.f64700f);
            try {
                long longValue = ((Long) GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap().get("stime")).longValue();
                if (longValue > 0) {
                    jSONObject.put("ptime", System.currentTimeMillis() - longValue);
                }
            } catch (Throwable unused2) {
            }
            WeakReference<Activity> weakReference = this.f64706d;
            if (weakReference != null) {
                jSONObject.put("c_act", weakReference.get().getClass().getName());
            }
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }
}
