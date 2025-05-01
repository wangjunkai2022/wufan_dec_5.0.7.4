package com.ss.android.socialbase.downloader.network.vv;

import com.ss.android.socialbase.downloader.network.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class p implements n {

    /* renamed from: o  reason: collision with root package name */
    private static final ArrayList<String> f61276o;

    /* renamed from: b  reason: collision with root package name */
    private n f61277b;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61279k;

    /* renamed from: m  reason: collision with root package name */
    protected final long f61280m;

    /* renamed from: n  reason: collision with root package name */
    private int f61281n;

    /* renamed from: p  reason: collision with root package name */
    protected List<com.ss.android.socialbase.downloader.model.p> f61282p;
    private long qv;
    protected final String vv;
    private boolean wv;

    /* renamed from: u  reason: collision with root package name */
    private Map<String, String> f61283u = null;

    /* renamed from: i  reason: collision with root package name */
    protected final Object f61278i = new Object();

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        f61276o = arrayList;
        arrayList.add("Content-Length");
        arrayList.add("Content-Range");
        arrayList.add("Transfer-Encoding");
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    public p(String str, List<com.ss.android.socialbase.downloader.model.p> list, long j4) {
        this.vv = str;
        this.f61282p = list;
        this.f61280m = j4;
    }

    public void i() throws InterruptedException {
        synchronized (this.f61278i) {
            if (this.f61279k && this.f61283u == null) {
                this.f61278i.wait();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public int m() throws IOException {
        return this.f61281n;
    }

    public boolean n() {
        return this.f61279k;
    }

    public boolean o() {
        return this.wv;
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public void p() {
        n nVar = this.f61277b;
        if (nVar != null) {
            nVar.p();
        }
    }

    public List<com.ss.android.socialbase.downloader.model.p> qv() {
        return this.f61282p;
    }

    public boolean u() {
        return System.currentTimeMillis() - this.qv < m.f61273m;
    }

    public void vv() throws Exception {
        if (this.f61283u != null) {
            return;
        }
        try {
            this.f61279k = true;
            this.f61277b = com.ss.android.socialbase.downloader.downloader.p.vv(this.vv, this.f61282p);
            synchronized (this.f61278i) {
                if (this.f61277b != null) {
                    HashMap hashMap = new HashMap();
                    this.f61283u = hashMap;
                    vv(this.f61277b, hashMap);
                    this.f61281n = this.f61277b.m();
                    this.qv = System.currentTimeMillis();
                    this.wv = vv(this.f61281n);
                }
                this.f61279k = false;
                this.f61278i.notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this.f61278i) {
                if (this.f61277b != null) {
                    HashMap hashMap2 = new HashMap();
                    this.f61283u = hashMap2;
                    vv(this.f61277b, hashMap2);
                    this.f61281n = this.f61277b.m();
                    this.qv = System.currentTimeMillis();
                    this.wv = vv(this.f61281n);
                }
                this.f61279k = false;
                this.f61278i.notifyAll();
                throw th;
            }
        }
    }

    public boolean vv(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    public Map<String, String> wv() {
        return this.f61283u;
    }

    private void vv(n nVar, Map<String, String> map) {
        if (nVar == null || map == null) {
            return;
        }
        Iterator<String> it2 = f61276o.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            map.put(next, nVar.vv(next));
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public String vv(String str) {
        Map<String, String> map = this.f61283u;
        if (map != null) {
            return map.get(str);
        }
        n nVar = this.f61277b;
        if (nVar != null) {
            return nVar.vv(str);
        }
        return null;
    }
}
