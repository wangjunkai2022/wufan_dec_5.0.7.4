package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f64735a = {"com.bly.dkplat", "com.by.chaos", "com.lbe.parallel", "com.excelliance.dualaid", "com.excelliance.multiaccounts", "com.lody.virtual", "com.qihoo.magic"};

    public static String a(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            Method declaredMethod = cls.getDeclaredMethod("getAndroidId", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static void a(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        String b5 = b(str);
        if (context == null || b5 == null || TextUtils.isEmpty(b5) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("mac", b5).commit();
    }

    public static String b(Context context) {
        SharedPreferences a5;
        if (context == null || (a5 = a.a(context)) == null) {
            return "";
        }
        String string = a5.getString("inputDomain", "");
        return c(string) ? a(string) : string;
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static void b(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        String b5 = b(str);
        if (context == null || b5 == null || TextUtils.isEmpty(b5) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("oaid", b5).commit();
    }

    public static String c(Context context) {
        SharedPreferences a5;
        return (context == null || (a5 = a.a(context)) == null) ? "" : a5.getString("uabc", "");
    }

    public static void c(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        if (context == null || TextUtils.isEmpty(str) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("resetToken", str).commit();
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(b(a(str)));
    }

    public static String d(Context context) {
        SharedPreferences a5;
        if (context == null || (a5 = a.a(context)) == null) {
            return null;
        }
        return a5.getString("aaid", null);
    }

    public static void d(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        if (context == null || TextUtils.isEmpty(str) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("uabc", str).commit();
    }

    public static String e(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            Method declaredMethod = cls.getDeclaredMethod("getMac", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void e(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("aaid", str).commit();
    }

    public static String f(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            Method declaredMethod = cls.getDeclaredMethod("getOaid", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void f(Context context, String str) {
        SharedPreferences a5;
        SharedPreferences.Editor edit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (a5 = a.a(context)) == null || (edit = a5.edit()) == null) {
            return;
        }
        edit.putString("zdata", str).commit();
    }

    public static boolean g(Context context) {
        boolean z4;
        try {
            String path = context.getFilesDir().getPath();
            for (String str : f64735a) {
                if (path.contains(str)) {
                    z4 = true;
                    break;
                }
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
        z4 = false;
        return z4;
    }

    public static boolean h(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.utils.UMUtils");
            Method declaredMethod = cls.getDeclaredMethod("isMainProgress", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(cls, context)).booleanValue();
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean i(Context context) {
        NetworkInfo networkInfo;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkInfo = connectivityManager.getNetworkInfo(17)) != null) {
                    return networkInfo.isConnected();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        int port;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                str = System.getProperty("http.proxyHost");
                String property = System.getProperty("http.proxyPort");
                if (property == null) {
                    property = "-1";
                }
                port = Integer.parseInt(property);
            } else {
                String host = Proxy.getHost(context);
                port = Proxy.getPort(context);
                str = host;
            }
            return (TextUtils.isEmpty(str) || port == -1) ? false : true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
