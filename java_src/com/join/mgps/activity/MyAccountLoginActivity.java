package com.join.mgps.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.dialog.q2;
import com.join.mgps.dto.AccountReginBean;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenTimeOutRequestBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.dto.ShareDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
import com.wufan.user.service.protobuf.j0;
import com.wufan.user.service.protobuf.p0;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.my_account_login_layout)
/* loaded from: classes4.dex */
public class MyAccountLoginActivity extends BaseAccountActivity implements Handler.Callback, PlatformActionListener {
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 3;
    private static final int G = 4;
    private static final int H = 5;
    private AccountReginBean A;
    Context B;
    private boolean C;

    /* renamed from: d  reason: collision with root package name */
    MApplication f35468d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.b f35469e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.c f35470f;
    @StringRes(resName = "net_excption")

    /* renamed from: g  reason: collision with root package name */
    String f35471g;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: h  reason: collision with root package name */
    String f35472h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    EditText f35473i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f35474j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f35475k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    EditText f35476l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    CheckBox f35477m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f35478n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f35479o;

    /* renamed from: r  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35482r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    int f35483s;

    /* renamed from: u  reason: collision with root package name */
    private Handler f35485u;

    /* renamed from: v  reason: collision with root package name */
    com.join.mgps.rpc.b f35486v;

    /* renamed from: w  reason: collision with root package name */
    private long f35487w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    int f35488x;
    @Pref

    /* renamed from: y  reason: collision with root package name */
    PrefDef_ f35489y;

    /* renamed from: p  reason: collision with root package name */
    private int f35480p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f35481q = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f35484t = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f35490z = true;

