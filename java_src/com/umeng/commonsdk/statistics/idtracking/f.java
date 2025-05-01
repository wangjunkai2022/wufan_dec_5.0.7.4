package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.ce;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: IdTracker.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final long f64430a = 86400000;

    /* renamed from: b  reason: collision with root package name */
    public static f f64431b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f64432c = aw.b().b("id");

    /* renamed from: j  reason: collision with root package name */
    private static Object f64433j = new Object();

    /* renamed from: d  reason: collision with root package name */
    private File f64434d;

    /* renamed from: f  reason: collision with root package name */
    private long f64436f;

    /* renamed from: i  reason: collision with root package name */
    private a f64439i;

    /* renamed from: e  reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.c f64435e = null;

    /* renamed from: h  reason: collision with root package name */
    private Set<com.umeng.commonsdk.statistics.idtracking.a> f64438h = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private long f64437g = 86400000;

    /* compiled from: IdTracker.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f64440a;

        /* renamed from: b  reason: collision with root package name */
        private Set<String> f64441b = new HashSet();

        public a(Context context) {
            this.f64440a = context;
        }

        public synchronized boolean a(String str) {
            return !this.f64441b.contains(str);
        }

        public synchronized void b(String str) {
            this.f64441b.add(str);
        }

        public void c(String str) {
            this.f64441b.remove(str);
        }

        public synchronized void a() {
            if (!this.f64441b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : this.f64441b) {
                    sb.append(str);
                    sb.append(StringUtil.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f64440a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public synchronized void b() {
            String[] split;
            String string = PreferenceWrapper.getDefault(this.f64440a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (split = string.split(",")) != null) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f64441b.add(str);
                    }
                }
            }
        }
    }

    f(Context context) {
        this.f64439i = null;
        this.f64434d = new File(context.getFilesDir(), f64432c);
        a aVar = new a(context);
        this.f64439i = aVar;
        aVar.b();
    }

    public static synchronized void a() {
        synchronized (f.class) {
            f fVar = f64431b;
            if (fVar != null) {
                fVar.e();
                f64431b = null;
            }
        }
    }

    private synchronized void h() {
        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f64438h) {
            if (aVar.c()) {
                if (aVar.d() != null) {
                    hashMap.put(aVar.b(), aVar.d());
                }
                if (aVar.e() != null && !aVar.e().isEmpty()) {
                    arrayList.addAll(aVar.e());
                }
            }
        }
        cVar.a(arrayList);
        cVar.a(hashMap);
        synchronized (this) {
            this.f64435e = cVar;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f64433j) {
            if (!this.f64434d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f64434d);
                try {
                    try {
                        byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new by().a(cVar, readStreamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    public synchronized void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f64436f >= this.f64437g) {
            boolean z4 = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f64438h) {
                if (aVar.c() && aVar.a()) {
                    z4 = true;
                    if (!aVar.c()) {
                        this.f64439i.b(aVar.b());
                    }
                }
            }
            if (z4) {
                h();
                this.f64439i.a();
                g();
            }
            this.f64436f = currentTimeMillis;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.f64435e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        if (f64431b == null) {
            return;
        }
        boolean z4 = false;
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f64438h) {
            if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                z4 = true;
            }
        }
        if (z4) {
            this.f64435e.b(false);
            g();
        }
    }

    public synchronized void f() {
        com.umeng.commonsdk.statistics.proto.c i4 = i();
        if (i4 == null) {
            return;
        }
        a(i4);
        ArrayList<com.umeng.commonsdk.statistics.idtracking.a> arrayList = new ArrayList(this.f64438h.size());
        synchronized (this) {
            this.f64435e = i4;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f64438h) {
                aVar.a(this.f64435e);
                if (!aVar.c()) {
                    arrayList.add(aVar);
                }
            }
            for (com.umeng.commonsdk.statistics.idtracking.a aVar2 : arrayList) {
                this.f64438h.remove(aVar2);
            }
            h();
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.f64435e;
        if (cVar != null) {
            b(cVar);
        }
    }

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (f.class) {
            if (f64431b == null) {
                f fVar2 = new f(context);
                f64431b = fVar2;
                fVar2.a(new g(context));
                f64431b.a(new b(context));
                f64431b.a(new k(context));
                f64431b.a(new e(context));
                f64431b.a(new d(context));
                f64431b.a(new h(context));
                f64431b.a(new j());
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                    f64431b.a(new i(context));
                    if (DeviceConfig.isHonorDevice()) {
                        f64431b.a(new c(context));
                    }
                }
                f64431b.f();
            }
            fVar = f64431b;
        }
        return fVar;
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] a5;
        synchronized (f64433j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        a5 = new ce().a(cVar);
                    }
                    if (a5 != null) {
                        HelperUtils.writeFile(this.f64434d, a5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.f64439i.a(aVar.b())) {
            return this.f64438h.add(aVar);
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.w("invalid domain: " + aVar.b());
            return false;
        }
        return false;
    }

    public void a(long j4) {
        this.f64437g = j4;
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map;
        if (cVar == null || (map = cVar.f64526a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f64606h)) {
            cVar.f64526a.remove("mac");
        }
        if (cVar.f64526a.containsKey("imei") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f64605g)) {
            cVar.f64526a.remove("imei");
        }
        if (cVar.f64526a.containsKey("android_id") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f64607i)) {
            cVar.f64526a.remove("android_id");
        }
        if (cVar.f64526a.containsKey("serial") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f64608j)) {
            cVar.f64526a.remove("serial");
        }
        if (cVar.f64526a.containsKey("idfa") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f64621w)) {
            cVar.f64526a.remove("idfa");
        }
        if (!cVar.f64526a.containsKey("oaid") || FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        cVar.f64526a.remove("oaid");
    }
}
