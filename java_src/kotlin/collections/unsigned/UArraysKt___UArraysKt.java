package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.UArraySortingKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UArrays.kt */
@SourceDebugExtension({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10877:1\n3919#1:10878\n3927#1:10879\n3935#1:10880\n3943#1:10881\n3919#1:10882\n3927#1:10883\n3935#1:10884\n3943#1:10885\n3919#1:10886\n3927#1:10887\n3935#1:10888\n3943#1:10889\n3919#1:10939\n3927#1:10940\n3935#1:10941\n3943#1:10942\n3919#1:10943\n3927#1:10944\n3935#1:10945\n3943#1:10946\n3919#1:10947\n3927#1:10948\n3935#1:10949\n3943#1:10950\n3919#1:11007\n3927#1:11008\n3935#1:11009\n3943#1:11010\n3919#1:11011\n3927#1:11012\n3935#1:11013\n3943#1:11014\n3919#1:11015\n3927#1:11016\n3935#1:11017\n3943#1:11018\n3919#1:11019\n3927#1:11020\n3935#1:11021\n3943#1:11022\n3919#1:11023\n3927#1:11024\n3935#1:11025\n3943#1:11026\n3919#1:11027\n3927#1:11028\n3935#1:11029\n3943#1:11030\n3919#1:11031\n3927#1:11032\n3935#1:11033\n3943#1:11034\n3919#1:11035\n3927#1:11036\n3935#1:11037\n3943#1:11038\n3919#1:11039\n3927#1:11040\n3935#1:11041\n3943#1:11042\n3919#1:11043\n3927#1:11044\n3935#1:11045\n3943#1:11046\n3919#1:11047\n3927#1:11048\n3935#1:11049\n3943#1:11050\n3919#1:11051\n3927#1:11052\n3935#1:11053\n3943#1:11054\n3919#1:11055\n3927#1:11056\n3935#1:11057\n3943#1:11058\n3919#1:11059\n3927#1:11060\n3935#1:11061\n3943#1:11062\n3919#1:11063\n3927#1:11064\n3935#1:11065\n3943#1:11066\n3919#1:11067\n3927#1:11068\n3935#1:11069\n3943#1:11070\n3919#1:11071\n3927#1:11072\n3935#1:11073\n3943#1:11074\n3919#1:11075\n3927#1:11076\n3935#1:11077\n3943#1:11078\n3919#1:11079\n3927#1:11080\n3935#1:11081\n3943#1:11082\n3919#1:11083\n3927#1:11084\n3935#1:11085\n3943#1:11086\n3919#1:11087\n3927#1:11088\n3935#1:11089\n3943#1:11090\n3919#1:11091\n3927#1:11092\n3935#1:11093\n3943#1:11094\n3919#1:11095\n3927#1:11096\n3935#1:11097\n3943#1:11098\n3919#1:11099\n3927#1:11100\n3935#1:11101\n3943#1:11102\n3919#1:11103\n3927#1:11104\n3935#1:11105\n3943#1:11106\n3919#1:11107\n3927#1:11108\n3935#1:11109\n3943#1:11110\n3919#1:11111\n3927#1:11112\n3935#1:11113\n3943#1:11114\n3919#1:11115\n3927#1:11116\n3935#1:11117\n3943#1:11118\n3919#1:11119\n3927#1:11120\n3935#1:11121\n3943#1:11122\n3919#1:11123\n3927#1:11124\n3935#1:11125\n3943#1:11126\n3919#1:11127\n3927#1:11128\n3935#1:11129\n3943#1:11130\n3919#1:11131\n3927#1:11132\n3935#1:11133\n3943#1:11134\n3919#1:11135\n3927#1:11136\n3935#1:11137\n3943#1:11138\n3919#1:11139\n3927#1:11140\n3935#1:11141\n3943#1:11142\n3919#1:11143\n3927#1:11144\n3935#1:11145\n3943#1:11146\n3919#1:11147\n3927#1:11148\n3935#1:11149\n3943#1:11150\n3919#1:11151\n3927#1:11152\n3935#1:11153\n3943#1:11154\n3919#1:11155\n3927#1:11156\n3935#1:11157\n3943#1:11158\n1663#2,6:10890\n1675#2,6:10896\n1639#2,6:10902\n1651#2,6:10908\n1771#2,6:10914\n1783#2,6:10920\n1747#2,6:10926\n1759#2,6:10932\n1#3:10938\n361#4,7:10951\n361#4,7:10958\n361#4,7:10965\n361#4,7:10972\n361#4,7:10979\n361#4,7:10986\n361#4,7:10993\n361#4,7:11000\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10878\n338#1:10879\n350#1:10880\n362#1:10881\n692#1:10882\n702#1:10883\n712#1:10884\n722#1:10885\n733#1:10886\n744#1:10887\n755#1:10888\n766#1:10889\n1718#1:10939\n1735#1:10940\n1752#1:10941\n1769#1:10942\n2546#1:10943\n2563#1:10944\n2580#1:10945\n2597#1:10946\n2913#1:10947\n2929#1:10948\n2945#1:10949\n2961#1:10950\n5717#1:11007\n5737#1:11008\n5757#1:11009\n5777#1:11010\n5798#1:11011\n5820#1:11012\n5842#1:11013\n5864#1:11014\n5977#1:11015\n5996#1:11016\n6015#1:11017\n6034#1:11018\n6056#1:11019\n6085#1:11020\n6114#1:11021\n6143#1:11022\n6168#1:11023\n6193#1:11024\n6218#1:11025\n6243#1:11026\n6273#1:11027\n6296#1:11028\n6319#1:11029\n6342#1:11030\n6365#1:11031\n6388#1:11032\n6411#1:11033\n6434#1:11034\n6455#1:11035\n6478#1:11036\n6501#1:11037\n6524#1:11038\n6547#1:11039\n6568#1:11040\n6589#1:11041\n6610#1:11042\n6631#1:11043\n6652#1:11044\n6673#1:11045\n6694#1:11046\n6713#1:11047\n6734#1:11048\n6755#1:11049\n6776#1:11050\n6799#1:11051\n6822#1:11052\n6845#1:11053\n6868#1:11054\n6889#1:11055\n6910#1:11056\n6931#1:11057\n6952#1:11058\n6969#1:11059\n6984#1:11060\n6999#1:11061\n7014#1:11062\n7033#1:11063\n7052#1:11064\n7071#1:11065\n7090#1:11066\n7105#1:11067\n7120#1:11068\n7135#1:11069\n7150#1:11070\n7169#1:11071\n7188#1:11072\n7207#1:11073\n7226#1:11074\n7248#1:11075\n7277#1:11076\n7306#1:11077\n7335#1:11078\n7360#1:11079\n7385#1:11080\n7410#1:11081\n7435#1:11082\n7465#1:11083\n7488#1:11084\n7511#1:11085\n7534#1:11086\n7557#1:11087\n7580#1:11088\n7603#1:11089\n7626#1:11090\n7647#1:11091\n7670#1:11092\n7693#1:11093\n7716#1:11094\n7739#1:11095\n7760#1:11096\n7781#1:11097\n7802#1:11098\n7823#1:11099\n7844#1:11100\n7865#1:11101\n7886#1:11102\n7905#1:11103\n7926#1:11104\n7947#1:11105\n7968#1:11106\n7991#1:11107\n8014#1:11108\n8037#1:11109\n8060#1:11110\n8081#1:11111\n8102#1:11112\n8123#1:11113\n8144#1:11114\n8161#1:11115\n8176#1:11116\n8191#1:11117\n8206#1:11118\n8225#1:11119\n8244#1:11120\n8263#1:11121\n8282#1:11122\n8297#1:11123\n8312#1:11124\n8327#1:11125\n8342#1:11126\n8560#1:11127\n8585#1:11128\n8610#1:11129\n8635#1:11130\n8660#1:11131\n8685#1:11132\n8710#1:11133\n8735#1:11134\n8759#1:11135\n8783#1:11136\n8807#1:11137\n8831#1:11138\n8856#1:11139\n8881#1:11140\n8906#1:11141\n8931#1:11142\n8953#1:11143\n8978#1:11144\n9003#1:11145\n9028#1:11146\n9053#1:11147\n9079#1:11148\n9105#1:11149\n9131#1:11150\n9156#1:11151\n9181#1:11152\n9206#1:11153\n9231#1:11154\n9257#1:11155\n9282#1:11156\n9307#1:11157\n9332#1:11158\n816#1:10890,6\n826#1:10896,6\n836#1:10902,6\n846#1:10908,6\n856#1:10914,6\n866#1:10920,6\n876#1:10926,6\n886#1:10932,6\n4935#1:10951,7\n4955#1:10958,7\n4975#1:10965,7\n4995#1:10972,7\n5016#1:10979,7\n5037#1:10986,7\n5058#1:10993,7\n5079#1:11000,7\n*E\n"})
/* loaded from: classes.dex */
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-JOV_ifY  reason: not valid java name */
    private static final boolean m566allJOV_ifY(byte[] all, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(all);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            if (!predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-MShoTSo  reason: not valid java name */
    private static final boolean m567allMShoTSo(long[] all, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(all);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            if (!predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-jgv0xPQ  reason: not valid java name */
    private static final boolean m568alljgv0xPQ(int[] all, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(all);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            if (!predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-xTcfx_M  reason: not valid java name */
    private static final boolean m569allxTcfx_M(short[] all, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(all);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            if (!predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(all, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any--ajY-9A  reason: not valid java name */
    private static final boolean m570anyajY9A(int[] any) {
        boolean any2;
        Intrinsics.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-GBYM_sE  reason: not valid java name */
    private static final boolean m571anyGBYM_sE(byte[] any) {
        boolean any2;
        Intrinsics.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-JOV_ifY  reason: not valid java name */
    private static final boolean m572anyJOV_ifY(byte[] any, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(any);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            if (predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-MShoTSo  reason: not valid java name */
    private static final boolean m573anyMShoTSo(long[] any, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(any);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            if (predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-QwZRm1k  reason: not valid java name */
    private static final boolean m574anyQwZRm1k(long[] any) {
        boolean any2;
        Intrinsics.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-jgv0xPQ  reason: not valid java name */
    private static final boolean m575anyjgv0xPQ(int[] any, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(any);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            if (predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-rL5Bavg  reason: not valid java name */
    private static final boolean m576anyrL5Bavg(short[] any) {
        boolean any2;
        Intrinsics.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-xTcfx_M  reason: not valid java name */
    private static final boolean m577anyxTcfx_M(short[] any, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(any);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            if (predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(any, i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asByteArray-GBYM_sE  reason: not valid java name */
    private static final byte[] m578asByteArrayGBYM_sE(byte[] asByteArray) {
        Intrinsics.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asIntArray--ajY-9A  reason: not valid java name */
    private static final int[] m579asIntArrayajY9A(int[] asIntArray) {
        Intrinsics.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asLongArray-QwZRm1k  reason: not valid java name */
    private static final long[] m580asLongArrayQwZRm1k(long[] asLongArray) {
        Intrinsics.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asShortArray-rL5Bavg  reason: not valid java name */
    private static final short[] m581asShortArrayrL5Bavg(short[] asShortArray) {
        Intrinsics.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] asUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UByteArray.m106constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] asUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return UIntArray.m185constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] asULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ULongArray.m264constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] asUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return UShortArray.m369constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-JOV_ifY  reason: not valid java name */
    private static final <V> Map<UByte, V> m582associateWithJOV_ifY(byte[] associateWith, Function1<? super UByte, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(UByteArray.m112getSizeimpl(associateWith));
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(associateWith);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(associateWith, i4);
            linkedHashMap.put(UByte.m47boximpl(m111getw2LRezQ), valueSelector.invoke(UByte.m47boximpl(m111getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-MShoTSo  reason: not valid java name */
    private static final <V> Map<ULong, V> m583associateWithMShoTSo(long[] associateWith, Function1<? super ULong, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(ULongArray.m270getSizeimpl(associateWith));
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(associateWith);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(associateWith, i4);
            linkedHashMap.put(ULong.m203boximpl(m269getsVKNKU), valueSelector.invoke(ULong.m203boximpl(m269getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-jgv0xPQ  reason: not valid java name */
    private static final <V> Map<UInt, V> m584associateWithjgv0xPQ(int[] associateWith, Function1<? super UInt, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(UIntArray.m191getSizeimpl(associateWith));
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(associateWith);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(associateWith, i4);
            linkedHashMap.put(UInt.m124boximpl(m190getpVg5ArA), valueSelector.invoke(UInt.m124boximpl(m190getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-xTcfx_M  reason: not valid java name */
    private static final <V> Map<UShort, V> m585associateWithxTcfx_M(short[] associateWith, Function1<? super UShort, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(UShortArray.m375getSizeimpl(associateWith));
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(associateWith);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(associateWith, i4);
            linkedHashMap.put(UShort.m310boximpl(m374getMh2AYeg), valueSelector.invoke(UShort.m310boximpl(m374getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-4D70W2E  reason: not valid java name */
    private static final <V, M extends Map<? super UInt, ? super V>> M m586associateWithTo4D70W2E(int[] associateWithTo, M destination, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(associateWithTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(associateWithTo, i4);
            destination.put(UInt.m124boximpl(m190getpVg5ArA), valueSelector.invoke(UInt.m124boximpl(m190getpVg5ArA)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-H21X9dk  reason: not valid java name */
    private static final <V, M extends Map<? super UByte, ? super V>> M m587associateWithToH21X9dk(byte[] associateWithTo, M destination, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(associateWithTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(associateWithTo, i4);
            destination.put(UByte.m47boximpl(m111getw2LRezQ), valueSelector.invoke(UByte.m47boximpl(m111getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-X6OPwNk  reason: not valid java name */
    private static final <V, M extends Map<? super ULong, ? super V>> M m588associateWithToX6OPwNk(long[] associateWithTo, M destination, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(associateWithTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(associateWithTo, i4);
            destination.put(ULong.m203boximpl(m269getsVKNKU), valueSelector.invoke(ULong.m203boximpl(m269getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-ciTST-8  reason: not valid java name */
    private static final <V, M extends Map<? super UShort, ? super V>> M m589associateWithTociTST8(short[] associateWithTo, M destination, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(associateWithTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(associateWithTo, i4);
            destination.put(UShort.m310boximpl(m374getMh2AYeg), valueSelector.invoke(UShort.m310boximpl(m374getMh2AYeg)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1--ajY-9A  reason: not valid java name */
    private static final int m590component1ajY9A(int[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UIntArray.m190getpVg5ArA(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-GBYM_sE  reason: not valid java name */
    private static final byte m591component1GBYM_sE(byte[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UByteArray.m111getw2LRezQ(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-QwZRm1k  reason: not valid java name */
    private static final long m592component1QwZRm1k(long[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return ULongArray.m269getsVKNKU(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-rL5Bavg  reason: not valid java name */
    private static final short m593component1rL5Bavg(short[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UShortArray.m374getMh2AYeg(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2--ajY-9A  reason: not valid java name */
    private static final int m594component2ajY9A(int[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UIntArray.m190getpVg5ArA(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-GBYM_sE  reason: not valid java name */
    private static final byte m595component2GBYM_sE(byte[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UByteArray.m111getw2LRezQ(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-QwZRm1k  reason: not valid java name */
    private static final long m596component2QwZRm1k(long[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return ULongArray.m269getsVKNKU(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-rL5Bavg  reason: not valid java name */
    private static final short m597component2rL5Bavg(short[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UShortArray.m374getMh2AYeg(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3--ajY-9A  reason: not valid java name */
    private static final int m598component3ajY9A(int[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UIntArray.m190getpVg5ArA(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-GBYM_sE  reason: not valid java name */
    private static final byte m599component3GBYM_sE(byte[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UByteArray.m111getw2LRezQ(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-QwZRm1k  reason: not valid java name */
    private static final long m600component3QwZRm1k(long[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return ULongArray.m269getsVKNKU(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-rL5Bavg  reason: not valid java name */
    private static final short m601component3rL5Bavg(short[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UShortArray.m374getMh2AYeg(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4--ajY-9A  reason: not valid java name */
    private static final int m602component4ajY9A(int[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UIntArray.m190getpVg5ArA(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-GBYM_sE  reason: not valid java name */
    private static final byte m603component4GBYM_sE(byte[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UByteArray.m111getw2LRezQ(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-QwZRm1k  reason: not valid java name */
    private static final long m604component4QwZRm1k(long[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return ULongArray.m269getsVKNKU(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-rL5Bavg  reason: not valid java name */
    private static final short m605component4rL5Bavg(short[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UShortArray.m374getMh2AYeg(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5--ajY-9A  reason: not valid java name */
    private static final int m606component5ajY9A(int[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UIntArray.m190getpVg5ArA(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-GBYM_sE  reason: not valid java name */
    private static final byte m607component5GBYM_sE(byte[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UByteArray.m111getw2LRezQ(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-QwZRm1k  reason: not valid java name */
    private static final long m608component5QwZRm1k(long[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return ULongArray.m269getsVKNKU(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-rL5Bavg  reason: not valid java name */
    private static final short m609component5rL5Bavg(short[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UShortArray.m374getMh2AYeg(component5, 4);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-FGO6Aew  reason: not valid java name */
    public static boolean m610contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-KJPZfPQ  reason: not valid java name */
    public static boolean m611contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-ctEhBpI  reason: not valid java name */
    public static final /* synthetic */ boolean m612contentEqualsctEhBpI(int[] contentEquals, int[] other) {
        boolean m611contentEqualsKJPZfPQ;
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        m611contentEqualsKJPZfPQ = m611contentEqualsKJPZfPQ(contentEquals, other);
        return m611contentEqualsKJPZfPQ;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-kV0jMPg  reason: not valid java name */
    public static boolean m613contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-kdPth3s  reason: not valid java name */
    public static final /* synthetic */ boolean m614contentEqualskdPth3s(byte[] contentEquals, byte[] other) {
        boolean m613contentEqualskV0jMPg;
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        m613contentEqualskV0jMPg = m613contentEqualskV0jMPg(contentEquals, other);
        return m613contentEqualskV0jMPg;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-lec5QzE  reason: not valid java name */
    public static boolean m615contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-mazbYpA  reason: not valid java name */
    public static final /* synthetic */ boolean m616contentEqualsmazbYpA(short[] contentEquals, short[] other) {
        boolean m610contentEqualsFGO6Aew;
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        m610contentEqualsFGO6Aew = m610contentEqualsFGO6Aew(contentEquals, other);
        return m610contentEqualsFGO6Aew;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-us8wMrg  reason: not valid java name */
    public static final /* synthetic */ boolean m617contentEqualsus8wMrg(long[] contentEquals, long[] other) {
        boolean m615contentEqualslec5QzE;
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        m615contentEqualslec5QzE = m615contentEqualslec5QzE(contentEquals, other);
        return m615contentEqualslec5QzE;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode--ajY-9A  reason: not valid java name */
    public static final /* synthetic */ int m618contentHashCodeajY9A(int[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m622contentHashCodeXUkPCBk(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-2csIQuQ  reason: not valid java name */
    public static final int m619contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-GBYM_sE  reason: not valid java name */
    public static final /* synthetic */ int m620contentHashCodeGBYM_sE(byte[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m619contentHashCode2csIQuQ(contentHashCode);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-QwZRm1k  reason: not valid java name */
    public static final /* synthetic */ int m621contentHashCodeQwZRm1k(long[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m625contentHashCodeuLth9ew(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-XUkPCBk  reason: not valid java name */
    public static final int m622contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-d-6D3K8  reason: not valid java name */
    public static final int m623contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-rL5Bavg  reason: not valid java name */
    public static final /* synthetic */ int m624contentHashCoderL5Bavg(short[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m623contentHashCoded6D3K8(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-uLth9ew  reason: not valid java name */
    public static final int m625contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString--ajY-9A  reason: not valid java name */
    public static final /* synthetic */ String m626contentToStringajY9A(int[] contentToString) {
        String m630contentToStringXUkPCBk;
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        m630contentToStringXUkPCBk = m630contentToStringXUkPCBk(contentToString);
        return m630contentToStringXUkPCBk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UByteArray.m104boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* renamed from: contentToString-2csIQuQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m627contentToString2csIQuQ(@org.jetbrains.annotations.Nullable byte[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.UByteArray r0 = kotlin.UByteArray.m104boximpl(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m627contentToString2csIQuQ(byte[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-GBYM_sE  reason: not valid java name */
    public static final /* synthetic */ String m628contentToStringGBYM_sE(byte[] contentToString) {
        String m627contentToString2csIQuQ;
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        m627contentToString2csIQuQ = m627contentToString2csIQuQ(contentToString);
        return m627contentToString2csIQuQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-QwZRm1k  reason: not valid java name */
    public static final /* synthetic */ String m629contentToStringQwZRm1k(long[] contentToString) {
        String m633contentToStringuLth9ew;
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        m633contentToStringuLth9ew = m633contentToStringuLth9ew(contentToString);
        return m633contentToStringuLth9ew;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UIntArray.m183boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* renamed from: contentToString-XUkPCBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m630contentToStringXUkPCBk(@org.jetbrains.annotations.Nullable int[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.UIntArray r0 = kotlin.UIntArray.m183boximpl(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m630contentToStringXUkPCBk(int[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UShortArray.m367boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* renamed from: contentToString-d-6D3K8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m631contentToStringd6D3K8(@org.jetbrains.annotations.Nullable short[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.UShortArray r0 = kotlin.UShortArray.m367boximpl(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m631contentToStringd6D3K8(short[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-rL5Bavg  reason: not valid java name */
    public static final /* synthetic */ String m632contentToStringrL5Bavg(short[] contentToString) {
        String m631contentToStringd6D3K8;
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        m631contentToStringd6D3K8 = m631contentToStringd6D3K8(contentToString);
        return m631contentToStringd6D3K8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.ULongArray.m262boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* renamed from: contentToString-uLth9ew  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m633contentToStringuLth9ew(@org.jetbrains.annotations.Nullable long[] r9) {
        /*
            if (r9 == 0) goto L18
            kotlin.ULongArray r0 = kotlin.ULongArray.m262boximpl(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L1a
        L18:
            java.lang.String r9 = "null"
        L1a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m633contentToStringuLth9ew(long[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto--B0-L2c  reason: not valid java name */
    private static final long[] m634copyIntoB0L2c(long[] copyInto, long[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    /* renamed from: copyInto--B0-L2c$default  reason: not valid java name */
    static /* synthetic */ long[] m635copyIntoB0L2c$default(long[] copyInto, long[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = ULongArray.m270getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-9-ak10g  reason: not valid java name */
    private static final short[] m636copyInto9ak10g(short[] copyInto, short[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    /* renamed from: copyInto-9-ak10g$default  reason: not valid java name */
    static /* synthetic */ short[] m637copyInto9ak10g$default(short[] copyInto, short[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = UShortArray.m375getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-FUQE5sA  reason: not valid java name */
    private static final byte[] m638copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    /* renamed from: copyInto-FUQE5sA$default  reason: not valid java name */
    static /* synthetic */ byte[] m639copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = UByteArray.m112getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-sIZ3KeM  reason: not valid java name */
    private static final int[] m640copyIntosIZ3KeM(int[] copyInto, int[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    /* renamed from: copyInto-sIZ3KeM$default  reason: not valid java name */
    static /* synthetic */ int[] m641copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = UIntArray.m191getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt___ArraysJvmKt.copyInto(copyInto, destination, i4, i5, i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf--ajY-9A  reason: not valid java name */
    private static final int[] m642copyOfajY9A(int[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UIntArray.m185constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-GBYM_sE  reason: not valid java name */
    private static final byte[] m643copyOfGBYM_sE(byte[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UByteArray.m106constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-PpDY95g  reason: not valid java name */
    private static final byte[] m644copyOfPpDY95g(byte[] copyOf, int i4) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UByteArray.m106constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-QwZRm1k  reason: not valid java name */
    private static final long[] m645copyOfQwZRm1k(long[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return ULongArray.m264constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-nggk6HY  reason: not valid java name */
    private static final short[] m646copyOfnggk6HY(short[] copyOf, int i4) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UShortArray.m369constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-qFRl0hI  reason: not valid java name */
    private static final int[] m647copyOfqFRl0hI(int[] copyOf, int i4) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UIntArray.m185constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-r7IrZao  reason: not valid java name */
    private static final long[] m648copyOfr7IrZao(long[] copyOf, int i4) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return ULongArray.m264constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-rL5Bavg  reason: not valid java name */
    private static final short[] m649copyOfrL5Bavg(short[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UShortArray.m369constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange--nroSd4  reason: not valid java name */
    private static final long[] m650copyOfRangenroSd4(long[] copyOfRange, int i4, int i5) {
        long[] copyOfRange2;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i4, i5);
        return ULongArray.m264constructorimpl(copyOfRange2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-4UcCI2c  reason: not valid java name */
    private static final byte[] m651copyOfRange4UcCI2c(byte[] copyOfRange, int i4, int i5) {
        byte[] copyOfRange2;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i4, i5);
        return UByteArray.m106constructorimpl(copyOfRange2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-Aa5vz7o  reason: not valid java name */
    private static final short[] m652copyOfRangeAa5vz7o(short[] copyOfRange, int i4, int i5) {
        short[] copyOfRange2;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i4, i5);
        return UShortArray.m369constructorimpl(copyOfRange2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-oBK06Vg  reason: not valid java name */
    private static final int[] m653copyOfRangeoBK06Vg(int[] copyOfRange, int i4, int i5) {
        int[] copyOfRange2;
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(copyOfRange, i4, i5);
        return UIntArray.m185constructorimpl(copyOfRange2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-JOV_ifY  reason: not valid java name */
    private static final int m654countJOV_ifY(byte[] count, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(count);
        int i4 = 0;
        for (int i5 = 0; i5 < m112getSizeimpl; i5++) {
            if (predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-MShoTSo  reason: not valid java name */
    private static final int m655countMShoTSo(long[] count, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(count);
        int i4 = 0;
        for (int i5 = 0; i5 < m270getSizeimpl; i5++) {
            if (predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-jgv0xPQ  reason: not valid java name */
    private static final int m656countjgv0xPQ(int[] count, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(count);
        int i4 = 0;
        for (int i5 = 0; i5 < m191getSizeimpl; i5++) {
            if (predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-xTcfx_M  reason: not valid java name */
    private static final int m657countxTcfx_M(short[] count, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(count);
        int i4 = 0;
        for (int i5 = 0; i5 < m375getSizeimpl; i5++) {
            if (predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(count, i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-PpDY95g  reason: not valid java name */
    public static final List<UByte> m658dropPpDY95g(@NotNull byte[] drop, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UByteArray.m112getSizeimpl(drop) - i4, 0);
            return m1186takeLastPpDY95g(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-nggk6HY  reason: not valid java name */
    public static final List<UShort> m659dropnggk6HY(@NotNull short[] drop, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UShortArray.m375getSizeimpl(drop) - i4, 0);
            return m1187takeLastnggk6HY(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m660dropqFRl0hI(@NotNull int[] drop, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UIntArray.m191getSizeimpl(drop) - i4, 0);
            return m1188takeLastqFRl0hI(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: drop-r7IrZao  reason: not valid java name */
    public static final List<ULong> m661dropr7IrZao(@NotNull long[] drop, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(ULongArray.m270getSizeimpl(drop) - i4, 0);
            return m1189takeLastr7IrZao(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-PpDY95g  reason: not valid java name */
    public static final List<UByte> m662dropLastPpDY95g(@NotNull byte[] dropLast, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UByteArray.m112getSizeimpl(dropLast) - i4, 0);
            return m1182takePpDY95g(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-nggk6HY  reason: not valid java name */
    public static final List<UShort> m663dropLastnggk6HY(@NotNull short[] dropLast, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UShortArray.m375getSizeimpl(dropLast) - i4, 0);
            return m1183takenggk6HY(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m664dropLastqFRl0hI(@NotNull int[] dropLast, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(UIntArray.m191getSizeimpl(dropLast) - i4, 0);
            return m1184takeqFRl0hI(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: dropLast-r7IrZao  reason: not valid java name */
    public static final List<ULong> m665dropLastr7IrZao(@NotNull long[] dropLast, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(ULongArray.m270getSizeimpl(dropLast) - i4, 0);
            return m1185taker7IrZao(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m666dropLastWhileJOV_ifY(byte[] dropLastWhile, Function1<? super UByte, Boolean> predicate) {
        int lastIndex;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(dropLastWhile, lastIndex))).booleanValue()) {
                return m1182takePpDY95g(dropLastWhile, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-MShoTSo  reason: not valid java name */
    private static final List<ULong> m667dropLastWhileMShoTSo(long[] dropLastWhile, Function1<? super ULong, Boolean> predicate) {
        int lastIndex;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(dropLastWhile, lastIndex))).booleanValue()) {
                return m1185taker7IrZao(dropLastWhile, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m668dropLastWhilejgv0xPQ(int[] dropLastWhile, Function1<? super UInt, Boolean> predicate) {
        int lastIndex;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(dropLastWhile, lastIndex))).booleanValue()) {
                return m1184takeqFRl0hI(dropLastWhile, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m669dropLastWhilexTcfx_M(short[] dropLastWhile, Function1<? super UShort, Boolean> predicate) {
        int lastIndex;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(dropLastWhile, lastIndex))).booleanValue()) {
                return m1183takenggk6HY(dropLastWhile, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m670dropWhileJOV_ifY(byte[] dropWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(dropWhile, i4);
            if (z4) {
                arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
            } else if (!predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-MShoTSo  reason: not valid java name */
    private static final List<ULong> m671dropWhileMShoTSo(long[] dropWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(dropWhile, i4);
            if (z4) {
                arrayList.add(ULong.m203boximpl(m269getsVKNKU));
            } else if (!predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m203boximpl(m269getsVKNKU));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m672dropWhilejgv0xPQ(int[] dropWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(dropWhile, i4);
            if (z4) {
                arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
            } else if (!predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m673dropWhilexTcfx_M(short[] dropWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(dropWhile, i4);
            if (z4) {
                arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
            } else if (!predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-CVVdw08  reason: not valid java name */
    private static final short m674elementAtOrElseCVVdw08(short[] elementAtOrElse, int i4, Function1<? super Integer, UShort> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(elementAtOrElse);
            if (i4 <= lastIndex) {
                return UShortArray.m374getMh2AYeg(elementAtOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m366unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-QxvSvLU  reason: not valid java name */
    private static final int m675elementAtOrElseQxvSvLU(int[] elementAtOrElse, int i4, Function1<? super Integer, UInt> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(elementAtOrElse);
            if (i4 <= lastIndex) {
                return UIntArray.m190getpVg5ArA(elementAtOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m182unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-Xw8i6dc  reason: not valid java name */
    private static final long m676elementAtOrElseXw8i6dc(long[] elementAtOrElse, int i4, Function1<? super Integer, ULong> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(elementAtOrElse);
            if (i4 <= lastIndex) {
                return ULongArray.m269getsVKNKU(elementAtOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m261unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-cO-VybQ  reason: not valid java name */
    private static final byte m677elementAtOrElsecOVybQ(byte[] elementAtOrElse, int i4, Function1<? super Integer, UByte> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(elementAtOrElse);
            if (i4 <= lastIndex) {
                return UByteArray.m111getw2LRezQ(elementAtOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m103unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-PpDY95g  reason: not valid java name */
    private static final UByte m678elementAtOrNullPpDY95g(byte[] elementAtOrNull, int i4) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m798getOrNullPpDY95g(elementAtOrNull, i4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-nggk6HY  reason: not valid java name */
    private static final UShort m679elementAtOrNullnggk6HY(short[] elementAtOrNull, int i4) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m799getOrNullnggk6HY(elementAtOrNull, i4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-qFRl0hI  reason: not valid java name */
    private static final UInt m680elementAtOrNullqFRl0hI(int[] elementAtOrNull, int i4) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m800getOrNullqFRl0hI(elementAtOrNull, i4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-r7IrZao  reason: not valid java name */
    private static final ULong m681elementAtOrNullr7IrZao(long[] elementAtOrNull, int i4) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m801getOrNullr7IrZao(elementAtOrNull, i4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-2fe2U9s  reason: not valid java name */
    public static final void m682fill2fe2U9s(@NotNull int[] fill, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, i4, i5, i6);
    }

    /* renamed from: fill-2fe2U9s$default  reason: not valid java name */
    public static /* synthetic */ void m683fill2fe2U9s$default(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UIntArray.m191getSizeimpl(iArr);
        }
        m682fill2fe2U9s(iArr, i4, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-EtDCXyQ  reason: not valid java name */
    public static final void m684fillEtDCXyQ(@NotNull short[] fill, short s4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, s4, i4, i5);
    }

    /* renamed from: fill-EtDCXyQ$default  reason: not valid java name */
    public static /* synthetic */ void m685fillEtDCXyQ$default(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = UShortArray.m375getSizeimpl(sArr);
        }
        m684fillEtDCXyQ(sArr, s4, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-K6DWlUc  reason: not valid java name */
    public static final void m686fillK6DWlUc(@NotNull long[] fill, long j4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, j4, i4, i5);
    }

    /* renamed from: fill-K6DWlUc$default  reason: not valid java name */
    public static /* synthetic */ void m687fillK6DWlUc$default(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = ULongArray.m270getSizeimpl(jArr);
        }
        m686fillK6DWlUc(jArr, j4, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-WpHrYlw  reason: not valid java name */
    public static final void m688fillWpHrYlw(@NotNull byte[] fill, byte b5, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt___ArraysJvmKt.fill(fill, b5, i4, i5);
    }

    /* renamed from: fill-WpHrYlw$default  reason: not valid java name */
    public static /* synthetic */ void m689fillWpHrYlw$default(byte[] bArr, byte b5, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = UByteArray.m112getSizeimpl(bArr);
        }
        m688fillWpHrYlw(bArr, b5, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m690filterJOV_ifY(byte[] filter, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filter);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filter, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-MShoTSo  reason: not valid java name */
    private static final List<ULong> m691filterMShoTSo(long[] filter, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filter);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filter, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m203boximpl(m269getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m692filterjgv0xPQ(int[] filter, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filter);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filter, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m693filterxTcfx_M(short[] filter, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filter);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filter, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-ELGow60  reason: not valid java name */
    private static final List<UByte> m694filterIndexedELGow60(byte[] filterIndexed, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-WyvcNBI  reason: not valid java name */
    private static final List<UInt> m695filterIndexedWyvcNBI(int[] filterIndexed, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-s8dVfGU  reason: not valid java name */
    private static final List<ULong> m696filterIndexeds8dVfGU(long[] filterIndexed, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m203boximpl(m269getsVKNKU));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-xzaTVY8  reason: not valid java name */
    private static final List<UShort> m697filterIndexedxzaTVY8(short[] filterIndexed, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filterIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filterIndexed, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo--6EtJGI  reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m698filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m124boximpl(m190getpVg5ArA));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-QqktQ3k  reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m699filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m310boximpl(m374getMh2AYeg));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-eNpIKz8  reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m700filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m47boximpl(m111getw2LRezQ));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-pe2Q0Dw  reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m701filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filterIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filterIndexedTo, i4);
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                destination.add(ULong.m203boximpl(m269getsVKNKU));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m702filterNotJOV_ifY(byte[] filterNot, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filterNot);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filterNot, i4);
            if (!predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-MShoTSo  reason: not valid java name */
    private static final List<ULong> m703filterNotMShoTSo(long[] filterNot, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filterNot);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filterNot, i4);
            if (!predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m203boximpl(m269getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m704filterNotjgv0xPQ(int[] filterNot, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filterNot);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filterNot, i4);
            if (!predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m705filterNotxTcfx_M(short[] filterNot, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filterNot);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filterNot, i4);
            if (!predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-HqK1JgA  reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m706filterNotToHqK1JgA(long[] filterNotTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filterNotTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filterNotTo, i4);
            if (!predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                destination.add(ULong.m203boximpl(m269getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-oEOeDjA  reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m707filterNotTooEOeDjA(short[] filterNotTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filterNotTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filterNotTo, i4);
            if (!predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m310boximpl(m374getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-wU5IKMo  reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m708filterNotTowU5IKMo(int[] filterNotTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filterNotTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filterNotTo, i4);
            if (!predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m124boximpl(m190getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-wzUQCXU  reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m709filterNotTowzUQCXU(byte[] filterNotTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filterNotTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filterNotTo, i4);
            if (!predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m47boximpl(m111getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-HqK1JgA  reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m710filterToHqK1JgA(long[] filterTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(filterTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(filterTo, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                destination.add(ULong.m203boximpl(m269getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-oEOeDjA  reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m711filterTooEOeDjA(short[] filterTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(filterTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(filterTo, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m310boximpl(m374getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-wU5IKMo  reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m712filterTowU5IKMo(int[] filterTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(filterTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(filterTo, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m124boximpl(m190getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-wzUQCXU  reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m713filterTowzUQCXU(byte[] filterTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(filterTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(filterTo, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m47boximpl(m111getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-JOV_ifY  reason: not valid java name */
    private static final UByte m714findJOV_ifY(byte[] find, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(find);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(find, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                return UByte.m47boximpl(m111getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-MShoTSo  reason: not valid java name */
    private static final ULong m715findMShoTSo(long[] find, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(find);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(find, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                return ULong.m203boximpl(m269getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-jgv0xPQ  reason: not valid java name */
    private static final UInt m716findjgv0xPQ(int[] find, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(find);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(find, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                return UInt.m124boximpl(m190getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-xTcfx_M  reason: not valid java name */
    private static final UShort m717findxTcfx_M(short[] find, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(find);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(find, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                return UShort.m310boximpl(m374getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-JOV_ifY  reason: not valid java name */
    private static final UByte m718findLastJOV_ifY(byte[] findLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(findLast) - 1;
        if (m112getSizeimpl >= 0) {
            while (true) {
                int i4 = m112getSizeimpl - 1;
                byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(findLast, m112getSizeimpl);
                if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                    return UByte.m47boximpl(m111getw2LRezQ);
                }
                if (i4 < 0) {
                    break;
                }
                m112getSizeimpl = i4;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-MShoTSo  reason: not valid java name */
    private static final ULong m719findLastMShoTSo(long[] findLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(findLast) - 1;
        if (m270getSizeimpl >= 0) {
            while (true) {
                int i4 = m270getSizeimpl - 1;
                long m269getsVKNKU = ULongArray.m269getsVKNKU(findLast, m270getSizeimpl);
                if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                    return ULong.m203boximpl(m269getsVKNKU);
                }
                if (i4 < 0) {
                    break;
                }
                m270getSizeimpl = i4;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-jgv0xPQ  reason: not valid java name */
    private static final UInt m720findLastjgv0xPQ(int[] findLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(findLast) - 1;
        if (m191getSizeimpl >= 0) {
            while (true) {
                int i4 = m191getSizeimpl - 1;
                int m190getpVg5ArA = UIntArray.m190getpVg5ArA(findLast, m191getSizeimpl);
                if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                    return UInt.m124boximpl(m190getpVg5ArA);
                }
                if (i4 < 0) {
                    break;
                }
                m191getSizeimpl = i4;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-xTcfx_M  reason: not valid java name */
    private static final UShort m721findLastxTcfx_M(short[] findLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(findLast) - 1;
        if (m375getSizeimpl >= 0) {
            while (true) {
                int i4 = m375getSizeimpl - 1;
                short m374getMh2AYeg = UShortArray.m374getMh2AYeg(findLast, m375getSizeimpl);
                if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                    return UShort.m310boximpl(m374getMh2AYeg);
                }
                if (i4 < 0) {
                    break;
                }
                m375getSizeimpl = i4;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first--ajY-9A  reason: not valid java name */
    private static final int m722firstajY9A(int[] first) {
        int first2;
        Intrinsics.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return UInt.m130constructorimpl(first2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-GBYM_sE  reason: not valid java name */
    private static final byte m723firstGBYM_sE(byte[] first) {
        byte first2;
        Intrinsics.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return UByte.m53constructorimpl(first2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-JOV_ifY  reason: not valid java name */
    private static final byte m724firstJOV_ifY(byte[] first, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(first);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(first, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                return m111getw2LRezQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-MShoTSo  reason: not valid java name */
    private static final long m725firstMShoTSo(long[] first, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(first);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(first, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                return m269getsVKNKU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-QwZRm1k  reason: not valid java name */
    private static final long m726firstQwZRm1k(long[] first) {
        long first2;
        Intrinsics.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return ULong.m209constructorimpl(first2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-jgv0xPQ  reason: not valid java name */
    private static final int m727firstjgv0xPQ(int[] first, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(first);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(first, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                return m190getpVg5ArA;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-rL5Bavg  reason: not valid java name */
    private static final short m728firstrL5Bavg(short[] first) {
        short first2;
        Intrinsics.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return UShort.m316constructorimpl(first2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-xTcfx_M  reason: not valid java name */
    private static final short m729firstxTcfx_M(short[] first, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(first);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(first, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                return m374getMh2AYeg;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m730firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m193isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m124boximpl(UIntArray.m190getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m731firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m114isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m47boximpl(UByteArray.m111getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-JOV_ifY  reason: not valid java name */
    private static final UByte m732firstOrNullJOV_ifY(byte[] firstOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(firstOrNull);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(firstOrNull, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                return UByte.m47boximpl(m111getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-MShoTSo  reason: not valid java name */
    private static final ULong m733firstOrNullMShoTSo(long[] firstOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(firstOrNull);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(firstOrNull, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                return ULong.m203boximpl(m269getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m734firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m272isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m203boximpl(ULongArray.m269getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-jgv0xPQ  reason: not valid java name */
    private static final UInt m735firstOrNulljgv0xPQ(int[] firstOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(firstOrNull);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(firstOrNull, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                return UInt.m124boximpl(m190getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: firstOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m736firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m377isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m310boximpl(UShortArray.m374getMh2AYeg(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-xTcfx_M  reason: not valid java name */
    private static final UShort m737firstOrNullxTcfx_M(short[] firstOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(firstOrNull);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(firstOrNull, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                return UShort.m310boximpl(m374getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-JOV_ifY  reason: not valid java name */
    private static final <R> List<R> m738flatMapJOV_ifY(byte[] flatMap, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(flatMap);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(flatMap, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-MShoTSo  reason: not valid java name */
    private static final <R> List<R> m739flatMapMShoTSo(long[] flatMap, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(flatMap);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(flatMap, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-jgv0xPQ  reason: not valid java name */
    private static final <R> List<R> m740flatMapjgv0xPQ(int[] flatMap, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(flatMap);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(flatMap, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-xTcfx_M  reason: not valid java name */
    private static final <R> List<R> m741flatMapxTcfx_M(short[] flatMap, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(flatMap);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(flatMap, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-ELGow60  reason: not valid java name */
    private static final <R> List<R> m742flatMapIndexedELGow60(byte[] flatMapIndexed, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-WyvcNBI  reason: not valid java name */
    private static final <R> List<R> m743flatMapIndexedWyvcNBI(int[] flatMapIndexed, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-s8dVfGU  reason: not valid java name */
    private static final <R> List<R> m744flatMapIndexeds8dVfGU(long[] flatMapIndexed, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-xzaTVY8  reason: not valid java name */
    private static final <R> List<R> m745flatMapIndexedxzaTVY8(short[] flatMapIndexed, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(flatMapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(flatMapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo--6EtJGI  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m746flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-QqktQ3k  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m747flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-eNpIKz8  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m748flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-pe2Q0Dw  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m749flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(flatMapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(flatMapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-HqK1JgA  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m750flatMapToHqK1JgA(long[] flatMapTo, C destination, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(flatMapTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(flatMapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-oEOeDjA  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m751flatMapTooEOeDjA(short[] flatMapTo, C destination, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(flatMapTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(flatMapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-wU5IKMo  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m752flatMapTowU5IKMo(int[] flatMapTo, C destination, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(flatMapTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(flatMapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-wzUQCXU  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m753flatMapTowzUQCXU(byte[] flatMapTo, C destination, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(flatMapTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(flatMapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-A8wKCXQ  reason: not valid java name */
    private static final <R> R m754foldA8wKCXQ(long[] fold, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(fold);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            r4 = operation.invoke(r4, ULong.m203boximpl(ULongArray.m269getsVKNKU(fold, i4)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-yXmHNn8  reason: not valid java name */
    private static final <R> R m755foldyXmHNn8(byte[] fold, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(fold);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UByte.m47boximpl(UByteArray.m111getw2LRezQ(fold, i4)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-zi1B2BA  reason: not valid java name */
    private static final <R> R m756foldzi1B2BA(int[] fold, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(fold);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UInt.m124boximpl(UIntArray.m190getpVg5ArA(fold, i4)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-zww5nb8  reason: not valid java name */
    private static final <R> R m757foldzww5nb8(short[] fold, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(fold);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UShort.m310boximpl(UShortArray.m374getMh2AYeg(fold, i4)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-3iWJZGE  reason: not valid java name */
    private static final <R> R m758foldIndexed3iWJZGE(byte[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, UByte.m47boximpl(UByteArray.m111getw2LRezQ(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-bzxtMww  reason: not valid java name */
    private static final <R> R m759foldIndexedbzxtMww(short[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, UShort.m310boximpl(UShortArray.m374getMh2AYeg(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-mwnnOCs  reason: not valid java name */
    private static final <R> R m760foldIndexedmwnnOCs(long[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, ULong.m203boximpl(ULongArray.m269getsVKNKU(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-yVwIW0Q  reason: not valid java name */
    private static final <R> R m761foldIndexedyVwIW0Q(int[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(foldIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, UInt.m124boximpl(UIntArray.m190getpVg5ArA(foldIndexed, i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-A8wKCXQ  reason: not valid java name */
    private static final <R> R m762foldRightA8wKCXQ(long[] foldRight, R r4, Function2<? super ULong, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-yXmHNn8  reason: not valid java name */
    private static final <R> R m763foldRightyXmHNn8(byte[] foldRight, R r4, Function2<? super UByte, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-zi1B2BA  reason: not valid java name */
    private static final <R> R m764foldRightzi1B2BA(int[] foldRight, R r4, Function2<? super UInt, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-zww5nb8  reason: not valid java name */
    private static final <R> R m765foldRightzww5nb8(short[] foldRight, R r4, Function2<? super UShort, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-3iWJZGE  reason: not valid java name */
    private static final <R> R m766foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r4, Function3<? super Integer, ? super UByte, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UByte.m47boximpl(UByteArray.m111getw2LRezQ(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-bzxtMww  reason: not valid java name */
    private static final <R> R m767foldRightIndexedbzxtMww(short[] foldRightIndexed, R r4, Function3<? super Integer, ? super UShort, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UShort.m310boximpl(UShortArray.m374getMh2AYeg(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-mwnnOCs  reason: not valid java name */
    private static final <R> R m768foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r4, Function3<? super Integer, ? super ULong, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), ULong.m203boximpl(ULongArray.m269getsVKNKU(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-yVwIW0Q  reason: not valid java name */
    private static final <R> R m769foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r4, Function3<? super Integer, ? super UInt, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UInt.m124boximpl(UIntArray.m190getpVg5ArA(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-JOV_ifY  reason: not valid java name */
    private static final void m770forEachJOV_ifY(byte[] forEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(forEach);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            action.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(forEach, i4)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-MShoTSo  reason: not valid java name */
    private static final void m771forEachMShoTSo(long[] forEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(forEach);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            action.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(forEach, i4)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-jgv0xPQ  reason: not valid java name */
    private static final void m772forEachjgv0xPQ(int[] forEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(forEach);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            action.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(forEach, i4)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-xTcfx_M  reason: not valid java name */
    private static final void m773forEachxTcfx_M(short[] forEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(forEach);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            action.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(forEach, i4)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-ELGow60  reason: not valid java name */
    private static final void m774forEachIndexedELGow60(byte[] forEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-WyvcNBI  reason: not valid java name */
    private static final void m775forEachIndexedWyvcNBI(int[] forEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-s8dVfGU  reason: not valid java name */
    private static final void m776forEachIndexeds8dVfGU(long[] forEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            action.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-xzaTVY8  reason: not valid java name */
    private static final void m777forEachIndexedxzaTVY8(short[] forEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(forEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(forEachIndexed, i4)));
            i4++;
            i5++;
        }
    }

    @NotNull
    /* renamed from: getIndices--ajY-9A  reason: not valid java name */
    public static final IntRange m778getIndicesajY9A(@NotNull int[] indices) {
        IntRange indices2;
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices--ajY-9A$annotations  reason: not valid java name */
    public static /* synthetic */ void m779getIndicesajY9A$annotations(int[] iArr) {
    }

    @NotNull
    /* renamed from: getIndices-GBYM_sE  reason: not valid java name */
    public static final IntRange m780getIndicesGBYM_sE(@NotNull byte[] indices) {
        IntRange indices2;
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-GBYM_sE$annotations  reason: not valid java name */
    public static /* synthetic */ void m781getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @NotNull
    /* renamed from: getIndices-QwZRm1k  reason: not valid java name */
    public static final IntRange m782getIndicesQwZRm1k(@NotNull long[] indices) {
        IntRange indices2;
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-QwZRm1k$annotations  reason: not valid java name */
    public static /* synthetic */ void m783getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @NotNull
    /* renamed from: getIndices-rL5Bavg  reason: not valid java name */
    public static final IntRange m784getIndicesrL5Bavg(@NotNull short[] indices) {
        IntRange indices2;
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-rL5Bavg$annotations  reason: not valid java name */
    public static /* synthetic */ void m785getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A  reason: not valid java name */
    public static final int m786getLastIndexajY9A(@NotNull int[] lastIndex) {
        int lastIndex2;
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        lastIndex2 = ArraysKt___ArraysKt.getLastIndex(lastIndex);
        return lastIndex2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex--ajY-9A$annotations  reason: not valid java name */
    public static /* synthetic */ void m787getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE  reason: not valid java name */
    public static final int m788getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        int lastIndex2;
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        lastIndex2 = ArraysKt___ArraysKt.getLastIndex(lastIndex);
        return lastIndex2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-GBYM_sE$annotations  reason: not valid java name */
    public static /* synthetic */ void m789getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k  reason: not valid java name */
    public static final int m790getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        int lastIndex2;
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        lastIndex2 = ArraysKt___ArraysKt.getLastIndex(lastIndex);
        return lastIndex2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-QwZRm1k$annotations  reason: not valid java name */
    public static /* synthetic */ void m791getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg  reason: not valid java name */
    public static final int m792getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        int lastIndex2;
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        lastIndex2 = ArraysKt___ArraysKt.getLastIndex(lastIndex);
        return lastIndex2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-rL5Bavg$annotations  reason: not valid java name */
    public static /* synthetic */ void m793getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-CVVdw08  reason: not valid java name */
    private static final short m794getOrElseCVVdw08(short[] getOrElse, int i4, Function1<? super Integer, UShort> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrElse);
            if (i4 <= lastIndex) {
                return UShortArray.m374getMh2AYeg(getOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m366unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-QxvSvLU  reason: not valid java name */
    private static final int m795getOrElseQxvSvLU(int[] getOrElse, int i4, Function1<? super Integer, UInt> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrElse);
            if (i4 <= lastIndex) {
                return UIntArray.m190getpVg5ArA(getOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m182unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-Xw8i6dc  reason: not valid java name */
    private static final long m796getOrElseXw8i6dc(long[] getOrElse, int i4, Function1<? super Integer, ULong> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrElse);
            if (i4 <= lastIndex) {
                return ULongArray.m269getsVKNKU(getOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m261unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-cO-VybQ  reason: not valid java name */
    private static final byte m797getOrElsecOVybQ(byte[] getOrElse, int i4, Function1<? super Integer, UByte> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrElse);
            if (i4 <= lastIndex) {
                return UByteArray.m111getw2LRezQ(getOrElse, i4);
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).m103unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-PpDY95g  reason: not valid java name */
    public static final UByte m798getOrNullPpDY95g(@NotNull byte[] getOrNull, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrNull);
            if (i4 <= lastIndex) {
                return UByte.m47boximpl(UByteArray.m111getw2LRezQ(getOrNull, i4));
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-nggk6HY  reason: not valid java name */
    public static final UShort m799getOrNullnggk6HY(@NotNull short[] getOrNull, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrNull);
            if (i4 <= lastIndex) {
                return UShort.m310boximpl(UShortArray.m374getMh2AYeg(getOrNull, i4));
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-qFRl0hI  reason: not valid java name */
    public static final UInt m800getOrNullqFRl0hI(@NotNull int[] getOrNull, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrNull);
            if (i4 <= lastIndex) {
                return UInt.m124boximpl(UIntArray.m190getpVg5ArA(getOrNull, i4));
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: getOrNull-r7IrZao  reason: not valid java name */
    public static final ULong m801getOrNullr7IrZao(@NotNull long[] getOrNull, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i4 >= 0) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(getOrNull);
            if (i4 <= lastIndex) {
                return ULong.m203boximpl(ULongArray.m269getsVKNKU(getOrNull, i4));
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy--_j2Y-Q  reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m802groupBy_j2YQ(long[] groupBy, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(groupBy, i4);
            K invoke = keySelector.invoke(ULong.m203boximpl(m269getsVKNKU));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(ULong.m203boximpl(m269getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-3bBvP4M  reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m803groupBy3bBvP4M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(groupBy, i4);
            K invoke = keySelector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(UShort.m310boximpl(m374getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-JOV_ifY  reason: not valid java name */
    private static final <K> Map<K, List<UByte>> m804groupByJOV_ifY(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(groupBy, i4);
            K invoke = keySelector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(UByte.m47boximpl(m111getw2LRezQ));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-L4rlFek  reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m805groupByL4rlFek(int[] groupBy, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(groupBy, i4);
            K invoke = keySelector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(UInt.m124boximpl(m190getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-MShoTSo  reason: not valid java name */
    private static final <K> Map<K, List<ULong>> m806groupByMShoTSo(long[] groupBy, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(groupBy, i4);
            K invoke = keySelector.invoke(ULong.m203boximpl(m269getsVKNKU));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(ULong.m203boximpl(m269getsVKNKU));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-bBsjw1Y  reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m807groupBybBsjw1Y(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(groupBy, i4);
            K invoke = keySelector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(UByte.m47boximpl(m111getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-jgv0xPQ  reason: not valid java name */
    private static final <K> Map<K, List<UInt>> m808groupByjgv0xPQ(int[] groupBy, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(groupBy, i4);
            K invoke = keySelector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(UInt.m124boximpl(m190getpVg5ArA));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-xTcfx_M  reason: not valid java name */
    private static final <K> Map<K, List<UShort>> m809groupByxTcfx_M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(groupBy);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(groupBy, i4);
            K invoke = keySelector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(UShort.m310boximpl(m374getMh2AYeg));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-4D70W2E  reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UInt>>> M m810groupByTo4D70W2E(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(groupByTo, i4);
            K invoke = keySelector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(UInt.m124boximpl(m190getpVg5ArA));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-H21X9dk  reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UByte>>> M m811groupByToH21X9dk(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(groupByTo, i4);
            K invoke = keySelector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(UByte.m47boximpl(m111getw2LRezQ));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-JM6gNCM  reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m812groupByToJM6gNCM(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(groupByTo, i4);
            K invoke = keySelector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(UInt.m124boximpl(m190getpVg5ArA)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-QxgOkWg  reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m813groupByToQxgOkWg(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(groupByTo, i4);
            K invoke = keySelector.invoke(ULong.m203boximpl(m269getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(ULong.m203boximpl(m269getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-X6OPwNk  reason: not valid java name */
    private static final <K, M extends Map<? super K, List<ULong>>> M m814groupByToX6OPwNk(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(groupByTo, i4);
            K invoke = keySelector.invoke(ULong.m203boximpl(m269getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(ULong.m203boximpl(m269getsVKNKU));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-ciTST-8  reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UShort>>> M m815groupByTociTST8(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(groupByTo, i4);
            K invoke = keySelector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(UShort.m310boximpl(m374getMh2AYeg));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-q8RuPII  reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m816groupByToq8RuPII(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(groupByTo, i4);
            K invoke = keySelector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(UShort.m310boximpl(m374getMh2AYeg)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-qOZmbk8  reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m817groupByToqOZmbk8(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(groupByTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(groupByTo, i4);
            K invoke = keySelector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(UByte.m47boximpl(m111getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-3uqUaXg  reason: not valid java name */
    private static final int m818indexOf3uqUaXg(long[] indexOf, long j4) {
        int indexOf2;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        indexOf2 = ArraysKt___ArraysKt.indexOf(indexOf, j4);
        return indexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-XzdR7RA  reason: not valid java name */
    private static final int m819indexOfXzdR7RA(short[] indexOf, short s4) {
        int indexOf2;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        indexOf2 = ArraysKt___ArraysKt.indexOf(indexOf, s4);
        return indexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-gMuBH34  reason: not valid java name */
    private static final int m820indexOfgMuBH34(byte[] indexOf, byte b5) {
        int indexOf2;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        indexOf2 = ArraysKt___ArraysKt.indexOf(indexOf, b5);
        return indexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-uWY9BYg  reason: not valid java name */
    private static final int m821indexOfuWY9BYg(int[] indexOf, int i4) {
        int indexOf2;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        indexOf2 = ArraysKt___ArraysKt.indexOf(indexOf, i4);
        return indexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-JOV_ifY  reason: not valid java name */
    private static final int m822indexOfFirstJOV_ifY(byte[] indexOfFirst, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(UByte.m47boximpl(UByte.m53constructorimpl(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-MShoTSo  reason: not valid java name */
    private static final int m823indexOfFirstMShoTSo(long[] indexOfFirst, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(ULong.m203boximpl(ULong.m209constructorimpl(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-jgv0xPQ  reason: not valid java name */
    private static final int m824indexOfFirstjgv0xPQ(int[] indexOfFirst, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(UInt.m124boximpl(UInt.m130constructorimpl(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-xTcfx_M  reason: not valid java name */
    private static final int m825indexOfFirstxTcfx_M(short[] indexOfFirst, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(UShort.m310boximpl(UShort.m316constructorimpl(indexOfFirst[i4]))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-JOV_ifY  reason: not valid java name */
    private static final int m826indexOfLastJOV_ifY(byte[] indexOfLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.invoke(UByte.m47boximpl(UByte.m53constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-MShoTSo  reason: not valid java name */
    private static final int m827indexOfLastMShoTSo(long[] indexOfLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.invoke(ULong.m203boximpl(ULong.m209constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-jgv0xPQ  reason: not valid java name */
    private static final int m828indexOfLastjgv0xPQ(int[] indexOfLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.invoke(UInt.m124boximpl(UInt.m130constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-xTcfx_M  reason: not valid java name */
    private static final int m829indexOfLastxTcfx_M(short[] indexOfLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i4 = length - 1;
            if (predicate.invoke(UShort.m310boximpl(UShort.m316constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last--ajY-9A  reason: not valid java name */
    private static final int m830lastajY9A(int[] last) {
        int last2;
        Intrinsics.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return UInt.m130constructorimpl(last2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-GBYM_sE  reason: not valid java name */
    private static final byte m831lastGBYM_sE(byte[] last) {
        byte last2;
        Intrinsics.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return UByte.m53constructorimpl(last2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-JOV_ifY  reason: not valid java name */
    private static final byte m832lastJOV_ifY(byte[] last, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(last) - 1;
        if (m112getSizeimpl >= 0) {
            while (true) {
                int i4 = m112getSizeimpl - 1;
                byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(last, m112getSizeimpl);
                if (!predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    m112getSizeimpl = i4;
                } else {
                    return m111getw2LRezQ;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-MShoTSo  reason: not valid java name */
    private static final long m833lastMShoTSo(long[] last, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(last) - 1;
        if (m270getSizeimpl >= 0) {
            while (true) {
                int i4 = m270getSizeimpl - 1;
                long m269getsVKNKU = ULongArray.m269getsVKNKU(last, m270getSizeimpl);
                if (!predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    m270getSizeimpl = i4;
                } else {
                    return m269getsVKNKU;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-QwZRm1k  reason: not valid java name */
    private static final long m834lastQwZRm1k(long[] last) {
        long last2;
        Intrinsics.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return ULong.m209constructorimpl(last2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-jgv0xPQ  reason: not valid java name */
    private static final int m835lastjgv0xPQ(int[] last, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(last) - 1;
        if (m191getSizeimpl >= 0) {
            while (true) {
                int i4 = m191getSizeimpl - 1;
                int m190getpVg5ArA = UIntArray.m190getpVg5ArA(last, m191getSizeimpl);
                if (!predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    m191getSizeimpl = i4;
                } else {
                    return m190getpVg5ArA;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-rL5Bavg  reason: not valid java name */
    private static final short m836lastrL5Bavg(short[] last) {
        short last2;
        Intrinsics.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return UShort.m316constructorimpl(last2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-xTcfx_M  reason: not valid java name */
    private static final short m837lastxTcfx_M(short[] last, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(last) - 1;
        if (m375getSizeimpl >= 0) {
            while (true) {
                int i4 = m375getSizeimpl - 1;
                short m374getMh2AYeg = UShortArray.m374getMh2AYeg(last, m375getSizeimpl);
                if (!predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    m375getSizeimpl = i4;
                } else {
                    return m374getMh2AYeg;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-3uqUaXg  reason: not valid java name */
    private static final int m838lastIndexOf3uqUaXg(long[] lastIndexOf, long j4) {
        int lastIndexOf2;
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        lastIndexOf2 = ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, j4);
        return lastIndexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-XzdR7RA  reason: not valid java name */
    private static final int m839lastIndexOfXzdR7RA(short[] lastIndexOf, short s4) {
        int lastIndexOf2;
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        lastIndexOf2 = ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, s4);
        return lastIndexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-gMuBH34  reason: not valid java name */
    private static final int m840lastIndexOfgMuBH34(byte[] lastIndexOf, byte b5) {
        int lastIndexOf2;
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        lastIndexOf2 = ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, b5);
        return lastIndexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-uWY9BYg  reason: not valid java name */
    private static final int m841lastIndexOfuWY9BYg(int[] lastIndexOf, int i4) {
        int lastIndexOf2;
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        lastIndexOf2 = ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, i4);
        return lastIndexOf2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m842lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m193isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m124boximpl(UIntArray.m190getpVg5ArA(lastOrNull, UIntArray.m191getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m843lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m114isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m47boximpl(UByteArray.m111getw2LRezQ(lastOrNull, UByteArray.m112getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-JOV_ifY  reason: not valid java name */
    private static final UByte m844lastOrNullJOV_ifY(byte[] lastOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(lastOrNull) - 1;
        if (m112getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i4 = m112getSizeimpl - 1;
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(lastOrNull, m112getSizeimpl);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                return UByte.m47boximpl(m111getw2LRezQ);
            }
            if (i4 < 0) {
                return null;
            }
            m112getSizeimpl = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-MShoTSo  reason: not valid java name */
    private static final ULong m845lastOrNullMShoTSo(long[] lastOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(lastOrNull) - 1;
        if (m270getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i4 = m270getSizeimpl - 1;
            long m269getsVKNKU = ULongArray.m269getsVKNKU(lastOrNull, m270getSizeimpl);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                return ULong.m203boximpl(m269getsVKNKU);
            }
            if (i4 < 0) {
                return null;
            }
            m270getSizeimpl = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m846lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m272isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m203boximpl(ULongArray.m269getsVKNKU(lastOrNull, ULongArray.m270getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-jgv0xPQ  reason: not valid java name */
    private static final UInt m847lastOrNulljgv0xPQ(int[] lastOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(lastOrNull) - 1;
        if (m191getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i4 = m191getSizeimpl - 1;
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(lastOrNull, m191getSizeimpl);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                return UInt.m124boximpl(m190getpVg5ArA);
            }
            if (i4 < 0) {
                return null;
            }
            m191getSizeimpl = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: lastOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m848lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m377isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m310boximpl(UShortArray.m374getMh2AYeg(lastOrNull, UShortArray.m375getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-xTcfx_M  reason: not valid java name */
    private static final UShort m849lastOrNullxTcfx_M(short[] lastOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(lastOrNull) - 1;
        if (m375getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i4 = m375getSizeimpl - 1;
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(lastOrNull, m375getSizeimpl);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                return UShort.m310boximpl(m374getMh2AYeg);
            }
            if (i4 < 0) {
                return null;
            }
            m375getSizeimpl = i4;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-JOV_ifY  reason: not valid java name */
    private static final <R> List<R> m850mapJOV_ifY(byte[] map, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(map));
        int m112getSizeimpl = UByteArray.m112getSizeimpl(map);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            arrayList.add(transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(map, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-MShoTSo  reason: not valid java name */
    private static final <R> List<R> m851mapMShoTSo(long[] map, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(map));
        int m270getSizeimpl = ULongArray.m270getSizeimpl(map);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            arrayList.add(transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(map, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-jgv0xPQ  reason: not valid java name */
    private static final <R> List<R> m852mapjgv0xPQ(int[] map, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(map));
        int m191getSizeimpl = UIntArray.m191getSizeimpl(map);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            arrayList.add(transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(map, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-xTcfx_M  reason: not valid java name */
    private static final <R> List<R> m853mapxTcfx_M(short[] map, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(map));
        int m375getSizeimpl = UShortArray.m375getSizeimpl(map);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            arrayList.add(transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(map, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-ELGow60  reason: not valid java name */
    private static final <R> List<R> m854mapIndexedELGow60(byte[] mapIndexed, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(mapIndexed));
        int m112getSizeimpl = UByteArray.m112getSizeimpl(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-WyvcNBI  reason: not valid java name */
    private static final <R> List<R> m855mapIndexedWyvcNBI(int[] mapIndexed, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(mapIndexed));
        int m191getSizeimpl = UIntArray.m191getSizeimpl(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-s8dVfGU  reason: not valid java name */
    private static final <R> List<R> m856mapIndexeds8dVfGU(long[] mapIndexed, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(mapIndexed));
        int m270getSizeimpl = ULongArray.m270getSizeimpl(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-xzaTVY8  reason: not valid java name */
    private static final <R> List<R> m857mapIndexedxzaTVY8(short[] mapIndexed, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(mapIndexed));
        int m375getSizeimpl = UShortArray.m375getSizeimpl(mapIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(mapIndexed, i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo--6EtJGI  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m858mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-QqktQ3k  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m859mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-eNpIKz8  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m860mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-pe2Q0Dw  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m861mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(mapIndexedTo);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(mapIndexedTo, i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-HqK1JgA  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m862mapToHqK1JgA(long[] mapTo, C destination, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(mapTo);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            destination.add(transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(mapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-oEOeDjA  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m863mapTooEOeDjA(short[] mapTo, C destination, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(mapTo);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            destination.add(transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(mapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-wU5IKMo  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m864mapTowU5IKMo(int[] mapTo, C destination, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(mapTo);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            destination.add(transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(mapTo, i4))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-wzUQCXU  reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m865mapTowzUQCXU(byte[] mapTo, C destination, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(mapTo);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            destination.add(transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(mapTo, i4))));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m866maxByOrNullJOV_ifY(byte[] maxByOrNull, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(maxByOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(maxByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UByte.m47boximpl(m111getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m47boximpl(m111getw2LRezQ));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(maxByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UByte.m47boximpl(m111getw2LRezQ2));
            if (invoke.compareTo(invoke2) < 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m867maxByOrNullMShoTSo(long[] maxByOrNull, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(maxByOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(maxByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return ULong.m203boximpl(m269getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m203boximpl(m269getsVKNKU));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(maxByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(ULong.m203boximpl(m269getsVKNKU2));
            if (invoke.compareTo(invoke2) < 0) {
                m269getsVKNKU = m269getsVKNKU2;
                invoke = invoke2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m868maxByOrNulljgv0xPQ(int[] maxByOrNull, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(maxByOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(maxByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UInt.m124boximpl(m190getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m124boximpl(m190getpVg5ArA));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(maxByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UInt.m124boximpl(m190getpVg5ArA2));
            if (invoke.compareTo(invoke2) < 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m869maxByOrNullxTcfx_M(short[] maxByOrNull, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(maxByOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(maxByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UShort.m310boximpl(m374getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m310boximpl(m374getMh2AYeg));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(maxByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UShort.m310boximpl(m374getMh2AYeg2));
            if (invoke.compareTo(invoke2) < 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m871maxByOrThrowU(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(maxBy)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(maxBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m190getpVg5ArA;
            }
            R invoke = selector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(maxBy, it2.nextInt());
                R invoke2 = selector.invoke(UInt.m124boximpl(m190getpVg5ArA2));
                if (invoke.compareTo(invoke2) < 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                    invoke = invoke2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY  reason: not valid java name */
    private static final double m874maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(maxOf)) {
            double doubleValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo  reason: not valid java name */
    private static final double m877maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(maxOf)) {
            double doubleValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ  reason: not valid java name */
    private static final double m880maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(maxOf)) {
            double doubleValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M  reason: not valid java name */
    private static final double m883maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(maxOf)) {
            double doubleValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY  reason: not valid java name */
    private static final Double m887maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo  reason: not valid java name */
    private static final Double m890maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final Double m893maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M  reason: not valid java name */
    private static final Double m896maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-5NtCtWE  reason: not valid java name */
    private static final <R> R m898maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(maxOfWith)) {
            Object obj = (R) selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-LTi4i_s  reason: not valid java name */
    private static final <R> R m899maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(maxOfWith)) {
            Object obj = (R) selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-l8EHGbQ  reason: not valid java name */
    private static final <R> R m900maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(maxOfWith)) {
            Object obj = (R) selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-myNOsp4  reason: not valid java name */
    private static final <R> R m901maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(maxOfWith)) {
            Object obj = (R) selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-5NtCtWE  reason: not valid java name */
    private static final <R> R m902maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-LTi4i_s  reason: not valid java name */
    private static final <R> R m903maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-l8EHGbQ  reason: not valid java name */
    private static final <R> R m904maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-myNOsp4  reason: not valid java name */
    private static final <R> R m905maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m906maxOrNullajY9A(@NotNull int[] maxOrNull) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m193isEmptyimpl(maxOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(maxOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(maxOrNull, it2.nextInt());
            compare = Integer.compare(m190getpVg5ArA ^ Integer.MIN_VALUE, m190getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare < 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m907maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m114isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(maxOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(maxOrNull, it2.nextInt());
            if (Intrinsics.compare(m111getw2LRezQ & 255, m111getw2LRezQ2 & 255) < 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m908maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m272isEmptyimpl(maxOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(maxOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(maxOrNull, it2.nextInt());
            compare = Long.compare(m269getsVKNKU ^ Long.MIN_VALUE, m269getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare < 0) {
                m269getsVKNKU = m269getsVKNKU2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m909maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m377isEmptyimpl(maxOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(maxOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(maxOrNull, it2.nextInt());
            if (Intrinsics.compare(m374getMh2AYeg & UShort.MAX_VALUE, 65535 & m374getMh2AYeg2) < 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final int m911maxOrThrowU(@NotNull int[] max) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UIntArray.m193isEmptyimpl(max)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(max, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(max, it2.nextInt());
                compare = Integer.compare(m190getpVg5ArA ^ Integer.MIN_VALUE, m190getpVg5ArA2 ^ Integer.MIN_VALUE);
                if (compare < 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-XMRcp5o  reason: not valid java name */
    public static final UByte m914maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m114isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(maxWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(maxWithOrNull, it2.nextInt());
            if (comparator.compare(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(m111getw2LRezQ2)) < 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-YmdZ_VM  reason: not valid java name */
    public static final UInt m915maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m193isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(maxWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(maxWithOrNull, it2.nextInt());
            if (comparator.compare(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(m190getpVg5ArA2)) < 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-eOHTfZs  reason: not valid java name */
    public static final UShort m916maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m377isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(maxWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(maxWithOrNull, it2.nextInt());
            if (comparator.compare(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(m374getMh2AYeg2)) < 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: maxWithOrNull-zrEWJaI  reason: not valid java name */
    public static final ULong m917maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m272isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(maxWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(maxWithOrNull, it2.nextInt());
            if (comparator.compare(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(m269getsVKNKU2)) < 0) {
                m269getsVKNKU = m269getsVKNKU2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final int m919maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super UInt> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UIntArray.m193isEmptyimpl(maxWith)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(maxWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(maxWith, it2.nextInt());
                if (comparator.compare(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(m190getpVg5ArA2)) < 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m922minByOrNullJOV_ifY(byte[] minByOrNull, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(minByOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(minByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UByte.m47boximpl(m111getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m47boximpl(m111getw2LRezQ));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(minByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UByte.m47boximpl(m111getw2LRezQ2));
            if (invoke.compareTo(invoke2) > 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m923minByOrNullMShoTSo(long[] minByOrNull, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(minByOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(minByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return ULong.m203boximpl(m269getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m203boximpl(m269getsVKNKU));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(minByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(ULong.m203boximpl(m269getsVKNKU2));
            if (invoke.compareTo(invoke2) > 0) {
                m269getsVKNKU = m269getsVKNKU2;
                invoke = invoke2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m924minByOrNulljgv0xPQ(int[] minByOrNull, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(minByOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(minByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UInt.m124boximpl(m190getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m124boximpl(m190getpVg5ArA));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(minByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UInt.m124boximpl(m190getpVg5ArA2));
            if (invoke.compareTo(invoke2) > 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m925minByOrNullxTcfx_M(short[] minByOrNull, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(minByOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(minByOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UShort.m310boximpl(m374getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m310boximpl(m374getMh2AYeg));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(minByOrNull, it2.nextInt());
            R invoke2 = selector.invoke(UShort.m310boximpl(m374getMh2AYeg2));
            if (invoke.compareTo(invoke2) > 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m927minByOrThrowU(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(minBy)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(minBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m190getpVg5ArA;
            }
            R invoke = selector.invoke(UInt.m124boximpl(m190getpVg5ArA));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(minBy, it2.nextInt());
                R invoke2 = selector.invoke(UInt.m124boximpl(m190getpVg5ArA2));
                if (invoke.compareTo(invoke2) > 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                    invoke = invoke2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY  reason: not valid java name */
    private static final double m930minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(minOf)) {
            double doubleValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo  reason: not valid java name */
    private static final double m933minOfMShoTSo(long[] minOf, Function1<? super ULong, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(minOf)) {
            double doubleValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ  reason: not valid java name */
    private static final double m936minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(minOf)) {
            double doubleValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M  reason: not valid java name */
    private static final double m939minOfxTcfx_M(short[] minOf, Function1<? super UShort, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(minOf)) {
            double doubleValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, 0))).doubleValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, it2.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY  reason: not valid java name */
    private static final Double m943minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo  reason: not valid java name */
    private static final Double m946minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final Double m949minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M  reason: not valid java name */
    private static final Double m952minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, 0))).doubleValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, it2.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-5NtCtWE  reason: not valid java name */
    private static final <R> R m954minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(minOfWith)) {
            Object obj = (R) selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-LTi4i_s  reason: not valid java name */
    private static final <R> R m955minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(minOfWith)) {
            Object obj = (R) selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-l8EHGbQ  reason: not valid java name */
    private static final <R> R m956minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(minOfWith)) {
            Object obj = (R) selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-myNOsp4  reason: not valid java name */
    private static final <R> R m957minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(minOfWith)) {
            Object obj = (R) selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfWith, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfWith, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-5NtCtWE  reason: not valid java name */
    private static final <R> R m958minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-LTi4i_s  reason: not valid java name */
    private static final <R> R m959minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-l8EHGbQ  reason: not valid java name */
    private static final <R> R m960minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-myNOsp4  reason: not valid java name */
    private static final <R> R m961minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfWithOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfWithOrNull, it2.nextInt())));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m962minOrNullajY9A(@NotNull int[] minOrNull) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m193isEmptyimpl(minOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(minOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(minOrNull, it2.nextInt());
            compare = Integer.compare(m190getpVg5ArA ^ Integer.MIN_VALUE, m190getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m963minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m114isEmptyimpl(minOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(minOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(minOrNull, it2.nextInt());
            if (Intrinsics.compare(m111getw2LRezQ & 255, m111getw2LRezQ2 & 255) > 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m964minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m272isEmptyimpl(minOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(minOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(minOrNull, it2.nextInt());
            compare = Long.compare(m269getsVKNKU ^ Long.MIN_VALUE, m269getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                m269getsVKNKU = m269getsVKNKU2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m965minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m377isEmptyimpl(minOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(minOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(minOrNull, it2.nextInt());
            if (Intrinsics.compare(m374getMh2AYeg & UShort.MAX_VALUE, 65535 & m374getMh2AYeg2) > 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final int m967minOrThrowU(@NotNull int[] min) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UIntArray.m193isEmptyimpl(min)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(min, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(min, it2.nextInt());
                compare = Integer.compare(m190getpVg5ArA ^ Integer.MIN_VALUE, m190getpVg5ArA2 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-XMRcp5o  reason: not valid java name */
    public static final UByte m970minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m114isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(minWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(minWithOrNull, it2.nextInt());
            if (comparator.compare(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(m111getw2LRezQ2)) > 0) {
                m111getw2LRezQ = m111getw2LRezQ2;
            }
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-YmdZ_VM  reason: not valid java name */
    public static final UInt m971minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m193isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(minWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(minWithOrNull, it2.nextInt());
            if (comparator.compare(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(m190getpVg5ArA2)) > 0) {
                m190getpVg5ArA = m190getpVg5ArA2;
            }
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-eOHTfZs  reason: not valid java name */
    public static final UShort m972minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m377isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(minWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(minWithOrNull, it2.nextInt());
            if (comparator.compare(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(m374getMh2AYeg2)) > 0) {
                m374getMh2AYeg = m374getMh2AYeg2;
            }
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: minWithOrNull-zrEWJaI  reason: not valid java name */
    public static final ULong m973minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m272isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(minWithOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minWithOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long m269getsVKNKU2 = ULongArray.m269getsVKNKU(minWithOrNull, it2.nextInt());
            if (comparator.compare(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(m269getsVKNKU2)) > 0) {
                m269getsVKNKU = m269getsVKNKU2;
            }
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final int m975minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super UInt> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UIntArray.m193isEmptyimpl(minWith)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(minWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int m190getpVg5ArA2 = UIntArray.m190getpVg5ArA(minWith, it2.nextInt());
                if (comparator.compare(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(m190getpVg5ArA2)) > 0) {
                    m190getpVg5ArA = m190getpVg5ArA2;
                }
            }
            return m190getpVg5ArA;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none--ajY-9A  reason: not valid java name */
    private static final boolean m978noneajY9A(int[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UIntArray.m193isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-GBYM_sE  reason: not valid java name */
    private static final boolean m979noneGBYM_sE(byte[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UByteArray.m114isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-JOV_ifY  reason: not valid java name */
    private static final boolean m980noneJOV_ifY(byte[] none, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(none);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            if (predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-MShoTSo  reason: not valid java name */
    private static final boolean m981noneMShoTSo(long[] none, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(none);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            if (predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-QwZRm1k  reason: not valid java name */
    private static final boolean m982noneQwZRm1k(long[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return ULongArray.m272isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-jgv0xPQ  reason: not valid java name */
    private static final boolean m983nonejgv0xPQ(int[] none, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(none);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            if (predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-rL5Bavg  reason: not valid java name */
    private static final boolean m984nonerL5Bavg(short[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UShortArray.m377isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-xTcfx_M  reason: not valid java name */
    private static final boolean m985nonexTcfx_M(short[] none, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(none);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            if (predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(none, i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-JOV_ifY  reason: not valid java name */
    private static final byte[] m986onEachJOV_ifY(byte[] onEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(onEach);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            action.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(onEach, i4)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-MShoTSo  reason: not valid java name */
    private static final long[] m987onEachMShoTSo(long[] onEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(onEach);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            action.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(onEach, i4)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-jgv0xPQ  reason: not valid java name */
    private static final int[] m988onEachjgv0xPQ(int[] onEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(onEach);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            action.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(onEach, i4)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-xTcfx_M  reason: not valid java name */
    private static final short[] m989onEachxTcfx_M(short[] onEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(onEach);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            action.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(onEach, i4)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-ELGow60  reason: not valid java name */
    private static final byte[] m990onEachIndexedELGow60(byte[] onEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m112getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UByte.m47boximpl(UByteArray.m111getw2LRezQ(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-WyvcNBI  reason: not valid java name */
    private static final int[] m991onEachIndexedWyvcNBI(int[] onEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m191getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UInt.m124boximpl(UIntArray.m190getpVg5ArA(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-s8dVfGU  reason: not valid java name */
    private static final long[] m992onEachIndexeds8dVfGU(long[] onEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m270getSizeimpl) {
            action.invoke(Integer.valueOf(i5), ULong.m203boximpl(ULongArray.m269getsVKNKU(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-xzaTVY8  reason: not valid java name */
    private static final short[] m993onEachIndexedxzaTVY8(short[] onEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(onEachIndexed);
        int i4 = 0;
        int i5 = 0;
        while (i4 < m375getSizeimpl) {
            action.invoke(Integer.valueOf(i5), UShort.m310boximpl(UShortArray.m374getMh2AYeg(onEachIndexed, i4)));
            i4++;
            i5++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-3uqUaXg  reason: not valid java name */
    private static final long[] m994plus3uqUaXg(long[] plus, long j4) {
        long[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, j4);
        return ULongArray.m264constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-CFIt9YE  reason: not valid java name */
    public static final int[] m995plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(plus);
        int[] copyOf = Arrays.copyOf(plus, UIntArray.m191getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (UInt uInt : elements) {
            copyOf[m191getSizeimpl] = uInt.m182unboximpl();
            m191getSizeimpl++;
        }
        return UIntArray.m185constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-XzdR7RA  reason: not valid java name */
    private static final short[] m996plusXzdR7RA(short[] plus, short s4) {
        short[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, s4);
        return UShortArray.m369constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-ctEhBpI  reason: not valid java name */
    private static final int[] m997plusctEhBpI(int[] plus, int[] elements) {
        int[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, elements);
        return UIntArray.m185constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-gMuBH34  reason: not valid java name */
    private static final byte[] m998plusgMuBH34(byte[] plus, byte b5) {
        byte[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, b5);
        return UByteArray.m106constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-kdPth3s  reason: not valid java name */
    private static final byte[] m999pluskdPth3s(byte[] plus, byte[] elements) {
        byte[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, elements);
        return UByteArray.m106constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-kzHmqpY  reason: not valid java name */
    public static final long[] m1000pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(plus);
        long[] copyOf = Arrays.copyOf(plus, ULongArray.m270getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (ULong uLong : elements) {
            copyOf[m270getSizeimpl] = uLong.m261unboximpl();
            m270getSizeimpl++;
        }
        return ULongArray.m264constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-mazbYpA  reason: not valid java name */
    private static final short[] m1001plusmazbYpA(short[] plus, short[] elements) {
        short[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, elements);
        return UShortArray.m369constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-ojwP5H8  reason: not valid java name */
    public static final short[] m1002plusojwP5H8(@NotNull short[] plus, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(plus);
        short[] copyOf = Arrays.copyOf(plus, UShortArray.m375getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (UShort uShort : elements) {
            copyOf[m375getSizeimpl] = uShort.m366unboximpl();
            m375getSizeimpl++;
        }
        return UShortArray.m369constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-uWY9BYg  reason: not valid java name */
    private static final int[] m1003plusuWY9BYg(int[] plus, int i4) {
        int[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, i4);
        return UIntArray.m185constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-us8wMrg  reason: not valid java name */
    private static final long[] m1004plusus8wMrg(long[] plus, long[] elements) {
        long[] plus2;
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, elements);
        return ULongArray.m264constructorimpl(plus2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: plus-xo_DsdI  reason: not valid java name */
    public static final byte[] m1005plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(plus);
        byte[] copyOf = Arrays.copyOf(plus, UByteArray.m112getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (UByte uByte : elements) {
            copyOf[m112getSizeimpl] = uByte.m103unboximpl();
            m112getSizeimpl++;
        }
        return UByteArray.m106constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random--ajY-9A  reason: not valid java name */
    private static final int m1006randomajY9A(int[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1007random2D5oskM(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-2D5oskM  reason: not valid java name */
    public static final int m1007random2D5oskM(@NotNull int[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UIntArray.m193isEmptyimpl(random)) {
            return UIntArray.m190getpVg5ArA(random, random2.nextInt(UIntArray.m191getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-GBYM_sE  reason: not valid java name */
    private static final byte m1008randomGBYM_sE(byte[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1011randomoSF2wD8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-JzugnMA  reason: not valid java name */
    public static final long m1009randomJzugnMA(@NotNull long[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!ULongArray.m272isEmptyimpl(random)) {
            return ULongArray.m269getsVKNKU(random, random2.nextInt(ULongArray.m270getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-QwZRm1k  reason: not valid java name */
    private static final long m1010randomQwZRm1k(long[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1009randomJzugnMA(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-oSF2wD8  reason: not valid java name */
    public static final byte m1011randomoSF2wD8(@NotNull byte[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UByteArray.m114isEmptyimpl(random)) {
            return UByteArray.m111getw2LRezQ(random, random2.nextInt(UByteArray.m112getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-rL5Bavg  reason: not valid java name */
    private static final short m1012randomrL5Bavg(short[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m1013randoms5X_as8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-s5X_as8  reason: not valid java name */
    public static final short m1013randoms5X_as8(@NotNull short[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (!UShortArray.m377isEmptyimpl(random)) {
            return UShortArray.m374getMh2AYeg(random, random2.nextInt(UShortArray.m375getSizeimpl(random)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull--ajY-9A  reason: not valid java name */
    private static final UInt m1014randomOrNullajY9A(int[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1015randomOrNull2D5oskM(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-2D5oskM  reason: not valid java name */
    public static final UInt m1015randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m193isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m124boximpl(UIntArray.m190getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m191getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-GBYM_sE  reason: not valid java name */
    private static final UByte m1016randomOrNullGBYM_sE(byte[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1019randomOrNulloSF2wD8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-JzugnMA  reason: not valid java name */
    public static final ULong m1017randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m272isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m203boximpl(ULongArray.m269getsVKNKU(randomOrNull, random.nextInt(ULongArray.m270getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-QwZRm1k  reason: not valid java name */
    private static final ULong m1018randomOrNullQwZRm1k(long[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1017randomOrNullJzugnMA(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-oSF2wD8  reason: not valid java name */
    public static final UByte m1019randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m114isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m47boximpl(UByteArray.m111getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m112getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-rL5Bavg  reason: not valid java name */
    private static final UShort m1020randomOrNullrL5Bavg(short[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m1021randomOrNulls5X_as8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-s5X_as8  reason: not valid java name */
    public static final UShort m1021randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m377isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m310boximpl(UShortArray.m374getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m375getSizeimpl(randomOrNull))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-ELGow60  reason: not valid java name */
    private static final byte m1022reduceELGow60(byte[] reduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UByteArray.m114isEmptyimpl(reduce)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduce, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                m111getw2LRezQ = operation.invoke(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduce, it2.nextInt()))).m103unboximpl();
            }
            return m111getw2LRezQ;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-WyvcNBI  reason: not valid java name */
    private static final int m1023reduceWyvcNBI(int[] reduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UIntArray.m193isEmptyimpl(reduce)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduce, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                m190getpVg5ArA = operation.invoke(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduce, it2.nextInt()))).m182unboximpl();
            }
            return m190getpVg5ArA;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-s8dVfGU  reason: not valid java name */
    private static final long m1024reduces8dVfGU(long[] reduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!ULongArray.m272isEmptyimpl(reduce)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(reduce, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                m269getsVKNKU = operation.invoke(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduce, it2.nextInt()))).m261unboximpl();
            }
            return m269getsVKNKU;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-xzaTVY8  reason: not valid java name */
    private static final short m1025reducexzaTVY8(short[] reduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UShortArray.m377isEmptyimpl(reduce)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduce, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduce);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                m374getMh2AYeg = operation.invoke(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduce, it2.nextInt()))).m366unboximpl();
            }
            return m374getMh2AYeg;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-D40WMg8  reason: not valid java name */
    private static final int m1026reduceIndexedD40WMg8(int[] reduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UIntArray.m193isEmptyimpl(reduceIndexed)) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceIndexed, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                m190getpVg5ArA = operation.invoke(Integer.valueOf(nextInt), UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceIndexed, nextInt))).m182unboximpl();
            }
            return m190getpVg5ArA;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-EOyYB1Y  reason: not valid java name */
    private static final byte m1027reduceIndexedEOyYB1Y(byte[] reduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UByteArray.m114isEmptyimpl(reduceIndexed)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceIndexed, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                m111getw2LRezQ = operation.invoke(Integer.valueOf(nextInt), UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceIndexed, nextInt))).m103unboximpl();
            }
            return m111getw2LRezQ;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-aLgx1Fo  reason: not valid java name */
    private static final short m1028reduceIndexedaLgx1Fo(short[] reduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!UShortArray.m377isEmptyimpl(reduceIndexed)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceIndexed, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                m374getMh2AYeg = operation.invoke(Integer.valueOf(nextInt), UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceIndexed, nextInt))).m366unboximpl();
            }
            return m374getMh2AYeg;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-z1zDJgo  reason: not valid java name */
    private static final long m1029reduceIndexedz1zDJgo(long[] reduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!ULongArray.m272isEmptyimpl(reduceIndexed)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceIndexed, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexed);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                m269getsVKNKU = operation.invoke(Integer.valueOf(nextInt), ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceIndexed, nextInt))).m261unboximpl();
            }
            return m269getsVKNKU;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-D40WMg8  reason: not valid java name */
    private static final UInt m1030reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceIndexedOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            m190getpVg5ArA = operation.invoke(Integer.valueOf(nextInt), UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceIndexedOrNull, nextInt))).m182unboximpl();
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-EOyYB1Y  reason: not valid java name */
    private static final UByte m1031reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceIndexedOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            m111getw2LRezQ = operation.invoke(Integer.valueOf(nextInt), UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceIndexedOrNull, nextInt))).m103unboximpl();
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-aLgx1Fo  reason: not valid java name */
    private static final UShort m1032reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceIndexedOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            m374getMh2AYeg = operation.invoke(Integer.valueOf(nextInt), UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceIndexedOrNull, nextInt))).m366unboximpl();
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-z1zDJgo  reason: not valid java name */
    private static final ULong m1033reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceIndexedOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            m269getsVKNKU = operation.invoke(Integer.valueOf(nextInt), ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceIndexedOrNull, nextInt))).m261unboximpl();
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-ELGow60  reason: not valid java name */
    private static final UByte m1034reduceOrNullELGow60(byte[] reduceOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(reduceOrNull)) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            m111getw2LRezQ = operation.invoke(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceOrNull, it2.nextInt()))).m103unboximpl();
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-WyvcNBI  reason: not valid java name */
    private static final UInt m1035reduceOrNullWyvcNBI(int[] reduceOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(reduceOrNull)) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            m190getpVg5ArA = operation.invoke(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceOrNull, it2.nextInt()))).m182unboximpl();
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-s8dVfGU  reason: not valid java name */
    private static final ULong m1036reduceOrNulls8dVfGU(long[] reduceOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(reduceOrNull)) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            m269getsVKNKU = operation.invoke(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceOrNull, it2.nextInt()))).m261unboximpl();
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-xzaTVY8  reason: not valid java name */
    private static final UShort m1037reduceOrNullxzaTVY8(short[] reduceOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(reduceOrNull)) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceOrNull, 0);
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            m374getMh2AYeg = operation.invoke(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceOrNull, it2.nextInt()))).m366unboximpl();
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-ELGow60  reason: not valid java name */
    private static final byte m1038reduceRightELGow60(byte[] reduceRight, Function2<? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex >= 0) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceRight, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m111getw2LRezQ = operation.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceRight, i4)), UByte.m47boximpl(m111getw2LRezQ)).m103unboximpl();
            }
            return m111getw2LRezQ;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-WyvcNBI  reason: not valid java name */
    private static final int m1039reduceRightWyvcNBI(int[] reduceRight, Function2<? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex >= 0) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceRight, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m190getpVg5ArA = operation.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceRight, i4)), UInt.m124boximpl(m190getpVg5ArA)).m182unboximpl();
            }
            return m190getpVg5ArA;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-s8dVfGU  reason: not valid java name */
    private static final long m1040reduceRights8dVfGU(long[] reduceRight, Function2<? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex >= 0) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceRight, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m269getsVKNKU = operation.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceRight, i4)), ULong.m203boximpl(m269getsVKNKU)).m261unboximpl();
            }
            return m269getsVKNKU;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-xzaTVY8  reason: not valid java name */
    private static final short m1041reduceRightxzaTVY8(short[] reduceRight, Function2<? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex >= 0) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceRight, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m374getMh2AYeg = operation.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceRight, i4)), UShort.m310boximpl(m374getMh2AYeg)).m366unboximpl();
            }
            return m374getMh2AYeg;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-D40WMg8  reason: not valid java name */
    private static final int m1042reduceRightIndexedD40WMg8(int[] reduceRightIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex >= 0) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceRightIndexed, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m190getpVg5ArA = operation.invoke(Integer.valueOf(i4), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceRightIndexed, i4)), UInt.m124boximpl(m190getpVg5ArA)).m182unboximpl();
            }
            return m190getpVg5ArA;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-EOyYB1Y  reason: not valid java name */
    private static final byte m1043reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex >= 0) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceRightIndexed, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m111getw2LRezQ = operation.invoke(Integer.valueOf(i4), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceRightIndexed, i4)), UByte.m47boximpl(m111getw2LRezQ)).m103unboximpl();
            }
            return m111getw2LRezQ;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-aLgx1Fo  reason: not valid java name */
    private static final short m1044reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex >= 0) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceRightIndexed, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m374getMh2AYeg = operation.invoke(Integer.valueOf(i4), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceRightIndexed, i4)), UShort.m310boximpl(m374getMh2AYeg)).m366unboximpl();
            }
            return m374getMh2AYeg;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-z1zDJgo  reason: not valid java name */
    private static final long m1045reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex >= 0) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceRightIndexed, lastIndex);
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                m269getsVKNKU = operation.invoke(Integer.valueOf(i4), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceRightIndexed, i4)), ULong.m203boximpl(m269getsVKNKU)).m261unboximpl();
            }
            return m269getsVKNKU;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-D40WMg8  reason: not valid java name */
    private static final UInt m1046reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceRightIndexedOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m190getpVg5ArA = operation.invoke(Integer.valueOf(i4), UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceRightIndexedOrNull, i4)), UInt.m124boximpl(m190getpVg5ArA)).m182unboximpl();
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-EOyYB1Y  reason: not valid java name */
    private static final UByte m1047reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceRightIndexedOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m111getw2LRezQ = operation.invoke(Integer.valueOf(i4), UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceRightIndexedOrNull, i4)), UByte.m47boximpl(m111getw2LRezQ)).m103unboximpl();
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-aLgx1Fo  reason: not valid java name */
    private static final UShort m1048reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceRightIndexedOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m374getMh2AYeg = operation.invoke(Integer.valueOf(i4), UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceRightIndexedOrNull, i4)), UShort.m310boximpl(m374getMh2AYeg)).m366unboximpl();
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-z1zDJgo  reason: not valid java name */
    private static final ULong m1049reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceRightIndexedOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m269getsVKNKU = operation.invoke(Integer.valueOf(i4), ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceRightIndexedOrNull, i4)), ULong.m203boximpl(m269getsVKNKU)).m261unboximpl();
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-ELGow60  reason: not valid java name */
    private static final UByte m1050reduceRightOrNullELGow60(byte[] reduceRightOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(reduceRightOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m111getw2LRezQ = operation.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(reduceRightOrNull, i4)), UByte.m47boximpl(m111getw2LRezQ)).m103unboximpl();
        }
        return UByte.m47boximpl(m111getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-WyvcNBI  reason: not valid java name */
    private static final UInt m1051reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(reduceRightOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m190getpVg5ArA = operation.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(reduceRightOrNull, i4)), UInt.m124boximpl(m190getpVg5ArA)).m182unboximpl();
        }
        return UInt.m124boximpl(m190getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-s8dVfGU  reason: not valid java name */
    private static final ULong m1052reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(reduceRightOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m269getsVKNKU = operation.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(reduceRightOrNull, i4)), ULong.m203boximpl(m269getsVKNKU)).m261unboximpl();
        }
        return ULong.m203boximpl(m269getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-xzaTVY8  reason: not valid java name */
    private static final UShort m1053reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(reduceRightOrNull, lastIndex);
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            m374getMh2AYeg = operation.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(reduceRightOrNull, i4)), UShort.m310boximpl(m374getMh2AYeg)).m366unboximpl();
        }
        return UShort.m310boximpl(m374getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse--ajY-9A  reason: not valid java name */
    private static final void m1054reverseajY9A(int[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse--nroSd4  reason: not valid java name */
    private static final void m1055reversenroSd4(long[] reverse, int i4, int i5) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-4UcCI2c  reason: not valid java name */
    private static final void m1056reverse4UcCI2c(byte[] reverse, int i4, int i5) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-Aa5vz7o  reason: not valid java name */
    private static final void m1057reverseAa5vz7o(short[] reverse, int i4, int i5) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-GBYM_sE  reason: not valid java name */
    private static final void m1058reverseGBYM_sE(byte[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-QwZRm1k  reason: not valid java name */
    private static final void m1059reverseQwZRm1k(long[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-oBK06Vg  reason: not valid java name */
    private static final void m1060reverseoBK06Vg(int[] reverse, int i4, int i5) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-rL5Bavg  reason: not valid java name */
    private static final void m1061reverserL5Bavg(short[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed--ajY-9A  reason: not valid java name */
    public static final List<UInt> m1062reversedajY9A(@NotNull int[] reversed) {
        List<UInt> mutableList;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m193isEmptyimpl(reversed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UIntArray.m183boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m1063reversedGBYM_sE(@NotNull byte[] reversed) {
        List<UByte> mutableList;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m114isEmptyimpl(reversed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UByteArray.m104boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m1064reversedQwZRm1k(@NotNull long[] reversed) {
        List<ULong> mutableList;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m272isEmptyimpl(reversed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ULongArray.m262boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: reversed-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m1065reversedrL5Bavg(@NotNull short[] reversed) {
        List<UShort> mutableList;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m377isEmptyimpl(reversed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UShortArray.m367boximpl(reversed));
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray--ajY-9A  reason: not valid java name */
    private static final int[] m1066reversedArrayajY9A(int[] reversedArray) {
        int[] reversedArray2;
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return UIntArray.m185constructorimpl(reversedArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-GBYM_sE  reason: not valid java name */
    private static final byte[] m1067reversedArrayGBYM_sE(byte[] reversedArray) {
        byte[] reversedArray2;
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return UByteArray.m106constructorimpl(reversedArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-QwZRm1k  reason: not valid java name */
    private static final long[] m1068reversedArrayQwZRm1k(long[] reversedArray) {
        long[] reversedArray2;
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return ULongArray.m264constructorimpl(reversedArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-rL5Bavg  reason: not valid java name */
    private static final short[] m1069reversedArrayrL5Bavg(short[] reversedArray) {
        short[] reversedArray2;
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return UShortArray.m369constructorimpl(reversedArray2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-A8wKCXQ  reason: not valid java name */
    private static final <R> List<R> m1070runningFoldA8wKCXQ(long[] runningFold, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(runningFold)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(runningFold);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            r4 = operation.invoke(r4, ULong.m203boximpl(ULongArray.m269getsVKNKU(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-yXmHNn8  reason: not valid java name */
    private static final <R> List<R> m1071runningFoldyXmHNn8(byte[] runningFold, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(runningFold)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(runningFold);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UByte.m47boximpl(UByteArray.m111getw2LRezQ(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-zi1B2BA  reason: not valid java name */
    private static final <R> List<R> m1072runningFoldzi1B2BA(int[] runningFold, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(runningFold)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(runningFold);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UInt.m124boximpl(UIntArray.m190getpVg5ArA(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-zww5nb8  reason: not valid java name */
    private static final <R> List<R> m1073runningFoldzww5nb8(short[] runningFold, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(runningFold)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(runningFold);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UShort.m310boximpl(UShortArray.m374getMh2AYeg(runningFold, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-3iWJZGE  reason: not valid java name */
    private static final <R> List<R> m1074runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(runningFoldIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(runningFoldIndexed);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UByte.m47boximpl(UByteArray.m111getw2LRezQ(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-bzxtMww  reason: not valid java name */
    private static final <R> List<R> m1075runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(runningFoldIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(runningFoldIndexed);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UShort.m310boximpl(UShortArray.m374getMh2AYeg(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-mwnnOCs  reason: not valid java name */
    private static final <R> List<R> m1076runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(runningFoldIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(runningFoldIndexed);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, ULong.m203boximpl(ULongArray.m269getsVKNKU(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-yVwIW0Q  reason: not valid java name */
    private static final <R> List<R> m1077runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(runningFoldIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(runningFoldIndexed);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UInt.m124boximpl(UIntArray.m190getpVg5ArA(runningFoldIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-ELGow60  reason: not valid java name */
    private static final List<UByte> m1078runningReduceELGow60(byte[] runningReduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(runningReduce)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(runningReduce));
        arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
        int m112getSizeimpl = UByteArray.m112getSizeimpl(runningReduce);
        for (int i4 = 1; i4 < m112getSizeimpl; i4++) {
            m111getw2LRezQ = operation.invoke(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(runningReduce, i4))).m103unboximpl();
            arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-WyvcNBI  reason: not valid java name */
    private static final List<UInt> m1079runningReduceWyvcNBI(int[] runningReduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(runningReduce)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(runningReduce));
        arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
        int m191getSizeimpl = UIntArray.m191getSizeimpl(runningReduce);
        for (int i4 = 1; i4 < m191getSizeimpl; i4++) {
            m190getpVg5ArA = operation.invoke(UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(runningReduce, i4))).m182unboximpl();
            arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-s8dVfGU  reason: not valid java name */
    private static final List<ULong> m1080runningReduces8dVfGU(long[] runningReduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(runningReduce)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(runningReduce, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(runningReduce));
        arrayList.add(ULong.m203boximpl(m269getsVKNKU));
        int m270getSizeimpl = ULongArray.m270getSizeimpl(runningReduce);
        for (int i4 = 1; i4 < m270getSizeimpl; i4++) {
            m269getsVKNKU = operation.invoke(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(runningReduce, i4))).m261unboximpl();
            arrayList.add(ULong.m203boximpl(m269getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-xzaTVY8  reason: not valid java name */
    private static final List<UShort> m1081runningReducexzaTVY8(short[] runningReduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(runningReduce)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(runningReduce));
        arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
        int m375getSizeimpl = UShortArray.m375getSizeimpl(runningReduce);
        for (int i4 = 1; i4 < m375getSizeimpl; i4++) {
            m374getMh2AYeg = operation.invoke(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(runningReduce, i4))).m366unboximpl();
            arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-D40WMg8  reason: not valid java name */
    private static final List<UInt> m1082runningReduceIndexedD40WMg8(int[] runningReduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(runningReduceIndexed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        int m190getpVg5ArA = UIntArray.m190getpVg5ArA(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(runningReduceIndexed));
        arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
        int m191getSizeimpl = UIntArray.m191getSizeimpl(runningReduceIndexed);
        for (int i4 = 1; i4 < m191getSizeimpl; i4++) {
            m190getpVg5ArA = operation.invoke(Integer.valueOf(i4), UInt.m124boximpl(m190getpVg5ArA), UInt.m124boximpl(UIntArray.m190getpVg5ArA(runningReduceIndexed, i4))).m182unboximpl();
            arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-EOyYB1Y  reason: not valid java name */
    private static final List<UByte> m1083runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(runningReduceIndexed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(runningReduceIndexed));
        arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
        int m112getSizeimpl = UByteArray.m112getSizeimpl(runningReduceIndexed);
        for (int i4 = 1; i4 < m112getSizeimpl; i4++) {
            m111getw2LRezQ = operation.invoke(Integer.valueOf(i4), UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(UByteArray.m111getw2LRezQ(runningReduceIndexed, i4))).m103unboximpl();
            arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-aLgx1Fo  reason: not valid java name */
    private static final List<UShort> m1084runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(runningReduceIndexed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(runningReduceIndexed));
        arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
        int m375getSizeimpl = UShortArray.m375getSizeimpl(runningReduceIndexed);
        for (int i4 = 1; i4 < m375getSizeimpl; i4++) {
            m374getMh2AYeg = operation.invoke(Integer.valueOf(i4), UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(UShortArray.m374getMh2AYeg(runningReduceIndexed, i4))).m366unboximpl();
            arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-z1zDJgo  reason: not valid java name */
    private static final List<ULong> m1085runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(runningReduceIndexed)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        long m269getsVKNKU = ULongArray.m269getsVKNKU(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(runningReduceIndexed));
        arrayList.add(ULong.m203boximpl(m269getsVKNKU));
        int m270getSizeimpl = ULongArray.m270getSizeimpl(runningReduceIndexed);
        for (int i4 = 1; i4 < m270getSizeimpl; i4++) {
            m269getsVKNKU = operation.invoke(Integer.valueOf(i4), ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(ULongArray.m269getsVKNKU(runningReduceIndexed, i4))).m261unboximpl();
            arrayList.add(ULong.m203boximpl(m269getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-A8wKCXQ  reason: not valid java name */
    private static final <R> List<R> m1086scanA8wKCXQ(long[] scan, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(scan)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(scan);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            r4 = operation.invoke(r4, ULong.m203boximpl(ULongArray.m269getsVKNKU(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-yXmHNn8  reason: not valid java name */
    private static final <R> List<R> m1087scanyXmHNn8(byte[] scan, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(scan)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(scan);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UByte.m47boximpl(UByteArray.m111getw2LRezQ(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-zi1B2BA  reason: not valid java name */
    private static final <R> List<R> m1088scanzi1B2BA(int[] scan, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(scan)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(scan);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UInt.m124boximpl(UIntArray.m190getpVg5ArA(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-zww5nb8  reason: not valid java name */
    private static final <R> List<R> m1089scanzww5nb8(short[] scan, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(scan)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(scan);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            r4 = operation.invoke(r4, UShort.m310boximpl(UShortArray.m374getMh2AYeg(scan, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-3iWJZGE  reason: not valid java name */
    private static final <R> List<R> m1090scanIndexed3iWJZGE(byte[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m114isEmptyimpl(scanIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UByteArray.m112getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(scanIndexed);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UByte.m47boximpl(UByteArray.m111getw2LRezQ(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-bzxtMww  reason: not valid java name */
    private static final <R> List<R> m1091scanIndexedbzxtMww(short[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m377isEmptyimpl(scanIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UShortArray.m375getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(scanIndexed);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UShort.m310boximpl(UShortArray.m374getMh2AYeg(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-mwnnOCs  reason: not valid java name */
    private static final <R> List<R> m1092scanIndexedmwnnOCs(long[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m272isEmptyimpl(scanIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(ULongArray.m270getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(scanIndexed);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, ULong.m203boximpl(ULongArray.m269getsVKNKU(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-yVwIW0Q  reason: not valid java name */
    private static final <R> List<R> m1093scanIndexedyVwIW0Q(int[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m193isEmptyimpl(scanIndexed)) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(UIntArray.m191getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(scanIndexed);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, UInt.m124boximpl(UIntArray.m190getpVg5ArA(scanIndexed, i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle--ajY-9A  reason: not valid java name */
    public static final void m1094shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1095shuffle2D5oskM(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-2D5oskM  reason: not valid java name */
    public static final void m1095shuffle2D5oskM(@NotNull int[] shuffle, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(shuffle, lastIndex);
            UIntArray.m195setVXSXFK8(shuffle, lastIndex, UIntArray.m190getpVg5ArA(shuffle, nextInt));
            UIntArray.m195setVXSXFK8(shuffle, nextInt, m190getpVg5ArA);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-GBYM_sE  reason: not valid java name */
    public static final void m1096shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1099shuffleoSF2wD8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-JzugnMA  reason: not valid java name */
    public static final void m1097shuffleJzugnMA(@NotNull long[] shuffle, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long m269getsVKNKU = ULongArray.m269getsVKNKU(shuffle, lastIndex);
            ULongArray.m274setk8EXiF4(shuffle, lastIndex, ULongArray.m269getsVKNKU(shuffle, nextInt));
            ULongArray.m274setk8EXiF4(shuffle, nextInt, m269getsVKNKU);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-QwZRm1k  reason: not valid java name */
    public static final void m1098shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1097shuffleJzugnMA(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-oSF2wD8  reason: not valid java name */
    public static final void m1099shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(shuffle, lastIndex);
            UByteArray.m116setVurrAj0(shuffle, lastIndex, UByteArray.m111getw2LRezQ(shuffle, nextInt));
            UByteArray.m116setVurrAj0(shuffle, nextInt, m111getw2LRezQ);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-rL5Bavg  reason: not valid java name */
    public static final void m1100shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1101shuffles5X_as8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-s5X_as8  reason: not valid java name */
    public static final void m1101shuffles5X_as8(@NotNull short[] shuffle, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(shuffle, lastIndex);
            UShortArray.m379set01HTLdE(shuffle, lastIndex, UShortArray.m374getMh2AYeg(shuffle, nextInt));
            UShortArray.m379set01HTLdE(shuffle, nextInt, m374getMh2AYeg);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single--ajY-9A  reason: not valid java name */
    private static final int m1102singleajY9A(int[] single) {
        int single2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return UInt.m130constructorimpl(single2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-GBYM_sE  reason: not valid java name */
    private static final byte m1103singleGBYM_sE(byte[] single) {
        byte single2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return UByte.m53constructorimpl(single2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-JOV_ifY  reason: not valid java name */
    private static final byte m1104singleJOV_ifY(byte[] single, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(single);
        UByte uByte = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(single, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                if (!z4) {
                    uByte = UByte.m47boximpl(m111getw2LRezQ);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            return uByte.m103unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-MShoTSo  reason: not valid java name */
    private static final long m1105singleMShoTSo(long[] single, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(single);
        ULong uLong = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(single, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                if (!z4) {
                    uLong = ULong.m203boximpl(m269getsVKNKU);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            return uLong.m261unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-QwZRm1k  reason: not valid java name */
    private static final long m1106singleQwZRm1k(long[] single) {
        long single2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return ULong.m209constructorimpl(single2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-jgv0xPQ  reason: not valid java name */
    private static final int m1107singlejgv0xPQ(int[] single, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(single);
        UInt uInt = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(single, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                if (!z4) {
                    uInt = UInt.m124boximpl(m190getpVg5ArA);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            return uInt.m182unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-rL5Bavg  reason: not valid java name */
    private static final short m1108singlerL5Bavg(short[] single) {
        short single2;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return UShort.m316constructorimpl(single2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-xTcfx_M  reason: not valid java name */
    private static final short m1109singlexTcfx_M(short[] single, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(single);
        UShort uShort = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(single, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                if (!z4) {
                    uShort = UShort.m310boximpl(m374getMh2AYeg);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            return uShort.m366unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull--ajY-9A  reason: not valid java name */
    public static final UInt m1110singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m191getSizeimpl(singleOrNull) == 1) {
            return UInt.m124boximpl(UIntArray.m190getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-GBYM_sE  reason: not valid java name */
    public static final UByte m1111singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m112getSizeimpl(singleOrNull) == 1) {
            return UByte.m47boximpl(UByteArray.m111getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-JOV_ifY  reason: not valid java name */
    private static final UByte m1112singleOrNullJOV_ifY(byte[] singleOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(singleOrNull);
        UByte uByte = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(singleOrNull, i4);
            if (predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uByte = UByte.m47boximpl(m111getw2LRezQ);
                z4 = true;
            }
        }
        if (z4) {
            return uByte;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-MShoTSo  reason: not valid java name */
    private static final ULong m1113singleOrNullMShoTSo(long[] singleOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(singleOrNull);
        ULong uLong = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(singleOrNull, i4);
            if (predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uLong = ULong.m203boximpl(m269getsVKNKU);
                z4 = true;
            }
        }
        if (z4) {
            return uLong;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-QwZRm1k  reason: not valid java name */
    public static final ULong m1114singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m270getSizeimpl(singleOrNull) == 1) {
            return ULong.m203boximpl(ULongArray.m269getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-jgv0xPQ  reason: not valid java name */
    private static final UInt m1115singleOrNulljgv0xPQ(int[] singleOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(singleOrNull);
        UInt uInt = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(singleOrNull, i4);
            if (predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uInt = UInt.m124boximpl(m190getpVg5ArA);
                z4 = true;
            }
        }
        if (z4) {
            return uInt;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* renamed from: singleOrNull-rL5Bavg  reason: not valid java name */
    public static final UShort m1116singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m375getSizeimpl(singleOrNull) == 1) {
            return UShort.m310boximpl(UShortArray.m374getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-xTcfx_M  reason: not valid java name */
    private static final UShort m1117singleOrNullxTcfx_M(short[] singleOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(singleOrNull);
        UShort uShort = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(singleOrNull, i4);
            if (predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uShort = UShort.m310boximpl(m374getMh2AYeg);
                z4 = true;
            }
        }
        if (z4) {
            return uShort;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-F7u83W8  reason: not valid java name */
    public static final List<ULong> m1118sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(ULong.m203boximpl(ULongArray.m269getsVKNKU(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-HwE9HBo  reason: not valid java name */
    public static final List<UInt> m1119sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UInt.m124boximpl(UIntArray.m190getpVg5ArA(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-JGPC0-M  reason: not valid java name */
    public static final List<UShort> m1120sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UShort.m310boximpl(UShortArray.m374getMh2AYeg(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-JQknh5Q  reason: not valid java name */
    public static final List<UByte> m1121sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(UByte.m47boximpl(UByteArray.m111getw2LRezQ(slice, num.intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-Q6IL4kU  reason: not valid java name */
    public static final List<UShort> m1122sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        short[] copyOfRange;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return UArraysKt___UArraysJvmKt.m513asListrL5Bavg(UShortArray.m369constructorimpl(copyOfRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-ZRhS8yI  reason: not valid java name */
    public static final List<ULong> m1123sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        long[] copyOfRange;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return UArraysKt___UArraysJvmKt.m512asListQwZRm1k(ULongArray.m264constructorimpl(copyOfRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-c0bezYM  reason: not valid java name */
    public static final List<UByte> m1124slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        byte[] copyOfRange;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return UArraysKt___UArraysJvmKt.m511asListGBYM_sE(UByteArray.m106constructorimpl(copyOfRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: slice-tAntMlw  reason: not valid java name */
    public static final List<UInt> m1125slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        int[] copyOfRange;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return UArraysKt___UArraysJvmKt.m510asListajY9A(UIntArray.m185constructorimpl(copyOfRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-CFIt9YE  reason: not valid java name */
    public static final int[] m1126sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        int[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UIntArray.m185constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-Q6IL4kU  reason: not valid java name */
    public static final short[] m1127sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        short[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UShortArray.m369constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-ZRhS8yI  reason: not valid java name */
    public static final long[] m1128sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        long[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return ULongArray.m264constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-c0bezYM  reason: not valid java name */
    public static final byte[] m1129sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        byte[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UByteArray.m106constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-kzHmqpY  reason: not valid java name */
    public static final long[] m1130sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        long[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return ULongArray.m264constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-ojwP5H8  reason: not valid java name */
    public static final short[] m1131sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        short[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UShortArray.m369constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-tAntMlw  reason: not valid java name */
    public static final int[] m1132sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        int[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UIntArray.m185constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sliceArray-xo_DsdI  reason: not valid java name */
    public static final byte[] m1133sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        byte[] sliceArray2;
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return UByteArray.m106constructorimpl(sliceArray2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--ajY-9A  reason: not valid java name */
    public static final void m1134sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m191getSizeimpl(sort) > 1) {
            UArraySortingKt.m501sortArrayoBK06Vg(sort, 0, UIntArray.m191getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--nroSd4  reason: not valid java name */
    public static final void m1135sortnroSd4(@NotNull long[] sort, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, ULongArray.m270getSizeimpl(sort));
        UArraySortingKt.m498sortArraynroSd4(sort, i4, i5);
    }

    /* renamed from: sort--nroSd4$default  reason: not valid java name */
    public static /* synthetic */ void m1136sortnroSd4$default(long[] jArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = ULongArray.m270getSizeimpl(jArr);
        }
        m1135sortnroSd4(jArr, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-4UcCI2c  reason: not valid java name */
    public static final void m1137sort4UcCI2c(@NotNull byte[] sort, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, UByteArray.m112getSizeimpl(sort));
        UArraySortingKt.m499sortArray4UcCI2c(sort, i4, i5);
    }

    /* renamed from: sort-4UcCI2c$default  reason: not valid java name */
    public static /* synthetic */ void m1138sort4UcCI2c$default(byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = UByteArray.m112getSizeimpl(bArr);
        }
        m1137sort4UcCI2c(bArr, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-Aa5vz7o  reason: not valid java name */
    public static final void m1139sortAa5vz7o(@NotNull short[] sort, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, UShortArray.m375getSizeimpl(sort));
        UArraySortingKt.m500sortArrayAa5vz7o(sort, i4, i5);
    }

    /* renamed from: sort-Aa5vz7o$default  reason: not valid java name */
    public static /* synthetic */ void m1140sortAa5vz7o$default(short[] sArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = UShortArray.m375getSizeimpl(sArr);
        }
        m1139sortAa5vz7o(sArr, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-GBYM_sE  reason: not valid java name */
    public static final void m1141sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m112getSizeimpl(sort) > 1) {
            UArraySortingKt.m499sortArray4UcCI2c(sort, 0, UByteArray.m112getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-QwZRm1k  reason: not valid java name */
    public static final void m1142sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m270getSizeimpl(sort) > 1) {
            UArraySortingKt.m498sortArraynroSd4(sort, 0, ULongArray.m270getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-oBK06Vg  reason: not valid java name */
    public static final void m1143sortoBK06Vg(@NotNull int[] sort, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, UIntArray.m191getSizeimpl(sort));
        UArraySortingKt.m501sortArrayoBK06Vg(sort, i4, i5);
    }

    /* renamed from: sort-oBK06Vg$default  reason: not valid java name */
    public static /* synthetic */ void m1144sortoBK06Vg$default(int[] iArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = UIntArray.m191getSizeimpl(iArr);
        }
        m1143sortoBK06Vg(iArr, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-rL5Bavg  reason: not valid java name */
    public static final void m1145sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m375getSizeimpl(sort) > 1) {
            UArraySortingKt.m500sortArrayAa5vz7o(sort, 0, UShortArray.m375getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--ajY-9A  reason: not valid java name */
    public static final void m1146sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m191getSizeimpl(sortDescending) > 1) {
            m1134sortajY9A(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--nroSd4  reason: not valid java name */
    public static final void m1147sortDescendingnroSd4(@NotNull long[] sortDescending, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1135sortnroSd4(sortDescending, i4, i5);
        ArraysKt___ArraysKt.reverse(sortDescending, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-4UcCI2c  reason: not valid java name */
    public static final void m1148sortDescending4UcCI2c(@NotNull byte[] sortDescending, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1137sort4UcCI2c(sortDescending, i4, i5);
        ArraysKt___ArraysKt.reverse(sortDescending, i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-Aa5vz7o  reason: not valid java name */
    public static final void m1149sortDescendingAa5vz7o(@NotNull short[] sortDescending, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1139sortAa5vz7o(sortDescending, i4, i5);
        ArraysKt___ArraysKt.reverse(sortDescending, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-GBYM_sE  reason: not valid java name */
    public static final void m1150sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m112getSizeimpl(sortDescending) > 1) {
            m1141sortGBYM_sE(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-QwZRm1k  reason: not valid java name */
    public static final void m1151sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m270getSizeimpl(sortDescending) > 1) {
            m1142sortQwZRm1k(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-oBK06Vg  reason: not valid java name */
    public static final void m1152sortDescendingoBK06Vg(@NotNull int[] sortDescending, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1143sortoBK06Vg(sortDescending, i4, i5);
        ArraysKt___ArraysKt.reverse(sortDescending, i4, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-rL5Bavg  reason: not valid java name */
    public static final void m1153sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m375getSizeimpl(sortDescending) > 1) {
            m1145sortrL5Bavg(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted--ajY-9A  reason: not valid java name */
    public static final List<UInt> m1154sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m185constructorimpl = UIntArray.m185constructorimpl(copyOf);
        m1134sortajY9A(m185constructorimpl);
        return UArraysKt___UArraysJvmKt.m510asListajY9A(m185constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m1155sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m106constructorimpl = UByteArray.m106constructorimpl(copyOf);
        m1141sortGBYM_sE(m106constructorimpl);
        return UArraysKt___UArraysJvmKt.m511asListGBYM_sE(m106constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m1156sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m264constructorimpl = ULongArray.m264constructorimpl(copyOf);
        m1142sortQwZRm1k(m264constructorimpl);
        return UArraysKt___UArraysJvmKt.m512asListQwZRm1k(m264constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sorted-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m1157sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m369constructorimpl = UShortArray.m369constructorimpl(copyOf);
        m1145sortrL5Bavg(m369constructorimpl);
        return UArraysKt___UArraysJvmKt.m513asListrL5Bavg(m369constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray--ajY-9A  reason: not valid java name */
    public static final int[] m1158sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m193isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m185constructorimpl = UIntArray.m185constructorimpl(copyOf);
        m1134sortajY9A(m185constructorimpl);
        return m185constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-GBYM_sE  reason: not valid java name */
    public static final byte[] m1159sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m114isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m106constructorimpl = UByteArray.m106constructorimpl(copyOf);
        m1141sortGBYM_sE(m106constructorimpl);
        return m106constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-QwZRm1k  reason: not valid java name */
    public static final long[] m1160sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m272isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m264constructorimpl = ULongArray.m264constructorimpl(copyOf);
        m1142sortQwZRm1k(m264constructorimpl);
        return m264constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArray-rL5Bavg  reason: not valid java name */
    public static final short[] m1161sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m377isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m369constructorimpl = UShortArray.m369constructorimpl(copyOf);
        m1145sortrL5Bavg(m369constructorimpl);
        return m369constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending--ajY-9A  reason: not valid java name */
    public static final int[] m1162sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m193isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m185constructorimpl = UIntArray.m185constructorimpl(copyOf);
        m1146sortDescendingajY9A(m185constructorimpl);
        return m185constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-GBYM_sE  reason: not valid java name */
    public static final byte[] m1163sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m114isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m106constructorimpl = UByteArray.m106constructorimpl(copyOf);
        m1150sortDescendingGBYM_sE(m106constructorimpl);
        return m106constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-QwZRm1k  reason: not valid java name */
    public static final long[] m1164sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m272isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m264constructorimpl = ULongArray.m264constructorimpl(copyOf);
        m1151sortDescendingQwZRm1k(m264constructorimpl);
        return m264constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedArrayDescending-rL5Bavg  reason: not valid java name */
    public static final short[] m1165sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m377isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m369constructorimpl = UShortArray.m369constructorimpl(copyOf);
        m1153sortDescendingrL5Bavg(m369constructorimpl);
        return m369constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending--ajY-9A  reason: not valid java name */
    public static final List<UInt> m1166sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m185constructorimpl = UIntArray.m185constructorimpl(copyOf);
        m1134sortajY9A(m185constructorimpl);
        return m1062reversedajY9A(m185constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-GBYM_sE  reason: not valid java name */
    public static final List<UByte> m1167sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m106constructorimpl = UByteArray.m106constructorimpl(copyOf);
        m1141sortGBYM_sE(m106constructorimpl);
        return m1063reversedGBYM_sE(m106constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-QwZRm1k  reason: not valid java name */
    public static final List<ULong> m1168sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m264constructorimpl = ULongArray.m264constructorimpl(copyOf);
        m1142sortQwZRm1k(m264constructorimpl);
        return m1064reversedQwZRm1k(m264constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: sortedDescending-rL5Bavg  reason: not valid java name */
    public static final List<UShort> m1169sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m369constructorimpl = UShortArray.m369constructorimpl(copyOf);
        m1145sortrL5Bavg(m369constructorimpl);
        return m1065reversedrL5Bavg(m369constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum--ajY-9A  reason: not valid java name */
    private static final int m1170sumajY9A(int[] sum) {
        int sum2;
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        sum2 = ArraysKt___ArraysKt.sum(sum);
        return UInt.m130constructorimpl(sum2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-GBYM_sE  reason: not valid java name */
    private static final int m1171sumGBYM_sE(byte[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sum);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + UInt.m130constructorimpl(UByteArray.m111getw2LRezQ(sum, i4) & 255));
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-QwZRm1k  reason: not valid java name */
    private static final long m1172sumQwZRm1k(long[] sum) {
        long sum2;
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        sum2 = ArraysKt___ArraysKt.sum(sum);
        return ULong.m209constructorimpl(sum2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-rL5Bavg  reason: not valid java name */
    private static final int m1173sumrL5Bavg(short[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sum);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + UInt.m130constructorimpl(UShortArray.m374getMh2AYeg(sum, i4) & UShort.MAX_VALUE));
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-JOV_ifY  reason: not valid java name */
    private static final int m1174sumByJOV_ifY(byte[] sumBy, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < m112getSizeimpl; i5++) {
            i4 = UInt.m130constructorimpl(i4 + selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumBy, i5))).m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-MShoTSo  reason: not valid java name */
    private static final int m1175sumByMShoTSo(long[] sumBy, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < m270getSizeimpl; i5++) {
            i4 = UInt.m130constructorimpl(i4 + selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumBy, i5))).m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-jgv0xPQ  reason: not valid java name */
    private static final int m1176sumByjgv0xPQ(int[] sumBy, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < m191getSizeimpl; i5++) {
            i4 = UInt.m130constructorimpl(i4 + selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumBy, i5))).m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-xTcfx_M  reason: not valid java name */
    private static final int m1177sumByxTcfx_M(short[] sumBy, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumBy);
        int i4 = 0;
        for (int i5 = 0; i5 < m375getSizeimpl; i5++) {
            i4 = UInt.m130constructorimpl(i4 + selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumBy, i5))).m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-JOV_ifY  reason: not valid java name */
    private static final double m1178sumByDoubleJOV_ifY(byte[] sumByDouble, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            d5 += selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumByDouble, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-MShoTSo  reason: not valid java name */
    private static final double m1179sumByDoubleMShoTSo(long[] sumByDouble, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            d5 += selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumByDouble, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-jgv0xPQ  reason: not valid java name */
    private static final double m1180sumByDoublejgv0xPQ(int[] sumByDouble, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            d5 += selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumByDouble, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-xTcfx_M  reason: not valid java name */
    private static final double m1181sumByDoublexTcfx_M(short[] sumByDouble, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            d5 += selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumByDouble, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] sumOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            d5 += selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumOf, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(int[] sumOf, Function1<? super UInt, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < m191getSizeimpl; i5++) {
            i4 += selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumOf, i5))).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] sumOf, Function1<? super UInt, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            j4 += selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumOf, i4))).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int i4 = 0;
        for (UByte uByte : uByteArr) {
            i4 = UInt.m130constructorimpl(i4 + UInt.m130constructorimpl(uByte.m103unboximpl() & 255));
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(int[] sumOf, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumOf, i4))).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(int[] sumOf, Function1<? super UInt, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        int m191getSizeimpl = UIntArray.m191getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(sumOf, i4))).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int i4 = 0;
        for (UShort uShort : uShortArr) {
            i4 = UInt.m130constructorimpl(i4 + UInt.m130constructorimpl(uShort.m366unboximpl() & UShort.MAX_VALUE));
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-PpDY95g  reason: not valid java name */
    public static final List<UByte> m1182takePpDY95g(@NotNull byte[] take, int i4) {
        List<UByte> listOf;
        List<UByte> list;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= UByteArray.m112getSizeimpl(take)) {
            list = CollectionsKt___CollectionsKt.toList(UByteArray.m104boximpl(take));
            return list;
        } else if (i4 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(UByte.m47boximpl(UByteArray.m111getw2LRezQ(take, 0)));
            return listOf;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            int m112getSizeimpl = UByteArray.m112getSizeimpl(take);
            int i5 = 0;
            for (int i6 = 0; i6 < m112getSizeimpl; i6++) {
                arrayList.add(UByte.m47boximpl(UByteArray.m111getw2LRezQ(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-nggk6HY  reason: not valid java name */
    public static final List<UShort> m1183takenggk6HY(@NotNull short[] take, int i4) {
        List<UShort> listOf;
        List<UShort> list;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= UShortArray.m375getSizeimpl(take)) {
            list = CollectionsKt___CollectionsKt.toList(UShortArray.m367boximpl(take));
            return list;
        } else if (i4 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(UShort.m310boximpl(UShortArray.m374getMh2AYeg(take, 0)));
            return listOf;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            int m375getSizeimpl = UShortArray.m375getSizeimpl(take);
            int i5 = 0;
            for (int i6 = 0; i6 < m375getSizeimpl; i6++) {
                arrayList.add(UShort.m310boximpl(UShortArray.m374getMh2AYeg(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m1184takeqFRl0hI(@NotNull int[] take, int i4) {
        List<UInt> listOf;
        List<UInt> list;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= UIntArray.m191getSizeimpl(take)) {
            list = CollectionsKt___CollectionsKt.toList(UIntArray.m183boximpl(take));
            return list;
        } else if (i4 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(UInt.m124boximpl(UIntArray.m190getpVg5ArA(take, 0)));
            return listOf;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            int m191getSizeimpl = UIntArray.m191getSizeimpl(take);
            int i5 = 0;
            for (int i6 = 0; i6 < m191getSizeimpl; i6++) {
                arrayList.add(UInt.m124boximpl(UIntArray.m190getpVg5ArA(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: take-r7IrZao  reason: not valid java name */
    public static final List<ULong> m1185taker7IrZao(@NotNull long[] take, int i4) {
        List<ULong> listOf;
        List<ULong> list;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= ULongArray.m270getSizeimpl(take)) {
            list = CollectionsKt___CollectionsKt.toList(ULongArray.m262boximpl(take));
            return list;
        } else if (i4 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(ULong.m203boximpl(ULongArray.m269getsVKNKU(take, 0)));
            return listOf;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            int m270getSizeimpl = ULongArray.m270getSizeimpl(take);
            int i5 = 0;
            for (int i6 = 0; i6 < m270getSizeimpl; i6++) {
                arrayList.add(ULong.m203boximpl(ULongArray.m269getsVKNKU(take, i6)));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-PpDY95g  reason: not valid java name */
    public static final List<UByte> m1186takeLastPpDY95g(@NotNull byte[] takeLast, int i4) {
        List<UByte> listOf;
        List<UByte> list;
        List<UByte> emptyList;
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int m112getSizeimpl = UByteArray.m112getSizeimpl(takeLast);
            if (i4 >= m112getSizeimpl) {
                list = CollectionsKt___CollectionsKt.toList(UByteArray.m104boximpl(takeLast));
                return list;
            } else if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(UByte.m47boximpl(UByteArray.m111getw2LRezQ(takeLast, m112getSizeimpl - 1)));
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = m112getSizeimpl - i4; i5 < m112getSizeimpl; i5++) {
                    arrayList.add(UByte.m47boximpl(UByteArray.m111getw2LRezQ(takeLast, i5)));
                }
                return arrayList;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-nggk6HY  reason: not valid java name */
    public static final List<UShort> m1187takeLastnggk6HY(@NotNull short[] takeLast, int i4) {
        List<UShort> listOf;
        List<UShort> list;
        List<UShort> emptyList;
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int m375getSizeimpl = UShortArray.m375getSizeimpl(takeLast);
            if (i4 >= m375getSizeimpl) {
                list = CollectionsKt___CollectionsKt.toList(UShortArray.m367boximpl(takeLast));
                return list;
            } else if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(UShort.m310boximpl(UShortArray.m374getMh2AYeg(takeLast, m375getSizeimpl - 1)));
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = m375getSizeimpl - i4; i5 < m375getSizeimpl; i5++) {
                    arrayList.add(UShort.m310boximpl(UShortArray.m374getMh2AYeg(takeLast, i5)));
                }
                return arrayList;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-qFRl0hI  reason: not valid java name */
    public static final List<UInt> m1188takeLastqFRl0hI(@NotNull int[] takeLast, int i4) {
        List<UInt> listOf;
        List<UInt> list;
        List<UInt> emptyList;
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int m191getSizeimpl = UIntArray.m191getSizeimpl(takeLast);
            if (i4 >= m191getSizeimpl) {
                list = CollectionsKt___CollectionsKt.toList(UIntArray.m183boximpl(takeLast));
                return list;
            } else if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(UInt.m124boximpl(UIntArray.m190getpVg5ArA(takeLast, m191getSizeimpl - 1)));
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = m191getSizeimpl - i4; i5 < m191getSizeimpl; i5++) {
                    arrayList.add(UInt.m124boximpl(UIntArray.m190getpVg5ArA(takeLast, i5)));
                }
                return arrayList;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: takeLast-r7IrZao  reason: not valid java name */
    public static final List<ULong> m1189takeLastr7IrZao(@NotNull long[] takeLast, int i4) {
        List<ULong> listOf;
        List<ULong> list;
        List<ULong> emptyList;
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int m270getSizeimpl = ULongArray.m270getSizeimpl(takeLast);
            if (i4 >= m270getSizeimpl) {
                list = CollectionsKt___CollectionsKt.toList(ULongArray.m262boximpl(takeLast));
                return list;
            } else if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(ULong.m203boximpl(ULongArray.m269getsVKNKU(takeLast, m270getSizeimpl - 1)));
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = m270getSizeimpl - i4; i5 < m270getSizeimpl; i5++) {
                    arrayList.add(ULong.m203boximpl(ULongArray.m269getsVKNKU(takeLast, i5)));
                }
                return arrayList;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m1190takeLastWhileJOV_ifY(byte[] takeLastWhile, Function1<? super UByte, Boolean> predicate) {
        int lastIndex;
        List<UByte> list;
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(takeLastWhile, lastIndex))).booleanValue()) {
                return m658dropPpDY95g(takeLastWhile, lastIndex + 1);
            }
        }
        list = CollectionsKt___CollectionsKt.toList(UByteArray.m104boximpl(takeLastWhile));
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-MShoTSo  reason: not valid java name */
    private static final List<ULong> m1191takeLastWhileMShoTSo(long[] takeLastWhile, Function1<? super ULong, Boolean> predicate) {
        int lastIndex;
        List<ULong> list;
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(takeLastWhile, lastIndex))).booleanValue()) {
                return m661dropr7IrZao(takeLastWhile, lastIndex + 1);
            }
        }
        list = CollectionsKt___CollectionsKt.toList(ULongArray.m262boximpl(takeLastWhile));
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m1192takeLastWhilejgv0xPQ(int[] takeLastWhile, Function1<? super UInt, Boolean> predicate) {
        int lastIndex;
        List<UInt> list;
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(takeLastWhile, lastIndex))).booleanValue()) {
                return m660dropqFRl0hI(takeLastWhile, lastIndex + 1);
            }
        }
        list = CollectionsKt___CollectionsKt.toList(UIntArray.m183boximpl(takeLastWhile));
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m1193takeLastWhilexTcfx_M(short[] takeLastWhile, Function1<? super UShort, Boolean> predicate) {
        int lastIndex;
        List<UShort> list;
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(takeLastWhile, lastIndex))).booleanValue()) {
                return m659dropnggk6HY(takeLastWhile, lastIndex + 1);
            }
        }
        list = CollectionsKt___CollectionsKt.toList(UShortArray.m367boximpl(takeLastWhile));
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-JOV_ifY  reason: not valid java name */
    private static final List<UByte> m1194takeWhileJOV_ifY(byte[] takeWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m112getSizeimpl = UByteArray.m112getSizeimpl(takeWhile);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(takeWhile, i4);
            if (!predicate.invoke(UByte.m47boximpl(m111getw2LRezQ)).booleanValue()) {
                break;
            }
            arrayList.add(UByte.m47boximpl(m111getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-MShoTSo  reason: not valid java name */
    private static final List<ULong> m1195takeWhileMShoTSo(long[] takeWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m270getSizeimpl = ULongArray.m270getSizeimpl(takeWhile);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(takeWhile, i4);
            if (!predicate.invoke(ULong.m203boximpl(m269getsVKNKU)).booleanValue()) {
                break;
            }
            arrayList.add(ULong.m203boximpl(m269getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-jgv0xPQ  reason: not valid java name */
    private static final List<UInt> m1196takeWhilejgv0xPQ(int[] takeWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m191getSizeimpl = UIntArray.m191getSizeimpl(takeWhile);
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(takeWhile, i4);
            if (!predicate.invoke(UInt.m124boximpl(m190getpVg5ArA)).booleanValue()) {
                break;
            }
            arrayList.add(UInt.m124boximpl(m190getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-xTcfx_M  reason: not valid java name */
    private static final List<UShort> m1197takeWhilexTcfx_M(short[] takeWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m375getSizeimpl = UShortArray.m375getSizeimpl(takeWhile);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(takeWhile, i4);
            if (!predicate.invoke(UShort.m310boximpl(m374getMh2AYeg)).booleanValue()) {
                break;
            }
            arrayList.add(UShort.m310boximpl(m374getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toByteArray-GBYM_sE  reason: not valid java name */
    private static final byte[] m1198toByteArrayGBYM_sE(byte[] toByteArray) {
        Intrinsics.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toIntArray--ajY-9A  reason: not valid java name */
    private static final int[] m1199toIntArrayajY9A(int[] toIntArray) {
        Intrinsics.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toLongArray-QwZRm1k  reason: not valid java name */
    private static final long[] m1200toLongArrayQwZRm1k(long[] toLongArray) {
        Intrinsics.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toShortArray-rL5Bavg  reason: not valid java name */
    private static final short[] m1201toShortArrayrL5Bavg(short[] toShortArray) {
        Intrinsics.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray--ajY-9A  reason: not valid java name */
    public static final UInt[] m1202toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[m191getSizeimpl];
        for (int i4 = 0; i4 < m191getSizeimpl; i4++) {
            uIntArr[i4] = UInt.m124boximpl(UIntArray.m190getpVg5ArA(toTypedArray, i4));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-GBYM_sE  reason: not valid java name */
    public static final UByte[] m1203toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[m112getSizeimpl];
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            uByteArr[i4] = UByte.m47boximpl(UByteArray.m111getw2LRezQ(toTypedArray, i4));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-QwZRm1k  reason: not valid java name */
    public static final ULong[] m1204toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[m270getSizeimpl];
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            uLongArr[i4] = ULong.m203boximpl(ULongArray.m269getsVKNKU(toTypedArray, i4));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: toTypedArray-rL5Bavg  reason: not valid java name */
    public static final UShort[] m1205toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[m375getSizeimpl];
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            uShortArr[i4] = UShort.m310boximpl(UShortArray.m374getMh2AYeg(toTypedArray, i4));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = uByteArr[i4].m103unboximpl();
        }
        return UByteArray.m106constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = uIntArr[i4].m182unboximpl();
        }
        return UIntArray.m185constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = uLongArr[i4].m261unboximpl();
        }
        return ULongArray.m264constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            sArr[i4] = uShortArr[i4].m366unboximpl();
        }
        return UShortArray.m369constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex--ajY-9A  reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m1206withIndexajY9A(@NotNull final int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UInt>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends UInt> invoke() {
                return UIntArray.m194iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-GBYM_sE  reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m1207withIndexGBYM_sE(@NotNull final byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UByte>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends UByte> invoke() {
                return UByteArray.m115iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-QwZRm1k  reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m1208withIndexQwZRm1k(@NotNull final long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends ULong>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends ULong> invoke() {
                return ULongArray.m273iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: withIndex-rL5Bavg  reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m1209withIndexrL5Bavg(@NotNull final short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UShort>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends UShort> invoke() {
                return UShortArray.m378iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-7znnbtw  reason: not valid java name */
    private static final <R, V> List<V> m1210zip7znnbtw(int[] zip, Iterable<? extends R> other, Function2<? super UInt, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m191getSizeimpl));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= m191getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(zip, i4)), obj));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-8LME4QE  reason: not valid java name */
    private static final <R, V> List<V> m1211zip8LME4QE(long[] zip, R[] other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(ULongArray.m270getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-C-E_24M  reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1212zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m191getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            int m190getpVg5ArA = UIntArray.m190getpVg5ArA(zip, i4);
            arrayList.add(TuplesKt.to(UInt.m124boximpl(m190getpVg5ArA), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-F7u83W8  reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1213zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m270getSizeimpl));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= m270getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(ULong.m203boximpl(ULongArray.m269getsVKNKU(zip, i4)), r4));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-HwE9HBo  reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1214zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m191getSizeimpl));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= m191getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UInt.m124boximpl(UIntArray.m190getpVg5ArA(zip, i4)), r4));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-JAKpvQM  reason: not valid java name */
    private static final <V> List<V> m1215zipJAKpvQM(byte[] zip, byte[] other, Function2<? super UByte, ? super UByte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UByteArray.m112getSizeimpl(zip), UByteArray.m112getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(zip, i4)), UByte.m47boximpl(UByteArray.m111getw2LRezQ(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-JGPC0-M  reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1216zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m375getSizeimpl));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= m375getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UShort.m310boximpl(UShortArray.m374getMh2AYeg(zip, i4)), r4));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-JQknh5Q  reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1217zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m112getSizeimpl));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= m112getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UByte.m47boximpl(UByteArray.m111getw2LRezQ(zip, i4)), r4));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-L83TJbI  reason: not valid java name */
    private static final <V> List<V> m1218zipL83TJbI(int[] zip, int[] other, Function2<? super UInt, ? super UInt, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UIntArray.m191getSizeimpl(zip), UIntArray.m191getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(zip, i4)), UInt.m124boximpl(UIntArray.m190getpVg5ArA(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-LuipOMY  reason: not valid java name */
    private static final <R, V> List<V> m1219zipLuipOMY(byte[] zip, R[] other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UByteArray.m112getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-PabeH-Q  reason: not valid java name */
    private static final <V> List<V> m1220zipPabeHQ(long[] zip, long[] other, Function2<? super ULong, ? super ULong, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(ULongArray.m270getSizeimpl(zip), ULongArray.m270getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(zip, i4)), ULong.m203boximpl(ULongArray.m269getsVKNKU(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-TUPTUsU  reason: not valid java name */
    private static final <R, V> List<V> m1221zipTUPTUsU(long[] zip, Iterable<? extends R> other, Function2<? super ULong, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m270getSizeimpl));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= m270getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(zip, i4)), obj));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-UCnP4_w  reason: not valid java name */
    private static final <R, V> List<V> m1222zipUCnP4_w(byte[] zip, Iterable<? extends R> other, Function2<? super UByte, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m112getSizeimpl));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= m112getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(zip, i4)), obj));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-ZjwqOic  reason: not valid java name */
    private static final <R, V> List<V> m1223zipZjwqOic(int[] zip, R[] other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UIntArray.m191getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-ctEhBpI  reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m1224zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m191getSizeimpl(zip), UIntArray.m191getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(UInt.m124boximpl(UIntArray.m190getpVg5ArA(zip, i4)), UInt.m124boximpl(UIntArray.m190getpVg5ArA(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-ePBmRWY  reason: not valid java name */
    private static final <R, V> List<V> m1225zipePBmRWY(short[] zip, R[] other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UShortArray.m375getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(zip, i4)), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-f7H3mmw  reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1226zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m270getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(zip, i4);
            arrayList.add(TuplesKt.to(ULong.m203boximpl(m269getsVKNKU), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-gVVukQo  reason: not valid java name */
    private static final <V> List<V> m1227zipgVVukQo(short[] zip, short[] other, Function2<? super UShort, ? super UShort, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UShortArray.m375getSizeimpl(zip), UShortArray.m375getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(zip, i4)), UShort.m310boximpl(UShortArray.m374getMh2AYeg(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-kBb4a-s  reason: not valid java name */
    private static final <R, V> List<V> m1228zipkBb4as(short[] zip, Iterable<? extends R> other, Function2<? super UShort, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m375getSizeimpl));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= m375getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(zip, i4)), obj));
            i4++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-kdPth3s  reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m1229zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m112getSizeimpl(zip), UByteArray.m112getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(UByte.m47boximpl(UByteArray.m111getw2LRezQ(zip, i4)), UByte.m47boximpl(UByteArray.m111getw2LRezQ(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-mazbYpA  reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m1230zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m375getSizeimpl(zip), UShortArray.m375getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(UShort.m310boximpl(UShortArray.m374getMh2AYeg(zip, i4)), UShort.m310boximpl(UShortArray.m374getMh2AYeg(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-nl983wc  reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1231zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m112getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(zip, i4);
            arrayList.add(TuplesKt.to(UByte.m47boximpl(m111getw2LRezQ), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-uaTIQ5s  reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1232zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m375getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(zip, i4);
            arrayList.add(TuplesKt.to(UShort.m310boximpl(m374getMh2AYeg), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: zip-us8wMrg  reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m1233zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m270getSizeimpl(zip), ULongArray.m270getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(ULong.m203boximpl(ULongArray.m269getsVKNKU(zip, i4)), ULong.m203boximpl(ULongArray.m269getsVKNKU(other, i4))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] toUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UByteArray.m106constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] toUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UIntArray.m185constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] toULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return ULongArray.m264constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] toUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UShortArray.m369constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] sumOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            d5 += selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumOf, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(long[] sumOf, Function1<? super ULong, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < m270getSizeimpl; i5++) {
            i4 += selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumOf, i5))).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] sumOf, Function1<? super ULong, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            j4 += selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumOf, i4))).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(long[] sumOf, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumOf, i4))).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(long[] sumOf, Function1<? super ULong, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        int m270getSizeimpl = ULongArray.m270getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(sumOf, i4))).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] sumOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            d5 += selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumOf, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(byte[] sumOf, Function1<? super UByte, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < m112getSizeimpl; i5++) {
            i4 += selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumOf, i5))).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] sumOf, Function1<? super UByte, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            j4 += selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumOf, i4))).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sumOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            d5 += selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumOf, i4))).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(short[] sumOf, Function1<? super UShort, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumOf);
        int i4 = 0;
        for (int i5 = 0; i5 < m375getSizeimpl; i5++) {
            i4 += selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumOf, i5))).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sumOf, Function1<? super UShort, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumOf);
        long j4 = 0;
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            j4 += selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumOf, i4))).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(byte[] sumOf, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumOf, i4))).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(byte[] sumOf, Function1<? super UByte, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        int m112getSizeimpl = UByteArray.m112getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(sumOf, i4))).m261unboximpl());
        }
        return m209constructorimpl;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY  reason: not valid java name */
    private static final float m875maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(maxOf)) {
            float floatValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo  reason: not valid java name */
    private static final float m878maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(maxOf)) {
            float floatValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ  reason: not valid java name */
    private static final float m881maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(maxOf)) {
            float floatValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M  reason: not valid java name */
    private static final float m884maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(maxOf)) {
            float floatValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY  reason: not valid java name */
    private static final Float m888maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo  reason: not valid java name */
    private static final Float m891maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final Float m894maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M  reason: not valid java name */
    private static final Float m897maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final long m912maxOrThrowU(@NotNull long[] max) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!ULongArray.m272isEmptyimpl(max)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(max, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(max, it2.nextInt());
                compare = Long.compare(m269getsVKNKU ^ Long.MIN_VALUE, m269getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final long m920maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super ULong> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m272isEmptyimpl(maxWith)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(maxWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(maxWith, it2.nextInt());
                if (comparator.compare(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(m269getsVKNKU2)) < 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY  reason: not valid java name */
    private static final float m931minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(minOf)) {
            float floatValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo  reason: not valid java name */
    private static final float m934minOfMShoTSo(long[] minOf, Function1<? super ULong, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(minOf)) {
            float floatValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ  reason: not valid java name */
    private static final float m937minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(minOf)) {
            float floatValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M  reason: not valid java name */
    private static final float m940minOfxTcfx_M(short[] minOf, Function1<? super UShort, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(minOf)) {
            float floatValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, 0))).floatValue();
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, it2.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY  reason: not valid java name */
    private static final Float m944minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo  reason: not valid java name */
    private static final Float m947minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final Float m950minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M  reason: not valid java name */
    private static final Float m953minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, 0))).floatValue();
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, it2.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final long m968minOrThrowU(@NotNull long[] min) {
        int lastIndex;
        int compare;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!ULongArray.m272isEmptyimpl(min)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(min, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(min, it2.nextInt());
                compare = Long.compare(m269getsVKNKU ^ Long.MIN_VALUE, m269getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final long m976minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super ULong> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!ULongArray.m272isEmptyimpl(minWith)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(minWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(minWith, it2.nextInt());
                if (comparator.compare(ULong.m203boximpl(m269getsVKNKU), ULong.m203boximpl(m269getsVKNKU2)) > 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m872maxByOrThrowU(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(maxBy)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(maxBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m269getsVKNKU;
            }
            R invoke = selector.invoke(ULong.m203boximpl(m269getsVKNKU));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(maxBy, it2.nextInt());
                R invoke2 = selector.invoke(ULong.m203boximpl(m269getsVKNKU2));
                if (invoke.compareTo(invoke2) < 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                    invoke = invoke2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m928minByOrThrowU(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(minBy)) {
            long m269getsVKNKU = ULongArray.m269getsVKNKU(minBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m269getsVKNKU;
            }
            R invoke = selector.invoke(ULong.m203boximpl(m269getsVKNKU));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long m269getsVKNKU2 = ULongArray.m269getsVKNKU(minBy, it2.nextInt());
                R invoke2 = selector.invoke(ULong.m203boximpl(m269getsVKNKU2));
                if (invoke.compareTo(invoke2) > 0) {
                    m269getsVKNKU = m269getsVKNKU2;
                    invoke = invoke2;
                }
            }
            return m269getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(short[] sumOf, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumOf, i4))).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(short[] sumOf, Function1<? super UShort, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        int m375getSizeimpl = UShortArray.m375getSizeimpl(sumOf);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sumOf, i4))).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int i4 = 0;
        for (UInt uInt : uIntArr) {
            i4 = UInt.m130constructorimpl(i4 + uInt.m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        long j4 = 0;
        for (ULong uLong : uLongArr) {
            j4 = ULong.m209constructorimpl(j4 + uLong.m261unboximpl());
        }
        return j4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m876maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(maxOf)) {
            R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m879maxOfMShoTSo(long[] maxOf, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(maxOf)) {
            R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m882maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(maxOf)) {
            R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m885maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(maxOf)) {
            R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m886maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(maxOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m889maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(maxOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m892maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(maxOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m895maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(maxOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(maxOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final byte m910maxOrThrowU(@NotNull byte[] max) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UByteArray.m114isEmptyimpl(max)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(max, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(max, it2.nextInt());
                if (Intrinsics.compare(m111getw2LRezQ & 255, m111getw2LRezQ2 & 255) < 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final byte m918maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super UByte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m114isEmptyimpl(maxWith)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(maxWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(maxWith, it2.nextInt());
                if (comparator.compare(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(m111getw2LRezQ2)) < 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m932minOfJOV_ifY(byte[] minOf, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(minOf)) {
            R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m935minOfMShoTSo(long[] minOf, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!ULongArray.m272isEmptyimpl(minOf)) {
            R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m938minOfjgv0xPQ(int[] minOf, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UIntArray.m193isEmptyimpl(minOf)) {
            R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m941minOfxTcfx_M(short[] minOf, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(minOf)) {
            R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, 0)));
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minOf);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOf, it2.nextInt())));
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
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m942minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m114isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(minOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m945minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m272isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(minOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m948minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m193isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(minOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M  reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m951minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m377isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R invoke = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, 0)));
        lastIndex = ArraysKt___ArraysKt.getLastIndex(minOfOrNull);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(minOfOrNull, it2.nextInt())));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final byte m966minOrThrowU(@NotNull byte[] min) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UByteArray.m114isEmptyimpl(min)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(min, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(min, it2.nextInt());
                if (Intrinsics.compare(m111getw2LRezQ & 255, m111getw2LRezQ2 & 255) > 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final byte m974minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super UByte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UByteArray.m114isEmptyimpl(minWith)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(minWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(minWith, it2.nextInt());
                if (comparator.compare(UByte.m47boximpl(m111getw2LRezQ), UByte.m47boximpl(m111getw2LRezQ2)) > 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m870maxByOrThrowU(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(maxBy)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(maxBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m111getw2LRezQ;
            }
            R invoke = selector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(maxBy, it2.nextInt());
                R invoke2 = selector.invoke(UByte.m47boximpl(m111getw2LRezQ2));
                if (invoke.compareTo(invoke2) < 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                    invoke = invoke2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m926minByOrThrowU(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UByteArray.m114isEmptyimpl(minBy)) {
            byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(minBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m111getw2LRezQ;
            }
            R invoke = selector.invoke(UByte.m47boximpl(m111getw2LRezQ));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(minBy, it2.nextInt());
                R invoke2 = selector.invoke(UByte.m47boximpl(m111getw2LRezQ2));
                if (invoke.compareTo(invoke2) > 0) {
                    m111getw2LRezQ = m111getw2LRezQ2;
                    invoke = invoke2;
                }
            }
            return m111getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U  reason: not valid java name */
    public static final short m913maxOrThrowU(@NotNull short[] max) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!UShortArray.m377isEmptyimpl(max)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(max, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(max);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(max, it2.nextInt());
                if (Intrinsics.compare(m374getMh2AYeg & UShort.MAX_VALUE, 65535 & m374getMh2AYeg2) < 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U  reason: not valid java name */
    public static final short m921maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super UShort> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m377isEmptyimpl(maxWith)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(maxWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(maxWith, it2.nextInt());
                if (comparator.compare(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(m374getMh2AYeg2)) < 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U  reason: not valid java name */
    public static final short m969minOrThrowU(@NotNull short[] min) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!UShortArray.m377isEmptyimpl(min)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(min, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(min);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(min, it2.nextInt());
                if (Intrinsics.compare(m374getMh2AYeg & UShort.MAX_VALUE, 65535 & m374getMh2AYeg2) > 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U  reason: not valid java name */
    public static final short m977minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super UShort> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!UShortArray.m377isEmptyimpl(minWith)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(minWith, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minWith);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(minWith, it2.nextInt());
                if (comparator.compare(UShort.m310boximpl(m374getMh2AYeg), UShort.m310boximpl(m374getMh2AYeg2)) > 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m873maxByOrThrowU(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(maxBy)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(maxBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m374getMh2AYeg;
            }
            R invoke = selector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(maxBy, it2.nextInt());
                R invoke2 = selector.invoke(UShort.m310boximpl(m374getMh2AYeg2));
                if (invoke.compareTo(invoke2) < 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                    invoke = invoke2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U  reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m929minByOrThrowU(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!UShortArray.m377isEmptyimpl(minBy)) {
            short m374getMh2AYeg = UShortArray.m374getMh2AYeg(minBy, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m374getMh2AYeg;
            }
            R invoke = selector.invoke(UShort.m310boximpl(m374getMh2AYeg));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(minBy, it2.nextInt());
                R invoke2 = selector.invoke(UShort.m310boximpl(m374getMh2AYeg2));
                if (invoke.compareTo(invoke2) > 0) {
                    m374getMh2AYeg = m374getMh2AYeg2;
                    invoke = invoke2;
                }
            }
            return m374getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
