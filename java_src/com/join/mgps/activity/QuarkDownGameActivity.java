package com.join.mgps.activity;

import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtInfoBean;
import com.join.mgps.dto.WebDiskInfo;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_quark_down_game)
/* loaded from: classes4.dex */
public class QuarkDownGameActivity extends BaseDialogActivity implements View.OnClickListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f36960b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36961c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36962d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36963e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SimpleDraweeView f36964f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36965g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36966h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f36967i;
    @ViewById(R.id.cl_content)

    /* renamed from: j  reason: collision with root package name */
    View f36968j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    WebDiskInfo f36969k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    ExtInfoBean f36970l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f36971m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    String f36972n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    String f36973o;
    @Pref

    /* renamed from: p  reason: collision with root package name */
    PrefDef_ f36974p;

    /* renamed from: q  reason: collision with root package name */
    boolean f36975q = false;

    private void downloadQuark() {
        DownloadTask F;
        boolean z4 = com.join.mgps.Util.q1.p() && com.join.mgps.va.overmind.d.o().O();
        if (z4) {
            F = p1.f.K().F(com.join.mgps.Util.q1.f27992c);
        } else {
            this.f36974p.isQuarkSilentDownload().g(Boolean.FALSE);
            F = p1.f.K().F(com.join.mgps.Util.q1.f27993d);
        }
        if (F != null && F.getStatus() == 11) {
            com.join.android.app.common.utils.e.l0(this).x(this, F.getGameZipPath());
            return;
        }
        ToastManager.show("夸克下载中...");
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("action", "downloadQuark")).extra("isOm", z4)).a();
    }

    private void f0() {
        String d5 = this.f36974p.privateDomainFeedbackInfo().d();
        if (com.join.mgps.Util.g2.i(d5)) {
            DomainInfoBean domainInfoBean = (DomainInfoBean) JsonMapper.getInstance().fromJson(d5, DomainInfoBean.class);
            if (domainInfoBean != null) {
                com.papa.sim.statistic.p.l(this).O1(Event.pdPcGameDetailsClick, new Ext().setGameId(this.f36972n).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
                UtilsMy.h4(this, domainInfoBean.getInfo(), "pc_game_details");
                return;
            }
            return;
        }
        h0();
    }

    private void g0() {
        this.f36974p.isQuarkSilentDownload().g(Boolean.FALSE);
        boolean d5 = com.join.android.app.common.utils.e.l0(this).d(this, com.join.mgps.Util.q1.f27991b);
        this.f36975q = d5;
        if (d5) {
            if (com.join.mgps.Util.q1.m()) {
                f0();
            } else {
                h0();
            }
        } else if (com.join.mgps.va.overmind.d.o().F(com.join.mgps.Util.q1.f27991b) && com.join.mgps.Util.q1.p()) {
            if (com.join.mgps.Util.q1.m()) {
                f0();
            } else {
                h0();
            }
        } else {
            downloadQuark();
        }
    }

    private void h0() {
        com.join.mgps.Util.q1.t(this, Event.clickSpeedDownUpQk, this.f36969k.getGameId(), com.kuaishou.weapon.p0.t.f55705x);
        IntentUtil.getInstance().startQuarkBrowser(this, com.join.mgps.Util.q1.p(), this.f36969k.getWb_url(), this.f36971m, this.f36973o);
        com.papa.sim.statistic.p.l(this).O1(Event.clickPcDetailHomeBtn, new Ext().setFrom("2").setGameId(this.f36969k.getGameId()).setQkPosition(com.kuaishou.weapon.p0.t.f55705x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.c2.s(this);
        this.f36961c.setOnClickListener(this);
        this.f36962d.setOnClickListener(this);
        ExtInfoBean extInfoBean = this.f36970l;
        if (extInfoBean != null) {
            this.f36963e.setText(extInfoBean.getHelp_des());
            if (this.f36970l.getGame_cfg() != null) {
                this.f36966h.setText(this.f36970l.getGame_cfg().getGame_price());
                try {
                    this.f36967i.setText(UtilsMy.a((long) (Double.parseDouble(this.f36970l.getGame_cfg().getGame_size()) * 1024.0d * 1024.0d)));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (com.join.mgps.Util.g2.i(this.f36970l.getHelp_url())) {
                this.f36962d.setVisibility(0);
            } else {
                this.f36962d.setVisibility(8);
            }
        }
        this.f36965g.setText(this.f36971m);
        MyImageLoader.h(this.f36964f, this.f36973o);
        com.papa.sim.statistic.p.l(this).O1(Event.visitPCDbankPageExp, new Ext().setGameId(this.f36972n));
        if (com.join.mgps.Util.q1.m()) {
            UtilsMy.T1(this, 18, this.f36972n);
        }
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return this.f36968j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_download) {
            g0();
            finish();
        } else if (id == R.id.tv_not_ask) {
            ExtInfoBean extInfoBean = this.f36970l;
            if (extInfoBean != null && com.join.mgps.Util.g2.i(extInfoBean.getHelp_url())) {
                IntentUtil.getInstance().goShareWebActivity(this, this.f36970l.getHelp_url());
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.join.android.app.common.utils.e.l0(this).d(this, com.join.mgps.Util.q1.f27991b)) {
            this.f36961c.setText("保存游戏");
        } else if (com.join.mgps.Util.q1.p() && com.join.mgps.va.overmind.d.o().O()) {
            this.f36961c.setText("保存游戏");
        } else {
            this.f36961c.setText("安装夸克·保存游戏");
        }
    }
}
