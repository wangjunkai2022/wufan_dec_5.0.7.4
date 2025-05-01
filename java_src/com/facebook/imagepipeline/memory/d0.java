package com.facebook.imagepipeline.memory;

import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: PoolFactory.java */
@NotThreadSafe
/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f11997a;

    /* renamed from: b  reason: collision with root package name */
    private d f11998b;

    /* renamed from: c  reason: collision with root package name */
    private j f11999c;

    /* renamed from: d  reason: collision with root package name */
    private p f12000d;

    /* renamed from: e  reason: collision with root package name */
    private y f12001e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.common.memory.g f12002f;

    /* renamed from: g  reason: collision with root package name */
    private com.facebook.common.memory.j f12003g;

    /* renamed from: h  reason: collision with root package name */
    private g0 f12004h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.common.memory.a f12005i;

    public d0(c0 c0Var) {
        this.f11997a = (c0) com.facebook.common.internal.h.i(c0Var);
    }

    private u e(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return b();
            }
            throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
        return f();
    }

    public d a() {
        if (this.f11998b == null) {
            String e5 = this.f11997a.e();
            char c5 = 65535;
            switch (e5.hashCode()) {
                case -1868884870:
                    if (e5.equals(BitmapPoolType.LEGACY_DEFAULT_PARAMS)) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e5.equals("legacy")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -404562712:
                    if (e5.equals(BitmapPoolType.EXPERIMENTAL)) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e5.equals(BitmapPoolType.DUMMY)) {
                        c5 = 0;
                        break;
                    }
                    break;
            }
            if (c5 == 0) {
                this.f11998b = new o();
            } else if (c5 == 1) {
                this.f11998b = new r(this.f11997a.b(), this.f11997a.a(), z.h(), this.f11997a.l() ? this.f11997a.i() : null);
            } else if (c5 != 2) {
                this.f11998b = new h(this.f11997a.i(), this.f11997a.c(), this.f11997a.d());
            } else {
                this.f11998b = new h(this.f11997a.i(), k.a(), this.f11997a.d());
            }
        }
        return this.f11998b;
    }

    public j b() {
        if (this.f11999c == null) {
            this.f11999c = new j(this.f11997a.i(), this.f11997a.g(), this.f11997a.h());
        }
        return this.f11999c;
    }

    public p c() {
        if (this.f12000d == null) {
            this.f12000d = new p(this.f11997a.i(), this.f11997a.f());
        }
        return this.f12000d;
    }

    public int d() {
        return this.f11997a.f().f12015h;
    }

    public y f() {
        if (this.f12001e == null) {
            this.f12001e = new y(this.f11997a.i(), this.f11997a.g(), this.f11997a.h());
        }
        return this.f12001e;
    }

    public com.facebook.common.memory.g g() {
        return h(0);
    }

    public com.facebook.common.memory.g h(int i4) {
        if (this.f12002f == null) {
            this.f12002f = new x(e(i4), i());
        }
        return this.f12002f;
    }

    public com.facebook.common.memory.j i() {
        if (this.f12003g == null) {
            this.f12003g = new com.facebook.common.memory.j(k());
        }
        return this.f12003g;
    }

    public g0 j() {
        if (this.f12004h == null) {
            this.f12004h = new g0(this.f11997a.i(), this.f11997a.f());
        }
        return this.f12004h;
    }

    public com.facebook.common.memory.a k() {
        if (this.f12005i == null) {
            this.f12005i = new q(this.f11997a.i(), this.f11997a.j(), this.f11997a.k());
        }
        return this.f12005i;
    }
}
