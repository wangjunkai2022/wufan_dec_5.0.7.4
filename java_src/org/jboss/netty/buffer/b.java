package org.jboss.netty.buffer;

import java.nio.ByteOrder;
import java.util.Objects;
/* compiled from: AbstractChannelBufferFactory.java */
/* loaded from: classes7.dex */
public abstract class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ByteOrder f72452a;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        this(ByteOrder.BIG_ENDIAN);
    }

    @Override // org.jboss.netty.buffer.f
    public e a(int i4) {
        return f(d(), i4);
    }

    @Override // org.jboss.netty.buffer.f
    public ByteOrder d() {
        return this.f72452a;
    }

    @Override // org.jboss.netty.buffer.f
    public e e(byte[] bArr, int i4, int i5) {
        return b(d(), bArr, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(ByteOrder byteOrder) {
        Objects.requireNonNull(byteOrder, "defaultOrder");
        this.f72452a = byteOrder;
    }
}
