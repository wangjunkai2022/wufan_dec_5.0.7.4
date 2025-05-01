package com.join.mgps.activity.login;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
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
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountOnekeyLoginRequestBean;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.dto.ShareDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.rpc.c;
import com.join.mgps.rpc.h;
import com.join.mgps.service.CommonService_;
import com.netease.nis.quicklogin.QuickLogin;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.d0;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
import com.wufan.user.service.protobuf.j0;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
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
import p1.f;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.loginmain_activity)
/* loaded from: classes4.dex */
public class LoginMainActivity extends AppCompatActivity implements Handler.Callback, PlatformActionListener {
    private static final int MSG_AUTH_CANCEL = 2;
    private static final int MSG_AUTH_COMPLETE = 4;
    private static final int MSG_AUTH_ERROR = 3;
    private static final int MSG_SMSSDK_CALLBACK = 1;
    private static final int MSG_USERID_FOUND = 5;
    MApplication application;
    @ViewById
    View cancleLogin;
    @ViewById
    CheckBox checkBox;
    @ViewById
    View clear;
    Context context;
    private d1 dialog;
    @Extra
    String gameId;
    private Handler handler;
    private boolean hasFinished;
    @Extra
    int intentFrom;
    @Extra
    boolean isForcedLogin;
    private boolean isWeichatLoding;
    private long lastClick;
    @ViewById
    View nextStep;
    @ViewById
    View otherLogin;
    @ViewById
    EditText phoneNumber;
    @Pref
    PrefDef_ prefDef;
    com.join.mgps.rpc.b rpcAccountClient;
    c rpcAccountClientV2;
    @ViewById
    TextView title;
    @ViewById
    TextView xieyi;
    long clickTime = 0;
    private boolean alowLogin = true;
    boolean showDialog = true;

