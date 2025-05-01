package com.join.mgps.activity;

import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.WxProgram;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
@EActivity(R.layout.activity_private_domain_download)
/* loaded from: classes4.dex */
public class PrivateDomainDownloadActivity extends BaseDialogActivity implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private View f36950b;

    /* renamed from: c  reason: collision with root package name */
    TextView f36951c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f36952d;

    /* renamed from: e  reason: collision with root package name */
    WxProgram f36953e;

    /* renamed from: f  reason: collision with root package name */
    PrefDef_ f36954f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    DomainInfoBean f36955g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.c2.s(this);
        this.f36954f = new PrefDef_(this);
        this.f36951c = (TextView) findViewById(R.id.name);
        this.f36950b = findViewById(R.id.iv_close);
        this.f36952d = (SimpleDraweeView) findViewById(R.id.sdv_image);
        this.f36950b.setOnClickListener(this);
        this.f36952d.setOnClickListener(this);
        if (this.f36955g != null) {
            if (this.f36952d == null) {
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.sdv_image);
                this.f36952d = simpleDraweeView;
                simpleDraweeView.setOnClickListener(this);
            }
            SimpleDraweeView simpleDraweeView2 = this.f36952d;
            if (simpleDraweeView2 != null) {
                MyImageLoader.h(simpleDraweeView2, this.f36955g.getPic());
            }
            com.papa.sim.statistic.p.l(this).O1(Event.pdGameDownload, new Ext().setGameId(this.f36955g.getGameId()).setTestAbNumber(this.f36955g.getAb_test_number()).setGameId(this.f36955g.getGameId()).setFrom(this.f36955g.getLocation() == 6 ? "101" : "102"));
        }
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return this.f36952d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            finish();
        } else if (id == R.id.sdv_image) {
            if (this.f36955g != null) {
                com.papa.sim.statistic.p.l(this).O1(Event.pdGameDownloadedClick, new Ext().setGameId(this.f36955g.getGameId()).setTestAbNumber(this.f36955g.getAb_test_number()).setIsJoin(this.f36955g.getIs_join()).setFrom(this.f36955g.getLocation() == 6 ? "101" : "102"));
                if (com.join.mgps.Util.g2.i(this.f36955g.getInfo())) {
                    try {
                        this.f36953e = (WxProgram) JsonMapper.getInstance().fromJson(com.join.mgps.Util.a.b(this.f36955g.getInfo()), WxProgram.class);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
            WxProgram wxProgram = this.f36953e;
            if (wxProgram != null) {
                wxProgram.setSceneType("game_download");
                UtilsMy.g4(this, this.f36953e);
            }
            finish();
        }
    }
}
