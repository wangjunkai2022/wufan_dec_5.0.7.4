package com.join.android.app.common.servcie;

import android.content.Context;
import android.content.Intent;
import com.join.mgps.Util.l2;
/* compiled from: DownloadServiceHelper.java */
/* loaded from: classes3.dex */
public class r {

    /* compiled from: DownloadServiceHelper.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f14827b;

        a(Context context) {
            this.f14827b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.a(this.f14827b).b("当前版本不支持该类游戏\n升级后即可体验");
        }
    }

    /* compiled from: DownloadServiceHelper.java */
    /* loaded from: classes3.dex */
    class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f14828b;

        b(Context context) {
            this.f14828b = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f14828b.sendBroadcast(new Intent(o1.a.f72010l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r9, com.github.snowdream.android.app.downloader.DownloadTask r10) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.r.a(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r22, com.github.snowdream.android.app.downloader.DownloadTask r23, com.papa.sim.statistic.Event r24) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.r.b(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask, com.papa.sim.statistic.Event):void");
    }
}
