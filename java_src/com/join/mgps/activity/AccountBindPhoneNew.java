package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.dto.AccountAnonymousReginRequest;
import com.join.mgps.dto.AccountChangeNickNameRequest;
import com.join.mgps.dto.AccountCheckReginCodeRequest;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.wufan.user.service.protobuf.enumeration.ContentType;
import com.wufan.user.service.protobuf.enumeration.SourceType;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
import com.wufan.user.service.protobuf.h0;
import com.wufan.user.service.protobuf.l0;
import com.wufan.user.service.protobuf.x;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.bind_phone_activity_new)
/* loaded from: classes4.dex */
public class AccountBindPhoneNew extends BaseAccountActivity {
    AccountAnonymousReginRequest B;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    AccountRegisterThirdwaiRequestBean f28160d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    int f28161e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f28162f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SimpleDraweeView f28163g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28164h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f28165i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    EditText f28166j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    EditText f28167k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    EditText f28168l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    EditText f28169m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f28170n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f28171o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f28172p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f28173q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f28174r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f28175s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.b f28176t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.rpc.c f28177u;

    /* renamed from: v  reason: collision with root package name */
    Dialog f28178v;

    /* renamed from: y  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f28181y;

    /* renamed from: z  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f28182z;

    /* renamed from: w  reason: collision with root package name */
    int f28179w = 0;

    /* renamed from: x  reason: collision with root package name */
    int f28180x = 0;
    boolean A = false;
    int C = 60;
    private Handler D = new f();

