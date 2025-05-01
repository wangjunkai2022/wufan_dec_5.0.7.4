package com.xinzhu.overmind.client.frameworks;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.content.a;
/* compiled from: MindContentManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f67548b = new b();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.content.a f67549a;

    public static b a() {
        return f67548b;
    }

    private com.xinzhu.overmind.server.content.a b() {
        com.xinzhu.overmind.server.content.a aVar = this.f67549a;
        if (aVar != null && aVar.asBinder().isBinderAlive()) {
            return this.f67549a;
        }
        this.f67549a = a.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f68002n));
        return b();
    }

    public void c(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i4, int i5) throws RemoteException {
        b().notifyChange(uri, iContentObserver, z4, z5, i4, i5);
    }

    public void d(Uri uri, boolean z4, IContentObserver iContentObserver, int i4, int i5) throws RemoteException {
        b().registerContentObserver(uri, z4, iContentObserver, i4, i5);
    }

    public void e(IContentObserver iContentObserver) throws RemoteException {
        b().unregisterContentObserver(iContentObserver);
    }
}
