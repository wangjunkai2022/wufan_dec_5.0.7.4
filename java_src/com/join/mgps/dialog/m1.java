package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.WxProgram;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
/* compiled from: ModQuestionnaireDialog.java */
/* loaded from: classes4.dex */
public class m1 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    DownloadTask f49502b;

    /* renamed from: c  reason: collision with root package name */
    private String f49503c;

    /* renamed from: d  reason: collision with root package name */
    private String f49504d;

    /* renamed from: e  reason: collision with root package name */
    private View f49505e;

    /* renamed from: f  reason: collision with root package name */
    private View f49506f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49507g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49508h;

    /* renamed from: i  reason: collision with root package name */
    PrefDef_ f49509i;

    /* renamed from: j  reason: collision with root package name */
    private SimpleDraweeView f49510j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f49511k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f49512l;

    /* renamed from: m  reason: collision with root package name */
    private WxProgram f49513m;

    /* renamed from: n  reason: collision with root package name */
    private DomainInfoBean f49514n;

    public m1(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(String str, DomainInfoBean domainInfoBean) {
        show();
        this.f49504d = str;
        DownloadTask F = p1.f.K().F(str);
        this.f49502b = F;
        this.f49508h.setText(F.getShowName());
        this.f49514n = domainInfoBean;
        DownloadTask downloadTask = this.f49502b;
        if (downloadTask != null) {
            this.f49503c = downloadTask.getRef_crc_sign_id();
            this.f49508h.setText(this.f49502b.getShowName());
            SimpleDraweeView simpleDraweeView = this.f49510j;
            if (simpleDraweeView != null) {
                MyImageLoader.h(simpleDraweeView, this.f49502b.getPortraitURL());
            }
        }
        if (domainInfoBean != null && com.join.mgps.Util.g2.i(domainInfoBean.getInfo())) {
            try {
                WxProgram wxProgram = (WxProgram) JsonMapper.getInstance().fromJson(com.join.mgps.Util.a.b(domainInfoBean.getInfo()), WxProgram.class);
                this.f49513m = wxProgram;
                if (wxProgram != null) {
                    TextView textView = this.f49511k;
                    if (textView != null) {
                        textView.setText(wxProgram.getGuide_text());
                    }
                    if (this.f49507g == null) {
                        this.f49507g = (TextView) findViewById(R.id.tv_customer);
                    }
                    this.f49507g.setText(this.f49513m.getButton_text());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.papa.sim.statistic.p.l(getContext()).O1(Event.pdGameStart, new Ext().setGameId(str).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
        }
        com.papa.sim.statistic.p.l(getContext()).O1(Event.showmodRunNormal, new Ext().setGameId(str).setFrom(APKUtils.L(this.f49502b) ? "1" : "0"));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cl_customer) {
            WxProgram wxProgram = this.f49513m;
            if (wxProgram != null) {
                wxProgram.setSceneType("game_start");
                UtilsMy.g4(getContext(), this.f49513m);
            }
            if (this.f49514n != null) {
                com.papa.sim.statistic.p.l(getContext()).O1(Event.pdGameStartClick, new Ext().setGameId(this.f49504d).setIsJoin(this.f49514n.getIs_join()).setTestAbNumber(this.f49514n.getAb_test_number()));
            }
            this.f49509i.lastLaunchModGameId().g("");
            dismiss();
        } else if (id != R.id.tv_not_ask) {
            if (id == R.id.iv_close) {
                this.f49509i.lastLaunchModGameId().g("");
                super.dismiss();
            }
        } else {
            DownloadTask downloadTask = this.f49502b;
            if (downloadTask != null) {
                downloadTask.setGame_run_state(4);
                p1.f.K().m(this.f49502b);
            }
            this.f49509i.lastLaunchModGameId().g("");
            super.dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_mod_questionnaire);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49508h = (TextView) findViewById(R.id.name);
        this.f49505e = findViewById(R.id.iv_close);
        this.f49507g = (TextView) findViewById(R.id.tv_customer);
        this.f49506f = findViewById(R.id.cl_customer);
        this.f49510j = (SimpleDraweeView) findViewById(R.id.sdv_image);
        this.f49511k = (TextView) findViewById(R.id.tv_desc);
        this.f49512l = (TextView) findViewById(R.id.tv_not_ask);
        this.f49505e.setOnClickListener(this);
        this.f49506f.setOnClickListener(this);
        this.f49512l.setOnClickListener(this);
        this.f49509i = new PrefDef_(getContext());
    }
}
