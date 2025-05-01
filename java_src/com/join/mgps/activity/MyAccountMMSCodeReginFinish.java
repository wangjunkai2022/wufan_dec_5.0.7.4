package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountMMSCheckCodebean;
import com.join.mgps.dto.AccountReginBean;
import com.join.mgps.dto.AccountRegisterRequestBean;
import com.join.mgps.dto.AccountResultBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.MMSRequesBean;
import com.join.mgps.dto.RewardBean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_regin_sendmmscode_layout)
/* loaded from: classes4.dex */
public class MyAccountMMSCodeReginFinish extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    MApplication f35573b;

    /* renamed from: c  reason: collision with root package name */
    private String f35574c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.b f35575d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f35576e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35577f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f35578g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35579h;

    /* renamed from: i  reason: collision with root package name */
    f f35580i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f35581j;

    /* renamed from: l  reason: collision with root package name */
    private String f35583l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35584m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    AccountReginBean f35585n;

    /* renamed from: o  reason: collision with root package name */
    private e f35586o;

    /* renamed from: k  reason: collision with root package name */
    int f35582k = 0;

    /* renamed from: p  reason: collision with root package name */
    public Handler f35587p = new a();

    /* renamed from: q  reason: collision with root package name */
    private Uri f35588q = Uri.parse("content://sms/");

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
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
            MyAccountMMSCodeReginFinish.this.f35582k = charSequence.length();
            MyAccountMMSCodeReginFinish myAccountMMSCodeReginFinish = MyAccountMMSCodeReginFinish.this;
            if (myAccountMMSCodeReginFinish.f35582k == 6) {
                myAccountMMSCodeReginFinish.f35581j.setEnabled(true);
            } else {
                myAccountMMSCodeReginFinish.f35581j.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f35591b;

        c(Dialog dialog) {
            this.f35591b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f35591b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f35593b;

        d(Dialog dialog) {
            this.f35593b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeReginFinish.this.finish();
            this.f35593b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class e extends ContentObserver {
        public e(Context context, Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            MyAccountMMSCodeReginFinish.this.getSmsFromPhone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends CountDownTimer {
        public f(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            MyAccountMMSCodeReginFinish.this.f35577f.setText("重新获取");
            MyAccountMMSCodeReginFinish.this.f35577f.setEnabled(true);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            MyAccountMMSCodeReginFinish.this.f35577f.setEnabled(false);
            TextView textView = MyAccountMMSCodeReginFinish.this.f35577f;
            textView.setText("重新获取(" + (j4 / 1000) + ")");
        }
    }

    private void p0() {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this, R.style.MyDialog);
        oVar.setContentView(R.layout.delete_dialog);
        ((Button) oVar.findViewById(R.id.dialog_button_ok)).setText("返回");
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setText("等待");
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("接收短信稍有延迟，确认返回吗？");
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new c(oVar));
        ((Button) oVar.findViewById(R.id.dialog_button_ok)).setOnClickListener(new d(oVar));
        oVar.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35575d = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35573b = mApplication;
        mApplication.e(this);
        this.f35581j.setEnabled(false);
        this.f35584m = com.join.mgps.Util.b0.f0(this).x(this);
        this.f35579h.setText("填写验证码");
        String mobile = this.f35585n.getMobile();
        this.f35574c = mobile;
        String replace = mobile.replace("+86", "");
        this.f35574c = replace;
        try {
            String substring = replace.substring(0, 3);
            String substring2 = this.f35574c.substring(3, 7);
            String substring3 = this.f35574c.substring(7, 11);
            TextView textView = this.f35578g;
            textView.setText("+86 " + substring + " " + substring2 + " " + substring3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        f fVar = new f(60000L, 1000L);
        this.f35580i = fVar;
        fVar.start();
        this.f35576e.addTextChangedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        p0();
    }

    public void getSmsFromPhone() {
        Cursor query = getContentResolver().query(this.f35588q, new String[]{"body"}, "date >  " + (System.currentTimeMillis() - TTAdConstant.AD_MAX_EVENT_TIME), null, "date desc");
        if (query != null && query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("body"));
            if (string.contains(com.join.android.app.mgsim.wufun.b.f15658i)) {
                Matcher matcher = Pattern.compile("\\d+").matcher(string);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (group.length() == 6) {
                        this.f35576e.setText(group);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        com.join.mgps.Util.l2.a(this).b("获取验证码成功");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(AccountReginBean accountReginBean) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountRegisterRequestBean accountRegisterRequestBean = new AccountRegisterRequestBean();
                accountRegisterRequestBean.setMobile(accountReginBean.getMobile());
                accountRegisterRequestBean.setPassword(accountReginBean.getPassword());
                accountRegisterRequestBean.setSource(accountReginBean.getSource());
                accountRegisterRequestBean.setCode(accountReginBean.getCode());
                accountRegisterRequestBean.setAvatar_src("");
                accountRegisterRequestBean.setGender(1);
                accountRegisterRequestBean.setNick_name(accountReginBean.getNickname());
                accountRegisterRequestBean.setAccount("");
                accountRegisterRequestBean.setMac("");
                com.join.mgps.Util.g2.i("");
                accountRegisterRequestBean.setDevice_id("");
                accountRegisterRequestBean.setSign(com.join.mgps.Util.x1.g(accountRegisterRequestBean));
                AccountResultBean<AccountLoginresultData<AccountBean>> a5 = this.f35575d.a(accountRegisterRequestBean.getParams());
                if (a5 != null && a5.getError() == 0) {
                    if (a5.getData().isIs_success()) {
                        AccountUtil_.getInstance_(this).saveAccountData(b3.a.a(a5.getData().getUser_info()), this);
                        UtilsMy.v4(this, a5.getData().getGame_list_permission());
                        UtilsMy.Q(this);
                        k0(a5.getData().getUser_info(), a5.getData().getReward());
                    } else {
                        error(a5.getData().getError_msg());
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                error("连接失败，请稍后再试。");
                showLodingDismis();
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountMMSCheckCodebean accountMMSCheckCodebean = new AccountMMSCheckCodebean();
                accountMMSCheckCodebean.setMobile(this.f35574c);
                int i4 = 0;
                try {
                    i4 = Integer.parseInt(str);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                accountMMSCheckCodebean.setCode(i4);
                accountMMSCheckCodebean.setSign(com.join.mgps.Util.x1.g(accountMMSCheckCodebean));
                AccountResultMainBean<AccountTokenSuccess> g4 = this.f35575d.g(accountMMSCheckCodebean.getParams());
                if (g4 != null && g4.getError() == 0) {
                    if (g4.getData().is_success()) {
                        o0();
                    } else {
                        error(g4.getData().getError_msg());
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                error("连接失败，请稍后再试。");
                showLodingDismis();
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(AccountBean accountBean, RewardBean rewardBean) {
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
        this.f35573b.f();
        MYAccountReginFinishActivity_.C0(this).a(accountBean).b(1).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            this.f35580i.start();
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(this.f35574c);
                mMSRequesBean.setType(MMSRequesBean.TYPE_REGISTER);
                mMSRequesBean.setSign(com.join.mgps.Util.x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i4 = this.f35575d.i(mMSRequesBean.getParams());
                if (i4 != null && i4.getError() == 0) {
                    if (i4.getData().is_success()) {
                        h0();
                    } else {
                        error(i4.getData().getError_msg());
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                error("连接失败，请稍后再试。");
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        String trim = this.f35576e.getText().toString().trim();
        this.f35583l = trim;
        if (com.join.mgps.Util.g2.i(trim) && com.join.mgps.Util.g2.j(this.f35583l) && this.f35583l.length() == 6) {
            j0(this.f35583l);
        } else {
            com.join.mgps.Util.l2.a(this).b("输入格式有误");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f35585n.setCode(Integer.parseInt(this.f35583l));
        i0(this.f35585n);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            p0();
            return false;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f35584m.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        this.f35584m.dismiss();
    }
}
