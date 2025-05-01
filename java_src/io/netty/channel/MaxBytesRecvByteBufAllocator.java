package io.netty.channel;

import java.util.Map;
/* loaded from: classes6.dex */
public interface MaxBytesRecvByteBufAllocator extends RecvByteBufAllocator {
    int maxBytesPerIndividualRead();

    MaxBytesRecvByteBufAllocator maxBytesPerIndividualRead(int i4);

    int maxBytesPerRead();

    MaxBytesRecvByteBufAllocator maxBytesPerRead(int i4);

    MaxBytesRecvByteBufAllocator maxBytesPerReadPair(int i4, int i5);

    Map.Entry<Integer, Integer> maxBytesPerReadPair();
}
