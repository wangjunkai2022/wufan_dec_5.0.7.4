package com.beizi.fusion.work.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
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
import java.util.ArrayList;
import java.util.List;
/* compiled from: GdtNativeUnifiedWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.f.a {

    /* renamed from: v  reason: collision with root package name */
    private NativeUnifiedAD f7561v;

    /* renamed from: w  reason: collision with root package name */
    private NativeUnifiedADData f7562w;

    /* renamed from: x  reason: collision with root package name */
    private NativeADMediaListener f7563x;

    /* renamed from: y  reason: collision with root package name */
    private MediaView f7564y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f7565z;

    /* compiled from: GdtNativeUnifiedWorker.java */
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
            d.this.f7562w = list.get(0);
            if (d.this.f7562w != null) {
                if (d.this.f7562w.getECPM() > 0) {
                    d dVar = d.this;
                    dVar.a(dVar.f7562w.getECPM());
                }
                if (v.f7025a) {
                    d.this.f7562w.setDownloadConfirmListener(v.f7026b);
                }
                d.this.aU();
                d.this.aT();
                return;
            }
            d.this.c(-991);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowGdtNativeUnifiedAd onNoAD: ");
            sb.append(adError.getErrorMsg());
            d.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }
    }

    public d(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        super(context, j4, buyerBean, forwardBean, eVar, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        this.f7563x = new NativeADMediaListener() { // from class: com.beizi.fusion.work.f.d.2
            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoClicked() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoCompleted() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoError(AdError adError) {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowGdtNativeUnifiedAd MediaView onVideoError: ");
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
        this.f7562w.setNativeAdEventListener(new NativeADEventListener() { // from class: com.beizi.fusion.work.f.d.3
            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADClicked() {
                d.this.b();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADError(AdError adError) {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowGdtNativeUnifiedAd onADError: ");
                sb.append(adError.getErrorMsg());
                d.this.a(adError.getErrorMsg(), adError.getErrorCode());
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADExposed() {
                d.this.ab();
                VideoOption.Builder builder = new VideoOption.Builder();
                builder.setAutoPlayPolicy(1);
                VideoOption build = builder.build();
                if (d.this.aP()) {
                    d.this.f7562w.bindMediaView(d.this.f7564y, build, d.this.f7563x);
                }
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADStatusChanged() {
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7562w == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7562w.getECPMLevel());
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

    @Override // com.beizi.fusion.work.f.a
    public void aG() {
        if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.f.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        k.a(((com.beizi.fusion.work.f.a) this).f7530n, this.f7376h);
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
        sb.append(((com.beizi.fusion.work.f.a) this).f7531o);
        long j4 = ((com.beizi.fusion.work.f.a) this).f7531o;
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

    @Override // com.beizi.fusion.work.f.a
    public void aH() {
        ((com.beizi.fusion.work.f.a) this).f7535s = new NativeAdContainer(((com.beizi.fusion.work.f.a) this).f7530n);
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7561v = new NativeUnifiedAD(((com.beizi.fusion.work.f.a) this).f7530n, this.f7377i, new a(), aC());
        } else {
            this.f7561v = new NativeUnifiedAD(((com.beizi.fusion.work.f.a) this).f7530n, this.f7377i, new a());
        }
        this.f7561v.loadData(1);
    }

    @Override // com.beizi.fusion.work.f.a
    public String aI() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || TextUtils.isEmpty(nativeUnifiedADData.getTitle())) {
            return null;
        }
        return this.f7562w.getTitle();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aJ() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || TextUtils.isEmpty(nativeUnifiedADData.getDesc())) {
            return null;
        }
        return this.f7562w.getDesc();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aK() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || TextUtils.isEmpty(nativeUnifiedADData.getIconUrl())) {
            return null;
        }
        return this.f7562w.getIconUrl();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aL() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData != null) {
            String imgUrl = nativeUnifiedADData.getImgUrl();
            if (TextUtils.isEmpty(imgUrl)) {
                List<String> imgList = this.f7562w.getImgList();
                return !TextUtils.isEmpty(imgList.get(0)) ? imgList.get(0) : imgUrl;
            }
            return imgUrl;
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public List<String> aM() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData != null) {
            if ((nativeUnifiedADData.getImgList() != null) & (this.f7562w.getImgList().size() > 0)) {
                ArrayList arrayList = new ArrayList();
                List<String> imgList = this.f7562w.getImgList();
                for (int i4 = 0; i4 < imgList.size(); i4++) {
                    String str = imgList.get(i4);
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public int aN() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData != null) {
            int adPatternType = nativeUnifiedADData.getAdPatternType();
            if (adPatternType != 1) {
                if (adPatternType == 2) {
                    return 2;
                }
                if (adPatternType == 3 || adPatternType == 4) {
                }
            }
            return 1;
        }
        return 0;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aO() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || TextUtils.isEmpty(nativeUnifiedADData.getButtonText())) {
            return null;
        }
        return this.f7562w.getButtonText();
    }

    @Override // com.beizi.fusion.work.f.a
    public boolean aP() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        return nativeUnifiedADData != null && nativeUnifiedADData.getAdPatternType() == 2;
    }

    @Override // com.beizi.fusion.work.f.a
    public ViewGroup aQ() {
        return ((com.beizi.fusion.work.f.a) this).f7535s;
    }

    @Override // com.beizi.fusion.work.f.a
    public View aR() {
        if (aP()) {
            MediaView mediaView = new MediaView(((com.beizi.fusion.work.f.a) this).f7530n);
            this.f7564y = mediaView;
            mediaView.setBackgroundColor(SupportMenu.CATEGORY_MASK);
            return this.f7564y;
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7565z) {
            return;
        }
        this.f7565z = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7562w.getECPM());
        NativeUnifiedADData nativeUnifiedADData2 = this.f7562w;
        k.a(nativeUnifiedADData2, nativeUnifiedADData2.getECPM());
    }

    @Override // com.beizi.fusion.work.f.a, com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
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
    public void m() {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void n() {
        if (this.f7562w == null || !aP()) {
            return;
        }
        this.f7562w.resumeVideo();
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        NativeUnifiedADData nativeUnifiedADData = this.f7562w;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7565z) {
            return;
        }
        this.f7565z = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7562w, i4 != 1 ? 10001 : 1);
    }

    @Override // com.beizi.fusion.work.f.a
    public void a(List<View> list) {
        this.f7562w.bindAdToView(((com.beizi.fusion.work.f.a) this).f7530n, (NativeAdContainer) ((com.beizi.fusion.work.f.a) this).f7535s, null, list);
    }
}
