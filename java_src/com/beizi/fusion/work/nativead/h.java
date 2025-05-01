package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.List;
import java.util.Map;
/* compiled from: GdtNativeCustomWorker.java */
/* loaded from: classes2.dex */
public class h extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7900n;

    /* renamed from: o  reason: collision with root package name */
    private String f7901o;

    /* renamed from: p  reason: collision with root package name */
    private long f7902p;

    /* renamed from: q  reason: collision with root package name */
    private long f7903q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7904r;

    /* renamed from: s  reason: collision with root package name */
    private NativeUnifiedAD f7905s;

    /* renamed from: t  reason: collision with root package name */
    private NativeUnifiedADData f7906t;

    /* renamed from: u  reason: collision with root package name */
    private float f7907u;

    /* renamed from: v  reason: collision with root package name */
    private float f7908v;

    /* renamed from: w  reason: collision with root package name */
    private ViewGroup f7909w;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtNativeCustomWorker.java */
    /* loaded from: classes2.dex */
    public class a implements NativeADUnifiedListener {
        private a() {
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            ((com.beizi.fusion.work.a) h.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            h.this.y();
            if (list == null || list.size() == 0) {
                h.this.c(-991);
                return;
            }
            h.this.f7906t = list.get(0);
            if (h.this.f7906t == null) {
                h.this.c(-991);
                return;
            }
            if (h.this.f7906t.getECPM() > 0) {
                h hVar = h.this;
                hVar.a(hVar.f7906t.getECPM());
            }
            if (v.f7025a) {
                h.this.f7906t.setDownloadConfirmListener(v.f7026b);
            }
            NativeADEventListener nativeADEventListener = new NativeADEventListener() { // from class: com.beizi.fusion.work.nativead.h.a.1

                /* renamed from: a  reason: collision with root package name */
                boolean f7912a = false;

                /* renamed from: b  reason: collision with root package name */
                boolean f7913b = false;

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADClicked() {
                    if (((com.beizi.fusion.work.a) h.this).f7372d != null && ((com.beizi.fusion.work.a) h.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) h.this).f7372d.d(h.this.g());
                    }
                    if (this.f7913b) {
                        return;
                    }
                    this.f7913b = true;
                    h.this.E();
                    h.this.ai();
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADError(AdError adError) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ShowGdtNativeCustom onADError: ");
                    sb.append(adError.getErrorMsg());
                    h.this.a(adError.getErrorMsg(), adError.getErrorCode());
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADExposed() {
                    ((com.beizi.fusion.work.a) h.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) h.this).f7372d != null && ((com.beizi.fusion.work.a) h.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) h.this).f7372d.b(h.this.g());
                    }
                    if (this.f7912a) {
                        return;
                    }
                    this.f7912a = true;
                    h.this.az();
                    h.this.C();
                    h.this.D();
                    h.this.ah();
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADStatusChanged() {
                }
            };
            NativeADMediaListener nativeADMediaListener = new NativeADMediaListener() { // from class: com.beizi.fusion.work.nativead.h.a.2

                /* renamed from: a  reason: collision with root package name */
                boolean f7915a = false;

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoClicked() {
                    if (((com.beizi.fusion.work.a) h.this).f7372d != null && ((com.beizi.fusion.work.a) h.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) h.this).f7372d.d(h.this.g());
                    }
                    if (this.f7915a) {
                        return;
                    }
                    this.f7915a = true;
                    h.this.E();
                    h.this.ai();
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoCompleted() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoError(AdError adError) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ShowGdtNativeCustom MediaView onVideoError: ");
                    sb.append(adError.getErrorMsg());
                    h.this.a(adError.getErrorMsg(), adError.getErrorCode());
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoInit() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoaded(int i4) {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoading() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoPause() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoReady() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoResume() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoStart() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoStop() {
                }
            };
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.nativead.h.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (((com.beizi.fusion.work.a) h.this).f7372d != null && ((com.beizi.fusion.work.a) h.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) h.this).f7372d.b(h.this.g(), h.this.f7909w);
                    }
                    h.this.G();
                }
            };
            GdtNativeCustomLayout gdtNativeCustomLayout = new GdtNativeCustomLayout(h.this.f7900n);
            gdtNativeCustomLayout.onBindData(h.this.f7906t, h.this.f7907u, h.this.f7908v, nativeADEventListener, nativeADMediaListener, onClickListener);
            h.this.f7909w = gdtNativeCustomLayout;
            h.this.aG();
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowGdtNativeCustom onNoAD: ");
            sb.append(adError.getErrorMsg());
            h.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }
    }

    public h(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7900n = context;
        this.f7901o = str;
        this.f7902p = j4;
        this.f7903q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7907u = f5;
        this.f7908v = f6;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        if (Y()) {
            b();
        } else {
            O();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        NativeUnifiedADData nativeUnifiedADData = this.f7906t;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7904r) {
            return;
        }
        this.f7904r = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7906t.getECPM());
        NativeUnifiedADData nativeUnifiedADData2 = this.f7906t;
        k.a(nativeUnifiedADData2, nativeUnifiedADData2.getECPM());
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7906t == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7906t.getECPMLevel());
        if (a5 == -1 || a5 == -2) {
            if (a5 == -2) {
                L();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdt realPrice = ");
        sb.append(a5);
        a(a5);
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.h.1
                        @Override // java.lang.Runnable
                        public void run() {
                            h.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7900n, this.f7376h);
                this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
                au();
                v();
            }
        }
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7903q);
        long j4 = this.f7903q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
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
    public String j() {
        NativeUnifiedADData nativeUnifiedADData = this.f7906t;
        if (nativeUnifiedADData != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), nativeUnifiedADData.getECPMLevel());
            if (a5 == -1 || a5 == -2) {
                return null;
            }
            return a5 + "";
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (this.f7907u <= 0.0f) {
            this.f7907u = av.j(this.f7900n);
        }
        if (this.f7908v <= 0.0f) {
            this.f7908v = 0.0f;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7905s = new NativeUnifiedAD(this.f7900n, this.f7377i, new a(), aC());
        } else {
            this.f7905s = new NativeUnifiedAD(this.f7900n, this.f7377i, new a());
        }
        this.f7905s.loadData(1);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        NativeUnifiedADData nativeUnifiedADData = this.f7906t;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void n() {
        NativeUnifiedADData nativeUnifiedADData = this.f7906t;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.resume();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7909w;
    }

    private void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeAdWorker:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            if (this.f7909w != null) {
                this.f7372d.a(g(), this.f7909w);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        NativeUnifiedADData nativeUnifiedADData = this.f7906t;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7904r) {
            return;
        }
        this.f7904r = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7906t, i4 != 1 ? 10001 : 1);
    }
}
