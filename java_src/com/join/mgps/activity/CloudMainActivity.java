package com.join.mgps.activity;

import android.content.Intent;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.CloudList;
import com.join.mgps.dto.GameWorldResponse;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.cloud_main)
/* loaded from: classes4.dex */
public class CloudMainActivity extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    List<DownloadTask> f28941b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28942c;
    @Bean

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.Util.b f28943d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.l f28944e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f28945f;

    /* renamed from: g  reason: collision with root package name */
    int f28946g;

    /* renamed from: h  reason: collision with root package name */
    int f28947h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.dialog.d1 f28948i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f28944e = com.join.mgps.rpc.impl.l.n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        startActivity(new Intent(this, CloudActivity_.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        j0();
        this.f28941b = p1.f.K().u();
        for (int i4 = 0; i4 < this.f28941b.size(); i4++) {
            DownloadTask downloadTask = this.f28941b.get(i4);
            this.f28946g += com.join.mgps.Util.g0.l(downloadTask.getPlugin_num(), downloadTask.getGameZipPath()).size();
        }
        GameWorldResponse<CloudList> z4 = this.f28944e.z(AccountUtil_.getInstance_(this).getAccountData().getUid(), AccountUtil_.getInstance_(this).getAccountData().getToken());
        if (z4.getError() == 0) {
            this.f28947h = z4.getData().getBackup_list().size();
        }
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        com.join.mgps.dialog.d1 d1Var = this.f28948i;
        if (d1Var != null) {
            d1Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        startActivity(new Intent(this, CloudDownloadListActivity_.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        com.join.mgps.dialog.d1 d1Var = this.f28948i;
        if (d1Var != null) {
            if (d1Var.isShowing()) {
                return;
            }
        } else {
            this.f28948i = com.join.mgps.Util.b0.f0(this).A(this, false);
        }
        this.f28948i.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        h0();
        TextView textView = this.f28942c;
        textView.setText("本地存档: " + this.f28946g + "个");
        TextView textView2 = this.f28945f;
        textView2.setText("云端存档: " + this.f28947h + "个");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getData();
    }
}
