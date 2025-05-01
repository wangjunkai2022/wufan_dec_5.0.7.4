package com.facebook.fresco.animation.drawable;

import com.facebook.fresco.animation.drawable.a;
/* compiled from: AnimatedDrawable2DebugDrawListener.java */
/* loaded from: classes2.dex */
public class b implements a.b {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f11471e = b.class;

    /* renamed from: a  reason: collision with root package name */
    private int f11472a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f11473b;

    /* renamed from: c  reason: collision with root package name */
    private int f11474c;

    /* renamed from: d  reason: collision with root package name */
    private int f11475d;

    @Override // com.facebook.fresco.animation.drawable.a.b
    public void a(a aVar, com.facebook.fresco.animation.frame.b bVar, int i4, boolean z4, boolean z5, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        if (aVar.c() == null) {
            return;
        }
        int a5 = aVar.c().a();
        long j11 = j5 - j6;
        this.f11475d++;
        int i5 = this.f11472a;
        int i6 = (i5 + 1) % a5;
        if (i6 != i4) {
            if (i5 == i4) {
                this.f11474c++;
            } else {
                int i7 = (i4 - i6) % a5;
                if (i7 < 0) {
                    i7 += a5;
                }
                this.f11473b += i7;
            }
        }
        this.f11472a = i4;
        com.facebook.common.logging.a.g(f11471e, "draw: frame: %2d, drawn: %b, delay: %3d ms, rendering: %3d ms, prev: %3d ms ago, duplicates: %3d, skipped: %3d, draw calls: %4d, anim time: %6d ms, next start: %6d ms, next scheduled: %6d ms", Integer.valueOf(i4), Boolean.valueOf(z4), Long.valueOf((j5 % bVar.e()) - bVar.a(i4)), Long.valueOf(j8 - j7), Long.valueOf(j11), Integer.valueOf(this.f11474c), Integer.valueOf(this.f11473b), Integer.valueOf(this.f11475d), Long.valueOf(j5), Long.valueOf(j9), Long.valueOf(j10));
    }
}
