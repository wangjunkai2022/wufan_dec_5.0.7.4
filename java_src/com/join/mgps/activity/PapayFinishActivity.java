package com.join.mgps.activity;

import android.text.Html;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.PapayResult;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_papay_finish)
/* loaded from: classes4.dex */
public class PapayFinishActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36816b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36817c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36818d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36819e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f36820f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f36821g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36822h;

    /* renamed from: i  reason: collision with root package name */
    MApplication f36823i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    PapayResult f36824j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    boolean f36825k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        MApplication mApplication = (MApplication) getApplication();
        this.f36823i = mApplication;
        mApplication.e(this);
        this.f36818d.setText("订单支付");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            TextView textView = this.f36816b;
            textView.setText(Html.fromHtml("用户：<font color='0x3b3b3b' >" + accountData.getAccount() + "</font>"), TextView.BufferType.SPANNABLE);
        }
        if (this.f36824j.getStatus() == 1) {
            this.f36820f.setImageResource(R.drawable.papay_success_image);
            TextView textView2 = this.f36817c;
            textView2.setText(Html.fromHtml("<font color='0xfc3f5e' >" + this.f36824j.getPayProduct() + "</font>购买成功"), TextView.BufferType.SPANNABLE);
        } else if (this.f36824j.getStatus() == 4) {
            this.f36820f.setImageResource(R.drawable.papay_failed_image);
            TextView textView3 = this.f36817c;
            textView3.setText(Html.fromHtml("<font color='0xfc3f5e' >" + this.f36824j.getPayProduct() + "</font>等待支付"), TextView.BufferType.SPANNABLE);
        } else {
            this.f36820f.setImageResource(R.drawable.papay_failed_image);
            TextView textView4 = this.f36817c;
            textView4.setText(Html.fromHtml("<font color='0xfc3f5e' >" + this.f36824j.getPayProduct() + "</font>购买失败,原因：" + this.f36824j.getMessage()), TextView.BufferType.SPANNABLE);
        }
        if (this.f36825k) {
            this.f36819e.setText("VIP购买成功后，请重启悟饭游戏厅，VIP即生效");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f36823i.f();
    }
}
