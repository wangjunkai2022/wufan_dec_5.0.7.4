package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class z extends e implements v {
    private final ArrayList<a.InterfaceC0492a> afW = new ArrayList<>();

    @Override // com.kwad.framework.filedownloader.v
    public final boolean d(a.InterfaceC0492a interfaceC0492a) {
        return !this.afW.isEmpty() && this.afW.contains(interfaceC0492a);
    }

    @Override // com.kwad.framework.filedownloader.v
    public final void e(a.InterfaceC0492a interfaceC0492a) {
        if (this.afW.isEmpty()) {
            return;
        }
        synchronized (this.afW) {
            this.afW.remove(interfaceC0492a);
        }
    }

    @Override // com.kwad.framework.filedownloader.v
    public final boolean f(a.InterfaceC0492a interfaceC0492a) {
        r.vy();
        if (!r.vA()) {
            synchronized (this.afW) {
                r.vy();
                if (!r.vA()) {
                    if (com.kwad.framework.filedownloader.f.d.ajb) {
                        com.kwad.framework.filedownloader.f.d.c(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(interfaceC0492a.uH().getId()));
                    }
                    n.vq().av(com.kwad.framework.filedownloader.f.c.xp());
                    if (!this.afW.contains(interfaceC0492a)) {
                        interfaceC0492a.free();
                        this.afW.add(interfaceC0492a);
                    }
                    return true;
                }
            }
        }
        e(interfaceC0492a);
        return false;
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void va() {
        w vB = r.vy().vB();
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.afW) {
            this.afW.clear();
            ArrayList arrayList = new ArrayList(vB.vF());
            for (a.InterfaceC0492a interfaceC0492a : (List) this.afW.clone()) {
                int uJ = interfaceC0492a.uJ();
                if (vB.bh(uJ)) {
                    interfaceC0492a.uH().uq().uP();
                    if (!arrayList.contains(Integer.valueOf(uJ))) {
                        arrayList.add(Integer.valueOf(uJ));
                    }
                } else {
                    interfaceC0492a.uN();
                }
            }
            vB.p(arrayList);
        }
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void vb() {
        if (vc() == DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            w vB = r.vy().vB();
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(h.vf().size()));
            }
            if (h.vf().size() > 0) {
                synchronized (this.afW) {
                    h.vf().o(this.afW);
                    Iterator<a.InterfaceC0492a> it2 = this.afW.iterator();
                    while (it2.hasNext()) {
                        it2.next().free();
                    }
                    vB.vE();
                }
                r.vy().vz();
            }
        } else if (h.vf().size() > 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(h.vf().size()));
        }
    }
}
