package com.join.mgps.ad;

import android.content.Context;
import android.content.Intent;
/* compiled from: BaseAdVideo.java */
/* loaded from: classes4.dex */
public class b {
    public static void a(Context context, int i4) {
        Intent intent = new Intent();
        intent.setAction("com.emu.ad.result");
        intent.putExtra("adAction", i4);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, int i4, String str) {
        Intent intent = new Intent();
        intent.setAction("com.join.android.app.mgsim.wufun.ad.result");
        intent.putExtra("adAction", i4);
        intent.putExtra("gameId", str);
        context.sendBroadcast(intent);
    }
}
