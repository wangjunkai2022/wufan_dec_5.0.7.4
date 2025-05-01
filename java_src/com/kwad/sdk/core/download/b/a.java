package com.kwad.sdk.core.download.b;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.api.push.KsNotificationCompat;
import com.kwad.sdk.core.download.DownloadParams;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.d;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.am;
import com.kwad.sdk.utils.at;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes5.dex */
public final class a implements d {
    private static c avM;
    private static HashMap<String, WeakReference<Bitmap>> avL = new HashMap<>();
    private static final Handler avN = new HandlerC0522a();

    /* renamed from: com.kwad.sdk.core.download.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class HandlerC0522a extends Handler {
        private final SparseArray<Long> avO;

        HandlerC0522a() {
            super(Looper.getMainLooper());
            this.avO = new SparseArray<>();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z4 = message.arg1 == 1;
            int i4 = message.arg2;
            boolean z5 = i4 == 1;
            boolean z6 = i4 == 2;
            Long l4 = this.avO.get(message.what);
            NotificationManager notificationManager = (NotificationManager) com.kwad.sdk.c.yq().getContext().getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
            if (com.kwad.sdk.c.yq().bS(message.what) == null && !z6) {
                removeMessages(message.what);
                notificationManager.cancel(message.what);
            } else if (z4 || l4 == null || System.currentTimeMillis() - l4.longValue() >= 110) {
                if (z5) {
                    notificationManager.cancel(message.what);
                }
                a.a(message.what, (Notification) message.obj);
                this.avO.put(message.what, Long.valueOf(System.currentTimeMillis()));
            } else {
                sendMessageDelayed(Message.obtain(message), (l4.longValue() + 110) - System.currentTimeMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b {
        private static String avP = "ksad_notification_default_icon";
        private String abi;
        private String avQ;
        private String avR;
        private String avT;
        private String name;
        private int progress;
        private File avS = null;
        private boolean avU = false;

        private b() {
        }

        public static String DU() {
            return avP;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(DownloadTask downloadTask, String str, String str2) {
            b bVar = new b();
            Object tag = downloadTask.getTag();
            if (tag instanceof DownloadParams) {
                DownloadParams downloadParams = (DownloadParams) tag;
                File bZ = ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).bZ(downloadParams.mAppIcon);
                if (bZ != null && bZ.exists()) {
                    bVar.avS = bZ;
                }
                bVar.name = downloadParams.mAppName;
            }
            bVar.avU = downloadTask.isPaused();
            bVar.abi = str;
            bVar.avT = str2;
            bVar.avQ = a.ap(downloadTask.getSmallFileSoFarBytes()) + " / " + a.ap(downloadTask.getSmallFileTotalBytes());
            bVar.avR = a.ap((long) downloadTask.getSmallFileTotalBytes());
            bVar.progress = (int) ((((float) downloadTask.getSmallFileSoFarBytes()) * 100.0f) / ((float) downloadTask.getSmallFileTotalBytes()));
            return bVar;
        }

        public final String DV() {
            return this.avQ;
        }

        public final String DW() {
            return this.avR;
        }

        public final String DX() {
            return this.abi;
        }

        public final File DY() {
            return this.avS;
        }

        public final String DZ() {
            return "正在下载 " + this.progress + "%";
        }

        public final String Ea() {
            return this.avT;
        }

        public final String getName() {
            String str = this.name;
            return str == null ? "" : str;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final boolean isPaused() {
            return this.avU;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(DownloadParams downloadParams, String str, String str2) {
            File bZ;
            b bVar = new b();
            bVar.name = downloadParams.mAppName;
            if (!TextUtils.isEmpty(downloadParams.mAppIcon) && (bZ = ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).bZ(downloadParams.mAppIcon)) != null && bZ.exists()) {
                bVar.avS = bZ;
            }
            bVar.abi = str;
            bVar.avR = a.ap(downloadParams.mAppSize);
            bVar.avT = str2;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c extends BroadcastReceiver {
        private static void d(@NonNull Intent intent) {
            DownloadTask f5 = f(intent);
            if (f5 == null) {
                return;
            }
            com.kwad.sdk.c.yq().bU(f5.getId());
        }

        private static void e(@NonNull Intent intent) {
            DownloadTask f5 = f(intent);
            if (f5 == null) {
                return;
            }
            f5.setNotificationRemoved(true);
        }

        @Nullable
        private static DownloadTask f(Intent intent) {
            int i4 = intent.getExtras().getInt("taskId", 0);
            if (i4 == 0) {
                return null;
            }
            return com.kwad.sdk.c.yq().bS(i4);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.ksad.action.ACTION_NOTIFICATION_CLICK_CONTROL_BTN".equals(action)) {
                d(intent);
            } else if ("com.ksad.action.ACTION_NOTIFICATION_REMOVED".equals(action)) {
                e(intent);
            }
        }
    }

    private static void DT() {
        if (avM != null) {
            return;
        }
        avM = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ksad.action.ACTION_NOTIFICATION_CLICK_CONTROL_BTN");
        intentFilter.addAction("com.ksad.action.ACTION_NOTIFICATION_REMOVED");
        if (Build.VERSION.SDK_INT >= 33) {
            ServiceProvider.Lw().registerReceiver(avM, intentFilter, 2);
        } else {
            ServiceProvider.Lw().registerReceiver(avM, intentFilter);
        }
    }

    private static Bitmap F(Context context, String str) {
        WeakReference<Bitmap> weakReference = avL.get(str);
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeResource = BitmapFactory.decodeResource(at.cH(context), at.at(context, str));
            avL.put(str, new WeakReference<>(decodeResource));
            return decodeResource;
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i4, Notification notification) {
        DT();
        NotificationManager notificationManager = (NotificationManager) ServiceProvider.Lw().getSystemService("notification");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("download_channel", "ksad", 3);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound(null, null);
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(i4, notification);
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public static String ap(long j4) {
        return String.format("%.2fMB", Float.valueOf((((float) j4) / 1000.0f) / 1000.0f));
    }

    private static DownloadParams m(DownloadTask downloadTask) {
        DownloadParams downloadParams;
        if (downloadTask == null) {
            return null;
        }
        Object tag = downloadTask.getTag();
        if (tag instanceof DownloadParams) {
            downloadParams = (DownloadParams) tag;
        } else {
            downloadParams = new DownloadParams();
        }
        downloadParams.mAppSize = downloadTask.getSmallFileTotalBytes();
        downloadParams.mTaskId = downloadTask.getId();
        downloadParams.filePath = downloadTask.getTargetFilePath();
        return downloadParams;
    }

    private static Bitmap q(File file) {
        String absolutePath = file.getAbsolutePath();
        WeakReference<Bitmap> weakReference = avL.get(absolutePath);
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath);
            avL.put(absolutePath, new WeakReference<>(decodeFile));
            return decodeFile;
        }
        return bitmap;
    }

    @Override // com.kwad.sdk.d
    public final void bV(int i4) {
        Context Lw = ServiceProvider.Lw();
        if (Lw == null) {
            return;
        }
        ((NotificationManager) Lw.getSystemService("notification")).cancel(i4);
    }

    @Override // com.kwad.sdk.d
    public final void bX(String str) {
        Context Lw = ServiceProvider.Lw();
        DownloadParams dc = com.kwad.sdk.core.a.BK().dc(str);
        com.kwad.sdk.core.a.BK().dd(str);
        if (Lw == null || dc == null) {
            return;
        }
        com.kwad.sdk.core.a.BK().dd(dc.filePath);
        b a5 = b.a(dc, "安装完成", "立刻打开");
        com.kwad.sdk.core.download.b.b bl = com.kwad.sdk.core.download.b.b.bl(Lw);
        if (bl == null) {
            return;
        }
        a(Lw, bl, a5);
        a(Lw, bl.build(), false, false, am.d(Lw, dc.mPkgname, dc.mTaskId), dc.mTaskId, 1, 2);
    }

    @Override // com.kwad.sdk.d
    public final void g(File file) {
        Context Lw = ServiceProvider.Lw();
        if (Lw == null) {
            return;
        }
        DownloadParams dc = com.kwad.sdk.core.a.BK().dc(file.getAbsolutePath());
        com.kwad.sdk.core.a.BK().dd(file.getAbsolutePath());
        if (dc == null) {
            return;
        }
        AdTemplate de2 = com.kwad.sdk.core.a.BK().de(dc.mDownloadid);
        if (de2 != null) {
            de2.installFrom = "recall";
        }
        b a5 = b.a(dc, "下载完成", "立即安装");
        com.kwad.sdk.core.download.b.b bl = com.kwad.sdk.core.download.b.b.bl(Lw);
        if (bl == null) {
            return;
        }
        a(Lw, bl, a5);
        a(Lw, bl.build(), false, false, am.a(Lw, file, dc.mTaskId, dc.requestInstallPermission), dc.mTaskId, 1, 2);
    }

    @Override // com.kwad.sdk.d
    public final void i(DownloadTask downloadTask) {
        Object tag = downloadTask.getTag();
        if (tag instanceof DownloadParams) {
            String str = ((DownloadParams) tag).mAppIcon;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File bZ = ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).bZ(str);
            if (bZ == null || !bZ.exists()) {
                ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).a(true, str, "", "");
            }
        }
    }

    @Override // com.kwad.sdk.d
    public final void j(DownloadTask downloadTask) {
        Context Lw = ServiceProvider.Lw();
        if (Lw == null || downloadTask.isNotificationRemoved()) {
            return;
        }
        b a5 = b.a(downloadTask, downloadTask.getSmallFileSoFarBytes() > 0 && downloadTask.getSmallFileTotalBytes() > 0 ? "正在下载" : "准备下载", (String) null);
        com.kwad.sdk.core.download.b.c a6 = com.kwad.sdk.core.download.b.c.a(Lw, downloadTask.getId(), downloadTask.downloadEnablePause);
        if (a6 == null) {
            return;
        }
        a(Lw, a6, a5);
        a(Lw, a6.build(), false, true, null, downloadTask.getId(), 1, downloadTask.isCompleted() ? 1 : 0);
    }

    @Override // com.kwad.sdk.d
    public final void k(DownloadTask downloadTask) {
        DownloadParams m4;
        com.kwad.sdk.core.download.b.b bl;
        Context Lw = ServiceProvider.Lw();
        if (Lw == null || (m4 = m(downloadTask)) == null || (bl = com.kwad.sdk.core.download.b.b.bl(Lw)) == null) {
            return;
        }
        a(Lw, bl, b.a(downloadTask, "下载完成", "立即安装"));
        com.kwad.sdk.core.a.BK().a(downloadTask.getTargetFilePath(), m4);
        com.kwad.sdk.core.a.BK().a(m4.mPkgname, m4);
        a(Lw, bl.build(), false, false, am.a(Lw, new File(downloadTask.getTargetFilePath()), m4.mTaskId, m4.requestInstallPermission), downloadTask.getId(), 1, 1);
    }

    @Override // com.kwad.sdk.d
    public final void a(DownloadTask downloadTask, boolean z4) {
        com.kwad.sdk.core.download.b.c a5;
        Context Lw = ServiceProvider.Lw();
        if (Lw == null || downloadTask.isNotificationRemoved() || (a5 = com.kwad.sdk.core.download.b.c.a(Lw, downloadTask.getId(), downloadTask.downloadEnablePause)) == null) {
            return;
        }
        a(Lw, a5, b.a(downloadTask, "正在下载", (String) null));
        a(Lw, a5.build(), false, true, null, downloadTask.getId(), z4 ? 1 : 0, downloadTask.isCompleted() ? 1 : 0);
    }

    private boolean a(com.kwad.sdk.core.download.b.c cVar, File file) {
        try {
            cVar.setIcon(q(file));
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            com.kwad.sdk.service.c.gatherException(e5);
            return false;
        }
    }

    private boolean a(Context context, com.kwad.sdk.core.download.b.c cVar, String str) {
        try {
            cVar.setIcon(F(context, str));
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            com.kwad.sdk.service.c.gatherException(e5);
            return false;
        }
    }

    private boolean a(com.kwad.sdk.core.download.b.b bVar, File file) {
        try {
            bVar.setIcon(q(file));
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            com.kwad.sdk.service.c.gatherException(e5);
            return false;
        }
    }

    private boolean a(Context context, com.kwad.sdk.core.download.b.b bVar, String str) {
        try {
            bVar.setIcon(F(context, str));
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            com.kwad.sdk.service.c.gatherException(e5);
            return false;
        }
    }

    private void a(Context context, RemoteViews remoteViews, boolean z4, boolean z5, @Nullable PendingIntent pendingIntent, int i4, int i5, int i6) {
        KsNotificationCompat.Builder builder = new KsNotificationCompat.Builder(context, "download_channel");
        builder.setWhen(System.currentTimeMillis()).setOngoing(false).setAutoCancel(false).setOnlyAlertOnce(true).setPriority(-1).setContentIntent(pendingIntent).setSmallIcon(at.getAppIconId(context));
        a(builder, remoteViews);
        if (z5) {
            Intent intent = new Intent("com.ksad.action.ACTION_NOTIFICATION_REMOVED");
            intent.putExtra("taskId", i4);
            builder.setDeleteIntent(am.a(context, i4, intent));
        }
        Handler handler = avN;
        handler.removeMessages(i4);
        handler.obtainMessage(i4, i5, i6, builder.build()).sendToTarget();
    }

    private static void a(KsNotificationCompat.Builder builder, RemoteViews remoteViews) {
        try {
            builder.setDecoratedCustomStyle().setCustomBigContentView(remoteViews).setCustomContentView(remoteViews);
        } catch (Throwable unused) {
            builder.setContent(remoteViews);
        }
    }

    private void a(Context context, com.kwad.sdk.core.download.b.c cVar, b bVar) {
        cVar.setName(bVar.getName());
        File DY = bVar.DY();
        if (!((DY == null || !DY.exists()) ? false : a(cVar, DY))) {
            a(context, cVar, b.DU());
        }
        cVar.setStatus(bVar.DX());
        cVar.setSize(bVar.DV());
        cVar.setPercentNum(bVar.DZ());
        cVar.setProgress(100, bVar.getProgress(), false);
        cVar.setControlBtnPaused(bVar.isPaused());
    }

    private void a(Context context, com.kwad.sdk.core.download.b.b bVar, b bVar2) {
        bVar.setName(bVar2.getName());
        File DY = bVar2.DY();
        if (!((DY == null || !DY.exists()) ? false : a(bVar, DY))) {
            a(context, bVar, b.DU());
        }
        bVar.setStatus(bVar2.DX());
        bVar.setSize(bVar2.DW());
        bVar.setInstallText(bVar2.Ea());
    }
}
