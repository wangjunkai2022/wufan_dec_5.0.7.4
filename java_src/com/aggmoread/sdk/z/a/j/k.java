package com.aggmoread.sdk.z.a.j;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private NotificationCompat.Builder f2210a;

    /* renamed from: b  reason: collision with root package name */
    private NotificationManager f2211b;

    /* renamed from: c  reason: collision with root package name */
    private String f2212c;

    /* renamed from: d  reason: collision with root package name */
    private String f2213d;

    /* renamed from: e  reason: collision with root package name */
    private String f2214e;

    /* renamed from: f  reason: collision with root package name */
    private PendingIntent f2215f;

    /* renamed from: g  reason: collision with root package name */
    private int f2216g;

    /* renamed from: h  reason: collision with root package name */
    private int f2217h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2218i;

    public k(Context context, int i4, PendingIntent pendingIntent, String str, String str2, String str3, int i5) {
        this.f2211b = (NotificationManager) context.getSystemService("notification");
        this.f2216g = i4;
        this.f2212c = str2;
        this.f2213d = str3;
        this.f2214e = str;
        this.f2217h = i5;
        this.f2215f = pendingIntent;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, "下载通知", 2);
            try {
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.enableLights(false);
            } catch (Exception unused) {
            }
            this.f2211b.createNotificationChannel(notificationChannel);
        }
        this.f2210a = new NotificationCompat.Builder(context, str).setWhen(System.currentTimeMillis()).setAutoCancel(false).setOngoing(true).setOnlyAlertOnce(true).setPriority(2);
        e();
        b();
        c();
    }

    private void b() {
        if (TextUtils.isEmpty(this.f2213d)) {
            return;
        }
        this.f2210a.setContentText(this.f2213d);
    }

    private void d() {
        PendingIntent pendingIntent = this.f2215f;
        if (pendingIntent != null) {
            this.f2210a.setContentIntent(pendingIntent);
        }
    }

    private void e() {
        if (TextUtils.isEmpty(this.f2212c)) {
            return;
        }
        this.f2210a.setContentTitle(this.f2212c);
    }

    public void a(int i4) {
        com.aggmoread.sdk.z.a.d.c("DownloadNotification", "show#1 = " + i4);
        e();
        b();
        this.f2210a.setProgress(100, i4, false);
        this.f2211b.notify(this.f2216g, this.f2210a.build());
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f2210a.setLargeIcon(bitmap);
            this.f2211b.notify(this.f2216g, this.f2210a.build());
            this.f2218i = true;
        }
    }

    public void a(o oVar) {
        com.aggmoread.sdk.z.a.d.c("DownloadNotification", "show#2 enter,downloadState = " + oVar + " , id = " + this.f2216g);
        e();
        if (oVar == o.f2255d) {
            this.f2213d = "已经下载,点击安装!";
            d();
        } else if (oVar == o.f2256e) {
            this.f2210a.setAutoCancel(true);
            this.f2210a.setOngoing(false);
            this.f2213d = "下载失败";
        } else {
            this.f2210a.setProgress(100, 0, true);
        }
        b();
        this.f2211b.notify(this.f2216g, this.f2210a.build());
    }

    public void a(String str) {
        com.aggmoread.sdk.z.a.d.c("DownloadNotification", "show#3 enter");
        this.f2213d = str;
        e();
        b();
        this.f2211b.notify(this.f2216g, this.f2210a.build());
    }

    public boolean a() {
        return this.f2218i;
    }

    public void c() {
        int i4 = this.f2217h;
        if (i4 != 0) {
            this.f2210a.setSmallIcon(i4);
        }
    }

    public void f() {
        this.f2213d = "已经安装,点击启动!";
        this.f2210a.setAutoCancel(true);
        this.f2210a.setOngoing(false);
        d();
        b();
        this.f2211b.notify(this.f2216g, this.f2210a.build());
    }

    public String toString() {
        return "DownloadNotification{builder=" + this.f2210a + ", notificationManager=" + this.f2211b + ", title='" + this.f2212c + "', desc='" + this.f2213d + "', channelId='" + this.f2214e + "', pendingIntent=" + this.f2215f + ", id=" + this.f2216g + ", icon=" + this.f2217h + '}';
    }
}
