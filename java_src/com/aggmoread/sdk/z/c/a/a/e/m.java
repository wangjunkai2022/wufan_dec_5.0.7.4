package com.aggmoread.sdk.z.c.a.a.e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.qq.e.comm.managers.status.SDKStatus;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class m {

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3506a;

        static {
            int[] iArr = new int[com.aggmoread.sdk.z.c.a.a.c.i.values().length];
            f3506a = iArr;
            try {
                iArr[com.aggmoread.sdk.z.c.a.a.c.i.REWARD_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static int a(int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        e.a("ecpm  " + i4);
        int i5 = -1;
        if (eVar != null) {
            f fVar = eVar.f3310d;
            double a5 = fVar != null ? fVar.a(e.c.H) : -1.0d;
            if (a5 == 2.0d) {
                return -1;
            }
            int b5 = eVar.f3309c.b(e.c.f3325c0);
            if (b5 > 0) {
                i5 = b5;
            } else if (i4 > 0 && a5 > 0.0d && a5 <= 1.0d) {
                double d5 = i4;
                Double.isNaN(d5);
                i5 = (int) (d5 * a5);
            }
        }
        e.a("price  " + i5);
        return i5;
    }

    public static Activity a(View view) {
        try {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, int i4) {
        String str;
        try {
            if (eVar.d()) {
                str = dVar.f3281y;
            } else {
                e.a("p " + i4);
                f fVar = eVar.f3310d;
                if (fVar != null) {
                    double a5 = fVar.a(e.c.H);
                    if (a5 > 0.0d && a5 <= 1.0d) {
                        double d5 = i4;
                        Double.isNaN(d5);
                        i4 = (int) (d5 * a5);
                    }
                }
                if (i4 < 0) {
                    i4 = -1;
                }
                str = String.valueOf(i4);
            }
        } catch (Exception e5) {
            e.a("rpt err " + e5.getMessage());
            str = "-1";
        }
        e.a("rpt e " + str);
        return str;
    }

    public static String a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        String str;
        int i4;
        try {
            if (eVar.d()) {
                str = dVar.f3281y;
            } else {
                Object obj = map.get(AMConst.ExtrasKey.AD_PRICE);
                e.a("eStr " + obj);
                int i5 = -1;
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    i4 = str2.contains(h0.f27805a) ? (int) Double.parseDouble(str2) : Integer.parseInt((String) obj);
                } else {
                    i4 = -1;
                }
                if (i4 >= 0) {
                    i5 = i4;
                }
                str = String.valueOf(i5);
            }
        } catch (Exception e5) {
            e.a("rpt err " + e5.getMessage());
            str = "-1";
        }
        e.a("rpt exp e " + str);
        return str;
    }

    public static String a(String str, String str2) {
        try {
            String jSONObject = new JSONObject(b(str, str2).toString()).toString();
            e.b("AM3RHTAG", "extras json = " + jSONObject);
            return jSONObject;
        } catch (JSONException e5) {
            e5.printStackTrace();
            e.b("AM3RHTAG", "extra err " + e5.getMessage());
            return "";
        }
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        if (map != null) {
            map.put("EXTRA_network_csj_placementId", "");
        }
        return map;
    }

    public static void a(Map<String, Object> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.put(AMConst.ExtrasKey.AD_TITLE_INFO, str);
    }

    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.b("AM3RHTAG", "UI Thread");
            return true;
        }
        e.b("AM3RHTAG", "Work Thread");
        return false;
    }

    public static boolean a(int i4) {
        return Build.VERSION.SDK_INT <= i4;
    }

    public static boolean a(Context context) {
        boolean z4 = false;
        if (context == null) {
            return false;
        }
        if (context.getApplicationInfo() != null && (context.getApplicationInfo().flags & 2) != 0) {
            z4 = true;
        }
        e.a("deg " + z4);
        return z4;
    }

    public static boolean a(Context context, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (context == null || eVar == null || eVar.f3309c == null || (fVar = eVar.f3310d) == null || fVar.a(e.c.f3349w, 0) == 5) {
            return false;
        }
        String packageName = context.getPackageName();
        String c5 = eVar.f3309c.c(e.c.f3323b0);
        return (TextUtils.isEmpty(c5) || packageName.equals(c5)) ? false : true;
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.c.i iVar) {
        int i4 = a.f3506a[iVar.ordinal()];
        return true;
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (eVar != null && (fVar = eVar.f3310d) != null) {
            int b5 = fVar.b(e.c.G);
            e.b("xxx", "ov = " + b5 + ", bov = 0");
            if (b5 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, int i4) {
        if (eVar != null && j(eVar)) {
            int b5 = eVar.f3309c.b(e.c.f3325c0);
            e.a("ec " + b5);
            if (b5 > 0) {
                return false;
            }
            int b6 = eVar.f3309c.b(e.c.f3321a0);
            e.a("e " + i4 + ", pr " + b6);
            return i4 < b6;
        }
        return false;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int b5 = b(str);
        int b6 = b(c());
        e.a("gdt_ad_mobile " + b6);
        return b6 != 0 && b6 >= b5;
    }

    public static int b(String str) {
        e.b("AM3RHTAG", "pv v " + str);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int parseInt = Integer.parseInt(str.replace(h0.f27805a, ""));
        e.b("AM3RHTAG", "pv i " + parseInt);
        return parseInt;
    }

    public static String b() {
        try {
            Method method = SDKStatus.class.getMethod("getIntegrationSDKVersion", new Class[0]);
            method.setAccessible(true);
            return (String) method.invoke(null, new Object[0]);
        } catch (Exception e5) {
            e.a("AM3RHTAG", "err  = %s", e5);
            if (e5 instanceof NoSuchMethodException) {
                return "unknown";
            }
            return null;
        }
    }

    public static Map<String, String> b(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(ForumPostsTagSelectActivity_.f30896z, str2);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("ext", str);
        }
        e.b("AM3RHTAG", "extra map " + hashMap);
        return hashMap;
    }

    private static boolean b(Context context) {
        int port;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                str = System.getProperty("http.proxyHost");
                String property = System.getProperty("http.proxyPort");
                port = TextUtils.isEmpty(property) ? -1 : Integer.parseInt(property);
            } else {
                String host = Proxy.getHost(context);
                port = Proxy.getPort(context);
                str = host;
            }
            if (port != -1) {
                return !TextUtils.isEmpty(str);
            }
            return false;
        } catch (Exception e5) {
            e.a("proxy err " + e5);
            return false;
        }
    }

    public static boolean b(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        double a5 = eVar.f3310d.a(e.c.J, 1.0d);
        e.a("esr " + a5);
        boolean z4 = a5 >= 1.0d || i.a(a5);
        e.a("esr " + z4);
        return z4;
    }

    public static String c() {
        try {
            Method method = SDKStatus.class.getMethod("getSDKVersion", new Class[0]);
            method.setAccessible(true);
            String str = (String) method.invoke(null, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("version ");
            sb.append(str);
            return str;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get version failed! ");
            sb2.append(e5.getMessage());
            boolean z4 = e5 instanceof NoSuchMethodException;
            return null;
        }
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i4 = 0; i4 < digest.length; i4++) {
                int i5 = digest[i4];
                if (i5 < 0) {
                    i5 += 256;
                }
                if (i5 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i5));
            }
            return stringBuffer.toString();
        } catch (Exception e5) {
            e5.printStackTrace();
            return str;
        }
    }

    public static boolean c(Context context) {
        boolean b5 = b(context);
        boolean d5 = d(context);
        e.a("p " + b5 + ", v " + d5);
        return b5 || d5;
    }

    public static boolean c(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        return true;
    }

    public static double d(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (eVar == null || (fVar = eVar.f3309c) == null) {
            return -1.0d;
        }
        return fVar.a(e.c.f3327d0, -1.0d);
    }

    public static int d() {
        int a5 = h.a().a("sce_count", 0);
        e.b("AM3RHTAG", "sec c " + a5);
        return a5;
    }

    private static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e5) {
            e.a("vpn err " + e5);
        }
        if (Build.VERSION.SDK_INT < 23) {
            e.a("vpn #2");
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(17);
            return networkInfo != null && networkInfo.isConnected();
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        e.a("vpn #1 ");
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(4);
        }
        return false;
    }

    public static double e(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (eVar == null || (fVar = eVar.f3309c) == null) {
            return -1.0d;
        }
        return fVar.a(e.c.f3329e0, -1.0d);
    }

    public static boolean e() {
        return false;
    }

    public static String f(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        int f5 = eVar.f();
        return f5 != 1 ? f5 != 107 ? f5 != 100 ? f5 != 101 ? "" : com.aggmoread.sdk.z.c.a.a.d.a.d.r.a.a.a() : b() : com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b() : com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b();
    }

    public static boolean g(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        if (eVar != null) {
            if (eVar.d() && !TextUtils.isEmpty(eVar.f3307a.f3279w)) {
                return false;
            }
            f fVar = eVar.f3310d;
            if (fVar != null) {
                double a5 = fVar.a(e.c.H);
                if (a5 > 0.0d && a5 <= 1.0d) {
                    return false;
                }
            }
        }
        return h(eVar);
    }

    public static boolean h(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (eVar != null && (fVar = eVar.f3310d) != null) {
            int b5 = fVar.b(e.c.I);
            e.a("close report bid  " + b5);
            if (b5 == 2) {
                return true;
            }
        }
        e.a("not need close report bid win ");
        return false;
    }

    public static boolean i(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        return eVar != null && eVar.f3310d.a(e.c.f3349w, 0) == 4;
    }

    public static boolean j(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar;
        if (eVar != null && (fVar = eVar.f3310d) != null) {
            int b5 = fVar.b(e.c.I);
            e.a("bidding bid  " + b5);
            if (b5 == 1) {
                return true;
            }
        }
        e.a("not need bidding floor ");
        return false;
    }
}
