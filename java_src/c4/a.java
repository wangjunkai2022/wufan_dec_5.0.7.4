package c4;

import java.net.SocketAddress;
import java.util.Set;
import org.jboss.netty.channel.e;
/* compiled from: ChannelGroup.java */
/* loaded from: classes7.dex */
public interface a extends Set<e>, Comparable<a> {
    b close();

    b disconnect();

    b g();

    String getName();

    b h(int i4);

    b j(boolean z4);

    b k(Object obj, SocketAddress socketAddress);

    e l(Integer num);

    b write(Object obj);
}
