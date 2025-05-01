package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.bitmap.a;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: KeepLastFrameCache.java */
/* loaded from: classes.dex */
public class b implements com.facebook.fresco.animation.bitmap.a {

    /* renamed from: d  reason: collision with root package name */
    private static final int f11426d = -1;

    /* renamed from: a  reason: collision with root package name */
    private int f11427a = -1;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private a.InterfaceC0263a f11428b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.common.references.a<Bitmap> f11429c;

    private synchronized void i() {
        int i4;
        a.InterfaceC0263a interfaceC0263a = this.f11428b;
        if (interfaceC0263a != null && (i4 = this.f11427a) != -1) {
            interfaceC0263a.a(this, i4);
        }
        com.facebook.common.references.a.h(this.f11429c);
        this.f11429c = null;
        this.f11427a = -1;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public void a(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5) {
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized int b() {
        com.facebook.common.references.a<Bitmap> aVar;
        aVar = this.f11429c;
        return aVar == null ? 0 : com.facebook.imageutils.a.g(aVar.k());
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized void c(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5) {
        int i6;
        if (aVar != null) {
            if (this.f11429c != null && aVar.k().equals(this.f11429c.k())) {
                return;
            }
        }
        com.facebook.common.references.a.h(this.f11429c);
        a.InterfaceC0263a interfaceC0263a = this.f11428b;
        if (interfaceC0263a != null && (i6 = this.f11427a) != -1) {
            interfaceC0263a.a(this, i6);
        }
        this.f11429c = com.facebook.common.references.a.d(aVar);
        a.InterfaceC0263a interfaceC0263a2 = this.f11428b;
        if (interfaceC0263a2 != null) {
            interfaceC0263a2.b(this, i4);
        }
        this.f11427a = i4;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized void clear() {
        i();
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> d(int i4) {
        return com.facebook.common.references.a.d(this.f11429c);
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized com.facebook.common.references.a<Bitmap> e(int i4, int i5, int i6) {
        com.facebook.common.references.a<Bitmap> d5;
        d5 = com.facebook.common.references.a.d(this.f11429c);
        i();
        return d5;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public void f(a.InterfaceC0263a interfaceC0263a) {
        this.f11428b = interfaceC0263a;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized boolean g(int i4) {
        boolean z4;
        if (i4 == this.f11427a) {
            z4 = com.facebook.common.references.a.t(this.f11429c);
        }
        return z4;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> h(int i4) {
        if (this.f11427a == i4) {
            return com.facebook.common.references.a.d(this.f11429c);
        }
        return null;
    }
}
