package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
/* compiled from: CharCode.kt */
/* loaded from: classes6.dex */
public final class CharCodeKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char Char(int i4) {
        if (i4 < 0 || i4 > 65535) {
            throw new IllegalArgumentException("Invalid Char code: " + i4);
        }
        return (char) i4;
    }

    private static final int getCode(char c5) {
        return c5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void getCode$annotations(char c5) {
    }
}
