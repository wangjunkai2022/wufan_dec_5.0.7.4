package com.beizi.fusion.work.splash;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.d.m;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.jd.ad.sdk.bl.initsdk.JADYunSdk;
import com.jd.ad.sdk.dl.model.JADSlot;
import com.jd.ad.sdk.splash.JADSplash;
import com.jd.ad.sdk.splash.JADSplashListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: JadYunSplashWorker.java */
/* loaded from: classes2.dex */
public class j extends com.beizi.fusion.work.a {
    private int A;
    private int B;

    /* renamed from: n  reason: collision with root package name */
    private Context f8129n;

    /* renamed from: o  reason: collision with root package name */
    private String f8130o;

    /* renamed from: p  reason: collision with root package name */
    private long f8131p;

    /* renamed from: q  reason: collision with root package name */
    private View f8132q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8133r;

    /* renamed from: s  reason: collision with root package name */
    private View f8134s;

    /* renamed from: t  reason: collision with root package name */
    private JADSplash f8135t;

    /* renamed from: u  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8136u;

    /* renamed from: v  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8137v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8138w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private boolean f8139x;

    /* renamed from: y  reason: collision with root package name */
    private float f8140y;

    /* renamed from: z  reason: collision with root package name */
    private float f8141z;

    public j(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, int i4, int i5, com.beizi.fusion.d.e eVar) {
        this.f8129n = context;
        this.f8130o = str;
        this.f8131p = j4;
        this.f8132q = view;
        this.f8133r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8136u = list;
        this.A = i4;
        this.B = i5;
        r();
    }

    private void aG() {
        ViewGroup viewGroup;
        if (this.f8135t != null && (viewGroup = this.f8133r) != null && this.f8134s != null) {
            viewGroup.removeAllViews();
            this.f8133r.addView(this.f8134s);
            return;
        }
        aw();
    }

    private void aH() {
        for (int i4 = 0; i4 < this.f8136u.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8136u.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f8138w.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8137v.add(renderViewBean);
            }
        }
        if (this.f8137v.size() > 0) {
            Collections.sort(this.f8137v, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.j.3
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean2, AdSpacesBean.RenderViewBean renderViewBean3) {
                    return renderViewBean3.getLevel() - renderViewBean2.getLevel();
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f8135t == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "JADYUN";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.jd.ad.sdk.bl.initsdk.JADYunSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.j.1
                        @Override // java.lang.Runnable
                        public void run() {
                            j.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                m.a(this.f8129n, this.f7376h);
                this.f7370b.y(JADYunSdk.getSDKVersion());
                au();
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8136u;
        boolean z4 = list != null && list.size() > 0;
        this.f8139x = z4;
        if (z4) {
            aH();
        }
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
        } else {
            com.beizi.fusion.d.e eVar = this.f7372d;
            if (eVar != null && eVar.s() < 1 && this.f7372d.r() != 2) {
                l();
            }
        }
        this.f8140y = av.l(this.f8129n);
        this.f8141z = av.m(this.f8129n);
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        aG();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        JADSplash jADSplash = this.f8135t;
        if (jADSplash == null || jADSplash.getJADExtra() == null || this.f8135t.getJADExtra().getPrice() <= 0) {
            return null;
        }
        return this.f8135t.getJADExtra().getPrice() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (this.A == 0) {
            this.A = (int) av.j(this.f8129n);
        }
        if (this.B == 0) {
            this.B = (int) av.k(this.f8129n);
        }
        JADSplash jADSplash = new JADSplash(this.f8129n, new JADSlot.Builder().setSlotID(this.f7377i).setSize(this.A, this.B).setTolerateTime(Math.round(((float) this.f8131p) / 1000.0f)).setSkipTime(5).setSplashClickAreaType(0).build());
        this.f8135t = jADSplash;
        jADSplash.loadAd(new JADSplashListener() { // from class: com.beizi.fusion.work.splash.j.2

            /* renamed from: a  reason: collision with root package name */
            boolean f8143a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f8144b = false;

            public void onClick() {
                if (((com.beizi.fusion.work.a) j.this).f7372d != null && ((com.beizi.fusion.work.a) j.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) j.this).f7372d.d(j.this.g());
                    ((com.beizi.fusion.work.a) j.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) j.this).f7380l + 5000) - System.currentTimeMillis());
                }
                if (this.f8144b) {
                    return;
                }
                this.f8144b = true;
                j.this.E();
                j.this.ai();
            }

            public void onClose() {
                if (((com.beizi.fusion.work.a) j.this).f7372d != null && ((com.beizi.fusion.work.a) j.this).f7372d.r() != 2) {
                    j.this.ac();
                }
                j.this.G();
            }

            public void onExposure() {
                ((com.beizi.fusion.work.a) j.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (this.f8143a) {
                    return;
                }
                this.f8143a = true;
                j.this.az();
                j.this.ab();
                j.this.C();
                j.this.D();
                j.this.ah();
            }

            public void onLoadFailure(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showJadYunSplash onLoadFailure code:");
                sb.append(i4);
                sb.append(";message:");
                sb.append(str);
                j.this.a(str, i4);
                j.this.m();
            }

            public void onLoadSuccess() {
                if (j.this.f8135t != null && j.this.f8135t.getJADExtra() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showJadYunSplash getECPMLevel:");
                    sb.append(j.this.f8135t.getJADExtra().getPrice());
                    j jVar = j.this;
                    jVar.a(jVar.f8135t.getJADExtra().getPrice());
                }
                ((com.beizi.fusion.work.a) j.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                j.this.y();
            }

            public void onRenderFailure(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showJadYunSplash onRenderFailure code:");
                sb.append(i4);
                sb.append(";message:");
                sb.append(str);
                j.this.a(str, i4);
                j.this.m();
            }

            public void onRenderSuccess(View view) {
                j.this.f8134s = view;
                if (j.this.Y()) {
                    j.this.b();
                } else {
                    j.this.O();
                }
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        JADSplash jADSplash = this.f8135t;
        if (jADSplash != null) {
            jADSplash.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" splashWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            ad();
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void a(Message message) {
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.i(String.valueOf(message.obj));
            au();
            B();
        }
    }
}
