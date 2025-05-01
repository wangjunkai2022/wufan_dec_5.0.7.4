package com.kwad.framework.filedownloader;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.services.c;
import java.io.File;
import java.util.List;
/* loaded from: classes5.dex */
public class r {
    private static final Object afR = new Object();
    private static final Object afT = new Object();
    private w afS;
    private volatile v afU;

    /* loaded from: classes5.dex */
    static final class a {
        private static final r afV = new r();
    }

    public static void a(Context context, c.b bVar) {
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(r.class, "init Downloader with params: %s %s", context, bVar);
        }
        if (context != null) {
            com.kwad.framework.filedownloader.f.c.ax(context.getApplicationContext());
            com.kwad.framework.filedownloader.download.b.vS().a(bVar);
            return;
        }
        throw new IllegalArgumentException("the provided context must not be null!");
    }

    public static void aw(Context context) {
        com.kwad.framework.filedownloader.f.c.ax(context.getApplicationContext());
    }

    public static com.kwad.framework.filedownloader.a bf(String str) {
        return new c(str);
    }

    private int bg(int i4) {
        List<a.InterfaceC0492a> bb = h.vf().bb(i4);
        if (bb.isEmpty()) {
            com.kwad.framework.filedownloader.f.d.d(this, "request pause but not exist %d", Integer.valueOf(i4));
            return 0;
        }
        for (a.InterfaceC0492a interfaceC0492a : bb) {
            interfaceC0492a.uH().pause();
        }
        return bb.size();
    }

    public static boolean vA() {
        return n.vq().isConnected();
    }

    public static r vy() {
        return a.afV;
    }

    public final boolean p(int i4, String str) {
        bg(i4);
        if (n.vq().bf(i4)) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            File file = new File(com.kwad.framework.filedownloader.f.f.bw(str));
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w vB() {
        if (this.afS == null) {
            synchronized (afR) {
                if (this.afS == null) {
                    this.afS = new ab();
                }
            }
        }
        return this.afS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v vC() {
        if (this.afU == null) {
            synchronized (afT) {
                if (this.afU == null) {
                    this.afU = new z();
                    a((e) this.afU);
                }
            }
        }
        return this.afU;
    }

    public final void vz() {
        if (vA()) {
            return;
        }
        n.vq().av(com.kwad.framework.filedownloader.f.c.xp());
    }

    private static void a(e eVar) {
        f.vd().a("event.service.connect.changed", eVar);
    }
}
