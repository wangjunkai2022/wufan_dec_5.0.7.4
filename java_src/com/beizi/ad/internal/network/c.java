package com.beizi.ad.internal.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
import com.beizi.ad.internal.utilities.HttpErrorCode;
import com.kuaishou.weapon.p0.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: SharedNetworkManager.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f6092a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f6093b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private Timer f6094c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6095d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedNetworkManager.java */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f6100a;

        /* renamed from: b  reason: collision with root package name */
        int f6101b = 0;

        a(String str) {
            this.f6100a = str;
        }
    }

    private c(Context context) {
        if (context != null) {
            this.f6095d = context.getPackageManager().checkPermission(g.f55582b, context.getPackageName()) == 0;
        }
    }

    private void c(Context context) {
        if (this.f6094c == null) {
            final WeakReference weakReference = new WeakReference(context);
            Timer timer = new Timer();
            this.f6094c = timer;
            timer.scheduleAtFixedRate(new TimerTask() { // from class: com.beizi.ad.internal.network.c.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 != null) {
                        while (!c.this.f6093b.isEmpty() && c.this.b(context2)) {
                            final a aVar = (a) c.this.f6093b.remove(0);
                            if (aVar.f6101b < 3) {
                                new HTTPGet(false, true) { // from class: com.beizi.ad.internal.network.c.1.1
                                    @Override // com.beizi.ad.internal.utilities.HTTPGet
                                    protected String getUrl() {
                                        return aVar.f6100a;
                                    }

                                    /* JADX INFO: Access modifiers changed from: protected */
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.beizi.ad.internal.utilities.HTTPGet, android.os.AsyncTask
                                    public void onPostExecute(HTTPResponse hTTPResponse) {
                                        if (hTTPResponse == null || (!hTTPResponse.getSucceeded() && hTTPResponse.getErrorCode() == HttpErrorCode.CONNECTION_FAILURE)) {
                                            aVar.f6101b++;
                                            c.this.f6093b.add(aVar);
                                        }
                                    }
                                }.execute(new Void[0]);
                            }
                        }
                        if (c.this.f6093b.isEmpty()) {
                            c.this.a();
                            return;
                        }
                        return;
                    }
                    c.this.a();
                }
            }, com.join.mgps.data.c.f49010a, com.join.mgps.data.c.f49010a);
        }
    }

    public static c a(Context context) {
        if (f6092a == null) {
            f6092a = new c(context);
        }
        return f6092a;
    }

    public boolean b(Context context) {
        try {
            if (this.f6095d) {
                if (context != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.isConnected()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public synchronized void a(String str, Context context) {
        this.f6093b.add(new a(str));
        c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Timer timer = this.f6094c;
        if (timer != null) {
            timer.cancel();
            this.f6094c = null;
        }
    }
}
