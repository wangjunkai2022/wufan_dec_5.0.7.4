package com.beizi.fusion.work.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.AdView;
import com.baidu.mobads.sdk.api.AdViewListener;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.f;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: BaiduBannerAdWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7398n;

    /* renamed from: o  reason: collision with root package name */
    private String f7399o;

    /* renamed from: p  reason: collision with root package name */
    private long f7400p;

    /* renamed from: q  reason: collision with root package name */
    private long f7401q;

    /* renamed from: r  reason: collision with root package name */
    private float f7402r;

    /* renamed from: s  reason: collision with root package name */
    private float f7403s;

    /* renamed from: t  reason: collision with root package name */
    private ViewGroup f7404t;

    /* renamed from: u  reason: collision with root package name */
    private AdView f7405u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7406v;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar, float f5, float f6, ViewGroup viewGroup) {
        this.f7398n = context;
        this.f7399o = str;
        this.f7400p = j4;
        this.f7401q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7402r = f5;
        this.f7403s = f6;
        this.f7404t = viewGroup;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        ViewGroup viewGroup;
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" BannerAdWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7405u != null && (viewGroup = this.f7404t) != null) {
                if (viewGroup.getChildCount() > 0) {
                    this.f7404t.removeAllViews();
                }
                this.f7406v = true;
                this.f7404t.addView((View) this.f7405u, aH());
                this.f7372d.a(g(), (View) null);
                return;
            }
            this.f7372d.a(10140);
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private ViewGroup.LayoutParams aH() {
        if (this.f7402r <= 0.0f) {
            this.f7402r = av.j(this.f7398n);
        }
        if (this.f7403s <= 0.0f) {
            this.f7403s = Math.round(this.f7402r / 6.4f);
        }
        this.f7403s = (this.f7402r * 3.0f) / 20.0f;
        return new RelativeLayout.LayoutParams(av.a(this.f7398n, this.f7402r), av.a(this.f7398n, this.f7403s));
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
    }

    public String b() {
        return "1018";
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BAIDU";
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
                if (!av.a("com.baidu.mobads.sdk.api.BDAdConfig")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.a.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                this.f7370b.v(String.valueOf(AdSettings.getSDKVersion()));
                au();
                f.a(this.f7398n, this.f7376h);
                v();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7401q);
        long j4 = this.f7401q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        ViewGroup viewGroup;
        if (this.f7405u != null && (viewGroup = this.f7404t) != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7404t.removeAllViews();
            }
            this.f7406v = true;
            this.f7404t.addView((View) this.f7405u, aH());
            return;
        }
        aw();
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
        this.f7406v = false;
        AdView adView = new AdView(this.f7398n, this.f7377i);
        this.f7405u = adView;
        adView.setListener(new AdViewListener() { // from class: com.beizi.fusion.work.a.a.2

            /* renamed from: a  reason: collision with root package name */
            boolean f7408a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7409b = false;

            public void onAdClick(JSONObject jSONObject) {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                }
                if (this.f7409b) {
                    return;
                }
                this.f7409b = true;
                a.this.E();
                a.this.ai();
            }

            public void onAdClose(JSONObject jSONObject) {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.c(a.this.b());
                }
                a.this.G();
            }

            public void onAdFailed(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBaiduBanner Callback --> onAdFailed: ");
                sb.append(str);
                a.this.a(str, 3793);
                if (a.this.f7406v) {
                    return;
                }
                a.this.m();
            }

            public void onAdReady(AdView adView2) {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                a.this.y();
                if (a.this.Y()) {
                    a.this.aG();
                } else {
                    a.this.O();
                }
            }

            public void onAdShow(JSONObject jSONObject) {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                }
                if (this.f7408a) {
                    return;
                }
                this.f7408a = true;
                a.this.C();
                a.this.D();
                a.this.ah();
            }

            public void onAdSwitch() {
            }
        });
        ViewGroup viewGroup = this.f7404t;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7404t.removeAllViews();
            }
            this.f7404t.addView((View) this.f7405u, aH());
        }
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        AdView adView = this.f7405u;
        if (adView != null) {
            adView.destroy();
        }
    }
}
