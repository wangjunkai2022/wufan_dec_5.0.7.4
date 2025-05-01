package com.kwad.components.ad.interstitial.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.a;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.assist.FailReason;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.aj;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.utils.br;
import com.kwad.sdk.widget.KSFrameLayout;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class c extends com.kwad.sdk.mvp.a {
    @NonNull
    public KsAdVideoPlayConfig dU;
    public com.kwad.sdk.core.video.videoview.a eN;
    public com.kwad.components.ad.interstitial.f.b ib;
    public KsInterstitialAd.AdInteractionListener ie;

    /* renamed from: io  reason: collision with root package name */
    public com.kwad.components.ad.interstitial.d f55892io;
    public com.kwad.components.ad.interstitial.g.d jL;
    public boolean jM;
    public boolean jN;
    public boolean jO;
    public a jP;
    public com.kwad.components.core.webview.tachikoma.e.e jR;
    @NonNull
    public KSFrameLayout jS;
    public d jT;
    public boolean jX;
    public boolean jY;
    public AdResultData mAdResultData;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public List<a> jQ = new CopyOnWriteArrayList();
    private Handler fS = new Handler(Looper.getMainLooper());
    public volatile boolean jW = false;
    public int jZ = -1;
    public List<a.c> jV = new CopyOnWriteArrayList();
    public List<InterfaceC0414c> jU = new ArrayList();

    /* renamed from: com.kwad.components.ad.interstitial.e.c$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass3 implements ImageLoadingListener {
        final /* synthetic */ View fo;
        final /* synthetic */ Context gq;

        AnonymousClass3(Context context, View view) {
            this.gq = context;
            this.fo = view;
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
            return false;
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingCancelled(String str, View view) {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingComplete(String str, View view, final DecodedResult decodedResult) {
            com.kwad.sdk.utils.g.execute(new az() { // from class: com.kwad.components.ad.interstitial.e.c.3.1
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    Bitmap bitmap = decodedResult.mBitmap;
                    com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "onLoadingComplete before blur");
                    Bitmap stackBlur = BlurUtils.stackBlur(bitmap, 50, false);
                    com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "onLoadingComplete after blur");
                    float dimension = AnonymousClass3.this.gq.getResources().getDimension(R.dimen.ksad_interstitial_icon_radius);
                    final RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(AnonymousClass3.this.gq.getResources(), stackBlur);
                    create.setCornerRadius(dimension);
                    AnonymousClass3.this.fo.post(new az() { // from class: com.kwad.components.ad.interstitial.e.c.3.1.1
                        @Override // com.kwad.sdk.utils.az
                        public final void doTask() {
                            AnonymousClass3.this.fo.setBackground(create);
                        }
                    });
                }
            });
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingFailed(String str, View view, FailReason failReason) {
        }

        @Override // com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
        public final void onLoadingStarted(String str, View view) {
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void b(long j4, long j5);
    }

    /* loaded from: classes5.dex */
    public static class b {
        private final Context context;
        private int kj;
        private boolean kk;
        private int kl;
        private boolean km;
        private ac.a kn;
        public double ko;
        public boolean kp;

        public b(Context context) {
            this.context = context;
        }

        public final b A(int i4) {
            this.kl = i4;
            return this;
        }

        public final b a(ac.a aVar) {
            this.kn = aVar;
            return this;
        }

        public final int cV() {
            return this.kj;
        }

        public final boolean cW() {
            return this.kk;
        }

        public final boolean cX() {
            return this.km;
        }

        public final int cY() {
            return this.kl;
        }

        public final double cZ() {
            return this.ko;
        }

        public final Context getContext() {
            return this.context;
        }

        public final ac.a getTouchCoords() {
            return this.kn;
        }

        public final b k(boolean z4) {
            this.kk = z4;
            return this;
        }

        public final b l(boolean z4) {
            this.km = true;
            return this;
        }

        public final b m(boolean z4) {
            this.kp = true;
            return this;
        }

        public final b z(int i4) {
            this.kj = i4;
            return this;
        }

        public final b c(double d5) {
            this.ko = d5;
            return this;
        }
    }

    /* renamed from: com.kwad.components.ad.interstitial.e.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0414c {
        void da();
    }

    /* loaded from: classes5.dex */
    public interface d {
        void db();
    }

    public final boolean J(Context context) {
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate != null && context != null) {
            return com.kwad.sdk.core.response.b.a.bI(com.kwad.sdk.core.response.b.e.dS(adTemplate));
        }
        com.kwad.sdk.core.e.c.w("InterstitialCallerContext", "isPlayable illegal params: " + this.mAdTemplate + ", context: " + context);
        return false;
    }

    public final void b(a.c cVar) {
        this.jV.remove(cVar);
    }

    public final void cR() {
        KsInterstitialAd.AdInteractionListener adInteractionListener;
        if (this.jO || (adInteractionListener = this.ie) == null) {
            return;
        }
        adInteractionListener.onAdClosed();
    }

    public final void cS() {
        d dVar = this.jT;
        if (dVar != null) {
            dVar.db();
        }
    }

    public final void cT() {
        for (InterfaceC0414c interfaceC0414c : this.jU) {
            interfaceC0414c.da();
        }
    }

    public final boolean cU() {
        com.kwad.components.ad.interstitial.g.d dVar = this.jL;
        boolean z4 = dVar == null || dVar.getParent() == null;
        com.kwad.sdk.core.e.c.d("InterstitialCallerContext", "isH5Interstitial :" + z4);
        return z4;
    }

    public final void d(AdResultData adResultData) {
        this.mAdResultData = adResultData;
        this.mAdTemplate = com.kwad.sdk.core.response.b.c.n(adResultData);
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        this.fS.removeCallbacksAndMessages(null);
        this.jV.clear();
        this.jU.clear();
        com.kwad.components.ad.interstitial.f.b bVar = this.ib;
        if (bVar != null) {
            bVar.ub();
        }
    }

    public final void a(a.c cVar) {
        if (this.jV.contains(cVar)) {
            return;
        }
        this.jV.add(cVar);
    }

    public final void b(b bVar) {
        com.kwad.sdk.core.adlog.c.b bVar2 = new com.kwad.sdk.core.adlog.c.b();
        bVar2.f(bVar.getTouchCoords());
        if (!bVar.cW() && !bVar.km) {
            bVar.A(153);
        }
        com.kwad.sdk.core.adlog.c.a(this.mAdTemplate, new com.kwad.sdk.core.adlog.c.b().cK(bVar.cY()).f(bVar.getTouchCoords()).cY(aj.ML() ? 2 : 1).l(bVar.cZ()), (JSONObject) null);
        com.kwad.sdk.core.video.videoview.a aVar = this.eN;
        if (aVar != null) {
            long a5 = a(aVar);
            int b5 = b(this.eN);
            bVar2.ao(a5);
            bVar2.cS(b5);
        }
        this.jM = true;
        if (this.jO) {
            return;
        }
        b(1L, bVar.kl);
    }

    public final void a(final b bVar) {
        com.kwad.components.ad.interstitial.report.a.dN().a(this.mAdTemplate, 1L, bVar.kl);
        boolean z4 = bVar.cV() == 1;
        if (com.kwad.components.ad.interstitial.b.b.cH() || z4 || bVar.cX() || bVar.kp) {
            com.kwad.components.core.e.d.a.a(new a.C0457a(bVar.getContext()).ar(this.mAdTemplate).b(this.mApkDownloadHelper).ao(z4).al(1).am(bVar.kl).v(this.eN.getCurrentPosition()).an(bVar.cV()).a(new a.b() { // from class: com.kwad.components.ad.interstitial.e.c.1
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    c.this.b(bVar);
                    c cVar = c.this;
                    if (cVar.f55892io == null || !com.kwad.components.ad.interstitial.d.b.k(cVar.mAdTemplate)) {
                        return;
                    }
                    c cVar2 = c.this;
                    cVar2.a(false, -1, cVar2.eN);
                    c.this.fS.postDelayed(new az() { // from class: com.kwad.components.ad.interstitial.e.c.1.1
                        @Override // com.kwad.sdk.utils.az
                        public final void doTask() {
                            c.this.f55892io.dismiss();
                            c.this.cR();
                        }
                    }, 500L);
                }
            }));
        }
    }

    public final void a(final Context context, final int i4, int i5, int i6) {
        com.kwad.components.ad.interstitial.report.a.dN().a(this.mAdTemplate, 6L, i4);
        com.kwad.components.core.e.d.a.a(new a.C0457a(context).ar(this.mAdTemplate).b(this.mApkDownloadHelper).ao(false).an(2).al(6).am(i4).a(new a.b() { // from class: com.kwad.components.ad.interstitial.e.c.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                c cVar = c.this;
                int i7 = r2;
                int i8 = i4;
                cVar.a(i7, i8, context, 6L, i8);
            }
        }));
    }

    public final void b(a aVar) {
        if (aVar == null) {
            return;
        }
        this.jQ.remove(aVar);
    }

    public final void b(long j4, long j5) {
        KsInterstitialAd.AdInteractionListener adInteractionListener;
        for (a aVar : this.jQ) {
            aVar.b(j4, j5);
        }
        a aVar2 = this.jP;
        if (aVar2 != null) {
            aVar2.b(j4, j5);
        }
        if (this.jO || (adInteractionListener = this.ie) == null) {
            return;
        }
        adInteractionListener.onAdClicked();
    }

    public final void b(Context context, AdTemplate adTemplate) {
        if (this.jW) {
            return;
        }
        com.kwad.components.core.page.a.launch(context, adTemplate);
        this.jW = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, int i5, Context context, long j4, long j5) {
        com.kwad.sdk.core.adlog.c.a(this.mAdTemplate, new com.kwad.sdk.core.adlog.c.b().cR(i4).cK(i5).cY(aj.ML() ? 2 : 1).Ca(), (JSONObject) null);
        this.jM = true;
        if (this.jO) {
            return;
        }
        b(j4, j5);
    }

    private static int b(@Nullable com.kwad.sdk.core.video.videoview.a aVar) {
        if (aVar == null) {
            return -1;
        }
        long duration = aVar.getDuration();
        long currentPosition = aVar.getCurrentPosition();
        if (duration != 0) {
            return Math.round((((float) currentPosition) / ((float) duration)) * 100.0f);
        }
        return -1;
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.jQ.add(aVar);
    }

    public static boolean a(Context context, AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.a.aV(adInfo) && !aj.ML();
    }

    public final void a(Context context, AdInfo adInfo, AdTemplate adTemplate, @Nullable View view) {
        if (view == null) {
            return;
        }
        String url = com.kwad.sdk.core.response.b.a.bs(adInfo).getUrl();
        if (bh.isNullString(url)) {
            return;
        }
        KSImageLoader.loadImage(url, adTemplate, KSImageLoader.IMGOPTION_NORMAL, new AnonymousClass3(context, view));
    }

    public final void a(boolean z4, int i4, @Nullable com.kwad.sdk.core.video.videoview.a aVar) {
        long j4;
        int a5;
        com.kwad.components.ad.interstitial.report.a.dN().a(this.mAdTemplate, br.k(this.jS, true));
        if (aVar != null) {
            j4 = a(aVar);
            a5 = b(aVar);
        } else {
            j4 = i4;
            a5 = a(j4, this.mAdTemplate);
        }
        com.kwad.sdk.core.adlog.c.a(this.mAdTemplate, z4 ? 14 : 1, j4, a5, this.f55892io.getTimerHelper().getTime(), null);
    }

    private static long a(@Nullable com.kwad.sdk.core.video.videoview.a aVar) {
        if (aVar == null) {
            return -1L;
        }
        return aVar.getCurrentPosition();
    }

    private static int a(long j4, @NonNull AdTemplate adTemplate) {
        if (j4 == -1) {
            return -1;
        }
        float M = ((float) com.kwad.sdk.core.response.b.a.M(com.kwad.sdk.core.response.b.e.dS(adTemplate))) / 1000.0f;
        if (M != 0.0f) {
            return Math.round((((float) j4) / M) * 100.0f);
        }
        return -1;
    }
}
