package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.view.View;
import android.widget.ImageView;
import com.kwad.components.ad.reward.g;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.h;
/* loaded from: classes5.dex */
public final class d extends com.kwad.components.ad.reward.presenter.b implements View.OnClickListener {
    private ImageView hp;
    private ImageView vs;
    private h.a hq = new h.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.1
        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeOccupied() {
            if (d.this.hp == null || com.kwad.components.ad.reward.a.b.gt()) {
                return;
            }
            d.this.hp.post(new az() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.1.1
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    d.this.hp.setSelected(false);
                    d.this.qp.oK.setAudioEnabled(false, false);
                }
            });
        }

        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeReleased() {
        }
    };
    private com.kwad.components.ad.reward.m.c vt = new com.kwad.components.ad.reward.m.c() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.2
        @Override // com.kwad.components.ad.reward.m.c
        public final void ir() {
            d.this.ip();
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (com.kwad.components.ad.reward.g.G(r4.mAdTemplate) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ca() {
        /*
            r4 = this;
            boolean r0 = r4.hr()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L11
            android.widget.ImageView r0 = r4.hp
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.vs
            goto L2d
        L11:
            android.widget.ImageView r0 = r4.hp
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.G(r3)
            if (r3 == 0) goto L1e
            r3 = 8
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.vs
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.mAdTemplate
            boolean r3 = com.kwad.components.ad.reward.g.G(r3)
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            r1 = 8
        L2f:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.reward.presenter.platdetail.a.d.ca():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ip() {
        g gVar = this.qp;
        KsVideoPlayConfig ksVideoPlayConfig = gVar.mVideoPlayConfig;
        boolean z4 = true;
        if (!gVar.oI && com.kwad.components.core.s.a.as(getContext()).rA()) {
            this.vs.setSelected(true);
            this.qp.d(false, false);
            z4 = false;
        } else if (ksVideoPlayConfig != null) {
            z4 = ksVideoPlayConfig.isVideoSoundEnable();
            this.vs.setSelected(ksVideoPlayConfig.isVideoSoundEnable());
            this.qp.d(ksVideoPlayConfig.isVideoSoundEnable(), ksVideoPlayConfig.isVideoSoundEnable());
        } else {
            this.vs.setSelected(true);
            this.qp.d(true, true);
        }
        this.hp.setSelected(z4);
        this.qp.oK.setAudioEnabled(z4, false);
    }

    private void iq() {
        this.hp.setOnClickListener(this);
        this.vs.setOnClickListener(this);
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void aj() {
        super.aj();
        this.qp.a(this.vt);
        this.qp.oK.a(this.hq);
        ca();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.hp;
        if (view == imageView) {
            this.qp.oK.setAudioEnabled(!imageView.isSelected(), true);
            ImageView imageView2 = this.hp;
            imageView2.setSelected(!imageView2.isSelected());
            return;
        }
        ImageView imageView3 = this.vs;
        if (view == imageView3) {
            this.qp.oK.setAudioEnabled(!imageView3.isSelected(), true);
            ImageView imageView4 = this.vs;
            imageView4.setSelected(!imageView4.isSelected());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.hp = (ImageView) findViewById(R.id.ksad_video_sound_switch);
        this.vs = (ImageView) findViewById(R.id.ksad_reward_deep_task_sound_switch);
        iq();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qp.oK.b(this.hq);
        this.qp.b(this.vt);
    }
}
