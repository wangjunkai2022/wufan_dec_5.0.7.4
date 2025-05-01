package com.join.mgps.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.join.mgps.Util.g1;
/* loaded from: classes4.dex */
public class NetBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public a f46270a = null;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i4);
    }

    public void a(a aVar) {
        this.f46270a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                int b5 = g1.b(context);
                a aVar = this.f46270a;
                if (aVar != null) {
                    aVar.a(b5);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
