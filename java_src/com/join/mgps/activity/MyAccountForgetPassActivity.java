package com.join.mgps.activity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.MMSRequesBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_forgetpass_layout)
/* loaded from: classes4.dex */
public class MyAccountForgetPassActivity extends BaseAccountActivity {

    /* renamed from: d  reason: collision with root package name */
    MApplication f35412d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f35413e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.b f35414f;

    /* renamed from: g  reason: collision with root package name */
    private String f35415g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f35416h;

    /* renamed from: i  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35417i;

    /* renamed from: j  reason: collision with root package name */
    private long f35418j;

    /* loaded from: classes4.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            if (charSequence.length() == 11) {
                MyAccountForgetPassActivity.this.f35416h.setEnabled(true);
            } else {
                MyAccountForgetPassActivity.this.f35416h.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35414f = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35412d = mApplication;
        mApplication.e(this);
        h0("短信找回密码");
        this.f35416h.setEnabled(false);
        this.f35417i = com.join.mgps.Util.b0.f0(this).x(this);
        this.f35413e.addTextChangedListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        String trim = this.f35413e.getText().toString().trim();
        this.f35415g = trim;
        if (com.join.mgps.Util.g2.j(trim) && this.f35415g.length() == 11) {
            if (System.currentTimeMillis() - this.f35418j <= 2000) {
                return;
            }
            this.f35418j = System.currentTimeMillis();
            l0();
            return;
        }
        com.join.mgps.Util.l2.a(this).b("手机号格式有误，请重新输入");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        Intent intent = new Intent(this, MyAccountMMSCodeGetpassbackFinish_.class);
        intent.putExtra("phonenumber", this.f35415g);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(this.f35415g);
                mMSRequesBean.setType(MMSRequesBean.TYPE_FORGOT);
                mMSRequesBean.setSign(com.join.mgps.Util.x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i4 = this.f35414f.i(mMSRequesBean.getParams());
                if (i4 != null && i4.getError() == 0) {
                    if (i4.getData().is_success()) {
                        k0();
                    } else {
                        error(i4.getData().getError_msg());
                    }
                } else if (i4 != null && i4.getError() == 601) {
                    AccountTokenSuccess data = i4.getData();
                    if (data != null) {
                        error(data.getError_msg());
                    } else {
                        error("系统繁忙，请稍后再试...");
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingDismis();
                error("连接失败，请稍后再试。");
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f35417i.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        this.f35417i.dismiss();
    }
}
