package com.beizi.ad.internal.network;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.beizi.ad.R;
import com.beizi.ad.c.a;
import com.beizi.ad.c.b;
import com.beizi.ad.c.d;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.d;
import com.beizi.ad.internal.e;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.utilities.DeviceInfo;
import com.beizi.ad.internal.utilities.DeviceInfoUtil;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.HashingFunctions;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.UserEnvInfo;
import com.beizi.ad.internal.utilities.UserEnvInfoUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.lance.a.k;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.m;
import com.beizi.ad.lance.a.p;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/* compiled from: AdRequestImpl.java */
/* loaded from: classes2.dex */
public class a extends AsyncTask<Void, Integer, ServerResponse> {

    /* renamed from: a  reason: collision with root package name */
    private SoftReference<e> f6071a;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f6072d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f6073e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f6074f;

    /* renamed from: g  reason: collision with root package name */
    private Date f6075g;

    /* renamed from: h  reason: collision with root package name */
    private String f6076h;

    /* renamed from: i  reason: collision with root package name */
    private int f6077i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6078j;

    /* renamed from: k  reason: collision with root package name */
    private String f6079k;

    /* renamed from: l  reason: collision with root package name */
    private int f6080l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6081m;

    /* renamed from: c  reason: collision with root package name */
    private static final ServerResponse f6070c = new ServerResponse(true);

    /* renamed from: b  reason: collision with root package name */
    public static final String f6069b = HashingFunctions.md5("emulator");

    /* compiled from: AdRequestImpl.java */
    /* renamed from: com.beizi.ad.internal.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0179a {

        /* renamed from: d  reason: collision with root package name */
        private Date f6085d;

        /* renamed from: e  reason: collision with root package name */
        private String f6086e;

        /* renamed from: h  reason: collision with root package name */
        private String f6089h;

        /* renamed from: j  reason: collision with root package name */
        private boolean f6091j;

        /* renamed from: a  reason: collision with root package name */
        private final HashSet<String> f6082a = new HashSet<>();

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f6083b = new Bundle();

        /* renamed from: c  reason: collision with root package name */
        private final HashSet<String> f6084c = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private int f6087f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f6088g = false;

        /* renamed from: i  reason: collision with root package name */
        private int f6090i = -1;

        public void a(String str) {
            this.f6082a.add(str);
        }

        public void b(String str) {
            this.f6084c.add(str);
        }

        public void c(String str) {
            this.f6086e = str;
        }

        public void d(String str) {
            this.f6089h = str;
        }

        public com.beizi.ad.b.a e() {
            return new com.beizi.ad.b.a(this.f6085d, this.f6087f, this.f6082a, false);
        }

        public void a(Class<? extends com.beizi.ad.b.b> cls, Bundle bundle) {
            this.f6083b.putBundle(cls.getName(), bundle);
        }

        public void b(boolean z4) {
            this.f6091j = z4;
        }

        public int c() {
            return this.f6087f;
        }

        public Set<String> d() {
            return this.f6082a;
        }

        public void a(Date date) {
            this.f6085d = date;
        }

        public String b() {
            return this.f6086e;
        }

        public void a(int i4) {
            this.f6087f = i4;
        }

        public void a(boolean z4) {
            this.f6090i = z4 ? 1 : 0;
        }

        public Date a() {
            return this.f6085d;
        }

        public Bundle a(Class<? extends com.beizi.ad.b.b> cls) {
            return this.f6083b.getBundle(cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        this.f6072d = new HashSet();
        this.f6073e = null;
        this.f6074f = new HashSet();
    }

    private boolean b(int i4) {
        if (i4 != 200) {
            HaoboLog.i(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.http_bad_status, i4));
            return false;
        }
        return true;
    }

