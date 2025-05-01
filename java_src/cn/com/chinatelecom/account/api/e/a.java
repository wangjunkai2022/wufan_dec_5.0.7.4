package cn.com.chinatelecom.account.api.e;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.d.g;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f666a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, String> f667b = new HashMap<>();

    public static long a(Context context) {
        return c.b(context, "key_difference_time", 0L);
    }

    public static cn.com.chinatelecom.account.api.d.d a(Context context, HttpURLConnection httpURLConnection, boolean z4) {
        if (z4) {
            cn.com.chinatelecom.account.api.d.d dVar = new cn.com.chinatelecom.account.api.d.d();
            try {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                List<String> list = headerFields.get("p");
                if (list != null && list.size() > 0) {
                    String str = f666a;
                    CtAuth.info(str, "request protocol : " + list.get(0));
                    dVar.f635b = false;
                }
                List<String> list2 = headerFields.get(HttpHeaders.Names.SET_COOKIE);
                if (list2 != null && list2.size() > 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list2.size()) {
                            break;
                        }
                        String str2 = list2.get(0);
                        if (!TextUtils.isEmpty(str2) && str2.contains("gw_auth")) {
                            dVar.f634a = a(str2, "gw_auth");
                            break;
                        }
                        i4++;
                    }
                }
                List<String> list3 = headerFields.get("Log-Level");
                if (list3 != null && !list3.isEmpty()) {
                    for (int i5 = 0; i5 < list3.size(); i5++) {
                        String str3 = list3.get(0);
                        if (!TextUtils.isEmpty(str3)) {
                            f.a(context, str3);
                        }
                    }
                }
                List<String> list4 = headerFields.get("p-reset");
                if (list4 != null && !list4.isEmpty()) {
                    String str4 = list4.get(0);
                    if (!TextUtils.isEmpty(str4)) {
                        a(context, str4);
                    }
                }
                List<String> list5 = headerFields.get("p-ikgx");
                if (list5 != null && !list5.isEmpty()) {
                    String str5 = list5.get(0);
                    if (!TextUtils.isEmpty(str5)) {
                        dVar.f636c = str5;
                        g.f711d = str5;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return dVar;
        }
        return null;
    }

    public static cn.com.chinatelecom.account.api.d.d a(HttpURLConnection httpURLConnection) {
        cn.com.chinatelecom.account.api.d.d dVar = new cn.com.chinatelecom.account.api.d.d();
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("rdt_allow");
            if (list != null && list.size() > 0) {
                dVar.f637d = list.get(0);
                String str = f666a;
                CtAuth.info(str, "request method : " + dVar.f637d);
            }
            List<String> list2 = headerFields.get("p-ikgx");
            if (list2 != null && !list2.isEmpty()) {
                String str2 = list2.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    dVar.f636c = str2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return dVar;
    }

    public static synchronized String a(int i4) {
        synchronized (a.class) {
            return i4 == cn.com.chinatelecom.account.api.a.f534d ? "presdk" : "preauthIfaa";
        }
    }

    private static String a(String str, String str2) {
        try {
            String[] split = str.split(";");
            for (int i4 = 0; i4 < split.length; i4++) {
                if (split[i4].contains(str2)) {
                    return split[i4].split(SimpleComparison.EQUAL_TO_OPERATION)[1];
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return "";
    }

    public static JSONObject a(Context context, cn.com.chinatelecom.account.api.d.h hVar, String str, Network network, boolean z4, String str2) {
        JSONObject jSONObject;
        if (hVar == null || (jSONObject = hVar.f663b) == null) {
            return j.b();
        }
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (hVar.f662a != -1 && !TextUtils.isEmpty(str)) {
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("data");
            if (!TextUtils.isEmpty(optString)) {
                JSONObject jSONObject2 = new JSONObject(h.a(optString, str));
                if (optInt == 0) {
                    jSONObject2.put("gwAuth", hVar.f664c);
                }
                if (optInt == -10020) {
                    jSONObject.put("taskId", str);
                }
                jSONObject.put("data", jSONObject2);
            }
            if (optInt != 30002 || !z4) {
                if (optInt == -10009 || optInt == -30001) {
                    long optLong = jSONObject.optLong("timeStamp", -1L);
                    if (optLong == -1) {
                        b(context);
                    } else {
                        a(context, optLong);
                    }
                }
                return jSONObject;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = ((JSONObject) jSONObject.opt("data")).optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.getString(i4));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return a(context, arrayList, str, network, str2);
        }
        return jSONObject;
    }

    private static JSONObject a(Context context, List<String> list, String str, Network network, String str2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                String str3 = list.get(i4);
                if (!TextUtils.isEmpty(str3)) {
                    if (!g.c(context) && Build.VERSION.SDK_INT < 21) {
                        cn.com.chinatelecom.account.api.d.f.a(context, str3);
                    }
                    g.a aVar = new g.a();
                    try {
                        aVar.b(str2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        aVar.a(network);
                        JSONObject a5 = a(context, new cn.com.chinatelecom.account.api.d.b(context).a(str3, "", 0, aVar.a()), str, network, false, str2);
                        if (a5 != null && a5.optInt("result") == 0) {
                            return a5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return j.a(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, cn.com.chinatelecom.account.api.a.d.a(j.f717b) + "- redirect 30002 ");
    }

    private static void a(Context context, long j4) {
        if (j4 > 0) {
            c.a(context, "key_difference_time", j4 - System.currentTimeMillis());
        }
    }

    private static void a(Context context, String str) {
        c.a(context, "key_p_rset_v3.8.12", str);
    }

    private static void b(Context context) {
        String a5 = d.a();
        g.a aVar = new g.a();
        aVar.a("reqTimestamp");
        aVar.b(a5);
        JSONObject jSONObject = new cn.com.chinatelecom.account.api.d.b(context).a(g.b(), "", 1, aVar.a()).f663b;
        if (jSONObject != null) {
            a(context, jSONObject.optLong("msg", -1L));
        }
    }
}
