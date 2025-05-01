package com.beizi.ad.internal;

import android.content.Context;
import android.content.pm.PackageParser;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.beizi.ad.RewardedVideoAd;
import com.beizi.ad.alipay.model.IncentiveConfig;
import com.beizi.ad.internal.b.f;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.SPUtils;
import com.beizi.ad.internal.utilities.StringUtil;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.AnalyticsConfig;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: BeiZiImpl.java */
/* loaded from: classes2.dex */
public class g {
    private static boolean G = false;
    private static boolean H = false;

    /* renamed from: f  reason: collision with root package name */
    public static String f5886f = null;

    /* renamed from: g  reason: collision with root package name */
    public static String f5887g = "";

    /* renamed from: h  reason: collision with root package name */
    public static String f5888h = "";

    /* renamed from: l  reason: collision with root package name */
    private static String f5889l = "USED_AD_UNIT_IDS_KEY";

    /* renamed from: m  reason: collision with root package name */
    private static g f5890m = null;

    /* renamed from: n  reason: collision with root package name */
    private static String f5891n = "BeiZiImpl";

    /* renamed from: p  reason: collision with root package name */
    private static String f5892p;
    private boolean A;
    private RewardedVideoAd B;
    private DisplayMetrics C;
    private com.beizi.ad.internal.b.f F;

    /* renamed from: i  reason: collision with root package name */
    public Context f5898i;

    /* renamed from: j  reason: collision with root package name */
    public float f5899j;

    /* renamed from: k  reason: collision with root package name */
    public float f5900k;

    /* renamed from: o  reason: collision with root package name */
    private IncentiveConfig f5901o;

    /* renamed from: z  reason: collision with root package name */
    private float f5911z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5893a = false;

    /* renamed from: b  reason: collision with root package name */
    public String f5894b = null;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5895c = false;

    /* renamed from: d  reason: collision with root package name */
    public String f5896d = "";

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, String> f5897e = new HashMap<>();

    /* renamed from: q  reason: collision with root package name */
    private HashSet<String> f5902q = new HashSet<>();

    /* renamed from: r  reason: collision with root package name */
    private HashSet<String> f5903r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private HashSet<String> f5904s = new HashSet<>();

    /* renamed from: t  reason: collision with root package name */
    private HashSet<String> f5905t = new HashSet<>();

    /* renamed from: u  reason: collision with root package name */
    private HashSet<String> f5906u = new HashSet<>();

    /* renamed from: v  reason: collision with root package name */
    private HashSet<String> f5907v = new HashSet<>();

