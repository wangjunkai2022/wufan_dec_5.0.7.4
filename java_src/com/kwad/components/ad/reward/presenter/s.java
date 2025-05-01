package com.kwad.components.ad.reward.presenter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.kwad.components.ad.l.b;
import com.kwad.components.ad.reward.presenter.RewardPreEndCardPresenter;
import com.kwad.components.core.i.a;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class s extends b implements com.kwad.components.ad.reward.e.g, a.InterfaceC0462a, w.b {
    @Nullable
    private com.kwad.components.ad.reward.d oQ;
    private ImageView sd;
    private View te;
    private KsLogoView tf;
    private DetailVideoView tg;
    private int th;
    private View ti;
    private FrameLayout tj;
    private Animator tk;
    private Animator tl;
    private Animator tm;
    private AdTemplate tn;
    private List<com.kwad.components.core.i.c> to;
    private boolean tw;
    @RewardPreEndCardPresenter.PreEndPageStatus
    private int td = 1;
    private long tp = 500;
    private long tq = 50;
    private float tr = 1.2254902f;
    private float ts = 0.80472106f;
    private float tt = 0.0f;
    private boolean tu = false;
    private long showTime = -1;

    /* renamed from: tv  reason: collision with root package name */
    private long f55895tv = -1;
    private com.kwad.components.core.video.l gO = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.s.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j4, long j5) {
            s.this.g(j5);
        }
    };
    private com.kwad.sdk.core.webview.d.a.a cR = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.s.5
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            if (aVar != null && !com.kwad.sdk.core.response.b.e.c(s.this.mAdTemplate, aVar.creativeId, aVar.adStyle)) {
                com.kwad.components.core.i.c a5 = com.kwad.components.ad.reward.g.a(s.this.to, aVar.creativeId);
                if (a5 != null) {
                    s.this.qp.a(a5);
                    return;
                }
                return;
            }
            s.this.qp.oJ.bJ();
        }
    };

    private boolean I(boolean z4) {
        int b5 = b(hI());
        N(b5);
        com.kwad.components.ad.reward.d dVar = this.oQ;
        boolean ar = dVar != null ? dVar.ar() : false;
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "webLoadSuccess: " + ar);
        if (ar) {
            int a5 = a(hI());
            float f5 = -b5;
            this.tt = f5;
            Animator a6 = a(true, f5, a5, true, z4);
            this.tk = a6;
            a6.start();
            Animator hH = hH();
            this.tm = hH;
            hH.start();
            this.td = 2;
            return true;
        }
        return false;
    }

    private void J(boolean z4) {
        Animator a5 = a(false, (hI() - hJ()) + this.tt, a(hJ()), false, z4);
        this.tl = a5;
        a5.start();
        com.kwad.sdk.core.d.a.Ep();
        com.kwad.sdk.core.d.a.bW(this.tn);
        this.td = 3;
        com.kwad.components.ad.reward.d dVar = this.oQ;
        if (dVar != null) {
            dVar.fm();
        }
    }

    private void N(int i4) {
        ViewGroup.LayoutParams layoutParams = this.te.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = i4;
            layoutParams2.bottomMargin = -i4;
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i4);
        layoutParams3.height = i4;
        layoutParams3.bottomMargin = -i4;
        this.te.setLayoutParams(layoutParams3);
    }

    private void f(List<AdTemplate> list) {
        com.kwad.components.ad.reward.d dVar = new com.kwad.components.ad.reward.d(list, this.qp.mReportExtData, this);
        this.oQ = dVar;
        this.qp.oQ = dVar;
        dVar.setShowLandingPage(com.kwad.sdk.core.response.b.b.cv(this.mAdTemplate));
        this.oQ.a(this.cR);
        com.kwad.components.ad.reward.d dVar2 = this.oQ;
        FrameLayout frameLayout = this.tj;
        com.kwad.components.ad.reward.g gVar = this.qp;
        dVar2.a(frameLayout, gVar.mRootContainer, this.mAdTemplate, gVar.mApkDownloadHelper, gVar.mScreenOrientation);
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "startPreloadWebView");
        this.oQ.a(new b.InterfaceC0420b() { // from class: com.kwad.components.ad.reward.presenter.s.2
            @Override // com.kwad.components.ad.l.b.InterfaceC0420b
            public final void hK() {
                com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "onPreloadSuccess");
                s.this.qp.pq = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(long j4) {
        AdTemplate adTemplate = this.tn;
        if (adTemplate == null || this.tw) {
            return;
        }
        if (this.showTime <= 0) {
            this.showTime = com.kwad.sdk.core.response.b.b.cs(adTemplate);
            this.f55895tv = com.kwad.sdk.core.response.b.b.cr(this.tn) + this.showTime;
        }
        long j5 = this.showTime;
        if (j5 > 0 && !this.tu && j4 > j5) {
            this.tw = !I(true);
            com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "showError: " + this.tw);
            if (this.tw) {
                return;
            }
            this.tu = true;
        }
        boolean z4 = this.td == 3;
        long j6 = this.f55895tv;
        if (j6 <= 0 || z4 || j4 <= j6) {
            return;
        }
        J(true);
    }

    private Animator hH() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ti, "alpha", 255.0f, 0.0f);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f));
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    private float hI() {
        return com.kwad.sdk.c.a.a.d(getActivity()) / this.tr;
    }

    private float hJ() {
        return com.kwad.sdk.c.a.a.d(getActivity()) / this.ts;
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void aj() {
        super.aj();
        this.qp.oK.a(this.gO);
        this.qp.b((com.kwad.components.ad.reward.e.g) this);
        this.qp.a(this);
        this.th = com.kwad.sdk.c.a.a.F(this.tg);
        com.kwad.sdk.c.a.a.n(this.tg, 49);
        this.tf.aE(this.mAdTemplate);
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final void bL() {
        int i4;
        if (this.tn == null || (i4 = this.td) == 3) {
            return;
        }
        if (i4 == 1) {
            I(false);
            J(false);
        } else if (i4 == 2) {
            J(true);
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void e(@Nullable List<com.kwad.components.core.i.c> list) {
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "onInnerAdLoad: " + list);
        if (list == null || list.size() == 0) {
            return;
        }
        this.tn = list.get(0).getAdTemplate();
        this.to = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mAdTemplate);
        arrayList.addAll(com.kwad.components.core.i.c.m(list));
        f(arrayList);
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final int getPriority() {
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.te = findViewById(R.id.ksad_middle_end_card);
        this.tg = (DetailVideoView) findViewById(R.id.ksad_video_player);
        this.tf = (KsLogoView) findViewById(R.id.ksad_splash_logo_container);
        this.sd = (ImageView) findViewById(R.id.ksad_blur_video_cover);
        this.ti = findViewById(R.id.ksad_play_web_card_webView);
        this.tj = (FrameLayout) findViewById(R.id.ksad_middle_end_card_webview_container);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void onError(int i4, String str) {
        com.kwad.sdk.core.e.c.w("RewardPreEndCardPresenter", "onError : msg " + str);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void onRequestResult(int i4) {
        com.kwad.sdk.core.e.c.w("RewardPreEndCardPresenter", "onRequestResult : adNumber " + i4);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.reward.g gVar = this.qp;
        gVar.pq = false;
        gVar.oK.b(this.gO);
        this.qp.c(this);
        this.qp.b((a.InterfaceC0462a) this);
        com.kwad.components.ad.reward.d dVar = this.oQ;
        if (dVar != null) {
            dVar.mw();
        }
        Animator animator = this.tm;
        if (animator != null) {
            animator.cancel();
        }
        DetailVideoView detailVideoView = this.tg;
        if (detailVideoView != null) {
            com.kwad.sdk.c.a.a.n(detailVideoView, this.th);
        }
        Animator animator2 = this.tk;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.tm = null;
        this.tk = null;
    }

    private int b(float f5) {
        return (int) (f5 + getContext().getResources().getDimensionPixelSize(R.dimen.ksad_reward_middle_end_card_logo_view_height) + getContext().getResources().getDimensionPixelSize(R.dimen.ksad_reward_middle_end_card_logo_view_margin_bottom));
    }

    private Animator a(boolean z4, float f5, int i4, boolean z5, boolean z6) {
        ValueAnimator ofFloat;
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "getUpAnimator: translationY0: " + f5 + ", videoTargetHeight: " + i4);
        if (z4) {
            ofFloat = ObjectAnimator.ofFloat(this.te, "translationY", f5);
        } else {
            int height = this.te.getHeight();
            final ViewGroup.LayoutParams layoutParams = this.te.getLayoutParams();
            ofFloat = ValueAnimator.ofFloat(height, Math.abs(f5));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.s.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    s.this.te.setLayoutParams(layoutParams);
                }
            });
        }
        ObjectAnimator ofFloat2 = z5 ? ObjectAnimator.ofFloat(this.tf, "alpha", 0.0f, 255.0f) : null;
        final ViewGroup.LayoutParams layoutParams2 = this.sd.getLayoutParams();
        ValueAnimator a5 = this.tg.a(this.mAdTemplate, i4, new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.s.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.height = intValue;
                    s.this.sd.setLayoutParams(layoutParams2);
                }
            }
        });
        long j4 = z6 ? this.tp : this.tq;
        Interpolator create = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j4);
        animatorSet.setInterpolator(create);
        if (ofFloat2 != null) {
            if (z6) {
                animatorSet.playTogether(ofFloat, ofFloat2, a5);
            } else {
                animatorSet.playTogether(ofFloat, ofFloat2);
            }
        } else if (z6) {
            animatorSet.playTogether(ofFloat, a5);
        } else {
            animatorSet.playTogether(ofFloat);
        }
        return animatorSet;
    }

    @Override // com.kwad.components.core.webview.jshandler.w.b
    public final void N(AdTemplate adTemplate) {
        com.kwad.components.core.i.c cVar = new com.kwad.components.core.i.c(adTemplate, com.kwad.components.core.i.e.AGGREGATION);
        com.kwad.components.ad.reward.g gVar = this.qp;
        if (gVar != null) {
            gVar.b(cVar);
        }
    }

    private int a(float f5) {
        return (int) (com.kwad.sdk.c.a.a.e(getActivity()) - f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(com.kwad.components.ad.reward.e.g gVar) {
        return getPriority() - gVar.getPriority();
    }
}
