package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Collections.kt */
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n394#1:473\n1#2:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n388#1:473\n*E\n"})
/* loaded from: classes.dex */
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> List(int i4, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(init.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> MutableList(int i4, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(init.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    @NotNull
    public static final <T> Collection<T> asCollection(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayAsCollection(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> list, @Nullable T t4, int i4, int i5) {
        int compareValues;
        Intrinsics.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(list.get(i7), t4);
            if (compareValues < 0) {
                i4 = i7 + 1;
            } else if (compareValues <= 0) {
                return i7;
            } else {
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return binarySearch(list, comparable, i4, i5);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> list, @Nullable K k4, int i4, int i5, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i4, i5, new CollectionsKt__CollectionsKt$binarySearchBy$1(selector, k4));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i4, int i5, Function1 function1, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return binarySearch(list, i4, i5, new CollectionsKt__CollectionsKt$binarySearchBy$1(function1, comparable));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> List<E> buildList(@BuilderInference Function1<? super List<E>, Unit> builderAction) {
        List createListBuilder;
        List<E> build;
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        builderAction.invoke(createListBuilder);
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        return build;
    }

    @InlineOnly
    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.containsAll(elements);
    }

    @NotNull
    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static IntRange getIndices(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Collection collection, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @NotNull
    public static <T> List<T> listOf(@NotNull T... elements) {
        List<T> emptyList;
        List<T> asList;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            asList = ArraysKt___ArraysJvmKt.asList(elements);
            return asList;
        }
        emptyList = emptyList();
        return emptyList;
    }

    @NotNull
    public static final <T> List<T> listOfNotNull(@Nullable T t4) {
        List<T> emptyList;
        List<T> listOf;
        if (t4 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(t4);
            return listOf;
        }
        emptyList = emptyList();
        return emptyList;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> list) {
        List<T> emptyList;
        List<T> listOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            emptyList = emptyList();
            return emptyList;
        } else if (size != 1) {
            return list;
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(list.get(0));
            return listOf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        List emptyList;
        if (collection == 0) {
            emptyList = emptyList();
            return emptyList;
        }
        return collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i4, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException("fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
        } else if (i5 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than zero.");
        } else if (i6 <= i4) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i4 + ").");
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        CollectionsKt___CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @NotNull
    public static <T> ArrayList<T> arrayListOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new ArrayAsCollection(elements, true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = list.size();
        }
        return binarySearch(list, obj, comparator, i4, i5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> List<E> buildList(int i4, @BuilderInference Function1<? super List<E>, Unit> builderAction) {
        List createListBuilder;
        List<E> build;
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(i4);
        builderAction.invoke(createListBuilder);
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        return build;
    }

    @InlineOnly
    private static final <T> List<T> listOf() {
        List<T> emptyList;
        emptyList = emptyList();
        return emptyList;
    }

    @NotNull
    public static final <T> List<T> listOfNotNull(@NotNull T... elements) {
        List<T> filterNotNull;
        Intrinsics.checkNotNullParameter(elements, "elements");
        filterNotNull = ArraysKt___ArraysKt.filterNotNull(elements);
        return filterNotNull;
    }

    @NotNull
    public static <T> List<T> mutableListOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        List<T> emptyList;
        if (list == 0) {
            emptyList = emptyList();
            return emptyList;
        }
        return list;
    }

    public static /* synthetic */ int binarySearch$default(List list, int i4, int i5, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = list.size();
        }
        return binarySearch(list, i4, i5, function1);
    }

    public static final <T> int binarySearch(@NotNull List<? extends T> list, T t4, @NotNull Comparator<? super T> comparator, int i4, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int compare = comparator.compare((T) list.get(i7), t4);
            if (compare < 0) {
                i4 = i7 + 1;
            } else if (compare <= 0) {
                return i7;
            } else {
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final <T> int binarySearch(@NotNull List<? extends T> list, int i4, int i5, @NotNull Function1<? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int intValue = comparison.invoke((T) list.get(i7)).intValue();
            if (intValue < 0) {
                i4 = i7 + 1;
            } else if (intValue <= 0) {
                return i7;
            } else {
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }
}
