package com.join.mgps.activity.login;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.o;
import com.join.mgps.Util.x1;
import com.join.mgps.activity.CheckInviteDialogActivity;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.AccountGetBackRequest;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.join.mgps.dto.MMSRequesBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.rpc.c;
import com.join.mgps.rpc.h;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.switfpass.pay.utils.e;
import com.wufan.user.service.protobuf.d0;
import com.wufan.user.service.protobuf.enumeration.ContentType;
import com.wufan.user.service.protobuf.enumeration.SourceType;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
import com.wufan.user.service.protobuf.f0;
import com.wufan.user.service.protobuf.h0;
import com.wufan.user.service.protobuf.l0;
import com.wufan.user.service.protobuf.n0;
import com.wufan.user.service.protobuf.p0;
import com.wufan.user.service.protobuf.x;
import com.wufan.user.service.protobuf.z;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.wufunlogin_inputpass_layout)
/* loaded from: classes4.dex */
public class LoginInputPassActivity extends AppCompatActivity {
    MApplication application;
    @ViewById
    TextView bindmessage;
    @ViewById
    ImageView clear;
    @ViewById
    RelativeLayout codeLayout;
    Context context;
    private d1 dialog;
    @ViewById
    TextView fergetPass;
    @Extra
    int from;
    @Extra
    String gameId;
    @ViewById
    TextView getCode;
    @ViewById
    EditText inputCode;
    @ViewById
    EditText inputPass;
    @Extra
    boolean isForcedLogin;
    boolean isOnekeyLogin;
    @Extra
    boolean isSetPwd;
    @ViewById
    TextView loginMessage;
    @ViewById
    RelativeLayout passLayout;
    @ViewById
    View permissLayout;
    @Extra
    String phoneNumber;
    @Pref
    PrefDef_ prefDef;
    com.join.mgps.rpc.b rpcAccountClient;
    c rpcAccountClientV2;
    @ViewById
    CheckBox seePass;
    @ViewById
    TextView sendLogin;
    @Extra
    AccountRegisterThirdwaiRequestBean thirdRequestbean;
    TimeCount time;
    @ViewById
    TextView titleMessage;
    int passLenth = 0;
    int codeLenth = 0;
    long clickTime = 0;
    boolean showDialog = true;
    private Uri SMS_INBOX = Uri.parse("content://sms/");

    /* loaded from: classes4.dex */
    class SmsObserver extends ContentObserver {
        public SmsObserver(Context context, Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            LoginInputPassActivity.this.getSmsFromPhone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class TimeCount extends CountDownTimer {
        public TimeCount(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LoginInputPassActivity.this.getCode.setText("重新获取");
            LoginInputPassActivity.this.getCode.setEnabled(true);
            LoginInputPassActivity.this.getCode.setTextColor(Color.parseColor("#408DFF"));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            LoginInputPassActivity.this.getCode.setEnabled(false);
            LoginInputPassActivity.this.getCode.setTextColor(Color.parseColor("#494949"));
            TextView textView = LoginInputPassActivity.this.getCode;
            textView.setText("" + (j4 / 1000) + "S后重新获取");
        }
    }

    private boolean checkFastClick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.clickTime > 300) {
            this.clickTime = currentTimeMillis;
            return false;
        }
        return true;
    }

    private void doHWToastCovered() {
        if (Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
            View findFocus = getWindow().getDecorView().findFocus();
            if (findFocus instanceof EditText) {
                int inputType = ((EditText) findFocus).getInputType();
                if (inputType == 128 || inputType == 144 || inputType == 129) {
                    o2.a.b(this.inputPass);
                }
            }
        }
    }

    private Ext getExt(Ext ext) {
        if (ext == null) {
            ext = new Ext();
        }
        ext.setFrom(this.isForcedLogin ? "1" : "2");
        return ext;
    }

