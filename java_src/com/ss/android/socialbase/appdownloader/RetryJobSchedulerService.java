package com.ss.android.socialbase.appdownloader;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.ss.android.socialbase.downloader.impls.g;
@TargetApi(21)
/* loaded from: classes5.dex */
public class RetryJobSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:14:0x002a, B:25:0x0048, B:27:0x0050, B:31:0x0070, B:33:0x0081, B:34:0x0084, B:36:0x008e, B:38:0x0094, B:40:0x00a2, B:42:0x00a7, B:17:0x0035), top: B:47:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #2 {all -> 0x00b7, blocks: (B:14:0x002a, B:25:0x0048, B:27:0x0050, B:31:0x0070, B:33:0x0081, B:34:0x0084, B:36:0x008e, B:38:0x0094, B:40:0x00a2, B:42:0x00a7, B:17:0x0035), top: B:47:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vv(com.ss.android.socialbase.downloader.model.DownloadInfo r11, long r12, boolean r14, int r15) {
        /*
            if (r11 == 0) goto Lbb
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            goto Lbb
        La:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.p.ky()
            if (r2 != 0) goto L11
            return
        L11:
            boolean r3 = r11.isPauseReserveOnWifi()
            r4 = 3
            r5 = 2
            if (r3 == 0) goto L2a
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.p.ky()
            com.ss.android.socialbase.downloader.downloader.Downloader r3 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3)
            com.ss.android.socialbase.downloader.downloader.g r3 = r3.getReserveWifiStatusListener()
            if (r3 == 0) goto L2a
            r3.vv(r11, r5, r4)
        L2a:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> Lb7
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3     // Catch: java.lang.Throwable -> Lb7
            if (r3 != 0) goto L35
            return
        L35:
            int r6 = r11.getId()     // Catch: java.lang.Throwable -> L3d
            r3.cancel(r6)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lb7
        L41:
            if (r15 == 0) goto L4d
            if (r14 == 0) goto L48
            if (r15 == r5) goto L48
            goto L4d
        L48:
            r6 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r12
            goto L50
        L4d:
            r12 = 1000(0x3e8, double:4.94E-321)
            r6 = r0
        L50:
            android.app.job.JobInfo$Builder r15 = new android.app.job.JobInfo$Builder     // Catch: java.lang.Throwable -> Lb7
            int r8 = r11.getId()     // Catch: java.lang.Throwable -> Lb7
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class<com.ss.android.socialbase.appdownloader.RetryJobSchedulerService> r10 = com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.class
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> Lb7
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> Lb7
            r15.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lb7
            android.app.job.JobInfo$Builder r12 = r15.setMinimumLatency(r12)     // Catch: java.lang.Throwable -> Lb7
            if (r14 == 0) goto L6f
            goto L70
        L6f:
            r5 = 1
        L70:
            android.app.job.JobInfo$Builder r12 = r12.setRequiredNetworkType(r5)     // Catch: java.lang.Throwable -> Lb7
            r13 = 0
            android.app.job.JobInfo$Builder r12 = r12.setRequiresCharging(r13)     // Catch: java.lang.Throwable -> Lb7
            android.app.job.JobInfo$Builder r12 = r12.setRequiresDeviceIdle(r13)     // Catch: java.lang.Throwable -> Lb7
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 <= 0) goto L84
            r12.setOverrideDeadline(r6)     // Catch: java.lang.Throwable -> Lb7
        L84:
            android.app.job.JobInfo r12 = r12.build()     // Catch: java.lang.Throwable -> Lb7
            int r12 = r3.schedule(r12)     // Catch: java.lang.Throwable -> Lb7
            if (r12 <= 0) goto La5
            boolean r13 = r11.isPauseReserveOnWifi()     // Catch: java.lang.Throwable -> Lb7
            if (r13 == 0) goto La5
            android.content.Context r13 = com.ss.android.socialbase.downloader.downloader.p.ky()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.downloader.Downloader r13 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r13)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.downloader.g r13 = r13.getReserveWifiStatusListener()     // Catch: java.lang.Throwable -> Lb7
            if (r13 == 0) goto La5
            r13.vv(r11, r4, r4)     // Catch: java.lang.Throwable -> Lb7
        La5:
            if (r12 > 0) goto Lb6
            java.lang.String r11 = "RetrySchedulerService"
            java.lang.String r13 = "schedule err errCode = "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r12 = r13.concat(r12)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.socialbase.downloader.p.vv.i(r11, r12)     // Catch: java.lang.Throwable -> Lb7
        Lb6:
            return
        Lb7:
            r11 = move-exception
            r11.printStackTrace()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.vv(com.ss.android.socialbase.downloader.model.DownloadInfo, long, boolean, int):void");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.ss.android.socialbase.downloader.downloader.p.vv(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        int onStartCommand = super.onStartCommand(intent, i4, i5);
        if (com.ss.android.socialbase.downloader.downloader.p.k()) {
            return 2;
        }
        return onStartCommand;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters != null) {
            int jobId = jobParameters.getJobId();
            com.ss.android.socialbase.downloader.p.vv.p("RetrySchedulerService", "onStartJob, id = ".concat(String.valueOf(jobId)));
            g.vv().vv(jobId);
            return false;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
