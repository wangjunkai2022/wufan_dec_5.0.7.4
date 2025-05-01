package com.kwad.sdk.core.network.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.network.e;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.export.proxy.AdHttpBodyBuilder;
import com.kwad.sdk.export.proxy.AdHttpFormDataBuilder;
import com.kwad.sdk.export.proxy.AdHttpResponseHelper;
import com.kwad.sdk.export.proxy.AdHttpResponseListener;
import com.kwad.sdk.utils.bo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import okhttp3.ConnectionSpec;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class c {
    private static final Pattern axH = Pattern.compile("Unexpected response code for CONNECT: ([0-9]+)", 2);
    public static String axI = "UTF-8";
    private static OkHttpClient axJ = null;
    public static OkHttpClient axK = ED();

    public static OkHttpClient EC() {
        if (com.kwad.framework.a.a.md.booleanValue()) {
            if (axJ == null) {
                axJ = axK.newBuilder().build();
            }
            return axJ;
        }
        return axK;
    }

    private static OkHttpClient ED() {
        if (axK == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder connectionSpecs = builder.connectTimeout(3000L, timeUnit).readTimeout(6000L, timeUnit).connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT));
            try {
                connectionSpecs.dns(new d());
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
            axK = connectionSpecs.build();
        }
        return axK;
    }

    public static com.kwad.sdk.core.network.c a(String str, @Nullable Map<String, String> map, boolean z4) {
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        try {
            Request.Builder url = new Request.Builder().url(str);
            a(url);
            a(url, map);
            Response execute = EC().newCall(url.build()).execute();
            int code = execute.code();
            cVar.code = code;
            cVar.awC = code;
            cVar.awE = z4 ? a(execute) : "";
        } catch (Exception e5) {
            a(cVar, e5);
        }
        return cVar;
    }

    private static void b(Request.Builder builder, Map<String, String> map) {
        FormBody formBody;
        if (map == null || map.isEmpty()) {
            formBody = null;
        } else {
            FormBody.Builder builder2 = new FormBody.Builder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    try {
                        builder2.addEncoded(entry.getKey(), encode(entry.getValue()));
                    } catch (Exception unused) {
                    }
                }
            }
            formBody = builder2.build();
        }
        if (builder == null || formBody == null) {
            return;
        }
        builder.post(formBody);
    }

    public static com.kwad.sdk.core.network.c doGet(String str, @Nullable Map<String, String> map) {
        return a(str, map, true);
    }

    public static com.kwad.sdk.core.network.c doPost(String str, Map<String, String> map, JSONObject jSONObject) {
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        try {
            Request.Builder url = new Request.Builder().url(str);
            a(url);
            a(url, map);
            a(url, jSONObject);
            Response execute = EC().newCall(url.build()).execute();
            int code = execute.code();
            cVar.code = code;
            cVar.awC = code;
            cVar.awE = a(execute);
        } catch (Exception e5) {
            a(cVar, e5);
        }
        return cVar;
    }

    public static boolean downloadUrlToStream(String str, OutputStream outputStream, long j4, @Nullable AdHttpResponseListener adHttpResponseListener) {
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        Request.Builder url = new Request.Builder().url(str);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Language", "zh-CN");
        hashMap.put("Connection", "keep-alive");
        hashMap.put("Charset", "UTF-8");
        a(url);
        a(url, hashMap);
        Response execute = EC().newCall(url.build()).execute();
        int code = execute.code();
        cVar.code = code;
        cVar.awC = code;
        if (execute.code() == 200) {
            a(execute, outputStream, j4, adHttpResponseListener);
            return true;
        }
        throw new FileNotFoundException(str);
    }

    private static String encode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return "";
        }
    }

    private static long b(Response response) {
        try {
            return Long.parseLong(response.header("content-length"));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static void a(Request.Builder builder) {
        builder.addHeader("User-Agent", p.getUserAgent());
        builder.addHeader("BrowserUa", p.Ez());
        builder.addHeader("SystemUa", p.Ey());
    }

    public static com.kwad.sdk.core.network.c doPost(String str, Map<String, String> map, Map<String, String> map2) {
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        try {
            Request.Builder url = new Request.Builder().url(str);
            a(url);
            a(url, map);
            b(url, map2);
            Response execute = EC().newCall(url.build()).execute();
            int code = execute.code();
            cVar.code = code;
            cVar.awC = code;
            cVar.awE = a(execute);
        } catch (Exception e5) {
            a(cVar, e5);
        }
        return cVar;
    }

    private static void a(@NonNull com.kwad.sdk.core.network.c cVar, Exception exc) {
        String message;
        cVar.awD = exc;
        if (cVar.awC == -1 && (exc instanceof IOException) && (message = exc.getMessage()) != null) {
            Matcher matcher = axH.matcher(message);
            if (matcher.find()) {
                try {
                    cVar.awC = Integer.parseInt(matcher.group(1));
                } catch (Exception unused) {
                }
            }
        }
        if (exc instanceof SocketTimeoutException) {
            e eVar = e.awF;
            cVar.code = eVar.errorCode;
            cVar.awE = eVar.msg;
        } else {
            cVar.code = e.awG.errorCode;
            cVar.awE = e.awG.msg + net.lingala.zip4j.util.e.F0 + bo.t(exc);
        }
        if (com.kwad.framework.a.a.md.booleanValue()) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(exc);
        }
    }

    public static com.kwad.sdk.core.network.c doPost(String str, Map<String, String> map, AdHttpBodyBuilder adHttpBodyBuilder) {
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        try {
            final MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            if (adHttpBodyBuilder != null) {
                adHttpBodyBuilder.buildFormData(new AdHttpFormDataBuilder() { // from class: com.kwad.sdk.core.network.a.c.1
                    @Override // com.kwad.sdk.export.proxy.AdHttpFormDataBuilder
                    public final void addFormDataPart(String str2, String str3) {
                        MultipartBody.Builder.this.addFormDataPart(str2, str3);
                    }

                    @Override // com.kwad.sdk.export.proxy.AdHttpFormDataBuilder
                    public final void addFormDataPart(String str2, String str3, String str4, byte[] bArr) {
                        MultipartBody.Builder.this.addFormDataPart(str2, str3, RequestBody.create(MediaType.parse(str4), bArr));
                    }
                });
            }
            Request.Builder post = new Request.Builder().url(str).post(type.build());
            a(post, map);
            Response execute = EC().newCall(post.build()).execute();
            int code = execute.code();
            cVar.code = code;
            cVar.awC = code;
            cVar.awE = a(execute);
        } catch (Exception e5) {
            a(cVar, e5);
        }
        return cVar;
    }

    private static void a(Request.Builder builder, @Nullable Map<String, String> map) {
        if (builder == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                try {
                    builder.removeHeader(entry.getKey());
                    builder.addHeader(entry.getKey(), entry.getValue());
                } catch (Exception unused) {
                }
            }
        }
    }

    private static void a(Request.Builder builder, JSONObject jSONObject) {
        builder.post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    private static String a(Response response) {
        InputStream inputStream;
        InputStream inputStream2;
        ?? r4;
        InputStream inputStream3;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            inputStream = response.body().byteStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
            inputStream2 = null;
        }
        try {
            List<String> headers = response.headers("Content-Encoding");
            boolean z4 = false;
            if (headers != null) {
                Iterator<String> it2 = headers.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if ("gzip".equalsIgnoreCase(it2.next())) {
                        z4 = true;
                        break;
                    }
                }
            }
            if (z4) {
                inputStream3 = new GZIPInputStream(inputStream);
                inputStream2 = inputStream3;
            } else {
                inputStream2 = null;
                inputStream3 = inputStream;
            }
            try {
                r4 = new InputStreamReader(inputStream3, axI);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(r4, 8);
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                            } else {
                                com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
                                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream2);
                                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                                return sb.toString();
                            }
                        } catch (Throwable th2) {
                            bufferedReader = bufferedReader2;
                            th = th2;
                            com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                            com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
                            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream2);
                            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r4 = 0;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream2 = null;
            r4 = inputStream2;
            com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
            com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream2);
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Response response, OutputStream outputStream, long j4, AdHttpResponseListener adHttpResponseListener) {
        Throwable th;
        Closeable closeable;
        InputStream inputStream;
        InputStream inputStream2;
        boolean z4;
        InputStream inputStream3;
        try {
            AdHttpResponseHelper.notifyResponseStart(adHttpResponseListener);
            inputStream = response.body().byteStream();
            try {
                List<String> headers = response.headers("Content-Encoding");
                long b5 = b(response);
                if (headers != null) {
                    for (String str : headers) {
                        if ("gzip".equalsIgnoreCase(str)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                if (z4) {
                    inputStream3 = new GZIPInputStream(inputStream);
                    inputStream2 = inputStream3;
                } else {
                    inputStream2 = null;
                    inputStream3 = inputStream;
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream3);
                    try {
                        byte[] bArr = new byte[1024];
                        long j5 = 0;
                        if (j4 > 0) {
                            do {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                j5 += read;
                                AdHttpResponseHelper.notifyResponseProgress(adHttpResponseListener, j5, b5);
                            } while (j5 <= j4);
                        } else if (j4 < 0) {
                            r2 = outputStream != null ? new BufferedOutputStream(outputStream) : null;
                            while (true) {
                                int read2 = bufferedInputStream.read(bArr);
                                if (read2 == -1) {
                                    break;
                                }
                                if (r2 != null) {
                                    r2.write(bArr, 0, read2);
                                }
                                j5 += read2;
                                if (AdHttpResponseHelper.notifyResponseProgress(adHttpResponseListener, j5, b5)) {
                                    break;
                                }
                            }
                            if (r2 != null) {
                                r2.flush();
                            }
                        }
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedInputStream);
                        com.kwad.sdk.crash.utils.b.closeQuietly(r2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        r2 = bufferedInputStream;
                        com.kwad.sdk.crash.utils.b.closeQuietly(r2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(closeable);
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream2);
                        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = null;
                }
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
                inputStream2 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            closeable = null;
            inputStream = null;
            inputStream2 = null;
        }
    }
}
