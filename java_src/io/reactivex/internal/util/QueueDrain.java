package io.reactivex.internal.util;

import org.reactivestreams.Subscriber;
/* loaded from: classes6.dex */
public interface QueueDrain<T, U> {
    boolean accept(Subscriber<? super U> subscriber, T t4);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i4);

    long produced(long j4);

    long requested();
}
