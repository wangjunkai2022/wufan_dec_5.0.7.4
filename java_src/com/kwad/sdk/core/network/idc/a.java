package com.kwad.sdk.core.network.idc;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.network.d;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import com.kwad.sdk.h;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.g;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class a {
    private static final int axR;
    private final Map<String, String> axM;
    private final com.kwad.sdk.core.network.idc.a.b axN;
    private final Random axO;
    private final Map<String, AtomicBoolean> axP;
    private final Map<String, com.kwad.sdk.core.network.idc.a.a> axQ;
    private volatile int axS;
    private volatile boolean axT;
    private Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.network.idc.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0526a {
        private static final a axW = new a((byte) 0);
    }

    static {
        axR = com.kwad.framework.a.a.md.booleanValue() ? 0 : 60000;
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static a EE() {
        return C0526a.axW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void EF() {
        com.kwad.sdk.core.network.idc.a.b bn = b.bn(this.mContext);
        if (bn.isEmpty()) {
            bn = b.bm(this.mContext);
        }
        this.axN.a(bn);
    }

    @WorkerThread
    private void V(@NonNull String str, String str2) {
        String host;
        StringBuilder sb;
        List<String> ef = this.axN.ef(str2);
        if (ef.isEmpty() || (host = Uri.parse(str).getHost()) == null || host.isEmpty()) {
            return;
        }
        c.d("IdcManager", ">>> switchHost start, try get lock, type = " + str2 + ", old host = " + host);
        AtomicBoolean atomicBoolean = this.axP.get(str2);
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                String ed = ed(str2);
                if ((TextUtils.isEmpty(ed) || host.equals(ed)) ? false : true) {
                    atomicBoolean.set(false);
                    sb = new StringBuilder("<<< switchHost end, type = ");
                } else {
                    int size = ef.size();
                    int indexOf = ef.indexOf(host);
                    boolean z4 = indexOf >= 0;
                    if (z4) {
                        size--;
                    }
                    if (size <= 0) {
                        atomicBoolean.set(false);
                        sb = new StringBuilder("<<< switchHost end, type = ");
                    } else {
                        int nextInt = this.axO.nextInt(size) + 1;
                        if (z4) {
                            nextInt += indexOf;
                        }
                        int size2 = nextInt % ef.size();
                        String str3 = ef.get(size2);
                        c.d("IdcManager", "switchHost success, type = " + str2 + ", old host = " + host + ",new host = " + str3 + ",hostList = " + ef + ", key = " + size2);
                        X(str2, str3);
                        if (p(str2, size2)) {
                            ea(str2);
                        }
                        atomicBoolean.set(false);
                        sb = new StringBuilder("<<< switchHost end, type = ");
                    }
                }
                sb.append(str2);
                sb.append(", old host = ");
                sb.append(host);
                c.d("IdcManager", sb.toString());
            } catch (Throwable th) {
                atomicBoolean.set(false);
                c.d("IdcManager", "<<< switchHost end, type = " + str2 + ", old host = " + host);
                throw th;
            }
        }
    }

    private void X(String str, String str2) {
        c.d("IdcManager", "updateCurrentIdc: hostType = " + str + ",new host = " + str2);
        this.axM.put(str, str2);
        g.execute(new az() { // from class: com.kwad.sdk.core.network.idc.a.3
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.a(a.this.mContext, a.this.axM);
            }
        });
    }

    private void ea(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c.d("IdcManager", "save switched host, type = " + str);
        this.axQ.put(str, new com.kwad.sdk.core.network.idc.a.a(elapsedRealtime, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public boolean ec(String str) {
        boolean gN;
        String ed = ed(str);
        List<String> ef = this.axN.ef(str);
        if (ef.isEmpty()) {
            return false;
        }
        String str2 = ef.get(0);
        if (TextUtils.equals(str2, ed)) {
            return true;
        }
        if ("api".equals(str)) {
            gN = c(com.kwad.framework.a.a.md.booleanValue() ? "beta2-ad-open-api.test.gifshow.com" : str2, this.mContext);
        } else {
            gN = ah.gN(str2);
        }
        c.d("IdcManager", "perform ping action for " + str + ",mainHost = " + str2 + ",isSuccess = " + gN);
        if (gN) {
            X(str, str2);
        }
        return gN;
    }

    private String ed(String str) {
        return this.axM.get(str);
    }

    private boolean p(String str, int i4) {
        return "api".equals(str) && i4 > 0 && !this.axQ.containsKey(str) && this.axS > 0;
    }

    public final boolean EG() {
        return !this.axQ.isEmpty();
    }

    @Nullable
    public final String W(String str, String str2) {
        String str3 = this.axM.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public final String Y(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String ed = ed(str2);
        if (ed == null || ed.isEmpty()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getPath()) || ed.equals(parse.getHost())) {
            return str;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.authority(ed);
        if (TextUtils.isEmpty(parse.getScheme())) {
            builder.scheme("https");
        } else {
            builder.scheme(parse.getScheme());
        }
        builder.path(parse.getPath());
        if (!TextUtils.isEmpty(parse.getQuery())) {
            builder.query(parse.getQuery());
        }
        return URLDecoder.decode(builder.build().toString());
    }

    public final void eb(String str) {
        int i4 = this.axS;
        if (!this.axT && i4 > 0) {
            com.kwad.sdk.core.network.idc.a.a aVar = this.axQ.get(str);
            if (aVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - aVar.EJ();
                boolean z4 = elapsedRealtime > ((long) Math.max(i4, axR));
                c.d("IdcManager", "handleHostRollback: isAvailable = " + z4 + ",interval = " + elapsedRealtime + ",rollbackInterval = " + i4 + ",hostType = hostType");
                if (z4) {
                    AtomicBoolean atomicBoolean = this.axP.get(str);
                    try {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            boolean EI = aVar.EI();
                            c.d("IdcManager", "handleHostRollback: isInRollback = " + EI);
                            if (!EI) {
                                aVar.bm(true);
                                if (ec(str)) {
                                    this.axQ.remove(str);
                                    c.d("IdcManager", "handleHostRollback success,remove switched host, type = " + str);
                                } else {
                                    c.d("IdcManager", "rollbackToMainHost failed, reset attempt time.");
                                    ea(str);
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        c.e("IdcManager", "handleHostRollback failed by " + e5.getMessage());
                        return;
                    } finally {
                        atomicBoolean.set(false);
                        c.d("IdcManager", "handleHostRollback end, release lock.host = " + str);
                    }
                }
                return;
            }
            return;
        }
        c.d("IdcManager", "performHostRollback is invalid, by in prepare = " + this.axT + ",rollbackInterval = " + i4);
    }

    public final String ee(String str) {
        return Y(str, "cdn");
    }

    public final void g(String str, Throwable th) {
        a(str, "cdn", new DomainException(th));
    }

    public final void init(final Context context) {
        this.mContext = context.getApplicationContext();
        this.axT = true;
        g.execute(new az() { // from class: com.kwad.sdk.core.network.idc.a.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                a.this.axM.putAll(b.bo(context));
                a.this.EF();
                if (!a.this.axN.isEmpty()) {
                    for (String str : a.this.axN.EL()) {
                        a.this.ec(str);
                    }
                }
                c.d("IdcManager", "idc prepare done.");
                a.a(a.this, false);
            }
        });
    }

    private a() {
        this.axM = new ConcurrentHashMap(8);
        this.axN = new com.kwad.sdk.core.network.idc.a.b();
        this.axO = new Random(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        this.axP = hashMap;
        this.axQ = new ConcurrentHashMap(4);
        this.axS = 0;
        this.axT = false;
        hashMap.put("api", new AtomicBoolean(false));
        hashMap.put("ulog", new AtomicBoolean(false));
        hashMap.put("zt", new AtomicBoolean(false));
        hashMap.put("cdn", new AtomicBoolean(false));
    }

    @WorkerThread
    private static boolean c(final String str, Context context) {
        boolean isNetworkConnected = ah.isNetworkConnected(context);
        c.d("IdcManager", "connect host = " + str + ",isNetworkConnected = " + isNetworkConnected);
        if (isNetworkConnected && str != null) {
            AdHttpProxy yy = com.kwad.sdk.g.yy();
            d dVar = new d() { // from class: com.kwad.sdk.core.network.idc.a.4
                @Override // com.kwad.sdk.core.network.d, com.kwad.sdk.core.network.b
                public final void buildBaseBody() {
                }

                @Override // com.kwad.sdk.core.network.d, com.kwad.sdk.core.network.b
                public final void buildBaseHeader() {
                }

                @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
                public final String getUrl() {
                    return h.bY("https://" + str);
                }
            };
            com.kwad.sdk.core.network.c doGet = yy.doGet(dVar.getUrl(), Collections.emptyMap());
            c.d("IdcManager", "perform connect host:" + dVar.getUrl());
            if (doGet != null) {
                c.d("IdcManager", "connect host response, rawCode = " + doGet.awC + ",body = " + doGet.awE);
                if (doGet.awC == 200) {
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ boolean a(a aVar, boolean z4) {
        aVar.axT = false;
        return false;
    }

    public final void a(com.kwad.sdk.core.network.idc.a.b bVar, int i4) {
        this.axS = i4 * 1000;
        c.d("IdcManager", "updateIdcData,rollback interval = " + i4);
        if (i4 == 0) {
            this.axQ.clear();
        }
        this.axN.a(bVar);
        g.execute(new az() { // from class: com.kwad.sdk.core.network.idc.a.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.a(a.this.mContext, a.this.axN);
            }
        });
    }

    public final void a(String str, int i4, Throwable th) {
        a(str, "ulog", new DomainException(i4, th));
    }

    public final void a(String str, String str2, DomainException domainException) {
        if (str != null && a(domainException)) {
            V(str, str2);
        }
    }

    private static boolean a(DomainException domainException) {
        if (domainException.getHttpCode() >= 500) {
            return true;
        }
        return domainException.isConnectException();
    }
}
