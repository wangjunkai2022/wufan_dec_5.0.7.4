package com.beizi.fusion.work;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.beizi.fusion.NativeUnifiedAdResponse;
import com.beizi.fusion.b.b;
import com.beizi.fusion.b.d;
import com.beizi.fusion.d.c;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.EventItem;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: AdWorker.java */
/* loaded from: classes2.dex */
public abstract class a extends Observable implements c {

    /* renamed from: a  reason: collision with root package name */
    protected d f7369a;

    /* renamed from: b  reason: collision with root package name */
    protected b f7370b;

    /* renamed from: c  reason: collision with root package name */
    protected String f7371c;

    /* renamed from: d  reason: collision with root package name */
    protected e f7372d;

    /* renamed from: e  reason: collision with root package name */
    protected AdSpacesBean.BuyerBean f7373e;

    /* renamed from: f  reason: collision with root package name */
    protected AdSpacesBean.ForwardBean f7374f;

    /* renamed from: h  reason: collision with root package name */
    protected String f7376h;

    /* renamed from: i  reason: collision with root package name */
    protected String f7377i;

    /* renamed from: g  reason: collision with root package name */
    protected h f7375g = null;

    /* renamed from: j  reason: collision with root package name */
    protected com.beizi.fusion.f.a f7378j = com.beizi.fusion.f.a.ADDEFAULT;

    /* renamed from: n  reason: collision with root package name */
    private int f7382n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f7383o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f7384p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f7385q = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7386r = false;

    /* renamed from: s  reason: collision with root package name */
    private long f7387s = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7388t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7389u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7390v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7391w = false;

    /* renamed from: x  reason: collision with root package name */
    private TimerTask f7392x = null;

    /* renamed from: y  reason: collision with root package name */
    private Timer f7393y = null;

    /* renamed from: z  reason: collision with root package name */
    private long f7394z = 0;
    private boolean A = false;
    private String B = "WATERFALL";
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private String F = null;

    /* renamed from: k  reason: collision with root package name */
    protected int f7379k = 0;

