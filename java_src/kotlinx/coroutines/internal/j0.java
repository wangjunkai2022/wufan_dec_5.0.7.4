package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ResizableAtomicArray.kt */
/* loaded from: classes6.dex */
public final class j0<T> {
    @NotNull
    private volatile AtomicReferenceArray<T> array;

    public j0(int i4) {
        this.array = new AtomicReferenceArray<>(i4);
    }

    public final int a() {
        return this.array.length();
    }

    @Nullable
    public final T b(int i4) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i4 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i4);
        }
        return null;
    }

    public final void c(int i4, @Nullable T t4) {
        int coerceAtLeast;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i4 < length) {
            atomicReferenceArray.set(i4, t4);
            return;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i4 + 1, length * 2);
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(coerceAtLeast);
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i4, t4);
        this.array = atomicReferenceArray2;
    }
}
