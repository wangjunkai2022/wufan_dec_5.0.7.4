package com.kwad.components.ad.reward.n;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.widget.KsAppTagsView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.KSRatingBar;
import java.util.List;
/* loaded from: classes5.dex */
public final class c extends com.kwad.sdk.core.download.a.a implements com.kwad.sdk.widget.c {
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private View ya;
    private View yb;
    private Button yc;
    private Button yd;
    private TextView ye;
    private ImageView yf;
    private TextView yg;
    private TextView yh;
    private KSRatingBar yi;
    private KsAppTagsView yj;
    private a yk;
    private volatile boolean yl = false;
    private com.kwad.components.ad.j.a ym;
    private Runnable yn;

    /* loaded from: classes5.dex */
    public interface a {
        void d(boolean z4, int i4);
    }

    /* loaded from: classes5.dex */
    static class b {
        private String appName;
        private String qb;
        private String qc;
        private float yp;
        private List<String> yq;
        private int yr = 15;
        private String ys;

        b() {
        }

        public static b P(AdTemplate adTemplate) {
            if (adTemplate == null) {
                return null;
            }
            AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
            b bVar = new b();
            if (com.kwad.sdk.core.response.b.e.F(adTemplate)) {
                bVar.appName = com.kwad.sdk.core.response.b.a.aw(dS);
            } else {
                bVar.appName = com.kwad.sdk.core.response.b.a.au(dS);
            }
            bVar.yp = com.kwad.sdk.core.response.b.a.aB(dS);
            bVar.qc = com.kwad.sdk.core.response.b.a.at(dS);
            if (com.kwad.sdk.core.response.b.e.F(adTemplate)) {
                bVar.qb = com.kwad.sdk.core.response.b.a.cJ(dS);
            } else {
                bVar.qb = com.kwad.sdk.core.response.b.a.cg(dS);
            }
            if (com.kwad.sdk.core.response.b.e.k(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.e.dS(adTemplate)))) {
                bVar.yr = com.kwad.components.ad.reward.a.b.gs();
                bVar.ys = "安装并体验%s秒  可领取奖励";
            } else {
                bVar.yr = com.kwad.sdk.core.config.d.CQ();
                bVar.ys = "浏览详情页%s秒，领取奖励";
            }
            bVar.yq = com.kwad.sdk.core.response.b.d.dJ(adTemplate);
            return bVar;
        }

