package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class h {
    private final ArrayList<a.InterfaceC0492a> afq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final h afr = new h((byte) 0);
    }

    /* synthetic */ h(byte b5) {
        this();
    }

    public static h vf() {
        return a.afr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(a.InterfaceC0492a interfaceC0492a) {
        return this.afq.isEmpty() || !this.afq.contains(interfaceC0492a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int aZ(int i4) {
        int i5;
        synchronized (this.afq) {
            Iterator<a.InterfaceC0492a> it2 = this.afq.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                if (it2.next().aY(i4)) {
                    i5++;
                }
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(a.InterfaceC0492a interfaceC0492a) {
        if (!interfaceC0492a.uH().us()) {
            interfaceC0492a.uK();
        }
        if (interfaceC0492a.uI().uX().vk()) {
            c(interfaceC0492a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a.InterfaceC0492a> ba(int i4) {
        byte uz;
        ArrayList arrayList = new ArrayList();
        synchronized (this.afq) {
            Iterator<a.InterfaceC0492a> it2 = this.afq.iterator();
            while (it2.hasNext()) {
                a.InterfaceC0492a next = it2.next();
                if (next.aY(i4) && !next.isOver() && (uz = next.uH().uz()) != 0 && uz != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a.InterfaceC0492a> bb(int i4) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.afq) {
            Iterator<a.InterfaceC0492a> it2 = this.afq.iterator();
            while (it2.hasNext()) {
                a.InterfaceC0492a next = it2.next();
                if (next.aY(i4) && !next.isOver()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(a.InterfaceC0492a interfaceC0492a) {
        if (interfaceC0492a.uL()) {
            return;
        }
        synchronized (this.afq) {
            if (this.afq.contains(interfaceC0492a)) {
                com.kwad.framework.filedownloader.f.d.d(this, "already has %s", interfaceC0492a);
            } else {
                interfaceC0492a.uM();
                this.afq.add(interfaceC0492a);
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.e(this, "add list in all %s %d %d", interfaceC0492a, Byte.valueOf(interfaceC0492a.uH().uz()), Integer.valueOf(this.afq.size()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(List<a.InterfaceC0492a> list) {
        synchronized (this.afq) {
            Iterator<a.InterfaceC0492a> it2 = this.afq.iterator();
            while (it2.hasNext()) {
                a.InterfaceC0492a next = it2.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.afq.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.afq.size();
    }

    private h() {
        this.afq = new ArrayList<>();
    }

    public final boolean a(a.InterfaceC0492a interfaceC0492a, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte uz = messageSnapshot.uz();
        synchronized (this.afq) {
            remove = this.afq.remove(interfaceC0492a);
        }
        if (com.kwad.framework.filedownloader.f.d.ajb && this.afq.size() == 0) {
            com.kwad.framework.filedownloader.f.d.e(this, "remove %s left %d %d", interfaceC0492a, Byte.valueOf(uz), Integer.valueOf(this.afq.size()));
        }
        if (remove) {
            t uX = interfaceC0492a.uI().uX();
            if (uz == -4) {
                uX.l(messageSnapshot);
            } else if (uz == -3) {
                uX.j(com.kwad.framework.filedownloader.message.f.t(messageSnapshot));
            } else if (uz == -2) {
                uX.n(messageSnapshot);
            } else if (uz == -1) {
                uX.m(messageSnapshot);
            }
        } else {
            com.kwad.framework.filedownloader.f.d.a(this, "remove error, not exist: %s %d", interfaceC0492a, Byte.valueOf(uz));
        }
        return remove;
    }
}
