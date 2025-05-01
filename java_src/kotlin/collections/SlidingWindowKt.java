package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: SlidingWindow.kt */
/* loaded from: classes.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i4, int i5) {
        String str;
        if (i4 > 0 && i5 > 0) {
            return;
        }
        if (i4 != i5) {
            str = "Both size " + i4 + " and step " + i5 + " must be greater than zero.";
        } else {
            str = "size " + i4 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int i4, int i5, boolean z4, boolean z5) {
        Iterator<List<T>> it2;
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        if (iterator.hasNext()) {
            it2 = SequencesKt__SequenceBuilderKt.iterator(new SlidingWindowKt$windowedIterator$1(i4, i5, iterator, z5, z4, null));
            return it2;
        }
        return EmptyIterator.INSTANCE;
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i4, final int i5, final boolean z4, final boolean z5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i4, i5);
        return (Sequence<List<? extends T>>) new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(Sequence.this.iterator(), i4, i5, z4, z5);
            }
        };
    }
}
