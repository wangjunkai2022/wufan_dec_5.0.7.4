package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes6.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i4) {
        super(Pow2.roundToPowerOfTwo(i4));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    int calcElementOffset(long j4) {
        return this.mask & ((int) j4);
    }

    int calcElementOffset(long j4, int i4) {
        return ((int) j4) & i4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    E lvElement(int i4) {
        return get(i4);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e5) {
        Objects.requireNonNull(e5, "Null is not a valid element");
        int i4 = this.mask;
        long j4 = this.producerIndex.get();
        int calcElementOffset = calcElementOffset(j4, i4);
        if (j4 >= this.producerLookAhead) {
            long j5 = this.lookAheadStep + j4;
            if (lvElement(calcElementOffset(j5, i4)) == null) {
                this.producerLookAhead = j5;
            } else if (lvElement(calcElementOffset) != null) {
                return false;
            }
        }
        soElement(calcElementOffset, e5);
        soProducerIndex(j4 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j4 = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j4);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j4 + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    void soConsumerIndex(long j4) {
        this.consumerIndex.lazySet(j4);
    }

    void soElement(int i4, E e5) {
        lazySet(i4, e5);
    }

    void soProducerIndex(long j4) {
        this.producerIndex.lazySet(j4);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e5, E e6) {
        return offer(e5) && offer(e6);
    }
}
