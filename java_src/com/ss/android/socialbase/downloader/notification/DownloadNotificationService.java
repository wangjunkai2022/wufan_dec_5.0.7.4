package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import com.kuaishou.weapon.p0.g;
import com.ss.android.socialbase.downloader.constants.o;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.qv.n;
import com.ss.android.socialbase.downloader.wv.u;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class DownloadNotificationService extends Service {

    /* renamed from: n  reason: collision with root package name */
    private static volatile long f61288n;
    private static boolean qv;

    /* renamed from: u  reason: collision with root package name */
    private static volatile long f61291u;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Notification> f61292b = new SparseArray<>(2);

    /* renamed from: k  reason: collision with root package name */
    private n f61293k;
    private static final String vv = DownloadNotificationService.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private static int f61287m = -1;

    /* renamed from: p  reason: collision with root package name */
    private static int f61290p = -1;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f61286i = true;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f61289o = false;
    private static long wv = 900;

    private void i() {
        if (this.f61293k == null) {
            n nVar = new n("DownloaderNotifyThread");
            this.f61293k = nVar;
            nVar.vv();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        i();
        p.vv(this);
        com.ss.android.socialbase.downloader.n.vv p4 = com.ss.android.socialbase.downloader.n.vv.p();
        int vv2 = p4.vv("download_service_foreground", 0);
        if ((vv2 == 1 || vv2 == 3) && f61287m == -1) {
            f61287m = 0;
        }
        if ((vv2 == 2 || vv2 == 3) && f61290p == -1) {
            f61290p = 0;
        }
        f61289o = p4.m("non_going_notification_foreground", false);
        qv = p4.m("notify_too_fast", false);
        long vv3 = p4.vv("notification_time_window", 900L);
        wv = vv3;
        if (vv3 < 0 || vv3 > 1200) {
            wv = 900L;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        n nVar = this.f61293k;
        if (nVar != null) {
            try {
                nVar.m();
            } catch (Throwable unused) {
            }
            this.f61293k = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        vv(intent);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61287m == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            r5 = this;
            boolean r0 = r5.vv(r7, r8)
            if (r0 == 0) goto L7b
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.i.vv()     // Catch: java.lang.Throwable -> L76
            int r0 = r0.vv(r7)     // Catch: java.lang.Throwable -> L76
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            boolean r0 = com.ss.android.socialbase.downloader.wv.u.p()     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L23
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61287m     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L23
        L21:
            r1 = 1
            goto L2a
        L23:
            if (r0 == 0) goto L2a
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61290p     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L2a
            goto L21
        L2a:
            if (r1 == 0) goto L90
            com.ss.android.socialbase.downloader.downloader.i r1 = com.ss.android.socialbase.downloader.downloader.i.vv()     // Catch: java.lang.Throwable -> L76
            com.ss.android.socialbase.downloader.downloader.r r1 = r1.p(r7)     // Catch: java.lang.Throwable -> L76
            boolean r2 = r1.n()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L66
            boolean r2 = r1.m()     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L66
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.vv     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "doNotify, startForeground, ======== id = "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L76
            r3.append(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = ", isIndependentProcess = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L76
            r3.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L76
            com.ss.android.socialbase.downloader.p.vv.p(r2, r3)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L60
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61290p = r7     // Catch: java.lang.Throwable -> L76
            goto L62
        L60:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61287m = r7     // Catch: java.lang.Throwable -> L76
        L62:
            r1.vv(r7, r8)     // Catch: java.lang.Throwable -> L76
            goto L90
        L66:
            java.lang.String r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.vv     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "doNotify: canStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L76
            com.ss.android.socialbase.downloader.p.vv.p(r1, r0)     // Catch: java.lang.Throwable -> L76
            goto L90
        L76:
            r0 = move-exception
            r0.printStackTrace()
            goto L90
        L7b:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61287m
            if (r0 == r7) goto L83
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61290p
            if (r0 != r7) goto L90
        L83:
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61289o
            if (r0 == 0) goto L90
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto L90
            r5.m(r6, r7)
        L90:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            long r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61291u     // Catch: java.lang.Throwable -> L9f
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L9c
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f61291u = r0     // Catch: java.lang.Throwable -> L9f
        L9c:
            r6.notify(r7, r8)     // Catch: java.lang.Throwable -> L9f
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.m(android.app.NotificationManager, int, android.app.Notification):void");
    }

    private void vv(final Intent intent) {
        n nVar;
        if (intent == null) {
            return;
        }
        final String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (nVar = this.f61293k) == null) {
            return;
        }
        nVar.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.1
            @Override // java.lang.Runnable
            public void run() {
                ConnectivityManager connectivityManager;
                NetworkInfo activeNetworkInfo;
                final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService("notification");
                final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                    final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                    int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                    if (intExtra == 0 || notification == null || notificationManager == null) {
                        return;
                    }
                    if (intExtra2 != 4) {
                        if (intExtra2 == -2 || intExtra2 == -3) {
                            if (!DownloadNotificationService.qv) {
                                if (DownloadNotificationService.this.f61293k != null) {
                                    DownloadNotificationService.this.f61293k.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            DownloadNotificationService.this.m(notificationManager, intExtra, notification);
                                        }
                                    }, intExtra2 == -2 ? 50L : 200L);
                                    return;
                                }
                                return;
                            }
                            DownloadNotificationService.this.vv(notificationManager, intExtra, notification);
                        } else if (DownloadNotificationService.qv) {
                            DownloadNotificationService.this.vv(notificationManager, intExtra, notification);
                        } else {
                            DownloadNotificationService.this.m(notificationManager, intExtra, notification);
                        }
                    } else if (Downloader.getInstance(p.ky()).isDownloading(intExtra)) {
                        DownloadInfo downloadInfo = Downloader.getInstance(p.ky()).getDownloadInfo(intExtra);
                        if (DownloadNotificationService.qv) {
                            if (downloadInfo == null || !downloadInfo.canNotifyProgress() || System.currentTimeMillis() - DownloadNotificationService.f61288n <= DownloadNotificationService.wv) {
                                return;
                            }
                            DownloadNotificationService.this.m(notificationManager, intExtra, notification);
                            downloadInfo.setLastNotifyProgressTime();
                        } else if (downloadInfo == null || !downloadInfo.canNotifyProgress()) {
                        } else {
                            DownloadNotificationService.this.m(notificationManager, intExtra, notification);
                            downloadInfo.setLastNotifyProgressTime();
                        }
                    }
                } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                    if (intExtra != 0) {
                        DownloadNotificationService.this.m(notificationManager, intExtra);
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        if (u.vv((Context) DownloadNotificationService.this, g.f55582b) && (connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                            ArrayList arrayList = new ArrayList();
                            if (!TextUtils.isEmpty(o.vv)) {
                                arrayList.add(o.vv);
                            }
                            arrayList.add("mime_type_plg");
                            Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                            if (applicationContext != null) {
                                Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(final NotificationManager notificationManager, final int i4, Notification notification) {
        synchronized (this.f61292b) {
            int indexOfKey = this.f61292b.indexOfKey(i4);
            if (indexOfKey >= 0 && indexOfKey < this.f61292b.size()) {
                this.f61292b.setValueAt(indexOfKey, notification);
                return;
            }
            long currentTimeMillis = wv - (System.currentTimeMillis() - f61291u);
            if (currentTimeMillis <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 20000) {
                currentTimeMillis = 20000;
            }
            long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
            f61288n = currentTimeMillis2;
            f61291u = currentTimeMillis2;
            if (currentTimeMillis <= 0) {
                m(notificationManager, i4, notification);
            } else if (this.f61293k != null) {
                synchronized (this.f61292b) {
                    this.f61292b.put(i4, notification);
                }
                this.f61293k.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DownloadNotificationService.this.vv(notificationManager, i4);
                    }
                }, currentTimeMillis);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(NotificationManager notificationManager, int i4) {
        boolean z4;
        vv vvVar;
        int vv2;
        int i5 = f61287m;
        if (i5 != i4 && f61290p != i4) {
            try {
                notificationManager.cancel(i4);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        boolean z5 = true;
        if (i5 == i4) {
            f61287m = 0;
            z4 = false;
        } else {
            f61290p = 0;
            z4 = true;
        }
        try {
            r p4 = i.vv().p(i4);
            if (!p4.m()) {
                f61286i = false;
                com.ss.android.socialbase.downloader.p.vv.i(vv, "try to stopForeground when is not Foreground, id = " + i4 + ", isIndependentProcess = " + z4);
            }
            com.ss.android.socialbase.downloader.p.vv.p(vv, "doCancel, ========== stopForeground id = " + i4 + ", isIndependentProcess = " + z4);
            p4.vv(false, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            notificationManager.cancel(i4);
        } catch (Throwable unused2) {
        }
        if (f61286i) {
            try {
                SparseArray<vv> m4 = m.vv().m();
                if (m4 != null) {
                    for (int size = m4.size() - 1; size >= 0; size--) {
                        vvVar = m4.valueAt(size);
                        if (vvVar != null && (vv2 = vvVar.vv()) != i4 && vv2 != f61287m && vv2 != f61290p && vvVar.qv()) {
                            if ((i.vv().vv(vvVar.vv()) == 1 && !u.p()) == z4) {
                                break;
                            }
                        }
                    }
                }
                vvVar = null;
                if (vvVar != null) {
                    int vv3 = vvVar.vv();
                    notificationManager.cancel(vv3);
                    if (Downloader.getInstance(this).getStatus(vv3) != 1) {
                        z5 = false;
                    }
                    com.ss.android.socialbase.downloader.p.vv.p(vv, "doCancel, updateNotification id = ".concat(String.valueOf(vv3)));
                    vvVar.vv((BaseException) null, z5);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(NotificationManager notificationManager, int i4) {
        Notification notification;
        synchronized (this.f61292b) {
            notification = this.f61292b.get(i4);
            this.f61292b.remove(i4);
        }
        if (notification != null) {
            m(notificationManager, i4, notification);
        }
    }

    private boolean vv(int i4, Notification notification) {
        int i5;
        int i6;
        if (!f61286i || (i5 = f61287m) == i4 || (i6 = f61290p) == i4) {
            return false;
        }
        if (i5 == 0 || i6 == 0) {
            if (f61289o && (notification.flags & 2) == 0) {
                return false;
            }
            return Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId());
        }
        return false;
    }
}