        public final String jS() {
            return String.format(this.ys, Integer.valueOf(this.yr));
        }
    }

    public c(View view) {
        this.ya = view;
        initView();
        this.ym = new com.kwad.components.ad.j.a(view);
    }

    private void initView() {
        this.yc = (Button) this.ya.findViewById(R.id.ksad_reward_apk_info_install_action);
        this.yd = (Button) this.ya.findViewById(R.id.ksad_reward_apk_info_install_start);
        this.yb = this.ya.findViewById(R.id.ksad_reward_apk_info_install_container);
        this.yf = (ImageView) this.ya.findViewById(R.id.ksad_reward_apk_info_icon);
        this.ye = (TextView) this.ya.findViewById(R.id.ksad_reward_apk_info_name);
        this.yg = (TextView) this.ya.findViewById(R.id.ksad_reward_apk_info_desc);
        this.yi = (KSRatingBar) this.ya.findViewById(R.id.ksad_reward_apk_info_score);
        this.yj = (KsAppTagsView) this.ya.findViewById(R.id.ksad_reward_apk_info_tags);
    }

    public final void j(String str, int i4) {
        Button button = this.yd;
        if (button == null || str == null || i4 == 0) {
            return;
        }
        button.setText(str);
    }

    public final void jQ() {
        Runnable runnable;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this);
        }
        com.kwad.components.ad.j.a aVar = this.ym;
        if (aVar != null) {
            aVar.jQ();
        }
        View view = this.yb;
        if (view == null || (runnable = this.yn) == null) {
            return;
        }
        view.removeCallbacks(runnable);
        this.yn = null;
    }

    public final void jR() {
        this.ym.mC();
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFailed() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yd.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.aD(com.kwad.sdk.core.response.b.e.dS(adTemplate)) : "立即下载");
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFinished() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yd.setText(adTemplate == null ? "" : com.kwad.sdk.core.response.b.a.ca(adTemplate));
    }

    @Override // com.kwad.sdk.core.download.a.a, com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadStarted() {
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onIdle() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yd.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.aD(com.kwad.sdk.core.response.b.e.dS(adTemplate)) : "立即下载");
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onInstalled() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yd.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.ab(com.kwad.sdk.core.response.b.e.dS(adTemplate)) : "立即打开");
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int i4) {
        super.onPaused(i4);
        if (i4 != 0) {
            this.ym.mC();
            this.yd.setText(com.kwad.sdk.core.response.b.a.dn(i4));
        }
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onProgressUpdate(int i4) {
        if (i4 != 0) {
            this.ym.mC();
            this.yd.setText(com.kwad.sdk.core.response.b.a.dm(i4));
        }
    }

    public final void a(com.kwad.components.core.e.d.c cVar) {
        this.mApkDownloadHelper = cVar;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.d.dH(this.mAdTemplate)) {
            c(view, false);
        }
    }

    public final void c(AdTemplate adTemplate, boolean z4) {
        this.mAdTemplate = adTemplate;
        b P = b.P(adTemplate);
        if (P == null) {
            return;
        }
        KSImageLoader.loadAppIcon(this.yf, P.qb, adTemplate, 12);
        this.ye.setText(P.appName);
        this.yg.setText(P.qc);
        this.yi.setStar(P.yp);
        if (com.kwad.sdk.core.response.b.e.k(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.e.dS(adTemplate)))) {
            this.yd.setText(com.kwad.sdk.core.response.b.a.aD(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
            this.yi.setVisibility(0);
        } else {
            this.yd.setText("查看详情");
            this.yi.setVisibility(8);
        }
        this.yc.setText(P.jS());
        this.yc.setClickable(true);
        this.yd.setClickable(true);
        this.yb.setClickable(true);
        new com.kwad.sdk.widget.f(this.yc, this);
        new com.kwad.sdk.widget.f(this.yd, this);
        new com.kwad.sdk.widget.f(this.yb, this);
        List<String> list = P.yq;
        if (z4 && list.size() == 0) {
            this.yg.setVisibility(8);
            TextView textView = (TextView) this.ya.findViewById(R.id.ksad_reward_apk_info_desc_2);
            this.yh = textView;
            textView.setVisibility(0);
            this.yh.setText(P.qc);
        }
        if (list.size() == 0) {
            this.yj.setVisibility(8);
        }
        this.yj.setAppTags(list);
        if (this.yn == null) {
            this.yn = new Runnable() { // from class: com.kwad.components.ad.reward.n.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    int height = c.this.yb.getHeight();
                    com.kwad.sdk.core.e.c.d("ApkInfoCardViewHelper", hashCode() + " parentHeight: " + height);
                    if (c.this.yl) {
                        return;
                    }
                    c.this.ym.hU();
                }
            };
        }
        this.yb.postDelayed(this.yn, 1600L);
    }

    public final void a(a aVar) {
        this.yk = aVar;
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        c(view, true);
    }

    private void c(View view, boolean z4) {
        int id = view.getId();
        if (id == R.id.ksad_reward_apk_info_install_container || id == R.id.ksad_reward_apk_info_install_action || id == R.id.ksad_reward_apk_info_install_start) {
            com.kwad.sdk.core.e.c.d("ApkInfoCardViewHelper", "onClick install");
            this.yl = true;
            a aVar = this.yk;
            if (aVar != null) {
                aVar.d(z4, 1);
            }
        }
    }
}
