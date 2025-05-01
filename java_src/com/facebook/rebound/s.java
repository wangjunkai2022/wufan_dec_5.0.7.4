package com.facebook.rebound;
/* compiled from: SynchronousLooper.java */
/* loaded from: classes2.dex */
public class s extends n {

    /* renamed from: d  reason: collision with root package name */
    public static double f12633d = 16.6667d;

    /* renamed from: b  reason: collision with root package name */
    private double f12634b = f12633d;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12635c;

    @Override // com.facebook.rebound.n
    public void b() {
        this.f12635c = true;
        while (!this.f12630a.g() && this.f12635c) {
            this.f12630a.i(this.f12634b);
        }
    }

    @Override // com.facebook.rebound.n
    public void c() {
        this.f12635c = false;
    }

    public double d() {
        return this.f12634b;
    }

    public void e(double d5) {
        this.f12634b = d5;
    }
}