    private void authorize(Platform platform) {
        if (System.currentTimeMillis() - this.lastClick <= 1000) {
            return;
        }
        this.lastClick = System.currentTimeMillis();
        if (!j.j(this)) {
            l2.a(this).b("没有网络，请检查网络设置。");
        } else if (platform != null && this.alowLogin) {
            this.alowLogin = false;
            if (platform.isAuthValid()) {
                platform.removeAccount(true);
            }
            platform.setPlatformActionListener(this);
            platform.SSOSetting(false);
            platform.showUser(null);
            showLoding();
            if (platform.getName().equals(Wechat.NAME)) {
                this.dialog.setCancelable(true);
                this.dialog.setCanceledOnTouchOutside(false);
                this.alowLogin = true;
                this.isWeichatLoding = true;
                return;
            }
            this.dialog.setCancelable(true);
            this.dialog.setCanceledOnTouchOutside(false);
            this.isWeichatLoding = false;
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

    private Ext getExt(Ext ext) {
        return ext == null ? new Ext() : ext;
    }

    public static boolean isPhoneNumber(String str) {
        Pattern.compile("(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}");
        return Pattern.matches("(1[0-9][0-9]|15[0-9]|18[0-9])\\d{8}", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loginWithPwd(final String str) {
        LoginUserStatuRequest loginUserStatuRequest = new LoginUserStatuRequest();
        loginUserStatuRequest.getData(this.context);
        loginUserStatuRequest.setLoginId(str);
        loginUserStatuRequest.setLoginType(6);
        showLoding();
        com.join.mgps.rpc.impl.j.b().a().f(loginUserStatuRequest).enqueue(new Callback<LoginResultMain<LoginUserStatuDataBean>>() { // from class: com.join.mgps.activity.login.LoginMainActivity.4
            @Override // retrofit2.Callback
            public void onFailure(Call<LoginResultMain<LoginUserStatuDataBean>> call, Throwable th) {
                LoginMainActivity.this.showMessage("网络不给力，请检查网络设置。");
                LoginMainActivity.this.showLodingDismis();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<LoginResultMain<LoginUserStatuDataBean>> call, Response<LoginResultMain<LoginUserStatuDataBean>> response) {
                LoginResultMain<LoginUserStatuDataBean> body = response.body();
                if (body != null && body.getError() == 0) {
                    LoginUserStatuDataBean data = body.getData();
                    if (data != null) {
                        if (data.isNewMembers()) {
                            if (data.isMobilePhone()) {
                                LoginInputPassActivity_.intent(LoginMainActivity.this.context).from(1).phoneNumber(str.trim()).gameId(LoginMainActivity.this.gameId).isForcedLogin(LoginMainActivity.this.isForcedLogin).start();
                            } else {
                                LoginMainActivity.this.showMessage("用户名不存在，请先用手机号注册账号！");
                            }
                        } else if (data.isMobilePhone()) {
                            LoginInputPassActivity_.intent(LoginMainActivity.this.context).from(4).phoneNumber(str.trim()).isSetPwd(data.isSetPwd()).isForcedLogin(LoginMainActivity.this.isForcedLogin).gameId(LoginMainActivity.this.gameId).start();
                        } else {
                            LoginInputPassActivity_.intent(LoginMainActivity.this.context).from(6).phoneNumber(str.trim()).gameId(LoginMainActivity.this.gameId).isForcedLogin(LoginMainActivity.this.isForcedLogin).start();
                        }
                    }
                } else if (body != null && body.getError() == -1) {
                    LoginMainActivity.this.showMessage(body.getMsg());
                }
                LoginMainActivity.this.showLodingDismis();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.context = this;
        p.l(this).O1(Event.otherLoginPageShow, getExt(null));
        MApplication mApplication = (MApplication) getApplication();
        this.application = mApplication;
        mApplication.e(this);
        this.nextStep.setEnabled(false);
        if (Build.BRAND.toLowerCase().contains("samsung")) {
            this.phoneNumber.setRawInputType(1);
        } else {
            this.phoneNumber.setRawInputType(2);
        }
        this.dialog = b0.f0(this).x(this);
        this.rpcAccountClient = com.join.mgps.rpc.impl.a.c0();
        this.rpcAccountClientV2 = com.join.mgps.rpc.impl.b.k();
        this.handler = new Handler(this);
        this.phoneNumber.addTextChangedListener(new TextWatcher() { // from class: com.join.mgps.activity.login.LoginMainActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                if (charSequence.length() == 0) {
                    LoginMainActivity.this.nextStep.setEnabled(false);
                    LoginMainActivity.this.clear.setVisibility(8);
                    return;
                }
                LoginMainActivity.this.clear.setVisibility(0);
                LoginMainActivity.this.nextStep.setEnabled(true);
            }
        });
        o.g(this.phoneNumber);
        this.phoneNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.join.mgps.activity.login.LoginMainActivity.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                if (i4 == 4) {
                    LoginMainActivity.this.nextStep();
                    return false;
                }
                return false;
            }
        });
        LoginCfgsBean loginCfgsBean = MApplication.S;
        if ((loginCfgsBean != null && loginCfgsBean.getLogin_is_allow_skip() == 0) || g2.h(this.gameId)) {
            this.cancleLogin.setVisibility(4);
        }
        showKeyborad(this.phoneNumber);
        this.phoneNumber.setText(this.prefDef.lastLoginAccount().d());
        TextUtils.isEmpty("wufun");
        this.xieyi.setText("用户协议");
        this.checkBox.setText("已阅读并同意悟饭");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        clearEditTextState(this.phoneNumber);
        delayFinish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void cancle() {
        this.otherLogin.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void cancleLogin() {
        LoginCfgsBean loginCfgsBean;
        finish();
        if (g2.i(this.gameId) && (loginCfgsBean = MApplication.S) != null && loginCfgsBean.getLogin_is_allow_skip() == 1) {
            UtilsMy.W3(this.context, f.K().F(this.gameId), "login");
        }
        this.application.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkPhoneLogin(String str, String str2, QuickLogin quickLogin, final String str3) {
        if (j.j(this)) {
            AccountOnekeyLoginRequestBean accountOnekeyLoginRequestBean = new AccountOnekeyLoginRequestBean();
            accountOnekeyLoginRequestBean.setMobile(str3);
            accountOnekeyLoginRequestBean.setVersion(n.n(this).z());
            accountOnekeyLoginRequestBean.setDeviceId(n.n(this).i());
            accountOnekeyLoginRequestBean.setProvider("YI_DUN");
            accountOnekeyLoginRequestBean.setParams(new AccountOnekeyLoginRequestBean.Params(str, str2));
            com.join.mgps.rpc.impl.j.b().a().d(accountOnekeyLoginRequestBean.getParamsMap()).enqueue(new Callback<AccountResultMainBean<AccountLoginresultData>>() { // from class: com.join.mgps.activity.login.LoginMainActivity.5
                @Override // retrofit2.Callback
                public void onFailure(Call<AccountResultMainBean<AccountLoginresultData>> call, Throwable th) {
                    LoginMainActivity.this.loginWithPwd(str3);
                    Ext ext = new Ext();
                    ext.setPosition("0");
                    p.l(LoginMainActivity.this.context).O1(Event.tokenLoginResult, ext);
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<AccountResultMainBean<AccountLoginresultData>> call, Response<AccountResultMainBean<AccountLoginresultData>> response) {
                    AccountResultMainBean<AccountLoginresultData> body = response.body();
                    if (body == null || body.getError() != 0) {
                        LoginMainActivity.this.loginWithPwd(str3);
                        Ext ext = new Ext();
                        ext.setPosition("0");
                        p.l(LoginMainActivity.this.context).O1(Event.tokenLoginResult, ext);
                    } else if (body.getData().isIs_success()) {
                        LoginMainActivity.this.error("登陆成功");
                        n0 a5 = b3.a.a(body.getData().getUser_info());
                        AccountUtil_.getInstance_(LoginMainActivity.this.getApplicationContext()).saveAccountData(a5, LoginMainActivity.this.context);
                        UtilsMy.v4(LoginMainActivity.this.context, body.getData().getGame_list_permission());
                        UtilsMy.Q(LoginMainActivity.this.context);
                        Ext ext2 = new Ext();
                        ext2.setPosition("1");
                        p.l(LoginMainActivity.this.context).O1(Event.tokenLoginResult, ext2);
                        LoginMainActivity.this.loginSuccess(a5, body.getData().getReward());
                        LoginMainActivity.this.showLodingDismis();
                    } else {
                        Ext ext3 = new Ext();
                        ext3.setPosition("0");
                        p.l(LoginMainActivity.this.context).O1(Event.tokenLoginResult, ext3);
                        LoginMainActivity.this.loginWithPwd(str3);
                    }
                }
            });
            return;
        }
        error("没有网络，请先检查网络。");
        showLodingDismis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void clear() {
        this.phoneNumber.setText("");
    }

    void clearEditTextState(EditText editText) {
        editText.clearFocus();
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 300)
    public void delayFinish() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        l2.a(this).b(str);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.hasFinished) {
            return;
        }
        this.hasFinished = true;
        super.finish();
        if (this.isForcedLogin && AccountUtil_.getInstance_(this.context).isTourist()) {
            LoginSplashActivity_.intent(this.context).gameId(this.gameId).isForcedLogin(this.isForcedLogin).isBackFromOtherLogin(true).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void goRegin(AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
        LoginInputPassActivity_.intent(this.context).from(5).thirdRequestbean(accountRegisterThirdwaiRequestBean).gameId(this.gameId).isForcedLogin(this.isForcedLogin).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[LOOP:2: B:27:0x0073->B:65:0x0073, LOOP_START, PHI: r1 r7 
      PHI: (r1v12 java.lang.String) = (r1v3 java.lang.String), (r1v13 java.lang.String) binds: [B:26:0x0071, B:65:0x0073] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v11 int) = (r7v2 int), (r7v12 int) binds: [B:26:0x0071, B:65:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.login.LoginMainActivity.handleMessage(android.os.Message):boolean");
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
    @Background
    public void login(int i4, String str, String str2, int i5, String str3) {
        if (j.j(this)) {
            try {
                j0.b n32 = j0.n3();
                TheThirdPartLoginType theThirdPartLoginType = TheThirdPartLoginType.UNRECOGNIZED;
                if (i4 == 1) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_QQ;
                }
                if (i4 == 2) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_WEI_XIN;
                }
                if (i4 == 3) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_WEI_BO;
                }
                n32.e3(com.join.mgps.Util.a.e(str));
                n32.c3(theThirdPartLoginType);
                n32.Y2(b3.b.a(this));
                HashMap hashMap = new HashMap();
                hashMap.put("uniqueId", n32.l());
                hashMap.put("theThirdPartLoginType", n32.t().name());
                hashMap.put("appVersion", n32.getAppVersion());
                n32.a3(x1.d(hashMap));
                d0 b5 = this.rpcAccountClientV2.b(n32.build());
                if (b5 != null && b5.getError() == 200) {
                    if (b5.m()) {
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(b5.getData(), this);
                        UtilsMy.v4(this, b5.getData().f0());
                        loginSuccess(b5.getData(), null);
                        UtilsMy.Q(this);
                        p.l(this.context).O1(Event.thirdPartyLoginSuccess, new Ext());
                        return;
                    }
                    showLodingDismis();
                    error(b5.k());
                    return;
                } else if (b5.getError() == 10001) {
                    showLodingDismis();
                    AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean = new AccountRegisterThirdwaiRequestBean();
                    accountRegisterThirdwaiRequestBean.setUnique_id(str);
                    accountRegisterThirdwaiRequestBean.setType(i4);
                    accountRegisterThirdwaiRequestBean.setSource(this.intentFrom);
                    String o4 = MApplication.f1497x.o();
                    if (g2.h(o4) || "null".equals(o4)) {
                        accountRegisterThirdwaiRequestBean.setShare_code("");
                    }
                    if (str3 == null) {
                        accountRegisterThirdwaiRequestBean.setAvatar_src("");
                    } else {
                        accountRegisterThirdwaiRequestBean.setAvatar_src(str3);
                    }
                    accountRegisterThirdwaiRequestBean.setGender(1);
                    accountRegisterThirdwaiRequestBean.setNickname(str2);
                    accountRegisterThirdwaiRequestBean.setMac("");
                    g2.i("");
                    accountRegisterThirdwaiRequestBean.setDevice_id("");
                    accountRegisterThirdwaiRequestBean.setSign(x1.g(accountRegisterThirdwaiRequestBean));
                    Random random = new Random();
                    accountRegisterThirdwaiRequestBean.setNickname(str2 + random.nextInt(1000));
                    goRegin(accountRegisterThirdwaiRequestBean);
                    return;
                } else {
                    if (g2.i(b5.k())) {
                        error(b5.k());
                    } else {
                        error("登录失败，请稍后再试。");
                    }
                    showLodingDismis();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showMessage("登录失败");
                showLodingDismis();
                return;
            }
        }
        showMessage("没有网络，请先检查网络。");
        showLodingDismis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loginQQLayout() {
        Ext ext = new Ext();
        ext.setPosition("0");
        p.l(this.context).O1(Event.clickThirdpartyLogin, ext);
        authorize(ShareSDK.getPlatform(QQ.NAME));
        this.otherLogin.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void loginSuccess(n0 n0Var, RewardBean rewardBean) {
        if (!TextUtils.isEmpty(CheckInviteDialogActivity.N)) {
            ((ClipboardManager) getSystemService("clipboard")).setText(CheckInviteDialogActivity.N);
            CheckInviteDialogActivity.N = "";
        }
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(n0Var, getApplicationContext());
        joinDevice();
        int i4 = this.intentFrom;
        if (i4 != 1 && i4 != 3 && i4 != 4) {
            ((CommonService_.h2) CommonService_.S2(this.context).extra("accountloginSuccess", "xxx")).a();
            showLodingDismis();
            this.application.f();
            finish();
            IntentUtil.getInstance().checkRealNameAndIntent(this.context, n0Var, "login", this.gameId);
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loginWechatLayout() {
        Ext ext = new Ext();
        ext.setPosition("1");
        p.l(this.context).O1(Event.clickThirdpartyLogin, ext);
        authorize(ShareSDK.getPlatform(Wechat.NAME));
        this.otherLogin.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loginWeiboLayout() {
        Ext ext = new Ext();
        ext.setPosition("2");
        p.l(this.context).O1(Event.clickThirdpartyLogin, ext);
        authorize(ShareSDK.getPlatform(SinaWeibo.NAME));
        this.otherLogin.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void nextStep() {
        if (checkFastClick()) {
            return;
        }
        if (!this.checkBox.isChecked()) {
            Toast makeText = Toast.makeText(this, "请点击同意协议", 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return;
        }
        final String obj = this.phoneNumber.getText().toString();
        if (g2.h(obj.trim())) {
            l2.a(this.context).b("请输入手机号/用户名");
            return;
        }
        this.prefDef.lastLoginAccount().g(obj);
        ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(this.prefDef.availableLoginMethod().d(), JsonMapper.getInstance().createCollectionType(ArrayList.class, String.class));
        final QuickLogin i4 = MApplication.i();
        showLoding();
        if (isPhoneNumber(obj) && i4 != null && !j.k(this.context) && (arrayList == null || arrayList.contains("MOBILE_CHECK"))) {
            i4.getToken(obj, new QuickLoginTokenListener() { // from class: com.join.mgps.activity.login.LoginMainActivity.3
                @Override // com.netease.nis.quicklogin.listener.QuickLoginTokenListener
                public void onCancelGetToken() {
                    LoginMainActivity.this.finish();
                }

                @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
                public void onGetTokenError(String str, String str2) {
                    Ext ext = new Ext();
                    ext.setPosition("0");
                    p.l(LoginMainActivity.this.context).O1(Event.tokenLoginResult, ext);
                    LoginMainActivity.this.loginWithPwd(obj);
                }

                @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
                public void onGetTokenSuccess(String str, String str2) {
                    LoginMainActivity.this.checkPhoneLogin(str, str2, i4, obj);
                }
            });
        } else {
            loginWithPwd(obj);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i4) {
        showLodingDismis();
        this.alowLogin = true;
        if (i4 == 8) {
            this.handler.sendEmptyMessage(2);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        this.alowLogin = true;
        showLodingDismis();
        if (i4 == 8) {
            String userId = platform.getDb().getUserId();
            String userName = platform.getDb().getUserName();
            String name = platform.getName();
            ShareDataBean shareDataBean = new ShareDataBean();
            shareDataBean.setType(name);
            shareDataBean.setUserId(userId);
            shareDataBean.setRes(hashMap);
            shareDataBean.setUserIcon(platform.getDb().getUserIcon());
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append("   ");
            sb.append(userName);
            Message message = new Message();
            message.what = 4;
            message.obj = shareDataBean;
            this.handler.sendMessage(message);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i4, Throwable th) {
        showLodingDismis();
        platform.removeAccount(true);
        this.alowLogin = true;
        String simpleName = th.getClass().getSimpleName();
        if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
            showMessage("授权失败");
        } else {
            showMessage("没有安装微信客端，请先安装微信客户端。");
        }
        if (i4 == 8) {
            this.handler.sendEmptyMessage(3);
        }
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.showDialog = false;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void otherLogin() {
        this.otherLogin.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void shengming() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(h.f54056j + com.constant.b.f9474e);
        intentDateBean.setObject("免责声明");
        IntentUtil.getInstance().intentActivity(this.context, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void showKeyborad(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(0, 2);
        editText.setSelection(editText.getText().toString().length());
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
        d1 d1Var;
        if (this.hasFinished || isDestroyed() || (d1Var = this.dialog) == null || !d1Var.isShowing() || isFinishing()) {
            return;
        }
        this.dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void toOtherLogin() {
        if (!this.checkBox.isChecked()) {
            Toast makeText = Toast.makeText(this, "请点击同意协议", 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return;
        }
        this.otherLogin.setVisibility(0);
        clearEditTextState(this.phoneNumber);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void xieyi() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(h.f54056j + "/static/yhxkxy.html");
        intentDateBean.setObject("用户使用协议");
        IntentUtil.getInstance().intentActivity(this.context, intentDateBean);
    }
}
