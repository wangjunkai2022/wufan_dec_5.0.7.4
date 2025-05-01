package com.join.mgps.activity;

import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.nontice_top_anim_dialog_layout)
/* loaded from: classes4.dex */
public class NoticeTopAnimActivityDialog extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f36137b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36138c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36139d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36140e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f36141f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f36142g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f36143h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f36144i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    int f36145j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    int f36146k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        int i4 = this.f36145j;
        if (i4 == 0) {
            this.f36138c.setVisibility(8);
            this.f36137b.setVisibility(0);
            this.f36143h.setText("确认");
            this.f36141f.setText(this.f36144i);
            this.f36139d.setText("支付失败");
        } else if (i4 == 1 || i4 == 2) {
            this.f36138c.setVisibility(0);
            this.f36137b.setVisibility(8);
            this.f36138c.setText(Html.fromHtml(this.f36144i), TextView.BufferType.SPANNABLE);
            com.join.mgps.Util.c.e(this.f36138c);
            g0(0);
        } else if (i4 != 3) {
            if (i4 != 6) {
                return;
            }
            this.f36139d.setText("支付成功");
            this.f36138c.setVisibility(0);
            this.f36137b.setVisibility(0);
            this.f36143h.setText("免费领铜板");
            this.f36141f.setText("您的铜板不多啦，去免费领点吧");
            this.f36138c.setText(Html.fromHtml(this.f36144i), TextView.BufferType.SPANNABLE);
            com.join.mgps.Util.c.e(this.f36138c);
            g0(1);
        } else {
            this.f36139d.setText("铜板余额不足");
            this.f36138c.setVisibility(8);
            this.f36137b.setVisibility(0);
            this.f36143h.setText("免费领铜板");
            this.f36141f.setText(Html.fromHtml(this.f36144i), TextView.BufferType.SPANNABLE);
            this.f36141f.setTextSize(20.0f);
            this.f36140e.setVisibility(0);
            TextView textView = this.f36140e;
            textView.setText("当前余额：" + this.f36146k);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void g0(int i4) {
        com.join.mgps.Util.c.f(this.f36138c);
        if (i4 == 0) {
            i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        int i4 = this.f36145j;
        if (i4 == 3 || i4 == 6) {
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54080r);
            ShareWebActivity_.t2(this).b(intentDateBean).start();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void i0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        IntentUtil.getInstance().goShareWebActivity(this, "http://h5.5fun.com/helo_copper.html");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
    }
}
