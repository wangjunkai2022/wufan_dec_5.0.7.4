package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
/* compiled from: TimeSource.kt */
@ExperimentalTime
/* loaded from: classes6.dex */
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;
    @NotNull
    private final TimeMark mark;

    private AdjustedTimeMark(TimeMark mark, long j4) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = j4;
    }

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j4);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public long mo1362elapsedNowUwyO8pc() {
        return Duration.m1408minusLRDsOJo(this.mark.mo1362elapsedNowUwyO8pc(), this.adjustment);
    }

    /* renamed from: getAdjustment-UwyO8pc  reason: not valid java name */
    public final long m1367getAdjustmentUwyO8pc() {
        return this.adjustment;
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* renamed from: minus-LRDsOJo */
    public TimeMark mo1363minusLRDsOJo(long j4) {
        return TimeMark.DefaultImpls.m1509minusLRDsOJo(this, j4);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* renamed from: plus-LRDsOJo */
    public TimeMark mo1365plusLRDsOJo(long j4) {
        return new AdjustedTimeMark(this.mark, Duration.m1409plusLRDsOJo(this.adjustment, j4), null);
    }
}
