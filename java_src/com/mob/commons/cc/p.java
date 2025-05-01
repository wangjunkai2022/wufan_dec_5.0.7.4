package com.mob.commons.cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class p implements ServiceConnection, t<p> {

    /* renamed from: a  reason: collision with root package name */
    private m f56275a;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f56275a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(componentName);
                arrayList.add(iBinder);
                this.f56275a.a("onServiceConnected", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f56275a != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(componentName);
            this.f56275a.a("onServiceDisconnected", arrayList);
        }
    }

    public void a(m mVar) {
        this.f56275a = mVar;
    }

    @Override // com.mob.commons.cc.t
    public boolean a(p pVar, Class<p> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1) {
            pVar.a((m) objArr[0]);
            return true;
        }
        return false;
    }
}
