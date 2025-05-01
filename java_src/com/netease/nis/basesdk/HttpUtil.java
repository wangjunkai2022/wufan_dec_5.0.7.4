package com.netease.nis.basesdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes5.dex */
public class HttpUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f57309a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f57310b = Executors.newSingleThreadExecutor();

    /* loaded from: classes5.dex */
    public interface ResponseCallBack {
        void onError(int i4, String str);

        void onSuccess(String str);
    }

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57312b;

        /* renamed from: com.netease.nis.basesdk.HttpUtil$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0563a implements ResponseCallBack {

            /* renamed from: com.netease.nis.basesdk.HttpUtil$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class RunnableC0564a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f57314a;

                RunnableC0564a(String str) {
                    this.f57314a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f57312b.onSuccess(this.f57314a);
                }
            }

            /* renamed from: com.netease.nis.basesdk.HttpUtil$a$a$b */
            /* loaded from: classes5.dex */
            class b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f57316a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f57317b;

                b(int i4, String str) {
                    this.f57316a = i4;
                    this.f57317b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f57312b.onError(this.f57316a, this.f57317b);
                }
            }

            C0563a() {
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onError(int i4, String str) {
                HttpUtil.f57309a.post(new b(i4, str));
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onSuccess(String str) {
                HttpUtil.f57309a.post(new RunnableC0564a(str));
            }
        }

        a(String str, ResponseCallBack responseCallBack) {
            this.f57311a = str;
            this.f57312b = responseCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpUtil.doHttpRequest(this.f57311a, false, false, null, null, null, new C0563a());
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57320b;

        /* loaded from: classes5.dex */
        class a implements ResponseCallBack {

            /* renamed from: com.netease.nis.basesdk.HttpUtil$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class RunnableC0565a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f57322a;

                RunnableC0565a(String str) {
                    this.f57322a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f57320b.onSuccess(this.f57322a);
                }
            }

            /* renamed from: com.netease.nis.basesdk.HttpUtil$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class RunnableC0566b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f57324a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f57325b;

                RunnableC0566b(int i4, String str) {
                    this.f57324a = i4;
                    this.f57325b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f57320b.onError(this.f57324a, this.f57325b);
                }
            }

            a() {
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onError(int i4, String str) {
                HttpUtil.f57309a.post(new RunnableC0566b(i4, str));
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onSuccess(String str) {
                HttpUtil.f57309a.post(new RunnableC0565a(str));
            }
        }

        b(String str, ResponseCallBack responseCallBack) {
            this.f57319a = str;
            this.f57320b = responseCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpUtil.doHttpRequest(this.f57319a, false, true, null, null, null, new a());
        }
    }

    /* loaded from: classes5.dex */
    class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Timer f57327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean[] f57328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57329c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57330d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ConnectivityManager f57331e;

        c(Timer timer, boolean[] zArr, String str, ResponseCallBack responseCallBack, ConnectivityManager connectivityManager) {
            this.f57327a = timer;
            this.f57328b = zArr;
            this.f57329c = str;
            this.f57330d = responseCallBack;
            this.f57331e = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        @TargetApi(21)
        public void onAvailable(Network network) {
            super.onAvailable(network);
            Logger.d("切换网络成功");
            this.f57327a.cancel();
            this.f57327a.purge();
            if (!this.f57328b[0]) {
                HttpUtil.doHttpRequest(this.f57329c, false, false, null, null, network, this.f57330d);
                this.f57328b[0] = true;
            }
            this.f57331e.unregisterNetworkCallback(this);
        }
    }

    /* loaded from: classes5.dex */
    class d extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConnectivityManager f57332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConnectivityManager.NetworkCallback f57333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57334c;

        d(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback, ResponseCallBack responseCallBack) {
            this.f57332a = connectivityManager;
            this.f57333b = networkCallback;
            this.f57334c = responseCallBack;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @RequiresApi(api = 21)
        public void run() {
            this.f57332a.unregisterNetworkCallback(this.f57333b);
            this.f57334c.onError(10002, "当前状态为wifi和数据流量同时开启，切换到数据流量超时，请重试");
        }
    }

    /* loaded from: classes5.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57336b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57337c;

        /* loaded from: classes5.dex */
        class a implements ResponseCallBack {

            /* renamed from: com.netease.nis.basesdk.HttpUtil$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class RunnableC0567a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f57339a;

                RunnableC0567a(String str) {
                    this.f57339a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    e.this.f57337c.onSuccess(this.f57339a);
                }
            }

            /* loaded from: classes5.dex */
            class b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f57341a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f57342b;

                b(int i4, String str) {
                    this.f57341a = i4;
                    this.f57342b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    e.this.f57337c.onError(this.f57341a, this.f57342b);
                }
            }

            a() {
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onError(int i4, String str) {
                HttpUtil.f57309a.post(new b(i4, str));
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onSuccess(String str) {
                HttpUtil.f57309a.post(new RunnableC0567a(str));
            }
        }

        e(String str, String str2, ResponseCallBack responseCallBack) {
            this.f57335a = str;
            this.f57336b = str2;
            this.f57337c = responseCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpUtil.doHttpRequest(this.f57335a, true, true, this.f57336b, null, null, new a());
        }
    }

    /* loaded from: classes5.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f57345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f57346c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ResponseCallBack f57347d;

        /* loaded from: classes5.dex */
        class a implements ResponseCallBack {

            /* renamed from: com.netease.nis.basesdk.HttpUtil$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class RunnableC0568a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f57349a;

                RunnableC0568a(String str) {
                    this.f57349a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    f.this.f57347d.onSuccess(this.f57349a);
                }
            }

            /* loaded from: classes5.dex */
            class b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f57351a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f57352b;

                b(int i4, String str) {
                    this.f57351a = i4;
                    this.f57352b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    f.this.f57347d.onError(this.f57351a, this.f57352b);
                }
            }

            a() {
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onError(int i4, String str) {
                HttpUtil.f57309a.post(new b(i4, str));
            }

            @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
            public void onSuccess(String str) {
                HttpUtil.f57309a.post(new RunnableC0568a(str));
            }
        }

        f(String str, Map map, Map map2, ResponseCallBack responseCallBack) {
            this.f57344a = str;
            this.f57345b = map;
            this.f57346c = map2;
            this.f57347d = responseCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Logger.i("post request url:" + this.f57344a + " args:" + HttpUtil.map2Form(this.f57345b, "utf-8"));
                HttpUtil.doHttpRequest(this.f57344a, true, false, HttpUtil.map2Form(this.f57345b, "utf-8"), this.f57346c, null, new a());
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
                ResponseCallBack responseCallBack = this.f57347d;
                responseCallBack.onError(10001, "网络请求出现异常:" + e5.toString());
            }
        }
    }

    public static void doGetRequestByForm(String str, ResponseCallBack responseCallBack) {
        Logger.i("get request url:" + str);
        f57310b.execute(new a(str, responseCallBack));
    }

    public static void doGetRequestByJson(String str, ResponseCallBack responseCallBack) {
        Logger.i("get request url:" + str);
        f57310b.execute(new b(str, responseCallBack));
    }

    public static void doGetRequestByMobileNet(Context context, String str, ResponseCallBack responseCallBack) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 21) {
            Logger.d("system api version >= 21");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            Timer timer = new Timer();
            c cVar = new c(timer, new boolean[]{false}, str, responseCallBack, connectivityManager);
            connectivityManager.requestNetwork(build, cVar);
            timer.schedule(new d(connectivityManager, cVar, responseCallBack), 7000L);
            return;
        }
        Logger.d("system api version < 21");
        if (connectivityManager != null) {
            try {
                connectivityManager.getClass().getMethod("startUsingNetworkFeature", Integer.TYPE, String.class).invoke(0, "enableHIPRI");
            } catch (Exception unused) {
            }
        }
        for (int i4 = 0; i4 < 20; i4++) {
            if (connectivityManager != null) {
                if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                    break;
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e5) {
                    Logger.e(e5.getMessage());
                }
            }
        }
        int lookupHost = NetworkUtil.lookupHost(NetworkUtil.extractAddressFromUrl(str));
        try {
            if (connectivityManager != null) {
                Class<?> cls = connectivityManager.getClass();
                Class<?> cls2 = Integer.TYPE;
                if (((Boolean) cls.getMethod("requestRouteToHost", cls2, cls2).invoke(5, Integer.valueOf(lookupHost))).booleanValue()) {
                    doHttpRequest(str, false, false, null, null, null, responseCallBack);
                } else {
                    responseCallBack.onError(7000, "当前状态为wifi和数据流量同时开启，切换到数据流量超时,请重试");
                    Logger.d("当前状态为wifi和数据流量同时开启，切换到数据流量失败,系统API < 21");
                }
            } else {
                responseCallBack.onError(7000, "当前状态为wifi和数据流量同时开启，切换到数据流量超时,请重试");
                Logger.d("当前状态为wifi和数据流量同时开启，切换到数据流量失败,系统API < 21");
            }
        } catch (Exception unused2) {
        }
    }

    public static void doHttpRequest(String str, boolean z4, boolean z5, String str2, Map<String, String> map, Network network, ResponseCallBack responseCallBack) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URL url = new URL(str);
                if (network != null && Build.VERSION.SDK_INT >= 21) {
                    httpURLConnection = (HttpURLConnection) network.openConnection(url);
                } else {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                }
                httpURLConnection2 = httpURLConnection;
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setReadTimeout(10000);
                httpURLConnection2.setDoInput(true);
                if (z4) {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoOutput(false);
                }
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                if (z5) {
                    httpURLConnection2.setRequestProperty("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
                } else {
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
                httpURLConnection2.setRequestProperty("connection", "Keep-Alive");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (str2 != null) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                    byte[] bytes = str2.getBytes("UTF-8");
                    dataOutputStream.write(bytes, 0, bytes.length);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                httpURLConnection2.connect();
                if (httpURLConnection2.getResponseCode() == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(new String(readLine.getBytes("UTF-8")));
                    }
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    responseCallBack.onSuccess(sb2);
                } else if (httpURLConnection2.getResponseCode() == 302) {
                    String headerField = httpURLConnection2.getHeaderField("Location");
                    if (headerField != null && !headerField.isEmpty()) {
                        httpURLConnection2.disconnect();
                        doHttpRequest(headerField, z4, z5, str2, null, network, responseCallBack);
                    } else {
                        responseCallBack.onError(httpURLConnection2.getResponseCode(), "获取重定向url失败");
                    }
                } else {
                    responseCallBack.onError(httpURLConnection2.getResponseCode(), "与服务端建立连接失败");
                }
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
                responseCallBack.onError(10001, "网络连接出现异常:" + e5.toString());
                if (0 == 0) {
                    return;
                }
            }
            httpURLConnection2.disconnect();
        } catch (Throwable th) {
            if (0 != 0) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public static void doPostRequestByForm(String str, Map<String, String> map, Map<String, String> map2, ResponseCallBack responseCallBack) {
        f57310b.execute(new f(str, map, map2, responseCallBack));
    }

    public static void doPostRequestByJson(String str, String str2, ResponseCallBack responseCallBack) {
        Logger.i("post request url:" + str + " args:" + str2);
        f57310b.execute(new e(str, str2, responseCallBack));
    }

    public static String map2Form(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append(m.a.f71490d);
            }
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }
}
