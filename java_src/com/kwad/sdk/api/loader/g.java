package com.kwad.sdk.api.loader;

import android.text.TextUtils;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.api.core.RequestParamsUtils;
import com.kwad.sdk.api.core.TLSConnectionUtils;
import com.kwad.sdk.api.loader.a;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class g {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final v anC;
    private int anD;
    private String anE;
    private final String mUrl;

    /* loaded from: classes5.dex */
    public interface a {
        void a(a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(v vVar) {
        this.anC = vVar;
        String AU = vVar.AU();
        this.mUrl = AU;
        this.anE = AU;
    }

    private static Map<String, String> AM() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Language", "zh-CN");
        hashMap.put("Connection", "keep-alive");
        hashMap.put("Charset", "UTF-8");
        hashMap.put("Content-Type", "application/json; charset=UTF-8");
        hashMap.put("User-Agent", RequestParamsUtils.getUserAgent());
        return hashMap;
    }

    private static HttpURLConnection cl(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        TLSConnectionUtils.wrapHttpURLConnection(httpURLConnection);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        return httpURLConnection;
    }

    private String f(Map<String, String> map) {
        String aM = h.aM(this.anC.getContext());
        if (TextUtils.isEmpty(aM)) {
            aM = this.anC.AV().getSDKVersion();
        }
        int sDKVersionCode = this.anC.AV().getSDKVersionCode();
        JSONObject appInfo = this.anC.AV().getAppInfo();
        JSONObject deviceInfo = this.anC.AV().getDeviceInfo();
        JSONObject networkInfo = this.anC.AV().getNetworkInfo();
        JSONObject jSONObject = new JSONObject();
        m.putValue(jSONObject, "sdkApiVersion", BuildConfig.VERSION_NAME);
        m.putValue(jSONObject, "sdkApiVersionCode", (int) BuildConfig.VERSION_CODE);
        m.putValue(jSONObject, "sdkVersion", aM);
        m.putValue(jSONObject, "SDKVersionCode", sDKVersionCode);
        m.putValue(jSONObject, "sdkType", 1);
        m.putValue(jSONObject, "appInfo", appInfo);
        m.putValue(jSONObject, "deviceInfo", deviceInfo);
        m.putValue(jSONObject, "networkInfo", networkInfo);
        m.putValue(jSONObject, "sdkAbi", w.yp());
        String jSONObject2 = jSONObject.toString();
        this.anC.AV().addHp(map);
        JSONObject jSONObject3 = new JSONObject();
        m.putValue(jSONObject3, "version", BuildConfig.VERSION_NAME);
        m.putValue(jSONObject3, "appId", appInfo.optString("appId"));
        m.putValue(jSONObject3, "message", this.anC.AV().getRM(jSONObject2));
        this.anC.AV().sR(this.mUrl, map, jSONObject3.toString());
        return jSONObject3.toString();
    }

    public final void a(a aVar) {
        HttpURLConnection httpURLConnection = null;
        try {
            Map<String, String> AM = AM();
            String f5 = f(AM);
            HttpURLConnection cl = cl(this.anE);
            a(cl, AM);
            cl.connect();
            new DataOutputStream(cl.getOutputStream()).write(f5.getBytes());
            int responseCode = cl.getResponseCode();
            if (responseCode == 200) {
                String a5 = a(cl.getInputStream());
                a.b bVar = new a.b();
                JSONObject jSONObject = new JSONObject(a5);
                String optString = jSONObject.optString("data");
                if (!TextUtils.isEmpty(optString) && !"null".equals(optString)) {
                    jSONObject.put("data", new JSONObject(this.anC.AV().getRD(optString)));
                }
                bVar.parseJson(jSONObject);
                aVar.a(bVar);
            } else if (responseCode / 100 == 3) {
                if (this.anD < 21) {
                    this.anE = cl.getHeaderField("Location");
                    this.anD++;
                    a(aVar);
                }
            } else {
                throw new RuntimeException("response code = " + responseCode);
            }
            try {
                cl.disconnect();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            if (0 != 0) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x004a */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.io.InputStream r5) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
        La:
            int r3 = r5.read(r0)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            r4 = -1
            if (r3 == r4) goto L16
            r4 = 0
            r2.write(r0, r4, r3)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            goto La
        L16:
            java.lang.String r0 = r2.toString()     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L49
            r5.close()     // Catch: java.io.IOException -> L1e
            goto L22
        L1e:
            r5 = move-exception
            r5.printStackTrace()
        L22:
            r2.close()     // Catch: java.io.IOException -> L26
            goto L2a
        L26:
            r5 = move-exception
            r5.printStackTrace()
        L2a:
            return r0
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r0 = move-exception
            goto L4b
        L2f:
            r0 = move-exception
            r2 = r1
        L31:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L3e
            r5.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r5 = move-exception
            r5.printStackTrace()
        L3e:
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r5 = move-exception
            r5.printStackTrace()
        L48:
            return r1
        L49:
            r0 = move-exception
            r1 = r2
        L4b:
            if (r5 == 0) goto L55
            r5.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r5 = move-exception
            r5.printStackTrace()
        L55:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r5 = move-exception
            r5.printStackTrace()
        L5f:
            goto L61
        L60:
            throw r0
        L61:
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.api.loader.g.a(java.io.InputStream):java.lang.String");
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map == null || httpURLConnection == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }
}
