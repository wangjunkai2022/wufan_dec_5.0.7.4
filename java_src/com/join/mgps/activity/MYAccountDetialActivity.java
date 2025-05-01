package com.join.mgps.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.BaseActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.account.UnbindThirdPartyActivity;
import com.join.kotlin.ui.account.modle.UnBindPlatform;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dialog.b;
import com.join.mgps.dialog.r;
import com.join.mgps.dialog.x0;
import com.join.mgps.dto.AccountBindThirdwaiRequestBean;
import com.join.mgps.dto.AccountChangeUserinfoRequestBean;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.AccoutLoginOutRequest;
import com.join.mgps.dto.ShareDataBean;
import com.join.mgps.listener.a;
import com.join.mgps.pref.PrefDef_;
import com.wufan.user.service.protobuf.b0;
import external.org.apache.commons.lang3.ObjectUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.my_account_detial_layout)
/* loaded from: classes4.dex */
public class MYAccountDetialActivity extends BaseActivity implements r.c, x0.c, a.InterfaceC0373a, PlatformActionListener, Handler.Callback {
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 4;
    private com.join.mgps.dialog.r1 A;
    private Handler B;
    private long D;
    private boolean F;

    /* renamed from: b  reason: collision with root package name */
    private Context f34948b;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.b f34949c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.c f34950d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f34951e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f34952f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f34953g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f34954h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f34955i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f34956j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    SimpleDraweeView f34957k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f34958l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f34959m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f34960n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f34961o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f34962p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f34963q;
    @Pref

    /* renamed from: r  reason: collision with root package name */
    PrefDef_ f34964r;

    /* renamed from: s  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f34965s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f34966t;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f34967u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.dialog.x0 f34968v;

    /* renamed from: w  reason: collision with root package name */
    private com.join.mgps.dialog.r f34969w;

    /* renamed from: x  reason: collision with root package name */
    private String f34970x = "";

    /* renamed from: y  reason: collision with root package name */
    private String f34971y = "";

    /* renamed from: z  reason: collision with root package name */
    private boolean f34972z = false;
    boolean C = true;
    private boolean E = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements TextWatcher {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f34974b;

        b(EditText editText) {
            this.f34974b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f34974b.getText().toString().trim())) {
                MYAccountDetialActivity mYAccountDetialActivity = MYAccountDetialActivity.this;
                mYAccountDetialActivity.f34965s = mYAccountDetialActivity.f34965s.toBuilder().c4(this.f34974b.getText().toString()).build();
                MYAccountDetialActivity.this.F0();
            } else {
                MYAccountDetialActivity.this.showToast("昵称不能为空！");
            }
            MYAccountDetialActivity.this.A.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34976a;

