package org.jboss.netty.bootstrap;

import java.net.SocketAddress;
import java.util.Objects;
import org.jboss.netty.channel.ChannelPipelineException;
import org.jboss.netty.channel.e;
import org.jboss.netty.channel.i;
import org.jboss.netty.channel.j;
/* compiled from: ClientBootstrap.java */
/* loaded from: classes7.dex */
public class b extends a {
    public b() {
    }

    public j p(SocketAddress socketAddress) {
        Objects.requireNonNull(socketAddress, "remoteAddress");
        return q(socketAddress, (SocketAddress) d("localAddress"));
    }

    public j q(SocketAddress socketAddress, SocketAddress socketAddress2) {
        Objects.requireNonNull(socketAddress, "remoteAddress");
        try {
            e a5 = c().a(h().getPipeline());
            try {
                a5.getConfig().setOptions(e());
                if (socketAddress2 != null) {
                    a5.bind(socketAddress2);
                }
                return a5.connect(socketAddress);
            } catch (Throwable th) {
                a5.close();
                throw th;
            }
        } catch (Exception e5) {
            throw new ChannelPipelineException("Failed to initialize a pipeline.", e5);
        }
    }

    public b(i iVar) {
        super(iVar);
    }
}
