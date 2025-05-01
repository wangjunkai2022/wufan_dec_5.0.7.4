package com.kwad.components.ad.interstitial.e;

import androidx.annotation.Nullable;
import com.kwad.components.core.video.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bo;
/* loaded from: classes5.dex */
public final class e extends b implements a.c {
    private static long kD = 1000;
    private c jK;
    @Nullable
    private a kE;
    private int kF;
    private AdTemplate mAdTemplate;

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i4) {
        c cVar = this.jK;
        com.kwad.components.ad.interstitial.g.d dVar = cVar.jL;
        if (dVar == null) {
            return;
        }
        if (i4 == 0) {
            if (cVar.cU()) {
                return;
            }
            this.jK.b(getContext(), this.mAdTemplate);
            du();
            c cVar2 = this.jK;
            cVar2.a(true, -1, cVar2.eN);
            return;
        }
        dVar.b(true, i4);
    }

    private void du() {
        com.kwad.sdk.core.video.videoview.a aVar = this.jK.eN;
        if (aVar != null) {
            aVar.release();
        }
        this.jK.f55892io.dismiss();
        this.jK.cR();
    }

    @Override // com.kwad.components.ad.interstitial.e.b, com.kwad.sdk.mvp.Presenter
    public final void aj() {
        super.aj();
        com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", this + " onBind");
        c cVar = (c) Kf();
        this.jK = cVar;
        AdTemplate adTemplate = cVar.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        long j4 = dS.adInsertScreenInfo.autoCloseTime;
        if (j4 > 0) {
            this.kF = (int) Math.min(com.kwad.components.ad.interstitial.b.b.b(dS), j4);
        } else {
            this.kF = com.kwad.components.ad.interstitial.b.b.b(dS);
        }
        com.kwad.components.ad.interstitial.g.d dVar = this.jK.jL;
        if (dVar != null) {
            dVar.b(true, this.kF);
        }
        if (com.kwad.sdk.core.response.b.a.bb(dS)) {
            this.kE = null;
            this.jK.a(this);
            return;
        }
        a aVar = new a(this, (byte) 0);
        this.kE = aVar;
        bo.a(aVar, null, 1000L);
    }

    @Override // com.kwad.components.core.video.a.c
    public final void bl() {
    }

    @Override // com.kwad.components.core.video.a.c
    public final void bm() {
        if (this.jK.cU()) {
            return;
        }
        this.jK.b(getContext(), this.mAdTemplate);
        du();
    }

    @Override // com.kwad.components.ad.interstitial.e.b
    public final void cP() {
        super.cP();
        a aVar = this.kE;
        if (aVar != null) {
            aVar.r(false);
        }
    }

    @Override // com.kwad.components.ad.interstitial.e.b
    public final void cQ() {
        super.cQ();
        a aVar = this.kE;
        if (aVar != null) {
            aVar.r(true);
        }
    }

    @Override // com.kwad.components.core.video.a.c
    public final void e(long j4) {
        D(this.kF - ((int) (j4 / 1000)));
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", this + " onUnbind");
        this.jK.b(this);
        a aVar = this.kE;
        if (aVar != null) {
            aVar.q(true);
            bo.c(this.kE);
            this.kE = null;
        }
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onVideoPlayStart() {
    }

    /* loaded from: classes5.dex */
    class a implements Runnable {
        private int kG;
        private boolean kH;
        private boolean kI;

        private a() {
            this.kG = Integer.MIN_VALUE;
            this.kH = false;
            this.kI = false;
        }

        public final void q(boolean z4) {
            this.kI = true;
        }

        public final void r(boolean z4) {
            this.kH = z4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.kI) {
                return;
            }
            if (this.kH) {
                bo.a(this, null, e.kD);
                return;
            }
            if (this.kG == Integer.MIN_VALUE) {
                this.kG = e.this.kF;
            }
            if (this.kG < 0) {
                return;
            }
            com.kwad.sdk.core.e.c.d("InterstitialPlayablePresenter", e.this.toString() + ", this: " + toString() + " PlayableTimerRunnable run : " + this.kG);
            e.this.D(this.kG);
            this.kG = this.kG + (-1);
            bo.a(this, null, e.kD);
        }

        /* synthetic */ a(e eVar, byte b5) {
            this();
        }
    }
}
