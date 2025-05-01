package com.ss.android.downloadlib.n;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.join.mgps.data.c;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.n.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0616vv implements InvocationHandler {
        private Object vv;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if ("startActivity".contains(method.getName())) {
                    vv.vv(objArr);
                }
            } catch (Throwable unused) {
            }
            return method.invoke(this.vv, objArr);
        }

        private C0616vv(Object obj) {
            this.vv = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        Field declaredField;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } else {
                declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                return;
            }
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new C0616vv(obj2)));
        } catch (Throwable unused) {
        }
    }

    public static String vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.vv.p.vv(new File(str));
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = com.ss.android.downloadlib.addownload.b.getContext().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.sourceDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int vv(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 5;
        }
        return com.ss.android.vv.p.vv(str, new File(str2));
    }

    public static void vv() {
        if (com.ss.android.downloadlib.addownload.b.wv().optInt("hook", 0) != 1) {
            return;
        }
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.vv.1
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.u.o.qv();
                vv.p();
            }
        }, c.f49010a);
    }

    public static void vv(Object[] objArr) {
        if (com.ss.android.downloadlib.addownload.b.wv().optInt("hook", 0) == 1 && (objArr[1] instanceof String) && (objArr[2] instanceof Intent)) {
            Intent intent = (Intent) objArr[2];
            if ("android.intent.action.VIEW".equals(intent.getAction()) && com.ss.android.socialbase.downloader.constants.o.vv.equals(intent.getType())) {
                if (com.ss.android.socialbase.appdownloader.u.o.i()) {
                    String optString = com.ss.android.downloadlib.addownload.b.wv().optString("hook_vivo_arg", "com.android.settings");
                    if ("null".equals(optString)) {
                        return;
                    }
                    objArr[1] = optString;
                } else if (com.ss.android.socialbase.appdownloader.u.o.o()) {
                    JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
                    String optString2 = wv.optString("hook_kllk_arg1", "com." + com.ss.android.socialbase.downloader.constants.o.f60949p + ".market");
                    if (!"null".equals(optString2)) {
                        objArr[1] = optString2;
                    }
                    String optString3 = com.ss.android.downloadlib.addownload.b.wv().optString("hook_kllk_arg2", "com.android.browser");
                    JSONObject wv2 = com.ss.android.downloadlib.addownload.b.wv();
                    String optString4 = wv2.optString("hook_kllk_arg3", "m.store." + com.ss.android.socialbase.downloader.constants.o.f60949p + "mobile.com");
                    intent.putExtra(com.ss.android.socialbase.downloader.constants.o.f60949p + "_extra_pkg_name", optString3);
                    intent.putExtra("refererHost", optString4);
                    if (com.ss.android.downloadlib.addownload.b.wv().optInt("hook_kllk_arg4", 0) == 1) {
                        Intent intent2 = new Intent();
                        intent2.putExtra(com.ss.android.socialbase.downloader.constants.o.f60949p + "_extra_pkg_name", optString3);
                        intent2.putExtra("refererHost", optString4);
                        intent.putExtra("android.intent.extra.INTENT", intent2);
                    }
                } else if (com.ss.android.socialbase.appdownloader.u.o.vv()) {
                    String optString5 = com.ss.android.downloadlib.addownload.b.wv().optString("hook_huawei_arg1", "com.huawei.appmarket");
                    if (!"null".equals(optString5)) {
                        objArr[1] = optString5;
                    }
                    intent.putExtra("caller_package", com.ss.android.downloadlib.addownload.b.wv().optString("hook_huawei_arg2", "com.huawei.appmarket"));
                }
            }
        }
    }
}
