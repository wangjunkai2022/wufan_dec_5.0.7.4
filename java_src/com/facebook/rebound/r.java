package com.facebook.rebound;
/* compiled from: SteppingLooper.java */
/* loaded from: classes2.dex */
public class r extends n {

    /* renamed from: b  reason: collision with root package name */
    private boolean f12631b;

    /* renamed from: c  reason: collision with root package name */
    private long f12632c;

    @Override // com.facebook.rebound.n
    public void b() {
        this.f12631b = true;
        this.f12632c = 0L;
    }

    @Override // com.facebook.rebound.n
    public void c() {
        this.f12631b = false;
    }

    public boolean d(long j4) {
        c cVar = this.f12630a;
        if (cVar == null || !this.f12631b) {
            return false;
        }
        long j5 = this.f12632c + j4;
        cVar.i(j5);
        this.f12632c = j5;
        return this.f12630a.g();
    }
}
