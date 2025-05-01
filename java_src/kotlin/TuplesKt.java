package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: Tuples.kt */
@JvmName(name = "TuplesKt")
/* loaded from: classes.dex */
public final class TuplesKt {
    @NotNull
    public static final <A, B> Pair<A, B> to(A a5, B b5) {
        return new Pair<>(a5, b5);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> pair) {
        List<T> listOf;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Object[]{pair.getFirst(), pair.getSecond()});
        return listOf;
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Triple<? extends T, ? extends T, ? extends T> triple) {
        List<T> listOf;
        Intrinsics.checkNotNullParameter(triple, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Object[]{triple.getFirst(), triple.getSecond(), triple.getThird()});
        return listOf;
    }
}
