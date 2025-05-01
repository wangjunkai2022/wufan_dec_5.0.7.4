package com.mob.tools.b;

import android.content.Context;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.ab;
import com.mob.commons.v;
import com.mob.commons.z;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f56656a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f56657d;

    /* renamed from: b  reason: collision with root package name */
    private Context f56658b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Object> f56659c;

    /* renamed from: g  reason: collision with root package name */
    private volatile File f56662g;

    /* renamed from: k  reason: collision with root package name */
    private long f56666k;

    /* renamed from: l  reason: collision with root package name */
    private long f56667l;

    /* renamed from: m  reason: collision with root package name */
    private long f56668m;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f56660e = new byte[0];

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f56661f = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentLinkedQueue<CountDownLatch> f56663h = new ConcurrentLinkedQueue<>();

    /* renamed from: i  reason: collision with root package name */
    private volatile String f56664i = null;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f56665j = -1;

    private d(Context context) {
        this.f56658b = context;
    }

    private String e() {
        try {
            String str = (String) com.mob.commons.b.b(C0811r.b("002[eheh"), (Object) null);
            return str == null ? (String) com.mob.commons.b.b(C0811r.b("009;eheecidkefch;hbg"), (Object) null) : str;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    public static boolean c() {
        return f56657d;
    }

    public CountDownLatch d() {
        ConcurrentLinkedQueue<CountDownLatch> concurrentLinkedQueue = this.f56663h;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        return this.f56663h.peek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("#")) == null || split.length != 2) {
            return null;
        }
        return split[1];
    }

    public int b() {
        return this.f56665j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("#")) == null || split.length != 2) {
            return null;
        }
        return split[0];
    }

    private void d(String str) {
        File dataCacheFile = ResHelper.getDataCacheFile(this.f56658b, str);
        if (!dataCacheFile.exists() || dataCacheFile.length() <= 0) {
            return;
        }
        dataCacheFile.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return (TextUtils.isEmpty(b(str)) || TextUtils.isEmpty(c(str))) ? false : true;
    }

    public static d a(Context context) {
        if (f56656a == null) {
            synchronized (d.class) {
                if (f56656a == null) {
                    f56656a = new d(context);
                }
            }
        }
        return f56656a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File b(File file, String str) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d(str);
        return new File(file, str);
    }

    public final CountDownLatch a() {
        return a(e());
    }

    public void a(int i4) {
        this.f56665j = i4;
    }

    public final CountDownLatch a(final String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        NLog mobLog = MobLog.getInstance();
        mobLog.d("dhs ofr: " + countDownLatch, new Object[0]);
        this.f56663h.offer(countDownLatch);
        z.f56522f.execute(new Runnable() { // from class: com.mob.tools.b.d.1
            /* JADX WARN: Removed duplicated region for block: B:45:0x02bb A[Catch: all -> 0x04aa, TryCatch #5 {, blocks: (B:4:0x0009, B:9:0x0061, B:11:0x00c1, B:13:0x00c9, B:14:0x012d, B:19:0x0152, B:21:0x01b2, B:23:0x01ba, B:24:0x021e, B:67:0x03d7, B:69:0x0439, B:71:0x0441, B:72:0x04a5, B:82:0x05a1, B:83:0x05a8, B:6:0x001c, B:8:0x005b, B:16:0x012f, B:18:0x0142, B:35:0x0283, B:37:0x028c, B:39:0x0292, B:43:0x029b, B:45:0x02bb, B:47:0x02e1, B:53:0x033b, B:55:0x0369, B:57:0x0375, B:59:0x0382, B:61:0x0388, B:66:0x03cc, B:48:0x02f4, B:52:0x0328), top: B:107:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0328 A[Catch: all -> 0x04aa, TryCatch #5 {, blocks: (B:4:0x0009, B:9:0x0061, B:11:0x00c1, B:13:0x00c9, B:14:0x012d, B:19:0x0152, B:21:0x01b2, B:23:0x01ba, B:24:0x021e, B:67:0x03d7, B:69:0x0439, B:71:0x0441, B:72:0x04a5, B:82:0x05a1, B:83:0x05a8, B:6:0x001c, B:8:0x005b, B:16:0x012f, B:18:0x0142, B:35:0x0283, B:37:0x028c, B:39:0x0292, B:43:0x029b, B:45:0x02bb, B:47:0x02e1, B:53:0x033b, B:55:0x0369, B:57:0x0375, B:59:0x0382, B:61:0x0388, B:66:0x03cc, B:48:0x02f4, B:52:0x0328), top: B:107:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x03c9 A[Catch: all -> 0x03cc, TRY_LEAVE, TryCatch #4 {all -> 0x03cc, blocks: (B:63:0x03c3, B:65:0x03c9), top: B:105:0x03c3 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 1668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.d.AnonymousClass1.run():void");
            }
        });
        return countDownLatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (this.f56662g != null && this.f56662g.exists()) {
            if (this.f56662g.delete()) {
                MobLog.getInstance().d("dhs dof succ", new Object[0]);
            } else {
                MobLog.getInstance().d("dhs dof fail", new Object[0]);
            }
        }
        this.f56662g = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> a(File file, String str) {
        HashMap hashMap = new HashMap();
        String c5 = ab.a().c();
        if (TextUtils.isEmpty(c5)) {
            c5 = HashonHelper.fromHashMap(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (this.f56659c == null) {
            HashMap<String, Object> hashMap3 = new HashMap<>();
            this.f56659c = hashMap3;
            hashMap3.put("cacheMap", new ConcurrentHashMap());
            this.f56659c.put("invokeTimesMap", new ConcurrentHashMap());
            this.f56659c.put("expireTimeMap", new ConcurrentHashMap());
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.mob.commons.cc.a.a(MobSDK.getContext(), file.getAbsolutePath(), c5, hashMap2, this.f56659c);
            this.f56666k = System.currentTimeMillis() - currentTimeMillis;
            MobLog.getInstance().d(TextUtils.isEmpty(null) ? String.format("dhs l %d", Long.valueOf(this.f56666k)) : null, new Object[0]);
        } catch (Throwable th) {
            try {
                r3 = "dhs l e: " + th.getMessage();
                hashMap2.clear();
                com.mob.commons.g.a().a(5, b(), th, "" + str);
                MobLog.getInstance().d(th);
            } catch (Throwable unused) {
            }
            this.f56666k = System.currentTimeMillis() - currentTimeMillis;
            if (TextUtils.isEmpty(r3)) {
                r3 = String.format("dhs l %d", Long.valueOf(this.f56666k));
            }
            MobLog.getInstance().d(r3, new Object[0]);
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, File file, String str2) {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && file != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    MobLog.getInstance().d("dhs d...", new Object[0]);
                    new NetworkHelper().download(str, fileOutputStream, null);
                    String MD5 = Data.MD5(file);
                    if (!TextUtils.equals(str2, MD5)) {
                        com.mob.commons.g.a().a(-1, 20, "", str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        v.a(fileOutputStream);
                        if (TextUtils.isEmpty(null)) {
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            this.f56667l = currentTimeMillis2;
                            str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis2));
                        }
                        MobLog.getInstance().d(str3, new Object[0]);
                        return "";
                    }
                    v.a(fileOutputStream);
                    if (TextUtils.isEmpty(null)) {
                        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                        this.f56667l = currentTimeMillis3;
                        str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis3));
                    }
                    MobLog.getInstance().d(str3, new Object[0]);
                    return MD5;
                } catch (Throwable th) {
                    th = th;
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                        str3 = "dhs d e: " + th.getMessage();
                        MobLog.getInstance().d(th);
                        com.mob.commons.g.a().a(2, b(), th, "" + str2);
                        v.a(fileOutputStream);
                        if (TextUtils.isEmpty(str3)) {
                            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                            this.f56667l = currentTimeMillis4;
                            str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis4));
                        }
                        MobLog.getInstance().d(str3, new Object[0]);
                        return "";
                    } catch (Throwable th2) {
                        v.a(fileOutputStream);
                        if (TextUtils.isEmpty(str3)) {
                            long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis;
                            this.f56667l = currentTimeMillis5;
                            str3 = String.format("dhs d %d", Long.valueOf(currentTimeMillis5));
                        }
                        MobLog.getInstance().d(str3, new Object[0]);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
        return "";
    }
}
