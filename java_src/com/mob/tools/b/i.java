package com.mob.tools.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kuaishou.weapon.p0.bi;
import com.mob.commons.CSCenter;
import com.mob.commons.s;
import com.mob.commons.x;
import com.mob.commons.y;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.MobPersistence;
import com.umeng.analytics.pro.aw;
import java.io.File;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class i implements com.mob.tools.b.a {

    /* renamed from: d  reason: collision with root package name */
    private Context f56691d;

    /* renamed from: e  reason: collision with root package name */
    private b f56692e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Set<String> f56693f = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f56688a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f56689b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f56690c = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class a<T> {

        /* renamed from: g  reason: collision with root package name */
        public T f56776g;

        public a(T t4) {
            this.f56776g = t4;
        }

        protected long a(T t4) {
            return 0L;
        }

        protected abstract T b() throws Throwable;
    }

    public i(Context context) {
        this.f56691d = context;
        this.f56692e = b.a(context);
        com.mob.tools.utils.h.a();
    }

    private void h(String str) {
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Long> A() {
        return (HashMap) b("meio", new a<HashMap<String, Long>>(null) { // from class: com.mob.tools.b.i.21
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(HashMap<String, Long> hashMap) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public HashMap<String, Long> b() throws Throwable {
                return i.this.f56692e.F();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String B() {
        return (String) b("ale", new a<String>(null) { // from class: com.mob.tools.b.i.22
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return TTAdConstant.AD_MAX_EVENT_TIME;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.i();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String C() {
        return (String) b("sse", new a<String>(null) { // from class: com.mob.tools.b.i.24
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.k();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String D() {
        return com.mob.commons.d.i() ? f(false) : "forbid";
    }

    @Override // com.mob.tools.b.a
    public String E() {
        String lowerCase = D().toLowerCase();
        if (!TextUtils.isEmpty(lowerCase) && !s.a("004e)dk+ef").equals(lowerCase)) {
            if (!lowerCase.startsWith(s.a("002Ohiej")) && !lowerCase.startsWith(s.a("002Bhlej")) && !lowerCase.startsWith(s.a("0023jfej")) && !lowerCase.startsWith(s.a("002<heej"))) {
                if (!lowerCase.startsWith(s.a("004[fgdiefdi")) && !"forbid".equals(lowerCase)) {
                    return s.a("005=dk;ihf$dj");
                }
                return s.a("004Bfgdiefdi");
            }
            return s.a("004cfgg");
        }
        return s.a("004eWdk,ef");
    }

    @Override // com.mob.tools.b.a
    public String F() {
        String lowerCase = D().toLowerCase();
        if (!TextUtils.isEmpty(lowerCase) && !s.a("004e=dkJef").equals(lowerCase)) {
            if (lowerCase.startsWith(s.a("004)fgdiefdi"))) {
                return s.a("004=fgdiefdi");
            }
            if (lowerCase.startsWith(s.a("002Zhiej"))) {
                return s.a("002>hiej");
            }
            if (lowerCase.startsWith(s.a("002Yhlej"))) {
                return s.a("002Ihlej");
            }
            if (lowerCase.startsWith(s.a("0024jfej"))) {
                return s.a("002Ojfej");
            }
            if (lowerCase.startsWith(s.a("002!heej"))) {
                return s.a("002Rheej");
            }
            return lowerCase.startsWith(s.a("009TffFgZdg5fiQdkdk(ih")) ? s.a("009VffGg5dg$fiMdkdkRih") : lowerCase;
        }
        return s.a("004eZdk[ef");
    }

    @Override // com.mob.tools.b.a
    public boolean G() {
        String E = E();
        return s.a("004Yfgdiefdi").equals(E) || s.a("004cfgg").equals(E);
    }

    @Override // com.mob.tools.b.a
    public int H() {
        return ((Integer) b("dtnttp", new a<Integer>(-1) { // from class: com.mob.tools.b.i.26
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.V());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public String I() {
        return (String) b("tize", new a<String>(null) { // from class: com.mob.tools.b.i.27
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.Q();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String J() {
        return (String) b("flvr", new a<String>(null) { // from class: com.mob.tools.b.i.28
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.R();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String K() {
        return (String) b("babd", new a<String>(null) { // from class: com.mob.tools.b.i.29
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.S();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String L() {
        return (String) b("bfsp", new a<String>(null) { // from class: com.mob.tools.b.i.30
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.T();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String M() {
        return (String) b("bopm", new a<String>(null) { // from class: com.mob.tools.b.i.31
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.U();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String N() {
        if (CSCenter.getInstance().isIpAddressEnable()) {
            if (com.mob.commons.d.i()) {
                try {
                    Enumeration<NetworkInterface> a5 = e.a(this.f56691d).a();
                    while (a5.hasMoreElements()) {
                        Enumeration<InetAddress> a6 = e.a(this.f56691d).a(a5.nextElement());
                        while (a6.hasMoreElements()) {
                            InetAddress nextElement = a6.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                return nextElement.getHostAddress();
                            }
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    MobLog.getInstance().w(th);
                    return null;
                }
            }
            return com.join.mgps.socket.entity.b.f54683j;
        }
        return CSCenter.getInstance().getIpAddress();
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> O() {
        return i(false);
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> P() {
        ArrayList<HashMap<String, String>> a5;
        synchronized ("gsl") {
            a5 = this.f56692e.a(i(false), 2);
        }
        return a5;
    }

    @Override // com.mob.tools.b.a
    public String Q() {
        return (String) b("deky", new a<String>(null) { // from class: com.mob.tools.b.i.33
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.a(false);
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String R() {
        return (String) b("scph", new a<String>(null) { // from class: com.mob.tools.b.i.35
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.t();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String S() {
        return this.f56692e.b(T());
    }

    @Override // com.mob.tools.b.a
    public String T() {
        return (String) b("pne", new a<String>(null) { // from class: com.mob.tools.b.i.36
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.o();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String U() {
        return this.f56692e.p();
    }

    @Override // com.mob.tools.b.a
    public int V() {
        return this.f56692e.q();
    }

    @Override // com.mob.tools.b.a
    public String W() {
        return this.f56692e.r();
    }

    @Override // com.mob.tools.b.a
    public boolean X() {
        return ((Boolean) a(aw.f63372c, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.37
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(i.this.f56692e.X());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String Y() {
        return (String) a("cpne", new a<String>(null) { // from class: com.mob.tools.b.i.38
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.Y();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public boolean Z() {
        return x.a();
    }

    @Override // com.mob.tools.b.a
    public Context aa() {
        return (Context) a("galct", new a<Context>(null) { // from class: com.mob.tools.b.i.39
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Context b() throws Throwable {
                if (i.this.f56691d != null) {
                    return i.this.f56691d;
                }
                Context x4 = b.x();
                if (x4 != null) {
                    i.this.f56691d = x4;
                }
                return x4;
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String ab() {
        return this.f56692e.d();
    }

    @Override // com.mob.tools.b.a
    public String ac() {
        return this.f56692e.e();
    }

    @Override // com.mob.tools.b.a
    public long ad() {
        return this.f56692e.Z();
    }

    @Override // com.mob.tools.b.a
    public String ae() {
        return (String) b("dvcnm", new a<String>(null) { // from class: com.mob.tools.b.i.41
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.aa();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String af() {
        return (String) b("cgrp", new a<String>(null) { // from class: com.mob.tools.b.i.42
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.ab();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String ag() {
        return (String) b("cinfo", new a<String>(null) { // from class: com.mob.tools.b.i.43
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.ac();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String ah() {
        if (CSCenter.getInstance().isOaidEnable()) {
            if (com.mob.commons.d.a()) {
                return (String) b("odmt", new a<String>(null) { // from class: com.mob.tools.b.i.44
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.mob.tools.b.i.a
                    public long a(String str) {
                        return TextUtils.isEmpty(str) ? -1L : 604800000L;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.mob.tools.b.i.a
                    /* renamed from: a */
                    public String b() throws Throwable {
                        return i.this.f56692e.ad();
                    }
                });
            }
            return null;
        }
        return CSCenter.getInstance().getOaid();
    }

    @Override // com.mob.tools.b.a
    public String ai() {
        String ah = c.a(this.f56691d).d().ah();
        if (!TextUtils.isEmpty(ah)) {
            try {
                return Base64.encodeToString(Data.AES128Encode(Data.MD5(DH.SyncMtd.getManufacturer()), ah), 2);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return ah;
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> aj() {
        return (HashMap) b("alldmt", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.b.i.46
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(HashMap<String, Object> hashMap) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() throws Throwable {
                return i.this.f56692e.ae();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo ak() {
        final boolean a5 = com.mob.tools.c.a("1009", this.f56691d.getPackageName());
        return (ApplicationInfo) b("gtaif", new a<ApplicationInfo>(null) { // from class: com.mob.tools.b.i.47
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ApplicationInfo applicationInfo) {
                return a5 ? 0L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ApplicationInfo b() throws Throwable {
                return e.a(i.this.f56691d).d();
            }
        }, a(a5, "gtaif", T()));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> al() {
        return (ArrayList) b("gtwflok", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.b.i.48
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                Boolean bool;
                if (com.mob.commons.d.d() && i.this.e(s.a("036de1dcdjdkdidcdlDjf6djdfdififididk*e=dledfkfdegidgidhgfeegceedhelfcfdfcgi")) && i.this.e(s.a("036de$dcdjdkdidcdlCjfNdjdfdififididk8eRdlfdededgieleldhgfeegceedhelfcfdfcgi"))) {
                    LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                    i.this.f56692e.a((BlockingQueue<Boolean>) linkedBlockingQueue);
                    i.this.f56692e.A();
                    try {
                        bool = (Boolean) linkedBlockingQueue.poll(20000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                        bool = null;
                    }
                    if (bool == null || !bool.booleanValue()) {
                        return null;
                    }
                    return i.this.f56692e.z();
                }
                return null;
            }
        });
    }

    @Override // com.mob.tools.b.a
    public long am() {
        return ((Long) b("gtbdt", new a<Long>(0L) { // from class: com.mob.tools.b.i.50
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Long l4) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Long b() throws Throwable {
                return Long.valueOf(i.this.f56692e.af());
            }
        })).longValue();
    }

    @Override // com.mob.tools.b.a
    public double an() {
        return ((Double) b("gtscnin", new a<Double>(Double.valueOf(0.0d)) { // from class: com.mob.tools.b.i.51
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Double d5) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Double b() throws Throwable {
                return Double.valueOf(i.this.f56692e.ag());
            }
        })).doubleValue();
    }

    @Override // com.mob.tools.b.a
    public int ao() {
        return ((Integer) b("gtscnppi", new a<Integer>(0) { // from class: com.mob.tools.b.i.52
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.ah());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public boolean ap() {
        return ((Boolean) b("ishmos", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.53
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(i.this.f56692e.ai());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String aq() {
        return (String) b("gthmosv", new a<String>(null) { // from class: com.mob.tools.b.i.54
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.aj();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String ar() {
        return (String) b("gthmosdtlv", new a<String>(null) { // from class: com.mob.tools.b.i.55
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.ak();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public int as() {
        return ((Integer) b("hmpmst", new a<Integer>(-1) { // from class: com.mob.tools.b.i.57
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.al());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public int at() {
        return ((Integer) b("hmepmst", new a<Integer>(-1) { // from class: com.mob.tools.b.i.58
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.am());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public String au() {
        return (String) b("gtinnerlangmt", new a<String>(null) { // from class: com.mob.tools.b.i.59
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.ao();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public int av() {
        return ((Integer) b("gtgramgendt", new a<Integer>(0) { // from class: com.mob.tools.b.i.60
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.ap());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public boolean aw() {
        return ((Boolean) a("debbing", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.61
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 60000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() throws Throwable {
                return Boolean.valueOf(i.this.f56692e.as());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> ax() {
        return (ArrayList) b("gteacifo", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.b.i.63
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return i.this.f56692e.ar();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public boolean c() {
        return ((Boolean) b("pd0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.23
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.I());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean d() {
        return ((Boolean) a("dee", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.34
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.N());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean e() {
        return this.f56692e.M();
    }

    @Override // com.mob.tools.b.a
    public boolean f() {
        return ((Boolean) a("ua0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.45
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.L());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean g() {
        return ((Boolean) a("dee1", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.56
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.K());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean h() {
        return ((Boolean) a("uee", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.66
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.J());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean i() {
        return ((Boolean) a("wpy", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.67
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.O());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String j() {
        return (String) b("agi", new a<String>(null) { // from class: com.mob.tools.b.i.68
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.u();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String k() {
        return (String) b("mvn", new a<String>(null) { // from class: com.mob.tools.b.i.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.G();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String l() {
        return (String) b("mol", new a<String>(null) { // from class: com.mob.tools.b.i.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.b();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String m() {
        return (String) b("mar", new a<String>(null) { // from class: com.mob.tools.b.i.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.c();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String n() {
        return (String) b("brd", new a<String>(null) { // from class: com.mob.tools.b.i.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.W();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String o() {
        return (String) b("dte", new a<String>(null) { // from class: com.mob.tools.b.i.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.w();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public Object p() {
        return b("gtecloc", new a<Object>(null) { // from class: com.mob.tools.b.i.9
            @Override // com.mob.tools.b.i.a
            protected long a(Object obj) {
                return 180000L;
            }

            @Override // com.mob.tools.b.i.a
            protected Object b() throws Throwable {
                return i.this.f56692e.an();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> q() {
        return (ArrayList) b("bsnbcl", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.b.i.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ArrayList<HashMap<String, Object>> arrayList) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() throws Throwable {
                return i.this.f56692e.v();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> r() {
        return e(false);
    }

    @Override // com.mob.tools.b.a
    public int s() {
        return ((Integer) b("ovit", new a<Integer>(-1) { // from class: com.mob.tools.b.i.13
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Integer num) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Integer b() throws Throwable {
                return Integer.valueOf(i.this.f56692e.f());
            }
        })).intValue();
    }

    @Override // com.mob.tools.b.a
    public String t() {
        return (String) b("ovne", new a<String>(null) { // from class: com.mob.tools.b.i.14
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.g();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String u() {
        return (String) b("ole", new a<String>(null) { // from class: com.mob.tools.b.i.15
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.h();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String v() {
        return (String) b("ocy", new a<String>(null) { // from class: com.mob.tools.b.i.16
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return bi.f55326s;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.j();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> w() {
        return (HashMap) b("cio0", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.b.i.17
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(HashMap<String, Object> hashMap) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() throws Throwable {
                return i.this.f56692e.B();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public ArrayList<ArrayList<String>> x() {
        return (ArrayList) b("tdio", new a<ArrayList<ArrayList<String>>>(null) { // from class: com.mob.tools.b.i.18
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ArrayList<ArrayList<String>> arrayList) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ArrayList<ArrayList<String>> b() throws Throwable {
                return i.this.f56692e.C();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public String y() {
        return (String) b("qkl", new a<String>(null) { // from class: com.mob.tools.b.i.19
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return "0".equals(str) ? 86400000L : 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.D();
            }
        });
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, HashMap<String, Long>> z() {
        return (HashMap) b("siio", new a<HashMap<String, HashMap<String, Long>>>(null) { // from class: com.mob.tools.b.i.20
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(HashMap<String, HashMap<String, Long>> hashMap) {
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public HashMap<String, HashMap<String, Long>> b() throws Throwable {
                return i.this.f56692e.E();
            }
        });
    }

    private ArrayList<HashMap<String, String>> i(boolean z4) {
        ArrayList<HashMap<String, String>> arrayList;
        synchronized ("gal") {
            arrayList = (ArrayList) b("gal", new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.b.i.32
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.mob.tools.b.i.a
                public long a(ArrayList<HashMap<String, String>> arrayList2) {
                    Calendar calendar = Calendar.getInstance();
                    long a5 = i.this.a(calendar) - calendar.getTimeInMillis();
                    if (a5 > 0) {
                        return a5;
                    }
                    return 86400000L;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.mob.tools.b.i.a
                /* renamed from: a */
                public ArrayList<HashMap<String, String>> b() throws Throwable {
                    return i.this.f56692e.s();
                }
            }, z4);
        }
        return arrayList;
    }

    @Override // com.mob.tools.b.a
    public boolean b() {
        return ((Boolean) b("cx0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.12
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return (bool == null || !bool.booleanValue()) ? 180000L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.H());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String c(boolean z4) {
        return (String) b("car", new a<String>(null) { // from class: com.mob.tools.b.i.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return TTAdConstant.AD_MAX_EVENT_TIME;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.l();
            }
        }, z4);
    }

    @Override // com.mob.tools.b.a
    public String d(boolean z4) {
        return (String) b("cne", new a<String>(null) { // from class: com.mob.tools.b.i.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return TTAdConstant.AD_MAX_EVENT_TIME;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.m();
            }
        }, z4);
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> e(boolean z4) {
        return (HashMap) b("crtwfo", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.b.i.11
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(HashMap<String, Object> hashMap) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() throws Throwable {
                return i.this.f56692e.y();
            }
        }, z4);
    }

    @Override // com.mob.tools.b.a
    public String f(boolean z4) {
        return (String) b("nte", new a<String>(null) { // from class: com.mob.tools.b.i.25
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return i.this.f56692e.n();
            }
        }, z4);
    }

    @Override // com.mob.tools.b.a
    public String g(boolean z4) {
        return this.f56692e.a(z4);
    }

    @Override // com.mob.tools.b.a
    public String h(boolean z4) {
        return (String) b("gtdm", new a<String>(null) { // from class: com.mob.tools.b.i.64
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(String str) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public String b() throws Throwable {
                return y.a().h();
            }
        }, z4);
    }

    private long g(String str) {
        if (!TextUtils.isEmpty(str)) {
            ApplicationInfo a5 = a(true, str, 0);
            String str2 = a5 != null ? a5.sourceDir : null;
            if (!TextUtils.isEmpty(str2)) {
                return new File(str2).lastModified();
            }
        }
        return 0L;
    }

    @Override // com.mob.tools.b.a
    public String b(boolean z4) {
        HashMap<String, Object> e5 = e(z4);
        if (e5 != null) {
            return (String) e5.get("bsmt");
        }
        return null;
    }

    @Override // com.mob.tools.b.a
    public String c(String str) {
        return this.f56692e.b(str);
    }

    @Override // com.mob.tools.b.a
    public String d(String str) {
        return this.f56692e.c(str);
    }

    @Override // com.mob.tools.b.a
    public boolean e(String str) {
        try {
            return this.f56692e.d(str);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    @Override // com.mob.tools.b.a
    public long f(final String str) {
        return ((Long) b("gtlstact-" + str, new a<Long>(-1L) { // from class: com.mob.tools.b.i.65
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Long l4) {
                return 604800000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Long b() throws Throwable {
                return Long.valueOf(FileUtils.getLATime(str));
            }
        })).longValue();
    }

    private <T> T c(String str, a<T> aVar) throws MobPersistence.NoValidDataException {
        Object b5;
        Type a5 = a((a) aVar);
        int a6 = a(a5);
        try {
            if (a6 == 1) {
                b5 = com.mob.tools.utils.h.a().a(str, (Class) ((GenericArrayType) a5).getGenericComponentType(), (Parcelable[]) aVar.f56776g);
            } else {
                if (a6 != 2 && a6 != 4) {
                    if (a6 == 3) {
                        ParameterizedType parameterizedType = (ParameterizedType) a5;
                        Class cls = (Class) parameterizedType.getRawType();
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type type = actualTypeArguments[0];
                        if (actualTypeArguments.length == 2) {
                            type = actualTypeArguments[1];
                        }
                        if (type instanceof Class) {
                            Class cls2 = (Class) type;
                            if (Parcelable.class.isAssignableFrom(cls2)) {
                                if (cls != List.class && cls != LinkedList.class && cls != ArrayList.class) {
                                    if (cls == Map.class || cls == HashMap.class || cls == TreeMap.class || cls == Hashtable.class) {
                                        return (T) com.mob.tools.utils.h.a().b(str, cls2);
                                    }
                                    return null;
                                }
                                return (T) com.mob.tools.utils.h.a().c(str, cls2);
                            }
                            return null;
                        }
                        return null;
                    } else if (a6 == 9) {
                        Class<T> cls3 = (Class) a5;
                        if (cls3 != null) {
                            if (cls3 == Integer.class) {
                                return (T) Integer.valueOf(com.mob.tools.utils.h.a().b(str, ((Integer) aVar.f56776g).intValue()));
                            }
                            if (cls3 == Long.class) {
                                return (T) Long.valueOf(com.mob.tools.utils.h.a().a(str, ((Long) aVar.f56776g).longValue()));
                            }
                            if (cls3 == Double.class) {
                                return (T) Double.valueOf(com.mob.tools.utils.h.a().a(str, ((Double) aVar.f56776g).doubleValue()));
                            }
                            if (cls3 == Boolean.class) {
                                return (T) Boolean.valueOf(com.mob.tools.utils.h.a().a(str, ((Boolean) aVar.f56776g).booleanValue()));
                            }
                            if (cls3 == String.class) {
                                return (T) com.mob.tools.utils.h.a().b(str, (String) aVar.f56776g);
                            }
                            if (Parcelable.class.isAssignableFrom(cls3)) {
                                return (T) com.mob.tools.utils.h.a().a(str, (Class<Class<T>>) cls3, (Class<T>) aVar.f56776g);
                            }
                            return (T) com.mob.tools.utils.h.a().b(str, aVar.f56776g);
                        }
                        return null;
                    } else {
                        b5 = com.mob.tools.utils.h.a().b(str, aVar.f56776g);
                    }
                }
                b5 = com.mob.tools.utils.h.a().b(str, aVar.f56776g);
            }
            return (T) b5;
        } catch (MobPersistence.NoValidDataException e5) {
            throw e5;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    @Override // com.mob.tools.b.a
    public boolean a() {
        return ((Boolean) b("ird", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.b.i.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(Boolean bool) {
                return (bool == null || !bool.booleanValue()) ? 180000L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f56692e.a());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String a(boolean z4) {
        HashMap<String, Object> e5 = e(z4);
        if (e5 != null) {
            return (String) e5.get("ssmt");
        }
        return null;
    }

    @Override // com.mob.tools.b.a
    public boolean b(String str) {
        return this.f56692e.e(str);
    }

    @Override // com.mob.tools.b.a
    public ResolveInfo b(Intent intent, int i4) {
        return e.a(this.f56691d).b(intent, i4);
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> a(boolean z4, boolean z5) {
        synchronized ("giafce") {
            ArrayList<HashMap<String, String>> i4 = i(z5);
            if (z4) {
                return this.f56692e.a(i4, 0);
            }
            return this.f56692e.a(i4, 1);
        }
    }

    @Override // com.mob.tools.b.a
    public Object b(boolean z4, int i4, String str, int i5) {
        return b(z4, i4, str, i5, false);
    }

    private PackageInfo b(boolean z4, int i4, String str, int i5, boolean z5) {
        if (str.equals(DH.SyncMtd.getPackageName())) {
            int i6 = (i5 == 0 || i5 == 1 || i5 == 128 || i5 == 64) ? 193 : i5;
            PackageInfo a5 = a(z4, i4, str, i6, z5);
            return (a5 == null && i6 == 193) ? a(z4, i4, str, i5, z5) : a5;
        }
        return a(z4, i4, str, i5, z5);
    }

    @Override // com.mob.tools.b.a
    public Location a(int i4, int i5, boolean z4) {
        List a5 = a(i4, i5, z4, false);
        if (a5 == null || a5.isEmpty()) {
            return null;
        }
        return (Location) a5.get(a5.size() - 1);
    }

    private <T> T b(String str, a<T> aVar) {
        return (T) b(str, aVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r11.f56693f.contains(r12) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T b(java.lang.String r12, com.mob.tools.b.i.a<T> r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.i.b(java.lang.String, com.mob.tools.b.i$a, boolean):java.lang.Object");
    }

    @Override // com.mob.tools.b.a
    public String a(String str) {
        return this.f56692e.a(str);
    }

    @Override // com.mob.tools.b.a
    public List<ResolveInfo> a(Intent intent, int i4) {
        return e.a(this.f56691d).a(intent, i4);
    }

    @Override // com.mob.tools.b.a
    public PackageInfo a(boolean z4, int i4, String str, int i5) {
        return b(z4, i4, str, i5, true);
    }

    private PackageInfo a(boolean z4, final int i4, final String str, final int i5, final boolean z5) {
        boolean z6;
        final boolean a5 = com.mob.tools.c.a("1009", str);
        String str2 = "gpi-" + i4 + "-" + str + "-" + i5 + "-" + z5;
        a<PackageInfo> aVar = new a<PackageInfo>(null) { // from class: com.mob.tools.b.i.40
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(PackageInfo packageInfo) {
                if (a5) {
                    return i4;
                }
                return 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public PackageInfo b() throws Throwable {
                return (PackageInfo) e.a(i.this.f56691d).a(str, i5, z5);
            }
        };
        if (!z4) {
            if (!a(a5, "gpi-" + i4 + "-" + str + "-" + i5 + "-" + z5, str)) {
                z6 = false;
                return (PackageInfo) b(str2, aVar, z6);
            }
        }
        z6 = true;
        return (PackageInfo) b(str2, aVar, z6);
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo a(String str, int i4) {
        return a(false, str, i4);
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo a(boolean z4, final String str, final int i4) {
        boolean z5;
        final boolean a5 = com.mob.tools.c.a("1009", str);
        String str2 = "gtaiffce-" + str + "-" + i4;
        a<ApplicationInfo> aVar = new a<ApplicationInfo>(null) { // from class: com.mob.tools.b.i.49
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(ApplicationInfo applicationInfo) {
                return a5 ? 0L : 86400000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public ApplicationInfo b() throws Throwable {
                return e.a(i.this.f56691d).a(str, i4);
            }
        };
        if (!z4) {
            if (!a(a5, "gtaiffce-" + str + "-" + i4, str)) {
                z5 = false;
                return (ApplicationInfo) b(str2, aVar, z5);
            }
        }
        z5 = true;
        return (ApplicationInfo) b(str2, aVar, z5);
    }

    @Override // com.mob.tools.b.a
    public List a(final int i4, final int i5, final boolean z4, final boolean z5) {
        return (List) b("gtelcmefce-" + i4 + "-" + i5 + "-" + z4, new a<List<Location>>(null) { // from class: com.mob.tools.b.i.62
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            public long a(List<Location> list) {
                return 180000L;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.mob.tools.b.i.a
            /* renamed from: a */
            public List<Location> b() throws Throwable {
                return i.this.f56692e.a(i4, i5, z4, z5);
            }
        }, z5);
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == -1) {
                return true;
            }
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == -1) {
                return true;
            }
        } else if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        } else {
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
        }
        return false;
    }

    private <T> T a(String str, a<T> aVar) {
        return (T) a(str, (a<Object>) aVar, false);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00f8: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:51:0x00f8 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T a(java.lang.String r12, com.mob.tools.b.i.a<T> r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.i.a(java.lang.String, com.mob.tools.b.i$a, boolean):java.lang.Object");
    }

    private <T> void a(String str, T t4, long j4, a<T> aVar) {
        try {
            Type a5 = a((a) aVar);
            int a6 = a(a5);
            if (a6 == 1) {
                com.mob.tools.utils.h.a().a(str, (Parcelable[]) t4, j4);
            } else {
                if (a6 != 2 && a6 != 4) {
                    if (a6 == 3) {
                        Class cls = (Class) ((ParameterizedType) a5).getRawType();
                        if (cls != List.class && cls != LinkedList.class && cls != ArrayList.class) {
                            if (cls == Map.class || cls == HashMap.class || cls == TreeMap.class || cls == Hashtable.class) {
                                com.mob.tools.utils.h.a().a(str, (Map) t4, j4);
                            }
                        }
                        com.mob.tools.utils.h.a().a(str, (List) t4, j4);
                    } else if (a6 == 9) {
                        Class cls2 = (Class) a5;
                        if (cls2 != null) {
                            if (cls2 == Integer.class) {
                                com.mob.tools.utils.h.a().a(str, (Integer) t4, j4);
                            } else if (cls2 == Long.class) {
                                com.mob.tools.utils.h.a().a(str, (Long) t4, j4);
                            } else if (cls2 == Double.class) {
                                com.mob.tools.utils.h.a().a(str, (Double) t4, j4);
                            } else if (cls2 == Boolean.class) {
                                com.mob.tools.utils.h.a().a(str, (Boolean) t4, j4);
                            } else if (cls2 == String.class) {
                                com.mob.tools.utils.h.a().a(str, (String) t4, j4);
                            } else if (Parcelable.class.isAssignableFrom(cls2)) {
                                com.mob.tools.utils.h.a().a(str, (Parcelable) t4, j4);
                            } else {
                                com.mob.tools.utils.h.a().a(str, t4, j4);
                            }
                        }
                    } else {
                        com.mob.tools.utils.h.a().a(str, t4, j4);
                    }
                }
                com.mob.tools.utils.h.a().a(str, t4, j4);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    private <T> Type a(a<T> aVar) {
        try {
            return ((ParameterizedType) aVar.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private int a(Type type) {
        if (type instanceof GenericArrayType) {
            return Parcelable.class.isAssignableFrom((Class) ((GenericArrayType) type).getGenericComponentType()) ? 1 : 2;
        } else if (type instanceof ParameterizedType) {
            try {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type type2 = actualTypeArguments[0];
                if (actualTypeArguments.length == 2) {
                    type2 = actualTypeArguments[1];
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                    Class cls2 = (Class) parameterizedType2.getRawType();
                    Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                    Type type3 = actualTypeArguments2[0];
                    if (actualTypeArguments2.length == 2) {
                        type3 = actualTypeArguments2[1];
                    }
                    if (type3 instanceof Class) {
                        Class cls3 = (Class) type3;
                    }
                    return 4;
                } else if (type2 instanceof Class) {
                    return Parcelable.class.isAssignableFrom((Class) type2) ? 3 : 4;
                } else {
                    return -1;
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return -1;
            }
        } else {
            return 9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Calendar calendar) {
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private boolean a(boolean z4, String str, String str2) {
        String str3 = "sdir_able_" + (TextUtils.equals(str2, DH.SyncMtd.getPackageName()) ? 1 : 0);
        if (com.mob.tools.utils.h.a().a(str3, -1) != z4) {
            com.mob.tools.utils.h.a().a(str3, Integer.valueOf(z4 ? 1 : 0));
            if (!z4) {
                return true;
            }
        }
        if (!z4 || TextUtils.isEmpty(str2)) {
            return false;
        }
        String str4 = "key_almdf-" + str + "-" + str2;
        long c5 = com.mob.tools.utils.h.a().c(str4);
        long g4 = g(str2);
        if (g4 != c5) {
            com.mob.tools.utils.h.a().a(str4, Long.valueOf(g4));
            return true;
        }
        return false;
    }
}
