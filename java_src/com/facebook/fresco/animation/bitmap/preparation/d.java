package com.facebook.fresco.animation.bitmap.preparation;
/* compiled from: FixedNumberBitmapFramePreparationStrategy.java */
/* loaded from: classes2.dex */
public class d implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f11441b = d.class;

    /* renamed from: c  reason: collision with root package name */
    private static final int f11442c = 3;

    /* renamed from: a  reason: collision with root package name */
    private final int f11443a;

    public d() {
        this(3);
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.a
    public void a(b bVar, com.facebook.fresco.animation.bitmap.a aVar, com.facebook.fresco.animation.backend.a aVar2, int i4) {
        for (int i5 = 1; i5 <= this.f11443a; i5++) {
            int a5 = (i4 + i5) % aVar2.a();
            if (com.facebook.common.logging.a.R(2)) {
                com.facebook.common.logging.a.W(f11441b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a5), Integer.valueOf(i4));
            }
            if (!bVar.a(aVar, aVar2, a5)) {
                return;
            }
        }
    }

    public d(int i4) {
        this.f11443a = i4;
    }
}
