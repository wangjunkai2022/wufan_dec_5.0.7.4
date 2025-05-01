package com.join.mgps.installer;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: APKInstall.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f53431a = "APKInstall";

    /* compiled from: APKInstall.java */
    /* loaded from: classes3.dex */
    private static class b extends BroadcastReceiver {
        private b() {
        }

        private void a(Context context, Intent intent) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }

        @Override // android.content.BroadcastReceiver
        @RequiresApi(api = 21)
        public void onReceive(Context context, Intent intent) {
            PackageInstaller packageInstaller;
            PackageInstaller.SessionInfo sessionInfo;
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 4);
            if (intExtra == -1) {
                a(context, (Intent) intent.getParcelableExtra("android.intent.extra.INTENT"));
            } else if (intExtra != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onReceive: status=");
                sb.append(intExtra);
                sb.append(" message=");
                sb.append(intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE"));
                int intExtra2 = intent.getIntExtra("android.content.pm.extra.SESSION_ID", 0);
                if (intExtra2 <= 0 || (sessionInfo = (packageInstaller = context.getPackageManager().getPackageInstaller()).getSessionInfo(intExtra2)) == null) {
                    return;
                }
                packageInstaller.abandonSession(sessionInfo.getSessionId());
            }
        }
    }

    @RequiresApi(api = 21)
    public static void a(Context context, File file) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(f53431a).setPackage(context.getPackageName()), 167772160);
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        if (Build.VERSION.SDK_INT >= 31) {
            sessionParams.setRequireUserAction(2);
        }
        try {
            PackageInstaller.Session openSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
            c(new FileInputStream(file), openSession.openWrite(file.getName(), 0L, file.length()));
            openSession.commit(broadcast.getIntentSender());
            openSession.close();
        } catch (IOException unused) {
        }
    }

    public static void b(Context context) {
        context.registerReceiver(new b(), new IntentFilter(f53431a));
    }

    private static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }
}
