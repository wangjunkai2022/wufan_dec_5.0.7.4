package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: Regex.kt */
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n1789#2,3:399\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:399,3\n*E\n"})
/* loaded from: classes6.dex */
public final class RegexKt {
    public static final /* synthetic */ MatchResult access$findNext(Matcher matcher, int i4, CharSequence charSequence) {
        return findNext(matcher, i4, charSequence);
    }

    public static final /* synthetic */ IntRange access$range(java.util.regex.MatchResult matchResult) {
        return range(matchResult);
    }

    public static final MatchResult findNext(Matcher matcher, int i4, CharSequence charSequence) {
        if (matcher.find(i4)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & FlagEnum> Set<T> fromInt(final int i4) {
        Intrinsics.reifiedOperationMarker(4, "T");
        EnumSet fromInt$lambda$1 = EnumSet.allOf(Enum.class);
        Intrinsics.checkNotNullExpressionValue(fromInt$lambda$1, "fromInt$lambda$1");
        Intrinsics.needClassReification();
        CollectionsKt__MutableCollectionsKt.retainAll(fromInt$lambda$1, new Function1<T, Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(Enum r32) {
                FlagEnum flagEnum = (FlagEnum) r32;
                return Boolean.valueOf((i4 & flagEnum.getMask()) == flagEnum.getValue());
            }
        });
        Set<T> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final MatchResult matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public static final IntRange range(java.util.regex.MatchResult matchResult) {
        IntRange until;
        until = RangesKt___RangesKt.until(matchResult.start(), matchResult.end());
        return until;
    }

    public static final int toInt(Iterable<? extends FlagEnum> iterable) {
        int i4 = 0;
        for (FlagEnum flagEnum : iterable) {
            i4 |= flagEnum.getValue();
        }
        return i4;
    }

    public static final IntRange range(java.util.regex.MatchResult matchResult, int i4) {
        IntRange until;
        until = RangesKt___RangesKt.until(matchResult.start(i4), matchResult.end(i4));
        return until;
    }
}
