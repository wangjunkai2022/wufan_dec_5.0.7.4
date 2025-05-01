package com.facebook.fresco.animation.frame;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.fresco.animation.backend.d;
/* compiled from: DropFramesFrameScheduler.java */
/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: e  reason: collision with root package name */
    private static final int f11506e = -1;

    /* renamed from: c  reason: collision with root package name */
    private final d f11507c;

    /* renamed from: d  reason: collision with root package name */
    private long f11508d = -1;

    public a(d dVar) {
        this.f11507c = dVar;
    }

    @Override // com.facebook.fresco.animation.frame.b
    public long a(int i4) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += this.f11507c.j(i4);
        }
        return j4;
    }

    @Override // com.facebook.fresco.animation.frame.b
    public long b(long j4) {
        long e5 = e();
        long j5 = 0;
        if (e5 == 0) {
            return -1L;
        }
        if (d() || j4 / e() < this.f11507c.c()) {
            long j6 = j4 % e5;
            int a5 = this.f11507c.a();
            for (int i4 = 0; i4 < a5 && j5 <= j6; i4++) {
                j5 += this.f11507c.j(i4);
            }
            return j4 + (j5 - j6);
        }
        return -1L;
    }

    @Override // com.facebook.fresco.animation.frame.b
    public int c(long j4, long j5) {
        if (d() || j4 / e() < this.f11507c.c()) {
            return f(j4 % e());
        }
        return -1;
    }

    @Override // com.facebook.fresco.animation.frame.b
    public boolean d() {
        return this.f11507c.c() == 0;
    }

    @Override // com.facebook.fresco.animation.frame.b
    public long e() {
        long j4 = this.f11508d;
        if (j4 != -1) {
            return j4;
        }
        this.f11508d = 0L;
        int a5 = this.f11507c.a();
        for (int i4 = 0; i4 < a5; i4++) {
            this.f11508d += this.f11507c.j(i4);
        }
        return this.f11508d;
    }

    @VisibleForTesting
    int f(long j4) {
        int i4 = 0;
        long j5 = 0;
        do {
            j5 += this.f11507c.j(i4);
            i4++;
        } while (j4 >= j5);
        return i4 - 1;
    }
}
