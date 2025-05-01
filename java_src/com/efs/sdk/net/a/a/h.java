package com.efs.sdk.net.a.a;

import java.io.ByteArrayOutputStream;
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final f f10583a;

    /* renamed from: b  reason: collision with root package name */
    public ByteArrayOutputStream f10584b;

    /* renamed from: c  reason: collision with root package name */
    public a f10585c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10586d;

    public h(f fVar, String str) {
        this.f10583a = fVar;
        this.f10586d = str;
    }

    public final boolean a() {
        return this.f10584b != null;
    }

    public final void b() {
        if (!a()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }
}
