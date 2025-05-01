package io.netty.channel;

import io.netty.util.concurrent.PromiseNotifier;
/* loaded from: classes6.dex */
public final class ChannelPromiseNotifier extends PromiseNotifier<Void, ChannelFuture> implements ChannelFutureListener {
    public ChannelPromiseNotifier(ChannelPromise... channelPromiseArr) {
        super(channelPromiseArr);
    }

    public ChannelPromiseNotifier(boolean z4, ChannelPromise... channelPromiseArr) {
        super(z4, channelPromiseArr);
    }
}
