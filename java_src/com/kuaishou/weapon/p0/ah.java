package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Proxy;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55238a = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=";

    /* renamed from: b  reason: collision with root package name */
    private final String f55239b = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy";

    /* renamed from: c  reason: collision with root package name */
    private final String f55240c = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl";

    /* renamed from: d  reason: collision with root package name */
    private final String f55241d = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==";

    /* renamed from: e  reason: collision with root package name */
    private final String f55242e = "SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=";

    private void b(JSONObject jSONObject, int i4) {
        try {
            Object a5 = dh.a(new String(c.a(f55238a.getBytes(), 2)), (Object) null, "getPackageManager", new Object[0]);
            if (a5 != null) {
                a(a5, jSONObject, i4);
            }
        } catch (Exception unused) {
        }
    }

    private void c(JSONObject jSONObject, int i4) {
        Object a5;
        Object a6;
        try {
            if (Build.VERSION.SDK_INT < 29 || (a5 = dh.a(new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==".getBytes(), 2)), new String(c.a("SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=".getBytes(), 2)))) == null || (a6 = dh.a("android.util.Singleton", a5, "get", new Object[0])) == null) {
                return;
            }
            a(a6, jSONObject, i4);
        } catch (Exception unused) {
        }
    }

    private void d(JSONObject jSONObject, int i4) {
        Object a5;
        try {
            Object a6 = dh.a(new String(c.a(f55238a.getBytes(), 2)), (Object) null, InstrumentationProxy.f64869e, new Object[0]);
            if (a6 == null || (a5 = dh.a(a6.getClass(), a6, InstrumentationProxy.f64870f)) == null) {
                return;
            }
            a(a5, jSONObject, i4);
        } catch (Exception unused) {
        }
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject, 0);
            a(jSONObject, 1);
            c(jSONObject, 2);
            d(jSONObject, 3);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(JSONObject jSONObject, int i4) {
        Object a5;
        Object a6;
        try {
            String str = new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy".getBytes(), 2));
            String str2 = new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl".getBytes(), 2));
            if (Build.VERSION.SDK_INT >= 26) {
                a5 = dh.a(str, "IActivityManagerSingleton");
            } else {
                a5 = dh.a(str2, "gDefault");
            }
            if (a5 == null || (a6 = dh.a("android.util.Singleton", a5, "get", new Object[0])) == null) {
                return;
            }
            a(a6, jSONObject, i4);
        } catch (Exception unused) {
        }
    }

    private boolean a(Object obj, JSONObject jSONObject, int i4) {
        if (jSONObject != null) {
            try {
                boolean isProxyClass = Proxy.isProxyClass(obj.getClass());
                String name = obj.getClass().getName();
                int i5 = 1;
                if (isProxyClass) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i4);
                    String sb2 = sb.toString();
                    if (!isProxyClass) {
                        i5 = 0;
                    }
                    jSONObject.put(sb2, i5);
                    jSONObject.put(i4 + "-c", name);
                } else if (i4 == 3 && !name.contains("Instrumentation")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i4);
                    String sb4 = sb3.toString();
                    if (!isProxyClass) {
                        i5 = 0;
                    }
                    jSONObject.put(sb4, i5);
                    jSONObject.put(i4 + "-c", name);
                }
                return isProxyClass;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public JSONObject a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            PackageManager packageManager = context.getPackageManager();
            Object a5 = dh.a(packageManager.getClass(), packageManager, "mPM");
            if (a5 != null) {
                if (a(a5, jSONObject, 0)) {
                    return jSONObject;
                }
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
