package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
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
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.login.LoginInputPassActivity_;
import com.join.mgps.dto.AccountMMSCheckCodebean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.MMSRequesBean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_regin_sendmmscode_layout)
/* loaded from: classes4.dex */
public class MyAccountMMSCodeGetpassbackFinish extends BaseAccountActivity {

    /* renamed from: d  reason: collision with root package name */
    private String f35536d;

    /* renamed from: e  reason: collision with root package name */
    MApplication f35537e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.b f35538f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    EditText f35539g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35540h;

    /* renamed from: i  reason: collision with root package name */
    private String f35541i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f35542j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f35543k;

    /* renamed from: l  reason: collision with root package name */
    g f35544l;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35546n;

    /* renamed from: p  reason: collision with root package name */
    private f f35548p;

    /* renamed from: m  reason: collision with root package name */
    int f35545m = 0;

    /* renamed from: o  reason: collision with root package name */
    public Handler f35547o = new a();

    /* renamed from: q  reason: collision with root package name */
    private Uri f35549q = Uri.parse("content://sms/");

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeGetpassbackFinish.this.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TextWatcher {
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
            MyAccountMMSCodeGetpassbackFinish.this.f35545m = charSequence.length();
            MyAccountMMSCodeGetpassbackFinish myAccountMMSCodeGetpassbackFinish = MyAccountMMSCodeGetpassbackFinish.this;
            if (myAccountMMSCodeGetpassbackFinish.f35545m == 6) {
                myAccountMMSCodeGetpassbackFinish.f35543k.setEnabled(true);
            } else {
                myAccountMMSCodeGetpassbackFinish.f35543k.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f35553b;

        d(Dialog dialog) {
            this.f35553b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f35553b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f35555b;

        e(Dialog dialog) {
            this.f35555b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeGetpassbackFinish.this.finish();
            this.f35555b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class f extends ContentObserver {
        public f(Context context, Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            MyAccountMMSCodeGetpassbackFinish.this.getSmsFromPhone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends CountDownTimer {
        public g(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            MyAccountMMSCodeGetpassbackFinish.this.f35542j.setText("重新获取");
            MyAccountMMSCodeGetpassbackFinish.this.f35542j.setEnabled(true);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            MyAccountMMSCodeGetpassbackFinish.this.f35542j.setEnabled(false);
            TextView textView = MyAccountMMSCodeGetpassbackFinish.this.f35542j;
            textView.setText("" + (j4 / 1000) + "S");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this, R.style.MyDialog);
        oVar.setContentView(R.layout.delete_dialog);
        ((Button) oVar.findViewById(R.id.dialog_button_ok)).setText("返回");
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setText("等待");
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("接收短信稍有延迟，确认返回吗？");
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new d(oVar));
        ((Button) oVar.findViewById(R.id.dialog_button_ok)).setOnClickListener(new e(oVar));
        oVar.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35538f = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35537e = mApplication;
        mApplication.e(this);
        this.f28478c.setText("填写验证码");
        this.f35543k.setEnabled(false);
        this.f35546n = com.join.mgps.Util.b0.f0(this).x(this);
        String stringExtra = getIntent().getStringExtra("phonenumber");
        this.f35536d = stringExtra;
        this.f35536d = stringExtra.replace("+86", "");
        this.f35543k.setEnabled(false);
        g0(new b());
        this.f35540h.setText(this.f35536d);
        try {
            this.f35536d.substring(0, 3);
            this.f35536d.substring(3, 7);
            this.f35536d.substring(7, 11);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        g gVar = new g(60000L, 1000L);
        this.f35544l = gVar;
        gVar.start();
        this.f35539g.addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void getSmsFromPhone() {
        Cursor query = getContentResolver().query(this.f35549q, new String[]{"body"}, "date >  " + (System.currentTimeMillis() - TTAdConstant.AD_MAX_EVENT_TIME), null, "date desc");
        if (query != null && query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("body"));
            if (string.contains(com.join.android.app.mgsim.wufun.b.f15658i)) {
                Matcher matcher = Pattern.compile("\\d+").matcher(string);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (group.length() == 6) {
                        this.f35539g.setText(group);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        com.join.mgps.Util.l2.a(this).b("获取验证码成功");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountMMSCheckCodebean accountMMSCheckCodebean = new AccountMMSCheckCodebean();
                accountMMSCheckCodebean.setMobile(this.f35536d);
                int i4 = 0;
                try {
                    i4 = Integer.parseInt(str);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                accountMMSCheckCodebean.setCode(i4);
                accountMMSCheckCodebean.setSign(com.join.mgps.Util.x1.g(accountMMSCheckCodebean));
                AccountResultMainBean<AccountTokenSuccess> g4 = this.f35538f.g(accountMMSCheckCodebean.getParams());
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
                showLodingDismis();
                error("连接失败，请稍后再试。");
                return;
            }
        }
        error("没有网络，请先检查网络。");
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
            this.f35544l.start();
            try {
                MMSRequesBean mMSRequesBean = new MMSRequesBean();
                mMSRequesBean.setMobile(this.f35536d);
                mMSRequesBean.setType(MMSRequesBean.TYPE_FORGOT);
                mMSRequesBean.setSign(com.join.mgps.Util.x1.g(mMSRequesBean));
                AccountResultMainBean<AccountTokenSuccess> i4 = this.f35538f.i(mMSRequesBean.getParams());
                if (i4 != null && i4.getError() == 0) {
                    if (i4.getData().is_success()) {
                        j0();
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
        String trim = this.f35539g.getText().toString().trim();
        this.f35541i = trim;
        if (com.join.mgps.Util.g2.i(trim) && com.join.mgps.Util.g2.j(this.f35541i) && this.f35541i.length() == 6) {
            k0(this.f35541i);
        } else {
            com.join.mgps.Util.l2.a(this).b("输入格式有误");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        Intent intent = new Intent(this, MyAccountGetpassByPhone_.class);
        intent.putExtra(LoginInputPassActivity_.PHONE_NUMBER_EXTRA, this.f35536d);
        intent.putExtra("MMSCode", this.f35541i);
        startActivity(intent);
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
        this.f35546n.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        this.f35546n.dismiss();
    }
}
