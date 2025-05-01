package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes6.dex */
public final class CharProgressionIterator extends CharIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public CharProgressionIterator(char c5, char c6, int i4) {
        this.step = i4;
        this.finalElement = c6;
        boolean z4 = true;
        if (i4 <= 0 ? Intrinsics.compare((int) c5, (int) c6) < 0 : Intrinsics.compare((int) c5, (int) c6) > 0) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? c5 : c6;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
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
        return (char) i4;
    }
}
