package com.join.mgps.activity;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.AccountBindPhoneRequestbean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.CheckBindRequestBean;
import com.join.mgps.dto.MMSRequesBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.bind_phone_activity)
/* loaded from: classes4.dex */
public class MyAccountBindPhoneActivity extends BaseActivity {
    @StringRes(resName = "net_excption")

    /* renamed from: b  reason: collision with root package name */
    String f35332b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f35333c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f35334d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f35335e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35336f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    EditText f35337g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    EditText f35338h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f35339i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f35340j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.b f35341k;

    /* renamed from: l  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f35342l;

    /* renamed from: m  reason: collision with root package name */
    private Context f35343m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35344n;

    /* renamed from: o  reason: collision with root package name */
    private com.join.mgps.customview.o f35345o;

    /* renamed from: p  reason: collision with root package name */
    private String f35346p;

    /* renamed from: q  reason: collision with root package name */
    private String f35347q;

    /* renamed from: r  reason: collision with root package name */
    c f35348r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountBindPhoneActivity.this.i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MyAccountBindPhoneActivity.this.f35345o == null || !MyAccountBindPhoneActivity.this.f35345o.isShowing()) {
                return;
            }
            MyAccountBindPhoneActivity.this.f35345o.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends CountDownTimer {
        public c(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            MyAccountBindPhoneActivity.this.f35339i.setText("重新获取");
            MyAccountBindPhoneActivity.this.f35339i.setEnabled(true);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            MyAccountBindPhoneActivity.this.f35339i.setEnabled(false);
            TextView textView = MyAccountBindPhoneActivity.this.f35339i;
            textView.setText("重新获取(" + (j4 / 1000) + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f35341k = com.join.mgps.rpc.impl.a.c0();
        this.f35343m = this;
        this.f35342l = AccountUtil_.getInstance_(this).getAccountData();
        TextView textView = this.f35334d;
        textView.setText("账号 : " + this.f35342l.getAccount());
        this.f35333c.setText("绑定手机号");
        this.f35344n = com.join.mgps.Util.b0.f0(this).x(this);
        this.f35348r = new c(60000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                try {
                    AccountBindPhoneRequestbean accountBindPhoneRequestbean = new AccountBindPhoneRequestbean();
                    accountBindPhoneRequestbean.setUid(this.f35342l.getUid());
                    accountBindPhoneRequestbean.setCode(this.f35347q);
                    accountBindPhoneRequestbean.setMobile(this.f35346p);
                    accountBindPhoneRequestbean.setSign(com.join.mgps.Util.x1.g(accountBindPhoneRequestbean));
                    accountBindPhoneRequestbean.setToken(this.f35342l.getToken());
                    AccountResultMainBean<AccountTokenSuccess> M = this.f35341k.M(accountBindPhoneRequestbean.getParams());
                    showLodingDismis();
                    if (M != null && M.getError() == 0) {
                        if (M.getData().is_success()) {
                            showToast("绑定成功");
                            k0();
                            return;
                        }
                        showToast(M.getData().getError_msg());
                        return;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLodingDismis();
                }
                showToast("连接失败，请稍后再试。");
                return;
            } catch (Throwable th) {
                showLodingDismis();
                showToast("连接失败，请稍后再试。");
                throw th;
            }
        }
        showToast(this.f35332b);
        showLodingDismis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                try {
                    CheckBindRequestBean checkBindRequestBean = new CheckBindRequestBean();
                    checkBindRequestBean.setUid(this.f35342l.getUid());
                    checkBindRequestBean.setCode(this.f35347q);
                    checkBindRequestBean.setMobile(this.f35346p);
                    checkBindRequestBean.setToken(this.f35342l.getToken());
                    AccountResultMainBean<AccountTokenSuccess> F = this.f35341k.F(checkBindRequestBean.getParams());
                    if (F != null && F.getError() == 0) {
                        if (F.getData().is_success()) {
                            if (com.join.mgps.Util.g2.i(F.getData().getError_msg())) {
                                o0(F.getData().getError_msg());
                            }
                        } else if (F.getData().getError_code().equals("226")) {
                            i0();
                        } else if (com.join.mgps.Util.g2.i(F.getData().getError_msg())) {
                            if ("验证码错误".equals(F.getData().getError_msg())) {
                                showToast(F.getData().getError_msg());
                            } else {
                                o0(F.getData().getError_msg());
                            }
                        }
                    } else {
                        showToast("连接失败，请稍后再试。");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                showLodingDismis();
            }
        }
        showToast(this.f35332b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        this.f35342l = this.f35342l.toBuilder().a4(this.f35346p).build();
        AccountUtil_.getInstance_(this.f35343m).saveAccountData(this.f35342l, this.f35343m);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        this.f35346p = this.f35337g.getText().toString();
        this.f35347q = this.f35338h.getText().toString();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(this.f35346p);
                mMSRequesBean.setType(MMSRequesBean.TYPE_BIND);
                mMSRequesBean.setSign(com.join.mgps.Util.x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i4 = this.f35341k.i(mMSRequesBean.getParams());
                if (i4 != null && i4.getError() == 0) {
                    if (i4.getData().is_success()) {
                        this.f35348r.start();
                        showToast("获取验证码成功");
                    } else {
                        showToast(i4.getData().getError_msg());
                    }
                } else {
                    showToast("连接失败，请稍后再试。");
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast("连接失败，请稍后再试。");
                return;
            }
        }
        showToast("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f35346p = this.f35337g.getText().toString();
        this.f35347q = this.f35338h.getText().toString();
        if (this.f35346p.length() == 11 && com.join.mgps.Util.g2.j(this.f35346p)) {
            if (this.f35347q.replaceAll(" ", "").length() == 0) {
                com.join.mgps.Util.l2.a(this).b("验证码不能为空");
                return;
            } else {
                j0();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("手机号格式有误");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(String str) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f35343m, R.style.MyDialog);
        this.f35345o = oVar;
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) this.f35345o.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f35345o.findViewById(R.id.dialog_button_ok);
        ((TextView) this.f35345o.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) this.f35345o.findViewById(R.id.dialog_content)).setText("该手机号已与账号“" + str + "”绑定，是否解除绑定关系？");
        ((TextView) this.f35345o.findViewById(R.id.dialog_desci)).setText("*绑定成功后将发送账号到你的手机");
        button2.setText("解除绑定");
        button.setText("取消");
        button2.setOnClickListener(new a());
        button.setOnClickListener(new b());
        com.join.mgps.customview.o oVar2 = this.f35345o;
        if (oVar2 == null || oVar2.isShowing()) {
            return;
        }
        this.f35345o.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.d1 d1Var = this.f35344n;
        if (d1Var != null && d1Var.isShowing()) {
            this.f35344n.dismiss();
        }
        com.join.mgps.customview.o oVar = this.f35345o;
        if (oVar != null && oVar.isShowing()) {
            this.f35345o.dismiss();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.dialog.d1 d1Var = this.f35344n;
        if (d1Var == null || d1Var.isShowing()) {
            return;
        }
        this.f35344n.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var = this.f35344n;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f35344n.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f35343m).b(str);
    }
}
