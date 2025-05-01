package com.mob.commons;

import android.text.TextUtils;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.HashonHelper;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: e  reason: collision with root package name */
    private static i f56377e;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f56380h;

    /* renamed from: i  reason: collision with root package name */
    private volatile HashMap<String, Long> f56381i;

    /* renamed from: j  reason: collision with root package name */
    private ReentrantReadWriteLock f56382j;

    /* renamed from: k  reason: collision with root package name */
    private ReentrantReadWriteLock f56383k;

    /* renamed from: c  reason: collision with root package name */
    private static final CountDownLatch f56375c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    private static final String f56376d = C0811r.b("006^dcfggbgbfgdf");

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f56373a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ArrayList<String> f56374b = new ArrayList<>(Arrays.asList(C0811r.b("017ci8chgj i^egckdbdgehcbdgehck4b;cjce"), C0811r.b("017ciEchgj@i<geckdbdgehcbdgehck;b6cjce"), C0811r.b("017ciZchgj5i(gdckdbdgehcbdgehckWbNcjce"), C0811r.b("017ci5chgjTi?ieckdbdgehcbdgehck:bNcjce"), C0811r.b("017ciEchgj i!gkckdbdgehcbdgehckCb]cjce"), C0811r.b("018ci?chgjKiSegckcecjeeehcfci3fSckIb cjce"), C0811r.b("018ci=chgjVi$geckcecjeeehcfci;fOck0bGcjce"), C0811r.b("018ci?chgj!i9gdckcecjeeehcfci3f!ck9b)cjce"), C0811r.b("018ciSchgj9iSieckcecjeeehcfci fJck.b%cjce"), C0811r.b("018ciEchgj;iTgkckcecjeeehcfci.fAckOb?cjce")));

    /* renamed from: l  reason: collision with root package name */
    private volatile CountDownLatch f56384l = f56375c;

    /* renamed from: f  reason: collision with root package name */
    private volatile HashMap<String, HashMap<String, ArrayList<String>>> f56378f = ab.a().m();

    /* renamed from: g  reason: collision with root package name */
    private volatile HashMap<String, String> f56379g = ab.a().n();

    static {
        f56373a.put("gcfg", C0811r.b("016ci;chgjHb(ckcbcfXhOch3f0ehckPbBcjce"));
        f56373a.put("gclg", C0811r.b("016ciYchgjcbckcbcf=h;ch)fHehck)bGcjce"));
        f56373a.put(com.kuaishou.weapon.p0.t.f55695n, C0811r.b("018ci2chgj8eOdh_bRckcbcfAhWchEf,ehckRb!cjce"));
        f56373a.put("dg", C0811r.b("020+cb*eQccehgjcb8chcSckcbcf8h5ch?f-ehckPb;cjce"));
        f56373a.put("dtc", "api-df.dutils.com");
        f56373a.put("tcig", "m.mpl.dutils.com");
        f56373a.put("gdg", "api-gd.dutils.com");
    }

    private i() {
        ArrayList<String> o4 = ab.a().o();
        this.f56380h = o4;
        if (o4 == null || o4.isEmpty()) {
            this.f56380h = f56374b;
        }
        this.f56381i = ab.a().p();
        this.f56382j = new ReentrantReadWriteLock();
        this.f56383k = new ReentrantReadWriteLock();
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("127.0.0.1") || str.startsWith("10.") || str.startsWith("192.168")) {
            return false;
        }
        if (str.startsWith("172.")) {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    return parseInt < 16 || parseInt > 31;
                } catch (Throwable th) {
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d(th, "DM " + th.getMessage(), new Object[0]);
                }
            }
        }
        return true;
    }

    public void b() {
        if (this.f56384l != f56375c && this.f56384l.getCount() != 0) {
            MobLog.getInstance().d("DM obt abort", new Object[0]);
            return;
        }
        MobLog.getInstance().d("DM obt start", new Object[0]);
        this.f56384l = new CountDownLatch(1);
        z.f56519c.execute(new Runnable() { // from class: com.mob.commons.i.1
            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                iVar.a(iVar.f56384l, 0);
            }
        });
    }

    public static i a() {
        if (f56377e == null) {
            synchronized (i.class) {
                if (f56377e == null) {
                    f56377e = new i();
                }
            }
        }
        return f56377e;
    }

    private boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                if (allByName != null) {
                    for (InetAddress inetAddress : allByName) {
                        if (!c(inetAddress.getHostAddress())) {
                            MobLog.getInstance().d("DM ck ht: " + str + ", fai", new Object[0]);
                            return false;
                        }
                    }
                }
                MobLog.getInstance().d("DM ck ht: " + str + ", suc", new Object[0]);
                return true;
            } catch (Throwable th) {
                MobLog.getInstance().d(th, "DM " + th.getMessage(), new Object[0]);
            }
        }
        MobLog.getInstance().d("DM ck ht: " + str + ", fai_emp|exp", new Object[0]);
        return false;
    }

    public String a(String str) {
        return v.a(a().a(f56376d, str, f56373a.get(str), false));
    }

    public String a(String str, String str2, String str3, boolean z4) {
        HashMap<String, ArrayList<String>> hashMap;
        ArrayList<String> arrayList;
        NLog mobLog = MobLog.getInstance();
        mobLog.d("DM get: " + str + "-" + str2 + "-" + str3 + "-" + z4, new Object[0]);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            boolean z5 = this.f56384l.getCount() == 0;
            try {
                if (this.f56382j.readLock().tryLock(3000L, TimeUnit.MILLISECONDS) && this.f56378f != null && this.f56378f.containsKey(str) && (hashMap = this.f56378f.get(str)) != null && hashMap.containsKey(str2) && (arrayList = hashMap.get(str2)) != null && !arrayList.isEmpty()) {
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (z4 && a(str, str2)) {
                            if (a(str, str2, next)) {
                                NLog mobLog2 = MobLog.getInstance();
                                mobLog2.d("DM rtn [cac|chk]: " + str + "-" + str2 + ": " + next, new Object[0]);
                                HashMap<String, String> hashMap2 = this.f56379g;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append("-");
                                sb.append(str2);
                                hashMap2.put(sb.toString(), next);
                                ab.a().d(this.f56379g);
                                try {
                                    this.f56382j.readLock().unlock();
                                } catch (Throwable th) {
                                    NLog mobLog3 = MobLog.getInstance();
                                    mobLog3.d(th, "DM " + th.getMessage(), new Object[0]);
                                }
                                return next;
                            }
                        } else {
                            HashMap<String, String> hashMap3 = this.f56379g;
                            if (hashMap3.containsKey(str + "-" + str2)) {
                                HashMap<String, String> hashMap4 = this.f56379g;
                                String str4 = hashMap4.get(str + "-" + str2);
                                NLog mobLog4 = MobLog.getInstance();
                                mobLog4.d("DM rtn [cac|chk_abt]: " + str + "-" + str2 + ": " + str4, new Object[0]);
                                try {
                                    this.f56382j.readLock().unlock();
                                } catch (Throwable th2) {
                                    NLog mobLog5 = MobLog.getInstance();
                                    mobLog5.d(th2, "DM " + th2.getMessage(), new Object[0]);
                                }
                                return str4;
                            } else if (!TextUtils.isEmpty(next)) {
                                NLog mobLog6 = MobLog.getInstance();
                                mobLog6.d("DM rtn [cac]: " + str + "-" + str2 + ": " + next, new Object[0]);
                                try {
                                    this.f56382j.readLock().unlock();
                                } catch (Throwable th3) {
                                    NLog mobLog7 = MobLog.getInstance();
                                    mobLog7.d(th3, "DM " + th3.getMessage(), new Object[0]);
                                }
                                return next;
                            }
                        }
                    }
                }
                try {
                    this.f56382j.readLock().unlock();
                } catch (Throwable th4) {
                    NLog mobLog8 = MobLog.getInstance();
                    mobLog8.d(th4, "DM " + th4.getMessage(), new Object[0]);
                }
            } catch (Throwable th5) {
                try {
                    NLog mobLog9 = MobLog.getInstance();
                    mobLog9.d(th5, "DM " + th5.getMessage(), new Object[0]);
                    try {
                        this.f56382j.readLock().unlock();
                    } catch (Throwable th6) {
                        NLog mobLog10 = MobLog.getInstance();
                        mobLog10.d(th6, "DM " + th6.getMessage(), new Object[0]);
                    }
                } catch (Throwable th7) {
                    try {
                        this.f56382j.readLock().unlock();
                    } catch (Throwable th8) {
                        NLog mobLog11 = MobLog.getInstance();
                        mobLog11.d(th8, "DM " + th8.getMessage(), new Object[0]);
                    }
                    throw th7;
                }
            }
            try {
                HashMap<String, String> hashMap5 = this.f56379g;
                hashMap5.remove(str + "-" + str2);
                ab.a().d(this.f56379g);
                if (z4 && a(str, str2)) {
                    if (a(str, str2, str3)) {
                        NLog mobLog12 = MobLog.getInstance();
                        mobLog12.d("DM rtn [def|chk_true]: " + str + "-" + str2 + ": " + str3, new Object[0]);
                        HashMap<String, String> hashMap6 = this.f56379g;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("-");
                        sb2.append(str2);
                        hashMap6.put(sb2.toString(), str3);
                        ab.a().d(this.f56379g);
                        return str3;
                    } else if (!z5) {
                        if (this.f56384l.await(5000L, TimeUnit.MILLISECONDS)) {
                            MobLog.getInstance().d("DM awt next", new Object[0]);
                            return a(str, str2, str3, z4);
                        }
                        NLog mobLog13 = MobLog.getInstance();
                        mobLog13.d("DM rtn [def|awt_to]" + str + "-" + str2 + ": " + str3, new Object[0]);
                        return str3;
                    } else {
                        NLog mobLog14 = MobLog.getInstance();
                        mobLog14.d("DM rtn [def|chk_false]" + str + "-" + str2 + ": " + str3, new Object[0]);
                        return str3;
                    }
                }
                HashMap<String, String> hashMap7 = this.f56379g;
                if (hashMap7.containsKey(str + "-" + str2)) {
                    HashMap<String, String> hashMap8 = this.f56379g;
                    String str5 = hashMap8.get(str + "-" + str2);
                    NLog mobLog15 = MobLog.getInstance();
                    mobLog15.d("DM rtn [def|chk_abt]: " + str + "-" + str2 + ": " + str5, new Object[0]);
                    return str5;
                }
                NLog mobLog16 = MobLog.getInstance();
                mobLog16.d("DM rtn [def]" + str + "-" + str2 + ": " + str3, new Object[0]);
                return str3;
            } catch (Throwable th9) {
                NLog mobLog17 = MobLog.getInstance();
                mobLog17.d(th9, "DM " + th9.getMessage(), new Object[0]);
                NLog mobLog18 = MobLog.getInstance();
                mobLog18.d("DM rtn [def|exp]" + str + "-" + str2 + ": " + str3, new Object[0]);
                return str3;
            }
        }
        MobLog.getInstance().d("DM Params 'sName' or 'aName' is null", new Object[0]);
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CountDownLatch countDownLatch, int i4) {
        try {
            ArrayList<String> arrayList = this.f56380h;
            if (arrayList != null && i4 < arrayList.size()) {
                String a5 = v.a(this.f56380h.get(i4) + "/dm");
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(C0811r.b("006ciiOdgDeAdb"), u.a());
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.connectionTimeout = 3000;
                networkTimeOut.readTimout = 5000;
                String httpGetNew = new NetworkHelper().httpGetNew(a5, hashMap, null, networkTimeOut);
                NLog mobLog = MobLog.getInstance();
                mobLog.d("DM resp: " + httpGetNew, new Object[0]);
                HashMap fromJson = HashonHelper.fromJson(httpGetNew);
                if (fromJson != null && !fromJson.isEmpty()) {
                    Object obj = fromJson.get(C0811r.b("004bGcjcbJe"));
                    if (obj != null) {
                        if (((Integer) obj).intValue() == 200) {
                            HashMap hashMap2 = (HashMap) fromJson.get(C0811r.b("004Qcb chc"));
                            if (hashMap2 != null && !hashMap2.isEmpty()) {
                                HashMap hashMap3 = (HashMap) hashMap2.get(C0811r.b("004=cb?chc"));
                                if (hashMap3 != null && !hashMap3.isEmpty()) {
                                    HashMap hashMap4 = new HashMap();
                                    for (Map.Entry entry : hashMap3.entrySet()) {
                                        String str = (String) entry.getKey();
                                        HashMap hashMap5 = (HashMap) entry.getValue();
                                        HashMap hashMap6 = new HashMap();
                                        if (hashMap5 != null && !hashMap5.isEmpty()) {
                                            for (Map.Entry entry2 : hashMap5.entrySet()) {
                                                String str2 = (String) entry2.getKey();
                                                ArrayList arrayList2 = (ArrayList) entry2.getValue();
                                                ArrayList arrayList3 = new ArrayList();
                                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        String str3 = (String) it2.next();
                                                        if (b(str3)) {
                                                            arrayList3.add(str3);
                                                        }
                                                    }
                                                }
                                                if (!arrayList3.isEmpty()) {
                                                    hashMap6.put(str2, arrayList3);
                                                }
                                            }
                                        }
                                        if (!hashMap6.isEmpty()) {
                                            hashMap4.put(str, hashMap6);
                                        }
                                    }
                                    if (!hashMap4.isEmpty()) {
                                        try {
                                            NLog mobLog2 = MobLog.getInstance();
                                            mobLog2.d("DM busi w 2 cac: " + hashMap4, new Object[0]);
                                            if (this.f56382j.writeLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                                                this.f56378f.clear();
                                                this.f56378f.putAll(hashMap4);
                                                ab.a().c(this.f56378f);
                                            }
                                            try {
                                                this.f56382j.writeLock().unlock();
                                            } catch (Throwable th) {
                                                NLog mobLog3 = MobLog.getInstance();
                                                mobLog3.d(th, "DM " + th.getMessage(), new Object[0]);
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                NLog mobLog4 = MobLog.getInstance();
                                                mobLog4.d(th2, "DM " + th2.getMessage(), new Object[0]);
                                                try {
                                                    this.f56382j.writeLock().unlock();
                                                } catch (Throwable th3) {
                                                    NLog mobLog5 = MobLog.getInstance();
                                                    mobLog5.d(th3, "DM " + th3.getMessage(), new Object[0]);
                                                }
                                            } catch (Throwable th4) {
                                                try {
                                                    this.f56382j.writeLock().unlock();
                                                } catch (Throwable th5) {
                                                    NLog mobLog6 = MobLog.getInstance();
                                                    mobLog6.d(th5, "DM " + th5.getMessage(), new Object[0]);
                                                }
                                                throw th4;
                                            }
                                        }
                                    } else {
                                        MobLog.getInstance().d("DM busi no avai dm", new Object[0]);
                                    }
                                }
                                countDownLatch.countDown();
                                ArrayList arrayList4 = (ArrayList) hashMap2.get("p");
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        String str4 = (String) it3.next();
                                        if (b(str4)) {
                                            arrayList5.add(str4);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        NLog mobLog7 = MobLog.getInstance();
                                        mobLog7.d("DM prx w 2 cac: " + arrayList5, new Object[0]);
                                        this.f56380h.clear();
                                        this.f56380h.addAll(arrayList5);
                                        ab.a().a(this.f56380h);
                                    } else {
                                        MobLog.getInstance().d("DM prx no avai dm", new Object[0]);
                                    }
                                }
                            }
                        } else {
                            a(countDownLatch, i4 + 1);
                        }
                    } else {
                        a(countDownLatch, i4 + 1);
                    }
                } else {
                    a(countDownLatch, i4 + 1);
                }
            } else {
                MobLog.getInstance().w("DM No pdm");
            }
        } catch (Throwable th6) {
            try {
                NLog mobLog8 = MobLog.getInstance();
                mobLog8.d(th6, "DM " + th6.getMessage(), new Object[0]);
                a(countDownLatch, i4 + 1);
                if (countDownLatch.getCount() <= 0) {
                }
            } finally {
                if (countDownLatch.getCount() > 0) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        Long l4;
        boolean z4 = true;
        try {
            if (this.f56383k.readLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                String str3 = str + "_" + str2;
                if (this.f56381i != null && this.f56381i.containsKey(str3) && (l4 = this.f56381i.get(str3)) != null) {
                    if (System.currentTimeMillis() - l4.longValue() < 1800000) {
                        z4 = false;
                    }
                }
            }
            try {
                this.f56383k.readLock().unlock();
            } catch (Throwable th) {
                MobLog.getInstance().d(th, "DM " + th.getMessage(), new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().d(th2, "DM " + th2.getMessage(), new Object[0]);
                try {
                    this.f56383k.readLock().unlock();
                } catch (Throwable th3) {
                    MobLog.getInstance().d(th3, "DM " + th3.getMessage(), new Object[0]);
                }
            } catch (Throwable th4) {
                try {
                    this.f56383k.readLock().unlock();
                } catch (Throwable th5) {
                    MobLog.getInstance().d(th5, "DM " + th5.getMessage(), new Object[0]);
                }
                throw th4;
            }
        }
        MobLog.getInstance().d("DM ck dur: " + str + "-" + str2 + ", pass: " + z4, new Object[0]);
        return z4;
    }

    private boolean a(String str, String str2, String str3) {
        boolean b5 = b(str3);
        if (b5) {
            try {
                if (this.f56383k.writeLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                    this.f56381i.put(str + "_" + str2, Long.valueOf(System.currentTimeMillis()));
                    ab.a().e(this.f56381i);
                }
                try {
                    this.f56383k.writeLock().unlock();
                } catch (Throwable th) {
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d(th, "DM " + th.getMessage(), new Object[0]);
                }
            } catch (Throwable th2) {
                try {
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d(th2, "DM " + th2.getMessage(), new Object[0]);
                    try {
                        this.f56383k.writeLock().unlock();
                    } catch (Throwable th3) {
                        NLog mobLog3 = MobLog.getInstance();
                        mobLog3.d(th3, "DM " + th3.getMessage(), new Object[0]);
                    }
                } catch (Throwable th4) {
                    try {
                        this.f56383k.writeLock().unlock();
                    } catch (Throwable th5) {
                        NLog mobLog4 = MobLog.getInstance();
                        mobLog4.d(th5, "DM " + th5.getMessage(), new Object[0]);
                    }
                    throw th4;
                }
            }
        }
        return b5;
    }
}
