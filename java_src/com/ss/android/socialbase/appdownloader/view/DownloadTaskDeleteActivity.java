package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.appdownloader.i;
import com.ss.android.socialbase.appdownloader.p.b;
import com.ss.android.socialbase.appdownloader.p.jh;
import com.ss.android.socialbase.appdownloader.p.p;
import com.ss.android.socialbase.appdownloader.wv;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.wv.u;
/* loaded from: classes5.dex */
public class DownloadTaskDeleteActivity extends Activity {

    /* renamed from: m  reason: collision with root package name */
    private Intent f60914m;
    private b vv;

    private void m() {
        Intent intent;
        if (this.vv != null || (intent = this.f60914m) == null) {
            return;
        }
        try {
            final boolean z4 = false;
            final int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
            final DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(intExtra);
            if (downloadInfo == null) {
                return;
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                return;
            }
            String format = String.format(getString(wv.vv(this, "tt_appdownloader_notification_download_delete")), title);
            p vv = i.k().vv();
            jh vv2 = vv != null ? vv.vv(this) : null;
            if (vv2 == null) {
                vv2 = new com.ss.android.socialbase.appdownloader.i.vv(this);
            }
            int vv3 = wv.vv(this, "tt_appdownloader_tip");
            int vv4 = wv.vv(this, "tt_appdownloader_label_ok");
            int vv5 = wv.vv(this, "tt_appdownloader_label_cancel");
            if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("cancel_with_net_opt", 0) == 1 && u.qv() && downloadInfo.getCurBytes() != downloadInfo.getTotalBytes()) {
                z4 = true;
            }
            if (z4) {
                vv4 = wv.vv(this, "tt_appdownloader_label_reserve_wifi");
                vv5 = wv.vv(this, "tt_appdownloader_label_cancel_directly");
                format = getResources().getString(wv.vv(this, "tt_appdownloader_resume_in_wifi"));
            }
            vv2.vv(vv3).vv(format).vv(vv4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    if (!z4) {
                        DownloadTaskDeleteActivity.this.vv(downloadInfo, intExtra);
                    } else {
                        downloadInfo.setOnlyWifi(true);
                        Downloader.getInstance(DownloadTaskDeleteActivity.this).pause(downloadInfo.getId());
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Downloader.getInstance(DownloadTaskDeleteActivity.this).resume(downloadInfo.getId());
                            }
                        }, 100L);
                    }
                    DownloadTaskDeleteActivity.this.finish();
                }
            }).m(vv5, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    if (z4) {
                        DownloadTaskDeleteActivity.this.vv(downloadInfo, intExtra);
                    }
                    DownloadTaskDeleteActivity.this.finish();
                }
            }).vv(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    DownloadTaskDeleteActivity.this.finish();
                }
            });
            this.vv = vv2.vv();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        vv();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f60914m = getIntent();
        m();
        b bVar = this.vv;
        if (bVar != null && !bVar.m()) {
            this.vv.vv();
        } else if (this.vv == null) {
            finish();
        }
    }

    private void vv() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(DownloadInfo downloadInfo, int i4) {
        com.ss.android.socialbase.appdownloader.p.i m4 = i.k().m();
        if (m4 != null) {
            m4.vv(downloadInfo);
        }
        vu downloadNotificationEventListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getDownloadNotificationEventListener(i4);
        if (downloadNotificationEventListener != null) {
            downloadNotificationEventListener.vv(10, downloadInfo, "", "");
        }
        if (com.ss.android.socialbase.downloader.downloader.p.ky() != null) {
            Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).cancel(i4);
        }
    }
}
