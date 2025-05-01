package com.join.kotlin.quark;

import android.os.Bundle;
import android.text.TextUtils;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkInstallBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.quark.proxy.QuarkInstallClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkInstallViewModel;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.c2;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.q1;
import com.join.mgps.service.CommonService_;
import com.papa91.arc.ext.ToastManager;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuarkInstallActivity.kt */
/* loaded from: classes.dex */
public final class QuarkInstallActivity extends BaseVmDbDialogActivity<QuarkInstallViewModel, ActivityQuarkInstallBinding> implements QuarkInstallClickProxy {
    @Nullable
    private DownloadTask quarkTask;

    private final void downloadQuark() {
        DownloadTask F = p1.f.K().F(q1.f27993d);
        if (F != null && F.getStatus() == 11) {
            com.join.android.app.common.utils.e.l0(this).x(this, F.getGameZipPath());
            return;
        }
        ToastManager.show("夸克下载中...");
        ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("action", "downloadQuark")).extra("isOm", false)).extra("qkPosition", "qk")).a();
    }

    private final void receiveDelete(DownloadTask downloadTask) {
        if (downloadTask != null && Intrinsics.areEqual(q1.f27993d, downloadTask.getCrc_link_type_val())) {
            ToastManager.show("下载文件已删除");
            getMDatabind().f16859c.setVisibility(8);
            getMDatabind().f16861e.setBackgroundResource(R.drawable.shape_489cff_r8);
            getMDatabind().f16861e.setText("安装夸克");
        }
    }

    private final void receiveError(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) || !Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), q1.f27993d)) {
                return;
            }
            getMDatabind().f16859c.setVisibility(8);
            getMDatabind().f16861e.setBackgroundResource(R.drawable.shape_489cff_r8);
            getMDatabind().f16861e.setText("安装夸克");
            UtilsMy.x4(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private final void receiveStart(DownloadTask downloadTask) {
        if (downloadTask != null && Intrinsics.areEqual(q1.f27993d, downloadTask.getCrc_link_type_val())) {
            this.quarkTask = downloadTask;
            getMDatabind().f16859c.setVisibility(0);
            getMDatabind().f16861e.setBackgroundResource(R.drawable.transparent_bg);
            getMDatabind().f16861e.setText("下载中...");
        }
    }

    private final void receiveSuccess(DownloadTask downloadTask) {
        if (downloadTask != null && Intrinsics.areEqual(q1.f27993d, downloadTask.getCrc_link_type_val())) {
            getMDatabind().f16859c.setProgress(100);
            getMDatabind().f16859c.setVisibility(8);
            getMDatabind().f16861e.setBackgroundResource(R.drawable.shape_489cff_r8);
            getMDatabind().f16861e.setText("安装夸克");
        }
    }

    private final void updateProgressPartly() {
        DownloadTask downloadTask = this.quarkTask;
        if (downloadTask != null) {
            Intrinsics.checkNotNull(downloadTask);
            if (downloadTask.getStatus() != 2) {
                DownloadTask downloadTask2 = this.quarkTask;
                Intrinsics.checkNotNull(downloadTask2);
                if (downloadTask2.getStatus() != 12) {
                    return;
                }
            }
            try {
                DownloadTask downloadTask3 = this.quarkTask;
                Intrinsics.checkNotNull(downloadTask3);
                if (Intrinsics.areEqual(q1.f27993d, downloadTask3.getCrc_link_type_val())) {
                    com.join.android.app.common.servcie.i e5 = com.join.android.app.common.servcie.i.e();
                    DownloadTask downloadTask4 = this.quarkTask;
                    Intrinsics.checkNotNull(downloadTask4);
                    DownloadTask f5 = e5.f(downloadTask4.getCrc_link_type_val());
                    if (f5 != null) {
                        getMDatabind().f16859c.setProgress((int) f5.getProgress());
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
    }

    @Nullable
    public final DownloadTask getQuarkTask() {
        return this.quarkTask;
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        c2.s(this);
        getMDatabind().h((QuarkInstallViewModel) getMViewModel());
        getMDatabind().g(this);
        d0.a().d(this);
        this.quarkTask = p1.f.K().F(q1.f27993d);
    }

    @Override // com.join.kotlin.quark.proxy.QuarkInstallClickProxy
    public void onCloseClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@NotNull com.join.mgps.event.n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        DownloadTask a5 = downloadTaskEvent.a();
        switch (downloadTaskEvent.c()) {
            case 2:
                updateUI(a5, 1);
                return;
            case 3:
                updateUI(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
                updateUI(a5, 5);
                return;
            case 6:
                updateUI(a5, 6);
                return;
            case 7:
                updateUI(a5, 3);
                return;
            case 8:
                if (this.quarkTask == null && a5 != null && Intrinsics.areEqual(q1.f27993d, a5.getCrc_link_type_val())) {
                    this.quarkTask = a5;
                }
                updateProgressPartly();
                return;
            case 10:
                updateUI(a5, 7);
                return;
            case 11:
                updateUI(a5, 5);
                if (a5 == null || !Intrinsics.areEqual(q1.f27993d, a5.getCrc_link_type_val())) {
                    return;
                }
                getMDatabind().f16859c.setVisibility(8);
                UtilsMy.a4(this.quarkTask, this);
                return;
            case 12:
                updateUI(a5, 8);
                return;
            case 13:
                updateUI(a5, 9);
                return;
        }
    }

    @Override // com.join.kotlin.quark.proxy.QuarkInstallClickProxy
    public void onInstallClick() {
        downloadQuark();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this);
        Intrinsics.checkNotNullExpressionValue(l02, "getInstance_(this)");
        if (APKUtils.f(l02, this, q1.f27991b, null, 4, null)) {
            finish();
        }
    }

    public final void setQuarkTask(@Nullable DownloadTask downloadTask) {
        this.quarkTask = downloadTask;
    }

    public final void updateUI(@Nullable DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    receiveStart(downloadTask);
                    return;
                case 3:
                    receiveDelete(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }
}