    public void a(e eVar) {
        this.f6071a = new SoftReference<>(eVar);
        d c5 = eVar.c();
        if (c5 != null && c5.b() != null) {
            DeviceInfoUtil.retrieveDeviceInfo(c5.b().getApplicationContext());
            UserEnvInfoUtil.retrieveUserEnvInfo(c5.b().getApplicationContext());
            if (c.a(c5.b().getApplicationContext()).b(c5.b())) {
                return;
            }
            a(2);
            cancel(true);
            return;
        }
        a(0);
        cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @TargetApi(11)
    /* renamed from: b */
    public void onCancelled(ServerResponse serverResponse) {
        super.onCancelled(serverResponse);
        HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.cancel_request));
    }

    public a(C0179a c0179a) {
        this.f6075g = c0179a.f6085d;
        this.f6076h = c0179a.f6086e;
        this.f6077i = c0179a.f6087f;
        this.f6072d = Collections.unmodifiableSet(c0179a.f6082a);
        this.f6073e = c0179a.f6083b;
        this.f6074f = Collections.unmodifiableSet(c0179a.f6084c);
        this.f6078j = c0179a.f6088g;
        this.f6079k = c0179a.f6089h;
        this.f6080l = c0179a.f6090i;
        this.f6081m = c0179a.f6091j;
    }

    private void a(int i4) {
        e eVar = this.f6071a.get();
        if (eVar != null) {
            eVar.a(i4);
        }
        HaoboLog.clearLastResponse();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public ServerResponse doInBackground(Void... voidArr) {
        d c5;
        e eVar = this.f6071a.get();
        if (eVar == null || (c5 = eVar.c()) == null) {
            return null;
        }
        try {
            boolean z4 = c5.i() == j.PREFETCH;
            g a5 = g.a();
            DeviceInfo deviceInfo = DeviceInfo.getInstance();
            d.a a6 = new d.a.C0173a().a(deviceInfo.sdkUID).j(DeviceInfo.density).l(m.a(g.a().f5898i)).m(m.b(g.a().f5898i)).n(deviceInfo.bootMark).o(deviceInfo.updateMark).b("").c(deviceInfo.os).a(e.EnumC0174e.PLATFORM_ANDROID).a(deviceInfo.devType).d(deviceInfo.brand).e(deviceInfo.model).f(deviceInfo.manufacturer).g(deviceInfo.resolution).h(deviceInfo.screenSize).i(deviceInfo.language).k(deviceInfo.root).p(deviceInfo.agVercode).a(deviceInfo.wxInstalled).q(DeviceInfo.physicalMemoryByte).r(DeviceInfo.harddiskSizeByte).s(deviceInfo.hmsCoreVersion).a();
            UserEnvInfo userEnvInfo = UserEnvInfo.getInstance();
            a.b.C0170a c6 = new a.b.C0170a().a("3.5.0.4").a(e.i.SRC_APP).c(UserEnvInfoUtil.getVersionName(g.a().f5898i)).a(z4 ? e.g.REQ_WIFI_PRELOAD : e.g.REQ_AD).a(p.c()).b(a5.d()).a(a6).a(new d.c.a().a(userEnvInfo.f6108net).a(userEnvInfo.isp).a()).c(p.d(c5.b())).d(p.c(c5.b())).b(p.a(c5.b())).c(p.b(c5.b()));
            if (z4) {
                for (String str : g.a().l()) {
                    if (!StringUtil.isEmpty(str)) {
                        c6.a(new a.C0168a.C0169a().a(str).c(c5.a()).a());
                    }
                }
            } else {
                c6.a(new a.C0168a.C0169a().a(c5.c()).c(c5.a()).b(c5.k()).a());
            }
            a.b a7 = c6.a();
            byte[] bytes = com.beizi.ad.lance.a.a.a(k.a(), a7.toString()).getBytes();
            l.d("lance", "sdkRequest:" + a7.toString());
            String m4 = g.a().m();
            l.d("lance", "getRequestBaseUrl:" + m4);
            HaoboLog.setLastRequest(a7.toString());
            HaoboLog.i(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.fetch_url, HaoboLog.getLastRequest()));
            HttpURLConnection a8 = a(new URL(m4));
            a(a8, bytes);
            a8.connect();
            if (!b(a8.getResponseCode())) {
                return f6070c;
            }
            if (a8.getContentLength() == 0) {
                HaoboLog.e(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_blank));
            }
            InputStream inputStream = a8.getInputStream();
            b.i a9 = b.i.a(inputStream);
            inputStream.close();
            return new ServerResponse(a9, a8.getHeaderFields(), c5.i());
        } catch (IllegalArgumentException unused) {
            HaoboLog.e(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.http_unknown));
            return f6070c;
        } catch (SecurityException unused2) {
            HaoboLog.e(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.permissions_internet));
            return f6070c;
        } catch (MalformedURLException unused3) {
            HaoboLog.e(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.http_url_malformed));
            return f6070c;
        } catch (IOException unused4) {
            HaoboLog.e(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.http_io));
            return f6070c;
        } catch (Exception e5) {
            e5.printStackTrace();
            HaoboLog.e(HaoboLog.httpReqLogTag, Log.getStackTraceString(e5));
            HaoboLog.e(HaoboLog.httpReqLogTag, HaoboLog.getString(R.string.unknown_exception));
            return f6070c;
        }
    }

    private HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        return httpURLConnection;
    }

    private void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setRequestProperty("User-Agent", g.a().f5896d);
        httpURLConnection.setRequestProperty("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept", HttpHeaders.Values.APPLICATION_JSON);
        String cookie = WebviewUtil.getCookie();
        if (!TextUtils.isEmpty(cookie)) {
            httpURLConnection.setRequestProperty(HttpHeaders.Names.COOKIE, cookie);
        }
        httpURLConnection.setRequestProperty("Connect-Length", Integer.toString(bArr.length));
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.flush();
        outputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(ServerResponse serverResponse) {
        if (serverResponse == null) {
            HaoboLog.v(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.no_response));
            a(2);
        } else if (serverResponse.a()) {
            a(2);
        } else {
            com.beizi.ad.internal.e eVar = this.f6071a.get();
            if (eVar != null) {
                eVar.a(serverResponse);
            }
        }
    }
}
