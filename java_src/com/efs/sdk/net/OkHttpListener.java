package com.efs.sdk.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.net.a.a;
import com.efs.sdk.net.a.b;
import com.efs.sdk.net.a.c;
import com.efs.sdk.net.a.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class OkHttpListener extends EventListener {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f10559a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private String f10560b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10561c;

    /* renamed from: d  reason: collision with root package name */
    private List f10562d = new ArrayList();

    private void a(String str) {
        Map<String, Long> map;
        try {
            d c5 = a.a().c(this.f10560b);
            if (c5 == null || (map = c5.E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        try {
            final d c5 = a.a().c(this.f10560b);
            final c a5 = a.a().a(this.f10560b);
            if (c5 == null || a5 == null) {
                return;
            }
            Map<String, Long> map = c5.E;
            Map<String, Long> map2 = c5.F;
            Log.i("NetTrace-Listener", a5.toString());
            if (!TextUtils.isEmpty(c5.B)) {
                final EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
                if (map.containsKey(d.f10604d)) {
                    efsJSONLog.put("wd_dns", map.get(d.f10604d));
                }
                if (map.containsKey(d.f10605e)) {
                    efsJSONLog.put("wd_dnstm", map.get(d.f10605e));
                }
                if (map2.containsKey(d.f10620t)) {
                    efsJSONLog.put("wl_dns", map2.get(d.f10620t));
                }
                if (map.containsKey(d.f10606f)) {
                    efsJSONLog.put("wd_tcp", map.get(d.f10606f));
                }
                if (map.containsKey(d.f10609i)) {
                    efsJSONLog.put("wd_tcptm", map.get(d.f10609i));
                }
                if (map2.containsKey(d.f10622v)) {
                    efsJSONLog.put("wl_tcp", map2.get(d.f10622v));
                }
                if (map.containsKey(d.f10607g)) {
                    efsJSONLog.put("wd_ssl", map.get(d.f10607g));
                }
                if (map.containsKey(d.f10608h)) {
                    efsJSONLog.put("wd_ssltm", map.get(d.f10608h));
                }
                if (map2.containsKey(d.f10621u)) {
                    efsJSONLog.put("wl_ssl", map2.get(d.f10621u));
                }
                if (map.containsKey(d.f10611k)) {
                    efsJSONLog.put("wd_ds", map.get(d.f10611k));
                }
                if (map.containsKey(d.f10614n)) {
                    efsJSONLog.put("wd_dstm", map.get(d.f10614n));
                }
                if (map2.containsKey(d.f10623w) && map2.containsKey(d.f10624x)) {
                    efsJSONLog.put("wl_ds", Long.valueOf(map2.get(d.f10623w).longValue() + map2.get(d.f10624x).longValue()));
                }
                if (map.containsKey(d.f10615o)) {
                    efsJSONLog.put("wd_srt", map.get(d.f10615o));
                }
                if (map.containsKey(d.f10618r)) {
                    efsJSONLog.put("wd_srttm", map.get(d.f10618r));
                }
                if (map2.containsKey(d.f10625y) && map2.containsKey(d.f10626z)) {
                    efsJSONLog.put("wl_srt", Long.valueOf(map2.get(d.f10625y).longValue() + map2.get(d.f10626z).longValue()));
                }
                String[] split = c5.B.split("\\?");
                String str = split != null ? split[0] : null;
                List list = this.f10562d;
                if (list != null && str != null && !list.contains(str)) {
                    this.f10562d.add(str);
                    if (map.containsKey(d.f10614n)) {
                        efsJSONLog.put("wd_ttfb", map.get(d.f10614n));
                    } else if (map.containsKey(d.f10612l)) {
                        efsJSONLog.put("wd_ttfb", map.get(d.f10612l));
                    }
                    if (map.containsKey(d.f10615o)) {
                        efsJSONLog.put("wd_ttfbtm", map.get(d.f10615o));
                    }
                    if (map.containsKey(d.f10615o)) {
                        if (map.containsKey(d.f10614n)) {
                            efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f10615o).longValue() - map.get(d.f10614n).longValue()));
                        } else if (map.containsKey(d.f10612l)) {
                            efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f10615o).longValue() - map.get(d.f10612l).longValue()));
                        }
                    }
                } else {
                    efsJSONLog.put("wd_ttfb", 0);
                    efsJSONLog.put("wd_ttfbtm", 0);
                    efsJSONLog.put("wl_ttfb", 0);
                }
                if (map.containsKey(d.f10601a)) {
                    efsJSONLog.put("wd_rt", map.get(d.f10601a));
                }
                if (map.containsKey(d.f10602b)) {
                    efsJSONLog.put("wd_rttm", map.get(d.f10602b));
                }
                if (map2.containsKey(d.f10619s)) {
                    efsJSONLog.put("wl_rt", map2.get(d.f10619s));
                }
                efsJSONLog.put("wk_res", c5.B);
                efsJSONLog.put("wk_ip", c5.C);
                efsJSONLog.put("wk_method", a5.f10595e);
                efsJSONLog.put("wk_rc", Integer.valueOf(a5.f10598h));
                efsJSONLog.put("wl_up", Long.valueOf(a5.f10596f));
                efsJSONLog.put("wl_down", Long.valueOf(a5.f10600j));
                efsJSONLog.put("wl_total", Long.valueOf(a5.f10596f + a5.f10600j));
                b.a(new Runnable() { // from class: com.efs.sdk.net.OkHttpListener.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (NetManager.getNetConfigManager().getNetRequestBodyCollectState() && !TextUtils.isEmpty(a5.f10597g)) {
                                String valueOf = c5.E.containsKey(d.f10601a) ? String.valueOf(c5.E.get(d.f10601a)) : "";
                                efsJSONLog.put("wk_bd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(a5.f10597g.getBytes(), com.efs.sdk.net.b.a.a(valueOf + ControllerCenter.getGlobalEnvStruct().getAppid() + ControllerCenter.getGlobalEnvStruct().getSecret()).getBytes())));
                            }
                            OkHttpListener.a(c5, a5, efsJSONLog);
                        }
                    }
                });
                a.a().d(this.f10560b);
                a.a().b(this.f10560b);
                return;
            }
            Log.d("NetTrace-Listener", "url is null.");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static EventListener.Factory get() {
        return new EventListener.Factory() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // okhttp3.EventListener.Factory
            @NotNull
            public final EventListener create(@NotNull Call call) {
                return new OkHttpListener();
            }
        };
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        super.callEnd(call);
        try {
            Log.d("NetTrace-Listener", "callEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            a(d.f10602b);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        super.callFailed(call, iOException);
        try {
            Log.d("NetTrace-Listener", "callFailed");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            a(d.f10603c);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        super.callStart(call);
        try {
            Log.d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.f10561c = true;
            }
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            this.f10560b = String.valueOf(f10559a.getAndIncrement());
            Log.i("NetTrace-Listener", "requestId is" + this.f10560b);
            a(d.f10601a);
            String httpUrl = call.request().url().toString();
            d c5 = a.a().c(this.f10560b);
            if (c5 != null) {
                c5.B = httpUrl;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        try {
            Log.d("NetTrace-Listener", "connectEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            a(d.f10609i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        try {
            Log.d("NetTrace-Listener", "connectFailed");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            a(d.f10610j);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        try {
            Log.d("NetTrace-Listener", "connectStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            a(d.f10606f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        super.connectionAcquired(call, connection);
        try {
            Log.d("NetTrace-Listener", "connectionAcquired");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            InetAddress inetAddress = connection.socket().getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                d c5 = a.a().c(this.f10560b);
                if (c5 != null) {
                    c5.C = hostAddress;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        try {
            Log.d("NetTrace-Listener", "dnsEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            a(d.f10605e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String str) {
        super.dnsStart(call, str);
        try {
            Log.d("NetTrace-Listener", "dnsStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            a(d.f10604d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long j4) {
        super.requestBodyEnd(call, j4);
        try {
            Log.d("NetTrace-Listener", "requestBodyEnd");
            call.request().body();
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            a(d.f10614n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        super.requestBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "requestBodyStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            a(d.f10613m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        super.requestHeadersEnd(call, request);
        try {
            Log.d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            a(d.f10612l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        super.requestHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "requestHeadersStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            a(d.f10611k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long j4) {
        super.responseBodyEnd(call, j4);
        try {
            Log.d("NetTrace-Listener", "responseBodyEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            a(d.f10618r);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        super.responseBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "responseBodyStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            a(d.f10617q);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        super.responseHeadersEnd(call, response);
        try {
            Log.d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            a(d.f10616p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        super.responseHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "responseHeadersStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            a(d.f10615o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        try {
            Log.d("NetTrace-Listener", "secureConnectEnd");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            a(d.f10608h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        super.secureConnectStart(call);
        try {
            Log.d("NetTrace-Listener", "secureConnectStart");
            if (!this.f10561c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            a(d.f10607g);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() {
        try {
            d c5 = a.a().c(this.f10560b);
            if (c5 != null) {
                Map<String, Long> map = c5.E;
                Map<String, Long> map2 = c5.F;
                map2.put(d.f10619s, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10601a, d.f10602b)));
                map2.put(d.f10620t, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10604d, d.f10605e)));
                map2.put(d.f10621u, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10607g, d.f10608h)));
                map2.put(d.f10622v, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10606f, d.f10609i)));
                map2.put(d.f10623w, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10611k, d.f10612l)));
                map2.put(d.f10624x, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10613m, d.f10614n)));
                map2.put(d.f10625y, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10615o, d.f10616p)));
                map2.put(d.f10626z, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f10617q, d.f10618r)));
                b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(EfsJSONLog efsJSONLog) {
        try {
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                if (SamplingWhiteListUtil.isHitWL()) {
                    return;
                }
                Context context = ControllerCenter.getGlobalEnvStruct().mAppContext;
                SharedPreferences sharedPreferences = context.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                if (sharedPreferences != null) {
                    int i4 = sharedPreferences.getInt(format, 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null) {
                        edit.putInt(format, i4 + 1);
                        edit.apply();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Map<String, String> map, boolean z4, boolean z5) {
        try {
            StringBuilder sb = new StringBuilder();
            if (!SamplingWhiteListUtil.isHitWL()) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            sb.append("|");
            sb.append(NetManager.getNetConfigManager().getExtraRateFlag());
            if (map.size() == 0) {
                sb.append("|0");
            } else if (z4) {
                sb.append("|0");
            } else if (z5) {
                sb.append("|1");
            } else {
                sb.append("|0");
            }
            sb.append("|");
            sb.append(new JSONObject(map).toString());
            return com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(sb.toString().getBytes(), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
        if (java.util.regex.Pattern.matches(r12, r16.B) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f A[Catch: all -> 0x0189, TryCatch #2 {all -> 0x0189, blocks: (B:21:0x008d, B:24:0x0094, B:26:0x00a4, B:29:0x00ab, B:31:0x00b1, B:33:0x00bd, B:35:0x00c9, B:37:0x00d2, B:41:0x00e3, B:43:0x011a, B:48:0x012d, B:51:0x0137, B:64:0x015f, B:65:0x0174, B:56:0x0145, B:58:0x014f, B:42:0x0103, B:46:0x0125, B:66:0x0179), top: B:100:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.efs.sdk.net.a.d r16, com.efs.sdk.net.a.c r17, com.efs.sdk.base.protocol.record.EfsJSONLog r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpListener.a(com.efs.sdk.net.a.d, com.efs.sdk.net.a.c, com.efs.sdk.base.protocol.record.EfsJSONLog):void");
    }
}
