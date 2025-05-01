package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: compareTo.kt */
/* loaded from: classes6.dex */
public final class CompareToKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <T> int compareTo(Comparable<? super T> comparable, T t4) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        return comparable.compareTo(t4);
    }
}
