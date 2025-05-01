package com.join.mgps.activity;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.ModifyPasswordRequestBean;
import com.join.mgps.dto.SetPasswordRequestBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.setting_password_activity)
/* loaded from: classes4.dex */
public class MyAccountSettingPasswordActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f35623b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    Button f35624c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f35625d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f35626e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    EditText f35627f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    EditText f35628g;

    /* renamed from: h  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f35629h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f35630i;

    /* renamed from: j  reason: collision with root package name */
    private Context f35631j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f35630i = com.join.mgps.rpc.impl.a.c0();
        this.f35631j = this;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f35629h = accountData;
        if (accountData.z0() == 0) {
            this.f35623b.setText("设置密码");
            this.f35625d.setVisibility(8);
            return;
        }
        this.f35623b.setText("修改密码");
        this.f35625d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f35629h = this.f35629h.toBuilder().h4(1).build();
        AccountUtil_.getInstance_(this.f35631j).saveAccountData(this.f35629h, this.f35631j);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(String str, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ModifyPasswordRequestBean modifyPasswordRequestBean = new ModifyPasswordRequestBean();
                modifyPasswordRequestBean.setToken(this.f35629h.getToken());
                modifyPasswordRequestBean.setDevice_id("");
                modifyPasswordRequestBean.setNew_passwd(str2);
                modifyPasswordRequestBean.setOld_passwd(str);
                modifyPasswordRequestBean.setUid(this.f35629h.getUid());
                modifyPasswordRequestBean.setSign(com.join.mgps.Util.x1.g(modifyPasswordRequestBean));
                AccountResultMainBean<AccountTokenSuccess> v2 = this.f35630i.v(modifyPasswordRequestBean.getParams());
                if (v2 != null && v2.getError() == 0) {
                    if (v2.getData().is_success()) {
                        showToast("修改密码成功");
                        h0();
                    } else {
                        showToast(v2.getData().getError_msg());
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
    @Background
    public void j0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                SetPasswordRequestBean setPasswordRequestBean = new SetPasswordRequestBean();
                setPasswordRequestBean.setToken(this.f35629h.getToken());
                setPasswordRequestBean.setDevice_id("");
                setPasswordRequestBean.setNew_passwd(str);
                setPasswordRequestBean.setUid(this.f35629h.getUid());
                setPasswordRequestBean.setSign(com.join.mgps.Util.x1.g(setPasswordRequestBean));
                AccountResultMainBean<AccountTokenSuccess> u4 = this.f35630i.u(setPasswordRequestBean.getParams());
                if (u4 != null && u4.getError() == 0) {
                    if (u4.getData().is_success()) {
                        showToast("设置私密成功");
                        h0();
                    } else {
                        showToast(u4.getData().getError_msg());
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
    public void k0() {
        if (this.f35629h.z0() == 0) {
            String obj = this.f35627f.getText().toString();
            if (obj.length() >= 6 && obj.length() <= 16) {
                if (obj.equals(this.f35628g.getText().toString())) {
                    j0(obj);
                    return;
                } else {
                    com.join.mgps.Util.l2.a(this.f35631j).b("两次输入不同哦，请重新输入");
                    return;
                }
            }
            com.join.mgps.Util.l2.a(this).b("密码格式有误，输入6至16位字母或数字");
            return;
        }
        String obj2 = this.f35627f.getText().toString();
        String obj3 = this.f35626e.getText().toString();
        String obj4 = this.f35628g.getText().toString();
        if (obj3.length() == 0) {
            com.join.mgps.Util.l2.a(this).b("请输入原密码");
        } else if (obj2.length() == 0) {
            com.join.mgps.Util.l2.a(this).b("请输入新密码");
        } else if (obj4.length() == 0) {
            com.join.mgps.Util.l2.a(this).b("请确认新密码");
        } else if (obj3.equals(obj2)) {
            com.join.mgps.Util.l2.a(this).b("新密码不能和原密码一致");
        } else if (obj2.length() >= 6 && obj2.length() <= 16) {
            if (obj2.equals(obj4)) {
                i0(obj3, obj2);
            } else {
                com.join.mgps.Util.l2.a(this.f35631j).b("两次输入不同哦，请重新输入");
            }
        } else {
            com.join.mgps.Util.l2.a(this).b("密码格式有误，输入6至16位字母或数字");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f35631j).b(str);
    }
}
