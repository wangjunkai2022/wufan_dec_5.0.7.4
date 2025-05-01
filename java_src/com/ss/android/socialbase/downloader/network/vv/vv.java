package com.ss.android.socialbase.downloader.network.vv;

import com.ss.android.socialbase.downloader.wv.u;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, p> f61284m;

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, i> f61285p;
    protected int vv;

    /* renamed from: com.ss.android.socialbase.downloader.network.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0650vv {
        private static final vv vv = new vv();
    }

    public i m(String str, List<com.ss.android.socialbase.downloader.model.p> list) {
        i remove;
        synchronized (this.f61285p) {
            remove = this.f61285p.remove(str);
        }
        if (remove != null) {
            if (u.vv(remove.u(), list)) {
                try {
                    remove.o();
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                if (remove.qv() && remove.n()) {
                    return remove;
                }
            }
            try {
                remove.i();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(String str, p pVar) {
        synchronized (this.f61284m) {
            this.f61284m.put(str, pVar);
        }
    }

    private vv() {
        this.f61284m = new HashMap();
        this.f61285p = new LinkedHashMap(3);
        this.vv = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(int i4) {
        this.vv = i4;
    }

    public p vv(String str, List<com.ss.android.socialbase.downloader.model.p> list) {
        p remove;
        synchronized (this.f61284m) {
            remove = this.f61284m.remove(str);
        }
        if (remove != null) {
            if (u.vv(remove.qv(), list)) {
                try {
                    remove.i();
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                if (remove.u() && remove.o()) {
                    return remove;
                }
            }
            try {
                remove.p();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public boolean vv(String str) {
        p pVar = this.f61284m.get(str);
        if (pVar != null) {
            if (pVar.n()) {
                return true;
            }
            if (pVar.u() && pVar.o()) {
                return true;
            }
        }
        return false;
    }

    public static vv vv() {
        return C0650vv.vv;
    }
}
