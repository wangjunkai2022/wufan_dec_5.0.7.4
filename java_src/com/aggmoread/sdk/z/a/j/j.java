package com.aggmoread.sdk.z.a.j;

import android.os.Build;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.Util.h0;
import com.tencent.bugly.Bugly;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* loaded from: classes2.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private static int f2207a = 65536;

    /* renamed from: b  reason: collision with root package name */
    private static long f2208b = 2000;

    /* loaded from: classes2.dex */
    public static final class a implements X509TrustManager {

        /* renamed from: a  reason: collision with root package name */
        private X509TrustManager f2209a;

        public a(KeyStore keyStore) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers == null || trustManagers.length == 0) {
                    throw new NoSuchAlgorithmException("no trust manager found.");
                }
                this.f2209a = (X509TrustManager) trustManagers[0];
            } catch (Exception e5) {
                com.aggmoread.sdk.z.a.d.a("DownloadNetworkImpl", "failed to initialize the standard trust manager: " + e5.getMessage());
                this.f2209a = null;
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (x509CertificateArr == null) {
                throw new IllegalArgumentException("there were no certificates.");
            }
            if (x509CertificateArr.length == 1) {
                x509CertificateArr[0].checkValidity();
                return;
            }
            X509TrustManager x509TrustManager = this.f2209a;
            if (x509TrustManager == null) {
                throw new CertificateException("there were one more certificates but no trust manager found.");
            }
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private int a(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
            if (matcher.find()) {
                return (Integer.parseInt(matcher.group(2)) - Integer.parseInt(matcher.group(1))) + 1;
            }
            return -1;
        } catch (Exception e5) {
            throw new h(-1016, "getContentLengthWithContentRange exception contentRange = " + str, e5);
        }
    }

    private String a(Map map, String str) {
        List list;
        int lastIndexOf;
        StringBuilder sb;
        String substring;
        String a5 = g.a(str);
        if (map == null || (list = (List) map.get("Content-Type")) == null || list.size() <= 0) {
            return a5;
        }
        String str2 = (String) list.get(0);
        String trim = str2 == null ? "" : str2.trim();
        com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "Content-Type = " + trim);
        if (trim.startsWith("image/")) {
            substring = trim.substring(6);
            sb = new StringBuilder();
            sb.append(a5);
            sb.append(h0.f27805a);
            if ("jpeg".equals(substring)) {
                substring = "jpg";
            }
        } else if (trim.startsWith("application/vnd.android.package-archive")) {
            return a5 + h0.f27805a + "apk";
        } else {
            int lastIndexOf2 = str.lastIndexOf(47);
            String substring2 = lastIndexOf2 > 0 ? str.substring(lastIndexOf2 + 1) : null;
            com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "lastPart = " + substring2);
            if (substring2 == null || substring2.length() <= 0 || (lastIndexOf = substring2.lastIndexOf(46)) <= 0 || substring2.length() - lastIndexOf >= 10) {
                return a5;
            }
            sb = new StringBuilder();
            sb.append(a5);
            substring = substring2.substring(lastIndexOf);
        }
        sb.append(substring);
        return sb.toString();
    }

    private HttpURLConnection a(String str, int i4, int i5) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("GET");
            if (Build.VERSION.SDK_INT < 8) {
                System.setProperty("http.keepAlive", Bugly.SDK_IS_DEV);
            }
            if (httpURLConnection instanceof HttpsURLConnection) {
                X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                SSLContext sSLContext = SSLContext.getInstance(SSLConnectionSocketFactory.TLS);
                sSLContext.init(null, new TrustManager[]{new a(null)}, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
            }
            if (i4 > 0) {
                httpURLConnection.setConnectTimeout(i4);
            }
            if (i5 > 0) {
                httpURLConnection.setReadTimeout(i5);
            }
            return httpURLConnection;
        } catch (MalformedURLException e5) {
            e5.printStackTrace();
            throw new h(-1003, e5);
        } catch (IOException e6) {
            e6.printStackTrace();
            throw new h((int) IMediaPlayer.MEDIA_ERROR_IO, e6);
        } catch (KeyManagementException e7) {
            e7.printStackTrace();
            throw new h(-1006, e7);
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
            throw new h(-1005, e8);
        } catch (Exception e9) {
            e9.printStackTrace();
            throw new h(-1000, "getDownloadConnection exception(" + str + ")", e9);
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    private void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "flush and sync to disk");
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    private void a(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            if (value != null && value.size() > 0) {
                for (int i4 = 0; i4 < value.size(); i4++) {
                    sb.append(value.get(i4));
                    sb.append(",");
                }
            }
            com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "header key = " + key + " , value = " + sb.toString());
        }
    }

    private boolean a(int i4) {
        return i4 == 301 || i4 == 302 || i4 == 303 || i4 == 300 || i4 == 307 || i4 == 308;
    }

    private String b(Map<String, List<String>> map) {
        String[] split;
        String str = "";
        if (map == null) {
            return "";
        }
        List<String> list = map.get("Content-Disposition");
        if (list != null && list.size() > 0) {
            String str2 = list.get(0);
            com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "Content-Disposition header value = " + str2);
            for (String str3 : str2.split(";")) {
                if (str3.trim().startsWith("filename")) {
                    str = str3.split(SimpleComparison.EQUAL_TO_OPERATION)[1];
                    if (str.startsWith(m.a.f71493g) && str.endsWith(m.a.f71493g)) {
                        str = str.substring(1, str.length() - 1);
                    }
                }
            }
        }
        return str;
    }

    public String a(n nVar) {
        int i4;
        long j4;
        com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "download enter , " + nVar.toString());
        i d5 = nVar.d();
        if (d5 == i.f2206a) {
            throw new h("DownloadListener EMPTY");
        }
        d5.b();
        String c5 = nVar.c();
        String g4 = nVar.g();
        boolean k4 = nVar.k();
        if (k4) {
            File file = new File(c5, g.a(g4));
            if (k4 && file.exists()) {
                d5.a();
                d5.c();
                d5.a(100, file.length(), file.length());
                d5.a(file);
                return file.getAbsolutePath();
            }
        }
        HttpURLConnection a5 = a(g4, nVar.a(), nVar.i());
        try {
            Map<String, String> f5 = nVar.f();
            int i5 = 1;
            if (TextUtils.isEmpty(f5.get("User-Agent"))) {
                String format = String.format(Locale.ENGLISH, "downloader/%s", 12078564);
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "setRequestProperty headerName = User-Agent, headerValue = " + format);
                a5.setRequestProperty("User-Agent", format);
            }
            if (TextUtils.isEmpty(f5.get("Range"))) {
                String format2 = String.format(Locale.ENGLISH, "bytes=%d-", 0);
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "setRequestProperty headerName = Range, headerValue = " + format2);
                a5.addRequestProperty("Range", format2);
            }
            for (String str : f5.keySet()) {
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "setRequestProperty headerName = " + str + ", headerValue = " + f5.get(str));
                a5.setRequestProperty(str, f5.get(str));
            }
            try {
                a5.connect();
                int responseCode = a5.getResponseCode();
                int h4 = nVar.h();
                String headerField = a5.getHeaderField("Location");
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "http responseCode = " + responseCode + ", location = " + headerField);
                HttpURLConnection httpURLConnection = a5;
                int i6 = 0;
                while (a(responseCode) && !TextUtils.isEmpty(headerField)) {
                    try {
                        httpURLConnection.getInputStream().close();
                        HttpURLConnection a6 = a(headerField, nVar.a(), nVar.i());
                        a6.connect();
                        responseCode = a6.getResponseCode();
                        headerField = a6.getHeaderField("Location");
                        i6 += i5;
                        com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "redirect responseCode = " + responseCode + ", location = " + headerField + " , currentRedirectTimes = " + i6);
                        if (i6 >= h4) {
                            throw new h(-1012, "redirect too many times(" + h4 + ")");
                        }
                        httpURLConnection = a6;
                        i5 = 1;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        if (e5 instanceof SocketTimeoutException) {
                            String str2 = "redirect SocketTimeoutException(" + g4 + ")";
                            com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str2);
                            throw new h(-1009, str2, e5);
                        } else if (e5 instanceof UnknownHostException) {
                            String str3 = "redirect UnknownHostException(" + g4 + ")";
                            com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str3);
                            throw new h(IMediaPlayer.MEDIA_ERROR_UNSUPPORTED, str3, e5);
                        } else if (!(e5 instanceof ConnectException)) {
                            throw new h(-1011, "redirect(" + e5.getMessage() + ")", e5);
                        } else {
                            String str4 = "redirect ConnectException(" + g4 + ")";
                            com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str4);
                            throw new h(-1001, str4, e5);
                        }
                    }
                }
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "final responseCode = " + responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    try {
                        try {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), Charset.forName("utf-8")));
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (sb.length() > 0) {
                                    sb.append('\n');
                                }
                                sb.append(readLine);
                            }
                            a(bufferedReader);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("error", sb.toString());
                            jSONObject.put("status", Integer.valueOf(responseCode));
                            throw new h(-1014, jSONObject.toString());
                        } finally {
                        }
                    } catch (Exception e6) {
                        throw new h(-1015, e6.getMessage());
                    }
                }
                d5.a();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                a(headerFields);
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "eTag = " + httpURLConnection.getHeaderField("ETag"));
                String e7 = nVar.e();
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "download request file name = " + e7);
                if (TextUtils.isEmpty(e7)) {
                    e7 = b(headerFields);
                    com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "getFileNameWithContentDisposition= " + e7);
                    if (TextUtils.isEmpty(e7)) {
                        e7 = a(headerFields, g4);
                        com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "getFileNameWithContentType = " + e7);
                    }
                }
                com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "final file name = " + e7);
                File file2 = new File(c5, e7);
                File file3 = new File(c5, e7.replace("tmp", "apk"));
                if (k4 && file3.exists()) {
                    httpURLConnection.disconnect();
                    d5.c();
                    d5.a(100, file3.length(), file3.length());
                    d5.a(file3);
                    return file3.getAbsolutePath();
                }
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                if (file3.exists()) {
                    file3.delete();
                }
                try {
                    if (nVar.j()) {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        httpURLConnection.disconnect();
                        return "";
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    int contentLength = httpURLConnection.getContentLength();
                    com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "contentLength = " + contentLength);
                    if (contentLength < 0) {
                        String headerField2 = httpURLConnection.getHeaderField("Transfer-Encoding");
                        String headerField3 = httpURLConnection.getHeaderField("Content-Range");
                        int a7 = a(headerField3);
                        com.aggmoread.sdk.z.a.d.c("DownloadNetworkImpl", "transferEncoding = " + headerField2 + " , contentRange = " + a7 + " , contentRangeValue = " + headerField3);
                        if (a7 < 0) {
                            throw new h(-1002, "contentLength < 0 , transferEncoding = " + headerField2 + " , contentRange = " + headerField3);
                        }
                        i4 = a7;
                    } else {
                        i4 = contentLength;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[4096];
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        d5.c();
                    }
                    long j5 = 0;
                    long j6 = 0;
                    long j7 = 0;
                    while (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                        byte[] bArr2 = bArr;
                        long j8 = read + j5;
                        long currentTimeMillis = System.currentTimeMillis();
                        long j9 = currentTimeMillis - j7;
                        long j10 = currentTimeMillis;
                        if (j8 - j6 <= f2207a || j9 <= f2208b) {
                            j10 = j7;
                            j4 = j6;
                        } else {
                            a(fileOutputStream);
                            j4 = j8;
                        }
                        float f6 = 100.0f;
                        if (i4 > 0) {
                            f6 = 100.0f * ((float) j8);
                        }
                        d5.a((int) (f6 / i4), j8, i4);
                        if (nVar.j()) {
                            break;
                        }
                        bArr = bArr2;
                        read = inputStream.read(bArr2);
                        j6 = j4;
                        j5 = j8;
                        j7 = j10;
                    }
                    a(fileOutputStream);
                    a(inputStream);
                    a((Closeable) fileOutputStream);
                    if (nVar.j()) {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        httpURLConnection.disconnect();
                        return null;
                    }
                    d5.a(100, file2.length(), file2.length());
                    File file4 = new File(file2.getAbsolutePath().replace("tmp", "apk"));
                    file2.renameTo(file4);
                    try {
                        d5.a(file4);
                        httpURLConnection.disconnect();
                        return file4.getAbsolutePath();
                    } catch (Throwable th) {
                        th = th;
                        file2 = file4;
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                            throw new h(-1013, th.getMessage(), th);
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                if (e8 instanceof SocketTimeoutException) {
                    String str5 = "SocketTimeoutException(" + g4 + ")";
                    com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str5);
                    throw new h(-1009, str5, e8);
                } else if (e8 instanceof UnknownHostException) {
                    String str6 = "UnknownHostException(" + g4 + ")";
                    com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str6);
                    throw new h(IMediaPlayer.MEDIA_ERROR_UNSUPPORTED, str6, e8);
                } else if (e8 instanceof ConnectException) {
                    String str7 = "ConnectException(" + g4 + ")";
                    com.aggmoread.sdk.z.a.d.e("DownloadNetworkImpl", str7);
                    throw new h(-1001, str7, e8);
                } else {
                    throw new h(-1011, e8.getMessage(), e8);
                }
            }
        } catch (IllegalStateException e9) {
            e9.printStackTrace();
            throw new h((int) IMediaPlayer.MEDIA_ERROR_MALFORMED, e9);
        } catch (Exception e10) {
            throw new h(-1008, e10);
        }
    }
}
