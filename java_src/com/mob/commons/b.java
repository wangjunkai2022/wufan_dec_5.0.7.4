package com.mob.commons;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.umeng.analytics.pro.bm;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f56155b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f56156c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicBoolean f56157d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static volatile HashMap<String, Object> f56158e = null;

    /* renamed from: f  reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f56159f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f56160g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static CountDownLatch f56161h = new CountDownLatch(1);

    /* renamed from: i  reason: collision with root package name */
    private static CountDownLatch f56162i = new CountDownLatch(1);

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f56154a = false;

    /* renamed from: j  reason: collision with root package name */
    private static volatile boolean f56163j = false;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicBoolean f56164k = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f56165l = false;

    /* renamed from: m  reason: collision with root package name */
    private static volatile AtomicBoolean f56166m = new AtomicBoolean(false);

    /* renamed from: n  reason: collision with root package name */
    private static AtomicInteger f56167n = new AtomicInteger(3);

    public static boolean d() {
        return c();
    }

    public static ConcurrentHashMap<String, Object> e() {
        return f56159f;
    }

    public static ConcurrentHashMap<String, Object> f() {
        return f56160g;
    }

    public static ArrayList<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.a("004Scjcjccdj"));
        arrayList.add(m.a("005=dhcjcjccdj"));
        arrayList.add(m.a("005edSbbZde"));
        arrayList.add(m.a("009@cdbh,dUbcbe[dcaUca"));
        arrayList.add(m.a("010KbfbfbfNa1bebhcbbi:cc"));
        return (ArrayList) a(m.a("004<debgdg=a"), arrayList);
    }

    public static void h() {
        if (a()) {
            c(3);
        }
    }

    private static void n() {
        a(m.a("003@dgdd-e"), m.a("007?bjbhdgPe$ddbh@a"));
    }

    private static void o() {
        a(m.a("003Adg@aa"), m.a("009(fabidd(jGbjbdbd+aa"), m.a("016PfabiddJja*bibdbd)jJbadddg=jSbdbaAa"), m.a("005RfabedjFeJbb"), m.a("0122bjcf?gIfdfffbgifcfggidffb"));
    }

    private static void p() {
        Object obj = p.f56431i;
        synchronized (obj) {
            h.a().a(10);
            obj.notifyAll();
        }
    }

    private static void q() {
        Object obj = p.f56432j;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    private static void r() {
        com.mob.tools.utils.h.a().a(m.a("004$bi<bFbgba"), (Integer) 1);
        com.mob.tools.utils.h.a().a(m.a("003bee"), (Integer) 1);
        com.mob.tools.utils.h.a().a(m.a("003e<biBa"), (Integer) 1);
        com.mob.tools.utils.h.a().a(m.a("002'debg"), (Integer) 1);
        com.mob.tools.utils.h.a().a(m.a("002]dddg"), (Integer) 1);
    }

    private static void s() {
        if (x.h() && f56164k.compareAndSet(false, true)) {
            try {
                com.mob.mgs.impl.b.a();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c() {
        return (((Integer) a(m.a("002cMbh"), 0)).intValue() == 1) || x.a();
    }

    private static boolean d(String str) {
        List list = (List) a(m.a("002ae"), (Object) null);
        return (list == null || list.size() == 0 || !list.contains(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.mob.tools.network.NetworkHelper] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.OutputStream, com.mob.commons.b$6] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.mob.tools.network.NetworkHelper] */
    public static void e(String str) {
        String b5;
        File file;
        File file2 = null;
        try {
            h.a().a(0);
            b5 = v.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), m.a("003Xdg[aa"));
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!j.a().b()) {
                h.a().a(18);
                o();
            } else if (TextUtils.isEmpty(b5)) {
                h.a().a(1);
            } else if (!c()) {
                p();
            } else {
                h.a().a(2);
                HashMap hashMap = (HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(u.e(), b5, false);
                h.a().a(3);
                String str2 = (String) hashMap.get(m.a("002[cdBe"));
                String str3 = (String) hashMap.get("m");
                Boolean bool = (Boolean) hashMap.get(m.a("002bIdg"));
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                String str4 = (String) hashMap.get(m.a("002bKcf"));
                String str5 = (String) hashMap.get(m.a("002ac"));
                String str6 = (String) hashMap.get(m.a("0023cd(c"));
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str4)) {
                    synchronized (p.f56431i) {
                        f56159f.clear();
                        f56159f.put(bm.aK, str3);
                        f56159f.put(com.kuaishou.weapon.p0.t.f55682a, str4);
                        f56159f.put(m.a("002ac"), str5);
                        f56159f.put(m.a("002[cdYc"), str6);
                        String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str2);
                        if (booleanValue) {
                            h.a().a(5);
                            File file3 = new File(file, m.a("008a<biKc-cdbjdg aa"));
                            if (!file3.exists() || !str3.equals(Data.MD5(file3))) {
                                h.a().a(6);
                                ResHelper.deleteFileAndFolder(file);
                                file.mkdirs();
                                try {
                                    ?? fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        new NetworkHelper().download(checkHttpRequestUrl, fileOutputStream, null);
                                        h.a().a(7);
                                        v.a((Closeable[]) new Closeable[]{fileOutputStream});
                                    } catch (Throwable th2) {
                                        th = th2;
                                        file2 = fileOutputStream;
                                        v.a((Closeable[]) new Closeable[]{file2});
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } else {
                            h.a().a(8);
                            ResHelper.deleteFileAndFolder(file);
                            final byte[][] bArr = new byte[1];
                            final int[] iArr = new int[1];
                            try {
                                ?? r7 = new ByteArrayOutputStream() { // from class: com.mob.commons.b.6
                                    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                    public void close() throws IOException {
                                        super.close();
                                        bArr[0] = ((ByteArrayOutputStream) this).buf;
                                        iArr[0] = ((ByteArrayOutputStream) this).count;
                                    }
                                };
                                try {
                                    new NetworkHelper().download(checkHttpRequestUrl, r7, null);
                                    h.a().a(9);
                                    v.a((Closeable[]) new Closeable[]{r7});
                                    f56159f.put(m.a("0011dd"), bArr[0]);
                                    f56159f.put("s", Integer.valueOf(iArr[0]));
                                } catch (Throwable th4) {
                                    th = th4;
                                    file2 = r7;
                                    v.a((Closeable[]) new Closeable[]{file2});
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                    p();
                }
                h.a().a(4);
                ResHelper.deleteFileAndFolder(file);
                p();
            }
        } catch (Throwable th6) {
            th = th6;
            file2 = file;
            ResHelper.deleteFileAndFolder(file2);
            h.a().a(2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str) {
        Throwable th;
        File file;
        String b5;
        try {
            b5 = v.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), m.a("003Hdgdd7e"));
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
        try {
            File file2 = new File(MobSDK.getContext().getFilesDir(), m.a("007>bjbhdg<eZddbhTa"));
            if (!j.a().b()) {
                ResHelper.deleteFileAndFolder(file);
                ResHelper.deleteFileAndFolder(file2);
            } else if (TextUtils.isEmpty(b5)) {
                ResHelper.deleteFileAndFolder(file);
            } else if (c()) {
                HashMap<String, Object> e5 = u.e();
                e5.put(m.a("007:bb1dUbhdgbgbi8c"), String.valueOf(com.mob.commons.cc.a.a()));
                ArrayList arrayList = (ArrayList) ((HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestWithoutEncode(false, NetCommunicator.getCommonDefaultHeaders(), e5, b5, true)).get(m.a("004e6bgdg@g"));
                if (arrayList != null && !arrayList.isEmpty()) {
                    synchronized (p.f56432j) {
                        f56160g.clear();
                        f56160g.put(m.a("002eg"), arrayList);
                    }
                }
                ResHelper.deleteFileAndFolder(file);
                ResHelper.deleteFileAndFolder(file2);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                g.a().a(9, -1, th, "-1");
                ResHelper.deleteFileAndFolder(file);
            } finally {
                q();
            }
        }
    }

    public static <T> T b(String str, T t4) {
        if (TextUtils.isEmpty(str)) {
            return t4;
        }
        if (f56158e != null) {
            return (T) a(f56158e, str, t4);
        }
        return (T) a(HashonHelper.fromJson(ab.a().c()), str, t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(boolean z4) {
        if (b()) {
            MobLog.getInstance().d("b db st", new Object[0]);
            e.a((MobProduct) null);
            if (z4) {
                com.mob.commons.a.d.a().b();
            }
        }
    }

    public static void a(CountDownLatch countDownLatch) {
        b(countDownLatch);
    }

    public static <T> T a(String str, T t4) {
        if (TextUtils.isEmpty(str) || f56158e == null || !CSCenter.getInstance().isConfigEnable()) {
            return t4;
        }
        if (b(f56158e)) {
            f56158e.clear();
            f56158e = new HashMap<>();
            c(2);
        }
        return (T) ResHelper.forceCast(f56158e.get(str), t4);
    }

    public static boolean b() {
        return ((Integer) a(m.a("004aEbiMcc"), 0)).intValue() == 1;
    }

    private static void c(int i4) {
        if (f56157d.compareAndSet(false, true)) {
            String format = String.format(m.a("005.cbeafihidg"), Integer.valueOf(i4));
            if (i4 == 2) {
                z.f56519c.execute(b(format, i4));
            } else {
                b(format, i4).run();
            }
        }
    }

    private static void b(CountDownLatch countDownLatch) {
        HashMap fromJson = HashonHelper.fromJson(ab.a().c());
        if (b(fromJson)) {
            ab.a().c((String) null);
            fromJson = null;
        }
        if (a()) {
            a((HashMap<String, Object>) fromJson, false);
            if (fromJson != null && !fromJson.isEmpty()) {
                MobLog.getInstance().d("g ch: y", new Object[0]);
                boolean z4 = System.currentTimeMillis() - ab.a().b(ab.f56134m, 0L) < 2000;
                MobLog.getInstance().d("g ch fre: " + z4, new Object[0]);
                if (!z4) {
                    c(2);
                }
                if (countDownLatch != null) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        MobLog.getInstance().d("g dhs_w cdl: " + countDownLatch, new Object[0]);
                        countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                        MobLog.getInstance().d("g dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
                a(true, false, z4, 2);
                return;
            }
            MobLog.getInstance().d("g ch: n", new Object[0]);
            c(1);
        }
    }

    private static CountDownLatch c(HashMap<String, Object> hashMap) {
        CountDownLatch countDownLatch;
        HashMap<String, Object> hashMap2;
        String str;
        HashMap<String, Object> hashMap3;
        HashMap hashMap4;
        Integer num;
        HashMap hashMap5;
        String str2 = (String) ResHelper.forceCast(hashMap.get(m.a("002_dgdg")), null);
        CountDownLatch a5 = com.mob.tools.b.d.a(MobSDK.getContext()).a(str2);
        try {
            hashMap2 = (HashMap) hashMap.get(m.a("002d:bd"));
            countDownLatch = a5;
            try {
                str = (String) ResHelper.forceCast((String) hashMap.get(m.a("002a9ba")), m.a("006Rfcfcfdfdfdfd"));
                long longValue = ((Long) ResHelper.forceCast(hashMap.get(m.a("004dad,cg")), 5L)).longValue();
                hashMap3 = (HashMap) hashMap.get(m.a("002[chGh"));
                hashMap4 = (HashMap) hashMap.get(m.a("004QchYhaHba"));
                num = (Integer) hashMap.get(m.a("004Fch]d7bi*g"));
                hashMap5 = new HashMap();
                hashMap5.put(m.a("002 bi.f"), hashMap.get(m.a("002 bi.f")));
                hashMap5.put(m.a("002*dgdg"), str2);
                hashMap5.put(m.a("002d;bd"), hashMap2);
                hashMap5.put(m.a("002a6ba"), str);
                hashMap5.put(m.a("004dad:cg"), Long.valueOf(longValue));
                hashMap5.put(m.a("004JchAdTbiFg"), num);
                hashMap5.put(m.a("003=bhbgba"), ResHelper.forceCast((String) hashMap.get(m.a("003=bhbgba")), null));
                hashMap5.put(m.a("003Kdgbi7a"), hashMap.get(m.a("003Kdgbi7a")));
                hashMap5.put(m.a("003_dgbg'g"), hashMap.get(m.a("003_dgbg'g")));
                hashMap5.put(com.kuaishou.weapon.p0.t.f55697p, hashMap.get(com.kuaishou.weapon.p0.t.f55697p));
                hashMap5.put(m.a("005+dg@e1bg7g:dg"), hashMap.get(m.a("005+dg@e1bg7g:dg")));
                hashMap5.put(m.a("0030bh.hg"), hashMap.get(m.a("0030bh.hg")));
                hashMap5.put("ndi", hashMap.get("ndi"));
                hashMap5.put(com.kuaishou.weapon.p0.t.f55703v, hashMap.get(com.kuaishou.weapon.p0.t.f55703v));
                hashMap5.put("sti", hashMap.get("sti"));
                hashMap5.put(m.a("0047bhchSa-cd"), ResHelper.forceCast(hashMap.get(m.a("0047bhchSa-cd")), 86400));
            } catch (Throwable th) {
                th = th;
                MobLog.getInstance().d(th);
                return countDownLatch;
            }
        } catch (Throwable th2) {
            th = th2;
            countDownLatch = a5;
        }
        if (hashMap2 != null) {
            if (hashMap2.size() > 0) {
                if (TextUtils.isEmpty(str)) {
                }
                a(hashMap5, hashMap, hashMap2, hashMap3, hashMap4, num, countDownLatch);
                j.a().a(hashMap, hashMap2, hashMap3);
                hashMap.put(m.a("010;baAdSbbbg6adUdabgbdQd"), Long.valueOf(System.currentTimeMillis()));
                ab.a().c(HashonHelper.fromHashMap(hashMap));
                r();
                return countDownLatch;
            }
        }
        if (hashMap3 != null && hashMap3.size() > 0 && hashMap4 != null && hashMap4.size() > 0) {
            a(hashMap5, hashMap, hashMap2, hashMap3, hashMap4, num, countDownLatch);
            j.a().a(hashMap, hashMap2, hashMap3);
        }
        hashMap.put(m.a("010;baAdSbbbg6adUdabgbdQd"), Long.valueOf(System.currentTimeMillis()));
        ab.a().c(HashonHelper.fromHashMap(hashMap));
        r();
        return countDownLatch;
    }

    private static <T> T a(HashMap<String, Object> hashMap, String str, T t4) {
        return (TextUtils.isEmpty(str) || b(hashMap) || !a(hashMap)) ? t4 : (T) ResHelper.forceCast(hashMap.get(str), t4);
    }

    public static <T> T a(String str, T t4, long j4) {
        try {
            if ((f56158e == null || f56158e.isEmpty()) && f56161h.getCount() > 0) {
                if (j4 > 0) {
                    f56161h.await(j4, TimeUnit.MILLISECONDS);
                } else {
                    f56161h.await();
                }
            }
            if (!d(str) && f56162i.getCount() > 0) {
                if (j4 > 0) {
                    f56162i.await(j4, TimeUnit.MILLISECONDS);
                } else {
                    f56162i.await();
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return (T) a(str, t4);
    }

    private static boolean a(HashMap<String, Object> hashMap) {
        return hashMap == null || ((Integer) ResHelper.forceCast(hashMap.get(m.a("002g)bi")), 0)).intValue() == 0;
    }

    public static boolean a() {
        return ((Integer) a(m.a("002g0bi"), 0)).intValue() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i4) {
        MobLog.getInstance().d("b ob st", new Object[0]);
        if (a() && b()) {
            final String str = (String) a(m.a("003TcdQca"), (Object) null);
            if (TextUtils.isEmpty(str)) {
                if (i4 == 3 || x.b()) {
                    p();
                }
                o();
            } else if (i4 == 3 || f56155b.compareAndSet(false, true)) {
                new com.mob.tools.utils.j(m.a("003Rdjgjfi") + i4) { // from class: com.mob.commons.b.1
                    @Override // com.mob.tools.utils.j
                    protected void a() {
                        p.a(p.a(p.f56426d), false, new o() { // from class: com.mob.commons.b.1.1
                            @Override // com.mob.commons.o
                            public boolean a(FileLocker fileLocker) {
                                synchronized (b.f56159f) {
                                    b.e(str);
                                }
                                return false;
                            }
                        });
                    }
                }.start();
            }
            if (a() && b()) {
                final String str2 = (String) a("sbr", (Object) null);
                if (TextUtils.isEmpty(str2)) {
                    n();
                    q();
                    return;
                } else if (i4 == 3 || f56156c.compareAndSet(false, true)) {
                    new com.mob.tools.utils.j("DS-" + i4) { // from class: com.mob.commons.b.2
                        @Override // com.mob.tools.utils.j
                        protected void a() {
                            p.a(p.a(p.f56427e), false, new o() { // from class: com.mob.commons.b.2.1
                                @Override // com.mob.commons.o
                                public boolean a(FileLocker fileLocker) {
                                    synchronized (b.f56160g) {
                                        b.f(str2);
                                    }
                                    return false;
                                }
                            });
                        }
                    }.start();
                    return;
                } else {
                    return;
                }
            }
            q();
            n();
            return;
        }
        if (i4 == 3 || x.b()) {
            p();
        }
        o();
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a() && b() && ((Integer) a(str, 0)).intValue() != 0;
    }

    private static void a(HashMap<String, Object> hashMap, boolean z4) {
        f56158e = new HashMap<>();
        if (hashMap != null) {
            f56158e.putAll(hashMap);
        }
        try {
            if (z4) {
                f56161h.countDown();
                f56162i.countDown();
            } else {
                f56161h.countDown();
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(final boolean z4, final boolean z5, final boolean z6, final int i4) {
        new com.mob.tools.utils.j("PY-B" + i4) { // from class: com.mob.commons.b.3
            @Override // com.mob.tools.utils.j
            protected void a() {
                NLog mobLog = MobLog.getInstance();
                mobLog.d("b enter:" + Process.myPid() + ", lbms: " + b.f56163j + ", fc" + z4 + ", ol: " + z5 + ", gf: " + z6 + ", in: " + i4, new Object[0]);
                if (!b.f56163j) {
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("b lk st: " + Process.myPid(), new Object[0]);
                    p.a(p.a(p.f56428f), new o() { // from class: com.mob.commons.b.3.1
                        @Override // com.mob.commons.o
                        public boolean a(FileLocker fileLocker) {
                            boolean unused = b.f56163j = true;
                            NLog mobLog3 = MobLog.getInstance();
                            mobLog3.d("b lk: " + Process.myPid() + ", proc st", new Object[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            b.c(z5);
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (!z4 || z6) {
                                b.b(i4);
                            }
                            NLog mobLog4 = MobLog.getInstance();
                            mobLog4.d("b lk: " + Process.myPid() + ", proc ed, dur: " + (System.currentTimeMillis() - currentTimeMillis) + ", release: n", new Object[0]);
                            Looper.prepare();
                            Looper.loop();
                            return true;
                        }
                    });
                    return;
                }
                NLog mobLog3 = MobLog.getInstance();
                mobLog3.d("b lked already: " + Process.myPid(), new Object[0]);
                b.c(z5);
                if (!z4 || z6) {
                    b.b(i4);
                }
            }
        }.start();
    }

    private static void a(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, HashMap<String, Object> hashMap5, Integer num, CountDownLatch countDownLatch) {
        if (num != null && num.intValue() == 2) {
            com.mob.tools.c.a.f56783b.set(Boolean.FALSE);
            try {
                countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                MobLog.getInstance().d("dhs wt geot.2 ovr", new Object[0]);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        boolean a5 = j.a().a(true);
        j.a().c().put(m.a("006d!bdbfbhOdUdg"), Boolean.valueOf(a5));
        if (hashMap3 != null && hashMap3.size() > 0 && !a5) {
            MobLog.getInstance().d("dhs em dg", new Object[0]);
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            hashMap2.putAll(hashMap3);
        } else if (hashMap4 != null && hashMap4.size() > 0 && !j.a().a(hashMap5)) {
            MobLog.getInstance().d("dhs gpe dg", new Object[0]);
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            hashMap2.putAll(hashMap4);
        } else {
            hashMap2.remove(m.a("002<ch h"));
            hashMap2.remove(m.a("002d<bd"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mob.tools.utils.i b(final String str, final int i4) {
        return new com.mob.tools.utils.i() { // from class: com.mob.commons.b.4
            @Override // com.mob.tools.utils.i
            protected void a() {
                com.mob.tools.c.a.f56783b.set(Boolean.TRUE);
                if (!TextUtils.isEmpty("M-")) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("M-" + str);
                }
                b.b(new com.mob.tools.utils.e<HashMap<String, Object>>() { // from class: com.mob.commons.b.4.1
                    @Override // com.mob.tools.utils.e
                    public void a(HashMap<String, Object> hashMap) {
                        try {
                            b.b(hashMap, i4);
                            if (hashMap == null) {
                                com.mob.commons.a.l a5 = com.mob.commons.a.l.a();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                a5.e(q.a.f73127b, b.b(str, i4));
                            }
                        } finally {
                            b.f56157d.set(false);
                        }
                    }
                });
                com.mob.tools.c.a.f56783b.set(Boolean.FALSE);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HashMap<String, Object> hashMap, int i4) {
        if (hashMap == null) {
            HashMap<String, Object> fromJson = HashonHelper.fromJson(ab.a().d());
            if (!b(fromJson)) {
                hashMap = fromJson;
            }
            ab.a().e();
        }
        CountDownLatch countDownLatch = null;
        if (hashMap != null && !hashMap.isEmpty()) {
            countDownLatch = c(hashMap);
        }
        a(hashMap, true);
        com.mob.tools.c.a.f56783b.set(Boolean.FALSE);
        if (((Integer) a(com.kuaishou.weapon.p0.t.f55703v, 1)).intValue() == 1 && f56166m.compareAndSet(false, true)) {
            i.a().b();
        }
        if (!f56165l) {
            s();
        }
        if (countDownLatch == null) {
            countDownLatch = com.mob.tools.b.d.a(MobSDK.getContext()).a();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("ge dhs_w cdl: " + countDownLatch, new Object[0]);
            countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
            NLog mobLog2 = MobLog.getInstance();
            mobLog2.d("ge dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        a(false, true, true, i4);
    }

    private static void a(String... strArr) {
        File filesDir = MobSDK.getContext().getFilesDir();
        for (String str : strArr) {
            try {
                v.a(new File(filesDir, str));
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final com.mob.tools.utils.e<HashMap<String, Object>> eVar) {
        com.mob.tools.c.a.f56783b.set(Boolean.TRUE);
        DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().getODH().request(new DH.DHResponder() { // from class: com.mob.commons.b.5
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                com.mob.tools.c.a.f56783b.set(Boolean.TRUE);
                try {
                    HashMap b5 = b.b(dHResponse);
                    long j4 = 1;
                    while (b.f56167n.get() > 0 && (b5 == null || b5.isEmpty())) {
                        Thread.sleep(1000 * j4);
                        b5 = b.b(dHResponse);
                        if (b5 == null || b5.isEmpty()) {
                            b.f56167n.getAndDecrement();
                            j4 *= 2;
                        }
                    }
                    com.mob.tools.utils.e.this.a(b5);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                    com.mob.tools.utils.e.this.a(null);
                }
            }
        });
    }

    private static boolean b(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            long longValue = ((Long) ResHelper.forceCast(hashMap.get(m.a("010Aba9dCbbbgKadQdabgbd;d")), 0L)).longValue();
            long intValue = ((Integer) ResHelper.forceCast(hashMap.get(m.a("004Mbhch^aZcd")), 86400)).intValue() * 1000;
            if (longValue != 0) {
                if (intValue > 0) {
                    return System.currentTimeMillis() - longValue >= intValue;
                } else if (intValue == 0) {
                    return System.currentTimeMillis() - longValue >= 86400000;
                } else {
                    return true ^ v.a(System.currentTimeMillis(), longValue);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, Object> b(DH.DHResponse dHResponse) {
        try {
            String packageName = DH.SyncMtd.getPackageName();
            String a5 = u.a();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(m.a("003^cf6dDca"), a5);
            hashMap.put(m.a("013Lcidg?d3bhficcbaWdcg*bg>g-ca"), aa.f());
            hashMap.put(m.a("004Ubdbibgba"), dHResponse.getODH());
            HashMap<String, Object> a6 = u.a(dHResponse.getDetailNetworkTypeForStatic());
            a6.put(m.a("002g0dg"), String.valueOf(System.currentTimeMillis()));
            int i4 = 1;
            a6.put("nbs", 1);
            int privacyGrantedStatus = MobSDK.getPrivacyGrantedStatus();
            if (privacyGrantedStatus != -1) {
                a6.put(m.a("009?bgdgdbchbh9dd*ej)h"), String.valueOf(privacyGrantedStatus == 1));
            }
            String a7 = m.a("002*bbff");
            if (!MobSDK.checkV6()) {
                i4 = -1;
            }
            a6.put(a7, String.valueOf(i4));
            a6.put("ait", Long.valueOf(ab.a().q()));
            String b5 = e.b();
            if (!TextUtils.isEmpty(b5)) {
                a6.put("psid", b5 + packageName);
            }
            String httpGet = new NetworkHelper().httpGet(i.a().a("gcfg") + "/v6/gcf", a6, hashMap);
            HashMap fromJson = HashonHelper.fromJson(httpGet);
            if (fromJson.isEmpty()) {
                return null;
            }
            if ("200".equals(String.valueOf(fromJson.get(m.a("006 dg)gbg;bedg"))))) {
                byte[] rawMD5 = Data.rawMD5((a5 + ":" + packageName + ":" + fromJson.get(m.a("009g7bgbdVdCdg9gb<bd=h"))).getBytes("utf-8"));
                String str = (String) ResHelper.forceCast(fromJson.get(m.a("002(dg,a")));
                if (str != null) {
                    String str2 = new String(Data.AES128Decode(rawMD5, Base64.decode(str, 2)), "utf-8");
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("sw: " + str2, new Object[0]);
                    HashMap<String, Object> fromJson2 = HashonHelper.fromJson(str2);
                    if (!fromJson2.isEmpty()) {
                        fromJson2.put(m.a("010[ba?d7bbbg'ad<dabgbd@d"), Long.valueOf(SystemClock.elapsedRealtime()));
                        ab.a().d(HashonHelper.fromHashMap(fromJson2));
                        return fromJson2;
                    }
                    throw new Throwable("RS is illegal: " + httpGet);
                }
                throw new Throwable("RS is illegal: " + httpGet);
            }
            throw new Throwable("RS is illegal: " + httpGet);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }
}
