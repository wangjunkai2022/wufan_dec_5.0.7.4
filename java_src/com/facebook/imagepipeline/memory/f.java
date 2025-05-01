package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: Bucket.java */
@VisibleForTesting
@NotThreadSafe
/* loaded from: classes.dex */
class f<V> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12016f = "BUCKET";

    /* renamed from: a  reason: collision with root package name */
    public final int f12017a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12018b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f12019c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12020d;

    /* renamed from: e  reason: collision with root package name */
    private int f12021e;

    public f(int i4, int i5, int i6, boolean z4) {
        com.facebook.common.internal.h.o(i4 > 0);
        com.facebook.common.internal.h.o(i5 >= 0);
        com.facebook.common.internal.h.o(i6 >= 0);
        this.f12017a = i4;
        this.f12018b = i5;
        this.f12019c = new LinkedList();
        this.f12021e = i6;
        this.f12020d = z4;
    }

    void a(V v2) {
        this.f12019c.add(v2);
    }

    public void b() {
        com.facebook.common.internal.h.o(this.f12021e > 0);
        this.f12021e--;
    }

    @Nullable
    @Deprecated
    public V c() {
        V h4 = h();
        if (h4 != null) {
            this.f12021e++;
        }
        return h4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f12019c.size();
    }

    public int e() {
        return this.f12021e;
    }

    public void f() {
        this.f12021e++;
    }

    public boolean g() {
        return this.f12021e + d() > this.f12018b;
    }

    @Nullable
    public V h() {
        return (V) this.f12019c.poll();
    }

    public void i(V v2) {
        com.facebook.common.internal.h.i(v2);
        if (this.f12020d) {
            com.facebook.common.internal.h.o(this.f12021e > 0);
            this.f12021e--;
            a(v2);
            return;
        }
        int i4 = this.f12021e;
        if (i4 > 0) {
            this.f12021e = i4 - 1;
            a(v2);
            return;
        }
        com.facebook.common.logging.a.w(f12016f, "Tried to release value %s from an empty bucket!", v2);
    }
}
