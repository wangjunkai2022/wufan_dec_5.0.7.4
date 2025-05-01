package io.netty.channel.nio;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
/* loaded from: classes6.dex */
public interface NioTask<C extends SelectableChannel> {
    void channelReady(C c5, SelectionKey selectionKey) throws Exception;

    void channelUnregistered(C c5, Throwable th) throws Exception;
}
