package kotlin.sequences;

import org.jetbrains.annotations.NotNull;
/* compiled from: Sequences.kt */
/* loaded from: classes6.dex */
public interface DropTakeSequence<T> extends Sequence<T> {
    @NotNull
    Sequence<T> drop(int i4);

    @NotNull
    Sequence<T> take(int i4);
}
