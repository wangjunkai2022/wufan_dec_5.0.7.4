package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;
/* loaded from: classes6.dex */
public abstract class BasicQueueDisposable<T> implements QueueDisposable<T> {
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t4) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t4, T t5) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
