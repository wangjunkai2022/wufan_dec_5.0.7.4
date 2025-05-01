package com.bytedance.sdk.openadsdk.downloadnew;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes2.dex */
public class m {

    /* loaded from: classes2.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        public HttpURLConnection f8779i;

        /* renamed from: m  reason: collision with root package name */
        public Map<String, String> f8780m;

        /* renamed from: p  reason: collision with root package name */
        public int f8781p;
        public InputStream vv;

        public vv(InputStream inputStream, Map<String, String> map, int i4, HttpURLConnection httpURLConnection) {
            this.vv = inputStream;
            this.f8780m = map;
            this.f8781p = i4;
            this.f8779i = httpURLConnection;
        }
    }

    public static HttpURLConnection vv(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception unused) {
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return ((responseCode < 200 || responseCode >= 300) && responseCode >= 300 && responseCode < 400) ? vv(httpURLConnection.getHeaderField("Location"), map) : httpURLConnection;
        } catch (Exception unused2) {
            httpURLConnection3 = httpURLConnection2;
            return httpURLConnection3;
        }
    }

    public static Map<String, String> vv(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        int size = httpURLConnection.getHeaderFields().size();
        for (int i4 = 0; i4 < size; i4++) {
            hashMap.put(httpURLConnection.getHeaderFieldKey(i4), httpURLConnection.getHeaderField(i4));
        }
        return hashMap;
    }

    public static vv vv(String str, List<com.ss.android.socialbase.downloader.model.p> list) throws IOException {
        int responseCode;
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (com.ss.android.socialbase.downloader.model.p pVar : list) {
                hashMap.put(pVar.vv(), pVar.m());
            }
        }
        HttpURLConnection vv2 = vv(str, hashMap);
        if (vv2 != null && (responseCode = vv2.getResponseCode()) >= 200 && responseCode < 300) {
            Map<String, String> vv3 = vv(vv2);
            InputStream inputStream = vv2.getInputStream();
            String contentEncoding = vv2.getContentEncoding();
            if (!TextUtils.isEmpty(contentEncoding) && contentEncoding.contains("gzip")) {
                inputStream = new GZIPInputStream(inputStream);
            }
            return new vv(inputStream, vv3, responseCode, vv2);
        }
        return null;
    }
}
