package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.g;
import com.kwad.components.ad.reward.n.p;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bs;
/* loaded from: classes5.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b implements View.OnClickListener, bs.a {
    private static final String[] vi = {"%ss后获得奖励1", "已获得奖励1/2", "已获得全部奖励"};
    private TextView hf;
    private bs hh;
    private boolean hi;
    private long hj;
    private AdInfo mAdInfo;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private TextView ve;
    private ImageView vf;
    private View vg;
    private boolean vh = false;
    private boolean vj = false;
    private final l gO = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayEnd() {
            super.onLivePlayEnd();
            if (a.this.hi) {
                return;
            }
            a.this.hh.sendEmptyMessageDelayed(1, 500L);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j4, long j5) {
            long a5 = g.a(j4, a.this.mAdInfo);
            a.this.hj = j5;
            a.this.a(a5, j5);
        }
    };
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener = new com.kwad.components.ad.reward.e.l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.2
        @Override // com.kwad.components.ad.reward.e.l
        public final void onRewardVerify() {
            a.a(a.this, true);
            a.this.ve.setText(a.vi[2]);
        }
    };

    private void ca() {
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate);
        this.mAdInfo = dS;
        this.mApkDownloadHelper = this.qp.mApkDownloadHelper;
        long a5 = g.a(com.kwad.sdk.core.response.b.a.M(dS), this.mAdInfo) / 1000;
        if (g.G(this.mAdTemplate)) {
            this.vg.setVisibility(0);
            this.vg.setOnClickListener(this);
            this.ve.setText(String.format(vi[0], Long.valueOf(a5)));
            this.hf.setVisibility(8);
        } else {
            this.vg.setVisibility(8);
            this.hf.setText(String.valueOf(a5));
            this.hf.setVisibility(0);
            this.hf.setAlpha(1.0f);
        }
        com.kwad.components.ad.reward.b.fc().a(this.mRewardVerifyListener);
        this.qp.oK.a(this.gO);
    }

    private void il() {
        if (this.vh) {
            return;
        }
        this.vh = true;
        this.vf.setAlpha(0.0f);
        this.vf.setVisibility(0);
        this.vf.setOnClickListener(this);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a.this.hf.setVisibility(8);
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a.this.hf.setAlpha(1.0f - floatValue);
                a.this.vf.setAlpha(floatValue);
            }
        });
        ofFloat.start();
    }

    private void im() {
        com.kwad.components.ad.reward.e.d dVar = this.qp.mAdRewardStepListener;
        if (dVar != null) {
            dVar.fh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdClick() {
        com.kwad.components.ad.reward.j.b.a(this.mAdTemplate, "native_id", "playTopBar-style1", new com.kwad.sdk.core.adlog.c.b().f(this.qp.mRootContainer.getTouchCoords()).cK(41), this.qp.mReportExtData);
        this.qp.oJ.bJ();
    }

    private void notifyRewardVerify() {
        this.qp.oJ.onRewardVerify();
    }

    private void x(int i4) {
        this.qp.pt = i4;
        if (g.G(this.mAdTemplate)) {
            if (this.vj) {
                return;
            }
            this.ve.setText(String.format(vi[0], Integer.valueOf(i4)));
            return;
        }
        this.hf.setText(String.valueOf(i4));
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void aj() {
        super.aj();
        this.hh = new bs(this);
        ca();
        if (this.qp.oK.jN()) {
            x((int) (((float) com.kwad.sdk.core.response.b.a.af(this.mAdInfo)) / 1000.0f));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vf || view == this.vg) {
            com.kwad.components.core.e.d.a.a(new a.C0457a(view.getContext()).ar(this.mAdTemplate).b(this.mApkDownloadHelper).an(2).v(this.qp.oK.getPlayDuration()).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.5
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    a.this.notifyAdClick();
                }
            }));
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.hf = (TextView) findViewById(R.id.ksad_video_count_down);
        this.vf = (ImageView) findViewById(R.id.ksad_detail_reward_icon);
        this.ve = (TextView) findViewById(R.id.ksad_reward_deep_task_count_down);
        this.vg = findViewById(R.id.ksad_detail_reward_deep_task_view);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.reward.b.fc().b(this.mRewardVerifyListener);
        this.qp.oK.b(this.gO);
        this.vf.setVisibility(8);
        this.vg.setVisibility(8);
        this.vh = false;
        this.vj = false;
        this.hi = false;
    }

    static /* synthetic */ boolean a(a aVar, boolean z4) {
        aVar.vj = true;
        return true;
    }

    public final void a(long j4, long j5) {
        int aJ;
        if (com.kwad.sdk.core.response.b.a.aN(this.mAdInfo) && com.kwad.components.core.q.a.rj().rk() == 0) {
            aJ = com.kwad.sdk.core.response.b.a.aL(this.mAdInfo);
        } else {
            aJ = com.kwad.sdk.core.response.b.a.aJ(this.mAdInfo);
        }
        g gVar = this.qp;
        long j6 = aJ * (gVar.pc ? 1000 : 0);
        com.kwad.components.ad.reward.l.a(gVar, j5, j4, j6);
        a(j5, j4, j6);
    }

    private void a(long j4, long j5, long j6) {
        com.kwad.components.ad.reward.l.a.a aVar;
        com.kwad.components.ad.reward.l.b.a aVar2;
        if (j4 < (j5 - 800) - j6) {
            int floor = (int) Math.floor(((float) (j5 - j4)) / 1000.0f);
            x(floor);
            p pVar = this.qp.pj;
            if (pVar != null) {
                pVar.T(floor);
                return;
            }
            return;
        }
        this.qp.pf = true;
        if (g.G(this.mAdTemplate)) {
            if (g.E(this.mAdTemplate) && (aVar2 = this.qp.pr) != null) {
                if (!aVar2.jC()) {
                    this.qp.pr.jB();
                }
            } else if (g.F(this.mAdTemplate) && (aVar = this.qp.ps) != null && !aVar.jC()) {
                this.qp.ps.jB();
            }
            if (this.vj) {
                return;
            }
            this.ve.setText(vi[1]);
            im();
            return;
        }
        notifyRewardVerify();
        il();
        p pVar2 = this.qp.pj;
        if (pVar2 != null) {
            pVar2.T(0);
        }
    }

    @Override // com.kwad.sdk.utils.bs.a
    public final void a(Message message) {
        if (message.what == 1) {
            if (!this.qp.fN() && !this.qp.fM()) {
                this.hj += 500;
                a(com.kwad.sdk.core.response.b.a.af(this.mAdInfo), this.hj);
                this.hh.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            this.hh.sendEmptyMessageDelayed(1, 500L);
        }
    }
}
