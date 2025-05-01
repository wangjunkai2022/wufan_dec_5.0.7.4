package com.bytedance.pangle.res.a;

import java.io.InputStream;
/* loaded from: classes2.dex */
public final class e extends j {

    /* renamed from: a  reason: collision with root package name */
    private long f8551a;

    public e(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.bytedance.pangle.res.a.j
    protected final synchronized void a(int i4) {
        if (i4 != -1) {
            this.f8551a += i4;
        }
    }

    public final synchronized long b() {
        return this.f8551a;
    }

    @Override // com.bytedance.pangle.res.a.j, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j4) {
        long skip;
        skip = super.skip(j4);
        this.f8551a += skip;
        return skip;
    }

    public final int a() {
        long b5 = b();
        if (b5 <= 2147483647L) {
            return (int) b5;
        }
        throw new ArithmeticException("The byte count " + b5 + " is too large to be converted to an int");
    }
}
