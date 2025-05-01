package com.beizi.fusion.work.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.beizi.fusion.R;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.i;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.List;
/* compiled from: GdtUnifiedCustomWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.h.a {
    private boolean W;
    private FrameLayout X;
    private NativeAdContainer Y;
    private NativeUnifiedAD Z;
    private NativeUnifiedADData aa;

    /* compiled from: GdtUnifiedCustomWorker.java */
    /* loaded from: classes2.dex */
    private class a implements NativeADUnifiedListener {
        private a() {
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            d.this.y();
            if (list == null || list.size() == 0) {
                d.this.c(-991);
                return;
            }
            d.this.aa = list.get(0);
            if (d.this.aa != null) {
                if (d.this.aa.getECPM() > 0) {
                    d dVar = d.this;
                    dVar.a(dVar.aa.getECPM());
                }
                if (v.f7025a) {
                    d.this.aa.setDownloadConfirmListener(v.f7026b);
                }
                d.this.b();
                d.this.aX();
                d.this.aM();
                return;
            }
            d.this.c(-991);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowGdtUnifiedCustomAd onNoAD: ");
            sb.append(adError.getErrorMsg());
            d.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }
    }

    public d(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        super(context, j4, buyerBean, forwardBean, eVar, i4);
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.aa == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.aa.getECPMLevel());
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

    @Override // com.beizi.fusion.work.h.a
    public int aG() {
        return R.layout.gdt_layout_unified_view;
    }

    @Override // com.beizi.fusion.work.h.a
    public void aH() {
        super.aH();
        this.Y = (NativeAdContainer) ((com.beizi.fusion.work.h.a) this).f7635o.findViewById(R.id.native_ad_container);
        this.X = (FrameLayout) ((com.beizi.fusion.work.h.a) this).f7635o.findViewById(R.id.fl_logo);
    }

    @Override // com.beizi.fusion.work.h.a
    public void aI() {
        if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.h.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        k.a(this.N, this.f7376h);
        this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
        au();
        v();
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(((com.beizi.fusion.work.h.a) this).H);
        long j4 = ((com.beizi.fusion.work.h.a) this).H;
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

    @Override // com.beizi.fusion.work.h.a
    public void aJ() {
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.Z = new NativeUnifiedAD(this.N, this.f7377i, new a(), aC());
        } else {
            this.Z = new NativeUnifiedAD(this.N, this.f7377i, new a());
        }
        this.Z.loadData(1);
    }

    @Override // com.beizi.fusion.work.h.a
    public void aO() {
        aY();
    }

    @Override // com.beizi.fusion.work.h.a
    public void aR() {
        if (this.aa.getAdPatternType() != 2) {
            i.a(this.N).a(this.aa.getImgUrl(), new i.a() { // from class: com.beizi.fusion.work.h.d.4
                @Override // com.beizi.fusion.g.i.a
                public void a() {
                }

                @Override // com.beizi.fusion.g.i.a
                public void a(Bitmap bitmap) {
                    ((com.beizi.fusion.work.h.a) d.this).f7645y.setImageBitmap(bitmap);
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.h.a
    public String aS() {
        return this.aa.getTitle();
    }

    @Override // com.beizi.fusion.work.h.a
    public String aT() {
        return this.aa.getDesc();
    }

    @Override // com.beizi.fusion.work.h.a
    public String aU() {
        return this.aa.getIconUrl();
    }

    @Override // com.beizi.fusion.work.h.a
    public String aV() {
        return this.aa.getButtonText();
    }

    @Override // com.beizi.fusion.work.h.a
    public void aX() {
        if (this.Z == null) {
            c(-991);
        } else {
            aN();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        NativeUnifiedADData nativeUnifiedADData = this.aa;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.W) {
            return;
        }
        this.W = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.aa.getECPM());
        NativeUnifiedADData nativeUnifiedADData2 = this.aa;
        k.a(nativeUnifiedADData2, nativeUnifiedADData2.getECPM());
    }

    @Override // com.beizi.fusion.work.h.a, com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    @Override // com.beizi.fusion.work.h.a, com.beizi.fusion.work.a
    public void m() {
        NativeUnifiedADData nativeUnifiedADData = this.aa;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        NativeUnifiedADData nativeUnifiedADData = this.aa;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.W) {
            return;
        }
        this.W = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.aa, i4 != 1 ? 10001 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        final NativeADMediaListener nativeADMediaListener = new NativeADMediaListener() { // from class: com.beizi.fusion.work.h.d.2
            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoClicked() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoCompleted() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoError(AdError adError) {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowGdtUnifiedCustomAd MediaView onVideoError: ");
                sb.append(adError.getErrorMsg());
                d.this.a(adError.getErrorMsg(), adError.getErrorCode());
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
        this.aa.setNativeAdEventListener(new NativeADEventListener() { // from class: com.beizi.fusion.work.h.d.3
            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADClicked() {
                d.this.aK();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADError(AdError adError) {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowGdtUnifiedCustomAd onADError: ");
                sb.append(adError.getErrorMsg());
                d.this.a(adError.getErrorMsg(), adError.getErrorCode());
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADExposed() {
                d.this.aL();
                if (d.this.aa.getAdPatternType() == 2) {
                    VideoOption.Builder builder = new VideoOption.Builder();
                    builder.setAutoPlayPolicy(1);
                    builder.setEnableDetailPage(false);
                    builder.setEnableUserControl(true);
                    d.this.aa.bindMediaView((MediaView) ((com.beizi.fusion.work.h.a) d.this).f7640t, builder.build(), nativeADMediaListener);
                }
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADStatusChanged() {
            }
        });
    }

    @Override // com.beizi.fusion.work.h.a
    public void a(final List<View> list) {
        this.X.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.work.h.d.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.work.h.d.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.beizi.fusion.work.h.a) d.this).f7637q != null) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(av.a(d.this.N, 46.0f), av.a(d.this.N, 14.0f));
                            int[] iArr = new int[2];
                            d.this.X.getLocationInWindow(iArr);
                            int[] iArr2 = new int[2];
                            ((com.beizi.fusion.work.h.a) d.this).f7637q.getLocationInWindow(iArr2);
                            layoutParams.leftMargin = iArr[0];
                            layoutParams.topMargin = (iArr[1] - iArr2[1]) + ((com.beizi.fusion.work.h.a) d.this).f7637q.getTop();
                            NativeUnifiedADData nativeUnifiedADData = d.this.aa;
                            d dVar = d.this;
                            nativeUnifiedADData.bindAdToView(dVar.N, dVar.Y, layoutParams, list);
                        }
                    }
                }, ((com.beizi.fusion.work.a) d.this).f7379k != 2 ? 500L : 0L);
            }
        });
    }

    @Override // com.beizi.fusion.work.h.a
    public void b(boolean z4) {
        aY();
    }
}
