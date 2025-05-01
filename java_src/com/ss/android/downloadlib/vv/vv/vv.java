package com.ss.android.downloadlib.vv.vv;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.vv.vv.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: i  reason: collision with root package name */
    private static String f60762i = "";

    /* renamed from: n  reason: collision with root package name */
    private static volatile vv f60763n = null;

    /* renamed from: o  reason: collision with root package name */
    private static String f60764o = "";

    /* renamed from: u  reason: collision with root package name */
    private static String f60765u = "";

    /* renamed from: b  reason: collision with root package name */
    private Context f60766b;
    public p vv;
    private boolean qv = true;
    private boolean wv = false;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f60767k = false;
    private final List<Pair<m, i>> jh = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final List<Object> f60768m = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private final ServiceConnection f60770r = new ServiceConnection() { // from class: com.ss.android.downloadlib.vv.vv.vv.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (vv.this.f60769p) {
                vv.this.vv(false);
                vv.this.vv = p.vv.vv(iBinder);
                vv.this.p();
                Iterator<Object> it2 = vv.this.f60768m.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (vv.this.f60769p) {
                vv.this.vv(false);
                vv vvVar = vv.this;
                vvVar.vv = null;
                Iterator<Object> it2 = vvVar.f60768m.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    };

    /* renamed from: t  reason: collision with root package name */
    private String f60771t = "";

    /* renamed from: p  reason: collision with root package name */
    public final Object f60769p = new Object();

    private vv() {
    }

    public static vv vv() {
        if (f60763n == null) {
            synchronized (vv.class) {
                if (f60763n == null) {
                    f60763n = new vv();
                }
            }
        }
        return f60763n;
    }

    public boolean i() {
        return this.f60767k;
    }

    public void m() {
        if (this.vv != null) {
            this.f60766b.unbindService(this.f60770r);
            this.vv = null;
        }
        this.f60768m.clear();
        this.jh.clear();
    }

    public void p() {
        for (Pair<m, i> pair : this.jh) {
            try {
                this.vv.vv((m) pair.first, (i) pair.second);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
        this.jh.clear();
    }

    public boolean vv(Context context, boolean z4) {
        if (TextUtils.isEmpty(f60762i)) {
            JSONObject wv = b.wv();
            String optString = wv.optString("s");
            f60762i = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("q"), optString);
            f60764o = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("u"), optString);
            f60765u = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("w"), optString);
        }
        this.wv = z4;
        if (context != null) {
            this.f60766b = context.getApplicationContext();
            if (TextUtils.isEmpty(f60765u)) {
                f60765u = this.f60766b.getPackageName();
            }
            if (this.vv != null || i()) {
                return true;
            }
            return this.f60766b.bindService(vv(context), this.f60770r, 33);
        }
        return true;
    }

    public Intent vv(Context context) {
        Intent intent = new Intent();
        intent.setAction(f60762i);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() != 1) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (f60764o.equals(str)) {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    public void vv(m mVar, i iVar) {
        synchronized (this.f60769p) {
            mVar.f60759o = f60765u;
            if (TextUtils.isEmpty(mVar.f60761u)) {
                mVar.f60761u = this.f60771t;
            }
            p pVar = this.vv;
            if (pVar != null) {
                try {
                    pVar.vv(mVar, iVar);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            } else if (i() || vv(this.f60766b, this.wv)) {
                this.jh.add(Pair.create(mVar, iVar));
            }
        }
    }

    public void vv(boolean z4) {
        this.f60767k = z4;
    }
}
