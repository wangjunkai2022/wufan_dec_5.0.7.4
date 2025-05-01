package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* loaded from: classes.dex */
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> buildSet(@BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Set<E> build;
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        builderAction.invoke(createSetBuilder);
        build = SetsKt__SetsJVMKt.build(createSetBuilder);
        return build;
    }

    @NotNull
    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> set) {
        Set<T> emptySet;
        Set<T> of;
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size == 0) {
            emptySet = emptySet();
            return emptySet;
        } else if (size != 1) {
            return set;
        } else {
            of = SetsKt__SetsJVMKt.setOf(set.iterator().next());
            return of;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        Set<T> emptySet;
        if (set == 0) {
            emptySet = emptySet();
            return emptySet;
        }
        return set;
    }

    @NotNull
    public static final <T> Set<T> setOf(@NotNull T... elements) {
        Set<T> emptySet;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            return ArraysKt___ArraysKt.toSet(elements);
        }
        emptySet = emptySet();
        return emptySet;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@Nullable T t4) {
        Set<T> emptySet;
        Set<T> of;
        if (t4 != null) {
            of = SetsKt__SetsJVMKt.setOf(t4);
            return of;
        }
        emptySet = emptySet();
        return emptySet;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> buildSet(int i4, @BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Set createSetBuilder;
        Set<E> build;
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(i4);
        builderAction.invoke(createSetBuilder);
        build = SetsKt__SetsJVMKt.build(createSetBuilder);
        return build;
    }

    @NotNull
    public static final <T> HashSet<T> hashSetOf(@NotNull T... elements) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(elements, "elements");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(elements.length);
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(mapCapacity));
    }

    @NotNull
    public static final <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(elements, "elements");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(elements.length);
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final <T> Set<T> mutableSetOf(@NotNull T... elements) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(elements, "elements");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(elements.length);
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(mapCapacity));
    }

    @InlineOnly
    private static final <T> Set<T> setOf() {
        Set<T> emptySet;
        emptySet = emptySet();
        return emptySet;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
