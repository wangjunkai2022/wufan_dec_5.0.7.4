package com.join.mgps.activity;

import android.widget.ListView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.CloudList;
import com.join.mgps.dto.CloudRecord;
import com.join.mgps.dto.GameWorldResponse;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.cloud_download_list)
/* loaded from: classes4.dex */
public class CloudDownloadListActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    DownloadTask f28932b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ListView f28933c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.l f28934d;

    /* renamed from: e  reason: collision with root package name */
    List<CloudRecord> f28935e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f28934d = com.join.mgps.rpc.impl.l.n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        GameWorldResponse<CloudList> z4 = this.f28934d.z(AccountUtil_.getInstance_(this).getAccountData().getUid(), AccountUtil_.getInstance_(this).getAccountData().getToken());
        if (z4.getError() == 0) {
            this.f28935e = z4.getData().getBackup_list();
        }
    }
}
