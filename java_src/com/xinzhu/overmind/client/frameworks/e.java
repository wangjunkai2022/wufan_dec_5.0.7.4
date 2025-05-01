package com.xinzhu.overmind.client.frameworks;

import android.app.job.JobInfo;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.JobRecord;
import com.xinzhu.overmind.server.am.e;
/* compiled from: MindJobManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static e f67555b = new e();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.am.e f67556a;

    public static e c() {
        return f67555b;
    }

    private com.xinzhu.overmind.server.am.e d() {
        com.xinzhu.overmind.server.am.e eVar = this.f67556a;
        if (eVar != null && eVar.asBinder().isBinderAlive()) {
            return this.f67556a;
        }
        this.f67556a = e.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67992d));
        return d();
    }

    public int a(String str, int i4) {
        try {
            return d().cancel(str, i4, com.xinzhu.overmind.client.e.getUserId());
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public void b(String str) {
        try {
            d().cancelAll(str, com.xinzhu.overmind.client.e.getUserId());
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public JobRecord e(String str, int i4) {
        try {
            return d().queryJobRecord(str, i4, com.xinzhu.overmind.client.e.getUserId());
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public JobInfo f(JobInfo jobInfo) {
        try {
            return d().schedule(jobInfo, com.xinzhu.overmind.client.e.getUserId());
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
