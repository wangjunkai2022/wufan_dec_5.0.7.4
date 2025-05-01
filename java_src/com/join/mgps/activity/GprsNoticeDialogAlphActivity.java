package com.join.mgps.activity;

import android.widget.Button;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.UpdateIntentDataBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.fc_notice_dialog)
/* loaded from: classes4.dex */
public class GprsNoticeDialogAlphActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    DownloadTask f33447b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f33448c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    EMUApkTable f33449d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    boolean f33450e = false;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    UpdateIntentDataBean f33451f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33452g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f33453h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f33454i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f33455j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33456k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33457l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        if (this.f33450e) {
            this.f33453h.setText("正在使用流量更新游戏");
            this.f33456k.setText("马上更新");
        } else {
            this.f33453h.setText("正在使用流量下载");
            this.f33456k.setText("马上下载");
        }
        this.f33454i.setText(this.f33448c);
        this.f33455j.setText("可在我的>管理>设置 里修改提醒");
        this.f33457l.setText("下次再说");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        EMUApkTable eMUApkTable = this.f33449d;
        if (eMUApkTable != null) {
            UtilsMy.r1(eMUApkTable, this);
        }
        if (this.f33450e) {
            UtilsMy.t1(this, this.f33451f);
        } else {
            com.php25.PDownload.d.f(this.f33447b, this);
        }
        finish();
    }
}
