package com.ss.android.socialbase.downloader.u;

import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
class m implements i, o, p {

    /* renamed from: b  reason: collision with root package name */
    private int f61396b;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f61398k;

    /* renamed from: m  reason: collision with root package name */
    private final int f61399m;

    /* renamed from: n  reason: collision with root package name */
    private vv f61400n;

    /* renamed from: o  reason: collision with root package name */
    private vv f61401o;
    private vv qv;

    /* renamed from: u  reason: collision with root package name */
    private vv f61403u;
    private final int vv;
    private vv wv;

    /* renamed from: p  reason: collision with root package name */
    private final Object f61402p = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Object f61397i = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(int i4, int i5) {
        i4 = i4 < 64 ? 64 : i4;
        i5 = i5 < 8192 ? 8192 : i5;
        this.vv = i4;
        this.f61399m = i5;
    }

    @Override // com.ss.android.socialbase.downloader.u.p
    @NonNull
    public vv m() throws j, InterruptedException {
        synchronized (this.f61402p) {
            if (!this.f61398k) {
                vv vvVar = this.f61401o;
                if (vvVar == null) {
                    int i4 = this.f61396b;
                    if (i4 < this.vv) {
                        this.f61396b = i4 + 1;
                        return new vv(this.f61399m);
                    }
                    do {
                        this.f61402p.wait();
                        if (!this.f61398k) {
                            vvVar = this.f61401o;
                        } else {
                            throw new j("obtain");
                        }
                    } while (vvVar == null);
                }
                this.f61401o = vvVar.f61442i;
                if (vvVar == this.f61403u) {
                    this.f61403u = null;
                }
                vvVar.f61442i = null;
                return vvVar;
            }
            throw new j("obtain");
        }
    }

    public void p() {
        this.f61398k = true;
        synchronized (this.f61402p) {
            this.f61402p.notifyAll();
        }
        synchronized (this.f61397i) {
            this.f61397i.notifyAll();
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.i
    @NonNull
    public vv vv() throws j, InterruptedException {
        vv vvVar;
        vv vvVar2 = this.wv;
        if (vvVar2 != null) {
            this.wv = vvVar2.f61442i;
            vvVar2.f61442i = null;
            return vvVar2;
        }
        synchronized (this.f61397i) {
            vvVar = this.f61400n;
            while (vvVar == null) {
                if (!this.f61398k) {
                    this.f61397i.wait();
                    vvVar = this.f61400n;
                } else {
                    throw new j("read");
                }
            }
            this.wv = vvVar.f61442i;
            this.qv = null;
            this.f61400n = null;
            vvVar.f61442i = null;
        }
        return vvVar;
    }

    @Override // com.ss.android.socialbase.downloader.u.p
    public void vv(@NonNull vv vvVar) {
        synchronized (this.f61402p) {
            vv vvVar2 = this.f61403u;
            if (vvVar2 == null) {
                this.f61403u = vvVar;
                this.f61401o = vvVar;
            } else {
                vvVar2.f61442i = vvVar;
                this.f61403u = vvVar;
            }
            this.f61402p.notify();
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.o
    public void m(@NonNull vv vvVar) {
        synchronized (this.f61397i) {
            vv vvVar2 = this.qv;
            if (vvVar2 == null) {
                this.qv = vvVar;
                this.f61400n = vvVar;
                this.f61397i.notify();
            } else {
                vvVar2.f61442i = vvVar;
                this.qv = vvVar;
            }
        }
    }
}
