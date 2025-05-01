package com.xinzhu.overmind.server;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
/* loaded from: classes.dex */
public class DaemonService extends Service {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67832b = "DaemonService";

    /* renamed from: c  reason: collision with root package name */
    private static final int f67833c = (int) (System.currentTimeMillis() / 1000);

    /* renamed from: d  reason: collision with root package name */
    public static final String f67834d = "daemon_overmind";

    /* loaded from: classes.dex */
    public static class DaemonInnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
        }

        @Override // android.app.Service
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i4, int i5) {
            ((NotificationManager) getSystemService("notification")).cancel(DaemonService.f67833c);
            stopSelf();
            return super.onStartCommand(intent, i4, i5);
        }
    }

    @SuppressLint({"NewApi"})
    private void b() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (com.xinzhu.overmind.utils.e.w()) {
            NotificationChannel notificationChannel = new NotificationChannel(f67834d, "overmind", 4);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void c() {
        startForeground(f67833c, new NotificationCompat.Builder(getApplicationContext(), f67834d).setPriority(2).build());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        startService(new Intent(this, DaemonInnerService.class));
        if (com.xinzhu.overmind.utils.e.w()) {
            c();
            return 1;
        }
        return 1;
    }
}
