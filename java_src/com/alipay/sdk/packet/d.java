package com.alipay.sdk.packet;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.util.j;
import com.efs.sdk.base.core.util.NetworkUtil;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f4894c = "msp-gzip";

    /* renamed from: d  reason: collision with root package name */
    public static final String f4895d = "Msp-Param";

    /* renamed from: e  reason: collision with root package name */
    public static final String f4896e = "Operation-Type";

    /* renamed from: f  reason: collision with root package name */
    public static final String f4897f = "content-type";

    /* renamed from: g  reason: collision with root package name */
    public static final String f4898g = "Version";

    /* renamed from: h  reason: collision with root package name */
    public static final String f4899h = "AppId";

    /* renamed from: i  reason: collision with root package name */
    public static final String f4900i = "des-mode";

    /* renamed from: j  reason: collision with root package name */
    public static final String f4901j = "namespace";

    /* renamed from: k  reason: collision with root package name */
    public static final String f4902k = "api_name";

    /* renamed from: l  reason: collision with root package name */
    public static final String f4903l = "api_version";

    /* renamed from: m  reason: collision with root package name */
    public static final String f4904m = "data";

    /* renamed from: n  reason: collision with root package name */
    public static final String f4905n = "params";

    /* renamed from: o  reason: collision with root package name */
    public static final String f4906o = "public_key";

    /* renamed from: p  reason: collision with root package name */
    public static final String f4907p = "device";

    /* renamed from: q  reason: collision with root package name */
    public static final String f4908q = "action";

    /* renamed from: r  reason: collision with root package name */
    public static final String f4909r = "type";

    /* renamed from: s  reason: collision with root package name */
    public static final String f4910s = "method";

    /* renamed from: t  reason: collision with root package name */
    private static com.alipay.sdk.net.a f4911t;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f4912a = true;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f4913b = true;

    private b c(Context context, String str, String str2) throws Throwable {
        return d(context, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    private static String g(HttpResponse httpResponse, String str) {
        Header[] allHeaders;
        String name;
        if (httpResponse == null || str == null || (allHeaders = httpResponse.getAllHeaders()) == null || allHeaders.length <= 0) {
            return null;
        }
        for (Header header : allHeaders) {
            if (header != null && (name = header.getName()) != null && name.equalsIgnoreCase(str)) {
                return header.getValue();
            }
        }
        return null;
    }

    public static JSONObject j(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(f4910s, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    private static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (jSONObject.has("params")) {
                String optString = jSONObject.getJSONObject("params").optString(f4906o, null);
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                m.b.b();
                com.alipay.sdk.data.c.a().e(optString);
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static boolean l(HttpResponse httpResponse) {
        Header[] allHeaders;
        String name;
        String str = null;
        if (httpResponse != null && (allHeaders = httpResponse.getAllHeaders()) != null && allHeaders.length > 0) {
            int length = allHeaders.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    Header header = allHeaders[i4];
                    if (header != null && (name = header.getName()) != null && name.equalsIgnoreCase(f4894c)) {
                        str = header.getValue();
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(str).booleanValue();
    }

    private static com.alipay.sdk.net.a m(Context context, String str) {
        com.alipay.sdk.net.a aVar = f4911t;
        if (aVar == null) {
            f4911t = new com.alipay.sdk.net.a(context, str);
        } else if (!TextUtils.equals(str, aVar.f4886b)) {
            f4911t.f4886b = str;
        }
        return f4911t;
    }

    private static byte[] o(HttpResponse httpResponse) throws IllegalStateException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr = new byte[1024];
        InputStream inputStream = null;
        try {
            InputStream content = httpResponse.getEntity().getContent();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = content.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = content;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    content.close();
                } catch (Exception unused3) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused4) {
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public final b a(Context context) throws Throwable {
        return d(context, "", com.alipay.sdk.cons.a.f4812a, true);
    }

    public b b(Context context, String str) throws Throwable {
        return d(context, str, com.alipay.sdk.cons.a.f4812a, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b d(Context context, String str, String str2, boolean z4) throws Throwable {
        e eVar = new e(this.f4913b);
        c c5 = eVar.c(new b(p(), e(str, i())), this.f4912a);
        com.alipay.sdk.net.a aVar = f4911t;
        if (aVar == null) {
            f4911t = new com.alipay.sdk.net.a(context, str2);
        } else if (!TextUtils.equals(str2, aVar.f4886b)) {
            f4911t.f4886b = str2;
        }
        HttpResponse b5 = f4911t.b(c5.f4893b, h(c5.f4892a, str));
        b b6 = eVar.b(new c(l(b5), o(b5)));
        return (b6 != null && k(b6.f4890a) && z4) ? d(context, str, str2, false) : b6;
    }

    protected String e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str2;
        String str3;
        CharSequence charSequence;
        Object obj;
        m.b bVar;
        JSONObject jSONObject3;
        String str4;
        String str5;
        String str6;
        m.b b5 = m.b.b();
        n.b a5 = n.b.a();
        JSONObject a6 = com.alipay.sdk.util.c.a(new JSONObject(), jSONObject);
        try {
            a6.put(com.alipay.sdk.cons.b.f4830c, a5.f71677a);
            com.alipay.sdk.data.c a7 = com.alipay.sdk.data.c.a();
            Context context = m.b.b().f71504a;
            com.alipay.sdk.util.b a8 = com.alipay.sdk.util.b.a(context);
            if (TextUtils.isEmpty(a7.f4869a)) {
                bVar = b5;
                String d5 = j.d();
                jSONObject3 = a6;
                try {
                    String k4 = j.k();
                    str4 = com.alipay.sdk.cons.b.f4829b;
                    String q4 = j.q(context);
                    str2 = com.alipay.sdk.cons.b.f4834g;
                    String str7 = com.alipay.sdk.cons.a.f4812a;
                    obj = com.alipay.sdk.cons.b.f4830c;
                    int indexOf = str7.indexOf("://");
                    str3 = NetworkUtil.NETWORK_TYPE_WIFI;
                    String substring = str7.substring(0, indexOf);
                    String s4 = j.s(context);
                    String f5 = Float.toString(new TextView(context).getTextSize());
                    charSequence = " ";
                    a7.f4869a = "Msp/15.0.8 (" + d5 + ";" + k4 + ";" + q4 + ";" + substring + ";" + s4 + ";" + f5;
                } catch (Throwable unused) {
                    jSONObject2 = jSONObject3;
                }
            } else {
                str2 = com.alipay.sdk.cons.b.f4834g;
                str3 = NetworkUtil.NETWORK_TYPE_WIFI;
                charSequence = " ";
                obj = com.alipay.sdk.cons.b.f4830c;
                bVar = b5;
                jSONObject3 = a6;
                str4 = com.alipay.sdk.cons.b.f4829b;
            }
            String a9 = com.alipay.sdk.util.b.d(context).a();
            String b6 = a8.b();
            String e5 = a8.e();
            Context context2 = m.b.b().f71504a;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("virtualImeiAndImsi", 0);
            String string = sharedPreferences.getString("virtual_imsi", null);
            if (TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(n.b.a().f71677a)) {
                    String e6 = m.b.b().e();
                    if (TextUtils.isEmpty(e6)) {
                        str5 = e5;
                        str6 = com.alipay.sdk.data.c.f();
                    } else {
                        str5 = e5;
                        str6 = e6.substring(3, 18);
                    }
                } else {
                    str5 = e5;
                    str6 = com.alipay.sdk.util.b.a(context2).b();
                }
                sharedPreferences.edit().putString("virtual_imsi", str6).commit();
            } else {
                str5 = e5;
                str6 = string;
            }
            Context context3 = m.b.b().f71504a;
            SharedPreferences sharedPreferences2 = context3.getSharedPreferences("virtualImeiAndImsi", 0);
            String string2 = sharedPreferences2.getString("virtual_imei", null);
            if (TextUtils.isEmpty(string2)) {
                string2 = TextUtils.isEmpty(n.b.a().f71677a) ? com.alipay.sdk.data.c.f() : com.alipay.sdk.util.b.a(context3).e();
                sharedPreferences2.edit().putString("virtual_imei", string2).commit();
            }
            a7.f4871c = a5.f71678b;
            CharSequence charSequence2 = charSequence;
            String replace = Build.MANUFACTURER.replace(";", charSequence2);
            String replace2 = Build.MODEL.replace(";", charSequence2);
            boolean d6 = m.b.d();
            String g4 = a8.g();
            String str8 = str3;
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService(str8)).getConnectionInfo();
            String ssid = connectionInfo != null ? connectionInfo.getSSID() : "-1";
            WifiInfo connectionInfo2 = ((WifiManager) context.getSystemService(str8)).getConnectionInfo();
            String bssid = connectionInfo2 != null ? connectionInfo2.getBSSID() : "00";
            StringBuilder sb = new StringBuilder();
            sb.append(a7.f4869a);
            sb.append(";");
            sb.append(a9);
            sb.append(";");
            sb.append("-1;-1");
            sb.append(";");
            sb.append("1");
            sb.append(";");
            sb.append(b6);
            sb.append(";");
            sb.append(str5);
            sb.append(";");
            sb.append(a7.f4871c);
            sb.append(";");
            sb.append(replace);
            sb.append(";");
            sb.append(replace2);
            sb.append(";");
            sb.append(d6);
            sb.append(";");
            sb.append(g4);
            sb.append(";-1;-1;");
            sb.append(a7.f4870b);
            sb.append(";");
            sb.append(str6);
            sb.append(";");
            sb.append(string2);
            sb.append(";");
            sb.append(ssid);
            sb.append(";");
            sb.append(bssid);
            HashMap hashMap = new HashMap();
            hashMap.put(obj, a5.f71677a);
            String str9 = str2;
            hashMap.put(str9, m.b.b().e());
            String c5 = com.alipay.sdk.data.c.c(context, hashMap);
            if (!TextUtils.isEmpty(c5)) {
                sb.append(";");
                sb.append(c5);
            }
            sb.append(")");
            jSONObject2 = jSONObject3;
            try {
                jSONObject2.put(str4, sb.toString());
                m.b bVar2 = bVar;
                jSONObject2.put(com.alipay.sdk.cons.b.f4832e, j.l(bVar2.f71504a));
                jSONObject2.put(com.alipay.sdk.cons.b.f4833f, j.h(bVar2.f71504a));
                jSONObject2.put(com.alipay.sdk.cons.b.f4831d, str);
                jSONObject2.put(com.alipay.sdk.cons.b.f4835h, com.alipay.sdk.cons.a.f4814c);
                jSONObject2.put(str9, bVar2.e());
                jSONObject2.put(com.alipay.sdk.cons.b.f4837j, a5.f71678b);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            jSONObject2 = a6;
        }
        return jSONObject2.toString();
    }

    protected List<Header> h(boolean z4, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader(f4894c, String.valueOf(z4)));
        arrayList.add(new BasicHeader(f4896e, "alipay.msp.cashier.dispatch.bytes"));
        arrayList.add(new BasicHeader(f4897f, HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE));
        arrayList.add(new BasicHeader(f4898g, "2.0"));
        arrayList.add(new BasicHeader(f4899h, "TAOBAO"));
        arrayList.add(new BasicHeader(f4895d, a.a(str)));
        arrayList.add(new BasicHeader(f4900i, "CBC"));
        return arrayList;
    }

    protected abstract JSONObject i() throws JSONException;

    protected String n() {
        return "4.9.0";
    }

    protected String p() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(f4907p, Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put(f4902k, "com.alipay.mcpay");
        hashMap.put(f4903l, n());
        return f(hashMap, new HashMap());
    }
}
