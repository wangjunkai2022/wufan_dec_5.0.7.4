package com.join.mgps.activity;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.AccountMMSCheckCodebean;
import com.join.mgps.dto.AccountRebindPhoneRequestbean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.CheckBindRequestBean;
import com.join.mgps.dto.MMSRequesBean;
import com.join.mgps.dto.UploadResultMainBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.change_phone_activity)
/* loaded from: classes4.dex */
public class MyAccountChangePhoneActivity extends BaseActivity {
    @StringRes(resName = "net_excption")

    /* renamed from: b  reason: collision with root package name */
    String f35368b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f35369c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f35370d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f35371e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35372f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    EditText f35373g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    EditText f35374h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f35375i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f35376j;

    /* renamed from: k  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f35377k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.b f35378l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f35379m;

    /* renamed from: n  reason: collision with root package name */
    MApplication f35380n;

    /* renamed from: o  reason: collision with root package name */
    private Context f35381o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35382p = true;

    /* renamed from: q  reason: collision with root package name */
    c f35383q;

    /* renamed from: r  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35384r;

    /* renamed from: s  reason: collision with root package name */
    private com.join.mgps.customview.o f35385s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountChangePhoneActivity.this.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MyAccountChangePhoneActivity.this.f35385s == null || !MyAccountChangePhoneActivity.this.f35385s.isShowing()) {
                return;
            }
            MyAccountChangePhoneActivity.this.f35385s.dismiss();
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
            MyAccountChangePhoneActivity.this.f35375i.setText("重新获取");
            MyAccountChangePhoneActivity.this.f35375i.setEnabled(true);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            MyAccountChangePhoneActivity.this.f35375i.setEnabled(false);
            TextView textView = MyAccountChangePhoneActivity.this.f35375i;
            textView.setText("重新获取(" + (j4 / 1000) + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f35378l = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35380n = mApplication;
        this.f35381o = this;
        mApplication.e(this);
        this.f35369c.setText("更换绑定手机号");
        this.f35383q = new c(60000L, 1000L);
        this.f35377k = AccountUtil_.getInstance_(this).getAccountData();
        TextView textView = this.f35370d;
        textView.setText("账号:" + this.f35377k.getNickname());
        this.f35384r = com.join.mgps.Util.b0.f0(this).x(this);
        s0();
        q0(this.f35377k.z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (this.f35382p) {
            finish();
            return;
        }
        this.f35382p = true;
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                try {
                    CheckBindRequestBean checkBindRequestBean = new CheckBindRequestBean();
                    checkBindRequestBean.setUid(this.f35377k.getUid());
                    checkBindRequestBean.setCode(this.f35373g.getText().toString());
                    checkBindRequestBean.setMobile(this.f35379m);
                    checkBindRequestBean.setToken(this.f35377k.getToken());
                    AccountResultMainBean<AccountTokenSuccess> F = this.f35378l.F(checkBindRequestBean.getParams());
                    showLodingDismis();
                    if (F != null && F.getError() == 0) {
                        if (F.getData().is_success()) {
                            if (com.join.mgps.Util.g2.i(F.getData().getError_msg())) {
                                t0(F.getData().getError_msg());
                                return;
                            }
                            return;
                        } else if (F.getData().getError_code().equals("226")) {
                            p0();
                            return;
                        } else if (com.join.mgps.Util.g2.i(F.getData().getError_msg())) {
                            if ("验证码错误".equals(F.getData().getError_msg())) {
                                showToast("验证码错误");
                                return;
                            } else {
                                t0(F.getData().getError_msg());
                                return;
                            }
                        } else {
                            return;
                        }
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
        showToast(this.f35368b);
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
                    checkBindRequestBean.setUid(this.f35377k.getUid());
                    checkBindRequestBean.setCode(this.f35373g.getText().toString());
                    AccountResultMainBean<AccountTokenSuccess> y2 = this.f35378l.y(checkBindRequestBean.getParamsv2());
                    showLodingDismis();
                    if (y2 != null && y2.getError() == 0) {
                        if (y2.getData().is_success()) {
                            this.f35382p = false;
                            s0();
                            return;
                        } else if (com.join.mgps.Util.g2.i(y2.getData().getError_msg())) {
                            String error_msg = y2.getData().getError_msg();
                            if ("验证码错误".equals(error_msg)) {
                                showToast("验证码错误");
                                return;
                            } else {
                                t0(error_msg);
                                return;
                            }
                        } else {
                            return;
                        }
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
        showToast(this.f35368b);
        showLodingDismis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        int i4;
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountMMSCheckCodebean accountMMSCheckCodebean = new AccountMMSCheckCodebean();
                accountMMSCheckCodebean.setMobile(this.f35377k.z());
                try {
                    i4 = Integer.parseInt(this.f35374h.getText().toString());
                } catch (Exception e5) {
                    e5.printStackTrace();
                    i4 = 0;
                }
                accountMMSCheckCodebean.setCode(i4);
                accountMMSCheckCodebean.setSign(com.join.mgps.Util.x1.g(accountMMSCheckCodebean));
                AccountResultMainBean<AccountTokenSuccess> g4 = this.f35378l.g(accountMMSCheckCodebean.getParams());
                if (g4 != null && g4.getError() == 0) {
                    if (g4.getData().is_success()) {
                        this.f35382p = false;
                        s0();
                    } else if (com.join.mgps.Util.g2.i(g4.getData().getError_msg())) {
                        String error_msg = g4.getData().getError_msg();
                        if ("验证码错误".equals(error_msg)) {
                            showToast("验证码错误");
                        } else {
                            t0(error_msg);
                        }
                    }
                } else {
                    showToast("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showToast("连接失败，请稍后再试。");
                showLodingDismis();
                return;
            }
        }
        showToast("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f35377k = this.f35377k.toBuilder().a4(this.f35379m).build();
        AccountUtil_.getInstance_(this.f35381o).saveAccountData(this.f35377k, this.f35381o);
        this.f35380n.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (this.f35382p) {
            q0(this.f35377k.z());
            return;
        }
        this.f35382p = true;
        q0(this.f35379m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TextChange
    public void n0() {
        if (this.f35373g.getText().toString().length() > 0 && !this.f35382p) {
            this.f35376j.setEnabled(true);
        } else {
            this.f35376j.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TextChange
    public void o0() {
        if (this.f35374h.getText().toString().length() > 0 && this.f35382p) {
            this.f35376j.setEnabled(true);
        } else {
            this.f35376j.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.d1 d1Var = this.f35384r;
        if (d1Var != null && d1Var.isShowing()) {
            this.f35384r.dismiss();
        }
        com.join.mgps.customview.o oVar = this.f35385s;
        if (oVar != null && oVar.isShowing()) {
            this.f35385s.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            if (this.f35382p) {
                finish();
            } else {
                this.f35382p = true;
                s0();
            }
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                AccountRebindPhoneRequestbean accountRebindPhoneRequestbean = new AccountRebindPhoneRequestbean();
                accountRebindPhoneRequestbean.setNew_code(this.f35373g.getText().toString());
                accountRebindPhoneRequestbean.setOld_code(this.f35374h.getText().toString());
                accountRebindPhoneRequestbean.setNew_mobile(this.f35379m);
                accountRebindPhoneRequestbean.setToken(this.f35377k.getToken());
                accountRebindPhoneRequestbean.setUid(this.f35377k.getUid());
                UploadResultMainBean<AccountTokenSuccess> q4 = this.f35378l.q(accountRebindPhoneRequestbean.getParams());
                if (q4 != null && q4.getError() == 0) {
                    if (q4.getData().is_success()) {
                        showToast("修改绑定成功");
                        l0();
                    } else {
                        showToast(q4.getData().getError_msg());
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
        showToast(this.f35368b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(str);
                mMSRequesBean.setType(MMSRequesBean.TYPE_BIND);
                mMSRequesBean.setSign(com.join.mgps.Util.x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i4 = this.f35378l.i(mMSRequesBean.getParams());
                if (i4 != null && i4.getError() == 0) {
                    if (i4.getData().is_success()) {
                        this.f35383q.start();
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
        showToast(this.f35368b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        if (this.f35382p) {
            if (com.join.mgps.Util.g2.i(this.f35374h.getText().toString())) {
                k0();
            } else {
                showToast("请输入验证码");
            }
        } else if (com.join.mgps.Util.g2.i(this.f35373g.getText().toString())) {
            i0();
        } else {
            showToast("请输入验证码");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f35375i.setText("重新获取");
        if (this.f35382p) {
            this.f35372f.setVisibility(8);
            this.f35371e.setVisibility(0);
            this.f35373g.setVisibility(8);
            this.f35374h.setVisibility(0);
            String z4 = this.f35377k.z();
            if (com.join.mgps.Util.g2.i(z4) && z4.length() == 11) {
                TextView textView = this.f35371e;
                textView.setText("已向原号码" + this.f35377k.z().substring(0, 3) + "****" + this.f35377k.z().substring(7, 11) + "发送一条验证消息");
            }
            if (this.f35374h.getText().toString().length() > 0) {
                this.f35376j.setEnabled(true);
                return;
            } else {
                this.f35376j.setEnabled(false);
                return;
            }
        }
        this.f35372f.setVisibility(0);
        this.f35371e.setVisibility(8);
        this.f35373g.setVisibility(0);
        this.f35374h.setVisibility(8);
        this.f35373g.setText("");
        String str = this.f35379m;
        if (com.join.mgps.Util.g2.i(str) && str.length() == 11) {
            TextView textView2 = this.f35372f;
            textView2.setText("已向新号码" + this.f35379m.substring(0, 3) + "****" + this.f35379m.substring(7, 11) + "发送一条验证消息");
        }
        if (this.f35373g.getText().toString().length() > 0) {
            this.f35376j.setEnabled(true);
        } else {
            this.f35376j.setEnabled(false);
        }
        q0(this.f35379m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.dialog.d1 d1Var = this.f35384r;
        if (d1Var == null || d1Var.isShowing()) {
            return;
        }
        this.f35384r.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var = this.f35384r;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f35384r.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f35381o).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(String str) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f35381o, R.style.MyDialog);
        this.f35385s = oVar;
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) this.f35385s.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f35385s.findViewById(R.id.dialog_button_ok);
        ((TextView) this.f35385s.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) this.f35385s.findViewById(R.id.dialog_content)).setText("该手机号已与账号“" + str + "”绑定，是否解除绑定关系？");
        ((TextView) this.f35385s.findViewById(R.id.dialog_desci)).setText("*绑定成功后将发送账号到你的手机");
        button2.setText("解除绑定");
        button.setText("取消");
        button2.setOnClickListener(new a());
        button.setOnClickListener(new b());
        com.join.mgps.customview.o oVar2 = this.f35385s;
        if (oVar2 == null || oVar2.isShowing()) {
            return;
        }
        this.f35385s.show();
    }
}