        c(String str) {
            this.f34976a = str;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            MYAccountDetialActivity mYAccountDetialActivity = MYAccountDetialActivity.this;
            if (!mYAccountDetialActivity.C) {
                MyAccountBindPhoneActivity_.x0(mYAccountDetialActivity.f34948b).start();
            } else {
                Intent intent = new Intent(MYAccountDetialActivity.this.f34948b, UnbindThirdPartyActivity.class);
                intent.putExtra("type", this.f34976a);
                MYAccountDetialActivity.this.startActivity(intent);
            }
            bVar.dismiss();
        }
    }

    private void authorize(Platform platform) {
        if (System.currentTimeMillis() - this.D <= 1000) {
            return;
        }
        this.D = System.currentTimeMillis();
        if (!com.join.android.app.common.utils.j.j(this)) {
            com.join.mgps.Util.l2.a(this).b("没有网络，请检查网络设置。");
        } else if (platform != null && this.E) {
            this.E = false;
            if (platform.isAuthValid()) {
                platform.removeAccount(true);
            }
            platform.setPlatformActionListener(this);
            platform.SSOSetting(false);
            platform.showUser(null);
            s0();
            if (platform.getName().equals(Wechat.NAME)) {
                this.f34967u.setCancelable(true);
                this.f34967u.setCanceledOnTouchOutside(false);
                this.E = true;
                this.F = true;
                return;
            }
            this.f34967u.setCancelable(true);
            this.f34967u.setCanceledOnTouchOutside(false);
            this.F = false;
        }
    }

    private void q0() {
        this.f34964r.lastCheckInTime().g(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        MyAccountSettingPasswordActivity_.p0(this.f34948b).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (com.join.mgps.Util.g2.h(this.f34965s.z())) {
            MyAccountBindPhoneActivity_.x0(this.f34948b).start();
        } else {
            MyAccountInsteadPhoneActivity_.j0(this.f34948b).start();
        }
    }

    void C0() {
        this.f34971y = this.f34965s.d0();
        MyImageLoader.t(this.f34957k, this.f34965s.d0());
        if (this.f34965s.E1() != 1) {
            this.f34961o.setText("未绑定");
            this.f34961o.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f34961o.setText("已绑定");
            this.f34961o.setTextColor(Color.parseColor("#8a8a8a"));
        }
        if (this.f34965s.t2() != 1) {
            this.f34962p.setText("未绑定");
            this.f34962p.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f34962p.setText("已绑定");
            this.f34962p.setTextColor(Color.parseColor("#8a8a8a"));
        }
        if (this.f34965s.l2() != 1) {
            this.f34963q.setText("未绑定");
            this.f34963q.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f34963q.setText("已绑定");
            this.f34963q.setTextColor(Color.parseColor("#8a8a8a"));
        }
        this.f34958l.setText(this.f34965s.getAccount());
        this.f34953g.setText(this.f34965s.getNickname());
        this.f34970x = this.f34965s.getNickname();
        TextView textView = this.f34954h;
        textView.setText(this.f34965s.O1() + "");
        if (this.f34965s.v1() == 1) {
            this.f34955i.setText("男");
        } else {
            this.f34955i.setText("女");
        }
        if (this.f34965s.z0() == 0) {
            this.f34960n.setText("未设置");
            this.f34960n.setTextColor(-49602);
        } else {
            this.f34960n.setText("点击修改");
            this.f34960n.setTextColor(-7697782);
        }
        if (com.join.mgps.Util.g2.i(this.f34965s.z())) {
            if (this.f34965s.z().length() == 11) {
                try {
                    TextView textView2 = this.f34959m;
                    textView2.setText(this.f34965s.z().substring(0, 3) + "****" + this.f34965s.z().substring(7, 11));
                } catch (Exception unused) {
                }
            }
            this.f34959m.setTextColor(-7697782);
        } else {
            this.f34959m.setText("未绑定");
            this.f34959m.setTextColor(-49602);
        }
        if (this.f34965s.F2() != null && !TextUtils.isEmpty(this.f34965s.F2().getBattleTitle())) {
            this.f34966t.setText(this.f34965s.F2().getBattleTitle());
        } else {
            this.f34966t.setText("--");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        IntentUtil intentUtil = IntentUtil.getInstance();
        Context context = this.f34948b;
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/static/cancelAccount/index.html");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        com.wufan.user.service.protobuf.n0 n0Var = this.f34965s;
        if (n0Var != null) {
            this.f34953g.setText(n0Var.getNickname());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            s0();
            try {
                AccountChangeUserinfoRequestBean accountChangeUserinfoRequestBean = new AccountChangeUserinfoRequestBean();
                accountChangeUserinfoRequestBean.setGender(this.f34965s.v1());
                accountChangeUserinfoRequestBean.setAccount(this.f34965s.getAccount());
                accountChangeUserinfoRequestBean.setNick_name(this.f34965s.getNickname());
                accountChangeUserinfoRequestBean.setUid(this.f34965s.getUid());
                accountChangeUserinfoRequestBean.setToken(this.f34965s.getToken());
                accountChangeUserinfoRequestBean.setAvatar_src(this.f34965s.d0());
                accountChangeUserinfoRequestBean.setSign(com.join.mgps.Util.x1.g(accountChangeUserinfoRequestBean));
                AccountResultMainBean<AccountTokenSuccess> c5 = this.f34949c.c(accountChangeUserinfoRequestBean.getParams());
                if (c5 != null && c5.getError() == 0) {
                    if (c5.getData().is_success()) {
                        AccountUtil_.getInstance_(this.f34948b).saveAccountData(this.f34965s, this.f34948b);
                        E0();
                    } else {
                        t0(c5.getData().getError_msg(), this.f34965s.getNickname());
                    }
                } else {
                    showToast("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingDismis();
                showToast("连接失败，请稍后再试。");
                return;
            }
        }
        showToast("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        this.f34968v.b(this);
        this.f34968v.c(this.f34965s.v1());
        this.f34968v.show();
    }

    @Override // com.join.mgps.dialog.x0.c
    public void R(int i4) {
        if (this.f34965s.v1() == i4) {
            return;
        }
        this.f34965s = this.f34965s.toBuilder().P3(i4).build();
        if (i4 == 1) {
            this.f34955i.setText("男");
        } else {
            this.f34955i.setText("女");
        }
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f34949c = com.join.mgps.rpc.impl.a.c0();
        this.f34950d = com.join.mgps.rpc.impl.b.k();
        this.f34967u = com.join.mgps.Util.b0.f0(this).x(this);
        this.f34968v = com.join.mgps.Util.b0.f0(this).v(this);
        this.A = new com.join.mgps.dialog.r1(this, R.style.HKDialogLoading);
        this.f34969w = com.join.mgps.Util.b0.f0(this).q(this);
        this.f34948b = this;
        this.f34951e.setText("个人信息");
        this.f34965s = AccountUtil_.getInstance_(this).getAccountData();
        C0();
        com.join.mgps.listener.a.b().a(this);
        this.B = new Handler(this);
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

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i4 = message.what;
        int i5 = 2;
        if (i4 == 2) {
            com.join.mgps.Util.l2.a(this).b("取消授权");
        } else if (i4 == 4) {
            this.F = false;
            ShareDataBean shareDataBean = (ShareDataBean) message.obj;
            HashMap<String, Object> res = shareDataBean.getRes();
            Iterator<String> it2 = res.keySet().iterator();
            String type = shareDataBean.getType();
            int i6 = -1;
            if (type.equals(QQ.NAME)) {
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (next.equals("nickname")) {
                        String str = (String) res.get(next);
                    }
                    if (next.equals("gender")) {
                        String str2 = (String) res.get(next);
                        if (com.join.mgps.Util.g2.i(str2)) {
                            str2.equals("男");
                        }
                    }
                }
                i6 = 1;
            }
            if (type.equals(Wechat.NAME)) {
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    if (next2.equals("nickname")) {
                        String str3 = (String) res.get(next2);
                    }
                    if (next2.equals("sex")) {
                        ((Integer) res.get(next2)).intValue();
                    }
                }
            } else {
                i5 = i6;
            }
            if (type.equals(SinaWeibo.NAME)) {
                i5 = 3;
                while (it2.hasNext()) {
                    String next3 = it2.next();
                    if (next3.equals("name")) {
                        String str4 = (String) res.get(next3);
                    }
                    if (next3.equals("gender")) {
                        String str5 = (String) res.get(next3);
                        if (com.join.mgps.Util.g2.i(str5)) {
                            str5.equals("m");
                        }
                    }
                }
            }
            s0();
            this.f34967u.setCancelable(true);
            this.f34967u.setCanceledOnTouchOutside(false);
            k0(shareDataBean.getUserId(), i5);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        ((ClipboardManager) this.f34948b.getSystemService("clipboard")).setText(this.f34965s.getAccount());
        com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(this.f34948b);
        a5.b(this.f34965s.getAccount() + "已复制到剪贴板");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        if (this.f34965s.l2() != 1) {
            authorize(ShareSDK.getPlatform(QQ.NAME));
        } else {
            n0(UnBindPlatform.QQ_OPENID.name());
        }
    }

    @Override // com.join.mgps.dialog.r.c
    public void k(String str) {
        this.f34953g.setText(str);
        if (this.f34965s.getNickname().equals(str)) {
            return;
        }
        this.f34965s = this.f34965s.toBuilder().c4(str).build();
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str, int i4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    AccountBindThirdwaiRequestBean accountBindThirdwaiRequestBean = new AccountBindThirdwaiRequestBean();
                    accountBindThirdwaiRequestBean.setUid(this.f34965s.getUid());
                    accountBindThirdwaiRequestBean.setToken(this.f34965s.getToken());
                    accountBindThirdwaiRequestBean.setUnique_id(str);
                    accountBindThirdwaiRequestBean.setType(i4);
                    accountBindThirdwaiRequestBean.setSign(com.join.mgps.Util.x1.g(accountBindThirdwaiRequestBean));
                    AccountResultMainBean<AccountLoginresultData> x4 = this.f34949c.x(accountBindThirdwaiRequestBean.getParams());
                    if (x4 != null && x4.getData() != null) {
                        if (x4.getData().is_success()) {
                            o0();
                            error("绑定成功");
                        } else {
                            error(x4.getData().getError_msg());
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                showLodingDismis();
            }
        }
    }

    @Override // com.join.mgps.listener.a.InterfaceC0373a
    public void l() {
        p0(AccountUtil_.getInstance_(getApplicationContext()).getAccountData());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        if (this.f34965s.E1() != 1) {
            authorize(ShareSDK.getPlatform(Wechat.NAME));
        } else {
            n0(UnBindPlatform.WEIXIN_OPENID.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (this.f34965s.t2() != 1) {
            authorize(ShareSDK.getPlatform(SinaWeibo.NAME));
        } else {
            n0(UnBindPlatform.WB_OPENID.name());
        }
    }

    public void n0(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (str.equals(UnBindPlatform.QQ_OPENID.name())) {
            str2 = QQ.NAME;
        } else if (str.equals(UnBindPlatform.WEIXIN_OPENID.name())) {
            str2 = "微信";
        } else {
            str2 = str.equals(UnBindPlatform.WB_OPENID.name()) ? "微博" : "";
        }
        if (com.join.mgps.Util.g2.h(this.f34965s.z())) {
            this.C = false;
            str5 = "无法解除绑定";
            str4 = "解除第三方帐号必须绑定手机号";
            str3 = "绑定手机";
        } else {
            String str6 = "是否解除" + str2 + "绑定？";
            this.C = true;
            str3 = "解除绑定";
            str4 = "解绑后将无法使用" + str2 + "帐号登录悟饭游戏厅";
            str5 = str6;
        }
        new com.join.mgps.dialog.b(this.f34948b, R.style.HKDialogLoading).d("取消").g(str4).j(str3).k(str5).i(new c(str)).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        com.wufan.user.service.protobuf.n0 n0Var = (com.wufan.user.service.protobuf.n0) ObjectUtils.b(AccountUtil_.getInstance_(getApplicationContext()).getAccountData());
        this.f34965s = n0Var;
        if (n0Var != null && com.join.android.app.common.utils.j.j(this.f34948b)) {
            try {
                b0.b k32 = com.wufan.user.service.protobuf.b0.k3();
                k32.e3(this.f34965s.getUid());
                k32.c3(this.f34965s.getToken());
                k32.Y2(b3.b.a(this));
                HashMap hashMap = new HashMap();
                hashMap.put("uid", k32.getUid() + "");
                hashMap.put("token", k32.getToken());
                hashMap.put("appVersion", k32.getAppVersion());
                k32.a3(com.join.mgps.Util.x1.d(hashMap));
                com.wufan.user.service.protobuf.d0 e5 = this.f34950d.e(k32.build());
                if (e5 != null) {
                    if (e5.getError() == 200) {
                        p0(e5.getData());
                    } else if (e5.getError() == 701) {
                        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(getApplicationContext());
                        finish();
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        back_image();
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i4) {
        showLodingDismis();
        this.E = true;
        if (i4 == 8) {
            this.B.sendEmptyMessage(2);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        this.E = true;
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
            this.B.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f34972z = true;
        super.onDestroy();
        com.join.mgps.listener.a.b().d(this);
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i4, Throwable th) {
        showLodingDismis();
        platform.removeAccount(true);
        this.E = true;
        String simpleName = th.getClass().getSimpleName();
        if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
            showMessage("授权失败");
        } else {
            showMessage("没有安装微信客端，请先安装微信客户端。");
        }
        if (i4 == 8) {
            this.B.sendEmptyMessage(3);
        }
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(com.wufan.user.service.protobuf.n0 n0Var) {
        if (this.f34965s == null || n0Var == null || n0Var.getUid() == 0) {
            return;
        }
        this.f34965s = this.f34965s.toBuilder().F3(n0Var.getAccount()).K3(n0Var.d0()).e4(n0Var.O1()).a4(n0Var.z()).P3(n0Var.v1()).p4(n0Var.getUid()).V3(n0Var.i()).F3(n0Var.getAccount()).c4(n0Var.getNickname()).M3(n0Var.Y0()).k4(n0Var.G()).h4(n0Var.z0()).Q3(n0Var.O2()).T3(n0Var.E1()).S3(n0Var.t2()).R3(n0Var.l2()).build();
        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f34965s, getApplicationContext());
        C0();
    }

    void r0() {
        try {
            String localUserIcon = AccountUtil_.getInstance_(this).getLocalUserIcon();
            if (com.join.mgps.Util.g2.i(localUserIcon)) {
                File file = new File(localUserIcon);
                if (file.exists()) {
                    file.delete();
                    Fresco.getImagePipeline().e(MyImageLoader.G(file));
                }
            }
            AccountUtil_.getInstance_(this).setLocalUserIcon(null);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f34967u.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var;
        if (this.f34972z || (d1Var = this.f34967u) == null) {
            return;
        }
        d1Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f34948b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(String str, String str2) {
        if (str.contains("一个月")) {
            this.f34965s = this.f34965s.toBuilder().c4(this.f34970x).build();
            this.f34953g.setText(this.f34970x);
        }
        com.join.mgps.Util.l2.a(this.f34948b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        r0();
        x0();
        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(getApplicationContext());
        this.f34965s = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        q0();
        com.join.mgps.broadcast.a.a(this.f34948b);
        com.join.mgps.Util.l2.a(this.f34948b).b("退出登录成功");
        this.f34964r.singleGameShowDialog().g("");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        this.f34965s = (com.wufan.user.service.protobuf.n0) ObjectUtils.b(AccountUtil_.getInstance_(getApplicationContext()).getAccountData());
        MGChooseIconActivity_.x0(this.f34948b).a(1).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54080r);
        ShareWebActivity_.t2(this).b(intentDateBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0() {
        if (com.join.android.app.common.utils.j.j(this.f34948b)) {
            try {
                AccoutLoginOutRequest accoutLoginOutRequest = new AccoutLoginOutRequest();
                accoutLoginOutRequest.setUid(this.f34965s.getUid() + "");
                accoutLoginOutRequest.setSign(com.join.mgps.Util.x1.g(accoutLoginOutRequest));
                AccountResultMainBean<AccountTokenSuccess> b5 = this.f34949c.b(accoutLoginOutRequest.getParams());
                if (b5 != null && b5.getError() == 0) {
                    if (b5.getData().is_success()) {
                        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(getApplicationContext());
                        r0();
                    } else {
                        showToast(b5.getData().getError_msg());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y0() {
        this.A.show();
        EditText editText = (EditText) this.A.findViewById(R.id.name);
        editText.addTextChangedListener(new a());
        com.join.mgps.Util.o.g(editText);
        ((Button) this.A.findViewById(R.id.ok)).setOnClickListener(new b(editText));
        ((TextView) this.A.findViewById(R.id.changeNickNameNotice)).setText(new PrefDef_(this.f34948b).changeNickNameNotice().d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54080r);
        ShareWebActivity_.t2(this).b(intentDateBean).start();
    }
}
