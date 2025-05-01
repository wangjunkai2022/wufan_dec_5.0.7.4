package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.e;
import java.util.List;
/* loaded from: classes5.dex */
public final class aa implements e.b {
    private static boolean a(List<a.InterfaceC0492a> list, MessageSnapshot messageSnapshot) {
        if (list.size() > 1 && messageSnapshot.uz() == -3) {
            for (a.InterfaceC0492a interfaceC0492a : list) {
                if (interfaceC0492a.uI().c(messageSnapshot)) {
                    return true;
                }
            }
        }
        for (a.InterfaceC0492a interfaceC0492a2 : list) {
            if (interfaceC0492a2.uI().b(messageSnapshot)) {
                return true;
            }
        }
        if (-4 == messageSnapshot.uz()) {
            for (a.InterfaceC0492a interfaceC0492a3 : list) {
                if (interfaceC0492a3.uI().d(messageSnapshot)) {
                    return true;
                }
            }
        }
        if (list.size() == 1) {
            return list.get(0).uI().a(messageSnapshot);
        }
        return false;
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.getId()).intern()) {
            List<a.InterfaceC0492a> ba = h.vf().ba(messageSnapshot.getId());
            if (ba.size() > 0) {
                a uH = ba.get(0).uH();
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(uH.uz()), Byte.valueOf(messageSnapshot.uz()), Integer.valueOf(ba.size()));
                }
                if (!a(ba, messageSnapshot)) {
                    StringBuilder sb = new StringBuilder("The event isn't consumed, id:" + messageSnapshot.getId() + " status:" + ((int) messageSnapshot.uz()) + " task-count:" + ba.size());
                    for (a.InterfaceC0492a interfaceC0492a : ba) {
                        sb.append(" | ");
                        sb.append((int) interfaceC0492a.uH().uz());
                    }
                    com.kwad.framework.filedownloader.f.d.b(this, sb.toString(), new Object[0]);
                }
            } else {
                com.kwad.framework.filedownloader.f.d.b(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.uz()));
            }
        }
    }
}
