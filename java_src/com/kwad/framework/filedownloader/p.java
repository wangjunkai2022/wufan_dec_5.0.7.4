package com.kwad.framework.filedownloader;

import android.os.IBinder;
import android.os.RemoteException;
import com.kwad.framework.filedownloader.c.a;
import com.kwad.framework.filedownloader.c.b;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes5.dex */
final class p extends com.kwad.framework.filedownloader.services.a<a, com.kwad.framework.filedownloader.c.b> {

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class a extends a.AbstractBinderC0495a {
        protected a() {
        }

        @Override // com.kwad.framework.filedownloader.c.a
        public final void q(MessageSnapshot messageSnapshot) {
            com.kwad.framework.filedownloader.message.e.wJ().s(messageSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Class<?> cls) {
        super(cls);
    }

    private static a vu() {
        return new a();
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* bridge */ /* synthetic */ void a(com.kwad.framework.filedownloader.c.b bVar, a aVar) {
        a2(bVar, aVar);
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ com.kwad.framework.filedownloader.c.b b(IBinder iBinder) {
        return a(iBinder);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bd(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.bd(i4);
        }
        try {
            return wU().bd(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte be(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.be(i4);
        }
        try {
            return wU().be(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bf(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.bf(i4);
        }
        try {
            return wU().bf(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ a vv() {
        return vu();
    }

    private static com.kwad.framework.filedownloader.c.b a(IBinder iBinder) {
        return b.a.a(iBinder);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.framework.filedownloader.c.b bVar, a aVar) {
        bVar.a(aVar);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z4, int i4, int i5, int i6, boolean z5, com.kwad.framework.filedownloader.d.b bVar, boolean z6) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.h(str, str2, z4);
        }
        try {
            wU().b(str, str2, z4, i4, i5, i6, z5, bVar, z6);
            return true;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