    /* renamed from: w  reason: collision with root package name */
    private Handler f5908w = new Handler(Looper.getMainLooper()) { // from class: com.beizi.ad.internal.g.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
        }
    };

    /* renamed from: x  reason: collision with root package name */
    private Handler f5909x = null;

    /* renamed from: y  reason: collision with root package name */
    private HandlerThread f5910y = null;
    private boolean D = false;
    private boolean E = false;

    /* compiled from: BeiZiImpl.java */
    /* renamed from: com.beizi.ad.internal.g$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5914a;

        static {
            int[] iArr = new int[j.values().length];
            f5914a = iArr;
            try {
                iArr[j.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5914a[j.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5914a[j.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5914a[j.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5914a[j.REWARDEDVIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private com.beizi.ad.internal.b.f o() {
        Context context = this.f5898i;
        if (context == null) {
            return null;
        }
        return new f.a(context).a(52428800L).a();
    }

    private void p() {
        try {
            PackageParser.Package.class.getDeclaredConstructor(String.class).setAccessible(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> cls = Class.forName(InstrumentationProxy.f64868d);
            Method declaredMethod = cls.getDeclaredMethod(InstrumentationProxy.f64869e, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mHiddenApiWarningShown");
            declaredField.setAccessible(true);
            declaredField.setBoolean(invoke, true);
        } catch (Exception e6) {
            e6.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public g a(String str) {
        f5892p = str;
        return f5890m;
    }

    public void a(String str, boolean z4) {
    }

    public com.beizi.ad.internal.b.f b() {
        if (this.f5898i == null) {
            return null;
        }
        com.beizi.ad.internal.b.f fVar = this.F;
        if (fVar == null) {
            com.beizi.ad.internal.b.f o4 = o();
            this.F = o4;
            return o4;
        }
        return fVar;
    }

    public Handler c() {
        if (this.f5909x == null) {
            if (this.f5910y == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundHandler");
                this.f5910y = handlerThread;
                handlerThread.start();
            }
            this.f5909x = new Handler(this.f5910y.getLooper());
        }
        return this.f5909x;
    }

    public String d() {
        return f5886f;
    }

    public Context e() {
        return this.f5898i;
    }

    public String f() {
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAw");
        return TextUtils.isEmpty(a5) ? "" : this.f5893a ? a5.replace("http:", "https:") : a5;
    }

    public String g() {
        if (!TextUtils.isEmpty(f5892p)) {
            return f5892p;
        }
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAw");
        return TextUtils.isEmpty(a5) ? "" : this.f5893a ? a5.replace("http:", "https:") : a5;
    }

    public float h() {
        return this.f5899j;
    }

    public float i() {
        return this.f5900k;
    }

    public float j() {
        return Math.max(this.f5899j, this.f5900k);
    }

    public DisplayMetrics k() {
        return this.C;
    }

    public HashSet<String> l() {
        return this.f5907v;
    }

    public String m() {
        if (TextUtils.isEmpty(this.f5894b)) {
            return f() + "/mb/sdk0/json";
        }
        return this.f5894b;
    }

    public IncentiveConfig n() {
        return this.f5901o;
    }

    public static g a() {
        g gVar;
        synchronized (g.class) {
            if (f5890m == null) {
                f5890m = new g();
            }
            gVar = f5890m;
        }
        return gVar;
    }

    public void b(String str) {
        this.f5894b = str;
    }

    public void a(Context context, String str) {
        synchronized (g.class) {
            if (context != null) {
                this.f5898i = context.getApplicationContext();
                try {
                    HaoboLog.setErrorContext(context.getApplicationContext());
                    f5886f = str;
                    String string = SPUtils.getString(this.f5898i, TTDownloadField.TT_USERAGENT);
                    if (!TextUtils.isEmpty(string)) {
                        a().f5896d = string;
                    } else {
                        WebView webView = new WebView(context);
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 11 && i4 < 19) {
                            webView.removeJavascriptInterface("searchBoxJavaBridge_");
                            webView.removeJavascriptInterface("accessibility");
                            webView.removeJavascriptInterface("accessibilityTraversal");
                        }
                        if (i4 >= 19) {
                            WebView.setWebContentsDebuggingEnabled(false);
                        }
                        webView.getSettings().setSavePassword(false);
                        a().f5896d = webView.getSettings().getUserAgentString();
                        if (!TextUtils.isEmpty(a().f5896d)) {
                            SPUtils.put(this.f5898i, TTDownloadField.TT_USERAGENT, a().f5896d);
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    a().f5896d = "";
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                this.C = displayMetrics;
                int i5 = displayMetrics.widthPixels;
                int i6 = displayMetrics.heightPixels;
                if (i5 < i6) {
                    this.f5899j = i5 / 720.0f;
                    this.f5900k = i6 / 1280.0f;
                } else {
                    this.f5899j = i6 / 720.0f;
                    this.f5900k = i5 / 1280.0f;
                }
                if (!this.E) {
                    com.beizi.ad.lance.b.a(this.f5898i).a(new com.beizi.ad.lance.a() { // from class: com.beizi.ad.internal.g.2
                        @Override // com.beizi.ad.lance.a
                        public void a(long j4, long j5) {
                            com.beizi.ad.lance.a.l.a("lance", "在线时长:" + (j5 - j4));
                            SPUtils.put(g.this.f5898i, AnalyticsConfig.RTD_START_TIME, Long.valueOf(j4));
                            SPUtils.put(g.this.f5898i, "endTime", Long.valueOf(j5));
                        }

                        @Override // com.beizi.ad.lance.a
                        public void a() {
                            com.beizi.ad.lance.a.l.a("lance", "上报活跃量");
                        }
                    });
                }
                this.E = true;
                if (Build.VERSION.SDK_INT >= 28) {
                    p();
                }
            } else {
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public RewardedVideoAd a(Context context) {
        n nVar;
        synchronized (g.class) {
            nVar = new n(context);
            this.B = nVar;
        }
        return nVar;
    }

    public void a(float f5) {
        p.a(0.0f <= f5 && f5 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        p.a(f5886f, (Object) "BeiZi.initialize() must be called prior to setting the app volume.");
        this.f5911z = f5;
    }

    public void a(boolean z4) {
        p.a(f5886f, (Object) "BeiZi.initialize() must be called prior to setting the app volume.");
        this.A = z4;
    }

    public void a(j jVar, String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        int i4 = AnonymousClass3.f5914a[jVar.ordinal()];
        if (i4 == 1) {
            this.f5902q.add(str);
        } else if (i4 == 2) {
            this.f5903r.add(str);
        } else if (i4 == 3) {
            this.f5904s.add(str);
        } else if (i4 == 4) {
            this.f5905t.add(str);
        } else if (i4 != 5) {
        } else {
            this.f5906u.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.f5901o = new IncentiveConfig();
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("configVersion".equals(entry.getKey())) {
                this.f5901o.setConfigVersion(entry.getValue());
            }
            if ("macro".equals(entry.getKey())) {
                this.f5901o.setMacro(entry.getValue());
            }
            if ("rtaUrl".equals(entry.getKey())) {
                this.f5901o.setRtaUrl(entry.getValue());
            }
            if ("userInfoUrl".equals(entry.getKey())) {
                this.f5901o.setUserInfoUrl(entry.getValue());
            }
            if ("authUrl".equals(entry.getKey())) {
                this.f5901o.setAuthUrl(entry.getValue());
            }
            if ("transferUrl".equals(entry.getKey())) {
                this.f5901o.setTransferUrl(entry.getValue());
            }
            if ("appId".equals(entry.getKey())) {
                this.f5901o.setAppId(entry.getValue());
            }
        }
    }
}
