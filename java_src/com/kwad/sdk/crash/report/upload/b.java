package com.kwad.sdk.crash.report.upload;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.join.mgps.Util.h0;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.crash.utils.h;
import com.kwad.sdk.utils.q;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class b {
    private static void a(@NonNull File file, @NonNull String str, String str2, @NonNull Map<String, String> map, @NonNull a aVar) {
        DataInputStream dataInputStream;
        OutputStream outputStream;
        byte[] bytes;
        com.kwad.sdk.core.e.c.d("AdExceptionCollector", "uploadLogFile " + Thread.currentThread());
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        String uuid = UUID.randomUUID().toString();
        String name = file.getName();
        String str3 = "https://" + com.kwad.sdk.core.network.idc.a.EE().W("ulog", "ulog-sdk.gifshow.com") + "/rest/log/sdk/file/upload";
        int i4 = -1;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str3).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("connection", "Keep-Alive");
                httpURLConnection2.setRequestProperty("User-Agent", p.getUserAgent());
                httpURLConnection2.setRequestProperty("Charset", "UTF-8");
                httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + uuid);
                httpURLConnection2.setRequestProperty("Content-MD5", Base64.encodeToString(com.kwad.sdk.utils.a.gy(file.getPath()), 2));
                httpURLConnection2.setRequestProperty("file-type", h0.f27805a + q.getExtension(file.getName()));
                httpURLConnection2.setRequestProperty("origin-name", name);
                httpURLConnection2.setRequestProperty(HttpHeaders.Names.COOKIE, "did=" + str);
                httpURLConnection2.connect();
                outputStream = httpURLConnection2.getOutputStream();
                try {
                    for (String str4 : map.keySet()) {
                        outputStream.write(e(str4, map.get(str4), uuid));
                    }
                    bytes = ("\r\n--" + uuid + "--\r\n").getBytes();
                    StringBuilder sb = new StringBuilder();
                    sb.append("--");
                    sb.append(uuid);
                    sb.append("\r\n");
                    sb.append("Content-Disposition: form-data;name=\"file\";filename=\"" + name + "\"\r\n");
                    sb.append("Content-Type: application/octet-stream\r\n\r\n");
                    outputStream.write(sb.toString().getBytes());
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                } catch (Exception e5) {
                    e = e5;
                    dataInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = null;
                }
            } catch (Exception e6) {
                e = e6;
                dataInputStream = null;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
                outputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = dataInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
                outputStream.write("\r\n".getBytes());
                outputStream.write(bytes);
                outputStream.flush();
                int responseCode = httpURLConnection2.getResponseCode();
                cVar.code = responseCode;
                cVar.awC = responseCode;
                if (responseCode == 200) {
                    cVar.awE = h.a(httpURLConnection2.getInputStream());
                    try {
                        if (new JSONObject(cVar.awE).optInt("result", -1) == 1) {
                            aVar.IN();
                        } else {
                            e eVar = e.aIP;
                            aVar.IM();
                        }
                    } catch (JSONException unused) {
                        e eVar2 = e.aIQ;
                        aVar.IM();
                    }
                    com.kwad.sdk.core.e.c.d("AdExceptionCollector", "response.body= " + cVar.awE);
                } else {
                    e eVar3 = e.aIO;
                    e.aIO.wR();
                    aVar.IM();
                    com.kwad.sdk.core.network.idc.a EE = com.kwad.sdk.core.network.idc.a.EE();
                    int i5 = cVar.code;
                    if (i5 == 0) {
                        i5 = -1;
                    }
                    EE.a(str3, i5, (Throwable) null);
                }
                com.kwad.sdk.crash.utils.b.a(httpURLConnection2);
            } catch (Exception e7) {
                e = e7;
                httpURLConnection = httpURLConnection2;
                try {
                    e eVar4 = e.aIO;
                    e.getCause();
                    aVar.IM();
                    com.kwad.sdk.core.network.idc.a EE2 = com.kwad.sdk.core.network.idc.a.EE();
                    int i6 = cVar.code;
                    if (i6 != 0) {
                        i4 = i6;
                    }
                    EE2.a(str3, i4, e);
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                    com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                    com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                } catch (Throwable th3) {
                    th = th3;
                    com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                    com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            dataInputStream = null;
            outputStream = null;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream = null;
            outputStream = null;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
        com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
    }

    private static byte[] e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str3);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"" + str + m.a.f71493g);
        sb.append("\r\n");
        sb.append("Content-Length: " + str2.length());
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(str2);
        sb.append("\r\n");
        return sb.toString().getBytes();
    }

    private static Map<String, String> a(f fVar) {
        HashMap hashMap = new HashMap();
        if (fVar == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(fVar.aJa)) {
            hashMap.put("uploadToken", fVar.aJa);
        }
        if (!TextUtils.isEmpty(fVar.aIX)) {
            hashMap.put(NotificationCompat.CATEGORY_SYSTEM, fVar.aIX);
        }
        if (!TextUtils.isEmpty(fVar.aIW)) {
            hashMap.put("did", fVar.aIW);
        }
        if (!TextUtils.isEmpty(fVar.aIU)) {
            hashMap.put("sid", fVar.aIU);
        }
        if (!TextUtils.isEmpty(fVar.aHt)) {
            hashMap.put("appver", fVar.aHt);
        }
        if (!TextUtils.isEmpty(fVar.mTaskId)) {
            hashMap.put("taskId", fVar.mTaskId);
        }
        if (!TextUtils.isEmpty(fVar.aIV)) {
            hashMap.put("token", fVar.aIV);
        }
        if (!TextUtils.isEmpty(fVar.aIT)) {
            hashMap.put("uid", fVar.aIT);
        }
        if (!TextUtils.isEmpty(fVar.aIY)) {
            hashMap.put(MediationConstant.KEY_EXTRA_INFO, fVar.aIY);
        }
        return hashMap;
    }

    public static void a(File file, f fVar, a aVar) {
        a(file, fVar.aIW, fVar.aIV, a(fVar), aVar);
    }
}
