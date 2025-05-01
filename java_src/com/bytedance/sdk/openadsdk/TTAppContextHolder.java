package com.bytedance.sdk.openadsdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.p;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class TTAppContextHolder {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class vv {
        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application vv;

        static {
            try {
                Object m4 = m();
                vv = (Application) m4.getClass().getMethod("getApplication", new Class[0]).invoke(m4, new Object[0]);
                p.i("MyApplication", "application get success");
            } catch (Throwable th) {
                p.p("MyApplication", "application get failed", th);
            }
        }

        private static Object m() {
            try {
                Method method = Class.forName(InstrumentationProxy.f64868d).getMethod(InstrumentationProxy.f64869e, new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                p.p("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        public static Application vv() {
            return vv;
        }
    }

    public static Context getContext() {
        if (vv == null) {
            setContext(null);
        }
        return vv;
    }

    public static synchronized void setContext(Context context) {
        synchronized (TTAppContextHolder.class) {
            if (vv == null) {
                if (context != null) {
                    vv = context.getApplicationContext();
                } else if (vv.vv() != null) {
                    try {
                        Application vv2 = vv.vv();
                        vv = vv2;
                        if (vv2 != null) {
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
