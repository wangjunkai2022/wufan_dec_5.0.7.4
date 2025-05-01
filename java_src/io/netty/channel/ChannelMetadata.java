package io.netty.channel;

import io.netty.util.internal.ObjectUtil;
/* loaded from: classes6.dex */
public final class ChannelMetadata {
    private final int defaultMaxMessagesPerRead;
    private final boolean hasDisconnect;

    public ChannelMetadata(boolean z4) {
        this(z4, 1);
    }

    public int defaultMaxMessagesPerRead() {
        return this.defaultMaxMessagesPerRead;
    }

    public boolean hasDisconnect() {
        return this.hasDisconnect;
    }

    public ChannelMetadata(boolean z4, int i4) {
        ObjectUtil.checkPositive(i4, "defaultMaxMessagesPerRead");
        this.hasDisconnect = z4;
        this.defaultMaxMessagesPerRead = i4;
    }
}
