package kotlin.text;

import j1.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
@SourceDebugExtension({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n361#3,7:2550\n361#3,7:2563\n361#3,7:2573\n361#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
/* loaded from: classes.dex */
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static final boolean all(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull CharSequence charSequence) {
        List emptyList;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
        }
        return new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence charSequence) {
        Sequence<Character> emptySequence;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                emptySequence = SequencesKt__SequencesKt.emptySequence();
                return emptySequence;
            }
        }
        return new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(charSequence.length());
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(charSequence.length());
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        int coerceAtMost;
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<String> chunked(@NotNull CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i4, i4, true);
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i4, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$chunkedSequence$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull CharSequence it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.toString();
            }
        });
    }

    @InlineOnly
    private static final int count(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence charSequence, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 >= 0) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, charSequence.length());
            return charSequence.subSequence(coerceAtMost, charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence charSequence, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(charSequence.length() - i4, 0);
            return take(charSequence, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final char elementAtOrElse(CharSequence charSequence, int i4, Function1<? super Integer, Character> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (i4 <= lastIndex) {
                return charSequence.charAt(i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).charValue();
    }

    @InlineOnly
    private static final Character elementAtOrNull(CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i4);
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            char charAt = charSequence.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            char charAt = charSequence.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char charAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final char first(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOf(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R r4;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i4 = 0;
        while (true) {
            if (i4 >= charSequence.length()) {
                r4 = null;
                break;
            }
            r4 = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            if (r4 != null) {
                break;
            }
            i4++;
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Character.valueOf(charSequence.charAt(i4))));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull CharSequence charSequence, R r4, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i4)));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull CharSequence charSequence, R r4, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Character.valueOf(charSequence.charAt(i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <R> R foldRight(@NotNull CharSequence charSequence, R r4, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull CharSequence charSequence, R r4, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r4);
        }
        return r4;
    }

    public static final void forEach(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            action.invoke(Character.valueOf(charSequence.charAt(i4)));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            action.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            i4++;
            i5++;
        }
    }

    @InlineOnly
    private static final char getOrElse(CharSequence charSequence, int i4, Function1<? super Integer, Character> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (i4 <= lastIndex) {
                return charSequence.charAt(i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).charValue();
    }

    @Nullable
    public static final Character getOrNull(@NotNull CharSequence charSequence, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 >= 0) {
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (i4 <= lastIndex) {
                return Character.valueOf(charSequence.charAt(i4));
            }
        }
        return null;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence charSequence, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt$groupingBy$1
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
                return keyOf(ch.charValue());
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }

            public K keyOf(char c5) {
                return keySelector.invoke(Character.valueOf(c5));
            }
        };
    }

    public static final int indexOfFirst(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    public static char last(@NotNull CharSequence charSequence) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            return charSequence.charAt(lastIndex);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @NotNull
    public static final <R> List<R> map(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            int i6 = i5 + 1;
            R invoke = transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            int i6 = i5 + 1;
            R invoke = transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            if (invoke != null) {
                destination.add(invoke);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i4)));
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i4))));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            R invoke2 = selector.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) < 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (lastIndex == 0) {
                return charAt;
            }
            R invoke = selector.invoke(Character.valueOf(charAt));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                R invoke2 = selector.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull  reason: collision with other method in class */
    private static final Double m1352maxOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence charSequence) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull CharSequence charSequence) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            R invoke2 = selector.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) > 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (lastIndex == 0) {
                return charAt;
            }
            R invoke = selector.invoke(Character.valueOf(charAt));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                R invoke2 = selector.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull  reason: collision with other method in class */
    private static final Double m1356minOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence charSequence) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull CharSequence charSequence) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char charAt2 = charSequence.charAt(it2.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char charAt2 = charSequence.charAt(it2.nextInt());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull S s4, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i4 = 0; i4 < s4.length(); i4++) {
            action.invoke(Character.valueOf(s4.charAt(i4)));
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S onEachIndexed(@NotNull S s4, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i4 = 0;
        int i5 = 0;
        while (i4 < s4.length()) {
            action.invoke(Integer.valueOf(i5), Character.valueOf(s4.charAt(i4)));
            i4++;
            i5++;
        }
        return s4;
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.Default);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final char reduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it2.nextInt()))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final char reduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                charAt = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            charAt = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it2.nextInt()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final char reduceRight(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                charAt = operation.invoke(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char reduceRightIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                charAt = operation.invoke(Integer.valueOf(i4), Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            charAt = operation.invoke(Integer.valueOf(i4), Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            charAt = operation.invoke(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final CharSequence reversed(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFold(@NotNull CharSequence charSequence, R r4, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence charSequence, R r4, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i4 = 1; i4 < length; i4++) {
            charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i4 = 1; i4 < length; i4++) {
            charAt = operation.invoke(Integer.valueOf(i4), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scan(@NotNull CharSequence charSequence, R r4, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scanIndexed(@NotNull CharSequence charSequence, R r4, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final char single(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, indices);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            i4 += selector.invoke(Character.valueOf(charSequence.charAt(i5))).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            d5 += selector.invoke(Character.valueOf(charSequence.charAt(i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            d5 += selector.invoke(Character.valueOf(charSequence.charAt(i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            i4 += selector.invoke(Character.valueOf(charSequence.charAt(i5))).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            j4 += selector.invoke(Character.valueOf(charSequence.charAt(i4))).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(CharSequence charSequence, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Character.valueOf(charSequence.charAt(i4))).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(CharSequence charSequence, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Character.valueOf(charSequence.charAt(i4))).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence charSequence, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 >= 0) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, charSequence.length());
            return charSequence.subSequence(0, coerceAtMost);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence charSequence, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 >= 0) {
            int length = charSequence.length();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, length);
            return charSequence.subSequence(length - coerceAtMost, length);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return charSequence.subSequence(0, i4);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence charSequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            destination.add(Character.valueOf(charSequence.charAt(i4)));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull CharSequence charSequence) {
        int coerceAtMost;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
        return (HashSet) toCollection(charSequence, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Character> toList(@NotNull CharSequence charSequence) {
        List<Character> emptyList;
        List<Character> listOf;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(charSequence);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(charSequence.charAt(0)));
            return listOf;
        }
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull CharSequence charSequence) {
        Set<Character> emptySet;
        Set<Character> of;
        int coerceAtMost;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(charSequence.length(), 128);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
            return (Set) toCollection(charSequence, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Character.valueOf(charSequence.charAt(0)));
            return of;
        }
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<String> windowed(@NotNull CharSequence charSequence, int i4, int i5, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i4, i5, z4, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowed$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull CharSequence it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.toString();
            }
        });
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return windowed(charSequence, i4, i5, z4);
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull CharSequence charSequence, int i4, int i5, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i4, i5, z4, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull CharSequence it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.toString();
            }
        });
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return windowedSequence(charSequence, i4, i5, z4);
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Character>>() { // from class: kotlin.text.StringsKt___StringsKt$withIndex$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Character> invoke() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        });
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(other.charAt(i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
        List<R> emptyList;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(length);
        int i4 = 0;
        while (i4 < length) {
            i4++;
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <R> List<R> chunked(@NotNull CharSequence charSequence, int i4, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i4, i4, true, transform);
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence charSequence, int i4, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i4, i4, true, transform);
    }

    public static final int count(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            char charAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    public static final boolean none(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    @InlineOnly
    private static final String reversed(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z4) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z4 = true;
            }
        }
        if (z4) {
            return ch;
        }
        return null;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <R> List<R> windowed(@NotNull CharSequence charSequence, int i4, int i5, boolean z4, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i4, i5);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i5) + (length % i5 == 0 ? 0 : 1));
        int i6 = 0;
        while (true) {
            if (!(i6 >= 0 && i6 < length)) {
                break;
            }
            int i7 = i6 + i4;
            if (i7 < 0 || i7 > length) {
                if (!z4) {
                    break;
                }
                i7 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i6, i7)));
            i6 += i5;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i4, int i5, boolean z4, Function1 function1, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return windowed(charSequence, i4, i5, z4, function1);
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final <R> Sequence<R> windowedSequence(@NotNull final CharSequence charSequence, final int i4, int i5, boolean z4, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        IntProgression step;
        Sequence asSequence;
        Sequence<R> map;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i4, i5);
        step = RangesKt___RangesKt.step(z4 ? StringsKt__StringsKt.getIndices(charSequence) : RangesKt___RangesKt.until(0, (charSequence.length() - i4) + 1), i5);
        asSequence = CollectionsKt___CollectionsKt.asSequence(step);
        map = SequencesKt___SequencesKt.map(asSequence, new Function1<Integer, R>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final R invoke(int i6) {
                int i7 = i4 + i6;
                if (i7 < 0 || i7 > charSequence.length()) {
                    i7 = charSequence.length();
                }
                return transform.invoke(charSequence.subSequence(i6, i7));
            }
        });
        return map;
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i4, int i5, boolean z4, Function1 function1, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return windowedSequence(charSequence, i4, i5, z4, function1);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @NotNull
    public static String drop(@NotNull String str, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i4 >= 0) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, str.length());
            String substring = str.substring(coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static String dropLast(@NotNull String str, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(str.length() - i4, 0);
            return take(str, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final String filterNot(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @NotNull
    public static final String slice(@NotNull String str, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    @NotNull
    public static final String take(@NotNull String str, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i4 >= 0) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, str.length());
            String substring = str.substring(0, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    @NotNull
    public static final String dropWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i4))).booleanValue()) {
                String substring = str.substring(i4);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @NotNull
    public static final String filterIndexed(@NotNull String str, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    public static final char first(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final String takeLast(@NotNull String str, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, length);
            String substring = str.substring(length - coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(other.charAt(i4))));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(charSequence.length());
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String filter(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final char single(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (!z4) {
                    ch = Character.valueOf(charAt);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(collectionSizeOrDefault);
        for (Integer num : indices) {
            sb.append(charSequence.charAt(num.intValue()));
        }
        return sb;
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    @NotNull
    public static final String takeWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i4))).booleanValue()) {
                String substring = str.substring(0, i4);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    @SinceKotlin(version = b.f69563b)
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence charSequence) {
        List<Pair<Character, Character>> emptyList;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(length);
        int i4 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            i4++;
            arrayList.add(TuplesKt.to(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf  reason: collision with other method in class */
    private static final float m1350maxOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull  reason: collision with other method in class */
    private static final Float m1353maxOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf  reason: collision with other method in class */
    private static final float m1354minOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull  reason: collision with other method in class */
    private static final Float m1357minOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @NotNull
    public static final Pair<String, String> partition(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "first.toString()");
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "second.toString()");
        return new Pair<>(sb3, sb4);
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final String slice(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return slice((CharSequence) str, indices).toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf  reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1351maxOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf  reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1355minOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(charSequence.length() == 0)) {
            R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
            lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it2.nextInt())));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }
}
