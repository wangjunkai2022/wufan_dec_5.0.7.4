package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes6.dex */
public final class IntProgressionIterator extends IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int i4, int i5, int i6) {
        this.step = i6;
        this.finalElement = i5;
        boolean z4 = true;
        if (i6 <= 0 ? i4 < i5 : i4 > i5) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? i4 : i5;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i4 = this.next;
        if (i4 == this.finalElement) {
            if (this.hasNext) {
                this.hasNext = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.next = this.step + i4;
        }
        return i4;
    }
}
