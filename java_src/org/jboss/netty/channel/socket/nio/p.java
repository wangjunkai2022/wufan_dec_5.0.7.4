package org.jboss.netty.channel.socket.nio;
/* compiled from: NioSelector.java */
/* loaded from: classes7.dex */
public interface p extends Runnable {
    void rebuildSelector();

    void shutdown();

    void u(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar);
}
