package c4;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.jboss.netty.channel.e;
import org.jboss.netty.channel.j;
/* compiled from: ChannelGroupFuture.java */
/* loaded from: classes7.dex */
public interface b extends Iterable<j> {
    void E(c cVar);

    boolean P();

    void a0(c cVar);

    b await() throws InterruptedException;

    boolean await(long j4) throws InterruptedException;

    boolean await(long j4, TimeUnit timeUnit) throws InterruptedException;

    b awaitUninterruptibly();

    boolean awaitUninterruptibly(long j4);

    boolean awaitUninterruptibly(long j4, TimeUnit timeUnit);

    j d(e eVar);

    boolean e0();

    a getGroup();

    boolean isDone();

    boolean isPartialFailure();

    boolean isPartialSuccess();

    @Override // java.lang.Iterable
    Iterator<j> iterator();

    j l(Integer num);
}
