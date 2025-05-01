package com.join.mgps.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.customview.HandShankAdView;
import com.join.mgps.db.tables.HandShankTable;
import com.join.mgps.dto.HandShankAdBean;
import com.join.mgps.dto.ResultMainBean;
import com.papa.controller.core.ControllerManager;
import com.papa.sim.statistic.JoyStickConfig;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.handshank_layout_no)
/* loaded from: classes4.dex */
public class HandShankNoActivity extends HandShankBaseActivity {

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.dialog.z0 f33663d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33664e = false;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33665f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f33666g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    HandShankAdView f33667h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.e f33668i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankNoActivity.this.startActivity(new Intent(HandShankNoActivity.this, HandShankYesActivity_.class));
            HandShankNoActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(HandShankNoActivity.this, HandShankCheckKeyActivity_.class);
            intent.putExtra("from", "first");
            HandShankNoActivity.this.startActivity(intent);
            HandShankNoActivity.this.finish();
        }
    }

    private void E0(HandShankTable handShankTable) {
        JoyStickConfig joyStickConfig = new JoyStickConfig();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData == null) {
            joyStickConfig.setUid(0);
        } else {
            joyStickConfig.setUid(accountData.getUid());
        }
        joyStickConfig.setGamepad_name(handShankTable.getName());
        joyStickConfig.setGamepad_mac(handShankTable.getAddress().replace(":", "_"));
        joyStickConfig.setUpdate_time(handShankTable.getTime().longValue());
    }

    private void z0(List<ControllerManager.c> list) {
        if (list != null && list.size() != 0) {
            String str = "";
            for (ControllerManager.c cVar : list) {
                if (!com.join.mgps.joystick.map.a.b().f(cVar.d())) {
                    HandShankTable handShankTable = new HandShankTable();
                    handShankTable.setName(cVar.d());
                    handShankTable.setAddress(cVar.a());
                    handShankTable.setTime(Long.valueOf(System.currentTimeMillis()));
                    handShankTable.setIsConnect(Boolean.TRUE);
                    this.f33664e = true;
                    String d5 = cVar.d();
                    D0(handShankTable);
                    str = d5;
                }
            }
            if (this.f33664e) {
                F0(str);
                return;
            }
            return;
        }
        com.join.mgps.dialog.z0 z0Var = this.f33663d;
        if (z0Var == null || !z0Var.isShowing() || j0(list) >= 1) {
            return;
        }
        this.f33663d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0() {
        try {
            ResultMainBean<HandShankAdBean> r02 = this.f33668i.r0(RequestBeanUtil.getInstance(this).getHandShankAdList());
            if (r02.getCode() == 600) {
                this.f33667h.m(r02.getMessages().getData());
            } else {
                this.f33667h.i();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f33667h.i();
        }
    }

    public void B0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            A0();
        } else {
            this.f33667h.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val("http://h5.5fun.com/wf_shoubing.html");
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0(HandShankTable handShankTable) {
        b2.x p4 = b2.x.p();
        if (p4.q(handShankTable.getAddress())) {
            return;
        }
        p4.n(handShankTable);
        E0(handShankTable);
    }

    public synchronized void F0(String str) {
        com.join.mgps.dialog.z0 z0Var = this.f33663d;
        if (z0Var == null || !z0Var.isShowing()) {
            com.join.mgps.dialog.z0 z0Var2 = new com.join.mgps.dialog.z0(this);
            this.f33663d = z0Var2;
            z0Var2.c(str);
            this.f33663d.a(new a());
            this.f33663d.b(new b());
            this.f33663d.show();
        }
    }

    @Override // com.join.mgps.activity.HandShankBaseActivity
    public void m0(int i4, List<ControllerManager.c> list) {
        z0(list);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.join.mgps.dialog.z0 z0Var = this.f33663d;
        if (z0Var != null && z0Var.isShowing()) {
            this.f33663d.dismiss();
            this.f33663d = null;
        }
        super.onDestroy();
    }

    @Override // com.join.mgps.activity.HandShankBaseActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        r0(true);
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void w0() {
        this.f33668i = com.join.mgps.rpc.impl.d.P1();
        B0();
        com.papa.sim.statistic.p.l(this).c0(AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).isTourist(), "", "", 0);
        Button button = this.f33665f;
        if (button != null) {
            button.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        finish();
    }

    @Click
    public void y0() {
        startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
    }
}
