package com.beizi.fusion.work.a;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.ad.AdListener;
import com.beizi.ad.AdRequest;
import com.beizi.ad.BannerAdView;
import com.beizi.ad.internal.animation.TransitionDirection;
import com.beizi.ad.internal.animation.TransitionType;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.w;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.s;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
import java.util.Map;
/* compiled from: BeiZiBannerAdWorker.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7411n;

    /* renamed from: o  reason: collision with root package name */
    private String f7412o;

    /* renamed from: p  reason: collision with root package name */
    private long f7413p;

    /* renamed from: q  reason: collision with root package name */
    private long f7414q;

    /* renamed from: r  reason: collision with root package name */
    private BannerAdView f7415r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f7416s;

    /* renamed from: t  reason: collision with root package name */
    private float f7417t;

    /* renamed from: u  reason: collision with root package name */
    private float f7418u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7419v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f7420w;

    /* renamed from: x  reason: collision with root package name */
    private AdSpacesBean.RenderViewBean f7421x;

    /* renamed from: y  reason: collision with root package name */
    private List<Pair<String, Integer>> f7422y;

    public b(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar, float f5, float f6, ViewGroup viewGroup) {
        this.f7411n = context;
        this.f7412o = str;
        this.f7413p = j4;
        this.f7414q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7417t = f5;
        this.f7418u = f6;
        this.f7416s = viewGroup;
        r();
    }

    private ViewGroup.LayoutParams aG() {
        if (this.f7417t <= 0.0f) {
            this.f7417t = av.j(this.f7411n);
        }
        if (this.f7418u <= 0.0f) {
            this.f7418u = Math.round(this.f7417t / 6.4f);
        }
        return new ViewGroup.LayoutParams(av.a(this.f7411n, this.f7417t), av.a(this.f7411n, this.f7418u));
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7415r == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BEIZI";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        List<AdSpacesBean.RenderViewBean> renderView = this.f7373e.getRenderView();
        this.f7420w = renderView;
        if (renderView != null && renderView.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f7420w.get(0);
            this.f7421x = renderViewBean;
            this.f7422y = s.a(renderViewBean.getDpLinkUrlList());
        }
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.beizi.ad.BeiZi")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.a.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                w.a(this.f7411n, this.f7376h);
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
        sb.append(this.f7414q);
        long j4 = this.f7414q;
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
        if (this.f7415r != null && (viewGroup = this.f7416s) != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7416s.removeAllViews();
            }
            this.f7419v = true;
            this.f7416s.addView(this.f7415r, aG());
            return;
        }
        aw();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        BannerAdView bannerAdView = this.f7415r;
        if (bannerAdView == null) {
            return null;
        }
        return bannerAdView.getPrice();
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        this.f7419v = false;
        this.f7415r = new BannerAdView(this.f7411n);
        final AdRequest build = new AdRequest.Builder().build();
        this.f7415r.setAdUnitId(this.f7377i);
        this.f7415r.setTransitionType(TransitionType.MOVEIN);
        this.f7415r.setTransitionDerection(TransitionDirection.LEFT);
        this.f7415r.setTransitionDuration(600);
        this.f7415r.setAdListener(new AdListener() { // from class: com.beizi.fusion.work.a.b.2
            @Override // com.beizi.ad.AdListener
            public void onAdClicked() {
                if (b.this.f7415r != null) {
                    b.this.f7415r.setTouchAreaNormal();
                }
                if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.d(b.this.g());
                }
                b.this.E();
                b.this.ai();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdClosed() {
                if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.c(b.this.g());
                }
                b.this.G();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdFailedToLoad(int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBeiZiBannerAd onError:");
                sb.append(i4);
                b.this.a(String.valueOf(i4), i4);
                if (b.this.f7419v) {
                    return;
                }
                b.this.m();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdLoaded() {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                if (b.this.f7415r.getPrice() != null) {
                    try {
                        b bVar = b.this;
                        bVar.a(Double.parseDouble(bVar.f7415r.getPrice()));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b.this.y();
                if (b.this.Y()) {
                    b.this.b();
                } else {
                    b.this.O();
                }
                if (b.this.f7415r == null || b.this.f7421x == null) {
                    return;
                }
                b.this.f7415r.setOrderOptimizeList(b.this.f7422y);
                b.this.f7415r.setAdOptimizePercent(b.this.f7421x.getOptimizePercent());
                b.this.f7415r.post(new Runnable() { // from class: com.beizi.fusion.work.a.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f7415r.optimizeClickArea(b.this.f7421x.getOptimizeSize(), b.this.f7415r, b.this.f7416s, b.this.f7421x.getDirection());
                    }
                });
            }

            @Override // com.beizi.ad.AdListener
            public void onAdRequest() {
                b.this.w();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdShown() {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g());
                }
                b.this.C();
                b.this.D();
                b.this.ah();
            }
        });
        this.f7415r.post(new Runnable() { // from class: com.beizi.fusion.work.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7415r.loadAd(build);
            }
        });
        ViewGroup viewGroup = this.f7416s;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7416s.removeAllViews();
            }
            this.f7416s.addView(this.f7415r, aG());
        }
        this.f7415r.openAdInNativeBrowser(true);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        BannerAdView bannerAdView = this.f7415r;
        if (bannerAdView != null) {
            bannerAdView.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" BannerAdWorker:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7415r != null && this.f7416s != null) {
                this.f7419v = true;
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
}
