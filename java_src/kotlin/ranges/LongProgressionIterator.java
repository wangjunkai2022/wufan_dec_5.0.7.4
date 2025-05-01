package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes6.dex */
public final class LongProgressionIterator extends LongIterator {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public LongProgressionIterator(long j4, long j5, long j6) {
        this.step = j6;
        this.finalElement = j5;
        boolean z4 = true;
        int i4 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        int i5 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        if (i4 <= 0 ? i5 < 0 : i5 > 0) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? j4 : j5;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j4 = this.next;
        if (j4 == this.finalElement) {
            if (this.hasNext) {
                this.hasNext = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.next = this.step + j4;
        }
        return j4;
    }
}
