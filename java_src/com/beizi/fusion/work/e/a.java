package com.beizi.fusion.work.e;

import android.app.Activity;
import android.content.Context;
import com.beizi.fusion.b.b;
import com.beizi.fusion.b.d;
import com.beizi.fusion.d.e;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.xyz.newad.hudong.ADInit;
import com.xyz.newad.hudong.widgets.FakeListener;
import com.xyz.newad.hudong.widgets.faking.FakeAD;
/* compiled from: FinalLinkNativeNotificationWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a {

    /* renamed from: n  reason: collision with root package name */
    private Context f7525n;

    /* renamed from: o  reason: collision with root package name */
    private String f7526o;

    /* renamed from: p  reason: collision with root package name */
    private long f7527p;

    public a(Context context, String str, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7525n = context;
        this.f7526o = str;
        this.f7527p = j4;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "FinalLink";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        String str = (String) at.b(this.f7525n, "__OAID__", "");
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        d dVar = this.f7369a;
        if (dVar != null) {
            b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.xyz.newad.hudong.ADInit")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.e.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                ADInit.getInstance().init(this.f7525n, this.f7376h);
                ADInit.getInstance().setOaid(str);
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(sleepTime);
        if (sleepTime > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, sleepTime);
            return;
        }
        e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (this.f7525n instanceof Activity) {
            FakeAD.get().finish((Activity) this.f7525n);
            Z();
            FakeAD.get().show((Activity) this.f7525n, this.f7377i, new FakeListener() { // from class: com.beizi.fusion.work.e.a.2
                public void onClick() {
                    a.this.E();
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null) {
                        if (((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                        }
                        a.this.ai();
                    }
                }

                public void onClose() {
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        a.this.ac();
                    }
                    a.this.G();
                }

                public void onDismiss() {
                }

                public void onFail() {
                    a.this.a("获取广告失败", 10140);
                }

                public void onShow() {
                    a.this.ad();
                    a.this.y();
                    a.this.M();
                    ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                    }
                    a.this.C();
                    a.this.D();
                    a.this.ah();
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        if (this.f7525n instanceof Activity) {
            FakeAD.get().finish((Activity) this.f7525n);
        }
    }
}
