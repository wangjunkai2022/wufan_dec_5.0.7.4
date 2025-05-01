package com.cmic.sso.sdk.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
/* compiled from: WifiNetworkUtils.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static r f9346a;

    /* renamed from: b  reason: collision with root package name */
    private ConnectivityManager f9347b;

    /* renamed from: c  reason: collision with root package name */
    private Network f9348c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f9349d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9350e;

    /* compiled from: WifiNetworkUtils.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Network network);
    }

    private r(Context context) {
        try {
            this.f9347b = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b() {
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager connectivityManager = this.f9347b;
        if (connectivityManager == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 21 || (networkCallback = this.f9349d) == null) {
                return;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.f9349d = null;
            this.f9348c = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 21 && this.f9348c != null;
    }

    public static r a(Context context) {
        if (f9346a == null) {
            synchronized (r.class) {
                if (f9346a == null) {
                    f9346a = new r(context);
                }
            }
        }
        return f9346a;
    }

    @TargetApi(21)
    public synchronized void a(final a aVar) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.f9347b;
        if (connectivityManager == null) {
            c.a("WifiNetworkUtils", "mConnectivityManager 为空");
            aVar.a(null);
            return;
        }
        Network network = this.f9348c;
        if (network != null && !this.f9350e && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.isAvailable()) {
            aVar.a(this.f9348c);
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f9349d;
        if (networkCallback != null) {
            try {
                this.f9347b.unregisterNetworkCallback(networkCallback);
            } catch (Exception e5) {
                e5.printStackTrace();
                this.f9349d = null;
            }
        }
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.cmic.sso.sdk.e.r.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network2) {
                try {
                    if (r.this.f9347b.getNetworkCapabilities(network2).hasTransport(0)) {
                        r.this.f9348c = network2;
                        aVar.a(network2);
                        r.this.f9350e = false;
                    } else {
                        c.a("WifiNetworkUtils", "切换失败，未开启数据网络");
                        r.this.f9348c = null;
                        aVar.a(null);
                        r.this.f9347b.unregisterNetworkCallback(r.this.f9349d);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    r.this.f9348c = null;
                    aVar.a(null);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network2) {
                r.this.f9350e = true;
            }
        };
        this.f9349d = networkCallback2;
        try {
            this.f9347b.requestNetwork(build, networkCallback2);
        } catch (Exception e6) {
            e6.printStackTrace();
            aVar.a(null);
        }
    }
}
