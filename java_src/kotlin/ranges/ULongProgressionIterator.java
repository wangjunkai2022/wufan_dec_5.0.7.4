package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
/* compiled from: ULongRange.kt */
@SinceKotlin(version = "1.3")
/* loaded from: classes6.dex */
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ULongProgressionIterator(long r6, long r8, long r10) {
        /*
            r5 = this;
            r5.<init>()
            r5.finalElement = r8
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            int r2 = kotlin.d.a(r6, r8)
            if (r2 > 0) goto L1b
            goto L1c
        L14:
            int r2 = kotlin.d.a(r6, r8)
            if (r2 < 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r5.hasNext = r0
            long r10 = kotlin.ULong.m209constructorimpl(r10)
            r5.step = r10
            boolean r10 = r5.hasNext
            if (r10 == 0) goto L29
            goto L2a
        L29:
            r6 = r8
        L2a:
            r5.next = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ULongProgressionIterator.<init>(long, long, long):void");
    }

    public /* synthetic */ ULongProgressionIterator(long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m203boximpl(m1292nextsVKNKU());
    }

    /* renamed from: next-s-VKNKU  reason: not valid java name */
    public long m1292nextsVKNKU() {
        long j4 = this.next;
        if (j4 == this.finalElement) {
            if (this.hasNext) {
                this.hasNext = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.next = ULong.m209constructorimpl(this.step + j4);
        }
        return j4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
