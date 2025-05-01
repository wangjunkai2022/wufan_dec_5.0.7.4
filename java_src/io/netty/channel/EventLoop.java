package io.netty.channel;

import io.netty.util.concurrent.OrderedEventExecutor;
/* loaded from: classes6.dex */
public interface EventLoop extends OrderedEventExecutor, EventLoopGroup {
    @Override // 
    EventLoopGroup parent();
}
