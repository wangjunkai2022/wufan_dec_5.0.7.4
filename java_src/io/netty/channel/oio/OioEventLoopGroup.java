package io.netty.channel.oio;

import io.netty.channel.ThreadPerChannelEventLoopGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
@Deprecated
/* loaded from: classes6.dex */
public class OioEventLoopGroup extends ThreadPerChannelEventLoopGroup {
    public OioEventLoopGroup() {
        this(0);
    }

    public OioEventLoopGroup(int i4) {
        this(i4, Executors.defaultThreadFactory());
    }

    public OioEventLoopGroup(int i4, Executor executor) {
        super(i4, executor, new Object[0]);
    }

    public OioEventLoopGroup(int i4, ThreadFactory threadFactory) {
        super(i4, threadFactory, new Object[0]);
    }
}
