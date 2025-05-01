package kotlin.streams.jdk8;

import j1.b;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
/* compiled from: Streams.kt */
@JvmName(name = "StreamsKt")
/* loaded from: classes6.dex */
public final class StreamsKt {
    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        return new Sequence<T>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                Iterator<T> it2 = stream.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator()");
                return it2;
            }
        };
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <T> Stream<T> asStream(@NotNull final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator asStream$lambda$4;
                asStream$lambda$4 = StreamsKt.asStream$lambda$4(Sequence.this);
                return asStream$lambda$4;
            }
        }, 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator asStream$lambda$4(Sequence this_asStream) {
        Intrinsics.checkNotNullParameter(this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this_asStream.iterator(), 16);
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <T> List<T> toList(@NotNull Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        return new Sequence<Integer>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Integer> iterator() {
                PrimitiveIterator.OfInt it2 = intStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator()");
                return it2;
            }
        };
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<Integer> toList(@NotNull IntStream intStream) {
        List<Integer> asList;
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        asList = ArraysKt___ArraysJvmKt.asList(array);
        return asList;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        return new Sequence<Long>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Long> iterator() {
                PrimitiveIterator.OfLong it2 = longStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator()");
                return it2;
            }
        };
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<Long> toList(@NotNull LongStream longStream) {
        List<Long> asList;
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        asList = ArraysKt___ArraysJvmKt.asList(array);
        return asList;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        return new Sequence<Double>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Double> iterator() {
                PrimitiveIterator.OfDouble it2 = doubleStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator()");
                return it2;
            }
        };
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<Double> toList(@NotNull DoubleStream doubleStream) {
        List<Double> asList;
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        asList = ArraysKt___ArraysJvmKt.asList(array);
        return asList;
    }
}
