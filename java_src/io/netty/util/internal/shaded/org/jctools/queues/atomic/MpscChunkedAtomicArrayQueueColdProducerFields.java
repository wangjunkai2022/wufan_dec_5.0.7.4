package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
/* compiled from: MpscChunkedAtomicArrayQueue.java */
/* loaded from: classes6.dex */
abstract class MpscChunkedAtomicArrayQueueColdProducerFields<E> extends BaseMpscLinkedAtomicArrayQueue<E> {
    protected final long maxQueueCapacity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MpscChunkedAtomicArrayQueueColdProducerFields(int i4, int i5) {
        super(i4);
        RangeUtil.checkGreaterThanOrEqual(i5, 4, "maxCapacity");
        RangeUtil.checkLessThan(Pow2.roundToPowerOfTwo(i4), Pow2.roundToPowerOfTwo(i5), "initialCapacity");
        this.maxQueueCapacity = Pow2.roundToPowerOfTwo(i5) << 1;
    }
}
