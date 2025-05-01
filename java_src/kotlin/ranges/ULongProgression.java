package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ULongRange.kt */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    /* compiled from: ULongRange.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: fromClosedRange-7ftBX0g  reason: not valid java name */
        public final ULongProgression m1291fromClosedRange7ftBX0g(long j4, long j5, long j6) {
            return new ULongProgression(j4, j5, j6, null);
        }
    }

    private ULongProgression(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j6 != Long.MIN_VALUE) {
            this.first = j4;
            this.last = UProgressionUtilKt.m1265getProgressionLastElement7ftBX0g(j4, j5, j6);
            this.step = j6;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public /* synthetic */ ULongProgression(long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-s-VKNKU  reason: not valid java name */
    public final long m1289getFirstsVKNKU() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU  reason: not valid java name */
    public final long m1290getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j4 = this.first;
        long j5 = this.last;
        long j6 = this.step;
        return ((int) (j6 ^ (j6 >>> 32))) + (((((int) ULong.m209constructorimpl(j4 ^ ULong.m209constructorimpl(j4 >>> 32))) * 31) + ((int) ULong.m209constructorimpl(j5 ^ ULong.m209constructorimpl(j5 >>> 32)))) * 31);
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        int i4 = (this.step > 0L ? 1 : (this.step == 0L ? 0 : -1));
        long j4 = this.first;
        long j5 = this.last;
        if (i4 > 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j4;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m255toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) ULong.m255toStringimpl(this.last));
            sb.append(" step ");
            j4 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m255toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) ULong.m255toStringimpl(this.last));
            sb.append(" step ");
            j4 = -this.step;
        }
        sb.append(j4);
        return sb.toString();
    }
}