    /* loaded from: classes4.dex */
    class a implements View.OnFocusChangeListener {
        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                AccountBindPhoneNew accountBindPhoneNew = AccountBindPhoneNew.this;
                accountBindPhoneNew.showKeyborad(accountBindPhoneNew.f28166j);
            }
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
            int length = charSequence.length();
            if (length > 0) {
                AccountBindPhoneNew.this.f28164h.setVisibility(0);
            } else {
                AccountBindPhoneNew.this.f28164h.setVisibility(8);
            }
            if (length == 11) {
                AccountBindPhoneNew.this.f28173q.setEnabled(true);
            } else {
                AccountBindPhoneNew.this.f28173q.setEnabled(false);
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
            AccountBindPhoneNew.this.f28179w = charSequence.length();
            AccountBindPhoneNew accountBindPhoneNew = AccountBindPhoneNew.this;
            if (accountBindPhoneNew.f28179w > 0 && accountBindPhoneNew.f28180x > 0) {
                accountBindPhoneNew.f28174r.setEnabled(true);
            } else {
                accountBindPhoneNew.f28174r.setEnabled(false);
            }
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
            AccountBindPhoneNew.this.f28180x = charSequence.length();
            AccountBindPhoneNew accountBindPhoneNew = AccountBindPhoneNew.this;
            if (accountBindPhoneNew.f28180x > 0 && accountBindPhoneNew.f28179w > 0) {
                accountBindPhoneNew.f28174r.setEnabled(true);
            } else {
                accountBindPhoneNew.f28174r.setEnabled(false);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            if (charSequence.length() > 0) {
                AccountBindPhoneNew.this.f28175s.setEnabled(true);
            } else {
                AccountBindPhoneNew.this.f28175s.setEnabled(false);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AccountBindPhoneNew accountBindPhoneNew = AccountBindPhoneNew.this;
            accountBindPhoneNew.C--;
            accountBindPhoneNew.f28162f.setText(AccountBindPhoneNew.this.C + "S");
            AccountBindPhoneNew accountBindPhoneNew2 = AccountBindPhoneNew.this;
            if (accountBindPhoneNew2.C > 0) {
                accountBindPhoneNew2.D.sendEmptyMessageDelayed(1, 1000L);
                AccountBindPhoneNew.this.f28162f.setEnabled(false);
                return;
            }
            accountBindPhoneNew2.f28162f.setEnabled(true);
            AccountBindPhoneNew.this.f28162f.setText("重新获取");
        }
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
        if (com.join.mgps.Util.g2.h(str)) {
            return 0;
        }
        return str.length() + getChineseCount(str);
    }

    private boolean matchStringLength(String str, int i4, int i5) {
        int stringLength = getStringLength(str);
        return stringLength >= i4 && stringLength <= i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showKeyborad(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        h0("绑定手机号");
        this.f28178v = com.join.mgps.Util.b0.f0(this).x(this);
        this.f28176t = com.join.mgps.rpc.impl.a.c0();
        this.f28177u = com.join.mgps.rpc.impl.b.k();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f28182z = accountData;
        if (accountData != null && accountData.n2() == 2) {
            this.A = true;
            this.f28181y = AccountUtil_.getInstance_(this).getAccountData();
        }
        this.f28166j.setOnFocusChangeListener(new a());
        this.f28166j.addTextChangedListener(new b());
        this.f28167k.addTextChangedListener(new c());
        this.f28168l.addTextChangedListener(new d());
        this.f28169m.addTextChangedListener(new e());
        com.join.mgps.Util.o.g(this.f28169m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void joinDevice() {
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this).getUid() + "");
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this).getToken());
        AccountResultMainBean<JPushJoinDeviceResult> S = this.f28176t.S(linkedMultiValueMap);
        if (S != null && S.getError() == 0 && S.getData().isResult()) {
            S.getData().getMsg();
        }
        UtilsMy.Q(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    AccountCheckReginCodeRequest accountCheckReginCodeRequest = new AccountCheckReginCodeRequest();
                    accountCheckReginCodeRequest.setMobile(this.f28166j.getText().toString());
                    accountCheckReginCodeRequest.setCode(this.f28168l.getText().toString());
                    accountCheckReginCodeRequest.setDevice_id("");
                    accountCheckReginCodeRequest.setMac("");
                    accountCheckReginCodeRequest.setSign(com.join.mgps.Util.x1.g(accountCheckReginCodeRequest));
                    AccountResultMainBean<AccountLoginresultData> B = this.f28176t.B(accountCheckReginCodeRequest.getParams());
                    if (B != null && B.getData() != null) {
                        if (B.getData().is_success()) {
                            AccountAnonymousReginRequest accountAnonymousReginRequest = new AccountAnonymousReginRequest();
                            accountAnonymousReginRequest.setMobile(this.f28166j.getText().toString());
                            accountAnonymousReginRequest.setCode(this.f28168l.getText().toString());
                            accountAnonymousReginRequest.setPassword(this.f28167k.getText().toString());
                            u0(accountAnonymousReginRequest);
                        } else {
                            error(B.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        this.f28178v.show();
        this.C = 60;
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f28178v.dismiss();
        this.f28162f.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    AccountChangeNickNameRequest accountChangeNickNameRequest = new AccountChangeNickNameRequest();
                    accountChangeNickNameRequest.setUid(this.f28181y.getUid() + "");
                    accountChangeNickNameRequest.setToken(this.f28181y.getToken());
                    accountChangeNickNameRequest.setNick_name(str);
                    accountChangeNickNameRequest.setAvatar_src(this.f28181y.d0());
                    accountChangeNickNameRequest.setSign(com.join.mgps.Util.x1.g(accountChangeNickNameRequest));
                    AccountResultMainBean<AccountLoginresultData> G = this.f28176t.G(accountChangeNickNameRequest.getParams());
                    if (G != null && G.getData() != null) {
                        if (G.getData().is_success()) {
                            setResult(10001);
                            finish();
                        } else {
                            error(G.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void nextStep() {
        this.f28178v.show();
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void nickNameBution() {
        String obj = this.f28169m.getText().toString();
        if (!matchStringLength(obj, 1, 20)) {
            error("用户名格式有误，输入1至24位字母或数字或汉字");
            return;
        }
        this.f28178v.show();
        if (this.A) {
            int i4 = this.f28161e;
            if (i4 == 1) {
                q0(this.B);
            } else if (i4 == 2) {
                r0(this.B);
            }
        } else if (this.f28161e == 1) {
            n0(obj);
        } else {
            o0(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(String str) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    AccountChangeNickNameRequest accountChangeNickNameRequest = new AccountChangeNickNameRequest();
                    accountChangeNickNameRequest.setUid(this.f28181y.getUid() + "");
                    accountChangeNickNameRequest.setToken(this.f28181y.getToken());
                    accountChangeNickNameRequest.setNick_name(str);
                    accountChangeNickNameRequest.setAvatar_src(this.f28181y.d0());
                    accountChangeNickNameRequest.setSign(com.join.mgps.Util.x1.g(accountChangeNickNameRequest));
                    AccountResultMainBean<AccountLoginresultData> a02 = this.f28176t.a0(accountChangeNickNameRequest.getParams());
                    if (a02 != null && a02.getData() != null) {
                        if (a02.getData().is_success()) {
                            setResult(10001);
                            finish();
                        } else {
                            error(a02.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (i4 == 10001 && i5 == 10001) {
            MyImageLoader.t(this.f28163g, AccountUtil_.getInstance_(this).getAccountData().d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f28181y = accountData;
        MyImageLoader.t(this.f28163g, accountData.d0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        if (!matchStringLength(this.f28167k.getText().toString(), 6, 16)) {
            error("密码格式有误，输入6至16位字母或数字");
            return;
        }
        this.f28178v.show();
        if (this.A) {
            k0();
        } else if (this.f28161e == 1) {
            phoneRegin();
        } else {
            thirdRegin();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void phoneRegin() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    x.b t32 = com.wufan.user.service.protobuf.x.t3();
                    t32.a3(com.join.mgps.Util.a.e(this.f28166j.getText().toString()));
                    t32.g3(com.join.mgps.Util.a.e(this.f28167k.getText().toString()));
                    t32.k3(this.f28168l.getText().toString());
                    t32.e3("mob");
                    t32.c3(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put(GrantCredentialsPermissionActivity.f67535g, t32.getAccount());
                    hashMap.put(GameRoomActivity_.f38656u3, t32.getPassword());
                    hashMap.put("smsCode", t32.r());
                    hashMap.put("codeType", t32.v());
                    hashMap.put("appVersion", t32.getAppVersion());
                    t32.i3(com.join.mgps.Util.x1.d(hashMap));
                    com.wufan.user.service.protobuf.d0 g4 = this.f28177u.g(t32.build());
                    if (g4 != null && g4.getData() != null) {
                        if (g4.getError() == 200) {
                            this.f28181y = g4.getData();
                            AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f28181y, getApplicationContext());
                            joinDevice();
                            showFinishPage(g4.getData());
                        } else if (com.join.mgps.Util.g2.i(g4.k())) {
                            error(g4.k());
                        } else {
                            error("数据获取异常，请重试");
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    accountAnonymousReginRequest.setUid(this.f28182z.getUid());
                    accountAnonymousReginRequest.setToken(this.f28182z.getToken());
                    accountAnonymousReginRequest.setNick_name(this.f28169m.getText().toString());
                    accountAnonymousReginRequest.setDevice_id("");
                    accountAnonymousReginRequest.setMac("");
                    accountAnonymousReginRequest.setSign(com.join.mgps.Util.x1.g(accountAnonymousReginRequest));
                    AccountResultMainBean<AccountLoginresultData> H = this.f28176t.H(accountAnonymousReginRequest.getParamsPhone());
                    if (H != null && H.getData() != null) {
                        if (H.getData().is_success()) {
                            this.f28181y = b3.a.a(H.getData().getUser_info());
                            AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f28181y, getApplicationContext());
                            joinDevice();
                            setResult(10001);
                            finish();
                        } else {
                            error(H.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                m0();
            }
        }
        error("没有网络，请检查网络设置");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    accountAnonymousReginRequest.setUid(this.f28182z.getUid());
                    accountAnonymousReginRequest.setToken(this.f28182z.getToken());
                    accountAnonymousReginRequest.setUnique_id(this.f28160d.getUnique_id());
                    accountAnonymousReginRequest.setType(this.f28160d.getType());
                    accountAnonymousReginRequest.setNick_name(this.f28169m.getText().toString());
                    accountAnonymousReginRequest.setDevice_id("");
                    accountAnonymousReginRequest.setMac("");
                    accountAnonymousReginRequest.setSign(com.join.mgps.Util.x1.g(accountAnonymousReginRequest));
                    AccountResultMainBean<AccountLoginresultData> o4 = this.f28176t.o(accountAnonymousReginRequest.getParamsThird());
                    if (o4 != null && o4.getData() != null) {
                        if (o4.getData().is_success()) {
                            this.f28181y = b3.a.a(o4.getData().getUser_info());
                            AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f28181y, getApplicationContext());
                            joinDevice();
                            setResult(10001);
                            finish();
                        } else {
                            error(o4.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                m0();
            }
        }
        error("没有网络，请检查网络设置");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    h0.b t32 = com.wufan.user.service.protobuf.h0.t3();
                    com.wufan.user.service.protobuf.n0 n0Var = this.f28181y;
                    if (n0Var != null) {
                        t32.k3(n0Var.getUid());
                    }
                    t32.a3(b3.b.a(this));
                    t32.e3(AESUtils.encrypt(this.f28166j.getText().toString()));
                    t32.i3(SourceType.PLATFORM);
                    t32.c3(ContentType.MOBILE_REG);
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", t32.getUid() + "");
                    hashMap.put("mobile", t32.z());
                    hashMap.put("sourceType", t32.P1().name());
                    hashMap.put("appVersion", t32.getAppVersion());
                    hashMap.put("contentType", t32.getContentType().name());
                    t32.g3(com.join.mgps.Util.x1.d(hashMap));
                    com.wufan.user.service.protobuf.f0 j4 = this.f28177u.j(t32.build());
                    if (j4 != null && j4.getError() == 200) {
                        if (j4.getStatus()) {
                            t0();
                        } else {
                            error(j4.k());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showFinishPage(com.wufan.user.service.protobuf.n0 n0Var) {
        h0("设置头像/昵称");
        this.f28170n.setVisibility(8);
        this.f28172p.setVisibility(0);
        if (this.f28161e == 1) {
            MyImageLoader.d(this.f28163g, R.drawable.unloginstatus, n0Var.d0());
            this.f28169m.setText(n0Var.getAccount());
            return;
        }
        Random random = new Random();
        EditText editText = this.f28169m;
        editText.setText(this.f28160d.getNickname() + random.nextInt(1000));
        MyImageLoader.d(this.f28163g, R.drawable.unloginstatus, this.f28160d.getAvatar_src());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        h0("设置密码");
        this.f28170n.setVisibility(0);
        this.f28171o.setVisibility(8);
        this.f28165i.setText(this.f28166j.getText());
        this.D.sendEmptyMessageDelayed(1, 1000L);
        this.f28162f.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void thirdRegin() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    l0.b B3 = com.wufan.user.service.protobuf.l0.B3();
                    B3.c3(com.join.mgps.Util.a.e(this.f28166j.getText().toString()));
                    B3.i3(com.join.mgps.Util.a.e(this.f28167k.getText().toString()));
                    B3.q3(com.join.mgps.Util.a.e(this.f28160d.getUnique_id()));
                    TheThirdPartLoginType theThirdPartLoginType = TheThirdPartLoginType.UNRECOGNIZED;
                    if (this.f28160d.getType() == 1) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_QQ;
                    } else if (this.f28160d.getType() == 2) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_XIN;
                    } else if (this.f28160d.getType() == 3) {
                        theThirdPartLoginType = TheThirdPartLoginType.T_WEI_BO;
                    }
                    B3.o3(theThirdPartLoginType);
                    B3.m3(this.f28168l.getText().toString());
                    B3.g3("mob");
                    B3.e3(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("theThirdPartLoginType", B3.t().name());
                    hashMap.put("smsCode", B3.r());
                    hashMap.put("codeType", B3.v());
                    hashMap.put("appVersion", B3.getAppVersion());
                    B3.k3(com.join.mgps.Util.x1.d(hashMap));
                    com.wufan.user.service.protobuf.d0 f5 = this.f28177u.f(B3.build());
                    if (f5 != null && f5.getError() == 200) {
                        if (f5.m()) {
                            this.f28181y = f5.getData();
                            AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f28181y, getApplicationContext());
                            joinDevice();
                            showFinishPage(this.f28181y);
                        } else {
                            error(f5.k());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            error("没有网络，请检查网络设置");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        h0("设置头像/昵称");
        this.f28170n.setVisibility(8);
        this.f28172p.setVisibility(0);
        this.B = accountAnonymousReginRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void userIcon() {
        MGChooseIconActivity_.x0(this).a(1).startForResult(10001);
    }
}
