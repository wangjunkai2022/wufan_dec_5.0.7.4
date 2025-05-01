package com.beizi.fusion.work.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CsjNativeUnifiedWorker.java */
/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: v  reason: collision with root package name */
    private TTAdNative f7555v;

    /* renamed from: w  reason: collision with root package name */
    private TTFeedAd f7556w;

    public c(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        super(context, j4, buyerBean, forwardBean, eVar, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        if (aP()) {
            this.f7556w.setVideoAdListener(new TTFeedAd.VideoAdListener() { // from class: com.beizi.fusion.work.f.c.3
                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onProgressUpdate(long j4, long j5) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoAdComplete(TTFeedAd tTFeedAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoAdPaused(TTFeedAd tTFeedAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoError(int i4, int i5) {
                    c.this.a("sdk custom error ".concat("onVideoError"), 99991);
                }

                @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
                public void onVideoLoad(TTFeedAd tTFeedAd) {
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.f.a
    public void aG() {
        if (!av.a("com.bytedance.sdk.openadsdk.TTAdNative")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.f.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        u.a(this, ((a) this).f7530n, this.f7376h, this.f7373e.getDirectDownload());
        this.f7370b.t(TTAdSdk.getAdManager().getSDKVersion());
        au();
    }

    @Override // com.beizi.fusion.work.f.a
    public void aH() {
        if (av()) {
            return;
        }
        ((a) this).f7535s = new FrameLayout(((a) this).f7530n);
        this.f7555v = u.a().createAdNative(((a) this).f7530n);
        this.f7555v.loadFeedAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setAdCount(1).setImageAcceptedSize(640, 320).build(), new TTAdNative.FeedAdListener() { // from class: com.beizi.fusion.work.f.c.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjNativeUnifiedAd Callback --> onError:");
                sb.append(str);
                c.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
            public void onFeedAdLoad(List<TTFeedAd> list) {
                ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                c.this.y();
                if (list == null || list.size() == 0) {
                    c.this.c(-991);
                    return;
                }
                c.this.f7556w = list.get(0);
                if (c.this.f7556w != null) {
                    c.this.aU();
                    c.this.aT();
                    return;
                }
                c.this.c(-991);
            }
        });
    }

    @Override // com.beizi.fusion.work.f.a
    public String aI() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd == null || TextUtils.isEmpty(tTFeedAd.getTitle())) {
            return null;
        }
        return this.f7556w.getTitle();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aJ() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd == null || TextUtils.isEmpty(tTFeedAd.getDescription())) {
            return null;
        }
        return this.f7556w.getDescription();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aK() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd == null || tTFeedAd.getIcon() == null || TextUtils.isEmpty(this.f7556w.getIcon().getImageUrl())) {
            return null;
        }
        return this.f7556w.getIcon().getImageUrl();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aL() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd != null) {
            if ((tTFeedAd.getImageList() != null) & (this.f7556w.getImageList().size() > 0)) {
                List<TTImage> imageList = this.f7556w.getImageList();
                String imageUrl = imageList.get(0).getImageUrl();
                if (!TextUtils.isEmpty(imageUrl) && imageList.get(0).isValid()) {
                    return imageUrl;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public List<String> aM() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd != null) {
            if ((tTFeedAd.getImageList() != null) & (this.f7556w.getImageList().size() > 0)) {
                ArrayList arrayList = new ArrayList();
                List<TTImage> imageList = this.f7556w.getImageList();
                for (int i4 = 0; i4 < imageList.size(); i4++) {
                    String imageUrl = imageList.get(i4).getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl) && imageList.get(i4).isValid()) {
                        arrayList.add(imageUrl);
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
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd != null) {
            int imageMode = tTFeedAd.getImageMode();
            if (imageMode == 2 || imageMode == 3 || imageMode == 4) {
                return 1;
            }
            if (imageMode == 5 || imageMode == 15 || imageMode == 166) {
                return 2;
            }
        }
        return 0;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aO() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd == null || TextUtils.isEmpty(tTFeedAd.getButtonText())) {
            return null;
        }
        return this.f7556w.getButtonText();
    }

    @Override // com.beizi.fusion.work.f.a
    public boolean aP() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd != null) {
            return tTFeedAd.getImageMode() == 5 || this.f7556w.getImageMode() == 15 || this.f7556w.getImageMode() == 166;
        }
        return false;
    }

    @Override // com.beizi.fusion.work.f.a
    public ViewGroup aQ() {
        return ((a) this).f7535s;
    }

    @Override // com.beizi.fusion.work.f.a
    public View aR() {
        if (aP()) {
            return this.f7556w.getAdView();
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public void aS() {
        FrameLayout frameLayout = new FrameLayout(((a) this).f7530n);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (this.f7556w.getAdLogo() != null) {
            ImageView imageView = new ImageView(((a) this).f7530n);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(this.f7556w.getAdLogo());
            frameLayout.addView(imageView);
        }
        ((a) this).f7535s.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 85));
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        e();
    }

    @Override // com.beizi.fusion.work.a
    public void e() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(((a) this).f7531o);
        long j4 = ((a) this).f7531o;
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

    @Override // com.beizi.fusion.work.f.a, com.beizi.fusion.work.a
    public String g() {
        return "CSJ";
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        TTFeedAd tTFeedAd = this.f7556w;
        if (tTFeedAd != null) {
            tTFeedAd.destroy();
        }
    }

    @Override // com.beizi.fusion.work.f.a
    public void a(List<View> list) {
        aS();
        this.f7556w.registerViewForInteraction(((a) this).f7535s, null, list, null, null, new TTNativeAd.AdInteractionListener() { // from class: com.beizi.fusion.work.f.c.4
            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdClicked(View view, TTNativeAd tTNativeAd) {
                c.this.b();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
                c.this.b();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdShow(TTNativeAd tTNativeAd) {
                c.this.ab();
            }
        });
    }
}
