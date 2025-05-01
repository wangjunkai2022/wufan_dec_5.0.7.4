package com.join.mgps.activity.login;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.facebook.common.util.f;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.o;
import com.join.mgps.activity.MGChooseIconActivity_;
import com.join.mgps.dto.AccountresultData;
import com.join.mgps.rpc.impl.j;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.change_account_nickname_layout)
/* loaded from: classes4.dex */
public class ChangeAccountNickNameActivity extends BaseAppCompatActivity {
    n0 accountBean;
    @ViewById
    View close;
    Context context;
    Dialog dialogLoding;
    @ViewById
    EditText nickName;
    @ViewById
    TextView nickNameBution;
    @ViewById
    SimpleDraweeView userIcon;

    private void changeNickName(final String str) {
        ChangeNiknameRequest changeNiknameRequest = new ChangeNiknameRequest();
        changeNiknameRequest.setDeviceId("");
        changeNiknameRequest.setMac("");
        changeNiknameRequest.setNickName(str);
        changeNiknameRequest.setUid(this.accountBean.getUid());
        changeNiknameRequest.setUserToken(this.accountBean.getToken());
        changeNiknameRequest.setVersion(n.n(this).y() + "_" + n.n(this).z());
        j.b().a().c(changeNiknameRequest).enqueue(new Callback<LoginResultMain<AccountresultData>>() { // from class: com.join.mgps.activity.login.ChangeAccountNickNameActivity.2
            @Override // retrofit2.Callback
            public void onFailure(Call<LoginResultMain<AccountresultData>> call, Throwable th) {
                ChangeAccountNickNameActivity.this.dialogLoding.dismiss();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<LoginResultMain<AccountresultData>> call, Response<LoginResultMain<AccountresultData>> response) {
                if (response != null && response.body() != null) {
                    LoginResultMain<AccountresultData> body = response.body();
                    if (body != null && body.getError() == 0 && body.getData() != null && body.getData().isIs_success()) {
                        ChangeAccountNickNameActivity changeAccountNickNameActivity = ChangeAccountNickNameActivity.this;
                        changeAccountNickNameActivity.accountBean = changeAccountNickNameActivity.accountBean.toBuilder().c4(str).build();
                        AccountUtil_ instance_ = AccountUtil_.getInstance_(ChangeAccountNickNameActivity.this.context);
                        ChangeAccountNickNameActivity changeAccountNickNameActivity2 = ChangeAccountNickNameActivity.this;
                        instance_.saveAccountData(changeAccountNickNameActivity2.accountBean, changeAccountNickNameActivity2.context);
                        ChangeAccountNickNameActivity.this.finish();
                    } else if (body.getError() == 0) {
                        if (body.getData() != null) {
                            ChangeAccountNickNameActivity.this.error(body.getData().getError_msg());
                        }
                    } else {
                        ChangeAccountNickNameActivity.this.error(body.getMsg());
                    }
                } else {
                    ChangeAccountNickNameActivity.this.error("数据异常");
                }
                ChangeAccountNickNameActivity.this.dialogLoding.dismiss();
            }
        });
    }

    private int getChineseCount(String str) {
        Matcher matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str);
        int i4 = 0;
        while (matcher.find()) {
            for (int i5 = 0; i5 <= matcher.groupCount(); i5++) {
                i4++;
            }
        }
        return i4;
    }

    private int getStringLength(String str) {
        if (g2.h(str)) {
            return 0;
        }
        return str.length() + getChineseCount(str);
    }

    private boolean matchStringLength(String str, int i4, int i5) {
        int stringLength = getStringLength(str);
        return stringLength >= i4 && stringLength <= i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.accountBean = AccountUtil_.getInstance_(this).getAccountData();
        this.dialogLoding = b0.f0(this).x(this);
        showFinishPage(this.accountBean);
        this.context = this;
        this.nickName.addTextChangedListener(new TextWatcher() { // from class: com.join.mgps.activity.login.ChangeAccountNickNameActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                if (charSequence.length() > 0) {
                    ChangeAccountNickNameActivity.this.nickNameBution.setEnabled(true);
                } else {
                    ChangeAccountNickNameActivity.this.nickNameBution.setEnabled(false);
                }
            }
        });
        o.g(this.nickName);
        p.l(this.context).O1(Event.showNicknameEditPage, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void nickNameBution() {
        String obj = this.nickName.getText().toString();
        if (!matchStringLength(obj, 1, 20)) {
            error("昵称格式有误，输入1至24位字母或数字或汉字");
        } else if (obj.equals(this.accountBean.getAccount())) {
            error("昵称不能和账号相同");
        } else {
            p.l(this.context).O1(Event.submitNewNickname, new Ext());
            this.dialogLoding.show();
            changeNickName(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (i4 == 10001 && i5 == 10001) {
            MyImageLoader.t(this.userIcon, AccountUtil_.getInstance_(this).getAccountData().d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.dialogLoding;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.accountBean = accountData;
        MyImageLoader.t(this.userIcon, accountData.d0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showFinishPage(n0 n0Var) {
        if (n0Var.d0().startsWith(f.f10923a)) {
            MyImageLoader.d(this.userIcon, R.drawable.unloginstatus, n0Var.d0());
        } else {
            MyImageLoader.t(this.userIcon, n0Var.d0());
        }
        this.nickName.setText(n0Var.getNickname());
        EditText editText = this.nickName;
        editText.setSelection(editText.getText().toString().length());
        showKeyborad(this.nickName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 600)
    public void showKeyborad(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void userIcon() {
        MGChooseIconActivity_.x0(this).a(1).startForResult(10001);
    }
}
