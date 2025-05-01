package com.join.mgps.installer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.RequiresApi;
import com.join.mgps.activity.MGMainActivity;
/* loaded from: classes3.dex */
public final class ReplacedReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f53429a = "App Updated";

    /* renamed from: b  reason: collision with root package name */
    private static final int f53430b = 42;

    @RequiresApi(api = 26)
    private Notification a(Context context) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, MGMainActivity.class), 201326592);
        return new Notification.Builder(context, f53429a).setContentIntent(activity).setContentTitle("app updated").setContentText("tap to open").setSmallIcon(Icon.createWithResource(context, 17301659)).setAutoCancel(true).build();
    }

    private void b(NotificationManager notificationManager) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            String packageName = context.getPackageName();
            if (packageName.equals(context.getPackageManager().getInstallerPackageName(packageName))) {
                if (Build.VERSION.SDK_INT < 29 || Settings.canDrawOverlays(context)) {
                    Intent intent2 = new Intent(context, MGMainActivity.class);
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                }
            }
        }
    }
}
