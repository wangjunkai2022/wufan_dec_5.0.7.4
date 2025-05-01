package com.join.mgps.activity;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountReginBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.MRegisterRequesBean;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_regin_activity_layout)
/* loaded from: classes4.dex */
public class MYAccountReginActivity extends BaseFragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    MApplication f35013b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    EditText f35014c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    EditText f35015d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f35016e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    CheckBox f35017f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.b f35018g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35019h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f35020i;

    /* renamed from: j  reason: collision with root package name */
    private int f35021j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f35022k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f35023l = 0;

    /* renamed from: m  reason: collision with root package name */
    private long f35024m = 0;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35025n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    AccountReginBean f35026o;

    /* renamed from: p  reason: collision with root package name */
    private Context f35027p;

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
            MYAccountReginActivity.this.f35023l = charSequence.length();
            MYAccountReginActivity.this.n0();
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
            MYAccountReginActivity.this.f35021j = charSequence.length();
            MYAccountReginActivity.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            MYAccountReginActivity.this.f35022k = charSequence.length();
            MYAccountReginActivity.this.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        if (this.f35021j != 0 && this.f35023l > 5 && this.f35022k > 0) {
            this.f35020i.setEnabled(true);
        } else {
            this.f35020i.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f35018g = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35013b = mApplication;
        mApplication.e(this);
        this.f35027p = this;
        this.f35019h.setText("手机号注册");
        this.f35025n = com.join.mgps.Util.b0.f0(this).x(this);
        this.f35015d.addTextChangedListener(new a());
        this.f35014c.addTextChangedListener(new b());
        this.f35016e.addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str, String str2, String str3) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                MRegisterRequesBean mRegisterRequesBean = new MRegisterRequesBean();
                mRegisterRequesBean.setMobile(str2);
                mRegisterRequesBean.setAccount(str);
                mRegisterRequesBean.setSign(com.join.mgps.Util.x1.g(mRegisterRequesBean));
                AccountResultMainBean<AccountTokenSuccess> U = this.f35018g.U(mRegisterRequesBean.getParams());
                if (U != null && U.getError() == 0) {
                    if (U.getData().is_success()) {
                        l0(str, str2, str3);
                    } else {
                        error(U.getData().getError_msg());
                    }
                } else if (U != null && U.getError() == 601) {
                    AccountTokenSuccess data = U.getData();
                    if (data != null) {
                        error(data.getError_msg());
                    } else {
                        error("系统繁忙，请稍后...");
                    }
                } else {
                    error("注册失败");
                }
                showLodingDismis();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                error("注册失败");
                showLodingDismis();
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(String str, String str2, String str3) {
        if (this.f35026o == null) {
            this.f35026o = new AccountReginBean();
        }
        this.f35026o.setNickname(str);
        this.f35026o.setMobile(str2);
        this.f35026o.setPassword(str3);
        MyAccountMMSCodeReginFinish_.z0(this).a(this.f35026o).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (System.currentTimeMillis() - this.f35024m <= 1000) {
            return;
        }
        this.f35024m = System.currentTimeMillis();
        String trim = this.f35014c.getText().toString().trim();
        String trim2 = this.f35015d.getText().toString().trim();
        String trim3 = this.f35016e.getText().toString().trim();
        if (!Pattern.matches("^[a-zA-Z0-9_一-龥]*$", trim3)) {
            com.join.mgps.Util.l2.a(this).b("用户名为中文/字母/数字/下划线\n请检查后重新输入");
        } else if (trim3.length() <= 12 && trim2.length() >= 1) {
            if (trim3.length() == 11 && trim3.matches("[0-9]+")) {
                com.join.mgps.Util.l2.a(this).b("为保护你的信息安全，用户名不能类似手机号哦");
            } else if (trim.length() == 11 && com.join.mgps.Util.g2.j(trim)) {
                if (trim2.length() >= 6 && trim2.length() <= 16) {
                    if (com.join.mgps.Util.g2.i(trim) && com.join.mgps.Util.g2.i(trim2) && com.join.mgps.Util.g2.i(trim3)) {
                        k0(trim3, trim, trim2);
                        return;
                    }
                    return;
                }
                com.join.mgps.Util.l2.a(this).b("密码格式有误，输入6至16位字母或数字");
            } else {
                com.join.mgps.Util.l2.a(this).b("手机号格式有误");
            }
        } else {
            com.join.mgps.Util.l2.a(this).b("用户名为1~12个字符,请检查后重新输入");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f35025n.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        this.f35025n.dismiss();
    }
}
