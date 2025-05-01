package com.papa.gsyvideoplayer.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
/* compiled from: NetInfoModule.java */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: g  reason: collision with root package name */
    private static final String f58532g = "NONE";

    /* renamed from: h  reason: collision with root package name */
    private static final String f58533h = "UNKNOWN";

    /* renamed from: i  reason: collision with root package name */
    private static final String f58534i = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";

    /* renamed from: j  reason: collision with root package name */
    private static final String f58535j = "E_MISSING_PERMISSION";

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f58536a;

    /* renamed from: c  reason: collision with root package name */
    private c f58538c;

    /* renamed from: e  reason: collision with root package name */
    private Context f58540e;

    /* renamed from: d  reason: collision with root package name */
    private String f58539d = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f58541f = false;

    /* renamed from: b  reason: collision with root package name */
    private final b f58537b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetInfoModule.java */
    /* loaded from: classes5.dex */
    public class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f58542a;

        private b() {
            this.f58542a = false;
        }

        public boolean a() {
            return this.f58542a;
        }

        public void b(boolean z4) {
            this.f58542a = z4;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                k.this.i();
            }
        }
    }

    /* compiled from: NetInfoModule.java */
    /* loaded from: classes5.dex */
    public interface c {
        void a(String str);
    }

    public k(Context context, c cVar) {
        this.f58540e = context;
        this.f58536a = (ConnectivityManager) context.getSystemService("connectivity");
        this.f58538c = cVar;
    }

    private void h() {
        c cVar = this.f58538c;
        if (cVar != null) {
            cVar.a(this.f58539d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String b5 = b();
        if (b5.equalsIgnoreCase(this.f58539d)) {
            return;
        }
        this.f58539d = b5;
        h();
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f58540e.registerReceiver(this.f58537b, intentFilter);
        this.f58537b.b(true);
    }

    private void unregisterReceiver() {
        if (this.f58537b.a()) {
            this.f58540e.unregisterReceiver(this.f58537b);
            this.f58537b.b(false);
        }
    }

    public String b() {
        String str = f58533h;
        try {
            NetworkInfo activeNetworkInfo = this.f58536a.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                    str = activeNetworkInfo.getTypeName().toUpperCase();
                    return str;
                }
                return f58533h;
            }
            return f58532g;
        } catch (SecurityException unused) {
            this.f58541f = true;
            return str;
        }
    }

    public String c() {
        return this.f58541f ? f58535j : this.f58539d;
    }

    public boolean d() {
        if (this.f58541f) {
            return false;
        }
        return ConnectivityManagerCompat.isActiveNetworkMetered(this.f58536a);
    }

    public void e() {
    }

    public void f() {
        unregisterReceiver();
    }

    public void g() {
        registerReceiver();
    }
}
