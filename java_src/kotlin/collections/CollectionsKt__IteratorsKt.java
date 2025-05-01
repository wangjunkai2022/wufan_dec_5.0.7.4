package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterators.kt */
/* loaded from: classes.dex */
public class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    public static final <T> void forEach(@NotNull Iterator<? extends T> it2, @NotNull Function1<? super T, Unit> operation) {
        Intrinsics.checkNotNullParameter(it2, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        while (it2.hasNext()) {
            operation.invoke((T) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it2) {
        Intrinsics.checkNotNullParameter(it2, "<this>");
        return it2;
    }

    @NotNull
    public static final <T> Iterator<IndexedValue<T>> withIndex(@NotNull Iterator<? extends T> it2) {
        Intrinsics.checkNotNullParameter(it2, "<this>");
        return new IndexingIterator(it2);
    }
}
