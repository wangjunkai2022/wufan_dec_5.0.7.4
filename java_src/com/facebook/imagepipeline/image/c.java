package com.facebook.imagepipeline.image;

import java.io.Closeable;
/* compiled from: CloseableImage.java */
/* loaded from: classes2.dex */
public abstract class c implements Closeable, f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f11911b = "CloseableImage";

    @Override // com.facebook.imagepipeline.image.f
    public h a() {
        return g.f11933d;
    }

    public abstract int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean d() {
        return false;
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        com.facebook.common.logging.a.q0(f11911b, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract boolean isClosed();
}
