package com.xinzhu.overmind.client.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ServiceRecord.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Service f67737a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Intent.FilterComparison, b> f67738b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f67739c;

    /* renamed from: d  reason: collision with root package name */
    private int f67740d;

    /* compiled from: ServiceRecord.java */
    /* renamed from: com.xinzhu.overmind.client.service.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0747a implements IBinder.DeathRecipient {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IBinder f67741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Intent.FilterComparison f67742c;

        C0747a(IBinder iBinder, Intent.FilterComparison filterComparison) {
            this.f67741b = iBinder;
            this.f67742c = filterComparison;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f67741b.unlinkToDeath(this, 0);
            a.this.f67738b.remove(this.f67742c);
        }
    }

    /* compiled from: ServiceRecord.java */
    /* loaded from: classes6.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f67744a;

        /* renamed from: b  reason: collision with root package name */
        private AtomicInteger f67745b = new AtomicInteger(0);

        public b() {
        }

        public int a() {
            return this.f67745b.decrementAndGet();
        }

        public int b() {
            return this.f67745b.get();
        }

        public IBinder c() {
            return this.f67744a;
        }

        public int d() {
            return this.f67745b.incrementAndGet();
        }

        public void e(IBinder iBinder) {
            this.f67744a = iBinder;
        }
    }

    public void b(Intent intent, IBinder iBinder) {
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        b f5 = f(intent);
        if (f5 == null) {
            f5 = new b();
            this.f67738b.put(filterComparison, f5);
        }
        f5.e(iBinder);
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(new C0747a(iBinder, filterComparison), 0);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    public boolean c(Intent intent) {
        b bVar = this.f67738b.get(new Intent.FilterComparison(intent));
        return bVar == null || bVar.a() <= 0;
    }

    public int d(Intent intent) {
        return f(intent).b();
    }

    public IBinder e(Intent intent) {
        return f(intent).c();
    }

    public b f(Intent intent) {
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        b bVar = this.f67738b.get(filterComparison);
        if (bVar == null) {
            b bVar2 = new b();
            this.f67738b.put(filterComparison, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public Service g() {
        return this.f67737a;
    }

    public int h() {
        return this.f67740d;
    }

    public int i() {
        int i4 = 0;
        for (b bVar : this.f67738b.values()) {
            i4 += bVar.b();
        }
        return i4;
    }

    public boolean j(Intent intent) {
        return f(intent).c() != null;
    }

    public int k(Intent intent) {
        return f(intent).d();
    }

    public boolean l() {
        return this.f67739c;
    }

    public void m(boolean z4) {
        this.f67739c = z4;
    }

    public void n(Service service) {
        this.f67737a = service;
    }

    public void o(int i4) {
        this.f67740d = i4;
    }
}
