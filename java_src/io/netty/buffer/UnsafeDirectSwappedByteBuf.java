package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
/* loaded from: classes6.dex */
final class UnsafeDirectSwappedByteBuf extends AbstractUnsafeSwappedByteBuf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UnsafeDirectSwappedByteBuf(AbstractByteBuf abstractByteBuf) {
        super(abstractByteBuf);
    }

    private static long addr(AbstractByteBuf abstractByteBuf, int i4) {
        return abstractByteBuf.memoryAddress() + i4;
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected int _getInt(AbstractByteBuf abstractByteBuf, int i4) {
        return PlatformDependent.getInt(addr(abstractByteBuf, i4));
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected long _getLong(AbstractByteBuf abstractByteBuf, int i4) {
        return PlatformDependent.getLong(addr(abstractByteBuf, i4));
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected short _getShort(AbstractByteBuf abstractByteBuf, int i4) {
        return PlatformDependent.getShort(addr(abstractByteBuf, i4));
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setInt(AbstractByteBuf abstractByteBuf, int i4, int i5) {
        PlatformDependent.putInt(addr(abstractByteBuf, i4), i5);
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setLong(AbstractByteBuf abstractByteBuf, int i4, long j4) {
        PlatformDependent.putLong(addr(abstractByteBuf, i4), j4);
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setShort(AbstractByteBuf abstractByteBuf, int i4, short s4) {
        PlatformDependent.putShort(addr(abstractByteBuf, i4), s4);
    }
}
