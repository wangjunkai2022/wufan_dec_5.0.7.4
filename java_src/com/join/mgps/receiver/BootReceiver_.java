package com.join.mgps.receiver;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes4.dex */
public final class BootReceiver_ extends BootReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f53984a = "android.intent.action.PACKAGE_ADDED";

    /* renamed from: b  reason: collision with root package name */
    public static final String f53985b = "android.intent.action.PACKAGE_REMOVED";

    /* renamed from: c  reason: collision with root package name */
    public static final String f53986c = "android.intent.action.PACKAGE_FULLY_REMOVED";

    /* renamed from: d  reason: collision with root package name */
    public static final String f53987d = "android.intent.action.PACKAGE_REPLACED";

    /* renamed from: e  reason: collision with root package name */
    public static final String f53988e = "android.intent.action.INSTALL_FAILURE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f53989f = "android.intent.action.DOWNLOAD_COMPLETE";

    private void g(Context context) {
    }

    @Override // com.join.mgps.receiver.BootReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        g(context);
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (f53984a.equals(action)) {
            a(context, intent);
        } else if (f53985b.equals(action)) {
            e(context, intent);
        } else if (f53986c.equals(action)) {
            f(context, intent);
        } else if (f53987d.equals(action)) {
            d(context, intent);
        } else if (f53988e.equals(action)) {
            b(context, intent);
        } else if (f53989f.equals(action)) {
            c(context, intent);
        }
    }
}
