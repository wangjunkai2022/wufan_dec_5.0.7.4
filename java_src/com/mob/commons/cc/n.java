package com.mob.commons.cc;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class n implements t<n> {

    /* renamed from: a  reason: collision with root package name */
    private m f56273a;

    private ConnectivityManager.NetworkCallback a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new ConnectivityManager.NetworkCallback() { // from class: com.mob.commons.cc.n.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    ArrayList<Object> arrayList = new ArrayList<>();
                    arrayList.add(network);
                    n.this.f56273a.a(com.mob.commons.a.l.a("011UelPf?geeeOe;ejJheTggBhg"), arrayList);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    ArrayList<Object> arrayList = new ArrayList<>();
                    arrayList.add(network);
                    n.this.f56273a.a(com.mob.commons.a.l.a("0069el0fYgfelgjTj"), arrayList);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    super.onUnavailable();
                }
            };
        }
        return null;
    }

    public void a(m mVar) {
        this.f56273a = mVar;
    }

    @Override // com.mob.commons.cc.t
    public boolean a(n nVar, Class<n> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1 && objArr[0] != null && (objArr[0] instanceof m)) {
            nVar.a((m) objArr[0]);
        } else if (!com.mob.commons.a.l.a("019!ej4fDejLjZfh%gjMghelekfifeGehh;ggZedLfi").equals(str) || objArr.length != 0) {
            return false;
        } else {
            objArr2[0] = nVar.a();
        }
        return true;
    }
}
