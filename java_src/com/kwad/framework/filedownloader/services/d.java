package com.kwad.framework.filedownloader.services;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.kwad.framework.filedownloader.c.b;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.e;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public final class d extends b.a implements e.b, i {
    private final RemoteCallbackList<com.kwad.framework.filedownloader.c.a> aiN = new RemoteCallbackList<>();
    private final g aiO;
    private final WeakReference<FileDownloadServiceProxy> aiP;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WeakReference<FileDownloadServiceProxy> weakReference, g gVar) {
        this.aiP = weakReference;
        this.aiO = gVar;
        com.kwad.framework.filedownloader.message.e.wJ().a(this);
    }

    private synchronized int v(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList<com.kwad.framework.filedownloader.c.a> remoteCallbackList;
        beginBroadcast = this.aiN.beginBroadcast();
        for (int i4 = 0; i4 < beginBroadcast; i4++) {
            try {
                this.aiN.getBroadcastItem(i4).q(messageSnapshot);
            } catch (RemoteException e5) {
                com.kwad.framework.filedownloader.f.d.a(this, e5, "callback error", new Object[0]);
                remoteCallbackList = this.aiN;
            }
        }
        remoteCallbackList = this.aiN;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void a(com.kwad.framework.filedownloader.c.a aVar) {
        this.aiN.register(aVar);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(com.kwad.framework.filedownloader.c.a aVar) {
        this.aiN.unregister(aVar);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bd(int i4) {
        return this.aiO.bd(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final byte be(int i4) {
        return this.aiO.be(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bf(int i4) {
        return this.aiO.bf(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bx(int i4) {
        return this.aiO.bx(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long by(int i4) {
        return this.aiO.bJ(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long bz(int i4) {
        return this.aiO.bz(i4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean isIdle() {
        return this.aiO.isIdle();
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void onDestroy() {
        com.kwad.framework.filedownloader.message.e.wJ().a(null);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void pauseAllTasks() {
        this.aiO.xi();
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(MessageSnapshot messageSnapshot) {
        v(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void startForeground(int i4, Notification notification) {
        WeakReference<FileDownloadServiceProxy> weakReference = this.aiP;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.aiP.get().context.startForeground(i4, notification);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void stopForeground(boolean z4) {
        WeakReference<FileDownloadServiceProxy> weakReference = this.aiP;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.aiP.get().context.stopForeground(z4);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean u(String str, String str2) {
        return this.aiO.y(str, str2);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void wz() {
        this.aiO.wz();
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void xf() {
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final IBinder xg() {
        return this;
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(String str, String str2, boolean z4, int i4, int i5, int i6, boolean z5, com.kwad.framework.filedownloader.d.b bVar, boolean z6) {
        this.aiO.b(str, str2, z4, i4, i5, i6, z5, bVar, z6);
    }
}
