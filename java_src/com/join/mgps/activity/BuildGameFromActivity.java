package com.join.mgps.activity;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.dto.GameFromBooleanBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_build_game_from)
/* loaded from: classes4.dex */
public class BuildGameFromActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f28480b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28481c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    EditText f28482d;

    /* renamed from: e  reason: collision with root package name */
    Context f28483e;

    /* renamed from: f  reason: collision with root package name */
    InputFilter[] f28484f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.b f28485g;

    /* renamed from: h  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f28486h;

    /* renamed from: i  reason: collision with root package name */
    String f28487i;

    /* renamed from: j  reason: collision with root package name */
    String f28488j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void g0() {
        this.f28483e = this;
        this.f28487i = "";
        RequestBeanUtil.getInstance(this);
        this.f28488j = RequestBeanUtil.getVersionAndVersionName();
        this.f28485g = com.join.mgps.rpc.impl.a.c0();
        this.f28486h = AccountUtil_.getInstance_(this.f28483e).getAccountData();
        InputFilter[] inputFilterArr = {new com.join.mgps.Util.f1(24, this)};
        this.f28484f = inputFilterArr;
        this.f28482d.setFilters(inputFilterArr);
        this.f28482d.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            if (com.join.android.app.common.utils.j.j(this.f28483e)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.f28486h.getUid()));
                linkedMultiValueMap.add("token", this.f28486h.getToken());
                linkedMultiValueMap.add("group_title", this.f28482d.getText().toString().trim());
                linkedMultiValueMap.add("device_id", this.f28487i);
                linkedMultiValueMap.add("version", this.f28488j);
                GameFromBooleanBean p4 = this.f28485g.p(linkedMultiValueMap);
                if (p4 != null && p4.getError() == 0 && p4.getData().isState()) {
                    h0("创建成功！");
                    MApplication.I1 = true;
                    finish();
                } else if (p4.getData().getCode() == 10002) {
                    h0("游戏单重复！");
                } else if (10001 == p4.getData().getCode()) {
                    h0("游戏单不存在！");
                } else {
                    h0("创建失败！");
                }
            } else {
                h0("暂无网络！");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(String str) {
        com.join.mgps.Util.l2.a(this.f28483e).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        if (!this.f28482d.getText().toString().equals("") && !com.join.mgps.Util.o.f(this.f28482d.getText().toString())) {
            getData();
        } else {
            com.join.mgps.Util.l2.a(this.f28483e).b("不能为空且不能输入表情！");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        finish();
    }
}
