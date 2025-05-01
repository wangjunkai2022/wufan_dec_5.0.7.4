package com.kwad.framework.filedownloader.message;

import com.kwad.framework.filedownloader.message.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public final class g {
    private final e.b aij;
    private final List<a> ail = new ArrayList();

    /* loaded from: classes5.dex */
    public class a {
        private final List<Integer> aim = new ArrayList();
        private final Executor ain;

        public a(int i4) {
            this.ain = com.kwad.framework.filedownloader.f.b.q(1, "Flow-" + i4);
        }

        public final void bB(int i4) {
            this.aim.add(Integer.valueOf(i4));
        }

        public final void u(final MessageSnapshot messageSnapshot) {
            this.ain.execute(new Runnable() { // from class: com.kwad.framework.filedownloader.message.g.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.aij.r(messageSnapshot);
                    try {
                        a.this.aim.remove(Integer.valueOf(messageSnapshot.getId()));
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i4, e.b bVar) {
        this.aij = bVar;
        for (int i5 = 0; i5 < 5; i5++) {
            this.ail.add(new a(i5));
        }
    }

    public final void u(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.ail) {
                int id = messageSnapshot.getId();
                Iterator<a> it2 = this.ail.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    a next = it2.next();
                    if (next.aim.contains(Integer.valueOf(id))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int i4 = 0;
                    Iterator<a> it3 = this.ail.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        a next2 = it3.next();
                        if (next2.aim.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (i4 == 0 || next2.aim.size() < i4) {
                            i4 = next2.aim.size();
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    aVar.bB(id);
                }
            }
        } finally {
            if (aVar != null) {
                aVar.u(messageSnapshot);
            }
        }
    }
}
