package com.join.mgps.activity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.login.LoginInputPassActivity_;
import com.join.mgps.dto.AccountGetBackRequest;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_getpassbyphone)
/* loaded from: classes4.dex */
public class MyAccountGetpassByPhone extends BaseAccountActivity {

    /* renamed from: d  reason: collision with root package name */
    MApplication f35431d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f35432e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    EditText f35433f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.b f35434g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f35435h;

    /* renamed from: i  reason: collision with root package name */
    private String f35436i;

    /* renamed from: j  reason: collision with root package name */
    private String f35437j;

    /* renamed from: k  reason: collision with root package name */
    private int f35438k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f35439l = 0;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35440m;

    /* renamed from: n  reason: collision with root package name */
    private long f35441n;

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
            MyAccountGetpassByPhone.this.f35438k = charSequence.length();
            MyAccountGetpassByPhone.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            MyAccountGetpassByPhone.this.f35439l = charSequence.length();
            MyAccountGetpassByPhone.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        if (this.f35438k >= 6 && this.f35439l >= 6) {
            this.f35435h.setEnabled(true);
        } else {
            this.f35435h.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35434g = com.join.mgps.rpc.impl.a.c0();
        this.f35431d = (MApplication) getApplication();
        this.f35440m = com.join.mgps.Util.b0.f0(this).x(this);
        this.f28478c.setText("设置新密码");
        this.f35436i = getIntent().getStringExtra(LoginInputPassActivity_.PHONE_NUMBER_EXTRA);
        this.f35437j = getIntent().getStringExtra("MMSCode");
        this.f35435h.setEnabled(false);
        this.f35432e.addTextChangedListener(new a());
        this.f35433f.addTextChangedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        String trim = this.f35432e.getText().toString().trim();
        String obj = this.f35433f.getText().toString();
        if (obj.length() <= 16 && obj.length() >= 6) {
            if (!com.join.mgps.Util.g2.i(trim)) {
                com.join.mgps.Util.l2.a(this).b("密码不能为空");
                return;
            } else if (!com.join.mgps.Util.g2.i(obj)) {
                com.join.mgps.Util.l2.a(this).b("再次输入的密码不能为空");
                return;
            } else if (trim.equals(obj)) {
                if (System.currentTimeMillis() - this.f35441n <= 2000) {
                    return;
                }
                this.f35441n = System.currentTimeMillis();
                n0(trim);
                return;
            } else {
                com.join.mgps.Util.l2.a(this).b("两次输入密码不一致");
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("密码格式有误，输入6至16位字母或数字");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountGetBackRequest accountGetBackRequest = new AccountGetBackRequest();
                accountGetBackRequest.setMobile(this.f35436i);
                accountGetBackRequest.setPassword(str);
                int i4 = 0;
                try {
                    i4 = Integer.parseInt(this.f35437j.trim());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                accountGetBackRequest.setCode(i4 + "");
                accountGetBackRequest.setSign(com.join.mgps.Util.x1.g(accountGetBackRequest));
                AccountResultMainBean<AccountTokenSuccess> Z = this.f35434g.Z(accountGetBackRequest.getParams());
                if (Z != null && Z.getError() == 0) {
                    if (Z.getData().is_success()) {
                        success();
                    } else {
                        error(Z.getData().getError_msg());
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLodingDismis();
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
        this.f35440m.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        this.f35440m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void success() {
        com.join.mgps.Util.l2.a(this).b("重置密码成功");
        this.f35431d.f();
        finish();
        startActivity(new Intent(this, MyAccountLoginActivity_.class));
    }
}
