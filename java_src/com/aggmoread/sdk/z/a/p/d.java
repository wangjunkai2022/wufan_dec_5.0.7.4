package com.aggmoread.sdk.z.a.p;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2389a;

    /* renamed from: b  reason: collision with root package name */
    private c f2390b;

    /* renamed from: c  reason: collision with root package name */
    boolean f2391c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2392d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f2393e = new a();

    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            d dVar = d.this;
            boolean z4 = dVar.f2391c;
            dVar.f2391c = dVar.a(context);
            if (z4 != d.this.f2391c) {
                com.aggmoread.sdk.z.a.d.a("ConnectivityListener", "connectivity changed, isConnected: " + d.this.f2391c);
                d.this.f2390b.a(d.this.f2391c);
            }
        }
    }

    public d(@NonNull Context context, @NonNull c cVar) {
        this.f2389a = context.getApplicationContext();
        this.f2390b = cVar == null ? c.f2388a : cVar;
    }

    public static d a(Context context, c cVar) {
        d dVar = new d(context, cVar);
        dVar.b();
        return dVar;
    }

    private void a() {
        if (this.f2392d) {
            return;
        }
        this.f2391c = a(this.f2389a);
        try {
            this.f2389a.registerReceiver(this.f2393e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f2392d = true;
        } catch (SecurityException e5) {
            com.aggmoread.sdk.z.a.d.a("ConnectivityListener", "Failed to register", e5);
        }
    }

    private void d() {
        if (this.f2392d) {
            this.f2389a.unregisterReceiver(this.f2393e);
            this.f2392d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    boolean a(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e5) {
            com.aggmoread.sdk.z.a.d.a("ConnectivityListener", "Failed to determine connectivity status when connectivity changed ", e5);
            return true;
        }
    }

    public void b() {
        a();
    }

    public void c() {
        d();
    }
}
