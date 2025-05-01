package kotlin.sequences;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SequencesJVM.kt */
/* loaded from: classes.dex */
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt {
    @InlineOnly
    private static final <T> Sequence<T> asSequence(Enumeration<T> enumeration) {
        Iterator it2;
        Sequence<T> asSequence;
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        it2 = CollectionsKt__IteratorsJVMKt.iterator(enumeration);
        asSequence = SequencesKt__SequencesKt.asSequence(it2);
        return asSequence;
    }
}
