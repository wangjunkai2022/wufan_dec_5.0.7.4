package com.xinzhu.overmind.client.frameworks;

import android.net.Uri;
import android.os.RemoteException;
import android.os.storage.StorageVolume;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.d;
/* compiled from: MindStorageManager.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f67562b = new h();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.os.d f67563a;

    public static h a() {
        return f67562b;
    }

    private com.xinzhu.overmind.server.os.d b() {
        com.xinzhu.overmind.server.os.d dVar = this.f67563a;
        if (dVar != null && dVar.asBinder().isBinderAlive()) {
            return this.f67563a;
        }
        this.f67563a = d.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67995g));
        return b();
    }

    public Uri c(String str) {
        try {
            return b().getUriForFile(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public StorageVolume[] d(int i4, String str, int i5, int i6) {
        try {
            return b().getVolumeList(i4, str, i5, i6);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return new StorageVolume[0];
        }
    }
}
