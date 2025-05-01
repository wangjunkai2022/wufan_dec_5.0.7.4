package com.join.mgps.broadcast;

import android.content.Context;
import android.content.Intent;
/* compiled from: BroadcastUtile.java */
/* loaded from: classes4.dex */
public class a {
    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setAction(o1.a.A);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(o1.a.C);
        intent.putExtra("_account", str);
        context.sendBroadcast(intent);
    }

    public static void c(Context context) {
        Intent intent = new Intent();
        intent.setAction(o1.a.B);
        context.sendBroadcast(intent);
    }
}
