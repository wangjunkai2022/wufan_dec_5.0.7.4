package io.netty.bootstrap;

import io.netty.channel.Channel;
@Deprecated
/* loaded from: classes6.dex */
public interface ChannelFactory<T extends Channel> {
    T newChannel();
}