    public static boolean isPhoneNumber(String str) {
        Pattern.compile("(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}");
        return Pattern.matches("(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}", str);
    }

    private boolean passwordCheck(String str) {
        if (str.length() <= 16 && str.length() >= 6) {
            return g2.i(str) && g2.i(str);
        }
        l2.a(this).b("密码格式有误，输入6至16位字母或数字");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLoginButn() {
        int i4 = this.from;
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            int i5 = this.passLenth;
            if (i5 >= 6 && this.codeLenth == 6 && i5 <= 16) {
                this.sendLogin.setEnabled(true);
            } else {
                this.sendLogin.setEnabled(false);
            }
        } else if (i4 == 4 || i4 == 6) {
            if (this.passLenth == 0) {
                this.sendLogin.setEnabled(false);
            } else {
                this.sendLogin.setEnabled(true);
            }
        } else if (i4 == 5) {
            if (this.codeLenth != 11) {
                this.sendLogin.setEnabled(false);
            } else {
                this.sendLogin.setEnabled(true);
            }
        } else if (i4 == 8) {
            if (this.codeLenth < 4) {
                this.sendLogin.setEnabled(false);
            } else {
                this.sendLogin.setEnabled(true);
            }
        }
        if (this.passLenth == 0) {
            this.clear.setVisibility(4);
            this.seePass.setVisibility(4);
            return;
        }
        this.clear.setVisibility(0);
        this.seePass.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.context = this;
        MApplication mApplication = (MApplication) getApplication();
        this.application = mApplication;
        mApplication.e(this);
        this.sendLogin.setEnabled(false);
        this.rpcAccountClient = com.join.mgps.rpc.impl.a.c0();
        this.rpcAccountClientV2 = com.join.mgps.rpc.impl.b.k();
        this.dialog = b0.f0(this).x(this);
        int i4 = this.from;
        if (i4 == 4 || i4 == 6 || i4 == 7) {
            this.titleMessage.setText("账号登录");
            TextView textView = this.loginMessage;
            textView.setText("当前登录：" + this.phoneNumber);
            this.codeLayout.setVisibility(8);
            this.fergetPass.setVisibility(0);
            this.fergetPass.setText(Html.fromHtml("忘记了？<font color=#408DFF>找回密码</font>"), TextView.BufferType.SPANNABLE);
            if (this.from != 7) {
                showKeyborad(this.inputPass);
            }
            this.sendLogin.setText("登录");
            if (this.from == 4 && !this.isSetPwd) {
                resendgetCode(MMSRequesBean.TYPE_FORGOT);
                this.titleMessage.setText("设置密码");
                this.fergetPass.setVisibility(8);
                this.codeLayout.setVisibility(0);
                TextView textView2 = this.loginMessage;
                textView2.setText("验证码已通过短信发送至" + this.phoneNumber + "\n密码请输入6至16位字母或数字。");
                showKeyborad(this.inputCode);
                this.isOnekeyLogin = true;
                this.from = 3;
            }
            if (this.from == 7) {
                this.titleMessage.setText("账号绑定");
                this.passLayout.setVisibility(8);
                this.fergetPass.setVisibility(8);
                this.codeLayout.setVisibility(0);
                TextView textView3 = this.loginMessage;
                textView3.setText("验证码已通过短信发送至" + this.phoneNumber + "\n密码请输入6至16位字母或数字。");
                this.from = 8;
            } else {
                p.l(this.context).O1(Event.loginAuthPageShow, new Ext());
            }
        } else if (i4 == 1 || i4 == 2) {
            this.titleMessage.setText("设置密码");
            if (isPhoneNumber(this.phoneNumber)) {
                TextView textView4 = this.loginMessage;
                textView4.setText("验证码已通过短信发送至" + this.phoneNumber + "\n密码请输入6至16位字母或数字。");
            } else {
                this.loginMessage.setVisibility(4);
            }
            this.fergetPass.setVisibility(8);
            showKeyborad(this.inputCode);
            this.sendLogin.setText("登录");
        } else if (i4 == 5) {
            this.passLayout.setVisibility(8);
            this.getCode.setVisibility(8);
            this.inputCode.setHint("请输入手机号");
            this.titleMessage.setText("绑定手机号");
            this.bindmessage.setVisibility(0);
            this.permissLayout.setVisibility(0);
            this.loginMessage.setVisibility(8);
            this.sendLogin.setText("获取短信验证码");
            showKeyborad(this.inputCode);
        } else if (i4 == 3) {
            TextView textView5 = this.loginMessage;
            textView5.setText("验证码已通过短信发送至" + this.phoneNumber + "\n密码请输入6至16位字母或数字。");
            this.titleMessage.setText("忘记密码");
            showKeyborad(this.inputCode);
        } else if (i4 == 1 || i4 == 3) {
            this.titleMessage.setText("忘记密码");
            showKeyborad(this.inputCode);
        }
        if (this.from == 1) {
            getCode();
        }
        int i5 = this.from;
        if (i5 == 1 || i5 == 3 || i5 == 5 || i5 == 2 || i5 == 7 || i5 == 8) {
            TimeCount timeCount = new TimeCount(60000L, 1000L);
            this.time = timeCount;
            timeCount.start();
        }
        int i6 = this.from;
        if (i6 == 1 || i6 == 2 || this.isOnekeyLogin) {
            p.l(this.context).O1(Event.accountRegisterShow, new Ext());
        } else if (i6 == 3) {
            p.l(this.context).O1(Event.resetPasswordShow, new Ext());
        }
        this.inputCode.addTextChangedListener(new TextWatcher() { // from class: com.join.mgps.activity.login.LoginInputPassActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                LoginInputPassActivity.this.codeLenth = charSequence.length();
                LoginInputPassActivity.this.updateLoginButn();
            }
        });
        this.inputPass.addTextChangedListener(new TextWatcher() { // from class: com.join.mgps.activity.login.LoginInputPassActivity.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                LoginInputPassActivity.this.passLenth = charSequence.length();
                LoginInputPassActivity.this.updateLoginButn();
                if (i7 == 0 && i8 == i9) {
                    LoginInputPassActivity loginInputPassActivity = LoginInputPassActivity.this;
                    loginInputPassActivity.inputPass.setSelection(loginInputPassActivity.passLenth);
                }
            }
        });
        o.g(this.inputPass);
        this.inputPass.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.join.mgps.activity.login.LoginInputPassActivity.3
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView6, int i7, KeyEvent keyEvent) {
                if (i7 == 4) {
                    LoginInputPassActivity.this.sendLogin();
                    return false;
                }
                return false;
            }
        });
        this.inputCode.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.join.mgps.activity.login.LoginInputPassActivity.4
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView6, int i7, KeyEvent keyEvent) {
                if (i7 == 5) {
                    LoginInputPassActivity loginInputPassActivity = LoginInputPassActivity.this;
                    if (loginInputPassActivity.from == 5) {
                        loginInputPassActivity.sendLogin();
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.seePass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.join.mgps.activity.login.LoginInputPassActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                if (z4) {
                    LoginInputPassActivity.this.inputPass.setInputType(144);
                } else {
                    LoginInputPassActivity.this.inputPass.setInputType(129);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        o2.a.b(this.inputPass);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void bindCode() {
        try {
            if (j.j(this)) {
                try {
                    h0.b t32 = h0.t3();
                    t32.k3(0);
                    t32.e3(com.join.mgps.Util.a.e(this.phoneNumber));
                    t32.i3(SourceType.PLATFORM);
                    t32.c3(ContentType.MOBILE_REG);
                    t32.a3(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", t32.getUid() + "");
                    hashMap.put("mobile", t32.z());
                    hashMap.put("sourceType", t32.P1().name());
                    hashMap.put("contentType", t32.getContentType().name());
                    hashMap.put("appVersion", t32.getAppVersion());
                    t32.g3(x1.d(hashMap));
                    f0 j4 = this.rpcAccountClientV2.j(t32.build());
                    if (j4 != null && j4.getError() == 200) {
                        if (j4.getStatus()) {
                            if (j4.M2()) {
                                LoginInputPassActivity_.intent(this.context).from(7).phoneNumber(this.phoneNumber).thirdRequestbean(this.thirdRequestbean).isForcedLogin(this.isForcedLogin).start();
                            } else if (this.from == 5) {
                                LoginInputPassActivity_.intent(this.context).from(2).phoneNumber(this.phoneNumber).thirdRequestbean(this.thirdRequestbean).isForcedLogin(this.isForcedLogin).start();
                            }
                        } else {
                            error(j4.k());
                        }
                    } else if (j4 != null && g2.i(j4.k())) {
                        error(j4.k());
                    } else {
                        error("请求失败，请重试");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            showLodingDismis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void clear() {
        this.inputPass.setText("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void fergetPass() {
        if (checkFastClick()) {
            return;
        }
        if (!isPhoneNumber(this.phoneNumber)) {
            doHWToastCovered();
            l2.a(this.context).b("请输入手机号码后重试！");
            return;
        }
        resendgetCode(MMSRequesBean.TYPE_FORGOT);
        LoginInputPassActivity_.intent(this.context).from(3).phoneNumber(this.phoneNumber).isForcedLogin(this.isForcedLogin).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void getCode() {
        TimeCount timeCount = this.time;
        if (timeCount != null) {
            timeCount.start();
        }
        int i4 = this.from;
        if (i4 == 3 || i4 == 8) {
            resendgetCode(MMSRequesBean.TYPE_FORGOT);
        } else if (i4 == 5 || i4 == 2 || i4 == 1) {
            bindCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getLogin(String str, String str2) {
        if (j.j(this)) {
            showLoding();
            try {
                p0.b l32 = p0.l3();
                l32.Y2(com.join.mgps.Util.a.e(str));
                l32.c3(com.join.mgps.Util.a.e(str2));
                l32.a3("");
                HashMap hashMap = new HashMap();
                hashMap.put(GrantCredentialsPermissionActivity.f67535g, l32.getAccount());
                hashMap.put(GameRoomActivity_.f38656u3, l32.getPassword());
                hashMap.put("appVersion", "");
                l32.e3(x1.d(hashMap));
                d0 h4 = this.rpcAccountClientV2.h(l32.build());
                boolean z4 = true;
                if (h4 != null && h4.getError() == 200) {
                    p.l(this.context).O1(Event.accountLoginSuccess, new Ext());
                    AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(h4.getData(), this);
                    UtilsMy.v4(this, h4.getData().f0());
                    loginSuccess(h4.getData());
                    UtilsMy.Q(this);
                    z4 = false;
                } else if (h4 != null) {
                    error(h4.k());
                } else {
                    error("连接失败，请稍后再试。");
                }
                if (z4) {
                    showLodingDismis();
                    return;
                }
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

    public void getSmsFromPhone() {
        Cursor query = getContentResolver().query(this.SMS_INBOX, new String[]{"body"}, "date >  " + (System.currentTimeMillis() - TTAdConstant.AD_MAX_EVENT_TIME), null, "date desc");
        if (query != null && query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("body"));
            if (string.contains(com.join.android.app.mgsim.wufun.b.f15658i)) {
                Matcher matcher = Pattern.compile("\\d+").matcher(string);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (group.length() == 6) {
                        this.inputCode.setText(group);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void joinDevice() {
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.context).getUid() + "");
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.context).getToken());
        AccountResultMainBean<JPushJoinDeviceResult> S = this.rpcAccountClient.S(linkedMultiValueMap);
        if (S != null && S.getError() == 0 && S.getData().isResult()) {
            S.getData().getMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void loginSuccess(n0 n0Var) {
        this.prefDef.singleGameShowDialog().g("");
        if (!TextUtils.isEmpty(CheckInviteDialogActivity.N)) {
            ((ClipboardManager) getSystemService("clipboard")).setText(CheckInviteDialogActivity.N);
            CheckInviteDialogActivity.N = "";
        }
        showLodingDismis();
        ((CommonService_.h2) CommonService_.S2(this.context).extra("accountloginSuccess", "xxx")).a();
        joinDevice();
        setResult(10011);
        IntentUtil.getInstance().checkRealNameAndIntent(this.context, n0Var, "login", this.gameId);
        this.application.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.dialog;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.showDialog = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void phoneRegin() {
        try {
            if (j.j(this)) {
                try {
                    x.b t32 = x.t3();
                    t32.a3(com.join.mgps.Util.a.e(this.phoneNumber));
                    t32.g3(com.join.mgps.Util.a.e(this.inputPass.getText().toString()));
                    t32.k3(this.inputCode.getText().toString());
                    t32.e3("mob");
                    t32.c3(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put(GrantCredentialsPermissionActivity.f67535g, t32.getAccount());
                    hashMap.put(GameRoomActivity_.f38656u3, t32.getPassword());
                    hashMap.put("smsCode", t32.r());
                    hashMap.put("codeType", t32.v());
                    hashMap.put("appVersion", t32.getAppVersion());
                    t32.i3(x1.d(hashMap));
                    d0 g4 = this.rpcAccountClientV2.g(t32.build());
                    if (g4 != null && g4.getData() != null) {
                        if (g4.getError() == 200) {
                            n0 data = g4.getData();
                            AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(data, getApplicationContext());
                            loginSuccess(data);
                            UtilsMy.Q(this);
                            p.l(this.context).O1(Event.accountRegistertSuccess, getExt(null));
                        } else {
                            error(g4.k());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            showLodingDismis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void resendgetCode(int i4) {
        if (j.j(this)) {
            showLoding();
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(this.phoneNumber);
                mMSRequesBean.setType(i4);
                mMSRequesBean.setSign(x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i5 = this.rpcAccountClient.i(mMSRequesBean.getParams());
                if (i5 != null && i5.getError() == 0) {
                    if (!i5.getData().is_success()) {
                        error(i5.getData().getError_msg());
                    }
                } else if (i5 != null && i5.getError() == 601) {
                    AccountTokenSuccess data = i5.getData();
                    if (data != null) {
                        error(data.getError_msg());
                    } else {
                        error("系统繁忙，请稍后...");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void resetPass(String str, String str2) {
        if (j.j(this)) {
            showLoding();
            try {
                AccountGetBackRequest accountGetBackRequest = new AccountGetBackRequest();
                accountGetBackRequest.setMobile(this.phoneNumber);
                accountGetBackRequest.setPassword(str);
                String trim = str2.trim();
                int i4 = 0;
                try {
                    i4 = Integer.parseInt(trim);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                accountGetBackRequest.setCode(i4 + "");
                accountGetBackRequest.setSign(x1.g(accountGetBackRequest));
                AccountResultMainBean<AccountTokenSuccess> Z = this.rpcAccountClient.Z(accountGetBackRequest.getParams());
                if (Z != null && Z.getError() == 0) {
                    if (Z.getData().is_success()) {
                        success();
                        if (this.isOnekeyLogin) {
                            p.l(this.context).O1(Event.accountRegistertSuccess, getExt(null));
                        } else {
                            p.l(this.context).O1(Event.resetPasswordSuccess, new Ext());
                        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void sendLogin() {
        if (checkFastClick()) {
            return;
        }
        o2.a.b(this.inputPass);
        int i4 = this.from;
        if (i4 == 1) {
            String obj = this.inputPass.getText().toString();
            if (passwordCheck(obj) && Pattern.matches("^[\\u4e00-\\u9fa5a-zA-Z0-9_]*$", obj)) {
                p.l(this.context).O1(Event.accountRegisterSubmit, new Ext());
                phoneRegin();
                return;
            }
            l2.a(this.context).b("密码格式有误，输入6至16位字母或数字");
        } else if (i4 == 2) {
            String obj2 = this.inputPass.getText().toString();
            if (passwordCheck(obj2) && Pattern.matches("^[\\u4e00-\\u9fa5a-zA-Z0-9_]*$", obj2)) {
                p.l(this.context).O1(Event.accountRegisterSubmit, new Ext());
                thirdRegin();
                return;
            }
            l2.a(this.context).b("密码格式有误，输入6至16位字母或数字");
        } else if (i4 == 3) {
            String trim = this.inputCode.getText().toString().trim();
            String obj3 = this.inputPass.getText().toString();
            if (g2.i(trim) && g2.j(trim) && trim.length() == 6) {
                if (!Pattern.matches("^[\\u4e00-\\u9fa5a-zA-Z0-9_]*$", obj3)) {
                    l2.a(this.context).b("密码格式有误，输入6至16位字母或数字");
                    return;
                } else if (passwordCheck(obj3)) {
                    if (this.isOnekeyLogin) {
                        p.l(this.context).O1(Event.accountRegisterSubmit, new Ext());
                    } else {
                        p.l(this.context).O1(Event.resetPasswordSubmit, new Ext());
                    }
                    resetPass(obj3, trim);
                    return;
                } else {
                    return;
                }
            }
            l2.a(this).b("输入格式有误");
        } else if (i4 != 6 && i4 != 4 && i4 != 8) {
            if (i4 == 5) {
                String obj4 = this.inputCode.getText().toString();
                this.phoneNumber = obj4;
                if (g2.i(obj4.trim()) && isPhoneNumber(this.phoneNumber)) {
                    bindCode();
                } else {
                    l2.a(this.context).b("请输入正确的手机号码");
                }
            }
        } else {
            p.l(this.context).O1(Event.accountLoginSubmit, new Ext());
            if (this.from == 8) {
                thirdPartyLogin();
                return;
            }
            String obj5 = this.inputPass.getText().toString();
            if (obj5.length() <= 16 && obj5.length() >= 6) {
                if (g2.i(obj5)) {
                    getLogin(this.phoneNumber, obj5);
                    return;
                }
                return;
            }
            l2.a(this).b("密码格式有误，输入6至16位字母或数字");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void shengming() {
        o2.a.b(this.inputPass);
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(h.f54056j + "/static/wf_mianze.html");
        intentDateBean.setObject("免责声明");
        IntentUtil.getInstance().intentActivity(this.context, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void showKeyborad(EditText editText) {
        o2.a.c(editText);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        d1 d1Var = this.dialog;
        if (d1Var == null || d1Var.isShowing() || !this.showDialog) {
            return;
        }
        this.dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        d1 d1Var = this.dialog;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void success() {
        l2.a(this).b(this.isOnekeyLogin ? "设置密码成功" : "重置密码成功");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void thirdPartyLogin() {
        try {
            if (j.j(this)) {
                try {
                    z.b F3 = z.F3();
                    TheThirdPartLoginType theThirdPartLoginType = TheThirdPartLoginType.UNRECOGNIZED;
                    if (this.thirdRequestbean.getType() == 1) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_QQ;
                    } else if (this.thirdRequestbean.getType() == 2) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_XIN;
                    } else if (this.thirdRequestbean.getType() == 3) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_BO;
                    }
                    F3.d3(com.join.mgps.Util.a.e(this.phoneNumber));
                    F3.l3(com.join.mgps.Util.a.e(this.inputPass.getText().toString()));
                    F3.t3(com.join.mgps.Util.a.e(this.thirdRequestbean.getUnique_id()));
                    F3.r3(theThirdPartLoginType);
                    F3.p3(this.inputCode.getText().toString());
                    F3.j3("mob");
                    F3.h3(b3.b.a(this));
                    F3.f3(e.f61860a);
                    HashMap hashMap = new HashMap();
                    hashMap.put(GrantCredentialsPermissionActivity.f67535g, F3.getAccount());
                    hashMap.put(GameRoomActivity_.f38656u3, F3.getPassword());
                    hashMap.put("uniqueId", F3.l());
                    hashMap.put("theThirdPartLoginType", F3.t().name());
                    hashMap.put("smsCode", F3.r());
                    hashMap.put("codeType", F3.v());
                    hashMap.put("appVersion", F3.getAppVersion());
                    hashMap.put("appId", F3.getAppId());
                    F3.n3(x1.d(hashMap));
                    d0 c5 = this.rpcAccountClientV2.c(F3.build());
                    if (c5 == null || c5.getError() != 200) {
                        if (c5 != null) {
                            if (g2.i(c5.k())) {
                                error(c5.k());
                            } else {
                                error("登录失败，请重试");
                            }
                        }
                    } else if (c5.m()) {
                        n0 data = c5.getData();
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(data, getApplicationContext());
                        loginSuccess(data);
                        UtilsMy.Q(this);
                        p.l(this.context).O1(Event.thirdPartyRegisterSuccess, new Ext());
                    } else {
                        error(c5.k());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            showLodingDismis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void thirdRegin() {
        try {
            if (j.j(this)) {
                try {
                    l0.b B3 = l0.B3();
                    TheThirdPartLoginType theThirdPartLoginType = TheThirdPartLoginType.UNRECOGNIZED;
                    if (this.thirdRequestbean.getType() == 1) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_QQ;
                    } else if (this.thirdRequestbean.getType() == 2) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_XIN;
                    } else if (this.thirdRequestbean.getType() == 3) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_BO;
                    }
                    B3.c3(com.join.mgps.Util.a.e(this.phoneNumber));
                    B3.i3(com.join.mgps.Util.a.e(this.inputPass.getText().toString()));
                    B3.q3(com.join.mgps.Util.a.e(this.thirdRequestbean.getUnique_id()));
                    B3.o3(theThirdPartLoginType);
                    B3.m3(this.inputCode.getText().toString());
                    B3.g3("mob");
                    B3.e3(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put(GrantCredentialsPermissionActivity.f67535g, B3.getAccount());
                    hashMap.put(GameRoomActivity_.f38656u3, B3.getPassword());
                    hashMap.put("uniqueId", B3.l());
                    hashMap.put("theThirdPartLoginType", B3.t().name());
                    hashMap.put("smsCode", B3.r());
                    hashMap.put("codeType", B3.v());
                    hashMap.put("appVersion", B3.getAppVersion());
                    B3.k3(x1.d(hashMap));
                    d0 f5 = this.rpcAccountClientV2.f(B3.build());
                    if (f5 == null || f5.getError() != 200) {
                        if (f5 != null) {
                            if (g2.i(f5.k())) {
                                error(f5.k());
                            } else {
                                error("登录失败，请重试");
                            }
                        }
                    } else if (f5.m()) {
                        n0 data = f5.getData();
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(data, getApplicationContext());
                        loginSuccess(data);
                        UtilsMy.Q(this);
                        p.l(this.context).O1(Event.thirdPartyRegisterSuccess, new Ext());
                    } else {
                        error(f5.k());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            showLodingDismis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void xieyi() {
        o2.a.b(this.inputPass);
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(h.f54056j + "/static/yhxkxy.html");
        intentDateBean.setObject("用户使用协议");
        IntentUtil.getInstance().intentActivity(this.context, intentDateBean);
    }
}
