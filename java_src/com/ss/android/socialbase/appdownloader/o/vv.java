package com.ss.android.socialbase.appdownloader.o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.appdownloader.o;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class vv extends com.ss.android.socialbase.downloader.notification.vv {

    /* renamed from: i  reason: collision with root package name */
    private String f60837i;

    /* renamed from: m  reason: collision with root package name */
    private final Context f60838m;

    /* renamed from: o  reason: collision with root package name */
    private String f60839o;

    /* renamed from: p  reason: collision with root package name */
    private final Resources f60840p;

    /* renamed from: u  reason: collision with root package name */
    private String f60841u;

    public vv(Context context, int i4, String str, String str2, String str3, String str4) {
        super(i4, str);
        this.f60839o = str2;
        this.f60837i = str3;
        this.f60841u = str4;
        Context applicationContext = context.getApplicationContext();
        this.f60838m = applicationContext;
        this.f60840p = applicationContext.getResources();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:15:0x004b). Please submit an issue!!! */
    private NotificationCompat.Builder k() {
        NotificationCompat.Builder builder;
        String wv = com.ss.android.socialbase.appdownloader.i.k().wv();
        if (Build.VERSION.SDK_INT < 26) {
            return new NotificationCompat.Builder(this.f60838m);
        }
        if (TextUtils.isEmpty(wv)) {
            wv = com.ss.android.socialbase.appdownloader.p.m(this.f60838m);
        }
        try {
            if (com.ss.android.socialbase.appdownloader.i.k().r() != null) {
                builder = com.ss.android.socialbase.appdownloader.i.k().r().vv(this.f60838m, wv);
            } else {
                builder = new NotificationCompat.Builder(this.f60838m, wv);
            }
        } catch (NoSuchMethodError unused) {
            builder = new NotificationCompat.Builder(this.f60838m);
        }
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Notification m(com.ss.android.socialbase.downloader.exception.BaseException r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.o.vv.m(com.ss.android.socialbase.downloader.exception.BaseException, boolean):android.app.Notification");
    }

    private RemoteViews wv() {
        RemoteViews remoteViews = new RemoteViews(this.f60838m.getPackageName(), o.vv());
        if (Build.VERSION.SDK_INT > 20) {
            try {
                if (com.ss.android.socialbase.appdownloader.p.vv(this.f60838m)) {
                    remoteViews.setInt(o.u(), "setBackgroundColor", this.f60838m.getResources().getColor(o.g()));
                }
            } catch (Throwable unused) {
            }
        }
        return remoteViews;
    }

    @Override // com.ss.android.socialbase.downloader.notification.vv
    public void vv(DownloadInfo downloadInfo) {
        super.vv(downloadInfo);
        this.f60839o = downloadInfo.getSavePath();
        this.f60837i = downloadInfo.getName();
        this.f60841u = downloadInfo.getExtra();
    }

    @Override // com.ss.android.socialbase.downloader.notification.vv
    public void vv(BaseException baseException, boolean z4) {
        if (this.f60838m == null) {
            return;
        }
        try {
            Notification m4 = m(baseException, z4);
            this.vv = m4;
            vv(m4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean vv(BaseException baseException, com.ss.android.socialbase.downloader.n.vv vvVar, DownloadInfo downloadInfo) {
        return baseException != null && (baseException.getErrorCode() == 1013 || baseException.getErrorCode() == 1049) && downloadInfo != null && "application/vnd.android.package-archive".contains(downloadInfo.getMimeType()) && vvVar.vv("notification_text_opt", 0) == 1;
    }

    private int vv(int i4, int i5) {
        if (com.ss.android.socialbase.downloader.n.vv.vv(i5).m("notification_opt_2") == 1) {
            return o.v();
        }
        if (i4 == 1 || i4 == 4) {
            return o.x();
        }
        if (i4 == 2) {
            return o.y();
        }
        if (i4 == 3) {
            return o.v();
        }
        return 0;
    }

    private PendingIntent vv(String str, int i4, int i5) {
        Intent intent = new Intent(this.f60838m, DownloadHandlerService.class);
        intent.setAction(str);
        intent.putExtra("extra_click_download_ids", i5);
        intent.putExtra("extra_click_download_type", i4);
        intent.putExtra("extra_from_notification", true);
        return PendingIntent.getService(this.f60838m, i5, intent, 201326592);
    }

    private int vv(int i4) {
        if (com.ss.android.socialbase.downloader.n.vv.vv(i4).m("enable_notification_ui") > 0) {
            return o.qv();
        }
        return o.n();
    }
}