    /* loaded from: classes4.dex */
    class a implements View.OnFocusChangeListener {
        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                MyAccountLoginActivity.this.f35475k.setVisibility(0);
            } else {
                MyAccountLoginActivity.this.f35475k.setVisibility(4);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                MyAccountLoginActivity.this.f35474j.setVisibility(0);
            } else {
                MyAccountLoginActivity.this.f35474j.setVisibility(4);
            }
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
            MyAccountLoginActivity.this.f35480p = charSequence.length();
            MyAccountLoginActivity.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            MyAccountLoginActivity.this.f35481q = charSequence.length();
            MyAccountLoginActivity.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements CompoundButton.OnCheckedChangeListener {
        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            MyAccountLoginActivity.this.f35489y.loginPermissHasallow().g(Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements q2.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35496a;

        f(int i4) {
            this.f35496a = i4;
        }

        @Override // com.join.mgps.dialog.q2.c
        public void a() {
            MyAccountLoginActivity.this.f35477m.setChecked(true);
            int i4 = this.f35496a;
            if (i4 == 1) {
                AccountBindPhoneNew_.J0(MyAccountLoginActivity.this.B).a(1).startForResult(10001);
            } else if (i4 == 2) {
                MyAccountLoginActivity.this.s0();
            } else if (i4 == 3) {
                MyAccountLoginActivity.this.p0();
            } else if (i4 == 4) {
                MyAccountLoginActivity.this.q0();
            } else if (i4 == 5) {
                MyAccountLoginActivity.this.r0();
            }
        }
    }

    private void authorize(Platform platform) {
        if (System.currentTimeMillis() - this.f35487w <= 1000) {
            return;
        }
        this.f35487w = System.currentTimeMillis();
        if (!com.join.android.app.common.utils.j.j(this)) {
            com.join.mgps.Util.l2.a(this).b("没有网络，请检查网络设置。");
        } else if (platform != null && this.f35490z) {
            this.f35490z = false;
            if (platform.isAuthValid()) {
                platform.removeAccount(true);
            }
            platform.setPlatformActionListener(this);
            platform.SSOSetting(false);
            platform.showUser(null);
            showLoding();
            if (platform.getName().equals(Wechat.NAME)) {
                this.f35482r.setCancelable(true);
                this.f35482r.setCanceledOnTouchOutside(false);
                this.f35490z = true;
                this.C = true;
                return;
            }
            this.f35482r.setCancelable(true);
            this.f35482r.setCanceledOnTouchOutside(false);
            this.C = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (this.f35481q != 0 && this.f35480p != 0) {
            this.f35478n.setEnabled(true);
        } else {
            this.f35478n.setEnabled(false);
        }
    }

    private boolean m0(int i4) {
        if (this.f35477m.isChecked()) {
            return true;
        }
        com.join.mgps.dialog.q2 q2Var = new com.join.mgps.dialog.q2(this, new f(i4));
        q2Var.show();
        q2Var.a("是否同意悟饭游戏厅《用户使用协议》和《免责声明》");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f35469e = com.join.mgps.rpc.impl.a.c0();
        this.f35470f = com.join.mgps.rpc.impl.b.k();
        this.f35486v = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35468d = mApplication;
        mApplication.e(this);
        this.f35478n.setEnabled(false);
        this.f35482r = com.join.mgps.Util.b0.f0(this).x(this);
        h0("登录");
        this.B = this;
        this.f35479o.setText("《悟饭游戏厅用户使用协议》");
        this.f35473i.setOnFocusChangeListener(new a());
        this.f35476l.setOnFocusChangeListener(new b());
        this.f35473i.addTextChangedListener(new c());
        this.f35476l.addTextChangedListener(new d());
        if (this.f35489y.loginPermissHasallow().d().booleanValue()) {
            this.f35477m.setChecked(true);
        }
        this.f35477m.setOnCheckedChangeListener(new e());
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getLogin(String str, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                p0.b l32 = com.wufan.user.service.protobuf.p0.l3();
                l32.Y2(AESUtils.encrypt(str));
                l32.c3(AESUtils.encrypt(str2));
                l32.a3(b3.b.a(this));
                HashMap hashMap = new HashMap();
                hashMap.put(GrantCredentialsPermissionActivity.f67535g, l32.getAccount());
                hashMap.put(GameRoomActivity_.f38656u3, l32.getPassword());
                hashMap.put("appVersion", l32.getAppVersion());
                l32.e3(com.join.mgps.Util.x1.d(hashMap));
                com.wufan.user.service.protobuf.d0 h4 = this.f35470f.h(l32.build());
                boolean z4 = true;
                if (h4 != null && h4.getError() == 200) {
                    if (h4.getData() != null) {
                        h4.getData().getUid();
                        h4.getData().getAccount();
                        h4.getData().i();
                        h4.getData();
                        com.wufan.user.service.protobuf.n0 data = h4.getData();
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(data, this);
                        UtilsMy.v4(this, data.f0());
                        loginSuccess(h4.getData());
                        UtilsMy.Q(this);
                        z4 = false;
                    } else {
                        error(h4.k());
                    }
                } else if (h4 != null && com.join.mgps.Util.g2.i(h4.k())) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void goRegin(AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
        AccountBindPhoneNew_.J0(this.B).a(2).b(accountRegisterThirdwaiRequestBean).startForResult(10001);
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
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyAccountLoginActivity.handleMessage(android.os.Message):boolean");
    }

    void init() {
        if (this.f35488x == 701) {
            v0();
        }
        AccountReginBean accountReginBean = new AccountReginBean();
        this.A = accountReginBean;
        accountReginBean.setSource(this.f35483s);
        this.f35485u = new Handler(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void joinDevice() {
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.B).getUid() + "");
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.B).getToken());
        AccountResultMainBean<JPushJoinDeviceResult> S = this.f35486v.S(linkedMultiValueMap);
        if (S != null && S.getError() == 0 && S.getData().isResult()) {
            S.getData().getMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void login(int i4, String str, String str2, int i5, String str3) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                j0.b n32 = com.wufan.user.service.protobuf.j0.n3();
                n32.e3(com.join.mgps.Util.a.e(str));
                TheThirdPartLoginType theThirdPartLoginType = TheThirdPartLoginType.UNRECOGNIZED;
                if (i4 == 1) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_QQ;
                } else if (i4 == 2) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_WEI_XIN;
                } else if (i4 == 3) {
                    theThirdPartLoginType = TheThirdPartLoginType.T_WEI_BO;
                }
                n32.c3(theThirdPartLoginType);
                n32.Y2(b3.b.a(this));
                HashMap hashMap = new HashMap();
                hashMap.put("uniqueId", n32.l());
                hashMap.put("theThirdPartLoginType", n32.t().name());
                hashMap.put("appVersion", n32.getAppVersion());
                n32.a3(com.join.mgps.Util.x1.d(hashMap));
                com.wufan.user.service.protobuf.d0 b5 = this.f35470f.b(n32.build());
                if (b5 != null) {
                    if (b5.getData() != null && b5.getError() == 200) {
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(b5.getData(), this);
                        UtilsMy.v4(this, b5.getData().f0());
                        loginSuccess(b5.getData(), null);
                        UtilsMy.Q(this);
                        return;
                    } else if (b5.getError() == 1001) {
                        showLodingDismis();
                        AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean = new AccountRegisterThirdwaiRequestBean();
                        accountRegisterThirdwaiRequestBean.setUnique_id(str);
                        accountRegisterThirdwaiRequestBean.setType(i4);
                        accountRegisterThirdwaiRequestBean.setSource(this.f35483s);
                        if (str3 == null) {
                            accountRegisterThirdwaiRequestBean.setAvatar_src("");
                        } else {
                            accountRegisterThirdwaiRequestBean.setAvatar_src(str3);
                        }
                        accountRegisterThirdwaiRequestBean.setGender(1);
                        accountRegisterThirdwaiRequestBean.setNickname(str2);
                        accountRegisterThirdwaiRequestBean.setMac("");
                        com.join.mgps.Util.g2.i("");
                        accountRegisterThirdwaiRequestBean.setDevice_id("");
                        accountRegisterThirdwaiRequestBean.setSign(com.join.mgps.Util.x1.g(accountRegisterThirdwaiRequestBean));
                        goRegin(accountRegisterThirdwaiRequestBean);
                        return;
                    } else {
                        showLodingDismis();
                        error(b5.k());
                        return;
                    }
                }
                error("连接失败，请稍后再试。");
                showLodingDismis();
                return;
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
    @UiThread
    public void loginSuccess(com.wufan.user.service.protobuf.n0 n0Var) {
        this.f35489y.singleGameShowDialog().g("");
        if (!TextUtils.isEmpty(CheckInviteDialogActivity.N)) {
            ((ClipboardManager) getSystemService("clipboard")).setText(CheckInviteDialogActivity.N);
            CheckInviteDialogActivity.N = "";
        }
        showLodingDismis();
        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(n0Var, getApplicationContext());
        ((CommonService_.h2) CommonService_.S2(this.B).extra("accountloginSuccess", "xxx")).a();
        joinDevice();
        setResult(10011);
        this.f35468d.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        startActivity(new Intent(this, MyAccountForgetPassActivity_.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        if (System.currentTimeMillis() - this.f35487w <= 2000) {
            return;
        }
        this.f35487w = System.currentTimeMillis();
        if (this.f35490z) {
            MyAccountLoginActivity_.J0(this).b(this.f35483s).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (i4 == 10001 && i5 == 10001) {
            finish();
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i4) {
        showLodingDismis();
        this.f35490z = true;
        if (i4 == 8) {
            this.f35485u.sendEmptyMessage(2);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        this.f35490z = true;
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
            this.f35485u.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.dialog.d1 d1Var = this.f35482r;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f35482r.dismiss();
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i4, Throwable th) {
        showLodingDismis();
        platform.removeAccount(true);
        this.f35490z = true;
        String simpleName = th.getClass().getSimpleName();
        if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
            showMessage("授权失败");
        } else {
            showMessage("没有安装微信客端，请先安装微信客户端。");
        }
        if (i4 == 8) {
            this.f35485u.sendEmptyMessage(3);
        }
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f35484t = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f35484t = true;
        com.join.mgps.dialog.d1 d1Var = this.f35482r;
        if (d1Var != null && d1Var.isShowing() && this.C) {
            this.f35482r.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        Platform platform = ShareSDK.getPlatform(QQ.NAME);
        if (m0(3)) {
            authorize(platform);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        Platform platform = ShareSDK.getPlatform(Wechat.NAME);
        if (m0(4)) {
            authorize(platform);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        Platform platform = ShareSDK.getPlatform(SinaWeibo.NAME);
        if (m0(5)) {
            authorize(platform);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        String obj = this.f35473i.getText().toString();
        String obj2 = this.f35476l.getText().toString();
        if (Pattern.matches("^[\\u4e00-\\u9fa5a-zA-Z0-9_]*$", obj) && com.join.mgps.Util.j2.a(obj) >= 1 && com.join.mgps.Util.j2.a(obj) <= 24) {
            if (obj2.length() <= 16 && obj2.length() >= 6) {
                if (com.join.mgps.Util.g2.i(obj) && com.join.mgps.Util.g2.i(obj2) && m0(2)) {
                    getLogin(obj, obj2);
                    return;
                }
                return;
            }
            com.join.mgps.Util.l2.a(this).b("密码格式有误，输入6至16位字母或数字");
            return;
        }
        com.join.mgps.Util.l2.a(this).b("用户名格式有误，输入1至24位字母或数字或汉字");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void shengming() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54056j + "/static/wf_mianze.html");
        intentDateBean.setObject("免责声明");
        IntentUtil.getInstance().intentActivity(this.B, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.dialog.d1 d1Var = this.f35482r;
        if (d1Var == null || d1Var.isShowing() || !this.f35484t) {
            return;
        }
        this.f35482r.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var = this.f35482r;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f35482r.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        if (m0(1)) {
            AccountBindPhoneNew_.J0(this).a(1).startForResult(10001);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
                if (accountData == null) {
                    return;
                }
                AccountTokenTimeOutRequestBean accountTokenTimeOutRequestBean = new AccountTokenTimeOutRequestBean();
                accountTokenTimeOutRequestBean.setUid(accountData.getUid());
                accountTokenTimeOutRequestBean.setDevice_id("");
                accountTokenTimeOutRequestBean.setToke(accountData.getToken());
                accountTokenTimeOutRequestBean.setSign(com.join.mgps.Util.x1.g(accountTokenTimeOutRequestBean));
                GameWorldResponse<AccountResultMainBean> j4 = this.f35486v.j(accountTokenTimeOutRequestBean.getParams());
                if (j4 == null || j4.getError() != 801) {
                    return;
                }
                showToast("你的登录已失效，请重新登录。");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void xieyi() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54056j + "/static/yhxkxy.html");
        intentDateBean.setObject("用户使用协议");
        IntentUtil.getInstance().intentActivity(this.B, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void loginSuccess(com.wufan.user.service.protobuf.n0 n0Var, RewardBean rewardBean) {
        if (!TextUtils.isEmpty(CheckInviteDialogActivity.N)) {
            ((ClipboardManager) getSystemService("clipboard")).setText(CheckInviteDialogActivity.N);
            CheckInviteDialogActivity.N = "";
        }
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(n0Var, getApplicationContext());
        joinDevice();
        int i4 = this.f35483s;
        if (i4 != 1 && i4 != 3 && i4 != 4) {
            ((CommonService_.h2) CommonService_.S2(this.B).extra("accountloginSuccess", "xxx")).a();
            showLodingDismis();
            finish();
            return;
        }
        finish();
    }
}
