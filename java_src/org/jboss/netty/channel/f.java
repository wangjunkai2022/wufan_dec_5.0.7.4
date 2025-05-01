package org.jboss.netty.channel;

import java.util.Map;
/* compiled from: ChannelConfig.java */
/* loaded from: classes7.dex */
public interface f {
    o b();

    boolean c(String str, Object obj);

    void d(org.jboss.netty.buffer.f fVar);

    org.jboss.netty.buffer.f g();

    int getConnectTimeoutMillis();

    void h(o oVar);

    void setConnectTimeoutMillis(int i4);

    void setOptions(Map<String, Object> map);
}
