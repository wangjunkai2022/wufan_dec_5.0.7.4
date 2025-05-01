package kotlin.collections;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        return CollectionsKt__MutableCollectionsKt.addAll(collection, iterable);
    }

    public static /* bridge */ /* synthetic */ <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        return CollectionsKt__MutableCollectionsKt.addAll(collection, sequence);
    }

    public static /* bridge */ /* synthetic */ <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        return CollectionsKt__MutableCollectionsKt.addAll(collection, tArr);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> Sequence<T> asSequence(@NotNull Iterable<? extends T> iterable) {
        return CollectionsKt___CollectionsKt.asSequence(iterable);
    }

    public static /* bridge */ /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, comparable, i4, i5, i6, obj);
    }

    @PublishedApi
    public static /* bridge */ /* synthetic */ <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> iterable, int i4) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> Collection<T> convertToListIfNotCollection(@NotNull Iterable<? extends T> iterable) {
        return CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> List<T> emptyList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static /* bridge */ /* synthetic */ <T> T first(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T firstOrNull(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T getOrNull(@NotNull List<? extends T> list, int i4) {
        return (T) CollectionsKt___CollectionsKt.getOrNull(list, i4);
    }

    public static /* bridge */ /* synthetic */ <T> T last(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> List<T> listOf(T t4) {
        return CollectionsKt__CollectionsJVMKt.listOf(t4);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T minOrNull(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.minOrNull(iterable);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> List<T> mutableListOf(@NotNull T... tArr) {
        return CollectionsKt__CollectionsKt.mutableListOf(tArr);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* bridge */ /* synthetic */ <T> T removeLast(@NotNull List<T> list) {
        return (T) CollectionsKt__MutableCollectionsKt.removeLast(list);
    }

    public static /* bridge */ /* synthetic */ <T> T single(@NotNull Iterable<? extends T> iterable) {
        return (T) CollectionsKt___CollectionsKt.single(iterable);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T singleOrNull(@NotNull List<? extends T> list) {
        return (T) CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) list);
    }

    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> void sort(@NotNull List<T> list) {
        CollectionsKt__MutableCollectionsJVMKt.sort(list);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static /* bridge */ /* synthetic */ void throwIndexOverflow() {
        CollectionsKt__CollectionsKt.throwIndexOverflow();
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> Set<T> toSet(@NotNull Iterable<? extends T> iterable) {
        return CollectionsKt___CollectionsKt.toSet(iterable);
    }
}