    /* renamed from: l  reason: collision with root package name */
    protected long f7380l = 0;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: m  reason: collision with root package name */
    protected Handler f7381m = new Handler(Looper.getMainLooper()) { // from class: com.beizi.fusion.work.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 1) {
                e eVar = a.this.f7372d;
                if (eVar == null || eVar.s() >= 1 || a.this.f7372d.r() == 2) {
                    return;
                }
                a.this.l();
            } else if (i4 != 2) {
                if (i4 == 3 && message.obj != null) {
                    a.this.a(message);
                    a.this.aj();
                    if (a.this.c()) {
                        return;
                    }
                    a.this.c(message.arg1);
                }
            } else {
                af.b("BeiZis", "before handleAdClose");
                a.this.G();
                a.this.ac();
            }
        }
    };
    private boolean G = false;
    private boolean H = false;

    private boolean aG() {
        d dVar = this.f7369a;
        return (dVar == null || dVar.c()) ? false : true;
    }

    private void aH() {
        e eVar;
        if (this.f7390v || (eVar = this.f7372d) == null || eVar.r() == 2 || this.f7378j == com.beizi.fusion.f.a.ADFAIL) {
            return;
        }
        if (!aM()) {
            this.f7372d.a((c) this);
            this.f7372d.b(g());
            U();
        } else {
            W();
        }
        this.f7390v = true;
    }

    private void aI() {
        Timer timer;
        StringBuilder sb = new StringBuilder();
        sb.append("mAdLifeManager != null ? ");
        sb.append(this.f7372d != null);
        af.c("BeiZis", sb.toString());
        if (this.f7372d != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enter cancelExposureTaskIfNeed (System.currentTimeMillis() - mStartLoadTime) = ");
            sb2.append(System.currentTimeMillis() - this.f7394z);
            sb2.append(",mAdLifeManager.getValidExposureTime() = ");
            sb2.append(this.f7372d.v());
            sb2.append(",mExposureTimerTask != null ? ");
            sb2.append(this.f7392x != null);
            sb2.append(",mExposureTimer != null ? ");
            sb2.append(this.f7393y != null);
            af.c("BeiZis", sb2.toString());
        }
        if (this.f7372d == null || System.currentTimeMillis() - this.f7394z >= this.f7372d.v() || this.f7392x == null || (timer = this.f7393y) == null) {
            return;
        }
        timer.cancel();
        V();
    }

    private void aJ() {
        this.f7392x = new TimerTask() { // from class: com.beizi.fusion.work.a.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                a.this.ae();
            }
        };
        Timer timer = new Timer();
        this.f7393y = timer;
        e eVar = this.f7372d;
        if (eVar != null) {
            timer.schedule(this.f7392x, eVar.v());
            this.A = true;
        }
    }

    private boolean aK() {
        int v2;
        e eVar = this.f7372d;
        return eVar != null && (v2 = eVar.v()) >= 0 && v2 <= 3000;
    }

    private boolean aL() {
        e eVar = this.f7372d;
        if (eVar != null) {
            Integer[] w4 = eVar.w();
            return w4.length == 2 && w4[0].intValue() >= 0 && w4[1].intValue() > w4[0].intValue() && w4[1].intValue() - w4[0].intValue() <= 30;
        }
        return false;
    }

    private boolean aM() {
        e eVar;
        af.c("BeiZis", "isRandomNoExposureRangeValid = " + aL());
        if (aL() && (eVar = this.f7372d) != null) {
            Integer[] w4 = eVar.w();
            int random = (int) ((Math.random() * 100.0d) + 1.0d);
            af.c("BeiZis", "random = " + random + ",randomNoExposureRange[0] = " + w4[0] + ",randomNoExposureRange[1] = " + w4[1]);
            return random >= w4[0].intValue() && random <= w4[1].intValue();
        }
        return false;
    }

    protected void A() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B() {
        if (aG()) {
            ak();
            if (z()) {
                L();
                a(3);
            }
            af.c("BeiZis", "channel " + this.f7371c + " reportAdLoadFail mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            if (b()) {
                return;
            }
            this.f7369a.f6581g.a(this.f7371c, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdShow mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdExposure mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdClick mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdClickCallBack mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdClose mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdClickClose mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void I() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdClickCallBack mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdRewarded mManagerObserver.mChannelResultStatus.getStatus(channel)  = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 12);
        }
    }

    public void K() {
        if (this.f7369a == null || this.E) {
            return;
        }
        af.c("BeiZis", "channel " + this.f7371c + " reportParticipateBid mManagerObserver.mBidChannelStatus.getStatus(channel)  = " + this.f7369a.f6585k.a(this.f7371c));
        this.E = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportParticipateBid mManagerObserver.mBidChannelStatus.getStatus(channel)  = " + this.f7369a.f6585k.a(this.f7371c));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.f6582h.a(this.f7371c, 3);
            af.a("BeiZis", "channel == ---reportComparisonSuccess---" + g());
        }
    }

    protected void N() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.f6582h.a(this.f7371c, 1);
            this.f7369a.f6582h.a(this.f7371c, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O() {
        N();
    }

    protected void P() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.f6582h.a(this.f7371c, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportChannelClickEnhance GrayPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = " + this.f7369a.f6583i.a(this.f7371c));
            this.f7369a.f6583i.a(this.f7371c, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportChannelClickEnhance RandomPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = " + this.f7369a.f6583i.a(this.f7371c));
            this.f7369a.f6583i.a(this.f7371c, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportChannelClickEnhance LayerPass mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = " + this.f7369a.f6583i.a(this.f7371c));
            this.f7369a.f6583i.a(this.f7371c, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportChannelClickEnhance ReduceArea mManagerObserver.mChannelClickEnhanceStatus.getStatus(channel)  = " + this.f7369a.f6583i.a(this.f7371c));
            this.f7369a.f6583i.a(this.f7371c, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportValidTimeExposure mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 13);
        }
    }

    protected void V() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportNotEnoughExposureTime mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 14);
        }
    }

    protected void W() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportRandomNoExposure mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 15);
        }
    }

    protected boolean X() {
        if (this.f7372d != null) {
            af.c("BeiZis", "adStatus = " + this.f7372d.s());
        }
        e eVar = this.f7372d;
        return eVar != null && eVar.s() < 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        e eVar = this.f7372d;
        return eVar != null && eVar.h() && (ar() || ap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Z() {
        if (this.f7375g == null && this.f7372d != null && aG()) {
            this.f7375g = this.f7372d.a(this);
        }
    }

    public void a(Activity activity) {
    }

    public void a(String str) {
        this.B = str;
    }

    public int aA() {
        return this.f7379k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aB() {
        if (this.f7369a == null || !"C2S".equalsIgnoreCase(h())) {
            return;
        }
        af.c("BeiZis", "channel " + this.f7371c + " reportC2SPrice mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
        this.f7369a.f6581g.a(this.f7371c, 20);
    }

    public String aC() {
        return this.F;
    }

    public NativeUnifiedAdResponse aD() {
        return null;
    }

    public h aE() {
        return this.f7375g;
    }

    public void aF() {
        this.f7380l = System.currentTimeMillis() + 1000;
    }

    protected boolean aa() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ab() {
        at();
        this.f7391w = true;
        af.c("BeiZis", "enter handleAdShow !isStartExposureTask ? " + (true ^ this.A) + ",isReportValidExposureTimeEvent = " + this.H);
        if (!this.A || this.H) {
            aH();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ac() {
        if ((this.f7388t || this.f7372d == null) && !b(g())) {
            return;
        }
        this.f7372d.c(g());
        this.f7388t = true;
        if (this.A) {
            aI();
        }
    }

    public void ad() {
        e eVar;
        StringBuilder sb = new StringBuilder();
        sb.append("enter handleAdLoaded and !isHandleAdLoad ? ");
        sb.append(!this.f7389u);
        sb.append(",mAdLifeManager != null ? ");
        sb.append(this.f7372d != null);
        af.c("BeiZis", sb.toString());
        if (this.f7389u || (eVar = this.f7372d) == null) {
            return;
        }
        eVar.a(g(), (View) null);
        this.f7389u = true;
        af.c("BeiZis", "isExposureTimeValid = " + aK());
        if (aK()) {
            aJ();
            this.f7394z = System.currentTimeMillis();
        }
    }

    protected void ae() {
        this.f7381m.post(new Runnable() { // from class: com.beizi.fusion.work.a.3
            @Override // java.lang.Runnable
            public void run() {
                a.this.af();
            }
        });
    }

    protected void af() {
        if (this.f7391w) {
            aH();
        } else {
            this.H = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag() {
        if (this.f7372d == null || !as()) {
            return;
        }
        e eVar = this.f7372d;
        eVar.a("255.200", eVar.i(), new EventItem("255.200", String.valueOf(System.currentTimeMillis()), g(), this.f7377i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah() {
        if (this.f7372d == null || !as()) {
            return;
        }
        e eVar = this.f7372d;
        eVar.a("280.300", eVar.i(), new EventItem("280.300", String.valueOf(System.currentTimeMillis()), g(), this.f7377i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ai() {
        if (this.f7372d == null || !as()) {
            return;
        }
        e eVar = this.f7372d;
        eVar.a("290.300", eVar.i(), new EventItem("290.300", String.valueOf(System.currentTimeMillis()), g(), this.f7377i));
    }

    protected void aj() {
        if (this.f7372d == null || !as()) {
            return;
        }
        e eVar = this.f7372d;
        eVar.a("280.500", eVar.i(), new EventItem("280.500", String.valueOf(System.currentTimeMillis()), g(), this.f7377i));
    }

    protected void ak() {
        if (am()) {
            b(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void al() {
        if (p() != 3) {
            af.a("BeiZisBid", "mWorker = " + this + ",set ad suc");
            b(2);
        }
    }

    public boolean am() {
        return an();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean an() {
        return "C2S".equalsIgnoreCase(h());
    }

    protected boolean ao() {
        return "S2S".equalsIgnoreCase(h());
    }

    protected boolean ap() {
        return ao() || an();
    }

    public boolean aq() {
        return "BPDI".equalsIgnoreCase(h());
    }

    public boolean ar() {
        return as() || aq();
    }

    protected boolean as() {
        return "WATERFALL".equalsIgnoreCase(h());
    }

    protected void at() {
        double avgPrice = k() != null ? k().getAvgPrice() : 0.0d;
        if (!an() && !aq()) {
            if (as()) {
                af.a("BeiZis", "waterfall worker " + g() + " show ad,price = " + avgPrice);
                return;
            }
            return;
        }
        af.a("BeiZis", "bid worker " + g() + " show ad,price = " + avgPrice);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void au() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.a().a(this.f7371c, this.f7370b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean av() {
        af.c("BeiZis", "enter checkCsjInitStatusInValid");
        boolean z4 = TextUtils.isEmpty(this.f7376h) || TextUtils.isEmpty(this.f7377i) || u.a() == null;
        if (z4) {
            ax();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aw() {
        B();
        e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }

    public void ax() {
        af.c("BeiZis", "enter handleInitError");
        a("sdk custom error ".concat(g()).concat(" ").concat("init error"), 10140);
    }

    public void ay() {
    }

    public void az() {
    }

    public void b(int i4) {
        this.f7384p = i4;
    }

    public boolean c() {
        return this.D;
    }

    public abstract void d();

    public void d(int i4) {
    }

    public void e() {
    }

    public abstract void f();

    public abstract String g();

    public String h() {
        return this.B;
    }

    public abstract com.beizi.fusion.f.a i();

    public String j() {
        return null;
    }

    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    protected abstract void l();

    public void m() {
        Handler handler = this.f7381m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void n() {
    }

    public View o() {
        return null;
    }

    public int p() {
        return this.f7384p;
    }

    public void q() {
        M();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        e eVar = this.f7372d;
        if (eVar != null) {
            this.f7369a = eVar.d();
        }
        AdSpacesBean.BuyerBean buyerBean = this.f7373e;
        if (buyerBean != null) {
            this.f7371c = buyerBean.getBuyerSpaceUuId();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.a().a(this.f7373e, this.f7374f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        d dVar = this.f7369a;
        if (dVar != null) {
            dVar.f6581g.a(this.f7371c, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportInitBegin mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportInitEnd mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        if (this.f7369a != null) {
            af.c("BeiZis", "channel " + this.f7371c + " reportAdRequest mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            this.f7369a.f6581g.a(this.f7371c, 3);
        }
    }

    public boolean x() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y() {
        if (aG()) {
            if (an() && !"MTG".equalsIgnoreCase(g())) {
                aB();
            }
            if (z()) {
                a(2);
                K();
            }
            A();
            af.c("BeiZis", "channel " + this.f7371c + " reportAdLoaded mManagerObserver.mChannelResultStatus.getStatus(channel) = " + this.f7369a.f6581g.a(this.f7371c));
            if (b()) {
                return;
            }
            this.f7369a.f6581g.a(this.f7371c, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z() {
        return am() && !x();
    }

    private boolean b() {
        return am() && x();
    }

    public void a(AdSpacesBean.ForwardBean forwardBean) {
        this.f7374f = forwardBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i4) {
        AdSpacesBean.BuyerBean buyerBean;
        if (this.f7378j == com.beizi.fusion.f.a.ADLOAD && (buyerBean = this.f7373e) != null && !TextUtils.isEmpty(buyerBean.getBuyerSpaceUuId()) && !TextUtils.isEmpty(this.f7372d.z()) && this.f7373e.getBuyerSpaceUuId().equals(this.f7372d.z())) {
            this.f7378j = com.beizi.fusion.f.a.ADFAIL;
            this.f7372d.a(this.f7373e.getBuyerSpaceUuId(), i4);
            return;
        }
        this.f7378j = com.beizi.fusion.f.a.ADFAIL;
        if (this.f7372d == null || this.f7374f == null) {
            return;
        }
        if (X()) {
            this.f7372d.a(this.f7374f.getComponent(), h(), true, i4);
            return;
        }
        af.b("BeiZis", "fail distribute direct fail");
        this.f7372d.a(i4);
    }

    private boolean b(String str) {
        return "FinalLink".equalsIgnoreCase(str);
    }

    public void a(AdSpacesBean.BuyerBean buyerBean) {
        this.f7373e = buyerBean;
    }

    public void a(boolean z4) {
        this.f7386r = z4;
    }

    public void a(long j4) {
        this.f7387s = j4;
    }

    public void a(int i4) {
        this.f7382n = i4;
    }

    @Override // com.beizi.fusion.d.c
    public void a() {
        if (i() != com.beizi.fusion.f.a.ADSHOW) {
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Message message) {
        b bVar;
        if (this.f7369a == null || (bVar = this.f7370b) == null) {
            return;
        }
        bVar.i(String.valueOf(message.obj));
        this.f7370b.m(String.valueOf(message.arg1));
        au();
        B();
        this.f7370b.i(null);
        this.f7370b.m(null);
        au();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, int i4) {
        if (aG()) {
            Message obtainMessage = this.f7381m.obtainMessage(3, str);
            obtainMessage.arg1 = i4;
            this.f7381m.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(double d5) {
        if (d5 > 0.0d) {
            if ("BEIZI".equalsIgnoreCase(g()) || "MTG".equalsIgnoreCase(g())) {
                this.f7373e.setAvgPrice(d5);
                b bVar = this.f7370b;
                if (bVar != null) {
                    bVar.M(String.valueOf(d5));
                }
            }
            if (ap()) {
                this.f7373e.setBidPrice(d5);
                b bVar2 = this.f7370b;
                if (bVar2 != null) {
                    bVar2.N(String.valueOf(d5));
                }
            }
            au();
        }
    }
}
