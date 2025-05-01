package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Arrays.kt */
@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes.dex */
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        boolean m615contentEqualslec5QzE;
        boolean m611contentEqualsKJPZfPQ;
        boolean m610contentEqualsFGO6Aew;
        boolean m613contentEqualskV0jMPg;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            T t4 = tArr[i4];
            T t5 = tArr2[i4];
            if (t4 != t5) {
                if (t4 == null || t5 == null) {
                    return false;
                }
                if ((t4 instanceof Object[]) && (t5 instanceof Object[])) {
                    if (!contentDeepEquals((Object[]) t4, (Object[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof byte[]) && (t5 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t4, (byte[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof short[]) && (t5 instanceof short[])) {
                    if (!Arrays.equals((short[]) t4, (short[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof int[]) && (t5 instanceof int[])) {
                    if (!Arrays.equals((int[]) t4, (int[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof long[]) && (t5 instanceof long[])) {
                    if (!Arrays.equals((long[]) t4, (long[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof float[]) && (t5 instanceof float[])) {
                    if (!Arrays.equals((float[]) t4, (float[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof double[]) && (t5 instanceof double[])) {
                    if (!Arrays.equals((double[]) t4, (double[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof char[]) && (t5 instanceof char[])) {
                    if (!Arrays.equals((char[]) t4, (char[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof boolean[]) && (t5 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t4, (boolean[]) t5)) {
                        return false;
                    }
                } else if ((t4 instanceof UByteArray) && (t5 instanceof UByteArray)) {
                    m613contentEqualskV0jMPg = UArraysKt___UArraysKt.m613contentEqualskV0jMPg(((UByteArray) t4).m120unboximpl(), ((UByteArray) t5).m120unboximpl());
                    if (!m613contentEqualskV0jMPg) {
                        return false;
                    }
                } else if ((t4 instanceof UShortArray) && (t5 instanceof UShortArray)) {
                    m610contentEqualsFGO6Aew = UArraysKt___UArraysKt.m610contentEqualsFGO6Aew(((UShortArray) t4).m383unboximpl(), ((UShortArray) t5).m383unboximpl());
                    if (!m610contentEqualsFGO6Aew) {
                        return false;
                    }
                } else if ((t4 instanceof UIntArray) && (t5 instanceof UIntArray)) {
                    m611contentEqualsKJPZfPQ = UArraysKt___UArraysKt.m611contentEqualsKJPZfPQ(((UIntArray) t4).m199unboximpl(), ((UIntArray) t5).m199unboximpl());
                    if (!m611contentEqualsKJPZfPQ) {
                        return false;
                    }
                } else if ((t4 instanceof ULongArray) && (t5 instanceof ULongArray)) {
                    m615contentEqualslec5QzE = UArraysKt___UArraysKt.m615contentEqualslec5QzE(((ULongArray) t4).m278unboximpl(), ((ULongArray) t5).m278unboximpl());
                    if (!m615contentEqualslec5QzE) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(t4, t5)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        int coerceAtMost;
        if (tArr == null) {
            return "null";
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(tArr.length, 429496729);
        StringBuilder sb = new StringBuilder((coerceAtMost * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        int lastIndex;
        String m633contentToStringuLth9ew;
        String m630contentToStringXUkPCBk;
        String m631contentToStringd6D3K8;
        String m627contentToString2csIQuQ;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(", ");
            }
            T t4 = tArr[i4];
            if (t4 == null) {
                sb.append("null");
            } else if (t4 instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) t4, sb, list);
            } else if (t4 instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
                sb.append(arrays);
            } else if (t4 instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (t4 instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (t4 instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (t4 instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (t4 instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (t4 instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (t4 instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t4);
                Intrinsics.checkNotNullExpressionValue(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (t4 instanceof UByteArray) {
                m627contentToString2csIQuQ = UArraysKt___UArraysKt.m627contentToString2csIQuQ(((UByteArray) t4).m120unboximpl());
                sb.append(m627contentToString2csIQuQ);
            } else if (t4 instanceof UShortArray) {
                m631contentToStringd6D3K8 = UArraysKt___UArraysKt.m631contentToStringd6D3K8(((UShortArray) t4).m383unboximpl());
                sb.append(m631contentToStringd6D3K8);
            } else if (t4 instanceof UIntArray) {
                m630contentToStringXUkPCBk = UArraysKt___UArraysKt.m630contentToStringXUkPCBk(((UIntArray) t4).m199unboximpl());
                sb.append(m630contentToStringXUkPCBk);
            } else if (t4 instanceof ULongArray) {
                m633contentToStringuLth9ew = UArraysKt___UArraysKt.m633contentToStringuLth9ew(((ULongArray) t4).m278unboximpl());
                sb.append(m633contentToStringuLth9ew);
            } else {
                sb.append(t4.toString());
            }
        }
        sb.append(']');
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        list.remove(lastIndex);
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i4 = 0;
        for (T[] tArr2 : tArr) {
            i4 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i4);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean isNullOrEmpty(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
