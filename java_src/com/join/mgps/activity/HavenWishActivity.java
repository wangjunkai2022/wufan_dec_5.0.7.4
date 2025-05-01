package com.join.mgps.activity;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.HavenWishResultBean;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.haven_wish_acitivity)
/* loaded from: classes4.dex */
public class HavenWishActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f33930b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f33931c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    EditText f33932d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.i f33933e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    DownloadTask f33934f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f33933e = com.join.mgps.rpc.impl.g.A0();
        EditText editText = this.f33932d;
        editText.setText("求大神告诉我哪里可以下载" + this.f33934f.getShowName() + "？");
        this.f33932d.requestFocus();
        EditText editText2 = this.f33932d;
        editText2.setSelection(editText2.getText().length());
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            String obj = this.f33932d.getText().toString();
            if (com.join.mgps.Util.g2.i(obj.trim())) {
                g0(obj);
                return;
            } else {
                com.join.mgps.Util.l2.a(this).b("请输入你的愿望");
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("请检查网络");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0(String str) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            HashMap hashMap = new HashMap();
            hashMap.put("uid", Integer.valueOf(accountData.getUid()));
            hashMap.put("token", accountData.getToken());
            hashMap.put("message", str);
            hashMap.put("game_id", this.f33934f.getCrc_link_type_val());
            i0(this.f33933e.g0(hashMap).getData());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 300)
    public void h0() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.f33932d, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(HavenWishResultBean havenWishResultBean) {
        if (havenWishResultBean.isResult()) {
            finish();
            com.join.mgps.Util.l2.a(this).b("许愿成功");
            return;
        }
        com.join.mgps.Util.l2.a(this).b(havenWishResultBean.getMsg());
    }
}
