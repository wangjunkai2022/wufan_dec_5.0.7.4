package com.beizi.ad.internal.nativead.a;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.internal.e;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.DeviceInfo;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.view.c;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: MediationNativeAdController.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public ServerResponse f6001a;

    /* renamed from: b  reason: collision with root package name */
    e f6002b;

    /* renamed from: c  reason: collision with root package name */
    com.beizi.ad.internal.a.a f6003c;

    /* renamed from: f  reason: collision with root package name */
    int f6006f;

    /* renamed from: d  reason: collision with root package name */
    boolean f6004d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f6005e = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6007g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f6008h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private long f6009i = -1;

    /* renamed from: j  reason: collision with root package name */
    private long f6010j = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediationNativeAdController.java */
    /* renamed from: com.beizi.ad.internal.nativead.a.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements com.beizi.ad.internal.network.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NativeAdResponse f6011a;

        @Override // com.beizi.ad.internal.network.b
        public j a() {
            return j.NATIVE;
        }

        @Override // com.beizi.ad.internal.network.b
        public boolean b() {
            return true;
        }

        @Override // com.beizi.ad.internal.network.b
        public c c() {
            return null;
        }

        @Override // com.beizi.ad.internal.network.b
        public NativeAdResponse d() {
            return this.f6011a;
        }

        @Override // com.beizi.ad.internal.network.b
        public String e() {
            return "";
        }

        @Override // com.beizi.ad.internal.network.b
        public String f() {
            return this.f6011a.getPrice();
        }

        @Override // com.beizi.ad.internal.network.b
        public String g() {
            return null;
        }

        @Override // com.beizi.ad.internal.network.b
        public void h() {
            this.f6011a.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediationNativeAdController.java */
    /* renamed from: com.beizi.ad.internal.nativead.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class AsyncTaskC0178a extends HTTPGet {

        /* renamed from: a  reason: collision with root package name */
        e f6012a;

        /* renamed from: b  reason: collision with root package name */
        final int f6013b;

        /* renamed from: d  reason: collision with root package name */
        private final String f6015d;

        /* renamed from: e  reason: collision with root package name */
        private final HashMap<String, Object> f6016e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f6017f;

        /* renamed from: g  reason: collision with root package name */
        private final long f6018g;

        /* renamed from: h  reason: collision with root package name */
        private final long f6019h;

        /* synthetic */ AsyncTaskC0178a(a aVar, e eVar, String str, int i4, HashMap hashMap, boolean z4, long j4, long j5, AnonymousClass1 anonymousClass1) {
            this(eVar, str, i4, hashMap, z4, j4, j5);
        }

        @Override // com.beizi.ad.internal.utilities.HTTPGet
        protected String getUrl() {
            StringBuilder sb = new StringBuilder(this.f6015d);
            sb.append("&reason=");
            sb.append(this.f6013b);
            sb.append("&uid=");
            sb.append(Uri.encode(DeviceInfo.getInstance().sdkUID));
            if (this.f6018g > 0) {
                sb.append("&latency=");
                sb.append(Uri.encode(String.valueOf(this.f6018g)));
            }
            if (this.f6019h > 0) {
                sb.append("&total_latency=");
                sb.append(Uri.encode(String.valueOf(this.f6019h)));
            }
            return sb.toString();
        }

        private AsyncTaskC0178a(e eVar, String str, int i4, HashMap<String, Object> hashMap, boolean z4, long j4, long j5) {
            super(true, true);
            this.f6012a = eVar;
            this.f6015d = str;
            this.f6013b = i4;
            this.f6016e = hashMap;
            this.f6017f = z4;
            this.f6018g = j4;
            this.f6019h = j5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.beizi.ad.internal.utilities.HTTPGet, android.os.AsyncTask
        public void onPostExecute(HTTPResponse hTTPResponse) {
            if (this.f6017f) {
                HaoboLog.i(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.result_cb_ignored));
                return;
            }
            e eVar = this.f6012a;
            if (eVar == null) {
                HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.fire_cb_requester_null));
                return;
            }
            ServerResponse serverResponse = null;
            if (hTTPResponse != null && hTTPResponse.getSucceeded()) {
                serverResponse = new ServerResponse(hTTPResponse, j.NATIVE);
                if (this.f6016e.containsKey(ServerResponse.EXTRAS_KEY_ORIENTATION)) {
                    serverResponse.addToExtras(ServerResponse.EXTRAS_KEY_ORIENTATION, this.f6016e.get(ServerResponse.EXTRAS_KEY_ORIENTATION));
                }
            } else {
                HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.result_cb_bad_response));
            }
            eVar.a(serverResponse);
        }
    }

    /* compiled from: MediationNativeAdController.java */
    /* loaded from: classes2.dex */
    static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<a> f6020a;

        public b(a aVar) {
            this.f6020a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f6020a.get();
            if (aVar == null || aVar.f6005e) {
                return;
            }
            HaoboLog.w(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_timeout));
            try {
                aVar.a(0);
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                aVar.f6003c = null;
                throw th;
            }
            aVar.f6003c = null;
        }
    }

    private a(com.beizi.ad.internal.a.a aVar, e eVar, ServerResponse serverResponse) {
        if (aVar == null) {
            HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_no_ads));
            this.f6006f = 3;
        } else {
            HaoboLog.d(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.instantiating_class, aVar.a()));
            this.f6002b = eVar;
            this.f6003c = aVar;
            this.f6001a = serverResponse;
            b();
            d();
            try {
                com.beizi.ad.internal.nativead.a.b bVar = (com.beizi.ad.internal.nativead.a.b) Class.forName(aVar.a()).newInstance();
                if (eVar.c() != null) {
                    bVar.a(eVar.c().b(), aVar.e(), aVar.b(), this, eVar.d());
                } else {
                    this.f6006f = 1;
                }
            } catch (ClassCastException e5) {
                a(e5, aVar.a());
            } catch (ClassNotFoundException e6) {
                a(e6, aVar.a());
            } catch (IllegalAccessException e7) {
                a(e7, aVar.a());
            } catch (InstantiationException e8) {
                a(e8, aVar.a());
            } catch (LinkageError e9) {
                a(e9, aVar.a());
            }
        }
        int i4 = this.f6006f;
        if (i4 != -1) {
            a(i4);
        }
    }

    public static a a(com.beizi.ad.internal.a.a aVar, e eVar, ServerResponse serverResponse) {
        return new a(aVar, eVar, serverResponse);
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    private void b(int i4) {
        if (this.f6005e) {
            return;
        }
        e eVar = this.f6002b;
        com.beizi.ad.internal.a.a aVar = this.f6003c;
        if (aVar == null || StringUtil.isEmpty(aVar.f())) {
            if (i4 == -1) {
                return;
            }
            HaoboLog.w(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.fire_cb_result_null));
            if (eVar == null) {
                HaoboLog.e(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.fire_cb_requester_null));
                return;
            } else {
                eVar.a((ServerResponse) null);
                return;
            }
        }
        boolean z4 = i4 == -1 ? true : (eVar == null || eVar.b() == null || eVar.b().size() <= 0) ? false : true;
        AsyncTaskC0178a asyncTaskC0178a = new AsyncTaskC0178a(this, eVar, this.f6003c.f(), i4, this.f6003c.g(), z4, f(), a(eVar), null);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                asyncTaskC0178a.executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
            } else {
                asyncTaskC0178a.execute(new Void[0]);
            }
        } catch (RejectedExecutionException e5) {
            String str = HaoboLog.baseLogTag;
            HaoboLog.e(str, "Concurrent Thread Exception while firing ResultCB: " + e5.getMessage());
        } catch (Exception e6) {
            String str2 = HaoboLog.baseLogTag;
            HaoboLog.e(str2, "Exception while firing ResultCB: " + e6.getMessage());
        }
        if (!z4 || i4 == -1 || eVar == null) {
            return;
        }
        eVar.a((ServerResponse) null);
    }

    private long f() {
        long j4 = this.f6009i;
        if (j4 > 0) {
            long j5 = this.f6010j;
            if (j5 > 0) {
                return j5 - j4;
            }
            return -1L;
        }
        return -1L;
    }

    void c() {
        this.f6008h.removeMessages(0);
    }

    protected void d() {
        this.f6009i = System.currentTimeMillis();
    }

    protected void e() {
        this.f6010j = System.currentTimeMillis();
    }

    private void a(Throwable th, String str) {
        HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_instantiation_failure, th.getClass().getSimpleName()));
        if (!StringUtil.isEmpty(str)) {
            HaoboLog.w(HaoboLog.mediationLogTag, String.format("Adding %s to invalid networks list", str));
            g.a().a(j.NATIVE, str);
        }
        this.f6006f = 3;
    }

    protected void a() {
        this.f6003c = null;
        HaoboLog.d(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_finish));
    }

    public void a(int i4) {
        if (this.f6004d || this.f6005e) {
            return;
        }
        e();
        c();
        b(i4);
        this.f6005e = true;
        a();
    }

    private long a(e eVar) {
        if (eVar != null) {
            long j4 = this.f6010j;
            if (j4 > 0) {
                return eVar.a(j4);
            }
            return -1L;
        }
        return -1L;
    }

    public void a(boolean z4) {
        this.f6007g = z4;
        if (z4) {
            a();
        }
    }

    void b() {
        if (this.f6004d || this.f6005e) {
            return;
        }
        this.f6008h.sendEmptyMessageDelayed(0, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
    }
}
