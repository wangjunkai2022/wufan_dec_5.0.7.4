package org.jboss.netty.channel;

import java.net.SocketAddress;
/* compiled from: Channel.java */
/* loaded from: classes7.dex */
public interface e extends Comparable<e> {

    /* renamed from: t1  reason: collision with root package name */
    public static final int f72541t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    public static final int f72542u1 = 1;

    /* renamed from: w1  reason: collision with root package name */
    public static final int f72543w1 = 4;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f72544x1 = 5;

    int O();

    void b(Object obj);

    j bind(SocketAddress socketAddress);

    j close();

    j connect(SocketAddress socketAddress);

    j disconnect();

    j g();

    f getConfig();

    Integer getId();

    SocketAddress getLocalAddress();

    e getParent();

    n getPipeline();

    SocketAddress getRemoteAddress();

    j h(int i4);

    Object i();

    boolean isBound();

    boolean isConnected();

    boolean isOpen();

    boolean isReadable();

    boolean isWritable();

    j j(boolean z4);

    j k(Object obj, SocketAddress socketAddress);

    j t0();

    i v();

    j write(Object obj);
}
