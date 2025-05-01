package com.mob.commons;

import android.os.Process;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f56486a = true;

    /* renamed from: b  reason: collision with root package name */
    private static AtomicInteger f56487b = new AtomicInteger(-1);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f56488c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicBoolean f56489d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static w f56490e = new w();

    /* renamed from: f  reason: collision with root package name */
    private static volatile String f56491f;

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z4, boolean z5) {
        if (!z5) {
            f56490e.a();
        }
        if (!z4) {
            if (z5) {
                return;
            }
            f56490e.b();
            return;
        }
        if (TextUtils.isEmpty(C0811r.f56456a)) {
            String k4 = ab.a().k();
            if (TextUtils.isEmpty(k4)) {
                k4 = i();
            }
            if (!TextUtils.isEmpty(k4)) {
                C0811r.f56458c = k4;
                ab.a().e(k4);
            }
        } else {
            C0811r.f56458c = C0811r.f56456a;
            ab.a().e(C0811r.f56456a);
        }
        if (TextUtils.isEmpty(C0811r.f56457b)) {
            String l4 = ab.a().l();
            if (!TextUtils.isEmpty(l4)) {
                C0811r.f56459d = l4;
            }
        } else {
            C0811r.f56459d = C0811r.f56457b;
            ab.a().f(C0811r.f56457b);
        }
        CountDownLatch g4 = g();
        MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
        if (!z5) {
            a(g4);
            return;
        }
        aa.a();
        b.h();
    }

    public static int d() {
        int c5 = c();
        return c5 != -1 ? c5 : e();
    }

    public static int e() {
        int b5 = ab.b() ? ab.a().b(ab.f56126e, -1) : -1;
        NLog mobLog = MobLog.getInstance();
        mobLog.d("get py grtd status cac: " + b5, new Object[0]);
        return b5;
    }

    public static String f() {
        return "ecpgnjvr<1fxsowaktq0{EKhPmziWUVCNdy2uDJFH|LYZQGTXRO:43l87;/6MI>\"@A?\\9[)_]5=.(S'~盺朼-";
    }

    public static CountDownLatch g() {
        if (!f56489d.getAndSet(true)) {
            return com.mob.tools.b.c.a(MobSDK.getContext()).a();
        }
        return new CountDownLatch(0);
    }

    public static boolean h() {
        String a5 = u.a();
        return (TextUtils.isEmpty(a5) || TextUtils.isEmpty(a5.trim()) || TextUtils.equals(a5, i())) ? false : true;
    }

    public static String i() {
        if (f56491f == null) {
            String str = null;
            try {
                String absolutePath = MobSDK.getContext().getFilesDir().getAbsolutePath();
                if (!TextUtils.isEmpty(absolutePath)) {
                    String substring = absolutePath.substring(0, absolutePath.lastIndexOf(l.a("001n")));
                    if (!TextUtils.isEmpty(substring)) {
                        str = substring.substring(substring.lastIndexOf(l.a("001n")) + 1);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    String CRC32 = Data.CRC32(str.getBytes("utf-8"));
                    if (!TextUtils.isEmpty(CRC32)) {
                        String byteToHex = Data.byteToHex(CRC32.getBytes());
                        if (!TextUtils.isEmpty(byteToHex)) {
                            f56491f = "s" + byteToHex;
                        }
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return f56491f;
    }

    private static void k() {
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            open.configureBlocking(false);
            open.socket().bind(new InetSocketAddress(37926));
            q.f56434a = false;
            open.close();
        } catch (Throwable unused) {
        }
    }

    private static void l() {
        l.a().a(new k() { // from class: com.mob.commons.x.3
            @Override // com.mob.commons.k
            public void a(boolean z4, boolean z5, long j4) {
                if (z4) {
                    MobLog.getInstance().d("fg.", new Object[0]);
                    boolean unused = x.f56486a = true;
                    return;
                }
                MobLog.getInstance().d("bg.", new Object[0]);
                boolean unused2 = x.f56486a = false;
            }
        });
    }

    public static int c() {
        NLog mobLog = MobLog.getInstance();
        mobLog.d("get py grtd status mem: " + f56487b.get(), new Object[0]);
        return f56487b.get();
    }

    public static void a(final boolean z4) {
        z.f56519c.execute(new com.mob.tools.utils.i() { // from class: com.mob.commons.x.1
            @Override // com.mob.tools.utils.i
            protected void a() {
                com.mob.tools.c.a.f56783b.set(Boolean.TRUE);
                com.mob.tools.b.a();
                if (!TextUtils.isEmpty("M-")) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("M-" + l.a("0042inknjmjh"));
                }
                int b5 = ab.b() ? ab.a().b(ab.f56126e, -1) : -1;
                if (x.f56487b.get() == -1) {
                    x.f56487b.set(b5);
                }
                if (x.f56487b.get() == 1) {
                    x.b(true, z4);
                } else {
                    x.b(false, z4);
                }
                NLog mobLog = MobLog.getInstance();
                StringBuilder sb = new StringBuilder();
                sb.append(z4 ? l.a("002Sfl;h") : "");
                sb.append("init cfg over. py ");
                sb.append(x.f56487b.get());
                mobLog.d(sb.toString(), new Object[0]);
                com.mob.tools.c.a.f56783b.set(Boolean.FALSE);
            }
        });
    }

    public static void a(final CountDownLatch countDownLatch) {
        if (f56488c.compareAndSet(false, true)) {
            if (ab.a().q() == 0) {
                ab.a().a(System.currentTimeMillis());
            }
            C0811r.a(MobSDK.getContext());
            k();
            l();
            aa.a();
            q.a().b();
            new com.mob.tools.utils.j("PY-C") { // from class: com.mob.commons.x.2
                @Override // com.mob.tools.utils.j
                protected void a() {
                    com.mob.tools.c.a.f56783b.set(Boolean.TRUE);
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("g lk st: " + Process.myPid(), new Object[0]);
                    boolean a5 = p.a(p.a(p.f56429g), new o() { // from class: com.mob.commons.x.2.1
                        @Override // com.mob.commons.o
                        public boolean a(FileLocker fileLocker) {
                            NLog mobLog2 = MobLog.getInstance();
                            mobLog2.d("g lk pd: " + Process.myPid() + ", proc st", new Object[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            ab.r();
                            b.a(countDownLatch);
                            NLog mobLog3 = MobLog.getInstance();
                            mobLog3.d("g lk pd: " + Process.myPid() + ", proc ed, dur: " + (System.currentTimeMillis() - currentTimeMillis) + ", release: y", new Object[0]);
                            return false;
                        }
                    });
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("g lk res: " + a5 + Process.myPid(), new Object[0]);
                    com.mob.tools.c.a.f56783b.set(Boolean.FALSE);
                }
            }.start();
        }
    }

    public static boolean a() {
        return f56486a;
    }

    public static boolean b() {
        return f56487b.get() == 1;
    }

    public static void b(final boolean z4) {
        f56487b.set(z4 ? 1 : 0);
        NLog mobLog = MobLog.getInstance();
        mobLog.d("submit py: " + z4, new Object[0]);
        new com.mob.tools.utils.j(l.a("004,inknjmjg")) { // from class: com.mob.commons.x.4
            @Override // com.mob.tools.utils.j
            protected void a() {
                int e5 = x.e();
                ab.a().a(ab.f56126e, z4 ? 1 : 0);
                if (!z4 || e5 == 1) {
                    return;
                }
                CountDownLatch g4 = x.g();
                MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
                x.a(g4);
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.x.4.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            x.b(z4, dHResponse.getDetailNetworkTypeForStatic());
                        } catch (Throwable th) {
                            MobLog.getInstance().d(th);
                            try {
                                x.b(z4, dHResponse.getDetailNetworkTypeForStatic());
                            } catch (Throwable th2) {
                                MobLog.getInstance().d(th2);
                            }
                        }
                    }
                });
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z4, String str) throws Throwable {
        HashMap<String, Object> a5 = u.a(str);
        a5.put(l.a("009Jfkhkhfglfl.hhSinKl"), String.valueOf(z4));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(l.a("003$gjMh(ge"), u.a());
        hashMap.put(l.a("013Ugmhk(h?fljmggfe1hgkBfkLk?ge"), aa.f());
        String httpGet = new NetworkHelper().httpGet(i.a().a("gclg") + l.a("036nl_flfkff;fe6geEnlCfmYi3fk8e8geYnf5fiOkj^fmflfkifKfk5fkfm3gn3hkOkfkOfihk"), a5, hashMap);
        MobLog.getInstance().d("RS sp: " + httpGet, new Object[0]);
        HashMap fromJson = HashonHelper.fromJson(httpGet);
        if (fromJson != null) {
            if ("200".equals(String.valueOf(fromJson.get(l.a("004eMfmfe4h"))))) {
                return;
            }
            throw new Throwable("RS code is not 200: " + httpGet);
        }
        throw new Throwable("RS is illegal: " + httpGet);
    }
}
