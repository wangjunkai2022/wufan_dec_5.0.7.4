package com.beizi.fusion.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beizi.fusion.AdListener;
import com.beizi.fusion.BannerAdListener;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.DrawAdListener;
import com.beizi.fusion.FullScreenVideoAdListener;
import com.beizi.fusion.InterstitialAdListener;
import com.beizi.fusion.NativeAdListener;
import com.beizi.fusion.NativeFloatAdListener;
import com.beizi.fusion.NativeNotificationAdListener;
import com.beizi.fusion.NativeUnifiedAdListener;
import com.beizi.fusion.RewardedVideoAdListener;
import com.beizi.fusion.d.a.a;
import com.beizi.fusion.g.ae;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.y;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.EventItem;
import com.beizi.fusion.model.Manager;
import com.beizi.fusion.model.ResponseInfo;
import com.join.mgps.service.CommonService_;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: BaseManager.java */
/* loaded from: classes2.dex */
public abstract class e implements com.beizi.fusion.d.a, Observer {

    /* renamed from: a  reason: collision with root package name */
    protected static Context f6692a;

    /* renamed from: r  reason: collision with root package name */
    private static boolean f6693r;
    private com.beizi.fusion.b.d G;
    private long H;
    private List<AdSpacesBean.BuyerBean> I;
    private ae K;
    private a L;
    private boolean M;

    /* renamed from: b  reason: collision with root package name */
    protected Context f6694b;

    /* renamed from: c  reason: collision with root package name */
    protected com.beizi.fusion.b.b f6695c;

    /* renamed from: d  reason: collision with root package name */
    protected ViewGroup f6696d;

    /* renamed from: e  reason: collision with root package name */
    protected String f6697e;

    /* renamed from: f  reason: collision with root package name */
    protected long f6698f;

    /* renamed from: g  reason: collision with root package name */
    protected View f6699g;

    /* renamed from: h  reason: collision with root package name */
    protected com.beizi.fusion.a f6700h;

    /* renamed from: i  reason: collision with root package name */
    protected com.beizi.fusion.work.a f6701i;

    /* renamed from: m  reason: collision with root package name */
    protected String f6705m;

    /* renamed from: t  reason: collision with root package name */
    private e f6711t;

    /* renamed from: u  reason: collision with root package name */
    private AdSpacesBean f6712u;

    /* renamed from: j  reason: collision with root package name */
    protected Map<String, com.beizi.fusion.work.a> f6702j = new Hashtable();

    /* renamed from: k  reason: collision with root package name */
    protected ArrayList<c> f6703k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    protected boolean f6704l = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6710s = false;

    /* renamed from: v  reason: collision with root package name */
    private long f6713v = 500;

    /* renamed from: w  reason: collision with root package name */
    private long f6714w = 100;

    /* renamed from: x  reason: collision with root package name */
    private volatile int f6715x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f6716y = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f6717z = 0;
    private int A = 1;
    private int B = 2;
    private Timer C = new Timer();
    private Timer D = new Timer();
    private Timer E = new Timer();
    private boolean F = false;
    private boolean J = false;
    private boolean N = false;
    private AdSpacesBean O = null;
    private com.beizi.fusion.b.a P = null;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f6706n = false;
    private int Q = 0;
    private int R = 1;
    private int S = 2;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f6707o = false;
    private boolean T = false;
    private boolean U = false;

