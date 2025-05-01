package com.kwad.sdk.ip.direct;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.NetworkMonitor;
import com.kwad.sdk.core.response.model.HttpDnsInfo;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
import com.kwad.sdk.service.a.h;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class a {
    private static c aJA = null;
    private static HandlerThread aJB = null;
    private static Handler aJC = null;
    private static int aJr = -1;
    private static volatile boolean aJs;
    private static List<HttpDnsInfo.IpInfo> aJt = new CopyOnWriteArrayList();
    private static List<HttpDnsInfo.IpInfo> aJu = new CopyOnWriteArrayList();
    private static List<HttpDnsInfo.IpInfo> aJv = new CopyOnWriteArrayList();
    private static List<c> aJw = new CopyOnWriteArrayList();
    private static List<c> aJx = new CopyOnWriteArrayList();
    private static PriorityBlockingQueue<c> aJy = new PriorityBlockingQueue<>();
    private static AtomicInteger aJz = new AtomicInteger(0);
    private static volatile boolean aJD = false;
    private static float aJE = -1.0f;
    private static float aJF = -1.0f;
    private static float aJG = -1.0f;
    private static int aJH = 0;
    private static volatile boolean aJI = false;
    private static volatile boolean aJJ = false;
    private static NetworkMonitor.a aJK = new NetworkMonitor.a() { // from class: com.kwad.sdk.ip.direct.a.1
        @Override // com.kwad.sdk.core.NetworkMonitor.a
        public final void a(NetworkMonitor.NetworkState networkState) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "*********onNetworkChange");
            if (a.aJJ) {
                a.access$102(true);
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "*********onNetworkChange sHasNetChanged true");
                return;
            }
            a.access$002(true);
        }
    };
    private static Runnable aJL = new Runnable() { // from class: com.kwad.sdk.ip.direct.a.3
        @Override // java.lang.Runnable
        public final void run() {
            a.Jl();
        }
    };

    private static void G(List<HttpDnsInfo.IpInfo> list) {
        b(list, aJw);
        if (aJw.isEmpty()) {
            return;
        }
        float f5 = 0.0f;
        for (c cVar : aJw) {
            f5 += cVar.JC();
        }
        aJE = f5 / aJw.size();
    }

    private static void H(List<HttpDnsInfo.IpInfo> list) {
        b(list, aJx);
        if (aJx.isEmpty()) {
            return;
        }
        int i4 = 0;
        float f5 = 0.0f;
        for (c cVar : aJx) {
            if (cVar != null) {
                i4 += cVar.getWeight();
                f5 += cVar.getWeight() * cVar.JC();
            }
        }
        if (i4 != 0) {
            aJF = f5 / i4;
        }
    }

    private static void Jg() {
        Handler handler;
        if (aJD || (handler = aJC) == null) {
            return;
        }
        handler.obtainMessage(1).sendToTarget();
    }

    public static String Jh() {
        c cVar = aJA;
        return cVar != null ? cVar.getIp() : "";
    }

    public static float Ji() {
        return aJE;
    }

    public static float Jj() {
        return aJF;
    }

    public static float Jk() {
        return aJG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Jl() {
        Jq();
        List<HttpDnsInfo.IpInfo> list = aJt;
        List<HttpDnsInfo.IpInfo> list2 = aJu;
        clear();
        if (aJD) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "is picking return");
            return;
        }
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "start pick");
        aJD = true;
        G(list);
        H(list2);
        if (aJw.isEmpty() && aJx.isEmpty()) {
            h hVar = (h) ServiceProvider.get(h.class);
            if (hVar == null) {
                aJD = false;
                return;
            } else if (!hVar.zr()) {
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "isIpPreferEnable:false");
                aJD = false;
                return;
            } else {
                Jo();
            }
        }
        aJD = false;
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "end pick");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Jm() {
        if (Jn()) {
            return;
        }
        Jp();
    }

    private static boolean Jn() {
        List<c> list = aJw;
        List<c> list2 = aJx;
        if (!list.isEmpty()) {
            aJA = list.get(new Random().nextInt(list.size()));
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from recommend:" + aJA);
            aJH = 1;
            return true;
        }
        int i4 = 0;
        if (list2.isEmpty()) {
            return false;
        }
        Random random = new Random();
        int i5 = 0;
        for (c cVar : list2) {
            if (cVar != null) {
                i5 += cVar.getWeight();
            }
        }
        if (i5 <= 0) {
            return false;
        }
        int nextInt = random.nextInt(i5);
        int i6 = 0;
        while (true) {
            if (i6 >= list2.size()) {
                break;
            }
            if (list2.get(i6) != null) {
                nextInt -= list2.get(i6).getWeight();
            }
            if (nextInt < 0) {
                i4 = i6;
                break;
            }
            i6++;
        }
        aJA = list2.get(i4);
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from backUp:" + aJA);
        aJH = 2;
        return true;
    }

    private static void Jo() {
        List<HttpDnsInfo.IpInfo> list = aJv;
        if (list.isEmpty()) {
            return;
        }
        for (HttpDnsInfo.IpInfo ipInfo : list) {
            if (ipInfo != null && !TextUtils.isEmpty(ipInfo.ip)) {
                c f5 = b.f(ipInfo.ip, aJr);
                if (f5.isSuccess()) {
                    aJy.offer(f5);
                }
            }
        }
        c peek = aJy.peek();
        if (peek != null) {
            aJG = peek.JC();
        }
    }

    private static void Jp() {
        if (aJy.isEmpty()) {
            return;
        }
        c peek = aJy.peek();
        if (peek.JC() < aJr) {
            aJA = peek;
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from Other:" + aJA);
            aJH = 3;
        }
    }

    private static void Jq() {
        if (aJr == -1) {
            h hVar = (h) ServiceProvider.get(h.class);
            if (hVar != null) {
                aJr = hVar.zs();
            } else {
                aJr = 200;
            }
        }
    }

    private static boolean Jr() {
        if (aJI) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sHasNetChanged direct can not use");
            return false;
        }
        int i4 = aJz.get();
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "value:" + i4);
        return i4 <= 3;
    }

    private static void Js() {
        aJz.getAndIncrement();
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "addFailedTimes:" + aJz.intValue());
    }

    public static void Jt() {
        c cVar;
        Handler handler;
        if (!aJs || (cVar = aJA) == null || TextUtils.isEmpty(cVar.getIp()) || (handler = aJC) == null) {
            return;
        }
        handler.obtainMessage(2).sendToTarget();
    }

    public static void Ju() {
        Js();
        Jv();
        Jw();
        aJH = 0;
        Jm();
        Jl();
    }

    private static void Jv() {
        HttpDnsInfo.IpInfo ipInfo;
        HttpDnsInfo.IpInfo ipInfo2;
        c cVar = aJA;
        String ip = cVar == null ? "" : cVar.getIp();
        if (TextUtils.isEmpty(ip)) {
            return;
        }
        Iterator<HttpDnsInfo.IpInfo> it2 = aJt.iterator();
        while (true) {
            ipInfo = null;
            if (!it2.hasNext()) {
                ipInfo2 = null;
                break;
            }
            ipInfo2 = it2.next();
            if (ipInfo2 != null && TextUtils.equals(ip, ipInfo2.ip)) {
                break;
            }
        }
        if (ipInfo2 != null) {
            aJt.remove(ipInfo2);
            ipInfo2 = null;
        }
        Iterator<HttpDnsInfo.IpInfo> it3 = aJu.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            HttpDnsInfo.IpInfo next = it3.next();
            if (next != null && TextUtils.equals(ip, next.ip)) {
                ipInfo2 = next;
                break;
            }
        }
        if (ipInfo2 != null) {
            aJu.remove(ipInfo2);
        } else {
            ipInfo = ipInfo2;
        }
        Iterator<HttpDnsInfo.IpInfo> it4 = aJv.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            HttpDnsInfo.IpInfo next2 = it4.next();
            if (next2 != null && TextUtils.equals(ip, next2.ip)) {
                ipInfo = next2;
                break;
            }
        }
        if (ipInfo != null) {
            aJv.remove(ipInfo);
        }
    }

    private static void Jw() {
        c cVar;
        if (aJA == null) {
            return;
        }
        List<c> list = aJw;
        if (list != null && !list.isEmpty() && aJw.contains(aJA)) {
            aJw.remove(aJA);
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sRecommendEntityList remove:" + aJA);
        }
        List<c> list2 = aJx;
        if (list2 != null && !list2.isEmpty()) {
            if (aJx.contains(aJA)) {
                aJx.remove(aJA);
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sBackUpIpEntityList remove:" + aJA);
            }
            Iterator<c> it2 = aJx.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it2.next();
                if (cVar != null && TextUtils.equals(cVar.getIp(), aJA.getIp())) {
                    com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set removeEntity:" + cVar.getIp());
                    break;
                }
            }
            if (cVar != null) {
                aJx.remove(cVar);
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sBackUpIpEntityList remove removeEntity:" + cVar);
            }
        }
        c peek = aJy.peek();
        if (peek != null && peek == aJA) {
            aJy.poll();
        }
        aJA = null;
    }

    public static void a(HttpDnsInfo httpDnsInfo) {
        if (httpDnsInfo == null) {
            return;
        }
        h hVar = (h) ServiceProvider.get(h.class);
        if (hVar == null) {
            com.kwad.sdk.core.e.c.w("IpDirect_Helper", "sdkConfigProvider == null");
            return;
        }
        boolean zq = hVar.zq();
        aJs = zq;
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "isEnable:" + zq);
        if (zq) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", httpDnsInfo.toString());
            List<HttpDnsInfo.IpInfo> list = httpDnsInfo.recommendList;
            aJt = list;
            aJu = httpDnsInfo.backUpList;
            aJv = httpDnsInfo.otherList;
            if (list.isEmpty() && aJu.isEmpty() && aJv.isEmpty()) {
                com.kwad.sdk.core.e.c.w("IpDirect_Helper", "HttpDnsInfo is empty");
                return;
            }
            init();
            Jg();
        }
    }

    static /* synthetic */ boolean access$002(boolean z4) {
        aJJ = true;
        return true;
    }

    static /* synthetic */ boolean access$102(boolean z4) {
        aJI = true;
        return true;
    }

    private static void b(List<HttpDnsInfo.IpInfo> list, List<c> list2) {
        if (list == null) {
            return;
        }
        for (HttpDnsInfo.IpInfo ipInfo : list) {
            if (ipInfo != null && !TextUtils.isEmpty(ipInfo.ip)) {
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", ipInfo.toString());
                c f5 = b.f(ipInfo.ip, aJr);
                f5.dB(ipInfo.weight);
                if (f5.isSuccess() && f5.JC() < aJr) {
                    list2.add(f5);
                }
            }
        }
    }

    private static void clear() {
        aJw.clear();
        aJx.clear();
        aJy.clear();
    }

    @Nullable
    public static String fX(String str) {
        if (!aJs) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "getIpByHost return by sIpDirectEnable false");
            return "";
        } else if (fY(str)) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "isHostInvalid:false ：" + str);
            return "";
        } else if (!Jr()) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "canUseIpDirect:false");
            return "";
        } else {
            String Jh = Jh();
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "getIpByHost ip:" + Jh);
            return Jh;
        }
    }

    private static boolean fY(String str) {
        boolean z4 = !TextUtils.equals("https://" + str, com.kwad.sdk.h.yA());
        if (z4) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "非核心域名 current host:" + com.kwad.sdk.h.yA() + "try direct host:https://" + str);
        }
        return z4;
    }

    public static int getType() {
        return aJH;
    }

    private static void init() {
        if (aJB != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("IpDirectHelper");
        aJB = handlerThread;
        handlerThread.start();
        aJC = new Handler(aJB.getLooper()) { // from class: com.kwad.sdk.ip.direct.a.2
            @Override // android.os.Handler
            public final void handleMessage(@NonNull Message message) {
                int i4 = message.what;
                if (i4 == 1) {
                    a.Jl();
                    a.Jm();
                } else if (i4 != 2) {
                } else {
                    a.Ju();
                }
            }
        };
        f fVar = (f) ServiceProvider.get(f.class);
        if (fVar != null) {
            NetworkMonitor.getInstance().a(fVar.getContext(), aJK);
        }
    }
}
