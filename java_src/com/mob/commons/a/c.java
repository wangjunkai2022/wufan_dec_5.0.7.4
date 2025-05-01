package com.mob.commons.a;

import android.os.Handler;
import android.os.Message;
import com.mob.MobSDK;
import com.mob.commons.MobProduct;
import com.mob.commons.aa;
import com.mob.commons.u;
import com.mob.commons.v;
import com.mob.commons.z;
import com.mob.tools.MDP;
import com.mob.tools.MobLog;
import com.mob.tools.b.h;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
/* loaded from: classes5.dex */
public abstract class c implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final WeakHashMap<String, Object> f56050k = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    protected int f56051a;

    /* renamed from: b  reason: collision with root package name */
    protected Object f56052b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56053c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56054d;

    /* renamed from: e  reason: collision with root package name */
    private final long f56055e;

    /* renamed from: f  reason: collision with root package name */
    private final long f56056f;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f56057g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56058h;

    /* renamed from: i  reason: collision with root package name */
    private int f56059i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56060j;

    /* renamed from: l  reason: collision with root package name */
    private long f56061l;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, String str2, long j4) {
        this(str, 0L, str2, 0L, j4);
    }

    private void m() {
        int i4;
        if (this.f56060j || (i4 = this.f56051a) < 0) {
            return;
        }
        this.f56051a = i4 + 1;
    }

    public c a(boolean z4) {
        this.f56060j = z4;
        if (z4) {
            this.f56061l = 0L;
        }
        return this;
    }

    protected abstract void a() throws Throwable;

    public c b(boolean z4) {
        this.f56051a = z4 ? 0 : -1;
        return this;
    }

    protected void c() {
    }

    public String d() {
        return this.f56053c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e() {
        return ((Long) com.mob.commons.b.a(this.f56053c, Long.valueOf(this.f56055e))).longValue() != 0 && f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        if ("bs,l,ol,wi,wl,ext,aa,".contains(this.f56053c + ",")) {
            return com.mob.commons.j.a().b();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean g() {
        return this.f56051a == 0;
    }

    public boolean h() {
        if (e()) {
            z.f56519c.execute(this);
            return true;
        }
        return false;
    }

    protected boolean i() {
        boolean a5 = com.mob.commons.b.a();
        boolean b5 = com.mob.commons.b.b();
        if (a5 && b5) {
            boolean e5 = e();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("slt : " + getClass().getSimpleName() + ", to: " + a5 + ", conn: " + b5 + ", " + this.f56053c + ": " + e5 + ", key: " + a(this.f56053c, (String) 0) + ", gp: " + l() + " , oce " + this.f56060j + " , tt " + this.f56051a, new Object[0]);
            return e5;
        }
        NLog mobLog2 = MobLog.getInstance();
        mobLog2.d("slt: " + d() + ", to: " + a5 + ", conn: " + b5, new Object[0]);
        return false;
    }

    public long j() {
        return this.f56057g;
    }

    public int k() {
        return this.f56058h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long l() {
        try {
            String str = this.f56054d;
            if (str != null) {
                return Long.parseLong(String.valueOf(com.mob.commons.b.a(str, Long.valueOf(this.f56056f))));
            }
            return 0L;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return 0L;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f56061l > 0) {
            l.a().a(this.f56061l, (long) this, this.f56059i);
            this.f56061l = 0L;
            return;
        }
        try {
            if (g()) {
                c();
            }
            if (i()) {
                a();
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, long j4, String str2, long j5, long j6) {
        this.f56051a = 0;
        this.f56059i = 0;
        this.f56060j = false;
        this.f56053c = str;
        this.f56054d = str2;
        this.f56055e = j4;
        this.f56056f = j5;
        this.f56058h = getClass().hashCode();
        this.f56061l = j6;
        this.f56057g = System.currentTimeMillis();
    }

    protected void b() {
        long l4 = l();
        if (l4 > 0) {
            a(l4);
        } else {
            this.f56060j = true;
        }
    }

    public c a(Object obj) {
        this.f56052b = obj;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i4) {
        this.f56059i = i4;
    }

    public <T> T a(String str, T t4) {
        return (T) com.mob.commons.b.a(str, t4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TreeMap<String, Object> b(Object obj) {
        if (obj != null) {
            try {
                TreeMap<String, Object> treeMap = new TreeMap<>();
                h.a aVar = new h.a(obj);
                treeMap.put("ltdmt", Double.valueOf(aVar.b()));
                treeMap.put("lndmt", Double.valueOf(aVar.c()));
                return treeMap;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c a(long j4) {
        if (j4 > 0) {
            this.f56057g = System.currentTimeMillis() + (j4 * 1000);
        } else {
            this.f56057g = -1L;
        }
        return this;
    }

    protected void a(final com.mob.tools.utils.e<HashMap<String, Object>> eVar) {
        if (((Integer) a(com.mob.commons.l.a("002XfmVi"), (String) 0)).intValue() == 1) {
            DH.requester(MobSDK.getContext()).getPosCommForce(0, 0, true, false).request(new DH.DHResponder() { // from class: com.mob.commons.a.c.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    List<HashMap<String, Object>> a5 = c.this.a(dHResponse.getPosCommForce(new int[0]));
                    if (a5 != null && !a5.isEmpty()) {
                        eVar.a(a5.get(a5.size() - 1));
                    } else {
                        eVar.a(null);
                    }
                }
            });
        } else {
            eVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j4, String str, Object obj) {
        a(j4, str, obj, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j4, String str, Object obj, boolean z4) {
        a(j4, str, obj, null, z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j4, String str, Object obj, HashMap<String, Object> hashMap, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        final long j5 = j4 > 0 ? (j4 * 1000) + currentTimeMillis : currentTimeMillis;
        final HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.l.a("004kGgeNlh"), str);
        hashMap2.put(com.mob.commons.l.a("004i4fkhkLk"), obj);
        hashMap2.put(com.mob.commons.l.a("008]fe<fkhkRfkfhZh"), Long.valueOf(currentTimeMillis));
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (z4) {
            a(new com.mob.tools.utils.e<HashMap<String, Object>>() { // from class: com.mob.commons.a.c.2
                @Override // com.mob.tools.utils.e
                public void a(HashMap<String, Object> hashMap3) {
                    hashMap2.put(com.mob.commons.l.a("002ei"), hashMap3);
                    c.this.a(hashMap3, hashMap2);
                    com.mob.commons.c.a().a(j5, hashMap2);
                }
            });
        } else {
            com.mob.commons.c.a().a(j5, hashMap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(HashMap<String, Object> hashMap, final HashMap<String, Object> hashMap2) {
        if (hashMap == null || v.a(((Long) ResHelper.forceCast(hashMap.get(com.mob.commons.f.f56348a), Long.valueOf(System.currentTimeMillis()))).longValue(), System.currentTimeMillis())) {
            return;
        }
        DH.requester(MobSDK.getContext()).getPosCommForce(0, 15, false, true).request(new DH.DHResponder() { // from class: com.mob.commons.a.c.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                if (dHResponse.getPosCommForce(new int[0]) == null || dHResponse.getPosCommForce(new int[0]).isEmpty()) {
                    return;
                }
                List<HashMap<String, Object>> a5 = c.this.a(dHResponse.getPosCommForce(new int[0]));
                HashMap<String, Object> hashMap3 = a5.get(a5.size() - 1);
                hashMap3.put("pt", 2);
                hashMap2.put("nl", hashMap3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, HashMap<String, Object> hashMap) {
        a(str, hashMap, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, HashMap<String, Object> hashMap, boolean z4) {
        final long currentTimeMillis = System.currentTimeMillis();
        final HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.l.a("004k0ge[lh"), str);
        if (hashMap != null) {
            hashMap2.put(com.mob.commons.l.a("004VfeIfkf"), hashMap);
        }
        hashMap2.put(com.mob.commons.l.a("008Ffe=fkhk=fkfh$h"), Long.valueOf(currentTimeMillis));
        if (z4) {
            a(new com.mob.tools.utils.e<HashMap<String, Object>>() { // from class: com.mob.commons.a.c.4
                @Override // com.mob.tools.utils.e
                public void a(HashMap<String, Object> hashMap3) {
                    hashMap2.put(com.mob.commons.l.a("002ei"), hashMap3);
                    c.this.a(hashMap3, hashMap2);
                    com.mob.commons.c.a().a(currentTimeMillis, hashMap2);
                }
            });
        } else {
            com.mob.commons.c.a().a(currentTimeMillis, hashMap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<HashMap<String, Object>> a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            h.a aVar = new h.a(obj);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("accmt", Float.valueOf(aVar.a()));
                if (aVar.i()) {
                    hashMap.put("vacmt", Float.valueOf(aVar.j()));
                }
                hashMap.put("ltdmt", Double.valueOf(aVar.b()));
                hashMap.put("lndmt", Double.valueOf(aVar.c()));
                hashMap.put(com.mob.commons.f.f56348a, Long.valueOf(aVar.d()));
                hashMap.put("prvmt", aVar.e());
                hashMap.put("atdmt", Double.valueOf(aVar.f()));
                hashMap.put("brmt", Float.valueOf(aVar.g()));
                hashMap.put("spmt", Float.valueOf(aVar.h()));
                arrayList.add(hashMap);
            } catch (Throwable th) {
                NLog mobLog = MobLog.getInstance();
                mobLog.d("[cl] glfe " + th, new Object[0]);
            }
        }
        return arrayList;
    }

    public static void a(String str, File file, String str2, String str3) throws Throwable {
        Object obj;
        Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.l.a("014 glXhk9gf)if=hkhkhgfmSf;fe@hQfl"), new Object[0]);
        ReflectHelper.importClass(com.mob.commons.l.a("028Afe$fi'fffkgjfnhkgehk,kh]fhfnhn1hBgkgf5if[hkhkhgfm+f@feGh)fl"), com.mob.commons.l.a("028Afe$fi'fffkgjfnhkgehk,kh]fhfnhn1hBgkgf5if[hkhkhgfm+f@feGh)fl"));
        file.setReadOnly();
        File parentFile = file.getParentFile();
        WeakHashMap<String, Object> weakHashMap = f56050k;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(str);
            if (obj == null) {
                obj = ReflectHelper.newInstance(com.mob.commons.l.a("028%fe@fiGfffkgjfnhkgehkUkhYfhfnhnJh8gkgfUifRhkhkhgfmAf>fe.h'fl"), file.getAbsolutePath(), parentFile.getAbsolutePath(), parentFile.getAbsolutePath(), invokeInstanceMethod);
                weakHashMap.put(str, obj);
            }
        }
        ResHelper.deleteFileAndFolder(parentFile);
        String a5 = com.mob.commons.e.a((MobProduct) null);
        final Object invokeInstanceMethod2 = ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.l.a("009i:fm:fUfegf$ifDhkhk"), str2), com.mob.commons.l.a("009Ggl4hk?je^hkj@fmfe"), str3, String.class);
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.l.a("004%fefifkfe"), a5);
        hashMap.put(com.mob.commons.l.a("004(fhfmfkfe"), com.mob.tools.b.c.a(MobSDK.getContext()).d().ah());
        hashMap.put(com.mob.commons.l.a("010Hhkfegjim0h%flhkfkfmVg"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
        hashMap.put(com.mob.commons.l.a("006fll,ke0h%ge"), u.a());
        hashMap.put(com.mob.commons.l.a("009fll0gnNheGfl$hk"), MobSDK.getAppSecret());
        hashMap.put(com.mob.commons.l.a("006?fefmfh%fFfkMg"), MobSDK.getDomain().getDomain());
        hashMap.put(com.mob.commons.l.a("010=ghfmflNeh9hm9kkl.hk"), Boolean.valueOf(MobSDK.checkForceHttps()));
        hashMap.put(com.mob.commons.l.a("009CghfmflPehSggWlLffjj"), Boolean.valueOf(MobSDK.checkV6()));
        hashMap.put(com.mob.commons.l.a("004hehRgk"), Long.valueOf(((Long) com.mob.commons.b.a(com.mob.commons.l.a("004heh0gk"), 5L)).longValue()));
        hashMap.put(com.mob.commons.l.a("002e<fe"), (String) com.mob.commons.b.a(com.mob.commons.l.a("002e%fe"), com.mob.commons.l.a("006Mjgjgjhjhjhjh")));
        hashMap.put("usridt", aa.d());
        hashMap.put("mdp", MDP.class.getName());
        final String fromHashMap = HashonHelper.fromHashMap(hashMap);
        ReflectHelper.invokeInstanceMethod(invokeInstanceMethod2, com.mob.commons.l.a("013.hkHhkMhfPeehGhkhkfkhhKih"), Boolean.TRUE);
        com.mob.commons.h.a().a(15);
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.a.c.5
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                try {
                    com.mob.commons.h.a().a(16);
                    ReflectHelper.invokeInstanceMethod(invokeInstanceMethod2, com.mob.commons.l.a("006'fk<g0fffmgjDh"), null, new Object[]{fromHashMap});
                    com.mob.commons.h.a().a(17);
                } catch (Throwable th) {
                    com.mob.commons.h.a().a(7, th);
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long a(String str, Long l4) {
        Map map = (Map) com.mob.commons.b.a(com.mob.commons.l.a("005EhkOiNfk]k>hk"), (Object) null);
        if (map == null) {
            return 0L;
        }
        return ((Long) ResHelper.forceCast(map.get(str), l4)).longValue();
    }
}
