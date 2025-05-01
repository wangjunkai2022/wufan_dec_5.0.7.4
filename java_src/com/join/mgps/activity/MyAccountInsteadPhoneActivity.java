package com.join.mgps.activity;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.instead_phone_activity)
/* loaded from: classes4.dex */
public class MyAccountInsteadPhoneActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f35455b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f35456c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    EditText f35457d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f35458e;

    /* renamed from: f  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f35459f;

    /* renamed from: g  reason: collision with root package name */
    private Context f35460g;

    /* renamed from: h  reason: collision with root package name */
    MApplication f35461h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        MApplication mApplication = (MApplication) getApplication();
        this.f35461h = mApplication;
        this.f35460g = this;
        mApplication.e(this);
        this.f35455b.setText("更换绑定手机号");
        this.f35458e.setEnabled(false);
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f35459f = accountData;
        if (accountData.z().length() == 11) {
            TextView textView = this.f35456c;
            textView.setText("当前绑定号码 : " + this.f35459f.z().substring(0, 3) + "****" + this.f35459f.z().substring(7, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TextChange
    public void h0() {
        if (this.f35457d.getText().toString().length() == 11) {
            this.f35458e.setEnabled(true);
        } else {
            this.f35458e.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        String obj = this.f35457d.getText().toString();
        if (obj.length() == 11 && com.join.mgps.Util.g2.j(obj)) {
            if (obj.equals(this.f35459f.z())) {
                com.join.mgps.Util.l2.a(this).b("新手机号和旧手机号不能一致");
                return;
            } else {
                MyAccountChangePhoneActivity_.F0(this.f35460g).a(obj).start();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("手机号格式有误");
    }
}
