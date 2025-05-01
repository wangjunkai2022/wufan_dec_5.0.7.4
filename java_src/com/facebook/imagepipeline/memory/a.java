package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: BitmapCounter.java */
/* loaded from: classes2.dex */
public class a {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private int f11956a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private long f11957b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11958c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11959d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.common.references.c<Bitmap> f11960e;

    /* compiled from: BitmapCounter.java */
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0272a implements com.facebook.common.references.c<Bitmap> {
        C0272a() {
        }

        @Override // com.facebook.common.references.c
        /* renamed from: a */
        public void release(Bitmap bitmap) {
            try {
                a.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public a(int i4, int i5) {
        com.facebook.common.internal.h.d(i4 > 0);
        com.facebook.common.internal.h.d(i5 > 0);
        this.f11958c = i4;
        this.f11959d = i5;
        this.f11960e = new C0272a();
    }

    public synchronized void a(Bitmap bitmap) {
        int g4 = com.facebook.imageutils.a.g(bitmap);
        com.facebook.common.internal.h.e(this.f11956a > 0, "No bitmaps registered.");
        long j4 = g4;
        com.facebook.common.internal.h.f(j4 <= this.f11957b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(g4), Long.valueOf(this.f11957b));
        this.f11957b -= j4;
        this.f11956a--;
    }

    public synchronized int b() {
        return this.f11956a;
    }

    public synchronized int c() {
        return this.f11958c;
    }

    public synchronized int d() {
        return this.f11959d;
    }

    public com.facebook.common.references.c<Bitmap> e() {
        return this.f11960e;
    }

    public synchronized long f() {
        return this.f11957b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int g4 = com.facebook.imageutils.a.g(bitmap);
        int i4 = this.f11956a;
        if (i4 < this.f11958c) {
            long j4 = this.f11957b;
            long j5 = g4;
            if (j4 + j5 <= this.f11959d) {
                this.f11956a = i4 + 1;
                this.f11957b = j4 + j5;
                return true;
            }
        }
        return false;
    }
}
