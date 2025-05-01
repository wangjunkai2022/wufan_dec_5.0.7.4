package kotlin.collections;

import XI.K0.XI.XI;
import external.org.apache.commons.lang3.d;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__AppendableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: _Arrays.kt */
@SourceDebugExtension({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24693:1\n12794#1,2:24694\n12804#1,2:24696\n1282#1,2:24698\n1290#1,2:24700\n1298#1,2:24702\n1306#1,2:24704\n1314#1,2:24706\n1322#1,2:24708\n1330#1,2:24710\n1338#1,2:24712\n1346#1,2:24714\n2298#1,5:24716\n2311#1,5:24721\n2324#1,5:24726\n2337#1,5:24731\n2350#1,5:24736\n2363#1,5:24741\n2376#1,5:24746\n2389#1,5:24751\n2402#1,5:24756\n4307#1,2:24762\n4317#1,2:24764\n4327#1,2:24766\n4337#1,2:24768\n4347#1,2:24770\n4357#1,2:24772\n4367#1,2:24774\n4377#1,2:24776\n4387#1,2:24778\n3974#1:24780\n13644#1,2:24781\n3975#1,2:24783\n13646#1:24785\n3977#1:24786\n3988#1:24787\n13654#1,2:24788\n3989#1,2:24790\n13656#1:24792\n3991#1:24793\n4002#1:24794\n13664#1,2:24795\n4003#1,2:24797\n13666#1:24799\n4005#1:24800\n4016#1:24801\n13674#1,2:24802\n4017#1,2:24804\n13676#1:24806\n4019#1:24807\n4030#1:24808\n13684#1,2:24809\n4031#1,2:24811\n13686#1:24813\n4033#1:24814\n4044#1:24815\n13694#1,2:24816\n4045#1,2:24818\n13696#1:24820\n4047#1:24821\n4058#1:24822\n13704#1,2:24823\n4059#1,2:24825\n13706#1:24827\n4061#1:24828\n4072#1:24829\n13714#1,2:24830\n4073#1,2:24832\n13716#1:24834\n4075#1:24835\n4086#1:24836\n13724#1,2:24837\n4087#1,2:24839\n13726#1:24841\n4089#1:24842\n13644#1,3:24843\n13654#1,3:24846\n13664#1,3:24849\n13674#1,3:24852\n13684#1,3:24855\n13694#1,3:24858\n13704#1,3:24861\n13714#1,3:24864\n13724#1,3:24867\n4107#1,2:24870\n4217#1,2:24872\n4227#1,2:24874\n4237#1,2:24876\n4247#1,2:24878\n4257#1,2:24880\n4267#1,2:24882\n4277#1,2:24884\n4287#1,2:24886\n4297#1,2:24888\n9358#1,4:24890\n9373#1,4:24894\n9388#1,4:24898\n9403#1,4:24902\n9418#1,4:24906\n9433#1,4:24910\n9448#1,4:24914\n9463#1,4:24918\n9478#1,4:24922\n9071#1,4:24926\n9087#1,4:24930\n9103#1,4:24934\n9119#1,4:24938\n9135#1,4:24942\n9151#1,4:24946\n9167#1,4:24950\n9183#1,4:24954\n9199#1,4:24958\n9215#1,4:24962\n9231#1,4:24966\n9247#1,4:24970\n9263#1,4:24974\n9279#1,4:24978\n9295#1,4:24982\n9311#1,4:24986\n9327#1,4:24990\n9343#1,4:24994\n9646#1,4:24998\n10664#1,5:25002\n10675#1,5:25007\n10686#1,5:25012\n10697#1,5:25017\n10708#1,5:25022\n10719#1,5:25027\n10730#1,5:25032\n10741#1,5:25037\n10752#1,5:25042\n10767#1,5:25047\n11008#1,3:25052\n11011#1,3:25062\n11025#1,3:25065\n11028#1,3:25075\n11042#1,3:25078\n11045#1,3:25088\n11059#1,3:25091\n11062#1,3:25101\n11076#1,3:25104\n11079#1,3:25114\n11093#1,3:25117\n11096#1,3:25127\n11110#1,3:25130\n11113#1,3:25140\n11127#1,3:25143\n11130#1,3:25153\n11144#1,3:25156\n11147#1,3:25166\n11162#1,3:25169\n11165#1,3:25179\n11180#1,3:25182\n11183#1,3:25192\n11198#1,3:25195\n11201#1,3:25205\n11216#1,3:25208\n11219#1,3:25218\n11234#1,3:25221\n11237#1,3:25231\n11252#1,3:25234\n11255#1,3:25244\n11270#1,3:25247\n11273#1,3:25257\n11288#1,3:25260\n11291#1,3:25270\n11306#1,3:25273\n11309#1,3:25283\n11670#1,3:25412\n11680#1,3:25415\n11690#1,3:25418\n11700#1,3:25421\n11710#1,3:25424\n11720#1,3:25427\n11730#1,3:25430\n11740#1,3:25433\n11750#1,3:25436\n11536#1,4:25439\n11549#1,4:25443\n11562#1,4:25447\n11575#1,4:25451\n11588#1,4:25455\n11601#1,4:25459\n11614#1,4:25463\n11627#1,4:25467\n11640#1,4:25471\n11525#1:25475\n13644#1,2:25476\n13646#1:25479\n11526#1:25480\n13644#1,3:25481\n11661#1:25484\n13579#1:25485\n13580#1:25487\n11662#1:25488\n13579#1,2:25489\n13644#1,3:25491\n13654#1,3:25494\n13664#1,3:25497\n13674#1,3:25500\n13684#1,3:25503\n13694#1,3:25506\n13704#1,3:25509\n13714#1,3:25512\n13724#1,3:25515\n20893#1,2:25518\n20895#1,6:25521\n21109#1,2:25527\n21111#1,6:25530\n23305#1,6:25536\n23321#1,6:25542\n23337#1,6:25548\n23353#1,6:25554\n23369#1,6:25560\n23385#1,6:25566\n23401#1,6:25572\n23417#1,6:25578\n23433#1,6:25584\n23539#1,8:25590\n23557#1,8:25598\n23575#1,8:25606\n23593#1,8:25614\n23611#1,8:25622\n23629#1,8:25630\n23647#1,8:25638\n23665#1,8:25646\n23683#1,8:25654\n23781#1,6:25662\n23797#1,6:25668\n23813#1,6:25674\n23829#1,6:25680\n23845#1,6:25686\n23861#1,6:25692\n23877#1,6:25698\n23893#1,6:25704\n1#2:24761\n1#2:25478\n1#2:25486\n1#2:25520\n1#2:25529\n361#3,7:25055\n361#3,7:25068\n361#3,7:25081\n361#3,7:25094\n361#3,7:25107\n361#3,7:25120\n361#3,7:25133\n361#3,7:25146\n361#3,7:25159\n361#3,7:25172\n361#3,7:25185\n361#3,7:25198\n361#3,7:25211\n361#3,7:25224\n361#3,7:25237\n361#3,7:25250\n361#3,7:25263\n361#3,7:25276\n361#3,7:25286\n361#3,7:25293\n361#3,7:25300\n361#3,7:25307\n361#3,7:25314\n361#3,7:25321\n361#3,7:25328\n361#3,7:25335\n361#3,7:25342\n361#3,7:25349\n361#3,7:25356\n361#3,7:25363\n361#3,7:25370\n361#3,7:25377\n361#3,7:25384\n361#3,7:25391\n361#3,7:25398\n361#3,7:25405\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24694,2\n565#1:24696,2\n832#1:24698,2\n842#1:24700,2\n852#1:24702,2\n862#1:24704,2\n872#1:24706,2\n882#1:24708,2\n892#1:24710,2\n902#1:24712,2\n912#1:24714,2\n922#1:24716,5\n932#1:24721,5\n942#1:24726,5\n952#1:24731,5\n962#1:24736,5\n972#1:24741,5\n982#1:24746,5\n992#1:24751,5\n1002#1:24756,5\n3792#1:24762,2\n3801#1:24764,2\n3810#1:24766,2\n3819#1:24768,2\n3828#1:24770,2\n3837#1:24772,2\n3846#1:24774,2\n3855#1:24776,2\n3864#1:24778,2\n3875#1:24780\n3875#1:24781,2\n3875#1:24783,2\n3875#1:24785\n3875#1:24786\n3886#1:24787\n3886#1:24788,2\n3886#1:24790,2\n3886#1:24792\n3886#1:24793\n3897#1:24794\n3897#1:24795,2\n3897#1:24797,2\n3897#1:24799\n3897#1:24800\n3908#1:24801\n3908#1:24802,2\n3908#1:24804,2\n3908#1:24806\n3908#1:24807\n3919#1:24808\n3919#1:24809,2\n3919#1:24811,2\n3919#1:24813\n3919#1:24814\n3930#1:24815\n3930#1:24816,2\n3930#1:24818,2\n3930#1:24820\n3930#1:24821\n3941#1:24822\n3941#1:24823,2\n3941#1:24825,2\n3941#1:24827\n3941#1:24828\n3952#1:24829\n3952#1:24830,2\n3952#1:24832,2\n3952#1:24834\n3952#1:24835\n3963#1:24836\n3963#1:24837,2\n3963#1:24839,2\n3963#1:24841\n3963#1:24842\n3974#1:24843,3\n3988#1:24846,3\n4002#1:24849,3\n4016#1:24852,3\n4030#1:24855,3\n4044#1:24858,3\n4058#1:24861,3\n4072#1:24864,3\n4086#1:24867,3\n4098#1:24870,2\n4117#1:24872,2\n4126#1:24874,2\n4135#1:24876,2\n4144#1:24878,2\n4153#1:24880,2\n4162#1:24882,2\n4171#1:24884,2\n4180#1:24886,2\n4189#1:24888,2\n8677#1:24890,4\n8692#1:24894,4\n8707#1:24898,4\n8722#1:24902,4\n8737#1:24906,4\n8752#1:24910,4\n8767#1:24914,4\n8782#1:24918,4\n8797#1:24922,4\n8812#1:24926,4\n8827#1:24930,4\n8842#1:24934,4\n8857#1:24938,4\n8872#1:24942,4\n8887#1:24946,4\n8902#1:24950,4\n8917#1:24954,4\n8932#1:24958,4\n8946#1:24962,4\n8960#1:24966,4\n8974#1:24970,4\n8988#1:24974,4\n9002#1:24978,4\n9016#1:24982,4\n9030#1:24986,4\n9044#1:24990,4\n9058#1:24994,4\n9497#1:24998,4\n10242#1:25002,5\n10251#1:25007,5\n10260#1:25012,5\n10269#1:25017,5\n10278#1:25022,5\n10287#1:25027,5\n10296#1:25032,5\n10305#1:25037,5\n10314#1:25042,5\n10327#1:25047,5\n10783#1:25052,3\n10783#1:25062,3\n10795#1:25065,3\n10795#1:25075,3\n10807#1:25078,3\n10807#1:25088,3\n10819#1:25091,3\n10819#1:25101,3\n10831#1:25104,3\n10831#1:25114,3\n10843#1:25117,3\n10843#1:25127,3\n10855#1:25130,3\n10855#1:25140,3\n10867#1:25143,3\n10867#1:25153,3\n10879#1:25156,3\n10879#1:25166,3\n10892#1:25169,3\n10892#1:25179,3\n10905#1:25182,3\n10905#1:25192,3\n10918#1:25195,3\n10918#1:25205,3\n10931#1:25208,3\n10931#1:25218,3\n10944#1:25221,3\n10944#1:25231,3\n10957#1:25234,3\n10957#1:25244,3\n10970#1:25247,3\n10970#1:25257,3\n10983#1:25260,3\n10983#1:25270,3\n10996#1:25273,3\n10996#1:25283,3\n11335#1:25412,3\n11345#1:25415,3\n11355#1:25418,3\n11365#1:25421,3\n11375#1:25424,3\n11385#1:25427,3\n11395#1:25430,3\n11405#1:25433,3\n11415#1:25436,3\n11425#1:25439,4\n11435#1:25443,4\n11445#1:25447,4\n11455#1:25451,4\n11465#1:25455,4\n11475#1:25459,4\n11485#1:25463,4\n11495#1:25467,4\n11505#1:25471,4\n11515#1:25475\n11515#1:25476,2\n11515#1:25479\n11515#1:25480\n11525#1:25481,3\n11653#1:25484\n11653#1:25485\n11653#1:25487\n11653#1:25488\n11661#1:25489,2\n19161#1:25491,3\n19173#1:25494,3\n19185#1:25497,3\n19197#1:25500,3\n19209#1:25503,3\n19221#1:25506,3\n19233#1:25509,3\n19245#1:25512,3\n19257#1:25515,3\n21725#1:25518,2\n21725#1:25521,6\n21887#1:25527,2\n21887#1:25530,6\n23214#1:25536,6\n23224#1:25542,6\n23234#1:25548,6\n23244#1:25554,6\n23254#1:25560,6\n23264#1:25566,6\n23274#1:25572,6\n23284#1:25578,6\n23294#1:25584,6\n23448#1:25590,8\n23458#1:25598,8\n23468#1:25606,8\n23478#1:25614,8\n23488#1:25622,8\n23498#1:25630,8\n23508#1:25638,8\n23518#1:25646,8\n23528#1:25654,8\n23700#1:25662,6\n23710#1:25668,6\n23720#1:25674,6\n23730#1:25680,6\n23740#1:25686,6\n23750#1:25692,6\n23760#1:25698,6\n23770#1:25704,6\n11515#1:25478\n11653#1:25486\n21725#1:25520\n21887#1:25529\n10783#1:25055,7\n10795#1:25068,7\n10807#1:25081,7\n10819#1:25094,7\n10831#1:25107,7\n10843#1:25120,7\n10855#1:25133,7\n10867#1:25146,7\n10879#1:25159,7\n10892#1:25172,7\n10905#1:25185,7\n10918#1:25198,7\n10931#1:25211,7\n10944#1:25224,7\n10957#1:25237,7\n10970#1:25250,7\n10983#1:25263,7\n10996#1:25276,7\n11010#1:25286,7\n11027#1:25293,7\n11044#1:25300,7\n11061#1:25307,7\n11078#1:25314,7\n11095#1:25321,7\n11112#1:25328,7\n11129#1:25335,7\n11146#1:25342,7\n11164#1:25349,7\n11182#1:25356,7\n11200#1:25363,7\n11218#1:25370,7\n11236#1:25377,7\n11254#1:25384,7\n11272#1:25391,7\n11290#1:25398,7\n11308#1:25405,7\n*E\n"})
/* loaded from: classes.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final <T> boolean all(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull T[] tArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    @NotNull
    public static <T> Sequence<T> asSequence(@NotNull final T[] tArr) {
        Sequence<T> emptySequence;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (XI.AbstractBinderC0002XI abstractBinderC0002XI : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(abstractBinderC0002XI);
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t4 : tArr) {
            linkedHashMap.put(keySelector.invoke(t4), t4);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : tArr) {
            destination.put(keySelector.invoke(t4), t4);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(t4);
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull K[] kArr, @NotNull Function1<? super K, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(kArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (K k4 : kArr) {
            linkedHashMap.put(k4, valueSelector.invoke(k4));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull K[] kArr, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k4 : kArr) {
            destination.put(k4, valueSelector.invoke(k4));
        }
        return destination;
    }

    public static final double average(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : bArr) {
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Byte b5 : bArr) {
            double byteValue = b5.byteValue();
            Double.isNaN(byteValue);
            d5 += byteValue;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d6 = i4;
        Double.isNaN(d6);
        return d5 / d6;
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Double d6 : dArr) {
            d5 += d6.doubleValue();
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Float f5 : fArr) {
            double floatValue = f5.floatValue();
            Double.isNaN(floatValue);
            d5 += floatValue;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d6 = i4;
        Double.isNaN(d6);
        return d5 / d6;
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Integer num : numArr) {
            double intValue = num.intValue();
            Double.isNaN(intValue);
            d5 += intValue;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d6 = i4;
        Double.isNaN(d6);
        return d5 / d6;
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Long l4 : lArr) {
            double longValue = l4.longValue();
            Double.isNaN(longValue);
            d5 += longValue;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d6 = i4;
        Double.isNaN(d6);
        return d5 / d6;
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (Short sh : shArr) {
            double shortValue = sh.shortValue();
            Double.isNaN(shortValue);
            d5 += shortValue;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d6 = i4;
        Double.isNaN(d6);
        return d5 / d6;
    }

    @InlineOnly
    private static final <T> T component1(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[0];
    }

    @InlineOnly
    private static final <T> T component2(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[1];
    }

    @InlineOnly
    private static final <T> T component3(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[2];
    }

    @InlineOnly
    private static final <T> T component4(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[3];
    }

    @InlineOnly
    private static final <T> T component5(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[4];
    }

    public static <T> boolean contains(@NotNull T[] tArr, T t4) {
        int indexOf;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        indexOf = indexOf(tArr, t4);
        return indexOf >= 0;
    }

    @InlineOnly
    private static final <T> int count(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length;
    }

    @NotNull
    public static final <T> List<T> distinct(@NotNull T[] tArr) {
        List<T> list;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
        return list;
    }

    @NotNull
    public static final <T, K> List<T> distinctBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (hashSet.add(selector.invoke(t4))) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> drop(@NotNull T[] tArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(tArr.length - i4, 0);
            return takeLast(tArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLast(@NotNull T[] tArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(tArr.length - i4, 0);
            return take(tArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final <T> List<T> dropWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (T t4 : tArr) {
            if (z4) {
                arrayList.add(t4);
            } else if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
                z4 = true;
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final <T> T elementAtOrElse(T[] tArr, int i4, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(tArr)) ? defaultValue.invoke(Integer.valueOf(i4)) : tArr[i4];
    }

    @InlineOnly
    private static final <T> T elementAtOrNull(T[] tArr, int i4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) ArraysKt.getOrNull(tArr, i4);
    }

    @NotNull
    public static final <T> List<T> filter(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> filterIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            T t4 = tArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), t4).booleanValue()) {
                arrayList.add(t4);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            T t4 = tArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), t4).booleanValue()) {
                destination.add(t4);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> filterNot(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : tArr) {
            if (t4 != null) {
                destination.add(t4);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    @InlineOnly
    private static final <T> T find(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T findLast(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                T t4 = tArr[length];
                if (predicate.invoke(t4).booleanValue()) {
                    return t4;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final <T> T first(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(T[] tArr, Function1<? super T, ? extends R> transform) {
        R r4;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                r4 = transform.invoke(tArr[i4]);
                if (r4 != null) {
                    break;
                }
                i4++;
            } else {
                r4 = null;
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    public static final <T, R> List<R> flatMap(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedIterable(T[] tArr, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequence")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedSequence(T[] tArr, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> List<R> flatMapSequence(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t4));
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t4));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(@NotNull T[] tArr, R r4, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (XI.AbstractBinderC0002XI abstractBinderC0002XI : tArr) {
            r4 = operation.invoke(r4, abstractBinderC0002XI);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(@NotNull T[] tArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, tArr[i4]);
            i4++;
            i5++;
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(@NotNull T[] tArr, R r4, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(tArr[lastIndex], r4);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(@NotNull T[] tArr, R r4, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r4);
        }
        return r4;
    }

    public static final <T> void forEach(@NotNull T[] tArr, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t4 : tArr) {
            action.invoke(t4);
        }
    }

    public static final <T> void forEachIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), tArr[i4]);
            i4++;
            i5++;
        }
    }

    @NotNull
    public static final <T> IntRange getIndices(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IntRange(0, getLastIndex(tArr));
    }

    public static final <T> int getLastIndex(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @InlineOnly
    private static final <T> T getOrElse(T[] tArr, int i4, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(tArr)) ? defaultValue.invoke(Integer.valueOf(i4)) : tArr[i4];
    }

    @Nullable
    public static <T> T getOrNull(@NotNull T[] tArr, int i4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i4 < 0 || i4 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i4];
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t4);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(t4);
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final T[] tArr, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.ArraysKt___ArraysKt$groupingBy$1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t4) {
                return keySelector.invoke(t4);
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<T> sourceIterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    public static <T> int indexOf(@NotNull T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i4 = 0;
        if (t4 == null) {
            int length = tArr.length;
            while (i4 < length) {
                if (tArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i4 < length2) {
            if (Intrinsics.areEqual(t4, tArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(tArr[i4]).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
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

    @NotNull
    public static final <T> Set<T> intersect(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final <T> boolean isEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t4 : tArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            StringsKt__AppendableKt.appendElement(buffer, t4, function1);
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable joinTo$default(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        return joinTo(objArr, appendable, (i5 & 2) != 0 ? ", " : charSequence, (i5 & 4) != 0 ? "" : charSequence2, (i5 & 8) == 0 ? charSequence3 : "", (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? "..." : charSequence4, (i5 & 64) != 0 ? null : function1);
    }

    @NotNull
    public static final <T> String joinToString(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(objArr, charSequence, str, str2, i6, charSequence5, function1);
    }

    public static final <T> T last(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int lastIndexOf(@NotNull T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t4 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i5 = length2 - 1;
                    if (Intrinsics.areEqual(t4, tArr[length2])) {
                        return length2;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length2 = i5;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @NotNull
    public static final <T, R> List<R> map(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t4 : tArr) {
            arrayList.add(transform.invoke(t4));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexedNotNull(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            R invoke = transform.invoke(Integer.valueOf(i5), tArr[i4]);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            R invoke = transform.invoke(Integer.valueOf(i5), tArr[i4]);
            if (invoke != null) {
                destination.add(invoke);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), tArr[i4]));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <T, R> List<R> mapNotNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            destination.add(transform.invoke(t4));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) < 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            int lastIndex = getLastIndex(tArr);
            if (lastIndex == 0) {
                return t4;
            }
            R invoke = selector.invoke(t4);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                R invoke2 = selector.invoke(t5);
                if (invoke.compareTo(invoke2) < 0) {
                    t4 = t5;
                    invoke = invoke2;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double maxOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            double doubleValue = selector.invoke(tArr[0]).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(tArr[it2.nextInt()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final <T> Double m414maxOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(tArr[it2.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            Object obj = (R) selector.invoke(tArr[0]);
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(tArr[it2.nextInt()]);
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
    private static final <T, R> R maxOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(tArr[it2.nextInt()]);
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it2.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double doubleValue = dArr[0].doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, dArr[it2.nextInt()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            if (comparator.compare(t4, t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                if (comparator.compare(t4, t5) < 0) {
                    t4 = t5;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) > 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            int lastIndex = getLastIndex(tArr);
            if (lastIndex == 0) {
                return t4;
            }
            R invoke = selector.invoke(t4);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                R invoke2 = selector.invoke(t5);
                if (invoke.compareTo(invoke2) > 0) {
                    t4 = t5;
                    invoke = invoke2;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double minOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            double doubleValue = selector.invoke(tArr[0]).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(tArr[it2.nextInt()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final <T> Double m450minOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(tArr[it2.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            Object obj = (R) selector.invoke(tArr[0]);
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(tArr[it2.nextInt()]);
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
    private static final <T, R> R minOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(tArr[it2.nextInt()]);
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it2.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double doubleValue = dArr[0].doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, dArr[it2.nextInt()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            if (comparator.compare(t4, t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                if (comparator.compare(t4, t5) > 0) {
                    t4 = t5;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    public static final <T> boolean none(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] onEach(T[] tArr, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t4 : tArr) {
            action.invoke(t4);
        }
        return tArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] onEachIndexed(T[] tArr, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), tArr[i4]);
            i4++;
            i5++;
        }
        return tArr;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            } else {
                arrayList2.add(t4);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T random(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) random(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <T> T randomOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) randomOrNull(tArr, Random.Default);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final <S, T extends S> S reduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(tArr.length == 0)) {
            Object obj = (S) tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                obj = (S) operation.invoke(obj, (Object) tArr[it2.nextInt()]);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final <S, T extends S> S reduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(tArr.length == 0)) {
            Object obj = (S) tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                obj = (S) operation.invoke(Integer.valueOf(nextInt), obj, (Object) tArr[nextInt]);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            obj = (S) operation.invoke(Integer.valueOf(nextInt), obj, (Object) tArr[nextInt]);
        }
        return (S) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            obj = (S) operation.invoke(obj, (Object) tArr[it2.nextInt()]);
        }
        return (S) obj;
    }

    public static final <S, T extends S> S reduceRight(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            Object obj = (S) tArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                obj = (S) operation.invoke((Object) tArr[i4], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final <S, T extends S> S reduceRightIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            Object obj = (S) tArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                obj = (S) operation.invoke(Integer.valueOf(i4), (Object) tArr[i4], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        Object obj = (S) tArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            obj = (S) operation.invoke(Integer.valueOf(i4), (Object) tArr[i4], obj);
        }
        return (S) obj;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceRightOrNull(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        Object obj = (S) tArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            obj = (S) operation.invoke((Object) tArr[i4], obj);
        }
        return (S) obj;
    }

    @NotNull
    public static final <T> T[] requireNoNulls(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        for (T t4 : tArr) {
            if (t4 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + d.f68897a);
            }
        }
        return tArr;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final <T> void reverse(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            T t4 = tArr[nextInt];
            tArr[nextInt] = tArr[lastIndex];
            tArr[lastIndex] = t4;
            lastIndex--;
        }
    }

    @NotNull
    public static final <T> List<T> reversed(@NotNull T[] tArr) {
        List<T> mutableList;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        mutableList = toMutableList(tArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final <T> T[] reversedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            tArr2[lastIndex - nextInt] = tArr[nextInt];
        }
        return tArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFold(@NotNull T[] tArr, R r4, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (XI.AbstractBinderC0002XI abstractBinderC0002XI : tArr) {
            r4 = operation.invoke(r4, abstractBinderC0002XI);
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFoldIndexed(@NotNull T[] tArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, tArr[i4]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <S, T extends S> List<S> runningReduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        List<S> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.invoke(s4, (Object) tArr[i4]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        List<S> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.invoke(Integer.valueOf(i4), s4, (Object) tArr[i4]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(byte[] bArr, R r4, Function2<? super R, ? super Byte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Byte.valueOf(bArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, Random.Default);
    }

    public static final <T> T single(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static <T> T singleOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull T[] tArr, @NotNull IntRange indices) {
        List<T> asList;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        asList = ArraysKt___ArraysJvmKt.asList(ArraysKt.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
        return asList;
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, indices.size());
        int i4 = 0;
        for (Integer num : indices) {
            tArr2[i4] = tArr[num.intValue()];
            i4++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr) {
        Comparator reverseOrder;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        reverseOrder = ComparisonsKt__ComparisonsKt.reverseOrder();
        ArraysKt___ArraysJvmKt.sortWith(tArr, reverseOrder);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull T[] tArr) {
        List<T> asList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        asList = ArraysKt___ArraysJvmKt.asList(sortedArray(tArr));
        return asList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        ArraysKt___ArraysJvmKt.sort((Object[]) tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(@NotNull T[] tArr) {
        Comparator reverseOrder;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        reverseOrder = ComparisonsKt__ComparisonsKt.reverseOrder();
        ArraysKt___ArraysJvmKt.sortWith(tArr2, reverseOrder);
        return tArr2;
    }

    @NotNull
    public static final <T> T[] sortedArrayWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sortWith(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        List<T> sortedWith;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        sortedWith = sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
        return sortedWith;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        List<T> sortedWith;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        sortedWith = sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
        return sortedWith;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull T[] tArr) {
        Comparator reverseOrder;
        List<T> sortedWith;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        reverseOrder = ComparisonsKt__ComparisonsKt.reverseOrder();
        sortedWith = sortedWith(tArr, reverseOrder);
        return sortedWith;
    }

    @NotNull
    public static <T> List<T> sortedWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        List<T> asList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        asList = ArraysKt___ArraysJvmKt.asList(sortedArrayWith(tArr, comparator));
        return asList;
    }

    @NotNull
    public static final <T> Set<T> subtract(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i4 = 0;
        for (byte b5 : bArr) {
            i4 += b5;
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull T[] tArr, @NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (T t4 : tArr) {
            i4 += selector.invoke(t4).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(@NotNull T[] tArr, @NotNull Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (T t4 : tArr) {
            d5 += selector.invoke(t4).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i4 = 0;
        for (Byte b5 : bArr) {
            i4 += b5.byteValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final <T> double sumOfDouble(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (T t4 : tArr) {
            d5 += selector.invoke(t4).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f5 = 0.0f;
        for (Float f6 : fArr) {
            f5 += f6.floatValue();
        }
        return f5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final <T> int sumOfInt(T[] tArr, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (T t4 : tArr) {
            i4 += selector.invoke(t4).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final <T> long sumOfLong(T[] tArr, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (T t4 : tArr) {
            j4 += selector.invoke(t4).longValue();
        }
        return j4;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int i4 = 0;
        for (Short sh : shArr) {
            i4 += sh.shortValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> int sumOfUInt(T[] tArr, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (T t4 : tArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(t4).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> long sumOfULong(T[] tArr, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (T t4 : tArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(t4).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final <T> List<T> take(@NotNull T[] tArr, int i4) {
        List<T> listOf;
        List<T> list;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= tArr.length) {
            list = toList(tArr);
            return list;
        } else if (i4 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(tArr[0]);
            return listOf;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (T t4 : tArr) {
                arrayList.add(t4);
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final <T> List<T> takeLast(@NotNull T[] tArr, int i4) {
        List<T> listOf;
        List<T> list;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = tArr.length;
            if (i4 >= length) {
                list = toList(tArr);
                return list;
            } else if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(tArr[length - 1]);
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = length - i4; i5 < length; i5++) {
                    arrayList.add(tArr[i5]);
                }
                return arrayList;
            }
        }
    }

    @NotNull
    public static final <T> List<T> takeLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        List<T> list;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        list = toList(tArr);
        return list;
    }

    @NotNull
    public static final <T> List<T> takeWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                break;
            }
            arrayList.add(t4);
        }
        return arrayList;
    }

    @NotNull
    public static final boolean[] toBooleanArray(@NotNull Boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Character[] chArr) {
        Intrinsics.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : tArr) {
            destination.add(t4);
        }
        return destination;
    }

    @NotNull
    public static final double[] toDoubleArray(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static final <T> HashSet<T> toHashSet(@NotNull T[] tArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
        return (HashSet) toCollection(tArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final int[] toIntArray(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    @NotNull
    public static <T> List<T> toList(@NotNull T[] tArr) {
        List<T> emptyList;
        List<T> listOf;
        List<T> mutableList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            mutableList = toMutableList(tArr);
            return mutableList;
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(tArr[0]);
            return listOf;
        }
    }

    @NotNull
    public static final long[] toLongArray(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull T[] tArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
        return (Set) toCollection(tArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final <T> Set<T> toSet(@NotNull T[] tArr) {
        Set<T> emptySet;
        Set<T> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
            return (Set) toCollection(tArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(tArr[0]);
            return of;
        }
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    @NotNull
    public static final <T> Set<T> union(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <T> Iterable<IndexedValue<T>> withIndex(@NotNull final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends T>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<T> invoke() {
                return ArrayIteratorKt.iterator(tArr);
            }
        });
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull R[] other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(tArr[i4], other[i4]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @InlineOnly
    private static final byte component1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[0];
    }

    @InlineOnly
    private static final byte component2(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[1];
    }

    @InlineOnly
    private static final byte component3(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[2];
    }

    @InlineOnly
    private static final byte component4(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[3];
    }

    @InlineOnly
    private static final byte component5(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[4];
    }

    public static boolean contains(@NotNull byte[] bArr, byte b5) {
        int indexOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        indexOf = indexOf(bArr, b5);
        return indexOf >= 0;
    }

    @InlineOnly
    private static final int count(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public static final List<Byte> distinct(@NotNull byte[] bArr) {
        List<Byte> list;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
        return list;
    }

    @InlineOnly
    private static final byte elementAtOrElse(byte[] bArr, int i4, Function1<? super Integer, Byte> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(bArr);
            if (i4 <= lastIndex) {
                return bArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).byteValue();
    }

    @InlineOnly
    private static final Byte elementAtOrNull(byte[] bArr, int i4) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return getOrNull(bArr, i4);
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterNotTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Byte find(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
        }
        return null;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(byte[] bArr, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull byte[] bArr, R r4, @NotNull Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull byte[] bArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final void forEach(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b5 : bArr) {
            action.invoke(Byte.valueOf(b5));
        }
    }

    public static final void forEachIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        lastIndex = getLastIndex(bArr);
        return new IntRange(0, lastIndex);
    }

    public static int getLastIndex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    @InlineOnly
    private static final byte getOrElse(byte[] bArr, int i4, Function1<? super Integer, Byte> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(bArr);
            if (i4 <= lastIndex) {
                return bArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).byteValue();
    }

    @Nullable
    public static final Byte getOrNull(@NotNull byte[] bArr, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i4 >= 0) {
            lastIndex = getLastIndex(bArr);
            if (i4 <= lastIndex) {
                return Byte.valueOf(bArr[i4]);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean isEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull byte[] bArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(bArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Byte, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] onEach(byte[] bArr, Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b5 : bArr) {
            action.invoke(Byte.valueOf(b5));
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] onEachIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4]));
            i4++;
            i5++;
        }
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final byte random(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return random(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Byte randomOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return randomOrNull(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(short[] sArr, R r4, Function2<? super R, ? super Short, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(short[] sArr, R r4, Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Short.valueOf(sArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (Random) Random.Default);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(bArr);
            reverse(bArr);
        }
    }

    @NotNull
    public static final List<Byte> sorted(@NotNull byte[] bArr) {
        List<Byte> asList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Byte> sortedDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Byte> sortedWith(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        List<Byte> asList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    public static final int sum(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += s4;
        }
        return i4;
    }

    @NotNull
    public static final HashSet<Byte> toHashSet(@NotNull byte[] bArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        return (HashSet) toCollection(bArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Byte> toMutableList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b5 : bArr) {
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> toMutableSet(@NotNull byte[] bArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        return (Set) toCollection(bArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Iterable<IndexedValue<Byte>> withIndex(@NotNull final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Byte>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Byte> invoke() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        });
    }

    public static final boolean all(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @NotNull
    public static final Iterable<Byte> asIterable(@NotNull byte[] bArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(bArr);
    }

    @NotNull
    public static final Sequence<Byte> asSequence(@NotNull final byte[] bArr) {
        Sequence<Byte> emptySequence;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Byte>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Byte> iterator() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b5 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b5)), Byte.valueOf(b5));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Byte, ? super V>> M associateWithTo(byte[] bArr, M destination, Function1<? super Byte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (byte b5 : bArr) {
            destination.put(Byte.valueOf(b5), valueSelector.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    @InlineOnly
    private static final short component1(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[0];
    }

    @InlineOnly
    private static final short component2(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[1];
    }

    @InlineOnly
    private static final short component3(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[2];
    }

    @InlineOnly
    private static final short component4(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[3];
    }

    @InlineOnly
    private static final short component5(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[4];
    }

    public static boolean contains(@NotNull short[] sArr, short s4) {
        int indexOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        indexOf = indexOf(sArr, s4);
        return indexOf >= 0;
    }

    @InlineOnly
    private static final int count(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public static final List<Short> distinct(@NotNull short[] sArr) {
        List<Short> list;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
        return list;
    }

    @NotNull
    public static final List<Byte> drop(@NotNull byte[] bArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(bArr.length - i4, 0);
            return takeLast(bArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLast(@NotNull byte[] bArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(bArr.length - i4, 0);
            return take(bArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InlineOnly
    private static final short elementAtOrElse(short[] sArr, int i4, Function1<? super Integer, Short> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(sArr);
            if (i4 <= lastIndex) {
                return sArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).shortValue();
    }

    @InlineOnly
    private static final Short elementAtOrNull(short[] sArr, int i4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return getOrNull(sArr, i4);
    }

    @NotNull
    public static final List<Byte> filter(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b5 = bArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Byte> filterNot(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterNotTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Short find(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(short[] sArr, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull short[] sArr, R r4, @NotNull Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull short[] sArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <R> R foldRight(@NotNull byte[] bArr, R r4, @NotNull Function2<? super Byte, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Byte.valueOf(bArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull byte[] bArr, R r4, @NotNull Function3<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final void forEach(@NotNull short[] sArr, @NotNull Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s4 : sArr) {
            action.invoke(Short.valueOf(s4));
        }
    }

    public static final void forEachIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        lastIndex = getLastIndex(sArr);
        return new IntRange(0, lastIndex);
    }

    public static int getLastIndex(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    @InlineOnly
    private static final short getOrElse(short[] sArr, int i4, Function1<? super Integer, Short> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(sArr);
            if (i4 <= lastIndex) {
                return sArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).shortValue();
    }

    @Nullable
    public static final Short getOrNull(@NotNull short[] sArr, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i4 >= 0) {
            lastIndex = getLastIndex(sArr);
            if (i4 <= lastIndex) {
                return Short.valueOf(sArr[i4]);
            }
        }
        return null;
    }

    public static final int indexOfFirst(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Byte.valueOf(bArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Byte> intersect(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final boolean isEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull short[] sArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Short, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final boolean none(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] onEach(short[] sArr, Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s4 : sArr) {
            action.invoke(Short.valueOf(s4));
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] onEachIndexed(short[] sArr, Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4]));
            i4++;
            i5++;
        }
        return sArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final short random(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return random(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Short randomOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return randomOrNull(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(int[] iArr, R r4, Function2<? super R, ? super Integer, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i4 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(int[] iArr, R r4, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Integer.valueOf(iArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (Random) Random.Default);
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull IntRange indices) {
        byte[] copyOfRange;
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return ArraysKt___ArraysJvmKt.asList(copyOfRange);
    }

    @NotNull
    public static final List<Short> sorted(@NotNull short[] sArr) {
        List<Short> asList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final byte[] sortedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final byte[] sortedArrayDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Short> sortedDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Short> sortedWith(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        List<Short> asList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final Set<Byte> subtract(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static int sum(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (byte b5 : bArr) {
            i4 += selector.invoke(Byte.valueOf(b5)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (byte b5 : bArr) {
            d5 += selector.invoke(Byte.valueOf(b5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (byte b5 : bArr) {
            d5 += selector.invoke(Byte.valueOf(b5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(byte[] bArr, Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (byte b5 : bArr) {
            i4 += selector.invoke(Byte.valueOf(b5)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] bArr, Function1<? super Byte, Long> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (byte b5 : bArr) {
            j4 += selector.invoke(Byte.valueOf(b5)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C toCollection(@NotNull byte[] bArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (byte b5 : bArr) {
            destination.add(Byte.valueOf(b5));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Short> toHashSet(@NotNull short[] sArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        return (HashSet) toCollection(sArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Short> toMutableSet(@NotNull short[] sArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        return (Set) toCollection(sArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Byte> union(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Short>> withIndex(@NotNull final short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Short>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Short> invoke() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        });
    }

    public static final boolean all(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Byte, V> associateWith(byte[] bArr, Function1<? super Byte, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b5 : bArr) {
            linkedHashMap.put(Byte.valueOf(b5), valueSelector.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    public static final double average(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : sArr) {
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    @InlineOnly
    private static final int component1(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[0];
    }

    @InlineOnly
    private static final int component2(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[1];
    }

    @InlineOnly
    private static final int component3(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[2];
    }

    @InlineOnly
    private static final int component4(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[3];
    }

    @InlineOnly
    private static final int component5(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[4];
    }

    public static boolean contains(@NotNull int[] iArr, int i4) {
        int indexOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        indexOf = indexOf(iArr, i4);
        return indexOf >= 0;
    }

    @InlineOnly
    private static final int count(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public static final List<Integer> distinct(@NotNull int[] iArr) {
        List<Integer> list;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
        return list;
    }

    @InlineOnly
    private static final int elementAtOrElse(int[] iArr, int i4, Function1<? super Integer, Integer> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(iArr);
            if (i4 <= lastIndex) {
                return iArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).intValue();
    }

    @InlineOnly
    private static final Integer elementAtOrNull(int[] iArr, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return getOrNull(iArr, i4);
    }

    @NotNull
    public static final List<Byte> filterIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b5 = bArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterNotTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                destination.add(Integer.valueOf(i4));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                destination.add(Integer.valueOf(i4));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Integer find(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return Integer.valueOf(i4);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Byte findLast(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                byte b5 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                    return Byte.valueOf(b5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static byte first(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(bArr.length == 0)) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(int[] iArr, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(byte[] bArr, C destination, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull int[] iArr, R r4, @NotNull Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i4 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i4));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull int[] iArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final void forEach(@NotNull int[] iArr, @NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i4 : iArr) {
            action.invoke(Integer.valueOf(i4));
        }
    }

    public static final void forEachIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        lastIndex = getLastIndex(iArr);
        return new IntRange(0, lastIndex);
    }

    public static int getLastIndex(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    @InlineOnly
    private static final int getOrElse(int[] iArr, int i4, Function1<? super Integer, Integer> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(iArr);
            if (i4 <= lastIndex) {
                return iArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).intValue();
    }

    @Nullable
    public static final Integer getOrNull(@NotNull int[] iArr, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i4 >= 0) {
            lastIndex = getLastIndex(iArr);
            if (i4 <= lastIndex) {
                return Integer.valueOf(iArr[i4]);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean isEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull int[] iArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(iArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Integer, ? extends CharSequence>) function1);
    }

    public static byte last(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(bArr.length == 0)) {
            lastIndex = getLastIndex(bArr);
            return bArr[lastIndex];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b5 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] onEach(int[] iArr, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i4 : iArr) {
            action.invoke(Integer.valueOf(i4));
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] onEachIndexed(int[] iArr, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4]));
            i4++;
            i5++;
        }
        return iArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return random(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer randomOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return randomOrNull(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceRightIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b5 = bArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            b5 = operation.invoke(Integer.valueOf(i4), Byte.valueOf(bArr[i4]), Byte.valueOf(b5)).byteValue();
        }
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceRightOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b5 = bArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            b5 = operation.invoke(Byte.valueOf(bArr[i4]), Byte.valueOf(b5)).byteValue();
        }
        return Byte.valueOf(b5);
    }

    @NotNull
    public static final List<Byte> reversed(@NotNull byte[] bArr) {
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Byte> mutableList = toMutableList(bArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(long[] jArr, R r4, Function2<? super R, ? super Long, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j4 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(long[] jArr, R r4, Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Long.valueOf(jArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (Random) Random.Default);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            bArr2[i4] = bArr[num.intValue()];
            i4++;
        }
        return bArr2;
    }

    @NotNull
    public static final List<Integer> sorted(@NotNull int[] iArr) {
        List<Integer> asList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Integer> sortedDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Integer> sortedWith(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        List<Integer> asList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    public static long sum(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(byte[] bArr, Function1<? super Byte, UInt> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (byte b5 : bArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Byte.valueOf(b5)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(byte[] bArr, Function1<? super Byte, ULong> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (byte b5 : bArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Byte.valueOf(b5)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final HashSet<Integer> toHashSet(@NotNull int[] iArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        return (HashSet) toCollection(iArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Short> toMutableList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> toMutableSet(@NotNull int[] iArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        return (Set) toCollection(iArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Iterable<IndexedValue<Integer>> withIndex(@NotNull final int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Integer>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Integer> invoke() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        });
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull R[] other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static final Iterable<Short> asIterable(@NotNull short[] sArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(sArr);
    }

    @NotNull
    public static final Sequence<Short> asSequence(@NotNull final short[] sArr) {
        Sequence<Short> emptySequence;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Short>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Short> iterator() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b5 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Byte> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b5 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b5)), Byte.valueOf(b5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Short, ? super V>> M associateWithTo(short[] sArr, M destination, Function1<? super Short, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (short s4 : sArr) {
            destination.put(Short.valueOf(s4), valueSelector.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    @InlineOnly
    private static final long component1(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[0];
    }

    @InlineOnly
    private static final long component2(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[1];
    }

    @InlineOnly
    private static final long component3(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[2];
    }

    @InlineOnly
    private static final long component4(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[3];
    }

    @InlineOnly
    private static final long component5(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[4];
    }

    public static boolean contains(@NotNull long[] jArr, long j4) {
        int indexOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        indexOf = indexOf(jArr, j4);
        return indexOf >= 0;
    }

    @InlineOnly
    private static final int count(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public static final List<Long> distinct(@NotNull long[] jArr) {
        List<Long> list;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
        return list;
    }

    @NotNull
    public static final List<Short> drop(@NotNull short[] sArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sArr.length - i4, 0);
            return takeLast(sArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLast(@NotNull short[] sArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sArr.length - i4, 0);
            return take(sArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        int lastIndex;
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @InlineOnly
    private static final long elementAtOrElse(long[] jArr, int i4, Function1<? super Integer, Long> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(jArr);
            if (i4 <= lastIndex) {
                return jArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).longValue();
    }

    @InlineOnly
    private static final Long elementAtOrNull(long[] jArr, int i4) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return getOrNull(jArr, i4);
    }

    @NotNull
    public static final List<Short> filter(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            short s4 = sArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Short> filterNot(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterNotTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Long find(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
        }
        return null;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Byte.valueOf(b5)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(long[] jArr, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull long[] jArr, R r4, @NotNull Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (long j4 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j4));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull long[] jArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <R> R foldRight(@NotNull short[] sArr, R r4, @NotNull Function2<? super Short, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Short.valueOf(sArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull short[] sArr, R r4, @NotNull Function3<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final void forEach(@NotNull long[] jArr, @NotNull Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j4 : jArr) {
            action.invoke(Long.valueOf(j4));
        }
    }

    public static final void forEachIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        lastIndex = getLastIndex(jArr);
        return new IntRange(0, lastIndex);
    }

    public static int getLastIndex(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    @InlineOnly
    private static final long getOrElse(long[] jArr, int i4, Function1<? super Integer, Long> defaultValue) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i4 >= 0) {
            lastIndex = getLastIndex(jArr);
            if (i4 <= lastIndex) {
                return jArr[i4];
            }
        }
        return defaultValue.invoke(Integer.valueOf(i4)).longValue();
    }

    @Nullable
    public static final Long getOrNull(@NotNull long[] jArr, int i4) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i4 >= 0) {
            lastIndex = getLastIndex(jArr);
            if (i4 <= lastIndex) {
                return Long.valueOf(jArr[i4]);
            }
        }
        return null;
    }

    public static int indexOf(@NotNull byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (b5 == bArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Short.valueOf(sArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Short> intersect(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final boolean isEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull long[] jArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(jArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Long, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (b5 == bArr[length]) {
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

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final boolean none(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] onEach(long[] jArr, Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j4 : jArr) {
            action.invoke(Long.valueOf(j4));
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] onEachIndexed(long[] jArr, Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4]));
            i4++;
            i5++;
        }
        return jArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return random(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long randomOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return randomOrNull(jArr, (Random) Random.Default);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            b5 = operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b5), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[it2.nextInt()])).byteValue();
        }
        return Byte.valueOf(b5);
    }

    public static final byte reduceRight(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte b5 = bArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                b5 = operation.invoke(Byte.valueOf(bArr[i4]), Byte.valueOf(b5)).byteValue();
            }
            return b5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte b5 = bArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                b5 = operation.invoke(Integer.valueOf(i4), Byte.valueOf(bArr[i4]), Byte.valueOf(b5)).byteValue();
            }
            return b5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(float[] fArr, R r4, Function2<? super R, ? super Float, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(float[] fArr, R r4, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Float.valueOf(fArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (Random) Random.Default);
    }

    public static byte single(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return bArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull IntRange indices) {
        short[] copyOfRange;
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return ArraysKt___ArraysJvmKt.asList(copyOfRange);
    }

    public static final void sortDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(sArr);
            reverse(sArr);
        }
    }

    @NotNull
    public static final List<Long> sorted(@NotNull long[] jArr) {
        List<Long> asList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final short[] sortedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final short[] sortedArrayDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Long> sortedDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Long> sortedWith(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        List<Long> asList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final Set<Short> subtract(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final float sum(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f5 = 0.0f;
        for (float f6 : fArr) {
            f5 += f6;
        }
        return f5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull short[] sArr, @NotNull Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += selector.invoke(Short.valueOf(s4)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull short[] sArr, @NotNull Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (short s4 : sArr) {
            d5 += selector.invoke(Short.valueOf(s4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (short s4 : sArr) {
            d5 += selector.invoke(Short.valueOf(s4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(short[] sArr, Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (short s4 : sArr) {
            i4 += selector.invoke(Short.valueOf(s4)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sArr, Function1<? super Short, Long> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (short s4 : sArr) {
            j4 += selector.invoke(Short.valueOf(s4)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final List<Byte> takeLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    @NotNull
    public static final List<Byte> takeWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C toCollection(@NotNull short[] sArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (short s4 : sArr) {
            destination.add(Short.valueOf(s4));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Long> toHashSet(@NotNull long[] jArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        return (HashSet) toCollection(jArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Byte> toList(@NotNull byte[] bArr) {
        List<Byte> emptyList;
        List<Byte> listOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(bArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Long> toMutableSet(@NotNull long[] jArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        return (Set) toCollection(jArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Byte> toSet(@NotNull byte[] bArr) {
        Set<Byte> emptySet;
        Set<Byte> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
            return (Set) toCollection(bArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Byte.valueOf(bArr[0]));
            return of;
        }
    }

    @NotNull
    public static final Set<Short> union(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Long>> withIndex(@NotNull final long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Long>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Long> invoke() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        });
    }

    public static final boolean all(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Short, V> associateWith(short[] sArr, Function1<? super Short, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s4 : sArr) {
            linkedHashMap.put(Short.valueOf(s4), valueSelector.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final float component1(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[0];
    }

    @InlineOnly
    private static final float component2(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[1];
    }

    @InlineOnly
    private static final float component3(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[2];
    }

    @InlineOnly
    private static final float component4(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[3];
    }

    @InlineOnly
    private static final float component5(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[4];
    }

    public static final boolean contains(@NotNull boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z4) >= 0;
    }

    @InlineOnly
    private static final int count(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public static final List<Float> distinct(@NotNull float[] fArr) {
        List<Float> list;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
        return list;
    }

    @NotNull
    public static final List<Byte> dropWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (byte b5 : bArr) {
            if (z4) {
                arrayList.add(Byte.valueOf(b5));
            } else if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
                z4 = true;
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final float elementAtOrElse(float[] fArr, int i4, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(fArr)) ? defaultValue.invoke(Integer.valueOf(i4)).floatValue() : fArr[i4];
    }

    @InlineOnly
    private static final Float elementAtOrNull(float[] fArr, int i4) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return getOrNull(fArr, i4);
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterNotTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Float find(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
        }
        return null;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(float[] fArr, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull float[] fArr, R r4, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull float[] fArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final void forEach(@NotNull float[] fArr, @NotNull Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f5 : fArr) {
            action.invoke(Float.valueOf(f5));
        }
    }

    public static final void forEachIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IntRange(0, getLastIndex(fArr));
    }

    public static final int getLastIndex(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    @InlineOnly
    private static final float getOrElse(float[] fArr, int i4, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(fArr)) ? defaultValue.invoke(Integer.valueOf(i4)).floatValue() : fArr[i4];
    }

    @Nullable
    public static final Float getOrNull(@NotNull float[] fArr, int i4) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i4 < 0 || i4 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i4]);
    }

    @InlineOnly
    private static final boolean isEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull float[] fArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(fArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Float, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) < 0) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) > 0) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    public static final boolean none(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] onEach(float[] fArr, Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f5 : fArr) {
            action.invoke(Float.valueOf(f5));
        }
        return fArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] onEachIndexed(float[] fArr, Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4]));
            i4++;
            i5++;
        }
        return fArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final float random(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return random(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Float randomOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return randomOrNull(fArr, (Random) Random.Default);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final byte reduce(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[it2.nextInt()])).byteValue();
            }
            return b5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final byte reduceIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                b5 = operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b5), Byte.valueOf(bArr[nextInt])).byteValue();
            }
            return b5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static byte[] reversedArray(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            bArr2[lastIndex - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(byte[] bArr, R r4, Function2<? super R, ? super Byte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Byte.valueOf(bArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(double[] dArr, R r4, Function2<? super R, ? super Double, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(double[] dArr, R r4, Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Double.valueOf(dArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (Random) Random.Default);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Float> sorted(@NotNull float[] fArr) {
        List<Float> asList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Float> sortedDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Float> sortedWith(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        List<Float> asList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    public static final double sum(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += d6;
        }
        return d5;
    }

    @NotNull
    public static final HashSet<Float> toHashSet(@NotNull float[] fArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        return (HashSet) toCollection(fArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Integer> toMutableList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> toMutableSet(@NotNull float[] fArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        return (Set) toCollection(fArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Iterable<IndexedValue<Float>> withIndex(@NotNull final float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Float>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$6
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Float> invoke() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        });
    }

    public static final boolean all(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static final Iterable<Integer> asIterable(@NotNull int[] iArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
    }

    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final int[] iArr) {
        Sequence<Integer> emptySequence;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Integer> iterator() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i4 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i4)), Integer.valueOf(i4));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Integer, ? super V>> M associateWithTo(int[] iArr, M destination, Function1<? super Integer, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i4 : iArr) {
            destination.put(Integer.valueOf(i4), valueSelector.invoke(Integer.valueOf(i4)));
        }
        return destination;
    }

    public static final double average(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : iArr) {
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    @InlineOnly
    private static final double component1(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[0];
    }

    @InlineOnly
    private static final double component2(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[1];
    }

    @InlineOnly
    private static final double component3(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[2];
    }

    @InlineOnly
    private static final double component4(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[3];
    }

    @InlineOnly
    private static final double component5(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[4];
    }

    public static boolean contains(@NotNull char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c5) >= 0;
    }

    @InlineOnly
    private static final int count(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public static final List<Double> distinct(@NotNull double[] dArr) {
        List<Double> list;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
        return list;
    }

    @NotNull
    public static final <K> List<Byte> distinctBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b5)))) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> drop(@NotNull int[] iArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(iArr.length - i4, 0);
            return takeLast(iArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLast(@NotNull int[] iArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(iArr.length - i4, 0);
            return take(iArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @InlineOnly
    private static final double elementAtOrElse(double[] dArr, int i4, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(dArr)) ? defaultValue.invoke(Integer.valueOf(i4)).doubleValue() : dArr[i4];
    }

    @InlineOnly
    private static final Double elementAtOrNull(double[] dArr, int i4) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return getOrNull(dArr, i4);
    }

    @NotNull
    public static final List<Integer> filter(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> filterIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            short s4 = sArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            int i7 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Integer.valueOf(i6)).booleanValue()) {
                destination.add(Integer.valueOf(i6));
            }
            i4++;
            i5 = i7;
        }
        return destination;
    }

    @NotNull
    public static final List<Integer> filterNot(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterNotTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Double find(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Short findLast(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                short s4 = sArr[length];
                if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                    return Short.valueOf(s4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static short first(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(sArr.length == 0)) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(double[] dArr, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(short[] sArr, C destination, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull double[] dArr, R r4, @NotNull Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull double[] dArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <R> R foldRight(@NotNull int[] iArr, R r4, @NotNull Function2<? super Integer, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(iArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull int[] iArr, R r4, @NotNull Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final void forEach(@NotNull double[] dArr, @NotNull Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d5 : dArr) {
            action.invoke(Double.valueOf(d5));
        }
    }

    public static final void forEachIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IntRange(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    @InlineOnly
    private static final double getOrElse(double[] dArr, int i4, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(dArr)) ? defaultValue.invoke(Integer.valueOf(i4)).doubleValue() : dArr[i4];
    }

    @Nullable
    public static final Double getOrNull(@NotNull double[] dArr, int i4) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i4 < 0 || i4 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i4]);
    }

    public static int indexOf(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (s4 == sArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Integer.valueOf(iArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Integer> intersect(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final boolean isEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull byte[] bArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (byte b5 : bArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b5)));
            } else {
                buffer.append(String.valueOf((int) b5));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final String joinToString(@NotNull double[] dArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(dArr, charSequence, str, str2, i6, charSequence5, function1);
    }

    public static short last(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(sArr.length == 0)) {
            lastIndex = getLastIndex(sArr);
            return sArr[lastIndex];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(@NotNull short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (s4 == sArr[length]) {
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

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m408maxOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it2.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float floatValue = fArr[0].floatValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, fArr[it2.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) < 0) {
                    b5 = b6;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m444minOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it2.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float floatValue = fArr[0].floatValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, fArr[it2.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final byte minWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) > 0) {
                    b5 = b6;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] onEach(double[] dArr, Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d5 : dArr) {
            action.invoke(Double.valueOf(d5));
        }
        return dArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] onEachIndexed(double[] dArr, Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4]));
            i4++;
            i5++;
        }
        return dArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final double random(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return random(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Double randomOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return randomOrNull(dArr, Random.Default);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static void reverse(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            byte b5 = bArr[nextInt];
            bArr[nextInt] = bArr[lastIndex];
            bArr[lastIndex] = b5;
            lastIndex--;
        }
    }

    @NotNull
    public static final List<Short> reversed(@NotNull short[] sArr) {
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Short> mutableList = toMutableList(sArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> runningReduce(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        byte b5 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b5));
        int length = bArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[i4])).byteValue();
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> runningReduceIndexed(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        byte b5 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b5));
        int length = bArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            b5 = operation.invoke(Integer.valueOf(i4), Byte.valueOf(b5), Byte.valueOf(bArr[i4])).byteValue();
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(boolean[] zArr, R r4, Function2<? super R, ? super Boolean, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Boolean.valueOf(zArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, Random.Default);
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull IntRange indices) {
        int[] copyOfRange;
        List<Integer> asList;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        asList = ArraysKt___ArraysJvmKt.asList(copyOfRange);
        return asList;
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            sArr2[i4] = sArr[num.intValue()];
            i4++;
        }
        return sArr2;
    }

    @NotNull
    public static final List<Double> sorted(@NotNull double[] dArr) {
        List<Double> asList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final int[] sortedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final int[] sortedArrayDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Double> sortedDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Double> sortedWith(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        List<Double> asList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final Set<Integer> subtract(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += selector.invoke(Integer.valueOf(i5)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull int[] iArr, @NotNull Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i4 : iArr) {
            d5 += selector.invoke(Integer.valueOf(i4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i4 : iArr) {
            d5 += selector.invoke(Integer.valueOf(i4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(int[] iArr, Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += selector.invoke(Integer.valueOf(i5)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] iArr, Function1<? super Integer, Long> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (int i4 : iArr) {
            j4 += selector.invoke(Integer.valueOf(i4)).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(short[] sArr, Function1<? super Short, UInt> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (short s4 : sArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Short.valueOf(s4)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(short[] sArr, Function1<? super Short, ULong> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (short s4 : sArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Short.valueOf(s4)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C toCollection(@NotNull int[] iArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i4 : iArr) {
            destination.add(Integer.valueOf(i4));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Double> toHashSet(@NotNull double[] dArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        return (HashSet) toCollection(dArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Double> toMutableSet(@NotNull double[] dArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        return (Set) toCollection(dArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Integer> union(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Double>> withIndex(@NotNull final double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Double>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$7
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Double> invoke() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        });
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull R[] other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Integer, V> associateWith(int[] iArr, Function1<? super Integer, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 : iArr) {
            linkedHashMap.put(Integer.valueOf(i4), valueSelector.invoke(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final boolean component1(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[0];
    }

    @InlineOnly
    private static final boolean component2(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[1];
    }

    @InlineOnly
    private static final boolean component3(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[2];
    }

    @InlineOnly
    private static final boolean component4(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[3];
    }

    @InlineOnly
    private static final boolean component5(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[4];
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (fArr[i4] == f5) {
                return true;
            }
        }
        return false;
    }

    @InlineOnly
    private static final int count(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public static final List<Boolean> distinct(@NotNull boolean[] zArr) {
        List<Boolean> list;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
        return list;
    }

    @InlineOnly
    private static final boolean elementAtOrElse(boolean[] zArr, int i4, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(zArr)) ? defaultValue.invoke(Integer.valueOf(i4)).booleanValue() : zArr[i4];
    }

    @InlineOnly
    private static final Boolean elementAtOrNull(boolean[] zArr, int i4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return getOrNull(zArr, i4);
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterNotTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Boolean find(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
        }
        return null;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(boolean[] zArr, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull boolean[] zArr, R r4, @NotNull Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull boolean[] zArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final void forEach(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z4 : zArr) {
            action.invoke(Boolean.valueOf(z4));
        }
    }

    public static final void forEachIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IntRange(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    @InlineOnly
    private static final boolean getOrElse(boolean[] zArr, int i4, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(zArr)) ? defaultValue.invoke(Integer.valueOf(i4)).booleanValue() : zArr[i4];
    }

    @Nullable
    public static final Boolean getOrNull(@NotNull boolean[] zArr, int i4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i4 < 0 || i4 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i4]);
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b5));
        }
        return destination;
    }

    @InlineOnly
    private static final boolean isEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull boolean[] zArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(zArr, charSequence, str, str2, i6, charSequence5, function1);
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static final boolean none(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] onEach(boolean[] zArr, Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z4 : zArr) {
            action.invoke(Boolean.valueOf(z4));
        }
        return zArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] onEachIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4]));
            i4++;
            i5++;
        }
        return zArr;
    }

    @NotNull
    public static final Pair<List<Byte>, List<Byte>> partition(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            } else {
                arrayList2.add(Byte.valueOf(b5));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean random(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return random(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Boolean randomOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return randomOrNull(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceRightIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s4 = sArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            s4 = operation.invoke(Integer.valueOf(i4), Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceRightOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s4 = sArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            s4 = operation.invoke(Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(char[] cArr, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(char[] cArr, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Character.valueOf(cArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, Random.Default);
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(iArr);
            reverse(iArr);
        }
    }

    @NotNull
    public static final List<Character> sorted(@NotNull char[] cArr) {
        List<Character> asList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Character> sortedDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    @NotNull
    public static final List<Boolean> sortedWith(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        List<Boolean> asList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(zArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final List<Byte> take(@NotNull byte[] bArr, int i4) {
        List<Byte> listOf;
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= bArr.length) {
            return toList(bArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (byte b5 : bArr) {
                arrayList.add(Byte.valueOf(b5));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Byte> takeLast(@NotNull byte[] bArr, int i4) {
        List<Byte> listOf;
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = bArr.length;
            if (i4 >= length) {
                return toList(bArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Byte.valueOf(bArr[i5]));
            }
            return arrayList;
        }
    }

    @NotNull
    public static final HashSet<Boolean> toHashSet(@NotNull boolean[] zArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        return (HashSet) toCollection(zArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Long> toMutableList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> toMutableSet(@NotNull boolean[] zArr) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        return (Set) toCollection(zArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Iterable<IndexedValue<Boolean>> withIndex(@NotNull final boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Boolean>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$8
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Boolean> invoke() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        });
    }

    public static final boolean all(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static final Iterable<Long> asIterable(@NotNull long[] jArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
    }

    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final long[] jArr) {
        Sequence<Long> emptySequence;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Long>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Long> iterator() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Short> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j4 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j4)), Long.valueOf(j4));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j4 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Long, ? super V>> M associateWithTo(long[] jArr, M destination, Function1<? super Long, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (long j4 : jArr) {
            destination.put(Long.valueOf(j4), valueSelector.invoke(Long.valueOf(j4)));
        }
        return destination;
    }

    @InlineOnly
    private static final char component1(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[0];
    }

    @InlineOnly
    private static final char component2(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[1];
    }

    @InlineOnly
    private static final char component3(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[2];
    }

    @InlineOnly
    private static final char component4(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[3];
    }

    @InlineOnly
    private static final char component5(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[4];
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (dArr[i4] == d5) {
                return true;
            }
        }
        return false;
    }

    @InlineOnly
    private static final int count(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public static final List<Character> distinct(@NotNull char[] cArr) {
        List<Character> list;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        list = CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
        return list;
    }

    @NotNull
    public static final List<Long> drop(@NotNull long[] jArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jArr.length - i4, 0);
            return takeLast(jArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLast(@NotNull long[] jArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jArr.length - i4, 0);
            return take(jArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        int lastIndex;
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @InlineOnly
    private static final char elementAtOrElse(char[] cArr, int i4, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(cArr)) ? defaultValue.invoke(Integer.valueOf(i4)).charValue() : cArr[i4];
    }

    @InlineOnly
    private static final Character elementAtOrNull(char[] cArr, int i4) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return getOrNull(cArr, i4);
    }

    @NotNull
    public static final List<Long> filter(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            long j4 = jArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Long.valueOf(j4)).booleanValue()) {
                destination.add(Long.valueOf(j4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Long> filterNot(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterNotTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Character find(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(char[] cArr, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull char[] cArr, R r4, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
        }
        return r4;
    }

    public static final <R> R foldIndexed(@NotNull char[] cArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i5), r5, Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
        return r4;
    }

    public static final <R> R foldRight(@NotNull long[] jArr, R r4, @NotNull Function2<? super Long, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Long.valueOf(jArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull long[] jArr, R r4, @NotNull Function3<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final void forEach(@NotNull char[] cArr, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c5 : cArr) {
            action.invoke(Character.valueOf(c5));
        }
    }

    public static final void forEachIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IntRange(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    @InlineOnly
    private static final char getOrElse(char[] cArr, int i4, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i4 < 0 || i4 > getLastIndex(cArr)) ? defaultValue.invoke(Integer.valueOf(i4)).charValue() : cArr[i4];
    }

    @Nullable
    public static final Character getOrNull(@NotNull char[] cArr, int i4) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i4 < 0 || i4 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i4]);
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b5));
        }
        return linkedHashMap;
    }

    public static int indexOf(@NotNull int[] iArr, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4 == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Long.valueOf(jArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Long> intersect(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final boolean isEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull char[] cArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i4, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i5 & 2) != 0 ? "" : charSequence2;
        String str2 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(cArr, charSequence, str, str2, i6, charSequence5, (Function1<? super Character, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull int[] iArr, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (i4 == iArr[length]) {
                    return length;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return -1;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j4 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b5);
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) < 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte minByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b5);
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) > 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b5);
    }

    public static final boolean none(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] onEach(char[] cArr, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c5 : cArr) {
            action.invoke(Character.valueOf(c5));
        }
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] onEachIndexed(char[] cArr, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            action.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4]));
            i4++;
            i5++;
        }
        return cArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return random(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return randomOrNull(cArr, (Random) Random.Default);
    }

    public static final short reduceRight(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short s4 = sArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                s4 = operation.invoke(Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short s4 = sArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                s4 = operation.invoke(Integer.valueOf(i4), Short.valueOf(sArr[i4]), Short.valueOf(s4)).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scan(@NotNull T[] tArr, R r4, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (XI.AbstractBinderC0002XI abstractBinderC0002XI : tArr) {
            r4 = operation.invoke(r4, abstractBinderC0002XI);
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scanIndexed(@NotNull T[] tArr, R r4, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, tArr[i4]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (Random) Random.Default);
    }

    public static short single(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length == 1) {
                return sArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull IntRange indices) {
        long[] copyOfRange;
        List<Long> asList;
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        asList = ArraysKt___ArraysJvmKt.asList(copyOfRange);
        return asList;
    }

    @NotNull
    public static final long[] sortedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final long[] sortedArrayDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final List<Character> sortedWith(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        List<Character> asList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        asList = ArraysKt___ArraysJvmKt.asList(typedArray);
        return asList;
    }

    @NotNull
    public static final Set<Long> subtract(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull long[] jArr, @NotNull Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (long j4 : jArr) {
            i4 += selector.invoke(Long.valueOf(j4)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull long[] jArr, @NotNull Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (long j4 : jArr) {
            d5 += selector.invoke(Long.valueOf(j4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (long j4 : jArr) {
            d5 += selector.invoke(Long.valueOf(j4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(long[] jArr, Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (long j4 : jArr) {
            i4 += selector.invoke(Long.valueOf(j4)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] jArr, Function1<? super Long, Long> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += selector.invoke(Long.valueOf(j5)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final List<Short> takeLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    @NotNull
    public static final List<Short> takeWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C toCollection(@NotNull long[] jArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (long j4 : jArr) {
            destination.add(Long.valueOf(j4));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull char[] cArr) {
        int coerceAtMost;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(cArr.length, 128);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
        return (HashSet) toCollection(cArr, new HashSet(mapCapacity));
    }

    @NotNull
    public static final List<Short> toList(@NotNull short[] sArr) {
        List<Short> emptyList;
        List<Short> listOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(sArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Character> toMutableSet(@NotNull char[] cArr) {
        int coerceAtMost;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(cArr.length, 128);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
        return (Set) toCollection(cArr, new LinkedHashSet(mapCapacity));
    }

    @NotNull
    public static final Set<Short> toSet(@NotNull short[] sArr) {
        Set<Short> emptySet;
        Set<Short> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
            return (Set) toCollection(sArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Short.valueOf(sArr[0]));
            return of;
        }
    }

    @NotNull
    public static final Set<Long> union(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Character>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$9
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Iterator<? extends Character> invoke() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        });
    }

    public static final <T> boolean any(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Long, V> associateWith(long[] jArr, Function1<? super Long, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j4 : jArr) {
            linkedHashMap.put(Long.valueOf(j4), valueSelector.invoke(Long.valueOf(j4)));
        }
        return linkedHashMap;
    }

    public static final double average(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : jArr) {
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    public static final <T> int count(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final List<Integer> filterIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            int i7 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Integer.valueOf(i6)).booleanValue()) {
                arrayList.add(Integer.valueOf(i6));
            }
            i4++;
            i5 = i7;
        }
        return arrayList;
    }

    @InlineOnly
    private static final Integer findLast(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                int i5 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                    return Integer.valueOf(i5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static int first(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(iArr.length == 0)) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(int[] iArr, C destination, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i4 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i4)));
        }
        return destination;
    }

    public static int last(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(iArr.length == 0)) {
            lastIndex = getLastIndex(iArr);
            return iArr[lastIndex];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            T t4 = tArr[length];
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte maxByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b5;
            }
            R invoke = selector.invoke(Byte.valueOf(b5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                R invoke2 = selector.invoke(Byte.valueOf(b6));
                if (invoke.compareTo(invoke2) < 0) {
                    b5 = b6;
                    invoke = invoke2;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte minByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            if (lastIndex == 0) {
                return b5;
            }
            R invoke = selector.invoke(Byte.valueOf(b5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                R invoke2 = selector.invoke(Byte.valueOf(b6));
                if (invoke.compareTo(invoke2) > 0) {
                    b5 = b6;
                    invoke = invoke2;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    public static final <T> boolean none(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(tArr.length == 0)) {
            return tArr[random.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <T> T randomOrNull(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            s4 = operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s4), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[it2.nextInt()])).shortValue();
        }
        return Short.valueOf(s4);
    }

    @NotNull
    public static final List<Integer> reversed(@NotNull int[] iArr) {
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Integer> mutableList = toMutableList(iArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            T t4 = tArr[lastIndex];
            tArr[lastIndex] = tArr[nextInt];
            tArr[nextInt] = t4;
        }
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t4 = null;
        boolean z4 = false;
        for (T t5 : tArr) {
            if (predicate.invoke(t5).booleanValue()) {
                if (z4) {
                    return null;
                }
                z4 = true;
                t4 = t5;
            }
        }
        if (z4) {
            return t4;
        }
        return null;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            iArr2[i4] = iArr[num.intValue()];
            i4++;
        }
        return iArr2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(int[] iArr, Function1<? super Integer, UInt> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (int i4 : iArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Integer.valueOf(i4)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(int[] iArr, Function1<? super Integer, ULong> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (int i4 : iArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Integer.valueOf(i4)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final List<Float> toMutableList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f5 : fArr) {
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull R[] other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Float> asIterable(@NotNull float[] fArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
    }

    @NotNull
    public static final Sequence<Float> asSequence(@NotNull final float[] fArr) {
        Sequence<Float> emptySequence;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Float>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Float> iterator() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f5 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f5)), Float.valueOf(f5));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Float, ? super V>> M associateWithTo(float[] fArr, M destination, Function1<? super Float, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (float f5 : fArr) {
            destination.put(Float.valueOf(f5), valueSelector.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final int count(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final List<Float> drop(@NotNull float[] fArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fArr.length - i4, 0);
            return takeLast(fArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> dropLast(@NotNull float[] fArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fArr.length - i4, 0);
            return take(fArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (short s4 : sArr) {
            if (z4) {
                arrayList.add(Short.valueOf(s4));
            } else if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
                z4 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filter(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            float f5 = fArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Float> filterNot(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull float[] fArr, R r4, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Float.valueOf(fArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull float[] fArr, R r4, @NotNull Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r4);
        }
        return r4;
    }

    public static int indexOf(@NotNull long[] jArr, long j4) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (j4 == jArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Float.valueOf(fArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Float> intersect(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static int lastIndexOf(@NotNull long[] jArr, long j4) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (j4 == jArr[length]) {
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

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    public static final boolean none(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final short reduce(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[it2.nextInt()])).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final short reduceIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                s4 = operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s4), Short.valueOf(sArr[nextInt])).shortValue();
            }
            return s4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static short[] reversedArray(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            sArr2[lastIndex - nextInt] = sArr[nextInt];
        }
        return sArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(short[] sArr, R r4, Function2<? super R, ? super Short, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(short[] sArr, R r4, Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Short.valueOf(sArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull IntRange indices) {
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(jArr);
            reverse(jArr);
        }
    }

    @NotNull
    public static final float[] sortedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final float[] sortedArrayDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Float> subtract(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull float[] fArr, @NotNull Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (float f5 : fArr) {
            i4 += selector.invoke(Float.valueOf(f5)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull float[] fArr, @NotNull Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (float f5 : fArr) {
            d5 += selector.invoke(Float.valueOf(f5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (float f5 : fArr) {
            d5 += selector.invoke(Float.valueOf(f5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(float[] fArr, Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (float f5 : fArr) {
            i4 += selector.invoke(Float.valueOf(f5)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(float[] fArr, Function1<? super Float, Long> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (float f5 : fArr) {
            j4 += selector.invoke(Float.valueOf(f5)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C toCollection(@NotNull float[] fArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (float f5 : fArr) {
            destination.add(Float.valueOf(f5));
        }
        return destination;
    }

    @NotNull
    public static final Set<Float> union(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Float, V> associateWith(float[] fArr, Function1<? super Float, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f5 : fArr) {
            linkedHashMap.put(Float.valueOf(f5), valueSelector.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    public static final boolean none(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte randomOrNull(@NotNull byte[] bArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceRightIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i4 = iArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            i4 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
        }
        return Integer.valueOf(i4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceRightOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i4 = iArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            i4 = operation.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
        }
        return Integer.valueOf(i4);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte b5 = null;
        boolean z4 = false;
        for (byte b6 : bArr) {
            if (predicate.invoke(Byte.valueOf(b6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                b5 = Byte.valueOf(b6);
                z4 = true;
            }
        }
        if (z4) {
            return b5;
        }
        return null;
    }

    @NotNull
    public static final List<Double> toMutableList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d5 : dArr) {
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Double> asIterable(@NotNull double[] dArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
    }

    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final double[] dArr) {
        Sequence<Double> emptySequence;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Double>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Double> iterator() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Integer> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i4)), Integer.valueOf(i4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d5 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d5)), Double.valueOf(d5));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Double, ? super V>> M associateWithTo(double[] dArr, M destination, Function1<? super Double, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (double d5 : dArr) {
            destination.put(Double.valueOf(d5), valueSelector.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final double average(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : fArr) {
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    public static final int count(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final <K> List<Short> distinctBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s4)))) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> drop(@NotNull double[] dArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(dArr.length - i4, 0);
            return takeLast(dArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> dropLast(@NotNull double[] dArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(dArr.length - i4, 0);
            return take(dArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        int lastIndex;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final List<Double> filter(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> filterIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            long j4 = jArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            double d5 = dArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Double> filterNot(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final Long findLast(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                long j4 = jArr[length];
                if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                    return Long.valueOf(j4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static long first(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(jArr.length == 0)) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return Integer.valueOf(i4);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i4)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(long[] jArr, C destination, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j4 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Long.valueOf(j4)));
        }
        return destination;
    }

    public static final <R> R foldRight(@NotNull double[] dArr, R r4, @NotNull Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Double.valueOf(dArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull double[] dArr, R r4, @NotNull Function3<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r4);
        }
        return r4;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (f5 == fArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Double.valueOf(dArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Double> intersect(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static long last(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(jArr.length == 0)) {
            lastIndex = getLastIndex(jArr);
            return jArr[lastIndex];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (f5 == fArr[length]) {
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

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            byte b5 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(short[] sArr, Function1<? super Short, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m415maxOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            if (t4.compareTo(t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                if (t4.compareTo(t5) < 0) {
                    t4 = t5;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(short[] sArr, Function1<? super Short, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m451minOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            T t5 = tArr[it2.nextInt()];
            if (t4.compareTo(t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(tArr.length == 0)) {
            T t4 = tArr[0];
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                T t5 = tArr[it2.nextInt()];
                if (t4.compareTo(t5) > 0) {
                    t4 = t5;
                }
            }
            return t4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final short minWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final byte random(@NotNull byte[] bArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(bArr.length == 0)) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduceRight(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i4 = iArr[lastIndex];
            for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
                i4 = operation.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i4 = iArr[lastIndex];
            for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
                i4 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(i4)).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static void reverse(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            short s4 = sArr[nextInt];
            sArr[nextInt] = sArr[lastIndex];
            sArr[lastIndex] = s4;
            lastIndex--;
        }
    }

    @NotNull
    public static final List<Long> reversed(@NotNull long[] jArr) {
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Long> mutableList = toMutableList(jArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> runningReduce(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[i4])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> runningReduceIndexed(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            s4 = operation.invoke(Integer.valueOf(i4), Short.valueOf(s4), Short.valueOf(sArr[i4])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static int single(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length == 1) {
                return iArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull IntRange indices) {
        List<Double> asList;
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        asList = ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
        return asList;
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            jArr2[i4] = jArr[num.intValue()];
            i4++;
        }
        return jArr2;
    }

    @NotNull
    public static final double[] sortedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final double[] sortedArrayDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Double> subtract(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull double[] dArr, @NotNull Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (double d5 : dArr) {
            i4 += selector.invoke(Double.valueOf(d5)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull double[] dArr, @NotNull Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += selector.invoke(Double.valueOf(d6)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += selector.invoke(Double.valueOf(d6)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(double[] dArr, Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (double d5 : dArr) {
            i4 += selector.invoke(Double.valueOf(d5)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(double[] dArr, Function1<? super Double, Long> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (double d5 : dArr) {
            j4 += selector.invoke(Double.valueOf(d5)).longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(long[] jArr, Function1<? super Long, UInt> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (long j4 : jArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Long.valueOf(j4)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(long[] jArr, Function1<? super Long, ULong> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (long j4 : jArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Long.valueOf(j4)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final List<Integer> takeLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    @NotNull
    public static final List<Integer> takeWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C toCollection(@NotNull double[] dArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (double d5 : dArr) {
            destination.add(Double.valueOf(d5));
        }
        return destination;
    }

    @NotNull
    public static final List<Integer> toList(@NotNull int[] iArr) {
        List<Integer> emptyList;
        List<Integer> listOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(iArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Integer> toSet(@NotNull int[] iArr) {
        Set<Integer> emptySet;
        Set<Integer> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
            return (Set) toCollection(iArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Integer.valueOf(iArr[0]));
            return of;
        }
    }

    @NotNull
    public static final Set<Double> union(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull R[] other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Double, V> associateWith(double[] dArr, Function1<? super Double, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d5 : dArr) {
            linkedHashMap.put(Double.valueOf(d5), valueSelector.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
        }
        return null;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull short[] sArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (short s4 : sArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Short.valueOf(s4)));
            } else {
                buffer.append(String.valueOf((int) s4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean none(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short randomOrNull(@NotNull short[] sArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    public static final void sortDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(fArr);
            reverse(fArr);
        }
    }

    @NotNull
    public static final List<Boolean> toMutableList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Boolean> asIterable(@NotNull boolean[] zArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(zArr);
    }

    @NotNull
    public static final Sequence<Boolean> asSequence(@NotNull final boolean[] zArr) {
        Sequence<Boolean> emptySequence;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Boolean>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Boolean> iterator() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z4 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z4)), Boolean.valueOf(z4));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Boolean, ? super V>> M associateWithTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (boolean z4 : zArr) {
            destination.put(Boolean.valueOf(z4), valueSelector.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    public static final int count(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final List<Boolean> drop(@NotNull boolean[] zArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(zArr.length - i4, 0);
            return takeLast(zArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> dropLast(@NotNull boolean[] zArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(zArr.length - i4, 0);
            return take(zArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> filter(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            boolean z4 = zArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> filterNot(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull boolean[] zArr, R r4, @NotNull Function2<? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Boolean.valueOf(zArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull boolean[] zArr, R r4, @NotNull Function3<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r4);
        }
        return r4;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return destination;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (d5 == dArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Boolean> intersect(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (d5 == dArr[length]) {
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

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    public static final boolean none(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Pair<List<Short>, List<Short>> partition(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            } else {
                arrayList2.add(Short.valueOf(s4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            i4 = operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i4), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            i4 = operation.invoke(Integer.valueOf(i4), Integer.valueOf(iArr[it2.nextInt()])).intValue();
        }
        return Integer.valueOf(i4);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte b5 = bArr[lastIndex];
            bArr[lastIndex] = bArr[nextInt];
            bArr[nextInt] = b5;
        }
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z4 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (z4) {
                    return null;
                }
                sh = Short.valueOf(s4);
                z4 = true;
            }
        }
        if (z4) {
            return sh;
        }
        return null;
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final char[] sortedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    @NotNull
    public static final char[] sortedArrayDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Boolean> subtract(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (boolean z4 : zArr) {
            i4 += selector.invoke(Boolean.valueOf(z4)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (boolean z4 : zArr) {
            d5 += selector.invoke(Boolean.valueOf(z4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (boolean z4 : zArr) {
            d5 += selector.invoke(Boolean.valueOf(z4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(boolean[] zArr, Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (boolean z4 : zArr) {
            i4 += selector.invoke(Boolean.valueOf(z4)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(boolean[] zArr, Function1<? super Boolean, Long> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (boolean z4 : zArr) {
            j4 += selector.invoke(Boolean.valueOf(z4)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final List<Short> take(@NotNull short[] sArr, int i4) {
        List<Short> listOf;
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= sArr.length) {
            return toList(sArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (short s4 : sArr) {
                arrayList.add(Short.valueOf(s4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Short> takeLast(@NotNull short[] sArr, int i4) {
        List<Short> listOf;
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = sArr.length;
            if (i4 >= length) {
                return toList(sArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Short.valueOf(sArr[i5]));
            }
            return arrayList;
        }
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C toCollection(@NotNull boolean[] zArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (boolean z4 : zArr) {
            destination.add(Boolean.valueOf(z4));
        }
        return destination;
    }

    @NotNull
    public static final Set<Boolean> union(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Boolean, V> associateWith(boolean[] zArr, Function1<? super Boolean, ? extends V> valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z4 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z4), valueSelector.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    public static final double average(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        int i4 = 0;
        for (double d6 : dArr) {
            d5 += d6;
            i4++;
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        double d7 = i4;
        Double.isNaN(d7);
        return d5 / d7;
    }

    public static final int count(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final List<Integer> dropWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (int i4 : iArr) {
            if (z4) {
                arrayList.add(Integer.valueOf(i4));
            } else if (!predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
                z4 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filterIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            float f5 = fArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InlineOnly
    private static final Float findLast(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                float f5 = fArr[length];
                if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                    return Float.valueOf(f5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final float first(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(float[] fArr, C destination, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final float last(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            short s4 = sArr[length];
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f5 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    public static final boolean none(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final short random(@NotNull short[] sArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(sArr.length == 0)) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull int[] iArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final int reduce(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                i4 = operation.invoke(Integer.valueOf(i4), Integer.valueOf(iArr[it2.nextInt()])).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final int reduceIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                i4 = operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i4), Integer.valueOf(iArr[nextInt])).intValue();
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceRightIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j4 = jArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            j4 = operation.invoke(Integer.valueOf(i4), Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
        }
        return Long.valueOf(j4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceRightOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j4 = jArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            j4 = operation.invoke(Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
        }
        return Long.valueOf(j4);
    }

    @NotNull
    public static final List<Float> reversed(@NotNull float[] fArr) {
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Float> mutableList = toMutableList(fArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static int[] reversedArray(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            iArr2[lastIndex - nextInt] = iArr[nextInt];
        }
        return iArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(int[] iArr, R r4, Function2<? super R, ? super Integer, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i4 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(int[] iArr, R r4, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Integer.valueOf(iArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            fArr2[i4] = fArr[num.intValue()];
            i4++;
        }
        return fArr2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(float[] fArr, Function1<? super Float, UInt> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (float f5 : fArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Float.valueOf(f5)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(float[] fArr, Function1<? super Float, ULong> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (float f5 : fArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Float.valueOf(f5)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c5 : cArr) {
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull R[] other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i4]), other[i4]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull char[] cArr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(cArr);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final char[] cArr) {
        Sequence<Character> emptySequence;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            emptySequence = SequencesKt__SequencesKt.emptySequence();
            return emptySequence;
        }
        return new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j4 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Long> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j4 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j4)), Long.valueOf(j4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c5 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c5)), Character.valueOf(c5));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(char[] cArr, M destination, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (char c5 : cArr) {
            destination.put(Character.valueOf(c5), valueSelector.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final int count(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @NotNull
    public static final List<Character> drop(@NotNull char[] cArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(cArr.length - i4, 0);
            return takeLast(cArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> dropLast(@NotNull char[] cArr, int i4) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i4 >= 0) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(cArr.length - i4, 0);
            return take(cArr, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        int lastIndex;
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final List<Character> filter(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char c5 = cArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @NotNull
    public static final List<Character> filterNot(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Long.valueOf(j4)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(@NotNull char[] cArr, R r4, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Character.valueOf(cArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(@NotNull char[] cArr, R r4, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r4);
        }
        return r4;
    }

    @NotNull
    public static final <K> Map<K, List<Short>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    public static final int indexOf(@NotNull boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (z4 == zArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.invoke(Character.valueOf(cArr[i4])).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
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

    @NotNull
    public static final Set<Character> intersect(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final int lastIndexOf(@NotNull boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (z4 == zArr[length]) {
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

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            destination.add(transform.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final boolean none(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final long reduceRight(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long j4 = jArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                j4 = operation.invoke(Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long j4 = jArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                j4 = operation.invoke(Integer.valueOf(i4), Long.valueOf(jArr[i4]), Long.valueOf(j4)).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static long single(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length == 1) {
                return jArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull IntRange indices) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(dArr);
            reverse(dArr);
        }
    }

    @NotNull
    public static final Set<Character> subtract(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull char[] cArr, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (char c5 : cArr) {
            i4 += selector.invoke(Character.valueOf(c5)).intValue();
        }
        return i4;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull char[] cArr, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (char c5 : cArr) {
            d5 += selector.invoke(Character.valueOf(c5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (char c5 : cArr) {
            d5 += selector.invoke(Character.valueOf(c5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(char[] cArr, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i4 = 0;
        for (char c5 : cArr) {
            i4 += selector.invoke(Character.valueOf(c5)).intValue();
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(char[] cArr, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j4 = 0;
        for (char c5 : cArr) {
            j4 += selector.invoke(Character.valueOf(c5)).longValue();
        }
        return j4;
    }

    @NotNull
    public static final List<Long> takeLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    @NotNull
    public static final List<Long> takeWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull char[] cArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c5 : cArr) {
            destination.add(Character.valueOf(c5));
        }
        return destination;
    }

    @NotNull
    public static final List<Long> toList(@NotNull long[] jArr) {
        List<Long> emptyList;
        List<Long> listOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(jArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Long> toSet(@NotNull long[] jArr) {
        Set<Long> emptySet;
        Set<Long> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
            return (Set) toCollection(jArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Long.valueOf(jArr[0]));
            return of;
        }
    }

    @NotNull
    public static final Set<Character> union(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Character, V> associateWith(char[] cArr, Function1<? super Character, ? extends V> valueSelector) {
        int coerceAtMost;
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(cArr.length, 128);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c5 : cArr) {
            linkedHashMap.put(Character.valueOf(c5), valueSelector.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i4 = 0;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxOrNull(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            if (b5 < b6) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) < 0) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minOrNull(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            byte b6 = bArr[it2.nextInt()];
            if (b5 > b6) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) > 0) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    public static final boolean none(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull long[] jArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z4 = false;
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                if (z4) {
                    return null;
                }
                num = Integer.valueOf(i4);
                z4 = true;
            }
        }
        if (z4) {
            return num;
        }
        return null;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : tArr) {
            destination.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Integer> distinctBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i4)))) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> filterIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            double d5 = dArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InlineOnly
    private static final Double findLast(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                double d5 = dArr[length];
                if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                    return Double.valueOf(d5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final double first(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(double[] dArr, C destination, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final int indexOf(@NotNull char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (c5 == cArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final double last(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(@NotNull char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (c5 == cArr[length]) {
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

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            int i5 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return Integer.valueOf(i5);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d5 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short maxByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) < 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short maxByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s4;
            }
            R invoke = selector.invoke(Short.valueOf(s4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                R invoke2 = selector.invoke(Short.valueOf(s5));
                if (invoke.compareTo(invoke2) < 0) {
                    s4 = s5;
                    invoke = invoke2;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(int[] iArr, Function1<? super Integer, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m412maxOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final byte maxOrThrow(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                if (b5 < b6) {
                    b5 = b6;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) < 0) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short minByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) > 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short minByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            if (lastIndex == 0) {
                return s4;
            }
            R invoke = selector.invoke(Short.valueOf(s4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                R invoke2 = selector.invoke(Short.valueOf(s5));
                if (invoke.compareTo(invoke2) > 0) {
                    s4 = s5;
                    invoke = invoke2;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(int[] iArr, Function1<? super Integer, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m448minOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final byte minOrThrow(@NotNull byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(bArr.length == 0)) {
            byte b5 = bArr[0];
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                byte b6 = bArr[it2.nextInt()];
                if (b5 > b6) {
                    b5 = b6;
                }
            }
            return b5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final int minWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                if (comparator.compare(Integer.valueOf(i4), Integer.valueOf(i5)) > 0) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull int[] iArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(iArr.length == 0)) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static void reverse(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            int i4 = iArr[nextInt];
            iArr[nextInt] = iArr[lastIndex];
            iArr[lastIndex] = i4;
            lastIndex--;
        }
    }

    @NotNull
    public static final List<Double> reversed(@NotNull double[] dArr) {
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Double> mutableList = toMutableList(dArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> runningReduce(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        int i4 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i4));
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = operation.invoke(Integer.valueOf(i4), Integer.valueOf(iArr[i5])).intValue();
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> runningReduceIndexed(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        int i4 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i4));
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(iArr[i5])).intValue();
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull T[] tArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(tArr[num.intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            dArr2[i4] = dArr[num.intValue()];
            i4++;
        }
        return dArr2;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        for (Double d6 : dArr) {
            d5 += d6.doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int i4 = 0;
        for (Integer num : numArr) {
            i4 += num.intValue();
        }
        return i4;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        long j4 = 0;
        for (Long l4 : lArr) {
            j4 += l4.longValue();
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(double[] dArr, Function1<? super Double, UInt> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (double d5 : dArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Double.valueOf(d5)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(double[] dArr, Function1<? super Double, ULong> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (double d5 : dArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Double.valueOf(d5)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull R[] other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float randomOrNull(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            j4 = operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j4), Long.valueOf(jArr[nextInt])).longValue();
        }
        return Long.valueOf(j4);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            j4 = operation.invoke(Long.valueOf(j4), Long.valueOf(jArr[it2.nextInt()])).longValue();
        }
        return Long.valueOf(j4);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceRightIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f5 = fArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            f5 = operation.invoke(Integer.valueOf(i4), Float.valueOf(fArr[i4]), Float.valueOf(f5)).floatValue();
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceRightOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f5 = fArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            f5 = operation.invoke(Float.valueOf(fArr[i4]), Float.valueOf(f5)).floatValue();
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short s4 = sArr[lastIndex];
            sArr[lastIndex] = sArr[nextInt];
            sArr[nextInt] = s4;
        }
    }

    public static final void sortDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(cArr);
            reverse(cArr);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f5 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Float> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f5 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f5)), Float.valueOf(f5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b5 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b5)), valueTransform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    @NotNull
    public static final List<Float> dropLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final List<Long> dropWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (long j4 : jArr) {
            if (z4) {
                arrayList.add(Long.valueOf(j4));
            } else if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
                z4 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Float.valueOf(f5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull int[] iArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (int i6 : iArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Integer.valueOf(i6)));
            } else {
                buffer.append(String.valueOf(i6));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final long reduce(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                j4 = operation.invoke(Long.valueOf(j4), Long.valueOf(jArr[it2.nextInt()])).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final long reduceIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                j4 = operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j4), Long.valueOf(jArr[nextInt])).longValue();
            }
            return j4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float f5 = fArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                f5 = operation.invoke(Float.valueOf(fArr[i4]), Float.valueOf(f5)).floatValue();
            }
            return f5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float f5 = fArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                f5 = operation.invoke(Integer.valueOf(i4), Float.valueOf(fArr[i4]), Float.valueOf(f5)).floatValue();
            }
            return f5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static long[] reversedArray(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            jArr2[lastIndex - nextInt] = jArr[nextInt];
        }
        return jArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(long[] jArr, R r4, Function2<? super R, ? super Long, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j4 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(long[] jArr, R r4, Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Long.valueOf(jArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final float single(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length == 1) {
                return fArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long l4 = null;
        boolean z4 = false;
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                if (z4) {
                    return null;
                }
                l4 = Long.valueOf(j4);
                z4 = true;
            }
        }
        if (z4) {
            return l4;
        }
        return null;
    }

    @NotNull
    public static final List<Float> takeLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    @NotNull
    public static final List<Float> takeWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> toList(@NotNull float[] fArr) {
        List<Float> emptyList;
        List<Float> listOf;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(fArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Float> toSet(@NotNull float[] fArr) {
        Set<Float> emptySet;
        Set<Float> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
            return (Set) toCollection(fArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Float.valueOf(fArr[0]));
            return of;
        }
    }

    @NotNull
    public static final List<Boolean> filterIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            boolean z4 = zArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InlineOnly
    private static final Boolean findLast(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                boolean z4 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                    return Boolean.valueOf(z4);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final boolean first(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(zArr.length == 0)) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(boolean[] zArr, C destination, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i4 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i4));
        }
        return destination;
    }

    public static final boolean last(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(zArr.length == 0)) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            long j4 = jArr[length];
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return Long.valueOf(j4);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @NotNull
    public static final Pair<List<Integer>, List<Integer>> partition(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            } else {
                arrayList2.add(Integer.valueOf(i4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull long[] jArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(jArr.length == 0)) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double randomOrNull(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    @NotNull
    public static final List<Boolean> reversed(@NotNull boolean[] zArr) {
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Boolean> mutableList = toMutableList(zArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            zArr2[i4] = zArr[num.intValue()];
            i4++;
        }
        return zArr2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(boolean[] zArr, Function1<? super Boolean, UInt> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (boolean z4 : zArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Boolean.valueOf(z4)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(boolean[] zArr, Function1<? super Boolean, ULong> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (boolean z4 : zArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Boolean.valueOf(z4)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final List<Integer> take(@NotNull int[] iArr, int i4) {
        List<Integer> listOf;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= iArr.length) {
            return toList(iArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (int i6 : iArr) {
                arrayList.add(Integer.valueOf(i6));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Integer> takeLast(@NotNull int[] iArr, int i4) {
        List<Integer> listOf;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = iArr.length;
            if (i4 >= length) {
                return toList(iArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Integer.valueOf(iArr[i5]));
            }
            return arrayList;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull R[] other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxOrNull(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            if (s4 < s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minOrNull(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            short s5 = sArr[it2.nextInt()];
            if (s4 > s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr, int i4, int i5) {
        Comparator reverseOrder;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        reverseOrder = ComparisonsKt__ComparisonsKt.reverseOrder();
        ArraysKt___ArraysJvmKt.sortWith(tArr, reverseOrder, i4, i5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final short maxOrThrow(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                if (s4 < s5) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) < 0) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final short minOrThrow(@NotNull short[] sArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(sArr.length == 0)) {
            short s4 = sArr[0];
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                short s5 = sArr[it2.nextInt()];
                if (s4 > s5) {
                    s4 = s5;
                }
            }
            return s4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) > 0) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean randomOrNull(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceRightIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d5 = dArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            d5 = operation.invoke(Integer.valueOf(i4), Double.valueOf(dArr[i4]), Double.valueOf(d5)).doubleValue();
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceRightOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d5 = dArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            d5 = operation.invoke(Double.valueOf(dArr[i4]), Double.valueOf(d5)).doubleValue();
        }
        return Double.valueOf(d5);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float f5 = null;
        boolean z4 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                f5 = Float.valueOf(f6);
                z4 = true;
            }
        }
        if (z4) {
            return f5;
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Byte> emptyList;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Byte.valueOf(bArr[num.intValue()]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull byte[] bArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(bArr, i4, i5);
        reverse(bArr, i4, i5);
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d5 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Double> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d5 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d5)), Double.valueOf(d5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i4 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i4)), valueTransform.invoke(Integer.valueOf(i4)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Long> distinctBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j4 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j4)))) {
                arrayList.add(Long.valueOf(j4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final List<Character> filterIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            char c5 = cArr[i4];
            int i6 = i5 + 1;
            if (predicate.invoke(Integer.valueOf(i5), Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @InlineOnly
    private static final Character findLast(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char c5 = cArr[length];
                if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                    return Character.valueOf(c5);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    public static final char first(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(cArr.length == 0)) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Double.valueOf(d5)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(char[] cArr, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i4));
        }
        return linkedHashMap;
    }

    public static final char last(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(cArr.length == 0)) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            float f5 = fArr[length];
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c5 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i4])));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(long[] jArr, Function1<? super Long, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m413maxOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) < 0) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(long[] jArr, Function1<? super Long, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m449minOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final long minWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                if (comparator.compare(Long.valueOf(j4), Long.valueOf(j5)) > 0) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final float random(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(fArr.length == 0)) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            f5 = operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f5), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[it2.nextInt()])).floatValue();
        }
        return Float.valueOf(f5);
    }

    public static final double reduceRight(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double d5 = dArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                d5 = operation.invoke(Double.valueOf(dArr[i4]), Double.valueOf(d5)).doubleValue();
            }
            return d5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double d5 = dArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                d5 = operation.invoke(Integer.valueOf(i4), Double.valueOf(dArr[i4]), Double.valueOf(d5)).doubleValue();
            }
            return d5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static void reverse(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            long j4 = jArr[nextInt];
            jArr[nextInt] = jArr[lastIndex];
            jArr[lastIndex] = j4;
            lastIndex--;
        }
    }

    @NotNull
    public static final List<Character> reversed(@NotNull char[] cArr) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<Character> mutableList = toMutableList(cArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> runningReduce(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        long j4 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j4));
        int length = jArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            j4 = operation.invoke(Long.valueOf(j4), Long.valueOf(jArr[i4])).longValue();
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> runningReduceIndexed(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        long j4 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j4));
        int length = jArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            j4 = operation.invoke(Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(jArr[i4])).longValue();
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int i4 = iArr[lastIndex];
            iArr[lastIndex] = iArr[nextInt];
            iArr[nextInt] = i4;
        }
    }

    public static final double single(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length == 1) {
                return dArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        int i4 = 0;
        for (Integer num : indices) {
            cArr2[i4] = cArr[num.intValue()];
            i4++;
        }
        return cArr2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(char[] cArr, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m130constructorimpl = UInt.m130constructorimpl(0);
        for (char c5 : cArr) {
            m130constructorimpl = UInt.m130constructorimpl(m130constructorimpl + selector.invoke(Character.valueOf(c5)).m182unboximpl());
        }
        return m130constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(char[] cArr, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m209constructorimpl = ULong.m209constructorimpl(0L);
        for (char c5 : cArr) {
            m209constructorimpl = ULong.m209constructorimpl(m209constructorimpl + selector.invoke(Character.valueOf(c5)).m261unboximpl());
        }
        return m209constructorimpl;
    }

    @NotNull
    public static final List<Double> takeLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    @NotNull
    public static final List<Double> takeWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> toList(@NotNull double[] dArr) {
        List<Double> emptyList;
        List<Double> listOf;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(dArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Double> toSet(@NotNull double[] dArr) {
        Set<Double> emptySet;
        Set<Double> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
            return (Set) toCollection(dArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Double.valueOf(dArr[0]));
            return of;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull R[] other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i4]), other[i4]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> dropWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (float f5 : fArr) {
            if (z4) {
                arrayList.add(Float.valueOf(f5));
            } else if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
                z4 = true;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final float reduce(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[it2.nextInt()])).floatValue();
            }
            return f5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final float reduceIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                f5 = operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f5), Float.valueOf(fArr[nextInt])).floatValue();
            }
            return f5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final float[] reversedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            fArr2[lastIndex - nextInt] = fArr[nextInt];
        }
        return fArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(float[] fArr, R r4, Function2<? super R, ? super Float, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(float[] fArr, R r4, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Float.valueOf(fArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull short[] sArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(sArr, i4, i5);
        reverse(sArr, i4, i5);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j4 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j4)), valueTransform.invoke(Long.valueOf(j4)));
        }
        return destination;
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double d5 = null;
        boolean z4 = false;
        for (double d6 : dArr) {
            if (predicate.invoke(Double.valueOf(d6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                d5 = Double.valueOf(d6);
                z4 = true;
            }
        }
        if (z4) {
            return d5;
        }
        return null;
    }

    public static final <T> T first(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull long[] jArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (long j4 : jArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Long.valueOf(j4)));
            } else {
                buffer.append(String.valueOf(j4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> T last(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                T t4 = tArr[length];
                if (!predicate.invoke(t4).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return t4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            double d5 = dArr[length];
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int maxByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i4;
            }
            R invoke = selector.invoke(Integer.valueOf(i4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                R invoke2 = selector.invoke(Integer.valueOf(i5));
                if (invoke.compareTo(invoke2) < 0) {
                    i4 = i5;
                    invoke = invoke2;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxOrNull(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            if (i4 < i5) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int minByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            if (lastIndex == 0) {
                return i4;
            }
            R invoke = selector.invoke(Integer.valueOf(i4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                R invoke2 = selector.invoke(Integer.valueOf(i5));
                if (invoke.compareTo(invoke2) > 0) {
                    i4 = i5;
                    invoke = invoke2;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minOrNull(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            if (i4 > i5) {
                i4 = i5;
            }
        }
        return Integer.valueOf(i4);
    }

    @SinceKotlin(version = "1.3")
    public static final double random(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(dArr.length == 0)) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z4 = zArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            z4 = operation.invoke(Integer.valueOf(i4), Boolean.valueOf(zArr[i4]), Boolean.valueOf(z4)).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceRightOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z4 = zArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            z4 = operation.invoke(Boolean.valueOf(zArr[i4]), Boolean.valueOf(z4)).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) ArraysKt.copyOfRange(tArr, 0, 0) : (T[]) ArraysKt.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull int[] iArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(iArr, i4, i5);
        reverse(iArr, i4, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i4], obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z4 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Boolean> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z4 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z4)), Boolean.valueOf(z4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f5 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f5)), valueTransform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> dropLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Boolean.valueOf(z4)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j4 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j4));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i4);
        }
        R invoke = selector.invoke(Integer.valueOf(i4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i5));
            if (invoke.compareTo(invoke2) < 0) {
                i4 = i5;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final int maxOrThrow(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer minByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i4);
        }
        R invoke = selector.invoke(Integer.valueOf(i4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            int i5 = iArr[it2.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i5));
            if (invoke.compareTo(invoke2) > 0) {
                i4 = i5;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final int minOrThrow(@NotNull int[] iArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(iArr.length == 0)) {
            int i4 = iArr[0];
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                int i5 = iArr[it2.nextInt()];
                if (i4 > i5) {
                    i4 = i5;
                }
            }
            return i4;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Long>, List<Long>> partition(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                arrayList.add(Long.valueOf(j4));
            } else {
                arrayList2.add(Long.valueOf(j4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean z4 = zArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                z4 = operation.invoke(Boolean.valueOf(zArr[i4]), Boolean.valueOf(z4)).booleanValue();
            }
            return z4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean z4 = zArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                z4 = operation.invoke(Integer.valueOf(i4), Boolean.valueOf(zArr[i4]), Boolean.valueOf(z4)).booleanValue();
            }
            return z4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean single(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length == 1) {
                return zArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Short> emptyList;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Short.valueOf(sArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> take(@NotNull long[] jArr, int i4) {
        List<Long> listOf;
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= jArr.length) {
            return toList(jArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (long j4 : jArr) {
                arrayList.add(Long.valueOf(j4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Long> takeLast(@NotNull long[] jArr, int i4) {
        List<Long> listOf;
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = jArr.length;
            if (i4 >= length) {
                return toList(jArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Long.valueOf(jArr[i5]));
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Boolean> takeLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    @NotNull
    public static final List<Boolean> takeWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> toList(@NotNull boolean[] zArr) {
        List<Boolean> emptyList;
        List<Boolean> listOf;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(zArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Boolean> toSet(@NotNull boolean[] zArr) {
        Set<Boolean> emptySet;
        Set<Boolean> of;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
            return (Set) toCollection(zArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Boolean.valueOf(zArr[0]));
            return of;
        }
    }

    public static final byte first(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return b5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            float f6 = fArr[it2.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) < 0) {
                f5 = f6;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            float f6 = fArr[it2.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) > 0) {
                f5 = f6;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            d5 = operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d5), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[it2.nextInt()])).doubleValue();
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr, @NotNull Random random) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long j4 = jArr[lastIndex];
            jArr[lastIndex] = jArr[nextInt];
            jArr[nextInt] = j4;
        }
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                bool = Boolean.valueOf(z5);
                z4 = true;
            }
        }
        if (z4) {
            return bool;
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull IntRange indices) {
        byte[] copyOfRange;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return new byte[0];
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return copyOfRange;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull long[] jArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(jArr, i4, i5);
        reverse(jArr, i4, i5);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d5 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d5)), valueTransform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Float> distinctBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f5)))) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (double d5 : dArr) {
            if (z4) {
                arrayList.add(Double.valueOf(d5));
            } else if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
                z4 = true;
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            boolean z4 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m411maxOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                float f6 = fArr[it2.nextInt()];
                if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) < 0) {
                    f5 = f6;
                }
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m447minOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
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
    private static final <R> R minOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final float minWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                float f6 = fArr[it2.nextInt()];
                if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) > 0) {
                    f5 = f6;
                }
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final boolean random(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(zArr.length == 0)) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final double reduce(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[it2.nextInt()])).doubleValue();
            }
            return d5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final double reduceIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                d5 = operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d5), Double.valueOf(dArr[nextInt])).doubleValue();
            }
            return d5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final void reverse(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            float f5 = fArr[nextInt];
            fArr[nextInt] = fArr[lastIndex];
            fArr[lastIndex] = f5;
            lastIndex--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final double[] reversedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            dArr2[lastIndex - nextInt] = dArr[nextInt];
        }
        return dArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(double[] dArr, R r4, Function2<? super R, ? super Double, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(double[] dArr, R r4, Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Double.valueOf(dArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> runningReduce(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        float f5 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f5));
        int length = fArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[i4])).floatValue();
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> runningReduceIndexed(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        float f5 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f5));
        int length = fArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            f5 = operation.invoke(Integer.valueOf(i4), Float.valueOf(f5), Float.valueOf(fArr[i4])).floatValue();
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    public static final short first(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return s4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                byte b5 = bArr[length];
                if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return b5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c5 = cArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            c5 = operation.invoke(Integer.valueOf(i4), Character.valueOf(cArr[i4]), Character.valueOf(c5)).charValue();
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c5 = cArr[lastIndex];
        for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
            c5 = operation.invoke(Character.valueOf(cArr[i4]), Character.valueOf(c5)).charValue();
        }
        return Character.valueOf(c5);
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull IntRange indices) {
        short[] copyOfRange;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return new short[0];
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return copyOfRange;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull float[] fArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(fArr, i4, i5);
        reverse(fArr, i4, i5);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(cArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c5 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(cArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c5 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c5)), Character.valueOf(c5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z4 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z4)), valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    @NotNull
    public static final List<Character> dropLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(c5)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Long>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j4 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j4));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxOrNull(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            if (j4 < j5) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minOrNull(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            if (j4 > j5) {
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    public static final char reduceRight(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char c5 = cArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                c5 = operation.invoke(Character.valueOf(cArr[i4]), Character.valueOf(c5)).charValue();
            }
            return c5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char c5 = cArr[lastIndex];
            for (int i4 = lastIndex - 1; i4 >= 0; i4--) {
                c5 = operation.invoke(Integer.valueOf(i4), Character.valueOf(cArr[i4]), Character.valueOf(c5)).charValue();
            }
            return c5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static char single(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                ch = Character.valueOf(c5);
                z4 = true;
            }
        }
        if (z4) {
            return ch;
        }
        return null;
    }

    @NotNull
    public static final List<Character> takeLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    @NotNull
    public static final List<Character> takeWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> toList(@NotNull char[] cArr) {
        List<Character> emptyList;
        List<Character> listOf;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (length != 1) {
            return toMutableList(cArr);
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
            return listOf;
        }
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull char[] cArr) {
        Set<Character> emptySet;
        Set<Character> of;
        int coerceAtMost;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        } else if (length != 1) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(cArr.length, 128);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(coerceAtMost);
            return (Set) toCollection(cArr, new LinkedHashSet(mapCapacity));
        } else {
            of = SetsKt__SetsJVMKt.setOf(Character.valueOf(cArr[0]));
            return of;
        }
    }

    public static final int first(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                return i4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            char c5 = cArr[length];
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
            if (i4 < 0) {
                return null;
            }
            length = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final long maxOrThrow(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                if (j4 < j5) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final long minOrThrow(@NotNull long[] jArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                if (j4 > j5) {
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (!(cArr.length == 0)) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Integer.valueOf(iArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull IntRange indices) {
        int[] copyOfRange;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return new int[0];
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return copyOfRange;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull double[] dArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(dArr, i4, i5);
        reverse(dArr, i4, i5);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c5 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c5)), valueTransform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull float[] fArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (float f5 : fArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Float.valueOf(f5)));
            } else {
                buffer.append(String.valueOf(f5));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            z4 = operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z4), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[it2.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            float f5 = fArr[lastIndex];
            fArr[lastIndex] = fArr[nextInt];
            fArr[nextInt] = f5;
        }
    }

    @NotNull
    public static final List<Boolean> dropWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (z4) {
                arrayList.add(Boolean.valueOf(z5));
            } else if (!predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final long first(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                return j4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f5));
        }
        return destination;
    }

    public static final short last(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                short s4 = sArr[length];
                if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return s4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            double d6 = dArr[it2.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) < 0) {
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            double d6 = dArr[it2.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) > 0) {
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    @NotNull
    public static final Pair<List<Float>, List<Float>> partition(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            } else {
                arrayList2.add(Float.valueOf(f5));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final boolean reduce(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[it2.nextInt()])).booleanValue();
            }
            return z4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final boolean reduceIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                z4 = operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z4), Boolean.valueOf(zArr[nextInt])).booleanValue();
            }
            return z4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final boolean[] reversedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            zArr2[lastIndex - nextInt] = zArr[nextInt];
        }
        return zArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(boolean[] zArr, R r4, Function2<? super R, ? super Boolean, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Boolean.valueOf(zArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull IntRange indices) {
        long[] copyOfRange;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return new long[0];
        }
        copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        return copyOfRange;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull char[] cArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(cArr, i4, i5);
        reverse(cArr, i4, i5);
    }

    @NotNull
    public static final List<Float> take(@NotNull float[] fArr, int i4) {
        List<Float> listOf;
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= fArr.length) {
            return toList(fArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (float f5 : fArr) {
                arrayList.add(Float.valueOf(f5));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Float> takeLast(@NotNull float[] fArr, int i4) {
        List<Float> listOf;
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = fArr.length;
            if (i4 >= length) {
                return toList(fArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Float.valueOf(fArr[i5]));
            }
            return arrayList;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(tArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t4 : tArr) {
            linkedHashMap.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Double> distinctBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d5)))) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long maxByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j4;
            }
            R invoke = selector.invoke(Long.valueOf(j4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                R invoke2 = selector.invoke(Long.valueOf(j5));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m410maxOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                double d6 = dArr[it2.nextInt()];
                if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) < 0) {
                    d5 = d6;
                }
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long minByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            long j4 = jArr[0];
            lastIndex = getLastIndex(jArr);
            if (lastIndex == 0) {
                return j4;
            }
            R invoke = selector.invoke(Long.valueOf(j4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                long j5 = jArr[it2.nextInt()];
                R invoke2 = selector.invoke(Long.valueOf(j5));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    j4 = j5;
                }
            }
            return j4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m446minOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final double minWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                double d6 = dArr[it2.nextInt()];
                if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) > 0) {
                    d5 = d6;
                }
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final void reverse(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            double d5 = dArr[nextInt];
            dArr[nextInt] = dArr[lastIndex];
            dArr[lastIndex] = d5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> runningReduce(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        double d5 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d5));
        int length = dArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[i4])).doubleValue();
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> runningReduceIndexed(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        double d5 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d5));
        int length = dArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            d5 = operation.invoke(Integer.valueOf(i4), Double.valueOf(d5), Double.valueOf(dArr[i4])).doubleValue();
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    public static final <T> T single(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t4 = null;
        boolean z4 = false;
        for (T t5 : tArr) {
            if (predicate.invoke(t5).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z4 = true;
                t4 = t5;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return f5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            f5 = Math.max(f5, fArr[it2.nextInt()]);
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            f5 = Math.min(f5, fArr[it2.nextInt()]);
        }
        return Float.valueOf(f5);
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long maxByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j4);
        }
        R invoke = selector.invoke(Long.valueOf(j4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j5));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                f5 = Math.max(f5, fArr[it2.nextInt()]);
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long minByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j4);
        }
        R invoke = selector.invoke(Long.valueOf(j4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            long j5 = jArr[it2.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j5));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                j4 = j5;
            }
        }
        return Long.valueOf(j4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                f5 = Math.min(f5, fArr[it2.nextInt()]);
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Long> emptyList;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Long.valueOf(jArr[num.intValue()]));
        }
        return arrayList;
    }

    public static final double first(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return d5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                int i5 = iArr[length];
                if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return i5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            c5 = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c5), Character.valueOf(cArr[nextInt])).charValue();
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[it2.nextInt()])).charValue();
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            double d5 = dArr[lastIndex];
            dArr[lastIndex] = dArr[nextInt];
            dArr[nextInt] = d5;
        }
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(bArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (byte b5 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b5)), valueTransform.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Character> dropWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (char c5 : cArr) {
            if (z4) {
                arrayList.add(Character.valueOf(c5));
            } else if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
                z4 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Float>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f5));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            R invoke = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final char reduce(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[it2.nextInt()])).charValue();
            }
            return c5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final char reduceIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                int nextInt = it2.nextInt();
                c5 = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c5), Character.valueOf(cArr[nextInt])).charValue();
            }
            return c5;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final char[] reversedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        ?? it2 = new IntRange(0, lastIndex).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            cArr2[lastIndex - nextInt] = cArr[nextInt];
        }
        return cArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(char[] cArr, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(char[] cArr, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> listOf;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(r4);
            return listOf;
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.invoke(Integer.valueOf(i4), r4, Character.valueOf(cArr[i4]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final byte single(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte b5 = null;
        boolean z4 = false;
        for (byte b6 : bArr) {
            if (predicate.invoke(Byte.valueOf(b6)).booleanValue()) {
                if (!z4) {
                    b5 = Byte.valueOf(b6);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(b5, "null cannot be cast to non-null type kotlin.Byte");
            return b5.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return z4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull double[] dArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (double d5 : dArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Double.valueOf(d5)));
            } else {
                buffer.append(String.valueOf(d5));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean maxWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            boolean z5 = zArr[it2.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) < 0) {
                z4 = z5;
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean minWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            boolean z5 = zArr[it2.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) > 0) {
                z4 = z5;
            }
        }
        return Boolean.valueOf(z4);
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <K> List<Boolean> distinctBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z4)))) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d5));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m416maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                boolean z5 = zArr[it2.nextInt()];
                if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) < 0) {
                    z4 = z5;
                }
            }
            return z4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m452minOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                boolean z5 = zArr[it2.nextInt()];
                if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) > 0) {
                    z4 = z5;
                }
            }
            return z4;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Double>, List<Double>> partition(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            } else {
                arrayList2.add(Double.valueOf(d5));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final void reverse(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            boolean z4 = zArr[nextInt];
            zArr[nextInt] = zArr[lastIndex];
            zArr[lastIndex] = z4;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> runningReduce(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        boolean z4 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z4));
        int length = zArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[i4])).booleanValue();
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> runningReduceIndexed(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        boolean z4 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z4));
        int length = zArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            z4 = operation.invoke(Integer.valueOf(i4), Boolean.valueOf(z4), Boolean.valueOf(zArr[i4])).booleanValue();
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> take(@NotNull double[] dArr, int i4) {
        List<Double> listOf;
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= dArr.length) {
            return toList(dArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (double d5 : dArr) {
                arrayList.add(Double.valueOf(d5));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Double> takeLast(@NotNull double[] dArr, int i4) {
        List<Double> listOf;
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = dArr.length;
            if (i4 >= length) {
                return toList(dArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Double.valueOf(dArr[i5]));
            }
            return arrayList;
        }
    }

    public static final char first(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return c5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                long j4 = jArr[length];
                if (!predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return j4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            d5 = Math.max(d5, dArr[it2.nextInt()]);
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            d5 = Math.min(d5, dArr[it2.nextInt()]);
        }
        return Double.valueOf(d5);
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Float> emptyList;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Float.valueOf(fArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(sArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                d5 = Math.max(d5, dArr[it2.nextInt()]);
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                d5 = Math.min(d5, dArr[it2.nextInt()]);
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            boolean z4 = zArr[lastIndex];
            zArr[lastIndex] = zArr[nextInt];
            zArr[nextInt] = z4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float maxByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f5;
            }
            R invoke = selector.invoke(Float.valueOf(f5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                float f6 = fArr[it2.nextInt()];
                R invoke2 = selector.invoke(Float.valueOf(f6));
                if (invoke.compareTo(invoke2) < 0) {
                    f5 = f6;
                    invoke = invoke2;
                }
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float minByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            float f5 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f5;
            }
            R invoke = selector.invoke(Float.valueOf(f5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                float f6 = fArr[it2.nextInt()];
                R invoke2 = selector.invoke(Float.valueOf(f6));
                if (invoke.compareTo(invoke2) > 0) {
                    f5 = f6;
                    invoke = invoke2;
                }
            }
            return f5;
        }
        throw new NoSuchElementException();
    }

    public static final short single(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z4 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (!z4) {
                    sh = Short.valueOf(s4);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                float f5 = fArr[length];
                if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return f5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) < 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) > 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i4 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i4)), valueTransform.invoke(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Character> distinctBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c5)))) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Double>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull boolean[] zArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (boolean z4 : zArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Boolean.valueOf(z4)));
            } else {
                buffer.append(String.valueOf(z4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float maxByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f5);
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            float f6 = fArr[it2.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) < 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Double m409maxOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) < 0) {
                    c5 = c6;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float minByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f5);
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            float f6 = fArr[it2.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) > 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Double m445minOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                R invoke = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) > 0) {
                    c5 = c6;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final void reverse(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        ?? it2 = new IntRange(0, length).iterator();
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            char c5 = cArr[nextInt];
            cArr[nextInt] = cArr[lastIndex];
            cArr[lastIndex] = c5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> runningReduce(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        char c5 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c5));
        int length = cArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[i4])).charValue();
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> runningReduceIndexed(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        char c5 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c5));
        int length = cArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            c5 = operation.invoke(Integer.valueOf(i4), Character.valueOf(c5), Character.valueOf(cArr[i4])).charValue();
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Double> emptyList;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Double.valueOf(dArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z4));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) < 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) > 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    @NotNull
    public static final Pair<List<Boolean>, List<Boolean>> partition(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            } else {
                arrayList2.add(Boolean.valueOf(z4));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            char c5 = cArr[lastIndex];
            cArr[lastIndex] = cArr[nextInt];
            cArr[nextInt] = c5;
        }
    }

    @NotNull
    public static final List<Boolean> take(@NotNull boolean[] zArr, int i4) {
        List<Boolean> listOf;
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= zArr.length) {
            return toList(zArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (boolean z4 : zArr) {
                arrayList.add(Boolean.valueOf(z4));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Boolean> takeLast(@NotNull boolean[] zArr, int i4) {
        List<Boolean> listOf;
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = zArr.length;
            if (i4 >= length) {
                return toList(zArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Boolean.valueOf(zArr[i5]));
            }
            return arrayList;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                if (Intrinsics.compare((int) c5, (int) c6) < 0) {
                    c5 = c6;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                if (Intrinsics.compare((int) c5, (int) c6) > 0) {
                    c5 = c6;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    public static final double last(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                double d5 = dArr[length];
                if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return d5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(jArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (long j4 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j4)), valueTransform.invoke(Long.valueOf(j4)));
        }
        return linkedHashMap;
    }

    public static final int single(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z4 = false;
        for (int i4 : iArr) {
            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                if (!z4) {
                    num = Integer.valueOf(i4);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Boolean> emptyList;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Boolean.valueOf(zArr[num.intValue()]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double maxByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d5;
            }
            R invoke = selector.invoke(Double.valueOf(d5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                double d6 = dArr[it2.nextInt()];
                R invoke2 = selector.invoke(Double.valueOf(d6));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    d5 = d6;
                }
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <T> float m396maxOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            float floatValue = selector.invoke(tArr[0]).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(tArr[it2.nextInt()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final <T> Float m423maxOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(tArr[it2.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double minByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            double d5 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d5;
            }
            R invoke = selector.invoke(Double.valueOf(d5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                double d6 = dArr[it2.nextInt()];
                R invoke2 = selector.invoke(Double.valueOf(d6));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    d5 = d6;
                }
            }
            return d5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final <T> float m432minOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            float floatValue = selector.invoke(tArr[0]).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(tArr[it2.nextInt()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final <T> Float m459minOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(tArr[it2.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void reverse(@NotNull T[] tArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, tArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            T t4 = tArr[i4];
            tArr[i4] = tArr[i7];
            tArr[i7] = t4;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull char[] cArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (char c5 : cArr) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c5)));
            } else {
                buffer.append(c5);
            }
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean last(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                boolean z4 = zArr[length];
                if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return z4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(fArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (float f5 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f5)), valueTransform.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z4));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c5));
        }
        return destination;
    }

    @NotNull
    public static final Pair<List<Character>, List<Character>> partition(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            } else {
                arrayList2.add(Character.valueOf(c5));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final List<Character> take(@NotNull char[] cArr, int i4) {
        List<Character> listOf;
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i4 >= cArr.length) {
            return toList(cArr);
        } else {
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (char c5 : cArr) {
                arrayList.add(Character.valueOf(c5));
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @NotNull
    public static final List<Character> takeLast(@NotNull char[] cArr, int i4) {
        List<Character> listOf;
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else {
            int length = cArr.length;
            if (i4 >= length) {
                return toList(cArr);
            }
            if (i4 == 1) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[length - 1]));
                return listOf;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(Character.valueOf(cArr[i5]));
            }
            return arrayList;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double maxByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d5);
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            double d6 = dArr[it2.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double minByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d5);
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            double d6 = dArr[it2.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    public static final long single(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long l4 = null;
        boolean z4 = false;
        for (long j4 : jArr) {
            if (predicate.invoke(Long.valueOf(j4)).booleanValue()) {
                if (!z4) {
                    l4 = Long.valueOf(j4);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(l4, "null cannot be cast to non-null type kotlin.Long");
            return l4.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        List<Character> emptyList;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Integer num : indices) {
            arrayList.add(Character.valueOf(cArr[num.intValue()]));
        }
        return arrayList;
    }

    public static final char last(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char c5 = cArr[length];
                if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else {
                    return c5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull byte[] bArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, bArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            byte b5 = bArr[i4];
            bArr[i4] = bArr[i7];
            bArr[i7] = b5;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        Iterator<? extends R> it2 = other.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object obj = (R) it2.next();
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i4]), obj));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(dArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (double d5 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d5)), valueTransform.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m390maxOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m417maxOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m426minOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m453minOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z4;
            }
            R invoke = selector.invoke(Boolean.valueOf(z4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                boolean z5 = zArr[it2.nextInt()];
                R invoke2 = selector.invoke(Boolean.valueOf(z5));
                if (invoke.compareTo(invoke2) < 0) {
                    z4 = z5;
                    invoke = invoke2;
                }
            }
            return z4;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean minByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            boolean z4 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z4;
            }
            R invoke = selector.invoke(Boolean.valueOf(z4));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                boolean z5 = zArr[it2.nextInt()];
                R invoke2 = selector.invoke(Boolean.valueOf(z5));
                if (invoke.compareTo(invoke2) > 0) {
                    z4 = z5;
                    invoke = invoke2;
                }
            }
            return z4;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull byte[] bArr, @NotNull byte[] other, @NotNull Function2<? super Byte, ? super Byte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i4]), Byte.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(zArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (boolean z4 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z4)), valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c5));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull short[] sArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, sArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            short s4 = sArr[i4];
            sArr[i4] = sArr[i7];
            sArr[i7] = s4;
            i7--;
            i4++;
        }
    }

    public static final float single(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float f5 = null;
        boolean z4 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (!z4) {
                    f5 = Float.valueOf(f6);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(f5, "null cannot be cast to non-null type kotlin.Float");
            return f5.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m397maxOf(short[] sArr, Function1<? super Short, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m424maxOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m433minOf(short[] sArr, Function1<? super Short, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m460minOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull short[] sArr, @NotNull short[] other, @NotNull Function2<? super Short, ? super Short, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i4]), Short.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(cArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (char c5 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c5)), valueTransform.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z4);
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            boolean z5 = zArr[it2.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) < 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z4);
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            boolean z5 = zArr[it2.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) > 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull int[] iArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, iArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            int i8 = iArr[i4];
            iArr[i4] = iArr[i7];
            iArr[i7] = i8;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull int[] iArr, @NotNull int[] other, @NotNull Function2<? super Integer, ? super Integer, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(other[i4])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final double single(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double d5 = null;
        boolean z4 = false;
        for (double d6 : dArr) {
            if (predicate.invoke(Double.valueOf(d6)).booleanValue()) {
                if (!z4) {
                    d5 = Double.valueOf(d6);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(d5, "null cannot be cast to non-null type kotlin.Double");
            return d5.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (XI.AbstractBinderC0002XI abstractBinderC0002XI : tArr) {
            K invoke = keySelector.invoke(abstractBinderC0002XI);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(abstractBinderC0002XI));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c5;
            }
            R invoke = selector.invoke(Character.valueOf(c5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                R invoke2 = selector.invoke(Character.valueOf(c6));
                if (invoke.compareTo(invoke2) < 0) {
                    c5 = c6;
                    invoke = invoke2;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m394maxOf(int[] iArr, Function1<? super Integer, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m421maxOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            char c5 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c5;
            }
            R invoke = selector.invoke(Character.valueOf(c5));
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                char c6 = cArr[it2.nextInt()];
                R invoke2 = selector.invoke(Character.valueOf(c6));
                if (invoke.compareTo(invoke2) > 0) {
                    c5 = c6;
                    invoke = invoke2;
                }
            }
            return c5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m430minOf(int[] iArr, Function1<? super Integer, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m457minOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull long[] jArr, @NotNull long[] other, @NotNull Function2<? super Long, ? super Long, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i4]), Long.valueOf(other[i4])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull long[] jArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, jArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            long j4 = jArr[i4];
            jArr[i4] = jArr[i7];
            jArr[i7] = j4;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull float[] fArr, @NotNull float[] other, @NotNull Function2<? super Float, ? super Float, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i4]), Float.valueOf(other[i4])));
        }
        return arrayList;
    }

    public static final boolean single(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                if (!z4) {
                    bool = Boolean.valueOf(z5);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c5);
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) < 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m395maxOf(long[] jArr, Function1<? super Long, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m422maxOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c5);
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            char c6 = cArr[it2.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) > 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m431minOf(long[] jArr, Function1<? super Long, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m458minOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull double[] dArr, @NotNull double[] other, @NotNull Function2<? super Double, ? super Double, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i4]), Double.valueOf(other[i4])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull float[] fArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, fArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            float f5 = fArr[i4];
            fArr[i4] = fArr[i7];
            fArr[i7] = f5;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull boolean[] zArr, @NotNull boolean[] other, @NotNull Function2<? super Boolean, ? super Boolean, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i4]), Boolean.valueOf(other[i4])));
        }
        return arrayList;
    }

    public static final char single(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                if (!z4) {
                    ch = Character.valueOf(c5);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z4) {
            Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i4 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i4)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m393maxOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m420maxOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m429minOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m456minOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull double[] dArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, dArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            double d5 = dArr[i4];
            dArr[i4] = dArr[i7];
            dArr[i7] = d5;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull char[] cArr, @NotNull char[] other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i4]), Character.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(tArr[i4], other[i4]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull boolean[] zArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, zArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            boolean z4 = zArr[i4];
            zArr[i4] = zArr[i7];
            zArr[i7] = z4;
            i7--;
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m392maxOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m419maxOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m428minOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m455minOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j4 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j4)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            byte b5 = bArr[i4];
            arrayList.add(TuplesKt.to(Byte.valueOf(b5), other[i4]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull char[] cArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, cArr.length);
        int i6 = (i4 + i5) / 2;
        if (i4 == i6) {
            return;
        }
        int i7 = i5 - 1;
        while (i4 < i6) {
            char c5 = cArr[i4];
            cArr[i4] = cArr[i7];
            cArr[i7] = c5;
            i7--;
            i4++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i4));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Integer.valueOf(i4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m398maxOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m425maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m434minOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m461minOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            short s4 = sArr[i4];
            arrayList.add(TuplesKt.to(Short.valueOf(s4), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final float m391maxOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull */
    private static final Float m418maxOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf */
    private static final float m427minOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull */
    private static final Float m454minOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[it2.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            int i5 = iArr[i4];
            arrayList.add(TuplesKt.to(Integer.valueOf(i5), other[i4]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j4 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j4));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Long.valueOf(j4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            long j4 = jArr[i4];
            arrayList.add(TuplesKt.to(Long.valueOf(j4), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <T, R extends Comparable<? super R>> R m405maxOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            R invoke = selector.invoke(tArr[0]);
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(tArr[it2.nextInt()]);
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
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(tArr[it2.nextInt()]);
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
    /* renamed from: minOf */
    private static final <T, R extends Comparable<? super R>> R m441minOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(tArr.length == 0)) {
            R invoke = selector.invoke(tArr[0]);
            ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(tArr[it2.nextInt()]);
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
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it2 = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(tArr[it2.nextInt()]);
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            float f5 = fArr[i4];
            arrayList.add(TuplesKt.to(Float.valueOf(f5), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        lastIndex = getLastIndex(bArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m399maxOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            R invoke = selector.invoke(Byte.valueOf(bArr[0]));
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m435minOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(bArr.length == 0)) {
            R invoke = selector.invoke(Byte.valueOf(bArr[0]));
            lastIndex = getLastIndex(bArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Byte.valueOf(bArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            double d5 = dArr[i4];
            arrayList.add(TuplesKt.to(Double.valueOf(d5), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        lastIndex = getLastIndex(sArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m406maxOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            R invoke = selector.invoke(Short.valueOf(sArr[0]));
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m442minOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(sArr.length == 0)) {
            R invoke = selector.invoke(Short.valueOf(sArr[0]));
            lastIndex = getLastIndex(sArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Short.valueOf(sArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            boolean z4 = zArr[i4];
            arrayList.add(TuplesKt.to(Boolean.valueOf(z4), other[i4]));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        lastIndex = getLastIndex(iArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m403maxOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            R invoke = selector.invoke(Integer.valueOf(iArr[0]));
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m439minOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(iArr.length == 0)) {
            R invoke = selector.invoke(Integer.valueOf(iArr[0]));
            lastIndex = getLastIndex(iArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Integer.valueOf(iArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            char c5 = cArr[i4];
            arrayList.add(TuplesKt.to(Character.valueOf(c5), other[i4]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        lastIndex = getLastIndex(jArr);
        ?? it2 = new IntRange(1, lastIndex).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m404maxOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            R invoke = selector.invoke(Long.valueOf(jArr[0]));
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m440minOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(jArr.length == 0)) {
            R invoke = selector.invoke(Long.valueOf(jArr[0]));
            lastIndex = getLastIndex(jArr);
            ?? it2 = new IntRange(1, lastIndex).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Long.valueOf(jArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(tArr[i4], r4));
            i4++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m402maxOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            R invoke = selector.invoke(Float.valueOf(fArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R maxOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m438minOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(fArr.length == 0)) {
            R invoke = selector.invoke(Float.valueOf(fArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(fArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Float.valueOf(fArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = bArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m401maxOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            R invoke = selector.invoke(Double.valueOf(dArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m437minOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(dArr.length == 0)) {
            R invoke = selector.invoke(Double.valueOf(dArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(dArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Double.valueOf(dArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = sArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
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
    private static final <R extends Comparable<? super R>> R minOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it2.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m407maxOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m443minOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(zArr.length == 0)) {
            R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(zArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Boolean.valueOf(zArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = iArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m400maxOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            R invoke = selector.invoke(Character.valueOf(cArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
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
    /* renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m436minOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (!(cArr.length == 0)) {
            R invoke = selector.invoke(Character.valueOf(cArr[0]));
            ?? it2 = new IntRange(1, getLastIndex(cArr)).iterator();
            while (it2.hasNext()) {
                R invoke2 = selector.invoke(Character.valueOf(cArr[it2.nextInt()]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = jArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = fArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = dArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = zArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = cArr.length;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, length));
        int i4 = 0;
        for (R r4 : other) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i4]), r4));
            i4++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Byte, Byte>> zip(@NotNull byte[] bArr, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i4]), Byte.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Short, Short>> zip(@NotNull short[] sArr, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i4]), Short.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> zip(@NotNull int[] iArr, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i4]), Integer.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Long, Long>> zip(@NotNull long[] jArr, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i4]), Long.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Float, Float>> zip(@NotNull float[] fArr, @NotNull float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i4]), Float.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Double, Double>> zip(@NotNull double[] dArr, @NotNull double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i4]), Double.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Boolean, Boolean>> zip(@NotNull boolean[] zArr, @NotNull boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i4]), Boolean.valueOf(other[i4])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull char[] cArr, @NotNull char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i4]), Character.valueOf(other[i4])));
        }
        return arrayList;
    }
}
