package com.join.mgps.activity;

import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.PayActivityBean;
import com.join.mgps.dto.PayActivityConfig;
import com.join.mgps.dto.PayActivityRebate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_pay_start)
/* loaded from: classes4.dex */
public class PayStartActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    Button f36904b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36905c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    FlowLayout f36906d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36907e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f36908f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36909g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f36910h;

    /* renamed from: i  reason: collision with root package name */
    PapayOrder f36911i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f36912j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.o f36913k;

    /* renamed from: l  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f36914l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    IntentDataMain f36915m;

    /* renamed from: n  reason: collision with root package name */
    List<Integer> f36916n;

    /* renamed from: o  reason: collision with root package name */
    private d f36917o;

    /* renamed from: p  reason: collision with root package name */
    private EditText f36918p;

    /* renamed from: q  reason: collision with root package name */
    private PayActivityBean f36919q;

    /* renamed from: r  reason: collision with root package name */
    MApplication f36920r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnFocusChangeListener {
        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            if (z4) {
                PayStartActivity.this.k0(null);
                PayStartActivity.this.f36912j.setVisibility(8);
                PayStartActivity.this.f36918p.setHint("");
                return;
            }
            PayStartActivity.this.f36918p.setHint(PayStartActivity.this.getString(R.string.papa_other));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (obj == null || obj.equals("") || obj.equals(com.join.mgps.Util.h0.f27805a)) {
                return;
            }
            PayStartActivity.this.u0(obj);
            PayStartActivity.this.f36908f.setVisibility(Float.compare(Float.parseFloat(editable.toString()), 3000.0f) >= 0 ? 0 : 8);
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
    public class c implements Comparator<PayActivityRebate> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PayActivityRebate payActivityRebate, PayActivityRebate payActivityRebate2) {
            return payActivityRebate.getMin_money() > payActivityRebate2.getMin_money() ? 1 : -1;
        }
    }

    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayStartActivity.this.f36908f.setVisibility(8);
            PayStartActivity.this.k0(view);
            if (view instanceof Button) {
                PayStartActivity.this.u0(view.getTag().toString());
            }
            PayStartActivity.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(View view) {
        int childCount = this.f36906d.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (this.f36906d.getChildAt(i4) instanceof Button) {
                Button button = (Button) this.f36906d.getChildAt(i4);
                if (button == view) {
                    button.setSelected(true);
                } else {
                    button.setSelected(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        this.f36918p.setText("");
        this.f36918p.clearFocus();
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f36918p.getWindowToken(), 0);
    }

    private void n0() {
        ArrayList arrayList = new ArrayList();
        this.f36916n = arrayList;
        arrayList.add(10);
        this.f36916n.add(30);
        this.f36916n.add(50);
        this.f36916n.add(100);
        this.f36916n.add(300);
        this.f36916n.add(500);
        this.f36916n.add(1000);
        this.f36916n.add(2000);
        this.f36917o = new d();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int a5 = com.join.mgps.Util.c0.a(this, 20.0f);
        int i4 = (displayMetrics.widthPixels - (a5 * 4)) / 3;
        int a6 = com.join.mgps.Util.c0.a(this, 40.0f);
        for (int i5 = 0; i5 < this.f36916n.size(); i5++) {
            Button button = new Button(this);
            button.setBackgroundResource(R.drawable.pay_papa_top);
            button.setText(this.f36916n.get(i5) + getString(R.string.papa_coin));
            if (this.f36916n.get(i5).intValue() == 100) {
                button.setSelected(true);
                PapayOrder papayOrder = this.f36911i;
                papayOrder.PRODUCT_NAME = this.f36916n.get(i5) + getString(R.string.papa_coin);
                PapayOrder papayOrder2 = this.f36911i;
                papayOrder2.MONEY_AMOUNT = this.f36916n.get(i5) + "";
                TextView textView = this.f36907e;
                String string = getResources().getString(R.string.papa_top_number);
                textView.setText(Html.fromHtml(String.format(string, "<font color = '#f2463b'>" + this.f36916n.get(i5) + "</font>")));
            }
            button.setTextColor(-899525);
            button.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, a6);
            layoutParams.leftMargin = a5;
            layoutParams.bottomMargin = a5;
            button.setPadding(0, 0, 0, 0);
            button.setLayoutParams(layoutParams);
            button.setOnClickListener(this.f36917o);
            button.setTag(this.f36916n.get(i5));
            this.f36906d.addView(button);
        }
        this.f36918p = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, a6);
        layoutParams2.leftMargin = a5;
        layoutParams2.bottomMargin = a5;
        this.f36918p.setLayoutParams(layoutParams2);
        this.f36918p.setHint(getString(R.string.papa_other));
        this.f36918p.setTextSize(12.0f);
        this.f36918p.setInputType(2);
        this.f36918p.setKeyListener(new DigitsKeyListener(false, true));
        this.f36918p.setBackgroundResource(R.drawable.pay_papa_edit_bg);
        this.f36918p.setHintTextColor(-6513508);
        this.f36918p.setTextColor(-899525);
        this.f36918p.setOnFocusChangeListener(new a());
        this.f36918p.addTextChangedListener(new b());
        this.f36918p.setGravity(17);
        this.f36906d.addView(this.f36918p);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f36906d.getLayoutParams();
        layoutParams3.bottomMargin = -com.join.mgps.Util.c0.a(this, 10.0f);
        this.f36906d.setLayoutParams(layoutParams3);
        this.f36909g.setText(Html.fromHtml(String.format(getString(R.string.papa_oto), "<font color = '#f2463b'>1</font>", "<font color = '#f2463b'>1</font>")));
    }

    private PayActivityRebate o0(int i4) {
        PayActivityBean payActivityBean = this.f36919q;
        if (payActivityBean == null || payActivityBean.getRebate_list() == null) {
            return null;
        }
        List<PayActivityRebate> rebate_list = this.f36919q.getRebate_list();
        for (int i5 = 0; i5 < rebate_list.size(); i5++) {
            PayActivityRebate payActivityRebate = rebate_list.get(i5);
            if (i5 == rebate_list.size() - 1 && payActivityRebate.getMin_money() <= i4) {
                return rebate_list.get(rebate_list.size() - 1);
            }
            if (i4 >= payActivityRebate.getMin_money() && i4 < rebate_list.get(i5 + 1).getMin_money()) {
                return rebate_list.get(i5);
            }
        }
        return null;
    }

    private void r0() {
        if (this.f36910h.isSelected()) {
            this.f36910h.setSelected(false);
            this.f36904b.setBackgroundResource(R.drawable.acount_is_sign_bg);
            return;
        }
        this.f36910h.setSelected(true);
        this.f36904b.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
    }

    private void s0(PayActivityRebate payActivityRebate) {
        if (payActivityRebate != null) {
            TextView textView = this.f36912j;
            String string = getString(R.string.pay_ad_config);
            textView.setText(Html.fromHtml(String.format(string, "<h2>" + payActivityRebate.getMin_money() + "</h2>", "<h2>" + payActivityRebate.getRebate_money() + "</h2>")));
            this.f36912j.setVisibility(0);
            return;
        }
        this.f36912j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(String str) {
        try {
            TextView textView = this.f36907e;
            String string = getResources().getString(R.string.papa_top_number);
            textView.setText(Html.fromHtml(String.format(string, "<font color = '#f2463b'>" + str + "</font>")));
            PapayOrder papayOrder = this.f36911i;
            papayOrder.PRODUCT_NAME = str + getString(R.string.papa_coin);
            this.f36911i.MONEY_AMOUNT = str;
            PayActivityRebate o02 = o0((int) Float.parseFloat(str));
            if (o02 != null) {
                TextView textView2 = this.f36912j;
                String string2 = getString(R.string.pay_ad_config);
                textView2.setText(Html.fromHtml(String.format(string2, "<h2>" + str + "</h2>", "<h2>" + o02.getRebate_money() + "</h2>")));
                this.f36912j.setVisibility(0);
            } else {
                this.f36912j.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v0() {
        int childCount = this.f36906d.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (this.f36906d.getChildAt(i4) instanceof Button) {
                Button button = (Button) this.f36906d.getChildAt(i4);
                PayActivityRebate o02 = o0(((Integer) button.getTag()).intValue());
                if (o02 != null) {
                    float parseFloat = Float.parseFloat(button.getTag().toString());
                    String string = getString(R.string.papa_pabi_top);
                    button.setText(String.format(string, button.getTag().toString(), Math.round((o02.getRebate_money() / parseFloat) * 100.0f) + "%"));
                } else {
                    button.setText(button.getTag().toString() + getString(R.string.papa_coin));
                }
                if (button.isSelected()) {
                    u0(button.getTag().toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f36913k = com.join.mgps.rpc.impl.n.h();
        MApplication mApplication = (MApplication) getApplication();
        this.f36920r = mApplication;
        mApplication.e(this);
        this.f36911i = new PapayOrder();
        this.f36905c.setText(R.string.papa_coin_top);
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f36914l = accountData;
        if (accountData == null) {
            com.join.mgps.Util.l2.a(this).b("你还没有登录,请先登录");
            IntentUtil.getInstance().goAccountCenterActivity(this);
            return;
        }
        this.f36911i.TOKEN = accountData.getToken();
        this.f36911i.PA_OPEN_UID = this.f36914l.getUid();
        this.f36911i.APP_USER_NAME = this.f36914l.getAccount();
        this.f36910h.setSelected(true);
        n0();
        loadData();
        TextView textView = this.f36908f;
        String string = getString(R.string.pay_money_big);
        textView.setText(Html.fromHtml(String.format(string, "<font color = '#000000'>" + getString(R.string.net_fight_room_exit_title) + "：</font>")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        try {
            if (com.join.android.app.common.utils.j.j(getApplicationContext())) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(getApplicationContext()).getUid());
                linkedMultiValueMap.add("token", AccountUtil_.getInstance_(getApplicationContext()).getToken());
                PapayVoucherResultMain<PayActivityConfig> g4 = this.f36913k.g(linkedMultiValueMap);
                if (g4 == null || g4.getError() != 0 || g4.getData() == null || g4.getData().getConfig() == null || g4.getData().getConfig().getActivity() == null) {
                    return;
                }
                this.f36919q = g4.getData().getConfig().getActivity();
                t0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FlowLayout flowLayout = this.f36906d;
        if (flowLayout != null) {
            flowLayout.removeAllViews();
            this.f36906d = null;
        }
        List<Integer> list = this.f36916n;
        if (list != null) {
            list.clear();
            this.f36916n = null;
        }
        this.f36917o = null;
        try {
            if (this.f36915m != null) {
                moveTaskToBack(true);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val("http://h5.5fun.com/wf_pay_service.html");
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        PayActivityBean payActivityBean = this.f36919q;
        if (payActivityBean != null && payActivityBean.getRebate_list() != null && this.f36919q.getRebate_list().size() > 0) {
            try {
                Collections.sort(this.f36919q.getRebate_list(), new c());
                v0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        this.f36912j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        if (this.f36910h.isSelected()) {
            if (Float.compare(Float.parseFloat(this.f36911i.MONEY_AMOUNT), 1.0f) >= 0) {
                PayNowActivity_.L0(this).c(this.f36911i).start();
                return;
            } else {
                Toast.makeText(this, "充值金额不得小于1元", 0).show();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b(getString(R.string.pay_talk_toast));
    }
}
