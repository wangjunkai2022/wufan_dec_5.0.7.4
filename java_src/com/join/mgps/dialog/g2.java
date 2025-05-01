package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.SimulatorGoldAdCfgBean;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa91.common.BaseAppConfig;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: StickAdDialog.java */
/* loaded from: classes4.dex */
public class g2 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    ImageView f49411b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49412c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49413d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49414e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49415f;

    /* renamed from: g  reason: collision with root package name */
    private SimulatorGoldAdCfgBean f49416g;

    /* renamed from: h  reason: collision with root package name */
    private String f49417h;

    /* renamed from: i  reason: collision with root package name */
    Context f49418i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f49419j;

    /* renamed from: k  reason: collision with root package name */
    private a f49420k;

    /* renamed from: l  reason: collision with root package name */
    b f49421l;

    /* compiled from: StickAdDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b(boolean z4);

        void onShow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StickAdDialog.java */
    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i4 = intent.getExtras().getInt(BaseAppConfig.KEY_VIP_LEVEL);
            intent.getExtras().getInt(BaseAppConfig.KEY_SVIP_LEVEL);
            if (i4 > 0) {
                Intent intent2 = new Intent();
                intent2.setAction(o1.a.f72001g0);
                g2.this.getContext().sendBroadcast(intent2);
                g2.this.dismiss();
            }
        }
    }

    public g2(Context context, SimulatorGoldAdCfgBean simulatorGoldAdCfgBean, boolean z4) {
        super(context);
        this.f49419j = false;
        this.f49418i = context;
        this.f49416g = simulatorGoldAdCfgBean;
        this.f49419j = z4;
    }

    private void e() {
        SimulatorGoldAdCfgBean simulatorGoldAdCfgBean = this.f49416g;
        if (simulatorGoldAdCfgBean != null) {
            this.f49412c.setText(simulatorGoldAdCfgBean.getTip_text());
            this.f49413d.setText(this.f49416g.getT_btn_text());
            this.f49415f.setText(this.f49416g.getB_btn_text());
            this.f49414e.setText(this.f49416g.getCorner_text());
        }
    }

    void a() {
        this.f49421l = new b();
        IntentFilter intentFilter = new IntentFilter("com.join.android.app.mgsim.wufun.broadcast.action_raise_vip_success");
        intentFilter.addAction("com.join.android.app.mgsim.wufan.mha.broadcast.action_raise_vip_success");
        getContext().registerReceiver(this.f49421l, intentFilter);
    }

    public void b(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        intent.putExtra("gameId", str2);
        getContext().sendBroadcast(intent);
    }

    public void c(String str) {
        this.f49417h = str;
    }

    public void d(a aVar) {
        this.f49420k = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f49421l != null) {
            getContext().unregisterReceiver(this.f49421l);
            this.f49421l = null;
        }
        com.join.mgps.ad.a.g(this.f49418i).b();
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f49411b) {
            a aVar = this.f49420k;
            if (aVar != null) {
                aVar.b(this.f49419j);
            }
            if (this.f49419j) {
                b(Event.Customgoldfinger_AdUnnecessary_Close.name(), this.f49417h);
            } else {
                b(Event.Customgoldfinger_AdMust_Close.name(), this.f49417h);
            }
            dismiss();
        } else if (view == this.f49415f) {
            if (!this.f49419j) {
                SimulatorGoldAdCfgBean simulatorGoldAdCfgBean = this.f49416g;
                if (simulatorGoldAdCfgBean != null && com.join.mgps.Util.g2.i(simulatorGoldAdCfgBean.getB_btn_url())) {
                    IntentUtil.getInstance().goShareWebActivity(this.f49418i, this.f49416g.getB_btn_url());
                }
                b(Event.Customgoldfinger_AdMust_Buy.name(), this.f49417h);
            } else {
                a aVar2 = this.f49420k;
                if (aVar2 != null) {
                    aVar2.b(true);
                    b(Event.Customgoldfinger_AdUnnecessary_Buy.name(), this.f49417h);
                }
            }
            dismiss();
        } else if (view == this.f49413d) {
            a aVar3 = this.f49420k;
            if (aVar3 != null) {
                aVar3.a();
            }
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.height = defaultDisplay.getHeight();
        window.setAttributes(attributes);
        setContentView(R.layout.dialog_stick_ad);
        this.f49411b = (ImageView) findViewById(R.id.iv_close);
        this.f49412c = (TextView) findViewById(R.id.tv_ad_tip);
        this.f49413d = (TextView) findViewById(R.id.tv_opt_view);
        this.f49415f = (TextView) findViewById(R.id.tv_opt_vip);
        this.f49414e = (TextView) findViewById(R.id.tv_view_ad_label);
        this.f49411b.setOnClickListener(this);
        this.f49413d.setOnClickListener(this);
        this.f49415f.setOnClickListener(this);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        a aVar = this.f49420k;
        if (aVar != null) {
            aVar.onShow();
        }
        e();
        a();
    }
}
