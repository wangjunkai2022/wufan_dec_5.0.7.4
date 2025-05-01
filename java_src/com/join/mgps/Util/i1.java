package com.join.mgps.Util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.MGMainActivity_;
/* compiled from: NotificationAdmain.java */
/* loaded from: classes3.dex */
public class i1 {

    /* renamed from: g  reason: collision with root package name */
    private static int f27832g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static final int f27833h = 134217728;

    /* renamed from: a  reason: collision with root package name */
    private NotificationManager f27834a;

    /* renamed from: b  reason: collision with root package name */
    private Notification f27835b;

    /* renamed from: c  reason: collision with root package name */
    private NotificationCompat.Builder f27836c;

    /* renamed from: d  reason: collision with root package name */
    private Notification.Builder f27837d;

    /* renamed from: e  reason: collision with root package name */
    private Context f27838e;

    /* renamed from: f  reason: collision with root package name */
    int f27839f = (int) SystemClock.uptimeMillis();

    /* compiled from: NotificationAdmain.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 <= 100; i4 += 10) {
                i1.this.f27836c.setProgress(100, i4, false);
                i1.this.g();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
            i1.this.f27836c.setContentText("下载完成~").setProgress(0, 0, false);
            i1.this.g();
        }
    }

    public i1(Context context, int i4) {
        f27832g = i4;
        this.f27838e = context;
        this.f27834a = (NotificationManager) context.getSystemService("notification");
        this.f27836c = new NotificationCompat.Builder(this.f27838e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Notification build = this.f27836c.build();
        this.f27835b = build;
        this.f27834a.notify(f27832g, build);
    }

    private void h(Intent intent, int i4, String str) {
        this.f27837d = new Notification.Builder(this.f27838e);
        this.f27837d.setContentIntent(PendingIntent.getActivity(this.f27838e, this.f27839f, intent, f27833h));
        this.f27837d.setSmallIcon(i4);
        this.f27837d.setTicker(str);
        this.f27837d.setAutoCancel(true);
        this.f27837d.setWhen(System.currentTimeMillis());
        this.f27837d.setPriority(2);
        Notification.Builder builder = this.f27837d;
        builder.setSound(Uri.parse("android.resource://" + this.f27838e.getPackageName() + net.lingala.zip4j.util.e.F0 + R.raw.jiejitoubi));
    }

    private void i(Intent intent, int i4, String str, String str2, String str3) {
        intent.setFlags(335544320);
        this.f27836c.setContentIntent(PendingIntent.getActivity(this.f27838e, this.f27839f, intent, f27833h));
        this.f27836c.setSmallIcon(i4);
        this.f27836c.setTicker(str);
        this.f27836c.setContentTitle(str2);
        this.f27836c.setContentText(str3);
        this.f27836c.setWhen(System.currentTimeMillis());
        this.f27836c.setAutoCancel(true);
        this.f27836c.setPriority(2);
        if (f27832g == 1) {
            NotificationCompat.Builder builder = this.f27836c;
            builder.setSound(Uri.parse("android.resource://" + this.f27838e.getPackageName() + net.lingala.zip4j.util.e.F0 + R.raw.jiejitoubi));
        }
    }

    public void c() {
        this.f27834a.cancelAll();
    }

    public void d(Intent intent, int i4, String str, String str2, String str3) {
        i(intent, i4, str, str2, str3);
        g();
    }

    public void e(Intent intent, int i4, String str, String str2, int i5) {
        i(intent, i4, str, str2, null);
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigPicture(BitmapFactory.decodeResource(this.f27838e.getResources(), i5));
        this.f27836c.setStyle(bigPictureStyle);
        g();
    }

    public void f(Intent intent, int i4, String str, String str2, String str3) {
        i(intent, i4, str, str2, str3);
        new Thread(new a()).start();
    }

    public void j(Intent intent, int i4, String str, int i5, String str2, String str3) {
        i(intent, i4, str, str2, str3);
        this.f27836c.setLargeIcon(BitmapFactory.decodeResource(this.f27838e.getResources(), i5));
        this.f27836c.setOngoing(true);
        Intent intent2 = new Intent(this.f27838e, MGMainActivity_.class);
        this.f27836c.setDeleteIntent(PendingIntent.getService(this.f27838e, (int) SystemClock.uptimeMillis(), intent2, f27833h));
        this.f27836c.setDefaults(5);
        this.f27836c.setVibrate(new long[]{0, 100, 200, 300});
        this.f27836c.setAutoCancel(true);
        this.f27836c.setNumber(3);
        this.f27836c.setStyle(new NotificationCompat.InboxStyle().addLine("M.Lynn 你好，我是kale").addLine("M.Lynn 已收到，保证完成任务").addLine("M.Lynn 哈哈，明白了~").setSummaryText("+3 more"));
        g();
    }

    public void k(RemoteViews remoteViews, Intent intent, int i4, String str) {
        i(intent, i4, str, null, null);
        Notification build = this.f27836c.build();
        this.f27835b = build;
        build.contentView = remoteViews;
        this.f27834a.notify(f27832g, build);
    }
}
