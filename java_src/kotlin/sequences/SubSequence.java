package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: Sequences.kt */
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes6.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int endIndex;
    @NotNull
    private final Sequence<T> sequence;
    private final int startIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = i4;
        this.endIndex = i5;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i4).toString());
        }
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i5).toString());
        }
        if (i5 >= i4) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i5 + " < " + i4).toString());
    }

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int i4) {
        return i4 >= getCount() ? SequencesKt.emptySequence() : new SubSequence(this.sequence, this.startIndex + i4, this.endIndex);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new SubSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int i4) {
        if (i4 >= getCount()) {
            return this;
        }
        Sequence<T> sequence = this.sequence;
        int i5 = this.startIndex;
        return new SubSequence(sequence, i5, i4 + i5);
    }
}
