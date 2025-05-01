package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
/* compiled from: UIntRange.kt */
@SinceKotlin(version = "1.3")
/* loaded from: classes6.dex */
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r2 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private UIntProgressionIterator(int r4, int r5, int r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.finalElement = r5
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L10
            int r2 = kotlin.a.a(r4, r5)
            if (r2 > 0) goto L17
            goto L18
        L10:
            int r2 = kotlin.a.a(r4, r5)
            if (r2 < 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r3.hasNext = r0
            int r6 = kotlin.UInt.m130constructorimpl(r6)
            r3.step = r6
            boolean r6 = r3.hasNext
            if (r6 == 0) goto L25
            goto L26
        L25:
            r4 = r5
        L26:
            r3.next = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntProgressionIterator.<init>(int, int, int):void");
    }

    public /* synthetic */ UIntProgressionIterator(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, i6);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m124boximpl(m1283nextpVg5ArA());
    }

    /* renamed from: next-pVg5ArA  reason: not valid java name */
    public int m1283nextpVg5ArA() {
        int i4 = this.next;
        if (i4 == this.finalElement) {
            if (this.hasNext) {
                this.hasNext = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.next = UInt.m130constructorimpl(this.step + i4);
        }
        return i4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
