package com.join.mgps.activity.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.CheckInviteDialogActivity;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountOnekeyLoginRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.rpc.h;
import com.join.mgps.service.CommonService_;
import com.netease.nis.quicklogin.QuickLogin;
import com.netease.nis.quicklogin.helper.UnifyUiConfig;
import com.netease.nis.quicklogin.listener.ClickEventListener;
import com.netease.nis.quicklogin.listener.LoginListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.utils.LoginUiHelper;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.util.LinkedMultiValueMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.wufunlogin_splash_activity)
/* loaded from: classes4.dex */
public class LoginSplashActivity extends AppCompatActivity {
    private String TAG = "LoginSplashActivity";
    private AlertDialog alertDialog;
    MApplication application;
    @ViewById
    View close;
    Context context;
    @Extra
    String gameId;
    @Extra
    boolean isBackFromOtherLogin;
    @Extra
    boolean isForcedLogin;
    @ViewById
    View login;
    Activity mActivity;
    @Pref
    PrefDef_ prefDef;
    QuickLogin quickLogin;
    com.join.mgps.rpc.b rpcAccountClient;

    /* JADX INFO: Access modifiers changed from: private */
    public Ext getExt(Ext ext) {
        return ext == null ? new Ext() : ext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$gotoOneKeyLogin$0(Context context, View view) {
        LoginMainActivity_.intent(this).gameId(this.gameId).isForcedLogin(this.isForcedLogin).start();
        quitActivity();
        p.l(context).O1(Event.clickOtherLogin, getExt(null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$gotoOneKeyLogin$1(Context context, View view) {
        quitActivity();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void originLogin() {
        overridePendingTransition(0, 0);
        LoginMainActivity_.intent(this).gameId(this.gameId).isForcedLogin(this.isForcedLogin).start();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        MApplication mApplication = (MApplication) getApplication();
        this.application = mApplication;
        mApplication.e(this);
        this.mActivity = this;
        this.context = this;
        this.quickLogin = MApplication.n();
        this.rpcAccountClient = com.join.mgps.rpc.impl.a.c0();
        p.l(this.context).O1(Event.userLogin, getExt(null));
        ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(this.prefDef.availableLoginMethod().d(), JsonMapper.getInstance().createCollectionType(ArrayList.class, String.class));
        if (MApplication.E1 && arrayList != null && arrayList.contains("ONE_CLICK")) {
            quitActivity();
            gotoOneKeyLogin();
        } else if (this.isForcedLogin) {
            quitActivity();
            finish();
        } else {
            originLogin();
        }
    }

    @UiThread
    public void dismissLoadingDialog() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        l2.a(this).b(str);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    void gotoOneKeyLogin() {
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) getResources().getDimension(R.dimen.wdp909);
        layoutParams.addRule(14);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(Color.parseColor("#408DFF"));
        textView.setText("其他方式登录");
        textView.setTextSize(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp24)));
        ImageView imageView = new ImageView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) getResources().getDimension(R.dimen.wdp50), (int) getResources().getDimension(R.dimen.wdp50));
        layoutParams2.topMargin = (int) getResources().getDimension(R.dimen.wdp40);
        layoutParams2.leftMargin = (int) getResources().getDimension(R.dimen.wdp24);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(R.drawable.back_f1);
        imageView.setPadding((int) getResources().getDimension(R.dimen.wdp14), (int) getResources().getDimension(R.dimen.wdp9), (int) getResources().getDimension(R.dimen.wdp14), (int) getResources().getDimension(R.dimen.wdp9));
        ImageView imageView2 = new ImageView(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) getResources().getDimension(R.dimen.wdp50), (int) getResources().getDimension(R.dimen.wdp50));
        layoutParams3.topMargin = (int) getResources().getDimension(R.dimen.wdp40);
        layoutParams3.leftMargin = (int) getResources().getDimension(R.dimen.wdp24);
        imageView2.setLayoutParams(layoutParams3);
        imageView2.setBackgroundColor(getResources().getColor(R.color.white));
        imageView2.setPadding((int) getResources().getDimension(R.dimen.wdp14), (int) getResources().getDimension(R.dimen.wdp9), (int) getResources().getDimension(R.dimen.wdp14), (int) getResources().getDimension(R.dimen.wdp9));
        UnifyUiConfig.Builder protocolText = new UnifyUiConfig.Builder().setStatusBarColor(getResources().getColor(R.color.white)).setStatusBarDarkColor(true).setHideNavigation(true).setLogoIconDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_onekey_login, null)).setLogoWidth(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp164))).setLogoHeight(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp164))).setLogoTopYOffset(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp350))).setMaskNumberColor(Color.parseColor("#333333")).setMaskNumberDpSize(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp52))).setMaskNumberTopYOffset(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp540))).setSloganColor(Color.parseColor("#929292")).setSloganDpSize(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp24))).setSloganTopYOffset(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp610))).setLoginBtnText("一键登录").setLoginBtnTextDpSize(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp32))).setLoginBtnTextColor(getResources().getColor(R.color.white)).setLoginBtnWidth(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp568))).setLoginBtnHeight(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp88))).setLoginBtnBackgroundRes("shape_btn_onekey_login").setLoginBtnTopYOffset(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp795))).addCustomView(textView, "otherLogin", 0, new LoginUiHelper.CustomViewListener() { // from class: com.join.mgps.activity.login.b
            @Override // com.netease.nis.quicklogin.utils.LoginUiHelper.CustomViewListener
            public final void onClick(Context context, View view) {
                LoginSplashActivity.this.lambda$gotoOneKeyLogin$0(context, view);
            }
        }).setHidePrivacyCheckBox(false).setCheckBoxGravity(48).setPrivacyState(false).setCheckedImageName("checkbox_round_blue_selected").setUnCheckedImageName("checkbox_round_blue_default").setPrivacyCheckBoxHeight(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp28))).setPrivacyCheckBoxWidth(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp28))).setPrivacyTextMarginLeft(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp6))).setPrivacyBottomYOffset(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp132))).setPrivacyTextColor(Color.parseColor("#494949")).setPrivacyProtocolColor(Color.parseColor("#408DFF")).setPrivacyDpSize(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp24))).setPrivacyMarginLeft(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp100))).setPrivacyMarginRight(com.join.android.app.component.optimizetext.a.n((int) getResources().getDimension(R.dimen.wdp100))).setPrivacyTextGravityCenter(false).setPrivacyTextStart("已阅读并同意").setPrivacyTextEnd("").setProtocolText("《用户协议》");
        UnifyUiConfig.Builder protocol2Text = protocolText.setProtocolLink(h.f54056j + "/static/yhxkxy.html").setProtocol2Text("《隐私政策》");
        UnifyUiConfig.Builder clickEventListener = protocol2Text.setProtocol2Link(h.f54056j + com.constant.b.f9474e).setActivityTranslateAnimation(this.isBackFromOtherLogin ? "anim_onekey_login_in2" : "anim_onekey_login_in", "anim_onekey_login_out").setLoginListener(new LoginListener() { // from class: com.join.mgps.activity.login.LoginSplashActivity.2
            @Override // com.netease.nis.quicklogin.listener.LoginListener
            public boolean onDisagreePrivacy(TextView textView2, Button button) {
                Toast makeText = Toast.makeText(LoginSplashActivity.this.context, "请点击同意隐私协议", 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                return true;
            }
        }).setBackPressedAvailable(!this.isForcedLogin).setClickEventListener(new ClickEventListener() { // from class: com.join.mgps.activity.login.LoginSplashActivity.1
            @Override // com.netease.nis.quicklogin.listener.ClickEventListener
            public void onClick(int i4, int i5) {
                if (i4 == 4) {
                    MApplication.E1 = false;
                    p.l(LoginSplashActivity.this.context).O1(Event.clickFastLoginButton, LoginSplashActivity.this.getExt(null));
                } else if (i4 == 1) {
                    LoginSplashActivity.this.quickLogin.setPrivacyState(true);
                }
            }
        });
        if (!this.isForcedLogin) {
            clickEventListener.addCustomView(imageView, "ivBack", 0, new LoginUiHelper.CustomViewListener() { // from class: com.join.mgps.activity.login.a
                @Override // com.netease.nis.quicklogin.utils.LoginUiHelper.CustomViewListener
                public final void onClick(Context context, View view) {
                    LoginSplashActivity.this.lambda$gotoOneKeyLogin$1(context, view);
                }
            });
        } else {
            clickEventListener.addCustomView(imageView2, "ivBack", 0, null);
        }
        this.quickLogin.setUnifyUiConfig(clickEventListener.build(this.context));
        this.quickLogin.onePass(new QuickLoginTokenListener() { // from class: com.join.mgps.activity.login.LoginSplashActivity.3
            @Override // com.netease.nis.quicklogin.listener.QuickLoginTokenListener
            public void onCancelGetToken() {
                LoginSplashActivity.this.quitActivity();
                LoginSplashActivity.this.finish();
            }

            @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
            public void onGetTokenError(String str, String str2) {
                LoginSplashActivity.this.quitActivity();
                LoginSplashActivity.this.originLogin();
                LoginSplashActivity.this.finish();
            }

            @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
            public void onGetTokenSuccess(String str, String str2) {
                LoginSplashActivity loginSplashActivity = LoginSplashActivity.this;
                loginSplashActivity.oneKeyLogin(str, str2, loginSplashActivity.quickLogin);
            }
        });
        p.l(this.context).O1(Event.welcomePageShow, getExt(null));
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
        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(n0Var, getApplicationContext());
        ((CommonService_.h2) CommonService_.S2(this.context).extra("accountloginSuccess", "xxx")).a();
        joinDevice();
        setResult(10011);
        finish();
        IntentUtil.getInstance().checkRealNameAndIntent(this.context, n0Var, "login", this.gameId);
        this.application.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void oneKeyLogin(String str, String str2, QuickLogin quickLogin) {
        if (j.j(this)) {
            try {
                AccountOnekeyLoginRequestBean accountOnekeyLoginRequestBean = new AccountOnekeyLoginRequestBean();
                accountOnekeyLoginRequestBean.setMobile("");
                accountOnekeyLoginRequestBean.setVersion(n.n(this).z());
                accountOnekeyLoginRequestBean.setDeviceId(n.n(this).i());
                accountOnekeyLoginRequestBean.setProvider("YI_DUN");
                accountOnekeyLoginRequestBean.setParams(new AccountOnekeyLoginRequestBean.Params(str, str2));
                com.join.mgps.rpc.impl.j.b().a().g(accountOnekeyLoginRequestBean.getParamsMap()).enqueue(new Callback<AccountResultMainBean<AccountLoginresultData>>() { // from class: com.join.mgps.activity.login.LoginSplashActivity.4
                    @Override // retrofit2.Callback
                    public void onFailure(Call<AccountResultMainBean<AccountLoginresultData>> call, Throwable th) {
                        LoginSplashActivity.this.error("连接失败，请使用账号登录。");
                        LoginSplashActivity.this.dismissLoadingDialog();
                        LoginSplashActivity.this.quitActivity();
                        LoginSplashActivity.this.originLogin();
                        Ext ext = new Ext();
                        ext.setPosition("0");
                        p.l(LoginSplashActivity.this.context).O1(Event.quickLoginResult, LoginSplashActivity.this.getExt(ext));
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(Call<AccountResultMainBean<AccountLoginresultData>> call, Response<AccountResultMainBean<AccountLoginresultData>> response) {
                        AccountResultMainBean<AccountLoginresultData> body = response.body();
                        if (body != null && body.getError() == 0) {
                            if (body.getData().isIs_success()) {
                                LoginSplashActivity.this.error("登陆成功");
                                n0 a5 = b3.a.a(body.getData().getUser_info());
                                AccountUtil_.getInstance_(LoginSplashActivity.this.getApplicationContext()).saveAccountData(a5, LoginSplashActivity.this.mActivity);
                                UtilsMy.v4(LoginSplashActivity.this.mActivity, body.getData().getGame_list_permission());
                                UtilsMy.Q(LoginSplashActivity.this.mActivity);
                                LoginSplashActivity.this.loginSuccess(a5);
                                LoginSplashActivity.this.dismissLoadingDialog();
                                LoginSplashActivity.this.quitActivity();
                                Ext ext = new Ext();
                                ext.setPosition("1");
                                p.l(LoginSplashActivity.this.context).O1(Event.quickLoginResult, LoginSplashActivity.this.getExt(ext));
                                LoginSplashActivity.this.finish();
                                return;
                            }
                            LoginSplashActivity.this.error("一键登录失败，请使用账号登录。");
                            LoginSplashActivity.this.dismissLoadingDialog();
                            LoginSplashActivity.this.quitActivity();
                            LoginSplashActivity.this.originLogin();
                            Ext ext2 = new Ext();
                            ext2.setPosition("0");
                            p.l(LoginSplashActivity.this.context).O1(Event.quickLoginResult, LoginSplashActivity.this.getExt(ext2));
                            LoginSplashActivity.this.finish();
                            return;
                        }
                        LoginSplashActivity.this.error("连接失败，请使用账号登录。");
                        LoginSplashActivity.this.dismissLoadingDialog();
                        LoginSplashActivity.this.quitActivity();
                        LoginSplashActivity.this.originLogin();
                        Ext ext3 = new Ext();
                        ext3.setPosition("0");
                        p.l(LoginSplashActivity.this.context).O1(Event.quickLoginResult, LoginSplashActivity.this.getExt(ext3));
                        LoginSplashActivity.this.finish();
                    }
                });
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                Ext ext = new Ext();
                ext.setPosition("0");
                p.l(this.context).O1(Event.quickLoginResult, getExt(ext));
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void quitActivity() {
        QuickLogin quickLogin = this.quickLogin;
        if (quickLogin != null) {
            quickLogin.quitActivity();
        }
    }

    @UiThread
    public void showLoadingDialog() {
        if (this.alertDialog == null) {
            AlertDialog create = new AlertDialog.Builder(this).create();
            this.alertDialog = create;
            create.getWindow().setBackgroundDrawable(new ColorDrawable());
            this.alertDialog.setCancelable(false);
            this.alertDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.join.mgps.activity.login.LoginSplashActivity.5
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                    return i4 == 84 || i4 == 4;
                }
            });
        }
        this.alertDialog.show();
        this.alertDialog.setContentView(R.layout.loading_alert);
        this.alertDialog.setCanceledOnTouchOutside(false);
    }
}