    /* renamed from: p  reason: collision with root package name */
    protected com.beizi.fusion.work.a f6708p = null;
    private TimerTask V = new TimerTask() { // from class: com.beizi.fusion.d.e.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f6716y = eVar.A;
            if (e.this.f6701i != null) {
                e.this.f6709q.sendEmptyMessage(1);
            }
        }
    };
    private TimerTask W = new TimerTask() { // from class: com.beizi.fusion.d.e.2
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("========update inner outTime==========:");
            sb.append(System.currentTimeMillis());
            e eVar = e.this;
            eVar.f6716y = eVar.B;
            e.this.f6709q.sendEmptyMessage(2);
            if (e.this.G != null) {
                e.this.G.a(true);
            }
        }
    };
    @SuppressLint({"HandlerLeak"})

    /* renamed from: q  reason: collision with root package name */
    protected Handler f6709q = new Handler(Looper.getMainLooper()) { // from class: com.beizi.fusion.d.e.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                e eVar = e.this;
                if (eVar.f6701i != null) {
                    eVar.b(2);
                }
            } else if (i4 == 2) {
                if (e.this.G != null) {
                    e eVar2 = e.this;
                    com.beizi.fusion.work.a aVar = eVar2.f6701i;
                    if (aVar != null) {
                        aVar.q();
                        e eVar3 = e.this;
                        eVar3.a(eVar3.f6701i.g(), e.this.f6701i.o());
                        if ("4".equals(e.this.f())) {
                            e eVar4 = e.this;
                            if (!eVar4.f6706n) {
                                eVar4.f6701i.f();
                                e.this.f6706n = true;
                            }
                        }
                        Map<String, com.beizi.fusion.work.a> q4 = e.this.q();
                        if (q4 != null) {
                            for (com.beizi.fusion.work.a aVar2 : q4.values()) {
                                AdSpacesBean.BuyerBean k4 = aVar2.k();
                                AdSpacesBean.BuyerBean k5 = e.this.f6701i.k();
                                if (k4 != null && k5 != null && (TextUtils.isEmpty(k4.getBuyerSpaceUuId()) || TextUtils.isEmpty(k5.getBuyerSpaceUuId()) || !k4.getBuyerSpaceUuId().equals(k5.getBuyerSpaceUuId()))) {
                                    e.this.b(aVar2, 2);
                                    af.a("BeiZis", "AdRequest timeout channel = " + k4.getId() + ",mManagerObserver.mChannelResultStatus.getStatus(channel) = " + e.this.G.f6581g.a(k4.getBuyerSpaceUuId()));
                                    if (aVar2.i() == com.beizi.fusion.f.a.ADDEFAULT) {
                                        e.this.G.f6581g.a(k4.getBuyerSpaceUuId(), -1);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    eVar2.a(9999);
                    Map<String, com.beizi.fusion.work.a> q5 = e.this.q();
                    if (q5 != null) {
                        for (com.beizi.fusion.work.a aVar3 : q5.values()) {
                            AdSpacesBean.BuyerBean k6 = aVar3.k();
                            if (k6 != null) {
                                e.this.b(aVar3, 2);
                                af.a("BeiZis", "AdRequest timeout channel = " + k6.getId() + ",mManagerObserver.mChannelResultStatus.getStatus(channel) = " + e.this.G.f6581g.a(k6.getBuyerSpaceUuId()));
                                if (e.this.G.f6581g.a(k6.getBuyerSpaceUuId()) < 4) {
                                    e.this.G.f6581g.a(k6.getBuyerSpaceUuId(), -1);
                                }
                            }
                        }
                    }
                }
            } else {
                if (i4 != 3) {
                    return;
                }
                com.beizi.fusion.b.d f5 = b.a().f();
                e.this.G = new com.beizi.fusion.b.d(new com.beizi.fusion.b.b(b.f6675b, "", "", "", b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                e eVar5 = e.this;
                eVar5.P = eVar5.G.a();
                e eVar6 = e.this;
                eVar6.f6695c = eVar6.G.b();
                e.this.D();
                e.this.P.a(e.this.f6695c);
                e.this.G();
                if (f5 != null && f5.f6575a.a() == 2 && e.this.G.f6576b.a() == 0) {
                    e.this.G.f6576b.a(1);
                    if (e.this.G.f6576b.a() == 1) {
                        e.this.G.f6576b.a(2);
                        e eVar7 = e.this;
                        eVar7.f6712u = com.beizi.fusion.c.a.a(eVar7.f6694b, eVar7.f6705m, eVar7.f());
                        if (e.this.f6712u == null) {
                            if (e.this.G.f6576b.a() != 2) {
                                e.this.G.f6576b.a(-2);
                                e.this.a("kGetLocalConfigStatusInternalError");
                                return;
                            }
                            int a5 = com.beizi.fusion.c.a.a();
                            if (a5 == 1) {
                                e.this.G.f6576b.a(4);
                                e.this.a(10001);
                                return;
                            } else if (a5 == 2) {
                                e.this.G.f6576b.a(5);
                                e.this.a(10100);
                                return;
                            } else if (a5 == 3) {
                                e.this.G.f6576b.a(6);
                                e.this.a(10110);
                                return;
                            } else {
                                e.this.a(9999);
                                return;
                            }
                        }
                        e.this.a(9999);
                        return;
                    }
                    e.this.G.f6576b.a(-2);
                    e.this.a("kGetLocalConfigStatusInternalError");
                    return;
                }
                e.this.a(10000);
            }
        }
    };
    private TimerTask X = new TimerTask() { // from class: com.beizi.fusion.d.e.4
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("========update outTime==========:");
            sb.append(System.currentTimeMillis());
            e.this.f6709q.sendEmptyMessage(3);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseManager.java */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                int intExtra = intent.getIntExtra("updateResult", 0);
                e.this.M = true;
                if (TextUtils.equals(action, "com.ad.action.UPDATE_CONFIG_SUCCESS")) {
                    if (intExtra == 1) {
                        if (e.this.E != null) {
                            e.this.E.cancel();
                            e.this.E = null;
                        }
                        e eVar = e.this;
                        eVar.a(eVar.f6696d);
                    } else if (intExtra == 0 && e.this.N) {
                        if (e.this.E != null) {
                            e.this.E.cancel();
                            e.this.E = null;
                        }
                        e eVar2 = e.this;
                        eVar2.a(eVar2.f6696d);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public e(Context context, String str, com.beizi.fusion.a aVar, long j4) {
        if (context == null) {
            av.b("Illegal Argument: context is null");
        } else {
            this.f6694b = context;
            f6692a = context.getApplicationContext();
            if (!(this.f6694b instanceof Activity)) {
                av.b("Illegal Argument: context is not Activity context");
            }
        }
        this.f6705m = str;
        this.f6700h = aVar;
        this.f6698f = j4;
        this.f6711t = this;
        A();
    }

    private void A() {
        Context context = f6692a;
        if (context == null) {
            if (this.f6700h != null) {
                a(10132);
                return;
            }
            return;
        }
        this.K = ae.a(context);
        IntentFilter intentFilter = new IntentFilter("com.ad.action.UPDATE_CONFIG_SUCCESS");
        a aVar = new a();
        this.L = aVar;
        this.K.a(aVar, intentFilter);
    }

    private void B() {
        TimerTask timerTask;
        if (this.M) {
            return;
        }
        com.beizi.fusion.update.b.a(f6692a).b(5);
        Timer timer = this.E;
        if (timer == null || (timerTask = this.X) == null) {
            return;
        }
        timer.schedule(timerTask, this.f6698f);
    }

    private void C() {
        a aVar;
        ae aeVar = this.K;
        if (aeVar == null || (aVar = this.L) == null) {
            return;
        }
        aeVar.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.b(this.f6697e);
            a();
            this.f6695c.e(b.a().b());
            this.f6695c.f(this.f6705m);
            this.f6695c.g(String.valueOf(this.f6698f));
        }
    }

    private boolean E() {
        TimerTask timerTask;
        TimerTask timerTask2;
        AdSpacesBean adSpacesBean = this.f6712u;
        if (adSpacesBean == null) {
            return false;
        }
        AdSpacesBean.BidBean bid = adSpacesBean.getBid();
        if (bid != null) {
            this.f6713v = bid.getReserveFRWTime();
            this.f6714w = bid.getReserveTime();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6698f);
        sb.append(":mUsableTime=====");
        sb.append(this.f6713v);
        sb.append("=====mLastTime:");
        sb.append(this.f6714w);
        if ((this instanceof q) || (this instanceof p)) {
            return false;
        }
        long j4 = this.f6698f;
        if (j4 > this.f6714w) {
            long j5 = this.f6713v;
            if (j4 > j5) {
                Timer timer = this.C;
                if (timer != null && (timerTask2 = this.V) != null) {
                    timer.schedule(timerTask2, j4 - j5);
                }
            } else {
                this.f6716y = this.A;
            }
            Timer timer2 = this.D;
            if (timer2 != null && (timerTask = this.W) != null) {
                timer2.schedule(timerTask, this.f6698f - this.f6714w);
            }
            return false;
        }
        a(10120);
        this.G.f6576b.a(7);
        return true;
    }

    private void F() {
        y.b(f6692a, this.f6705m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6576b.addObserver(dVar);
            com.beizi.fusion.b.d dVar2 = this.G;
            dVar2.f6577c.addObserver(dVar2);
            com.beizi.fusion.b.d dVar3 = this.G;
            dVar3.f6578d.addObserver(dVar3);
            com.beizi.fusion.b.d dVar4 = this.G;
            dVar4.f6579e.addObserver(dVar4);
            com.beizi.fusion.b.d dVar5 = this.G;
            dVar5.f6580f.addObserver(dVar5);
            com.beizi.fusion.b.d dVar6 = this.G;
            dVar6.f6581g.addObserver(dVar6);
            com.beizi.fusion.b.d dVar7 = this.G;
            dVar7.f6582h.addObserver(dVar7);
            com.beizi.fusion.b.d dVar8 = this.G;
            dVar8.f6583i.addObserver(dVar8);
            com.beizi.fusion.b.d dVar9 = this.G;
            dVar9.f6584j.addObserver(dVar9);
            com.beizi.fusion.b.d dVar10 = this.G;
            dVar10.f6585k.addObserver(dVar10);
        }
    }

    private void H() {
        AdSpacesBean adSpacesBean = this.f6712u;
        if (adSpacesBean != null) {
            String str = null;
            String adType = adSpacesBean.getAdType();
            adType.hashCode();
            char c5 = 65535;
            switch (adType.hashCode()) {
                case -1999289321:
                    if (adType.equals("NATIVE")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1842536857:
                    if (adType.equals("SPLASH")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1372958932:
                    if (adType.equals("INTERSTITIAL")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -370591475:
                    if (adType.equals("REWARDEDVIDEO")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -43721614:
                    if (adType.equals("DRAWFLOW")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 252355794:
                    if (adType.equals("INTERACTIVECARD")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 658985344:
                    if (adType.equals("FULLSCREENVIDEO")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 1723213558:
                    if (adType.equals("REGIONALNATIVE")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 1951953708:
                    if (adType.equals("BANNER")) {
                        c5 = '\b';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    str = "5";
                    break;
                case 1:
                    str = "2";
                    break;
                case 2:
                    str = "3";
                    break;
                case 3:
                    str = "1";
                    break;
                case 4:
                    str = "7";
                    break;
                case 5:
                    str = "13";
                    break;
                case 6:
                    str = "6";
                    break;
                case 7:
                    str = "12";
                    break;
                case '\b':
                    str = "4";
                    break;
            }
            com.beizi.fusion.b.b bVar = this.f6695c;
            if (bVar != null) {
                bVar.d(str);
            }
        }
    }

    private boolean I() {
        if (this.U) {
            com.beizi.fusion.work.a aVar = this.f6708p;
            if (aVar != null) {
                return aVar != null && aVar.i() == com.beizi.fusion.f.a.ADDEFAULT;
            }
            return true;
        }
        return false;
    }

    private boolean J() {
        for (com.beizi.fusion.work.a aVar : q().values()) {
            if (aVar.i() == com.beizi.fusion.f.a.ADDEFAULT) {
                return true;
            }
        }
        return false;
    }

    private synchronized void K() {
        this.f6703k.clear();
    }

    private void L() {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar == null || dVar.f6584j.a() != 0) {
            return;
        }
        this.G.f6584j.a(1);
    }

    private void M() {
        if (this.G != null) {
            af.b("BeiZis", "mManagerObserver.mManagerResultStatus.getStatus() = " + this.G.f6584j.a());
        }
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            if (dVar.f6584j.a() == 1 || this.G.f6584j.a() == 2 || this.G.f6584j.a() == 3) {
                this.G.f6584j.a(3);
            }
        }
    }

    private void N() {
        if (this.G != null) {
            af.b("BeiZis", "mManagerObserver.mManagerResultStatus.getStatus() = " + this.G.f6584j.a());
        }
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            if (dVar.f6584j.a() == 3 || this.G.f6584j.a() == 1 || this.G.f6584j.a() == 2) {
                this.G.f6584j.a(4);
            }
        }
    }

    public abstract com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar);

    protected abstract void a();

    public void l() {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoComplete();
            } else if (aVar instanceof DrawAdListener) {
                ((DrawAdListener) aVar).onVideoComplete();
            }
        }
    }

    public void m() {
        this.f6707o = true;
        b();
        c();
        com.beizi.fusion.work.a aVar = this.f6701i;
        if (aVar != null) {
            aVar.m();
        }
        if (this.Q != this.R) {
            this.f6700h = null;
        }
        Map<String, com.beizi.fusion.work.a> map = this.f6702j;
        if (map != null) {
            map.clear();
        }
        ArrayList<c> arrayList = this.f6703k;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (this.f6711t != null) {
            this.f6711t = null;
        }
        C();
        e();
    }

    public void n() {
        com.beizi.fusion.work.a aVar = this.f6701i;
        if (aVar != null) {
            aVar.n();
        }
    }

    protected void o() {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            if (dVar.f6584j.a() == 1 || this.G.f6584j.a() == 3 || this.G.f6584j.a() == 4) {
                this.G.f6584j.a(2);
            }
        }
    }

    protected void p() {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            if (dVar.f6584j.a() == 0 || this.G.f6584j.a() == 1) {
                this.G.f6584j.a(5);
            }
        }
    }

    public Map<String, com.beizi.fusion.work.a> q() {
        return this.f6702j;
    }

    public int r() {
        return this.f6716y;
    }

    public int s() {
        return this.f6715x;
    }

    public void t() {
        af.c("BeiZis", "enter clearAdStatus");
        this.f6715x = 0;
        this.F = false;
    }

    public boolean u() {
        return f6693r;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
    }

    public int v() {
        AdSpacesBean adSpacesBean = this.f6712u;
        if (adSpacesBean == null || adSpacesBean.getEventStrategy() == null) {
            return Integer.MAX_VALUE;
        }
        AdSpacesBean.EventStrategyBean eventStrategy = this.f6712u.getEventStrategy();
        if (eventStrategy.getValidTimeShow() >= 0) {
            return eventStrategy.getValidTimeShow();
        }
        return Integer.MAX_VALUE;
    }

    public Integer[] w() {
        AdSpacesBean.EventStrategyBean eventStrategy;
        List<AdSpacesBean.RandomStrategyBean> randomStrategy;
        AdSpacesBean adSpacesBean = this.f6712u;
        if (adSpacesBean != null && adSpacesBean.getEventStrategy() != null && (eventStrategy = this.f6712u.getEventStrategy()) != null && (randomStrategy = eventStrategy.getRandomStrategy()) != null && randomStrategy.size() > 0) {
            for (int i4 = 0; i4 < randomStrategy.size(); i4++) {
                AdSpacesBean.RandomStrategyBean randomStrategyBean = randomStrategy.get(i4);
                if (CommonService_.i0.f54387c.equalsIgnoreCase(randomStrategyBean.getEventType())) {
                    return new Integer[]{Integer.valueOf(randomStrategyBean.getMin()), Integer.valueOf(randomStrategyBean.getMax())};
                }
            }
        }
        return new Integer[]{0, 0};
    }

    public boolean x() {
        return this.f6710s;
    }

    public String y() {
        AdSpacesBean adSpacesBean = this.O;
        if (adSpacesBean != null) {
            return adSpacesBean.getSpaceId();
        }
        return null;
    }

    public String z() {
        AdSpacesBean.BuyerBean k4;
        com.beizi.fusion.work.a aVar = this.f6701i;
        if (aVar == null || (k4 = aVar.k()) == null || TextUtils.isEmpty(k4.getBuyerSpaceUuId())) {
            return null;
        }
        return k4.getBuyerSpaceUuId();
    }

    private void c() {
        TimerTask timerTask = this.W;
        if (timerTask != null) {
            timerTask.cancel();
            this.W = null;
        }
        Timer timer = this.D;
        if (timer != null) {
            timer.cancel();
            this.D = null;
        }
        Timer timer2 = this.E;
        if (timer2 != null) {
            timer2.cancel();
            this.E = null;
        }
    }

    private boolean g(String str) {
        return str.equals("HPFRW");
    }

    private String h(String str) {
        af.a("BeiZis", "enter convertSelfChannel buyerId = " + str);
        return au.b().equals(str) ? "BEIZI" : str;
    }

    public com.beizi.fusion.b.d d() {
        return this.G;
    }

    protected void e() {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6576b.deleteObservers();
            this.G.f6577c.deleteObservers();
            this.G.f6578d.deleteObservers();
            this.G.f6579e.deleteObservers();
            this.G.f6580f.deleteObservers();
            this.G.f6581g.deleteObservers();
            this.G.f6582h.deleteObservers();
            this.G.f6583i.deleteObservers();
            this.G.f6584j.deleteObservers();
            this.G.f6585k.deleteObservers();
        }
    }

    public String f() {
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    public String i() {
        return this.f6705m;
    }

    public synchronized void j() {
        Iterator<c> it2 = this.f6703k.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        K();
    }

    public void k() {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar == null || !(aVar instanceof RewardedVideoAdListener)) {
            return;
        }
        ((RewardedVideoAdListener) aVar).onRewarded();
    }

    private boolean d(com.beizi.fusion.work.a aVar) {
        if (aVar == null) {
            return false;
        }
        for (com.beizi.fusion.work.a aVar2 : q().values()) {
            AdSpacesBean.BuyerBean k4 = aVar2.k();
            AdSpacesBean.BuyerBean k5 = aVar.k();
            if (k4 != null && k5 != null && (TextUtils.isEmpty(k4.getBuyerSpaceUuId()) || TextUtils.isEmpty(k5.getBuyerSpaceUuId()) || !k4.getBuyerSpaceUuId().equals(k5.getBuyerSpaceUuId()))) {
                if (!b(aVar2) && !c(aVar2)) {
                    af.c("BeiZis", "worker.getAdStatus():" + aVar2.i() + ":" + aVar2.g());
                    if (aVar2.i() != com.beizi.fusion.f.a.ADFAIL && e(aVar2) > e(aVar)) {
                        return false;
                    }
                } else {
                    double f5 = f(aVar2);
                    if (aVar2.i() == com.beizi.fusion.f.a.ADDEFAULT || f5 > e(aVar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean i(String str) {
        return "FinalLink".equalsIgnoreCase(str);
    }

    protected void g() {
        this.G.f6578d.a(3);
        a(10140);
    }

    private void b() {
        TimerTask timerTask = this.V;
        if (timerTask != null) {
            timerTask.cancel();
            this.V = null;
        }
        Timer timer = this.C;
        if (timer != null) {
            timer.cancel();
            this.C = null;
        }
        Timer timer2 = this.E;
        if (timer2 != null) {
            timer2.cancel();
            this.E = null;
        }
    }

    private double f(com.beizi.fusion.work.a aVar) {
        AdSpacesBean.BuyerBean k4;
        if (aVar == null || (k4 = aVar.k()) == null) {
            return 0.0d;
        }
        return k4.getBidPrice();
    }

    public boolean h() {
        return (s() == 2 || s() == 3) ? false : true;
    }

    @NonNull
    private h k(String str) {
        j(str);
        return h.SUCCESS;
    }

    private void j(String str) {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6582h.a(str, 3);
        }
    }

    @NonNull
    private h l(String str) {
        f(str);
        return h.FAIL;
    }

    protected void f(String str) {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6582h.a(str, 4);
        }
    }

    public void c(String str) {
        if (this.Q == this.R) {
            this.Q = this.S;
        }
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof AdListener) {
                ((AdListener) aVar).onAdClosed();
            } else if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoAdClosed();
            } else if (aVar instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar).onAdClosed();
            } else if (aVar instanceof NativeAdListener) {
                ((NativeAdListener) aVar).onAdClosed();
            } else if (aVar instanceof BannerAdListener) {
                ((BannerAdListener) aVar).onAdClosed();
            } else if (aVar instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar).onAdClosed();
            } else if (aVar instanceof NativeNotificationAdListener) {
                ((NativeNotificationAdListener) aVar).onAdClosed();
            } else if (aVar instanceof NativeFloatAdListener) {
                ((NativeFloatAdListener) aVar).onAdClosed();
            }
        }
        N();
    }

    public void a(ViewGroup viewGroup) {
        List<AdSpacesBean.BuyerBean> list;
        AdSpacesBean.BidComponent bidComponent;
        List<AdSpacesBean> adSpaces;
        AdSpacesBean adSpacesBean;
        if (this.J || this.f6694b == null || f6692a == null) {
            return;
        }
        this.f6696d = viewGroup;
        this.H = System.currentTimeMillis();
        this.f6697e = au.a();
        com.beizi.fusion.b.d f5 = b.a().f();
        com.beizi.fusion.b.d dVar = new com.beizi.fusion.b.d(new com.beizi.fusion.b.b(b.f6675b, "", "", "", b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        this.G = dVar;
        this.P = dVar.a();
        this.f6695c = this.G.b();
        D();
        this.P.a(this.f6695c);
        G();
        if (!BeiZis.isIsSyncInit() && ((f5 == null || f5.f6575a.a() != 2) && !this.T)) {
            ResponseInfo.getInstance(f6692a).init();
            this.T = true;
        }
        if (f5 != null) {
            af.b("BeiZis", "mInitObserver.mInitStatus.getStatus() = " + f5.f6575a.a() + ",mManagerObserver.mGetLocalConfigStatus.getStatus() = " + this.G.f6576b.a());
        }
        if ((f5 != null && f5.f6575a.a() == 2 && this.G.f6576b.a() == 0) || this.T) {
            this.G.f6576b.a(1);
            if (this.G.f6576b.a() == 1) {
                this.G.f6576b.a(2);
                AdSpacesBean a5 = com.beizi.fusion.c.a.a(this.f6694b, this.f6705m, f());
                this.f6712u = a5;
                if (a5 != null) {
                    com.beizi.fusion.b.b bVar = this.f6695c;
                    if (bVar != null) {
                        bVar.A(a5.getFilterSsid());
                        this.f6695c.B(this.f6712u.getComponentSsid());
                        this.f6695c.C(this.f6712u.getBzComponentSsid());
                        H();
                    }
                    ResponseInfo responseInfo = ResponseInfo.getInstance(f6692a);
                    Manager manager = responseInfo.getManager();
                    AdSpacesBean.ComponentBean componentBean = null;
                    if (manager == null || (adSpaces = manager.getAdSpaces()) == null || adSpaces.size() <= 0 || (adSpacesBean = adSpaces.get(0)) == null) {
                        list = null;
                        bidComponent = null;
                    } else {
                        componentBean = adSpacesBean.getComponent();
                        bidComponent = adSpacesBean.getBidComponent();
                        list = adSpacesBean.getBuyer();
                    }
                    if ((componentBean != null || bidComponent != null) && list != null && list.size() > 0) {
                        long maxValidTime = responseInfo.getMaxValidTime();
                        if (maxValidTime == 0) {
                            maxValidTime = 2592000000L;
                        }
                        if (System.currentTimeMillis() - ((Long) at.b(f6692a, "lastUpdateTime", Long.valueOf(new Date(0L).getTime()))).longValue() <= maxValidTime) {
                            this.N = false;
                            this.J = true;
                            if (this.G.f6576b.a() == 2) {
                                this.G.f6576b.a(3);
                                if (E()) {
                                    return;
                                }
                                F();
                                if (this.G.c()) {
                                    this.G.f6576b.a(-1);
                                    return;
                                } else {
                                    a(this.f6712u);
                                    return;
                                }
                            }
                            return;
                        }
                        this.J = false;
                        this.N = true;
                        B();
                        return;
                    }
                    this.J = false;
                    B();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("spaceBean is null and return fail mUpdateConfigSuccess:");
                sb.append(this.M);
                if (this.M) {
                    if (this.G.f6576b.a() == 2) {
                        int a6 = com.beizi.fusion.c.a.a();
                        if (a6 == 1) {
                            this.G.f6576b.a(4);
                            a(10001);
                            return;
                        } else if (a6 == 2) {
                            this.G.f6576b.a(5);
                            a(10100);
                            return;
                        } else if (a6 == 3) {
                            this.G.f6576b.a(6);
                            a(10110);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.G.f6576b.a(-2);
                    a("kGetLocalConfigStatusInternalError");
                    return;
                }
                this.J = false;
                B();
                return;
            }
            this.G.f6576b.a(-2);
            a("kGetLocalConfigStatusInternalError");
        } else if (this.M) {
            this.J = false;
            B();
        } else {
            a(10000);
        }
    }

    private void b(List<AdSpacesBean.ForwardBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.U = true;
        new com.beizi.fusion.d.a.a(new a.InterfaceC0187a() { // from class: com.beizi.fusion.d.e.6
            @Override // com.beizi.fusion.d.a.a.InterfaceC0187a
            public void a(String str, int i4) {
                e.this.G.f6581g.a(str, i4);
            }

            @Override // com.beizi.fusion.d.a.a.InterfaceC0187a
            public void a(AdSpacesBean.ForwardBean forwardBean, AdSpacesBean.BuyerBean buyerBean, String str, double d5) {
                if (e.this.f6716y == e.this.f6717z && forwardBean != null && buyerBean != null) {
                    e eVar = e.this;
                    if (eVar.e(eVar.f6701i) < d5) {
                        String buyerId = forwardBean.getBuyerId();
                        String buyerSpaceUuId = forwardBean.getBuyerSpaceUuId();
                        e.this.P.a(buyerBean, forwardBean);
                        e.this.G.f6579e.a(buyerSpaceUuId, 1);
                        if (e.this.a(forwardBean, buyerBean, buyerSpaceUuId)) {
                            e eVar2 = e.this;
                            eVar2.f6708p = eVar2.a(forwardBean, buyerId, buyerBean, buyerBean.getRenderView(), null);
                            com.beizi.fusion.work.a aVar = e.this.f6708p;
                            if (aVar != null) {
                                aVar.a(forwardBean.getSleepTime());
                                e.this.f6708p.a(forwardBean);
                                e.this.f6708p.a(buyerBean);
                                e.this.f6708p.a(buyerBean.getBidType());
                                e eVar3 = e.this;
                                eVar3.a(buyerId, buyerSpaceUuId, eVar3.f6708p);
                                e.this.f6708p.d();
                                e.this.f6708p.a(true);
                                return;
                            }
                        } else {
                            e.this.U = false;
                            e.this.a((AdSpacesBean.ComponentBean) null, buyerBean.getBidType(), true, 10130);
                            return;
                        }
                    }
                }
                e.this.U = false;
                e.this.a((AdSpacesBean.ComponentBean) null, buyerBean.getBidType(), true, 10160);
            }

            @Override // com.beizi.fusion.d.a.a.InterfaceC0187a
            public void a(String str, String str2, String str3, int i4) {
                e.this.U = false;
                e.this.a((AdSpacesBean.ComponentBean) null, "S2S", true, 10160);
                if (e.this.f6695c != null && !TextUtils.isEmpty(str2)) {
                    e.this.f6695c.i(str2);
                    e.this.f6695c.m(str);
                    e.this.P.a(str3, e.this.f6695c);
                }
                if (e.this.G == null || e.this.G.f6581g == null) {
                    return;
                }
                e.this.G.f6581g.a(str3, i4);
            }

            @Override // com.beizi.fusion.d.a.a.InterfaceC0187a
            public void a() {
                e.this.U = false;
                e.this.a((AdSpacesBean.ComponentBean) null, "S2S", true, 10160);
            }
        }).a(this.f6694b, f(), y(), list, this.I, this.f6712u.getBid().getBidTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e(com.beizi.fusion.work.a aVar) {
        if (aVar == null || aVar.k() == null) {
            return 0.0d;
        }
        AdSpacesBean.BuyerBean k4 = aVar.k();
        if (!c(aVar) && !b(aVar)) {
            return k4.getAvgPrice();
        }
        if (k4.getBidPrice() > 0.0d) {
            return k4.getBidPrice();
        }
        return k4.getAvgPrice();
    }

    public void d(String str) {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof AdListener) {
                ((AdListener) aVar).onAdClicked();
            } else if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoClick();
            } else if (aVar instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar).onAdClick();
            } else if (aVar instanceof NativeAdListener) {
                ((NativeAdListener) aVar).onAdClick();
            } else if (aVar instanceof BannerAdListener) {
                ((BannerAdListener) aVar).onAdClick();
            } else if (aVar instanceof DrawAdListener) {
                ((DrawAdListener) aVar).onAdClick();
            } else if (aVar instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar).onAdClick();
            } else if (aVar instanceof NativeNotificationAdListener) {
                ((NativeNotificationAdListener) aVar).onAdClick();
            } else if (aVar instanceof NativeFloatAdListener) {
                ((NativeFloatAdListener) aVar).onAdClick();
            } else if (aVar instanceof NativeUnifiedAdListener) {
                ((NativeUnifiedAdListener) aVar).onAdClick();
            }
        }
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.beizi.fusion.work.a aVar, int i4) {
        if (b(aVar) || c(aVar)) {
            if (aVar.g().equalsIgnoreCase("GDT") || aVar.g().equalsIgnoreCase("BAIDU")) {
                aVar.d(i4);
            }
        }
    }

    protected void e(String str) {
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6582h.a(str, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i4) {
        a(this.f6701i, i4);
        this.f6701i.q();
        a(this.f6701i.g(), this.f6701i.o());
        if (!"4".equals(f()) || this.f6706n) {
            return;
        }
        this.f6701i.f();
        this.f6706n = true;
    }

    public void b(String str) {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null && (aVar instanceof BannerAdListener)) {
            ((BannerAdListener) aVar).onAdShown();
        } else if (this.f6715x >= 2 && !i(str)) {
            return;
        }
        if (this.Q == 0) {
            this.Q = this.R;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AdShow:");
        sb.append(str);
        this.f6715x = 2;
        com.beizi.fusion.a aVar2 = this.f6700h;
        if (aVar2 != null) {
            if (aVar2 instanceof AdListener) {
                ((AdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar2).onRewardedVideoAdShown();
            } else if (aVar2 instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof DrawAdListener) {
                ((DrawAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof NativeAdListener) {
                ((NativeAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof NativeNotificationAdListener) {
                ((NativeNotificationAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof NativeFloatAdListener) {
                ((NativeFloatAdListener) aVar2).onAdShown();
            } else if (aVar2 instanceof NativeUnifiedAdListener) {
                ((NativeUnifiedAdListener) aVar2).onAdShown();
            }
        }
        o();
        j();
    }

    protected boolean c(com.beizi.fusion.work.a aVar) {
        return "C2S".equalsIgnoreCase(aVar.h());
    }

    public void b(String str, View view) {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null && view != null && (aVar instanceof NativeAdListener)) {
            ((NativeAdListener) aVar).onAdClosed(view);
        }
        N();
    }

    protected boolean b(com.beizi.fusion.work.a aVar) {
        return "S2S".equalsIgnoreCase(aVar.h());
    }

    @Override // com.beizi.fusion.d.a
    public void a(String str) {
        af.c("BeiZis", "enter handleAdRequestStatusError error is " + str);
        a(10131);
    }

    public void a(String str, final String str2, final EventItem eventItem) {
        if (Arrays.asList(com.beizi.fusion.g.q.f7006a).contains(str)) {
            y.a(str2, eventItem);
            com.beizi.fusion.g.h.b().c().execute(new Runnable() { // from class: com.beizi.fusion.d.e.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.beizi.fusion.a.b.a(e.this.f6694b).a(str2, eventItem);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }
    }

    public void a(AdSpacesBean adSpacesBean) {
        if (this.G.f6576b.a() == 3 && this.G.f6577c.a() == 0) {
            this.G.f6577c.a(1);
            this.f6702j.clear();
            AdSpacesBean.FilterBean filter = adSpacesBean.getFilter();
            this.I = adSpacesBean.getBuyer();
            com.beizi.fusion.f.b.a(this.f6694b, this.f6698f, filter, this.G, i(), null, null, this);
            if (this.G.f6577c.a() == 2) {
                if (this.G.c()) {
                    this.G.f6577c.a(-1);
                    return;
                }
                a("200.000", this.f6705m, new EventItem("200.000", String.valueOf(System.currentTimeMillis()), null, null));
                this.O = adSpacesBean;
                af.c("BeiZis", "normal request");
                a(this.O.getComponent(), false);
                return;
            }
            a(this.G.f6577c.a(), 6, "platform error = ");
            StringBuilder sb = new StringBuilder();
            sb.append("AdDispenses AdFilter fail:");
            sb.append(com.beizi.fusion.b.a.a(this.G.f6577c));
            a(10130);
            return;
        }
        this.G.f6577c.a(-2);
        a("kPlatformFilterStatusInternalError");
    }

    protected void a(AdSpacesBean.ComponentBean componentBean, boolean z4) {
        af.a("BeiZis", "enter auctionAndRequestAd");
        if (this.f6712u == null) {
            return;
        }
        List<AdSpacesBean.BuyerBean> list = this.I;
        if (list != null && list.size() != 0) {
            if (s() >= 1) {
                af.a("BeiZis", "auctionAndRequestAd ad aleady callback");
                return;
            }
            if (!z4) {
                this.G.f6578d.a(1);
            }
            List<AdSpacesBean.ForwardBean> a5 = a(componentBean, this.I, z4);
            if (!z4) {
                this.G.f6578d.a(2);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (a5 != null && a5.size() > 0) {
                for (AdSpacesBean.ForwardBean forwardBean : a5) {
                    AdSpacesBean.BuyerBean a6 = a(forwardBean.getBuyerId(), this.I, forwardBean.getBuyerSpaceUuId());
                    if (a6 != null) {
                        if ("S2S".equalsIgnoreCase(a6.getBidType())) {
                            arrayList.add(forwardBean);
                        } else {
                            arrayList2.add(forwardBean);
                        }
                    }
                }
            }
            Map<String, com.beizi.fusion.work.a> a7 = a(arrayList2);
            b(arrayList);
            a(a7);
            return;
        }
        af.a("BeiZis", "auctionAndRequestAd mBuyerBeanList == null ");
    }

    private List<AdSpacesBean.ForwardBean> a(AdSpacesBean.ComponentBean componentBean, List<AdSpacesBean.BuyerBean> list, boolean z4) {
        List<AdSpacesBean.ForwardBean> a5;
        AdSpacesBean adSpacesBean;
        ArrayList arrayList = new ArrayList();
        if (!z4 && (adSpacesBean = this.f6712u) != null && adSpacesBean.getBid() != null && this.f6712u.getBidComponent() != null && this.f6712u.getBidComponent().getBidList() != null && this.f6712u.getBidComponent().getBidList().size() > 0) {
            arrayList.addAll(this.f6712u.getBidComponent().getBidList());
        }
        if (this.f6712u != null && componentBean != null && (a5 = com.beizi.fusion.f.b.a(componentBean, list, i())) != null && a5.size() > 0) {
            arrayList.addAll(a5);
        }
        return arrayList;
    }

    protected Map<String, com.beizi.fusion.work.a> a(List<AdSpacesBean.ForwardBean> list) {
        com.beizi.fusion.work.a a5;
        if (list == null || list.size() == 0) {
            return null;
        }
        af.a("BeiZis", "generateWorkers forwardBeans.size() = " + list.size());
        Hashtable hashtable = new Hashtable();
        for (int i4 = 0; i4 < list.size(); i4++) {
            AdSpacesBean.ForwardBean forwardBean = list.get(i4);
            if (forwardBean != null) {
                String buyerId = forwardBean.getBuyerId();
                String buyerSpaceUuId = forwardBean.getBuyerSpaceUuId();
                AdSpacesBean.BuyerBean a6 = a(buyerId, this.I, forwardBean.getBuyerSpaceUuId());
                if (a6 != null) {
                    this.P.a(a6, forwardBean);
                    this.G.f6579e.a(buyerSpaceUuId, 1);
                    if (a(forwardBean, a6, buyerSpaceUuId) && (a5 = a(forwardBean, buyerId, a6, a6.getRenderView(), null)) != null) {
                        a5.a(forwardBean.getSleepTime());
                        a5.a(forwardBean);
                        a5.a(a6);
                        a5.a(a6.getBidType());
                        a(buyerId, buyerSpaceUuId, a5);
                        hashtable.put(h(buyerId) + buyerSpaceUuId, a5);
                        af.a("BeiZis", "generateWorkers put new " + buyerId + " worker into workerList");
                    }
                }
            }
        }
        return hashtable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(AdSpacesBean.ForwardBean forwardBean, AdSpacesBean.BuyerBean buyerBean, String str) {
        this.G.f6579e.a(str, 2);
        if (buyerBean != null) {
            try {
                long longValue = ((Long) at.b(this.f6694b, "complain_config_" + buyerBean.getSpaceId(), 0L)).longValue();
                AdSpacesBean.ComplainBean complain = buyerBean.getComplain();
                if (complain != null) {
                    if (System.currentTimeMillis() - longValue < complain.getDuration()) {
                        this.G.f6579e.a(str, 10);
                        return false;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        com.beizi.fusion.f.b.a(this.f6694b, this.f6698f, buyerBean.getFilter(), this.G, i(), buyerBean.getBuyerSpaceUuId(), buyerBean.getSpaceId(), this);
        if (this.G.f6579e.a(str) == 3) {
            if (this.G.c()) {
                this.G.f6579e.a(str, -1);
                return false;
            } else if (a(forwardBean, buyerBean) != 2) {
                return false;
            } else {
                this.G.f6579e.a(str, 3);
                return true;
            }
        }
        a(this.G.f6579e.a(str), 7, "channel error = ");
        StringBuilder sb = new StringBuilder();
        sb.append("AdDispense buyerBean AdFilter fail:");
        sb.append(com.beizi.fusion.b.a.a(str, this.G.f6579e));
        return false;
    }

    private void a(Map<String, com.beizi.fusion.work.a> map) {
        if (map != null && map.size() != 0) {
            for (com.beizi.fusion.work.a aVar : map.values()) {
                aVar.d();
                aVar.a(true);
            }
            return;
        }
        g();
    }

    public h a(com.beizi.fusion.work.a aVar) {
        AdSpacesBean.BuyerBean k4 = aVar.k();
        if (k4 == null) {
            return null;
        }
        String id = k4.getId();
        String buyerSpaceUuId = k4.getBuyerSpaceUuId();
        String zone = k4.getZone();
        af.a("BeiZis", "enter comparePrices compareWorker:" + aVar.g() + ",mCurrentHighestWorker:" + this.f6701i);
        if (i(aVar.g())) {
            return a(buyerSpaceUuId, aVar, id);
        }
        com.beizi.fusion.b.d dVar = this.G;
        if (dVar != null) {
            dVar.f6582h.a(buyerSpaceUuId, 1);
        }
        if (this.f6715x >= 1) {
            b(aVar, 1);
            return l(buyerSpaceUuId);
        } else if (I()) {
            return a(buyerSpaceUuId, aVar);
        } else {
            boolean g4 = g(zone);
            boolean d5 = d(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append("channel == mTimeStage = ");
            sb.append(this.f6716y == this.A);
            sb.append(";isNeedComparePrices = ");
            sb.append(g4);
            sb.append(",isHighestPrice:");
            sb.append(d5);
            sb.append(";mCurrentHighestWorker:");
            sb.append(this.f6701i);
            af.a("BeiZis", sb.toString());
            if (this.f6716y == this.f6717z && g4 && !d5) {
                double e5 = e(aVar);
                double e6 = e(this.f6701i);
                if (this.f6701i != null && e5 <= e6) {
                    b(aVar, 1);
                    if (d(this.f6701i)) {
                        b(1);
                    }
                    return l(buyerSpaceUuId);
                }
                return a(buyerSpaceUuId, aVar);
            }
            return a(buyerSpaceUuId, aVar, id);
        }
    }

    private void a(com.beizi.fusion.work.a aVar, int i4) {
        if (aVar == null) {
            return;
        }
        for (com.beizi.fusion.work.a aVar2 : q().values()) {
            AdSpacesBean.BuyerBean k4 = aVar2.k();
            AdSpacesBean.BuyerBean k5 = aVar.k();
            if (k4 != null && k5 != null && (TextUtils.isEmpty(k4.getBuyerSpaceUuId()) || TextUtils.isEmpty(k5.getBuyerSpaceUuId()) || !k4.getBuyerSpaceUuId().equals(k5.getBuyerSpaceUuId()))) {
                b(aVar2, i4);
                if (aVar2.aE() == h.TO_DETERMINE) {
                    f(k4.getBuyerSpaceUuId());
                } else if (aVar2.i() == com.beizi.fusion.f.a.ADDEFAULT) {
                    e(k4.getBuyerSpaceUuId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, com.beizi.fusion.work.a aVar) {
        Map<String, com.beizi.fusion.work.a> map = this.f6702j;
        map.put(h(str) + "_" + str2, aVar);
    }

    @Nullable
    protected AdSpacesBean.BuyerBean a(String str, List<AdSpacesBean.BuyerBean> list, String str2) {
        return com.beizi.fusion.f.b.a(str, list, str2);
    }

    protected void a(int i4, int i5, String str) {
        if (i4 != i5 || y.c(this.f6705m) == null) {
            return;
        }
        String freqItem = y.c(this.f6705m).toString();
        y.d(str + freqItem);
    }

    private int a(AdSpacesBean.ForwardBean forwardBean, AdSpacesBean.BuyerBean buyerBean) {
        if (forwardBean == null || buyerBean == null) {
            return 0;
        }
        String buyerSpaceUuId = buyerBean.getBuyerSpaceUuId();
        if (this.G.f6579e.a(buyerSpaceUuId) == 3) {
            this.G.f6580f.a(buyerSpaceUuId, 1);
            if (this.G.f6580f.a(buyerSpaceUuId) == 1) {
                if (this.f6698f <= (forwardBean.getSleepTime() + System.currentTimeMillis()) - this.H) {
                    this.G.f6580f.a(buyerSpaceUuId, 4);
                    return 4;
                } else if (this.G.f6584j.a() == 2) {
                    this.G.f6580f.a(buyerSpaceUuId, 6);
                    return 6;
                } else {
                    af.a("BeiZis", "mUsableTime = " + this.f6698f + " forwardBean.getSleepTime() + System.currentTimeMillis() - mEnterRequestMethodTime = " + ((forwardBean.getSleepTime() + System.currentTimeMillis()) - this.H) + ",forwardBean.getSleepTime() = " + forwardBean.getSleepTime());
                    if (this.G.c()) {
                        this.G.f6580f.a(buyerSpaceUuId, -1);
                        return -1;
                    }
                    this.G.f6580f.a(buyerSpaceUuId, 2);
                    return 2;
                }
            }
        }
        this.G.f6580f.a(buyerSpaceUuId, -2);
        return -2;
    }

    public void a(AdSpacesBean.ComponentBean componentBean, String str, boolean z4, int i4) {
        if (componentBean != null && (TextUtils.isEmpty(str) || (!"C2S".equalsIgnoreCase(str) && !"S2S".equalsIgnoreCase(str)))) {
            a(componentBean, true);
            return;
        }
        com.beizi.fusion.work.a aVar = this.f6701i;
        if (aVar != null && d(aVar)) {
            b(1);
        } else {
            a(i4);
        }
    }

    public synchronized void a(c cVar) {
        if (cVar != null) {
            this.f6703k.remove(cVar);
        }
    }

    public void a(String str, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("AdLoaded:");
        sb.append(str);
        if (this.f6704l) {
            return;
        }
        a(this.f6701i, 1);
        this.f6704l = true;
        this.f6715x = 1;
        b();
        c();
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof AdListener) {
                ((AdListener) aVar).onAdLoaded();
            } else if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoAdLoaded();
            } else if (aVar instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar).onAdLoaded();
            } else if (aVar instanceof BannerAdListener) {
                ((BannerAdListener) aVar).onAdLoaded();
            } else if (aVar instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar).onAdLoaded();
            } else if (aVar instanceof NativeAdListener) {
                if (view != null) {
                    com.beizi.fusion.work.a aVar2 = this.f6701i;
                    if (aVar2 != null && aVar2.aA() == 1) {
                        ((NativeAdListener) this.f6700h).onAdLoaded(null);
                    } else {
                        com.beizi.fusion.work.a aVar3 = this.f6701i;
                        if (aVar3 != null && aVar3.o() != null) {
                            ((NativeAdListener) this.f6700h).onAdLoaded(this.f6701i.o());
                        } else {
                            g();
                        }
                    }
                } else {
                    g();
                }
            } else if (aVar instanceof DrawAdListener) {
                if (view != null) {
                    ((DrawAdListener) aVar).onAdLoaded(view);
                } else {
                    g();
                }
            } else if (aVar instanceof NativeUnifiedAdListener) {
                ((NativeUnifiedAdListener) aVar).onAdLoaded(this.f6701i.aD());
            }
        }
        L();
        f6693r = true;
    }

    public void a(String str, int i4) {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof AdListener) {
                ((AdListener) aVar).onAdFailedToLoad(i4);
            } else if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoAdFailedToLoad(i4);
            } else if (aVar instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeAdListener) {
                ((NativeAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof BannerAdListener) {
                ((BannerAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof DrawAdListener) {
                ((DrawAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeNotificationAdListener) {
                ((NativeNotificationAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeFloatAdListener) {
                ((NativeFloatAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeUnifiedAdListener) {
                ((NativeUnifiedAdListener) aVar).onAdFailed(i4);
            }
        }
        c();
        this.f6715x = 3;
        p();
        f6693r = true;
    }

    public void a(int i4) {
        if (i4 != 10140) {
            if (this.f6715x >= 1) {
                return;
            }
            if (i4 != 9999 && (I() || J())) {
                return;
            }
        }
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar != null) {
            if (aVar instanceof AdListener) {
                ((AdListener) aVar).onAdFailedToLoad(i4);
            } else if (aVar instanceof RewardedVideoAdListener) {
                ((RewardedVideoAdListener) aVar).onRewardedVideoAdFailedToLoad(i4);
            } else if (aVar instanceof FullScreenVideoAdListener) {
                ((FullScreenVideoAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeAdListener) {
                ((NativeAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof BannerAdListener) {
                ((BannerAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof DrawAdListener) {
                ((DrawAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof InterstitialAdListener) {
                ((InterstitialAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeNotificationAdListener) {
                ((NativeNotificationAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeFloatAdListener) {
                ((NativeFloatAdListener) aVar).onAdFailed(i4);
            } else if (aVar instanceof NativeUnifiedAdListener) {
                ((NativeUnifiedAdListener) aVar).onAdFailed(i4);
            }
        }
        c();
        this.f6715x = 3;
        p();
        f6693r = true;
    }

    public void a(long j4) {
        com.beizi.fusion.a aVar = this.f6700h;
        if (aVar == null || !(aVar instanceof AdListener)) {
            return;
        }
        ((AdListener) aVar).onAdTick(j4);
    }

    @NonNull
    private h a(String str, com.beizi.fusion.work.a aVar) {
        af.a("BeiZis", "comparePrices handleCompeteToDetermine worker:" + aVar.g());
        this.f6701i = aVar;
        this.G.f6582h.a(str, 2);
        c();
        return h.TO_DETERMINE;
    }

    @NonNull
    private h a(String str, com.beizi.fusion.work.a aVar, String str2) {
        if (!this.F) {
            a(aVar, str2);
            b();
            c();
            return k(str);
        }
        b(aVar, 1);
        return l(str);
    }

    private void a(com.beizi.fusion.work.a aVar, String str) {
        this.F = true;
        af.a("BeiZis", "---handleCompeteSuccess---" + str + "---" + e(aVar));
        this.f6701i = aVar;
        a(aVar, 1);
    }

    public void a(com.beizi.fusion.a aVar) {
        this.f6700h = aVar;
    }

    public void a(boolean z4) {
        this.f6710s = z4;
    }
}
