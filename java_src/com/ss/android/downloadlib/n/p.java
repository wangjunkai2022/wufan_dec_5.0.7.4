package com.ss.android.downloadlib.n;

import java.lang.ref.SoftReference;
/* loaded from: classes5.dex */
public class p<P, R> implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    private SoftReference<vv<P, R>> f60666i;

    /* renamed from: m  reason: collision with root package name */
    private R f60667m;

    /* renamed from: o  reason: collision with root package name */
    private p<?, P> f60668o;

    /* renamed from: p  reason: collision with root package name */
    private int f60669p;

    /* renamed from: u  reason: collision with root package name */
    private p<R, ?> f60670u;
    private P vv;

    /* loaded from: classes5.dex */
    public interface vv<PARAM, RESULT> {
        RESULT vv(PARAM param);
    }

    private p(int i4, vv<P, R> vvVar, P p4) {
        this.f60669p = i4;
        this.f60666i = new SoftReference<>(vvVar);
        this.vv = p4;
    }

    private R m() {
        return this.f60667m;
    }

    public static <P, R> p<P, R> vv(vv<P, R> vvVar, P p4) {
        return new p<>(2, vvVar, p4);
    }

    @Override // java.lang.Runnable
    public void run() {
        p<?, P> pVar;
        if (this.f60669p == 0 && !jh.m()) {
            com.ss.android.downloadlib.n.vv().m().post(this);
        } else if (this.f60669p == 1 && jh.m()) {
            com.ss.android.downloadlib.i.vv().vv(this);
        } else if (this.f60669p == 2 && jh.m()) {
            com.ss.android.downloadlib.i.vv().m(this);
        } else {
            if (this.vv == null && (pVar = this.f60668o) != null) {
                this.vv = pVar.m();
            }
            vv<P, R> vvVar = this.f60666i.get();
            if (vvVar == null) {
                return;
            }
            this.f60667m = vvVar.vv(this.vv);
            p<R, ?> pVar2 = this.f60670u;
            if (pVar2 != null) {
                pVar2.run();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <NR> p<R, NR> vv(int i4, vv<R, NR> vvVar) {
        p pVar = (p<R, ?>) new p(i4, vvVar, null);
        this.f60670u = pVar;
        pVar.f60668o = this;
        return pVar;
    }

    public <NR> p<R, NR> vv(vv<R, NR> vvVar) {
        return vv(0, vvVar);
    }

    public void vv() {
        p<?, P> pVar = this.f60668o;
        if (pVar != null) {
            pVar.vv();
        } else {
            run();
        }
    }
}
