package com.qq.e.comm.managers.plugin;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.qq.e.comm.constants.Sig;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.GDTLogger;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class PM {
    public static final int CALL_START_BY_DEV = 1;

    /* renamed from: r  reason: collision with root package name */
    private static final Map<Class<?>, String> f59842r = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Context f59844b;

    /* renamed from: c  reason: collision with root package name */
    private String f59845c;

    /* renamed from: d  reason: collision with root package name */
    private File f59846d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f59847e;

    /* renamed from: f  reason: collision with root package name */
    private DexClassLoader f59848f;

    /* renamed from: g  reason: collision with root package name */
    private RandomAccessFile f59849g;

    /* renamed from: h  reason: collision with root package name */
    private FileLock f59850h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f59851i;

    /* renamed from: j  reason: collision with root package name */
    private final f f59852j;

    /* renamed from: k  reason: collision with root package name */
    private volatile POFactory f59853k;

    /* renamed from: l  reason: collision with root package name */
    private int f59854l;

    /* renamed from: m  reason: collision with root package name */
    private Future<Boolean> f59855m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f59857o;

    /* renamed from: p  reason: collision with root package name */
    private String f59858p;

    /* renamed from: q  reason: collision with root package name */
    private JSONObject f59859q;

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f59843a = Executors.newSingleThreadExecutor();

    /* renamed from: n  reason: collision with root package name */
    private boolean f59856n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Callable<Boolean> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            PM.c(PM.this);
            if (!PM.this.f59851i) {
                PM pm = PM.this;
                pm.f59851i = pm.tryLockUpdate();
            }
            if (PM.h(PM.this)) {
                PM.j(PM.this);
            }
            PM.this.f59854l = (int) (System.currentTimeMillis() - currentTimeMillis);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes5.dex */
    static class b extends HashMap<Class<?>, String> {
        b() {
            put(POFactory.class, "com.qq.e.comm.plugin.POFactoryImpl");
        }
    }

    public PM(Context context, f fVar) {
        this.f59844b = context.getApplicationContext();
        this.f59852j = fVar;
        com.qq.e.comm.managers.plugin.b.a(context);
        i();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int pluginVersion = getPluginVersion();
            if (pluginVersion > 10000) {
                jSONObject.put("vas", this.f59858p);
            }
            jSONObject.put(com.umeng.analytics.pro.f.T, pluginVersion);
            jSONObject.put("sig", this.f59845c);
            jSONObject.put("appId", com.qq.e.comm.managers.a.b().a());
            jSONObject.put("pn", com.qq.e.comm.managers.plugin.b.a(this.f59844b));
            jSONObject.put("ict", this.f59854l);
            jSONObject.put("mup", this.f59851i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static void c(PM pm) {
        SharedPreferences sharedPreferences = pm.f59844b.getSharedPreferences("start_crash", 0);
        if (sharedPreferences.getInt("crash_count", 0) >= 2) {
            pm.f59857o = true;
            sharedPreferences.edit().remove("crash_count").commit();
            GDTLogger.e("加载本地插件");
        }
    }

    private boolean e() {
        if (this.f59851i) {
            try {
                Context context = this.f59844b;
                com.qq.e.comm.managers.plugin.b.b(context, h.h(context), h.i(this.f59844b));
                this.f59845c = Sig.ASSET_PLUGIN_SIG;
                this.f59846d = h.h(this.f59844b);
                this.f59847e = SDKStatus.getBuildInPluginVersion();
                return true;
            } catch (Throwable th) {
                GDTLogger.e("插件初始化失败 ");
                com.qq.e.comm.managers.plugin.a.a(th, th.getMessage());
                return false;
            }
        }
        return false;
    }

    private boolean g() {
        if (this.f59857o) {
            return false;
        }
        if (this.f59851i) {
            g gVar = new g(h.f(this.f59844b), h.g(this.f59844b));
            if (gVar.c(this.f59844b, false)) {
                boolean d5 = gVar.d(h.h(this.f59844b), h.i(this.f59844b), this.f59844b);
                GDTLogger.d("NextExist,Updated=" + d5);
            }
        }
        g gVar2 = new g(h.h(this.f59844b), h.i(this.f59844b));
        if (gVar2.c(this.f59844b, true)) {
            if (gVar2.e() >= SDKStatus.getBuildInPluginVersion()) {
                this.f59845c = gVar2.a();
                this.f59847e = gVar2.e();
                this.f59846d = h.h(this.f59844b);
                this.f59858p = gVar2.c();
                this.f59856n = true;
                return true;
            }
            GDTLogger.d("last updated plugin version =" + this.f59847e + ";asset plugin version=" + SDKStatus.getBuildInPluginVersion());
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r5.e() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean h(com.qq.e.comm.managers.plugin.PM r5) {
        /*
            java.lang.String r0 = "TimeStap_AFTER_PLUGIN_INIT:"
            java.util.Objects.requireNonNull(r5)
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "TimeStap_BEFORE_PLUGIN_INIT:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L32
            com.qq.e.comm.util.GDTLogger.d(r2)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r5.g()     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L2a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L2c
        L2a:
            r5 = 1
            r1 = 1
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L44
        L32:
            r5 = move-exception
            java.lang.String r2 = "插件加载出现异常"
            com.qq.e.comm.util.GDTLogger.e(r2, r5)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L56
            com.qq.e.comm.managers.plugin.a.a(r5, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L44:
            r5.append(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.qq.e.comm.util.GDTLogger.d(r5)
            return r1
        L56:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.qq.e.comm.util.GDTLogger.d(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.e.comm.managers.plugin.PM.h(com.qq.e.comm.managers.plugin.PM):boolean");
    }

    private void i() {
        this.f59856n = false;
        this.f59855m = this.f59843a.submit(new a());
    }

    static void j(PM pm) {
        Objects.requireNonNull(pm);
        StringBuilder sb = new StringBuilder();
        sb.append("PluginFile:\t");
        File file = pm.f59846d;
        sb.append(file == null ? "null" : file.getAbsolutePath());
        GDTLogger.d(sb.toString());
        if (pm.f59845c == null || pm.f59846d == null) {
            pm.f59848f = null;
            return;
        }
        try {
            pm.f59848f = new DexClassLoader(pm.f59846d.getAbsolutePath(), h.a(pm.f59844b).getAbsolutePath(), null, pm.getClass().getClassLoader());
            f fVar = pm.f59852j;
            if (fVar != null) {
                fVar.a();
            }
        } catch (Throwable th) {
            GDTLogger.e("插件ClassLoader构造发生异常", th);
            f fVar2 = pm.f59852j;
            if (fVar2 != null) {
                fVar2.b();
            }
            com.qq.e.comm.managers.plugin.a.a(th, th.getMessage());
        }
    }

    public <T> T getFactory(Class<T> cls) throws e {
        Future<Boolean> future = this.f59855m;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        GDTLogger.d("GetFactoryInstaceforInterface:" + cls);
        ClassLoader classLoader = Sig.ASSET_PLUGIN_SIG == null ? PM.class.getClassLoader() : this.f59848f;
        StringBuilder sb = new StringBuilder();
        sb.append("PluginClassLoader is parent");
        sb.append(PM.class.getClassLoader() == classLoader);
        GDTLogger.d(sb.toString());
        if (classLoader == null) {
            throw new e("Fail to init GDTADPLugin,PluginClassLoader == null;while loading factory impl for:" + cls);
        }
        try {
            String str = f59842r.get(cls);
            if (TextUtils.isEmpty(str)) {
                throw new e("factory  implemention name is not specified for interface:" + cls.getName());
            }
            Class<?> loadClass = classLoader.loadClass(str);
            T cast = cls.cast(loadClass.getDeclaredMethod("getInstance", Context.class, JSONObject.class).invoke(loadClass, this.f59844b, b()));
            GDTLogger.d("ServiceDelegateFactory =" + cast);
            return cast;
        } catch (Throwable th) {
            throw new e("Fail to getfactory implement instance for interface:" + cls.getName(), th);
        }
    }

    public POFactory getPOFactory() throws e {
        return getPOFactory(true, false);
    }

    public POFactory getPOFactory(boolean z4, boolean z5) throws e {
        if (this.f59853k == null) {
            synchronized (this) {
                if (this.f59853k == null) {
                    try {
                        this.f59853k = (POFactory) getFactory(POFactory.class);
                    } catch (e e5) {
                        if (!this.f59856n) {
                            throw e5;
                        }
                        GDTLogger.e("插件加载错误，回退到内置版本");
                        this.f59857o = true;
                        this.f59856n = false;
                        this.f59855m = this.f59843a.submit(new a());
                        this.f59853k = (POFactory) getFactory(POFactory.class);
                    }
                }
            }
        }
        if (z4 && this.f59853k != null) {
            this.f59853k.start(z5 ? getStartCaller(0) : getStartCaller(2));
        }
        return this.f59853k;
    }

    public int getPluginVersion() {
        Future<Boolean> future = this.f59855m;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return this.f59847e;
    }

    public JSONObject getStartCaller(int i4) {
        if (this.f59859q == null) {
            this.f59859q = new JSONObject();
        }
        try {
            this.f59859q.put("scr", i4);
        } catch (JSONException unused) {
        }
        return this.f59859q;
    }

    public boolean tryLockUpdate() {
        try {
            File e5 = h.e(this.f59844b);
            if (!e5.exists()) {
                e5.createNewFile();
                h.c(org.aspectj.lang.c.f72210k, e5);
            }
            if (e5.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(e5, net.lingala.zip4j.util.e.f71861e0);
                this.f59849g = randomAccessFile;
                FileLock tryLock = randomAccessFile.getChannel().tryLock();
                this.f59850h = tryLock;
                if (tryLock != null) {
                    this.f59849g.writeByte(37);
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
