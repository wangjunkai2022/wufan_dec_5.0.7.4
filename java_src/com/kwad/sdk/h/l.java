package com.kwad.sdk.h;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.umeng.umcrash.UMCrash;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class l {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static int aKJ;

    /* loaded from: classes5.dex */
    public interface a {
        void onSuccess();
    }

    l() {
    }

    @WorkerThread
    public static void a(List<k> list, a aVar) {
        if (aKJ > 10) {
            j.ak("LogReportUtil", "request error");
            return;
        }
        g JR = h.JN().JR();
        Map<String, String> requestHeader = JR.getRequestHeader();
        JSONObject JM = JR.JM();
        c.putValue(JM, "actionList", list);
        c.putValue(JM, UMCrash.SP_KEY_TIMESTAMP, System.currentTimeMillis());
        a(JR.JL(), requestHeader, a(requestHeader, JM), aVar);
    }

    private static String c(Map<String, String> map, String str) {
        g JR = h.JN().JR();
        JSONObject jSONObject = new JSONObject();
        c.putValue(jSONObject, "version", JR.getSdkVersion());
        c.putValue(jSONObject, "appId", JR.getAppId());
        c.putValue(jSONObject, "message", com.kwad.sdk.h.a.am(str));
        com.kwad.sdk.h.a.a(JR.JL(), map, jSONObject.toString());
        return jSONObject.toString();
    }

    private static String c(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 1024);
                try {
                    String a5 = a(bufferedReader);
                    j.closeQuietly(bufferedReader);
                    j.closeQuietly(inputStreamReader);
                    return a5;
                } catch (Throwable th2) {
                    th = th2;
                    j.closeQuietly(bufferedReader);
                    j.closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            inputStreamReader = null;
            th = th4;
            bufferedReader = null;
        }
    }

    private static String a(Map<String, String> map, JSONObject jSONObject) {
        if (h.JN().JR().JK()) {
            return jSONObject.toString();
        }
        return c(map, jSONObject.toString());
    }

    private static void a(String str, Map<String, String> map, String str2, a aVar) {
        Closeable closeable;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        OutputStream outputStream = null;
        httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception unused) {
            closeable = null;
        } catch (Throwable th) {
            th = th;
            closeable = null;
        }
        try {
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setUseCaches(false);
            a(httpURLConnection, map);
            httpURLConnection.connect();
            if (!TextUtils.isEmpty(str2)) {
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(str2.getBytes());
                outputStream.flush();
            }
            if (httpURLConnection.getResponseCode() == 200) {
                String a5 = a(httpURLConnection.getInputStream());
                j.JY();
                if (!TextUtils.isEmpty(a5)) {
                    if (new JSONObject(a5).optInt("result") == 1) {
                        aKJ = 0;
                        aVar.onSuccess();
                    } else {
                        aKJ++;
                        j.JY();
                    }
                } else {
                    aKJ++;
                    j.JY();
                }
            } else {
                aKJ++;
                j.JY();
            }
            j.a(httpURLConnection);
            j.closeQuietly(outputStream);
        } catch (Exception unused2) {
            httpURLConnection2 = httpURLConnection;
            closeable = null;
            try {
                aKJ++;
                j.JX();
                j.a(httpURLConnection2);
                j.closeQuietly(closeable);
            } catch (Throwable th2) {
                th = th2;
                j.a(httpURLConnection2);
                j.closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            closeable = null;
            j.a(httpURLConnection2);
            j.closeQuietly(closeable);
            throw th;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map == null || httpURLConnection == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static String a(Reader reader) {
        StringWriter stringWriter;
        Throwable th;
        StringWriter stringWriter2 = new StringWriter();
        try {
            stringWriter = new StringWriter();
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = reader.read(cArr);
                    if (read != -1) {
                        stringWriter.write(cArr, 0, read);
                    } else {
                        String stringWriter3 = stringWriter.toString();
                        j.closeQuietly(reader);
                        j.closeQuietly(stringWriter);
                        return stringWriter3;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                j.closeQuietly(reader);
                j.closeQuietly(stringWriter);
                throw th;
            }
        } catch (Throwable th3) {
            stringWriter = stringWriter2;
            th = th3;
        }
    }

    private static String a(InputStream inputStream) {
        try {
            try {
                return c(inputStream);
            } catch (IOException unused) {
                j.JX();
                j.closeQuietly(inputStream);
                return null;
            }
        } finally {
            j.closeQuietly(inputStream);
        }
    }
}
