package com.beizi.ad.internal.a;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.DeviceInfo;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import com.join.mgps.Util.h0;
import com.kwad.components.offline.api.explore.model.ExploreConstants;
import com.umeng.analytics.pro.bm;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: MediationAdViewController.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: j  reason: collision with root package name */
    static HashMap<String, String> f5621j = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    protected j f5622a;

    /* renamed from: b  reason: collision with root package name */
    protected com.beizi.ad.b.b f5623b;

    /* renamed from: c  reason: collision with root package name */
    protected com.beizi.ad.internal.a.a f5624c;

    /* renamed from: d  reason: collision with root package name */
    protected com.beizi.ad.internal.b f5625d;

    /* renamed from: f  reason: collision with root package name */
    protected ServerResponse f5627f;

    /* renamed from: l  reason: collision with root package name */
    private SoftReference<com.beizi.ad.internal.e> f5632l;

    /* renamed from: e  reason: collision with root package name */
    protected e f5626e = new e(this);

    /* renamed from: g  reason: collision with root package name */
    protected boolean f5628g = false;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f5629h = false;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f5630i = false;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f5633m = new HandlerC0175b(this);

    /* renamed from: n  reason: collision with root package name */
    private long f5634n = -1;

    /* renamed from: o  reason: collision with root package name */
    private long f5635o = -1;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f5631k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediationAdViewController.java */
    /* renamed from: com.beizi.ad.internal.a.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements com.beizi.ad.internal.network.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f5636a;

        @Override // com.beizi.ad.internal.network.b
        public j a() {
            return this.f5636a.f5622a;
        }

        @Override // com.beizi.ad.internal.network.b
        public boolean b() {
            return true;
        }

        @Override // com.beizi.ad.internal.network.b
        public com.beizi.ad.internal.view.c c() {
            return this.f5636a.f5626e;
        }

        @Override // com.beizi.ad.internal.network.b
        public NativeAdResponse d() {
            return null;
        }

        @Override // com.beizi.ad.internal.network.b
        public String e() {
            return "";
        }

        @Override // com.beizi.ad.internal.network.b
        public String f() {
            return null;
        }

        @Override // com.beizi.ad.internal.network.b
        public String g() {
            return null;
        }

        @Override // com.beizi.ad.internal.network.b
        public void h() {
            this.f5636a.f5626e.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediationAdViewController.java */
    /* loaded from: classes2.dex */
    public class a extends HTTPGet {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<com.beizi.ad.internal.e> f5637a;

        /* renamed from: b  reason: collision with root package name */
        final int f5638b;

        /* renamed from: d  reason: collision with root package name */
        private final String f5640d;

        /* renamed from: e  reason: collision with root package name */
        private final HashMap<String, Object> f5641e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f5642f;

        /* renamed from: g  reason: collision with root package name */
        private final long f5643g;

        /* renamed from: h  reason: collision with root package name */
        private final long f5644h;

        /* synthetic */ a(b bVar, com.beizi.ad.internal.e eVar, String str, int i4, HashMap hashMap, boolean z4, long j4, long j5, AnonymousClass1 anonymousClass1) {
            this(eVar, str, i4, hashMap, z4, j4, j5);
        }

        @Override // com.beizi.ad.internal.utilities.HTTPGet
        protected String getUrl() {
            StringBuilder sb = new StringBuilder(this.f5640d);
            sb.append("&errorCode=");
            sb.append(this.f5638b);
            DeviceInfo deviceInfo = DeviceInfo.getInstance();
            if (!StringUtil.isEmpty(deviceInfo.sdkUID)) {
                sb.append("&sdkuid=");
                sb.append(Uri.encode(deviceInfo.sdkUID));
            }
            if (this.f5643g > 0) {
                sb.append("&latency=");
                sb.append(Uri.encode(String.valueOf(this.f5643g)));
            }
            if (this.f5644h > 0) {
                sb.append("&total_latency=");
                sb.append(Uri.encode(String.valueOf(this.f5644h)));
            }
            return sb.toString();
        }

        private a(com.beizi.ad.internal.e eVar, String str, int i4, HashMap<String, Object> hashMap, boolean z4, long j4, long j5) {
            super(true, true);
            this.f5637a = new WeakReference<>(eVar);
            this.f5640d = str;
            this.f5638b = i4;
            this.f5641e = hashMap;
            this.f5642f = z4;
            this.f5643g = j4;
            this.f5644h = j5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.beizi.ad.internal.utilities.HTTPGet, android.os.AsyncTask
        public void onPostExecute(HTTPResponse hTTPResponse) {
            if (this.f5642f) {
                HaoboLog.i(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.result_cb_ignored));
                return;
            }
            com.beizi.ad.internal.e eVar = this.f5637a.get();
            if (eVar == null) {
                HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.fire_cb_requester_null));
                return;
            }
            ServerResponse serverResponse = null;
            if (hTTPResponse != null && hTTPResponse.getSucceeded()) {
                serverResponse = new ServerResponse(hTTPResponse, b.this.f5622a);
                if (this.f5641e.containsKey(ServerResponse.EXTRAS_KEY_ORIENTATION)) {
                    serverResponse.setAdOrientation(this.f5641e.get(ServerResponse.EXTRAS_KEY_ORIENTATION).equals(bm.aK) ? 1 : 2);
                }
            } else {
                HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.result_cb_bad_response));
            }
            eVar.a(serverResponse);
        }
    }

    /* compiled from: MediationAdViewController.java */
    /* renamed from: com.beizi.ad.internal.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class HandlerC0175b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<b> f5645a;

        public HandlerC0175b(b bVar) {
            this.f5645a = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar = this.f5645a.get();
            if (bVar == null || bVar.f5628g) {
                return;
            }
            HaoboLog.w(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_timeout));
            try {
                bVar.a(0);
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                bVar.f5625d = null;
                bVar.f5623b = null;
                bVar.f5624c = null;
                throw th;
            }
            bVar.f5625d = null;
            bVar.f5623b = null;
            bVar.f5624c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.beizi.ad.internal.e eVar, com.beizi.ad.internal.a.a aVar, com.beizi.ad.internal.b bVar, j jVar, ServerResponse serverResponse) {
        int i4;
        if (f5621j.isEmpty()) {
            a("1", "Baidu");
            a("4", "GDT");
            a("43", "AFP");
        }
        this.f5627f = serverResponse;
        this.f5632l = new SoftReference<>(eVar);
        this.f5624c = aVar;
        this.f5625d = bVar;
        this.f5622a = jVar;
        if (aVar == null) {
            HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_no_ads));
            i4 = 3;
        } else {
            i4 = !l() ? 2 : -1;
        }
        if (i4 != -1) {
            a(i4);
        }
    }

    private boolean l() {
        String str;
        HaoboLog.d(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.instantiating_class, this.f5624c.a()));
        try {
            String str2 = this.f5624c.a() + h0.f27805a + this.f5622a.toString();
            String str3 = f5621j.get(str2);
            String str4 = com.beizi.ad.internal.g.a().f5897e.get(str2);
            if (StringUtil.isEmpty(str4)) {
                if (StringUtil.isEmpty(str3)) {
                    str = getClass().getPackage().getName() + h0.f27805a + str2;
                } else {
                    str = getClass().getPackage().getName() + h0.f27805a + str3;
                }
                this.f5623b = (com.beizi.ad.b.b) Class.forName(str).newInstance();
            } else {
                this.f5623b = (com.beizi.ad.b.b) Class.forName(getClass().getPackage().getName() + h0.f27805a + str4).getConstructor(String.class).newInstance(str2);
            }
            return true;
        } catch (ClassCastException e5) {
            a(e5, this.f5624c.a());
            return false;
        } catch (ClassNotFoundException e6) {
            a(e6, this.f5624c.a());
            return false;
        } catch (IllegalAccessException e7) {
            a(e7, this.f5624c.a());
            return false;
        } catch (InstantiationException e8) {
            a(e8, this.f5624c.a());
            return false;
        } catch (LinkageError e9) {
            a(e9, this.f5624c.a());
            return false;
        } catch (NoSuchMethodException e10) {
            a(e10, this.f5624c.a());
            return false;
        } catch (InvocationTargetException e11) {
            a(e11, this.f5624c.a());
            return false;
        }
    }

    private long m() {
        long j4 = this.f5634n;
        if (j4 > 0) {
            long j5 = this.f5635o;
            if (j5 > 0) {
                return j5 - j4;
            }
            return -1L;
        }
        return -1L;
    }

    void a(String str, String str2) {
        f5621j.put(str + ".SPLASH", str2 + ExploreConstants.SCENE_SPLASH);
        f5621j.put(str + ".BANNER", str2 + "Banner");
        f5621j.put(str + ".INTERSTITIAL", str2 + ExploreConstants.SCENE_INTERSTITIAL);
        f5621j.put(str + ".NATIVE", str2 + "Native");
        f5621j.put(str + ".REWARDEDVIDEO", str2 + ExploreConstants.SCENE_INTERSTITIAL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        com.beizi.ad.b.b bVar = this.f5623b;
        if (bVar != null) {
            bVar.b();
        }
        this.f5630i = true;
        this.f5623b = null;
        this.f5624c = null;
        HaoboLog.d(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_finish));
    }

    public abstract void c();

    public boolean d() {
        return this.f5630i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f5629h || this.f5628g) {
            return;
        }
        this.f5633m.sendEmptyMessageDelayed(0, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
    }

    void f() {
        this.f5633m.removeMessages(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        this.f5634n = System.currentTimeMillis();
    }

    protected void h() {
        this.f5635o = System.currentTimeMillis();
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Class cls) {
        if (this.f5628g) {
            return false;
        }
        com.beizi.ad.b.b bVar = this.f5623b;
        if (bVar == null || cls == null || !cls.isInstance(bVar)) {
            HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.instance_exception, cls != null ? cls.getCanonicalName() : "null"));
            a(3);
            return false;
        }
        return true;
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    private void b(int i4) {
        if (this.f5628g) {
            return;
        }
        com.beizi.ad.internal.e eVar = this.f5632l.get();
        com.beizi.ad.internal.a.a aVar = this.f5624c;
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
        try {
            new a(this, eVar, this.f5624c.f(), i4, this.f5624c.g(), z4, m(), a(eVar), null).execute(new Void[0]);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public com.beizi.ad.b.a a() {
        com.beizi.ad.internal.e eVar = this.f5632l.get();
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    private void a(Throwable th, String str) {
        HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediation_instantiation_failure, th.getClass().getSimpleName()));
        if (StringUtil.isEmpty(str)) {
            return;
        }
        HaoboLog.w(HaoboLog.mediationLogTag, String.format("Adding %s to invalid networks list", str));
        com.beizi.ad.internal.g.a().a(this.f5622a, str);
    }

    public void a(int i4) {
        if (this.f5629h || this.f5628g || this.f5630i) {
            return;
        }
        h();
        f();
        b(i4);
        this.f5628g = true;
        b();
    }

    private long a(com.beizi.ad.internal.e eVar) {
        if (eVar != null) {
            long j4 = this.f5635o;
            if (j4 > 0) {
                return eVar.a(j4);
            }
            return -1L;
        }
        return -1L;
    }

    public void a(boolean z4) {
        this.f5631k = z4;
        if (z4) {
            b();
        }
    }
}
