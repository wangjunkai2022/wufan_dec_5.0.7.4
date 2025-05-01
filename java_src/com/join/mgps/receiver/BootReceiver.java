package com.join.mgps.receiver;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.join.android.app.common.utils.e;
import com.join.mgps.Util.g2;
import o1.a;
import org.androidannotations.annotations.EReceiver;
import org.androidannotations.annotations.ReceiverAction;
@EReceiver
/* loaded from: classes4.dex */
public class BootReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53984a})
    public void a(Context context, Intent intent) {
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (g2.i(schemeSpecificPart)) {
            Intent intent2 = new Intent();
            intent2.setAction(a.f72016o);
            intent2.putExtra("packageName", schemeSpecificPart);
            intent2.putExtra("actionFrom", BootReceiver_.f53984a);
            context.sendBroadcast(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53988e})
    public void b(Context context, Intent intent) {
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (g2.i(schemeSpecificPart)) {
            Intent intent2 = new Intent();
            intent2.setAction(a.f72016o);
            intent2.putExtra("packageName", schemeSpecificPart);
            intent2.putExtra("actionFrom", BootReceiver_.f53987d);
            context.sendBroadcast(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53989f})
    public void c(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (context.getSharedPreferences("downloadplato", 0).getLong("plato", 0L) == longExtra) {
            e.l0(context).v(context, ((DownloadManager) context.getSystemService("download")).getUriForDownloadedFile(longExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53987d})
    public void d(Context context, Intent intent) {
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (g2.i(schemeSpecificPart)) {
            Intent intent2 = new Intent();
            intent2.setAction(a.f72016o);
            intent2.putExtra("packageName", schemeSpecificPart);
            intent2.putExtra("actionFrom", BootReceiver_.f53987d);
            context.sendBroadcast(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53985b})
    public void e(Context context, Intent intent) {
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (g2.i(schemeSpecificPart)) {
            Intent intent2 = new Intent();
            intent2.setAction(a.f72016o);
            intent2.putExtra("packageName", schemeSpecificPart);
            intent2.putExtra("actionFrom", BootReceiver_.f53985b);
            context.sendBroadcast(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ReceiverAction(actions = {BootReceiver_.f53986c})
    public void f(Context context, Intent intent) {
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        if (g2.i(schemeSpecificPart)) {
            Intent intent2 = new Intent();
            intent2.setAction(a.f72016o);
            intent2.putExtra("packageName", schemeSpecificPart);
            intent2.putExtra("actionFrom", BootReceiver_.f53986c);
            context.sendBroadcast(intent2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
